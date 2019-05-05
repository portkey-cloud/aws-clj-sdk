(ns portkey.aws.codecommit (:require [portkey.aws]))

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
    :signature-version :v4},
   "fips"
   {:credential-scope {:service "codecommit", :region "ca-central-1"},
    :ssl-common-name "codecommit-fips.ca-central-1.amazonaws.com",
    :endpoint "https://codecommit-fips.ca-central-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-object-id)

(clojure.core/declare ser-email)

(clojure.core/declare ser-pull-request-id)

(clojure.core/declare ser-repository-trigger-event-list)

(clojure.core/declare ser-is-move)

(clojure.core/declare ser-delete-file-entries)

(clojure.core/declare ser-repository-trigger-event-enum)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-path)

(clojure.core/declare ser-branch-name)

(clojure.core/declare ser-title)

(clojure.core/declare ser-source-file-specifier)

(clojure.core/declare ser-file-content)

(clojure.core/declare ser-location)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-order-enum)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-put-file-entry)

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

(clojure.core/declare ser-put-file-entries)

(clojure.core/declare ser-pull-request-event-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-relative-file-version-enum)

(clojure.core/declare ser-set-file-mode-entries)

(clojure.core/declare ser-target-list)

(clojure.core/declare ser-target)

(clojure.core/declare ser-name)

(clojure.core/declare ser-set-file-mode-entry)

(clojure.core/declare ser-sort-by-enum)

(clojure.core/declare ser-file-mode-type-enum)

(clojure.core/declare ser-delete-file-entry)

(clojure.core/declare ser-commit-name)

(clojure.core/declare ser-reference-name)

(clojure.core/declare ser-repository-name-list)

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-object-id [input] #:http.request.field{:value input, :shape "ObjectId"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-pull-request-id [input] #:http.request.field{:value input, :shape "PullRequestId"})

(clojure.core/defn- ser-repository-trigger-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-trigger-event-enum coll) #:http.request.field{:shape "RepositoryTriggerEventEnum"}))) input), :shape "RepositoryTriggerEventList", :type "list"})

(clojure.core/defn- ser-is-move [input] #:http.request.field{:value input, :shape "IsMove"})

(clojure.core/defn- ser-delete-file-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-delete-file-entry coll) #:http.request.field{:shape "DeleteFileEntry"}))) input), :shape "DeleteFileEntries", :type "list"})

(clojure.core/defn- ser-repository-trigger-event-enum [input] #:http.request.field{:value (clojure.core/get {"all" "all", :all "all", "updateReference" "updateReference", :update-reference "updateReference", "createReference" "createReference", :create-reference "createReference", "deleteReference" "deleteReference", :delete-reference "deleteReference"} input), :shape "RepositoryTriggerEventEnum"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-branch-name [input] #:http.request.field{:value input, :shape "BranchName"})

(clojure.core/defn- ser-title [input] #:http.request.field{:value input, :shape "Title"})

(clojure.core/defn- ser-source-file-specifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "SourceFileSpecifier", :type "structure"} (clojure.core/contains? input :is-move) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-move (input :is-move)) #:http.request.field{:name "isMove", :shape "IsMove"}))))

(clojure.core/defn- ser-file-content [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "FileContent"})

(clojure.core/defn- ser-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Location", :type "structure"} (clojure.core/contains? input :file-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :file-path)) #:http.request.field{:name "filePath", :shape "Path"})) (clojure.core/contains? input :file-position) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-position (input :file-position)) #:http.request.field{:name "filePosition", :shape "Position"})) (clojure.core/contains? input :relative-file-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-relative-file-version-enum (input :relative-file-version)) #:http.request.field{:name "relativeFileVersion", :shape "RelativeFileVersionEnum"}))))

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-order-enum [input] #:http.request.field{:value (clojure.core/get {"ascending" "ascending", :ascending "ascending", "descending" "descending", :descending "descending"} input), :shape "OrderEnum"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-put-file-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "PutFileEntry", :type "structure"} (clojure.core/contains? input :file-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-mode-type-enum (input :file-mode)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})) (clojure.core/contains? input :file-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-content (input :file-content)) #:http.request.field{:name "fileContent", :shape "FileContent"})) (clojure.core/contains? input :source-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-file-specifier (input :source-file)) #:http.request.field{:name "sourceFile", :shape "SourceFileSpecifier"}))))

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

(clojure.core/defn- ser-put-file-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-put-file-entry coll) #:http.request.field{:shape "PutFileEntry"}))) input), :shape "PutFileEntries", :type "list"})

(clojure.core/defn- ser-pull-request-event-type [input] #:http.request.field{:value (clojure.core/get {"PULL_REQUEST_CREATED" "PULL_REQUEST_CREATED", :pull-request-created "PULL_REQUEST_CREATED", "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_STATUS_CHANGED", :pull-request-status-changed "PULL_REQUEST_STATUS_CHANGED", "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", :pull-request-source-reference-updated "PULL_REQUEST_SOURCE_REFERENCE_UPDATED", "PULL_REQUEST_MERGE_STATE_CHANGED" "PULL_REQUEST_MERGE_STATE_CHANGED", :pull-request-merge-state-changed "PULL_REQUEST_MERGE_STATE_CHANGED"} input), :shape "PullRequestEventType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-relative-file-version-enum [input] #:http.request.field{:value (clojure.core/get {"BEFORE" "BEFORE", :before "BEFORE", "AFTER" "AFTER", :after "AFTER"} input), :shape "RelativeFileVersionEnum"})

(clojure.core/defn- ser-set-file-mode-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-set-file-mode-entry coll) #:http.request.field{:shape "SetFileModeEntry"}))) input), :shape "SetFileModeEntries", :type "list"})

(clojure.core/defn- ser-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "TargetList", :type "list"})

(clojure.core/defn- ser-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-repository-name (:repository-name input)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-reference-name (:source-reference input)) #:http.request.field{:name "sourceReference", :shape "ReferenceName"})], :shape "Target", :type "structure"} (clojure.core/contains? input :destination-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reference-name (input :destination-reference)) #:http.request.field{:name "destinationReference", :shape "ReferenceName"}))))

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-set-file-mode-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"}) (clojure.core/into (ser-file-mode-type-enum (:file-mode input)) #:http.request.field{:name "fileMode", :shape "FileModeTypeEnum"})], :shape "SetFileModeEntry", :type "structure"}))

(clojure.core/defn- ser-sort-by-enum [input] #:http.request.field{:value (clojure.core/get {"repositoryName" "repositoryName", :repository-name "repositoryName", "lastModifiedDate" "lastModifiedDate", :last-modified-date "lastModifiedDate"} input), :shape "SortByEnum"})

(clojure.core/defn- ser-file-mode-type-enum [input] #:http.request.field{:value (clojure.core/get {"EXECUTABLE" "EXECUTABLE", :executable "EXECUTABLE", "NORMAL" "NORMAL", :normal "NORMAL", "SYMLINK" "SYMLINK", :symlink "SYMLINK"} input), :shape "FileModeTypeEnum"})

(clojure.core/defn- ser-delete-file-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-path (:file-path input)) #:http.request.field{:name "filePath", :shape "Path"})], :shape "DeleteFileEntry", :type "structure"}))

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

(clojure.core/defn- req-create-commit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-branch-name (input :branch-name)) #:http.request.field{:name "branchName", :shape "BranchName"})]} (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email (input :email)) #:http.request.field{:name "email", :shape "Email"})) (clojure.core/contains? input :delete-files) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-file-entries (input :delete-files)) #:http.request.field{:name "deleteFiles", :shape "DeleteFileEntries"})) (clojure.core/contains? input :set-file-modes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-file-mode-entries (input :set-file-modes)) #:http.request.field{:name "setFileModes", :shape "SetFileModeEntries"})) (clojure.core/contains? input :commit-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :commit-message)) #:http.request.field{:name "commitMessage", :shape "Message"})) (clojure.core/contains? input :keep-empty-folders) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keep-empty-folders (input :keep-empty-folders)) #:http.request.field{:name "keepEmptyFolders", :shape "KeepEmptyFolders"})) (clojure.core/contains? input :put-files) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-put-file-entries (input :put-files)) #:http.request.field{:name "putFiles", :shape "PutFileEntries"})) (clojure.core/contains? input :author-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :author-name)) #:http.request.field{:name "authorName", :shape "Name"})) (clojure.core/contains? input :parent-commit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :parent-commit-id)) #:http.request.field{:name "parentCommitId", :shape "CommitId"}))))

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

(clojure.core/declare deser-is-comment-deleted)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-object-id)

(clojure.core/declare deser-pull-request-created-event-metadata)

(clojure.core/declare deser-email)

(clojure.core/declare deser-pull-request-id)

(clojure.core/declare deser-repository-trigger-event-list)

(clojure.core/declare deser-object-size)

(clojure.core/declare deser-is-merged)

(clojure.core/declare deser-comment)

(clojure.core/declare deser-merge-metadata)

(clojure.core/declare deser-files-metadata)

(clojure.core/declare deser-sub-module-list)

(clojure.core/declare deser-pull-request-target)

(clojure.core/declare deser-repository-metadata-list)

(clojure.core/declare deser-last-modified-date)

(clojure.core/declare deser-comments)

(clojure.core/declare deser-repository-trigger-event-enum)

(clojure.core/declare deser-repository-triggers-configuration-id)

(clojure.core/declare deser-comments-for-pull-request-data)

(clojure.core/declare deser-repository-name)

(clojure.core/declare deser-path)

(clojure.core/declare deser-repository-id)

(clojure.core/declare deser-folder)

(clojure.core/declare deser-symbolic-link)

(clojure.core/declare deser-folder-list)

(clojure.core/declare deser-branch-name)

(clojure.core/declare deser-title)

(clojure.core/declare deserblob)

(clojure.core/declare deser-parent-list)

(clojure.core/declare deser-difference-list)

(clojure.core/declare deser-repository-trigger-execution-failure)

(clojure.core/declare deser-branch-info)

(clojure.core/declare deser-file)

(clojure.core/declare deser-pull-request-event)

(clojure.core/declare deser-pull-request)

(clojure.core/declare deser-repository-trigger-name-list)

(clojure.core/declare deser-file-content)

(clojure.core/declare deser-location)

(clojure.core/declare deser-difference)

(clojure.core/declare deser-pull-request-source-reference-updated-event-metadata)

(clojure.core/declare deser-mode)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-file-metadata)

(clojure.core/declare deser-comments-for-compared-commit)

(clojure.core/declare deser-date)

(clojure.core/declare deser-pull-request-merged-state-changed-event-metadata)

(clojure.core/declare deser-repository-triggers-list)

(clojure.core/declare deser-blob-metadata)

(clojure.core/declare deser-repository-trigger-execution-failure-message)

(clojure.core/declare deser-clone-url-http)

(clojure.core/declare deser-repository-trigger-name)

(clojure.core/declare deser-commit-id)

(clojure.core/declare deser-commit)

(clojure.core/declare deser-comments-for-pull-request)

(clojure.core/declare deser-sub-module)

(clojure.core/declare deser-comment-id)

(clojure.core/declare deser-repository-trigger-custom-data)

(clojure.core/declare deser-description)

(clojure.core/declare deser-repository-name-id-pair-list)

(clojure.core/declare deser-pull-request-id-list)

(clojure.core/declare deser-change-type-enum)

(clojure.core/declare deser-message)

(clojure.core/declare deser-pull-request-event-list)

(clojure.core/declare deser-event-date)

(clojure.core/declare deser-clone-url-ssh)

(clojure.core/declare deser-branch-name-list)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-position)

(clojure.core/declare deser-content)

(clojure.core/declare deser-repository-description)

(clojure.core/declare deser-repository-trigger)

(clojure.core/declare deser-repository-name-id-pair)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-repository-not-found-list)

(clojure.core/declare deser-creation-date)

(clojure.core/declare deser-symbolic-link-list)

(clojure.core/declare deser-pull-request-status-enum)

(clojure.core/declare deser-pull-request-event-type)

(clojure.core/declare deser-relative-file-version-enum)

(clojure.core/declare deser-repository-metadata)

(clojure.core/declare deser-name)

(clojure.core/declare deser-repository-trigger-execution-failure-list)

(clojure.core/declare deser-pull-request-target-list)

(clojure.core/declare deser-file-mode-type-enum)

(clojure.core/declare deser-file-list)

(clojure.core/declare deser-reference-name)

(clojure.core/declare deser-pull-request-status-changed-event-metadata)

(clojure.core/declare deser-is-mergeable)

(clojure.core/declare deser-comments-for-compared-commit-data)

(clojure.core/declare deser-user-info)

(clojure.core/declare deser-additional-data)

(clojure.core/defn- deser-is-comment-deleted [input] input)

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-object-id [input] input)

(clojure.core/defn- deser-pull-request-created-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "sourceCommitId") (clojure.core/assoc :source-commit-id (deser-commit-id (input "sourceCommitId"))) (clojure.core/contains? input "destinationCommitId") (clojure.core/assoc :destination-commit-id (deser-commit-id (input "destinationCommitId"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase")))))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-pull-request-id [input] input)

(clojure.core/defn- deser-repository-trigger-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-event-enum coll))) input))

(clojure.core/defn- deser-object-size [input] input)

(clojure.core/defn- deser-is-merged [input] input)

(clojure.core/defn- deser-comment [input] (clojure.core/cond-> {} (clojure.core/contains? input "commentId") (clojure.core/assoc :comment-id (deser-comment-id (input "commentId"))) (clojure.core/contains? input "content") (clojure.core/assoc :content (deser-content (input "content"))) (clojure.core/contains? input "inReplyTo") (clojure.core/assoc :in-reply-to (deser-comment-id (input "inReplyTo"))) (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "lastModifiedDate") (clojure.core/assoc :last-modified-date (deser-last-modified-date (input "lastModifiedDate"))) (clojure.core/contains? input "authorArn") (clojure.core/assoc :author-arn (deser-arn (input "authorArn"))) (clojure.core/contains? input "deleted") (clojure.core/assoc :deleted (deser-is-comment-deleted (input "deleted"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken")))))

(clojure.core/defn- deser-merge-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "isMerged") (clojure.core/assoc :is-merged (deser-is-merged (input "isMerged"))) (clojure.core/contains? input "mergedBy") (clojure.core/assoc :merged-by (deser-arn (input "mergedBy")))))

(clojure.core/defn- deser-files-metadata [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-metadata coll))) input))

(clojure.core/defn- deser-sub-module-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sub-module coll))) input))

(clojure.core/defn- deser-pull-request-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "sourceReference") (clojure.core/assoc :source-reference (deser-reference-name (input "sourceReference"))) (clojure.core/contains? input "destinationReference") (clojure.core/assoc :destination-reference (deser-reference-name (input "destinationReference"))) (clojure.core/contains? input "destinationCommit") (clojure.core/assoc :destination-commit (deser-commit-id (input "destinationCommit"))) (clojure.core/contains? input "sourceCommit") (clojure.core/assoc :source-commit (deser-commit-id (input "sourceCommit"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase"))) (clojure.core/contains? input "mergeMetadata") (clojure.core/assoc :merge-metadata (deser-merge-metadata (input "mergeMetadata")))))

(clojure.core/defn- deser-repository-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-metadata coll))) input))

(clojure.core/defn- deser-last-modified-date [input] input)

(clojure.core/defn- deser-comments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comment coll))) input))

(clojure.core/defn- deser-repository-trigger-event-enum [input] (clojure.core/get {"all" :all, "updateReference" :update-reference, "createReference" :create-reference, "deleteReference" :delete-reference} input))

(clojure.core/defn- deser-repository-triggers-configuration-id [input] input)

(clojure.core/defn- deser-comments-for-pull-request-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comments-for-pull-request coll))) input))

(clojure.core/defn- deser-repository-name [input] input)

(clojure.core/defn- deser-path [input] input)

(clojure.core/defn- deser-repository-id [input] input)

(clojure.core/defn- deser-folder [input] (clojure.core/cond-> {} (clojure.core/contains? input "treeId") (clojure.core/assoc :tree-id (deser-object-id (input "treeId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath")))))

(clojure.core/defn- deser-symbolic-link [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-folder-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-folder coll))) input))

(clojure.core/defn- deser-branch-name [input] input)

(clojure.core/defn- deser-title [input] input)

(clojure.core/defn- deserblob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-parent-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-id coll))) input))

(clojure.core/defn- deser-difference-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-difference coll))) input))

(clojure.core/defn- deser-repository-trigger-execution-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "trigger") (clojure.core/assoc :trigger (deser-repository-trigger-name (input "trigger"))) (clojure.core/contains? input "failureMessage") (clojure.core/assoc :failure-message (deser-repository-trigger-execution-failure-message (input "failureMessage")))))

(clojure.core/defn- deser-branch-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "branchName") (clojure.core/assoc :branch-name (deser-branch-name (input "branchName"))) (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-commit-id (input "commitId")))))

