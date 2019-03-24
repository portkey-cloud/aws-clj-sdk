(ns portkey.aws.opsworkscm.-2016-11-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "opsworks-cm", :region "ap-northeast-1"},
    :ssl-common-name "opsworks-cm.ap-northeast-1.amazonaws.com",
    :endpoint "https://opsworks-cm.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "opsworks-cm", :region "eu-west-1"},
    :ssl-common-name "opsworks-cm.eu-west-1.amazonaws.com",
    :endpoint "https://opsworks-cm.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "opsworks-cm", :region "us-east-2"},
    :ssl-common-name "opsworks-cm.us-east-2.amazonaws.com",
    :endpoint "https://opsworks-cm.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "opsworks-cm", :region "ap-southeast-2"},
    :ssl-common-name "opsworks-cm.ap-southeast-2.amazonaws.com",
    :endpoint "https://opsworks-cm.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "opsworks-cm", :region "ap-southeast-1"},
    :ssl-common-name "opsworks-cm.ap-southeast-1.amazonaws.com",
    :endpoint "https://opsworks-cm.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "opsworks-cm", :region "eu-central-1"},
    :ssl-common-name "opsworks-cm.eu-central-1.amazonaws.com",
    :endpoint "https://opsworks-cm.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "opsworks-cm", :region "us-west-2"},
    :ssl-common-name "opsworks-cm.us-west-2.amazonaws.com",
    :endpoint "https://opsworks-cm.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "opsworks-cm", :region "us-east-1"},
    :ssl-common-name "opsworks-cm.us-east-1.amazonaws.com",
    :endpoint "https://opsworks-cm.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "opsworks-cm", :region "us-west-1"},
    :ssl-common-name "opsworks-cm.us-west-1.amazonaws.com",
    :endpoint "https://opsworks-cm.us-west-1.amazonaws.com",
    :signature-version :v4}})

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

(clojure.core/declare deser-backup-status)

(clojure.core/declare deser-engine-attribute)

(clojure.core/declare deser-backup-id)

(clojure.core/declare deser-engine-attribute-name)

(clojure.core/declare deser-node-association-status)

(clojure.core/declare deser-strings)

(clojure.core/declare deser-server-status)

(clojure.core/declare deser-servers)

(clojure.core/declare deser-time-window-definition)

(clojure.core/declare deser-backup)

(clojure.core/declare deser-server-event)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-node-association-status-token)

(clojure.core/declare deser-server)

(clojure.core/declare deser-backups)

(clojure.core/declare deser-engine-attributes)

(clojure.core/declare deser-backup-type)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-server-events)

(clojure.core/declare deser-server-name)

(clojure.core/declare deser-account-attributes)

(clojure.core/declare deser-engine-attribute-value)

(clojure.core/declare deser-account-attribute)

(clojure.core/declare deser-maintenance-status)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-backup-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "OK" :ok, "FAILED" :failed, "DELETING" :deleting} input))

(clojure.core/defn- deser-engine-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-engine-attribute-name (input "Name"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-engine-attribute-value (input "Value")))))

(clojure.core/defn- deser-backup-id [input] input)

(clojure.core/defn- deser-engine-attribute-name [input] input)

(clojure.core/defn- deser-node-association-status [input] (clojure.core/get {"SUCCESS" :success, "FAILED" :failed, "IN_PROGRESS" :in-progress} input))

(clojure.core/defn- deser-strings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-server-status [input] (clojure.core/get {"UNDER_MAINTENANCE" :under-maintenance, "RESTORING" :restoring, "BACKING_UP" :backing-up, "TERMINATED" :terminated, "SETUP" :setup, "CONNECTION_LOST" :connection-lost, "DELETING" :deleting, "CREATING" :creating, "HEALTHY" :healthy, "FAILED" :failed, "RUNNING" :running, "MODIFYING" :modifying, "UNHEALTHY" :unhealthy} input))

(clojure.core/defn- deser-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server coll))) input))

(clojure.core/defn- deser-time-window-definition [input] input)

