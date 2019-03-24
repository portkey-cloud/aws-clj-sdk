(ns portkey.aws.AWSMigrationHub.-2017-05-31 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "mgh", :region "us-west-2"},
    :ssl-common-name "mgh.us-west-2.amazonaws.com",
    :endpoint "https://mgh.us-west-2.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-created-artifact-name)

(clojure.core/declare ser-migration-task-name)

(clojure.core/declare ser-dry-run)

(clojure.core/declare ser-discovered-resource-description)

(clojure.core/declare ser-resource-attribute-list)

(clojure.core/declare ser-resource-attribute-type)

(clojure.core/declare ser-next-update-seconds)

(clojure.core/declare ser-created-artifact)

(clojure.core/declare ser-created-artifact-description)

(clojure.core/declare ser-discovered-resource)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-update-date-time)

(clojure.core/declare ser-status)

(clojure.core/declare ser-status-detail)

(clojure.core/declare ser-max-results-resources)

(clojure.core/declare ser-application-id)

(clojure.core/declare ser-application-status)

(clojure.core/declare ser-resource-attribute)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-progress-percent)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-resource-attribute-value)

(clojure.core/declare ser-token)

(clojure.core/declare ser-task)

(clojure.core/declare ser-max-results-created-artifacts)

(clojure.core/declare ser-progress-update-stream)

