(ns portkey.aws.codecommit.-2015-04-13 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codecommit", :region "ap-northeast-1"},
    :ssl-common-name "codecommit.ap-northeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codecommit", :region "eu-west-1"},
    :ssl-common-name "codecommit.eu-west-1.amazonaws.com",
    :endpoint "https://codecommit.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codecommit", :region "us-east-2"},
    :ssl-common-name "codecommit.us-east-2.amazonaws.com",
    :endpoint "https://codecommit.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codecommit", :region "ap-southeast-2"},
    :ssl-common-name "codecommit.ap-southeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codecommit", :region "sa-east-1"},
    :ssl-common-name "codecommit.sa-east-1.amazonaws.com",
    :endpoint "https://codecommit.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codecommit", :region "ap-southeast-1"},
    :ssl-common-name "codecommit.ap-southeast-1.amazonaws.com",
    :endpoint "https://codecommit.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codecommit", :region "ap-northeast-2"},
    :ssl-common-name "codecommit.ap-northeast-2.amazonaws.com",
    :endpoint "https://codecommit.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codecommit", :region "eu-west-3"},
    :ssl-common-name "codecommit.eu-west-3.amazonaws.com",
    :endpoint "https://codecommit.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codecommit", :region "ca-central-1"},
    :ssl-common-name "codecommit.ca-central-1.amazonaws.com",
    :endpoint "https://codecommit.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codecommit", :region "eu-central-1"},
    :ssl-common-name "codecommit.eu-central-1.amazonaws.com",
    :endpoint "https://codecommit.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codecommit", :region "eu-west-2"},
    :ssl-common-name "codecommit.eu-west-2.amazonaws.com",
    :endpoint "https://codecommit.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codecommit", :region "us-west-2"},
    :ssl-common-name "codecommit.us-west-2.amazonaws.com",
    :endpoint "https://codecommit.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codecommit", :region "us-east-1"},
    :ssl-common-name "codecommit.us-east-1.amazonaws.com",
    :endpoint "https://codecommit.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codecommit", :region "us-west-1"},
    :ssl-common-name "codecommit.us-west-1.amazonaws.com",
    :endpoint "https://codecommit.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codecommit", :region "ap-south-1"},
    :ssl-common-name "codecommit.ap-south-1.amazonaws.com",
    :endpoint "https://codecommit.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-object-id)

(clojure.core/declare ser-email)

(clojure.core/declare ser-pull-request-id)

(clojure.core/declare ser-repository-trigger-event-list)

(clojure.core/declare ser-repository-trigger-event-enum)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-path)

(clojure.core/declare ser-branch-name)

(clojure.core/declare ser-title)

(clojure.core/declare ser-file-content)

(clojure.core/declare ser-location)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-order-enum)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-repository-triggers-list)

(clojure.core/declare ser-repository-trigger-name)

(clojure.core/declare ser-commit-id)

(clojure.core/declare ser-keep-empty-folders)

(clojure.core/declare ser-comment-id)

(clojure.core/declare ser-repository-trigger-custom-data)

(clojure.core/declare ser-merge-option-type-enum)

(clojure.core/declare ser-description)

(clojure.core/declare ser-message)

(clojure.core/declare ser-branch-name-list)

(clojure.core/declare ser-position)

(clojure.core/declare ser-content)

(clojure.core/declare ser-repository-description)

(clojure.core/declare ser-repository-trigger)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-pull-request-status-enum)

(clojure.core/declare ser-pull-request-event-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-relative-file-version-enum)

(clojure.core/declare ser-target-list)

(clojure.core/declare ser-target)

(clojure.core/declare ser-name)

(clojure.core/declare ser-sort-by-enum)

(clojure.core/declare ser-file-mode-type-enum)

(clojure.core/declare ser-commit-name)

(clojure.core/declare ser-reference-name)

(clojure.core/declare ser-repository-name-list)

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-object-id [input] #:http.request.field{:value input, :shape "ObjectId"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-pull-request-id [input] #:http.request.field{:value input, :shape "PullRequestId"})

(clojure.core/defn- ser-repository-trigger-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-trigger-event-enum coll) #:http.request.field{:shape "RepositoryTriggerEventEnum"}))) input), :shape "RepositoryTriggerEventList", :type "list"})

