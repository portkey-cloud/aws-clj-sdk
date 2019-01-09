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

(clojure.core/declare ser-remote-access-allowed)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-delete-stack)

(clojure.core/declare ser-email)

(clojure.core/declare ser-ssh-public-key)

(clojure.core/declare ser-user-profile-display-name)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-role)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-project-description)

(clojure.core/declare ser-project-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-user-arn)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-remote-access-allowed [input] #:http.request.field{:value input, :shape "RemoteAccessAllowed"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-delete-stack [input] #:http.request.field{:value input, :shape "DeleteStack"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-ssh-public-key [input] #:http.request.field{:value input, :shape "SshPublicKey"})

(clojure.core/defn- ser-user-profile-display-name [input] #:http.request.field{:value input, :shape "UserProfileDisplayName"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-project-description [input] #:http.request.field{:value input, :shape "ProjectDescription"})

(clojure.core/defn- ser-project-id [input] #:http.request.field{:value input, :shape "ProjectId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-user-arn [input] #:http.request.field{:value input, :shape "UserArn"})

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-user-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-tags-for-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-team-members-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :project-id)) #:http.request.field{:name "projectId", :shape "ProjectId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-describe-user-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :name)) #:http.request.field{:name "name", :shape "ProjectName"}) (clojure.core/into (ser-project-id (input :id)) #:http.request.field{:name "id", :shape "ProjectId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-project-description (input :description)) #:http.request.field{:name "description", :shape "ProjectDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

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

(clojure.spec.alpha/def :portkey.aws.codestar/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.codestar/tag-key))

(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.user-profile-summary/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.user-profile-summary/user-arn :portkey.aws.codestar.user-profile-summary/display-name :portkey.aws.codestar.user-profile-summary/email-address :portkey.aws.codestar.user-profile-summary/ssh-public-key]))

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

(clojure.spec.alpha/def :portkey.aws.codestar/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\w:/-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-resources-request/project-id] :opt-un [:portkey.aws.codestar.list-resources-request/next-token :portkey.aws.codestar.list-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/delete-stack clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codestar/project-template-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]{0,5}:codestar:[^:\s]+::project-template(\/(github|codecommit))?\/[a-z0-9-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\w-.+]+@[\w-.+]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar.list-team-members-request/max-results (clojure.spec.alpha/and :portkey.aws.codestar/max-results))
(clojure.spec.alpha/def :portkey.aws.codestar/list-team-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-team-members-request/project-id] :opt-un [:portkey.aws.codestar.list-team-members-request/next-token :portkey.aws.codestar.list-team-members-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.codestar/project-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/team-member-already-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/ssh-public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 16384)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\t\r\n\u0020-\u00FF]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-result/user-profiles (clojure.spec.alpha/and :portkey.aws.codestar/user-profiles-list))
(clojure.spec.alpha/def :portkey.aws.codestar.list-user-profiles-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-user-profiles-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.list-user-profiles-result/user-profiles] :opt-un [:portkey.aws.codestar.list-user-profiles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-user-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-user-profile-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\w/+=]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/tags (clojure.spec.alpha/map-of :portkey.aws.codestar/tag-key :portkey.aws.codestar/tag-value))

(clojure.spec.alpha/def :portkey.aws.codestar/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/invalid-service-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/disassociate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.update-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-project-request/id] :opt-un [:portkey.aws.codestar.update-project-request/name :portkey.aws.codestar.update-project-request/description]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profiles-list (clojure.spec.alpha/coll-of :portkey.aws.codestar/user-profile-summary))

(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/name (clojure.spec.alpha/and :portkey.aws.codestar/project-name))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/description (clojure.spec.alpha/and :portkey.aws.codestar/project-description))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-project-request/name :portkey.aws.codestar.create-project-request/id] :opt-un [:portkey.aws.codestar.create-project-request/description :portkey.aws.codestar.create-project-request/client-request-token :portkey.aws.codestar.create-project-request/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar/project-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:codestar:[^:\s]+:[0-9]{12}:project\/[a-z]([a-z0-9|-])+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-result/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/tag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.tag-project-result/tags]))

(clojure.spec.alpha/def :portkey.aws.codestar/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 11 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn\:aws\:\S.*\:.*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/untag-project-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(Owner|Viewer|Contributor)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-project-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar.create-project-result/project-template-id (clojure.spec.alpha/and :portkey.aws.codestar/project-template-id))
(clojure.spec.alpha/def :portkey.aws.codestar/create-project-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.create-project-result/id :portkey.aws.codestar.create-project-result/arn] :opt-un [:portkey.aws.codestar.create-project-result/client-request-token :portkey.aws.codestar.create-project-result/project-template-id]))