(clojure.core/defn- ser-created-artifact-name [input] #:http.request.field{:value input, :shape "CreatedArtifactName"})

(clojure.core/defn- ser-migration-task-name [input] #:http.request.field{:value input, :shape "MigrationTaskName"})

(clojure.core/defn- ser-dry-run [input] #:http.request.field{:value input, :shape "DryRun"})

(clojure.core/defn- ser-discovered-resource-description [input] #:http.request.field{:value input, :shape "DiscoveredResourceDescription"})

(clojure.core/defn- ser-resource-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-attribute coll) #:http.request.field{:shape "ResourceAttribute"}))) input), :shape "ResourceAttributeList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-resource-attribute-type [input] #:http.request.field{:value (clojure.core/get {"MAC_ADDRESS" "MAC_ADDRESS", :ipv-4-address "IPV4_ADDRESS", "IPV6_ADDRESS" "IPV6_ADDRESS", :bios-id "BIOS_ID", "BIOS_ID" "BIOS_ID", "VM_PATH" "VM_PATH", :vm-path "VM_PATH", "IPV4_ADDRESS" "IPV4_ADDRESS", "VM_MANAGED_OBJECT_REFERENCE" "VM_MANAGED_OBJECT_REFERENCE", :vm-managed-object-reference "VM_MANAGED_OBJECT_REFERENCE", :vm-manager-id "VM_MANAGER_ID", :fqdn "FQDN", :vm-name "VM_NAME", :mac-address "MAC_ADDRESS", "FQDN" "FQDN", "MOTHERBOARD_SERIAL_NUMBER" "MOTHERBOARD_SERIAL_NUMBER", "VM_NAME" "VM_NAME", "VM_MANAGER_ID" "VM_MANAGER_ID", :ipv-6-address "IPV6_ADDRESS", :motherboard-serial-number "MOTHERBOARD_SERIAL_NUMBER"} input), :shape "ResourceAttributeType"})

(clojure.core/defn- ser-next-update-seconds [input] #:http.request.field{:value input, :shape "NextUpdateSeconds"})

(clojure.core/defn- ser-created-artifact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-created-artifact-name (:name input)) #:http.request.field{:name "Name", :shape "CreatedArtifactName"})], :shape "CreatedArtifact", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-created-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "CreatedArtifactDescription"}))))

(clojure.core/defn- ser-created-artifact-description [input] #:http.request.field{:value input, :shape "CreatedArtifactDescription"})

(clojure.core/defn- ser-discovered-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-configuration-id (:configuration-id input)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})], :shape "DiscoveredResource", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-discovered-resource-description (input :description)) #:http.request.field{:name "Description", :shape "DiscoveredResourceDescription"}))))

(clojure.core/defn- ser-configuration-id [input] #:http.request.field{:value input, :shape "ConfigurationId"})

(clojure.core/defn- ser-update-date-time [input] #:http.request.field{:value input, :shape "UpdateDateTime"})

(clojure.core/defn- ser-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "FAILED" "FAILED", :failed "FAILED", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "Status"})

(clojure.core/defn- ser-status-detail [input] #:http.request.field{:value input, :shape "StatusDetail"})

(clojure.core/defn- ser-max-results-resources [input] #:http.request.field{:value input, :shape "MaxResultsResources"})

(clojure.core/defn- ser-application-id [input] #:http.request.field{:value input, :shape "ApplicationId"})

(clojure.core/defn- ser-application-status [input] #:http.request.field{:value (clojure.core/get {"NOT_STARTED" "NOT_STARTED", :not-started "NOT_STARTED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETED" "COMPLETED", :completed "COMPLETED"} input), :shape "ApplicationStatus"})

(clojure.core/defn- ser-resource-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-attribute-type (:type input)) #:http.request.field{:name "Type", :shape "ResourceAttributeType"}) (clojure.core/into (ser-resource-attribute-value (:value input)) #:http.request.field{:name "Value", :shape "ResourceAttributeValue"})], :shape "ResourceAttribute", :type "structure"}))

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-progress-percent [input] #:http.request.field{:value input, :shape "ProgressPercent"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-resource-attribute-value [input] #:http.request.field{:value input, :shape "ResourceAttributeValue"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-task [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-status (:status input)) #:http.request.field{:name "Status", :shape "Status"})], :shape "Task", :type "structure"} (clojure.core/contains? input :status-detail) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status-detail (input :status-detail)) #:http.request.field{:name "StatusDetail", :shape "StatusDetail"})) (clojure.core/contains? input :progress-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-progress-percent (input :progress-percent)) #:http.request.field{:name "ProgressPercent", :shape "ProgressPercent"}))))

(clojure.core/defn- ser-max-results-created-artifacts [input] #:http.request.field{:value input, :shape "MaxResultsCreatedArtifacts"})

(clojure.core/defn- ser-progress-update-stream [input] #:http.request.field{:value input, :shape "ProgressUpdateStream"})

(clojure.core/defn- req-associate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-discovered-resource (input :discovered-resource)) #:http.request.field{:name "DiscoveredResource", :shape "DiscoveredResource"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]}))

(clojure.core/defn- req-list-created-artifacts-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-created-artifacts (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsCreatedArtifacts"}))))

(clojure.core/defn- req-import-migration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-discovered-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-resources (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsResources"}))))

(clojure.core/defn- req-disassociate-discovered-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-configuration-id (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "ConfigurationId"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-migration-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :resource-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "ResourceName", :shape "ResourceName"}))))

(clojure.core/defn- req-create-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-list-progress-update-streams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-disassociate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact-name (input :created-artifact-name)) #:http.request.field{:name "CreatedArtifactName", :shape "CreatedArtifactName"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-delete-progress-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream-name)) #:http.request.field{:name "ProgressUpdateStreamName", :shape "ProgressUpdateStream"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-describe-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"})]}))

(clojure.core/defn- req-put-resource-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-resource-attribute-list (input :resource-attribute-list)) #:http.request.field{:name "ResourceAttributeList", :shape "ResourceAttributeList"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-migration-task-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-task (input :task)) #:http.request.field{:name "Task", :shape "Task"}) (clojure.core/into (ser-update-date-time (input :update-date-time)) #:http.request.field{:name "UpdateDateTime", :shape "UpdateDateTime"}) (clojure.core/into (ser-next-update-seconds (input :next-update-seconds)) #:http.request.field{:name "NextUpdateSeconds", :shape "NextUpdateSeconds"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-associate-created-artifact-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-progress-update-stream (input :progress-update-stream)) #:http.request.field{:name "ProgressUpdateStream", :shape "ProgressUpdateStream"}) (clojure.core/into (ser-migration-task-name (input :migration-task-name)) #:http.request.field{:name "MigrationTaskName", :shape "MigrationTaskName"}) (clojure.core/into (ser-created-artifact (input :created-artifact)) #:http.request.field{:name "CreatedArtifact", :shape "CreatedArtifact"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/defn- req-notify-application-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "ApplicationId"}) (clojure.core/into (ser-application-status (input :status)) #:http.request.field{:name "Status", :shape "ApplicationStatus"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"}))))

(clojure.core/declare deser-created-artifact-name)

(clojure.core/declare deser-migration-task-name)

(clojure.core/declare deser-discovered-resource-description)

(clojure.core/declare deser-resource-attribute-type)

(clojure.core/declare deser-latest-resource-attribute-list)

(clojure.core/declare deser-progress-update-stream-summary)

(clojure.core/declare deser-migration-task)

(clojure.core/declare deser-migration-task-summary)

(clojure.core/declare deser-created-artifact)

(clojure.core/declare deser-created-artifact-description)

(clojure.core/declare deser-discovered-resource)

(clojure.core/declare deser-configuration-id)

(clojure.core/declare deser-update-date-time)

(clojure.core/declare deser-discovered-resource-list)

(clojure.core/declare deser-status)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-migration-task-summary-list)

(clojure.core/declare deser-status-detail)

(clojure.core/declare deser-application-status)

(clojure.core/declare deser-resource-attribute)

(clojure.core/declare deser-created-artifact-list)

(clojure.core/declare deser-progress-update-stream-summary-list)

(clojure.core/declare deser-progress-percent)

(clojure.core/declare deser-resource-attribute-value)

(clojure.core/declare deser-token)

(clojure.core/declare deser-task)

(clojure.core/declare deser-progress-update-stream)

(clojure.core/defn- deser-created-artifact-name [input] input)

(clojure.core/defn- deser-migration-task-name [input] input)

(clojure.core/defn- deser-discovered-resource-description [input] input)

(clojure.core/defn- deser-resource-attribute-type [input] (clojure.core/get {"MAC_ADDRESS" :mac-address, "IPV6_ADDRESS" :ipv-6-address, "BIOS_ID" :bios-id, "VM_PATH" :vm-path, "IPV4_ADDRESS" :ipv-4-address, "VM_MANAGED_OBJECT_REFERENCE" :vm-managed-object-reference, "FQDN" :fqdn, "MOTHERBOARD_SERIAL_NUMBER" :motherboard-serial-number, "VM_NAME" :vm-name, "VM_MANAGER_ID" :vm-manager-id} input))

(clojure.core/defn- deser-latest-resource-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-attribute coll))) input))

(clojure.core/defn- deser-progress-update-stream-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStreamName") (clojure.core/assoc :progress-update-stream-name (deser-progress-update-stream (input "ProgressUpdateStreamName")))))

(clojure.core/defn- deser-migration-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStream") (clojure.core/assoc :progress-update-stream (deser-progress-update-stream (input "ProgressUpdateStream"))) (clojure.core/contains? input "MigrationTaskName") (clojure.core/assoc :migration-task-name (deser-migration-task-name (input "MigrationTaskName"))) (clojure.core/contains? input "Task") (clojure.core/assoc :task (deser-task (input "Task"))) (clojure.core/contains? input "UpdateDateTime") (clojure.core/assoc :update-date-time (deser-update-date-time (input "UpdateDateTime"))) (clojure.core/contains? input "ResourceAttributeList") (clojure.core/assoc :resource-attribute-list (deser-latest-resource-attribute-list (input "ResourceAttributeList")))))

(clojure.core/defn- deser-migration-task-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProgressUpdateStream") (clojure.core/assoc :progress-update-stream (deser-progress-update-stream (input "ProgressUpdateStream"))) (clojure.core/contains? input "MigrationTaskName") (clojure.core/assoc :migration-task-name (deser-migration-task-name (input "MigrationTaskName"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-status (input "Status"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-progress-percent (input "ProgressPercent"))) (clojure.core/contains? input "StatusDetail") (clojure.core/assoc :status-detail (deser-status-detail (input "StatusDetail"))) (clojure.core/contains? input "UpdateDateTime") (clojure.core/assoc :update-date-time (deser-update-date-time (input "UpdateDateTime")))))

(clojure.core/defn- deser-created-artifact [input] (clojure.core/cond-> {:name (deser-created-artifact-name (input "Name"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-created-artifact-description (input "Description")))))

(clojure.core/defn- deser-created-artifact-description [input] input)

(clojure.core/defn- deser-discovered-resource [input] (clojure.core/cond-> {:configuration-id (deser-configuration-id (input "ConfigurationId"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-discovered-resource-description (input "Description")))))

(clojure.core/defn- deser-configuration-id [input] input)

(clojure.core/defn- deser-update-date-time [input] input)

(clojure.core/defn- deser-discovered-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-discovered-resource coll))) input))

(clojure.core/defn- deser-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "FAILED" :failed, "COMPLETED" :completed} input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-migration-task-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-migration-task-summary coll))) input))

(clojure.core/defn- deser-status-detail [input] input)

(clojure.core/defn- deser-application-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "COMPLETED" :completed} input))