(clojure.core/defn- deser-file [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-pull-request-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "eventDate") (clojure.core/assoc :event-date (deser-event-date (input "eventDate"))) (clojure.core/contains? input "pullRequestEventType") (clojure.core/assoc :pull-request-event-type (deser-pull-request-event-type (input "pullRequestEventType"))) (clojure.core/contains? input "actorArn") (clojure.core/assoc :actor-arn (deser-arn (input "actorArn"))) (clojure.core/contains? input "pullRequestCreatedEventMetadata") (clojure.core/assoc :pull-request-created-event-metadata (deser-pull-request-created-event-metadata (input "pullRequestCreatedEventMetadata"))) (clojure.core/contains? input "pullRequestStatusChangedEventMetadata") (clojure.core/assoc :pull-request-status-changed-event-metadata (deser-pull-request-status-changed-event-metadata (input "pullRequestStatusChangedEventMetadata"))) (clojure.core/contains? input "pullRequestSourceReferenceUpdatedEventMetadata") (clojure.core/assoc :pull-request-source-reference-updated-event-metadata (deser-pull-request-source-reference-updated-event-metadata (input "pullRequestSourceReferenceUpdatedEventMetadata"))) (clojure.core/contains? input "pullRequestMergedStateChangedEventMetadata") (clojure.core/assoc :pull-request-merged-state-changed-event-metadata (deser-pull-request-merged-state-changed-event-metadata (input "pullRequestMergedStateChangedEventMetadata")))))

(clojure.core/defn- deser-pull-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "lastActivityDate") (clojure.core/assoc :last-activity-date (deser-last-modified-date (input "lastActivityDate"))) (clojure.core/contains? input "pullRequestStatus") (clojure.core/assoc :pull-request-status (deser-pull-request-status-enum (input "pullRequestStatus"))) (clojure.core/contains? input "pullRequestTargets") (clojure.core/assoc :pull-request-targets (deser-pull-request-target-list (input "pullRequestTargets"))) (clojure.core/contains? input "authorArn") (clojure.core/assoc :author-arn (deser-arn (input "authorArn"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-title (input "title"))) (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description")))))

(clojure.core/defn- deser-repository-trigger-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-name coll))) input))

(clojure.core/defn- deser-file-content [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "filePath") (clojure.core/assoc :file-path (deser-path (input "filePath"))) (clojure.core/contains? input "filePosition") (clojure.core/assoc :file-position (deser-position (input "filePosition"))) (clojure.core/contains? input "relativeFileVersion") (clojure.core/assoc :relative-file-version (deser-relative-file-version-enum (input "relativeFileVersion")))))

(clojure.core/defn- deser-difference [input] (clojure.core/cond-> {} (clojure.core/contains? input "beforeBlob") (clojure.core/assoc :before-blob (deser-blob-metadata (input "beforeBlob"))) (clojure.core/contains? input "afterBlob") (clojure.core/assoc :after-blob (deser-blob-metadata (input "afterBlob"))) (clojure.core/contains? input "changeType") (clojure.core/assoc :change-type (deser-change-type-enum (input "changeType")))))

(clojure.core/defn- deser-pull-request-source-reference-updated-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "mergeBase") (clojure.core/assoc :merge-base (deser-commit-id (input "mergeBase")))))

(clojure.core/defn- deser-mode [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-file-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "fileMode") (clojure.core/assoc :file-mode (deser-file-mode-type-enum (input "fileMode")))))

(clojure.core/defn- deser-comments-for-compared-commit [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (input "beforeBlobId"))) (clojure.core/contains? input "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (input "afterBlobId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location (input "location"))) (clojure.core/contains? input "comments") (clojure.core/assoc :comments (deser-comments (input "comments")))))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-pull-request-merged-state-changed-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "destinationReference") (clojure.core/assoc :destination-reference (deser-reference-name (input "destinationReference"))) (clojure.core/contains? input "mergeMetadata") (clojure.core/assoc :merge-metadata (deser-merge-metadata (input "mergeMetadata")))))

(clojure.core/defn- deser-repository-triggers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger coll))) input))

(clojure.core/defn- deser-blob-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "blobId") (clojure.core/assoc :blob-id (deser-object-id (input "blobId"))) (clojure.core/contains? input "path") (clojure.core/assoc :path (deser-path (input "path"))) (clojure.core/contains? input "mode") (clojure.core/assoc :mode (deser-mode (input "mode")))))

(clojure.core/defn- deser-repository-trigger-execution-failure-message [input] input)

(clojure.core/defn- deser-clone-url-http [input] input)

(clojure.core/defn- deser-repository-trigger-name [input] input)

(clojure.core/defn- deser-commit-id [input] input)

(clojure.core/defn- deser-commit [input] (clojure.core/cond-> {} (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-object-id (input "commitId"))) (clojure.core/contains? input "treeId") (clojure.core/assoc :tree-id (deser-object-id (input "treeId"))) (clojure.core/contains? input "parents") (clojure.core/assoc :parents (deser-parent-list (input "parents"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message"))) (clojure.core/contains? input "author") (clojure.core/assoc :author (deser-user-info (input "author"))) (clojure.core/contains? input "committer") (clojure.core/assoc :committer (deser-user-info (input "committer"))) (clojure.core/contains? input "additionalData") (clojure.core/assoc :additional-data (deser-additional-data (input "additionalData")))))

(clojure.core/defn- deser-comments-for-pull-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (input "pullRequestId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (input "beforeCommitId"))) (clojure.core/contains? input "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (input "afterCommitId"))) (clojure.core/contains? input "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (input "beforeBlobId"))) (clojure.core/contains? input "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (input "afterBlobId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location (input "location"))) (clojure.core/contains? input "comments") (clojure.core/assoc :comments (deser-comments (input "comments")))))

(clojure.core/defn- deser-sub-module [input] (clojure.core/cond-> {} (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-object-id (input "commitId"))) (clojure.core/contains? input "absolutePath") (clojure.core/assoc :absolute-path (deser-path (input "absolutePath"))) (clojure.core/contains? input "relativePath") (clojure.core/assoc :relative-path (deser-path (input "relativePath")))))

(clojure.core/defn- deser-comment-id [input] input)

(clojure.core/defn- deser-repository-trigger-custom-data [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-repository-name-id-pair-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-name-id-pair coll))) input))

(clojure.core/defn- deser-pull-request-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-id coll))) input))

(clojure.core/defn- deser-change-type-enum [input] (clojure.core/get {"A" :a, "M" :m, "D" :d} input))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-pull-request-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-event coll))) input))

(clojure.core/defn- deser-event-date [input] input)

(clojure.core/defn- deser-clone-url-ssh [input] input)

(clojure.core/defn- deser-branch-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-branch-name coll))) input))

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-position [input] input)

(clojure.core/defn- deser-content [input] input)

(clojure.core/defn- deser-repository-description [input] input)

(clojure.core/defn- deser-repository-trigger [input] (clojure.core/cond-> {:name (deser-repository-trigger-name (input "name")), :destination-arn (deser-arn (input "destinationArn")), :events (deser-repository-trigger-event-list (input "events"))} (clojure.core/contains? input "customData") (clojure.core/assoc :custom-data (deser-repository-trigger-custom-data (input "customData"))) (clojure.core/contains? input "branches") (clojure.core/assoc :branches (deser-branch-name-list (input "branches")))))

(clojure.core/defn- deser-repository-name-id-pair [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (input "repositoryId")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-repository-not-found-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-name coll))) input))

(clojure.core/defn- deser-creation-date [input] input)

(clojure.core/defn- deser-symbolic-link-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-symbolic-link coll))) input))

(clojure.core/defn- deser-pull-request-status-enum [input] (clojure.core/get {"OPEN" :open, "CLOSED" :closed} input))

(clojure.core/defn- deser-pull-request-event-type [input] (clojure.core/get {"PULL_REQUEST_CREATED" :pull-request-created, "PULL_REQUEST_STATUS_CHANGED" :pull-request-status-changed, "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" :pull-request-source-reference-updated, "PULL_REQUEST_MERGE_STATE_CHANGED" :pull-request-merge-state-changed} input))

(clojure.core/defn- deser-relative-file-version-enum [input] (clojure.core/get {"BEFORE" :before, "AFTER" :after} input))

(clojure.core/defn- deser-repository-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "creationDate") (clojure.core/assoc :creation-date (deser-creation-date (input "creationDate"))) (clojure.core/contains? input "cloneUrlSsh") (clojure.core/assoc :clone-url-ssh (deser-clone-url-ssh (input "cloneUrlSsh"))) (clojure.core/contains? input "accountId") (clojure.core/assoc :account-id (deser-account-id (input "accountId"))) (clojure.core/contains? input "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (input "repositoryId"))) (clojure.core/contains? input "defaultBranch") (clojure.core/assoc :default-branch (deser-branch-name (input "defaultBranch"))) (clojure.core/contains? input "repositoryDescription") (clojure.core/assoc :repository-description (deser-repository-description (input "repositoryDescription"))) (clojure.core/contains? input "lastModifiedDate") (clojure.core/assoc :last-modified-date (deser-last-modified-date (input "lastModifiedDate"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "cloneUrlHttp") (clojure.core/assoc :clone-url-http (deser-clone-url-http (input "cloneUrlHttp")))))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-repository-trigger-execution-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository-trigger-execution-failure coll))) input))

(clojure.core/defn- deser-pull-request-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-pull-request-target coll))) input))

(clojure.core/defn- deser-file-mode-type-enum [input] (clojure.core/get {"EXECUTABLE" :executable, "NORMAL" :normal, "SYMLINK" :symlink} input))

(clojure.core/defn- deser-file-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file coll))) input))

(clojure.core/defn- deser-reference-name [input] input)

(clojure.core/defn- deser-pull-request-status-changed-event-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "pullRequestStatus") (clojure.core/assoc :pull-request-status (deser-pull-request-status-enum (input "pullRequestStatus")))))

(clojure.core/defn- deser-is-mergeable [input] input)

(clojure.core/defn- deser-comments-for-compared-commit-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-comments-for-compared-commit coll))) input))

(clojure.core/defn- deser-user-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "email") (clojure.core/assoc :email (deser-email (input "email"))) (clojure.core/contains? input "date") (clojure.core/assoc :date (deser-date (input "date")))))

(clojure.core/defn- deser-additional-data [input] input)

(clojure.core/defn- response-get-file-output ([input] (response-get-file-output nil input)) ([resultWrapper389159 input] (clojure.core/let [rawinput389158 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389160 {"commitId" (rawinput389158 "commitId"), "blobId" (rawinput389158 "blobId"), "filePath" (rawinput389158 "filePath"), "fileMode" (rawinput389158 "fileMode"), "fileSize" (rawinput389158 "fileSize"), "fileContent" (rawinput389158 "fileContent")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar389160 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar389160 ["blobId"])), :file-path (deser-path (clojure.core/get-in letvar389160 ["filePath"])), :file-mode (deser-file-mode-type-enum (clojure.core/get-in letvar389160 ["fileMode"])), :file-size (deser-object-size (clojure.core/get-in letvar389160 ["fileSize"])), :file-content (deser-file-content (clojure.core/get-in letvar389160 ["fileContent"]))}))))

