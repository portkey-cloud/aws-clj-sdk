(ns portkey.aws.fsx (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "fsx", :region "eu-west-1"},
    :ssl-common-name "fsx.eu-west-1.amazonaws.com",
    :endpoint "https://fsx.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "fsx", :region "us-east-2"},
    :ssl-common-name "fsx.us-east-2.amazonaws.com",
    :endpoint "https://fsx.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "fsx", :region "us-west-2"},
    :ssl-common-name "fsx.us-west-2.amazonaws.com",
    :endpoint "https://fsx.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "fsx", :region "us-east-1"},
    :ssl-common-name "fsx.us-east-1.amazonaws.com",
    :endpoint "https://fsx.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-archive-path)

(clojure.core/declare ser-update-file-system-windows-configuration)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-weekly-time)

(clojure.core/declare ser-backup-ids)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-backup-id)

(clojure.core/declare ser-file-system-ids)

(clojure.core/declare ser-flag)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-delete-file-system-windows-configuration)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-storage-capacity)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-file-system-id)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-file-system-type)

(clojure.core/declare ser-create-file-system-lustre-configuration)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-directory-id)

(clojure.core/declare ser-create-file-system-windows-configuration)

(clojure.core/declare ser-automatic-backup-retention-days)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-megabytes-per-second)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-update-file-system-lustre-configuration)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-daily-time)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-megabytes)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-archive-path [input] #:http.request.field{:value input, :shape "ArchivePath"})

(clojure.core/defn- ser-update-file-system-windows-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateFileSystemWindowsConfiguration", :type "structure"} (clojure.core/contains? input :weekly-maintenance-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-time (input :weekly-maintenance-start-time)) #:http.request.field{:name "WeeklyMaintenanceStartTime", :shape "WeeklyTime"})) (clojure.core/contains? input :daily-automatic-backup-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-time (input :daily-automatic-backup-start-time)) #:http.request.field{:name "DailyAutomaticBackupStartTime", :shape "DailyTime"})) (clojure.core/contains? input :automatic-backup-retention-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automatic-backup-retention-days (input :automatic-backup-retention-days)) #:http.request.field{:name "AutomaticBackupRetentionDays", :shape "AutomaticBackupRetentionDays"}))))

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-name (input :name)) #:http.request.field{:name "Name", :shape "FilterName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-values (input :values)) #:http.request.field{:name "Values", :shape "FilterValues"}))))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-weekly-time [input] #:http.request.field{:value input, :shape "WeeklyTime"})

(clojure.core/defn- ser-backup-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-backup-id coll) #:http.request.field{:shape "BackupId"}))) input), :shape "BackupIds", :type "list", :max 50})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list", :max 50})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 50})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-backup-id [input] #:http.request.field{:value input, :shape "BackupId"})

(clojure.core/defn- ser-file-system-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-file-system-id coll) #:http.request.field{:shape "FileSystemId"}))) input), :shape "FileSystemIds", :type "list", :max 50})

(clojure.core/defn- ser-flag [input] #:http.request.field{:value input, :shape "Flag"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-delete-file-system-windows-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeleteFileSystemWindowsConfiguration", :type "structure"} (clojure.core/contains? input :skip-final-backup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-flag (input :skip-final-backup)) #:http.request.field{:name "SkipFinalBackup", :shape "Flag"})) (clojure.core/contains? input :final-backup-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :final-backup-tags)) #:http.request.field{:name "FinalBackupTags", :shape "Tags"}))))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list", :max 20})

(clojure.core/defn- ser-storage-capacity [input] #:http.request.field{:value input, :shape "StorageCapacity"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-file-system-id [input] #:http.request.field{:value input, :shape "FileSystemId"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-file-system-type [input] #:http.request.field{:value (clojure.core/get {"WINDOWS" "WINDOWS", :windows "WINDOWS", "LUSTRE" "LUSTRE", :lustre "LUSTRE"} input), :shape "FileSystemType"})

(clojure.core/defn- ser-create-file-system-lustre-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CreateFileSystemLustreConfiguration", :type "structure"} (clojure.core/contains? input :weekly-maintenance-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-time (input :weekly-maintenance-start-time)) #:http.request.field{:name "WeeklyMaintenanceStartTime", :shape "WeeklyTime"})) (clojure.core/contains? input :import-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-archive-path (input :import-path)) #:http.request.field{:name "ImportPath", :shape "ArchivePath"})) (clojure.core/contains? input :export-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-archive-path (input :export-path)) #:http.request.field{:name "ExportPath", :shape "ArchivePath"})) (clojure.core/contains? input :imported-file-chunk-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-megabytes (input :imported-file-chunk-size)) #:http.request.field{:name "ImportedFileChunkSize", :shape "Megabytes"}))))

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list", :max 10})

(clojure.core/defn- ser-directory-id [input] #:http.request.field{:value input, :shape "DirectoryId"})

(clojure.core/defn- ser-create-file-system-windows-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-megabytes-per-second (:throughput-capacity input)) #:http.request.field{:name "ThroughputCapacity", :shape "MegabytesPerSecond"})], :shape "CreateFileSystemWindowsConfiguration", :type "structure"} (clojure.core/contains? input :active-directory-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :active-directory-id)) #:http.request.field{:name "ActiveDirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :weekly-maintenance-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-time (input :weekly-maintenance-start-time)) #:http.request.field{:name "WeeklyMaintenanceStartTime", :shape "WeeklyTime"})) (clojure.core/contains? input :daily-automatic-backup-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-daily-time (input :daily-automatic-backup-start-time)) #:http.request.field{:name "DailyAutomaticBackupStartTime", :shape "DailyTime"})) (clojure.core/contains? input :automatic-backup-retention-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automatic-backup-retention-days (input :automatic-backup-retention-days)) #:http.request.field{:name "AutomaticBackupRetentionDays", :shape "AutomaticBackupRetentionDays"})) (clojure.core/contains? input :copy-tags-to-backups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-flag (input :copy-tags-to-backups)) #:http.request.field{:name "CopyTagsToBackups", :shape "Flag"}))))

(clojure.core/defn- ser-automatic-backup-retention-days [input] #:http.request.field{:value input, :shape "AutomaticBackupRetentionDays"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-megabytes-per-second [input] #:http.request.field{:value input, :shape "MegabytesPerSecond"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-update-file-system-lustre-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateFileSystemLustreConfiguration", :type "structure"} (clojure.core/contains? input :weekly-maintenance-start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-time (input :weekly-maintenance-start-time)) #:http.request.field{:name "WeeklyMaintenanceStartTime", :shape "WeeklyTime"}))))

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value (clojure.core/get {"file-system-id" "file-system-id", :filesystemid "file-system-id", "backup-type" "backup-type", :backuptype "backup-type"} input), :shape "FilterName"})

(clojure.core/defn- ser-daily-time [input] #:http.request.field{:value input, :shape "DailyTime"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-megabytes [input] #:http.request.field{:value input, :shape "Megabytes"})

(clojure.core/defn- req-create-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-type (input :file-system-type)) #:http.request.field{:name "FileSystemType", :shape "FileSystemType"}) (clojure.core/into (ser-storage-capacity (input :storage-capacity)) #:http.request.field{:name "StorageCapacity", :shape "StorageCapacity"}) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :windows-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-file-system-windows-configuration (input :windows-configuration)) #:http.request.field{:name "WindowsConfiguration", :shape "CreateFileSystemWindowsConfiguration"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :lustre-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-file-system-lustre-configuration (input :lustre-configuration)) #:http.request.field{:name "LustreConfiguration", :shape "CreateFileSystemLustreConfiguration"}))))

(clojure.core/defn- req-describe-file-systems-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :file-system-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-system-ids (input :file-system-ids)) #:http.request.field{:name "FileSystemIds", :shape "FileSystemIds"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :windows-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-file-system-windows-configuration (input :windows-configuration)) #:http.request.field{:name "WindowsConfiguration", :shape "DeleteFileSystemWindowsConfiguration"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-backups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :backup-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-ids (input :backup-ids)) #:http.request.field{:name "BackupIds", :shape "BackupIds"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-file-system-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :windows-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-file-system-windows-configuration (input :windows-configuration)) #:http.request.field{:name "WindowsConfiguration", :shape "UpdateFileSystemWindowsConfiguration"})) (clojure.core/contains? input :lustre-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-file-system-lustre-configuration (input :lustre-configuration)) #:http.request.field{:name "LustreConfiguration", :shape "UpdateFileSystemLustreConfiguration"}))))

(clojure.core/defn- req-delete-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-create-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-system-id (input :file-system-id)) #:http.request.field{:name "FileSystemId", :shape "FileSystemId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-create-file-system-from-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"}) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :windows-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-file-system-windows-configuration (input :windows-configuration)) #:http.request.field{:name "WindowsConfiguration", :shape "CreateFileSystemWindowsConfiguration"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/declare deser-archive-path)

(clojure.core/declare deser-windows-file-system-configuration)

(clojure.core/declare deser-file-system-maintenance-operation)

(clojure.core/declare deser-weekly-time)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-file-system-lifecycle)

(clojure.core/declare deser-file-system-maintenance-operations)

(clojure.core/declare deser-delete-file-system-windows-response)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-backup-lifecycle)

(clojure.core/declare deser-backup-failure-details)

(clojure.core/declare deser-backup-id)

(clojure.core/declare deser-flag)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-service-limit)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-file-system)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-aws-account-id)