(clojure.core/defn- deser-resource-attribute [input] (clojure.core/cond-> {:type (deser-resource-attribute-type (input "Type")), :value (deser-resource-attribute-value (input "Value"))}))

(clojure.core/defn- deser-created-artifact-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-created-artifact coll))) input))

(clojure.core/defn- deser-progress-update-stream-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-progress-update-stream-summary coll))) input))

(clojure.core/defn- deser-progress-percent [input] input)

(clojure.core/defn- deser-resource-attribute-value [input] input)

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-task [input] (clojure.core/cond-> {:status (deser-status (input "Status"))} (clojure.core/contains? input "StatusDetail") (clojure.core/assoc :status-detail (deser-status-detail (input "StatusDetail"))) (clojure.core/contains? input "ProgressPercent") (clojure.core/assoc :progress-percent (deser-progress-percent (input "ProgressPercent")))))

(clojure.core/defn- deser-progress-update-stream [input] input)

(clojure.core/defn- response-dry-run-operation ([input] (response-dry-run-operation nil input)) ([resultWrapper1477509 input] (clojure.core/let [rawinput1477508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477510 {"Message" (rawinput1477508 "Message")}] (clojure.core/cond-> {} (letvar1477510 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477510 ["Message"])))))))

(clojure.core/defn- response-describe-migration-task-result ([input] (response-describe-migration-task-result nil input)) ([resultWrapper1477512 input] (clojure.core/let [rawinput1477511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477513 {"MigrationTask" (rawinput1477511 "MigrationTask")}] (clojure.core/cond-> {} (letvar1477513 "MigrationTask") (clojure.core/assoc :migration-task (deser-migration-task (clojure.core/get-in letvar1477513 ["MigrationTask"])))))))