(clojure.core/defn- ser-repository-trigger-event-enum [input] #:http.request.field{:value (clojure.core/get {"all" "all", :all "all", "updateReference" "updateReference", :update-reference "updateReference", "createReference" "createReference", :create-reference "createReference", "deleteReference" "deleteReference", :delete-reference "deleteReference"} input), :shape "RepositoryTriggerEventEnum"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-branch-name [input] #:http.request.field{:value input, :shape "BranchName"})

(clojure.core/defn- ser-title [input] #:http.request.field{:value input, :shape "Title"})

(clojure.core/defn- ser-file-content [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "FileContent"})

(clojure.core/defn- ser-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Location", :type "structure"} (clojure.core/contains? input :file-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})) (clojure.core/contains? input :file-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-position (input :file-position)) #:http.request.field{:name "filePosition", :shape "Position"})) (clojure.core/contains? input :relative-file-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relative-file-version-enum (input :relative-file-version)) #:http.request.field{:name "relativeFileVersion", :shape "RelativeFileVersionEnum"}))))

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-order-enum [input] #:http.request.field{:value (clojure.core/get {"ascending" "ascending", :ascending "ascending", "descending" "descending", :descending "descending"} input), :shape "OrderEnum"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-repository-triggers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-trigger coll) #:http.request.field{:shape "RepositoryTrigger"}))) input), :shape "RepositoryTriggersList", :type "list"})

(clojure.core/defn- ser-repository-trigger-name [input] #:http.request.field{:value input, :shape "RepositoryTriggerName"})

(clojure.core/defn- ser-commit-id [input] #:http.request.field{:value input, :shape "CommitId"})

(clojure.core/defn- ser-keep-empty-folders [input] #:http.request.field{:value input, :shape "KeepEmptyFolders"})

(clojure.core/defn- ser-comment-id [input] #:http.request.field{:value input, :shape "CommentId"})

(clojure.core/defn- ser-repository-trigger-custom-data [input] #:http.request.field{:value input, :shape "RepositoryTriggerCustomData"})

(clojure.core/defn- ser-merge-option-type-enum [input] #:http.request.field{:value (clojure.core/get {"FAST_FORWARD_MERGE" "FAST_FORWARD_MERGE", :fast-forward-merge "FAST_FORWARD_MERGE"} input), :shape "MergeOptionTypeEnum"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-branch-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-branch-name coll) #:http.request.field{:shape "BranchName"}))) input), :shape "BranchNameList", :type "list"})

(clojure.core/defn- ser-position [input] #:http.request.field{:value input, :shape "Position"})

(clojure.core/defn- ser-content [input] #:http.request.field{:value input, :shape "Content"})

(clojure.core/defn- ser-repository-description [input] #:http.request.field{:value input, :shape "RepositoryDescription"})

(clojure.core/defn- ser-repository-trigger [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-trigger-name (:name input)) #:http.request.field{:name "name", :shape "RepositoryTriggerName"}) (clojure.core/into (ser-arn (:destination-arn input)) #:http.request.field{:name "destinationArn", :shape "Arn"}) (clojure.core/into (ser-repository-trigger-event-list (:events input)) #:http.request.field{:name "events", :shape "RepositoryTriggerEventList"})], :shape "RepositoryTrigger", :type "structure"} (clojure.core/contains? input :custom-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-trigger-custom-data (input :custom-data)) #:http.request.field{:name "customData", :shape "RepositoryTriggerCustomData"})) (clojure.core/contains? input :branches) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-branch-name-list (input :branches)) #:http.request.field{:name "branches", :shape "BranchNameList"}))))

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-pull-request-status-enum [input] #:http.request.field{:value (clojure.core/get {"OPEN" "OPEN", :open "OPEN", "CLOSED" "CLOSED", :closed "CLOSED"} input), :shape "PullRequestStatusEnum"})

(clojure.core/defn- ser-pull-request-event-type [input] #:http.request.field{:value (clojure.core/get {"PULL_REQUEST_CREATED" "PULL_REQUEST_CREATED", :pull-request-created "PULL_REQUEST_CREATED", "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_STATUS_CHANGED", :pull-request-status-changed "PULL_REQUEST_STATUS_CHANGED", "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", :pull-request-source-reference-updated "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", "PULL_REQUEST_MERGE_STATE_CHANGED" "PULL_REQUEST_MERGE_STATE_CHANGED", :pull-request-merge-state-changed "PULL_REQUEST_MERGE_STATE_CHANGED"} input), :shape "PullRequestEventType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-relative-file-version-enum [input] #:http.request.field{:value (clojure.core/get {"BEFORE" "BEFORE", :before "BEFORE", "AFTER" "AFTER", :after "AFTER"} input), :shape "RelativeFileVersionEnum"})

(clojure.core/defn- ser-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "TargetList", :type "list"})

(clojure.core/defn- ser-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-name (:repository-name input)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-reference-name (:source-reference input)) #:http.request.field{:name "sourceReference", :shape "ReferenceName"})], :shape "Target", :type "structure"} (clojure.core/contains? input :destination-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-name (input :destination-reference)) #:http.request.field{:name "destinationReference", :shape "ReferenceName"}))))

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-sort-by-enum [input] #:http.request.field{:value (clojure.core/get {"repositoryName" "repositoryName", :repository-name "repositoryName", "lastModifiedDate" "lastModifiedDate", :last-modified-date "lastModifiedDate"} input), :shape "SortByEnum"})

(clojure.core/defn- ser-file-mode-type-enum [input] #:http.request.field{:value (clojure.core/get {"EXECUTABLE" "EXECUTABLE", :executable "EXECUTABLE", "NORMAL" "NORMAL", :normal "NORMAL", "SYMLINK" "SYMLINK", :symlink "SYMLINK"} input), :shape "FileModeTypeEnum"})

(clojure.core/defn- ser-commit-name [input] #:http.request.field{:value input, :shape "CommitName"})

(clojure.core/defn- ser-reference-name [input] #:http.request.field{:value input, :shape "ReferenceName"})

(clojure.core/defn- ser-repository-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-name coll) #:http.request.field{:shape "RepositoryName"}))) input), :shape "RepositoryNameList", :type "list"})

(clojure.core/defn- req-get-branch-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :repository-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})) (clojure.core/contains? input :branch-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}))))

(clojure.core/defn- req-create-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-title (input :title)) #:http.request.field{:name "title", :shape "Title"}) (clojure.core/into (ser-target-list (input :targets)) #:http.request.field{:name "targets", :shape "TargetList"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-update-default-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :default-branch-name)) #:http.request.field{:name "defaultBranchName", :shape "BranchName"})]}))

(clojure.core/defn- req-delete-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"}) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"})]} (clojure.core/contains? input :keep-empty-folders) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keep-empty-folders (input :keep-empty-folders)) #:http.request.field{:name "keepEmptyFolders", :shape "KeepEmptyFolders"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"}))))

(clojure.core/defn- req-delete-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-get-merge-conflicts-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-name (input :destination-commit-specifier)) #:http.request.field{:name "destinationCommitSpecifier", :shape "CommitName"}) (clojure.core/into (ser-commit-name (input :source-commit-specifier)) #:http.request.field{:name "sourceCommitSpecifier", :shape "CommitName"}) (clojure.core/into (ser-merge-option-type-enum (input :merge-option)) #:http.request.field{:name "mergeOption", :shape "MergeOptionTypeEnum"})]}))

(clojure.core/defn- req-create-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-commit-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "CommitId"})]}))

(clojure.core/defn- req-get-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})]} (clojure.core/contains? input :commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :commit-specifier)) #:http.request.field{:name "commitSpecifier", :shape "CommitName"}))))

