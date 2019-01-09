(ns portkey.aws.workspaces (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-1"},
    :ssl-common-name "workspaces.ap-northeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "workspaces", :region "eu-west-1"},
    :ssl-common-name "workspaces.eu-west-1.amazonaws.com",
    :endpoint "https://workspaces.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-2"},
    :ssl-common-name "workspaces.ap-southeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "workspaces", :region "sa-east-1"},
    :ssl-common-name "workspaces.sa-east-1.amazonaws.com",
    :endpoint "https://workspaces.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "workspaces", :region "ap-southeast-1"},
    :ssl-common-name "workspaces.ap-southeast-1.amazonaws.com",
    :endpoint "https://workspaces.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "workspaces", :region "ap-northeast-2"},
    :ssl-common-name "workspaces.ap-northeast-2.amazonaws.com",
    :endpoint "https://workspaces.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "workspaces", :region "ca-central-1"},
    :ssl-common-name "workspaces.ca-central-1.amazonaws.com",
    :endpoint "https://workspaces.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "workspaces", :region "eu-central-1"},
    :ssl-common-name "workspaces.eu-central-1.amazonaws.com",
    :endpoint "https://workspaces.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "workspaces", :region "eu-west-2"},
    :ssl-common-name "workspaces.eu-west-2.amazonaws.com",
    :endpoint "https://workspaces.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workspaces", :region "us-west-2"},
    :ssl-common-name "workspaces.us-west-2.amazonaws.com",
    :endpoint "https://workspaces.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workspaces", :region "us-east-1"},
    :ssl-common-name "workspaces.us-east-1.amazonaws.com",
    :endpoint "https://workspaces.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-workspace-request-list)

(clojure.core/declare ser-start-request)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-ip-rule-item)

(clojure.core/declare ser-ip-rule-desc)

(clojure.core/declare ser-start-workspace-requests)

(clojure.core/declare ser-reboot-workspace-requests)

(clojure.core/declare ser-compute)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-ip-group-name)

(clojure.core/declare ser-rebuild-request)

(clojure.core/declare ser-terminate-request)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-ip-group-id-list)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-reboot-request)

(clojure.core/declare ser-root-volume-size-gib)

(clojure.core/declare ser-ip-rule-list)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-workspace-properties)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-rebuild-workspace-requests)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-stop-workspace-requests)

(clojure.core/declare ser-terminate-workspace-requests)

(clojure.core/declare ser-running-mode)

(clojure.core/declare ser-workspace-request)

(clojure.core/declare ser-running-mode-auto-stop-timeout-in-minutes)

(clojure.core/declare ser-volume-encryption-key)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-ip-group-desc)

(clojure.core/declare ser-bundle-id-list)

(clojure.core/declare ser-bundle-id)

(clojure.core/declare ser-ip-rule)

(clojure.core/declare ser-ip-group-id)

(clojure.core/declare ser-stop-request)

(clojure.core/declare ser-directory-id)

(clojure.core/declare ser-bundle-owner)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-directory-id-list)

(clojure.core/declare ser-workspace-id)

(clojure.core/declare ser-target-workspace-state)

(clojure.core/declare ser-ip-revoked-rule-list)

(clojure.core/declare ser-workspace-id-list)

(clojure.core/declare ser-user-volume-size-gib)

(clojure.core/defn- ser-workspace-request-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-workspace-request coll) #:http.request.field{:shape "WorkspaceRequest"}))) input), :shape "WorkspaceRequestList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-start-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StartRequest", :type "structure"} (clojure.core/contains? input :workspace-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}))))

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-ip-rule-item [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpRuleItem", :type "structure"} (clojure.core/contains? input :ip-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule (input :ip-rule)) #:http.request.field{:name "ipRule", :shape "IpRule"})) (clojure.core/contains? input :rule-desc) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule-desc (input :rule-desc)) #:http.request.field{:name "ruleDesc", :shape "IpRuleDesc"}))))

(clojure.core/defn- ser-ip-rule-desc [input] #:http.request.field{:value input, :shape "IpRuleDesc"})

(clojure.core/defn- ser-start-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-start-request coll) #:http.request.field{:shape "StartRequest"}))) input), :shape "StartWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-reboot-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-reboot-request coll) #:http.request.field{:shape "RebootRequest"}))) input), :shape "RebootWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-compute [input] #:http.request.field{:value (clojure.core/get {"VALUE" "VALUE", :performance "PERFORMANCE", :value "VALUE", "POWER" "POWER", "GRAPHICS" "GRAPHICS", :power "POWER", "STANDARD" "STANDARD", :graphics "GRAPHICS", :standard "STANDARD", "PERFORMANCE" "PERFORMANCE"} input), :shape "Compute"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-ip-group-name [input] #:http.request.field{:value input, :shape "IpGroupName"})

(clojure.core/defn- ser-rebuild-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "RebuildRequest", :type "structure"}))