(clojure.core/defn- response-list-migration-tasks-result ([input] (response-list-migration-tasks-result nil input)) ([resultWrapper1477515 input] (clojure.core/let [rawinput1477514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477516 {"NextToken" (rawinput1477514 "NextToken"), "MigrationTaskSummaryList" (rawinput1477514 "MigrationTaskSummaryList")}] (clojure.core/cond-> {} (letvar1477516 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1477516 ["NextToken"]))) (letvar1477516 "MigrationTaskSummaryList") (clojure.core/assoc :migration-task-summary-list (deser-migration-task-summary-list (clojure.core/get-in letvar1477516 ["MigrationTaskSummaryList"])))))))

(clojure.core/defn- response-list-discovered-resources-result ([input] (response-list-discovered-resources-result nil input)) ([resultWrapper1477518 input] (clojure.core/let [rawinput1477517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477519 {"NextToken" (rawinput1477517 "NextToken"), "DiscoveredResourceList" (rawinput1477517 "DiscoveredResourceList")}] (clojure.core/cond-> {} (letvar1477519 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1477519 ["NextToken"]))) (letvar1477519 "DiscoveredResourceList") (clojure.core/assoc :discovered-resource-list (deser-discovered-resource-list (clojure.core/get-in letvar1477519 ["DiscoveredResourceList"])))))))

(clojure.core/defn- response-notify-migration-task-state-result ([input] (response-notify-migration-task-state-result nil input)) ([resultWrapper1477521 input] (clojure.core/let [rawinput1477520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477522 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1477524 input] (clojure.core/let [rawinput1477523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477525 {"Message" (rawinput1477523 "Message")}] (clojure.core/cond-> {} (letvar1477525 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477525 ["Message"])))))))

(clojure.core/defn- response-unauthorized-operation ([input] (response-unauthorized-operation nil input)) ([resultWrapper1477527 input] (clojure.core/let [rawinput1477526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477528 {"Message" (rawinput1477526 "Message")}] (clojure.core/cond-> {} (letvar1477528 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477528 ["Message"])))))))

