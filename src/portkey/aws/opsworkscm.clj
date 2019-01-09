(ns portkey.aws.opsworkscm (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-service-role-arn)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-engine-attribute)

(clojure.core/declare ser-backup-id)

(clojure.core/declare ser-engine-attribute-name)

(clojure.core/declare ser-instance-profile-arn)

(clojure.core/declare ser-strings)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-node-name)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-time-window-definition)

(clojure.core/declare ser-backup-retention-count-definition)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-node-association-status-token)

(clojure.core/declare ser-engine-attributes)

(clojure.core/declare ser-key-pair)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-server-name)

(clojure.core/declare ser-engine-attribute-value)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-service-role-arn [input] #:http.request.field{:value input, :shape "ServiceRoleArn"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-engine-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EngineAttribute", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attribute-name (input :name)) #:http.request.field{:name "Name", :shape "EngineAttributeName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "EngineAttributeValue"}))))

(clojure.core/defn- ser-backup-id [input] #:http.request.field{:value input, :shape "BackupId"})

(clojure.core/defn- ser-engine-attribute-name [input] #:http.request.field{:value input, :shape "EngineAttributeName"})

(clojure.core/defn- ser-instance-profile-arn [input] #:http.request.field{:value input, :shape "InstanceProfileArn"})

(clojure.core/defn- ser-strings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "Strings", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-node-name [input] #:http.request.field{:value input, :shape "NodeName"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-time-window-definition [input] #:http.request.field{:value input, :shape "TimeWindowDefinition"})

(clojure.core/defn- ser-backup-retention-count-definition [input] #:http.request.field{:value input, :shape "BackupRetentionCountDefinition"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-node-association-status-token [input] #:http.request.field{:value input, :shape "NodeAssociationStatusToken"})

(clojure.core/defn- ser-engine-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-engine-attribute coll) #:http.request.field{:shape "EngineAttribute"}))) input), :shape "EngineAttributes", :type "list"})

(clojure.core/defn- ser-key-pair [input] #:http.request.field{:value input, :shape "KeyPair"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-server-name [input] #:http.request.field{:value input, :shape "ServerName"})

(clojure.core/defn- ser-engine-attribute-value [input] #:http.request.field{:value input, :shape "EngineAttributeValue"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-export-server-engine-attribute-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :export-attribute-name)) #:http.request.field{:name "ExportAttributeName", :shape "String"}) (clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :input-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attributes (input :input-attributes)) #:http.request.field{:name "InputAttributes", :shape "EngineAttributes"}))))

(clojure.core/defn- req-update-server-engine-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"}) (clojure.core/into (ser-attribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeName"})]} (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "AttributeValue"}))))

(clojure.core/defn- req-describe-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-backups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :backup-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})) (clojure.core/contains? input :server-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-disassociate-node-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"}) (clojure.core/into (ser-node-name (input :node-name)) #:http.request.field{:name "NodeName", :shape "NodeName"})]} (clojure.core/contains? input :engine-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attributes (input :engine-attributes)) #:http.request.field{:name "EngineAttributes", :shape "EngineAttributes"}))))

(clojure.core/defn- req-describe-servers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :server-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})]}))

(clojure.core/defn- req-start-maintenance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :engine-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attributes (input :engine-attributes)) #:http.request.field{:name "EngineAttributes", :shape "EngineAttributes"}))))

(clojure.core/defn- req-describe-node-association-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-node-association-status-token (input :node-association-status-token)) #:http.request.field{:name "NodeAssociationStatusToken", :shape "NodeAssociationStatusToken"}) (clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]}))

(clojure.core/defn- req-create-backup-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}))))

(clojure.core/defn- req-delete-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]}))

