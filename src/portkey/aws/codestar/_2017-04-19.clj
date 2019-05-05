(ns portkey.aws.codestar.-2017-04-19 (:require [portkey.aws]))

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

(clojure.core/defn- response-describe-project-result ([input] (response-describe-project-result nil input)) ([resultWrapper435600 input] (clojure.core/let [rawinput435599 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435601 {"stackId" (rawinput435599 "stackId"), "arn" (rawinput435599 "arn"), "projectTemplateId" (rawinput435599 "projectTemplateId"), "createdTimeStamp" (rawinput435599 "createdTimeStamp"), "id" (rawinput435599 "id"), "clientRequestToken" (rawinput435599 "clientRequestToken"), "name" (rawinput435599 "name"), "status" (rawinput435599 "status"), "description" (rawinput435599 "description")}] (clojure.core/cond-> {} (letvar435601 "stackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar435601 ["stackId"]))) (letvar435601 "arn") (clojure.core/assoc :arn (deser-project-arn (clojure.core/get-in letvar435601 ["arn"]))) (letvar435601 "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (clojure.core/get-in letvar435601 ["projectTemplateId"]))) (letvar435601 "createdTimeStamp") (clojure.core/assoc :created-time-stamp (deser-created-timestamp (clojure.core/get-in letvar435601 ["createdTimeStamp"]))) (letvar435601 "id") (clojure.core/assoc :id (deser-project-id (clojure.core/get-in letvar435601 ["id"]))) (letvar435601 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar435601 ["clientRequestToken"]))) (letvar435601 "name") (clojure.core/assoc :name (deser-project-name (clojure.core/get-in letvar435601 ["name"]))) (letvar435601 "status") (clojure.core/assoc :status (deser-project-status (clojure.core/get-in letvar435601 ["status"]))) (letvar435601 "description") (clojure.core/assoc :description (deser-project-description (clojure.core/get-in letvar435601 ["description"])))))))

(clojure.core/defn- response-list-projects-result ([input] (response-list-projects-result nil input)) ([resultWrapper435603 input] (clojure.core/let [rawinput435602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435604 {"projects" (rawinput435602 "projects"), "nextToken" (rawinput435602 "nextToken")}] (clojure.core/cond-> {:projects (deser-projects-list (clojure.core/get-in letvar435604 ["projects"]))} (letvar435604 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar435604 ["nextToken"])))))))