(clojure.core/defn- response-put-resource-attributes-result ([input] (response-put-resource-attributes-result nil input)) ([resultWrapper1477530 input] (clojure.core/let [rawinput1477529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477531 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-created-artifact-result ([input] (response-disassociate-created-artifact-result nil input)) ([resultWrapper1477533 input] (clojure.core/let [rawinput1477532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477534 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-progress-update-stream-result ([input] (response-delete-progress-update-stream-result nil input)) ([resultWrapper1477536 input] (clojure.core/let [rawinput1477535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477537 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-policy-error-exception ([input] (response-policy-error-exception nil input)) ([resultWrapper1477539 input] (clojure.core/let [rawinput1477538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477540 {"Message" (rawinput1477538 "Message")}] (clojure.core/cond-> {} (letvar1477540 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477540 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1477542 input] (clojure.core/let [rawinput1477541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477543 {"Message" (rawinput1477541 "Message")}] (clojure.core/cond-> {} (letvar1477543 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477543 ["Message"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1477545 input] (clojure.core/let [rawinput1477544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477546 {"Message" (rawinput1477544 "Message")}] (clojure.core/cond-> {} (letvar1477546 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477546 ["Message"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1477548 input] (clojure.core/let [rawinput1477547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477549 {"Message" (rawinput1477547 "Message")}] (clojure.core/cond-> {} (letvar1477549 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477549 ["Message"])))))))

(clojure.core/defn- response-notify-application-state-result ([input] (response-notify-application-state-result nil input)) ([resultWrapper1477551 input] (clojure.core/let [rawinput1477550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477552 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-created-artifact-result ([input] (response-associate-created-artifact-result nil input)) ([resultWrapper1477554 input] (clojure.core/let [rawinput1477553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477555 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-discovered-resource-result ([input] (response-disassociate-discovered-resource-result nil input)) ([resultWrapper1477557 input] (clojure.core/let [rawinput1477556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477558 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-progress-update-streams-result ([input] (response-list-progress-update-streams-result nil input)) ([resultWrapper1477560 input] (clojure.core/let [rawinput1477559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477561 {"ProgressUpdateStreamSummaryList" (rawinput1477559 "ProgressUpdateStreamSummaryList"), "NextToken" (rawinput1477559 "NextToken")}] (clojure.core/cond-> {} (letvar1477561 "ProgressUpdateStreamSummaryList") (clojure.core/assoc :progress-update-stream-summary-list (deser-progress-update-stream-summary-list (clojure.core/get-in letvar1477561 ["ProgressUpdateStreamSummaryList"]))) (letvar1477561 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1477561 ["NextToken"])))))))

(clojure.core/defn- response-describe-application-state-result ([input] (response-describe-application-state-result nil input)) ([resultWrapper1477563 input] (clojure.core/let [rawinput1477562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477564 {"ApplicationStatus" (rawinput1477562 "ApplicationStatus"), "LastUpdatedTime" (rawinput1477562 "LastUpdatedTime")}] (clojure.core/cond-> {} (letvar1477564 "ApplicationStatus") (clojure.core/assoc :application-status (deser-application-status (clojure.core/get-in letvar1477564 ["ApplicationStatus"]))) (letvar1477564 "LastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-update-date-time (clojure.core/get-in letvar1477564 ["LastUpdatedTime"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1477566 input] (clojure.core/let [rawinput1477565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477567 {"Message" (rawinput1477565 "Message")}] (clojure.core/cond-> {} (letvar1477567 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1477567 ["Message"])))))))

(clojure.core/defn- response-import-migration-task-result ([input] (response-import-migration-task-result nil input)) ([resultWrapper1477569 input] (clojure.core/let [rawinput1477568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477570 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-discovered-resource-result ([input] (response-associate-discovered-resource-result nil input)) ([resultWrapper1477572 input] (clojure.core/let [rawinput1477571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477573 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-created-artifacts-result ([input] (response-list-created-artifacts-result nil input)) ([resultWrapper1477575 input] (clojure.core/let [rawinput1477574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477576 {"NextToken" (rawinput1477574 "NextToken"), "CreatedArtifactList" (rawinput1477574 "CreatedArtifactList")}] (clojure.core/cond-> {} (letvar1477576 "NextToken") (clojure.core/assoc :next-token (deser-token (clojure.core/get-in letvar1477576 ["NextToken"]))) (letvar1477576 "CreatedArtifactList") (clojure.core/assoc :created-artifact-list (deser-created-artifact-list (clojure.core/get-in letvar1477576 ["CreatedArtifactList"])))))))

(clojure.core/defn- response-create-progress-update-stream-result ([input] (response-create-progress-update-stream-result nil input)) ([resultWrapper1477578 input] (clojure.core/let [rawinput1477577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477579 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1600)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:[a-z-]+:[a-z0-9-]+:(?:[a-z0-9-]+|):(?:[0-9]{12}|):.*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:|]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.dry-run-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.dry-run-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-type #{"MAC_ADDRESS" :ipv-4-address "IPV6_ADDRESS" :bios-id "BIOS_ID" "VM_PATH" :vm-path "IPV4_ADDRESS" "VM_MANAGED_OBJECT_REFERENCE" :vm-managed-object-reference :vm-manager-id :fqdn :vm-name :mac-address "FQDN" "MOTHERBOARD_SERIAL_NUMBER" "VM_NAME" "VM_MANAGER_ID" :ipv-6-address :motherboard-serial-number})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/migration-task]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/latest-resource-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/next-update-seconds (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.progress-update-stream-summary/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.progress-update-stream-summary/progress-update-stream-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.migration-task/resource-attribute-list (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/latest-resource-attribute-list))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/task :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time :portkey.aws.AWSMigrationHub.-2017-05-31.migration-task/resource-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-created-artifacts))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/status :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent :portkey.aws.AWSMigrationHub.-2017-05-31/status-detail :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.created-artifact/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.discovered-resource/description (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-description))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.discovered-resource/description]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-resources))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31.list-discovered-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/discovered-resource))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.unauthorized-operation/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.unauthorized-operation/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" "FAILED" :not-started :failed})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/configuration-id] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-migration-tasks-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/max-results :portkey.aws.AWSMigrationHub.-2017-05-31/resource-name]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/status-detail (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-resources (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.create-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.create-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.policy-error-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.policy-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/application-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/application-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "NOT_STARTED" :not-started})

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-request/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/max-results]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/type (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-type))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/value (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-value))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/type :portkey.aws.AWSMigrationHub.-2017-05-31.resource-attribute/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary-list (clojure.spec.alpha/coll-of :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.delete-progress-update-stream-request/progress-update-stream-name (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31.delete-progress-update-stream-request/progress-update-stream-name] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-list] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream-summary-list :portkey.aws.AWSMigrationHub.-2017-05-31.list-progress-update-streams-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/task :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time :portkey.aws.AWSMigrationHub.-2017-05-31/next-update-seconds] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/resource-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.describe-application-state-result/last-updated-time (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/update-date-time))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-status :portkey.aws.AWSMigrationHub.-2017-05-31.describe-application-state-result/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/error-message))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/task (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/status] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/status-detail :portkey.aws.AWSMigrationHub.-2017-05-31/progress-percent]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream :portkey.aws.AWSMigrationHub.-2017-05-31/migration-task-name :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/max-results-created-artifacts (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-result/next-token (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/token))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31.list-created-artifacts-result/next-token :portkey.aws.AWSMigrationHub.-2017-05-31/created-artifact-list]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/progress-update-stream (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^/:|\000-\037]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31.notify-application-state-request/status (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/application-status))
(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.AWSMigrationHub.-2017-05-31/application-id :portkey.aws.AWSMigrationHub.-2017-05-31.notify-application-state-request/status] :opt-un [:portkey.aws.AWSMigrationHub.-2017-05-31/dry-run]))

(clojure.spec.alpha/def :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn associate-created-artifact ([associate-created-artifact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-created-artifact-request associate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateCreatedArtifact", :http.request.configuration/output-deser-fn response-associate-created-artifact-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/associate-created-artifact-result))

(clojure.core/defn import-migration-task ([import-migration-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-import-migration-task-request import-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ImportMigrationTask", :http.request.configuration/output-deser-fn response-import-migration-task-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef import-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/import-migration-task-result))

(clojure.core/defn disassociate-discovered-resource ([disassociate-discovered-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-discovered-resource-request disassociate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDiscoveredResource", :http.request.configuration/output-deser-fn response-disassociate-discovered-resource-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-discovered-resource-result))

(clojure.core/defn disassociate-created-artifact ([disassociate-created-artifact-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-created-artifact-request disassociate-created-artifact-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateCreatedArtifact", :http.request.configuration/output-deser-fn response-disassociate-created-artifact-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-created-artifact :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/disassociate-created-artifact-result))

(clojure.core/defn list-created-artifacts ([list-created-artifacts-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-created-artifacts-request list-created-artifacts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCreatedArtifacts", :http.request.configuration/output-deser-fn response-list-created-artifacts-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-created-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-created-artifacts-result))

(clojure.core/defn describe-migration-task ([describe-migration-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-migration-task-request describe-migration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMigrationTask", :http.request.configuration/output-deser-fn response-describe-migration-task-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-migration-task :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/describe-migration-task-result))

(clojure.core/defn delete-progress-update-stream ([delete-progress-update-stream-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-progress-update-stream-request delete-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProgressUpdateStream", :http.request.configuration/output-deser-fn response-delete-progress-update-stream-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/delete-progress-update-stream-result))

(clojure.core/defn list-progress-update-streams ([] (list-progress-update-streams {})) ([list-progress-update-streams-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-progress-update-streams-request list-progress-update-streams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProgressUpdateStreams", :http.request.configuration/output-deser-fn response-list-progress-update-streams-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-progress-update-streams :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-progress-update-streams-result))

(clojure.core/defn put-resource-attributes ([put-resource-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-resource-attributes-request put-resource-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourceAttributes", :http.request.configuration/output-deser-fn response-put-resource-attributes-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef put-resource-attributes :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/put-resource-attributes-result))

(clojure.core/defn notify-migration-task-state ([notify-migration-task-state-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-notify-migration-task-state-request notify-migration-task-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyMigrationTaskState", :http.request.configuration/output-deser-fn response-notify-migration-task-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-migration-task-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/notify-migration-task-state-result))

(clojure.core/defn list-migration-tasks ([] (list-migration-tasks {})) ([list-migration-tasks-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-migration-tasks-request list-migration-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMigrationTasks", :http.request.configuration/output-deser-fn response-list-migration-tasks-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-migration-tasks :args (clojure.spec.alpha/? :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-migration-tasks-result))

(clojure.core/defn list-discovered-resources ([list-discovered-resources-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-discovered-resources-request list-discovered-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDiscoveredResources", :http.request.configuration/output-deser-fn response-list-discovered-resources-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-discovered-resources :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/list-discovered-resources-result))

(clojure.core/defn notify-application-state ([notify-application-state-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-notify-application-state-request notify-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyApplicationState", :http.request.configuration/output-deser-fn response-notify-application-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef notify-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/notify-application-state-result))

(clojure.core/defn create-progress-update-stream ([create-progress-update-stream-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-progress-update-stream-request create-progress-update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProgressUpdateStream", :http.request.configuration/output-deser-fn response-create-progress-update-stream-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception}})))))
(clojure.spec.alpha/fdef create-progress-update-stream :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/create-progress-update-stream-result))

(clojure.core/defn associate-discovered-resource ([associate-discovered-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-discovered-resource-request associate-discovered-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDiscoveredResource", :http.request.configuration/output-deser-fn response-associate-discovered-resource-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "DryRunOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/dry-run-operation, "UnauthorizedOperation" :portkey.aws.AWSMigrationHub.-2017-05-31/unauthorized-operation, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-discovered-resource :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/associate-discovered-resource-result))

(clojure.core/defn describe-application-state ([describe-application-state-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-application-state-request describe-application-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.AWSMigrationHub.-2017-05-31/endpoints, :http.request.configuration/target-prefix "AWSMigrationHub", :http.request.spec/output-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-05-31", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeApplicationState", :http.request.configuration/output-deser-fn response-describe-application-state-result, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.AWSMigrationHub.-2017-05-31/access-denied-exception, "InternalServerError" :portkey.aws.AWSMigrationHub.-2017-05-31/internal-server-error, "ServiceUnavailableException" :portkey.aws.AWSMigrationHub.-2017-05-31/service-unavailable-exception, "InvalidInputException" :portkey.aws.AWSMigrationHub.-2017-05-31/invalid-input-exception, "PolicyErrorException" :portkey.aws.AWSMigrationHub.-2017-05-31/policy-error-exception, "ResourceNotFoundException" :portkey.aws.AWSMigrationHub.-2017-05-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-application-state :args (clojure.spec.alpha/tuple :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-request) :ret (clojure.spec.alpha/and :portkey.aws.AWSMigrationHub.-2017-05-31/describe-application-state-result))