(clojure.core/defn- req-describe-account-attributes-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"}) (clojure.core/into (ser-instance-profile-arn (input :instance-profile-arn)) #:http.request.field{:name "InstanceProfileArn", :shape "InstanceProfileArn"}) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"}) (clojure.core/into (ser-service-role-arn (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "ServiceRoleArn"})]} (clojure.core/contains? input :associate-public-ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :associate-public-ip-address)) #:http.request.field{:name "AssociatePublicIpAddress", :shape "Boolean"})) (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "Strings"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-strings (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "Strings"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-window-definition (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "TimeWindowDefinition"})) (clojure.core/contains? input :backup-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"})) (clojure.core/contains? input :backup-retention-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backup-retention-count-definition (input :backup-retention-count)) #:http.request.field{:name "BackupRetentionCount", :shape "BackupRetentionCountDefinition"})) (clojure.core/contains? input :engine-model) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-model)) #:http.request.field{:name "EngineModel", :shape "String"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "String"})) (clojure.core/contains? input :disable-automated-backup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :disable-automated-backup)) #:http.request.field{:name "DisableAutomatedBackup", :shape "Boolean"})) (clojure.core/contains? input :engine-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-attributes (input :engine-attributes)) #:http.request.field{:name "EngineAttributes", :shape "EngineAttributes"})) (clojure.core/contains? input :key-pair) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-pair (input :key-pair)) #:http.request.field{:name "KeyPair", :shape "KeyPair"})) (clojure.core/contains? input :engine) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine)) #:http.request.field{:name "Engine", :shape "String"})) (clojure.core/contains? input :preferred-backup-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-window-definition (input :preferred-backup-window)) #:http.request.field{:name "PreferredBackupWindow", :shape "TimeWindowDefinition"}))))

(clojure.core/defn- req-restore-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-backup-id (input :backup-id)) #:http.request.field{:name "BackupId", :shape "BackupId"}) (clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "String"})) (clojure.core/contains? input :key-pair) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-pair (input :key-pair)) #:http.request.field{:name "KeyPair", :shape "KeyPair"}))))