(clojure.core/defn- ser-terminate-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "TerminateRequest", :type "structure"}))

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-ip-group-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-group-id coll) #:http.request.field{:shape "IpGroupId"}))) input), :shape "IpGroupIdList", :type "list"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-reboot-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workspace-id (:workspace-id input)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"})], :shape "RebootRequest", :type "structure"}))

(clojure.core/defn- ser-root-volume-size-gib [input] #:http.request.field{:value input, :shape "RootVolumeSizeGib"})

(clojure.core/defn- ser-ip-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-rule-item coll) #:http.request.field{:shape "IpRuleItem"}))) input), :shape "IpRuleList", :type "list"})

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-workspace-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WorkspaceProperties", :type "structure"} (clojure.core/contains? input :running-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-running-mode (input :running-mode)) #:http.request.field{:name "RunningMode", :shape "RunningMode"})) (clojure.core/contains? input :running-mode-auto-stop-timeout-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-running-mode-auto-stop-timeout-in-minutes (input :running-mode-auto-stop-timeout-in-minutes)) #:http.request.field{:name "RunningModeAutoStopTimeoutInMinutes", :shape "RunningModeAutoStopTimeoutInMinutes"})) (clojure.core/contains? input :root-volume-size-gib) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-root-volume-size-gib (input :root-volume-size-gib)) #:http.request.field{:name "RootVolumeSizeGib", :shape "RootVolumeSizeGib"})) (clojure.core/contains? input :user-volume-size-gib) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-volume-size-gib (input :user-volume-size-gib)) #:http.request.field{:name "UserVolumeSizeGib", :shape "UserVolumeSizeGib"})) (clojure.core/contains? input :compute-type-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute (input :compute-type-name)) #:http.request.field{:name "ComputeTypeName", :shape "Compute"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-rebuild-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rebuild-request coll) #:http.request.field{:shape "RebuildRequest"}))) input), :shape "RebuildWorkspaceRequests", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-stop-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stop-request coll) #:http.request.field{:shape "StopRequest"}))) input), :shape "StopWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-terminate-workspace-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-terminate-request coll) #:http.request.field{:shape "TerminateRequest"}))) input), :shape "TerminateWorkspaceRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-running-mode [input] #:http.request.field{:value (clojure.core/get {"AUTO_STOP" "AUTO_STOP", :auto-stop "AUTO_STOP", "ALWAYS_ON" "ALWAYS_ON", :always-on "ALWAYS_ON"} input), :shape "RunningMode"})

(clojure.core/defn- ser-workspace-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-directory-id (:directory-id input)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-user-name (:user-name input)) #:http.request.field{:name "UserName", :shape "UserName"}) (clojure.core/into (ser-bundle-id (:bundle-id input)) #:http.request.field{:name "BundleId", :shape "BundleId"})], :shape "WorkspaceRequest", :type "structure"} (clojure.core/contains? input :volume-encryption-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-encryption-key (input :volume-encryption-key)) #:http.request.field{:name "VolumeEncryptionKey", :shape "VolumeEncryptionKey"})) (clojure.core/contains? input :user-volume-encryption-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :user-volume-encryption-enabled)) #:http.request.field{:name "UserVolumeEncryptionEnabled", :shape "BooleanObject"})) (clojure.core/contains? input :root-volume-encryption-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :root-volume-encryption-enabled)) #:http.request.field{:name "RootVolumeEncryptionEnabled", :shape "BooleanObject"})) (clojure.core/contains? input :workspace-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-properties (input :workspace-properties)) #:http.request.field{:name "WorkspaceProperties", :shape "WorkspaceProperties"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- ser-running-mode-auto-stop-timeout-in-minutes [input] #:http.request.field{:value input, :shape "RunningModeAutoStopTimeoutInMinutes"})