(clojure.core/defn- req-delete-comment-content-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"})]}))

(clojure.core/defn- req-get-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]}))

(clojure.core/defn- req-update-comment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]}))

(clojure.core/defn- req-post-comment-for-compared-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "location", :shape "Location"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-get-comments-for-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]} (clojure.core/contains? input :repository-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})) (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :after-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-pull-request-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-pull-request-status-enum (input :pull-request-status)) #:http.request.field{:name "pullRequestStatus", :shape "PullRequestStatusEnum"})]}))

(clojure.core/defn- req-get-comment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :comment-id)) #:http.request.field{:name "commentId", :shape "CommentId"})]}))

(clojure.core/defn- req-get-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-test-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-triggers-list (input :triggers)) #:http.request.field{:name "triggers", :shape "RepositoryTriggersList"})]}))

(clojure.core/defn- req-batch-get-repositories-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name-list (input :repository-names)) #:http.request.field{:name "repositoryNames", :shape "RepositoryNameList"})]}))

(clojure.core/defn- req-get-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-update-pull-request-description-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})]}))

(clojure.core/defn- req-get-comments-for-compared-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"})]} (clojure.core/contains? input :before-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-pull-request-events-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"})]} (clojure.core/contains? input :pull-request-event-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pull-request-event-type (input :pull-request-event-type)) #:http.request.field{:name "pullRequestEventType", :shape "PullRequestEventType"})) (clojure.core/contains? input :actor-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :actor-arn)) #:http.request.field{:name "actorArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-branches-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-post-comment-reply-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-comment-id (input :in-reply-to)) #:http.request.field{:name "inReplyTo", :shape "CommentId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-get-folder-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-path (input :folder-path)) #:http.request.field{:name "folderPath", :shape "Path"})]} (clojure.core/contains? input :commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :commit-specifier)) #:http.request.field{:name "commitSpecifier", :shape "CommitName"}))))

(clojure.core/defn- req-create-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :repository-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-description (input :repository-description)) #:http.request.field{:name "repositoryDescription", :shape "RepositoryDescription"}))))

(clojure.core/defn- req-post-comment-for-pull-request-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-id (input :before-commit-id)) #:http.request.field{:name "beforeCommitId", :shape "CommitId"}) (clojure.core/into (ser-commit-id (input :after-commit-id)) #:http.request.field{:name "afterCommitId", :shape "CommitId"}) (clojure.core/into (ser-content (input :content)) #:http.request.field{:name "content", :shape "Content"})]} (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "location", :shape "Location"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-list-repositories-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by-enum (input :sort-by)) #:http.request.field{:name "sortBy", :shape "SortByEnum"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-enum (input :order)) #:http.request.field{:name "order", :shape "OrderEnum"}))))

(clojure.core/defn- req-put-file-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"}) (clojure.core/into (ser-file-content (input :file-content)) #:http.request.field{:name "fileContent", :shape "FileContent"}) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})]} (clojure.core/contains? input :file-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-mode-type-enum (input :file-mode)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :parent-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"}))))

(clojure.core/defn- req-update-repository-description-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :repository-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-description (input :repository-description)) #:http.request.field{:name "repositoryDescription", :shape "RepositoryDescription"}))))

(clojure.core/defn- req-get-differences-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-commit-name (input :after-commit-specifier)) #:http.request.field{:name "afterCommitSpecifier", :shape "CommitName"})]} (clojure.core/contains? input :before-commit-specifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-name (input :before-commit-specifier)) #:http.request.field{:name "beforeCommitSpecifier", :shape "CommitName"})) (clojure.core/contains? input :before-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :before-path)) #:http.request.field{:name "beforePath", :shape "Path"})) (clojure.core/contains? input :after-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :after-path)) #:http.request.field{:name "afterPath", :shape "Path"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-pull-requests-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :author-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :author-arn)) #:http.request.field{:name "authorArn", :shape "Arn"})) (clojure.core/contains? input :pull-request-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pull-request-status-enum (input :pull-request-status)) #:http.request.field{:name "pullRequestStatus", :shape "PullRequestStatusEnum"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-repository-triggers-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-triggers-list (input :triggers)) #:http.request.field{:name "triggers", :shape "RepositoryTriggersList"})]}))

(clojure.core/defn- req-merge-pull-request-by-fast-forward-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :source-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :source-commit-id)) #:http.request.field{:name "sourceCommitId", :shape "CommitId"}))))

(clojure.core/defn- req-update-pull-request-title-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pull-request-id (input :pull-request-id)) #:http.request.field{:name "pullRequestId", :shape "PullRequestId"}) (clojure.core/into (ser-title (input :title)) #:http.request.field{:name "title", :shape "Title"})]}))

(clojure.core/defn- req-get-blob-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-object-id (input :blob-id)) #:http.request.field{:name "blobId", :shape "ObjectId"})]}))

(clojure.core/defn- req-update-repository-name-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :old-name)) #:http.request.field{:name "oldName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-name (input :new-name)) #:http.request.field{:name "newName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-get-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-object-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "ObjectId"})]}))