(clojure.core/defn- response-file-too-large-exception ([input] (response-file-too-large-exception nil input)) ([resultWrapper389162 input] (clojure.core/let [rawinput389161 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389163 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-blob-id-exception ([input] (response-invalid-blob-id-exception nil input)) ([resultWrapper389165 input] (clojure.core/let [rawinput389164 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389166 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-actor-does-not-exist-exception ([input] (response-actor-does-not-exist-exception nil input)) ([resultWrapper389168 input] (clojure.core/let [rawinput389167 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389169 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sort-by-exception ([input] (response-invalid-sort-by-exception nil input)) ([resultWrapper389171 input] (clojure.core/let [rawinput389170 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389172 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-commit-output ([input] (response-get-commit-output nil input)) ([resultWrapper389174 input] (clojure.core/let [rawinput389173 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389175 {"commit" (rawinput389173 "commit")}] (clojure.core/cond-> {:commit (deser-commit (clojure.core/get-in letvar389175 ["commit"]))}))))

(clojure.core/defn- response-comment-does-not-exist-exception ([input] (response-comment-does-not-exist-exception nil input)) ([resultWrapper389177 input] (clojure.core/let [rawinput389176 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389178 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-not-found-exception ([input] (response-encryption-key-not-found-exception nil input)) ([resultWrapper389180 input] (clojure.core/let [rawinput389179 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389181 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-file-position-exception ([input] (response-invalid-file-position-exception nil input)) ([resultWrapper389183 input] (clojure.core/let [rawinput389182 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389184 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-pull-request-status-output ([input] (response-update-pull-request-status-output nil input)) ([resultWrapper389186 input] (clojure.core/let [rawinput389185 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389187 {"pullRequest" (rawinput389185 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar389187 ["pullRequest"]))}))))

(clojure.core/defn- response-maximum-repository-triggers-exceeded-exception ([input] (response-maximum-repository-triggers-exceeded-exception nil input)) ([resultWrapper389189 input] (clojure.core/let [rawinput389188 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389190 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deletion-parameter-exception ([input] (response-invalid-deletion-parameter-exception nil input)) ([resultWrapper389192 input] (clojure.core/let [rawinput389191 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389193 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-does-not-exist-exception ([input] (response-file-does-not-exist-exception nil input)) ([resultWrapper389195 input] (clojure.core/let [rawinput389194 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389196 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-client-request-token-required-exception ([input] (response-client-request-token-required-exception nil input)) ([resultWrapper389198 input] (clojure.core/let [rawinput389197 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389199 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-blob-output ([input] (response-get-blob-output nil input)) ([resultWrapper389201 input] (clojure.core/let [rawinput389200 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389202 {"content" (rawinput389200 "content")}] (clojure.core/cond-> {:content (deserblob (clojure.core/get-in letvar389202 ["content"]))}))))

(clojure.core/defn- response-maximum-open-pull-requests-exceeded-exception ([input] (response-maximum-open-pull-requests-exceeded-exception nil input)) ([resultWrapper389204 input] (clojure.core/let [rawinput389203 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389205 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-reference-name-exception ([input] (response-invalid-reference-name-exception nil input)) ([resultWrapper389207 input] (clojure.core/let [rawinput389206 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389208 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-name-conflicts-with-directory-name-exception ([input] (response-file-name-conflicts-with-directory-name-exception nil input)) ([resultWrapper389210 input] (clojure.core/let [rawinput389209 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389211 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-entry-required-exception ([input] (response-file-entry-required-exception nil input)) ([resultWrapper389213 input] (clojure.core/let [rawinput389212 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389214 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-status-exception ([input] (response-invalid-pull-request-status-exception nil input)) ([resultWrapper389216 input] (clojure.core/let [rawinput389215 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389217 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-id-exception ([input] (response-invalid-pull-request-id-exception nil input)) ([resultWrapper389219 input] (clojure.core/let [rawinput389218 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389220 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-description-exception ([input] (response-invalid-repository-description-exception nil input)) ([resultWrapper389222 input] (clojure.core/let [rawinput389221 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389223 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-already-closed-exception ([input] (response-pull-request-already-closed-exception nil input)) ([resultWrapper389225 input] (clojure.core/let [rawinput389224 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389226 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-name-exception ([input] (response-invalid-repository-trigger-name-exception nil input)) ([resultWrapper389228 input] (clojure.core/let [rawinput389227 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389229 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-path-exception ([input] (response-invalid-path-exception nil input)) ([resultWrapper389231 input] (clojure.core/let [rawinput389230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389232 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-integrity-checks-failed-exception ([input] (response-encryption-integrity-checks-failed-exception nil input)) ([resultWrapper389234 input] (clojure.core/let [rawinput389233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389235 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-message-length-exceeded-exception ([input] (response-commit-message-length-exceeded-exception nil input)) ([resultWrapper389237 input] (clojure.core/let [rawinput389236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389238 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-title-exception ([input] (response-invalid-title-exception nil input)) ([resultWrapper389240 input] (clojure.core/let [rawinput389239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389241 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-access-denied-exception ([input] (response-encryption-key-access-denied-exception nil input)) ([resultWrapper389243 input] (clojure.core/let [rawinput389242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389244 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-client-request-token-exception ([input] (response-invalid-client-request-token-exception nil input)) ([resultWrapper389246 input] (clojure.core/let [rawinput389245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389247 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-required-exception ([input] (response-branch-name-required-exception nil input)) ([resultWrapper389249 input] (clojure.core/let [rawinput389248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389250 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-comment-output ([input] (response-get-comment-output nil input)) ([resultWrapper389252 input] (clojure.core/let [rawinput389251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389253 {"comment" (rawinput389251 "comment")}] (clojure.core/cond-> {} (letvar389253 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389253 ["comment"])))))))

(clojure.core/defn- response-path-does-not-exist-exception ([input] (response-path-does-not-exist-exception nil input)) ([resultWrapper389255 input] (clojure.core/let [rawinput389254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389256 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-source-commit-specifier-exception ([input] (response-invalid-source-commit-specifier-exception nil input)) ([resultWrapper389258 input] (clojure.core/let [rawinput389257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389259 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-folder-does-not-exist-exception ([input] (response-folder-does-not-exist-exception nil input)) ([resultWrapper389261 input] (clojure.core/let [rawinput389260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389262 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-branch-name-list-required-exception ([input] (response-repository-trigger-branch-name-list-required-exception nil input)) ([resultWrapper389264 input] (clojure.core/let [rawinput389263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389265 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-no-change-exception ([input] (response-no-change-exception nil input)) ([resultWrapper389267 input] (clojure.core/let [rawinput389266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389268 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-does-not-exist-exception ([input] (response-branch-does-not-exist-exception nil input)) ([resultWrapper389270 input] (clojure.core/let [rawinput389269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389271 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-exception ([input] (response-invalid-target-exception nil input)) ([resultWrapper389273 input] (clojure.core/let [rawinput389272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389274 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-parent-commit-does-not-exist-exception ([input] (response-parent-commit-does-not-exist-exception nil input)) ([resultWrapper389276 input] (clojure.core/let [rawinput389275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389277 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-source-file-or-content-required-exception ([input] (response-source-file-or-content-required-exception nil input)) ([resultWrapper389279 input] (clojure.core/let [rawinput389278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389280 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-folder-content-size-limit-exceeded-exception ([input] (response-folder-content-size-limit-exceeded-exception nil input)) ([resultWrapper389282 input] (clojure.core/let [rawinput389281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389283 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-branch-output ([input] (response-delete-branch-output nil input)) ([resultWrapper389285 input] (clojure.core/let [rawinput389284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389286 {"deletedBranch" (rawinput389284 "deletedBranch")}] (clojure.core/cond-> {} (letvar389286 "deletedBranch") (clojure.core/assoc :deleted-branch (deser-branch-info (clojure.core/get-in letvar389286 ["deletedBranch"])))))))

(clojure.core/defn- response-update-pull-request-title-output ([input] (response-update-pull-request-title-output nil input)) ([resultWrapper389288 input] (clojure.core/let [rawinput389287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389289 {"pullRequest" (rawinput389287 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar389289 ["pullRequest"]))}))))

(clojure.core/defn- response-invalid-file-mode-exception ([input] (response-invalid-file-mode-exception nil input)) ([resultWrapper389291 input] (clojure.core/let [rawinput389290 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389292 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-file-output ([input] (response-delete-file-output nil input)) ([resultWrapper389294 input] (clojure.core/let [rawinput389293 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389295 {"commitId" (rawinput389293 "commitId"), "blobId" (rawinput389293 "blobId"), "treeId" (rawinput389293 "treeId"), "filePath" (rawinput389293 "filePath")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar389295 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar389295 ["blobId"])), :tree-id (deser-object-id (clojure.core/get-in letvar389295 ["treeId"])), :file-path (deser-path (clojure.core/get-in letvar389295 ["filePath"]))}))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper389297 input] (clojure.core/let [rawinput389296 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389298 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-id-required-exception ([input] (response-pull-request-id-required-exception nil input)) ([resultWrapper389300 input] (clojure.core/let [rawinput389299 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389301 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-repository-triggers-output ([input] (response-put-repository-triggers-output nil input)) ([resultWrapper389303 input] (clojure.core/let [rawinput389302 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389304 {"configurationId" (rawinput389302 "configurationId")}] (clojure.core/cond-> {} (letvar389304 "configurationId") (clojure.core/assoc :configuration-id (deser-repository-triggers-configuration-id (clojure.core/get-in letvar389304 ["configurationId"])))))))

(clojure.core/defn- response-invalid-continuation-token-exception ([input] (response-invalid-continuation-token-exception nil input)) ([resultWrapper389306 input] (clojure.core/let [rawinput389305 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389307 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-unavailable-exception ([input] (response-encryption-key-unavailable-exception nil input)) ([resultWrapper389309 input] (clojure.core/let [rawinput389308 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389310 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-parent-commit-id-required-exception ([input] (response-parent-commit-id-required-exception nil input)) ([resultWrapper389312 input] (clojure.core/let [rawinput389311 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389313 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-branches-output ([input] (response-list-branches-output nil input)) ([resultWrapper389315 input] (clojure.core/let [rawinput389314 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389316 {"branches" (rawinput389314 "branches"), "nextToken" (rawinput389314 "nextToken")}] (clojure.core/cond-> {} (letvar389316 "branches") (clojure.core/assoc :branches (deser-branch-name-list (clojure.core/get-in letvar389316 ["branches"]))) (letvar389316 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389316 ["nextToken"])))))))

(clojure.core/defn- response-reference-name-required-exception ([input] (response-reference-name-required-exception nil input)) ([resultWrapper389318 input] (clojure.core/let [rawinput389317 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389319 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-default-branch-cannot-be-deleted-exception ([input] (response-default-branch-cannot-be-deleted-exception nil input)) ([resultWrapper389321 input] (clojure.core/let [rawinput389320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389322 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-idempotency-parameter-mismatch-exception ([input] (response-idempotency-parameter-mismatch-exception nil input)) ([resultWrapper389324 input] (clojure.core/let [rawinput389323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389325 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-file-output ([input] (response-put-file-output nil input)) ([resultWrapper389327 input] (clojure.core/let [rawinput389326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389328 {"commitId" (rawinput389326 "commitId"), "blobId" (rawinput389326 "blobId"), "treeId" (rawinput389326 "treeId")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar389328 ["commitId"])), :blob-id (deser-object-id (clojure.core/get-in letvar389328 ["blobId"])), :tree-id (deser-object-id (clojure.core/get-in letvar389328 ["treeId"]))}))))

(clojure.core/defn- response-repository-trigger-destination-arn-required-exception ([input] (response-repository-trigger-destination-arn-required-exception nil input)) ([resultWrapper389330 input] (clojure.core/let [rawinput389329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389331 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-same-path-request-exception ([input] (response-same-path-request-exception nil input)) ([resultWrapper389333 input] (clojure.core/let [rawinput389332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389334 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-and-source-file-specified-exception ([input] (response-file-content-and-source-file-specified-exception nil input)) ([resultWrapper389336 input] (clojure.core/let [rawinput389335 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389337 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tip-of-source-reference-is-different-exception ([input] (response-tip-of-source-reference-is-different-exception nil input)) ([resultWrapper389339 input] (clojure.core/let [rawinput389338 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389340 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-name-required-exception ([input] (response-repository-name-required-exception nil input)) ([resultWrapper389342 input] (clojure.core/let [rawinput389341 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389343 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-status-update-exception ([input] (response-invalid-pull-request-status-update-exception nil input)) ([resultWrapper389345 input] (clojure.core/let [rawinput389344 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389346 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-author-arn-exception ([input] (response-invalid-author-arn-exception nil input)) ([resultWrapper389348 input] (clojure.core/let [rawinput389347 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389349 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-does-not-exist-exception ([input] (response-commit-does-not-exist-exception nil input)) ([resultWrapper389351 input] (clojure.core/let [rawinput389350 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389352 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-email-exception ([input] (response-invalid-email-exception nil input)) ([resultWrapper389354 input] (clojure.core/let [rawinput389353 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389355 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-repository-output ([input] (response-create-repository-output nil input)) ([resultWrapper389357 input] (clojure.core/let [rawinput389356 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389358 {"repositoryMetadata" (rawinput389356 "repositoryMetadata")}] (clojure.core/cond-> {} (letvar389358 "repositoryMetadata") (clojure.core/assoc :repository-metadata (deser-repository-metadata (clojure.core/get-in letvar389358 ["repositoryMetadata"])))))))

(clojure.core/defn- response-merge-pull-request-by-fast-forward-output ([input] (response-merge-pull-request-by-fast-forward-output nil input)) ([resultWrapper389360 input] (clojure.core/let [rawinput389359 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389361 {"pullRequest" (rawinput389359 "pullRequest")}] (clojure.core/cond-> {} (letvar389361 "pullRequest") (clojure.core/assoc :pull-request (deser-pull-request (clojure.core/get-in letvar389361 ["pullRequest"])))))))

(clojure.core/defn- response-post-comment-reply-output ([input] (response-post-comment-reply-output nil input)) ([resultWrapper389363 input] (clojure.core/let [rawinput389362 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389364 {"comment" (rawinput389362 "comment")}] (clojure.core/cond-> {} (letvar389364 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389364 ["comment"])))))))

(clojure.core/defn- response-directory-name-conflicts-with-file-name-exception ([input] (response-directory-name-conflicts-with-file-name-exception nil input)) ([resultWrapper389366 input] (clojure.core/let [rawinput389365 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389367 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-repository-triggers-output ([input] (response-get-repository-triggers-output nil input)) ([resultWrapper389369 input] (clojure.core/let [rawinput389368 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389370 {"configurationId" (rawinput389368 "configurationId"), "triggers" (rawinput389368 "triggers")}] (clojure.core/cond-> {} (letvar389370 "configurationId") (clojure.core/assoc :configuration-id (deser-repository-triggers-configuration-id (clojure.core/get-in letvar389370 ["configurationId"]))) (letvar389370 "triggers") (clojure.core/assoc :triggers (deser-repository-triggers-list (clojure.core/get-in letvar389370 ["triggers"])))))))

(clojure.core/defn- response-file-mode-required-exception ([input] (response-file-mode-required-exception nil input)) ([resultWrapper389372 input] (clojure.core/let [rawinput389371 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389373 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-region-exception ([input] (response-invalid-repository-trigger-region-exception nil input)) ([resultWrapper389375 input] (clojure.core/let [rawinput389374 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389376 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-file-entries-exceeded-exception ([input] (response-maximum-file-entries-exceeded-exception nil input)) ([resultWrapper389378 input] (clojure.core/let [rawinput389377 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389379 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reference-does-not-exist-exception ([input] (response-reference-does-not-exist-exception nil input)) ([resultWrapper389381 input] (clojure.core/let [rawinput389380 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389382 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-id-required-exception ([input] (response-comment-id-required-exception nil input)) ([resultWrapper389384 input] (clojure.core/let [rawinput389383 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389385 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-merge-option-required-exception ([input] (response-merge-option-required-exception nil input)) ([resultWrapper389387 input] (clojure.core/let [rawinput389386 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389388 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-before-commit-id-and-after-commit-id-are-same-exception ([input] (response-before-commit-id-and-after-commit-id-are-same-exception nil input)) ([resultWrapper389390 input] (clojure.core/let [rawinput389389 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389391 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-post-comment-for-pull-request-output ([input] (response-post-comment-for-pull-request-output nil input)) ([resultWrapper389393 input] (clojure.core/let [rawinput389392 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389394 {"repositoryName" (rawinput389392 "repositoryName"), "pullRequestId" (rawinput389392 "pullRequestId"), "beforeCommitId" (rawinput389392 "beforeCommitId"), "afterCommitId" (rawinput389392 "afterCommitId"), "beforeBlobId" (rawinput389392 "beforeBlobId"), "afterBlobId" (rawinput389392 "afterBlobId"), "location" (rawinput389392 "location"), "comment" (rawinput389392 "comment")}] (clojure.core/cond-> {} (letvar389394 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar389394 ["repositoryName"]))) (letvar389394 "pullRequestId") (clojure.core/assoc :pull-request-id (deser-pull-request-id (clojure.core/get-in letvar389394 ["pullRequestId"]))) (letvar389394 "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (clojure.core/get-in letvar389394 ["beforeCommitId"]))) (letvar389394 "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (clojure.core/get-in letvar389394 ["afterCommitId"]))) (letvar389394 "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (clojure.core/get-in letvar389394 ["beforeBlobId"]))) (letvar389394 "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (clojure.core/get-in letvar389394 ["afterBlobId"]))) (letvar389394 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar389394 ["location"]))) (letvar389394 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389394 ["comment"])))))))

(clojure.core/defn- response-get-comments-for-compared-commit-output ([input] (response-get-comments-for-compared-commit-output nil input)) ([resultWrapper389396 input] (clojure.core/let [rawinput389395 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389397 {"commentsForComparedCommitData" (rawinput389395 "commentsForComparedCommitData"), "nextToken" (rawinput389395 "nextToken")}] (clojure.core/cond-> {} (letvar389397 "commentsForComparedCommitData") (clojure.core/assoc :comments-for-compared-commit-data (deser-comments-for-compared-commit-data (clojure.core/get-in letvar389397 ["commentsForComparedCommitData"]))) (letvar389397 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389397 ["nextToken"])))))))

(clojure.core/defn- response-comment-deleted-exception ([input] (response-comment-deleted-exception nil input)) ([resultWrapper389399 input] (clojure.core/let [rawinput389398 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389400 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-pull-request-does-not-exist-exception ([input] (response-pull-request-does-not-exist-exception nil input)) ([resultWrapper389402 input] (clojure.core/let [rawinput389401 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389403 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-repositories-output ([input] (response-list-repositories-output nil input)) ([resultWrapper389405 input] (clojure.core/let [rawinput389404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389406 {"repositories" (rawinput389404 "repositories"), "nextToken" (rawinput389404 "nextToken")}] (clojure.core/cond-> {} (letvar389406 "repositories") (clojure.core/assoc :repositories (deser-repository-name-id-pair-list (clojure.core/get-in letvar389406 ["repositories"]))) (letvar389406 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389406 ["nextToken"])))))))

(clojure.core/defn- response-blob-id-does-not-exist-exception ([input] (response-blob-id-does-not-exist-exception nil input)) ([resultWrapper389408 input] (clojure.core/let [rawinput389407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389409 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-content-required-exception ([input] (response-comment-content-required-exception nil input)) ([resultWrapper389411 input] (clojure.core/let [rawinput389410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389412 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-names-required-exception ([input] (response-repository-names-required-exception nil input)) ([resultWrapper389414 input] (clojure.core/let [rawinput389413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389415 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-branches-exceeded-exception ([input] (response-maximum-branches-exceeded-exception nil input)) ([resultWrapper389417 input] (clojure.core/let [rawinput389416 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389418 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-limit-exceeded-exception ([input] (response-repository-limit-exceeded-exception nil input)) ([resultWrapper389420 input] (clojure.core/let [rawinput389419 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389421 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-pull-request-description-output ([input] (response-update-pull-request-description-output nil input)) ([resultWrapper389423 input] (clojure.core/let [rawinput389422 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389424 {"pullRequest" (rawinput389422 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar389424 ["pullRequest"]))}))))

(clojure.core/defn- response-parent-commit-id-outdated-exception ([input] (response-parent-commit-id-outdated-exception nil input)) ([resultWrapper389426 input] (clojure.core/let [rawinput389425 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389427 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-blob-id-required-exception ([input] (response-blob-id-required-exception nil input)) ([resultWrapper389429 input] (clojure.core/let [rawinput389428 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389430 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-multiple-repositories-in-pull-request-exception ([input] (response-multiple-repositories-in-pull-request-exception nil input)) ([resultWrapper389432 input] (clojure.core/let [rawinput389431 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389433 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-size-limit-exceeded-exception ([input] (response-file-content-size-limit-exceeded-exception nil input)) ([resultWrapper389435 input] (clojure.core/let [rawinput389434 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389436 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-is-tag-name-exception ([input] (response-branch-name-is-tag-name-exception nil input)) ([resultWrapper389438 input] (clojure.core/let [rawinput389437 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389439 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-name-exists-exception ([input] (response-repository-name-exists-exception nil input)) ([resultWrapper389441 input] (clojure.core/let [rawinput389440 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389442 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-branch-name-exception ([input] (response-invalid-branch-name-exception nil input)) ([resultWrapper389444 input] (clojure.core/let [rawinput389443 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389445 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-relative-file-version-enum-exception ([input] (response-invalid-relative-file-version-enum-exception nil input)) ([resultWrapper389447 input] (clojure.core/let [rawinput389446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389448 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-file-entry-conflict-exception ([input] (response-put-file-entry-conflict-exception nil input)) ([resultWrapper389450 input] (clojure.core/let [rawinput389449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389451 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-comment-content-output ([input] (response-delete-comment-content-output nil input)) ([resultWrapper389453 input] (clojure.core/let [rawinput389452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389454 {"comment" (rawinput389452 "comment")}] (clojure.core/cond-> {} (letvar389454 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389454 ["comment"])))))))

(clojure.core/defn- response-comment-not-created-by-caller-exception ([input] (response-comment-not-created-by-caller-exception nil input)) ([resultWrapper389456 input] (clojure.core/let [rawinput389455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389457 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-folder-output ([input] (response-get-folder-output nil input)) ([resultWrapper389459 input] (clojure.core/let [rawinput389458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389460 {"commitId" (rawinput389458 "commitId"), "folderPath" (rawinput389458 "folderPath"), "treeId" (rawinput389458 "treeId"), "subFolders" (rawinput389458 "subFolders"), "files" (rawinput389458 "files"), "symbolicLinks" (rawinput389458 "symbolicLinks"), "subModules" (rawinput389458 "subModules")}] (clojure.core/cond-> {:commit-id (deser-object-id (clojure.core/get-in letvar389460 ["commitId"])), :folder-path (deser-path (clojure.core/get-in letvar389460 ["folderPath"]))} (letvar389460 "treeId") (clojure.core/assoc :tree-id (deser-object-id (clojure.core/get-in letvar389460 ["treeId"]))) (letvar389460 "subFolders") (clojure.core/assoc :sub-folders (deser-folder-list (clojure.core/get-in letvar389460 ["subFolders"]))) (letvar389460 "files") (clojure.core/assoc :files (deser-file-list (clojure.core/get-in letvar389460 ["files"]))) (letvar389460 "symbolicLinks") (clojure.core/assoc :symbolic-links (deser-symbolic-link-list (clojure.core/get-in letvar389460 ["symbolicLinks"]))) (letvar389460 "subModules") (clojure.core/assoc :sub-modules (deser-sub-module-list (clojure.core/get-in letvar389460 ["subModules"])))))))

(clojure.core/defn- response-path-required-exception ([input] (response-path-required-exception nil input)) ([resultWrapper389462 input] (clojure.core/let [rawinput389461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389463 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-pull-request-event-type-exception ([input] (response-invalid-pull-request-event-type-exception nil input)) ([resultWrapper389465 input] (clojure.core/let [rawinput389464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389466 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-repository-output ([input] (response-delete-repository-output nil input)) ([resultWrapper389468 input] (clojure.core/let [rawinput389467 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389469 {"repositoryId" (rawinput389467 "repositoryId")}] (clojure.core/cond-> {} (letvar389469 "repositoryId") (clojure.core/assoc :repository-id (deser-repository-id (clojure.core/get-in letvar389469 ["repositoryId"])))))))

(clojure.core/defn- response-invalid-parent-commit-id-exception ([input] (response-invalid-parent-commit-id-exception nil input)) ([resultWrapper389471 input] (clojure.core/let [rawinput389470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389472 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-actor-arn-exception ([input] (response-invalid-actor-arn-exception nil input)) ([resultWrapper389474 input] (clojure.core/let [rawinput389473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389475 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-targets-exception ([input] (response-invalid-targets-exception nil input)) ([resultWrapper389477 input] (clojure.core/let [rawinput389476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389478 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-name-exception ([input] (response-invalid-repository-name-exception nil input)) ([resultWrapper389480 input] (clojure.core/let [rawinput389479 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389481 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-repository-output ([input] (response-get-repository-output nil input)) ([resultWrapper389483 input] (clojure.core/let [rawinput389482 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389484 {"repositoryMetadata" (rawinput389482 "repositoryMetadata")}] (clojure.core/cond-> {} (letvar389484 "repositoryMetadata") (clojure.core/assoc :repository-metadata (deser-repository-metadata (clojure.core/get-in letvar389484 ["repositoryMetadata"])))))))

(clojure.core/defn- response-describe-pull-request-events-output ([input] (response-describe-pull-request-events-output nil input)) ([resultWrapper389486 input] (clojure.core/let [rawinput389485 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389487 {"pullRequestEvents" (rawinput389485 "pullRequestEvents"), "nextToken" (rawinput389485 "nextToken")}] (clojure.core/cond-> {:pull-request-events (deser-pull-request-event-list (clojure.core/get-in letvar389487 ["pullRequestEvents"]))} (letvar389487 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389487 ["nextToken"])))))))

(clojure.core/defn- response-invalid-order-exception ([input] (response-invalid-order-exception nil input)) ([resultWrapper389489 input] (clojure.core/let [rawinput389488 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389490 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-pull-requests-output ([input] (response-list-pull-requests-output nil input)) ([resultWrapper389492 input] (clojure.core/let [rawinput389491 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389493 {"pullRequestIds" (rawinput389491 "pullRequestIds"), "nextToken" (rawinput389491 "nextToken")}] (clojure.core/cond-> {:pull-request-ids (deser-pull-request-id-list (clojure.core/get-in letvar389493 ["pullRequestIds"]))} (letvar389493 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389493 ["nextToken"])))))))

(clojure.core/defn- response-update-comment-output ([input] (response-update-comment-output nil input)) ([resultWrapper389495 input] (clojure.core/let [rawinput389494 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389496 {"comment" (rawinput389494 "comment")}] (clojure.core/cond-> {} (letvar389496 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389496 ["comment"])))))))

(clojure.core/defn- response-invalid-description-exception ([input] (response-invalid-description-exception nil input)) ([resultWrapper389498 input] (clojure.core/let [rawinput389497 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389499 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-manual-merge-required-exception ([input] (response-manual-merge-required-exception nil input)) ([resultWrapper389501 input] (clojure.core/let [rawinput389500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389502 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-destination-arn-exception ([input] (response-invalid-repository-trigger-destination-arn-exception nil input)) ([resultWrapper389504 input] (clojure.core/let [rawinput389503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389505 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-same-file-content-exception ([input] (response-same-file-content-exception nil input)) ([resultWrapper389507 input] (clojure.core/let [rawinput389506 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389508 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-maximum-repository-names-exceeded-exception ([input] (response-maximum-repository-names-exceeded-exception nil input)) ([resultWrapper389510 input] (clojure.core/let [rawinput389509 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389511 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-comment-id-exception ([input] (response-invalid-comment-id-exception nil input)) ([resultWrapper389513 input] (clojure.core/let [rawinput389512 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389514 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-required-exception ([input] (response-commit-required-exception nil input)) ([resultWrapper389516 input] (clojure.core/let [rawinput389515 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389517 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-pull-request-output ([input] (response-get-pull-request-output nil input)) ([resultWrapper389519 input] (clojure.core/let [rawinput389518 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389520 {"pullRequest" (rawinput389518 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar389520 ["pullRequest"]))}))))

(clojure.core/defn- response-commit-id-does-not-exist-exception ([input] (response-commit-id-does-not-exist-exception nil input)) ([resultWrapper389522 input] (clojure.core/let [rawinput389521 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389523 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-commit-id-required-exception ([input] (response-commit-id-required-exception nil input)) ([resultWrapper389525 input] (clojure.core/let [rawinput389524 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389526 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-targets-required-exception ([input] (response-targets-required-exception nil input)) ([resultWrapper389528 input] (clojure.core/let [rawinput389527 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389529 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-does-not-exist-exception ([input] (response-repository-does-not-exist-exception nil input)) ([resultWrapper389531 input] (clojure.core/let [rawinput389530 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389532 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-title-required-exception ([input] (response-title-required-exception nil input)) ([resultWrapper389534 input] (clojure.core/let [rawinput389533 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389535 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-commit-id-exception ([input] (response-invalid-commit-id-exception nil input)) ([resultWrapper389537 input] (clojure.core/let [rawinput389536 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389538 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-comment-content-size-limit-exceeded-exception ([input] (response-comment-content-size-limit-exceeded-exception nil input)) ([resultWrapper389540 input] (clojure.core/let [rawinput389539 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389541 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tips-divergence-exceeded-exception ([input] (response-tips-divergence-exceeded-exception nil input)) ([resultWrapper389543 input] (clojure.core/let [rawinput389542 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389544 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-content-required-exception ([input] (response-file-content-required-exception nil input)) ([resultWrapper389546 input] (clojure.core/let [rawinput389545 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389547 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-name-required-exception ([input] (response-repository-trigger-name-required-exception nil input)) ([resultWrapper389549 input] (clojure.core/let [rawinput389548 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389550 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-author-does-not-exist-exception ([input] (response-author-does-not-exist-exception nil input)) ([resultWrapper389552 input] (clojure.core/let [rawinput389551 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389553 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reference-type-not-supported-exception ([input] (response-reference-type-not-supported-exception nil input)) ([resultWrapper389555 input] (clojure.core/let [rawinput389554 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389556 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-destination-commit-specifier-exception ([input] (response-invalid-destination-commit-specifier-exception nil input)) ([resultWrapper389558 input] (clojure.core/let [rawinput389557 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389559 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-trigger-events-list-required-exception ([input] (response-repository-trigger-events-list-required-exception nil input)) ([resultWrapper389561 input] (clojure.core/let [rawinput389560 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389562 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-pull-request-output ([input] (response-create-pull-request-output nil input)) ([resultWrapper389564 input] (clojure.core/let [rawinput389563 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389565 {"pullRequest" (rawinput389563 "pullRequest")}] (clojure.core/cond-> {:pull-request (deser-pull-request (clojure.core/get-in letvar389565 ["pullRequest"]))}))))

(clojure.core/defn- response-pull-request-status-required-exception ([input] (response-pull-request-status-required-exception nil input)) ([resultWrapper389567 input] (clojure.core/let [rawinput389566 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389568 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-test-repository-triggers-output ([input] (response-test-repository-triggers-output nil input)) ([resultWrapper389570 input] (clojure.core/let [rawinput389569 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389571 {"successfulExecutions" (rawinput389569 "successfulExecutions"), "failedExecutions" (rawinput389569 "failedExecutions")}] (clojure.core/cond-> {} (letvar389571 "successfulExecutions") (clojure.core/assoc :successful-executions (deser-repository-trigger-name-list (clojure.core/get-in letvar389571 ["successfulExecutions"]))) (letvar389571 "failedExecutions") (clojure.core/assoc :failed-executions (deser-repository-trigger-execution-failure-list (clojure.core/get-in letvar389571 ["failedExecutions"])))))))

(clojure.core/defn- response-invalid-repository-trigger-events-exception ([input] (response-invalid-repository-trigger-events-exception nil input)) ([resultWrapper389573 input] (clojure.core/let [rawinput389572 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389574 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-commit-output ([input] (response-create-commit-output nil input)) ([resultWrapper389576 input] (clojure.core/let [rawinput389575 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389577 {"commitId" (rawinput389575 "commitId"), "treeId" (rawinput389575 "treeId"), "filesAdded" (rawinput389575 "filesAdded"), "filesUpdated" (rawinput389575 "filesUpdated"), "filesDeleted" (rawinput389575 "filesDeleted")}] (clojure.core/cond-> {} (letvar389577 "commitId") (clojure.core/assoc :commit-id (deser-object-id (clojure.core/get-in letvar389577 ["commitId"]))) (letvar389577 "treeId") (clojure.core/assoc :tree-id (deser-object-id (clojure.core/get-in letvar389577 ["treeId"]))) (letvar389577 "filesAdded") (clojure.core/assoc :files-added (deser-files-metadata (clojure.core/get-in letvar389577 ["filesAdded"]))) (letvar389577 "filesUpdated") (clojure.core/assoc :files-updated (deser-files-metadata (clojure.core/get-in letvar389577 ["filesUpdated"]))) (letvar389577 "filesDeleted") (clojure.core/assoc :files-deleted (deser-files-metadata (clojure.core/get-in letvar389577 ["filesDeleted"])))))))

(clojure.core/defn- response-invalid-file-location-exception ([input] (response-invalid-file-location-exception nil input)) ([resultWrapper389579 input] (clojure.core/let [rawinput389578 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389580 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-branch-name-exists-exception ([input] (response-branch-name-exists-exception nil input)) ([resultWrapper389582 input] (clojure.core/let [rawinput389581 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389583 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-merge-option-exception ([input] (response-invalid-merge-option-exception nil input)) ([resultWrapper389585 input] (clojure.core/let [rawinput389584 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389586 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-file-path-conflicts-with-submodule-path-exception ([input] (response-file-path-conflicts-with-submodule-path-exception nil input)) ([resultWrapper389588 input] (clojure.core/let [rawinput389587 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389589 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-target-required-exception ([input] (response-target-required-exception nil input)) ([resultWrapper389591 input] (clojure.core/let [rawinput389590 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389592 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-repository-triggers-list-required-exception ([input] (response-repository-triggers-list-required-exception nil input)) ([resultWrapper389594 input] (clojure.core/let [rawinput389593 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389595 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-comments-for-pull-request-output ([input] (response-get-comments-for-pull-request-output nil input)) ([resultWrapper389597 input] (clojure.core/let [rawinput389596 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389598 {"commentsForPullRequestData" (rawinput389596 "commentsForPullRequestData"), "nextToken" (rawinput389596 "nextToken")}] (clojure.core/cond-> {} (letvar389598 "commentsForPullRequestData") (clojure.core/assoc :comments-for-pull-request-data (deser-comments-for-pull-request-data (clojure.core/get-in letvar389598 ["commentsForPullRequestData"]))) (letvar389598 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389598 ["nextToken"])))))))

(clojure.core/defn- response-get-merge-conflicts-output ([input] (response-get-merge-conflicts-output nil input)) ([resultWrapper389600 input] (clojure.core/let [rawinput389599 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389601 {"mergeable" (rawinput389599 "mergeable"), "destinationCommitId" (rawinput389599 "destinationCommitId"), "sourceCommitId" (rawinput389599 "sourceCommitId")}] (clojure.core/cond-> {:mergeable (deser-is-mergeable (clojure.core/get-in letvar389601 ["mergeable"])), :destination-commit-id (deser-commit-id (clojure.core/get-in letvar389601 ["destinationCommitId"])), :source-commit-id (deser-commit-id (clojure.core/get-in letvar389601 ["sourceCommitId"]))}))))

(clojure.core/defn- response-post-comment-for-compared-commit-output ([input] (response-post-comment-for-compared-commit-output nil input)) ([resultWrapper389603 input] (clojure.core/let [rawinput389602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389604 {"repositoryName" (rawinput389602 "repositoryName"), "beforeCommitId" (rawinput389602 "beforeCommitId"), "afterCommitId" (rawinput389602 "afterCommitId"), "beforeBlobId" (rawinput389602 "beforeBlobId"), "afterBlobId" (rawinput389602 "afterBlobId"), "location" (rawinput389602 "location"), "comment" (rawinput389602 "comment")}] (clojure.core/cond-> {} (letvar389604 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar389604 ["repositoryName"]))) (letvar389604 "beforeCommitId") (clojure.core/assoc :before-commit-id (deser-commit-id (clojure.core/get-in letvar389604 ["beforeCommitId"]))) (letvar389604 "afterCommitId") (clojure.core/assoc :after-commit-id (deser-commit-id (clojure.core/get-in letvar389604 ["afterCommitId"]))) (letvar389604 "beforeBlobId") (clojure.core/assoc :before-blob-id (deser-object-id (clojure.core/get-in letvar389604 ["beforeBlobId"]))) (letvar389604 "afterBlobId") (clojure.core/assoc :after-blob-id (deser-object-id (clojure.core/get-in letvar389604 ["afterBlobId"]))) (letvar389604 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar389604 ["location"]))) (letvar389604 "comment") (clojure.core/assoc :comment (deser-comment (clojure.core/get-in letvar389604 ["comment"])))))))

(clojure.core/defn- response-get-differences-output ([input] (response-get-differences-output nil input)) ([resultWrapper389606 input] (clojure.core/let [rawinput389605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389607 {"differences" (rawinput389605 "differences"), "NextToken" (rawinput389605 "NextToken")}] (clojure.core/cond-> {} (letvar389607 "differences") (clojure.core/assoc :differences (deser-difference-list (clojure.core/get-in letvar389607 ["differences"]))) (letvar389607 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar389607 ["NextToken"])))))))

(clojure.core/defn- response-source-and-destination-are-same-exception ([input] (response-source-and-destination-are-same-exception nil input)) ([resultWrapper389609 input] (clojure.core/let [rawinput389608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389610 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-branch-output ([input] (response-get-branch-output nil input)) ([resultWrapper389612 input] (clojure.core/let [rawinput389611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389613 {"branch" (rawinput389611 "branch")}] (clojure.core/cond-> {} (letvar389613 "branch") (clojure.core/assoc :branch (deser-branch-info (clojure.core/get-in letvar389613 ["branch"])))))))

(clojure.core/defn- response-repository-not-associated-with-pull-request-exception ([input] (response-repository-not-associated-with-pull-request-exception nil input)) ([resultWrapper389615 input] (clojure.core/let [rawinput389614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389616 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-repository-trigger-branch-name-exception ([input] (response-invalid-repository-trigger-branch-name-exception nil input)) ([resultWrapper389618 input] (clojure.core/let [rawinput389617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389619 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-commit-exception ([input] (response-invalid-commit-exception nil input)) ([resultWrapper389621 input] (clojure.core/let [rawinput389620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389622 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-repositories-output ([input] (response-batch-get-repositories-output nil input)) ([resultWrapper389624 input] (clojure.core/let [rawinput389623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389625 {"repositories" (rawinput389623 "repositories"), "repositoriesNotFound" (rawinput389623 "repositoriesNotFound")}] (clojure.core/cond-> {} (letvar389625 "repositories") (clojure.core/assoc :repositories (deser-repository-metadata-list (clojure.core/get-in letvar389625 ["repositories"]))) (letvar389625 "repositoriesNotFound") (clojure.core/assoc :repositories-not-found (deser-repository-not-found-list (clojure.core/get-in letvar389625 ["repositoriesNotFound"])))))))

(clojure.core/defn- response-invalid-repository-trigger-custom-data-exception ([input] (response-invalid-repository-trigger-custom-data-exception nil input)) ([resultWrapper389627 input] (clojure.core/let [rawinput389626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389628 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-name-length-exceeded-exception ([input] (response-name-length-exceeded-exception nil input)) ([resultWrapper389630 input] (clojure.core/let [rawinput389629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389631 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-encryption-key-disabled-exception ([input] (response-encryption-key-disabled-exception nil input)) ([resultWrapper389633 input] (clojure.core/let [rawinput389632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389634 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-restricted-source-file-exception ([input] (response-restricted-source-file-exception nil input)) ([resultWrapper389636 input] (clojure.core/let [rawinput389635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar389637 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/file-size (clojure.spec.alpha/and :portkey.aws.codecommit/object-size))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-output/file-content (clojure.spec.alpha/and :portkey.aws.codecommit/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-file-output/commit-id :portkey.aws.codecommit.get-file-output/blob-id :portkey.aws.codecommit.get-file-output/file-path :portkey.aws.codecommit.get-file-output/file-mode :portkey.aws.codecommit.get-file-output/file-size :portkey.aws.codecommit.get-file-output/file-content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/is-comment-deleted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit.get-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-branch-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-branch-input/repository-name :portkey.aws.codecommit.get-branch-input/branch-name]))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-blob-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/actor-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-pull-request-input/title (clojure.spec.alpha/and :portkey.aws.codecommit/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-pull-request-input/description (clojure.spec.alpha/and :portkey.aws.codecommit/description))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-pull-request-input/targets (clojure.spec.alpha/and :portkey.aws.codecommit/target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.create-pull-request-input/title :portkey.aws.codecommit.create-pull-request-input/targets] :opt-un [:portkey.aws.codecommit.create-pull-request-input/description :portkey.aws.codecommit.create-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-sort-by-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-default-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-default-branch-input/default-branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-default-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-default-branch-input/repository-name :portkey.aws.codecommit.update-default-branch-input/default-branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-commit-output/commit (clojure.spec.alpha/and :portkey.aws.codecommit/commit))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-commit-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-commit-output/commit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/encryption-key-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-file-position-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-status-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-status-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-status-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/maximum-repository-triggers-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/client-request-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-deletion-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/client-request-token-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-blob-output/content (clojure.spec.alpha/and :portkey.aws.codecommit/blob))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-blob-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-blob-output/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/maximum-open-pull-requests-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-reference-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/keep-empty-folders (clojure.spec.alpha/and :portkey.aws.codecommit/keep-empty-folders))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit/email))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-file-input/repository-name :portkey.aws.codecommit.delete-file-input/branch-name :portkey.aws.codecommit.delete-file-input/file-path :portkey.aws.codecommit.delete-file-input/parent-commit-id] :opt-un [:portkey.aws.codecommit.delete-file-input/keep-empty-folders :portkey.aws.codecommit.delete-file-input/commit-message :portkey.aws.codecommit.delete-file-input/name :portkey.aws.codecommit.delete-file-input/email]))

(clojure.spec.alpha/def :portkey.aws.codecommit/object-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-created-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-created-event-metadata/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-created-event-metadata/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-created-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-created-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-created-event-metadata/repository-name :portkey.aws.codecommit.pull-request-created-event-metadata/source-commit-id :portkey.aws.codecommit.pull-request-created-event-metadata/destination-commit-id :portkey.aws.codecommit.pull-request-created-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-name-conflicts-with-directory-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-entry-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-trigger-event-enum))

(clojure.spec.alpha/def :portkey.aws.codecommit/object-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-pull-request-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-pull-request-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/is-merged clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-already-closed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-path-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.comment/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/content (clojure.spec.alpha/and :portkey.aws.codecommit/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/deleted (clojure.spec.alpha/and :portkey.aws.codecommit/is-comment-deleted))
(clojure.spec.alpha/def :portkey.aws.codecommit.comment/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/comment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.comment/comment-id :portkey.aws.codecommit.comment/content :portkey.aws.codecommit.comment/in-reply-to :portkey.aws.codecommit.comment/creation-date :portkey.aws.codecommit.comment/last-modified-date :portkey.aws.codecommit.comment/author-arn :portkey.aws.codecommit.comment/deleted :portkey.aws.codecommit.comment/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-input/destination-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-input/source-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-input/merge-option (clojure.spec.alpha/and :portkey.aws.codecommit/merge-option-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-merge-conflicts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-merge-conflicts-input/repository-name :portkey.aws.codecommit.get-merge-conflicts-input/destination-commit-specifier :portkey.aws.codecommit.get-merge-conflicts-input/source-commit-specifier :portkey.aws.codecommit.get-merge-conflicts-input/merge-option] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-branch-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.create-branch-input/repository-name :portkey.aws.codecommit.create-branch-input/branch-name :portkey.aws.codecommit.create-branch-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/is-move clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit/encryption-integrity-checks-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.merge-metadata/is-merged (clojure.spec.alpha/and :portkey.aws.codecommit/is-merged))
(clojure.spec.alpha/def :portkey.aws.codecommit.merge-metadata/merged-by (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit/merge-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.merge-metadata/is-merged :portkey.aws.codecommit.merge-metadata/merged-by]))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-message-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-title-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/encryption-key-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/delete-file-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit/delete-file-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-client-request-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/files-metadata (clojure.spec.alpha/coll-of :portkey.aws.codecommit/file-metadata))

(clojure.spec.alpha/def :portkey.aws.codecommit/sub-module-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/sub-module))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-file-input/repository-name :portkey.aws.codecommit.get-file-input/file-path] :opt-un [:portkey.aws.codecommit.get-file-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit/path-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/destination-commit (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/source-commit (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-target/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-target/repository-name :portkey.aws.codecommit.pull-request-target/source-reference :portkey.aws.codecommit.pull-request-target/destination-reference :portkey.aws.codecommit.pull-request-target/destination-commit :portkey.aws.codecommit.pull-request-target/source-commit :portkey.aws.codecommit.pull-request-target/merge-base :portkey.aws.codecommit.pull-request-target/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-metadata))

(clojure.spec.alpha/def :portkey.aws.codecommit/last-modified-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit/comments (clojure.spec.alpha/coll-of :portkey.aws.codecommit/comment))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-event-enum #{"createReference" :all "updateReference" :delete-reference "all" :update-reference "deleteReference" :create-reference})

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-triggers-configuration-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-source-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comments-for-pull-request-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit/comments-for-pull-request))

(clojure.spec.alpha/def :portkey.aws.codecommit/folder-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\w\.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-branch-name-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.folder/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.folder/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.folder/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/folder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.folder/tree-id :portkey.aws.codecommit.folder/absolute-path :portkey.aws.codecommit.folder/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit.symbolic-link/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.symbolic-link/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.symbolic-link/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.symbolic-link/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/symbolic-link (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.symbolic-link/blob-id :portkey.aws.codecommit.symbolic-link/absolute-path :portkey.aws.codecommit.symbolic-link/relative-path :portkey.aws.codecommit.symbolic-link/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit/folder-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/folder))

(clojure.spec.alpha/def :portkey.aws.codecommit/no-change-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.codecommit/title (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-comment-content-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-comment-content-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-comment-content-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/parent-commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-pull-request-input/pull-request-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit/source-file-or-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/folder-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/parent-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/object-id))

(clojure.spec.alpha/def :portkey.aws.codecommit/difference-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/difference))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-branch-output/deleted-branch (clojure.spec.alpha/and :portkey.aws.codecommit/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.delete-branch-output/deleted-branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger-execution-failure/trigger (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger-execution-failure/failure-message (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-execution-failure-message))
(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-execution-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.repository-trigger-execution-failure/trigger :portkey.aws.codecommit.repository-trigger-execution-failure/failure-message]))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-comment-input/content (clojure.spec.alpha/and :portkey.aws.codecommit/content))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-comment-input/comment-id :portkey.aws.codecommit.update-comment-input/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/content (clojure.spec.alpha/and :portkey.aws.codecommit/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.post-comment-for-compared-commit-input/repository-name :portkey.aws.codecommit.post-comment-for-compared-commit-input/after-commit-id :portkey.aws.codecommit.post-comment-for-compared-commit-input/content] :opt-un [:portkey.aws.codecommit.post-comment-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.post-comment-for-compared-commit-input/location :portkey.aws.codecommit.post-comment-for-compared-commit-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-title-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-title-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-title-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.branch-info/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.branch-info/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/branch-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.branch-info/branch-name :portkey.aws.codecommit.branch-info/commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comments-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-comments-for-pull-request-input/pull-request-id] :opt-un [:portkey.aws.codecommit.get-comments-for-pull-request-input/repository-name :portkey.aws.codecommit.get-comments-for-pull-request-input/before-commit-id :portkey.aws.codecommit.get-comments-for-pull-request-input/after-commit-id :portkey.aws.codecommit.get-comments-for-pull-request-input/next-token :portkey.aws.codecommit.get-comments-for-pull-request-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit.file/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.file/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.file/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.file/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/file (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.file/blob-id :portkey.aws.codecommit.file/absolute-path :portkey.aws.codecommit.file/relative-path :portkey.aws.codecommit.file/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-file-mode-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-status-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-status-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-status-input/pull-request-id :portkey.aws.codecommit.update-pull-request-status-input/pull-request-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.source-file-specifier/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.source-file-specifier/is-move (clojure.spec.alpha/and :portkey.aws.codecommit/is-move))
(clojure.spec.alpha/def :portkey.aws.codecommit/source-file-specifier (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.source-file-specifier/file-path] :opt-un [:portkey.aws.codecommit.source-file-specifier/is-move]))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/event-date (clojure.spec.alpha/and :portkey.aws.codecommit/event-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-created-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-created-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-status-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-status-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-source-reference-updated-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-event/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-merged-state-changed-event-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-event/pull-request-id :portkey.aws.codecommit.pull-request-event/event-date :portkey.aws.codecommit.pull-request-event/pull-request-event-type :portkey.aws.codecommit.pull-request-event/actor-arn :portkey.aws.codecommit.pull-request-event/pull-request-created-event-metadata :portkey.aws.codecommit.pull-request-event/pull-request-status-changed-event-metadata :portkey.aws.codecommit.pull-request-event/pull-request-source-reference-updated-event-metadata :portkey.aws.codecommit.pull-request-event/pull-request-merged-state-changed-event-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-output/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-file-output/commit-id :portkey.aws.codecommit.delete-file-output/blob-id :portkey.aws.codecommit.delete-file-output/tree-id :portkey.aws.codecommit.delete-file-output/file-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/last-activity-date (clojure.spec.alpha/and :portkey.aws.codecommit/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/pull-request-targets (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-target-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/title (clojure.spec.alpha/and :portkey.aws.codecommit/title))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request/description (clojure.spec.alpha/and :portkey.aws.codecommit/description))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request/creation-date :portkey.aws.codecommit.pull-request/last-activity-date :portkey.aws.codecommit.pull-request/pull-request-status :portkey.aws.codecommit.pull-request/pull-request-targets :portkey.aws.codecommit.pull-request/author-arn :portkey.aws.codecommit.pull-request/client-request-token :portkey.aws.codecommit.pull-request/title :portkey.aws.codecommit.pull-request/pull-request-id :portkey.aws.codecommit.pull-request/description]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.put-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/put-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.put-repository-triggers-output/configuration-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-trigger-name))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-continuation-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.codecommit.location/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.location/file-position (clojure.spec.alpha/and :portkey.aws.codecommit/position))
(clojure.spec.alpha/def :portkey.aws.codecommit.location/relative-file-version (clojure.spec.alpha/and :portkey.aws.codecommit/relative-file-version-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.location/file-path :portkey.aws.codecommit.location/file-position :portkey.aws.codecommit.location/relative-file-version]))

(clojure.spec.alpha/def :portkey.aws.codecommit/encryption-key-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/parent-commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.list-branches-output/branches (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-branches-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-branches-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.list-branches-output/branches :portkey.aws.codecommit.list-branches-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/reference-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.difference/before-blob (clojure.spec.alpha/and :portkey.aws.codecommit/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.difference/after-blob (clojure.spec.alpha/and :portkey.aws.codecommit/blob-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.difference/change-type (clojure.spec.alpha/and :portkey.aws.codecommit/change-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/difference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.difference/before-blob :portkey.aws.codecommit.difference/after-blob :portkey.aws.codecommit.difference/change-type]))

(clojure.spec.alpha/def :portkey.aws.codecommit/default-branch-cannot-be-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/merge-base (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-source-reference-updated-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/repository-name :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/before-commit-id :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/after-commit-id :portkey.aws.codecommit.pull-request-source-reference-updated-event-metadata/merge-base]))

(clojure.spec.alpha/def :portkey.aws.codecommit/idempotency-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-output/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/put-file-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.put-file-output/commit-id :portkey.aws.codecommit.put-file-output/blob-id :portkey.aws.codecommit.put-file-output/tree-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-destination-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/same-path-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/order-enum #{:descending :ascending "descending" "ascending"})

(clojure.spec.alpha/def :portkey.aws.codecommit/file-content-and-source-file-specified-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/tip-of-source-reference-is-different-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/mode (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-pull-request-status-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comment-input/comment-id (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-comment-input/comment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-author-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-repository-triggers-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.test-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.test-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/test-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.test-repository-triggers-input/repository-name :portkey.aws.codecommit.test-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-email-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.create-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.merge-pull-request-by-fast-forward-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/merge-pull-request-by-fast-forward-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.merge-pull-request-by-fast-forward-output/pull-request]))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-reply-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-reply-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.post-comment-reply-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit/directory-name-conflicts-with-file-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-repository-triggers-output/configuration-id (clojure.spec.alpha/and :portkey.aws.codecommit/repository-triggers-configuration-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-repository-triggers-output/triggers (clojure.spec.alpha/and :portkey.aws.codecommit/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-repository-triggers-output/configuration-id :portkey.aws.codecommit.get-repository-triggers-output/triggers]))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-mode-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.file-metadata/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.file-metadata/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.file-metadata/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/file-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.file-metadata/absolute-path :portkey.aws.codecommit.file-metadata/blob-id :portkey.aws.codecommit.file-metadata/file-mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-compared-commit/comments (clojure.spec.alpha/and :portkey.aws.codecommit/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit/comments-for-compared-commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.comments-for-compared-commit/repository-name :portkey.aws.codecommit.comments-for-compared-commit/before-commit-id :portkey.aws.codecommit.comments-for-compared-commit/after-commit-id :portkey.aws.codecommit.comments-for-compared-commit/before-blob-id :portkey.aws.codecommit.comments-for-compared-commit/after-blob-id :portkey.aws.codecommit.comments-for-compared-commit/location :portkey.aws.codecommit.comments-for-compared-commit/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-region-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/maximum-file-entries-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/date (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/merge-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/merge-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-merged-state-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/repository-name :portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/destination-reference :portkey.aws.codecommit.pull-request-merged-state-changed-event-metadata/merge-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-entry/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-entry/file-content (clojure.spec.alpha/and :portkey.aws.codecommit/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-entry/source-file (clojure.spec.alpha/and :portkey.aws.codecommit/source-file-specifier))
(clojure.spec.alpha/def :portkey.aws.codecommit/put-file-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.put-file-entry/file-path] :opt-un [:portkey.aws.codecommit.put-file-entry/file-mode :portkey.aws.codecommit.put-file-entry/file-content :portkey.aws.codecommit.put-file-entry/source-file]))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-triggers-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-trigger))

(clojure.spec.alpha/def :portkey.aws.codecommit.blob-metadata/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.blob-metadata/path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.blob-metadata/mode (clojure.spec.alpha/and :portkey.aws.codecommit/mode))
(clojure.spec.alpha/def :portkey.aws.codecommit/blob-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.blob-metadata/blob-id :portkey.aws.codecommit.blob-metadata/path :portkey.aws.codecommit.blob-metadata/mode]))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-execution-failure-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/reference-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.batch-get-repositories-input/repository-names (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/batch-get-repositories-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.batch-get-repositories-input/repository-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/merge-option-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/clone-url-http (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/before-commit-id-and-after-commit-id-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.post-comment-for-pull-request-output/repository-name :portkey.aws.codecommit.post-comment-for-pull-request-output/pull-request-id :portkey.aws.codecommit.post-comment-for-pull-request-output/before-commit-id :portkey.aws.codecommit.post-comment-for-pull-request-output/after-commit-id :portkey.aws.codecommit.post-comment-for-pull-request-output/before-blob-id :portkey.aws.codecommit.post-comment-for-pull-request-output/after-blob-id :portkey.aws.codecommit.post-comment-for-pull-request-output/location :portkey.aws.codecommit.post-comment-for-pull-request-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-output/comments-for-compared-commit-data (clojure.spec.alpha/and :portkey.aws.codecommit/comments-for-compared-commit-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comments-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-comments-for-compared-commit-output/comments-for-compared-commit-data :portkey.aws.codecommit.get-comments-for-compared-commit-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-repository-input/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-description-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-description-input/description (clojure.spec.alpha/and :portkey.aws.codecommit/description))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-description-input/pull-request-id :portkey.aws.codecommit.update-pull-request-description-input/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.commit/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/parents (clojure.spec.alpha/and :portkey.aws.codecommit/parent-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/message (clojure.spec.alpha/and :portkey.aws.codecommit/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/author (clojure.spec.alpha/and :portkey.aws.codecommit/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/committer (clojure.spec.alpha/and :portkey.aws.codecommit/user-info))
(clojure.spec.alpha/def :portkey.aws.codecommit.commit/additional-data (clojure.spec.alpha/and :portkey.aws.codecommit/additional-data))
(clojure.spec.alpha/def :portkey.aws.codecommit/commit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.commit/commit-id :portkey.aws.codecommit.commit/tree-id :portkey.aws.codecommit.commit/parents :portkey.aws.codecommit.commit/message :portkey.aws.codecommit.commit/author :portkey.aws.codecommit.commit/committer :portkey.aws.codecommit.commit/additional-data]))

(clojure.spec.alpha/def :portkey.aws.codecommit.list-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name-id-pair-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-repositories-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.list-repositories-output/repositories :portkey.aws.codecommit.list-repositories-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-compared-commit-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comments-for-compared-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-comments-for-compared-commit-input/repository-name :portkey.aws.codecommit.get-comments-for-compared-commit-input/after-commit-id] :opt-un [:portkey.aws.codecommit.get-comments-for-compared-commit-input/before-commit-id :portkey.aws.codecommit.get-comments-for-compared-commit-input/next-token :portkey.aws.codecommit.get-comments-for-compared-commit-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit/blob-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-input/pull-request-event-type (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-event-type))
(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-input/actor-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit/describe-pull-request-events-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.describe-pull-request-events-input/pull-request-id] :opt-un [:portkey.aws.codecommit.describe-pull-request-events-input/pull-request-event-type :portkey.aws.codecommit.describe-pull-request-events-input/actor-arn :portkey.aws.codecommit.describe-pull-request-events-input/next-token :portkey.aws.codecommit.describe-pull-request-events-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit/keep-empty-folders clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-names-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/maximum-branches-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-description-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-description-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-description-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.comments-for-pull-request/comments (clojure.spec.alpha/and :portkey.aws.codecommit/comments))
(clojure.spec.alpha/def :portkey.aws.codecommit/comments-for-pull-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.comments-for-pull-request/pull-request-id :portkey.aws.codecommit.comments-for-pull-request/repository-name :portkey.aws.codecommit.comments-for-pull-request/before-commit-id :portkey.aws.codecommit.comments-for-pull-request/after-commit-id :portkey.aws.codecommit.comments-for-pull-request/before-blob-id :portkey.aws.codecommit.comments-for-pull-request/after-blob-id :portkey.aws.codecommit.comments-for-pull-request/location :portkey.aws.codecommit.comments-for-pull-request/comments]))

(clojure.spec.alpha/def :portkey.aws.codecommit.sub-module/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.sub-module/absolute-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.sub-module/relative-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/sub-module (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.sub-module/commit-id :portkey.aws.codecommit.sub-module/absolute-path :portkey.aws.codecommit.sub-module/relative-path]))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/parent-commit-id-outdated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/blob-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/multiple-repositories-in-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-custom-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.list-branches-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-branches-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-branches-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.list-branches-input/repository-name] :opt-un [:portkey.aws.codecommit.list-branches-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/merge-option-type-enum #{"FAST_FORWARD_MERGE" :fast-forward-merge})

(clojure.spec.alpha/def :portkey.aws.codecommit/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name-id-pair-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-name-id-pair))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-id-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/pull-request-id))

(clojure.spec.alpha/def :portkey.aws.codecommit/change-type-enum #{:m "M" :d "A" "D" :a})

(clojure.spec.alpha/def :portkey.aws.codecommit/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-event-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/pull-request-event))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/event-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-name-is-tag-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/clone-url-ssh (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-relative-file-version-enum-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/branch-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-reply-input/in-reply-to (clojure.spec.alpha/and :portkey.aws.codecommit/comment-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-reply-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-reply-input/content (clojure.spec.alpha/and :portkey.aws.codecommit/content))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-reply-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.post-comment-reply-input/in-reply-to :portkey.aws.codecommit.post-comment-reply-input/content] :opt-un [:portkey.aws.codecommit.post-comment-reply-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/put-file-entry-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-comment-content-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-comment-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.delete-comment-content-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-not-created-by-caller-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/position clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/sub-folders (clojure.spec.alpha/and :portkey.aws.codecommit/folder-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/files (clojure.spec.alpha/and :portkey.aws.codecommit/file-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/symbolic-links (clojure.spec.alpha/and :portkey.aws.codecommit/symbolic-link-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-output/sub-modules (clojure.spec.alpha/and :portkey.aws.codecommit/sub-module-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-folder-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-folder-output/commit-id :portkey.aws.codecommit.get-folder-output/folder-path] :opt-un [:portkey.aws.codecommit.get-folder-output/tree-id :portkey.aws.codecommit.get-folder-output/sub-folders :portkey.aws.codecommit.get-folder-output/files :portkey.aws.codecommit.get-folder-output/symbolic-links :portkey.aws.codecommit.get-folder-output/sub-modules]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-input/commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-folder-input/folder-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-folder-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-folder-input/repository-name :portkey.aws.codecommit.get-folder-input/folder-path] :opt-un [:portkey.aws.codecommit.get-folder-input/commit-specifier]))

(clojure.spec.alpha/def :portkey.aws.codecommit/content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-repository-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-repository-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.create-repository-input/repository-name] :opt-un [:portkey.aws.codecommit.create-repository-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/email (clojure.spec.alpha/and :portkey.aws.codecommit/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/delete-files (clojure.spec.alpha/and :portkey.aws.codecommit/delete-file-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/set-file-modes (clojure.spec.alpha/and :portkey.aws.codecommit/set-file-mode-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/keep-empty-folders (clojure.spec.alpha/and :portkey.aws.codecommit/keep-empty-folders))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/put-files (clojure.spec.alpha/and :portkey.aws.codecommit/put-file-entries))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/author-name (clojure.spec.alpha/and :portkey.aws.codecommit/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.create-commit-input/repository-name :portkey.aws.codecommit.create-commit-input/branch-name] :opt-un [:portkey.aws.codecommit.create-commit-input/email :portkey.aws.codecommit.create-commit-input/delete-files :portkey.aws.codecommit.create-commit-input/set-file-modes :portkey.aws.codecommit.create-commit-input/commit-message :portkey.aws.codecommit.create-commit-input/keep-empty-folders :portkey.aws.codecommit.create-commit-input/put-files :portkey.aws.codecommit.create-commit-input/author-name :portkey.aws.codecommit.create-commit-input/parent-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit/path-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-pull-request-event-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-repository-output/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.delete-repository-output/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/content (clojure.spec.alpha/and :portkey.aws.codecommit/content))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-pull-request-input/client-request-token (clojure.spec.alpha/and :portkey.aws.codecommit/client-request-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-for-pull-request-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.post-comment-for-pull-request-input/pull-request-id :portkey.aws.codecommit.post-comment-for-pull-request-input/repository-name :portkey.aws.codecommit.post-comment-for-pull-request-input/before-commit-id :portkey.aws.codecommit.post-comment-for-pull-request-input/after-commit-id :portkey.aws.codecommit.post-comment-for-pull-request-input/content] :opt-un [:portkey.aws.codecommit.post-comment-for-pull-request-input/location :portkey.aws.codecommit.post-comment-for-pull-request-input/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-parent-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-actor-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-targets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.list-repositories-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-repositories-input/sort-by (clojure.spec.alpha/and :portkey.aws.codecommit/sort-by-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-repositories-input/order (clojure.spec.alpha/and :portkey.aws.codecommit/order-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-repositories-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.list-repositories-input/next-token :portkey.aws.codecommit.list-repositories-input/sort-by :portkey.aws.codecommit.list-repositories-input/order]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-repository-output/repository-metadata (clojure.spec.alpha/and :portkey.aws.codecommit/repository-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-repository-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-repository-output/repository-metadata]))

(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/email (clojure.spec.alpha/and :portkey.aws.codecommit/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/name (clojure.spec.alpha/and :portkey.aws.codecommit/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/commit-message (clojure.spec.alpha/and :portkey.aws.codecommit/message))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/file-content (clojure.spec.alpha/and :portkey.aws.codecommit/file-content))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-file-input/parent-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/put-file-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.put-file-input/repository-name :portkey.aws.codecommit.put-file-input/branch-name :portkey.aws.codecommit.put-file-input/file-content :portkey.aws.codecommit.put-file-input/file-path] :opt-un [:portkey.aws.codecommit.put-file-input/file-mode :portkey.aws.codecommit.put-file-input/email :portkey.aws.codecommit.put-file-input/name :portkey.aws.codecommit.put-file-input/commit-message :portkey.aws.codecommit.put-file-input/parent-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-output/pull-request-events (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.describe-pull-request-events-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/describe-pull-request-events-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.describe-pull-request-events-output/pull-request-events] :opt-un [:portkey.aws.codecommit.describe-pull-request-events-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-order-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-output/pull-request-ids (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-pull-requests-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.list-pull-requests-output/pull-request-ids] :opt-un [:portkey.aws.codecommit.list-pull-requests-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger/name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger/destination-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger/custom-data (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-custom-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger/branches (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-trigger/events (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-event-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.repository-trigger/name :portkey.aws.codecommit.repository-trigger/destination-arn :portkey.aws.codecommit.repository-trigger/events] :opt-un [:portkey.aws.codecommit.repository-trigger/custom-data :portkey.aws.codecommit.repository-trigger/branches]))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-repository-description-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-repository-description-input/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-repository-description-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-repository-description-input/repository-name] :opt-un [:portkey.aws.codecommit.update-repository-description-input/repository-description]))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-comment-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-comment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.update-comment-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-description-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.repository-name-id-pair/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-name-id-pair/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name-id-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.repository-name-id-pair/repository-name :portkey.aws.codecommit.repository-name-id-pair/repository-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit/manual-merge-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-destination-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/same-file-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/maximum-repository-names-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-not-found-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-name))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/before-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/after-commit-specifier (clojure.spec.alpha/and :portkey.aws.codecommit/commit-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/before-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/after-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit/limit))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-differences-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-differences-input/repository-name :portkey.aws.codecommit.get-differences-input/after-commit-specifier] :opt-un [:portkey.aws.codecommit.get-differences-input/before-commit-specifier :portkey.aws.codecommit.get-differences-input/before-path :portkey.aws.codecommit.get-differences-input/after-path :portkey.aws.codecommit.get-differences-input/max-results :portkey.aws.codecommit/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-comment-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-input/author-arn (clojure.spec.alpha/and :portkey.aws.codecommit/arn))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-input/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-input/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit.list-pull-requests-input/max-results (clojure.spec.alpha/and :portkey.aws.codecommit/max-results))
(clojure.spec.alpha/def :portkey.aws.codecommit/list-pull-requests-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.list-pull-requests-input/repository-name] :opt-un [:portkey.aws.codecommit.list-pull-requests-input/author-arn :portkey.aws.codecommit.list-pull-requests-input/pull-request-status :portkey.aws.codecommit.list-pull-requests-input/next-token :portkey.aws.codecommit.list-pull-requests-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-id-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/symbolic-link-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/symbolic-link))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-status-enum #{:open :closed "CLOSED" "OPEN"})

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/put-file-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit/put-file-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit/targets-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.put-repository-triggers-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.put-repository-triggers-input/triggers (clojure.spec.alpha/and :portkey.aws.codecommit/repository-triggers-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/put-repository-triggers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.put-repository-triggers-input/repository-name :portkey.aws.codecommit.put-repository-triggers-input/triggers] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/title-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/merge-pull-request-by-fast-forward-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/pull-request-id :portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/repository-name] :opt-un [:portkey.aws.codecommit.merge-pull-request-by-fast-forward-input/source-commit-id]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-commit-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comment-content-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-event-type #{"PULL_REQUEST_MERGE_STATE_CHANGED" :pull-request-created :pull-request-status-changed "PULL_REQUEST_SOURCE_REFERENCE_UPDATED" :pull-request-merge-state-changed :pull-request-source-reference-updated "PULL_REQUEST_STATUS_CHANGED" "PULL_REQUEST_CREATED"})

(clojure.spec.alpha/def :portkey.aws.codecommit/tips-divergence-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codecommit/relative-file-version-enum #{:after "BEFORE" "AFTER" :before})

(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.codecommit/creation-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/clone-url-ssh (clojure.spec.alpha/and :portkey.aws.codecommit/clone-url-ssh))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/account-id (clojure.spec.alpha/and :portkey.aws.codecommit/account-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/repository-id (clojure.spec.alpha/and :portkey.aws.codecommit/repository-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/default-branch (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/repository-description (clojure.spec.alpha/and :portkey.aws.codecommit/repository-description))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/last-modified-date (clojure.spec.alpha/and :portkey.aws.codecommit/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.codecommit.repository-metadata/clone-url-http (clojure.spec.alpha/and :portkey.aws.codecommit/clone-url-http))
(clojure.spec.alpha/def :portkey.aws.codecommit/repository-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.repository-metadata/repository-name :portkey.aws.codecommit.repository-metadata/creation-date :portkey.aws.codecommit.repository-metadata/clone-url-ssh :portkey.aws.codecommit.repository-metadata/account-id :portkey.aws.codecommit.repository-metadata/repository-id :portkey.aws.codecommit.repository-metadata/default-branch :portkey.aws.codecommit.repository-metadata/repository-description :portkey.aws.codecommit.repository-metadata/last-modified-date :portkey.aws.codecommit/arn :portkey.aws.codecommit.repository-metadata/clone-url-http]))

(clojure.spec.alpha/def :portkey.aws.codecommit/set-file-mode-entries (clojure.spec.alpha/coll-of :portkey.aws.codecommit/set-file-mode-entry))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-content-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/target))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-title-input/pull-request-id (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-pull-request-title-input/title (clojure.spec.alpha/and :portkey.aws.codecommit/title))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-pull-request-title-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-pull-request-title-input/pull-request-id :portkey.aws.codecommit.update-pull-request-title-input/title] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/author-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/reference-type-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-destination-commit-specifier-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-blob-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-blob-input/blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-blob-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-blob-input/repository-name :portkey.aws.codecommit.get-blob-input/blob-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-events-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.target/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.target/source-reference (clojure.spec.alpha/and :portkey.aws.codecommit/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.target/destination-reference (clojure.spec.alpha/and :portkey.aws.codecommit/reference-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/target (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.target/repository-name :portkey.aws.codecommit.target/source-reference] :opt-un [:portkey.aws.codecommit.target/destination-reference]))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-pull-request-output/pull-request (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-pull-request-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.create-pull-request-output/pull-request] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-status-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.update-repository-name-input/old-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.update-repository-name-input/new-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/update-repository-name-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.update-repository-name-input/old-name :portkey.aws.codecommit.update-repository-name-input/new-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-trigger-execution-failure-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-trigger-execution-failure))

(clojure.spec.alpha/def :portkey.aws.codecommit.test-repository-triggers-output/successful-executions (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-name-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.test-repository-triggers-output/failed-executions (clojure.spec.alpha/and :portkey.aws.codecommit/repository-trigger-execution-failure-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/test-repository-triggers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.test-repository-triggers-output/successful-executions :portkey.aws.codecommit.test-repository-triggers-output/failed-executions]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-events-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.set-file-mode-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit.set-file-mode-entry/file-mode (clojure.spec.alpha/and :portkey.aws.codecommit/file-mode-type-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/set-file-mode-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.set-file-mode-entry/file-path :portkey.aws.codecommit.set-file-mode-entry/file-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-output/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-output/tree-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-output/files-added (clojure.spec.alpha/and :portkey.aws.codecommit/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-output/files-updated (clojure.spec.alpha/and :portkey.aws.codecommit/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit.create-commit-output/files-deleted (clojure.spec.alpha/and :portkey.aws.codecommit/files-metadata))
(clojure.spec.alpha/def :portkey.aws.codecommit/create-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.create-commit-output/commit-id :portkey.aws.codecommit.create-commit-output/tree-id :portkey.aws.codecommit.create-commit-output/files-added :portkey.aws.codecommit.create-commit-output/files-updated :portkey.aws.codecommit.create-commit-output/files-deleted]))

(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-target-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/pull-request-target))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-file-location-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-commit-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-commit-input/commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-commit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-commit-input/repository-name :portkey.aws.codecommit.get-commit-input/commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/sort-by-enum #{"repositoryName" "lastModifiedDate" :repository-name :last-modified-date})

(clojure.spec.alpha/def :portkey.aws.codecommit/file-mode-type-enum #{"NORMAL" :executable :normal "EXECUTABLE" :symlink "SYMLINK"})

(clojure.spec.alpha/def :portkey.aws.codecommit/branch-name-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-branch-input/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.delete-branch-input/branch-name (clojure.spec.alpha/and :portkey.aws.codecommit/branch-name))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-branch-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-branch-input/repository-name :portkey.aws.codecommit.delete-branch-input/branch-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-merge-option-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-path-conflicts-with-submodule-path-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/target-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.delete-file-entry/file-path (clojure.spec.alpha/and :portkey.aws.codecommit/path))
(clojure.spec.alpha/def :portkey.aws.codecommit/delete-file-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.delete-file-entry/file-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-triggers-list-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/commit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/file-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/file))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-output/comments-for-pull-request-data (clojure.spec.alpha/and :portkey.aws.codecommit/comments-for-pull-request-data))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-comments-for-pull-request-output/next-token (clojure.spec.alpha/and :portkey.aws.codecommit/next-token))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-comments-for-pull-request-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-comments-for-pull-request-output/comments-for-pull-request-data :portkey.aws.codecommit.get-comments-for-pull-request-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-output/mergeable (clojure.spec.alpha/and :portkey.aws.codecommit/is-mergeable))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-output/destination-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.get-merge-conflicts-output/source-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-merge-conflicts-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codecommit.get-merge-conflicts-output/mergeable :portkey.aws.codecommit.get-merge-conflicts-output/destination-commit-id :portkey.aws.codecommit.get-merge-conflicts-output/source-commit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/repository-name (clojure.spec.alpha/and :portkey.aws.codecommit/repository-name))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/before-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/after-commit-id (clojure.spec.alpha/and :portkey.aws.codecommit/commit-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/before-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/after-blob-id (clojure.spec.alpha/and :portkey.aws.codecommit/object-id))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/location (clojure.spec.alpha/and :portkey.aws.codecommit/location))
(clojure.spec.alpha/def :portkey.aws.codecommit.post-comment-for-compared-commit-output/comment (clojure.spec.alpha/and :portkey.aws.codecommit/comment))
(clojure.spec.alpha/def :portkey.aws.codecommit/post-comment-for-compared-commit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.post-comment-for-compared-commit-output/repository-name :portkey.aws.codecommit.post-comment-for-compared-commit-output/before-commit-id :portkey.aws.codecommit.post-comment-for-compared-commit-output/after-commit-id :portkey.aws.codecommit.post-comment-for-compared-commit-output/before-blob-id :portkey.aws.codecommit.post-comment-for-compared-commit-output/after-blob-id :portkey.aws.codecommit.post-comment-for-compared-commit-output/location :portkey.aws.codecommit.post-comment-for-compared-commit-output/comment]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-differences-output/differences (clojure.spec.alpha/and :portkey.aws.codecommit/difference-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-differences-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-differences-output/differences :portkey.aws.codecommit/next-token]))

(clojure.spec.alpha/def :portkey.aws.codecommit/source-and-destination-are-same-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/reference-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit.pull-request-status-changed-event-metadata/pull-request-status (clojure.spec.alpha/and :portkey.aws.codecommit/pull-request-status-enum))
(clojure.spec.alpha/def :portkey.aws.codecommit/pull-request-status-changed-event-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.pull-request-status-changed-event-metadata/pull-request-status]))

(clojure.spec.alpha/def :portkey.aws.codecommit.get-branch-output/branch (clojure.spec.alpha/and :portkey.aws.codecommit/branch-info))
(clojure.spec.alpha/def :portkey.aws.codecommit/get-branch-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.get-branch-output/branch]))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-not-associated-with-pull-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-branch-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/is-mergeable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-commit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit.batch-get-repositories-output/repositories (clojure.spec.alpha/and :portkey.aws.codecommit/repository-metadata-list))
(clojure.spec.alpha/def :portkey.aws.codecommit.batch-get-repositories-output/repositories-not-found (clojure.spec.alpha/and :portkey.aws.codecommit/repository-not-found-list))
(clojure.spec.alpha/def :portkey.aws.codecommit/batch-get-repositories-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.batch-get-repositories-output/repositories :portkey.aws.codecommit.batch-get-repositories-output/repositories-not-found]))

(clojure.spec.alpha/def :portkey.aws.codecommit/invalid-repository-trigger-custom-data-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/name-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/comments-for-compared-commit-data (clojure.spec.alpha/coll-of :portkey.aws.codecommit/comments-for-compared-commit))

(clojure.spec.alpha/def :portkey.aws.codecommit.user-info/name (clojure.spec.alpha/and :portkey.aws.codecommit/name))
(clojure.spec.alpha/def :portkey.aws.codecommit.user-info/email (clojure.spec.alpha/and :portkey.aws.codecommit/email))
(clojure.spec.alpha/def :portkey.aws.codecommit.user-info/date (clojure.spec.alpha/and :portkey.aws.codecommit/date))
(clojure.spec.alpha/def :portkey.aws.codecommit/user-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codecommit.user-info/name :portkey.aws.codecommit.user-info/email :portkey.aws.codecommit.user-info/date]))

(clojure.spec.alpha/def :portkey.aws.codecommit/encryption-key-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codecommit/additional-data (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codecommit/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.codecommit/repository-name))

(clojure.spec.alpha/def :portkey.aws.codecommit/restricted-source-file-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn create-commit "Creates a commit for a repository on the tip of a specified branch." ([create-commit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-commit-input create-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/create-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/create-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCommit", :http.request.configuration/output-deser-fn response-create-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidDeletionParameterException" :portkey.aws.codecommit/invalid-deletion-parameter-exception, "FileDoesNotExistException" :portkey.aws.codecommit/file-does-not-exist-exception, "FileNameConflictsWithDirectoryNameException" :portkey.aws.codecommit/file-name-conflicts-with-directory-name-exception, "FileEntryRequiredException" :portkey.aws.codecommit/file-entry-required-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "NoChangeException" :portkey.aws.codecommit/no-change-exception, "BranchDoesNotExistException" :portkey.aws.codecommit/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit/parent-commit-does-not-exist-exception, "SourceFileOrContentRequiredException" :portkey.aws.codecommit/source-file-or-content-required-exception, "FolderContentSizeLimitExceededException" :portkey.aws.codecommit/folder-content-size-limit-exceeded-exception, "InvalidFileModeException" :portkey.aws.codecommit/invalid-file-mode-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit/parent-commit-id-required-exception, "SamePathRequestException" :portkey.aws.codecommit/same-path-request-exception, "FileContentAndSourceFileSpecifiedException" :portkey.aws.codecommit/file-content-and-source-file-specified-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit/invalid-email-exception, "DirectoryNameConflictsWithFileNameException" :portkey.aws.codecommit/directory-name-conflicts-with-file-name-exception, "FileModeRequiredException" :portkey.aws.codecommit/file-mode-required-exception, "MaximumFileEntriesExceededException" :portkey.aws.codecommit/maximum-file-entries-exceeded-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit/parent-commit-id-outdated-exception, "FileContentSizeLimitExceededException" :portkey.aws.codecommit/file-content-size-limit-exceeded-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "PutFileEntryConflictException" :portkey.aws.codecommit/put-file-entry-conflict-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "FilePathConflictsWithSubmodulePathException" :portkey.aws.codecommit/file-path-conflicts-with-submodule-path-exception, "NameLengthExceededException" :portkey.aws.codecommit/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "RestrictedSourceFileException" :portkey.aws.codecommit/restricted-source-file-exception}})))))
(clojure.spec.alpha/fdef create-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/create-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/create-commit-output))

(clojure.core/defn get-repository-triggers "Gets information about triggers configured for a repository." ([get-repository-triggers-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-repository-triggers-input get-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRepositoryTriggers", :http.request.configuration/output-deser-fn response-get-repository-triggers-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-repository-triggers-output))

(clojure.core/defn get-repository "Returns information about a repository.\n The description field for a repository accepts all HTML characters and all\nvalid Unicode characters. Applications that do not HTML-encode the description\nand display it in a web page could expose users to potentially malicious code.\nMake sure that you HTML-encode the description field in any application that\nuses this API to display the repository description on a web page." ([get-repository-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-repository-input get-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRepository", :http.request.configuration/output-deser-fn response-get-repository-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-repository-output))

(clojure.core/defn list-repositories "Gets information about one or more repositories." ([] (list-repositories {})) ([list-repositories-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-repositories-input list-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/list-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/list-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRepositories", :http.request.configuration/output-deser-fn response-list-repositories-output, :http.request.spec/error-spec {"InvalidSortByException" :portkey.aws.codecommit/invalid-sort-by-exception, "InvalidOrderException" :portkey.aws.codecommit/invalid-order-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception}})))))
(clojure.spec.alpha/fdef list-repositories :args (clojure.spec.alpha/? :portkey.aws.codecommit/list-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/list-repositories-output))

(clojure.core/defn update-repository-name "Renames a repository. The repository name must be unique across the calling AWS\naccount. In addition, repository names are limited to 100 alphanumeric, dash,\nand underscore characters, and cannot include certain characters. The suffix\n\".git\" is prohibited. For a full description of the limits on repository names,\nsee Limits (http://docs.aws.amazon.com/codecommit/latest/userguide/limits.html)\nin the AWS CodeCommit User Guide." ([update-repository-name-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-repository-name-input update-repository-name-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-repository-name-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRepositoryName", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "RepositoryNameExistsException" :portkey.aws.codecommit/repository-name-exists-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception}})))))
(clojure.spec.alpha/fdef update-repository-name :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-repository-name-input) :ret clojure.core/true?)

(clojure.core/defn put-repository-triggers "Replaces all triggers for a repository. This can be used to create or delete\ntriggers." ([put-repository-triggers-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-repository-triggers-input put-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/put-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/put-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRepositoryTriggers", :http.request.configuration/output-deser-fn response-put-repository-triggers-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/put-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/put-repository-triggers-output))

(clojure.core/defn get-file "Returns the base-64 encoded contents of a specified file and its metadata." ([get-file-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-file-input get-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFile", :http.request.configuration/output-deser-fn response-get-file-output, :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit/file-too-large-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-file-output))

(clojure.core/defn batch-get-repositories "Returns information about one or more repositories.\n The description field for a repository accepts all HTML characters and all\nvalid Unicode characters. Applications that do not HTML-encode the description\nand display it in a web page could expose users to potentially malicious code.\nMake sure that you HTML-encode the description field in any application that\nuses this API to display the repository description on a web page." ([batch-get-repositories-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-repositories-input batch-get-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/batch-get-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/batch-get-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetRepositories", :http.request.configuration/output-deser-fn response-batch-get-repositories-output, :http.request.spec/error-spec {"RepositoryNamesRequiredException" :portkey.aws.codecommit/repository-names-required-exception, "MaximumRepositoryNamesExceededException" :portkey.aws.codecommit/maximum-repository-names-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef batch-get-repositories :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/batch-get-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/batch-get-repositories-output))

(clojure.core/defn delete-file "Deletes a specified file from a specified branch. A commit is created on the\nbranch that contains the revision. The file will still exist in the commits\nprior to the commit that contains the deletion." ([delete-file-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-file-input delete-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/delete-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/delete-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFile", :http.request.configuration/output-deser-fn response-delete-file-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "FileDoesNotExistException" :portkey.aws.codecommit/file-does-not-exist-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit/parent-commit-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit/invalid-email-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit/parent-commit-id-outdated-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "NameLengthExceededException" :portkey.aws.codecommit/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/delete-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/delete-file-output))

(clojure.core/defn get-commit "Returns information about a commit, including commit message and committer\ninformation." ([get-commit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-commit-input get-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommit", :http.request.configuration/output-deser-fn response-get-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdDoesNotExistException" :portkey.aws.codecommit/commit-id-does-not-exist-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-commit-output))

(clojure.core/defn post-comment-for-compared-commit "Posts a comment on the comparison between two commits." ([post-comment-for-compared-commit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-post-comment-for-compared-commit-input post-comment-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/post-comment-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/post-comment-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentForComparedCommit", :http.request.configuration/output-deser-fn response-post-comment-for-compared-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit/client-request-token-required-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit/path-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit/before-commit-id-and-after-commit-id-are-same-exception, "CommentContentRequiredException" :portkey.aws.codecommit/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit/invalid-file-location-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/post-comment-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/post-comment-for-compared-commit-output))

(clojure.core/defn update-pull-request-description "Replaces the contents of the description of a pull request." ([update-pull-request-description-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-pull-request-description-input update-pull-request-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/update-pull-request-description-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-pull-request-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestDescription", :http.request.configuration/output-deser-fn response-update-pull-request-description-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "InvalidDescriptionException" :portkey.aws.codecommit/invalid-description-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-pull-request-description-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/update-pull-request-description-output))

(clojure.core/defn get-folder "Returns the contents of a specified folder in a repository." ([get-folder-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-folder-input get-folder-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-folder-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-folder-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFolder", :http.request.configuration/output-deser-fn response-get-folder-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "FolderDoesNotExistException" :portkey.aws.codecommit/folder-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitException" :portkey.aws.codecommit/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-folder :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-folder-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-folder-output))

(clojure.core/defn update-comment "Replaces the contents of a comment." ([update-comment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-comment-input update-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/update-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateComment", :http.request.configuration/output-deser-fn response-update-comment-output, :http.request.spec/error-spec {"CommentContentRequiredException" :portkey.aws.codecommit/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit/invalid-comment-id-exception, "CommentNotCreatedByCallerException" :portkey.aws.codecommit/comment-not-created-by-caller-exception, "CommentDeletedException" :portkey.aws.codecommit/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef update-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/update-comment-output))

(clojure.core/defn delete-repository "Deletes a repository. If a specified repository was already deleted, a null\nrepository ID will be returned.\n Deleting a repository also deletes all associated objects and metadata. After a\nrepository is deleted, all future push calls to the deleted repository will\nfail." ([delete-repository-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-repository-input delete-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/delete-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/delete-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRepository", :http.request.configuration/output-deser-fn response-delete-repository-output, :http.request.spec/error-spec {"RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/delete-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/delete-repository-output))

(clojure.core/defn get-branch "Returns information about a repository branch, including its name and the last\ncommit ID." ([] (get-branch {})) ([get-branch-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-branch-input get-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBranch", :http.request.configuration/output-deser-fn response-get-branch-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-branch :args (clojure.spec.alpha/? :portkey.aws.codecommit/get-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-branch-output))

(clojure.core/defn get-blob "Returns the base-64 encoded content of an individual blob within a repository." ([get-blob-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-blob-input get-blob-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-blob-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-blob-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBlob", :http.request.configuration/output-deser-fn response-get-blob-output, :http.request.spec/error-spec {"FileTooLargeException" :portkey.aws.codecommit/file-too-large-exception, "InvalidBlobIdException" :portkey.aws.codecommit/invalid-blob-id-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "BlobIdDoesNotExistException" :portkey.aws.codecommit/blob-id-does-not-exist-exception, "BlobIdRequiredException" :portkey.aws.codecommit/blob-id-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-blob :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-blob-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-blob-output))

(clojure.core/defn get-differences "Returns information about the differences in a valid commit specifier (such as a\nbranch, tag, HEAD, commit ID or other fully qualified reference). Results can be\nlimited to a specified path." ([get-differences-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-differences-input get-differences-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-differences-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-differences-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDifferences", :http.request.configuration/output-deser-fn response-get-differences-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "PathDoesNotExistException" :portkey.aws.codecommit/path-does-not-exist-exception, "InvalidMaxResultsException" :portkey.aws.codecommit/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "InvalidCommitException" :portkey.aws.codecommit/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-differences :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-differences-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-differences-output))

(clojure.core/defn delete-comment-content "Deletes the content of a comment made on a change, file, or commit in a\nrepository." ([delete-comment-content-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-comment-content-input delete-comment-content-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/delete-comment-content-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/delete-comment-content-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCommentContent", :http.request.configuration/output-deser-fn response-delete-comment-content-output, :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef delete-comment-content :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/delete-comment-content-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/delete-comment-content-output))

(clojure.core/defn list-branches "Gets information about one or more branches in a repository." ([list-branches-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-branches-input list-branches-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/list-branches-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/list-branches-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBranches", :http.request.configuration/output-deser-fn response-list-branches-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-branches :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/list-branches-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/list-branches-output))

(clojure.core/defn get-comments-for-pull-request "Returns comments made on a pull request." ([get-comments-for-pull-request-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-comments-for-pull-request-input get-comments-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-comments-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-comments-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommentsForPullRequest", :http.request.configuration/output-deser-fn response-get-comments-for-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-comments-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-comments-for-pull-request-output))

(clojure.core/defn get-pull-request "Gets information about a pull request in a specified repository." ([get-pull-request-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-pull-request-input get-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPullRequest", :http.request.configuration/output-deser-fn response-get-pull-request-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-pull-request-output))

(clojure.core/defn get-comment "Returns the content of a comment made on a change, file, or commit in a\nrepository." ([get-comment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-comment-input get-comment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-comment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-comment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetComment", :http.request.configuration/output-deser-fn response-get-comment-output, :http.request.spec/error-spec {"CommentDoesNotExistException" :portkey.aws.codecommit/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit/invalid-comment-id-exception, "CommentDeletedException" :portkey.aws.codecommit/comment-deleted-exception}})))))
(clojure.spec.alpha/fdef get-comment :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-comment-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-comment-output))

(clojure.core/defn update-default-branch "Sets or changes the default branch name for the specified repository.\n If you use this operation to change the default branch name to the current\ndefault branch name, a success message is returned even though the default\nbranch did not change." ([update-default-branch-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-default-branch-input update-default-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-default-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDefaultBranch", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit/branch-does-not-exist-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-default-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-default-branch-input) :ret clojure.core/true?)

(clojure.core/defn post-comment-reply "Posts a comment in reply to an existing comment on a comparison between commits\nor a pull request." ([post-comment-reply-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-post-comment-reply-input post-comment-reply-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/post-comment-reply-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/post-comment-reply-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentReply", :http.request.configuration/output-deser-fn response-post-comment-reply-output, :http.request.spec/error-spec {"ClientRequestTokenRequiredException" :portkey.aws.codecommit/client-request-token-required-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit/invalid-client-request-token-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit/idempotency-parameter-mismatch-exception, "CommentContentRequiredException" :portkey.aws.codecommit/comment-content-required-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit/comment-content-size-limit-exceeded-exception, "CommentDoesNotExistException" :portkey.aws.codecommit/comment-does-not-exist-exception, "CommentIdRequiredException" :portkey.aws.codecommit/comment-id-required-exception, "InvalidCommentIdException" :portkey.aws.codecommit/invalid-comment-id-exception}})))))
(clojure.spec.alpha/fdef post-comment-reply :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/post-comment-reply-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/post-comment-reply-output))

(clojure.core/defn get-merge-conflicts "Returns information about merge conflicts between the before and after commit\nIDs for a pull request in a repository." ([get-merge-conflicts-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-merge-conflicts-input get-merge-conflicts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-merge-conflicts-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-merge-conflicts-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMergeConflicts", :http.request.configuration/output-deser-fn response-get-merge-conflicts-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidSourceCommitSpecifierException" :portkey.aws.codecommit/invalid-source-commit-specifier-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "MergeOptionRequiredException" :portkey.aws.codecommit/merge-option-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitRequiredException" :portkey.aws.codecommit/commit-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "TipsDivergenceExceededException" :portkey.aws.codecommit/tips-divergence-exceeded-exception, "InvalidDestinationCommitSpecifierException" :portkey.aws.codecommit/invalid-destination-commit-specifier-exception, "InvalidMergeOptionException" :portkey.aws.codecommit/invalid-merge-option-exception, "InvalidCommitException" :portkey.aws.codecommit/invalid-commit-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-merge-conflicts :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-merge-conflicts-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-merge-conflicts-output))

(clojure.core/defn create-pull-request "Creates a pull request in the specified repository." ([create-pull-request-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-pull-request-input create-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/create-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/create-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePullRequest", :http.request.configuration/output-deser-fn response-create-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit/client-request-token-required-exception, "MaximumOpenPullRequestsExceededException" :portkey.aws.codecommit/maximum-open-pull-requests-exceeded-exception, "InvalidReferenceNameException" :portkey.aws.codecommit/invalid-reference-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "InvalidTitleException" :portkey.aws.codecommit/invalid-title-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit/invalid-client-request-token-exception, "InvalidTargetException" :portkey.aws.codecommit/invalid-target-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "ReferenceNameRequiredException" :portkey.aws.codecommit/reference-name-required-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit/reference-does-not-exist-exception, "MultipleRepositoriesInPullRequestException" :portkey.aws.codecommit/multiple-repositories-in-pull-request-exception, "InvalidTargetsException" :portkey.aws.codecommit/invalid-targets-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "InvalidDescriptionException" :portkey.aws.codecommit/invalid-description-exception, "TargetsRequiredException" :portkey.aws.codecommit/targets-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "TitleRequiredException" :portkey.aws.codecommit/title-required-exception, "ReferenceTypeNotSupportedException" :portkey.aws.codecommit/reference-type-not-supported-exception, "TargetRequiredException" :portkey.aws.codecommit/target-required-exception, "SourceAndDestinationAreSameException" :portkey.aws.codecommit/source-and-destination-are-same-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/create-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/create-pull-request-output))

(clojure.core/defn merge-pull-request-by-fast-forward "Closes a pull request and attempts to merge the source commit of a pull request\ninto the specified destination branch for that pull request at the specified\ncommit using the fast-forward merge option." ([merge-pull-request-by-fast-forward-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-merge-pull-request-by-fast-forward-input merge-pull-request-by-fast-forward-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/merge-pull-request-by-fast-forward-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/merge-pull-request-by-fast-forward-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MergePullRequestByFastForward", :http.request.configuration/output-deser-fn response-merge-pull-request-by-fast-forward-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit/pull-request-already-closed-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "TipOfSourceReferenceIsDifferentException" :portkey.aws.codecommit/tip-of-source-reference-is-different-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "ReferenceDoesNotExistException" :portkey.aws.codecommit/reference-does-not-exist-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "ManualMergeRequiredException" :portkey.aws.codecommit/manual-merge-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef merge-pull-request-by-fast-forward :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/merge-pull-request-by-fast-forward-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/merge-pull-request-by-fast-forward-output))

(clojure.core/defn create-branch "Creates a new branch in a repository and points the branch to a commit.\n Calling the create branch operation does not set a repository's default branch.\nTo do this, call the update default branch operation." ([create-branch-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-branch-input create-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/create-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBranch", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "BranchNameExistsException" :portkey.aws.codecommit/branch-name-exists-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/create-branch-input) :ret clojure.core/true?)

(clojure.core/defn list-pull-requests "Returns a list of pull requests for a specified repository. The return list can\nbe refined by pull request status or pull request author ARN." ([list-pull-requests-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-pull-requests-input list-pull-requests-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/list-pull-requests-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/list-pull-requests-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPullRequests", :http.request.configuration/output-deser-fn response-list-pull-requests-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit/invalid-pull-request-status-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidAuthorArnException" :portkey.aws.codecommit/invalid-author-arn-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "AuthorDoesNotExistException" :portkey.aws.codecommit/author-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef list-pull-requests :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/list-pull-requests-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/list-pull-requests-output))

(clojure.core/defn describe-pull-request-events "Returns information about one or more pull request events." ([describe-pull-request-events-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-pull-request-events-input describe-pull-request-events-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/describe-pull-request-events-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/describe-pull-request-events-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePullRequestEvents", :http.request.configuration/output-deser-fn response-describe-pull-request-events-output, :http.request.spec/error-spec {"ActorDoesNotExistException" :portkey.aws.codecommit/actor-does-not-exist-exception, "EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit/invalid-max-results-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidPullRequestEventTypeException" :portkey.aws.codecommit/invalid-pull-request-event-type-exception, "InvalidActorArnException" :portkey.aws.codecommit/invalid-actor-arn-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef describe-pull-request-events :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/describe-pull-request-events-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/describe-pull-request-events-output))

(clojure.core/defn post-comment-for-pull-request "Posts a comment on a pull request." ([post-comment-for-pull-request-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-post-comment-for-pull-request-input post-comment-for-pull-request-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/post-comment-for-pull-request-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/post-comment-for-pull-request-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PostCommentForPullRequest", :http.request.configuration/output-deser-fn response-post-comment-for-pull-request-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidFilePositionException" :portkey.aws.codecommit/invalid-file-position-exception, "ClientRequestTokenRequiredException" :portkey.aws.codecommit/client-request-token-required-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidClientRequestTokenException" :portkey.aws.codecommit/invalid-client-request-token-exception, "PathDoesNotExistException" :portkey.aws.codecommit/path-does-not-exist-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "IdempotencyParameterMismatchException" :portkey.aws.codecommit/idempotency-parameter-mismatch-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "BeforeCommitIdAndAfterCommitIdAreSameException" :portkey.aws.codecommit/before-commit-id-and-after-commit-id-are-same-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "CommentContentRequiredException" :portkey.aws.codecommit/comment-content-required-exception, "InvalidRelativeFileVersionEnumException" :portkey.aws.codecommit/invalid-relative-file-version-enum-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "CommentContentSizeLimitExceededException" :portkey.aws.codecommit/comment-content-size-limit-exceeded-exception, "InvalidFileLocationException" :portkey.aws.codecommit/invalid-file-location-exception, "RepositoryNotAssociatedWithPullRequestException" :portkey.aws.codecommit/repository-not-associated-with-pull-request-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef post-comment-for-pull-request :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/post-comment-for-pull-request-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/post-comment-for-pull-request-output))

(clojure.core/defn put-file "Adds or updates a file in a branch in an AWS CodeCommit repository, and\ngenerates a commit for the addition in the specified branch." ([put-file-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-file-input put-file-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/put-file-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/put-file-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutFile", :http.request.configuration/output-deser-fn response-put-file-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidDeletionParameterException" :portkey.aws.codecommit/invalid-deletion-parameter-exception, "FileNameConflictsWithDirectoryNameException" :portkey.aws.codecommit/file-name-conflicts-with-directory-name-exception, "InvalidPathException" :portkey.aws.codecommit/invalid-path-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "CommitMessageLengthExceededException" :portkey.aws.codecommit/commit-message-length-exceeded-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "BranchDoesNotExistException" :portkey.aws.codecommit/branch-does-not-exist-exception, "ParentCommitDoesNotExistException" :portkey.aws.codecommit/parent-commit-does-not-exist-exception, "FolderContentSizeLimitExceededException" :portkey.aws.codecommit/folder-content-size-limit-exceeded-exception, "InvalidFileModeException" :portkey.aws.codecommit/invalid-file-mode-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "ParentCommitIdRequiredException" :portkey.aws.codecommit/parent-commit-id-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidEmailException" :portkey.aws.codecommit/invalid-email-exception, "DirectoryNameConflictsWithFileNameException" :portkey.aws.codecommit/directory-name-conflicts-with-file-name-exception, "ParentCommitIdOutdatedException" :portkey.aws.codecommit/parent-commit-id-outdated-exception, "FileContentSizeLimitExceededException" :portkey.aws.codecommit/file-content-size-limit-exceeded-exception, "BranchNameIsTagNameException" :portkey.aws.codecommit/branch-name-is-tag-name-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "PathRequiredException" :portkey.aws.codecommit/path-required-exception, "InvalidParentCommitIdException" :portkey.aws.codecommit/invalid-parent-commit-id-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "SameFileContentException" :portkey.aws.codecommit/same-file-content-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "FileContentRequiredException" :portkey.aws.codecommit/file-content-required-exception, "FilePathConflictsWithSubmodulePathException" :portkey.aws.codecommit/file-path-conflicts-with-submodule-path-exception, "NameLengthExceededException" :portkey.aws.codecommit/name-length-exceeded-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef put-file :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/put-file-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/put-file-output))

(clojure.core/defn update-pull-request-status "Updates the status of a pull request." ([update-pull-request-status-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-pull-request-status-input update-pull-request-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/update-pull-request-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-pull-request-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestStatus", :http.request.configuration/output-deser-fn response-update-pull-request-status-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidPullRequestStatusException" :portkey.aws.codecommit/invalid-pull-request-status-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "InvalidPullRequestStatusUpdateException" :portkey.aws.codecommit/invalid-pull-request-status-update-exception, "PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "PullRequestStatusRequiredException" :portkey.aws.codecommit/pull-request-status-required-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-status :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-pull-request-status-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/update-pull-request-status-output))

(clojure.core/defn test-repository-triggers "Tests the functionality of repository triggers by sending information to the\ntrigger target. If real data is available in the repository, the test will send\ndata from the last commit. If no data is available, sample data will be\ngenerated." ([test-repository-triggers-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-test-repository-triggers-input test-repository-triggers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/test-repository-triggers-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/test-repository-triggers-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestRepositoryTriggers", :http.request.configuration/output-deser-fn response-test-repository-triggers-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "MaximumRepositoryTriggersExceededException" :portkey.aws.codecommit/maximum-repository-triggers-exceeded-exception, "InvalidRepositoryTriggerNameException" :portkey.aws.codecommit/invalid-repository-trigger-name-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "RepositoryTriggerBranchNameListRequiredException" :portkey.aws.codecommit/repository-trigger-branch-name-list-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryTriggerDestinationArnRequiredException" :portkey.aws.codecommit/repository-trigger-destination-arn-required-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryTriggerRegionException" :portkey.aws.codecommit/invalid-repository-trigger-region-exception, "MaximumBranchesExceededException" :portkey.aws.codecommit/maximum-branches-exceeded-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "InvalidRepositoryTriggerDestinationArnException" :portkey.aws.codecommit/invalid-repository-trigger-destination-arn-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "RepositoryTriggerNameRequiredException" :portkey.aws.codecommit/repository-trigger-name-required-exception, "RepositoryTriggerEventsListRequiredException" :portkey.aws.codecommit/repository-trigger-events-list-required-exception, "InvalidRepositoryTriggerEventsException" :portkey.aws.codecommit/invalid-repository-trigger-events-exception, "RepositoryTriggersListRequiredException" :portkey.aws.codecommit/repository-triggers-list-required-exception, "InvalidRepositoryTriggerBranchNameException" :portkey.aws.codecommit/invalid-repository-trigger-branch-name-exception, "InvalidRepositoryTriggerCustomDataException" :portkey.aws.codecommit/invalid-repository-trigger-custom-data-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef test-repository-triggers :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/test-repository-triggers-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/test-repository-triggers-output))

(clojure.core/defn delete-branch "Deletes a branch from a repository, unless that branch is the default branch for\nthe repository." ([delete-branch-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-branch-input delete-branch-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/delete-branch-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/delete-branch-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBranch", :http.request.configuration/output-deser-fn response-delete-branch-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "BranchNameRequiredException" :portkey.aws.codecommit/branch-name-required-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "DefaultBranchCannotBeDeletedException" :portkey.aws.codecommit/default-branch-cannot-be-deleted-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidBranchNameException" :portkey.aws.codecommit/invalid-branch-name-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef delete-branch :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/delete-branch-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/delete-branch-output))

(clojure.core/defn update-repository-description "Sets or changes the comment or description for a repository.\n The description field for a repository accepts all HTML characters and all\nvalid Unicode characters. Applications that do not HTML-encode the description\nand display it in a web page could expose users to potentially malicious code.\nMake sure that you HTML-encode the description field in any application that\nuses this API to display the repository description on a web page." ([update-repository-description-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-repository-description-input update-repository-description-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-repository-description-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRepositoryDescription", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef update-repository-description :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-repository-description-input) :ret clojure.core/true?)

(clojure.core/defn update-pull-request-title "Replaces the title of a pull request." ([update-pull-request-title-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-pull-request-title-input update-pull-request-title-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/update-pull-request-title-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/update-pull-request-title-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePullRequestTitle", :http.request.configuration/output-deser-fn response-update-pull-request-title-output, :http.request.spec/error-spec {"PullRequestDoesNotExistException" :portkey.aws.codecommit/pull-request-does-not-exist-exception, "InvalidPullRequestIdException" :portkey.aws.codecommit/invalid-pull-request-id-exception, "PullRequestIdRequiredException" :portkey.aws.codecommit/pull-request-id-required-exception, "TitleRequiredException" :portkey.aws.codecommit/title-required-exception, "InvalidTitleException" :portkey.aws.codecommit/invalid-title-exception, "PullRequestAlreadyClosedException" :portkey.aws.codecommit/pull-request-already-closed-exception}})))))
(clojure.spec.alpha/fdef update-pull-request-title :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/update-pull-request-title-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/update-pull-request-title-output))

(clojure.core/defn create-repository "Creates a new, empty repository." ([create-repository-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-repository-input create-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/create-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/create-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRepository", :http.request.configuration/output-deser-fn response-create-repository-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "InvalidRepositoryDescriptionException" :portkey.aws.codecommit/invalid-repository-description-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "RepositoryLimitExceededException" :portkey.aws.codecommit/repository-limit-exceeded-exception, "RepositoryNameExistsException" :portkey.aws.codecommit/repository-name-exists-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/create-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/create-repository-output))

(clojure.core/defn get-comments-for-compared-commit "Returns information about comments made on the comparison between two commits." ([get-comments-for-compared-commit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-comments-for-compared-commit-input get-comments-for-compared-commit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codecommit/endpoints, :http.request.configuration/target-prefix "CodeCommit_20150413", :http.request.spec/output-spec :portkey.aws.codecommit/get-comments-for-compared-commit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-13", :http.request.configuration/service-id "CodeCommit", :http.request.spec/input-spec :portkey.aws.codecommit/get-comments-for-compared-commit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCommentsForComparedCommit", :http.request.configuration/output-deser-fn response-get-comments-for-compared-commit-output, :http.request.spec/error-spec {"EncryptionKeyNotFoundException" :portkey.aws.codecommit/encryption-key-not-found-exception, "EncryptionIntegrityChecksFailedException" :portkey.aws.codecommit/encryption-integrity-checks-failed-exception, "EncryptionKeyAccessDeniedException" :portkey.aws.codecommit/encryption-key-access-denied-exception, "InvalidMaxResultsException" :portkey.aws.codecommit/invalid-max-results-exception, "InvalidContinuationTokenException" :portkey.aws.codecommit/invalid-continuation-token-exception, "EncryptionKeyUnavailableException" :portkey.aws.codecommit/encryption-key-unavailable-exception, "RepositoryNameRequiredException" :portkey.aws.codecommit/repository-name-required-exception, "CommitDoesNotExistException" :portkey.aws.codecommit/commit-does-not-exist-exception, "InvalidRepositoryNameException" :portkey.aws.codecommit/invalid-repository-name-exception, "CommitIdRequiredException" :portkey.aws.codecommit/commit-id-required-exception, "RepositoryDoesNotExistException" :portkey.aws.codecommit/repository-does-not-exist-exception, "InvalidCommitIdException" :portkey.aws.codecommit/invalid-commit-id-exception, "EncryptionKeyDisabledException" :portkey.aws.codecommit/encryption-key-disabled-exception}})))))
(clojure.spec.alpha/fdef get-comments-for-compared-commit :args (clojure.spec.alpha/tuple :portkey.aws.codecommit/get-comments-for-compared-commit-input) :ret (clojure.spec.alpha/and :portkey.aws.codecommit/get-comments-for-compared-commit-output))