(clojure.core/declare deser-lustre-file-system-configuration)

(clojure.core/declare deser-file-system-failure-details)

(clojure.core/declare deser-dns-name)

(clojure.core/declare deser-storage-capacity)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-active-directory-error-type)

(clojure.core/declare deser-file-system-id)

(clojure.core/declare deser-backup)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-data-repository-configuration)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-parameter)

(clojure.core/declare deser-file-system-type)

(clojure.core/declare deser-network-interface-ids)

(clojure.core/declare deser-progress-percent)

(clojure.core/declare deser-creation-time)

(clojure.core/declare deser-backups)

(clojure.core/declare deser-directory-id)

(clojure.core/declare deser-backup-type)

(clojure.core/declare deser-file-systems)

(clojure.core/declare deser-automatic-backup-retention-days)

(clojure.core/declare deser-megabytes-per-second)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-daily-time)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-megabytes)

(clojure.core/defn- deser-archive-path [input] input)

(clojure.core/defn- deser-windows-file-system-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ActiveDirectoryId") (clojure.core/assoc :active-directory-id (deser-directory-id (input "ActiveDirectoryId"))) (clojure.core/contains? input "ThroughputCapacity") (clojure.core/assoc :throughput-capacity (deser-megabytes-per-second (input "ThroughputCapacity"))) (clojure.core/contains? input "MaintenanceOperationsInProgress") (clojure.core/assoc :maintenance-operations-in-progress (deser-file-system-maintenance-operations (input "MaintenanceOperationsInProgress"))) (clojure.core/contains? input "WeeklyMaintenanceStartTime") (clojure.core/assoc :weekly-maintenance-start-time (deser-weekly-time (input "WeeklyMaintenanceStartTime"))) (clojure.core/contains? input "DailyAutomaticBackupStartTime") (clojure.core/assoc :daily-automatic-backup-start-time (deser-daily-time (input "DailyAutomaticBackupStartTime"))) (clojure.core/contains? input "AutomaticBackupRetentionDays") (clojure.core/assoc :automatic-backup-retention-days (deser-automatic-backup-retention-days (input "AutomaticBackupRetentionDays"))) (clojure.core/contains? input "CopyTagsToBackups") (clojure.core/assoc :copy-tags-to-backups (deser-flag (input "CopyTagsToBackups")))))

(clojure.core/defn- deser-file-system-maintenance-operation [input] (clojure.core/get {"PATCHING" :patching, "BACKING_UP" :backing-up} input))

(clojure.core/defn- deser-weekly-time [input] input)

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-file-system-lifecycle [input] (clojure.core/get {"AVAILABLE" :available, "CREATING" :creating, "FAILED" :failed, "DELETING" :deleting} input))

(clojure.core/defn- deser-file-system-maintenance-operations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-system-maintenance-operation coll))) input))

(clojure.core/defn- deser-delete-file-system-windows-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "FinalBackupId") (clojure.core/assoc :final-backup-id (deser-backup-id (input "FinalBackupId"))) (clojure.core/contains? input "FinalBackupTags") (clojure.core/assoc :final-backup-tags (deser-tags (input "FinalBackupTags")))))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-backup-lifecycle [input] (clojure.core/get {"AVAILABLE" :available, "CREATING" :creating, "DELETED" :deleted, "FAILED" :failed} input))

(clojure.core/defn- deser-backup-failure-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-backup-id [input] input)

(clojure.core/defn- deser-flag [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-service-limit [input] (clojure.core/get {"FILE_SYSTEM_COUNT" :file-system-count, "TOTAL_THROUGHPUT_CAPACITY" :total-throughput-capacity, "TOTAL_STORAGE" :total-storage, "TOTAL_USER_INITIATED_BACKUPS" :total-user-initiated-backups} input))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-file-system [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (input "SubnetIds"))) (clojure.core/contains? input "OwnerId") (clojure.core/assoc :owner-id (deser-aws-account-id (input "OwnerId"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "WindowsConfiguration") (clojure.core/assoc :windows-configuration (deser-windows-file-system-configuration (input "WindowsConfiguration"))) (clojure.core/contains? input "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (input "DNSName"))) (clojure.core/contains? input "StorageCapacity") (clojure.core/assoc :storage-capacity (deser-storage-capacity (input "StorageCapacity"))) (clojure.core/contains? input "FileSystemId") (clojure.core/assoc :file-system-id (deser-file-system-id (input "FileSystemId"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId"))) (clojure.core/contains? input "FailureDetails") (clojure.core/assoc :failure-details (deser-file-system-failure-details (input "FailureDetails"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId"))) (clojure.core/contains? input "FileSystemType") (clojure.core/assoc :file-system-type (deser-file-system-type (input "FileSystemType"))) (clojure.core/contains? input "NetworkInterfaceIds") (clojure.core/assoc :network-interface-ids (deser-network-interface-ids (input "NetworkInterfaceIds"))) (clojure.core/contains? input "LustreConfiguration") (clojure.core/assoc :lustre-configuration (deser-lustre-file-system-configuration (input "LustreConfiguration"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "Lifecycle") (clojure.core/assoc :lifecycle (deser-file-system-lifecycle (input "Lifecycle"))) (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-aws-account-id [input] input)

(clojure.core/defn- deser-lustre-file-system-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "WeeklyMaintenanceStartTime") (clojure.core/assoc :weekly-maintenance-start-time (deser-weekly-time (input "WeeklyMaintenanceStartTime"))) (clojure.core/contains? input "DataRepositoryConfiguration") (clojure.core/assoc :data-repository-configuration (deser-data-repository-configuration (input "DataRepositoryConfiguration")))))

(clojure.core/defn- deser-file-system-failure-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-dns-name [input] input)

(clojure.core/defn- deser-storage-capacity [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-active-directory-error-type [input] (clojure.core/get {"DOMAIN_NOT_FOUND" :domain-not-found, "INCOMPATIBLE_DOMAIN_MODE" :incompatible-domain-mode, "WRONG_VPC" :wrong-vpc, "INVALID_DOMAIN_STAGE" :invalid-domain-stage} input))

(clojure.core/defn- deser-file-system-id [input] input)

(clojure.core/defn- deser-backup [input] (clojure.core/cond-> {:backup-id (deser-backup-id (input "BackupId")), :lifecycle (deser-backup-lifecycle (input "Lifecycle")), :type (deser-backup-type (input "Type")), :creation-time (deser-creation-time (input "CreationTime")), :file-system (deser-file-system (input "FileSystem"))} (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "FailureDetails") (clojure.core/assoc :failure-details (deser-backup-failure-details (input "FailureDetails"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-progress-percent (input "ProgressPercent"))) (clojure.core/contains? input "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (input "ResourceARN")))))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-data-repository-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "ImportPath") (clojure.core/assoc :import-path (deser-archive-path (input "ImportPath"))) (clojure.core/contains? input "ExportPath") (clojure.core/assoc :export-path (deser-archive-path (input "ExportPath"))) (clojure.core/contains? input "ImportedFileChunkSize") (clojure.core/assoc :imported-file-chunk-size (deser-megabytes (input "ImportedFileChunkSize")))))

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-parameter [input] input)

(clojure.core/defn- deser-file-system-type [input] (clojure.core/get {"WINDOWS" :windows, "LUSTRE" :lustre} input))

(clojure.core/defn- deser-network-interface-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-interface-id coll))) input))

(clojure.core/defn- deser-progress-percent [input] input)

(clojure.core/defn- deser-creation-time [input] input)

(clojure.core/defn- deser-backups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-backup coll))) input))