(clojure.core/defn- ser-volume-encryption-key [input] #:http.request.field{:value input, :shape "VolumeEncryptionKey"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-ip-group-desc [input] #:http.request.field{:value input, :shape "IpGroupDesc"})

(clojure.core/defn- ser-bundle-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bundle-id coll) #:http.request.field{:shape "BundleId"}))) input), :shape "BundleIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-bundle-id [input] #:http.request.field{:value input, :shape "BundleId"})

(clojure.core/defn- ser-ip-rule [input] #:http.request.field{:value input, :shape "IpRule"})

(clojure.core/defn- ser-ip-group-id [input] #:http.request.field{:value input, :shape "IpGroupId"})

(clojure.core/defn- ser-stop-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StopRequest", :type "structure"} (clojure.core/contains? input :workspace-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}))))

(clojure.core/defn- ser-directory-id [input] #:http.request.field{:value input, :shape "DirectoryId"})

(clojure.core/defn- ser-bundle-owner [input] #:http.request.field{:value input, :shape "BundleOwner"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-directory-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-directory-id coll) #:http.request.field{:shape "DirectoryId"}))) input), :shape "DirectoryIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-workspace-id [input] #:http.request.field{:value input, :shape "WorkspaceId"})

(clojure.core/defn- ser-target-workspace-state [input] #:http.request.field{:value (clojure.core/get {"AVAILABLE" "AVAILABLE", :available "AVAILABLE", "ADMIN_MAINTENANCE" "ADMIN_MAINTENANCE", :admin-maintenance "ADMIN_MAINTENANCE"} input), :shape "TargetWorkspaceState"})

(clojure.core/defn- ser-ip-revoked-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-rule coll) #:http.request.field{:shape "IpRule"}))) input), :shape "IpRevokedRuleList", :type "list"})

(clojure.core/defn- ser-workspace-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-workspace-id coll) #:http.request.field{:shape "WorkspaceId"}))) input), :shape "WorkspaceIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-user-volume-size-gib [input] #:http.request.field{:value input, :shape "UserVolumeSizeGib"})

(clojure.core/defn- req-describe-workspace-bundles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :bundle-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-id-list (input :bundle-ids)) #:http.request.field{:name "BundleIds", :shape "BundleIdList"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-owner (input :owner)) #:http.request.field{:name "Owner", :shape "BundleOwner"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-authorize-ip-rules-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"})]}))

(clojure.core/defn- req-describe-workspace-directories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id-list (input :directory-ids)) #:http.request.field{:name "DirectoryIds", :shape "DirectoryIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-describe-workspaces-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :workspace-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id-list (input :workspace-ids)) #:http.request.field{:name "WorkspaceIds", :shape "WorkspaceIdList"})) (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :bundle-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-id (input :bundle-id)) #:http.request.field{:name "BundleId", :shape "BundleId"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-stop-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stop-workspace-requests (input :stop-workspace-requests)) #:http.request.field{:name "StopWorkspaceRequests", :shape "StopWorkspaceRequests"})]}))

(clojure.core/defn- req-delete-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"})]}))

(clojure.core/defn- req-update-rules-of-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-terminate-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-terminate-workspace-requests (input :terminate-workspace-requests)) #:http.request.field{:name "TerminateWorkspaceRequests", :shape "TerminateWorkspaceRequests"})]}))

(clojure.core/defn- req-rebuild-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rebuild-workspace-requests (input :rebuild-workspace-requests)) #:http.request.field{:name "RebuildWorkspaceRequests", :shape "RebuildWorkspaceRequests"})]}))

(clojure.core/defn- req-modify-workspace-properties-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}) (clojure.core/into (ser-workspace-properties (input :workspace-properties)) #:http.request.field{:name "WorkspaceProperties", :shape "WorkspaceProperties"})]}))

(clojure.core/defn- req-start-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-start-workspace-requests (input :start-workspace-requests)) #:http.request.field{:name "StartWorkspaceRequests", :shape "StartWorkspaceRequests"})]}))

(clojure.core/defn- req-modify-workspace-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-id (input :workspace-id)) #:http.request.field{:name "WorkspaceId", :shape "WorkspaceId"}) (clojure.core/into (ser-target-workspace-state (input :workspace-state)) #:http.request.field{:name "WorkspaceState", :shape "TargetWorkspaceState"})]}))

(clojure.core/defn- req-revoke-ip-rules-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "IpGroupId"}) (clojure.core/into (ser-ip-revoked-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRevokedRuleList"})]}))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-ip-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ip-group-name (input :group-name)) #:http.request.field{:name "GroupName", :shape "IpGroupName"})]} (clojure.core/contains? input :group-desc) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-group-desc (input :group-desc)) #:http.request.field{:name "GroupDesc", :shape "IpGroupDesc"})) (clojure.core/contains? input :user-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-rule-list (input :user-rules)) #:http.request.field{:name "UserRules", :shape "IpRuleList"}))))

(clojure.core/defn- req-describe-workspaces-connection-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :workspace-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workspace-id-list (input :workspace-ids)) #:http.request.field{:name "WorkspaceIds", :shape "WorkspaceIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-associate-ip-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})]}))

(clojure.core/defn- req-create-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workspace-request-list (input :workspaces)) #:http.request.field{:name "Workspaces", :shape "WorkspaceRequestList"})]}))

(clojure.core/defn- req-disassociate-ip-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})]}))

(clojure.core/defn- req-reboot-workspaces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-reboot-workspace-requests (input :reboot-workspace-requests)) #:http.request.field{:name "RebootWorkspaceRequests", :shape "RebootWorkspaceRequests"})]}))

(clojure.core/defn- req-describe-ip-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-group-id-list (input :group-ids)) #:http.request.field{:name "GroupIds", :shape "IpGroupIdList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "Limit"}))))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-request-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/bundle-ids (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/owner (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-owner))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-bundles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-bundles-request/bundle-ids :portkey.aws.workspaces.describe-workspace-bundles-request/owner :portkey.aws.workspaces.describe-workspace-bundles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.authorize-ip-rules-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.authorize-ip-rules-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/authorize-ip-rules-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.authorize-ip-rules-request/group-id :portkey.aws.workspaces.authorize-ip-rules-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/update-rules-of-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.invalid-parameter-values-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/invalid-parameter-values-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.invalid-parameter-values-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/dns-ip-addresses (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-address))

(clojure.spec.alpha/def :portkey.aws.workspaces/delete-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/iam-role-id (clojure.spec.alpha/and :portkey.aws.workspaces/arn))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/workspace-security-group-id (clojure.spec.alpha/and :portkey.aws.workspaces/security-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/customer-user-name (clojure.spec.alpha/and :portkey.aws.workspaces/user-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/directory-type (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-directory-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/ip-group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/state (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-directory-state))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-directory/workspace-creation-properties (clojure.spec.alpha/and :portkey.aws.workspaces/default-workspace-creation-properties))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/dns-ip-addresses :portkey.aws.workspaces/subnet-ids :portkey.aws.workspaces.workspace-directory/iam-role-id :portkey.aws.workspaces/alias :portkey.aws.workspaces.workspace-directory/workspace-security-group-id :portkey.aws.workspaces.workspace-directory/customer-user-name :portkey.aws.workspaces.workspace-directory/directory-type :portkey.aws.workspaces/directory-id :portkey.aws.workspaces.workspace-directory/ip-group-ids :portkey.aws.workspaces/directory-name :portkey.aws.workspaces.workspace-directory/state :portkey.aws.workspaces.workspace-directory/workspace-creation-properties :portkey.aws.workspaces/registration-code]))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-start-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-result/workspaces-connection-status (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-connection-status-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-connection-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-connection-status-result/workspaces-connection-status :portkey.aws.workspaces.describe-workspaces-connection-status-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/default-ou (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-resource-enum #{"ROOT_VOLUME" "USER_VOLUME" :user-volume "COMPUTE_TYPE" :compute-type :root-volume})

(clojure.spec.alpha/def :portkey.aws.workspaces/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.workspaces/subnet-id))

(clojure.spec.alpha/def :portkey.aws.workspaces/associate-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-request/directory-ids (clojure.spec.alpha/and :portkey.aws.workspaces/directory-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-directories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-directories-request/directory-ids :portkey.aws.workspaces.describe-workspace-directories-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.ip-rule-item/ip-rule (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule))
(clojure.spec.alpha/def :portkey.aws.workspaces.ip-rule-item/rule-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.ip-rule-item/ip-rule :portkey.aws.workspaces.ip-rule-item/rule-desc]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-desc (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspaces-ip-groups-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspaces-ip-group))

(clojure.spec.alpha/def :portkey.aws.workspaces.terminate-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-terminate-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.terminate-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-request/workspace-ids (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-request/workspace-ids :portkey.aws.workspaces/directory-id :portkey.aws.workspaces/user-name :portkey.aws.workspaces/bundle-id :portkey.aws.workspaces/limit :portkey.aws.workspaces.describe-workspaces-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/start-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-connection-status-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-connection-status))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-create-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-create-workspace-request))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-stop-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(subnet-[0-9a-f]{8})$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/connection-state #{"UNKNOWN" :disconnected :unknown :connected "CONNECTED" "DISCONNECTED"})

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/stop-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-creation-failed-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-creation-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-creation-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.delete-ip-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/delete-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.delete-ip-group-request/group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.update-rules-of-ip-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.update-rules-of-ip-group-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/update-rules-of-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.update-rules-of-ip-group-request/group-id :portkey.aws.workspaces.update-rules-of-ip-group-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/reboot-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/compute #{"VALUE" :performance :value "POWER" "GRAPHICS" :power "STANDARD" :graphics :standard "PERFORMANCE"})

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-reboot-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-bundle/name (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-bundle/owner (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-owner))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-bundle (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/bundle-id :portkey.aws.workspaces.workspace-bundle/name :portkey.aws.workspaces.workspace-bundle/owner :portkey.aws.workspaces/description :portkey.aws.workspaces/root-storage :portkey.aws.workspaces/user-storage :portkey.aws.workspaces/compute-type]))