(clojure.core/defn- response-update-project-result ([input] (response-update-project-result nil input)) ([resultWrapper435606 input] (clojure.core/let [rawinput435605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435607 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper435609 input] (clojure.core/let [rawinput435608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435610 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-project-creation-failed-exception ([input] (response-project-creation-failed-exception nil input)) ([resultWrapper435612 input] (clojure.core/let [rawinput435611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435613 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-team-member-already-associated-exception ([input] (response-team-member-already-associated-exception nil input)) ([resultWrapper435615 input] (clojure.core/let [rawinput435614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435616 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-user-profiles-result ([input] (response-list-user-profiles-result nil input)) ([resultWrapper435618 input] (clojure.core/let [rawinput435617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435619 {"userProfiles" (rawinput435617 "userProfiles"), "nextToken" (rawinput435617 "nextToken")}] (clojure.core/cond-> {:user-profiles (deser-user-profiles-list (clojure.core/get-in letvar435619 ["userProfiles"]))} (letvar435619 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar435619 ["nextToken"])))))))

(clojure.core/defn- response-user-profile-not-found-exception ([input] (response-user-profile-not-found-exception nil input)) ([resultWrapper435621 input] (clojure.core/let [rawinput435620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435622 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper435624 input] (clojure.core/let [rawinput435623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435625 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-service-role-exception ([input] (response-invalid-service-role-exception nil input)) ([resultWrapper435627 input] (clojure.core/let [rawinput435626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435628 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-team-member-result ([input] (response-disassociate-team-member-result nil input)) ([resultWrapper435630 input] (clojure.core/let [rawinput435629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435631 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper435633 input] (clojure.core/let [rawinput435632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435634 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-project-result ([input] (response-tag-project-result nil input)) ([resultWrapper435636 input] (clojure.core/let [rawinput435635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435637 {"tags" (rawinput435635 "tags")}] (clojure.core/cond-> {} (letvar435637 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar435637 ["tags"])))))))

(clojure.core/defn- response-untag-project-result ([input] (response-untag-project-result nil input)) ([resultWrapper435639 input] (clojure.core/let [rawinput435638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435640 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-project-result ([input] (response-create-project-result nil input)) ([resultWrapper435642 input] (clojure.core/let [rawinput435641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435643 {"id" (rawinput435641 "id"), "arn" (rawinput435641 "arn"), "clientRequestToken" (rawinput435641 "clientRequestToken"), "projectTemplateId" (rawinput435641 "projectTemplateId")}] (clojure.core/cond-> {:id (deser-project-id (clojure.core/get-in letvar435643 ["id"])), :arn (deser-project-arn (clojure.core/get-in letvar435643 ["arn"]))} (letvar435643 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar435643 ["clientRequestToken"]))) (letvar435643 "projectTemplateId") (clojure.core/assoc :project-template-id (deser-project-template-id (clojure.core/get-in letvar435643 ["projectTemplateId"])))))))

(clojure.core/defn- response-user-profile-already-exists-exception ([input] (response-user-profile-already-exists-exception nil input)) ([resultWrapper435645 input] (clojure.core/let [rawinput435644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435646 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resources-result ([input] (response-list-resources-result nil input)) ([resultWrapper435648 input] (clojure.core/let [rawinput435647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435649 {"resources" (rawinput435647 "resources"), "nextToken" (rawinput435647 "nextToken")}] (clojure.core/cond-> {} (letvar435649 "resources") (clojure.core/assoc :resources (deser-resources-result (clojure.core/get-in letvar435649 ["resources"]))) (letvar435649 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar435649 ["nextToken"])))))))

(clojure.core/defn- response-project-already-exists-exception ([input] (response-project-already-exists-exception nil input)) ([resultWrapper435651 input] (clojure.core/let [rawinput435650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435652 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-team-member-not-found-exception ([input] (response-team-member-not-found-exception nil input)) ([resultWrapper435654 input] (clojure.core/let [rawinput435653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435655 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-user-profile-result ([input] (response-describe-user-profile-result nil input)) ([resultWrapper435657 input] (clojure.core/let [rawinput435656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435658 {"userArn" (rawinput435656 "userArn"), "displayName" (rawinput435656 "displayName"), "emailAddress" (rawinput435656 "emailAddress"), "sshPublicKey" (rawinput435656 "sshPublicKey"), "createdTimestamp" (rawinput435656 "createdTimestamp"), "lastModifiedTimestamp" (rawinput435656 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar435658 ["userArn"])), :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar435658 ["createdTimestamp"])), :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar435658 ["lastModifiedTimestamp"]))} (letvar435658 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar435658 ["displayName"]))) (letvar435658 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar435658 ["emailAddress"]))) (letvar435658 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar435658 ["sshPublicKey"])))))))

(clojure.core/defn- response-delete-project-result ([input] (response-delete-project-result nil input)) ([resultWrapper435660 input] (clojure.core/let [rawinput435659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435661 {"stackId" (rawinput435659 "stackId"), "projectArn" (rawinput435659 "projectArn")}] (clojure.core/cond-> {} (letvar435661 "stackId") (clojure.core/assoc :stack-id (deser-stack-id (clojure.core/get-in letvar435661 ["stackId"]))) (letvar435661 "projectArn") (clojure.core/assoc :project-arn (deser-project-arn (clojure.core/get-in letvar435661 ["projectArn"])))))))

(clojure.core/defn- response-associate-team-member-result ([input] (response-associate-team-member-result nil input)) ([resultWrapper435663 input] (clojure.core/let [rawinput435662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435664 {"clientRequestToken" (rawinput435662 "clientRequestToken")}] (clojure.core/cond-> {} (letvar435664 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar435664 ["clientRequestToken"])))))))

(clojure.core/defn- response-update-team-member-result ([input] (response-update-team-member-result nil input)) ([resultWrapper435666 input] (clojure.core/let [rawinput435665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435667 {"userArn" (rawinput435665 "userArn"), "projectRole" (rawinput435665 "projectRole"), "remoteAccessAllowed" (rawinput435665 "remoteAccessAllowed")}] (clojure.core/cond-> {} (letvar435667 "userArn") (clojure.core/assoc :user-arn (deser-user-arn (clojure.core/get-in letvar435667 ["userArn"]))) (letvar435667 "projectRole") (clojure.core/assoc :project-role (deser-role (clojure.core/get-in letvar435667 ["projectRole"]))) (letvar435667 "remoteAccessAllowed") (clojure.core/assoc :remote-access-allowed (deser-remote-access-allowed (clojure.core/get-in letvar435667 ["remoteAccessAllowed"])))))))

(clojure.core/defn- response-create-user-profile-result ([input] (response-create-user-profile-result nil input)) ([resultWrapper435669 input] (clojure.core/let [rawinput435668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435670 {"userArn" (rawinput435668 "userArn"), "displayName" (rawinput435668 "displayName"), "emailAddress" (rawinput435668 "emailAddress"), "sshPublicKey" (rawinput435668 "sshPublicKey"), "createdTimestamp" (rawinput435668 "createdTimestamp"), "lastModifiedTimestamp" (rawinput435668 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar435670 ["userArn"]))} (letvar435670 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar435670 ["displayName"]))) (letvar435670 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar435670 ["emailAddress"]))) (letvar435670 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar435670 ["sshPublicKey"]))) (letvar435670 "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar435670 ["createdTimestamp"]))) (letvar435670 "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar435670 ["lastModifiedTimestamp"])))))))

(clojure.core/defn- response-list-tags-for-project-result ([input] (response-list-tags-for-project-result nil input)) ([resultWrapper435672 input] (clojure.core/let [rawinput435671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435673 {"tags" (rawinput435671 "tags"), "nextToken" (rawinput435671 "nextToken")}] (clojure.core/cond-> {} (letvar435673 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar435673 ["tags"]))) (letvar435673 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar435673 ["nextToken"])))))))