(clojure.core/defn- req-delete-branch-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"})]}))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-size (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-size))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-output/file-content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.get-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.get-file-output/file-path :portkey.aws.codecommit.-2015-04-13.get-file-output/file-mode :portkey.aws.codecommit.-2015-04-13.get-file-output/file-size :portkey.aws.codecommit.-2015-04-13.get-file-output/file-content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-comment-deleted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-branch-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-branch-input/branch-name]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-blob-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/actor-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/targets (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-input/title :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/targets] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-input/description :portkey.aws.codecommit.-2015-04-13.create-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-sort-by-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/default-branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-default-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-default-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.update-default-branch-input/default-branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-output/commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-commit-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-commit-output/commit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-status-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/client-request-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-deletion-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-output/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-blob-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-blob-output/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-open-pull-requests-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-reference-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/keep-empty-folders (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/keep-empty-folders))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.delete-file-input/branch-name :portkey.aws.codecommit.-2015-04-13.delete-file-input/file-path :portkey.aws.codecommit.-2015-04-13.delete-file-input/parent-commit-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-file-input/keep-empty-folders :portkey.aws.codecommit.-2015-04-13.delete-file-input/commit-message :portkey.aws.codecommit.-2015-04-13.delete-file-input/name :portkey.aws.codecommit.-2015-04-13.delete-file-input/email]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/object-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-created-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/source-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/destination-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-created-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-name-conflicts-with-directory-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-enum))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/object-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-merged clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-path-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/deleted (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-comment-deleted))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comment/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comment/comment-id :portkey.aws.codecommit.-2015-04-13.comment/content :portkey.aws.codecommit.-2015-04-13.comment/in-reply-to :portkey.aws.codecommit.-2015-04-13.comment/creation-date :portkey.aws.codecommit.-2015-04-13.comment/last-modified-date :portkey.aws.codecommit.-2015-04-13.comment/author-arn :portkey.aws.codecommit.-2015-04-13.comment/deleted :portkey.aws.codecommit.-2015-04-13.comment/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/destination-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/source-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/merge-option (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-option-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/destination-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/source-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-input/merge-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-branch-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.create-branch-input/branch-name :portkey.aws.codecommit.-2015-04-13.create-branch-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-metadata/is-merged (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-merged))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-metadata/merged-by (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-metadata/is-merged :portkey.aws.codecommit.-2015-04-13.merge-metadata/merged-by]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-title-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sub-module-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/sub-module))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-file-input/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-file-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-commit (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-target/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-reference :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-reference :portkey.aws.codecommit.-2015-04-13.pull-request-target/destination-commit :portkey.aws.codecommit.-2015-04-13.pull-request-target/source-commit :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-base :portkey.aws.codecommit.-2015-04-13.pull-request-target/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-metadata))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/last-modified-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comment))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-enum #{"createReference" :all "updateReference" :delete-reference "all" :update-reference "deleteReference" :create-reference})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-source-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w\.-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.folder/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.folder/tree-id :portkey.aws.codecommit.-2015-04-13.folder/absolute-path :portkey.aws.codecommit.-2015-04-13.folder/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.symbolic-link/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/symbolic-link (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.symbolic-link/blob-id :portkey.aws.codecommit.-2015-04-13.symbolic-link/absolute-path :portkey.aws.codecommit.-2015-04-13.symbolic-link/relative-path :portkey.aws.codecommit.-2015-04-13.symbolic-link/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/folder-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/folder))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/title (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-comment-content-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-comment-content-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-pull-request-input/pull-request-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/object-id))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/difference-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/difference))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-output/deleted-branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-branch-output/deleted-branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/trigger (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/failure-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/trigger :portkey.aws.codecommit.-2015-04-13.repository-trigger-execution-failure/failure-message]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-comment-input/comment-id :portkey.aws.codecommit.-2015-04-13.update-comment-input/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-title-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.branch-info/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.branch-info/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.branch-info/branch-name :portkey.aws.codecommit.-2015-04-13.branch-info/commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/pull-request-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/next-token :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.file/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.file/blob-id :portkey.aws.codecommit.-2015-04-13.file/absolute-path :portkey.aws.codecommit.-2015-04-13.file/relative-path :portkey.aws.codecommit.-2015-04-13.file/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-mode-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-status-input/pull-request-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/event-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/event-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-created-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-created-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-status-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-source-reference-updated-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-merged-state-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-id :portkey.aws.codecommit.-2015-04-13.pull-request-event/event-date :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-event-type :portkey.aws.codecommit.-2015-04-13.pull-request-event/actor-arn :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-created-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-status-changed-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-source-reference-updated-event-metadata :portkey.aws.codecommit.-2015-04-13.pull-request-event/pull-request-merged-state-changed-event-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/tree-id :portkey.aws.codecommit.-2015-04-13.delete-file-output/file-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/last-activity-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-targets (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request/creation-date :portkey.aws.codecommit.-2015-04-13.pull-request/last-activity-date :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-status :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-targets :portkey.aws.codecommit.-2015-04-13.pull-request/author-arn :portkey.aws.codecommit.-2015-04-13.pull-request/client-request-token :portkey.aws.codecommit.-2015-04-13.pull-request/title :portkey.aws.codecommit.-2015-04-13.pull-request/pull-request-id :portkey.aws.codecommit.-2015-04-13.pull-request/description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.put-repository-triggers-output/configuration-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/file-position (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/position))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.location/relative-file-version (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/relative-file-version-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.location/file-path :portkey.aws.codecommit.-2015-04-13.location/file-position :portkey.aws.codecommit.-2015-04-13.location/relative-file-version]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-output/branches (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-branches-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-branches-output/branches :portkey.aws.codecommit.-2015-04-13.list-branches-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/before-blob (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/after-blob (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.difference/change-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/change-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/difference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.difference/before-blob :portkey.aws.codecommit.-2015-04-13.difference/after-blob :portkey.aws.codecommit.-2015-04-13.difference/change-type]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/default-branch-cannot-be-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/before-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/after-commit-id :portkey.aws.codecommit.-2015-04-13.pull-request-source-reference-updated-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-file-output/commit-id :portkey.aws.codecommit.-2015-04-13.put-file-output/blob-id :portkey.aws.codecommit.-2015-04-13.put-file-output/tree-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/order-enum #{:descending :ascending "descending" "ascending"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/tip-of-source-reference-is-different-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/mode (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comment-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-author-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-repository-triggers-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/repository-name :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-email-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-output/pull-request]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/directory-name-conflicts-with-file-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/configuration-id :portkey.aws.codecommit.-2015-04-13.get-repository-triggers-output/triggers]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/comments (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/repository-name :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/before-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/after-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/location :portkey.aws.codecommit.-2015-04-13.comments-for-compared-commit/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/date (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/destination-reference :portkey.aws.codecommit.-2015-04-13.pull-request-merged-state-changed-event-metadata/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.blob-metadata/mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/mode))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.blob-metadata/blob-id :portkey.aws.codecommit.-2015-04-13.blob-metadata/path :portkey.aws.codecommit.-2015-04-13.blob-metadata/mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-input/repository-names (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.batch-get-repositories-input/repository-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-option-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/clone-url-http (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/pull-request-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/before-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/after-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/comments-for-compared-commit-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/comments-for-compared-commit-data :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-input/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/parents (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/parent-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/author (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/committer (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.commit/additional-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/additional-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.commit/commit-id :portkey.aws.codecommit.-2015-04-13.commit/tree-id :portkey.aws.codecommit.-2015-04-13.commit/parents :portkey.aws.codecommit.-2015-04-13.commit/message :portkey.aws.codecommit.-2015-04-13.commit/author :portkey.aws.codecommit.-2015-04-13.commit/committer :portkey.aws.codecommit.-2015-04-13.commit/additional-data]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-repositories-output/repositories :portkey.aws.codecommit.-2015-04-13.list-repositories-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/after-commit-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/next-token :portkey.aws.codecommit.-2015-04-13.get-comments-for-compared-commit-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-id] :opt-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/pull-request-event-type :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/actor-arn :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/next-token :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/keep-empty-folders clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-names-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-description-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-description-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/comments (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/pull-request-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/repository-name :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-commit-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/before-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/after-blob-id :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/location :portkey.aws.codecommit.-2015-04-13.comments-for-pull-request/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.sub-module/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sub-module (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.sub-module/commit-id :portkey.aws.codecommit.-2015-04-13.sub-module/absolute-path :portkey.aws.codecommit.-2015-04-13.sub-module/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/blob-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/multiple-repositories-in-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-custom-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-branches-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-branches-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-branches-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-branches-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-option-type-enum #{"FAST_FORWARD_MERGE" :fast-forward-merge})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-id-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-id))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/change-type-enum #{:m "M" :d "A" "D" :a})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-event))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/event-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/clone-url-ssh (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/branch-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/in-reply-to :portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-reply-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-comment-content-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-comment-content-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-not-created-by-caller-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/position clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-folders (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/folder-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/files (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/symbolic-links (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/symbolic-link-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-modules (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/sub-module-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-folder-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-folder-output/commit-id :portkey.aws.codecommit.-2015-04-13.get-folder-output/folder-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-folder-output/tree-id :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-folders :portkey.aws.codecommit.-2015-04-13.get-folder-output/files :portkey.aws.codecommit.-2015-04-13.get-folder-output/symbolic-links :portkey.aws.codecommit.-2015-04-13.get-folder-output/sub-modules]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-folder-input/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-folder-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-folder-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-folder-input/folder-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-folder-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.create-repository-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/path-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-event-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-repository-output/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.delete-repository-output/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/content] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-actor-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-targets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/sort-by (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/sort-by-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-repositories-input/order (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/order-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-repositories-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-repositories-input/next-token :portkey.aws.codecommit.-2015-04-13.list-repositories-input/sort-by :portkey.aws.codecommit.-2015-04-13.list-repositories-input/order]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/file-content (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-file-input/repository-name :portkey.aws.codecommit.-2015-04-13.put-file-input/branch-name :portkey.aws.codecommit.-2015-04-13.put-file-input/file-content :portkey.aws.codecommit.-2015-04-13.put-file-input/file-path] :opt-un [:portkey.aws.codecommit.-2015-04-13.put-file-input/file-mode :portkey.aws.codecommit.-2015-04-13.put-file-input/email :portkey.aws.codecommit.-2015-04-13.put-file-input/name :portkey.aws.codecommit.-2015-04-13.put-file-input/commit-message :portkey.aws.codecommit.-2015-04-13.put-file-input/parent-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/pull-request-events (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/pull-request-events] :opt-un [:portkey.aws.codecommit.-2015-04-13.describe-pull-request-events-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-order-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/pull-request-ids (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/pull-request-ids] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/destination-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/custom-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-custom-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/branches (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-trigger/events (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger/name :portkey.aws.codecommit.-2015-04-13.repository-trigger/destination-arn :portkey.aws.codecommit.-2015-04-13.repository-trigger/events] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-trigger/custom-data :portkey.aws.codecommit.-2015-04-13.repository-trigger/branches]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-repository-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.update-repository-description-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.update-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-id-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-name :portkey.aws.codecommit.-2015-04-13.repository-name-id-pair/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/manual-merge-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/same-file-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/maximum-repository-names-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-not-found-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-path (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/limit))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-differences-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-differences-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-commit-specifier] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-differences-input/before-commit-specifier :portkey.aws.codecommit.-2015-04-13.get-differences-input/before-path :portkey.aws.codecommit.-2015-04-13.get-differences-input/after-path :portkey.aws.codecommit.-2015-04-13.get-differences-input/max-results :portkey.aws.codecommit.-2015-04-13/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/author-arn :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/pull-request-status :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/next-token :portkey.aws.codecommit.-2015-04-13.list-pull-requests-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/symbolic-link-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/symbolic-link))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum #{:open :closed "CLOSED" "OPEN"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/targets-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/repository-name :portkey.aws.codecommit.-2015-04-13.put-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/title-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/repository-name] :opt-un [:portkey.aws.codecommit.-2015-04-13.merge-pull-request-by-fast-forward-input/source-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-event-type #{"PULL_REQUEST_MERGE_STATE_CHANGED" :pull-request-created :pull-request-status-changed "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" :pull-request-merge-state-changed :pull-request-source-reference-updated "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_CREATED"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/tips-divergence-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/relative-file-version-enum #{:after "BEFORE" "AFTER" :before})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-ssh (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/clone-url-ssh))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/account-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/account-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/default-branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-http (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/clone-url-http))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-name :portkey.aws.codecommit.-2015-04-13.repository-metadata/creation-date :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-ssh :portkey.aws.codecommit.-2015-04-13.repository-metadata/account-id :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-id :portkey.aws.codecommit.-2015-04-13.repository-metadata/default-branch :portkey.aws.codecommit.-2015-04-13.repository-metadata/repository-description :portkey.aws.codecommit.-2015-04-13.repository-metadata/last-modified-date :portkey.aws.codecommit.-2015-04-13/arn :portkey.aws.codecommit.-2015-04-13.repository-metadata/clone-url-http]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/target))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/title (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/pull-request-id :portkey.aws.codecommit.-2015-04-13.update-pull-request-title-input/title] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/author-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-destination-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-blob-input/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-blob-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-blob-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-blob-input/blob-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.target/repository-name :portkey.aws.codecommit.-2015-04-13.target/source-reference] :opt-un [:portkey.aws.codecommit.-2015-04-13.target/destination-reference]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.create-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/create-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.create-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/old-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/new-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/update-repository-name-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.update-repository-name-input/old-name :portkey.aws.codecommit.-2015-04-13.update-repository-name-input/new-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/successful-executions (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/failed-executions (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-trigger-execution-failure-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/successful-executions :portkey.aws.codecommit.-2015-04-13.test-repository-triggers-output/failed-executions]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/pull-request-target))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-commit-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-commit-input/repository-name :portkey.aws.codecommit.-2015-04-13.get-commit-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/sort-by-enum #{"repositoryName" "lastModifiedDate" :repository-name :last-modified-date})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-mode-type-enum #{"NORMAL" :executable :normal "EXECUTABLE" :symlink "SYMLINK"})

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/branch-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.delete-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/delete-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.delete-branch-input/repository-name :portkey.aws.codecommit.-2015-04-13.delete-branch-input/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-merge-option-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/target-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/commit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/file-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/file))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/comments-for-pull-request-data (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comments-for-pull-request-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/comments-for-pull-request-data :portkey.aws.codecommit.-2015-04-13.get-comments-for-pull-request-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/mergeable (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/is-mergeable))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/mergeable :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/destination-commit-id :portkey.aws.codecommit.-2015-04-13.get-merge-conflicts-output/source-commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/location (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/repository-name :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-commit-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/before-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/after-blob-id :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/location :portkey.aws.codecommit.-2015-04-13.post-comment-for-compared-commit-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-differences-output/differences (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/difference-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-differences-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-differences-output/differences :portkey.aws.codecommit.-2015-04-13/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/source-and-destination-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/reference-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.pull-request-status-changed-event-metadata/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/pull-request-status-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.pull-request-status-changed-event-metadata/pull-request-status]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.get-branch-output/branch (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/get-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.get-branch-output/branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/is-mergeable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-metadata-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories-not-found (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/repository-not-found-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories :portkey.aws.codecommit.-2015-04-13.batch-get-repositories-output/repositories-not-found]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/comments-for-compared-commit))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/name (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/email (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13.user-info/date (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/date))
(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/user-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.-2015-04-13.user-info/name :portkey.aws.codecommit.-2015-04-13.user-info/email :portkey.aws.codecommit.-2015-04-13.user-info/date]))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/additional-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.-2015-04-13/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit.-2015-04-13/repository-name))