(clojure.spec.alpha/def :portkey.aws.workspaces.delete-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.delete-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.workspaces/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.delete-tags-request/resource-id :portkey.aws.workspaces.delete-tags-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.workspaces/alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/terminate-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-result/bundles (clojure.spec.alpha/and :portkey.aws.workspaces/bundle-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-bundles-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-bundles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-bundles-result/bundles :portkey.aws.workspaces.describe-workspace-bundles-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/rebuild-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-bundle))

(clojure.spec.alpha/def :portkey.aws.workspaces/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-group-id))

(clojure.spec.alpha/def :portkey.aws.workspaces/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.operation-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/operation-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.operation-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/limit (clojure.spec.alpha/int-in 1 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-properties-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces/workspace-properties] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/start-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-name (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/group-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspaces-ip-group/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspaces-ip-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.workspaces-ip-group/group-id :portkey.aws.workspaces.workspaces-ip-group/group-name :portkey.aws.workspaces.workspaces-ip-group/group-desc :portkey.aws.workspaces.workspaces-ip-group/user-rules]))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-terminate-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces.failed-workspace-change-request/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/error-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.failed-workspace-change-request/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/failed-workspace-change-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces.failed-workspace-change-request/error-code :portkey.aws.workspaces.failed-workspace-change-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory-type #{:simple-ad :ad-connector "SIMPLE_AD" "AD_CONNECTOR"})