(clojure.core/defn- response-list-team-members-result ([input] (response-list-team-members-result nil input)) ([resultWrapper435675 input] (clojure.core/let [rawinput435674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435676 {"teamMembers" (rawinput435674 "teamMembers"), "nextToken" (rawinput435674 "nextToken")}] (clojure.core/cond-> {:team-members (deser-team-member-result (clojure.core/get-in letvar435676 ["teamMembers"]))} (letvar435676 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar435676 ["nextToken"])))))))

(clojure.core/defn- response-project-not-found-exception ([input] (response-project-not-found-exception nil input)) ([resultWrapper435678 input] (clojure.core/let [rawinput435677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435679 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper435681 input] (clojure.core/let [rawinput435680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435682 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-project-configuration-exception ([input] (response-project-configuration-exception nil input)) ([resultWrapper435684 input] (clojure.core/let [rawinput435683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435685 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-profile-result ([input] (response-delete-user-profile-result nil input)) ([resultWrapper435687 input] (clojure.core/let [rawinput435686 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435688 {"userArn" (rawinput435686 "userArn")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar435688 ["userArn"]))}))))

(clojure.core/defn- response-update-user-profile-result ([input] (response-update-user-profile-result nil input)) ([resultWrapper435690 input] (clojure.core/let [rawinput435689 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar435691 {"userArn" (rawinput435689 "userArn"), "displayName" (rawinput435689 "displayName"), "emailAddress" (rawinput435689 "emailAddress"), "sshPublicKey" (rawinput435689 "sshPublicKey"), "createdTimestamp" (rawinput435689 "createdTimestamp"), "lastModifiedTimestamp" (rawinput435689 "lastModifiedTimestamp")}] (clojure.core/cond-> {:user-arn (deser-user-arn (clojure.core/get-in letvar435691 ["userArn"]))} (letvar435691 "displayName") (clojure.core/assoc :display-name (deser-user-profile-display-name (clojure.core/get-in letvar435691 ["displayName"]))) (letvar435691 "emailAddress") (clojure.core/assoc :email-address (deser-email (clojure.core/get-in letvar435691 ["emailAddress"]))) (letvar435691 "sshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar435691 ["sshPublicKey"]))) (letvar435691 "createdTimestamp") (clojure.core/assoc :created-timestamp (deser-created-timestamp (clojure.core/get-in letvar435691 ["createdTimestamp"]))) (letvar435691 "lastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-last-modified-timestamp (clojure.core/get-in letvar435691 ["lastModifiedTimestamp"])))))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/tag-key))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.user-profile-summary/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.user-profile-summary/user-arn :portkey.aws.codestar.-2017-04-19.user-profile-summary/display-name :portkey.aws.codestar.-2017-04-19.user-profile-summary/email-address :portkey.aws.codestar.-2017-04-19.user-profile-summary/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/created-time-stamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/status (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-status))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-result/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.describe-project-result/stack-id :portkey.aws.codestar.-2017-04-19.describe-project-result/arn :portkey.aws.codestar.-2017-04-19.describe-project-result/project-template-id :portkey.aws.codestar.-2017-04-19.describe-project-result/created-time-stamp :portkey.aws.codestar.-2017-04-19.describe-project-result/id :portkey.aws.codestar.-2017-04-19.describe-project-result/client-request-token :portkey.aws.codestar.-2017-04-19.describe-project-result/name :portkey.aws.codestar.-2017-04-19.describe-project-result/status :portkey.aws.codestar.-2017-04-19.describe-project-result/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-projects-request/next-token :portkey.aws.codestar.-2017-04-19.list-projects-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/template-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 30)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-is-private clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-result/projects (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/projects-list))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-projects-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-projects-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-projects-result/projects] :opt-un [:portkey.aws.codestar.-2017-04-19.list-projects-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-user-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-request/next-token :portkey.aws.codestar.-2017-04-19.list-user-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/next-token :portkey.aws.codestar.-2017-04-19.list-tags-for-project-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/remote-access-allowed clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/created-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[\w:/-]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.toolchain-source/s-3 (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/s-3-location))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/toolchain-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.toolchain-source/s-3] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-resources-request/project-id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-resources-request/next-token :portkey.aws.codestar.-2017-04-19.list-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-stack clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-template-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]{0,5}:codestar:[^:\s]+::project-template(\/(github|codecommit))?\/[a-z0-9-]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[\w-.+]+@[\w-.+]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-team-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-team-members-request/project-id] :opt-un [:portkey.aws.codestar.-2017-04-19.list-team-members-request/next-token :portkey.aws.codestar.-2017-04-19.list-team-members-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-enable-issues clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code-destination/code-commit (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/code-commit-code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code-destination/git-hub (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/git-hub-code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/code-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.code-destination/code-commit :portkey.aws.codestar.-2017-04-19.code-destination/git-hub]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/source-code (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/code))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S[\w.-]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-already-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code-commit-code-destination/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/code-commit-code-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.code-commit-code-destination/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/ssh-public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 16384)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[\t\r\n\u0020-\u00FF]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-result/user-profiles (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profiles-list))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-user-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-user-profiles-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-result/user-profiles] :opt-un [:portkey.aws.codestar.-2017-04-19.list-user-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(user|organization|User|Organization)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1224))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[\w/+=]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tags (clojure.spec.alpha/map-of :portkey.aws.codestar.-2017-04-19/tag-key :portkey.aws.codestar.-2017-04-19/tag-value))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.update-project-request/name :portkey.aws.codestar.-2017-04-19.update-project-request/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.toolchain/source (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/toolchain-source))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.toolchain/role-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.toolchain/stack-parameters (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/template-parameter-map))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/toolchain (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.toolchain/source] :opt-un [:portkey.aws.codestar.-2017-04-19.toolchain/role-arn :portkey.aws.codestar.-2017-04-19.toolchain/stack-parameters]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profiles-list (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/user-profile-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/source-code (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/source-code))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/toolchain (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/toolchain))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-project-request/name :portkey.aws.codestar.-2017-04-19.create-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.create-project-request/description :portkey.aws.codestar.-2017-04-19.create-project-request/client-request-token :portkey.aws.codestar.-2017-04-19.create-project-request/source-code :portkey.aws.codestar.-2017-04-19.create-project-request/toolchain :portkey.aws.codestar.-2017-04-19.create-project-request/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:codestar:[^:\s]+:[0-9]{12}:project\/[a-z]([a-z0-9|-])+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.tag-project-result/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 11 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn\:aws\:\S.*\:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/untag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(Owner|Viewer|Contributor)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-project-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-project-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-project-result/id :portkey.aws.codestar.-2017-04-19.create-project-result/arn] :opt-un [:portkey.aws.codestar.-2017-04-19.create-project-result/client-request-token :portkey.aws.codestar.-2017-04-19.create-project-result/project-template-id]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/template-parameter-map (clojure.spec.alpha/map-of :portkey.aws.codestar.-2017-04-19/template-parameter-key :portkey.aws.codestar.-2017-04-19/template-parameter-value))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-profile-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-result/resources (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/resources-result))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-resources-result/resources :portkey.aws.codestar.-2017-04-19.list-resources-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.untag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.untag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tag-keys))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/untag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.untag-project-request/id :portkey.aws.codestar.-2017-04-19.untag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code-source/s-3 (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/s-3-location))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/code-source (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.code-source/s-3] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-request/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-request/display-name :portkey.aws.codestar.-2017-04-19.update-user-profile-request/email-address :portkey.aws.codestar.-2017-04-19.update-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-status/state (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/state))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-status/reason (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/reason))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-status (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.project-status/state] :opt-un [:portkey.aws.codestar.-2017-04-19.project-status/reason]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/last-modified-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/git-hub-personal-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/describe-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-result/user-arn :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/last-modified-timestamp] :opt-un [:portkey.aws.codestar.-2017-04-19.describe-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.describe-user-profile-result/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/stack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:cloudformation:[^:\s]+:[0-9]{12}:stack\/[^:\s]+\/[^:\s]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/template-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-result/project-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.delete-project-result/stack-id :portkey.aws.codestar.-2017-04-19.delete-project-result/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/repository-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/associate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-result/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 15)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-z][a-z0-9-]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member-result (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/team-member))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-result/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.update-team-member-result/user-arn :portkey.aws.codestar.-2017-04-19.update-team-member-result/project-role :portkey.aws.codestar.-2017-04-19.update-team-member-result/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.create-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.create-user-profile-result/ssh-public-key :portkey.aws.codestar.-2017-04-19.create-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.create-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.s-3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/bucket-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.s-3-location/bucket-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/bucket-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.s-3-location/bucket-name :portkey.aws.codestar.-2017-04-19.s-3-location/bucket-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.project-summary/project-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.project-summary/project-id :portkey.aws.codestar.-2017-04-19.project-summary/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/bucket-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/tags :portkey.aws.codestar.-2017-04-19.list-tags-for-project-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.associate-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/associate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.associate-team-member-request/user-arn :portkey.aws.codestar.-2017-04-19.associate-team-member-request/project-role] :opt-un [:portkey.aws.codestar.-2017-04-19.associate-team-member-request/client-request-token :portkey.aws.codestar.-2017-04-19.associate-team-member-request/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-result/team-members (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/team-member-result))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.list-team-members-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/list-team-members-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.list-team-members-result/team-members] :opt-un [:portkey.aws.codestar.-2017-04-19.list-team-members-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(CreateInProgress|CreateComplete|CreateFailed|DeleteComplete|DeleteFailed|DeleteInProgress|UpdateComplete|UpdateInProgress|UpdateFailed|Unknown)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.resource/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/resource-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resource (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.resource/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/projects-list (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/project-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code/source (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/code-source))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.code/destination (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/code-destination))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/code (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.code/source :portkey.aws.codestar.-2017-04-19.code/destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/project-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/resources-result (clojure.spec.alpha/coll-of :portkey.aws.codestar.-2017-04-19/resource))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.create-user-profile-request/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/create-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-request/user-arn :portkey.aws.codestar.-2017-04-19.create-user-profile-request/display-name :portkey.aws.codestar.-2017-04-19.create-user-profile-request/email-address] :opt-un [:portkey.aws.codestar.-2017-04-19.create-user-profile-request/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.disassociate-team-member-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-user-profile-result/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.delete-project-request/delete-stack (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-stack))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.delete-project-request/id] :opt-un [:portkey.aws.codestar.-2017-04-19.delete-project-request/client-request-token :portkey.aws.codestar.-2017-04-19.delete-project-request/delete-stack]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/email))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-result/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-user-profile-result/display-name :portkey.aws.codestar.-2017-04-19.update-user-profile-result/email-address :portkey.aws.codestar.-2017-04-19.update-user-profile-result/ssh-public-key :portkey.aws.codestar.-2017-04-19.update-user-profile-result/created-timestamp :portkey.aws.codestar.-2017-04-19.update-user-profile-result/last-modified-timestamp]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 32 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 95)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:user(?:(\u002F)|(\u002F[\u0021-\u007E]+\u002F))[\w+=,.@-]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.team-member/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/team-member (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.team-member/user-arn :portkey.aws.codestar.-2017-04-19.team-member/project-role] :opt-un [:portkey.aws.codestar.-2017-04-19.team-member/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/name (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-name))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/description (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-description))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/type (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-type))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/owner (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-owner))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/private-repository (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-is-private))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/issues-enabled (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/repository-enable-issues))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/token (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/git-hub-personal-token))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/git-hub-code-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.git-hub-code-destination/name :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/type :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/owner :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/private-repository :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/issues-enabled :portkey.aws.codestar.-2017-04-19.git-hub-code-destination/token] :opt-un [:portkey.aws.codestar.-2017-04-19.git-hub-code-destination/description]))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.tag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tags))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/tag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.tag-project-request/id :portkey.aws.codestar.-2017-04-19.tag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/role))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19.update-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar.-2017-04-19/update-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.-2017-04-19.update-team-member-request/project-id :portkey.aws.codestar.-2017-04-19.update-team-member-request/user-arn] :opt-un [:portkey.aws.codestar.-2017-04-19.update-team-member-request/project-role :portkey.aws.codestar.-2017-04-19.update-team-member-request/remote-access-allowed]))