(clojure.core/defn- deser-backup [input] (clojure.core/cond-> {} (clojure.core/contains? input "S3DataUrl") (clojure.core/assoc :s-3-data-url (deser-string (input "S3DataUrl"))) (clojure.core/contains? input "ServiceRoleArn") (clojure.core/assoc :service-role-arn (deser-string (input "ServiceRoleArn"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-strings (input "SubnetIds"))) (clojure.core/contains? input "S3DataSize") (clojure.core/assoc :s-3-data-size (deser-integer (input "S3DataSize"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-strings (input "SecurityGroupIds"))) (clojure.core/contains? input "PreferredMaintenanceWindow") (clojure.core/assoc :preferred-maintenance-window (deser-time-window-definition (input "PreferredMaintenanceWindow"))) (clojure.core/contains? input "BackupId") (clojure.core/assoc :backup-id (deser-backup-id (input "BackupId"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-string (input "InstanceType"))) (clojure.core/contains? input "InstanceProfileArn") (clojure.core/assoc :instance-profile-arn (deser-string (input "InstanceProfileArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-backup-status (input "Status"))) (clojure.core/contains? input "EngineModel") (clojure.core/assoc :engine-model (deser-string (input "EngineModel"))) (clojure.core/contains? input "ToolsVersion") (clojure.core/assoc :tools-version (deser-string (input "ToolsVersion"))) (clojure.core/contains? input "EngineVersion") (clojure.core/assoc :engine-version (deser-string (input "EngineVersion"))) (clojure.core/contains? input "StatusDescription") (clojure.core/assoc :status-description (deser-string (input "StatusDescription"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "BackupArn") (clojure.core/assoc :backup-arn (deser-string (input "BackupArn"))) (clojure.core/contains? input "S3LogUrl") (clojure.core/assoc :s-3-log-url (deser-string (input "S3LogUrl"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-timestamp (input "CreatedAt"))) (clojure.core/contains? input "BackupType") (clojure.core/assoc :backup-type (deser-backup-type (input "BackupType"))) (clojure.core/contains? input "KeyPair") (clojure.core/assoc :key-pair (deser-string (input "KeyPair"))) (clojure.core/contains? input "ServerName") (clojure.core/assoc :server-name (deser-server-name (input "ServerName"))) (clojure.core/contains? input "Engine") (clojure.core/assoc :engine (deser-string (input "Engine"))) (clojure.core/contains? input "PreferredBackupWindow") (clojure.core/assoc :preferred-backup-window (deser-time-window-definition (input "PreferredBackupWindow"))) (clojure.core/contains? input "UserArn") (clojure.core/assoc :user-arn (deser-string (input "UserArn")))))

(clojure.core/defn- deser-server-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-timestamp (input "CreatedAt"))) (clojure.core/contains? input "ServerName") (clojure.core/assoc :server-name (deser-string (input "ServerName"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message"))) (clojure.core/contains? input "LogUrl") (clojure.core/assoc :log-url (deser-string (input "LogUrl")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-node-association-status-token [input] input)

(clojure.core/defn- deser-server [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceRoleArn") (clojure.core/assoc :service-role-arn (deser-string (input "ServiceRoleArn"))) (clojure.core/contains? input "AssociatePublicIpAddress") (clojure.core/assoc :associate-public-ip-address (deser-boolean (input "AssociatePublicIpAddress"))) (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-strings (input "SubnetIds"))) (clojure.core/contains? input "ServerArn") (clojure.core/assoc :server-arn (deser-string (input "ServerArn"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-strings (input "SecurityGroupIds"))) (clojure.core/contains? input "PreferredMaintenanceWindow") (clojure.core/assoc :preferred-maintenance-window (deser-time-window-definition (input "PreferredMaintenanceWindow"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-string (input "InstanceType"))) (clojure.core/contains? input "InstanceProfileArn") (clojure.core/assoc :instance-profile-arn (deser-string (input "InstanceProfileArn"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-server-status (input "Status"))) (clojure.core/contains? input "BackupRetentionCount") (clojure.core/assoc :backup-retention-count (deser-integer (input "BackupRetentionCount"))) (clojure.core/contains? input "EngineModel") (clojure.core/assoc :engine-model (deser-string (input "EngineModel"))) (clojure.core/contains? input "EngineVersion") (clojure.core/assoc :engine-version (deser-string (input "EngineVersion"))) (clojure.core/contains? input "StatusReason") (clojure.core/assoc :status-reason (deser-string (input "StatusReason"))) (clojure.core/contains? input "CloudFormationStackArn") (clojure.core/assoc :cloud-formation-stack-arn (deser-string (input "CloudFormationStackArn"))) (clojure.core/contains? input "DisableAutomatedBackup") (clojure.core/assoc :disable-automated-backup (deser-boolean (input "DisableAutomatedBackup"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-timestamp (input "CreatedAt"))) (clojure.core/contains? input "EngineAttributes") (clojure.core/assoc :engine-attributes (deser-engine-attributes (input "EngineAttributes"))) (clojure.core/contains? input "Endpoint") (clojure.core/assoc :endpoint (deser-string (input "Endpoint"))) (clojure.core/contains? input "KeyPair") (clojure.core/assoc :key-pair (deser-string (input "KeyPair"))) (clojure.core/contains? input "ServerName") (clojure.core/assoc :server-name (deser-string (input "ServerName"))) (clojure.core/contains? input "Engine") (clojure.core/assoc :engine (deser-string (input "Engine"))) (clojure.core/contains? input "PreferredBackupWindow") (clojure.core/assoc :preferred-backup-window (deser-time-window-definition (input "PreferredBackupWindow"))) (clojure.core/contains? input "MaintenanceStatus") (clojure.core/assoc :maintenance-status (deser-maintenance-status (input "MaintenanceStatus")))))

(clojure.core/defn- deser-backups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-backup coll))) input))

(clojure.core/defn- deser-engine-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-engine-attribute coll))) input))

(clojure.core/defn- deser-backup-type [input] (clojure.core/get {"AUTOMATED" :automated, "MANUAL" :manual} input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-server-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-event coll))) input))

(clojure.core/defn- deser-server-name [input] input)

(clojure.core/defn- deser-account-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-attribute coll))) input))