(clojure.core/defn- deser-directory-id [input] input)

(clojure.core/defn- deser-backup-type [input] (clojure.core/get {"AUTOMATIC" :automatic, "USER_INITIATED" :user-initiated} input))

(clojure.core/defn- deser-file-systems [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-system coll))) input))

(clojure.core/defn- deser-automatic-backup-retention-days [input] input)

(clojure.core/defn- deser-megabytes-per-second [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-daily-time [input] input)

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-megabytes [input] input)

(clojure.core/defn- response-backup-in-progress ([input] (response-backup-in-progress nil input)) ([resultWrapper976675 input] (clojure.core/let [rawinput976674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976676 {"Message" (rawinput976674 "Message")}] (clojure.core/cond-> {} (letvar976676 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976676 ["Message"])))))))

(clojure.core/defn- response-create-backup-response ([input] (response-create-backup-response nil input)) ([resultWrapper976678 input] (clojure.core/let [rawinput976677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976679 {"Backup" (rawinput976677 "Backup")}] (clojure.core/cond-> {} (letvar976679 "Backup") (clojure.core/assoc :backup (deser-backup (clojure.core/get-in letvar976679 ["Backup"])))))))

(clojure.core/defn- response-bad-request ([input] (response-bad-request nil input)) ([resultWrapper976681 input] (clojure.core/let [rawinput976680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976682 {"Message" (rawinput976680 "Message")}] (clojure.core/cond-> {} (letvar976682 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976682 ["Message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper976684 input] (clojure.core/let [rawinput976683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976685 {"Tags" (rawinput976683 "Tags"), "NextToken" (rawinput976683 "NextToken")}] (clojure.core/cond-> {} (letvar976685 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar976685 ["Tags"]))) (letvar976685 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar976685 ["NextToken"])))))))

(clojure.core/defn- response-not-service-resource-error ([input] (response-not-service-resource-error nil input)) ([resultWrapper976687 input] (clojure.core/let [rawinput976686 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976688 {"ResourceARN" (rawinput976686 "ResourceARN"), "Message" (rawinput976686 "Message")}] (clojure.core/cond-> {:resource-arn (deser-resource-arn (clojure.core/get-in letvar976688 ["ResourceARN"]))} (letvar976688 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976688 ["Message"])))))))

(clojure.core/defn- response-service-limit-exceeded ([input] (response-service-limit-exceeded nil input)) ([resultWrapper976690 input] (clojure.core/let [rawinput976689 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976691 {"Limit" (rawinput976689 "Limit"), "Message" (rawinput976689 "Message")}] (clojure.core/cond-> {:limit (deser-service-limit (clojure.core/get-in letvar976691 ["Limit"]))} (letvar976691 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976691 ["Message"])))))))

(clojure.core/defn- response-incompatible-parameter-error ([input] (response-incompatible-parameter-error nil input)) ([resultWrapper976693 input] (clojure.core/let [rawinput976692 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976694 {"Parameter" (rawinput976692 "Parameter"), "Message" (rawinput976692 "Message")}] (clojure.core/cond-> {:parameter (deser-parameter (clojure.core/get-in letvar976694 ["Parameter"]))} (letvar976694 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976694 ["Message"])))))))

(clojure.core/defn- response-describe-file-systems-response ([input] (response-describe-file-systems-response nil input)) ([resultWrapper976696 input] (clojure.core/let [rawinput976695 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976697 {"FileSystems" (rawinput976695 "FileSystems"), "NextToken" (rawinput976695 "NextToken")}] (clojure.core/cond-> {} (letvar976697 "FileSystems") (clojure.core/assoc :file-systems (deser-file-systems (clojure.core/get-in letvar976697 ["FileSystems"]))) (letvar976697 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar976697 ["NextToken"])))))))

(clojure.core/defn- response-backup-restoring ([input] (response-backup-restoring nil input)) ([resultWrapper976699 input] (clojure.core/let [rawinput976698 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976700 {"Message" (rawinput976698 "Message"), "FileSystemId" (rawinput976698 "FileSystemId")}] (clojure.core/cond-> {} (letvar976700 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976700 ["Message"]))) (letvar976700 "FileSystemId") (clojure.core/assoc :file-system-id (deser-file-system-id (clojure.core/get-in letvar976700 ["FileSystemId"])))))))

(clojure.core/defn- response-delete-backup-response ([input] (response-delete-backup-response nil input)) ([resultWrapper976702 input] (clojure.core/let [rawinput976701 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976703 {"BackupId" (rawinput976701 "BackupId"), "Lifecycle" (rawinput976701 "Lifecycle")}] (clojure.core/cond-> {} (letvar976703 "BackupId") (clojure.core/assoc :backup-id (deser-backup-id (clojure.core/get-in letvar976703 ["BackupId"]))) (letvar976703 "Lifecycle") (clojure.core/assoc :lifecycle (deser-backup-lifecycle (clojure.core/get-in letvar976703 ["Lifecycle"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper976705 input] (clojure.core/let [rawinput976704 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976706 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-file-system-response ([input] (response-update-file-system-response nil input)) ([resultWrapper976708 input] (clojure.core/let [rawinput976707 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976709 {"FileSystem" (rawinput976707 "FileSystem")}] (clojure.core/cond-> {} (letvar976709 "FileSystem") (clojure.core/assoc :file-system (deser-file-system (clojure.core/get-in letvar976709 ["FileSystem"])))))))

(clojure.core/defn- response-delete-file-system-response ([input] (response-delete-file-system-response nil input)) ([resultWrapper976711 input] (clojure.core/let [rawinput976710 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976712 {"FileSystemId" (rawinput976710 "FileSystemId"), "Lifecycle" (rawinput976710 "Lifecycle"), "WindowsResponse" (rawinput976710 "WindowsResponse")}] (clojure.core/cond-> {} (letvar976712 "FileSystemId") (clojure.core/assoc :file-system-id (deser-file-system-id (clojure.core/get-in letvar976712 ["FileSystemId"]))) (letvar976712 "Lifecycle") (clojure.core/assoc :lifecycle (deser-file-system-lifecycle (clojure.core/get-in letvar976712 ["Lifecycle"]))) (letvar976712 "WindowsResponse") (clojure.core/assoc :windows-response (deser-delete-file-system-windows-response (clojure.core/get-in letvar976712 ["WindowsResponse"])))))))

(clojure.core/defn- response-file-system-not-found ([input] (response-file-system-not-found nil input)) ([resultWrapper976714 input] (clojure.core/let [rawinput976713 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976715 {"Message" (rawinput976713 "Message")}] (clojure.core/cond-> {} (letvar976715 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976715 ["Message"])))))))

(clojure.core/defn- response-invalid-network-settings ([input] (response-invalid-network-settings nil input)) ([resultWrapper976717 input] (clojure.core/let [rawinput976716 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976718 {"Message" (rawinput976716 "Message"), "InvalidSubnetId" (rawinput976716 "InvalidSubnetId"), "InvalidSecurityGroupId" (rawinput976716 "InvalidSecurityGroupId")}] (clojure.core/cond-> {} (letvar976718 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976718 ["Message"]))) (letvar976718 "InvalidSubnetId") (clojure.core/assoc :invalid-subnet-id (deser-subnet-id (clojure.core/get-in letvar976718 ["InvalidSubnetId"]))) (letvar976718 "InvalidSecurityGroupId") (clojure.core/assoc :invalid-security-group-id (deser-security-group-id (clojure.core/get-in letvar976718 ["InvalidSecurityGroupId"])))))))

(clojure.core/defn- response-backup-not-found ([input] (response-backup-not-found nil input)) ([resultWrapper976720 input] (clojure.core/let [rawinput976719 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976721 {"Message" (rawinput976719 "Message")}] (clojure.core/cond-> {} (letvar976721 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976721 ["Message"])))))))

(clojure.core/defn- response-active-directory-error ([input] (response-active-directory-error nil input)) ([resultWrapper976723 input] (clojure.core/let [rawinput976722 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976724 {"ActiveDirectoryId" (rawinput976722 "ActiveDirectoryId"), "Type" (rawinput976722 "Type"), "Message" (rawinput976722 "Message")}] (clojure.core/cond-> {:active-directory-id (deser-directory-id (clojure.core/get-in letvar976724 ["ActiveDirectoryId"]))} (letvar976724 "Type") (clojure.core/assoc :type (deser-active-directory-error-type (clojure.core/get-in letvar976724 ["Type"]))) (letvar976724 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976724 ["Message"])))))))