(clojure.spec.alpha/def :portkey.aws.workspaces/root-volume-size-gib clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces/delete-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/revoke-ip-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.modify-workspace-state-request/workspace-state (clojure.spec.alpha/and :portkey.aws.workspaces/target-workspace-state))
(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces.modify-workspace-state-request/workspace-state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-rule-item))

(clojure.spec.alpha/def :portkey.aws.workspaces/error-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/describe-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/tag-list]))

(clojure.spec.alpha/def :portkey.aws.workspaces.revoke-ip-rules-request/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.revoke-ip-rules-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-revoked-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/revoke-ip-rules-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.revoke-ip-rules-request/group-id :portkey.aws.workspaces.revoke-ip-rules-request/user-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.rebuild-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-rebuild-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.rebuild-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-properties/compute-type-name (clojure.spec.alpha/and :portkey.aws.workspaces/compute))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/running-mode :portkey.aws.workspaces/running-mode-auto-stop-timeout-in-minutes :portkey.aws.workspaces/root-volume-size-gib :portkey.aws.workspaces/user-volume-size-gib :portkey.aws.workspaces.workspace-properties/compute-type-name]))

(clojure.spec.alpha/def :portkey.aws.workspaces.stop-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-stop-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.stop-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state-enum #{"UPDATE_INITIATED" "UPDATE_IN_PROGRESS" :update-initiated :update-in-progress})

(clojure.spec.alpha/def :portkey.aws.workspaces.root-storage/capacity (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/root-storage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.root-storage/capacity]))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/tag))