(clojure.core/defn- deser-engine-attribute-value [input] input)

(clojure.core/defn- deser-account-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Maximum") (clojure.core/assoc :maximum (deser-integer (input "Maximum"))) (clojure.core/contains? input "Used") (clojure.core/assoc :used (deser-integer (input "Used")))))

(clojure.core/defn- deser-maintenance-status [input] (clojure.core/get {"SUCCESS" :success, "FAILED" :failed} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-disassociate-node-response ([input] (response-disassociate-node-response nil input)) ([resultWrapper1940376 input] (clojure.core/let [rawinput1940375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940377 {"NodeAssociationStatusToken" (rawinput1940375 "NodeAssociationStatusToken")}] (clojure.core/cond-> {} (letvar1940377 "NodeAssociationStatusToken") (clojure.core/assoc :node-association-status-token (deser-node-association-status-token (clojure.core/get-in letvar1940377 ["NodeAssociationStatusToken"])))))))

(clojure.core/defn- response-create-backup-response ([input] (response-create-backup-response nil input)) ([resultWrapper1940379 input] (clojure.core/let [rawinput1940378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940380 {"Backup" (rawinput1940378 "Backup")}] (clojure.core/cond-> {} (letvar1940380 "Backup") (clojure.core/assoc :backup (deser-backup (clojure.core/get-in letvar1940380 ["Backup"])))))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper1940382 input] (clojure.core/let [rawinput1940381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940383 {"Message" (rawinput1940381 "Message")}] (clojure.core/cond-> {} (letvar1940383 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940383 ["Message"])))))))