(clojure.core/defn- response-create-file-system-response ([input] (response-create-file-system-response nil input)) ([resultWrapper976726 input] (clojure.core/let [rawinput976725 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976727 {"FileSystem" (rawinput976725 "FileSystem")}] (clojure.core/cond-> {} (letvar976727 "FileSystem") (clojure.core/assoc :file-system (deser-file-system (clojure.core/get-in letvar976727 ["FileSystem"])))))))

(clojure.core/defn- response-resource-does-not-support-tagging ([input] (response-resource-does-not-support-tagging nil input)) ([resultWrapper976729 input] (clojure.core/let [rawinput976728 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976730 {"ResourceARN" (rawinput976728 "ResourceARN"), "Message" (rawinput976728 "Message")}] (clojure.core/cond-> {:resource-arn (deser-resource-arn (clojure.core/get-in letvar976730 ["ResourceARN"]))} (letvar976730 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976730 ["Message"])))))))

(clojure.core/defn- response-create-file-system-from-backup-response ([input] (response-create-file-system-from-backup-response nil input)) ([resultWrapper976732 input] (clojure.core/let [rawinput976731 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976733 {"FileSystem" (rawinput976731 "FileSystem")}] (clojure.core/cond-> {} (letvar976733 "FileSystem") (clojure.core/assoc :file-system (deser-file-system (clojure.core/get-in letvar976733 ["FileSystem"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper976735 input] (clojure.core/let [rawinput976734 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976736 {"Message" (rawinput976734 "Message")}] (clojure.core/cond-> {} (letvar976736 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976736 ["Message"])))))))

(clojure.core/defn- response-invalid-import-path ([input] (response-invalid-import-path nil input)) ([resultWrapper976738 input] (clojure.core/let [rawinput976737 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976739 {"Message" (rawinput976737 "Message")}] (clojure.core/cond-> {} (letvar976739 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976739 ["Message"])))))))

(clojure.core/defn- response-resource-not-found ([input] (response-resource-not-found nil input)) ([resultWrapper976741 input] (clojure.core/let [rawinput976740 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976742 {"ResourceARN" (rawinput976740 "ResourceARN"), "Message" (rawinput976740 "Message")}] (clojure.core/cond-> {:resource-arn (deser-resource-arn (clojure.core/get-in letvar976742 ["ResourceARN"]))} (letvar976742 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976742 ["Message"])))))))

(clojure.core/defn- response-missing-file-system-configuration ([input] (response-missing-file-system-configuration nil input)) ([resultWrapper976744 input] (clojure.core/let [rawinput976743 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976745 {"Message" (rawinput976743 "Message")}] (clojure.core/cond-> {} (letvar976745 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976745 ["Message"])))))))

(clojure.core/defn- response-describe-backups-response ([input] (response-describe-backups-response nil input)) ([resultWrapper976747 input] (clojure.core/let [rawinput976746 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976748 {"Backups" (rawinput976746 "Backups"), "NextToken" (rawinput976746 "NextToken")}] (clojure.core/cond-> {} (letvar976748 "Backups") (clojure.core/assoc :backups (deser-backups (clojure.core/get-in letvar976748 ["Backups"]))) (letvar976748 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar976748 ["NextToken"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper976750 input] (clojure.core/let [rawinput976749 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976751 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-export-path ([input] (response-invalid-export-path nil input)) ([resultWrapper976753 input] (clojure.core/let [rawinput976752 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar976754 {"Message" (rawinput976752 "Message")}] (clojure.core/cond-> {} (letvar976754 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar976754 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.fsx/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.fsx/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/archive-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 900))))

(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-request/windows-configuration (clojure.spec.alpha/and :portkey.aws.fsx/create-file-system-windows-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-request/lustre-configuration (clojure.spec.alpha/and :portkey.aws.fsx/create-file-system-lustre-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/file-system-type :portkey.aws.fsx/storage-capacity :portkey.aws.fsx/subnet-ids] :opt-un [:portkey.aws.fsx/client-request-token :portkey.aws.fsx/security-group-ids :portkey.aws.fsx/tags :portkey.aws.fsx.create-file-system-request/windows-configuration :portkey.aws.fsx/kms-key-id :portkey.aws.fsx.create-file-system-request/lustre-configuration]))

(clojure.spec.alpha/def :portkey.aws.fsx/describe-file-systems-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-system-ids :portkey.aws.fsx/max-results :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/active-directory-id (clojure.spec.alpha/and :portkey.aws.fsx/directory-id))
(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/throughput-capacity (clojure.spec.alpha/and :portkey.aws.fsx/megabytes-per-second))
(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/maintenance-operations-in-progress (clojure.spec.alpha/and :portkey.aws.fsx/file-system-maintenance-operations))
(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/daily-automatic-backup-start-time (clojure.spec.alpha/and :portkey.aws.fsx/daily-time))
(clojure.spec.alpha/def :portkey.aws.fsx.windows-file-system-configuration/copy-tags-to-backups (clojure.spec.alpha/and :portkey.aws.fsx/flag))
(clojure.spec.alpha/def :portkey.aws.fsx/windows-file-system-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.windows-file-system-configuration/active-directory-id :portkey.aws.fsx.windows-file-system-configuration/throughput-capacity :portkey.aws.fsx.windows-file-system-configuration/maintenance-operations-in-progress :portkey.aws.fsx.windows-file-system-configuration/weekly-maintenance-start-time :portkey.aws.fsx.windows-file-system-configuration/daily-automatic-backup-start-time :portkey.aws.fsx/automatic-backup-retention-days :portkey.aws.fsx.windows-file-system-configuration/copy-tags-to-backups]))

(clojure.spec.alpha/def :portkey.aws.fsx.update-file-system-windows-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx.update-file-system-windows-configuration/daily-automatic-backup-start-time (clojure.spec.alpha/and :portkey.aws.fsx/daily-time))
(clojure.spec.alpha/def :portkey.aws.fsx/update-file-system-windows-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.update-file-system-windows-configuration/weekly-maintenance-start-time :portkey.aws.fsx.update-file-system-windows-configuration/daily-automatic-backup-start-time :portkey.aws.fsx/automatic-backup-retention-days]))

(clojure.spec.alpha/def :portkey.aws.fsx.filter/name (clojure.spec.alpha/and :portkey.aws.fsx/filter-name))
(clojure.spec.alpha/def :portkey.aws.fsx.filter/values (clojure.spec.alpha/and :portkey.aws.fsx/filter-values))
(clojure.spec.alpha/def :portkey.aws.fsx/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.filter/name :portkey.aws.fsx.filter/values]))

(clojure.spec.alpha/def :portkey.aws.fsx/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[A-za-z0-9_/.-]{0,255}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.backup-in-progress/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/backup-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.backup-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-maintenance-operation #{"BACKING_UP" "PATCHING" :backing-up :patching})

(clojure.spec.alpha/def :portkey.aws.fsx/weekly-time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 7 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 7)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[1-7]:([01]\d|2[0-3]):?([0-5]\d)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/backup-ids (clojure.spec.alpha/coll-of :portkey.aws.fsx/backup-id :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/create-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/backup]))