(clojure.spec.alpha/def :portkey.aws.codestar/user-profile-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-result/resources (clojure.spec.alpha/and :portkey.aws.codestar/resources-result))
(clojure.spec.alpha/def :portkey.aws.codestar.list-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.codestar/pagination-token))
(clojure.spec.alpha/def :portkey.aws.codestar/list-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.list-resources-result/resources :portkey.aws.codestar.list-resources-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.codestar.untag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.untag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tag-keys))
(clojure.spec.alpha/def :portkey.aws.codestar/untag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.untag-project-request/id :portkey.aws.codestar.untag-project-request/tags] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.codestar/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/team-member-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/display-name (clojure.spec.alpha/and :portkey.aws.codestar/user-profile-display-name))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/email-address (clojure.spec.alpha/and :portkey.aws.codestar/email))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/ssh-public-key (clojure.spec.alpha/and :portkey.aws.codestar/ssh-public-key))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/created-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/created-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar.describe-user-profile-result/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.codestar/last-modified-timestamp))
(clojure.spec.alpha/def :portkey.aws.codestar/describe-user-profile-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.describe-user-profile-result/user-arn :portkey.aws.codestar.describe-user-profile-result/created-timestamp :portkey.aws.codestar.describe-user-profile-result/last-modified-timestamp] :opt-un [:portkey.aws.codestar.describe-user-profile-result/display-name :portkey.aws.codestar.describe-user-profile-result/email-address :portkey.aws.codestar.describe-user-profile-result/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.codestar/stack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn:aws[^:\s]*:cloudformation:[^:\s]+:[0-9]{12}:stack\/[^:\s]+\/[^:\s]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/project-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-result/stack-id (clojure.spec.alpha/and :portkey.aws.codestar/stack-id))
(clojure.spec.alpha/def :portkey.aws.codestar.delete-project-result/project-arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/delete-project-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.delete-project-result/stack-id :portkey.aws.codestar.delete-project-result/project-arn]))

(clojure.spec.alpha/def :portkey.aws.codestar.associate-team-member-result/client-request-token (clojure.spec.alpha/and :portkey.aws.codestar/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codestar/associate-team-member-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.associate-team-member-result/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codestar/project-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 2 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 15)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-z][a-z0-9-]+$" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.codestar.project-summary/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.project-summary/project-arn (clojure.spec.alpha/and :portkey.aws.codestar/project-arn))
(clojure.spec.alpha/def :portkey.aws.codestar/project-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codestar.project-summary/project-id :portkey.aws.codestar.project-summary/project-arn]))

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

(clojure.spec.alpha/def :portkey.aws.codestar/state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(CreateInProgress|CreateComplete|CreateFailed|DeleteComplete|DeleteFailed|DeleteInProgress|UpdateComplete|UpdateInProgress|UpdateFailed|Unknown)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.codestar.resource/id (clojure.spec.alpha/and :portkey.aws.codestar/resource-id))
(clojure.spec.alpha/def :portkey.aws.codestar/resource (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.resource/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^$|^\S(.*\S)?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/project-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\S(.*\S)?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar/projects-list (clojure.spec.alpha/coll-of :portkey.aws.codestar/project-summary))

(clojure.spec.alpha/def :portkey.aws.codestar/project-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.codestar/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 32 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 95)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:user(?:(\u002F)|(\u002F[\u0021-\u007E]+\u002F))[\w+=,.@-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codestar.team-member/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.team-member/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.team-member/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/team-member (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.team-member/user-arn :portkey.aws.codestar.team-member/project-role] :opt-un [:portkey.aws.codestar.team-member/remote-access-allowed]))

(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-request/id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.tag-project-request/tags (clojure.spec.alpha/and :portkey.aws.codestar/tags))
(clojure.spec.alpha/def :portkey.aws.codestar/tag-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.tag-project-request/id :portkey.aws.codestar.tag-project-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/project-id (clojure.spec.alpha/and :portkey.aws.codestar/project-id))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/user-arn (clojure.spec.alpha/and :portkey.aws.codestar/user-arn))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/project-role (clojure.spec.alpha/and :portkey.aws.codestar/role))
(clojure.spec.alpha/def :portkey.aws.codestar.update-team-member-request/remote-access-allowed (clojure.spec.alpha/and :portkey.aws.codestar/remote-access-allowed))
(clojure.spec.alpha/def :portkey.aws.codestar/update-team-member-request (clojure.spec.alpha/keys :req-un [:portkey.aws.codestar.update-team-member-request/project-id :portkey.aws.codestar.update-team-member-request/user-arn] :opt-un [:portkey.aws.codestar.update-team-member-request/project-role :portkey.aws.codestar.update-team-member-request/remote-access-allowed]))