(clojure.core/defn get-repository-triggers ([get-repository-triggers-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-repository-triggers-input get-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRepositoryTriggers", :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-repository-triggers-output))

(clojure.core/defn get-repository ([get-repository-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-repository-input get-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRepository", :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-repository-output))

(clojure.core/defn list-repositories ([] (list-repositories {})) ([list-repositories-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-repositories-input list-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRepositories", :http.request.spec/error-spec {"InvalidSortByException" :portkey.aws.codecommit.-2015-04-13/invalid-sort-by-exception, "InvalidOrderException" :portkey.aws.codecommit.-2015-04-13/invalid-order-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception}})))))
(clojure.spec.alpha/fdef list-repositories :args (clojure.spec.alpha/? :portkey.aws.codecommit.-2015-04-13/list-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-repositories-output))

(clojure.core/defn update-repository-name ([update-repository-name-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-repository-name-input update-repository-name-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-repository-name-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRepositoryName", :http.request.spec/error-spec {"RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryNameExistsException" :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception}})))))
(clojure.spec.alpha/fdef update-repository-name :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-repository-name-input) :ret clojure.core/true?)

(clojure.core/defn put-repository-triggers ([put-repository-triggers-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-repository-triggers-input put-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRepositoryTriggers", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/put-repository-triggers-output))

(clojure.core/defn get-file ([get-file-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-file-input get-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFile", :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit.-2015-04-13/file-too-large-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-file-output))

(clojure.core/defn batch-get-repositories ([batch-get-repositories-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-repositories-input batch-get-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetRepositories", :http.request.spec/error-spec {"RepositoryNamesRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-names-required-exception, "MaximumRepositoryNamesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-names-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef batch-get-repositories :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/batch-get-repositories-output))

(clojure.core/defn delete-file ([delete-file-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-file-input delete-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteFile", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit.-2015-04-13/invalid-email-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "NameLengthExceededException" :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-file-output))

(clojure.core/defn get-commit ([get-commit-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-commit-input get-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCommit", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-id-does-not-exist-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-commit-output))

(clojure.core/defn post-comment-for-compared-commit ([post-comment-for-compared-commit-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-post-comment-for-compared-commit-input post-comment-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PostCommentForComparedCommit", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-for-compared-commit-output))

(clojure.core/defn update-pull-request-description ([update-pull-request-description-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pull-request-description-input update-pull-request-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePullRequestDescription", :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-description-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-description-output))

(clojure.core/defn get-folder ([get-folder-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-folder-input get-folder-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-folder-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-folder-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFolder", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "FolderDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/folder-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-folder :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-folder-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-folder-output))

(clojure.core/defn update-comment ([update-comment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-comment-input update-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateComment", :http.request.spec/error-spec {"CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentNotCreatedByCallerException" :portkey.aws.codecommit.-2015-04-13/comment-not-created-by-caller-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef update-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-comment-output))

(clojure.core/defn delete-repository ([delete-repository-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-repository-input delete-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRepository", :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-repository-output))

(clojure.core/defn get-branch ([] (get-branch {})) ([get-branch-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-branch-input get-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBranch", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-branch :args (clojure.spec.alpha/? :portkey.aws.codecommit.-2015-04-13/get-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-branch-output))

(clojure.core/defn get-blob ([get-blob-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-blob-input get-blob-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-blob-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-blob-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBlob", :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit.-2015-04-13/file-too-large-exception, "InvalidBlobIdException" :portkey.aws.codecommit.-2015-04-13/invalid-blob-id-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "BlobIdDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/blob-id-does-not-exist-exception, "BlobIdRequiredException" :portkey.aws.codecommit.-2015-04-13/blob-id-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-blob :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-blob-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-blob-output))

(clojure.core/defn get-differences ([get-differences-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-differences-input get-differences-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-differences-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-differences-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDifferences", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-differences :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-differences-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-differences-output))

(clojure.core/defn delete-comment-content ([delete-comment-content-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-comment-content-input delete-comment-content-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCommentContent", :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef delete-comment-content :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-comment-content-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-comment-content-output))

(clojure.core/defn list-branches ([list-branches-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-branches-input list-branches-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-branches-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-branches-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBranches", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-branches :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/list-branches-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-branches-output))

(clojure.core/defn get-comments-for-pull-request ([get-comments-for-pull-request-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-comments-for-pull-request-input get-comments-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCommentsForPullRequest", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comments-for-pull-request-output))

(clojure.core/defn get-pull-request ([get-pull-request-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-pull-request-input get-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPullRequest", :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-pull-request-output))

(clojure.core/defn get-comment ([get-comment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-comment-input get-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComment", :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit.-2015-04-13/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef get-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comment-output))

(clojure.core/defn update-default-branch ([update-default-branch-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-default-branch-input update-default-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-default-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDefaultBranch", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-default-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-default-branch-input) :ret clojure.core/true?)

(clojure.core/defn post-comment-reply ([post-comment-reply-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-post-comment-reply-input post-comment-reply-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PostCommentReply", :http.request.spec/error-spec {"ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit.-2015-04-13/invalid-comment-id-exception}})))))
(clojure.spec.alpha/fdef post-comment-reply :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-reply-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-reply-output))

(clojure.core/defn get-merge-conflicts ([get-merge-conflicts-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-merge-conflicts-input get-merge-conflicts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMergeConflicts", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidSourceCommitSpecifierException" :portkey.aws.codecommit.-2015-04-13/invalid-source-commit-specifier-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "MergeOptionRequiredException" :portkey.aws.codecommit.-2015-04-13/merge-option-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "TipsDivergenceExceededException" :portkey.aws.codecommit.-2015-04-13/tips-divergence-exceeded-exception, "InvalidDestinationCommitSpecifierException" :portkey.aws.codecommit.-2015-04-13/invalid-destination-commit-specifier-exception, "InvalidMergeOptionException" :portkey.aws.codecommit.-2015-04-13/invalid-merge-option-exception, "InvalidCommitException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-merge-conflicts :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-merge-conflicts-output))

(clojure.core/defn create-pull-request ([create-pull-request-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-pull-request-input create-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/create-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePullRequest", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "MaximumOpenPullRequestsExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-open-pull-requests-exceeded-exception, "InvalidReferenceNameException" :portkey.aws.codecommit.-2015-04-13/invalid-reference-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "InvalidTitleException" :portkey.aws.codecommit.-2015-04-13/invalid-title-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "InvalidTargetException" :portkey.aws.codecommit.-2015-04-13/invalid-target-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ReferenceNameRequiredException" :portkey.aws.codecommit.-2015-04-13/reference-name-required-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception, "MultipleRepositoriesInPullRequestException" :portkey.aws.codecommit.-2015-04-13/multiple-repositories-in-pull-request-exception, "InvalidTargetsException" :portkey.aws.codecommit.-2015-04-13/invalid-targets-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-description-exception, "TargetsRequiredException" :portkey.aws.codecommit.-2015-04-13/targets-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "TitleRequiredException" :portkey.aws.codecommit.-2015-04-13/title-required-exception, "ReferenceTypeNotSupportedException" :portkey.aws.codecommit.-2015-04-13/reference-type-not-supported-exception, "TargetRequiredException" :portkey.aws.codecommit.-2015-04-13/target-required-exception, "SourceAndDestinationAreSameException" :portkey.aws.codecommit.-2015-04-13/source-and-destination-are-same-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/create-pull-request-output))

(clojure.core/defn merge-pull-request-by-fast-forward ([merge-pull-request-by-fast-forward-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-merge-pull-request-by-fast-forward-input merge-pull-request-by-fast-forward-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MergePullRequestByFastForward", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "TipOfSourceReferenceIsDifferentException" :portkey.aws.codecommit.-2015-04-13/tip-of-source-reference-is-different-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/reference-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "ManualMergeRequiredException" :portkey.aws.codecommit.-2015-04-13/manual-merge-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef merge-pull-request-by-fast-forward :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/merge-pull-request-by-fast-forward-output))

(clojure.core/defn create-branch ([create-branch-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-branch-input create-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBranch", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "BranchNameExistsException" :portkey.aws.codecommit.-2015-04-13/branch-name-exists-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-branch-input) :ret clojure.core/true?)

(clojure.core/defn list-pull-requests ([list-pull-requests-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-pull-requests-input list-pull-requests-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPullRequests", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidAuthorArnException" :portkey.aws.codecommit.-2015-04-13/invalid-author-arn-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "AuthorDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/author-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-pull-requests :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/list-pull-requests-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/list-pull-requests-output))

(clojure.core/defn describe-pull-request-events ([describe-pull-request-events-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-pull-request-events-input describe-pull-request-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePullRequestEvents", :http.request.spec/error-spec {"ActorDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/actor-does-not-exist-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestEventTypeException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-event-type-exception, "InvalidActorArnException" :portkey.aws.codecommit.-2015-04-13/invalid-actor-arn-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef describe-pull-request-events :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/describe-pull-request-events-output))

(clojure.core/defn post-comment-for-pull-request ([post-comment-for-pull-request-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-post-comment-for-pull-request-input post-comment-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PostCommentForPullRequest", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit.-2015-04-13/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit.-2015-04-13/client-request-token-required-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/path-does-not-exist-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit.-2015-04-13/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit.-2015-04-13/before-commit-id-and-after-commit-id-are-same-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "CommentContentRequiredException" :portkey.aws.codecommit.-2015-04-13/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit.-2015-04-13/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit.-2015-04-13/invalid-file-location-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit.-2015-04-13/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/post-comment-for-pull-request-output))

(clojure.core/defn put-file ([put-file-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-file-input put-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/put-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/put-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutFile", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidDeletionParameterException" :portkey.aws.codecommit.-2015-04-13/invalid-deletion-parameter-exception, "FileNameConflictsWithDirectoryNameException" :portkey.aws.codecommit.-2015-04-13/file-name-conflicts-with-directory-name-exception, "InvalidPathException" :portkey.aws.codecommit.-2015-04-13/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit.-2015-04-13/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/parent-commit-does-not-exist-exception, "InvalidFileModeException" :portkey.aws.codecommit.-2015-04-13/invalid-file-mode-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit.-2015-04-13/invalid-email-exception, "DirectoryNameConflictsWithFileNameException" :portkey.aws.codecommit.-2015-04-13/directory-name-conflicts-with-file-name-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit.-2015-04-13/parent-commit-id-outdated-exception, "FileContentSizeLimitExceededException" :portkey.aws.codecommit.-2015-04-13/file-content-size-limit-exceeded-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit.-2015-04-13/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit.-2015-04-13/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "SameFileContentException" :portkey.aws.codecommit.-2015-04-13/same-file-content-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "FileContentRequiredException" :portkey.aws.codecommit.-2015-04-13/file-content-required-exception, "NameLengthExceededException" :portkey.aws.codecommit.-2015-04-13/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/put-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/put-file-output))

(clojure.core/defn update-pull-request-status ([update-pull-request-status-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pull-request-status-input update-pull-request-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePullRequestStatus", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "InvalidPullRequestStatusUpdateException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-status-update-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "PullRequestStatusRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-status-required-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-status :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-status-output))

(clojure.core/defn test-repository-triggers ([test-repository-triggers-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-test-repository-triggers-input test-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestRepositoryTriggers", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit.-2015-04-13/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef test-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/test-repository-triggers-output))

(clojure.core/defn delete-branch ([delete-branch-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-branch-input delete-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/delete-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/delete-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBranch", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit.-2015-04-13/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "DefaultBranchCannotBeDeletedException" :portkey.aws.codecommit.-2015-04-13/default-branch-cannot-be-deleted-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit.-2015-04-13/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/delete-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/delete-branch-output))

(clojure.core/defn update-repository-description ([update-repository-description-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-repository-description-input update-repository-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-repository-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRepositoryDescription", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-repository-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-repository-description-input) :ret clojure.core/true?)

(clojure.core/defn update-pull-request-title ([update-pull-request-title-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-pull-request-title-input update-pull-request-title-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePullRequestTitle", :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit.-2015-04-13/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit.-2015-04-13/pull-request-id-required-exception, "TitleRequiredException" :portkey.aws.codecommit.-2015-04-13/title-required-exception, "InvalidTitleException" :portkey.aws.codecommit.-2015-04-13/invalid-title-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit.-2015-04-13/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-title :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/update-pull-request-title-output))

(clojure.core/defn create-repository ([create-repository-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-repository-input create-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/create-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/create-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRepository", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "RepositoryLimitExceededException" :portkey.aws.codecommit.-2015-04-13/repository-limit-exceeded-exception, "RepositoryNameExistsException" :portkey.aws.codecommit.-2015-04-13/repository-name-exists-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/create-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/create-repository-output))

(clojure.core/defn get-comments-for-compared-commit ([get-comments-for-compared-commit-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-comments-for-compared-commit-input get-comments-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit.-2015-04-13/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCommentsForComparedCommit", :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit.-2015-04-13/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit.-2015-04-13/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit.-2015-04-13/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit.-2015-04-13/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit.-2015-04-13/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit.-2015-04-13/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit.-2015-04-13/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit.-2015-04-13/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit.-2015-04-13/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit.-2015-04-13/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit.-2015-04-13/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit.-2015-04-13/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit.-2015-04-13/get-comments-for-compared-commit-output))