(clojure.spec.alpha/def :portkey.aws.fsx/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.fsx/subnet-id :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx.bad-request/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/bad-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.bad-request/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-lifecycle #{:creating "AVAILABLE" :deleting "DELETING" "CREATING" "FAILED" :available :failed})

(clojure.spec.alpha/def :portkey.aws.fsx/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/tags :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.fsx/security-group-id :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-maintenance-operations (clojure.spec.alpha/coll-of :portkey.aws.fsx/file-system-maintenance-operation :max-count 20))

(clojure.spec.alpha/def :portkey.aws.fsx.not-service-resource-error/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/not-service-resource-error (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn] :opt-un [:portkey.aws.fsx.not-service-resource-error/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.service-limit-exceeded/limit (clojure.spec.alpha/and :portkey.aws.fsx/service-limit))
(clojure.spec.alpha/def :portkey.aws.fsx.service-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/service-limit-exceeded (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx.service-limit-exceeded/limit] :opt-un [:portkey.aws.fsx.service-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-windows-response/final-backup-id (clojure.spec.alpha/and :portkey.aws.fsx/backup-id))
(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-windows-response/final-backup-tags (clojure.spec.alpha/and :portkey.aws.fsx/tags))
(clojure.spec.alpha/def :portkey.aws.fsx/delete-file-system-windows-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.delete-file-system-windows-response/final-backup-id :portkey.aws.fsx.delete-file-system-windows-response/final-backup-tags]))

(clojure.spec.alpha/def :portkey.aws.fsx/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 15 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 24)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(subnet-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-request/windows-configuration (clojure.spec.alpha/and :portkey.aws.fsx/delete-file-system-windows-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx/delete-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/file-system-id] :opt-un [:portkey.aws.fsx/client-request-token :portkey.aws.fsx.delete-file-system-request/windows-configuration]))

(clojure.spec.alpha/def :portkey.aws.fsx.incompatible-parameter-error/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/incompatible-parameter-error (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/parameter] :opt-un [:portkey.aws.fsx.incompatible-parameter-error/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/backup-lifecycle #{:deleted :creating "AVAILABLE" "CREATING" "FAILED" :available "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.fsx.backup-failure-details/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/backup-failure-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.backup-failure-details/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn] :opt-un [:portkey.aws.fsx/max-results :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx/backup-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(backup-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-ids (clojure.spec.alpha/coll-of :portkey.aws.fsx/file-system-id :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.fsx/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.fsx/service-limit #{"FILE_SYSTEM_COUNT" "TOTAL_STORAGE" :total-throughput-capacity "TOTAL_USER_INITIATED_BACKUPS" :file-system-count :total-user-initiated-backups "TOTAL_THROUGHPUT_CAPACITY" :total-storage})

(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-windows-configuration/skip-final-backup (clojure.spec.alpha/and :portkey.aws.fsx/flag))
(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-windows-configuration/final-backup-tags (clojure.spec.alpha/and :portkey.aws.fsx/tags))
(clojure.spec.alpha/def :portkey.aws.fsx/delete-file-system-windows-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.delete-file-system-windows-configuration/skip-final-backup :portkey.aws.fsx.delete-file-system-windows-configuration/final-backup-tags]))

(clojure.spec.alpha/def :portkey.aws.fsx/tags (clojure.spec.alpha/coll-of :portkey.aws.fsx/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/network-interface-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 21)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(eni-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/describe-file-systems-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-systems :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx.backup-restoring/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/backup-restoring (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.backup-restoring/message :portkey.aws.fsx/file-system-id]))

(clojure.spec.alpha/def :portkey.aws.fsx/describe-backups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/backup-ids :portkey.aws.fsx/filters :portkey.aws.fsx/max-results :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx.delete-backup-response/lifecycle (clojure.spec.alpha/and :portkey.aws.fsx/backup-lifecycle))
(clojure.spec.alpha/def :portkey.aws.fsx/delete-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/backup-id :portkey.aws.fsx.delete-backup-response/lifecycle]))

(clojure.spec.alpha/def :portkey.aws.fsx.file-system/owner-id (clojure.spec.alpha/and :portkey.aws.fsx/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fsx.file-system/windows-configuration (clojure.spec.alpha/and :portkey.aws.fsx/windows-file-system-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx.file-system/failure-details (clojure.spec.alpha/and :portkey.aws.fsx/file-system-failure-details))
(clojure.spec.alpha/def :portkey.aws.fsx.file-system/lustre-configuration (clojure.spec.alpha/and :portkey.aws.fsx/lustre-file-system-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx.file-system/lifecycle (clojure.spec.alpha/and :portkey.aws.fsx/file-system-lifecycle))
(clojure.spec.alpha/def :portkey.aws.fsx/file-system (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/subnet-ids :portkey.aws.fsx.file-system/owner-id :portkey.aws.fsx/tags :portkey.aws.fsx.file-system/windows-configuration :portkey.aws.fsx/dns-name :portkey.aws.fsx/storage-capacity :portkey.aws.fsx/file-system-id :portkey.aws.fsx/vpc-id :portkey.aws.fsx.file-system/failure-details :portkey.aws.fsx/kms-key-id :portkey.aws.fsx/file-system-type :portkey.aws.fsx/network-interface-ids :portkey.aws.fsx.file-system/lustre-configuration :portkey.aws.fsx/creation-time :portkey.aws.fsx.file-system/lifecycle :portkey.aws.fsx/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.fsx.update-file-system-request/windows-configuration (clojure.spec.alpha/and :portkey.aws.fsx/update-file-system-windows-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx.update-file-system-request/lustre-configuration (clojure.spec.alpha/and :portkey.aws.fsx/update-file-system-lustre-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx/update-file-system-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/file-system-id] :opt-un [:portkey.aws.fsx/client-request-token :portkey.aws.fsx.update-file-system-request/windows-configuration :portkey.aws.fsx.update-file-system-request/lustre-configuration]))

(clojure.spec.alpha/def :portkey.aws.fsx/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(?:[A-Za-z0-9+\/]{4})*(?:[A-Za-z0-9+\/]{2}==|[A-Za-z0-9+\/]{3}=)?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/delete-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/backup-id] :opt-un [:portkey.aws.fsx/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.fsx/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fsx/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.fsx/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 12)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\d{12}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/filter-values (clojure.spec.alpha/coll-of :portkey.aws.fsx/filter-value :max-count 20))

(clojure.spec.alpha/def :portkey.aws.fsx.lustre-file-system-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx/lustre-file-system-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.lustre-file-system-configuration/weekly-maintenance-start-time :portkey.aws.fsx/data-repository-configuration]))

(clojure.spec.alpha/def :portkey.aws.fsx.file-system-failure-details/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/file-system-failure-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.file-system-failure-details/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn :portkey.aws.fsx/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fsx/update-file-system-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-system]))

(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-response/lifecycle (clojure.spec.alpha/and :portkey.aws.fsx/file-system-lifecycle))
(clojure.spec.alpha/def :portkey.aws.fsx.delete-file-system-response/windows-response (clojure.spec.alpha/and :portkey.aws.fsx/delete-file-system-windows-response))
(clojure.spec.alpha/def :portkey.aws.fsx/delete-file-system-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-system-id :portkey.aws.fsx.delete-file-system-response/lifecycle :portkey.aws.fsx.delete-file-system-response/windows-response]))

(clojure.spec.alpha/def :portkey.aws.fsx.file-system-not-found/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/file-system-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.file-system-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/dns-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 16 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 275)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(fsi?-[0-9a-f]{8,}\..{4,253})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/storage-capacity (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.fsx/create-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/file-system-id] :opt-un [:portkey.aws.fsx/client-request-token :portkey.aws.fsx/tags]))