(clojure.core/defn- req-associate-node-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"}) (clojure.core/into (ser-node-name (input :node-name)) #:http.request.field{:name "NodeName", :shape "NodeName"}) (clojure.core/into (ser-engine-attributes (input :engine-attributes)) #:http.request.field{:name "EngineAttributes", :shape "EngineAttributes"})]}))

(clojure.core/defn- req-update-server-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-name (input :server-name)) #:http.request.field{:name "ServerName", :shape "ServerName"})]} (clojure.core/contains? input :disable-automated-backup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :disable-automated-backup)) #:http.request.field{:name "DisableAutomatedBackup", :shape "Boolean"})) (clojure.core/contains? input :backup-retention-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :backup-retention-count)) #:http.request.field{:name "BackupRetentionCount", :shape "Integer"})) (clojure.core/contains? input :preferred-maintenance-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-window-definition (input :preferred-maintenance-window)) #:http.request.field{:name "PreferredMaintenanceWindow", :shape "TimeWindowDefinition"})) (clojure.core/contains? input :preferred-backup-window) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-window-definition (input :preferred-backup-window)) #:http.request.field{:name "PreferredBackupWindow", :shape "TimeWindowDefinition"}))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/disassociate-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/node-association-status-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/service-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]{12}:role/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/backup-status #{"IN_PROGRESS" :in-progress :deleting "OK" :ok "DELETING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm/create-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/backup]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.validation-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/start-maintenance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.export-server-engine-attribute-request/export-attribute-name (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.export-server-engine-attribute-request/input-attributes (clojure.spec.alpha/and :portkey.aws.opsworkscm/engine-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/export-server-engine-attribute-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.export-server-engine-attribute-request/export-attribute-name :portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm.export-server-engine-attribute-request/input-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Z][A-Z0-9_]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.engine-attribute/name (clojure.spec.alpha/and :portkey.aws.opsworkscm/engine-attribute-name))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.engine-attribute/value (clojure.spec.alpha/and :portkey.aws.opsworkscm/engine-attribute-value))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/engine-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.engine-attribute/name :portkey.aws.opsworkscm.engine-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/update-server-engine-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/attribute-name] :opt-un [:portkey.aws.opsworkscm/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/backup-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 79))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/engine-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/instance-profile-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]{12}:instance-profile/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm/next-token :portkey.aws.opsworkscm/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-backups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/backup-id :portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/next-token :portkey.aws.opsworkscm/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/export-server-engine-attribute-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/engine-attribute :portkey.aws.opsworkscm/server-name]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/delete-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/node-association-status #{"SUCCESS" "IN_PROGRESS" :in-progress :success "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm/disassociate-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/node-name] :opt-un [:portkey.aws.opsworkscm/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/next-token :portkey.aws.opsworkscm/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/strings (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/string))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/delete-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/restore-server-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/delete-server-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/server-status #{:modifying "UNDER_MAINTENANCE" "RESTORING" :creating "BACKING_UP" :restoring :unhealthy "TERMINATED" "SETUP" :deleting :running :setup :healthy "CONNECTION_LOST" :backing-up :terminated "DELETING" :under-maintenance "CREATING" "HEALTHY" "FAILED" :connection-lost :failed "RUNNING" "MODIFYING" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.describe-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-servers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/servers :portkey.aws.opsworkscm.describe-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/update-server-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/start-maintenance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-node-association-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/node-association-status-token :portkey.aws.opsworkscm/server-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/node-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[\-\p{Alnum}_:.]+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/servers (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/server))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-backup-request/description (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/create-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm.create-backup-request/description]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/time-window-definition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/s-3-data-url (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/s-3-data-size (clojure.spec.alpha/and :portkey.aws.opsworkscm/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/status (clojure.spec.alpha/and :portkey.aws.opsworkscm/backup-status))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/tools-version (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/status-description (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/description (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/backup-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/s-3-log-url (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/key-pair (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.backup/user-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/backup (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.backup/s-3-data-url :portkey.aws.opsworkscm.backup/service-role-arn :portkey.aws.opsworkscm.backup/subnet-ids :portkey.aws.opsworkscm.backup/s-3-data-size :portkey.aws.opsworkscm.backup/security-group-ids :portkey.aws.opsworkscm.backup/preferred-maintenance-window :portkey.aws.opsworkscm/backup-id :portkey.aws.opsworkscm.backup/instance-type :portkey.aws.opsworkscm.backup/instance-profile-arn :portkey.aws.opsworkscm.backup/status :portkey.aws.opsworkscm.backup/engine-model :portkey.aws.opsworkscm.backup/tools-version :portkey.aws.opsworkscm.backup/engine-version :portkey.aws.opsworkscm.backup/status-description :portkey.aws.opsworkscm.backup/description :portkey.aws.opsworkscm.backup/backup-arn :portkey.aws.opsworkscm.backup/s-3-log-url :portkey.aws.opsworkscm.backup/created-at :portkey.aws.opsworkscm/backup-type :portkey.aws.opsworkscm.backup/key-pair :portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm.backup/engine :portkey.aws.opsworkscm.backup/preferred-backup-window :portkey.aws.opsworkscm.backup/user-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/backup-retention-count-definition (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.server-event/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server-event/server-name (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server-event/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server-event/log-url (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/server-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.server-event/created-at :portkey.aws.opsworkscm.server-event/server-name :portkey.aws.opsworkscm.server-event/message :portkey.aws.opsworkscm.server-event/log-url]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/delete-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.opsworkscm/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-account-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/create-server-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/node-association-status-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/associate-public-ip-address (clojure.spec.alpha/and :portkey.aws.opsworkscm/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/server-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/status (clojure.spec.alpha/and :portkey.aws.opsworkscm/server-status))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/status-reason (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/cloud-formation-stack-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/endpoint (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/key-pair (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/server-name (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.server/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.server/service-role-arn :portkey.aws.opsworkscm.server/associate-public-ip-address :portkey.aws.opsworkscm.server/subnet-ids :portkey.aws.opsworkscm.server/server-arn :portkey.aws.opsworkscm.server/security-group-ids :portkey.aws.opsworkscm.server/preferred-maintenance-window :portkey.aws.opsworkscm.server/instance-type :portkey.aws.opsworkscm.server/instance-profile-arn :portkey.aws.opsworkscm.server/status :portkey.aws.opsworkscm.server/backup-retention-count :portkey.aws.opsworkscm.server/engine-model :portkey.aws.opsworkscm.server/engine-version :portkey.aws.opsworkscm.server/status-reason :portkey.aws.opsworkscm.server/cloud-formation-stack-arn :portkey.aws.opsworkscm.server/disable-automated-backup :portkey.aws.opsworkscm.server/created-at :portkey.aws.opsworkscm/engine-attributes :portkey.aws.opsworkscm.server/endpoint :portkey.aws.opsworkscm.server/key-pair :portkey.aws.opsworkscm.server/server-name :portkey.aws.opsworkscm.server/engine :portkey.aws.opsworkscm.server/preferred-backup-window :portkey.aws.opsworkscm/maintenance-status]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/associate-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/node-association-status-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/backups (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/backup))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/update-server-engine-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/engine-attributes (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/engine-attribute))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/associate-public-ip-address (clojure.spec.alpha/and :portkey.aws.opsworkscm/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm/backup-retention-count-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.create-server-request/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/create-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/instance-profile-arn :portkey.aws.opsworkscm.create-server-request/instance-type :portkey.aws.opsworkscm/service-role-arn] :opt-un [:portkey.aws.opsworkscm.create-server-request/associate-public-ip-address :portkey.aws.opsworkscm.create-server-request/subnet-ids :portkey.aws.opsworkscm.create-server-request/security-group-ids :portkey.aws.opsworkscm.create-server-request/preferred-maintenance-window :portkey.aws.opsworkscm/backup-id :portkey.aws.opsworkscm.create-server-request/backup-retention-count :portkey.aws.opsworkscm.create-server-request/engine-model :portkey.aws.opsworkscm.create-server-request/engine-version :portkey.aws.opsworkscm.create-server-request/disable-automated-backup :portkey.aws.opsworkscm/engine-attributes :portkey.aws.opsworkscm/key-pair :portkey.aws.opsworkscm.create-server-request/engine :portkey.aws.opsworkscm.create-server-request/preferred-backup-window]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.restore-server-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/restore-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/backup-id :portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm.restore-server-request/instance-type :portkey.aws.opsworkscm/key-pair]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/backup-type #{"AUTOMATED" :automated :manual "MANUAL"})

(clojure.spec.alpha/def :portkey.aws.opsworkscm/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.opsworkscm/associate-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name :portkey.aws.opsworkscm/node-name :portkey.aws.opsworkscm/engine-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.describe-account-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.opsworkscm/account-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-account-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.describe-account-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/server-events (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/server-event))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/key-pair (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/server-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 40)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9\-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/account-attributes (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm/account-attribute))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/engine-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.update-server-request/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.update-server-request/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.update-server-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.update-server-request/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/update-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm/server-name] :opt-un [:portkey.aws.opsworkscm.update-server-request/disable-automated-backup :portkey.aws.opsworkscm.update-server-request/backup-retention-count :portkey.aws.opsworkscm.update-server-request/preferred-maintenance-window :portkey.aws.opsworkscm.update-server-request/preferred-backup-window]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.describe-backups-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-backups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/backups :portkey.aws.opsworkscm.describe-backups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.describe-events-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/server-events :portkey.aws.opsworkscm.describe-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.account-attribute/name (clojure.spec.alpha/and :portkey.aws.opsworkscm/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.account-attribute/maximum (clojure.spec.alpha/and :portkey.aws.opsworkscm/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.account-attribute/used (clojure.spec.alpha/and :portkey.aws.opsworkscm/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm/account-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.account-attribute/name :portkey.aws.opsworkscm.account-attribute/maximum :portkey.aws.opsworkscm.account-attribute/used]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/describe-node-association-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm/node-association-status :portkey.aws.opsworkscm/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm/maintenance-status #{"SUCCESS" :success "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm/boolean clojure.core/boolean?)

(clojure.core/defn describe-events ([describe-events-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-events-request describe-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/describe-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEvents", :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm/validation-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm/invalid-next-token-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/describe-events-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/describe-events-response))

(clojure.core/defn update-server ([update-server-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-server-request update-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/update-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/update-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateServer", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef update-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/update-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/update-server-response))

(clojure.core/defn associate-node ([associate-node-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-node-request associate-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/associate-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/associate-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateNode", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef associate-node :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/associate-node-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/associate-node-response))

(clojure.core/defn start-maintenance ([start-maintenance-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-maintenance-request start-maintenance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/start-maintenance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/start-maintenance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartMaintenance", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef start-maintenance :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/start-maintenance-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/start-maintenance-response))

(clojure.core/defn describe-node-association-status ([describe-node-association-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-node-association-status-request describe-node-association-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/describe-node-association-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/describe-node-association-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNodeAssociationStatus", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef describe-node-association-status :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/describe-node-association-status-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/describe-node-association-status-response))

(clojure.core/defn export-server-engine-attribute ([export-server-engine-attribute-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-export-server-engine-attribute-request export-server-engine-attribute-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/export-server-engine-attribute-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/export-server-engine-attribute-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExportServerEngineAttribute", :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception}})))))
(clojure.spec.alpha/fdef export-server-engine-attribute :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/export-server-engine-attribute-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/export-server-engine-attribute-response))

(clojure.core/defn update-server-engine-attributes ([update-server-engine-attributes-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-server-engine-attributes-request update-server-engine-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/update-server-engine-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/update-server-engine-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateServerEngineAttributes", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef update-server-engine-attributes :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/update-server-engine-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/update-server-engine-attributes-response))

(clojure.core/defn disassociate-node ([disassociate-node-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-node-request disassociate-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/disassociate-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/disassociate-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateNode", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef disassociate-node :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/disassociate-node-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/disassociate-node-response))

(clojure.core/defn create-server ([create-server-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-server-request create-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/create-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/create-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateServer", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.opsworkscm/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.opsworkscm/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef create-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/create-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/create-server-response))

(clojure.core/defn describe-account-attributes ([] (describe-account-attributes {})) ([describe-account-attributes-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-account-attributes-request describe-account-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/describe-account-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/describe-account-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountAttributes", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args (clojure.spec.alpha/? :portkey.aws.opsworkscm/describe-account-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/describe-account-attributes-response))

(clojure.core/defn create-backup ([create-backup-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-backup-request create-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/create-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/create-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateBackup", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "LimitExceededException" :portkey.aws.opsworkscm/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef create-backup :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/create-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/create-backup-response))

(clojure.core/defn delete-server ([delete-server-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-server-request delete-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/delete-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/delete-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServer", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef delete-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/delete-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/delete-server-response))

(clojure.core/defn restore-server ([restore-server-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-restore-server-request restore-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/restore-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/restore-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreServer", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef restore-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/restore-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/restore-server-response))

(clojure.core/defn delete-backup ([delete-backup-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-backup-request delete-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/delete-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/delete-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteBackup", :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm/validation-exception}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm/delete-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/delete-backup-response))

(clojure.core/defn describe-backups ([] (describe-backups {})) ([describe-backups-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-backups-request describe-backups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/describe-backups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/describe-backups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeBackups", :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-backups :args (clojure.spec.alpha/? :portkey.aws.opsworkscm/describe-backups-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/describe-backups-response))

(clojure.core/defn describe-servers ([] (describe-servers {})) ([describe-servers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-servers-request describe-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm/endpoints, :http.request.spec/output-spec :portkey.aws.opsworkscm/describe-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm/describe-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeServers", :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-servers :args (clojure.spec.alpha/? :portkey.aws.opsworkscm/describe-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm/describe-servers-response))