(clojure.spec.alpha/def :portkey.aws.workspaces/rebuild-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/rebuild-request :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/stop-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/terminate-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/terminate-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-associated-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-associated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-associated-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces.resource-not-found-exception/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-not-found-exception/message :portkey.aws.workspaces.resource-not-found-exception/resource-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-tags-request/tags (clojure.spec.alpha/and :portkey.aws.workspaces/tag-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-tags-request/resource-id :portkey.aws.workspaces.create-tags-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/running-mode #{"ALWAYS_ON" :always-on :auto-stop "AUTO_STOP"})

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/user-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/root-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-request/tags (clojure.spec.alpha/and :portkey.aws.workspaces/tag-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces/user-name :portkey.aws.workspaces/bundle-id] :opt-un [:portkey.aws.workspaces/volume-encryption-key :portkey.aws.workspaces.workspace-request/user-volume-encryption-enabled :portkey.aws.workspaces.workspace-request/root-volume-encryption-enabled :portkey.aws.workspaces/workspace-properties :portkey.aws.workspaces.workspace-request/tags]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-state #{:admin-maintenance :starting :pending "MAINTENANCE" :unhealthy "AVAILABLE" "UPDATING" "REBOOTING" "TERMINATED" "PENDING" "ERROR" :suspended :stopping :terminating :stopped :rebooting "REBUILDING" "STOPPED" "STARTING" :terminated "ADMIN_MAINTENANCE" :maintenance :updating :impaired :error :rebuilding :available "IMPAIRED" "STOPPING" "TERMINATING" "SUSPENDED" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.workspaces/running-mode-auto-stop-timeout-in-minutes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces/volume-encryption-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.reboot-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-reboot-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.reboot-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/modification-state))

(clojure.spec.alpha/def :portkey.aws.workspaces/failed-rebuild-workspace-requests (clojure.spec.alpha/coll-of :portkey.aws.workspaces/failed-workspace-change-request))

(clojure.spec.alpha/def :portkey.aws.workspaces/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(sg-[0-9a-f]{8})$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-error-code))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/modification-states (clojure.spec.alpha/and :portkey.aws.workspaces/modification-state-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/user-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/state (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-state))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace/root-volume-encryption-enabled (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/subnet-id :portkey.aws.workspaces.workspace/error-message :portkey.aws.workspaces/user-name :portkey.aws.workspaces/workspace-properties :portkey.aws.workspaces.workspace/error-code :portkey.aws.workspaces.workspace/modification-states :portkey.aws.workspaces/volume-encryption-key :portkey.aws.workspaces/bundle-id :portkey.aws.workspaces.workspace/user-volume-encryption-enabled :portkey.aws.workspaces/ip-address :portkey.aws.workspaces/directory-id :portkey.aws.workspaces.workspace/state :portkey.aws.workspaces.workspace/root-volume-encryption-enabled :portkey.aws.workspaces/computer-name :portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/group-name (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-name))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/group-desc (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-desc))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-request/user-rules (clojure.spec.alpha/and :portkey.aws.workspaces/ip-rule-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-ip-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-ip-group-request/group-name] :opt-un [:portkey.aws.workspaces.create-ip-group-request/group-desc :portkey.aws.workspaces.create-ip-group-request/user-rules]))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-request/workspace-ids (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-connection-status-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-connection-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-connection-status-request/workspace-ids :portkey.aws.workspaces.describe-workspaces-connection-status-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-desc (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.failed-create-workspace-request/error-code (clojure.spec.alpha/and :portkey.aws.workspaces/error-type))
(clojure.spec.alpha/def :portkey.aws.workspaces.failed-create-workspace-request/error-message (clojure.spec.alpha/and :portkey.aws.workspaces/description))
(clojure.spec.alpha/def :portkey.aws.workspaces/failed-create-workspace-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-request :portkey.aws.workspaces.failed-create-workspace-request/error-code :portkey.aws.workspaces.failed-create-workspace-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/bundle-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^wsb-[0-9a-z]{8,63}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/enable-work-docs (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/enable-internet-access (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/custom-security-group-id (clojure.spec.alpha/and :portkey.aws.workspaces/security-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces.default-workspace-creation-properties/user-enabled-as-local-administrator (clojure.spec.alpha/and :portkey.aws.workspaces/boolean-object))
(clojure.spec.alpha/def :portkey.aws.workspaces/default-workspace-creation-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.default-workspace-creation-properties/enable-work-docs :portkey.aws.workspaces.default-workspace-creation-properties/enable-internet-access :portkey.aws.workspaces/default-ou :portkey.aws.workspaces.default-workspace-creation-properties/custom-security-group-id :portkey.aws.workspaces.default-workspace-creation-properties/user-enabled-as-local-administrator]))

(clojure.spec.alpha/def :portkey.aws.workspaces.operation-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/operation-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.operation-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-rule (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/create-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-tags-request/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.describe-tags-request/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.start-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-start-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces/start-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.start-workspaces-result/failed-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-result/failed-requests (clojure.spec.alpha/and :portkey.aws.workspaces/failed-create-workspace-requests))
(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-result/pending-requests (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.create-workspaces-result/failed-requests :portkey.aws.workspaces.create-workspaces-result/pending-requests]))

(clojure.spec.alpha/def :portkey.aws.workspaces.modification-state/resource (clojure.spec.alpha/and :portkey.aws.workspaces/modification-resource-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces.modification-state/state (clojure.spec.alpha/and :portkey.aws.workspaces/modification-state-enum))
(clojure.spec.alpha/def :portkey.aws.workspaces/modification-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.modification-state/resource :portkey.aws.workspaces.modification-state/state]))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"wsipg-[0-9a-z]{8,63}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.associate-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/associate-ip-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces.associate-ip-groups-request/group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-workspaces-request/workspaces (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-request-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.create-workspaces-request/workspaces] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-result/directories (clojure.spec.alpha/and :portkey.aws.workspaces/directory-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspace-directories-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspace-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspace-directories-result/directories :portkey.aws.workspaces.describe-workspace-directories-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.invalid-resource-state-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/invalid-resource-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.invalid-resource-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/stop-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-directory))

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.create-ip-group-result/group-id (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id))
(clojure.spec.alpha/def :portkey.aws.workspaces/create-ip-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.create-ip-group-result/group-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^d-[0-9a-f]{8,63}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/bundle-owner (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.workspaces.disassociate-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces/disassociate-ip-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/directory-id :portkey.aws.workspaces.disassociate-ip-groups-request/group-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces.tag/key (clojure.spec.alpha/and :portkey.aws.workspaces/tag-key))
(clojure.spec.alpha/def :portkey.aws.workspaces.tag/value (clojure.spec.alpha/and :portkey.aws.workspaces/tag-value))
(clojure.spec.alpha/def :portkey.aws.workspaces/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces.tag/key] :opt-un [:portkey.aws.workspaces.tag/value]))

(clojure.spec.alpha/def :portkey.aws.workspaces.compute-type/name (clojure.spec.alpha/and :portkey.aws.workspaces/compute))
(clojure.spec.alpha/def :portkey.aws.workspaces/compute-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.compute-type/name]))