(clojure.spec.alpha/def :portkey.aws.fsx.invalid-network-settings/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx.invalid-network-settings/invalid-subnet-id (clojure.spec.alpha/and :portkey.aws.fsx/subnet-id))
(clojure.spec.alpha/def :portkey.aws.fsx.invalid-network-settings/invalid-security-group-id (clojure.spec.alpha/and :portkey.aws.fsx/security-group-id))
(clojure.spec.alpha/def :portkey.aws.fsx/invalid-network-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.invalid-network-settings/message :portkey.aws.fsx.invalid-network-settings/invalid-subnet-id :portkey.aws.fsx.invalid-network-settings/invalid-security-group-id]))

(clojure.spec.alpha/def :portkey.aws.fsx/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.fsx/active-directory-error-type #{:wrong-vpc :incompatible-domain-mode :invalid-domain-stage "INVALID_DOMAIN_STAGE" "DOMAIN_NOT_FOUND" "WRONG_VPC" :domain-not-found "INCOMPATIBLE_DOMAIN_MODE"})

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 11 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 21)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(fs-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.backup/type (clojure.spec.alpha/and :portkey.aws.fsx/backup-type))
(clojure.spec.alpha/def :portkey.aws.fsx.backup/failure-details (clojure.spec.alpha/and :portkey.aws.fsx/backup-failure-details))
(clojure.spec.alpha/def :portkey.aws.fsx.backup/lifecycle (clojure.spec.alpha/and :portkey.aws.fsx/backup-lifecycle))
(clojure.spec.alpha/def :portkey.aws.fsx/backup (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/backup-id :portkey.aws.fsx.backup/lifecycle :portkey.aws.fsx.backup/type :portkey.aws.fsx/creation-time :portkey.aws.fsx/file-system] :opt-un [:portkey.aws.fsx/tags :portkey.aws.fsx.backup/failure-details :portkey.aws.fsx/kms-key-id :portkey.aws.fsx/progress-percent :portkey.aws.fsx/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.fsx/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 11 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(sg-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.data-repository-configuration/import-path (clojure.spec.alpha/and :portkey.aws.fsx/archive-path))
(clojure.spec.alpha/def :portkey.aws.fsx.data-repository-configuration/export-path (clojure.spec.alpha/and :portkey.aws.fsx/archive-path))
(clojure.spec.alpha/def :portkey.aws.fsx.data-repository-configuration/imported-file-chunk-size (clojure.spec.alpha/and :portkey.aws.fsx/megabytes))
(clojure.spec.alpha/def :portkey.aws.fsx/data-repository-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.data-repository-configuration/import-path :portkey.aws.fsx.data-repository-configuration/export-path :portkey.aws.fsx.data-repository-configuration/imported-file-chunk-size]))

(clojure.spec.alpha/def :portkey.aws.fsx/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 21)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(vpc-[0-9a-f]{8,})$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.backup-not-found/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/backup-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.backup-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-4[a-fA-F0-9]{3}-[89aAbB][a-fA-F0-9]{3}-[a-fA-F0-9]{12}|arn:aws[a-z-]{0,7}:kms:[a-z]{2}-[a-z-]{4,}-\d+:\d{12}:(key|alias)\/([a-fA-F0-9]{8}-[a-fA-F0-9]{4}-4[a-fA-F0-9]{3}-[89aAbB][a-fA-F0-9]{3}-[a-fA-F0-9]{12}|[a-zA-Z0-9:\/_-]+)|alias\/[a-zA-Z0-9:\/_-]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/parameter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__)))))

(clojure.spec.alpha/def :portkey.aws.fsx/file-system-type #{:windows "WINDOWS" "LUSTRE" :lustre})

(clojure.spec.alpha/def :portkey.aws.fsx/network-interface-ids (clojure.spec.alpha/coll-of :portkey.aws.fsx/network-interface-id :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-lustre-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-lustre-configuration/import-path (clojure.spec.alpha/and :portkey.aws.fsx/archive-path))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-lustre-configuration/export-path (clojure.spec.alpha/and :portkey.aws.fsx/archive-path))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-lustre-configuration/imported-file-chunk-size (clojure.spec.alpha/and :portkey.aws.fsx/megabytes))
(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-lustre-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.create-file-system-lustre-configuration/weekly-maintenance-start-time :portkey.aws.fsx.create-file-system-lustre-configuration/import-path :portkey.aws.fsx.create-file-system-lustre-configuration/export-path :portkey.aws.fsx.create-file-system-lustre-configuration/imported-file-chunk-size]))

(clojure.spec.alpha/def :portkey.aws.fsx/filters (clojure.spec.alpha/coll-of :portkey.aws.fsx/filter :max-count 10))

(clojure.spec.alpha/def :portkey.aws.fsx/progress-percent (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.fsx.active-directory-error/active-directory-id (clojure.spec.alpha/and :portkey.aws.fsx/directory-id))
(clojure.spec.alpha/def :portkey.aws.fsx.active-directory-error/type (clojure.spec.alpha/and :portkey.aws.fsx/active-directory-error-type))
(clojure.spec.alpha/def :portkey.aws.fsx.active-directory-error/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/active-directory-error (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx.active-directory-error/active-directory-id] :opt-un [:portkey.aws.fsx.active-directory-error/type :portkey.aws.fsx.active-directory-error/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.fsx/backups (clojure.spec.alpha/coll-of :portkey.aws.fsx/backup :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-system]))

(clojure.spec.alpha/def :portkey.aws.fsx/directory-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 12)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^d-[0-9a-f]{10}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-windows-configuration/active-directory-id (clojure.spec.alpha/and :portkey.aws.fsx/directory-id))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-windows-configuration/throughput-capacity (clojure.spec.alpha/and :portkey.aws.fsx/megabytes-per-second))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-windows-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-windows-configuration/daily-automatic-backup-start-time (clojure.spec.alpha/and :portkey.aws.fsx/daily-time))
(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-windows-configuration/copy-tags-to-backups (clojure.spec.alpha/and :portkey.aws.fsx/flag))
(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-windows-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx.create-file-system-windows-configuration/throughput-capacity] :opt-un [:portkey.aws.fsx.create-file-system-windows-configuration/active-directory-id :portkey.aws.fsx.create-file-system-windows-configuration/weekly-maintenance-start-time :portkey.aws.fsx.create-file-system-windows-configuration/daily-automatic-backup-start-time :portkey.aws.fsx/automatic-backup-retention-days :portkey.aws.fsx.create-file-system-windows-configuration/copy-tags-to-backups]))

(clojure.spec.alpha/def :portkey.aws.fsx/backup-type #{"AUTOMATIC" :automatic :user-initiated "USER_INITIATED"})

(clojure.spec.alpha/def :portkey.aws.fsx/file-systems (clojure.spec.alpha/coll-of :portkey.aws.fsx/file-system :max-count 50))

(clojure.spec.alpha/def :portkey.aws.fsx/automatic-backup-retention-days (clojure.spec.alpha/int-in 0 35))

(clojure.spec.alpha/def :portkey.aws.fsx/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.fsx/megabytes-per-second (clojure.spec.alpha/int-in 8 2048))

(clojure.spec.alpha/def :portkey.aws.fsx.tag/key (clojure.spec.alpha/and :portkey.aws.fsx/tag-key))
(clojure.spec.alpha/def :portkey.aws.fsx.tag/value (clojure.spec.alpha/and :portkey.aws.fsx/tag-value))
(clojure.spec.alpha/def :portkey.aws.fsx/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.tag/key :portkey.aws.fsx.tag/value]))

(clojure.spec.alpha/def :portkey.aws.fsx.resource-does-not-support-tagging/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/resource-does-not-support-tagging (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn] :opt-un [:portkey.aws.fsx.resource-does-not-support-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.create-file-system-from-backup-request/windows-configuration (clojure.spec.alpha/and :portkey.aws.fsx/create-file-system-windows-configuration))
(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-from-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/backup-id :portkey.aws.fsx/subnet-ids] :opt-un [:portkey.aws.fsx/client-request-token :portkey.aws.fsx/security-group-ids :portkey.aws.fsx/tags :portkey.aws.fsx.create-file-system-from-backup-request/windows-configuration]))

(clojure.spec.alpha/def :portkey.aws.fsx/create-file-system-from-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/file-system]))