(clojure.core/defn- response-start-maintenance-response ([input] (response-start-maintenance-response nil input)) ([resultWrapper1940385 input] (clojure.core/let [rawinput1940384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940386 {"Server" (rawinput1940384 "Server")}] (clojure.core/cond-> {} (letvar1940386 "Server") (clojure.core/assoc :server (deser-server (clojure.core/get-in letvar1940386 ["Server"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1940388 input] (clojure.core/let [rawinput1940387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940389 {"Message" (rawinput1940387 "Message")}] (clojure.core/cond-> {} (letvar1940389 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940389 ["Message"])))))))

(clojure.core/defn- response-export-server-engine-attribute-response ([input] (response-export-server-engine-attribute-response nil input)) ([resultWrapper1940391 input] (clojure.core/let [rawinput1940390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940392 {"EngineAttribute" (rawinput1940390 "EngineAttribute"), "ServerName" (rawinput1940390 "ServerName")}] (clojure.core/cond-> {} (letvar1940392 "EngineAttribute") (clojure.core/assoc :engine-attribute (deser-engine-attribute (clojure.core/get-in letvar1940392 ["EngineAttribute"]))) (letvar1940392 "ServerName") (clojure.core/assoc :server-name (deser-server-name (clojure.core/get-in letvar1940392 ["ServerName"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1940394 input] (clojure.core/let [rawinput1940393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940395 {"Message" (rawinput1940393 "Message")}] (clojure.core/cond-> {} (letvar1940395 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940395 ["Message"])))))))

(clojure.core/defn- response-delete-backup-response ([input] (response-delete-backup-response nil input)) ([resultWrapper1940397 input] (clojure.core/let [rawinput1940396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940398 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-restore-server-response ([input] (response-restore-server-response nil input)) ([resultWrapper1940400 input] (clojure.core/let [rawinput1940399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940401 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-server-response ([input] (response-delete-server-response nil input)) ([resultWrapper1940403 input] (clojure.core/let [rawinput1940402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940404 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1940406 input] (clojure.core/let [rawinput1940405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940407 {"Message" (rawinput1940405 "Message")}] (clojure.core/cond-> {} (letvar1940407 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940407 ["Message"])))))))

(clojure.core/defn- response-describe-servers-response ([input] (response-describe-servers-response nil input)) ([resultWrapper1940409 input] (clojure.core/let [rawinput1940408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940410 {"Servers" (rawinput1940408 "Servers"), "NextToken" (rawinput1940408 "NextToken")}] (clojure.core/cond-> {} (letvar1940410 "Servers") (clojure.core/assoc :servers (deser-servers (clojure.core/get-in letvar1940410 ["Servers"]))) (letvar1940410 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1940410 ["NextToken"])))))))

(clojure.core/defn- response-update-server-response ([input] (response-update-server-response nil input)) ([resultWrapper1940412 input] (clojure.core/let [rawinput1940411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940413 {"Server" (rawinput1940411 "Server")}] (clojure.core/cond-> {} (letvar1940413 "Server") (clojure.core/assoc :server (deser-server (clojure.core/get-in letvar1940413 ["Server"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1940415 input] (clojure.core/let [rawinput1940414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940416 {"Message" (rawinput1940414 "Message")}] (clojure.core/cond-> {} (letvar1940416 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940416 ["Message"])))))))

(clojure.core/defn- response-create-server-response ([input] (response-create-server-response nil input)) ([resultWrapper1940418 input] (clojure.core/let [rawinput1940417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940419 {"Server" (rawinput1940417 "Server")}] (clojure.core/cond-> {} (letvar1940419 "Server") (clojure.core/assoc :server (deser-server (clojure.core/get-in letvar1940419 ["Server"])))))))

(clojure.core/defn- response-associate-node-response ([input] (response-associate-node-response nil input)) ([resultWrapper1940421 input] (clojure.core/let [rawinput1940420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940422 {"NodeAssociationStatusToken" (rawinput1940420 "NodeAssociationStatusToken")}] (clojure.core/cond-> {} (letvar1940422 "NodeAssociationStatusToken") (clojure.core/assoc :node-association-status-token (deser-node-association-status-token (clojure.core/get-in letvar1940422 ["NodeAssociationStatusToken"])))))))

(clojure.core/defn- response-update-server-engine-attributes-response ([input] (response-update-server-engine-attributes-response nil input)) ([resultWrapper1940424 input] (clojure.core/let [rawinput1940423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940425 {"Server" (rawinput1940423 "Server")}] (clojure.core/cond-> {} (letvar1940425 "Server") (clojure.core/assoc :server (deser-server (clojure.core/get-in letvar1940425 ["Server"])))))))

(clojure.core/defn- response-invalid-state-exception ([input] (response-invalid-state-exception nil input)) ([resultWrapper1940427 input] (clojure.core/let [rawinput1940426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940428 {"Message" (rawinput1940426 "Message")}] (clojure.core/cond-> {} (letvar1940428 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1940428 ["Message"])))))))

(clojure.core/defn- response-describe-account-attributes-response ([input] (response-describe-account-attributes-response nil input)) ([resultWrapper1940430 input] (clojure.core/let [rawinput1940429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940431 {"Attributes" (rawinput1940429 "Attributes")}] (clojure.core/cond-> {} (letvar1940431 "Attributes") (clojure.core/assoc :attributes (deser-account-attributes (clojure.core/get-in letvar1940431 ["Attributes"])))))))

(clojure.core/defn- response-describe-backups-response ([input] (response-describe-backups-response nil input)) ([resultWrapper1940433 input] (clojure.core/let [rawinput1940432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940434 {"Backups" (rawinput1940432 "Backups"), "NextToken" (rawinput1940432 "NextToken")}] (clojure.core/cond-> {} (letvar1940434 "Backups") (clojure.core/assoc :backups (deser-backups (clojure.core/get-in letvar1940434 ["Backups"]))) (letvar1940434 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1940434 ["NextToken"])))))))

(clojure.core/defn- response-describe-events-response ([input] (response-describe-events-response nil input)) ([resultWrapper1940436 input] (clojure.core/let [rawinput1940435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940437 {"ServerEvents" (rawinput1940435 "ServerEvents"), "NextToken" (rawinput1940435 "NextToken")}] (clojure.core/cond-> {} (letvar1940437 "ServerEvents") (clojure.core/assoc :server-events (deser-server-events (clojure.core/get-in letvar1940437 ["ServerEvents"]))) (letvar1940437 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1940437 ["NextToken"])))))))

(clojure.core/defn- response-describe-node-association-status-response ([input] (response-describe-node-association-status-response nil input)) ([resultWrapper1940439 input] (clojure.core/let [rawinput1940438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1940440 {"NodeAssociationStatus" (rawinput1940438 "NodeAssociationStatus"), "EngineAttributes" (rawinput1940438 "EngineAttributes")}] (clojure.core/cond-> {} (letvar1940440 "NodeAssociationStatus") (clojure.core/assoc :node-association-status (deser-node-association-status (clojure.core/get-in letvar1940440 ["NodeAssociationStatus"]))) (letvar1940440 "EngineAttributes") (clojure.core/assoc :engine-attributes (deser-engine-attributes (clojure.core/get-in letvar1940440 ["EngineAttributes"])))))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/node-association-status-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/service-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]{12}:role/.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backup-status #{"IN_PROGRESS" :in-progress :deleting "OK" :ok "DELETING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/create-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/backup]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.validation-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.export-server-engine-attribute-request/export-attribute-name (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.export-server-engine-attribute-request/input-attributes (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/engine-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01.export-server-engine-attribute-request/export-attribute-name :portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.export-server-engine-attribute-request/input-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[A-Z][A-Z0-9_]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.engine-attribute/name (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/engine-attribute-name))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.engine-attribute/value (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/engine-attribute-value))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/engine-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.engine-attribute/name :portkey.aws.opsworkscm.-2016-11-01.engine-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/attribute-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backup-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 79))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/engine-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/instance-profile-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:aws:iam::[0-9]{12}:instance-profile/.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/next-token :portkey.aws.opsworkscm.-2016-11-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-backups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/backup-id :portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/next-token :portkey.aws.opsworkscm.-2016-11-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/engine-attribute :portkey.aws.opsworkscm.-2016-11-01/server-name]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/delete-backup-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/node-association-status #{"SUCCESS" "IN_PROGRESS" :in-progress :success "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/node-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/next-token :portkey.aws.opsworkscm.-2016-11-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/strings (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/string))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/delete-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/backup-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/restore-server-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/delete-server-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/server-status #{:modifying "UNDER_MAINTENANCE" "RESTORING" :creating "BACKING_UP" :restoring :unhealthy "TERMINATED" "SETUP" :deleting :running :setup :healthy "CONNECTION_LOST" :backing-up :terminated "DELETING" :under-maintenance "CREATING" "HEALTHY" "FAILED" :connection-lost :failed "RUNNING" "MODIFYING" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.describe-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-servers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/servers :portkey.aws.opsworkscm.-2016-11-01.describe-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/update-server-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/node-association-status-token :portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/node-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[\-\p{Alnum}_:.]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/servers (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/server))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-backup-request/description (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/create-backup-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.create-backup-request/description]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/time-window-definition (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^((Mon|Tue|Wed|Thu|Fri|Sat|Sun):)?([0-1][0-9]|2[0-3]):[0-5][0-9]$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/s-3-data-url (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/s-3-data-size (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/status (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/backup-status))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/tools-version (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/status-description (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/description (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/backup-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/s-3-log-url (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/key-pair (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.backup/user-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backup (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.backup/s-3-data-url :portkey.aws.opsworkscm.-2016-11-01.backup/service-role-arn :portkey.aws.opsworkscm.-2016-11-01.backup/subnet-ids :portkey.aws.opsworkscm.-2016-11-01.backup/s-3-data-size :portkey.aws.opsworkscm.-2016-11-01.backup/security-group-ids :portkey.aws.opsworkscm.-2016-11-01.backup/preferred-maintenance-window :portkey.aws.opsworkscm.-2016-11-01/backup-id :portkey.aws.opsworkscm.-2016-11-01.backup/instance-type :portkey.aws.opsworkscm.-2016-11-01.backup/instance-profile-arn :portkey.aws.opsworkscm.-2016-11-01.backup/status :portkey.aws.opsworkscm.-2016-11-01.backup/engine-model :portkey.aws.opsworkscm.-2016-11-01.backup/tools-version :portkey.aws.opsworkscm.-2016-11-01.backup/engine-version :portkey.aws.opsworkscm.-2016-11-01.backup/status-description :portkey.aws.opsworkscm.-2016-11-01.backup/description :portkey.aws.opsworkscm.-2016-11-01.backup/backup-arn :portkey.aws.opsworkscm.-2016-11-01.backup/s-3-log-url :portkey.aws.opsworkscm.-2016-11-01.backup/created-at :portkey.aws.opsworkscm.-2016-11-01/backup-type :portkey.aws.opsworkscm.-2016-11-01.backup/key-pair :portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01.backup/engine :portkey.aws.opsworkscm.-2016-11-01.backup/preferred-backup-window :portkey.aws.opsworkscm.-2016-11-01.backup/user-arn]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backup-retention-count-definition (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server-event/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server-event/server-name (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server-event/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server-event/log-url (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/server-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.server-event/created-at :portkey.aws.opsworkscm.-2016-11-01.server-event/server-name :portkey.aws.opsworkscm.-2016-11-01.server-event/message :portkey.aws.opsworkscm.-2016-11-01.server-event/log-url]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/delete-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/create-server-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/node-association-status-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/service-role-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/associate-public-ip-address (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/server-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/instance-profile-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/status (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/server-status))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/status-reason (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/cloud-formation-stack-arn (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/created-at (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/endpoint (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/key-pair (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/server-name (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.server/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.server/service-role-arn :portkey.aws.opsworkscm.-2016-11-01.server/associate-public-ip-address :portkey.aws.opsworkscm.-2016-11-01.server/subnet-ids :portkey.aws.opsworkscm.-2016-11-01.server/server-arn :portkey.aws.opsworkscm.-2016-11-01.server/security-group-ids :portkey.aws.opsworkscm.-2016-11-01.server/preferred-maintenance-window :portkey.aws.opsworkscm.-2016-11-01.server/instance-type :portkey.aws.opsworkscm.-2016-11-01.server/instance-profile-arn :portkey.aws.opsworkscm.-2016-11-01.server/status :portkey.aws.opsworkscm.-2016-11-01.server/backup-retention-count :portkey.aws.opsworkscm.-2016-11-01.server/engine-model :portkey.aws.opsworkscm.-2016-11-01.server/engine-version :portkey.aws.opsworkscm.-2016-11-01.server/status-reason :portkey.aws.opsworkscm.-2016-11-01.server/cloud-formation-stack-arn :portkey.aws.opsworkscm.-2016-11-01.server/disable-automated-backup :portkey.aws.opsworkscm.-2016-11-01.server/created-at :portkey.aws.opsworkscm.-2016-11-01/engine-attributes :portkey.aws.opsworkscm.-2016-11-01.server/endpoint :portkey.aws.opsworkscm.-2016-11-01.server/key-pair :portkey.aws.opsworkscm.-2016-11-01.server/server-name :portkey.aws.opsworkscm.-2016-11-01.server/engine :portkey.aws.opsworkscm.-2016-11-01.server/preferred-backup-window :portkey.aws.opsworkscm.-2016-11-01/maintenance-status]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/associate-node-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/node-association-status-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backups (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/backup))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/engine-attributes (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/engine-attribute))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/associate-public-ip-address (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/strings))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/backup-retention-count-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine-model (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine-version (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.create-server-request/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/create-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/instance-profile-arn :portkey.aws.opsworkscm.-2016-11-01.create-server-request/instance-type :portkey.aws.opsworkscm.-2016-11-01/service-role-arn] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.create-server-request/associate-public-ip-address :portkey.aws.opsworkscm.-2016-11-01.create-server-request/subnet-ids :portkey.aws.opsworkscm.-2016-11-01.create-server-request/security-group-ids :portkey.aws.opsworkscm.-2016-11-01.create-server-request/preferred-maintenance-window :portkey.aws.opsworkscm.-2016-11-01/backup-id :portkey.aws.opsworkscm.-2016-11-01.create-server-request/backup-retention-count :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine-model :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine-version :portkey.aws.opsworkscm.-2016-11-01.create-server-request/disable-automated-backup :portkey.aws.opsworkscm.-2016-11-01/engine-attributes :portkey.aws.opsworkscm.-2016-11-01/key-pair :portkey.aws.opsworkscm.-2016-11-01.create-server-request/engine :portkey.aws.opsworkscm.-2016-11-01.create-server-request/preferred-backup-window]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.restore-server-request/instance-type (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/restore-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/backup-id :portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.restore-server-request/instance-type :portkey.aws.opsworkscm.-2016-11-01/key-pair]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/backup-type #{"AUTOMATED" :automated :manual "MANUAL"})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/associate-node-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name :portkey.aws.opsworkscm.-2016-11-01/node-name :portkey.aws.opsworkscm.-2016-11-01/engine-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.describe-account-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/account-attributes))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.describe-account-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/server-events (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/server-event))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/key-pair (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/server-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 40)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z][a-zA-Z0-9\-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/account-attributes (clojure.spec.alpha/coll-of :portkey.aws.opsworkscm.-2016-11-01/account-attribute))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/engine-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.update-server-request/disable-automated-backup (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/boolean))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.update-server-request/backup-retention-count (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.update-server-request/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.update-server-request/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/time-window-definition))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/update-server-request (clojure.spec.alpha/keys :req-un [:portkey.aws.opsworkscm.-2016-11-01/server-name] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.update-server-request/disable-automated-backup :portkey.aws.opsworkscm.-2016-11-01.update-server-request/backup-retention-count :portkey.aws.opsworkscm.-2016-11-01.update-server-request/preferred-maintenance-window :portkey.aws.opsworkscm.-2016-11-01.update-server-request/preferred-backup-window]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.describe-backups-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-backups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/backups :portkey.aws.opsworkscm.-2016-11-01.describe-backups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.describe-events-response/next-token (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/server-events :portkey.aws.opsworkscm.-2016-11-01.describe-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.account-attribute/name (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/string))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.account-attribute/maximum (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01.account-attribute/used (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/integer))
(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/account-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01.account-attribute/name :portkey.aws.opsworkscm.-2016-11-01.account-attribute/maximum :portkey.aws.opsworkscm.-2016-11-01.account-attribute/used]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.opsworkscm.-2016-11-01/node-association-status :portkey.aws.opsworkscm.-2016-11-01/engine-attributes]))

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/maintenance-status #{"SUCCESS" :success "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.opsworkscm.-2016-11-01/boolean clojure.core/boolean?)

(clojure.core/defn describe-events ([describe-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-events-request describe-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/describe-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/describe-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEvents", :http.request.configuration/output-deser-fn response-describe-events-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm.-2016-11-01/invalid-next-token-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/describe-events-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/describe-events-response))

(clojure.core/defn update-server ([update-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-server-request update-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/update-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/update-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServer", :http.request.configuration/output-deser-fn response-update-server-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef update-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/update-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/update-server-response))

(clojure.core/defn associate-node ([associate-node-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-node-request associate-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/associate-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/associate-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateNode", :http.request.configuration/output-deser-fn response-associate-node-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef associate-node :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/associate-node-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/associate-node-response))

(clojure.core/defn start-maintenance ([start-maintenance-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-maintenance-request start-maintenance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartMaintenance", :http.request.configuration/output-deser-fn response-start-maintenance-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef start-maintenance :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/start-maintenance-response))

(clojure.core/defn describe-node-association-status ([describe-node-association-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-node-association-status-request describe-node-association-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNodeAssociationStatus", :http.request.configuration/output-deser-fn response-describe-node-association-status-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef describe-node-association-status :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/describe-node-association-status-response))

(clojure.core/defn export-server-engine-attribute ([export-server-engine-attribute-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-export-server-engine-attribute-request export-server-engine-attribute-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExportServerEngineAttribute", :http.request.configuration/output-deser-fn response-export-server-engine-attribute-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception}})))))
(clojure.spec.alpha/fdef export-server-engine-attribute :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/export-server-engine-attribute-response))

(clojure.core/defn update-server-engine-attributes ([update-server-engine-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-server-engine-attributes-request update-server-engine-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServerEngineAttributes", :http.request.configuration/output-deser-fn response-update-server-engine-attributes-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef update-server-engine-attributes :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/update-server-engine-attributes-response))

(clojure.core/defn disassociate-node ([disassociate-node-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-node-request disassociate-node-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateNode", :http.request.configuration/output-deser-fn response-disassociate-node-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef disassociate-node :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/disassociate-node-response))

(clojure.core/defn create-server ([create-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-server-request create-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/create-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/create-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateServer", :http.request.configuration/output-deser-fn response-create-server-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.opsworkscm.-2016-11-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.opsworkscm.-2016-11-01/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef create-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/create-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/create-server-response))

(clojure.core/defn describe-account-attributes ([] (describe-account-attributes {})) ([describe-account-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-account-attributes-request describe-account-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccountAttributes", :http.request.configuration/output-deser-fn response-describe-account-attributes-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-attributes :args (clojure.spec.alpha/? :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/describe-account-attributes-response))

(clojure.core/defn create-backup ([create-backup-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-backup-request create-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/create-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/create-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBackup", :http.request.configuration/output-deser-fn response-create-backup-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "LimitExceededException" :portkey.aws.opsworkscm.-2016-11-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef create-backup :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/create-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/create-backup-response))

(clojure.core/defn delete-server ([delete-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-server-request delete-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/delete-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/delete-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServer", :http.request.configuration/output-deser-fn response-delete-server-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/delete-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/delete-server-response))

(clojure.core/defn restore-server ([restore-server-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-restore-server-request restore-server-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/restore-server-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/restore-server-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreServer", :http.request.configuration/output-deser-fn response-restore-server-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef restore-server :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/restore-server-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/restore-server-response))

(clojure.core/defn delete-backup ([delete-backup-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-backup-request delete-backup-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/delete-backup-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/delete-backup-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBackup", :http.request.configuration/output-deser-fn response-delete-backup-response, :http.request.spec/error-spec {"InvalidStateException" :portkey.aws.opsworkscm.-2016-11-01/invalid-state-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception}})))))
(clojure.spec.alpha/fdef delete-backup :args (clojure.spec.alpha/tuple :portkey.aws.opsworkscm.-2016-11-01/delete-backup-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/delete-backup-response))

(clojure.core/defn describe-backups ([] (describe-backups {})) ([describe-backups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-backups-request describe-backups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/describe-backups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/describe-backups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBackups", :http.request.configuration/output-deser-fn response-describe-backups-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm.-2016-11-01/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-backups :args (clojure.spec.alpha/? :portkey.aws.opsworkscm.-2016-11-01/describe-backups-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/describe-backups-response))

(clojure.core/defn describe-servers ([] (describe-servers {})) ([describe-servers-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-servers-request describe-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.opsworkscm.-2016-11-01/endpoints, :http.request.configuration/target-prefix "OpsWorksCM_V2016_11_01", :http.request.spec/output-spec :portkey.aws.opsworkscm.-2016-11-01/describe-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-01", :http.request.configuration/service-id "OpsWorksCM", :http.request.spec/input-spec :portkey.aws.opsworkscm.-2016-11-01/describe-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServers", :http.request.configuration/output-deser-fn response-describe-servers-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.opsworkscm.-2016-11-01/validation-exception, "ResourceNotFoundException" :portkey.aws.opsworkscm.-2016-11-01/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.opsworkscm.-2016-11-01/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef describe-servers :args (clojure.spec.alpha/? :portkey.aws.opsworkscm.-2016-11-01/describe-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.opsworkscm.-2016-11-01/describe-servers-response))