(clojure.spec.alpha/def :portkey.aws.workspaces/disassociate-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/reboot-workspaces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workspaces/reboot-workspace-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-result/workspaces (clojure.spec.alpha/and :portkey.aws.workspaces/workspace-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-workspaces-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-workspaces-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-workspaces-result/workspaces :portkey.aws.workspaces.describe-workspaces-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces.unsupported-workspace-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces/unsupported-workspace-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.unsupported-workspace-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-properties-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/group-ids (clojure.spec.alpha/and :portkey.aws.workspaces/ip-group-id-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.workspaces/limit))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-ip-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-ip-groups-request/group-ids :portkey.aws.workspaces.describe-ip-groups-request/next-token :portkey.aws.workspaces.describe-ip-groups-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.workspaces.resource-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.workspaces/exception-message))
(clojure.spec.alpha/def :portkey.aws.workspaces.resource-unavailable-exception/resource-id (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/resource-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.resource-unavailable-exception/message :portkey.aws.workspaces.resource-unavailable-exception/resource-id]))

(clojure.spec.alpha/def :portkey.aws.workspaces/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.workspaces/computer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.workspaces/directory-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/directory-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^ws-[0-9a-z]{8,63}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-directory-state #{"REGISTERING" "DEREGISTERING" :deregistering "ERROR" "REGISTERED" :registering :deregistered :error "DEREGISTERED" :registered})

(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-result/result (clojure.spec.alpha/and :portkey.aws.workspaces/workspaces-ip-groups-list))
(clojure.spec.alpha/def :portkey.aws.workspaces.describe-ip-groups-result/next-token (clojure.spec.alpha/and :portkey.aws.workspaces/pagination-token))
(clojure.spec.alpha/def :portkey.aws.workspaces/describe-ip-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.describe-ip-groups-result/result :portkey.aws.workspaces.describe-ip-groups-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.workspaces/target-workspace-state #{:admin-maintenance "AVAILABLE" "ADMIN_MAINTENANCE" :available})

(clojure.spec.alpha/def :portkey.aws.workspaces/ip-revoked-rule-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/ip-rule))

(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-id-list (clojure.spec.alpha/coll-of :portkey.aws.workspaces/workspace-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.workspaces/authorize-ip-rules-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/user-volume-size-gib clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.workspaces.user-storage/capacity (clojure.spec.alpha/and :portkey.aws.workspaces/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.workspaces/user-storage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces.user-storage/capacity]))

(clojure.spec.alpha/def :portkey.aws.workspaces/modify-workspace-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workspaces/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-connection-status/connection-state-check-timestamp (clojure.spec.alpha/and :portkey.aws.workspaces/timestamp))
(clojure.spec.alpha/def :portkey.aws.workspaces.workspace-connection-status/last-known-user-connection-timestamp (clojure.spec.alpha/and :portkey.aws.workspaces/timestamp))
(clojure.spec.alpha/def :portkey.aws.workspaces/workspace-connection-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workspaces/workspace-id :portkey.aws.workspaces/connection-state :portkey.aws.workspaces.workspace-connection-status/connection-state-check-timestamp :portkey.aws.workspaces.workspace-connection-status/last-known-user-connection-timestamp]))