(clojure.spec.alpha/def :portkey.aws.fsx.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.update-file-system-lustre-configuration/weekly-maintenance-start-time (clojure.spec.alpha/and :portkey.aws.fsx/weekly-time))
(clojure.spec.alpha/def :portkey.aws.fsx/update-file-system-lustre-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.update-file-system-lustre-configuration/weekly-maintenance-start-time]))

(clojure.spec.alpha/def :portkey.aws.fsx.invalid-import-path/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/invalid-import-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.invalid-import-path/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/resource-not-found (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn] :opt-un [:portkey.aws.fsx.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.fsx.missing-file-system-configuration/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/missing-file-system-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.missing-file-system-configuration/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/filter-name #{:backuptype "file-system-id" :filesystemid "backup-type"})

(clojure.spec.alpha/def :portkey.aws.fsx/daily-time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 5)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([01]\d|2[0-3]):?([0-5]\d)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/describe-backups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx/backups :portkey.aws.fsx/next-token]))

(clojure.spec.alpha/def :portkey.aws.fsx/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 8 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:aws[a-z-]{0,7}:[A-Za-z0-9][A-za-z0-9_/.-]{0,62}:[A-za-z0-9_/.-]{0,63}:[A-za-z0-9_/.-]{0,63}:[A-Za-z0-9][A-za-z0-9_/.-]{0,127}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fsx/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[0-9a-zA-Z\*\.\\/\?\-\_]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.fsx/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fsx/resource-arn :portkey.aws.fsx/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fsx.invalid-export-path/message (clojure.spec.alpha/and :portkey.aws.fsx/error-message))
(clojure.spec.alpha/def :portkey.aws.fsx/invalid-export-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fsx.invalid-export-path/message]))

(clojure.spec.alpha/def :portkey.aws.fsx/megabytes (clojure.spec.alpha/int-in 1 512000))