(clojure.core/defn associate-team-member ([associate-team-member-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-associate-team-member-request associate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/associate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/associate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateTeamMember", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "TeamMemberAlreadyAssociatedException" :portkey.aws.codestar/team-member-already-associated-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef associate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/associate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/associate-team-member-result))

(clojure.core/defn tag-project ([tag-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-project-request tag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/tag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/tag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagProject", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef tag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/tag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/tag-project-result))

(clojure.core/defn update-user-profile ([update-user-profile-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-user-profile-request update-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUserProfile", :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef update-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-user-profile-result))

(clojure.core/defn describe-project ([describe-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/describe-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/describe-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProject", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/describe-project-result))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-projects-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-projects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.codestar/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-projects-result))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-project-result))

(clojure.core/defn describe-user-profile ([describe-user-profile-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-user-profile-request describe-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/describe-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/describe-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUserProfile", :http.request.spec/error-spec {"UserProfileNotFoundException" :portkey.aws.codestar/user-profile-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef describe-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/describe-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/describe-user-profile-result))

(clojure.core/defn list-tags-for-project ([list-tags-for-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-project-request list-tags-for-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-tags-for-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-tags-for-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForProject", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-tags-for-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-tags-for-project-result))

(clojure.core/defn create-user-profile ([create-user-profile-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-user-profile-request create-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/create-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/create-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUserProfile", :http.request.spec/error-spec {"UserProfileAlreadyExistsException" :portkey.aws.codestar/user-profile-already-exists-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef create-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/create-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/create-user-profile-result))

(clojure.core/defn list-user-profiles ([] (list-user-profiles {})) ([list-user-profiles-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-user-profiles-request list-user-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-user-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-user-profiles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUserProfiles", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-user-profiles :args (clojure.spec.alpha/? :portkey.aws.codestar/list-user-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-user-profiles-result))

(clojure.core/defn untag-project ([untag-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-project-request untag-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/untag-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/untag-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagProject", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef untag-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/untag-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/untag-project-result))

(clojure.core/defn delete-user-profile ([delete-user-profile-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-user-profile-request delete-user-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/delete-user-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/delete-user-profile-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserProfile", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef delete-user-profile :args (clojure.spec.alpha/tuple :portkey.aws.codestar/delete-user-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/delete-user-profile-result))

(clojure.core/defn list-resources ([list-resources-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResources", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-resources-result))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/delete-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/delete-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/delete-project-result))

(clojure.core/defn list-team-members ([list-team-members-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-team-members-request list-team-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/list-team-members-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/list-team-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTeamMembers", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "InvalidNextTokenException" :portkey.aws.codestar/invalid-next-token-exception, "ValidationException" :portkey.aws.codestar/validation-exception}})))))
(clojure.spec.alpha/fdef list-team-members :args (clojure.spec.alpha/tuple :portkey.aws.codestar/list-team-members-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/list-team-members-result))

(clojure.core/defn disassociate-team-member ([disassociate-team-member-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disassociate-team-member-request disassociate-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/disassociate-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/disassociate-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateTeamMember", :http.request.spec/error-spec {"ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef disassociate-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/disassociate-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/disassociate-team-member-result))

(clojure.core/defn update-team-member ([update-team-member-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-team-member-request update-team-member-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/update-team-member-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/update-team-member-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTeamMember", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ProjectNotFoundException" :portkey.aws.codestar/project-not-found-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception, "TeamMemberNotFoundException" :portkey.aws.codestar/team-member-not-found-exception}})))))
(clojure.spec.alpha/fdef update-team-member :args (clojure.spec.alpha/tuple :portkey.aws.codestar/update-team-member-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/update-team-member-result))

(clojure.core/defn create-project ([create-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codestar/endpoints, :http.request.configuration/target-prefix "CodeStar_20170419", :http.request.spec/output-spec :portkey.aws.codestar/create-project-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "CodeStar", :http.request.spec/input-spec :portkey.aws.codestar/create-project-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.spec/error-spec {"ProjectAlreadyExistsException" :portkey.aws.codestar/project-already-exists-exception, "LimitExceededException" :portkey.aws.codestar/limit-exceeded-exception, "ValidationException" :portkey.aws.codestar/validation-exception, "ProjectCreationFailedException" :portkey.aws.codestar/project-creation-failed-exception, "InvalidServiceRoleException" :portkey.aws.codestar/invalid-service-role-exception, "ProjectConfigurationException" :portkey.aws.codestar/project-configuration-exception, "ConcurrentModificationException" :portkey.aws.codestar/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.codestar/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.codestar/create-project-result))