(clojure.core/defn associate-team-member "Adds an IAM user to the team for an AWS CodeStar project." ([associate-team-member-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-team-member-request associate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/associate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/associate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateTeamMember", :http.request.configuration/output-deser-fn response-associate-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "TeamMemberAlreadyAssociatedException" :portkey.aws.codestar.-2017-04-19/team-member-already-associated-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/associate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/associate-team-member-result))

(clojure.core/defn tag-project "Adds tags to a project." ([tag-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-project-request tag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/tag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/tag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagProject", :http.request.configuration/output-deser-fn response-tag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef tag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/tag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/tag-project-result))

(clojure.core/defn update-user-profile "Updates a user's profile in AWS CodeStar. The user profile is not\nproject-specific. Information in the user profile is displayed wherever the\nuser's information appears to other users in AWS CodeStar." ([update-user-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-profile-request update-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUserProfile", :http.request.configuration/output-deser-fn response-update-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef update-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-user-profile-result))

(clojure.core/defn describe-project "Describes a project and its resources." ([describe-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/describe-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProject", :http.request.configuration/output-deser-fn response-describe-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/describe-project-result))

(clojure.core/defn list-projects "Lists all projects in AWS CodeStar associated with your AWS account." ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-projects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn response-list-projects-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codestar.-2017-04-19/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-projects-result))

(clojure.core/defn update-project "Updates a project in AWS CodeStar." ([update-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn response-update-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-project-result))

(clojure.core/defn describe-user-profile "Describes a user in AWS CodeStar and the user attributes across all projects." ([describe-user-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-profile-request describe-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/describe-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/describe-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUserProfile", :http.request.configuration/output-deser-fn response-describe-user-profile-result, :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar.-2017-04-19/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef describe-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/describe-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/describe-user-profile-result))

(clojure.core/defn list-tags-for-project "Gets the tags for a project." ([list-tags-for-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-project-request list-tags-for-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForProject", :http.request.configuration/output-deser-fn response-list-tags-for-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-tags-for-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-tags-for-project-result))

(clojure.core/defn create-user-profile "Creates a profile for a user that includes user preferences, such as the display\nname and email address assocciated with the user, in AWS CodeStar. The user\nprofile is not project-specific. Information in the user profile is displayed\nwherever the user's information appears to other users in AWS CodeStar." ([create-user-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-profile-request create-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/create-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/create-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUserProfile", :http.request.configuration/output-deser-fn response-create-user-profile-result, :http.request.spec/error-spec {"UserProfileAlreadyExistsException" :portkey.aws.codestar.-2017-04-19/user-profile-already-exists-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef create-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/create-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/create-user-profile-result))

(clojure.core/defn list-user-profiles "Lists all the user profiles configured for your AWS account in AWS CodeStar." ([] (list-user-profiles {})) ([list-user-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-user-profiles-request list-user-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-user-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-user-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUserProfiles", :http.request.configuration/output-deser-fn response-list-user-profiles-result, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-user-profiles :args (clojure.spec.alpha/? :portkey.aws.codestar.-2017-04-19/list-user-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-user-profiles-result))

(clojure.core/defn untag-project "Removes tags from a project." ([untag-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-project-request untag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/untag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/untag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagProject", :http.request.configuration/output-deser-fn response-untag-project-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef untag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/untag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/untag-project-result))

(clojure.core/defn delete-user-profile "Deletes a user profile in AWS CodeStar, including all personal preference data\nassociated with that profile, such as display name and email address. It does\nnot delete the history of that user, for example the history of commits made by\nthat user." ([delete-user-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-profile-request delete-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/delete-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/delete-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserProfile", :http.request.configuration/output-deser-fn response-delete-user-profile-result, :http.request.spec/error-spec {"ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef delete-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/delete-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-user-profile-result))

(clojure.core/defn list-resources "Lists resources associated with a project in AWS CodeStar." ([list-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn response-list-resources-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-resources-result))

(clojure.core/defn delete-project "Deletes a project, including project resources. Does not delete users associated\nwith the project, but does delete the IAM roles that allowed access to the\nproject." ([delete-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/delete-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn response-delete-project-result, :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/delete-project-result))

(clojure.core/defn list-team-members "Lists all team members associated with a project." ([list-team-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-team-members-request list-team-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/list-team-members-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/list-team-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTeamMembers", :http.request.configuration/output-deser-fn response-list-team-members-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar.-2017-04-19/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception}})))))
(clojure.spec.alpha/fdef list-team-members :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/list-team-members-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/list-team-members-result))

(clojure.core/defn disassociate-team-member "Removes a user from a project. Removing a user from a project also removes the\nIAM policies from that user that allowed access to the project and its\nresources. Disassociating a team member does not remove that user's profile from\nAWS CodeStar. It does not remove the user from IAM." ([disassociate-team-member-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-team-member-request disassociate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateTeamMember", :http.request.configuration/output-deser-fn response-disassociate-team-member-result, :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/disassociate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/disassociate-team-member-result))

(clojure.core/defn update-team-member "Updates a team member's attributes in an AWS CodeStar project. For example, you\ncan change a team member's role in the project, or change whether they have\nremote access to project resources." ([update-team-member-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-team-member-request update-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/update-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/update-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTeamMember", :http.request.configuration/output-deser-fn response-update-team-member-result, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar.-2017-04-19/project-not-found-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception, "TeamMemberNotFoundException" :portkey.aws.codestar.-2017-04-19/team-member-not-found-exception}})))))
(clojure.spec.alpha/fdef update-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/update-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/update-team-member-result))

(clojure.core/defn create-project "Creates a project, including project resources. This action creates a project\nbased on a submitted project request. A set of source code files and a toolchain\ntemplate file can be included with the project request. If these are not\nprovided, an empty project is created." ([create-project-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codestar.-2017-04-19/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar.-2017-04-19/create-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar.-2017-04-19/create-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn response-create-project-result, :http.request.spec/error-spec {"ProjectAlreadyExistsException" :portkey.aws.codestar.-2017-04-19/project-already-exists-exception, "LimitExceededException" :portkey.aws.codestar.-2017-04-19/limit-exceeded-exception, "ValidationException" :portkey.aws.codestar.-2017-04-19/validation-exception, "ProjectCreationFailedException" :portkey.aws.codestar.-2017-04-19/project-creation-failed-exception, "InvalidServiceRoleException" :portkey.aws.codestar.-2017-04-19/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar.-2017-04-19/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar.-2017-04-19/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar.-2017-04-19/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar.-2017-04-19/create-project-result))