(clojure.core/defn tag-resource "Tags an Amazon FSx resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "InternalServerError" :portkey.aws.fsx/internal-server-error, "ResourceNotFound" :portkey.aws.fsx/resource-not-found, "NotServiceResourceError" :portkey.aws.fsx/not-service-resource-error, "ResourceDoesNotSupportTagging" :portkey.aws.fsx/resource-does-not-support-tagging}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.fsx/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/tag-resource-response))

(clojure.core/defn create-file-system-from-backup "Creates a new Amazon FSx file system from an existing Amazon FSx for Windows\nFile Server backup.\n If a file system with the specified client request token exists and the\nparameters match, this call returns the description of the existing file system.\nIf a client request token specified by the file system exists and the parameters\ndon't match, this call returns IncompatibleParameterError. If a file system with\nthe specified client request token doesn't exist, this operation does the\nfollowing:\n * Creates a new Amazon FSx file system from backup with an assigned ID, and an\ninitial lifecycle state of CREATING.\n * Returns the description of the file system.\n Parameters like Active Directory, default share name, automatic backup, and\nbackup settings default to the parameters of the file system that was backed up,\nunless overridden. You can explicitly supply other settings.\n By using the idempotent operation, you can retry a CreateFileSystemFromBackup\ncall without the risk of creating an extra file system. This approach can be\nuseful when an initial call fails in a way that makes it unclear whether a file\nsystem was created. Examples are if a transport level timeout occurred, or your\nconnection was reset. If you use the same client request token and the initial\ncall created a file system, the client receives success as long as the\nparameters are the same.\n The CreateFileSystemFromBackup call returns while the file system's lifecycle\nstate is still CREATING. You can check the file-system creation status by\ncalling the DescribeFileSystems operation, which returns the file system state\nalong with other information." ([create-file-system-from-backup-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-file-system-from-backup-request create-file-system-from-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/create-file-system-from-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/create-file-system-from-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFileSystemFromBackup", :http.request.configuration/output-deser-fn response-create-file-system-from-backup-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "ActiveDirectoryError" :portkey.aws.fsx/active-directory-error, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "InvalidNetworkSettings" :portkey.aws.fsx/invalid-network-settings, "ServiceLimitExceeded" :portkey.aws.fsx/service-limit-exceeded, "BackupNotFound" :portkey.aws.fsx/backup-not-found, "InternalServerError" :portkey.aws.fsx/internal-server-error, "MissingFileSystemConfiguration" :portkey.aws.fsx/missing-file-system-configuration}})))))
(clojure.spec.alpha/fdef create-file-system-from-backup :args (clojure.spec.alpha/tuple :portkey.aws.fsx/create-file-system-from-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/create-file-system-from-backup-response))

(clojure.core/defn describe-file-systems "Returns the description of specific Amazon FSx file systems, if a FileSystemIds\nvalue is provided for that file system. Otherwise, it returns descriptions of\nall file systems owned by your AWS account in the AWS Region of the endpoint\nthat you're calling.\n When retrieving all file system descriptions, you can optionally specify the\nMaxResults parameter to limit the number of descriptions in a response. If more\nfile system descriptions remain, Amazon FSx returns a NextToken value in the\nresponse. In this case, send a later request with the NextToken request\nparameter set to the value of NextToken from the last response.\n This action is used in an iterative process to retrieve a list of your file\nsystem descriptions. DescribeFileSystems is called first without a\nNextTokenvalue. Then the action continues to be called with the NextToken\nparameter set to the value of the last NextToken value until a response has no\nNextToken.\n When using this action, keep the following in mind:\n * The implementation might return fewer than MaxResults file system\ndescriptions while still including a NextToken value.\n * The order of file systems returned in the response of one DescribeFileSystems\ncall and the order of file systems returned across the responses of a multicall\niteration is unspecified." ([] (describe-file-systems {})) ([describe-file-systems-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-file-systems-request describe-file-systems-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/describe-file-systems-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/describe-file-systems-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFileSystems", :http.request.configuration/output-deser-fn response-describe-file-systems-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "FileSystemNotFound" :portkey.aws.fsx/file-system-not-found, "InternalServerError" :portkey.aws.fsx/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-file-systems :args (clojure.spec.alpha/? :portkey.aws.fsx/describe-file-systems-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/describe-file-systems-response))

(clojure.core/defn list-tags-for-resource "Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx\nfor Windows File Server.\n When retrieving all tags, you can optionally specify the MaxResults parameter\nto limit the number of tags in a response. If more tags remain, Amazon FSx\nreturns a NextToken value in the response. In this case, send a later request\nwith the NextToken request parameter set to the value of NextToken from the last\nresponse.\n This action is used in an iterative process to retrieve a list of your tags.\nListTagsForResource is called first without a NextTokenvalue. Then the action\ncontinues to be called with the NextToken parameter set to the value of the last\nNextToken value until a response has no NextToken.\n When using this action, keep the following in mind:\n * The implementation might return fewer than MaxResults file system\ndescriptions while still including a NextToken value.\n * The order of tags returned in the response of one ListTagsForResource call\nand the order of tags returned across the responses of a multi-call iteration is\nunspecified." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "InternalServerError" :portkey.aws.fsx/internal-server-error, "ResourceNotFound" :portkey.aws.fsx/resource-not-found, "NotServiceResourceError" :portkey.aws.fsx/not-service-resource-error, "ResourceDoesNotSupportTagging" :portkey.aws.fsx/resource-does-not-support-tagging}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.fsx/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/list-tags-for-resource-response))

(clojure.core/defn create-file-system "Creates a new, empty Amazon FSx file system.\n If a file system with the specified client request token exists and the\nparameters match, CreateFileSystem returns the description of the existing file\nsystem. If a file system specified client request token exists and the\nparameters don't match, this call returns IncompatibleParameterError. If a file\nsystem with the specified client request token doesn't exist, CreateFileSystem\ndoes the following:\n * Creates a new, empty Amazon FSx file system with an assigned ID, and an\ninitial lifecycle state of CREATING.\n * Returns the description of the file system.\n This operation requires a client request token in the request that Amazon FSx\nuses to ensure idempotent creation. This means that calling the operation\nmultiple times with the same client request token has no effect. By using the\nidempotent operation, you can retry a CreateFileSystem operation without the\nrisk of creating an extra file system. This approach can be useful when an\ninitial call fails in a way that makes it unclear whether a file system was\ncreated. Examples are if a transport level timeout occurred, or your connection\nwas reset. If you use the same client request token and the initial call created\na file system, the client receives success as long as the parameters are the\nsame.\n The CreateFileSystem call returns while the file system's lifecycle state is\nstill CREATING. You can check the file-system creation status by calling the\nDescribeFileSystems operation, which returns the file system state along with\nother information." ([create-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-file-system-request create-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/create-file-system-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/create-file-system-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFileSystem", :http.request.configuration/output-deser-fn response-create-file-system-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "ServiceLimitExceeded" :portkey.aws.fsx/service-limit-exceeded, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "InvalidNetworkSettings" :portkey.aws.fsx/invalid-network-settings, "ActiveDirectoryError" :portkey.aws.fsx/active-directory-error, "InternalServerError" :portkey.aws.fsx/internal-server-error, "InvalidImportPath" :portkey.aws.fsx/invalid-import-path, "MissingFileSystemConfiguration" :portkey.aws.fsx/missing-file-system-configuration, "InvalidExportPath" :portkey.aws.fsx/invalid-export-path}})))))
(clojure.spec.alpha/fdef create-file-system :args (clojure.spec.alpha/tuple :portkey.aws.fsx/create-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/create-file-system-response))

(clojure.core/defn create-backup "Creates a backup of an existing Amazon FSx for Windows File Server file system.\nCreating regular backups for your file system is a best practice that\ncomplements the replication that Amazon FSx for Windows File Server performs for\nyour file system. It also enables you to restore from user modification of data.\n If a backup with the specified client request token exists, and the parameters\nmatch, this operation returns the description of the existing backup. If a\nbackup specified client request token exists, and the parameters don't match,\nthis operation returns IncompatibleParameterError. If a backup with the\nspecified client request token doesn't exist, CreateBackup does the following:\n * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle\nstate of CREATING.\n * Returns the description of the backup.\n By using the idempotent operation, you can retry a CreateBackup operation\nwithout the risk of creating an extra backup. This approach can be useful when\nan initial call fails in a way that makes it unclear whether a backup was\ncreated. If you use the same client request token and the initial call created a\nbackup, the operation returns a successful result because all the parameters are\nthe same.\n The CreateFileSystem operation returns while the backup's lifecycle state is\nstill CREATING. You can check the file system creation status by calling the\nDescribeBackups operation, which returns the backup state along with other\ninformation." ([create-backup-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-backup-request create-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/create-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/create-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBackup", :http.request.configuration/output-deser-fn response-create-backup-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "FileSystemNotFound" :portkey.aws.fsx/file-system-not-found, "BackupInProgress" :portkey.aws.fsx/backup-in-progress, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "ServiceLimitExceeded" :portkey.aws.fsx/service-limit-exceeded, "InternalServerError" :portkey.aws.fsx/internal-server-error}})))))
(clojure.spec.alpha/fdef create-backup :args (clojure.spec.alpha/tuple :portkey.aws.fsx/create-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/create-backup-response))

(clojure.core/defn untag-resource "This action removes a tag from an Amazon FSx resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "InternalServerError" :portkey.aws.fsx/internal-server-error, "ResourceNotFound" :portkey.aws.fsx/resource-not-found, "NotServiceResourceError" :portkey.aws.fsx/not-service-resource-error, "ResourceDoesNotSupportTagging" :portkey.aws.fsx/resource-does-not-support-tagging}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.fsx/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/untag-resource-response))

(clojure.core/defn update-file-system "Updates a file system configuration." ([update-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-file-system-request update-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/update-file-system-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/update-file-system-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFileSystem", :http.request.configuration/output-deser-fn response-update-file-system-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "InternalServerError" :portkey.aws.fsx/internal-server-error, "FileSystemNotFound" :portkey.aws.fsx/file-system-not-found, "MissingFileSystemConfiguration" :portkey.aws.fsx/missing-file-system-configuration}})))))
(clojure.spec.alpha/fdef update-file-system :args (clojure.spec.alpha/tuple :portkey.aws.fsx/update-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/update-file-system-response))

(clojure.core/defn delete-backup "Deletes an Amazon FSx for Windows File Server backup, deleting its contents.\nAfter deletion, the backup no longer exists, and its data is gone.\n The DeleteBackup call returns instantly. The backup will not show up in later\nDescribeBackups calls.\n The data in a deleted backup is also deleted and can't be recovered by any\nmeans." ([delete-backup-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-backup-request delete-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/delete-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/delete-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBackup", :http.request.configuration/output-deser-fn response-delete-backup-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "BackupInProgress" :portkey.aws.fsx/backup-in-progress, "BackupNotFound" :portkey.aws.fsx/backup-not-found, "BackupRestoring" :portkey.aws.fsx/backup-restoring, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "InternalServerError" :portkey.aws.fsx/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.fsx/delete-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/delete-backup-response))

(clojure.core/defn describe-backups "Returns the description of specific Amazon FSx for Windows File Server backups,\nif a BackupIds value is provided for that backup. Otherwise, it returns all\nbackups owned by your AWS account in the AWS Region of the endpoint that you're\ncalling.\n When retrieving all backups, you can optionally specify the MaxResults\nparameter to limit the number of backups in a response. If more backups remain,\nAmazon FSx returns a NextToken value in the response. In this case, send a later\nrequest with the NextToken request parameter set to the value of NextToken from\nthe last response.\n This action is used in an iterative process to retrieve a list of your backups.\nDescribeBackups is called first without a NextTokenvalue. Then the action\ncontinues to be called with the NextToken parameter set to the value of the last\nNextToken value until a response has no NextToken.\n When using this action, keep the following in mind:\n * The implementation might return fewer than MaxResults file system\ndescriptions while still including a NextToken value.\n * The order of backups returned in the response of one DescribeBackups call and\nthe order of backups returned across the responses of a multi-call iteration is\nunspecified." ([] (describe-backups {})) ([describe-backups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-backups-request describe-backups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/describe-backups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/describe-backups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBackups", :http.request.configuration/output-deser-fn response-describe-backups-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "FileSystemNotFound" :portkey.aws.fsx/file-system-not-found, "BackupNotFound" :portkey.aws.fsx/backup-not-found, "InternalServerError" :portkey.aws.fsx/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-backups :args (clojure.spec.alpha/? :portkey.aws.fsx/describe-backups-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/describe-backups-response))

(clojure.core/defn delete-file-system "Deletes a file system, deleting its contents. After deletion, the file system no\nlonger exists, and its data is gone. Any existing automatic backups will also be\ndeleted.\n By default, when you delete an Amazon FSx for Windows File Server file system,\na final backup is created upon deletion. This final backup is not subject to the\nfile system's retention policy, and must be manually deleted.\n The DeleteFileSystem action returns while the file system has the DELETING\nstatus. You can check the file system deletion status by calling the\nDescribeFileSystems action, which returns a list of file systems in your\naccount. If you pass the file system ID for a deleted file system, the\nDescribeFileSystems returns a FileSystemNotFound error.\n The data in a deleted file system is also deleted and can't be recovered by any\nmeans." ([delete-file-system-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-file-system-request delete-file-system-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.fsx/endpoints, :http.request.configuration/target-prefix "AWSSimbaAPIService_v20180301", :http.request.spec/output-spec :portkey.aws.fsx/delete-file-system-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-03-01", :http.request.configuration/service-id "FSx", :http.request.spec/input-spec :portkey.aws.fsx/delete-file-system-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFileSystem", :http.request.configuration/output-deser-fn response-delete-file-system-response, :http.request.spec/error-spec {"BadRequest" :portkey.aws.fsx/bad-request, "IncompatibleParameterError" :portkey.aws.fsx/incompatible-parameter-error, "FileSystemNotFound" :portkey.aws.fsx/file-system-not-found, "ServiceLimitExceeded" :portkey.aws.fsx/service-limit-exceeded, "InternalServerError" :portkey.aws.fsx/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-file-system :args (clojure.spec.alpha/tuple :portkey.aws.fsx/delete-file-system-request) :ret (clojure.spec.alpha/and :portkey.aws.fsx/delete-file-system-response))