(clojure.core/defn update-rules-of-ip-group ([update-rules-of-ip-group-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-rules-of-ip-group-request update-rules-of-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/update-rules-of-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/update-rules-of-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRulesOfIpGroup", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef update-rules-of-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/update-rules-of-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/update-rules-of-ip-group-result))

(clojure.core/defn describe-workspace-directories ([] (describe-workspace-directories {})) ([describe-workspace-directories-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-workspace-directories-request describe-workspace-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspace-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspace-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkspaceDirectories", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspace-directories :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspace-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspace-directories-result))

(clojure.core/defn terminate-workspaces ([terminate-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-terminate-workspaces-request terminate-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/terminate-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/terminate-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateWorkspaces", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef terminate-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/terminate-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/terminate-workspaces-result))

(clojure.core/defn create-ip-group ([create-ip-group-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-ip-group-request create-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/create-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateIpGroup", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.workspaces/resource-already-exists-exception, "ResourceCreationFailedException" :portkey.aws.workspaces/resource-creation-failed-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef create-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-ip-group-result))

(clojure.core/defn start-workspaces ([start-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-workspaces-request start-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/start-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/start-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartWorkspaces", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef start-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/start-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/start-workspaces-result))

(clojure.core/defn delete-tags ([delete-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/delete-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/delete-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/delete-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/delete-tags-result))

(clojure.core/defn create-tags ([create-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/create-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-tags-result))

(clojure.core/defn reboot-workspaces ([reboot-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-reboot-workspaces-request reboot-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/reboot-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/reboot-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebootWorkspaces", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef reboot-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/reboot-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/reboot-workspaces-result))

(clojure.core/defn describe-workspaces ([] (describe-workspaces {})) ([describe-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-workspaces-request describe-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkspaces", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceUnavailableException" :portkey.aws.workspaces/resource-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-workspaces :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspaces-result))

(clojure.core/defn disassociate-ip-groups ([disassociate-ip-groups-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-ip-groups-request disassociate-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/disassociate-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/disassociate-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateIpGroups", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef disassociate-ip-groups :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/disassociate-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/disassociate-ip-groups-result))

(clojure.core/defn modify-workspace-properties ([modify-workspace-properties-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-modify-workspace-properties-request modify-workspace-properties-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/modify-workspace-properties-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-workspace-properties-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyWorkspaceProperties", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "OperationInProgressException" :portkey.aws.workspaces/operation-in-progress-exception, "UnsupportedWorkspaceConfigurationException" :portkey.aws.workspaces/unsupported-workspace-configuration-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception, "ResourceUnavailableException" :portkey.aws.workspaces/resource-unavailable-exception}})))))
(clojure.spec.alpha/fdef modify-workspace-properties :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/modify-workspace-properties-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-workspace-properties-result))

(clojure.core/defn revoke-ip-rules ([revoke-ip-rules-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-revoke-ip-rules-request revoke-ip-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/revoke-ip-rules-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/revoke-ip-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RevokeIpRules", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef revoke-ip-rules :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/revoke-ip-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/revoke-ip-rules-result))

(clojure.core/defn describe-tags ([describe-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-tags-result))

(clojure.core/defn associate-ip-groups ([associate-ip-groups-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-ip-groups-request associate-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/associate-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/associate-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateIpGroups", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception, "OperationNotSupportedException" :portkey.aws.workspaces/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef associate-ip-groups :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/associate-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/associate-ip-groups-result))

(clojure.core/defn describe-workspaces-connection-status ([] (describe-workspaces-connection-status {})) ([describe-workspaces-connection-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-workspaces-connection-status-request describe-workspaces-connection-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspaces-connection-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspaces-connection-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkspacesConnectionStatus", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspaces-connection-status :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspaces-connection-status-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspaces-connection-status-result))

(clojure.core/defn describe-workspace-bundles ([] (describe-workspace-bundles {})) ([describe-workspace-bundles-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-workspace-bundles-request describe-workspace-bundles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-workspace-bundles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-workspace-bundles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeWorkspaceBundles", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef describe-workspace-bundles :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-workspace-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-workspace-bundles-result))

(clojure.core/defn modify-workspace-state ([modify-workspace-state-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-modify-workspace-state-request modify-workspace-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/modify-workspace-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/modify-workspace-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyWorkspaceState", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef modify-workspace-state :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/modify-workspace-state-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/modify-workspace-state-result))

(clojure.core/defn rebuild-workspaces ([rebuild-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-rebuild-workspaces-request rebuild-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/rebuild-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/rebuild-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebuildWorkspaces", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef rebuild-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/rebuild-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/rebuild-workspaces-result))

(clojure.core/defn describe-ip-groups ([] (describe-ip-groups {})) ([describe-ip-groups-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-ip-groups-request describe-ip-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/describe-ip-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/describe-ip-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeIpGroups", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef describe-ip-groups :args (clojure.spec.alpha/? :portkey.aws.workspaces/describe-ip-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/describe-ip-groups-result))

(clojure.core/defn delete-ip-group ([delete-ip-group-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-ip-group-request delete-ip-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/delete-ip-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/delete-ip-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIpGroup", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceAssociatedException" :portkey.aws.workspaces/resource-associated-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef delete-ip-group :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/delete-ip-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/delete-ip-group-result))

(clojure.core/defn stop-workspaces ([stop-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-workspaces-request stop-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/stop-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/stop-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopWorkspaces", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef stop-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/stop-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/stop-workspaces-result))

(clojure.core/defn create-workspaces ([create-workspaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-workspaces-request create-workspaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/create-workspaces-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/create-workspaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateWorkspaces", :http.request.spec/error-spec {"ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception}})))))
(clojure.spec.alpha/fdef create-workspaces :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/create-workspaces-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/create-workspaces-result))

(clojure.core/defn authorize-ip-rules ([authorize-ip-rules-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-authorize-ip-rules-request authorize-ip-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.workspaces/endpoints, :http.request.spec/output-spec :portkey.aws.workspaces/authorize-ip-rules-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-08", :http.request.configuration/service-id "WorkSpaces", :http.request.spec/input-spec :portkey.aws.workspaces/authorize-ip-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AuthorizeIpRules", :http.request.spec/error-spec {"InvalidParameterValuesException" :portkey.aws.workspaces/invalid-parameter-values-exception, "ResourceNotFoundException" :portkey.aws.workspaces/resource-not-found-exception, "ResourceLimitExceededException" :portkey.aws.workspaces/resource-limit-exceeded-exception, "InvalidResourceStateException" :portkey.aws.workspaces/invalid-resource-state-exception, "AccessDeniedException" :portkey.aws.workspaces/access-denied-exception}})))))
(clojure.spec.alpha/fdef authorize-ip-rules :args (clojure.spec.alpha/tuple :portkey.aws.workspaces/authorize-ip-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.workspaces/authorize-ip-rules-result))
