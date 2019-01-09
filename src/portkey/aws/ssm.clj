(ns portkey.aws.ssm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ssm", :region "ap-northeast-1"},
    :ssl-common-name "ssm.ap-northeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ssm", :region "eu-west-1"},
    :ssl-common-name "ssm.eu-west-1.amazonaws.com",
    :endpoint "https://ssm.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ssm", :region "us-east-2"},
    :ssl-common-name "ssm.us-east-2.amazonaws.com",
    :endpoint "https://ssm.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ssm", :region "ap-southeast-2"},
    :ssl-common-name "ssm.ap-southeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ssm", :region "cn-north-1"},
    :ssl-common-name "ssm.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ssm.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ssm", :region "sa-east-1"},
    :ssl-common-name "ssm.sa-east-1.amazonaws.com",
    :endpoint "https://ssm.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ssm", :region "ap-southeast-1"},
    :ssl-common-name "ssm.ap-southeast-1.amazonaws.com",
    :endpoint "https://ssm.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ssm", :region "cn-northwest-1"},
    :ssl-common-name "ssm.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ssm.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ssm", :region "ap-northeast-2"},
    :ssl-common-name "ssm.ap-northeast-2.amazonaws.com",
    :endpoint "https://ssm.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ssm", :region "eu-west-3"},
    :ssl-common-name "ssm.eu-west-3.amazonaws.com",
    :endpoint "https://ssm.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ssm", :region "ca-central-1"},
    :ssl-common-name "ssm.ca-central-1.amazonaws.com",
    :endpoint "https://ssm.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ssm", :region "eu-central-1"},
    :ssl-common-name "ssm.eu-central-1.amazonaws.com",
    :endpoint "https://ssm.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ssm", :region "eu-west-2"},
    :ssl-common-name "ssm.eu-west-2.amazonaws.com",
    :endpoint "https://ssm.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ssm", :region "us-gov-west-1"},
    :ssl-common-name "ssm.us-gov-west-1.amazonaws.com",
    :endpoint "https://ssm.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ssm", :region "us-west-2"},
    :ssl-common-name "ssm.us-west-2.amazonaws.com",
    :endpoint "https://ssm.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ssm", :region "us-east-1"},
    :ssl-common-name "ssm.us-east-1.amazonaws.com",
    :endpoint "https://ssm.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ssm", :region "us-west-1"},
    :ssl-common-name "ssm.us-west-1.amazonaws.com",
    :endpoint "https://ssm.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ssm", :region "ap-south-1"},
    :ssl-common-name "ssm.ap-south-1.amazonaws.com",
    :endpoint "https://ssm.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-parameter-string-filter-value)

(clojure.core/declare ser-target-map)

(clojure.core/declare ser-instance-information-filter-value-set)

(clojure.core/declare ser-instance-id-list)

(clojure.core/declare ser-automation-parameter-key)

(clojure.core/declare ser-automation-execution-filter-value)

(clojure.core/declare ser-dry-run)

(clojure.core/declare ser-approve-after-days)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-maintenance-window-run-command-parameters)

(clojure.core/declare ser-automation-execution-filter-key)

(clojure.core/declare ser-parameter-value-list)

(clojure.core/declare ser-command-filter-value)

(clojure.core/declare ser-document-content)

(clojure.core/declare ser-inventory-filter-value-list)

(clojure.core/declare ser-association-version)

(clojure.core/declare ser-target-maps)

(clojure.core/declare ser-service-role)

(clojure.core/declare ser-maintenance-window-enabled)

(clojure.core/declare ser-maintenance-window-name)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-instance-information-filter-list)

(clojure.core/declare ser-compliance-item-entry-list)

(clojure.core/declare ser-maintenance-window-search-max-results)

(clojure.core/declare ser-step-execution-filter)

(clojure.core/declare ser-patch-group)

(clojure.core/declare ser-compliance-item-entry)

(clojure.core/declare ser-patch-filter)

(clojure.core/declare ser-notification-event)

(clojure.core/declare ser-instance-information-filter)

(clojure.core/declare ser-inventory-aggregator)

(clojure.core/declare ser-parameter-name)

(clojure.core/declare ser-patch-orchestrator-filter)

(clojure.core/declare ser-parameter-type)

(clojure.core/declare ser-inventory-query-operator-type)

(clojure.core/declare ser-parameter-string-filter)

(clojure.core/declare ser-s-3-region)

(clojure.core/declare ser-instance-patch-state-filter-value)

(clojure.core/declare ser-document-filter-key)

(clojure.core/declare ser-comment)

(clojure.core/declare ser-compliance-resource-type)

(clojure.core/declare ser-association-id-list)

(clojure.core/declare ser-document-key-values-filter-list)

(clojure.core/declare ser-patch-source)

(clojure.core/declare ser-compliance-string-filter-list)

(clojure.core/declare ser-instance-information-filter-value)

(clojure.core/declare ser-instance-information-string-filter-list)

(clojure.core/declare ser-command-max-results)

(clojure.core/declare ser-parameter-label-list)

(clojure.core/declare ser-association-execution-filter)

(clojure.core/declare ser-inventory-filter)

(clojure.core/declare ser-inventory-item-type-name-filter)

(clojure.core/declare ser-maintenance-window-filter-values)

(clojure.core/declare ser-get-parameters-by-path-max-results)

(clojure.core/declare ser-session-id)

(clojure.core/declare ser-ps-parameter-version)

(clojure.core/declare ser-account-id-list)

(clojure.core/declare ser-session-max-results)

(clojure.core/declare ser-maintenance-window-execution-task-id)

(clojure.core/declare ser-patch-orchestrator-filter-list)

(clojure.core/declare ser-maintenance-window-cutoff)

(clojure.core/declare ser-timeout-seconds)

(clojure.core/declare ser-resource-data-sync-s-3-region)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-parameters-filter)

(clojure.core/declare ser-status-additional-info)

(clojure.core/declare ser-parameter-string-filter-list)

(clojure.core/declare ser-resource-data-sync-awskms-key-arn)

(clojure.core/declare ser-association-execution-filter-value)

(clojure.core/declare ser-status-message)

(clojure.core/declare ser-patch-orchestrator-filter-value)

(clojure.core/declare ser-patch-rule)

(clojure.core/declare ser-execution-mode)

(clojure.core/declare ser-inventory-item-content-hash)

(clojure.core/declare ser-patch-orchestrator-filter-key)

(clojure.core/declare ser-key-list)

(clojure.core/declare ser-inventory-item-entry)

(clojure.core/declare ser-cloud-watch-log-group-name)

(clojure.core/declare ser-parameters)

(clojure.core/declare ser-inventory-filter-value)

(clojure.core/declare ser-association-execution-id)

(clojure.core/declare ser-resource-data-sync-s-3-format)

(clojure.core/declare ser-document-type)

(clojure.core/declare ser-parameters-filter-value)

(clojure.core/declare ser-association-id)

(clojure.core/declare ser-get-inventory-schema-max-results)

(clojure.core/declare ser-automation-execution-filter-list)

(clojure.core/declare ser-session-filter-list)

(clojure.core/declare ser-parameters-filter-key)

(clojure.core/declare ser-inventory-group)

(clojure.core/declare ser-compliance-item-title)

(clojure.core/declare ser-document-key-values-filter-values)

(clojure.core/declare ser-document-key-values-filter)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-parameter-name-list)

(clojure.core/declare ser-target-type)

(clojure.core/declare ser-resource-data-sync-s-3-prefix)

(clojure.core/declare ser-notification-config)

(clojure.core/declare ser-s-3-bucket-name)

(clojure.core/declare ser-document-hash)

(clojure.core/declare ser-inventory-filter-list)

(clojure.core/declare ser-association-execution-targets-filter-list)

(clojure.core/declare ser-parameters-filter-value-list)

(clojure.core/declare ser-iam-role)

(clojure.core/declare ser-compliance-severity)

(clojure.core/declare ser-session-state)

(clojure.core/declare ser-notification-type)

(clojure.core/declare ser-maintenance-window-lambda-payload)

(clojure.core/declare ser-result-attribute)

(clojure.core/declare ser-maintenance-window-task-arn)

(clojure.core/declare ser-maintenance-window-lambda-qualifier)

(clojure.core/declare ser-target-map-key)

(clojure.core/declare ser-association-status)

(clojure.core/declare ser-association-filter-key)

(clojure.core/declare ser-inventory-schema-delete-option)

(clojure.core/declare ser-maintenance-window-task-parameters)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-session-manager-parameter-value-list)

(clojure.core/declare ser-resource-data-sync-s-3-destination)

(clojure.core/declare ser-aggregator-schema-only)

(clojure.core/declare ser-cloud-watch-output-config)

(clojure.core/declare ser-parameter-string-query-option)

(clojure.core/declare ser-patch-baseline-max-results)

(clojure.core/declare ser-default-instance-name)

(clojure.core/declare ser-instance-information-filter-key)

(clojure.core/declare ser-maintenance-window-task-parameter-name)

(clojure.core/declare ser-session-target)

(clojure.core/declare ser-expiration-date)

(clojure.core/declare ser-maintenance-window-task-priority)

(clojure.core/declare ser-document-arn)

(clojure.core/declare ser-patch-id)

(clojure.core/declare ser-max-concurrency)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-maintenance-window-task-id)

(clojure.core/declare ser-maintenance-window-filter)

(clojure.core/declare ser-patch-action)

(clojure.core/declare ser-stop-type)

(clojure.core/declare ser-step-execution-filter-value)

(clojure.core/declare ser-patch-compliance-max-results)

(clojure.core/declare ser-instance-patch-state-filter-values)

(clojure.core/declare ser-signal-type)

(clojure.core/declare ser-compliance-item-id)

(clojure.core/declare ser-association-filter-value)

(clojure.core/declare ser-cloud-watch-output-enabled)

(clojure.core/declare ser-document-filter-value)

(clojure.core/declare ser-parameter-label)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-compliance-string-filter)

(clojure.core/declare ser-compliance-type-name)

(clojure.core/declare ser-patch-id-list)

(clojure.core/declare ser-document-key-values-filter-value)

(clojure.core/declare ser-logging-info)

(clojure.core/declare ser-ps-parameter-value)

(clojure.core/declare ser-patch-filter-group)

(clojure.core/declare ser-instance-patch-state-filter)

(clojure.core/declare ser-command-plugin-name)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-maintenance-window-execution-task-invocation-id)

(clojure.core/declare ser-parameter-key-id)

(clojure.core/declare ser-automation-parameter-map)

(clojure.core/declare ser-step-execution-filter-value-list)

(clojure.core/declare ser-document-filter-list)

(clojure.core/declare ser-patch-rule-group)

(clojure.core/declare ser-inventory-item-list)

(clojure.core/declare ser-maintenance-window-filter-list)

(clojure.core/declare ser-association-filter-list)

(clojure.core/declare ser-max-errors)

(clojure.core/declare ser-parameter-string-filter-key)

(clojure.core/declare ser-inventory-item-schema-version)

(clojure.core/declare ser-compliance-status)

(clojure.core/declare ser-parameter-string-filter-value-list)

(clojure.core/declare ser-compliance-execution-summary)

(clojure.core/declare ser-allowed-pattern)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-compliance-string-filter-key)

(clojure.core/declare ser-inventory-filter-key)

(clojure.core/declare ser-command-filter-key)

(clojure.core/declare ser-patch-source-product-list)

(clojure.core/declare ser-baseline-id)

(clojure.core/declare ser-inventory-group-name)

(clojure.core/declare ser-maintenance-window-target-id)

(clojure.core/declare ser-association-execution-filter-key)

(clojure.core/declare ser-managed-instance-id)

(clojure.core/declare ser-compliance-string-filter-value-list)

(clojure.core/declare ser-maintenance-window-id)

(clojure.core/declare ser-session-manager-parameter-name)

(clojure.core/declare ser-patch-orchestrator-filter-values)

(clojure.core/declare ser-instance-patch-state-filter-list)

(clojure.core/declare ser-compliance-execution-id)

(clojure.core/declare ser-maintenance-window-description)

(clojure.core/declare ser-association-name)

(clojure.core/declare ser-maintenance-window-lambda-client-context)

(clojure.core/declare ser-effective-instance-association-max-results)

(clojure.core/declare ser-step-execution-filter-list)

(clojure.core/declare ser-string)

(clojure.core/declare ser-parameter-description)

(clojure.core/declare ser-automation-execution-filter)

(clojure.core/declare ser-inventory-item-content-context)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-instance-patch-state-filter-key)

(clojure.core/declare ser-create-association-batch-request-entry)

(clojure.core/declare ser-automation-execution-filter-value-list)

(clojure.core/declare ser-patch-filter-key)

(clojure.core/declare ser-maintenance-window-lambda-parameters)

(clojure.core/declare ser-patch-source-list)

(clojure.core/declare ser-maintenance-window-max-results)

(clojure.core/declare ser-notification-arn)

(clojure.core/declare ser-instance-information-string-filter)

(clojure.core/declare ser-maintenance-window-step-functions-input)

(clojure.core/declare ser-activation-id)

(clojure.core/declare ser-inventory-aggregator-expression)

(clojure.core/declare ser-document-format)

(clojure.core/declare ser-targets)

(clojure.core/declare ser-patch-compliance-level)

(clojure.core/declare ser-patch-source-configuration)

(clojure.core/declare ser-target-map-value)

(clojure.core/declare ser-compliance-resource-type-list)

(clojure.core/declare ser-association-execution-targets-filter-value)

(clojure.core/declare ser-parameters-filter-list)

(clojure.core/declare ser-baseline-name)

(clojure.core/declare ser-maintenance-window-step-functions-name)

(clojure.core/declare ser-compliance-resource-id)

(clojure.core/declare ser-association-execution-filter-list)

(clojure.core/declare ser-resource-data-sync-s-3-bucket-name)

(clojure.core/declare ser-maintenance-window-duration-hours)

(clojure.core/declare ser-s-3-key-prefix)

(clojure.core/declare ser-inventory-aggregator-list)

(clojure.core/declare ser-compliance-execution-type)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-document-permission-type)

(clojure.core/declare ser-schedule-expression)

(clojure.core/declare ser-resource-type-for-tagging)

(clojure.core/declare ser-document-version-number)

(clojure.core/declare ser-command-id)

(clojure.core/declare ser-patch-source-name)

(clojure.core/declare ser-inventory-item-entry-list)

(clojure.core/declare ser-association-status-name)

(clojure.core/declare ser-command-filter)

(clojure.core/declare ser-session-filter-value)

(clojure.core/declare ser-maintenance-window-filter-value)

(clojure.core/declare ser-resource-data-sync-name)

(clojure.core/declare ser-patch-rule-list)

(clojure.core/declare ser-owner-information)

(clojure.core/declare ser-describe-activations-filter-list)

(clojure.core/declare ser-maintenance-window-string-date-time)

(clojure.core/declare ser-describe-activations-filter)

(clojure.core/declare ser-s-3-output-location)

(clojure.core/declare ser-automation-parameter-value)

(clojure.core/declare ser-patch-filter-value-list)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-create-association-batch-request-entries)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-maintenance-window-schedule)

(clojure.core/declare ser-inventory-item-type-name)

(clojure.core/declare ser-result-attribute-list)

(clojure.core/declare ser-document-key-values-filter-key)

(clojure.core/declare ser-maintenance-window-task-invocation-parameters)

(clojure.core/declare ser-step-execution-filter-key)

(clojure.core/declare ser-document-name)

(clojure.core/declare ser-compliance-item-content-hash)

(clojure.core/declare ser-maintenance-window-step-functions-parameters)

(clojure.core/declare ser-patch-filter-value)

(clojure.core/declare ser-maintenance-window-task-type)

(clojure.core/declare ser-maintenance-window-allow-unassociated-targets)

(clojure.core/declare ser-session-manager-parameters)

(clojure.core/declare ser-inventory-item)

(clojure.core/declare ser-command-filter-list)

(clojure.core/declare ser-inventory-group-list)

(clojure.core/declare ser-document-version)

(clojure.core/declare ser-target)

(clojure.core/declare ser-document-hash-type)

(clojure.core/declare ser-session-filter-key)

(clojure.core/declare ser-maintenance-window-filter-key)

(clojure.core/declare ser-document-filter)

(clojure.core/declare ser-session-manager-parameter-value)

(clojure.core/declare ser-describe-activations-filter-keys)

(clojure.core/declare ser-maintenance-window-timezone)

(clojure.core/declare ser-activation-description)

(clojure.core/declare ser-is-sub-type-schema)

(clojure.core/declare ser-compliance-filter-value)

(clojure.core/declare ser-ps-parameter-name)

(clojure.core/declare ser-instance-association-output-location)

(clojure.core/declare ser-session-filter)

(clojure.core/declare ser-maintenance-window-automation-parameters)

(clojure.core/declare ser-compliance-resource-id-list)

(clojure.core/declare ser-inventory-item-capture-time)

(clojure.core/declare ser-association-execution-targets-filter)

(clojure.core/declare ser-baseline-description)

(clojure.core/declare ser-maintenance-window-execution-id)

(clojure.core/declare ser-compliance-query-operator-type)

(clojure.core/declare ser-automation-execution-id)

(clojure.core/declare ser-target-value)

(clojure.core/declare ser-patch-filter-list)

(clojure.core/declare ser-inventory-deletion-id)

(clojure.core/declare ser-patch-source-product)

(clojure.core/declare ser-instance-patch-state-operator-type)

(clojure.core/declare ser-maintenance-window-task-parameter-value-expression)

(clojure.core/declare ser-target-map-value-list)

(clojure.core/declare ser-target-key)

(clojure.core/declare ser-automation-parameter-value-list)

(clojure.core/declare ser-compliance-item-details)

(clojure.core/declare ser-maintenance-window-task-parameter-value-list)

(clojure.core/declare ser-instance-information-string-filter-key)

(clojure.core/declare ser-max-results-ec-2-compatible)

(clojure.core/declare ser-association-execution-targets-filter-key)

(clojure.core/declare ser-operating-system)

(clojure.core/declare ser-association-filter)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-notification-event-list)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-registration-limit)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-association-filter-operator-type)

(clojure.core/declare ser-date-time)

(clojure.core/declare ser-target-values)

(clojure.core/declare ser-maintenance-window-task-parameter-value)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-maintenance-window-resource-type)

(clojure.core/defn- ser-parameter-string-filter-value [input] #:http.request.field{:value input, :shape "ParameterStringFilterValue"})

(clojure.core/defn- ser-target-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-target-map-key k) #:http.request.field{:map-info "key", :shape "TargetMapKey"}) (clojure.core/into (ser-target-map-value-list v) #:http.request.field{:map-info "value", :shape "TargetMapValueList"})])) input), :shape "TargetMap", :type "map", :max 20, :min 1})

(clojure.core/defn- ser-instance-information-filter-value-set [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-information-filter-value coll) #:http.request.field{:shape "InstanceInformationFilterValue"}))) input), :shape "InstanceInformationFilterValueSet", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-instance-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-id coll) #:http.request.field{:shape "InstanceId"}))) input), :shape "InstanceIdList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-automation-parameter-key [input] #:http.request.field{:value input, :shape "AutomationParameterKey"})

(clojure.core/defn- ser-automation-execution-filter-value [input] #:http.request.field{:value input, :shape "AutomationExecutionFilterValue"})

(clojure.core/defn- ser-dry-run [input] #:http.request.field{:value input, :shape "DryRun"})

(clojure.core/defn- ser-approve-after-days [input] #:http.request.field{:value input, :shape "ApproveAfterDays"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-maintenance-window-run-command-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowRunCommandParameters", :type "structure"} (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "ServiceRole"})) (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment (input :comment)) #:http.request.field{:name "Comment", :shape "Comment"})) (clojure.core/contains? input :timeout-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout-seconds (input :timeout-seconds)) #:http.request.field{:name "TimeoutSeconds", :shape "TimeoutSeconds", :box true})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :output-s-3-bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket-name (input :output-s-3-bucket-name)) #:http.request.field{:name "OutputS3BucketName", :shape "S3BucketName"})) (clojure.core/contains? input :notification-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-config (input :notification-config)) #:http.request.field{:name "NotificationConfig", :shape "NotificationConfig"})) (clojure.core/contains? input :document-hash) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-hash (input :document-hash)) #:http.request.field{:name "DocumentHash", :shape "DocumentHash"})) (clojure.core/contains? input :output-s-3-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :output-s-3-key-prefix)) #:http.request.field{:name "OutputS3KeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :document-hash-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-hash-type (input :document-hash-type)) #:http.request.field{:name "DocumentHashType", :shape "DocumentHashType"}))))

(clojure.core/defn- ser-automation-execution-filter-key [input] #:http.request.field{:value (clojure.core/get {"StartTimeBefore" "StartTimeBefore", "ParentExecutionId" "ParentExecutionId", :document-name-prefix "DocumentNamePrefix", :parent-execution-id "ParentExecutionId", :start-time-before "StartTimeBefore", "StartTimeAfter" "StartTimeAfter", "CurrentAction" "CurrentAction", :execution-status "ExecutionStatus", "ExecutionId" "ExecutionId", :current-action "CurrentAction", :execution-id "ExecutionId", "ExecutionStatus" "ExecutionStatus", "DocumentNamePrefix" "DocumentNamePrefix", :start-time-after "StartTimeAfter"} input), :shape "AutomationExecutionFilterKey"})

(clojure.core/defn- ser-parameter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "ParameterValueList", :type "list"})

(clojure.core/defn- ser-command-filter-value [input] #:http.request.field{:value input, :shape "CommandFilterValue"})

(clojure.core/defn- ser-document-content [input] #:http.request.field{:value input, :shape "DocumentContent"})

(clojure.core/defn- ser-inventory-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-filter-value coll) #:http.request.field{:shape "InventoryFilterValue"}))) input), :shape "InventoryFilterValueList", :type "list", :max 40, :min 1})

(clojure.core/defn- ser-association-version [input] #:http.request.field{:value input, :shape "AssociationVersion"})

(clojure.core/defn- ser-target-maps [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-map coll) #:http.request.field{:shape "TargetMap"}))) input), :shape "TargetMaps", :type "list", :max 300, :min 0})

(clojure.core/defn- ser-service-role [input] #:http.request.field{:value input, :shape "ServiceRole"})

(clojure.core/defn- ser-maintenance-window-enabled [input] #:http.request.field{:value input, :shape "MaintenanceWindowEnabled"})

(clojure.core/defn- ser-maintenance-window-name [input] #:http.request.field{:value input, :shape "MaintenanceWindowName"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-instance-information-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-information-filter coll) #:http.request.field{:shape "InstanceInformationFilter"}))) input), :shape "InstanceInformationFilterList", :type "list", :min 0})

(clojure.core/defn- ser-compliance-item-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-item-entry coll) #:http.request.field{:shape "ComplianceItemEntry"}))) input), :shape "ComplianceItemEntryList", :type "list", :max 10000, :min 0})

(clojure.core/defn- ser-maintenance-window-search-max-results [input] #:http.request.field{:value input, :shape "MaintenanceWindowSearchMaxResults"})

(clojure.core/defn- ser-step-execution-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-step-execution-filter-key (:key input)) #:http.request.field{:name "Key", :shape "StepExecutionFilterKey"}) (clojure.core/into (ser-step-execution-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "StepExecutionFilterValueList"})], :shape "StepExecutionFilter", :type "structure"}))

(clojure.core/defn- ser-patch-group [input] #:http.request.field{:value input, :shape "PatchGroup"})

(clojure.core/defn- ser-compliance-item-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-compliance-severity (:severity input)) #:http.request.field{:name "Severity", :shape "ComplianceSeverity"}) (clojure.core/into (ser-compliance-status (:status input)) #:http.request.field{:name "Status", :shape "ComplianceStatus"})], :shape "ComplianceItemEntry", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-item-id (input :id)) #:http.request.field{:name "Id", :shape "ComplianceItemId"})) (clojure.core/contains? input :title) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-item-title (input :title)) #:http.request.field{:name "Title", :shape "ComplianceItemTitle"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-item-details (input :details)) #:http.request.field{:name "Details", :shape "ComplianceItemDetails"}))))

(clojure.core/defn- ser-patch-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-patch-filter-key (:key input)) #:http.request.field{:name "Key", :shape "PatchFilterKey"}) (clojure.core/into (ser-patch-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "PatchFilterValueList"})], :shape "PatchFilter", :type "structure"}))

(clojure.core/defn- ser-notification-event [input] #:http.request.field{:value (clojure.core/get {:timed-out "TimedOut", "Failed" "Failed", "Cancelled" "Cancelled", :in-progress "InProgress", "TimedOut" "TimedOut", :all "All", "Success" "Success", :cancelled "Cancelled", :success "Success", "InProgress" "InProgress", "All" "All", :failed "Failed"} input), :shape "NotificationEvent"})

(clojure.core/defn- ser-instance-information-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-information-filter-key (:key input)) #:http.request.field{:name "key", :shape "InstanceInformationFilterKey"}) (clojure.core/into (ser-instance-information-filter-value-set (:value-set input)) #:http.request.field{:name "valueSet", :shape "InstanceInformationFilterValueSet"})], :shape "InstanceInformationFilter", :type "structure"}))

(clojure.core/defn- ser-inventory-aggregator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InventoryAggregator", :type "structure"} (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-aggregator-expression (input :expression)) #:http.request.field{:name "Expression", :shape "InventoryAggregatorExpression"})) (clojure.core/contains? input :aggregators) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-aggregator-list (input :aggregators)) #:http.request.field{:name "Aggregators", :shape "InventoryAggregatorList"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-group-list (input :groups)) #:http.request.field{:name "Groups", :shape "InventoryGroupList"}))))

(clojure.core/defn- ser-parameter-name [input] #:http.request.field{:value input, :shape "ParameterName"})

(clojure.core/defn- ser-patch-orchestrator-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PatchOrchestratorFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-key (input :key)) #:http.request.field{:name "Key", :shape "PatchOrchestratorFilterKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-values (input :values)) #:http.request.field{:name "Values", :shape "PatchOrchestratorFilterValues"}))))

(clojure.core/defn- ser-parameter-type [input] #:http.request.field{:value (clojure.core/get {"String" "String", :string "String", "StringList" "StringList", :string-list "StringList", "SecureString" "SecureString", :secure-string "SecureString"} input), :shape "ParameterType"})

(clojure.core/defn- ser-inventory-query-operator-type [input] #:http.request.field{:value (clojure.core/get {:exists "Exists", "NotEqual" "NotEqual", :less-than "LessThan", "BeginWith" "BeginWith", "Exists" "Exists", "Equal" "Equal", "LessThan" "LessThan", :greater-than "GreaterThan", "GreaterThan" "GreaterThan", :not-equal "NotEqual", :begin-with "BeginWith", :equal "Equal"} input), :shape "InventoryQueryOperatorType"})

(clojure.core/defn- ser-parameter-string-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-string-filter-key (:key input)) #:http.request.field{:name "Key", :shape "ParameterStringFilterKey"})], :shape "ParameterStringFilter", :type "structure"} (clojure.core/contains? input :option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-string-query-option (input :option)) #:http.request.field{:name "Option", :shape "ParameterStringQueryOption"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-string-filter-value-list (input :values)) #:http.request.field{:name "Values", :shape "ParameterStringFilterValueList"}))))

(clojure.core/defn- ser-s-3-region [input] #:http.request.field{:value input, :shape "S3Region"})

(clojure.core/defn- ser-instance-patch-state-filter-value [input] #:http.request.field{:value input, :shape "InstancePatchStateFilterValue"})

(clojure.core/defn- ser-document-filter-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Owner" "Owner", :owner "Owner", "PlatformTypes" "PlatformTypes", :platform-types "PlatformTypes", "DocumentType" "DocumentType", :document-type "DocumentType"} input), :shape "DocumentFilterKey"})

(clojure.core/defn- ser-comment [input] #:http.request.field{:value input, :shape "Comment"})

(clojure.core/defn- ser-compliance-resource-type [input] #:http.request.field{:value input, :shape "ComplianceResourceType"})

(clojure.core/defn- ser-association-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-association-id coll) #:http.request.field{:shape "AssociationId"}))) input), :shape "AssociationIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-document-key-values-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-document-key-values-filter coll) #:http.request.field{:shape "DocumentKeyValuesFilter"}))) input), :shape "DocumentKeyValuesFilterList", :type "list", :max 6, :min 0})

(clojure.core/defn- ser-patch-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-patch-source-name (:name input)) #:http.request.field{:name "Name", :shape "PatchSourceName"}) (clojure.core/into (ser-patch-source-product-list (:products input)) #:http.request.field{:name "Products", :shape "PatchSourceProductList"}) (clojure.core/into (ser-patch-source-configuration (:configuration input)) #:http.request.field{:name "Configuration", :shape "PatchSourceConfiguration"})], :shape "PatchSource", :type "structure"}))

(clojure.core/defn- ser-compliance-string-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-string-filter coll) #:http.request.field{:shape "ComplianceStringFilter"}))) input), :shape "ComplianceStringFilterList", :type "list"})

(clojure.core/defn- ser-instance-information-filter-value [input] #:http.request.field{:value input, :shape "InstanceInformationFilterValue"})

(clojure.core/defn- ser-instance-information-string-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-information-string-filter coll) #:http.request.field{:shape "InstanceInformationStringFilter"}))) input), :shape "InstanceInformationStringFilterList", :type "list", :min 0})

(clojure.core/defn- ser-command-max-results [input] #:http.request.field{:value input, :shape "CommandMaxResults"})

(clojure.core/defn- ser-parameter-label-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-label coll) #:http.request.field{:shape "ParameterLabel"}))) input), :shape "ParameterLabelList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-association-execution-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-association-execution-filter-key (:key input)) #:http.request.field{:name "Key", :shape "AssociationExecutionFilterKey"}) (clojure.core/into (ser-association-execution-filter-value (:value input)) #:http.request.field{:name "Value", :shape "AssociationExecutionFilterValue"}) (clojure.core/into (ser-association-filter-operator-type (:type input)) #:http.request.field{:name "Type", :shape "AssociationFilterOperatorType"})], :shape "AssociationExecutionFilter", :type "structure"}))

(clojure.core/defn- ser-inventory-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-filter-key (:key input)) #:http.request.field{:name "Key", :shape "InventoryFilterKey"}) (clojure.core/into (ser-inventory-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "InventoryFilterValueList"})], :shape "InventoryFilter", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-query-operator-type (input :type)) #:http.request.field{:name "Type", :shape "InventoryQueryOperatorType"}))))

(clojure.core/defn- ser-inventory-item-type-name-filter [input] #:http.request.field{:value input, :shape "InventoryItemTypeNameFilter"})

(clojure.core/defn- ser-maintenance-window-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-maintenance-window-filter-value coll) #:http.request.field{:shape "MaintenanceWindowFilterValue"}))) input), :shape "MaintenanceWindowFilterValues", :type "list"})

(clojure.core/defn- ser-get-parameters-by-path-max-results [input] #:http.request.field{:value input, :shape "GetParametersByPathMaxResults"})

(clojure.core/defn- ser-session-id [input] #:http.request.field{:value input, :shape "SessionId"})

(clojure.core/defn- ser-ps-parameter-version [input] #:http.request.field{:value input, :shape "PSParameterVersion"})

(clojure.core/defn- ser-account-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-id coll) #:http.request.field{:shape "AccountId"}))) input), :shape "AccountIdList", :type "list", :max 20})

(clojure.core/defn- ser-session-max-results [input] #:http.request.field{:value input, :shape "SessionMaxResults"})

(clojure.core/defn- ser-maintenance-window-execution-task-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowExecutionTaskId"})

(clojure.core/defn- ser-patch-orchestrator-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-orchestrator-filter coll) #:http.request.field{:shape "PatchOrchestratorFilter"}))) input), :shape "PatchOrchestratorFilterList", :type "list", :max 5, :min 0})

(clojure.core/defn- ser-maintenance-window-cutoff [input] #:http.request.field{:value input, :shape "MaintenanceWindowCutoff"})

(clojure.core/defn- ser-timeout-seconds [input] #:http.request.field{:value input, :shape "TimeoutSeconds"})

(clojure.core/defn- ser-resource-data-sync-s-3-region [input] #:http.request.field{:value input, :shape "ResourceDataSyncS3Region"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-parameters-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameters-filter-key (:key input)) #:http.request.field{:name "Key", :shape "ParametersFilterKey"}) (clojure.core/into (ser-parameters-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "ParametersFilterValueList"})], :shape "ParametersFilter", :type "structure"}))

(clojure.core/defn- ser-status-additional-info [input] #:http.request.field{:value input, :shape "StatusAdditionalInfo"})

(clojure.core/defn- ser-parameter-string-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-string-filter coll) #:http.request.field{:shape "ParameterStringFilter"}))) input), :shape "ParameterStringFilterList", :type "list"})

(clojure.core/defn- ser-resource-data-sync-awskms-key-arn [input] #:http.request.field{:value input, :shape "ResourceDataSyncAWSKMSKeyARN"})

(clojure.core/defn- ser-association-execution-filter-value [input] #:http.request.field{:value input, :shape "AssociationExecutionFilterValue"})

(clojure.core/defn- ser-status-message [input] #:http.request.field{:value input, :shape "StatusMessage"})

(clojure.core/defn- ser-patch-orchestrator-filter-value [input] #:http.request.field{:value input, :shape "PatchOrchestratorFilterValue"})

(clojure.core/defn- ser-patch-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-patch-filter-group (:patch-filter-group input)) #:http.request.field{:name "PatchFilterGroup", :shape "PatchFilterGroup"}) (clojure.core/into (ser-approve-after-days (:approve-after-days input)) #:http.request.field{:name "ApproveAfterDays", :shape "ApproveAfterDays", :box true})], :shape "PatchRule", :type "structure"} (clojure.core/contains? input :compliance-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-level (input :compliance-level)) #:http.request.field{:name "ComplianceLevel", :shape "PatchComplianceLevel"})) (clojure.core/contains? input :enable-non-security) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-non-security)) #:http.request.field{:name "EnableNonSecurity", :shape "Boolean", :box true}))))

(clojure.core/defn- ser-execution-mode [input] #:http.request.field{:value (clojure.core/get {"Auto" "Auto", :auto "Auto", "Interactive" "Interactive", :interactive "Interactive"} input), :shape "ExecutionMode"})

(clojure.core/defn- ser-inventory-item-content-hash [input] #:http.request.field{:value input, :shape "InventoryItemContentHash"})

(clojure.core/defn- ser-patch-orchestrator-filter-key [input] #:http.request.field{:value input, :shape "PatchOrchestratorFilterKey"})

(clojure.core/defn- ser-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "KeyList", :type "list"})

(clojure.core/defn- ser-inventory-item-entry [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "InventoryItemEntry", :type "map", :max 50, :min 0})

(clojure.core/defn- ser-cloud-watch-log-group-name [input] #:http.request.field{:value input, :shape "CloudWatchLogGroupName"})

(clojure.core/defn- ser-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-parameter-name k) #:http.request.field{:map-info "key", :shape "ParameterName"}) (clojure.core/into (ser-parameter-value-list v) #:http.request.field{:map-info "value", :shape "ParameterValueList"})])) input), :shape "Parameters", :type "map"})

(clojure.core/defn- ser-inventory-filter-value [input] #:http.request.field{:value input, :shape "InventoryFilterValue"})

(clojure.core/defn- ser-association-execution-id [input] #:http.request.field{:value input, :shape "AssociationExecutionId"})

(clojure.core/defn- ser-resource-data-sync-s-3-format [input] #:http.request.field{:value (clojure.core/get {"JsonSerDe" "JsonSerDe", :json-ser-de "JsonSerDe"} input), :shape "ResourceDataSyncS3Format"})

(clojure.core/defn- ser-document-type [input] #:http.request.field{:value (clojure.core/get {"Command" "Command", :command "Command", "Policy" "Policy", :policy "Policy", "Automation" "Automation", :automation "Automation", "Session" "Session", :session "Session"} input), :shape "DocumentType"})

(clojure.core/defn- ser-parameters-filter-value [input] #:http.request.field{:value input, :shape "ParametersFilterValue"})

(clojure.core/defn- ser-association-id [input] #:http.request.field{:value input, :shape "AssociationId"})

(clojure.core/defn- ser-get-inventory-schema-max-results [input] #:http.request.field{:value input, :shape "GetInventorySchemaMaxResults"})

(clojure.core/defn- ser-automation-execution-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-automation-execution-filter coll) #:http.request.field{:shape "AutomationExecutionFilter"}))) input), :shape "AutomationExecutionFilterList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-session-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-session-filter coll) #:http.request.field{:shape "SessionFilter"}))) input), :shape "SessionFilterList", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-parameters-filter-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Type" "Type", :type "Type", "KeyId" "KeyId", :key-id "KeyId"} input), :shape "ParametersFilterKey"})

(clojure.core/defn- ser-inventory-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-group-name (:name input)) #:http.request.field{:name "Name", :shape "InventoryGroupName"}) (clojure.core/into (ser-inventory-filter-list (:filters input)) #:http.request.field{:name "Filters", :shape "InventoryFilterList"})], :shape "InventoryGroup", :type "structure"}))

(clojure.core/defn- ser-compliance-item-title [input] #:http.request.field{:value input, :shape "ComplianceItemTitle"})

(clojure.core/defn- ser-document-key-values-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-document-key-values-filter-value coll) #:http.request.field{:shape "DocumentKeyValuesFilterValue"}))) input), :shape "DocumentKeyValuesFilterValues", :type "list"})

(clojure.core/defn- ser-document-key-values-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DocumentKeyValuesFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-key-values-filter-key (input :key)) #:http.request.field{:name "Key", :shape "DocumentKeyValuesFilterKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-key-values-filter-values (input :values)) #:http.request.field{:name "Values", :shape "DocumentKeyValuesFilterValues"}))))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-parameter-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ps-parameter-name coll) #:http.request.field{:shape "PSParameterName"}))) input), :shape "ParameterNameList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-target-type [input] #:http.request.field{:value input, :shape "TargetType"})

(clojure.core/defn- ser-resource-data-sync-s-3-prefix [input] #:http.request.field{:value input, :shape "ResourceDataSyncS3Prefix"})

(clojure.core/defn- ser-notification-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotificationConfig", :type "structure"} (clojure.core/contains? input :notification-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-arn (input :notification-arn)) #:http.request.field{:name "NotificationArn", :shape "NotificationArn"})) (clojure.core/contains? input :notification-events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-event-list (input :notification-events)) #:http.request.field{:name "NotificationEvents", :shape "NotificationEventList"})) (clojure.core/contains? input :notification-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-type (input :notification-type)) #:http.request.field{:name "NotificationType", :shape "NotificationType"}))))

(clojure.core/defn- ser-s-3-bucket-name [input] #:http.request.field{:value input, :shape "S3BucketName"})

(clojure.core/defn- ser-document-hash [input] #:http.request.field{:value input, :shape "DocumentHash"})

(clojure.core/defn- ser-inventory-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-filter coll) #:http.request.field{:shape "InventoryFilter"}))) input), :shape "InventoryFilterList", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-association-execution-targets-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-association-execution-targets-filter coll) #:http.request.field{:shape "AssociationExecutionTargetsFilter"}))) input), :shape "AssociationExecutionTargetsFilterList", :type "list", :min 1})

(clojure.core/defn- ser-parameters-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameters-filter-value coll) #:http.request.field{:shape "ParametersFilterValue"}))) input), :shape "ParametersFilterValueList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-iam-role [input] #:http.request.field{:value input, :shape "IamRole"})

(clojure.core/defn- ser-compliance-severity [input] #:http.request.field{:value (clojure.core/get {"INFORMATIONAL" "INFORMATIONAL", :unspecified "UNSPECIFIED", "CRITICAL" "CRITICAL", :medium "MEDIUM", "LOW" "LOW", :high "HIGH", :critical "CRITICAL", "HIGH" "HIGH", :low "LOW", "UNSPECIFIED" "UNSPECIFIED", :informational "INFORMATIONAL", "MEDIUM" "MEDIUM"} input), :shape "ComplianceSeverity"})

(clojure.core/defn- ser-session-state [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "History" "History", :history "History"} input), :shape "SessionState"})

(clojure.core/defn- ser-notification-type [input] #:http.request.field{:value (clojure.core/get {"Command" "Command", :command "Command", "Invocation" "Invocation", :invocation "Invocation"} input), :shape "NotificationType"})

(clojure.core/defn- ser-maintenance-window-lambda-payload [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "MaintenanceWindowLambdaPayload"})

(clojure.core/defn- ser-result-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-item-type-name (:type-name input)) #:http.request.field{:name "TypeName", :shape "InventoryItemTypeName"})], :shape "ResultAttribute", :type "structure"}))

(clojure.core/defn- ser-maintenance-window-task-arn [input] #:http.request.field{:value input, :shape "MaintenanceWindowTaskArn"})

(clojure.core/defn- ser-maintenance-window-lambda-qualifier [input] #:http.request.field{:value input, :shape "MaintenanceWindowLambdaQualifier"})

(clojure.core/defn- ser-target-map-key [input] #:http.request.field{:value input, :shape "TargetMapKey"})

(clojure.core/defn- ser-association-status [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-date-time (:date input)) #:http.request.field{:name "Date", :shape "DateTime"}) (clojure.core/into (ser-association-status-name (:name input)) #:http.request.field{:name "Name", :shape "AssociationStatusName"}) (clojure.core/into (ser-status-message (:message input)) #:http.request.field{:name "Message", :shape "StatusMessage"})], :shape "AssociationStatus", :type "structure"} (clojure.core/contains? input :additional-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status-additional-info (input :additional-info)) #:http.request.field{:name "AdditionalInfo", :shape "StatusAdditionalInfo"}))))

(clojure.core/defn- ser-association-filter-key [input] #:http.request.field{:value (clojure.core/get {"InstanceId" "InstanceId", :association-id "AssociationId", "AssociationId" "AssociationId", :name "Name", :association-name "AssociationName", :instance-id "InstanceId", "LastExecutedBefore" "LastExecutedBefore", "AssociationName" "AssociationName", :association-status-name "AssociationStatusName", "AssociationStatusName" "AssociationStatusName", :last-executed-after "LastExecutedAfter", "Name" "Name", :last-executed-before "LastExecutedBefore", "LastExecutedAfter" "LastExecutedAfter"} input), :shape "AssociationFilterKey"})

(clojure.core/defn- ser-inventory-schema-delete-option [input] #:http.request.field{:value (clojure.core/get {"DisableSchema" "DisableSchema", :disable-schema "DisableSchema", "DeleteSchema" "DeleteSchema", :delete-schema "DeleteSchema"} input), :shape "InventorySchemaDeleteOption"})

(clojure.core/defn- ser-maintenance-window-task-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-maintenance-window-task-parameter-name k) #:http.request.field{:map-info "key", :shape "MaintenanceWindowTaskParameterName"}) (clojure.core/into (ser-maintenance-window-task-parameter-value-expression v) #:http.request.field{:map-info "value", :shape "MaintenanceWindowTaskParameterValueExpression"})])) input), :shape "MaintenanceWindowTaskParameters", :type "map", :sensitive true})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-session-manager-parameter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-session-manager-parameter-value coll) #:http.request.field{:shape "SessionManagerParameterValue"}))) input), :shape "SessionManagerParameterValueList", :type "list"})

(clojure.core/defn- ser-resource-data-sync-s-3-destination [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-data-sync-s-3-bucket-name (:bucket-name input)) #:http.request.field{:name "BucketName", :shape "ResourceDataSyncS3BucketName"}) (clojure.core/into (ser-resource-data-sync-s-3-format (:sync-format input)) #:http.request.field{:name "SyncFormat", :shape "ResourceDataSyncS3Format"}) (clojure.core/into (ser-resource-data-sync-s-3-region (:region input)) #:http.request.field{:name "Region", :shape "ResourceDataSyncS3Region"})], :shape "ResourceDataSyncS3Destination", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-data-sync-s-3-prefix (input :prefix)) #:http.request.field{:name "Prefix", :shape "ResourceDataSyncS3Prefix"})) (clojure.core/contains? input :awskms-key-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-data-sync-awskms-key-arn (input :awskms-key-arn)) #:http.request.field{:name "AWSKMSKeyARN", :shape "ResourceDataSyncAWSKMSKeyARN"}))))

(clojure.core/defn- ser-aggregator-schema-only [input] #:http.request.field{:value input, :shape "AggregatorSchemaOnly"})

(clojure.core/defn- ser-cloud-watch-output-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchOutputConfig", :type "structure"} (clojure.core/contains? input :cloud-watch-log-group-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-log-group-name (input :cloud-watch-log-group-name)) #:http.request.field{:name "CloudWatchLogGroupName", :shape "CloudWatchLogGroupName"})) (clojure.core/contains? input :cloud-watch-output-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-output-enabled (input :cloud-watch-output-enabled)) #:http.request.field{:name "CloudWatchOutputEnabled", :shape "CloudWatchOutputEnabled"}))))

(clojure.core/defn- ser-parameter-string-query-option [input] #:http.request.field{:value input, :shape "ParameterStringQueryOption"})

(clojure.core/defn- ser-patch-baseline-max-results [input] #:http.request.field{:value input, :shape "PatchBaselineMaxResults"})

(clojure.core/defn- ser-default-instance-name [input] #:http.request.field{:value input, :shape "DefaultInstanceName"})

(clojure.core/defn- ser-instance-information-filter-key [input] #:http.request.field{:value (clojure.core/get {"InstanceIds" "InstanceIds", "ActivationIds" "ActivationIds", :platform-types "PlatformTypes", :iam-role "IamRole", "PingStatus" "PingStatus", "IamRole" "IamRole", "AgentVersion" "AgentVersion", "AssociationStatus" "AssociationStatus", :association-status "AssociationStatus", "ResourceType" "ResourceType", :instance-ids "InstanceIds", "PlatformTypes" "PlatformTypes", :resource-type "ResourceType", :agent-version "AgentVersion", :activation-ids "ActivationIds", :ping-status "PingStatus"} input), :shape "InstanceInformationFilterKey"})

(clojure.core/defn- ser-maintenance-window-task-parameter-name [input] #:http.request.field{:value input, :shape "MaintenanceWindowTaskParameterName"})

(clojure.core/defn- ser-session-target [input] #:http.request.field{:value input, :shape "SessionTarget"})

(clojure.core/defn- ser-expiration-date [input] #:http.request.field{:value input, :shape "ExpirationDate"})

(clojure.core/defn- ser-maintenance-window-task-priority [input] #:http.request.field{:value input, :shape "MaintenanceWindowTaskPriority"})

(clojure.core/defn- ser-document-arn [input] #:http.request.field{:value input, :shape "DocumentARN"})

(clojure.core/defn- ser-patch-id [input] #:http.request.field{:value input, :shape "PatchId"})

(clojure.core/defn- ser-max-concurrency [input] #:http.request.field{:value input, :shape "MaxConcurrency"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-maintenance-window-task-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowTaskId"})

(clojure.core/defn- ser-maintenance-window-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-key (input :key)) #:http.request.field{:name "Key", :shape "MaintenanceWindowFilterKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-values (input :values)) #:http.request.field{:name "Values", :shape "MaintenanceWindowFilterValues"}))))

(clojure.core/defn- ser-patch-action [input] #:http.request.field{:value (clojure.core/get {"ALLOW_AS_DEPENDENCY" "ALLOW_AS_DEPENDENCY", :allow-as-dependency "ALLOW_AS_DEPENDENCY", "BLOCK" "BLOCK", :block "BLOCK"} input), :shape "PatchAction"})

(clojure.core/defn- ser-stop-type [input] #:http.request.field{:value (clojure.core/get {"Complete" "Complete", :complete "Complete", "Cancel" "Cancel", :cancel "Cancel"} input), :shape "StopType"})

(clojure.core/defn- ser-step-execution-filter-value [input] #:http.request.field{:value input, :shape "StepExecutionFilterValue"})

(clojure.core/defn- ser-patch-compliance-max-results [input] #:http.request.field{:value input, :shape "PatchComplianceMaxResults"})

(clojure.core/defn- ser-instance-patch-state-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-patch-state-filter-value coll) #:http.request.field{:shape "InstancePatchStateFilterValue"}))) input), :shape "InstancePatchStateFilterValues", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-signal-type [input] #:http.request.field{:value (clojure.core/get {:stop-step "StopStep", :approve "Approve", "Resume" "Resume", "StopStep" "StopStep", "StartStep" "StartStep", "Approve" "Approve", :reject "Reject", :resume "Resume", :start-step "StartStep", "Reject" "Reject"} input), :shape "SignalType"})

(clojure.core/defn- ser-compliance-item-id [input] #:http.request.field{:value input, :shape "ComplianceItemId"})

(clojure.core/defn- ser-association-filter-value [input] #:http.request.field{:value input, :shape "AssociationFilterValue"})

(clojure.core/defn- ser-cloud-watch-output-enabled [input] #:http.request.field{:value input, :shape "CloudWatchOutputEnabled"})

(clojure.core/defn- ser-document-filter-value [input] #:http.request.field{:value input, :shape "DocumentFilterValue"})

(clojure.core/defn- ser-parameter-label [input] #:http.request.field{:value input, :shape "ParameterLabel"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-compliance-string-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ComplianceStringFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-string-filter-key (input :key)) #:http.request.field{:name "Key", :shape "ComplianceStringFilterKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-string-filter-value-list (input :values)) #:http.request.field{:name "Values", :shape "ComplianceStringFilterValueList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-query-operator-type (input :type)) #:http.request.field{:name "Type", :shape "ComplianceQueryOperatorType"}))))

(clojure.core/defn- ser-compliance-type-name [input] #:http.request.field{:value input, :shape "ComplianceTypeName"})

(clojure.core/defn- ser-patch-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-id coll) #:http.request.field{:shape "PatchId"}))) input), :shape "PatchIdList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-document-key-values-filter-value [input] #:http.request.field{:value input, :shape "DocumentKeyValuesFilterValue"})

(clojure.core/defn- ser-logging-info [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-bucket-name (:s-3-bucket-name input)) #:http.request.field{:name "S3BucketName", :shape "S3BucketName"}) (clojure.core/into (ser-s-3-region (:s-3-region input)) #:http.request.field{:name "S3Region", :shape "S3Region"})], :shape "LoggingInfo", :type "structure"} (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :s-3-key-prefix)) #:http.request.field{:name "S3KeyPrefix", :shape "S3KeyPrefix"}))))

(clojure.core/defn- ser-ps-parameter-value [input] #:http.request.field{:value input, :shape "PSParameterValue"})

(clojure.core/defn- ser-patch-filter-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-patch-filter-list (:patch-filters input)) #:http.request.field{:name "PatchFilters", :shape "PatchFilterList"})], :shape "PatchFilterGroup", :type "structure"}))

(clojure.core/defn- ser-instance-patch-state-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-patch-state-filter-key (:key input)) #:http.request.field{:name "Key", :shape "InstancePatchStateFilterKey"}) (clojure.core/into (ser-instance-patch-state-filter-values (:values input)) #:http.request.field{:name "Values", :shape "InstancePatchStateFilterValues"}) (clojure.core/into (ser-instance-patch-state-operator-type (:type input)) #:http.request.field{:name "Type", :shape "InstancePatchStateOperatorType"})], :shape "InstancePatchStateFilter", :type "structure"}))

(clojure.core/defn- ser-command-plugin-name [input] #:http.request.field{:value input, :shape "CommandPluginName"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-maintenance-window-execution-task-invocation-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowExecutionTaskInvocationId"})

(clojure.core/defn- ser-parameter-key-id [input] #:http.request.field{:value input, :shape "ParameterKeyId"})

(clojure.core/defn- ser-automation-parameter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-automation-parameter-key k) #:http.request.field{:map-info "key", :shape "AutomationParameterKey"}) (clojure.core/into (ser-automation-parameter-value-list v) #:http.request.field{:map-info "value", :shape "AutomationParameterValueList"})])) input), :shape "AutomationParameterMap", :type "map", :max 200, :min 1})

(clojure.core/defn- ser-step-execution-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-execution-filter-value coll) #:http.request.field{:shape "StepExecutionFilterValue"}))) input), :shape "StepExecutionFilterValueList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-document-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-document-filter coll) #:http.request.field{:shape "DocumentFilter"}))) input), :shape "DocumentFilterList", :type "list", :min 1})

(clojure.core/defn- ser-patch-rule-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-patch-rule-list (:patch-rules input)) #:http.request.field{:name "PatchRules", :shape "PatchRuleList"})], :shape "PatchRuleGroup", :type "structure"}))

(clojure.core/defn- ser-inventory-item-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-item coll) #:http.request.field{:shape "InventoryItem"}))) input), :shape "InventoryItemList", :type "list", :max 30, :min 1})

(clojure.core/defn- ser-maintenance-window-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-maintenance-window-filter coll) #:http.request.field{:shape "MaintenanceWindowFilter"}))) input), :shape "MaintenanceWindowFilterList", :type "list", :max 5, :min 0})

(clojure.core/defn- ser-association-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-association-filter coll) #:http.request.field{:shape "AssociationFilter"}))) input), :shape "AssociationFilterList", :type "list", :min 1})

(clojure.core/defn- ser-max-errors [input] #:http.request.field{:value input, :shape "MaxErrors"})

(clojure.core/defn- ser-parameter-string-filter-key [input] #:http.request.field{:value input, :shape "ParameterStringFilterKey"})

(clojure.core/defn- ser-inventory-item-schema-version [input] #:http.request.field{:value input, :shape "InventoryItemSchemaVersion"})

(clojure.core/defn- ser-compliance-status [input] #:http.request.field{:value (clojure.core/get {"COMPLIANT" "COMPLIANT", :compliant "COMPLIANT", "NON_COMPLIANT" "NON_COMPLIANT", :non-compliant "NON_COMPLIANT"} input), :shape "ComplianceStatus"})

(clojure.core/defn- ser-parameter-string-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-string-filter-value coll) #:http.request.field{:shape "ParameterStringFilterValue"}))) input), :shape "ParameterStringFilterValueList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-compliance-execution-summary [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-date-time (:execution-time input)) #:http.request.field{:name "ExecutionTime", :shape "DateTime"})], :shape "ComplianceExecutionSummary", :type "structure"} (clojure.core/contains? input :execution-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-execution-id (input :execution-id)) #:http.request.field{:name "ExecutionId", :shape "ComplianceExecutionId"})) (clojure.core/contains? input :execution-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-execution-type (input :execution-type)) #:http.request.field{:name "ExecutionType", :shape "ComplianceExecutionType"}))))

(clojure.core/defn- ser-allowed-pattern [input] #:http.request.field{:value input, :shape "AllowedPattern"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-compliance-string-filter-key [input] #:http.request.field{:value input, :shape "ComplianceStringFilterKey"})

(clojure.core/defn- ser-inventory-filter-key [input] #:http.request.field{:value input, :shape "InventoryFilterKey"})

(clojure.core/defn- ser-command-filter-key [input] #:http.request.field{:value (clojure.core/get {"InvokedBefore" "InvokedBefore", :document-name "DocumentName", "InvokedAfter" "InvokedAfter", "ExecutionStage" "ExecutionStage", "Status" "Status", :invoked-before "InvokedBefore", :invoked-after "InvokedAfter", :status "Status", "DocumentName" "DocumentName", :execution-stage "ExecutionStage"} input), :shape "CommandFilterKey"})

(clojure.core/defn- ser-patch-source-product-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-source-product coll) #:http.request.field{:shape "PatchSourceProduct"}))) input), :shape "PatchSourceProductList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-baseline-id [input] #:http.request.field{:value input, :shape "BaselineId"})

(clojure.core/defn- ser-inventory-group-name [input] #:http.request.field{:value input, :shape "InventoryGroupName"})

(clojure.core/defn- ser-maintenance-window-target-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowTargetId"})

(clojure.core/defn- ser-association-execution-filter-key [input] #:http.request.field{:value (clojure.core/get {"ExecutionId" "ExecutionId", :execution-id "ExecutionId", "Status" "Status", :status "Status", "CreatedTime" "CreatedTime", :created-time "CreatedTime"} input), :shape "AssociationExecutionFilterKey"})

(clojure.core/defn- ser-managed-instance-id [input] #:http.request.field{:value input, :shape "ManagedInstanceId"})

(clojure.core/defn- ser-compliance-string-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-filter-value coll) #:http.request.field{:shape "ComplianceFilterValue"}))) input), :shape "ComplianceStringFilterValueList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-maintenance-window-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowId"})

(clojure.core/defn- ser-session-manager-parameter-name [input] #:http.request.field{:value input, :shape "SessionManagerParameterName"})

(clojure.core/defn- ser-patch-orchestrator-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-orchestrator-filter-value coll) #:http.request.field{:shape "PatchOrchestratorFilterValue"}))) input), :shape "PatchOrchestratorFilterValues", :type "list"})

(clojure.core/defn- ser-instance-patch-state-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-patch-state-filter coll) #:http.request.field{:shape "InstancePatchStateFilter"}))) input), :shape "InstancePatchStateFilterList", :type "list", :max 4, :min 0})

(clojure.core/defn- ser-compliance-execution-id [input] #:http.request.field{:value input, :shape "ComplianceExecutionId"})

(clojure.core/defn- ser-maintenance-window-description [input] #:http.request.field{:value input, :shape "MaintenanceWindowDescription"})

(clojure.core/defn- ser-association-name [input] #:http.request.field{:value input, :shape "AssociationName"})

(clojure.core/defn- ser-maintenance-window-lambda-client-context [input] #:http.request.field{:value input, :shape "MaintenanceWindowLambdaClientContext"})

(clojure.core/defn- ser-effective-instance-association-max-results [input] #:http.request.field{:value input, :shape "EffectiveInstanceAssociationMaxResults"})

(clojure.core/defn- ser-step-execution-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-execution-filter coll) #:http.request.field{:shape "StepExecutionFilter"}))) input), :shape "StepExecutionFilterList", :type "list", :max 6, :min 1})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-parameter-description [input] #:http.request.field{:value input, :shape "ParameterDescription"})

(clojure.core/defn- ser-automation-execution-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-automation-execution-filter-key (:key input)) #:http.request.field{:name "Key", :shape "AutomationExecutionFilterKey"}) (clojure.core/into (ser-automation-execution-filter-value-list (:values input)) #:http.request.field{:name "Values", :shape "AutomationExecutionFilterValueList"})], :shape "AutomationExecutionFilter", :type "structure"}))

(clojure.core/defn- ser-inventory-item-content-context [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "InventoryItemContentContext", :type "map", :max 50, :min 0})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-instance-patch-state-filter-key [input] #:http.request.field{:value input, :shape "InstancePatchStateFilterKey"})

(clojure.core/defn- ser-create-association-batch-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-document-name (:name input)) #:http.request.field{:name "Name", :shape "DocumentName"})], :shape "CreateAssociationBatchRequestEntry", :type "structure"} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :schedule-expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :schedule-expression)) #:http.request.field{:name "ScheduleExpression", :shape "ScheduleExpression"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-association-output-location (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "InstanceAssociationOutputLocation"})) (clojure.core/contains? input :association-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-name (input :association-name)) #:http.request.field{:name "AssociationName", :shape "AssociationName"}))))

(clojure.core/defn- ser-automation-execution-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-automation-execution-filter-value coll) #:http.request.field{:shape "AutomationExecutionFilterValue"}))) input), :shape "AutomationExecutionFilterValueList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-patch-filter-key [input] #:http.request.field{:value (clojure.core/get {"PATCH_ID" "PATCH_ID", "CLASSIFICATION" "CLASSIFICATION", :section "SECTION", "SEVERITY" "SEVERITY", :classification "CLASSIFICATION", "MSRC_SEVERITY" "MSRC_SEVERITY", "SECTION" "SECTION", :product "PRODUCT", :priority "PRIORITY", :patch-id "PATCH_ID", :severity "SEVERITY", "PRODUCT" "PRODUCT", :msrc-severity "MSRC_SEVERITY", "PRIORITY" "PRIORITY"} input), :shape "PatchFilterKey"})

(clojure.core/defn- ser-maintenance-window-lambda-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowLambdaParameters", :type "structure"} (clojure.core/contains? input :client-context) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-lambda-client-context (input :client-context)) #:http.request.field{:name "ClientContext", :shape "MaintenanceWindowLambdaClientContext"})) (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-lambda-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "MaintenanceWindowLambdaQualifier"})) (clojure.core/contains? input :payload) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-lambda-payload (input :payload)) #:http.request.field{:name "Payload", :shape "MaintenanceWindowLambdaPayload"}))))

(clojure.core/defn- ser-patch-source-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-source coll) #:http.request.field{:shape "PatchSource"}))) input), :shape "PatchSourceList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-maintenance-window-max-results [input] #:http.request.field{:value input, :shape "MaintenanceWindowMaxResults"})

(clojure.core/defn- ser-notification-arn [input] #:http.request.field{:value input, :shape "NotificationArn"})

(clojure.core/defn- ser-instance-information-string-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-information-string-filter-key (:key input)) #:http.request.field{:name "Key", :shape "InstanceInformationStringFilterKey"}) (clojure.core/into (ser-instance-information-filter-value-set (:values input)) #:http.request.field{:name "Values", :shape "InstanceInformationFilterValueSet"})], :shape "InstanceInformationStringFilter", :type "structure"}))

(clojure.core/defn- ser-maintenance-window-step-functions-input [input] #:http.request.field{:value input, :shape "MaintenanceWindowStepFunctionsInput"})

(clojure.core/defn- ser-activation-id [input] #:http.request.field{:value input, :shape "ActivationId"})

(clojure.core/defn- ser-inventory-aggregator-expression [input] #:http.request.field{:value input, :shape "InventoryAggregatorExpression"})

(clojure.core/defn- ser-document-format [input] #:http.request.field{:value (clojure.core/get {"YAML" "YAML", :yaml "YAML", "JSON" "JSON", :json "JSON"} input), :shape "DocumentFormat"})

(clojure.core/defn- ser-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "Targets", :type "list", :max 5, :min 0})

(clojure.core/defn- ser-patch-compliance-level [input] #:http.request.field{:value (clojure.core/get {"INFORMATIONAL" "INFORMATIONAL", :unspecified "UNSPECIFIED", "CRITICAL" "CRITICAL", :medium "MEDIUM", "LOW" "LOW", :high "HIGH", :critical "CRITICAL", "HIGH" "HIGH", :low "LOW", "UNSPECIFIED" "UNSPECIFIED", :informational "INFORMATIONAL", "MEDIUM" "MEDIUM"} input), :shape "PatchComplianceLevel"})

(clojure.core/defn- ser-patch-source-configuration [input] #:http.request.field{:value input, :shape "PatchSourceConfiguration"})

(clojure.core/defn- ser-target-map-value [input] #:http.request.field{:value input, :shape "TargetMapValue"})

(clojure.core/defn- ser-compliance-resource-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-resource-type coll) #:http.request.field{:shape "ComplianceResourceType"}))) input), :shape "ComplianceResourceTypeList", :type "list", :min 1})

(clojure.core/defn- ser-association-execution-targets-filter-value [input] #:http.request.field{:value input, :shape "AssociationExecutionTargetsFilterValue"})

(clojure.core/defn- ser-parameters-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameters-filter coll) #:http.request.field{:shape "ParametersFilter"}))) input), :shape "ParametersFilterList", :type "list"})

(clojure.core/defn- ser-baseline-name [input] #:http.request.field{:value input, :shape "BaselineName"})

(clojure.core/defn- ser-maintenance-window-step-functions-name [input] #:http.request.field{:value input, :shape "MaintenanceWindowStepFunctionsName"})

(clojure.core/defn- ser-compliance-resource-id [input] #:http.request.field{:value input, :shape "ComplianceResourceId"})

(clojure.core/defn- ser-association-execution-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-association-execution-filter coll) #:http.request.field{:shape "AssociationExecutionFilter"}))) input), :shape "AssociationExecutionFilterList", :type "list", :min 1})

(clojure.core/defn- ser-resource-data-sync-s-3-bucket-name [input] #:http.request.field{:value input, :shape "ResourceDataSyncS3BucketName"})

(clojure.core/defn- ser-maintenance-window-duration-hours [input] #:http.request.field{:value input, :shape "MaintenanceWindowDurationHours"})

(clojure.core/defn- ser-s-3-key-prefix [input] #:http.request.field{:value input, :shape "S3KeyPrefix"})

(clojure.core/defn- ser-inventory-aggregator-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-aggregator coll) #:http.request.field{:shape "InventoryAggregator"}))) input), :shape "InventoryAggregatorList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-compliance-execution-type [input] #:http.request.field{:value input, :shape "ComplianceExecutionType"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-document-permission-type [input] #:http.request.field{:value (clojure.core/get {"Share" "Share", :share "Share"} input), :shape "DocumentPermissionType"})

(clojure.core/defn- ser-schedule-expression [input] #:http.request.field{:value input, :shape "ScheduleExpression"})

(clojure.core/defn- ser-resource-type-for-tagging [input] #:http.request.field{:value (clojure.core/get {:managed-instance "ManagedInstance", :maintenance-window "MaintenanceWindow", "PatchBaseline" "PatchBaseline", "MaintenanceWindow" "MaintenanceWindow", :document "Document", "Parameter" "Parameter", :patch-baseline "PatchBaseline", "Document" "Document", "ManagedInstance" "ManagedInstance", :parameter "Parameter"} input), :shape "ResourceTypeForTagging"})

(clojure.core/defn- ser-document-version-number [input] #:http.request.field{:value input, :shape "DocumentVersionNumber"})

(clojure.core/defn- ser-command-id [input] #:http.request.field{:value input, :shape "CommandId"})

(clojure.core/defn- ser-patch-source-name [input] #:http.request.field{:value input, :shape "PatchSourceName"})

(clojure.core/defn- ser-inventory-item-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-item-entry coll) #:http.request.field{:shape "InventoryItemEntry"}))) input), :shape "InventoryItemEntryList", :type "list", :max 10000, :min 0})

(clojure.core/defn- ser-association-status-name [input] #:http.request.field{:value (clojure.core/get {"Pending" "Pending", :pending "Pending", "Success" "Success", :success "Success", "Failed" "Failed", :failed "Failed"} input), :shape "AssociationStatusName"})

(clojure.core/defn- ser-command-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-command-filter-key (:key input)) #:http.request.field{:name "key", :shape "CommandFilterKey"}) (clojure.core/into (ser-command-filter-value (:value input)) #:http.request.field{:name "value", :shape "CommandFilterValue"})], :shape "CommandFilter", :type "structure"}))

(clojure.core/defn- ser-session-filter-value [input] #:http.request.field{:value input, :shape "SessionFilterValue"})

(clojure.core/defn- ser-maintenance-window-filter-value [input] #:http.request.field{:value input, :shape "MaintenanceWindowFilterValue"})

(clojure.core/defn- ser-resource-data-sync-name [input] #:http.request.field{:value input, :shape "ResourceDataSyncName"})

(clojure.core/defn- ser-patch-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-rule coll) #:http.request.field{:shape "PatchRule"}))) input), :shape "PatchRuleList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-owner-information [input] #:http.request.field{:value input, :shape "OwnerInformation"})

(clojure.core/defn- ser-describe-activations-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-describe-activations-filter coll) #:http.request.field{:shape "DescribeActivationsFilter"}))) input), :shape "DescribeActivationsFilterList", :type "list"})

(clojure.core/defn- ser-maintenance-window-string-date-time [input] #:http.request.field{:value input, :shape "MaintenanceWindowStringDateTime"})

(clojure.core/defn- ser-describe-activations-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DescribeActivationsFilter", :type "structure"} (clojure.core/contains? input :filter-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-activations-filter-keys (input :filter-key)) #:http.request.field{:name "FilterKey", :shape "DescribeActivationsFilterKeys"})) (clojure.core/contains? input :filter-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :filter-values)) #:http.request.field{:name "FilterValues", :shape "StringList"}))))

(clojure.core/defn- ser-s-3-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3OutputLocation", :type "structure"} (clojure.core/contains? input :output-s-3-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-region (input :output-s-3-region)) #:http.request.field{:name "OutputS3Region", :shape "S3Region"})) (clojure.core/contains? input :output-s-3-bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket-name (input :output-s-3-bucket-name)) #:http.request.field{:name "OutputS3BucketName", :shape "S3BucketName"})) (clojure.core/contains? input :output-s-3-key-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :output-s-3-key-prefix)) #:http.request.field{:name "OutputS3KeyPrefix", :shape "S3KeyPrefix"}))))

(clojure.core/defn- ser-automation-parameter-value [input] #:http.request.field{:value input, :shape "AutomationParameterValue"})

(clojure.core/defn- ser-patch-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-filter-value coll) #:http.request.field{:shape "PatchFilterValue"}))) input), :shape "PatchFilterValueList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-create-association-batch-request-entries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-create-association-batch-request-entry coll) #:http.request.field{:shape "CreateAssociationBatchRequestEntry"}))) input), :shape "CreateAssociationBatchRequestEntries", :type "list", :min 1})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-maintenance-window-schedule [input] #:http.request.field{:value input, :shape "MaintenanceWindowSchedule"})

(clojure.core/defn- ser-inventory-item-type-name [input] #:http.request.field{:value input, :shape "InventoryItemTypeName"})

(clojure.core/defn- ser-result-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-result-attribute coll) #:http.request.field{:shape "ResultAttribute"}))) input), :shape "ResultAttributeList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-document-key-values-filter-key [input] #:http.request.field{:value input, :shape "DocumentKeyValuesFilterKey"})

(clojure.core/defn- ser-maintenance-window-task-invocation-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowTaskInvocationParameters", :type "structure"} (clojure.core/contains? input :run-command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-run-command-parameters (input :run-command)) #:http.request.field{:name "RunCommand", :shape "MaintenanceWindowRunCommandParameters"})) (clojure.core/contains? input :automation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-automation-parameters (input :automation)) #:http.request.field{:name "Automation", :shape "MaintenanceWindowAutomationParameters"})) (clojure.core/contains? input :step-functions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-step-functions-parameters (input :step-functions)) #:http.request.field{:name "StepFunctions", :shape "MaintenanceWindowStepFunctionsParameters"})) (clojure.core/contains? input :lambda) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-lambda-parameters (input :lambda)) #:http.request.field{:name "Lambda", :shape "MaintenanceWindowLambdaParameters"}))))

(clojure.core/defn- ser-step-execution-filter-key [input] #:http.request.field{:value (clojure.core/get {:step-execution-status "StepExecutionStatus", "StartTimeBefore" "StartTimeBefore", "StepExecutionStatus" "StepExecutionStatus", "StepExecutionId" "StepExecutionId", :step-execution-id "StepExecutionId", :start-time-before "StartTimeBefore", "StartTimeAfter" "StartTimeAfter", :step-name "StepName", "StepName" "StepName", :action "Action", "Action" "Action", :start-time-after "StartTimeAfter"} input), :shape "StepExecutionFilterKey"})

(clojure.core/defn- ser-document-name [input] #:http.request.field{:value input, :shape "DocumentName"})

(clojure.core/defn- ser-compliance-item-content-hash [input] #:http.request.field{:value input, :shape "ComplianceItemContentHash"})

(clojure.core/defn- ser-maintenance-window-step-functions-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowStepFunctionsParameters", :type "structure"} (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-step-functions-input (input :input)) #:http.request.field{:name "Input", :shape "MaintenanceWindowStepFunctionsInput"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-step-functions-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowStepFunctionsName"}))))

(clojure.core/defn- ser-patch-filter-value [input] #:http.request.field{:value input, :shape "PatchFilterValue"})

(clojure.core/defn- ser-maintenance-window-task-type [input] #:http.request.field{:value (clojure.core/get {"RUN_COMMAND" "RUN_COMMAND", :run-command "RUN_COMMAND", "AUTOMATION" "AUTOMATION", :automation "AUTOMATION", "STEP_FUNCTIONS" "STEP_FUNCTIONS", :step-functions "STEP_FUNCTIONS", "LAMBDA" "LAMBDA", :lambda "LAMBDA"} input), :shape "MaintenanceWindowTaskType"})

(clojure.core/defn- ser-maintenance-window-allow-unassociated-targets [input] #:http.request.field{:value input, :shape "MaintenanceWindowAllowUnassociatedTargets"})

(clojure.core/defn- ser-session-manager-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-session-manager-parameter-name k) #:http.request.field{:map-info "key", :shape "SessionManagerParameterName"}) (clojure.core/into (ser-session-manager-parameter-value-list v) #:http.request.field{:map-info "value", :shape "SessionManagerParameterValueList"})])) input), :shape "SessionManagerParameters", :type "map"})

(clojure.core/defn- ser-inventory-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-inventory-item-type-name (:type-name input)) #:http.request.field{:name "TypeName", :shape "InventoryItemTypeName"}) (clojure.core/into (ser-inventory-item-schema-version (:schema-version input)) #:http.request.field{:name "SchemaVersion", :shape "InventoryItemSchemaVersion"}) (clojure.core/into (ser-inventory-item-capture-time (:capture-time input)) #:http.request.field{:name "CaptureTime", :shape "InventoryItemCaptureTime"})], :shape "InventoryItem", :type "structure"} (clojure.core/contains? input :content-hash) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-item-content-hash (input :content-hash)) #:http.request.field{:name "ContentHash", :shape "InventoryItemContentHash"})) (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-item-entry-list (input :content)) #:http.request.field{:name "Content", :shape "InventoryItemEntryList"})) (clojure.core/contains? input :context) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-item-content-context (input :context)) #:http.request.field{:name "Context", :shape "InventoryItemContentContext"}))))

(clojure.core/defn- ser-command-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-command-filter coll) #:http.request.field{:shape "CommandFilter"}))) input), :shape "CommandFilterList", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-inventory-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-group coll) #:http.request.field{:shape "InventoryGroup"}))) input), :shape "InventoryGroupList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-document-version [input] #:http.request.field{:value input, :shape "DocumentVersion"})

(clojure.core/defn- ser-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Target", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-key (input :key)) #:http.request.field{:name "Key", :shape "TargetKey"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-values (input :values)) #:http.request.field{:name "Values", :shape "TargetValues"}))))

(clojure.core/defn- ser-document-hash-type [input] #:http.request.field{:value (clojure.core/get {"Sha256" "Sha256", :sha-256 "Sha256", "Sha1" "Sha1", :sha-1 "Sha1"} input), :shape "DocumentHashType"})

(clojure.core/defn- ser-session-filter-key [input] #:http.request.field{:value (clojure.core/get {"InvokedBefore" "InvokedBefore", "InvokedAfter" "InvokedAfter", "Status" "Status", :invoked-before "InvokedBefore", :invoked-after "InvokedAfter", :status "Status", "Owner" "Owner", :target "Target", "Target" "Target", :owner "Owner"} input), :shape "SessionFilterKey"})

(clojure.core/defn- ser-maintenance-window-filter-key [input] #:http.request.field{:value input, :shape "MaintenanceWindowFilterKey"})

(clojure.core/defn- ser-document-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-document-filter-key (:key input)) #:http.request.field{:name "key", :shape "DocumentFilterKey"}) (clojure.core/into (ser-document-filter-value (:value input)) #:http.request.field{:name "value", :shape "DocumentFilterValue"})], :shape "DocumentFilter", :type "structure"}))

(clojure.core/defn- ser-session-manager-parameter-value [input] #:http.request.field{:value input, :shape "SessionManagerParameterValue"})

(clojure.core/defn- ser-describe-activations-filter-keys [input] #:http.request.field{:value (clojure.core/get {"ActivationIds" "ActivationIds", :activation-ids "ActivationIds", "DefaultInstanceName" "DefaultInstanceName", :default-instance-name "DefaultInstanceName", "IamRole" "IamRole", :iam-role "IamRole"} input), :shape "DescribeActivationsFilterKeys"})

(clojure.core/defn- ser-maintenance-window-timezone [input] #:http.request.field{:value input, :shape "MaintenanceWindowTimezone"})

(clojure.core/defn- ser-activation-description [input] #:http.request.field{:value input, :shape "ActivationDescription"})

(clojure.core/defn- ser-is-sub-type-schema [input] #:http.request.field{:value input, :shape "IsSubTypeSchema"})

(clojure.core/defn- ser-compliance-filter-value [input] #:http.request.field{:value input, :shape "ComplianceFilterValue"})

(clojure.core/defn- ser-ps-parameter-name [input] #:http.request.field{:value input, :shape "PSParameterName"})

(clojure.core/defn- ser-instance-association-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceAssociationOutputLocation", :type "structure"} (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-output-location (input :s-3-location)) #:http.request.field{:name "S3Location", :shape "S3OutputLocation"}))))

(clojure.core/defn- ser-session-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-session-filter-key (:key input)) #:http.request.field{:name "key", :shape "SessionFilterKey"}) (clojure.core/into (ser-session-filter-value (:value input)) #:http.request.field{:name "value", :shape "SessionFilterValue"})], :shape "SessionFilter", :type "structure"}))

(clojure.core/defn- ser-maintenance-window-automation-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowAutomationParameters", :type "structure"} (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automation-parameter-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "AutomationParameterMap"}))))

(clojure.core/defn- ser-compliance-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compliance-resource-id coll) #:http.request.field{:shape "ComplianceResourceId"}))) input), :shape "ComplianceResourceIdList", :type "list", :min 1})

(clojure.core/defn- ser-inventory-item-capture-time [input] #:http.request.field{:value input, :shape "InventoryItemCaptureTime"})

(clojure.core/defn- ser-association-execution-targets-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-association-execution-targets-filter-key (:key input)) #:http.request.field{:name "Key", :shape "AssociationExecutionTargetsFilterKey"}) (clojure.core/into (ser-association-execution-targets-filter-value (:value input)) #:http.request.field{:name "Value", :shape "AssociationExecutionTargetsFilterValue"})], :shape "AssociationExecutionTargetsFilter", :type "structure"}))

(clojure.core/defn- ser-baseline-description [input] #:http.request.field{:value input, :shape "BaselineDescription"})

(clojure.core/defn- ser-maintenance-window-execution-id [input] #:http.request.field{:value input, :shape "MaintenanceWindowExecutionId"})

(clojure.core/defn- ser-compliance-query-operator-type [input] #:http.request.field{:value (clojure.core/get {"BEGIN_WITH" "BEGIN_WITH", "GREATER_THAN" "GREATER_THAN", :less-than "LESS_THAN", :greater-than "GREATER_THAN", "LESS_THAN" "LESS_THAN", :not-equal "NOT_EQUAL", :begin-with "BEGIN_WITH", "EQUAL" "EQUAL", :equal "EQUAL", "NOT_EQUAL" "NOT_EQUAL"} input), :shape "ComplianceQueryOperatorType"})

(clojure.core/defn- ser-automation-execution-id [input] #:http.request.field{:value input, :shape "AutomationExecutionId"})

(clojure.core/defn- ser-target-value [input] #:http.request.field{:value input, :shape "TargetValue"})

(clojure.core/defn- ser-patch-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-patch-filter coll) #:http.request.field{:shape "PatchFilter"}))) input), :shape "PatchFilterList", :type "list", :max 4, :min 0})

(clojure.core/defn- ser-inventory-deletion-id [input] #:http.request.field{:value input, :shape "InventoryDeletionId"})

(clojure.core/defn- ser-patch-source-product [input] #:http.request.field{:value input, :shape "PatchSourceProduct"})

(clojure.core/defn- ser-instance-patch-state-operator-type [input] #:http.request.field{:value (clojure.core/get {"Equal" "Equal", :equal "Equal", "NotEqual" "NotEqual", :not-equal "NotEqual", "LessThan" "LessThan", :less-than "LessThan", "GreaterThan" "GreaterThan", :greater-than "GreaterThan"} input), :shape "InstancePatchStateOperatorType"})

(clojure.core/defn- ser-maintenance-window-task-parameter-value-expression [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MaintenanceWindowTaskParameterValueExpression", :type "structure", :sensitive true} (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-parameter-value-list (input :values)) #:http.request.field{:name "Values", :shape "MaintenanceWindowTaskParameterValueList"}))))

(clojure.core/defn- ser-target-map-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-map-value coll) #:http.request.field{:shape "TargetMapValue"}))) input), :shape "TargetMapValueList", :type "list", :max 25, :min 0})

(clojure.core/defn- ser-target-key [input] #:http.request.field{:value input, :shape "TargetKey"})

(clojure.core/defn- ser-automation-parameter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-automation-parameter-value coll) #:http.request.field{:shape "AutomationParameterValue"}))) input), :shape "AutomationParameterValueList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-compliance-item-details [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "ComplianceItemDetails", :type "map"})

(clojure.core/defn- ser-maintenance-window-task-parameter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-maintenance-window-task-parameter-value coll) #:http.request.field{:shape "MaintenanceWindowTaskParameterValue"}))) input), :shape "MaintenanceWindowTaskParameterValueList", :type "list", :sensitive true})

(clojure.core/defn- ser-instance-information-string-filter-key [input] #:http.request.field{:value input, :shape "InstanceInformationStringFilterKey"})

(clojure.core/defn- ser-max-results-ec-2-compatible [input] #:http.request.field{:value input, :shape "MaxResultsEC2Compatible"})

(clojure.core/defn- ser-association-execution-targets-filter-key [input] #:http.request.field{:value (clojure.core/get {"Status" "Status", :status "Status", "ResourceId" "ResourceId", :resource-id "ResourceId", "ResourceType" "ResourceType", :resource-type "ResourceType"} input), :shape "AssociationExecutionTargetsFilterKey"})

(clojure.core/defn- ser-operating-system [input] #:http.request.field{:value (clojure.core/get {"AMAZON_LINUX_2" "AMAZON_LINUX_2", :windows "WINDOWS", "WINDOWS" "WINDOWS", "CENTOS" "CENTOS", :amazon-linux-2 "AMAZON_LINUX_2", :suse "SUSE", :centos "CENTOS", "REDHAT_ENTERPRISE_LINUX" "REDHAT_ENTERPRISE_LINUX", "AMAZON_LINUX" "AMAZON_LINUX", "UBUNTU" "UBUNTU", "SUSE" "SUSE", :redhat-enterprise-linux "REDHAT_ENTERPRISE_LINUX", :amazon-linux "AMAZON_LINUX", :ubuntu "UBUNTU"} input), :shape "OperatingSystem"})

(clojure.core/defn- ser-association-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-association-filter-key (:key input)) #:http.request.field{:name "key", :shape "AssociationFilterKey"}) (clojure.core/into (ser-association-filter-value (:value input)) #:http.request.field{:name "value", :shape "AssociationFilterValue"})], :shape "AssociationFilter", :type "structure"}))

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-notification-event-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notification-event coll) #:http.request.field{:shape "NotificationEvent"}))) input), :shape "NotificationEventList", :type "list"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-registration-limit [input] #:http.request.field{:value input, :shape "RegistrationLimit"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- ser-association-filter-operator-type [input] #:http.request.field{:value (clojure.core/get {"EQUAL" "EQUAL", :equal "EQUAL", "LESS_THAN" "LESS_THAN", :less-than "LESS_THAN", "GREATER_THAN" "GREATER_THAN", :greater-than "GREATER_THAN"} input), :shape "AssociationFilterOperatorType"})

(clojure.core/defn- ser-date-time [input] #:http.request.field{:value input, :shape "DateTime"})

(clojure.core/defn- ser-target-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-value coll) #:http.request.field{:shape "TargetValue"}))) input), :shape "TargetValues", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-maintenance-window-task-parameter-value [input] #:http.request.field{:value input, :shape "MaintenanceWindowTaskParameterValue"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-maintenance-window-resource-type [input] #:http.request.field{:value (clojure.core/get {"INSTANCE" "INSTANCE", :instance "INSTANCE"} input), :shape "MaintenanceWindowResourceType"})

(clojure.core/defn- req-update-maintenance-window-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-task-id (input :window-task-id)) #:http.request.field{:name "WindowTaskId", :shape "MaintenanceWindowTaskId"})]} (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "ServiceRole"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-priority (input :priority)) #:http.request.field{:name "Priority", :shape "MaintenanceWindowTaskPriority", :box true})) (clojure.core/contains? input :max-concurrency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrency (input :max-concurrency)) #:http.request.field{:name "MaxConcurrency", :shape "MaxConcurrency"})) (clojure.core/contains? input :logging-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-info (input :logging-info)) #:http.request.field{:name "LoggingInfo", :shape "LoggingInfo"})) (clojure.core/contains? input :task-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "MaintenanceWindowTaskArn"})) (clojure.core/contains? input :max-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-errors (input :max-errors)) #:http.request.field{:name "MaxErrors", :shape "MaxErrors"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :replace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :replace)) #:http.request.field{:name "Replace", :shape "Boolean", :box true})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :task-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-parameters (input :task-parameters)) #:http.request.field{:name "TaskParameters", :shape "MaintenanceWindowTaskParameters"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"})) (clojure.core/contains? input :task-invocation-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-invocation-parameters (input :task-invocation-parameters)) #:http.request.field{:name "TaskInvocationParameters", :shape "MaintenanceWindowTaskInvocationParameters"}))))

(clojure.core/defn- req-get-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"})]}))

(clojure.core/defn- req-get-deployable-patch-snapshot-for-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}) (clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})]}))

(clojure.core/defn- req-describe-association-execution-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"}) (clojure.core/into (ser-association-execution-id (input :execution-id)) #:http.request.field{:name "ExecutionId", :shape "AssociationExecutionId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-execution-targets-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "AssociationExecutionTargetsFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-maintenance-window-executions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-register-task-with-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"}) (clojure.core/into (ser-maintenance-window-task-arn (input :task-arn)) #:http.request.field{:name "TaskArn", :shape "MaintenanceWindowTaskArn"}) (clojure.core/into (ser-maintenance-window-task-type (input :task-type)) #:http.request.field{:name "TaskType", :shape "MaintenanceWindowTaskType"}) (clojure.core/into (ser-max-concurrency (input :max-concurrency)) #:http.request.field{:name "MaxConcurrency", :shape "MaxConcurrency"}) (clojure.core/into (ser-max-errors (input :max-errors)) #:http.request.field{:name "MaxErrors", :shape "MaxErrors"})]} (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "ServiceRole"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-priority (input :priority)) #:http.request.field{:name "Priority", :shape "MaintenanceWindowTaskPriority", :box true})) (clojure.core/contains? input :logging-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-info (input :logging-info)) #:http.request.field{:name "LoggingInfo", :shape "LoggingInfo"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :task-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-parameters (input :task-parameters)) #:http.request.field{:name "TaskParameters", :shape "MaintenanceWindowTaskParameters"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"})) (clojure.core/contains? input :task-invocation-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-task-invocation-parameters (input :task-invocation-parameters)) #:http.request.field{:name "TaskInvocationParameters", :shape "MaintenanceWindowTaskInvocationParameters"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true}))))

(clojure.core/defn- req-start-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-session-target (input :target)) #:http.request.field{:name "Target", :shape "SessionTarget"})]} (clojure.core/contains? input :document-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-arn (input :document-name)) #:http.request.field{:name "DocumentName", :shape "DocumentARN"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-manager-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "SessionManagerParameters"}))))

(clojure.core/defn- req-list-documents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :document-filter-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-filter-list (input :document-filter-list)) #:http.request.field{:name "DocumentFilterList", :shape "DocumentFilterList"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-key-values-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "DocumentKeyValuesFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-parameter-history-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :name)) #:http.request.field{:name "Name", :shape "PSParameterName"})]} (clojure.core/contains? input :with-decryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :with-decryption)) #:http.request.field{:name "WithDecryption", :shape "Boolean", :box true})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-connection-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-session-target (input :target)) #:http.request.field{:name "Target", :shape "SessionTarget"})]}))

(clojure.core/defn- req-get-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-arn (input :name)) #:http.request.field{:name "Name", :shape "DocumentARN"})]} (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :document-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-format (input :document-format)) #:http.request.field{:name "DocumentFormat", :shape "DocumentFormat"}))))

(clojure.core/defn- req-get-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]}))

(clojure.core/defn- req-describe-maintenance-window-execution-tasks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-maintenance-window-execution-task-invocation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"}) (clojure.core/into (ser-maintenance-window-execution-task-id (input :task-id)) #:http.request.field{:name "TaskId", :shape "MaintenanceWindowExecutionTaskId"}) (clojure.core/into (ser-maintenance-window-execution-task-invocation-id (input :invocation-id)) #:http.request.field{:name "InvocationId", :shape "MaintenanceWindowExecutionTaskInvocationId"})]}))

(clojure.core/defn- req-send-automation-signal-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-automation-execution-id (input :automation-execution-id)) #:http.request.field{:name "AutomationExecutionId", :shape "AutomationExecutionId"}) (clojure.core/into (ser-signal-type (input :signal-type)) #:http.request.field{:name "SignalType", :shape "SignalType"})]} (clojure.core/contains? input :payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automation-parameter-map (input :payload)) #:http.request.field{:name "Payload", :shape "AutomationParameterMap"}))))

(clojure.core/defn- req-describe-maintenance-window-schedule-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :window-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "MaintenanceWindowResourceType"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "PatchOrchestratorFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-search-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowSearchMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-deregister-managed-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-managed-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ManagedInstanceId"})]}))

(clojure.core/defn- req-cancel-command-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-command-id (input :command-id)) #:http.request.field{:name "CommandId", :shape "CommandId"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id-list (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIdList"}))))

(clojure.core/defn- req-register-default-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"})]}))

(clojure.core/defn- req-describe-effective-patches-for-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-baseline-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchBaselineMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type-for-tagging (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceTypeForTagging"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-describe-maintenance-window-execution-task-invocations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"}) (clojure.core/into (ser-maintenance-window-execution-task-id (input :task-id)) #:http.request.field{:name "TaskId", :shape "MaintenanceWindowExecutionTaskId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-compliance-summaries-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-string-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "ComplianceStringFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-label-parameter-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :name)) #:http.request.field{:name "Name", :shape "PSParameterName"}) (clojure.core/into (ser-parameter-label-list (input :labels)) #:http.request.field{:name "Labels", :shape "ParameterLabelList"})]} (clojure.core/contains? input :parameter-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ps-parameter-version (input :parameter-version)) #:http.request.field{:name "ParameterVersion", :shape "PSParameterVersion", :box true}))))

(clojure.core/defn- req-describe-patch-group-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-patch-group (input :patch-group)) #:http.request.field{:name "PatchGroup", :shape "PatchGroup"})]}))

(clojure.core/defn- req-get-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :name)) #:http.request.field{:name "Name", :shape "PSParameterName"})]} (clojure.core/contains? input :with-decryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :with-decryption)) #:http.request.field{:name "WithDecryption", :shape "Boolean", :box true}))))

(clojure.core/defn- req-describe-maintenance-window-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]} (clojure.core/contains? input :allow-unassociated-targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-allow-unassociated-targets (input :allow-unassociated-targets)) #:http.request.field{:name "AllowUnassociatedTargets", :shape "MaintenanceWindowAllowUnassociatedTargets", :box true})) (clojure.core/contains? input :end-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-string-date-time (input :end-date)) #:http.request.field{:name "EndDate", :shape "MaintenanceWindowStringDateTime"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "MaintenanceWindowEnabled", :box true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-duration-hours (input :duration)) #:http.request.field{:name "Duration", :shape "MaintenanceWindowDurationHours", :box true})) (clojure.core/contains? input :cutoff) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-cutoff (input :cutoff)) #:http.request.field{:name "Cutoff", :shape "MaintenanceWindowCutoff", :box true})) (clojure.core/contains? input :replace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :replace)) #:http.request.field{:name "Replace", :shape "Boolean", :box true})) (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-schedule (input :schedule)) #:http.request.field{:name "Schedule", :shape "MaintenanceWindowSchedule"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"})) (clojure.core/contains? input :start-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-string-date-time (input :start-date)) #:http.request.field{:name "StartDate", :shape "MaintenanceWindowStringDateTime"})) (clojure.core/contains? input :schedule-timezone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-timezone (input :schedule-timezone)) #:http.request.field{:name "ScheduleTimezone", :shape "MaintenanceWindowTimezone"}))))

(clojure.core/defn- req-create-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-content (input :content)) #:http.request.field{:name "Content", :shape "DocumentContent"}) (clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})]} (clojure.core/contains? input :document-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-type (input :document-type)) #:http.request.field{:name "DocumentType", :shape "DocumentType"})) (clojure.core/contains? input :document-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-format (input :document-format)) #:http.request.field{:name "DocumentFormat", :shape "DocumentFormat"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "TargetType", :shape "TargetType"}))))

(clojure.core/defn- req-delete-resource-data-sync-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-data-sync-name (input :sync-name)) #:http.request.field{:name "SyncName", :shape "ResourceDataSyncName"})]}))

(clojure.core/defn- req-deregister-task-from-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-task-id (input :window-task-id)) #:http.request.field{:name "WindowTaskId", :shape "MaintenanceWindowTaskId"})]}))

(clojure.core/defn- req-describe-maintenance-windows-for-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"}) (clojure.core/into (ser-maintenance-window-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "MaintenanceWindowResourceType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-search-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowSearchMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"}) (clojure.core/into (ser-maintenance-window-schedule (input :schedule)) #:http.request.field{:name "Schedule", :shape "MaintenanceWindowSchedule"}) (clojure.core/into (ser-maintenance-window-duration-hours (input :duration)) #:http.request.field{:name "Duration", :shape "MaintenanceWindowDurationHours"}) (clojure.core/into (ser-maintenance-window-cutoff (input :cutoff)) #:http.request.field{:name "Cutoff", :shape "MaintenanceWindowCutoff"}) (clojure.core/into (ser-maintenance-window-allow-unassociated-targets (input :allow-unassociated-targets)) #:http.request.field{:name "AllowUnassociatedTargets", :shape "MaintenanceWindowAllowUnassociatedTargets"})]} (clojure.core/contains? input :end-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-string-date-time (input :end-date)) #:http.request.field{:name "EndDate", :shape "MaintenanceWindowStringDateTime"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true})) (clojure.core/contains? input :start-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-string-date-time (input :start-date)) #:http.request.field{:name "StartDate", :shape "MaintenanceWindowStringDateTime"})) (clojure.core/contains? input :schedule-timezone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-timezone (input :schedule-timezone)) #:http.request.field{:name "ScheduleTimezone", :shape "MaintenanceWindowTimezone"}))))

(clojure.core/defn- req-describe-document-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"}) (clojure.core/into (ser-document-permission-type (input :permission-type)) #:http.request.field{:name "PermissionType", :shape "DocumentPermissionType"})]}))

(clojure.core/defn- req-describe-maintenance-window-tasks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-list-resource-compliance-summaries-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-string-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "ComplianceStringFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-update-association-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}) (clojure.core/into (ser-association-status (input :association-status)) #:http.request.field{:name "AssociationStatus", :shape "AssociationStatus"})]}))

(clojure.core/defn- req-describe-parameters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "ParametersFilterList"})) (clojure.core/contains? input :parameter-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-string-filter-list (input :parameter-filters)) #:http.request.field{:name "ParameterFilters", :shape "ParameterStringFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-deregister-patch-baseline-for-patch-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"}) (clojure.core/into (ser-patch-group (input :patch-group)) #:http.request.field{:name "PatchGroup", :shape "PatchGroup"})]}))

(clojure.core/defn- req-list-association-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-cancel-maintenance-window-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"})]}))

(clojure.core/defn- req-delete-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"})]}))

(clojure.core/defn- req-list-inventory-entries-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}) (clojure.core/into (ser-inventory-item-type-name (input :type-name)) #:http.request.field{:name "TypeName", :shape "InventoryItemTypeName"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "InventoryFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-list-associations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :association-filter-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-filter-list (input :association-filter-list)) #:http.request.field{:name "AssociationFilterList", :shape "AssociationFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-start-automation-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-arn (input :document-name)) #:http.request.field{:name "DocumentName", :shape "DocumentARN"})]} (clojure.core/contains? input :target-maps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-maps (input :target-maps)) #:http.request.field{:name "TargetMaps", :shape "TargetMaps"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automation-parameter-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "AutomationParameterMap"})) (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-mode (input :mode)) #:http.request.field{:name "Mode", :shape "ExecutionMode"})) (clojure.core/contains? input :max-concurrency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrency (input :max-concurrency)) #:http.request.field{:name "MaxConcurrency", :shape "MaxConcurrency"})) (clojure.core/contains? input :max-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-errors (input :max-errors)) #:http.request.field{:name "MaxErrors", :shape "MaxErrors"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion", :box true})) (clojure.core/contains? input :target-parameter-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automation-parameter-key (input :target-parameter-name)) #:http.request.field{:name "TargetParameterName", :shape "AutomationParameterKey"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "IdempotencyToken"}))))

(clojure.core/defn- req-describe-inventory-deletions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :deletion-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-deletion-id (input :deletion-id)) #:http.request.field{:name "DeletionId", :shape "InventoryDeletionId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-describe-association-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :association-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"})) (clojure.core/contains? input :association-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-version (input :association-version)) #:http.request.field{:name "AssociationVersion", :shape "AssociationVersion"}))))

(clojure.core/defn- req-describe-instance-patches-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "PatchOrchestratorFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchComplianceMaxResults", :box true}))))

(clojure.core/defn- req-create-association-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})]} (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :schedule-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :schedule-expression)) #:http.request.field{:name "ScheduleExpression", :shape "ScheduleExpression"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-association-output-location (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "InstanceAssociationOutputLocation"})) (clojure.core/contains? input :association-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-name (input :association-name)) #:http.request.field{:name "AssociationName", :shape "AssociationName"}))))

(clojure.core/defn- req-describe-automation-step-executions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-automation-execution-id (input :automation-execution-id)) #:http.request.field{:name "AutomationExecutionId", :shape "AutomationExecutionId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-execution-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "StepExecutionFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :reverse-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :reverse-order)) #:http.request.field{:name "ReverseOrder", :shape "Boolean", :box true}))))

(clojure.core/defn- req-put-compliance-items-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-compliance-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ComplianceResourceId"}) (clojure.core/into (ser-compliance-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ComplianceResourceType"}) (clojure.core/into (ser-compliance-type-name (input :compliance-type)) #:http.request.field{:name "ComplianceType", :shape "ComplianceTypeName"}) (clojure.core/into (ser-compliance-execution-summary (input :execution-summary)) #:http.request.field{:name "ExecutionSummary", :shape "ComplianceExecutionSummary"}) (clojure.core/into (ser-compliance-item-entry-list (input :items)) #:http.request.field{:name "Items", :shape "ComplianceItemEntryList"})]} (clojure.core/contains? input :item-content-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-item-content-hash (input :item-content-hash)) #:http.request.field{:name "ItemContentHash", :shape "ComplianceItemContentHash"}))))

(clojure.core/defn- req-update-document-default-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"}) (clojure.core/into (ser-document-version-number (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersionNumber"})]}))

(clojure.core/defn- req-update-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"})]} (clojure.core/contains? input :rejected-patches-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-action (input :rejected-patches-action)) #:http.request.field{:name "RejectedPatchesAction", :shape "PatchAction"})) (clojure.core/contains? input :global-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-filter-group (input :global-filters)) #:http.request.field{:name "GlobalFilters", :shape "PatchFilterGroup"})) (clojure.core/contains? input :approved-patches) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-id-list (input :approved-patches)) #:http.request.field{:name "ApprovedPatches", :shape "PatchIdList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-baseline-description (input :description)) #:http.request.field{:name "Description", :shape "BaselineDescription"})) (clojure.core/contains? input :approved-patches-enable-non-security) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :approved-patches-enable-non-security)) #:http.request.field{:name "ApprovedPatchesEnableNonSecurity", :shape "Boolean", :box true})) (clojure.core/contains? input :replace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :replace)) #:http.request.field{:name "Replace", :shape "Boolean", :box true})) (clojure.core/contains? input :approval-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-rule-group (input :approval-rules)) #:http.request.field{:name "ApprovalRules", :shape "PatchRuleGroup"})) (clojure.core/contains? input :approved-patches-compliance-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-level (input :approved-patches-compliance-level)) #:http.request.field{:name "ApprovedPatchesComplianceLevel", :shape "PatchComplianceLevel"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-baseline-name (input :name)) #:http.request.field{:name "Name", :shape "BaselineName"})) (clojure.core/contains? input :sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-source-list (input :sources)) #:http.request.field{:name "Sources", :shape "PatchSourceList"})) (clojure.core/contains? input :rejected-patches) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-id-list (input :rejected-patches)) #:http.request.field{:name "RejectedPatches", :shape "PatchIdList"}))))

(clojure.core/defn- req-update-managed-instance-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-managed-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ManagedInstanceId"}) (clojure.core/into (ser-iam-role (input :iam-role)) #:http.request.field{:name "IamRole", :shape "IamRole"})]}))

(clojure.core/defn- req-list-document-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-modify-document-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"}) (clojure.core/into (ser-document-permission-type (input :permission-type)) #:http.request.field{:name "PermissionType", :shape "DocumentPermissionType"})]} (clojure.core/contains? input :account-ids-to-add) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids-to-add)) #:http.request.field{:name "AccountIdsToAdd", :shape "AccountIdList"})) (clojure.core/contains? input :account-ids-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids-to-remove)) #:http.request.field{:name "AccountIdsToRemove", :shape "AccountIdList"}))))

(clojure.core/defn- req-list-resource-data-sync-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-get-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parameter-name-list (input :names)) #:http.request.field{:name "Names", :shape "ParameterNameList"})]} (clojure.core/contains? input :with-decryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :with-decryption)) #:http.request.field{:name "WithDecryption", :shape "Boolean", :box true}))))

(clojure.core/defn- req-put-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :name)) #:http.request.field{:name "Name", :shape "PSParameterName"}) (clojure.core/into (ser-ps-parameter-value (input :value)) #:http.request.field{:name "Value", :shape "PSParameterValue"}) (clojure.core/into (ser-parameter-type (input :type)) #:http.request.field{:name "Type", :shape "ParameterType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-description (input :description)) #:http.request.field{:name "Description", :shape "ParameterDescription"})) (clojure.core/contains? input :key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key-id (input :key-id)) #:http.request.field{:name "KeyId", :shape "ParameterKeyId"})) (clojure.core/contains? input :overwrite) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :overwrite)) #:http.request.field{:name "Overwrite", :shape "Boolean", :box true})) (clojure.core/contains? input :allowed-pattern) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-pattern (input :allowed-pattern)) #:http.request.field{:name "AllowedPattern", :shape "AllowedPattern"}))))

(clojure.core/defn- req-describe-sessions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-session-state (input :state)) #:http.request.field{:name "State", :shape "SessionState"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "SessionMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "SessionFilterList"}))))

(clojure.core/defn- req-deregister-target-from-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-target-id (input :window-target-id)) #:http.request.field{:name "WindowTargetId", :shape "MaintenanceWindowTargetId"})]} (clojure.core/contains? input :safe) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :safe)) #:http.request.field{:name "Safe", :shape "Boolean", :box true}))))

(clojure.core/defn- req-list-commands-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :command-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-id (input :command-id)) #:http.request.field{:name "CommandId", :shape "CommandId"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "CommandMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "CommandFilterList"}))))

(clojure.core/defn- req-get-automation-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-automation-execution-id (input :automation-execution-id)) #:http.request.field{:name "AutomationExecutionId", :shape "AutomationExecutionId"})]}))

(clojure.core/defn- req-get-command-invocation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-command-id (input :command-id)) #:http.request.field{:name "CommandId", :shape "CommandId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]} (clojure.core/contains? input :plugin-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-plugin-name (input :plugin-name)) #:http.request.field{:name "PluginName", :shape "CommandPluginName"}))))

(clojure.core/defn- req-update-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-content (input :content)) #:http.request.field{:name "Content", :shape "DocumentContent"}) (clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})]} (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :document-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-format (input :document-format)) #:http.request.field{:name "DocumentFormat", :shape "DocumentFormat"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "TargetType", :shape "TargetType"}))))

(clojure.core/defn- req-delete-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"})]}))

(clojure.core/defn- req-list-command-invocations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :command-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-id (input :command-id)) #:http.request.field{:name "CommandId", :shape "CommandId"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "CommandMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-command-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "CommandFilterList"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :details)) #:http.request.field{:name "Details", :shape "Boolean"}))))

(clojure.core/defn- req-describe-automation-executions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automation-execution-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "AutomationExecutionFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-resource-data-sync-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-data-sync-name (input :sync-name)) #:http.request.field{:name "SyncName", :shape "ResourceDataSyncName"}) (clojure.core/into (ser-resource-data-sync-s-3-destination (input :s-3-destination)) #:http.request.field{:name "S3Destination", :shape "ResourceDataSyncS3Destination"})]}))

(clojure.core/defn- req-describe-instance-information-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-information-filter-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-information-filter-list (input :instance-information-filter-list)) #:http.request.field{:name "InstanceInformationFilterList", :shape "InstanceInformationFilterList"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-information-string-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "InstanceInformationStringFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-ec-2-compatible (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsEC2Compatible", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-maintenance-windows-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "MaintenanceWindowFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaintenanceWindowMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-activation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-activation-id (input :activation-id)) #:http.request.field{:name "ActivationId", :shape "ActivationId"})]}))

(clojure.core/defn- req-stop-automation-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-automation-execution-id (input :automation-execution-id)) #:http.request.field{:name "AutomationExecutionId", :shape "AutomationExecutionId"})]} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stop-type (input :type)) #:http.request.field{:name "Type", :shape "StopType"}))))

(clojure.core/defn- req-describe-activations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-activations-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "DescribeActivationsFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})]}))

(clojure.core/defn- req-get-maintenance-window-execution-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"}) (clojure.core/into (ser-maintenance-window-execution-task-id (input :task-id)) #:http.request.field{:name "TaskId", :shape "MaintenanceWindowExecutionTaskId"})]}))

(clojure.core/defn- req-delete-parameter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :name)) #:http.request.field{:name "Name", :shape "PSParameterName"})]}))

(clojure.core/defn- req-delete-inventory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-inventory-item-type-name (input :type-name)) #:http.request.field{:name "TypeName", :shape "InventoryItemTypeName"})]} (clojure.core/contains? input :schema-delete-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-schema-delete-option (input :schema-delete-option)) #:http.request.field{:name "SchemaDeleteOption", :shape "InventorySchemaDeleteOption"})) (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dry-run (input :dry-run)) #:http.request.field{:name "DryRun", :shape "DryRun"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true}))))

(clojure.core/defn- req-describe-effective-instance-associations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-effective-instance-association-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "EffectiveInstanceAssociationMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-inventory-schema-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :type-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-item-type-name-filter (input :type-name)) #:http.request.field{:name "TypeName", :shape "InventoryItemTypeNameFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-inventory-schema-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "GetInventorySchemaMaxResults", :box true})) (clojure.core/contains? input :aggregator) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aggregator-schema-only (input :aggregator)) #:http.request.field{:name "Aggregator", :shape "AggregatorSchemaOnly"})) (clojure.core/contains? input :sub-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-sub-type-schema (input :sub-type)) #:http.request.field{:name "SubType", :shape "IsSubTypeSchema", :box true}))))

(clojure.core/defn- req-update-maintenance-window-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-target-id (input :window-target-id)) #:http.request.field{:name "WindowTargetId", :shape "MaintenanceWindowTargetId"})]} (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :owner-information) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-owner-information (input :owner-information)) #:http.request.field{:name "OwnerInformation", :shape "OwnerInformation"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :replace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :replace)) #:http.request.field{:name "Replace", :shape "Boolean", :box true}))))

(clojure.core/defn- req-register-patch-baseline-for-patch-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-id (input :baseline-id)) #:http.request.field{:name "BaselineId", :shape "BaselineId"}) (clojure.core/into (ser-patch-group (input :patch-group)) #:http.request.field{:name "PatchGroup", :shape "PatchGroup"})]}))

(clojure.core/defn- req-remove-tags-from-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type-for-tagging (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceTypeForTagging"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "KeyList"})]}))

(clojure.core/defn- req-describe-instance-patch-states-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id-list (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIdList"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchComplianceMaxResults", :box true}))))

(clojure.core/defn- req-create-association-batch-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-create-association-batch-request-entries (input :entries)) #:http.request.field{:name "Entries", :shape "CreateAssociationBatchRequestEntries"})]}))

(clojure.core/defn- req-describe-instance-patch-states-for-patch-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-patch-group (input :patch-group)) #:http.request.field{:name "PatchGroup", :shape "PatchGroup"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-patch-state-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "InstancePatchStateFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchComplianceMaxResults", :box true}))))

(clojure.core/defn- req-send-command-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-arn (input :document-name)) #:http.request.field{:name "DocumentName", :shape "DocumentARN"})]} (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-role (input :service-role-arn)) #:http.request.field{:name "ServiceRoleArn", :shape "ServiceRole"})) (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id-list (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIdList"})) (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment (input :comment)) #:http.request.field{:name "Comment", :shape "Comment"})) (clojure.core/contains? input :timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout-seconds (input :timeout-seconds)) #:http.request.field{:name "TimeoutSeconds", :shape "TimeoutSeconds", :box true})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :output-s-3-bucket-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket-name (input :output-s-3-bucket-name)) #:http.request.field{:name "OutputS3BucketName", :shape "S3BucketName"})) (clojure.core/contains? input :notification-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-config (input :notification-config)) #:http.request.field{:name "NotificationConfig", :shape "NotificationConfig"})) (clojure.core/contains? input :document-hash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-hash (input :document-hash)) #:http.request.field{:name "DocumentHash", :shape "DocumentHash"})) (clojure.core/contains? input :cloud-watch-output-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-output-config (input :cloud-watch-output-config)) #:http.request.field{:name "CloudWatchOutputConfig", :shape "CloudWatchOutputConfig"})) (clojure.core/contains? input :max-concurrency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrency (input :max-concurrency)) #:http.request.field{:name "MaxConcurrency", :shape "MaxConcurrency"})) (clojure.core/contains? input :max-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-errors (input :max-errors)) #:http.request.field{:name "MaxErrors", :shape "MaxErrors"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :output-s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key-prefix (input :output-s-3-key-prefix)) #:http.request.field{:name "OutputS3KeyPrefix", :shape "S3KeyPrefix"})) (clojure.core/contains? input :output-s-3-region) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-region (input :output-s-3-region)) #:http.request.field{:name "OutputS3Region", :shape "S3Region"})) (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :document-hash-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-hash-type (input :document-hash-type)) #:http.request.field{:name "DocumentHashType", :shape "DocumentHashType"}))))

(clojure.core/defn- req-get-inventory-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "InventoryFilterList"})) (clojure.core/contains? input :aggregators) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-aggregator-list (input :aggregators)) #:http.request.field{:name "Aggregators", :shape "InventoryAggregatorList"})) (clojure.core/contains? input :result-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-attribute-list (input :result-attributes)) #:http.request.field{:name "ResultAttributes", :shape "ResultAttributeList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-update-association-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"})]} (clojure.core/contains? input :association-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-version (input :association-version)) #:http.request.field{:name "AssociationVersion", :shape "AssociationVersion"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "Parameters"})) (clojure.core/contains? input :association-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-name (input :association-name)) #:http.request.field{:name "AssociationName", :shape "AssociationName"})) (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})) (clojure.core/contains? input :schedule-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :schedule-expression)) #:http.request.field{:name "ScheduleExpression", :shape "ScheduleExpression"})) (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-association-output-location (input :output-location)) #:http.request.field{:name "OutputLocation", :shape "InstanceAssociationOutputLocation"}))))

(clojure.core/defn- req-get-maintenance-window-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-execution-id (input :window-execution-id)) #:http.request.field{:name "WindowExecutionId", :shape "MaintenanceWindowExecutionId"})]}))

(clojure.core/defn- req-list-compliance-items-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-string-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "ComplianceStringFilterList"})) (clojure.core/contains? input :resource-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-resource-id-list (input :resource-ids)) #:http.request.field{:name "ResourceIds", :shape "ComplianceResourceIdList"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-resource-type-list (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ComplianceResourceTypeList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-start-associations-once-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-association-id-list (input :association-ids)) #:http.request.field{:name "AssociationIds", :shape "AssociationIdList"})]}))

(clojure.core/defn- req-get-patch-baseline-for-patch-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-patch-group (input :patch-group)) #:http.request.field{:name "PatchGroup", :shape "PatchGroup"})]} (clojure.core/contains? input :operating-system) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operating-system (input :operating-system)) #:http.request.field{:name "OperatingSystem", :shape "OperatingSystem"}))))

(clojure.core/defn- req-delete-association-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-name (input :name)) #:http.request.field{:name "Name", :shape "DocumentName"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})) (clojure.core/contains? input :association-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"}))))

(clojure.core/defn- req-register-target-with-maintenance-window-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "MaintenanceWindowResourceType"}) (clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "Targets", :shape "Targets"})]} (clojure.core/contains? input :owner-information) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-owner-information (input :owner-information)) #:http.request.field{:name "OwnerInformation", :shape "OwnerInformation"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-name (input :name)) #:http.request.field{:name "Name", :shape "MaintenanceWindowName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maintenance-window-description (input :description)) #:http.request.field{:name "Description", :shape "MaintenanceWindowDescription"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true}))))

(clojure.core/defn- req-delete-parameters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parameter-name-list (input :names)) #:http.request.field{:name "Names", :shape "ParameterNameList"})]}))

(clojure.core/defn- req-create-patch-baseline-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-baseline-name (input :name)) #:http.request.field{:name "Name", :shape "BaselineName"})]} (clojure.core/contains? input :rejected-patches-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-action (input :rejected-patches-action)) #:http.request.field{:name "RejectedPatchesAction", :shape "PatchAction"})) (clojure.core/contains? input :global-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-filter-group (input :global-filters)) #:http.request.field{:name "GlobalFilters", :shape "PatchFilterGroup"})) (clojure.core/contains? input :approved-patches) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-id-list (input :approved-patches)) #:http.request.field{:name "ApprovedPatches", :shape "PatchIdList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-baseline-description (input :description)) #:http.request.field{:name "Description", :shape "BaselineDescription"})) (clojure.core/contains? input :approved-patches-enable-non-security) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :approved-patches-enable-non-security)) #:http.request.field{:name "ApprovedPatchesEnableNonSecurity", :shape "Boolean", :box true})) (clojure.core/contains? input :approval-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-rule-group (input :approval-rules)) #:http.request.field{:name "ApprovalRules", :shape "PatchRuleGroup"})) (clojure.core/contains? input :approved-patches-compliance-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-compliance-level (input :approved-patches-compliance-level)) #:http.request.field{:name "ApprovedPatchesComplianceLevel", :shape "PatchComplianceLevel"})) (clojure.core/contains? input :sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-source-list (input :sources)) #:http.request.field{:name "Sources", :shape "PatchSourceList"})) (clojure.core/contains? input :operating-system) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operating-system (input :operating-system)) #:http.request.field{:name "OperatingSystem", :shape "OperatingSystem"})) (clojure.core/contains? input :rejected-patches) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-id-list (input :rejected-patches)) #:http.request.field{:name "RejectedPatches", :shape "PatchIdList"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :idempotency-token true}))))

(clojure.core/defn- req-describe-patch-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-baseline-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchBaselineMaxResults", :box true})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "PatchOrchestratorFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-maintenance-window-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-maintenance-window-id (input :window-id)) #:http.request.field{:name "WindowId", :shape "MaintenanceWindowId"}) (clojure.core/into (ser-maintenance-window-task-id (input :window-task-id)) #:http.request.field{:name "WindowTaskId", :shape "MaintenanceWindowTaskId"})]}))

(clojure.core/defn- req-describe-available-patches-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "PatchOrchestratorFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-baseline-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchBaselineMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-terminate-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-session-id (input :session-id)) #:http.request.field{:name "SessionId", :shape "SessionId"})]}))

(clojure.core/defn- req-describe-instance-associations-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-patch-baselines-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-orchestrator-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "PatchOrchestratorFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-patch-baseline-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PatchBaselineMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-add-tags-to-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type-for-tagging (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceTypeForTagging"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-put-inventory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}) (clojure.core/into (ser-inventory-item-list (input :items)) #:http.request.field{:name "Items", :shape "InventoryItemList"})]}))

(clojure.core/defn- req-resume-session-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-session-id (input :session-id)) #:http.request.field{:name "SessionId", :shape "SessionId"})]}))

(clojure.core/defn- req-describe-association-executions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-association-id (input :association-id)) #:http.request.field{:name "AssociationId", :shape "AssociationId"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-association-execution-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "AssociationExecutionFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-parameters-by-path-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ps-parameter-name (input :path)) #:http.request.field{:name "Path", :shape "PSParameterName"})]} (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :recursive)) #:http.request.field{:name "Recursive", :shape "Boolean", :box true})) (clojure.core/contains? input :parameter-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-string-filter-list (input :parameter-filters)) #:http.request.field{:name "ParameterFilters", :shape "ParameterStringFilterList"})) (clojure.core/contains? input :with-decryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :with-decryption)) #:http.request.field{:name "WithDecryption", :shape "Boolean", :box true})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-parameters-by-path-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "GetParametersByPathMaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-default-patch-baseline-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :operating-system) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operating-system (input :operating-system)) #:http.request.field{:name "OperatingSystem", :shape "OperatingSystem"}))))

(clojure.core/defn- req-create-activation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-iam-role (input :iam-role)) #:http.request.field{:name "IamRole", :shape "IamRole"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activation-description (input :description)) #:http.request.field{:name "Description", :shape "ActivationDescription"})) (clojure.core/contains? input :default-instance-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default-instance-name (input :default-instance-name)) #:http.request.field{:name "DefaultInstanceName", :shape "DefaultInstanceName"})) (clojure.core/contains? input :registration-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registration-limit (input :registration-limit)) #:http.request.field{:name "RegistrationLimit", :shape "RegistrationLimit", :box true})) (clojure.core/contains? input :expiration-date) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expiration-date (input :expiration-date)) #:http.request.field{:name "ExpirationDate", :shape "ExpirationDate"}))))

(clojure.core/defn- req-describe-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-arn (input :name)) #:http.request.field{:name "Name", :shape "DocumentARN"})]} (clojure.core/contains? input :document-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-document-version (input :document-version)) #:http.request.field{:name "DocumentVersion", :shape "DocumentVersion"}))))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-delete-inventory-parameters-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-delete-inventory-parameters-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-delete-inventory-parameters-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/tag-list]))

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/replace (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-request/task-invocation-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-maintenance-window-task-request/window-id :portkey.aws.ssm.update-maintenance-window-task-request/window-task-id] :opt-un [:portkey.aws.ssm.update-maintenance-window-task-request/service-role-arn :portkey.aws.ssm.update-maintenance-window-task-request/priority :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/logging-info :portkey.aws.ssm.update-maintenance-window-task-request/task-arn :portkey.aws.ssm/max-errors :portkey.aws.ssm.update-maintenance-window-task-request/description :portkey.aws.ssm.update-maintenance-window-task-request/replace :portkey.aws.ssm/targets :portkey.aws.ssm.update-maintenance-window-task-request/task-parameters :portkey.aws.ssm.update-maintenance-window-task-request/name :portkey.aws.ssm.update-maintenance-window-task-request/task-invocation-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-automation-status-update-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-automation-status-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-automation-status-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/string-date-time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\-]?\d{4}(?!\d{2}\b))((-?)((0[1-9]|1[0-2])(\3([12]\d|0[1-9]|3[01]))?|W([0-4]\d|5[0-2])(-?[1-7])?|(00[1-9]|0[1-9]\d|[12]\d{2}|3([0-5]\d|6[1-6])))([T\s]((([01]\d|2[0-3])((:?)[0-5]\d)?|24\:?00)([\.,]\d(?!:))?)?(\17[0-5]\d([\.,]\d)?)?([zZ]|([\-])([01]\d|2[0-3]):?([0-5]\d)?)?)?)?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-step-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-step-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.automation-step-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/type (clojure.spec.alpha/and :portkey.aws.ssm/parameter-type))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/last-modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/key-id (clojure.spec.alpha/and :portkey.aws.ssm/parameter-key-id))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/value (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-value))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/description (clojure.spec.alpha/and :portkey.aws.ssm/parameter-description))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/labels (clojure.spec.alpha/and :portkey.aws.ssm/parameter-label-list))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/last-modified-user (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/version (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-version))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-history/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-history (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-history/type :portkey.aws.ssm.parameter-history/last-modified-date :portkey.aws.ssm.parameter-history/key-id :portkey.aws.ssm.parameter-history/value :portkey.aws.ssm/allowed-pattern :portkey.aws.ssm.parameter-history/description :portkey.aws.ssm.parameter-history/labels :portkey.aws.ssm.parameter-history/last-modified-user :portkey.aws.ssm.parameter-history/version :portkey.aws.ssm.parameter-history/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/stop-automation-execution-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-entity/id (clojure.spec.alpha/and :portkey.aws.ssm/inventory-result-entity-id))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-entity/data (clojure.spec.alpha/and :portkey.aws.ssm/inventory-result-item-map))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.inventory-result-entity/id :portkey.aws.ssm.inventory-result-entity/data]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-map (clojure.spec.alpha/map-of :portkey.aws.ssm/target-map-key :portkey.aws.ssm/target-map-value-list))

(clojure.spec.alpha/def :portkey.aws.ssm/create-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-description]))

(clojure.spec.alpha/def :portkey.aws.ssm/command-plugin-output (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2500))))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-type-count-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-type-count-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.compliance-type-count-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.non-compliant-summary/non-compliant-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm/non-compliant-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.non-compliant-summary/non-compliant-count :portkey.aws.ssm/severity-summary]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm/snapshot-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-compliance-data-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-compliance-data))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-result/window-identities (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-identity-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-windows-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-windows-result/window-identities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-execution-targets-request/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-execution-targets-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-targets-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-execution-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/association-id :portkey.aws.ssm.describe-association-execution-targets-request/execution-id] :opt-un [:portkey.aws.ssm.describe-association-execution-targets-request/filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-filter-value-set (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-information-filter-value :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-id :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-activation/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-activation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-activation/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/dry-run clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm/approve-after-days (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-executions-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-executions-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-executions-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-executions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-maintenance-window-executions-request/window-id] :opt-un [:portkey.aws.ssm.describe-maintenance-window-executions-request/filters :portkey.aws.ssm.describe-maintenance-window-executions-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/string-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/string))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-document-content/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-document-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-document-content/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-run-command-parameters/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-run-command-parameters/output-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-run-command-parameters/output-s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.ssm/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-run-command-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-run-command-parameters/service-role-arn :portkey.aws.ssm/comment :portkey.aws.ssm/timeout-seconds :portkey.aws.ssm/parameters :portkey.aws.ssm.maintenance-window-run-command-parameters/output-s-3-bucket-name :portkey.aws.ssm/notification-config :portkey.aws.ssm/document-hash :portkey.aws.ssm.maintenance-window-run-command-parameters/output-s-3-key-prefix :portkey.aws.ssm/document-hash-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-definition-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-definition-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.automation-definition-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/task-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-request/task-invocation-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/register-task-with-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.register-task-with-maintenance-window-request/window-id :portkey.aws.ssm/targets :portkey.aws.ssm.register-task-with-maintenance-window-request/task-arn :portkey.aws.ssm.register-task-with-maintenance-window-request/task-type :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/max-errors] :opt-un [:portkey.aws.ssm.register-task-with-maintenance-window-request/service-role-arn :portkey.aws.ssm.register-task-with-maintenance-window-request/priority :portkey.aws.ssm/logging-info :portkey.aws.ssm.register-task-with-maintenance-window-request/description :portkey.aws.ssm.register-task-with-maintenance-window-request/task-parameters :portkey.aws.ssm.register-task-with-maintenance-window-request/name :portkey.aws.ssm.register-task-with-maintenance-window-request/task-invocation-parameters :portkey.aws.ssm/client-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-version-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-version-info :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-filter-key #{"StartTimeBefore" "ParentExecutionId" :document-name-prefix :parent-execution-id :start-time-before "StartTimeAfter" "CurrentAction" :execution-status "ExecutionId" :current-action :execution-id "ExecutionStatus" "DocumentNamePrefix" :start-time-after})

(clojure.spec.alpha/def :portkey.aws.ssm/output-source-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.ssm/get-parameter-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/parameter]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-value))

(clojure.spec.alpha/def :portkey.aws.ssm.label-parameter-version-result/invalid-labels (clojure.spec.alpha/and :portkey.aws.ssm/parameter-label-list))
(clojure.spec.alpha/def :portkey.aws.ssm/label-parameter-version-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.label-parameter-version-result/invalid-labels]))

(clojure.spec.alpha/def :portkey.aws.ssm/command-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-available-patches-result/patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-available-patches-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-available-patches-result/patches :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-filter-value :min-count 1 :max-count 40))

(clojure.spec.alpha/def :portkey.aws.ssm/association-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"([$]LATEST)|([1-9][0-9]*)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-execution-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-task/service-role-arn :portkey.aws.ssm.maintenance-window-task/window-id :portkey.aws.ssm.maintenance-window-task/type :portkey.aws.ssm.maintenance-window-task/priority :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/logging-info :portkey.aws.ssm.maintenance-window-task/task-arn :portkey.aws.ssm/max-errors :portkey.aws.ssm.maintenance-window-task/description :portkey.aws.ssm/targets :portkey.aws.ssm.maintenance-window-task/window-task-id :portkey.aws.ssm.maintenance-window-task/task-parameters :portkey.aws.ssm.maintenance-window-task/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-maps (clojure.spec.alpha/coll-of :portkey.aws.ssm/target-map :min-count 0 :max-count 300))

(clojure.spec.alpha/def :portkey.aws.ssm/command-invocation-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/command-invocation))

(clojure.spec.alpha/def :portkey.aws.ssm/association-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-severity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/automation-execution-metadata))

(clojure.spec.alpha/def :portkey.aws.ssm.document-version-info/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.document-version-info/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.document-version-info/is-default-version (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/document-version-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-version-info/name :portkey.aws.ssm/document-version :portkey.aws.ssm.document-version-info/created-date :portkey.aws.ssm.document-version-info/is-default-version :portkey.aws.ssm/document-format]))

(clojure.spec.alpha/def :portkey.aws.ssm/service-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm.list-documents-result/document-identifiers (clojure.spec.alpha/and :portkey.aws.ssm/document-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-documents-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-documents-result/document-identifiers :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]{3,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/association-description-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-description))

(clojure.spec.alpha/def :portkey.aws.ssm/command-status #{:timed-out "Failed" "Cancelled" :in-progress "Cancelling" :pending "TimedOut" "Success" :cancelled :success "InProgress" :cancelling "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm/instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^i-(\w{8}|\w{17})$)|(^mi-\w{17}$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-information-filter :min-count 0))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-entry-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-item-entry :min-count 0 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.ssm.start-session-request/target (clojure.spec.alpha/and :portkey.aws.ssm/session-target))
(clojure.spec.alpha/def :portkey.aws.ssm.start-session-request/document-name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.start-session-request/parameters (clojure.spec.alpha/and :portkey.aws.ssm/session-manager-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/start-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.start-session-request/target] :opt-un [:portkey.aws.ssm.start-session-request/document-name :portkey.aws.ssm.start-session-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/update-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-description]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-documents-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/document-key-values-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-documents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/document-filter-list :portkey.aws.ssm.list-documents-request/filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-search-max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ssm.step-execution-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/step-execution-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/step-execution-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.step-execution-filter/key :portkey.aws.ssm.step-execution-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-type-display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameter-history-request/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameter-history-request/with-decryption (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameter-history-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-parameter-history-request/name] :opt-un [:portkey.aws.ssm.get-parameter-history-request/with-decryption :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.max-document-size-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/max-document-size-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.max-document-size-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-result/version (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-version))
(clojure.spec.alpha/def :portkey.aws.ssm/put-parameter-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.put-parameter-result/version]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-connection-status-request/target (clojure.spec.alpha/and :portkey.aws.ssm/session-target))
(clojure.spec.alpha/def :portkey.aws.ssm/get-connection-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-connection-status-request/target] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^aws:[a-zA-Z]{3,25}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-automation-execution-parameters-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-automation-execution-parameters-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-automation-execution-parameters-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-group-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-group))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-automation-step-executions-result/step-executions (clojure.spec.alpha/and :portkey.aws.ssm/step-execution-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-automation-step-executions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-automation-step-executions-result/step-executions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item-entry/id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-id))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item-entry/title (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-title))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item-entry/severity (clojure.spec.alpha/and :portkey.aws.ssm/compliance-severity))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item-entry/status (clojure.spec.alpha/and :portkey.aws.ssm/compliance-status))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item-entry/details (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-details))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.compliance-item-entry/severity :portkey.aws.ssm.compliance-item-entry/status] :opt-un [:portkey.aws.ssm.compliance-item-entry/id :portkey.aws.ssm.compliance-item-entry/title :portkey.aws.ssm.compliance-item-entry/details]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-schedule/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-schedule/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.patch-filter/key :portkey.aws.ssm.patch-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/notification-event #{:timed-out "Failed" "Cancelled" :in-progress "TimedOut" :all "Success" :cancelled :success "InProgress" "All" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/task-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/invocation-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/task-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/task-execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/end-time :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/start-time :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/parameters :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/status :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/status-details :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/window-execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/invocation-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/window-target-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-result/task-type :portkey.aws.ssm/owner-information]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-document-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm/get-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-document-request/name] :opt-un [:portkey.aws.ssm/document-version :portkey.aws.ssm/document-format]))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-information-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/instance-information-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information-filter/value-set (clojure.spec.alpha/and :portkey.aws.ssm/instance-information-filter-value-set))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.instance-information-filter/key :portkey.aws.ssm.instance-information-filter/value-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-executions-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-execution))

(clojure.spec.alpha/def :portkey.aws.ssm/too-many-tags-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-aggregator/expression (clojure.spec.alpha/and :portkey.aws.ssm/inventory-aggregator-expression))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-aggregator/aggregators (clojure.spec.alpha/and :portkey.aws.ssm/inventory-aggregator-list))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-aggregator/groups (clojure.spec.alpha/and :portkey.aws.ssm/inventory-group-list))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-aggregator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.inventory-aggregator/expression :portkey.aws.ssm.inventory-aggregator/aggregators :portkey.aws.ssm.inventory-aggregator/groups]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-command-invocations-result/command-invocations (clojure.spec.alpha/and :portkey.aws.ssm/command-invocation-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-command-invocations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-command-invocations-result/command-invocations :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-maintenance-window-request/window-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-status-infos (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-association-status-info))

(clojure.spec.alpha/def :portkey.aws.ssm.hierarchy-type-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/hierarchy-type-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.hierarchy-type-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-orchestrator-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-orchestrator-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-values))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-orchestrator-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.patch-orchestrator-filter/key :portkey.aws.ssm.patch-orchestrator-filter/values]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-baseline-identity-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-baseline-identity))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-activation-id/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-activation-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-activation-id/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-type #{"StringList" :string-list :string "String" :secure-string "SecureString"})

(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.association-execution-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-query-operator-type #{:exists "NotEqual" :less-than "BeginWith" "Exists" "Equal" "LessThan" :greater-than "GreaterThan" :not-equal :begin-with :equal})

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-string-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/parameter-string-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-string-filter/option (clojure.spec.alpha/and :portkey.aws.ssm/parameter-string-query-option))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-string-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/parameter-string-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.parameter-string-filter/key] :opt-un [:portkey.aws.ssm.parameter-string-filter/option :portkey.aws.ssm.parameter-string-filter/values]))

(clojure.spec.alpha/def :portkey.aws.ssm/create-activation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/activation-id :portkey.aws.ssm/activation-code]))

(clojure.spec.alpha/def :portkey.aws.ssm/s-3-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-classification (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-invalid-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-invalid-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-data-sync-invalid-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-execution-tasks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/window-execution-id] :opt-un [:portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/filters :portkey.aws.ssm.describe-maintenance-window-execution-tasks-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/invocation-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-id))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/window-execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/task-id :portkey.aws.ssm.get-maintenance-window-execution-task-invocation-request/invocation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-option-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-option-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-option-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-result/entities (clojure.spec.alpha/and :portkey.aws.ssm/inventory-result-entity-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-inventory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-inventory-result/entities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-filter-key #{:platform-types "DocumentType" :name :document-type "PlatformTypes" "Owner" "Name" :owner})

(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-result/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-result/schema-version (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-result/capture-time (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-capture-time))
(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-result/entries (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-entry-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-inventory-entries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-inventory-entries-result/type-name :portkey.aws.ssm/instance-id :portkey.aws.ssm.list-inventory-entries-result/schema-version :portkey.aws.ssm.list-inventory-entries-result/capture-time :portkey.aws.ssm.list-inventory-entries-result/entries :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/command-invocation-status #{:timed-out "Failed" "Cancelled" :delayed :in-progress "Cancelling" :pending "TimedOut" "Success" :cancelled "Delayed" :success "InProgress" :cancelling "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm/last-resource-data-sync-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm/association-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm/document-key-values-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-key-values-filter :min-count 0 :max-count 6))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-document-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.target-not-connected/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/target-not-connected (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.target-not-connected/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-source/name (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-name))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-source/products (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-product-list))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-source/configuration (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-configuration))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-source (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.patch-source/name :portkey.aws.ssm.patch-source/products :portkey.aws.ssm.patch-source/configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-string-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-string-filter))

(clojure.spec.alpha/def :portkey.aws.ssm.send-automation-signal-request/payload (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm/send-automation-signal-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/automation-execution-id :portkey.aws.ssm/signal-type] :opt-un [:portkey.aws.ssm.send-automation-signal-request/payload]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-identifier/schema-version (clojure.spec.alpha/and :portkey.aws.ssm/document-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.document-identifier/tags (clojure.spec.alpha/and :portkey.aws.ssm/tag-list))
(clojure.spec.alpha/def :portkey.aws.ssm.document-identifier/platform-types (clojure.spec.alpha/and :portkey.aws.ssm/platform-type-list))
(clojure.spec.alpha/def :portkey.aws.ssm.document-identifier/owner (clojure.spec.alpha/and :portkey.aws.ssm/document-owner))
(clojure.spec.alpha/def :portkey.aws.ssm.document-identifier/name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm/document-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-identifier/schema-version :portkey.aws.ssm/document-type :portkey.aws.ssm/target-type :portkey.aws.ssm.document-identifier/tags :portkey.aws.ssm/document-format :portkey.aws.ssm.document-identifier/platform-types :portkey.aws.ssm.document-identifier/owner :portkey.aws.ssm/document-version :portkey.aws.ssm.document-identifier/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-string-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-information-string-filter :min-count 0))

(clojure.spec.alpha/def :portkey.aws.ssm/command-max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.ssm/association-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-schedule-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-schedule-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-schedule-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-schedule-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-search-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-schedule-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-schedule-request/window-id :portkey.aws.ssm/targets :portkey.aws.ssm.describe-maintenance-window-schedule-request/resource-type :portkey.aws.ssm.describe-maintenance-window-schedule-request/filters :portkey.aws.ssm.describe-maintenance-window-schedule-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-label-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-label :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm.deregister-managed-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.ssm/managed-instance-id))
(clojure.spec.alpha/def :portkey.aws.ssm/deregister-managed-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.deregister-managed-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-filter/type (clojure.spec.alpha/and :portkey.aws.ssm/association-filter-operator-type))
(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.association-execution-filter/key :portkey.aws.ssm.association-execution-filter/value :portkey.aws.ssm.association-execution-filter/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/inventory-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/inventory-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-filter/type (clojure.spec.alpha/and :portkey.aws.ssm/inventory-query-operator-type))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-filter/key :portkey.aws.ssm.inventory-filter/values] :opt-un [:portkey.aws.ssm.inventory-filter/type]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-type-name-filter (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-filter-values (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-filter-value))

(clojure.spec.alpha/def :portkey.aws.ssm/get-parameters-by-path-max-results (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-not-found/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/session-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 96))))

(clojure.spec.alpha/def :portkey.aws.ssm/ps-parameter-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/account-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/account-id :max-count 20))

(clojure.spec.alpha/def :portkey.aws.ssm/session-max-results (clojure.spec.alpha/int-in 1 200))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-identity-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-execution-task-identity))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-orchestrator-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-orchestrator-filter :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm.cancel-command-request/instance-ids (clojure.spec.alpha/and :portkey.aws.ssm/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/cancel-command-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/command-id] :opt-un [:portkey.aws.ssm.cancel-command-request/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-cutoff (clojure.spec.alpha/int-in 0 23))

(clojure.spec.alpha/def :portkey.aws.ssm/timeout-seconds (clojure.spec.alpha/int-in 30 2592000))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-s-3-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-items-result/compliance-items (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-compliance-items-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-compliance-items-result/compliance-items :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/delivery-timed-out-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-summary-item-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-summary-item))

(clojure.spec.alpha/def :portkey.aws.ssm/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/timeout-seconds (clojure.spec.alpha/and :portkey.aws.ssm/long))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/response-code (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/step-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/valid-next-steps (clojure.spec.alpha/and :portkey.aws.ssm/valid-next-step-list))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/outputs (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/response (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/failure-message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/inputs (clojure.spec.alpha/and :portkey.aws.ssm/normal-string-map))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/next-step (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/step-status (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/is-critical (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/step-name (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/overridden-parameters (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/on-failure (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/execution-end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/execution-start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/action (clojure.spec.alpha/and :portkey.aws.ssm/automation-action-name))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/is-end (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.step-execution/max-attempts (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm/step-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.step-execution/timeout-seconds :portkey.aws.ssm.step-execution/response-code :portkey.aws.ssm.step-execution/step-execution-id :portkey.aws.ssm.step-execution/valid-next-steps :portkey.aws.ssm.step-execution/outputs :portkey.aws.ssm.step-execution/response :portkey.aws.ssm.step-execution/failure-message :portkey.aws.ssm.step-execution/inputs :portkey.aws.ssm.step-execution/next-step :portkey.aws.ssm/failure-details :portkey.aws.ssm.step-execution/step-status :portkey.aws.ssm.step-execution/is-critical :portkey.aws.ssm.step-execution/step-name :portkey.aws.ssm.step-execution/overridden-parameters :portkey.aws.ssm.step-execution/on-failure :portkey.aws.ssm.step-execution/execution-end-time :portkey.aws.ssm.step-execution/execution-start-time :portkey.aws.ssm.step-execution/action :portkey.aws.ssm.step-execution/is-end :portkey.aws.ssm.step-execution/max-attempts]))

(clojure.spec.alpha/def :portkey.aws.ssm/product (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-installed-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.parameters-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/parameters-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.parameters-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/parameters-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/parameters-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.parameters-filter/key :portkey.aws.ssm.parameters-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/status-additional-info (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm/completed-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-string-filter))

(clojure.spec.alpha/def :portkey.aws.ssm/register-default-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.document-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/document-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-awskms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:.*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/task-ids (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-result/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-maintenance-window-execution-result/window-execution-id :portkey.aws.ssm.get-maintenance-window-execution-result/task-ids :portkey.aws.ssm.get-maintenance-window-execution-result/status :portkey.aws.ssm.get-maintenance-window-execution-result/status-details :portkey.aws.ssm.get-maintenance-window-execution-result/start-time :portkey.aws.ssm.get-maintenance-window-execution-result/end-time]))

(clojure.spec.alpha/def :portkey.aws.ssm/put-inventory-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/last-resource-data-sync-status #{"Failed" :in-progress :successful "InProgress" "Successful" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm/error-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm/status-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-orchestrator-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-filter-option/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-filter-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-filter-option/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-effective-patches-for-patch-baseline-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id] :opt-un [:portkey.aws.ssm.describe-effective-patches-for-patch-baseline-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/terminate-session-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/session-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-rule/compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-rule/enable-non-security (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/patch-filter-group :portkey.aws.ssm/approve-after-days] :opt-un [:portkey.aws.ssm.patch-rule/compliance-level :portkey.aws.ssm.patch-rule/enable-non-security]))

(clojure.spec.alpha/def :portkey.aws.ssm/execution-mode #{:interactive "Interactive" "Auto" :auto})

(clojure.spec.alpha/def :portkey.aws.ssm.list-tags-for-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/resource-type-for-tagging))
(clojure.spec.alpha/def :portkey.aws.ssm/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.list-tags-for-resource-request/resource-type :portkey.aws.ssm/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-content-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm/duplicate-instance-id (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-orchestrator-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/task-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-result/task-invocation-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-maintenance-window-task-result/service-role-arn :portkey.aws.ssm.get-maintenance-window-task-result/window-id :portkey.aws.ssm.get-maintenance-window-task-result/priority :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/logging-info :portkey.aws.ssm.get-maintenance-window-task-result/task-arn :portkey.aws.ssm/max-errors :portkey.aws.ssm.get-maintenance-window-task-result/description :portkey.aws.ssm/targets :portkey.aws.ssm.get-maintenance-window-task-result/task-type :portkey.aws.ssm.get-maintenance-window-task-result/window-task-id :portkey.aws.ssm.get-maintenance-window-task-result/task-parameters :portkey.aws.ssm.get-maintenance-window-task-result/name :portkey.aws.ssm.get-maintenance-window-task-result/task-invocation-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-status #{"SUCCESS" :timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress "CANCELLING" :skipped-overlapping :pending "SKIPPED_OVERLAPPING" "PENDING" :cancelled :success "FAILED" "CANCELLED" :cancelling :failed})

(clojure.spec.alpha/def :portkey.aws.ssm/key-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/tag-key))

(clojure.spec.alpha/def :portkey.aws.ssm/output-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/output-source-id :portkey.aws.ssm/output-source-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/window-execution-id :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/task-id] :opt-un [:portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/filters :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-entry (clojure.spec.alpha/map-of :portkey.aws.ssm/attribute-name :portkey.aws.ssm/attribute-value))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/type (clojure.spec.alpha/and :portkey.aws.ssm/parameter-type))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/key-id (clojure.spec.alpha/and :portkey.aws.ssm/parameter-key-id))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/last-modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/last-modified-user (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/description (clojure.spec.alpha/and :portkey.aws.ssm/parameter-description))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter-metadata/version (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-version))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-metadata/name :portkey.aws.ssm.parameter-metadata/type :portkey.aws.ssm.parameter-metadata/key-id :portkey.aws.ssm.parameter-metadata/last-modified-date :portkey.aws.ssm.parameter-metadata/last-modified-user :portkey.aws.ssm.parameter-metadata/description :portkey.aws.ssm/allowed-pattern :portkey.aws.ssm.parameter-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-resource-id (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.too-many-updates/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/too-many-updates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.too-many-updates/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-summaries-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/compliance-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-compliance-summaries-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-compliance-summaries-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-targets-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-execution-target))

(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/response-finish-date-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/output-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/status (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-status))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/standard-output-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/output-s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.ssm/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/output-s-3-region (clojure.spec.alpha/and :portkey.aws.ssm/s-3-region))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/output (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-output))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/name (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-name))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/standard-error-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm.command-plugin/response-start-date-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/command-plugin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.command-plugin/response-finish-date-time :portkey.aws.ssm/response-code :portkey.aws.ssm.command-plugin/output-s-3-bucket-name :portkey.aws.ssm.command-plugin/status :portkey.aws.ssm/status-details :portkey.aws.ssm.command-plugin/standard-output-url :portkey.aws.ssm.command-plugin/output-s-3-key-prefix :portkey.aws.ssm.command-plugin/output-s-3-region :portkey.aws.ssm.command-plugin/output :portkey.aws.ssm.command-plugin/name :portkey.aws.ssm.command-plugin/standard-error-url :portkey.aws.ssm.command-plugin/response-start-date-time]))

(clojure.spec.alpha/def :portkey.aws.ssm/cloud-watch-log-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\.\-_/#A-Za-z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/parameters (clojure.spec.alpha/map-of :portkey.aws.ssm/parameter-name :portkey.aws.ssm/parameter-value-list))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/response-code clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.label-parameter-version-request/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.label-parameter-version-request/parameter-version (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-version))
(clojure.spec.alpha/def :portkey.aws.ssm.label-parameter-version-request/labels (clojure.spec.alpha/and :portkey.aws.ssm/parameter-label-list))
(clojure.spec.alpha/def :portkey.aws.ssm/label-parameter-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.label-parameter-version-request/name :portkey.aws.ssm.label-parameter-version-request/labels] :opt-un [:portkey.aws.ssm.label-parameter-version-request/parameter-version]))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-group-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/patch-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameter-request/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameter-request/with-decryption (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-parameter-request/name] :opt-un [:portkey.aws.ssm.get-parameter-request/with-decryption]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-type-name-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-type-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-type-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-invocation-identity-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-execution-task-invocation-identity))

(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-parameter-type/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/unsupported-parameter-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.unsupported-parameter-type/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-output-url (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/s-3-output-url]))

(clojure.spec.alpha/def :portkey.aws.ssm/put-compliance-items-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-s-3-format #{"JsonSerDe" :json-ser-de})

(clojure.spec.alpha/def :portkey.aws.ssm/document-type #{"Automation" :command :policy "Command" :automation "Policy" "Session" :session})

(clojure.spec.alpha/def :portkey.aws.ssm.item-content-mismatch-exception/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.item-content-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/item-content-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.item-content-mismatch-exception/type-name :portkey.aws.ssm.item-content-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameters-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm.association-execution/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution/status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution/detailed-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution/created-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution/last-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/association-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-id :portkey.aws.ssm/association-version :portkey.aws.ssm.association-execution/execution-id :portkey.aws.ssm.association-execution/status :portkey.aws.ssm.association-execution/detailed-status :portkey.aws.ssm.association-execution/created-time :portkey.aws.ssm.association-execution/last-execution-date :portkey.aws.ssm/resource-count-by-status]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-parameter/name (clojure.spec.alpha/and :portkey.aws.ssm/document-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.document-parameter/type (clojure.spec.alpha/and :portkey.aws.ssm/document-parameter-type))
(clojure.spec.alpha/def :portkey.aws.ssm.document-parameter/description (clojure.spec.alpha/and :portkey.aws.ssm/document-parameter-descrption))
(clojure.spec.alpha/def :portkey.aws.ssm.document-parameter/default-value (clojure.spec.alpha/and :portkey.aws.ssm/document-parameter-default-value))
(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-parameter/name :portkey.aws.ssm.document-parameter/type :portkey.aws.ssm.document-parameter/description :portkey.aws.ssm.document-parameter/default-value]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-permission-limit/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/document-permission-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-permission-limit/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/critical-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/high-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/medium-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/low-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/informational-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm.severity-summary/unspecified-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm/severity-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.severity-summary/critical-count :portkey.aws.ssm.severity-summary/high-count :portkey.aws.ssm.severity-summary/medium-count :portkey.aws.ssm.severity-summary/low-count :portkey.aws.ssm.severity-summary/informational-count :portkey.aws.ssm.severity-summary/unspecified-count]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-inventory-schema-max-results (clojure.spec.alpha/int-in 50 200))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/automation-execution-filter :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm.hierarchy-level-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/hierarchy-level-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.hierarchy-level-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity-for-target/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity-for-target/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-identity-for-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-identity-for-target/window-id :portkey.aws.ssm.maintenance-window-identity-for-target/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-deployment-status #{:explicit-approved :explicit-rejected :approved :pending-approval "APPROVED" "PENDING_APPROVAL" "EXPLICIT_APPROVED" "EXPLICIT_REJECTED"})

(clojure.spec.alpha/def :portkey.aws.ssm/session-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/session-filter :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/parameters (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/parent-automation-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/current-step-name (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/executed-by (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/current-action (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/mode (clojure.spec.alpha/and :portkey.aws.ssm/execution-mode))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/outputs (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/failure-message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/step-executions (clojure.spec.alpha/and :portkey.aws.ssm/step-execution-list))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/target (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/target-parameter-name (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/execution-end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/execution-start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution/step-executions-truncated (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/target-maps :portkey.aws.ssm.automation-execution/parameters :portkey.aws.ssm.automation-execution/parent-automation-execution-id :portkey.aws.ssm.automation-execution/current-step-name :portkey.aws.ssm.automation-execution/executed-by :portkey.aws.ssm.automation-execution/current-action :portkey.aws.ssm.automation-execution/mode :portkey.aws.ssm.automation-execution/outputs :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/resolved-targets :portkey.aws.ssm.automation-execution/failure-message :portkey.aws.ssm/max-errors :portkey.aws.ssm.automation-execution/step-executions :portkey.aws.ssm/automation-execution-status :portkey.aws.ssm/targets :portkey.aws.ssm/document-name :portkey.aws.ssm/document-version :portkey.aws.ssm.automation-execution/target :portkey.aws.ssm.automation-execution/target-parameter-name :portkey.aws.ssm.automation-execution/execution-end-time :portkey.aws.ssm.automation-execution/execution-start-time :portkey.aws.ssm/automation-execution-id :portkey.aws.ssm.automation-execution/step-executions-truncated]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-content-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-association-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-for-target-result/window-identities (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-windows-for-target-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-windows-for-target-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-windows-for-target-result/window-identities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameters-filter-key #{"Type" :key-id :name "KeyId" :type "Name"})

(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-inventory-item-context-exception/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-inventory-item-context-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/unsupported-inventory-item-context-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.unsupported-inventory-item-context-exception/type-name :portkey.aws.ssm.unsupported-inventory-item-context-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.cancel-maintenance-window-execution-result/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm/cancel-maintenance-window-execution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.cancel-maintenance-window-execution-result/window-execution-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.create-association-batch-result/successful (clojure.spec.alpha/and :portkey.aws.ssm/association-description-list))
(clojure.spec.alpha/def :portkey.aws.ssm.create-association-batch-result/failed (clojure.spec.alpha/and :portkey.aws.ssm/failed-create-association-list))
(clojure.spec.alpha/def :portkey.aws.ssm/create-association-batch-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.create-association-batch-result/successful :portkey.aws.ssm.create-association-batch-result/failed]))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-group/name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-group-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-group/filters (clojure.spec.alpha/and :portkey.aws.ssm/inventory-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-group (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-group/name :portkey.aws.ssm.inventory-group/filters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-title (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-key-values-filter-values (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-key-values-filter-value))

(clojure.spec.alpha/def :portkey.aws.ssm.document-key-values-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/document-key-values-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.document-key-values-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/document-key-values-filter-values))
(clojure.spec.alpha/def :portkey.aws.ssm/document-key-values-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-key-values-filter/key :portkey.aws.ssm.document-key-values-filter/values]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-targets-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-targets-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-targets-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-maintenance-window-targets-request/window-id] :opt-un [:portkey.aws.ssm.describe-maintenance-window-targets-request/filters :portkey.aws.ssm.describe-maintenance-window-targets-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/allow-unassociated-targets (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-allow-unassociated-targets))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/end-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/enabled (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-enabled))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/duration (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-duration-hours))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/cutoff (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-cutoff))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/replace (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/schedule (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-schedule))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/start-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-request/schedule-timezone (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-timezone))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-maintenance-window-request/window-id] :opt-un [:portkey.aws.ssm.update-maintenance-window-request/allow-unassociated-targets :portkey.aws.ssm.update-maintenance-window-request/end-date :portkey.aws.ssm.update-maintenance-window-request/enabled :portkey.aws.ssm.update-maintenance-window-request/description :portkey.aws.ssm.update-maintenance-window-request/duration :portkey.aws.ssm.update-maintenance-window-request/cutoff :portkey.aws.ssm.update-maintenance-window-request/replace :portkey.aws.ssm.update-maintenance-window-request/schedule :portkey.aws.ssm.update-maintenance-window-request/name :portkey.aws.ssm.update-maintenance-window-request/start-date :portkey.aws.ssm.update-maintenance-window-request/schedule-timezone]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-result/parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-result/invalid-parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-name-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-parameters-result/parameters :portkey.aws.ssm.get-parameters-result/invalid-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(?!^(?i)aws:)(?=^[\p{L}\p{Z}\p{N}_.:/=+\-@]*$).*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-filter/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-filter/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-association))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-execution))

(clojure.spec.alpha/def :portkey.aws.ssm/platform-type #{:windows "Windows" "Linux" :linux})

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-name-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/ps-parameter-name :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-aggregated-association-overview/detailed-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-aggregated-association-overview (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.instance-aggregated-association-overview/detailed-status :portkey.aws.ssm/instance-association-status-aggregated-count]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/allow-unassociated-targets (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-allow-unassociated-targets))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/end-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/enabled (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-enabled))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/next-execution-time (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/duration (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-duration-hours))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/cutoff (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-cutoff))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/schedule (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-schedule))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/start-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-result/schedule-timezone (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-timezone))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-maintenance-window-result/window-id :portkey.aws.ssm.get-maintenance-window-result/allow-unassociated-targets :portkey.aws.ssm.get-maintenance-window-result/end-date :portkey.aws.ssm.get-maintenance-window-result/enabled :portkey.aws.ssm.get-maintenance-window-result/next-execution-time :portkey.aws.ssm.get-maintenance-window-result/description :portkey.aws.ssm.get-maintenance-window-result/duration :portkey.aws.ssm.get-maintenance-window-result/created-date :portkey.aws.ssm.get-maintenance-window-result/cutoff :portkey.aws.ssm.get-maintenance-window-result/modified-date :portkey.aws.ssm.get-maintenance-window-result/schedule :portkey.aws.ssm.get-maintenance-window-result/name :portkey.aws.ssm.get-maintenance-window-result/start-date :portkey.aws.ssm.get-maintenance-window-result/schedule-timezone]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\/[\w\.\-\:\/]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.create-document-request/content (clojure.spec.alpha/and :portkey.aws.ssm/document-content))
(clojure.spec.alpha/def :portkey.aws.ssm.create-document-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/create-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-document-request/content :portkey.aws.ssm.create-document-request/name] :opt-un [:portkey.aws.ssm/document-type :portkey.aws.ssm/document-format :portkey.aws.ssm/target-type]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-s-3-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.delete-resource-data-sync-request/sync-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-name))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-resource-data-sync-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-resource-data-sync-request/sync-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.deregister-task-from-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.deregister-task-from-maintenance-window-request/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm/deregister-task-from-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.deregister-task-from-maintenance-window-request/window-id :portkey.aws.ssm.deregister-task-from-maintenance-window-request/window-task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.total-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/total-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.total-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.target-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/target-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.target-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-deletion-id-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-deletion-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-deletion-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.notification-config/notification-events (clojure.spec.alpha/and :portkey.aws.ssm/notification-event-list))
(clojure.spec.alpha/def :portkey.aws.ssm/notification-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/notification-arn :portkey.aws.ssm.notification-config/notification-events :portkey.aws.ssm/notification-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/log-file (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/parent-automation-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/current-step-name (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/executed-by (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/current-action (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/mode (clojure.spec.alpha/and :portkey.aws.ssm/execution-mode))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/outputs (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/failure-message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/target (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/target-parameter-name (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/execution-end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-metadata/execution-start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/target-maps :portkey.aws.ssm.automation-execution-metadata/log-file :portkey.aws.ssm.automation-execution-metadata/parent-automation-execution-id :portkey.aws.ssm.automation-execution-metadata/current-step-name :portkey.aws.ssm.automation-execution-metadata/executed-by :portkey.aws.ssm.automation-execution-metadata/current-action :portkey.aws.ssm.automation-execution-metadata/mode :portkey.aws.ssm.automation-execution-metadata/outputs :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/resolved-targets :portkey.aws.ssm.automation-execution-metadata/failure-message :portkey.aws.ssm/max-errors :portkey.aws.ssm/automation-execution-status :portkey.aws.ssm/targets :portkey.aws.ssm/document-name :portkey.aws.ssm/document-version :portkey.aws.ssm.automation-execution-metadata/target :portkey.aws.ssm.automation-execution-metadata/target-parameter-name :portkey.aws.ssm.automation-execution-metadata/execution-end-time :portkey.aws.ssm.automation-execution-metadata/execution-start-time :portkey.aws.ssm/automation-execution-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 63))))

(clojure.spec.alpha/def :portkey.aws.ssm/ping-status #{:inactive "Inactive" "ConnectionLost" :online :connection-lost "Online"})

(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-description]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-summary-items (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-deletion-summary-item))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-item))

(clojure.spec.alpha/def :portkey.aws.ssm/document-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-for-target-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-for-target-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-search-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-windows-for-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/targets :portkey.aws.ssm.describe-maintenance-windows-for-target-request/resource-type] :opt-un [:portkey.aws.ssm.describe-maintenance-windows-for-target-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-entity-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-result-entity))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-filter :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-executions-result/window-executions (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-executions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-executions-result/window-executions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-targets-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-execution-targets-filter :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm/parameters-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameters-filter-value :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-schema/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-schema/version (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-schema/attributes (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-attribute-list))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-schema/display-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-type-display-name))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-schema (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-item-schema/type-name :portkey.aws.ssm.inventory-item-schema/attributes] :opt-un [:portkey.aws.ssm.inventory-item-schema/version :portkey.aws.ssm.inventory-item-schema/display-name]))

(clojure.spec.alpha/def :portkey.aws.ssm/iam-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/allow-unassociated-targets (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-allow-unassociated-targets))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/end-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/duration (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-duration-hours))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/cutoff (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-cutoff))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/schedule (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-schedule))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/start-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-request/schedule-timezone (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-timezone))
(clojure.spec.alpha/def :portkey.aws.ssm/create-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-maintenance-window-request/name :portkey.aws.ssm.create-maintenance-window-request/schedule :portkey.aws.ssm.create-maintenance-window-request/duration :portkey.aws.ssm.create-maintenance-window-request/cutoff :portkey.aws.ssm.create-maintenance-window-request/allow-unassociated-targets] :opt-un [:portkey.aws.ssm.create-maintenance-window-request/end-date :portkey.aws.ssm.create-maintenance-window-request/description :portkey.aws.ssm/client-token :portkey.aws.ssm.create-maintenance-window-request/start-date :portkey.aws.ssm.create-maintenance-window-request/schedule-timezone]))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-severity #{"INFORMATIONAL" :unspecified "CRITICAL" :medium "LOW" :high :critical "HIGH" :low "UNSPECIFIED" :informational "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.ssm/session-state #{"Active" :history "History" :active})

(clojure.spec.alpha/def :portkey.aws.ssm/register-patch-baseline-for-patch-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/patch-group]))

(clojure.spec.alpha/def :portkey.aws.ssm/notification-type #{:command :invocation "Command" "Invocation"})

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/deletion-id (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-id))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/deletion-start-time (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-start-time))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/last-status (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-status))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/last-status-message (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-last-status-message))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/deletion-summary (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-summary))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-status-item/last-status-update-time (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-last-status-update-time))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-status-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.inventory-deletion-status-item/deletion-id :portkey.aws.ssm.inventory-deletion-status-item/type-name :portkey.aws.ssm.inventory-deletion-status-item/deletion-start-time :portkey.aws.ssm.inventory-deletion-status-item/last-status :portkey.aws.ssm.inventory-deletion-status-item/last-status-message :portkey.aws.ssm.inventory-deletion-status-item/deletion-summary :portkey.aws.ssm.inventory-deletion-status-item/last-status-update-time]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-lambda-payload clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.ssm.result-attribute/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm/result-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.result-attribute/type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-lambda-qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/title (clojure.spec.alpha/and :portkey.aws.ssm/patch-title))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/kb-id (clojure.spec.alpha/and :portkey.aws.ssm/patch-kb-number))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/classification (clojure.spec.alpha/and :portkey.aws.ssm/patch-classification))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/severity (clojure.spec.alpha/and :portkey.aws.ssm/patch-severity))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/state (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-data-state))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-compliance-data/installed-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-compliance-data (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.patch-compliance-data/title :portkey.aws.ssm.patch-compliance-data/kb-id :portkey.aws.ssm.patch-compliance-data/classification :portkey.aws.ssm.patch-compliance-data/severity :portkey.aws.ssm.patch-compliance-data/state :portkey.aws.ssm.patch-compliance-data/installed-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/target-map-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletions-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-deletion-status-item))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-msrc-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.idempotent-parameter-mismatch/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/idempotent-parameter-mismatch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.idempotent-parameter-mismatch/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-missing-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.scheduled-window-execution/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.scheduled-window-execution/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.scheduled-window-execution/execution-time (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/scheduled-window-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.scheduled-window-execution/window-id :portkey.aws.ssm.scheduled-window-execution/name :portkey.aws.ssm.scheduled-window-execution/execution-time]))

(clojure.spec.alpha/def :portkey.aws.ssm.association-status/date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-status/name (clojure.spec.alpha/and :portkey.aws.ssm/association-status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-status/message (clojure.spec.alpha/and :portkey.aws.ssm/status-message))
(clojure.spec.alpha/def :portkey.aws.ssm.association-status/additional-info (clojure.spec.alpha/and :portkey.aws.ssm/status-additional-info))
(clojure.spec.alpha/def :portkey.aws.ssm/association-status (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.association-status/date :portkey.aws.ssm.association-status/name :portkey.aws.ssm.association-status/message] :opt-un [:portkey.aws.ssm.association-status/additional-info]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-resource-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-document-permission-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-document-permission-request/permission-type (clojure.spec.alpha/and :portkey.aws.ssm/document-permission-type))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-document-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-document-permission-request/name :portkey.aws.ssm.describe-document-permission-request/permission-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/start-automation-execution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/automation-execution-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter-descrption (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-associations-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-association-status-infos :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/snapshot-download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/create-resource-data-sync-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-tasks-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-tasks-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-tasks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-maintenance-window-tasks-request/window-id] :opt-un [:portkey.aws.ssm.describe-maintenance-window-tasks-request/filters :portkey.aws.ssm.describe-maintenance-window-tasks-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-resource-compliance-summaries-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/compliance-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-resource-compliance-summaries-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-resource-compliance-summaries-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.update-association-status-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/update-association-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-association-status-request/name :portkey.aws.ssm/instance-id :portkey.aws.ssm/association-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/start-associations-once-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-parameters-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/parameters-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-parameters-request/parameter-filters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-parameters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-parameters-request/filters :portkey.aws.ssm.describe-parameters-request/parameter-filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/patch-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-task-result/task-invocation-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.update-maintenance-window-task-result/service-role-arn :portkey.aws.ssm.update-maintenance-window-task-result/window-id :portkey.aws.ssm.update-maintenance-window-task-result/priority :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/logging-info :portkey.aws.ssm.update-maintenance-window-task-result/task-arn :portkey.aws.ssm/max-errors :portkey.aws.ssm.update-maintenance-window-task-result/description :portkey.aws.ssm/targets :portkey.aws.ssm.update-maintenance-window-task-result/window-task-id :portkey.aws.ssm.update-maintenance-window-task-result/task-parameters :portkey.aws.ssm.update-maintenance-window-task-result/name :portkey.aws.ssm.update-maintenance-window-task-result/task-invocation-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-filter-key #{"InstanceId" :association-id "AssociationId" :name :association-name :instance-id "LastExecutedBefore" "AssociationName" :association-status-name "AssociationStatusName" :last-executed-after "Name" :last-executed-before "LastExecutedAfter"})

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-for-patch-group-result/instance-patch-states (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-states-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-instance-patch-states-for-patch-group-result/instance-patch-states :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-installed-rejected-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/status-details (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-already-exists/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-summaries-result/compliance-summary-items (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-item-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-compliance-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-compliance-summaries-result/compliance-summary-items :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-schema-delete-option #{:delete-schema "DeleteSchema" "DisableSchema" :disable-schema})

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameters (clojure.spec.alpha/map-of :portkey.aws.ssm/maintenance-window-task-parameter-name :portkey.aws.ssm/maintenance-window-task-parameter-value-expression))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-baseline-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/baseline-name :portkey.aws.ssm/operating-system :portkey.aws.ssm/baseline-description :portkey.aws.ssm/default-baseline]))

(clojure.spec.alpha/def :portkey.aws.ssm/list-association-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/association-id] :opt-un [:portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/standard-output-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 24000))))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-parameter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/session-manager-parameter-value))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-s-3-destination/bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-s-3-destination/prefix (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-s-3-destination/sync-format (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-format))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-s-3-destination/region (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-region))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-s-3-destination/awskms-key-arn (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-awskms-key-arn))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-s-3-destination (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.resource-data-sync-s-3-destination/bucket-name :portkey.aws.ssm.resource-data-sync-s-3-destination/sync-format :portkey.aws.ssm.resource-data-sync-s-3-destination/region] :opt-un [:portkey.aws.ssm.resource-data-sync-s-3-destination/prefix :portkey.aws.ssm.resource-data-sync-s-3-destination/awskms-key-arn]))

(clojure.spec.alpha/def :portkey.aws.ssm/agent-error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-owner (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/aggregator-schema-only clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-instance-information-filter-value/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-instance-information-filter-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-instance-information-filter-value/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/cloud-watch-output-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/cloud-watch-log-group-name :portkey.aws.ssm/cloud-watch-output-enabled]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-parameter))

(clojure.spec.alpha/def :portkey.aws.ssm/document-sha-1 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.cancel-maintenance-window-execution-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm/cancel-maintenance-window-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.cancel-maintenance-window-execution-request/window-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-query-option (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.ssm/connection-status #{:not-connected "Connected" :connected "NotConnected"})

(clojure.spec.alpha/def :portkey.aws.ssm/patch-baseline-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.ssm/document-version-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-version-info :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.update-document-default-version-result/description (clojure.spec.alpha/and :portkey.aws.ssm/document-default-version-description))
(clojure.spec.alpha/def :portkey.aws.ssm/update-document-default-version-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.update-document-default-version-result/description]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-metadata))

(clojure.spec.alpha/def :portkey.aws.ssm/default-instance-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-filter-key #{"InstanceIds" "ActivationIds" :platform-types :iam-role "PingStatus" "IamRole" "AgentVersion" "AssociationStatus" :association-status "ResourceType" :instance-ids "PlatformTypes" :resource-type :agent-version :activation-ids :ping-status})

(clojure.spec.alpha/def :portkey.aws.ssm.register-target-with-maintenance-window-result/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm/register-target-with-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.register-target-with-maintenance-window-result/window-target-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.ssm.does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.does-not-exist-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/session-target (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/session-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm/expiration-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm.delete-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-maintenance-window-request/window-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-priority (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ssm/session-status #{"Failed" "Connected" :disconnected :connecting :connected "Disconnected" :terminating "Connecting" "Terminating" :terminated "Terminated" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm/document-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.:/]{3,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-request/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.list-inventory-entries-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/inventory-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-inventory-entries-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm.list-inventory-entries-request/type-name] :opt-un [:portkey.aws.ssm.list-inventory-entries-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-platform-type/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/unsupported-platform-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.unsupported-platform-type/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-entity-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/effective-patch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/patch :portkey.aws.ssm/patch-status]))

(clojure.spec.alpha/def :portkey.aws.ssm/max-concurrency (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 7)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([1-9][0-9]*|[1-9][0-9]%|[1-9]%|100%)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patches-result/patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-data-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patches-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-instance-patches-result/patches :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-values))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-filter/key :portkey.aws.ssm.maintenance-window-filter/values]))

(clojure.spec.alpha/def :portkey.aws.ssm.resolved-targets/parameter-values (clojure.spec.alpha/and :portkey.aws.ssm/target-parameter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.resolved-targets/truncated (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/resolved-targets (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resolved-targets/parameter-values :portkey.aws.ssm.resolved-targets/truncated]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-states-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-patch-state :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm/patch-action #{:block "BLOCK" "ALLOW_AS_DEPENDENCY" :allow-as-dependency})

(clojure.spec.alpha/def :portkey.aws.ssm/status-unchanged (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/status (clojure.spec.alpha/and :portkey.aws.ssm/command-invocation-status))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/command-plugins (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-list))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/instance-name (clojure.spec.alpha/and :portkey.aws.ssm/instance-tag-name))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/requested-date-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/standard-output-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/trace-output (clojure.spec.alpha/and :portkey.aws.ssm/invocation-trace-output))
(clojure.spec.alpha/def :portkey.aws.ssm.command-invocation/standard-error-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm/command-invocation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/service-role :portkey.aws.ssm/instance-id :portkey.aws.ssm/comment :portkey.aws.ssm/notification-config :portkey.aws.ssm.command-invocation/status :portkey.aws.ssm/status-details :portkey.aws.ssm/cloud-watch-output-config :portkey.aws.ssm.command-invocation/command-plugins :portkey.aws.ssm.command-invocation/instance-name :portkey.aws.ssm.command-invocation/requested-date-time :portkey.aws.ssm.command-invocation/standard-output-url :portkey.aws.ssm.command-invocation/trace-output :portkey.aws.ssm/command-id :portkey.aws.ssm/document-name :portkey.aws.ssm/document-version :portkey.aws.ssm.command-invocation/standard-error-url]))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-command-id (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/stop-type #{"Cancel" "Complete" :cancel :complete})

(clojure.spec.alpha/def :portkey.aws.ssm.compliant-summary/compliant-count (clojure.spec.alpha/and :portkey.aws.ssm/compliance-summary-count))
(clojure.spec.alpha/def :portkey.aws.ssm/compliant-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.compliant-summary/compliant-count :portkey.aws.ssm/severity-summary]))

(clojure.spec.alpha/def :portkey.aws.ssm/list-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-filter-list :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/cancel-command-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.start-automation-execution-request/parameters (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm.start-automation-execution-request/mode (clojure.spec.alpha/and :portkey.aws.ssm/execution-mode))
(clojure.spec.alpha/def :portkey.aws.ssm.start-automation-execution-request/document-name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.start-automation-execution-request/target-parameter-name (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.start-automation-execution-request/client-token (clojure.spec.alpha/and :portkey.aws.ssm/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.ssm/start-automation-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.start-automation-execution-request/document-name] :opt-un [:portkey.aws.ssm/target-maps :portkey.aws.ssm.start-automation-execution-request/parameters :portkey.aws.ssm.start-automation-execution-request/mode :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/max-errors :portkey.aws.ssm/targets :portkey.aws.ssm/document-version :portkey.aws.ssm.start-automation-execution-request/target-parameter-name :portkey.aws.ssm.start-automation-execution-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.create-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm/create-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.create-maintenance-window-result/window-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-compliance-max-results (clojure.spec.alpha/int-in 10 100))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-inventory-deletions-request/deletion-id (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-id))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-inventory-deletions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-inventory-deletions-request/deletion-id :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-filter-values (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-patch-state-filter-value :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.automation-execution-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-association-request/name :portkey.aws.ssm/instance-id :portkey.aws.ssm/association-id :portkey.aws.ssm/association-version]))

(clojure.spec.alpha/def :portkey.aws.ssm/signal-type #{:stop-step :approve "Resume" "StopStep" "StartStep" "Approve" :reject :resume :start-step "Reject"})

(clojure.spec.alpha/def :portkey.aws.ssm/session-details (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/sync-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-name))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/s-3-destination (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-destination))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/last-sync-time (clojure.spec.alpha/and :portkey.aws.ssm/last-resource-data-sync-time))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/last-successful-sync-time (clojure.spec.alpha/and :portkey.aws.ssm/last-successful-resource-data-sync-time))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/last-status (clojure.spec.alpha/and :portkey.aws.ssm/last-resource-data-sync-status))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/sync-created-time (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-created-time))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-item/last-sync-status-message (clojure.spec.alpha/and :portkey.aws.ssm/last-resource-data-sync-message))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-data-sync-item/sync-name :portkey.aws.ssm.resource-data-sync-item/s-3-destination :portkey.aws.ssm.resource-data-sync-item/last-sync-time :portkey.aws.ssm.resource-data-sync-item/last-successful-sync-time :portkey.aws.ssm.resource-data-sync-item/last-status :portkey.aws.ssm.resource-data-sync-item/sync-created-time :portkey.aws.ssm.resource-data-sync-item/last-sync-status-message]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm/cloud-watch-output-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patches-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patches-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patches-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id] :opt-un [:portkey.aws.ssm.describe-instance-patches-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm.describe-instance-patches-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-document/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-document/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/update-association-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-description]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-pattern-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-pattern-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-pattern-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-result-attribute-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-result-attribute-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-result-attribute-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-patches (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-other-patches (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-rejected-patches (clojure.spec.alpha/and :portkey.aws.ssm/instances-count))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-missing-patches (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-failed-patches (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-group-state-result/instances-with-not-applicable-patches (clojure.spec.alpha/and :portkey.aws.ssm/integer))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-group-state-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-patch-group-state-result/instances :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-patches :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-other-patches :portkey.aws.ssm.describe-patch-group-state-result/instances-with-installed-rejected-patches :portkey.aws.ssm.describe-patch-group-state-result/instances-with-missing-patches :portkey.aws.ssm.describe-patch-group-state-result/instances-with-failed-patches :portkey.aws.ssm.describe-patch-group-state-result/instances-with-not-applicable-patches]))

(clojure.spec.alpha/def :portkey.aws.ssm.association-description/last-update-association-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/status (clojure.spec.alpha/and :portkey.aws.ssm/association-status))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/overview (clojure.spec.alpha/and :portkey.aws.ssm/association-overview))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/last-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/last-successful-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-description/output-location (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/association-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm/instance-id :portkey.aws.ssm.association-description/last-update-association-date :portkey.aws.ssm/parameters :portkey.aws.ssm/association-id :portkey.aws.ssm.association-description/status :portkey.aws.ssm.association-description/overview :portkey.aws.ssm.association-description/date :portkey.aws.ssm.association-description/last-execution-date :portkey.aws.ssm/association-name :portkey.aws.ssm/targets :portkey.aws.ssm.association-description/last-successful-execution-date :portkey.aws.ssm/schedule-expression :portkey.aws.ssm/document-version :portkey.aws.ssm.association-description/name :portkey.aws.ssm.association-description/output-location]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-commands-result/commands (clojure.spec.alpha/and :portkey.aws.ssm/command-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-commands-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-commands-result/commands :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/tag-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/tag))

(clojure.spec.alpha/def :portkey.aws.ssm/create-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-description/schema-version (clojure.spec.alpha/and :portkey.aws.ssm/document-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/parameters (clojure.spec.alpha/and :portkey.aws.ssm/document-parameter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/tags (clojure.spec.alpha/and :portkey.aws.ssm/tag-list))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/hash (clojure.spec.alpha/and :portkey.aws.ssm/document-hash))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/status (clojure.spec.alpha/and :portkey.aws.ssm/document-status))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/default-version (clojure.spec.alpha/and :portkey.aws.ssm/document-version))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/description (clojure.spec.alpha/and :portkey.aws.ssm/description-in-document))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/platform-types (clojure.spec.alpha/and :portkey.aws.ssm/platform-type-list))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/latest-version (clojure.spec.alpha/and :portkey.aws.ssm/document-version))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/owner (clojure.spec.alpha/and :portkey.aws.ssm/document-owner))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/hash-type (clojure.spec.alpha/and :portkey.aws.ssm/document-hash-type))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.document-description/sha-1 (clojure.spec.alpha/and :portkey.aws.ssm/document-sha-1))
(clojure.spec.alpha/def :portkey.aws.ssm/document-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-description/schema-version :portkey.aws.ssm.document-description/parameters :portkey.aws.ssm/document-type :portkey.aws.ssm/target-type :portkey.aws.ssm.document-description/tags :portkey.aws.ssm.document-description/hash :portkey.aws.ssm.document-description/status :portkey.aws.ssm.document-description/default-version :portkey.aws.ssm.document-description/description :portkey.aws.ssm.document-description/created-date :portkey.aws.ssm/document-format :portkey.aws.ssm.document-description/platform-types :portkey.aws.ssm.document-description/latest-version :portkey.aws.ssm.document-description/owner :portkey.aws.ssm.document-description/hash-type :portkey.aws.ssm/document-version :portkey.aws.ssm.document-description/name :portkey.aws.ssm.document-description/sha-1]))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-target/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-target/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-target/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-target/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-target/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-target/window-id :portkey.aws.ssm.maintenance-window-target/window-target-id :portkey.aws.ssm.maintenance-window-target/resource-type :portkey.aws.ssm/targets :portkey.aws.ssm/owner-information :portkey.aws.ssm.maintenance-window-target/name :portkey.aws.ssm.maintenance-window-target/description]))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-string-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/compliance-string-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-string-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/compliance-string-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-string-filter/type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-query-operator-type))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-string-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.compliance-string-filter/key :portkey.aws.ssm.compliance-string-filter/values :portkey.aws.ssm.compliance-string-filter/type]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-last-status-update-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[A-Za-z0-9_\-]\w+|Custom:[a-zA-Z0-9_\-]\w+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-id :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm.create-association-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.create-association-request/output-location (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/create-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-association-request/name] :opt-un [:portkey.aws.ssm/document-version :portkey.aws.ssm/instance-id :portkey.aws.ssm/parameters :portkey.aws.ssm/targets :portkey.aws.ssm/schedule-expression :portkey.aws.ssm.create-association-request/output-location :portkey.aws.ssm/association-name]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-automation-step-executions-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/step-execution-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-automation-step-executions-request/reverse-order (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-automation-step-executions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/automation-execution-id] :opt-un [:portkey.aws.ssm.describe-automation-step-executions-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results :portkey.aws.ssm.describe-automation-step-executions-request/reverse-order]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-invocation-parameters (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/resource-id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-id))
(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/compliance-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/execution-summary (clojure.spec.alpha/and :portkey.aws.ssm/compliance-execution-summary))
(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/items (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-entry-list))
(clojure.spec.alpha/def :portkey.aws.ssm.put-compliance-items-request/item-content-hash (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-content-hash))
(clojure.spec.alpha/def :portkey.aws.ssm/put-compliance-items-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.put-compliance-items-request/resource-id :portkey.aws.ssm.put-compliance-items-request/resource-type :portkey.aws.ssm.put-compliance-items-request/compliance-type :portkey.aws.ssm.put-compliance-items-request/execution-summary :portkey.aws.ssm.put-compliance-items-request/items] :opt-un [:portkey.aws.ssm.put-compliance-items-request/item-content-hash]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-key-values-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.list-associations-result/associations (clojure.spec.alpha/and :portkey.aws.ssm/association-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-associations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-associations-result/associations :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-automation-execution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/automation-execution]))

(clojure.spec.alpha/def :portkey.aws.ssm/logging-info (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/s-3-bucket-name :portkey.aws.ssm/s-3-region] :opt-un [:portkey.aws.ssm/s-3-key-prefix]))

(clojure.spec.alpha/def :portkey.aws.ssm/ps-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-result/parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameters-by-path-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-parameters-by-path-result/parameters :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-resource-data-sync-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-executions-result/association-executions (clojure.spec.alpha/and :portkey.aws.ssm/association-executions-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-executions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-association-executions-result/association-executions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.association-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/association-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.association-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/send-automation-signal-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-document-version/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-document-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-document-version/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-filter-group/patch-filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter-group (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.patch-filter-group/patch-filters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/platform-name (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/agent-version (clojure.spec.alpha/and :portkey.aws.ssm/version))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/association-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/last-successful-association-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/last-ping-date-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/association-overview (clojure.spec.alpha/and :portkey.aws.ssm/instance-aggregated-association-overview))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/is-latest-version (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/platform-version (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/last-association-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/name (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information/registration-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-information (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm.instance-information/platform-name :portkey.aws.ssm/platform-type :portkey.aws.ssm/ping-status :portkey.aws.ssm/iam-role :portkey.aws.ssm.instance-information/agent-version :portkey.aws.ssm.instance-information/association-status :portkey.aws.ssm.instance-information/last-successful-association-execution-date :portkey.aws.ssm.instance-information/last-ping-date-time :portkey.aws.ssm.instance-information/association-overview :portkey.aws.ssm.instance-information/is-latest-version :portkey.aws.ssm/ip-address :portkey.aws.ssm.instance-information/platform-version :portkey.aws.ssm/resource-type :portkey.aws.ssm/activation-id :portkey.aws.ssm.instance-information/last-association-execution-date :portkey.aws.ssm.instance-information/name :portkey.aws.ssm.instance-information/registration-date :portkey.aws.ssm/computer-name]))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-plugin-name (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-task))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-state-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-state-filter-values))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state-filter/type (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-state-operator-type))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.instance-patch-state-filter/key :portkey.aws.ssm.instance-patch-state-filter/values :portkey.aws.ssm.instance-patch-state-filter/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/status-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/create-document-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/document-description]))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-item/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-item/schema-version (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-item/capture-time (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-capture-time))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-item/content-hash (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-content-hash))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-result-item/content (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-entry-list))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-item (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-result-item/type-name :portkey.aws.ssm.inventory-result-item/schema-version :portkey.aws.ssm.inventory-result-item/content] :opt-un [:portkey.aws.ssm.inventory-result-item/capture-time :portkey.aws.ssm.inventory-result-item/content-hash]))

(clojure.spec.alpha/def :portkey.aws.ssm/command-plugin-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 4 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm.update-document-default-version-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-document-default-version-request/document-version (clojure.spec.alpha/and :portkey.aws.ssm/document-version-number))
(clojure.spec.alpha/def :portkey.aws.ssm/update-document-default-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-document-default-version-request/name :portkey.aws.ssm.update-document-default-version-request/document-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/rejected-patches-action (clojure.spec.alpha/and :portkey.aws.ssm/patch-action))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/global-filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-group))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/approved-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/description (clojure.spec.alpha/and :portkey.aws.ssm/baseline-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/approved-patches-enable-non-security (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/replace (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/approval-rules (clojure.spec.alpha/and :portkey.aws.ssm/patch-rule-group))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/approved-patches-compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/name (clojure.spec.alpha/and :portkey.aws.ssm/baseline-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/sources (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-list))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-request/rejected-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/update-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id] :opt-un [:portkey.aws.ssm.update-patch-baseline-request/rejected-patches-action :portkey.aws.ssm.update-patch-baseline-request/global-filters :portkey.aws.ssm.update-patch-baseline-request/approved-patches :portkey.aws.ssm.update-patch-baseline-request/description :portkey.aws.ssm.update-patch-baseline-request/approved-patches-enable-non-security :portkey.aws.ssm.update-patch-baseline-request/replace :portkey.aws.ssm.update-patch-baseline-request/approval-rules :portkey.aws.ssm.update-patch-baseline-request/approved-patches-compliance-level :portkey.aws.ssm.update-patch-baseline-request/name :portkey.aws.ssm.update-patch-baseline-request/sources :portkey.aws.ssm.update-patch-baseline-request/rejected-patches]))

(clojure.spec.alpha/def :portkey.aws.ssm/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.ssm.session-manager-output-url/s-3-output-url (clojure.spec.alpha/and :portkey.aws.ssm/session-manager-s-3-output-url))
(clojure.spec.alpha/def :portkey.aws.ssm.session-manager-output-url/cloud-watch-output-url (clojure.spec.alpha/and :portkey.aws.ssm/session-manager-cloud-watch-output-url))
(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-output-url (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.session-manager-output-url/s-3-output-url :portkey.aws.ssm.session-manager-output-url/cloud-watch-output-url]))

(clojure.spec.alpha/def :portkey.aws.ssm.custom-schema-count-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/custom-schema-count-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.custom-schema-count-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-invocation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-summary/summary-items (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-summary-items))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/total-count :portkey.aws.ssm/remaining-count :portkey.aws.ssm.inventory-deletion-summary/summary-items]))

(clojure.spec.alpha/def :portkey.aws.ssm.update-managed-instance-role-request/instance-id (clojure.spec.alpha/and :portkey.aws.ssm/managed-instance-id))
(clojure.spec.alpha/def :portkey.aws.ssm/update-managed-instance-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-managed-instance-role-request/instance-id :portkey.aws.ssm/iam-role] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9:/_-]+)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-parameter-map (clojure.spec.alpha/map-of :portkey.aws.ssm/automation-parameter-key :portkey.aws.ssm/automation-parameter-value-list))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-document-operation/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-document-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-document-operation/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/step-execution-filter-value :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm.association-overview/status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-overview/detailed-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm/association-overview (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.association-overview/status :portkey.aws.ssm.association-overview/detailed-status :portkey.aws.ssm/association-status-aggregated-count]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-filter :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.duplicate-document-content/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/duplicate-document-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.duplicate-document-content/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-document-versions-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/list-document-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.list-document-versions-request/name] :opt-un [:portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/compliance-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/resource-id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-id))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/status (clojure.spec.alpha/and :portkey.aws.ssm/compliance-status))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/overall-severity (clojure.spec.alpha/and :portkey.aws.ssm/compliance-severity))
(clojure.spec.alpha/def :portkey.aws.ssm.resource-compliance-summary-item/execution-summary (clojure.spec.alpha/and :portkey.aws.ssm/compliance-execution-summary))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-compliance-summary-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-compliance-summary-item/compliance-type :portkey.aws.ssm.resource-compliance-summary-item/resource-type :portkey.aws.ssm.resource-compliance-summary-item/resource-id :portkey.aws.ssm.resource-compliance-summary-item/status :portkey.aws.ssm.resource-compliance-summary-item/overall-severity :portkey.aws.ssm.resource-compliance-summary-item/execution-summary :portkey.aws.ssm/compliant-summary :portkey.aws.ssm/non-compliant-summary]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-rule-group/patch-rules (clojure.spec.alpha/and :portkey.aws.ssm/patch-rule-list))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-rule-group (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.patch-rule-group/patch-rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-activation-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-target-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-target))

(clojure.spec.alpha/def :portkey.aws.ssm.modify-document-permission-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.modify-document-permission-request/permission-type (clojure.spec.alpha/and :portkey.aws.ssm/document-permission-type))
(clojure.spec.alpha/def :portkey.aws.ssm.modify-document-permission-request/account-ids-to-add (clojure.spec.alpha/and :portkey.aws.ssm/account-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.modify-document-permission-request/account-ids-to-remove (clojure.spec.alpha/and :portkey.aws.ssm/account-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/modify-document-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.modify-document-permission-request/name :portkey.aws.ssm.modify-document-permission-request/permission-type] :opt-un [:portkey.aws.ssm.modify-document-permission-request/account-ids-to-add :portkey.aws.ssm.modify-document-permission-request/account-ids-to-remove]))

(clojure.spec.alpha/def :portkey.aws.ssm/command-plugin-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/command-plugin))

(clojure.spec.alpha/def :portkey.aws.ssm/list-resource-data-sync-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-request/names (clojure.spec.alpha/and :portkey.aws.ssm/parameter-name-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-request/with-decryption (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-parameters-request/names] :opt-un [:portkey.aws.ssm.get-parameters-request/with-decryption]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-item :min-count 1 :max-count 30))

(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-schema-result/schemas (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-result-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-inventory-schema-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-inventory-schema-result/schemas :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/description (clojure.spec.alpha/and :portkey.aws.ssm/parameter-description))
(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/value (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-value))
(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/type (clojure.spec.alpha/and :portkey.aws.ssm/parameter-type))
(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/key-id (clojure.spec.alpha/and :portkey.aws.ssm/parameter-key-id))
(clojure.spec.alpha/def :portkey.aws.ssm.put-parameter-request/overwrite (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/put-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.put-parameter-request/name :portkey.aws.ssm.put-parameter-request/value :portkey.aws.ssm.put-parameter-request/type] :opt-un [:portkey.aws.ssm.put-parameter-request/description :portkey.aws.ssm.put-parameter-request/key-id :portkey.aws.ssm.put-parameter-request/overwrite :portkey.aws.ssm/allowed-pattern]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-history-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-history))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-filter :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm/association-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-filter :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-sessions-request/state (clojure.spec.alpha/and :portkey.aws.ssm/session-state))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-sessions-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/session-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-sessions-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/session-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-sessions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-sessions-request/state] :opt-un [:portkey.aws.ssm.describe-sessions-request/max-results :portkey.aws.ssm/next-token :portkey.aws.ssm.describe-sessions-request/filters]))

(clojure.spec.alpha/def :portkey.aws.ssm.put-inventory-result/message (clojure.spec.alpha/and :portkey.aws.ssm/put-inventory-message))
(clojure.spec.alpha/def :portkey.aws.ssm/put-inventory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.put-inventory-result/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/registrations-count (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.ssm.deregister-target-from-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.deregister-target-from-maintenance-window-request/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.deregister-target-from-maintenance-window-request/safe (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/deregister-target-from-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.deregister-target-from-maintenance-window-request/window-id :portkey.aws.ssm.deregister-target-from-maintenance-window-request/window-target-id] :opt-un [:portkey.aws.ssm.deregister-target-from-maintenance-window-request/safe]))

(clojure.spec.alpha/def :portkey.aws.ssm/update-document-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/document-description]))

(clojure.spec.alpha/def :portkey.aws.ssm/max-errors (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 7)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([1-9][0-9]*|[0]|[1-9][0-9]%|[0-9]%|100%)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-item-attribute :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 132)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"tag:.+|Name|Type|KeyId|Path|Label" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-schema-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([0-9]{1,6})(\.[0-9]{1,6})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.list-commands-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/command-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm.list-commands-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/command-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-commands-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/command-id :portkey.aws.ssm/instance-id :portkey.aws.ssm.list-commands-request/max-results :portkey.aws.ssm/next-token :portkey.aws.ssm.list-commands-request/filters]))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-status #{"NON_COMPLIANT" "COMPLIANT" :compliant :non-compliant})

(clojure.spec.alpha/def :portkey.aws.ssm.get-connection-status-response/target (clojure.spec.alpha/and :portkey.aws.ssm/session-target))
(clojure.spec.alpha/def :portkey.aws.ssm.get-connection-status-response/status (clojure.spec.alpha/and :portkey.aws.ssm/connection-status))
(clojure.spec.alpha/def :portkey.aws.ssm/get-connection-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-connection-status-response/target :portkey.aws.ssm.get-connection-status-response/status]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-automation-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/automation-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-request/plugin-name (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-name))
(clojure.spec.alpha/def :portkey.aws.ssm/get-command-invocation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/command-id :portkey.aws.ssm/instance-id] :opt-un [:portkey.aws.ssm.get-command-invocation-request/plugin-name]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-string-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-string-filter-value :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm.update-document-request/content (clojure.spec.alpha/and :portkey.aws.ssm/document-content))
(clojure.spec.alpha/def :portkey.aws.ssm.update-document-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/update-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-document-request/content :portkey.aws.ssm.update-document-request/name] :opt-un [:portkey.aws.ssm/document-version :portkey.aws.ssm/document-format :portkey.aws.ssm/target-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-result/instance-patch-states (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-state-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patch-states-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-instance-patch-states-result/instance-patch-states :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-status #{:in-progress "InProgress" "Complete" :complete})

(clojure.spec.alpha/def :portkey.aws.ssm/get-patch-baseline-for-patch-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/patch-group :portkey.aws.ssm/operating-system]))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-execution-summary/execution-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-execution-summary/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-execution-summary/execution-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-execution-type))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-execution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.compliance-execution-summary/execution-time] :opt-un [:portkey.aws.ssm.compliance-execution-summary/execution-id :portkey.aws.ssm.compliance-execution-summary/execution-type]))

(clojure.spec.alpha/def :portkey.aws.ssm/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/invocation-trace-output (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2500))))

(clojure.spec.alpha/def :portkey.aws.ssm/stream-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/allowed-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/valid-next-step (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-msrc-severity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.list-command-invocations-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/command-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm.list-command-invocations-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/command-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.list-command-invocations-request/details (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/list-command-invocations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/command-id :portkey.aws.ssm/instance-id :portkey.aws.ssm.list-command-invocations-request/max-results :portkey.aws.ssm/next-token :portkey.aws.ssm.list-command-invocations-request/filters :portkey.aws.ssm.list-command-invocations-request/details]))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-string-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.ssm.document-default-version-description/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.document-default-version-description/default-version (clojure.spec.alpha/and :portkey.aws.ssm/document-version))
(clojure.spec.alpha/def :portkey.aws.ssm/document-default-version-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-default-version-description/name :portkey.aws.ssm.document-default-version-description/default-version]))

(clojure.spec.alpha/def :portkey.aws.ssm/default-baseline clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/allow-unassociated-targets (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-allow-unassociated-targets))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/end-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/enabled (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-enabled))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/duration (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-duration-hours))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/cutoff (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-cutoff))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/schedule (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-schedule))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/start-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-result/schedule-timezone (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-timezone))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.update-maintenance-window-result/window-id :portkey.aws.ssm.update-maintenance-window-result/allow-unassociated-targets :portkey.aws.ssm.update-maintenance-window-result/end-date :portkey.aws.ssm.update-maintenance-window-result/enabled :portkey.aws.ssm.update-maintenance-window-result/description :portkey.aws.ssm.update-maintenance-window-result/duration :portkey.aws.ssm.update-maintenance-window-result/cutoff :portkey.aws.ssm.update-maintenance-window-result/schedule :portkey.aws.ssm.update-maintenance-window-result/name :portkey.aws.ssm.update-maintenance-window-result/start-date :portkey.aws.ssm.update-maintenance-window-result/schedule-timezone]))

(clojure.spec.alpha/def :portkey.aws.ssm/start-session-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/session-id :portkey.aws.ssm/token-value :portkey.aws.ssm/stream-url]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-tag-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.ssm/command-filter-key #{"InvokedBefore" :document-name "InvokedAfter" "ExecutionStage" "Status" :invoked-before :invoked-after :status "DocumentName" :execution-stage})

(clojure.spec.alpha/def :portkey.aws.ssm.delete-inventory-result/deletion-id (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-id))
(clojure.spec.alpha/def :portkey.aws.ssm.delete-inventory-result/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.delete-inventory-result/deletion-summary (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletion-summary))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-inventory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.delete-inventory-result/deletion-id :portkey.aws.ssm.delete-inventory-result/type-name :portkey.aws.ssm.delete-inventory-result/deletion-summary]))

(clojure.spec.alpha/def :portkey.aws.ssm/total-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/batch-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-source-product-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-source-product :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.ssm/baseline-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-:/]{20,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-automation-executions-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-automation-executions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-automation-executions-request/filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-automation-executions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/automation-execution-metadata-list :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-version-label-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-version-label-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-version-label-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-definition-version-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-definition-version-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.automation-definition-version-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.deregister-target-from-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.deregister-target-from-maintenance-window-result/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm/deregister-target-from-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.deregister-target-from-maintenance-window-result/window-id :portkey.aws.ssm.deregister-target-from-maintenance-window-result/window-target-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-not-applicable-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.failure-details/failure-stage (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.failure-details/failure-type (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.failure-details/details (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm/failure-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.failure-details/failure-stage :portkey.aws.ssm.failure-details/failure-type :portkey.aws.ssm.failure-details/details]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-product (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-filter-key #{"Status" "CreatedTime" "ExecutionId" :status :execution-id :created-time})

(clojure.spec.alpha/def :portkey.aws.ssm/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 46))))

(clojure.spec.alpha/def :portkey.aws.ssm/managed-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^mi-[0-9a-f]{17}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-string-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-filter-value :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/rejected-patches-action (clojure.spec.alpha/and :portkey.aws.ssm/patch-action))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/global-filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-group))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/approved-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/description (clojure.spec.alpha/and :portkey.aws.ssm/baseline-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/approved-patches-enable-non-security (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/approval-rules (clojure.spec.alpha/and :portkey.aws.ssm/patch-rule-group))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/approved-patches-compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/name (clojure.spec.alpha/and :portkey.aws.ssm/baseline-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/sources (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-list))
(clojure.spec.alpha/def :portkey.aws.ssm.update-patch-baseline-result/rejected-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/update-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.update-patch-baseline-result/rejected-patches-action :portkey.aws.ssm.update-patch-baseline-result/global-filters :portkey.aws.ssm.update-patch-baseline-result/approved-patches :portkey.aws.ssm.update-patch-baseline-result/description :portkey.aws.ssm.update-patch-baseline-result/approved-patches-enable-non-security :portkey.aws.ssm/baseline-id :portkey.aws.ssm.update-patch-baseline-result/created-date :portkey.aws.ssm.update-patch-baseline-result/modified-date :portkey.aws.ssm.update-patch-baseline-result/approval-rules :portkey.aws.ssm.update-patch-baseline-result/approved-patches-compliance-level :portkey.aws.ssm.update-patch-baseline-result/name :portkey.aws.ssm.update-patch-baseline-result/sources :portkey.aws.ssm/operating-system :portkey.aws.ssm.update-patch-baseline-result/rejected-patches]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 20)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^mw-[0-9a-f]{17}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-targets-result/targets (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-targets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-targets-result/targets :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-parameter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-orchestrator-filter-values (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-orchestrator-filter-value))

(clojure.spec.alpha/def :portkey.aws.ssm/created-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm.patch-status/deployment-status (clojure.spec.alpha/and :portkey.aws.ssm/patch-deployment-status))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-status/compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.patch-status/approval-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.patch-status/deployment-status :portkey.aws.ssm.patch-status/compliance-level :portkey.aws.ssm.patch-status/approval-date]))

(clojure.spec.alpha/def :portkey.aws.ssm/normal-string-map (clojure.spec.alpha/map-of :portkey.aws.ssm/string :portkey.aws.ssm/string))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-tasks-result/tasks (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-tasks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-tasks-result/tasks :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-patch-state-filter :min-count 0 :max-count 4))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-parameters/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-vendor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm/association-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]{3,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-lambda-client-context (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8000))))

(clojure.spec.alpha/def :portkey.aws.ssm/effective-instance-association-max-results (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-execution/window-id :portkey.aws.ssm.maintenance-window-execution/window-execution-id :portkey.aws.ssm.maintenance-window-execution/status :portkey.aws.ssm.maintenance-window-execution/status-details :portkey.aws.ssm.maintenance-window-execution/start-time :portkey.aws.ssm.maintenance-window-execution/end-time]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-execution-targets-result/association-execution-targets (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-targets-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-execution-targets-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-association-execution-targets-result/association-execution-targets :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.create-resource-data-sync-request/sync-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-name))
(clojure.spec.alpha/def :portkey.aws.ssm.create-resource-data-sync-request/s-3-destination (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-s-3-destination))
(clojure.spec.alpha/def :portkey.aws.ssm/create-resource-data-sync-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-resource-data-sync-request/sync-name :portkey.aws.ssm.create-resource-data-sync-request/s-3-destination] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/last-successful-resource-data-sync-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/step-execution-filter :min-count 1 :max-count 6))

(clojure.spec.alpha/def :portkey.aws.ssm/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-information-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/instance-information-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-information-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/max-results-ec-2-compatible))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-information-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-information-filter-list :portkey.aws.ssm.describe-instance-information-request/filters :portkey.aws.ssm.describe-instance-information-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/rejected-patches-action (clojure.spec.alpha/and :portkey.aws.ssm/patch-action))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/global-filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-group))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/approved-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/description (clojure.spec.alpha/and :portkey.aws.ssm/baseline-description))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/approved-patches-enable-non-security (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/patch-groups (clojure.spec.alpha/and :portkey.aws.ssm/patch-group-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/approval-rules (clojure.spec.alpha/and :portkey.aws.ssm/patch-rule-group))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/approved-patches-compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/name (clojure.spec.alpha/and :portkey.aws.ssm/baseline-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/sources (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-patch-baseline-result/rejected-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-patch-baseline-result/rejected-patches-action :portkey.aws.ssm.get-patch-baseline-result/global-filters :portkey.aws.ssm.get-patch-baseline-result/approved-patches :portkey.aws.ssm.get-patch-baseline-result/description :portkey.aws.ssm.get-patch-baseline-result/approved-patches-enable-non-security :portkey.aws.ssm/baseline-id :portkey.aws.ssm.get-patch-baseline-result/created-date :portkey.aws.ssm.get-patch-baseline-result/patch-groups :portkey.aws.ssm.get-patch-baseline-result/modified-date :portkey.aws.ssm.get-patch-baseline-result/approval-rules :portkey.aws.ssm.get-patch-baseline-result/approved-patches-compliance-level :portkey.aws.ssm.get-patch-baseline-result/name :portkey.aws.ssm.get-patch-baseline-result/sources :portkey.aws.ssm/operating-system :portkey.aws.ssm.get-patch-baseline-result/rejected-patches]))

(clojure.spec.alpha/def :portkey.aws.ssm.deregister-task-from-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.deregister-task-from-maintenance-window-result/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm/deregister-task-from-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.deregister-task-from-maintenance-window-result/window-id :portkey.aws.ssm.deregister-task-from-maintenance-window-result/window-task-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/type (clojure.spec.alpha/and :portkey.aws.ssm/parameter-type))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/value (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-value))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/version (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-version))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/selector (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-selector))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/source-result (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/last-modified-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.parameter/arn (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter/name :portkey.aws.ssm.parameter/type :portkey.aws.ssm.parameter/value :portkey.aws.ssm.parameter/version :portkey.aws.ssm.parameter/selector :portkey.aws.ssm.parameter/source-result :portkey.aws.ssm.parameter/last-modified-date :portkey.aws.ssm.parameter/arn]))

(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-inventory-schema-version-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/unsupported-inventory-schema-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.unsupported-inventory-schema-version-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/automation-execution-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.automation-execution-filter/key :portkey.aws.ssm.automation-execution-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-installed-other-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-content-context (clojure.spec.alpha/map-of :portkey.aws.ssm/attribute-name :portkey.aws.ssm/attribute-value))

(clojure.spec.alpha/def :portkey.aws.ssm/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(?i)all|[0-9]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-schema-result-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-item-schema))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-item-content-exception/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.invalid-item-content-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-item-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-item-content-exception/type-name :portkey.aws.ssm.invalid-item-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-compliance-summary-item-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/resource-compliance-summary-item))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-filter-key (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-windows-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-windows-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-windows-request/filters :portkey.aws.ssm.describe-maintenance-windows-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.ssm.create-association-batch-request-entry/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.create-association-batch-request-entry/output-location (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/create-association-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-association-batch-request-entry/name] :opt-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm/parameters :portkey.aws.ssm/document-version :portkey.aws.ssm/targets :portkey.aws.ssm/schedule-expression :portkey.aws.ssm.create-association-batch-request-entry/output-location :portkey.aws.ssm/association-name]))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/automation-execution-filter-value :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter-key #{"PATCH_ID" "CLASSIFICATION" :section "SEVERITY" :classification "MSRC_SEVERITY" "SECTION" :product :priority :patch-id :severity "PRODUCT" :msrc-severity "PRIORITY"})

(clojure.spec.alpha/def :portkey.aws.ssm/patch-failed-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-lambda-parameters/client-context (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-lambda-client-context))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-lambda-parameters/qualifier (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-lambda-qualifier))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-lambda-parameters/payload (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-lambda-payload))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-lambda-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-lambda-parameters/client-context :portkey.aws.ssm.maintenance-window-lambda-parameters/qualifier :portkey.aws.ssm.maintenance-window-lambda-parameters/payload]))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-status #{:timed-out "Failed" "Cancelled" :in-progress "Cancelling" :pending "TimedOut" "Success" :waiting :cancelled :success "InProgress" "Waiting" :cancelling "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-notification-config/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-notification-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-notification-config/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-schema-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"([0-9]+)\.([0-9]+)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-source-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-source :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-max-results (clojure.spec.alpha/int-in 10 100))

(clojure.spec.alpha/def :portkey.aws.ssm/notification-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-document-permission-response/account-ids (clojure.spec.alpha/and :portkey.aws.ssm/account-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-document-permission-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-document-permission-response/account-ids]))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-activation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/activation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm.unsupported-operating-system/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/unsupported-operating-system (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.unsupported-operating-system/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-default-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/operating-system]))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-information-string-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/instance-information-string-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-information-string-filter/values (clojure.spec.alpha/and :portkey.aws.ssm/instance-information-filter-value-set))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-string-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.instance-information-string-filter/key :portkey.aws.ssm.instance-information-string-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-type #{:managed-instance "EC2Instance" :document "Document" "ManagedInstance" :ec-2-instance})

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-step-functions-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.ssm/activation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter-default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-aggregator-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-format #{"YAML" :yaml "JSON" :json})

(clojure.spec.alpha/def :portkey.aws.ssm/targets (clojure.spec.alpha/coll-of :portkey.aws.ssm/target :min-count 0 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-groups-result/mappings (clojure.spec.alpha/and :portkey.aws.ssm/patch-group-patch-baseline-mapping-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-groups-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-patch-groups-result/mappings :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-compliance-level #{"INFORMATIONAL" :unspecified "CRITICAL" :medium "LOW" :high :critical "HIGH" :low "UNSPECIFIED" :informational "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.ssm/patch-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-source-configuration (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.ssm/target-map-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm.stop-automation-execution-request/type (clojure.spec.alpha/and :portkey.aws.ssm/stop-type))
(clojure.spec.alpha/def :portkey.aws.ssm/stop-automation-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/automation-execution-id] :opt-un [:portkey.aws.ssm.stop-automation-execution-request/type]))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-resource-type-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-resource-type :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm/document-status #{"Active" "Creating" :creating :deleting "Deleting" :active :updating "Updating"})

(clojure.spec.alpha/def :portkey.aws.ssm.describe-activations-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/describe-activations-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-activations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-activations-request/filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/description-in-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/remove-tags-from-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.command/instance-ids (clojure.spec.alpha/and :portkey.aws.ssm/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.command/output-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.command/expires-after (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.command/status (clojure.spec.alpha/and :portkey.aws.ssm/command-status))
(clojure.spec.alpha/def :portkey.aws.ssm.command/requested-date-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.command/output-s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.ssm/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm.command/output-s-3-region (clojure.spec.alpha/and :portkey.aws.ssm/s-3-region))
(clojure.spec.alpha/def :portkey.aws.ssm/command (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/service-role :portkey.aws.ssm.command/instance-ids :portkey.aws.ssm/comment :portkey.aws.ssm/delivery-timed-out-count :portkey.aws.ssm/completed-count :portkey.aws.ssm/error-count :portkey.aws.ssm/parameters :portkey.aws.ssm.command/output-s-3-bucket-name :portkey.aws.ssm/notification-config :portkey.aws.ssm.command/expires-after :portkey.aws.ssm.command/status :portkey.aws.ssm/status-details :portkey.aws.ssm/cloud-watch-output-config :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/max-errors :portkey.aws.ssm.command/requested-date-time :portkey.aws.ssm/targets :portkey.aws.ssm/command-id :portkey.aws.ssm.command/output-s-3-key-prefix :portkey.aws.ssm.command/output-s-3-region :portkey.aws.ssm/document-name :portkey.aws.ssm/document-version :portkey.aws.ssm/target-count]))

(clojure.spec.alpha/def :portkey.aws.ssm/delete-parameter-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-targets-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm/target-parameter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameter-value))

(clojure.spec.alpha/def :portkey.aws.ssm/instances-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-filter-value/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-filter-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-filter-value/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-group-patch-baseline-mapping-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-group-patch-baseline-mapping))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-key-id/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-key-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-key-id/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-result/window-execution-task-invocation-identities (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-identity-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-execution-task-invocations-result/window-execution-task-invocation-identities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/parameters-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/parameters-filter))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.delete-document-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-document-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/baseline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 3 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]{3,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-s-3-output-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2083))))

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-max-version-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-max-version-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-max-version-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.activation/expired (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.activation/description (clojure.spec.alpha/and :portkey.aws.ssm/activation-description))
(clojure.spec.alpha/def :portkey.aws.ssm/activation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/iam-role :portkey.aws.ssm/default-instance-name :portkey.aws.ssm/expiration-date :portkey.aws.ssm.activation/expired :portkey.aws.ssm/registrations-count :portkey.aws.ssm.activation/description :portkey.aws.ssm/created-date :portkey.aws.ssm/activation-id :portkey.aws.ssm/registration-limit]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-request/task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-maintenance-window-execution-task-request/window-execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-step-functions-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 80))))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/association-execution-filter :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.feature-not-available-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/feature-not-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.feature-not-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.delete-parameter-request/name (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-parameter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-parameter-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/task-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/invocation-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-invocation-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/task-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-invocation-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/task-execution-id :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/end-time :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/start-time :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/parameters :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/status :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/status-details :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/window-execution-id :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/invocation-id :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/execution-id :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/window-target-id :portkey.aws.ssm.maintenance-window-execution-task-invocation-identity/task-type :portkey.aws.ssm/owner-information]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-duration-hours (clojure.spec.alpha/int-in 1 24))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-automation-signal-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-automation-signal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-automation-signal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.delete-inventory-request/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.delete-inventory-request/schema-delete-option (clojure.spec.alpha/and :portkey.aws.ssm/inventory-schema-delete-option))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-inventory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-inventory-request/type-name] :opt-un [:portkey.aws.ssm.delete-inventory-request/schema-delete-option :portkey.aws.ssm/dry-run :portkey.aws.ssm/client-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-effective-instance-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/effective-instance-association-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-effective-instance-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id] :opt-un [:portkey.aws.ssm.describe-effective-instance-associations-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/platform-type-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/platform-type))

(clojure.spec.alpha/def :portkey.aws.ssm/s-3-key-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-effective-patches-for-patch-baseline-result/effective-patches (clojure.spec.alpha/and :portkey.aws.ssm/effective-patch-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-effective-patches-for-patch-baseline-result/effective-patches :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-aggregator-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-aggregator :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-schema-request/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name-filter))
(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-schema-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/get-inventory-schema-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-schema-request/aggregator (clojure.spec.alpha/and :portkey.aws.ssm/aggregator-schema-only))
(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-schema-request/sub-type (clojure.spec.alpha/and :portkey.aws.ssm/is-sub-type-schema))
(clojure.spec.alpha/def :portkey.aws.ssm/get-inventory-schema-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-inventory-schema-request/type-name :portkey.aws.ssm/next-token :portkey.aws.ssm.get-inventory-schema-request/max-results :portkey.aws.ssm.get-inventory-schema-request/aggregator :portkey.aws.ssm.get-inventory-schema-request/sub-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-request/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-request/replace (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.update-maintenance-window-target-request/window-id :portkey.aws.ssm.update-maintenance-window-target-request/window-target-id] :opt-un [:portkey.aws.ssm/targets :portkey.aws.ssm/owner-information :portkey.aws.ssm.update-maintenance-window-target-request/name :portkey.aws.ssm.update-maintenance-window-target-request/description :portkey.aws.ssm.update-maintenance-window-target-request/replace]))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-cloud-watch-output-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2083))))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-execution-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-count-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-count-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-data-sync-count-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/effective-patch-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/effective-patch))

(clojure.spec.alpha/def :portkey.aws.ssm/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/document-permission-type #{"Share" :share})

(clojure.spec.alpha/def :portkey.aws.ssm/schedule-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.list-resource-data-sync-result/resource-data-sync-items (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-item-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-resource-data-sync-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-resource-data-sync-result/resource-data-sync-items :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-type-for-tagging #{:managed-instance :maintenance-window "PatchBaseline" "MaintenanceWindow" :document "Parameter" :patch-baseline "Document" "ManagedInstance" :parameter})

(clojure.spec.alpha/def :portkey.aws.ssm.describe-document-result/document (clojure.spec.alpha/and :portkey.aws.ssm/document-description))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-document-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-document-result/document]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-version-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(^[1-9][0-9]*$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.failed-create-association/entry (clojure.spec.alpha/and :portkey.aws.ssm/create-association-batch-request-entry))
(clojure.spec.alpha/def :portkey.aws.ssm.failed-create-association/message (clojure.spec.alpha/and :portkey.aws.ssm/batch-error-message))
(clojure.spec.alpha/def :portkey.aws.ssm/failed-create-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.failed-create-association/entry :portkey.aws.ssm.failed-create-association/message :portkey.aws.ssm/fault]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-sessions-response/sessions (clojure.spec.alpha/and :portkey.aws.ssm/session-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-sessions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-sessions-response/sessions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-inventory-item-context-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-inventory-item-context-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-inventory-item-context-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-item-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/resource-data-sync-item))

(clojure.spec.alpha/def :portkey.aws.ssm/command-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/command))

(clojure.spec.alpha/def :portkey.aws.ssm/register-patch-baseline-for-patch-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/patch-group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/command-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-document-result/name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.get-document-result/content (clojure.spec.alpha/and :portkey.aws.ssm/document-content))
(clojure.spec.alpha/def :portkey.aws.ssm/get-document-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-document-result/name :portkey.aws.ssm/document-version :portkey.aws.ssm.get-document-result/content :portkey.aws.ssm/document-type :portkey.aws.ssm/document-format]))

(clojure.spec.alpha/def :portkey.aws.ssm.association-version-info/created-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-version-info/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-version-info/output-location (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/association-version-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm/parameters :portkey.aws.ssm/association-id :portkey.aws.ssm.association-version-info/created-date :portkey.aws.ssm/association-name :portkey.aws.ssm/targets :portkey.aws.ssm/schedule-expression :portkey.aws.ssm/document-version :portkey.aws.ssm.association-version-info/name :portkey.aws.ssm.association-version-info/output-location]))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-association/content (clojure.spec.alpha/and :portkey.aws.ssm/document-content))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-id :portkey.aws.ssm/instance-id :portkey.aws.ssm.instance-association/content :portkey.aws.ssm/association-version]))

(clojure.spec.alpha/def :portkey.aws.ssm/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.remove-tags-from-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/resource-type-for-tagging))
(clojure.spec.alpha/def :portkey.aws.ssm.remove-tags-from-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.ssm/key-list))
(clojure.spec.alpha/def :portkey.aws.ssm/remove-tags-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.remove-tags-from-resource-request/resource-type :portkey.aws.ssm/resource-id :portkey.aws.ssm.remove-tags-from-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.s-3-output-url/output-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm/s-3-output-url (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.s-3-output-url/output-url]))

(clojure.spec.alpha/def :portkey.aws.ssm.association-version-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/association-version-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.association-version-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/install-override-list (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^https://.+$|^s3://([^/]+)/(.*?([^/]+))$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-request/instance-ids (clojure.spec.alpha/and :portkey.aws.ssm/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patch-states-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-instance-patch-states-request/instance-ids] :opt-un [:portkey.aws.ssm/next-token :portkey.aws.ssm.describe-instance-patch-states-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/activation-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 250))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-source-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]{3,50}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-entry-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-item-entry :min-count 0 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/output-url (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-url))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/error-code (clojure.spec.alpha/and :portkey.aws.ssm/agent-error-code))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/execution-summary (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-execution-summary))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/detailed-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-status-info/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-status-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm.instance-association-status-info/execution-date :portkey.aws.ssm/instance-id :portkey.aws.ssm/association-id :portkey.aws.ssm.instance-association-status-info/output-url :portkey.aws.ssm.instance-association-status-info/status :portkey.aws.ssm.instance-association-status-info/error-code :portkey.aws.ssm.instance-association-status-info/execution-summary :portkey.aws.ssm/association-name :portkey.aws.ssm.instance-association-status-info/detailed-status :portkey.aws.ssm/document-version :portkey.aws.ssm.instance-association-status-info/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-status-name #{"Failed" :pending "Success" :success "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm.command-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/command-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.command-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/command-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm/command-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.command-filter/key :portkey.aws.ssm.command-filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-item-map (clojure.spec.alpha/map-of :portkey.aws.ssm/inventory-result-item-key :portkey.aws.ssm/inventory-result-item))

(clojure.spec.alpha/def :portkey.aws.ssm.list-association-versions-result/association-versions (clojure.spec.alpha/and :portkey.aws.ssm/association-version-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-association-versions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-association-versions-result/association-versions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/resume-session-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/session-id :portkey.aws.ssm/token-value :portkey.aws.ssm/stream-url]))

(clojure.spec.alpha/def :portkey.aws.ssm.create-association-batch-request/entries (clojure.spec.alpha/and :portkey.aws.ssm/create-association-batch-request-entries))
(clojure.spec.alpha/def :portkey.aws.ssm/create-association-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-association-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/session-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-target/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-target/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-activations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/activation-list :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-association-version/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-association-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-association-version/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/remaining-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-inventory-request-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-inventory-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-inventory-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-rule-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-rule :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm/owner-information (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-activations-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/describe-activations-filter))

(clojure.spec.alpha/def :portkey.aws.ssm/session-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/session))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-string-date-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-activations-filter/filter-key (clojure.spec.alpha/and :portkey.aws.ssm/describe-activations-filter-keys))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-activations-filter/filter-values (clojure.spec.alpha/and :portkey.aws.ssm/string-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-activations-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-activations-filter/filter-key :portkey.aws.ssm.describe-activations-filter/filter-values]))

(clojure.spec.alpha/def :portkey.aws.ssm.sub-type-count-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/sub-type-count-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.sub-type-count-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/associated-instances (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-for-patch-group-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/instance-patch-state-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-instance-patch-states-for-patch-group-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/patch-group] :opt-un [:portkey.aws.ssm.describe-instance-patch-states-for-patch-group-request/filters :portkey.aws.ssm/next-token :portkey.aws.ssm.describe-instance-patch-states-for-patch-group-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-output-folder (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.list-resource-compliance-summaries-result/resource-compliance-summary-items (clojure.spec.alpha/and :portkey.aws.ssm/resource-compliance-summary-item-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-resource-compliance-summaries-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-resource-compliance-summaries-result/resource-compliance-summary-items :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-role/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-role (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-role/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.s-3-output-location/output-s-3-region (clojure.spec.alpha/and :portkey.aws.ssm/s-3-region))
(clojure.spec.alpha/def :portkey.aws.ssm.s-3-output-location/output-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.s-3-output-location/output-s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.ssm/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm/s-3-output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.s-3-output-location/output-s-3-region :portkey.aws.ssm.s-3-output-location/output-s-3-bucket-name :portkey.aws.ssm.s-3-output-location/output-s-3-key-prefix]))

(clojure.spec.alpha/def :portkey.aws.ssm/fault #{:unknown :server :client "Unknown" "Server" "Client"})

(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/service-role-arn (clojure.spec.alpha/and :portkey.aws.ssm/service-role))
(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/instance-ids (clojure.spec.alpha/and :portkey.aws.ssm/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/output-s-3-bucket-name (clojure.spec.alpha/and :portkey.aws.ssm/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/output-s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.ssm/s-3-key-prefix))
(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/output-s-3-region (clojure.spec.alpha/and :portkey.aws.ssm/s-3-region))
(clojure.spec.alpha/def :portkey.aws.ssm.send-command-request/document-name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm/send-command-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.send-command-request/document-name] :opt-un [:portkey.aws.ssm.send-command-request/service-role-arn :portkey.aws.ssm.send-command-request/instance-ids :portkey.aws.ssm/comment :portkey.aws.ssm/timeout-seconds :portkey.aws.ssm/parameters :portkey.aws.ssm.send-command-request/output-s-3-bucket-name :portkey.aws.ssm/notification-config :portkey.aws.ssm/document-hash :portkey.aws.ssm/cloud-watch-output-config :portkey.aws.ssm/max-concurrency :portkey.aws.ssm/max-errors :portkey.aws.ssm/targets :portkey.aws.ssm.send-command-request/output-s-3-key-prefix :portkey.aws.ssm.send-command-request/output-s-3-region :portkey.aws.ssm/document-version :portkey.aws.ssm/document-hash-type]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-association/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-association/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-identity-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-identity))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-filter-value :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.ssm/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.ssm/create-association-batch-request-entries (clojure.spec.alpha/coll-of :portkey.aws.ssm/create-association-batch-request-entry :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.tag/key (clojure.spec.alpha/and :portkey.aws.ssm/tag-key))
(clojure.spec.alpha/def :portkey.aws.ssm.tag/value (clojure.spec.alpha/and :portkey.aws.ssm/tag-value))
(clojure.spec.alpha/def :portkey.aws.ssm/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.tag/key :portkey.aws.ssm.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/inventory-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-request/aggregators (clojure.spec.alpha/and :portkey.aws.ssm/inventory-aggregator-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-inventory-request/result-attributes (clojure.spec.alpha/and :portkey.aws.ssm/result-attribute-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-inventory-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-inventory-request/filters :portkey.aws.ssm.get-inventory-request/aggregators :portkey.aws.ssm.get-inventory-request/result-attributes :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-schedule (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9]{1,6}(\.[0-9]{1,6}){2,3}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(AWS|Custom):.*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/result-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/result-attribute :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.update-association-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-association-request/output-location (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/update-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/association-id] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm/parameters :portkey.aws.ssm/association-name :portkey.aws.ssm/targets :portkey.aws.ssm/schedule-expression :portkey.aws.ssm/document-version :portkey.aws.ssm.update-association-request/name :portkey.aws.ssm.update-association-request/output-location]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-key-values-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-parameters-result/parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-metadata-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-parameters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-parameters-result/parameters :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-compliance-data-state #{"INSTALLED_REJECTED" :not-applicable "INSTALLED_OTHER" "NOT_APPLICABLE" "INSTALLED" "FAILED" :missing "MISSING" :installed-rejected :installed :installed-other :failed})

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-already-exists-exception/sync-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-name))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-data-sync-already-exists-exception/sync-name]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-request/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-maintenance-window-execution-request/window-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task-invocation-parameters/run-command (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-run-command-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task-invocation-parameters/automation (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-automation-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task-invocation-parameters/step-functions (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-step-functions-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task-invocation-parameters/lambda (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-lambda-parameters))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-invocation-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-task-invocation-parameters/run-command :portkey.aws.ssm.maintenance-window-task-invocation-parameters/automation :portkey.aws.ssm.maintenance-window-task-invocation-parameters/step-functions :portkey.aws.ssm.maintenance-window-task-invocation-parameters/lambda]))

(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-result/window-target-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-target-id))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-result/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.update-maintenance-window-target-result/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm/update-maintenance-window-target-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.update-maintenance-window-target-result/window-id :portkey.aws.ssm.update-maintenance-window-target-result/window-target-id :portkey.aws.ssm/targets :portkey.aws.ssm/owner-information :portkey.aws.ssm.update-maintenance-window-target-result/name :portkey.aws.ssm.update-maintenance-window-target-result/description]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-inventory-group-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-inventory-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-inventory-group-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-allowed-pattern-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-allowed-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-allowed-pattern-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-items-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/compliance-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-items-request/resource-ids (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.list-compliance-items-request/resource-types (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-type-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-compliance-items-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-compliance-items-request/filters :portkey.aws.ssm.list-compliance-items-request/resource-ids :portkey.aws.ssm.list-compliance-items-request/resource-types :portkey.aws.ssm/next-token :portkey.aws.ssm/max-results]))

(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-filter-key #{:step-execution-status "StartTimeBefore" "StepExecutionStatus" "StepExecutionId" :step-execution-id :start-time-before "StartTimeAfter" :step-name "StepName" :action "Action" :start-time-after})

(clojure.spec.alpha/def :portkey.aws.ssm/document-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]{3,128}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.start-associations-once-request/association-ids (clojure.spec.alpha/and :portkey.aws.ssm/association-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/start-associations-once-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.start-associations-once-request/association-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-content-hash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm/ps-parameter-selector (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-step-functions-parameters/input (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-step-functions-input))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-step-functions-parameters/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-step-functions-name))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-step-functions-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-step-functions-parameters/input :portkey.aws.ssm.maintenance-window-step-functions-parameters/name]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-result-item-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-windows-for-target-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-identity-for-target))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-aggregator-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-aggregator-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-aggregator-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-patch-baseline-for-patch-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/patch-group] :opt-un [:portkey.aws.ssm/operating-system]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-type #{:lambda :step-functions "LAMBDA" :run-command "RUN_COMMAND" :automation "STEP_FUNCTIONS" "AUTOMATION"})

(clojure.spec.alpha/def :portkey.aws.ssm/output-source-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-allow-unassociated-targets clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm/invocation-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-parameters (clojure.spec.alpha/map-of :portkey.aws.ssm/session-manager-parameter-name :portkey.aws.ssm/session-manager-parameter-value-list))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/schema-version (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/capture-time (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-capture-time))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/content-hash (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-content-hash))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/content (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-entry-list))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item/context (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-content-context))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-item/type-name :portkey.aws.ssm.inventory-item/schema-version :portkey.aws.ssm.inventory-item/capture-time] :opt-un [:portkey.aws.ssm.inventory-item/content-hash :portkey.aws.ssm.inventory-item/content :portkey.aws.ssm.inventory-item/context]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-status-details (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 250))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-baselines-result/baseline-identities (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-identity-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-baselines-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-patch-baselines-result/baseline-identities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/command-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/command-filter :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-group-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/inventory-group :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameters-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-task-parameters))

(clojure.spec.alpha/def :portkey.aws.ssm/document-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"([$]LATEST|[$]DEFAULT|^[1-9][0-9]*$)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.target/key (clojure.spec.alpha/and :portkey.aws.ssm/target-key))
(clojure.spec.alpha/def :portkey.aws.ssm.target/values (clojure.spec.alpha/and :portkey.aws.ssm/target-values))
(clojure.spec.alpha/def :portkey.aws.ssm/target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.target/key :portkey.aws.ssm.target/values]))

(clojure.spec.alpha/def :portkey.aws.ssm/scheduled-window-execution-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/scheduled-window-execution))

(clojure.spec.alpha/def :portkey.aws.ssm.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-hash-type #{:sha-1 "Sha256" :sha-256 "Sha1"})

(clojure.spec.alpha/def :portkey.aws.ssm.delete-maintenance-window-result/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.delete-maintenance-window-result/window-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/valid-next-step-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/valid-next-step))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-execution-task-id))

(clojure.spec.alpha/def :portkey.aws.ssm/session-filter-key #{"InvokedBefore" "InvokedAfter" "Status" :invoked-before :invoked-after :status "Owner" :target "Target" :owner})

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm.document-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/document-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.document-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/document-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm/document-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.document-filter/key :portkey.aws.ssm.document-filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/resource-id (clojure.spec.alpha/and :portkey.aws.ssm/association-resource-id))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/last-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/execution-id (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/association-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-target/detailed-status (clojure.spec.alpha/and :portkey.aws.ssm/status-name))
(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm/output-source :portkey.aws.ssm/association-id :portkey.aws.ssm.association-execution-target/status :portkey.aws.ssm.association-execution-target/resource-id :portkey.aws.ssm.association-execution-target/last-execution-date :portkey.aws.ssm.association-execution-target/execution-id :portkey.aws.ssm.association-execution-target/resource-type :portkey.aws.ssm.association-execution-target/detailed-status]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-execution-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.ssm.delete-association-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-association-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.delete-association-request/name :portkey.aws.ssm/instance-id :portkey.aws.ssm/association-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/failed-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-failed-count))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/operation (clojure.spec.alpha/and :portkey.aws.ssm/patch-operation-type))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/installed-other-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-installed-other-count))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/operation-start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/not-applicable-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-not-applicable-count))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/operation-end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/installed-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-installed-count))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/installed-rejected-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-installed-rejected-count))
(clojure.spec.alpha/def :portkey.aws.ssm.instance-patch-state/missing-count (clojure.spec.alpha/and :portkey.aws.ssm/patch-missing-count))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm/patch-group :portkey.aws.ssm/baseline-id :portkey.aws.ssm.instance-patch-state/operation-start-time :portkey.aws.ssm.instance-patch-state/operation-end-time :portkey.aws.ssm.instance-patch-state/operation] :opt-un [:portkey.aws.ssm.instance-patch-state/failed-count :portkey.aws.ssm.instance-patch-state/installed-other-count :portkey.aws.ssm.instance-patch-state/not-applicable-count :portkey.aws.ssm/install-override-list :portkey.aws.ssm/owner-information :portkey.aws.ssm.instance-patch-state/installed-count :portkey.aws.ssm.instance-patch-state/installed-rejected-count :portkey.aws.ssm.instance-patch-state/missing-count :portkey.aws.ssm/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.register-target-with-maintenance-window-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.register-target-with-maintenance-window-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.register-target-with-maintenance-window-request/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.register-target-with-maintenance-window-request/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm/register-target-with-maintenance-window-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.register-target-with-maintenance-window-request/window-id :portkey.aws.ssm.register-target-with-maintenance-window-request/resource-type :portkey.aws.ssm/targets] :opt-un [:portkey.aws.ssm/owner-information :portkey.aws.ssm.register-target-with-maintenance-window-request/name :portkey.aws.ssm.register-target-with-maintenance-window-request/description :portkey.aws.ssm/client-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.association/overview (clojure.spec.alpha/and :portkey.aws.ssm/association-overview))
(clojure.spec.alpha/def :portkey.aws.ssm.association/last-execution-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.association/name (clojure.spec.alpha/and :portkey.aws.ssm/document-name))
(clojure.spec.alpha/def :portkey.aws.ssm/association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/association-version :portkey.aws.ssm/instance-id :portkey.aws.ssm/association-id :portkey.aws.ssm.association/overview :portkey.aws.ssm.association/last-execution-date :portkey.aws.ssm/association-name :portkey.aws.ssm/targets :portkey.aws.ssm/schedule-expression :portkey.aws.ssm/document-version :portkey.aws.ssm.association/name]))

(clojure.spec.alpha/def :portkey.aws.ssm.delete-parameters-request/names (clojure.spec.alpha/and :portkey.aws.ssm/parameter-name-list))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-parameters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.delete-parameters-request/names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/session-manager-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-product-family (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/rejected-patches-action (clojure.spec.alpha/and :portkey.aws.ssm/patch-action))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/global-filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-filter-group))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/approved-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/description (clojure.spec.alpha/and :portkey.aws.ssm/baseline-description))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/approved-patches-enable-non-security (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/approval-rules (clojure.spec.alpha/and :portkey.aws.ssm/patch-rule-group))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/approved-patches-compliance-level (clojure.spec.alpha/and :portkey.aws.ssm/patch-compliance-level))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/name (clojure.spec.alpha/and :portkey.aws.ssm/baseline-name))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/sources (clojure.spec.alpha/and :portkey.aws.ssm/patch-source-list))
(clojure.spec.alpha/def :portkey.aws.ssm.create-patch-baseline-request/rejected-patches (clojure.spec.alpha/and :portkey.aws.ssm/patch-id-list))
(clojure.spec.alpha/def :portkey.aws.ssm/create-patch-baseline-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.create-patch-baseline-request/name] :opt-un [:portkey.aws.ssm.create-patch-baseline-request/rejected-patches-action :portkey.aws.ssm.create-patch-baseline-request/global-filters :portkey.aws.ssm.create-patch-baseline-request/approved-patches :portkey.aws.ssm.create-patch-baseline-request/description :portkey.aws.ssm.create-patch-baseline-request/approved-patches-enable-non-security :portkey.aws.ssm.create-patch-baseline-request/approval-rules :portkey.aws.ssm.create-patch-baseline-request/approved-patches-compliance-level :portkey.aws.ssm.create-patch-baseline-request/sources :portkey.aws.ssm/operating-system :portkey.aws.ssm.create-patch-baseline-request/rejected-patches :portkey.aws.ssm/client-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-parameter-type #{"StringList" :string-list :string "String"})

(clojure.spec.alpha/def :portkey.aws.ssm/describe-activations-filter-keys #{"ActivationIds" :iam-role :default-instance-name "IamRole" "DefaultInstanceName" :activation-ids})

(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-groups-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-patch-groups-request/max-results :portkey.aws.ssm.describe-patch-groups-request/filters :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-request/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-task-request/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-maintenance-window-task-request/window-id :portkey.aws.ssm.get-maintenance-window-task-request/window-task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/resource-count-by-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-summary-item/compliance-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-summary-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.compliance-summary-item/compliance-type :portkey.aws.ssm/compliant-summary :portkey.aws.ssm/non-compliant-summary]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-execution-tasks-result/window-execution-task-identities (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-identity-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-execution-tasks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-execution-tasks-result/window-execution-task-identities :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-available-patches-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-available-patches-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-available-patches-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-available-patches-request/filters :portkey.aws.ssm.describe-available-patches-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/terminate-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/session-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/command-plugin-status #{:timed-out "Failed" "Cancelled" :in-progress :pending "TimedOut" "Success" :cancelled :success "InProgress" "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameter-history-result/parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-history-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameter-history-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-parameter-history-result/parameters :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-timezone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-title (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.session/details (clojure.spec.alpha/and :portkey.aws.ssm/session-details))
(clojure.spec.alpha/def :portkey.aws.ssm.session/end-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.session/output-url (clojure.spec.alpha/and :portkey.aws.ssm/session-manager-output-url))
(clojure.spec.alpha/def :portkey.aws.ssm.session/status (clojure.spec.alpha/and :portkey.aws.ssm/session-status))
(clojure.spec.alpha/def :portkey.aws.ssm.session/owner (clojure.spec.alpha/and :portkey.aws.ssm/session-owner))
(clojure.spec.alpha/def :portkey.aws.ssm.session/target (clojure.spec.alpha/and :portkey.aws.ssm/session-target))
(clojure.spec.alpha/def :portkey.aws.ssm.session/start-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm/session (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/session-id :portkey.aws.ssm.session/details :portkey.aws.ssm.session/end-date :portkey.aws.ssm.session/output-url :portkey.aws.ssm.session/status :portkey.aws.ssm.session/owner :portkey.aws.ssm/document-name :portkey.aws.ssm.session/target :portkey.aws.ssm.session/start-date]))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-associations-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id] :opt-un [:portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/activation-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-baselines-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/patch-orchestrator-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.describe-patch-baselines-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-patch-baselines-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-patch-baselines-request/filters :portkey.aws.ssm.describe-patch-baselines-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/is-sub-type-schema clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-maintenance-window-schedule-result/scheduled-window-executions (clojure.spec.alpha/and :portkey.aws.ssm/scheduled-window-execution-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-maintenance-window-schedule-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-maintenance-window-schedule-result/scheduled-window-executions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/describe-instance-information-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-information-list :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/ps-parameter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.ssm/activation-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/activation))

(clojure.spec.alpha/def :portkey.aws.ssm.instance-association-output-location/s-3-location (clojure.spec.alpha/and :portkey.aws.ssm/s-3-output-location))
(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.instance-association-output-location/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.ssm.session-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/session-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.session-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/session-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm/session-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.session-filter/key :portkey.aws.ssm.session-filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.add-tags-to-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/resource-type-for-tagging))
(clojure.spec.alpha/def :portkey.aws.ssm.add-tags-to-resource-request/tags (clojure.spec.alpha/and :portkey.aws.ssm/tag-list))
(clojure.spec.alpha/def :portkey.aws.ssm/add-tags-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.add-tags-to-resource-request/resource-type :portkey.aws.ssm/resource-id :portkey.aws.ssm.add-tags-to-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-automation-parameters/parameters (clojure.spec.alpha/and :portkey.aws.ssm/automation-parameter-map))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-automation-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/document-version :portkey.aws.ssm.maintenance-window-automation-parameters/parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/compliance-resource-id :min-count 1))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-instance-id/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-instance-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-instance-id/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/association-status-aggregated-count (clojure.spec.alpha/map-of :portkey.aws.ssm/status-name :portkey.aws.ssm/instance-count))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-capture-time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(20)[0-9][0-9]-(0[1-9]|1[012])-([12][0-9]|3[01]|0[1-9])(T)(2[0-3]|[0-1][0-9])(:[0-5][0-9])(:[0-5][0-9])(Z)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-permission-type/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-permission-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-permission-type/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-update/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-update/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.put-inventory-request/items (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-list))
(clojure.spec.alpha/def :portkey.aws.ssm/put-inventory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm.put-inventory-request/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/task-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-execution-task-identity/task-type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-task-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-execution-task-identity/window-execution-id :portkey.aws.ssm.maintenance-window-execution-task-identity/task-execution-id :portkey.aws.ssm.maintenance-window-execution-task-identity/status :portkey.aws.ssm.maintenance-window-execution-task-identity/status-details :portkey.aws.ssm.maintenance-window-execution-task-identity/start-time :portkey.aws.ssm.maintenance-window-execution-task-identity/end-time :portkey.aws.ssm.maintenance-window-execution-task-identity/task-arn :portkey.aws.ssm.maintenance-window-execution-task-identity/task-type]))

(clojure.spec.alpha/def :portkey.aws.ssm/failed-create-association-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/failed-create-association))

(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-targets-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-targets-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.association-execution-targets-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-targets-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-targets-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.association-execution-targets-filter/key :portkey.aws.ssm.association-execution-targets-filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/baseline-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ssm/invalid-output-location (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/resume-session-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/session-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/deregister-managed-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-effective-instance-associations-result/associations (clojure.spec.alpha/and :portkey.aws.ssm/instance-association-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-effective-instance-associations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-effective-instance-associations-result/associations :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{4}\-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-query-operator-type #{"BEGIN_WITH" "GREATER_THAN" :less-than :greater-than "LESS_THAN" :not-equal :begin-with "EQUAL" :equal "NOT_EQUAL"})

(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.ssm/target-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-summary-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/execution-start-date-time (clojure.spec.alpha/and :portkey.aws.ssm/string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/plugin-name (clojure.spec.alpha/and :portkey.aws.ssm/command-plugin-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/execution-elapsed-time (clojure.spec.alpha/and :portkey.aws.ssm/string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/status (clojure.spec.alpha/and :portkey.aws.ssm/command-invocation-status))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/standard-output-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/execution-end-date-time (clojure.spec.alpha/and :portkey.aws.ssm/string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-command-invocation-result/standard-error-url (clojure.spec.alpha/and :portkey.aws.ssm/url))
(clojure.spec.alpha/def :portkey.aws.ssm/get-command-invocation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm.get-command-invocation-result/execution-start-date-time :portkey.aws.ssm/comment :portkey.aws.ssm.get-command-invocation-result/plugin-name :portkey.aws.ssm.get-command-invocation-result/execution-elapsed-time :portkey.aws.ssm/response-code :portkey.aws.ssm.get-command-invocation-result/status :portkey.aws.ssm/status-details :portkey.aws.ssm/standard-output-content :portkey.aws.ssm/cloud-watch-output-config :portkey.aws.ssm.get-command-invocation-result/standard-output-url :portkey.aws.ssm/command-id :portkey.aws.ssm.get-command-invocation-result/execution-end-date-time :portkey.aws.ssm/document-name :portkey.aws.ssm/document-version :portkey.aws.ssm.get-command-invocation-result/standard-error-url :portkey.aws.ssm/standard-error-content]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-version-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/document-version-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-version-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.ssm.register-task-with-maintenance-window-result/window-task-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm/register-task-with-maintenance-window-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.register-task-with-maintenance-window-result/window-task-id]))

(clojure.spec.alpha/def :portkey.aws.ssm.document-already-exists/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/document-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.document-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/register-default-patch-baseline-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id]))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-filter-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/patch-filter :min-count 0 :max-count 4))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/token-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-attribute/name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-attribute-name))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-item-attribute/data-type (clojure.spec.alpha/and :portkey.aws.ssm/inventory-attribute-data-type))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-item-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.inventory-item-attribute/name :portkey.aws.ssm.inventory-item-attribute/data-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-source-product (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ssm/computer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-operator-type #{"NotEqual" :less-than "Equal" "LessThan" :greater-than "GreaterThan" :not-equal :equal})

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-task-parameter-value-expression/values (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameter-value-list))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameter-value-expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-task-parameter-value-expression/values]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-map-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/target-map-value :min-count 0 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.ssm.automation-execution-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/automation-execution-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.automation-execution-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\p{L}\p{Z}\p{N}_.:/=\-@]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-inventory-deletions-result/inventory-deletions (clojure.spec.alpha/and :portkey.aws.ssm/inventory-deletions-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-inventory-deletions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.describe-inventory-deletions-result/inventory-deletions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/instance-id :portkey.aws.ssm/snapshot-id :portkey.aws.ssm/snapshot-download-url :portkey.aws.ssm/product]))

(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-summary-item/version (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-schema-version))
(clojure.spec.alpha/def :portkey.aws.ssm.inventory-deletion-summary-item/count (clojure.spec.alpha/and :portkey.aws.ssm/resource-count))
(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-summary-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.inventory-deletion-summary-item/version :portkey.aws.ssm.inventory-deletion-summary-item/count :portkey.aws.ssm/remaining-count]))

(clojure.spec.alpha/def :portkey.aws.ssm/send-command-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/command]))

(clojure.spec.alpha/def :portkey.aws.ssm/automation-parameter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/automation-parameter-value :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item-details (clojure.spec.alpha/map-of :portkey.aws.ssm/attribute-name :portkey.aws.ssm/attribute-value))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameter-value-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/maintenance-window-task-parameter-value))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-string-filter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/task-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-task-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/end-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/type (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-type))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/start-time (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/status (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/status-details (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/priority (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-priority))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/window-execution-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-execution-id))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/task-arn (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-arn))
(clojure.spec.alpha/def :portkey.aws.ssm.get-maintenance-window-execution-task-result/task-parameters (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-task-parameters-list))
(clojure.spec.alpha/def :portkey.aws.ssm/get-maintenance-window-execution-task-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.get-maintenance-window-execution-task-result/task-execution-id :portkey.aws.ssm/service-role :portkey.aws.ssm.get-maintenance-window-execution-task-result/end-time :portkey.aws.ssm.get-maintenance-window-execution-task-result/type :portkey.aws.ssm.get-maintenance-window-execution-task-result/start-time :portkey.aws.ssm.get-maintenance-window-execution-task-result/status :portkey.aws.ssm.get-maintenance-window-execution-task-result/status-details :portkey.aws.ssm.get-maintenance-window-execution-task-result/priority :portkey.aws.ssm/max-concurrency :portkey.aws.ssm.get-maintenance-window-execution-task-result/window-execution-id :portkey.aws.ssm.get-maintenance-window-execution-task-result/task-arn :portkey.aws.ssm/max-errors :portkey.aws.ssm.get-maintenance-window-execution-task-result/task-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm.item-size-limit-exceeded-exception/type-name (clojure.spec.alpha/and :portkey.aws.ssm/inventory-item-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.item-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/item-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.item-size-limit-exceeded-exception/type-name :portkey.aws.ssm.item-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/last-resource-data-sync-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm.patch/kb-number (clojure.spec.alpha/and :portkey.aws.ssm/patch-kb-number))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/product (clojure.spec.alpha/and :portkey.aws.ssm/patch-product))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/msrc-number (clojure.spec.alpha/and :portkey.aws.ssm/patch-msrc-number))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/title (clojure.spec.alpha/and :portkey.aws.ssm/patch-title))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/msrc-severity (clojure.spec.alpha/and :portkey.aws.ssm/patch-msrc-severity))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/product-family (clojure.spec.alpha/and :portkey.aws.ssm/patch-product-family))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/description (clojure.spec.alpha/and :portkey.aws.ssm/patch-description))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/release-date (clojure.spec.alpha/and :portkey.aws.ssm/date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/classification (clojure.spec.alpha/and :portkey.aws.ssm/patch-classification))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/content-url (clojure.spec.alpha/and :portkey.aws.ssm/patch-content-url))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/language (clojure.spec.alpha/and :portkey.aws.ssm/patch-language))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/vendor (clojure.spec.alpha/and :portkey.aws.ssm/patch-vendor))
(clojure.spec.alpha/def :portkey.aws.ssm.patch/id (clojure.spec.alpha/and :portkey.aws.ssm/patch-id))
(clojure.spec.alpha/def :portkey.aws.ssm/patch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.patch/kb-number :portkey.aws.ssm.patch/product :portkey.aws.ssm.patch/msrc-number :portkey.aws.ssm.patch/title :portkey.aws.ssm.patch/msrc-severity :portkey.aws.ssm.patch/product-family :portkey.aws.ssm.patch/description :portkey.aws.ssm.patch/release-date :portkey.aws.ssm.patch/classification :portkey.aws.ssm.patch/content-url :portkey.aws.ssm.patch/language :portkey.aws.ssm.patch/vendor :portkey.aws.ssm.patch/id]))

(clojure.spec.alpha/def :portkey.aws.ssm.list-document-versions-result/document-versions (clojure.spec.alpha/and :portkey.aws.ssm/document-version-list))
(clojure.spec.alpha/def :portkey.aws.ssm/list-document-versions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.list-document-versions-result/document-versions :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/max-results-ec-2-compatible (clojure.spec.alpha/int-in 5 50))

(clojure.spec.alpha/def :portkey.aws.ssm/association-execution-targets-filter-key #{:resource-id "Status" "ResourceId" :status "ResourceType" :resource-type})

(clojure.spec.alpha/def :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/baseline-id :portkey.aws.ssm/patch-group]))

(clojure.spec.alpha/def :portkey.aws.ssm.patch-group-patch-baseline-mapping/baseline-identity (clojure.spec.alpha/and :portkey.aws.ssm/patch-baseline-identity))
(clojure.spec.alpha/def :portkey.aws.ssm/patch-group-patch-baseline-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/patch-group :portkey.aws.ssm.patch-group-patch-baseline-mapping/baseline-identity]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-information-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-information))

(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/severity (clojure.spec.alpha/and :portkey.aws.ssm/compliance-severity))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/details (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-details))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/title (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-title))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/status (clojure.spec.alpha/and :portkey.aws.ssm/compliance-status))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/resource-id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-id))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/execution-summary (clojure.spec.alpha/and :portkey.aws.ssm/compliance-execution-summary))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/resource-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-resource-type))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/compliance-type (clojure.spec.alpha/and :portkey.aws.ssm/compliance-type-name))
(clojure.spec.alpha/def :portkey.aws.ssm.compliance-item/id (clojure.spec.alpha/and :portkey.aws.ssm/compliance-item-id))
(clojure.spec.alpha/def :portkey.aws.ssm/compliance-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.compliance-item/severity :portkey.aws.ssm.compliance-item/details :portkey.aws.ssm.compliance-item/title :portkey.aws.ssm.compliance-item/status :portkey.aws.ssm.compliance-item/resource-id :portkey.aws.ssm.compliance-item/execution-summary :portkey.aws.ssm.compliance-item/resource-type :portkey.aws.ssm.compliance-item/compliance-type :portkey.aws.ssm.compliance-item/id]))

(clojure.spec.alpha/def :portkey.aws.ssm/operating-system #{"AMAZON_LINUX_2" :windows "WINDOWS" "CENTOS" :amazon-linux-2 :suse :centos "REDHAT_ENTERPRISE_LINUX" "AMAZON_LINUX" "UBUNTU" "SUSE" :redhat-enterprise-linux :amazon-linux :ubuntu})

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-next-token/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/document-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/document-identifier))

(clojure.spec.alpha/def :portkey.aws.ssm.association-filter/key (clojure.spec.alpha/and :portkey.aws.ssm/association-filter-key))
(clojure.spec.alpha/def :portkey.aws.ssm.association-filter/value (clojure.spec.alpha/and :portkey.aws.ssm/association-filter-value))
(clojure.spec.alpha/def :portkey.aws.ssm/association-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.association-filter/key :portkey.aws.ssm.association-filter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ssm/update-managed-instance-role-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-association-executions-request/filters (clojure.spec.alpha/and :portkey.aws.ssm/association-execution-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-association-executions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/association-id] :opt-un [:portkey.aws.ssm.describe-association-executions-request/filters :portkey.aws.ssm/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/notification-event-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/notification-event))

(clojure.spec.alpha/def :portkey.aws.ssm/step-execution-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/step-execution))

(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-request/path (clojure.spec.alpha/and :portkey.aws.ssm/ps-parameter-name))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-request/recursive (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-request/parameter-filters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-string-filter-list))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-request/with-decryption (clojure.spec.alpha/and :portkey.aws.ssm/boolean))
(clojure.spec.alpha/def :portkey.aws.ssm.get-parameters-by-path-request/max-results (clojure.spec.alpha/and :portkey.aws.ssm/get-parameters-by-path-max-results))
(clojure.spec.alpha/def :portkey.aws.ssm/get-parameters-by-path-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.get-parameters-by-path-request/path] :opt-un [:portkey.aws.ssm.get-parameters-by-path-request/recursive :portkey.aws.ssm.get-parameters-by-path-request/parameter-filters :portkey.aws.ssm.get-parameters-by-path-request/with-decryption :portkey.aws.ssm.get-parameters-by-path-request/max-results :portkey.aws.ssm/next-token]))

(clojure.spec.alpha/def :portkey.aws.ssm/instance-association-status-aggregated-count (clojure.spec.alpha/map-of :portkey.aws.ssm/status-name :portkey.aws.ssm/instance-count))

(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/window-id (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-id))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/end-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/enabled (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-enabled))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/next-execution-time (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/description (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-description))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/duration (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-duration-hours))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/cutoff (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-cutoff))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/schedule (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-schedule))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/name (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-name))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/start-date (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-string-date-time))
(clojure.spec.alpha/def :portkey.aws.ssm.maintenance-window-identity/schedule-timezone (clojure.spec.alpha/and :portkey.aws.ssm/maintenance-window-timezone))
(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.maintenance-window-identity/window-id :portkey.aws.ssm.maintenance-window-identity/end-date :portkey.aws.ssm.maintenance-window-identity/enabled :portkey.aws.ssm.maintenance-window-identity/next-execution-time :portkey.aws.ssm.maintenance-window-identity/description :portkey.aws.ssm.maintenance-window-identity/duration :portkey.aws.ssm.maintenance-window-identity/cutoff :portkey.aws.ssm.maintenance-window-identity/schedule :portkey.aws.ssm.maintenance-window-identity/name :portkey.aws.ssm.maintenance-window-identity/start-date :portkey.aws.ssm.maintenance-window-identity/schedule-timezone]))

(clojure.spec.alpha/def :portkey.aws.ssm/snapshot-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 36 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 36)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ssm/get-default-patch-baseline-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm/operating-system]))

(clojure.spec.alpha/def :portkey.aws.ssm/registration-limit (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.ssm/parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/add-tags-to-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm.create-activation-request/description (clojure.spec.alpha/and :portkey.aws.ssm/activation-description))
(clojure.spec.alpha/def :portkey.aws.ssm/create-activation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm/iam-role] :opt-un [:portkey.aws.ssm.create-activation-request/description :portkey.aws.ssm/default-instance-name :portkey.aws.ssm/registration-limit :portkey.aws.ssm/expiration-date]))

(clojure.spec.alpha/def :portkey.aws.ssm.invalid-document-schema-version/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/invalid-document-schema-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.invalid-document-schema-version/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/standard-error-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8000))))

(clojure.spec.alpha/def :portkey.aws.ssm/modify-document-permission-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ssm/association-filter-operator-type #{"GREATER_THAN" :less-than :greater-than "LESS_THAN" "EQUAL" :equal})

(clojure.spec.alpha/def :portkey.aws.ssm/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ssm/patch-operation-type #{:install "Scan" "Install" :scan})

(clojure.spec.alpha/def :portkey.aws.ssm.parameter-version-not-found/message (clojure.spec.alpha/and :portkey.aws.ssm/string))
(clojure.spec.alpha/def :portkey.aws.ssm/parameter-version-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.parameter-version-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.ssm/target-values (clojure.spec.alpha/coll-of :portkey.aws.ssm/target-value :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ssm/patch-kb-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-attribute-data-type #{"string" :number :string "number"})

(clojure.spec.alpha/def :portkey.aws.ssm/instance-patch-state-list (clojure.spec.alpha/coll-of :portkey.aws.ssm/instance-patch-state))

(clojure.spec.alpha/def :portkey.aws.ssm/target-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-task-parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.ssm/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ssm.delete-parameters-result/deleted-parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-name-list))
(clojure.spec.alpha/def :portkey.aws.ssm.delete-parameters-result/invalid-parameters (clojure.spec.alpha/and :portkey.aws.ssm/parameter-name-list))
(clojure.spec.alpha/def :portkey.aws.ssm/delete-parameters-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.delete-parameters-result/deleted-parameters :portkey.aws.ssm.delete-parameters-result/invalid-parameters]))

(clojure.spec.alpha/def :portkey.aws.ssm/inventory-deletion-last-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ssm.describe-document-request/name (clojure.spec.alpha/and :portkey.aws.ssm/document-arn))
(clojure.spec.alpha/def :portkey.aws.ssm/describe-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ssm.describe-document-request/name] :opt-un [:portkey.aws.ssm/document-version]))

(clojure.spec.alpha/def :portkey.aws.ssm.resource-data-sync-not-found-exception/sync-name (clojure.spec.alpha/and :portkey.aws.ssm/resource-data-sync-name))
(clojure.spec.alpha/def :portkey.aws.ssm/resource-data-sync-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ssm.resource-data-sync-not-found-exception/sync-name]))

(clojure.spec.alpha/def :portkey.aws.ssm/maintenance-window-resource-type #{"INSTANCE" :instance})

(clojure.core/defn cancel-maintenance-window-execution ([cancel-maintenance-window-execution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-cancel-maintenance-window-execution-request cancel-maintenance-window-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/cancel-maintenance-window-execution-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/cancel-maintenance-window-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelMaintenanceWindowExecution", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception}})))))
(clojure.spec.alpha/fdef cancel-maintenance-window-execution :args (clojure.spec.alpha/tuple :portkey.aws.ssm/cancel-maintenance-window-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/cancel-maintenance-window-execution-result))

(clojure.core/defn update-maintenance-window-task ([update-maintenance-window-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-maintenance-window-task-request update-maintenance-window-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-maintenance-window-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-maintenance-window-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMaintenanceWindowTask", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef update-maintenance-window-task :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-maintenance-window-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-maintenance-window-task-result))

(clojure.core/defn delete-activation ([delete-activation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-activation-request delete-activation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-activation-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-activation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteActivation", :http.request.spec/error-spec {"InvalidActivationId" :portkey.aws.ssm/invalid-activation-id, "InvalidActivation" :portkey.aws.ssm/invalid-activation, "InternalServerError" :portkey.aws.ssm/internal-server-error, "TooManyUpdates" :portkey.aws.ssm/too-many-updates}})))))
(clojure.spec.alpha/fdef delete-activation :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-activation-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-activation-result))

(clojure.core/defn describe-patch-group-state ([describe-patch-group-state-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-patch-group-state-request describe-patch-group-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-patch-group-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-patch-group-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePatchGroupState", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-patch-group-state :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-patch-group-state-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-patch-group-state-result))

(clojure.core/defn cancel-command ([cancel-command-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-cancel-command-request cancel-command-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/cancel-command-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/cancel-command-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelCommand", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidCommandId" :portkey.aws.ssm/invalid-command-id, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "DuplicateInstanceId" :portkey.aws.ssm/duplicate-instance-id}})))))
(clojure.spec.alpha/fdef cancel-command :args (clojure.spec.alpha/tuple :portkey.aws.ssm/cancel-command-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/cancel-command-result))

(clojure.core/defn describe-document ([describe-document-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-document-request describe-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-document-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDocument", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version}})))))
(clojure.spec.alpha/fdef describe-document :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-document-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-document-result))

(clojure.core/defn get-default-patch-baseline ([] (get-default-patch-baseline {})) ([get-default-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-default-patch-baseline-request get-default-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-default-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-default-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDefaultPatchBaseline", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-default-patch-baseline :args (clojure.spec.alpha/? :portkey.aws.ssm/get-default-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-default-patch-baseline-result))

(clojure.core/defn describe-inventory-deletions ([] (describe-inventory-deletions {})) ([describe-inventory-deletions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-inventory-deletions-request describe-inventory-deletions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-inventory-deletions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-inventory-deletions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInventoryDeletions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDeletionIdException" :portkey.aws.ssm/invalid-deletion-id-exception, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-inventory-deletions :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-inventory-deletions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-inventory-deletions-result))

(clojure.core/defn get-maintenance-window-task ([get-maintenance-window-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-maintenance-window-task-request get-maintenance-window-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-maintenance-window-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-maintenance-window-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMaintenanceWindowTask", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-maintenance-window-task :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-maintenance-window-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-maintenance-window-task-result))

(clojure.core/defn register-default-patch-baseline ([register-default-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-default-patch-baseline-request register-default-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/register-default-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/register-default-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterDefaultPatchBaseline", :http.request.spec/error-spec {"InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef register-default-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/register-default-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/register-default-patch-baseline-result))

(clojure.core/defn put-inventory ([put-inventory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-inventory-request put-inventory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/put-inventory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/put-inventory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutInventory", :http.request.spec/error-spec {"InvalidTypeNameException" :portkey.aws.ssm/invalid-type-name-exception, "ItemContentMismatchException" :portkey.aws.ssm/item-content-mismatch-exception, "UnsupportedInventoryItemContextException" :portkey.aws.ssm/unsupported-inventory-item-context-exception, "TotalSizeLimitExceededException" :portkey.aws.ssm/total-size-limit-exceeded-exception, "CustomSchemaCountLimitExceededException" :portkey.aws.ssm/custom-schema-count-limit-exceeded-exception, "UnsupportedInventorySchemaVersionException" :portkey.aws.ssm/unsupported-inventory-schema-version-exception, "InvalidItemContentException" :portkey.aws.ssm/invalid-item-content-exception, "InvalidInventoryItemContextException" :portkey.aws.ssm/invalid-inventory-item-context-exception, "SubTypeCountLimitExceededException" :portkey.aws.ssm/sub-type-count-limit-exceeded-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "ItemSizeLimitExceededException" :portkey.aws.ssm/item-size-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-inventory :args (clojure.spec.alpha/tuple :portkey.aws.ssm/put-inventory-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/put-inventory-result))

(clojure.core/defn send-automation-signal ([send-automation-signal-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-automation-signal-request send-automation-signal-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/send-automation-signal-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/send-automation-signal-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendAutomationSignal", :http.request.spec/error-spec {"AutomationExecutionNotFoundException" :portkey.aws.ssm/automation-execution-not-found-exception, "AutomationStepNotFoundException" :portkey.aws.ssm/automation-step-not-found-exception, "InvalidAutomationSignalException" :portkey.aws.ssm/invalid-automation-signal-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef send-automation-signal :args (clojure.spec.alpha/tuple :portkey.aws.ssm/send-automation-signal-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/send-automation-signal-result))

(clojure.core/defn get-document ([get-document-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-document-request get-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-document-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDocument", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version}})))))
(clojure.spec.alpha/fdef get-document :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-document-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-document-result))

(clojure.core/defn describe-maintenance-windows ([] (describe-maintenance-windows {})) ([describe-maintenance-windows-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-windows-request describe-maintenance-windows-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-windows-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-windows-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindows", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-windows :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-maintenance-windows-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-windows-result))

(clojure.core/defn put-compliance-items ([put-compliance-items-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-compliance-items-request put-compliance-items-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/put-compliance-items-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/put-compliance-items-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutComplianceItems", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidItemContentException" :portkey.aws.ssm/invalid-item-content-exception, "TotalSizeLimitExceededException" :portkey.aws.ssm/total-size-limit-exceeded-exception, "ItemSizeLimitExceededException" :portkey.aws.ssm/item-size-limit-exceeded-exception, "ComplianceTypeCountLimitExceededException" :portkey.aws.ssm/compliance-type-count-limit-exceeded-exception, "InvalidResourceType" :portkey.aws.ssm/invalid-resource-type, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id}})))))
(clojure.spec.alpha/fdef put-compliance-items :args (clojure.spec.alpha/tuple :portkey.aws.ssm/put-compliance-items-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/put-compliance-items-result))

(clojure.core/defn describe-patch-baselines ([] (describe-patch-baselines {})) ([describe-patch-baselines-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-patch-baselines-request describe-patch-baselines-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-patch-baselines-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-patch-baselines-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePatchBaselines", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-patch-baselines :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-patch-baselines-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-patch-baselines-result))

(clojure.core/defn get-parameters-by-path ([get-parameters-by-path-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-parameters-by-path-request get-parameters-by-path-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-parameters-by-path-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-parameters-by-path-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetParametersByPath", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidFilterOption" :portkey.aws.ssm/invalid-filter-option, "InvalidFilterValue" :portkey.aws.ssm/invalid-filter-value, "InvalidKeyId" :portkey.aws.ssm/invalid-key-id, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef get-parameters-by-path :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-parameters-by-path-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-parameters-by-path-result))

(clojure.core/defn get-deployable-patch-snapshot-for-instance ([get-deployable-patch-snapshot-for-instance-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-deployable-patch-snapshot-for-instance-request get-deployable-patch-snapshot-for-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeployablePatchSnapshotForInstance", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "UnsupportedOperatingSystem" :portkey.aws.ssm/unsupported-operating-system}})))))
(clojure.spec.alpha/fdef get-deployable-patch-snapshot-for-instance :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-deployable-patch-snapshot-for-instance-result))

(clojure.core/defn get-maintenance-window ([get-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-maintenance-window-request get-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMaintenanceWindow", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-maintenance-window-result))

(clojure.core/defn create-association-batch ([create-association-batch-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-association-batch-request create-association-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-association-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-association-batch-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssociationBatch", :http.request.spec/error-spec {"InvalidSchedule" :portkey.aws.ssm/invalid-schedule, "AssociationLimitExceeded" :portkey.aws.ssm/association-limit-exceeded, "DuplicateInstanceId" :portkey.aws.ssm/duplicate-instance-id, "UnsupportedPlatformType" :portkey.aws.ssm/unsupported-platform-type, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidParameters" :portkey.aws.ssm/invalid-parameters, "InvalidTarget" :portkey.aws.ssm/invalid-target, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidOutputLocation" :portkey.aws.ssm/invalid-output-location}})))))
(clojure.spec.alpha/fdef create-association-batch :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-association-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-association-batch-result))

(clojure.core/defn describe-maintenance-window-tasks ([describe-maintenance-window-tasks-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-tasks-request describe-maintenance-window-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-tasks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowTasks", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-tasks :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-window-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-tasks-result))

(clojure.core/defn register-task-with-maintenance-window ([register-task-with-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-task-with-maintenance-window-request register-task-with-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/register-task-with-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/register-task-with-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterTaskWithMaintenanceWindow", :http.request.spec/error-spec {"IdempotentParameterMismatch" :portkey.aws.ssm/idempotent-parameter-mismatch, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "ResourceLimitExceededException" :portkey.aws.ssm/resource-limit-exceeded-exception, "FeatureNotAvailableException" :portkey.aws.ssm/feature-not-available-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef register-task-with-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/register-task-with-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/register-task-with-maintenance-window-result))

(clojure.core/defn deregister-patch-baseline-for-patch-group ([deregister-patch-baseline-for-patch-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-patch-baseline-for-patch-group-request deregister-patch-baseline-for-patch-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterPatchBaselineForPatchGroup", :http.request.spec/error-spec {"InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef deregister-patch-baseline-for-patch-group :args (clojure.spec.alpha/tuple :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/deregister-patch-baseline-for-patch-group-result))

(clojure.core/defn list-commands ([] (list-commands {})) ([list-commands-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-commands-request list-commands-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-commands-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-commands-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCommands", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidCommandId" :portkey.aws.ssm/invalid-command-id, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-commands :args (clojure.spec.alpha/? :portkey.aws.ssm/list-commands-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-commands-result))

(clojure.core/defn update-patch-baseline ([update-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-patch-baseline-request update-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePatchBaseline", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef update-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-patch-baseline-result))

(clojure.core/defn update-maintenance-window-target ([update-maintenance-window-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-maintenance-window-target-request update-maintenance-window-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-maintenance-window-target-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-maintenance-window-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMaintenanceWindowTarget", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef update-maintenance-window-target :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-maintenance-window-target-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-maintenance-window-target-result))

(clojure.core/defn delete-resource-data-sync ([delete-resource-data-sync-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-resource-data-sync-request delete-resource-data-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-resource-data-sync-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-resource-data-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteResourceDataSync", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "ResourceDataSyncNotFoundException" :portkey.aws.ssm/resource-data-sync-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-resource-data-sync :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-resource-data-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-resource-data-sync-result))

(clojure.core/defn describe-maintenance-window-schedule ([] (describe-maintenance-window-schedule {})) ([describe-maintenance-window-schedule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-schedule-request describe-maintenance-window-schedule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-schedule-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-schedule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowSchedule", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-schedule :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-maintenance-window-schedule-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-schedule-result))

(clojure.core/defn deregister-task-from-maintenance-window ([deregister-task-from-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-task-from-maintenance-window-request deregister-task-from-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/deregister-task-from-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/deregister-task-from-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterTaskFromMaintenanceWindow", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef deregister-task-from-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/deregister-task-from-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/deregister-task-from-maintenance-window-result))

(clojure.core/defn get-parameter-history ([get-parameter-history-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-parameter-history-request get-parameter-history-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-parameter-history-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-parameter-history-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetParameterHistory", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "ParameterNotFound" :portkey.aws.ssm/parameter-not-found, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidKeyId" :portkey.aws.ssm/invalid-key-id}})))))
(clojure.spec.alpha/fdef get-parameter-history :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-parameter-history-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-parameter-history-result))

(clojure.core/defn start-session ([start-session-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-session-request start-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/start-session-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/start-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSession", :http.request.spec/error-spec {"InvalidDocument" :portkey.aws.ssm/invalid-document, "TargetNotConnected" :portkey.aws.ssm/target-not-connected, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef start-session :args (clojure.spec.alpha/tuple :portkey.aws.ssm/start-session-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/start-session-response))

(clojure.core/defn list-association-versions ([list-association-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-association-versions-request list-association-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-association-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-association-versions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssociationVersions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist}})))))
(clojure.spec.alpha/fdef list-association-versions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/list-association-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-association-versions-result))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"InvalidResourceType" :portkey.aws.ssm/invalid-resource-type, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.ssm/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-tags-for-resource-result))

(clojure.core/defn create-document ([create-document-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-document-request create-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-document-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDocument", :http.request.spec/error-spec {"DocumentAlreadyExists" :portkey.aws.ssm/document-already-exists, "MaxDocumentSizeExceeded" :portkey.aws.ssm/max-document-size-exceeded, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocumentContent" :portkey.aws.ssm/invalid-document-content, "DocumentLimitExceeded" :portkey.aws.ssm/document-limit-exceeded, "InvalidDocumentSchemaVersion" :portkey.aws.ssm/invalid-document-schema-version}})))))
(clojure.spec.alpha/fdef create-document :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-document-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-document-result))

(clojure.core/defn list-resource-data-sync ([] (list-resource-data-sync {})) ([list-resource-data-sync-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-resource-data-sync-request list-resource-data-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-resource-data-sync-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-resource-data-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceDataSync", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-resource-data-sync :args (clojure.spec.alpha/? :portkey.aws.ssm/list-resource-data-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-resource-data-sync-result))

(clojure.core/defn describe-association ([] (describe-association {})) ([describe-association-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-association-request describe-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssociation", :http.request.spec/error-spec {"AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "InvalidAssociationVersion" :portkey.aws.ssm/invalid-association-version, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id}})))))
(clojure.spec.alpha/fdef describe-association :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-association-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-association-result))

(clojure.core/defn describe-automation-executions ([] (describe-automation-executions {})) ([describe-automation-executions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-automation-executions-request describe-automation-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-automation-executions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-automation-executions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAutomationExecutions", :http.request.spec/error-spec {"InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidFilterValue" :portkey.aws.ssm/invalid-filter-value, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-automation-executions :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-automation-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-automation-executions-result))

(clojure.core/defn get-parameter ([get-parameter-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-parameter-request get-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-parameter-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetParameter", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidKeyId" :portkey.aws.ssm/invalid-key-id, "ParameterNotFound" :portkey.aws.ssm/parameter-not-found, "ParameterVersionNotFound" :portkey.aws.ssm/parameter-version-not-found}})))))
(clojure.spec.alpha/fdef get-parameter :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-parameter-result))

(clojure.core/defn start-associations-once ([start-associations-once-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-associations-once-request start-associations-once-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/start-associations-once-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/start-associations-once-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartAssociationsOnce", :http.request.spec/error-spec {"InvalidAssociation" :portkey.aws.ssm/invalid-association, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist}})))))
(clojure.spec.alpha/fdef start-associations-once :args (clojure.spec.alpha/tuple :portkey.aws.ssm/start-associations-once-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/start-associations-once-result))

(clojure.core/defn update-document-default-version ([update-document-default-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-document-default-version-request update-document-default-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-document-default-version-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-document-default-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDocumentDefaultVersion", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidDocumentSchemaVersion" :portkey.aws.ssm/invalid-document-schema-version}})))))
(clojure.spec.alpha/fdef update-document-default-version :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-document-default-version-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-document-default-version-result))

(clojure.core/defn update-association ([update-association-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-association-request update-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAssociation", :http.request.spec/error-spec {"InvalidSchedule" :portkey.aws.ssm/invalid-schedule, "TooManyUpdates" :portkey.aws.ssm/too-many-updates, "InvalidDocument" :portkey.aws.ssm/invalid-document, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidParameters" :portkey.aws.ssm/invalid-parameters, "AssociationVersionLimitExceeded" :portkey.aws.ssm/association-version-limit-exceeded, "InvalidTarget" :portkey.aws.ssm/invalid-target, "InvalidAssociationVersion" :portkey.aws.ssm/invalid-association-version, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidUpdate" :portkey.aws.ssm/invalid-update, "InvalidOutputLocation" :portkey.aws.ssm/invalid-output-location}})))))
(clojure.spec.alpha/fdef update-association :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-association-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-association-result))

(clojure.core/defn get-maintenance-window-execution-task-invocation ([get-maintenance-window-execution-task-invocation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-maintenance-window-execution-task-invocation-request get-maintenance-window-execution-task-invocation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMaintenanceWindowExecutionTaskInvocation", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-maintenance-window-execution-task-invocation :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-maintenance-window-execution-task-invocation-result))

(clojure.core/defn send-command ([send-command-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-command-request send-command-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/send-command-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/send-command-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendCommand", :http.request.spec/error-spec {"MaxDocumentSizeExceeded" :portkey.aws.ssm/max-document-size-exceeded, "DuplicateInstanceId" :portkey.aws.ssm/duplicate-instance-id, "UnsupportedPlatformType" :portkey.aws.ssm/unsupported-platform-type, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidParameters" :portkey.aws.ssm/invalid-parameters, "InvalidNotificationConfig" :portkey.aws.ssm/invalid-notification-config, "InvalidOutputFolder" :portkey.aws.ssm/invalid-output-folder, "InvalidRole" :portkey.aws.ssm/invalid-role, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id}})))))
(clojure.spec.alpha/fdef send-command :args (clojure.spec.alpha/tuple :portkey.aws.ssm/send-command-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/send-command-result))

(clojure.core/defn describe-parameters ([] (describe-parameters {})) ([describe-parameters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-parameters-request describe-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-parameters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeParameters", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidFilterOption" :portkey.aws.ssm/invalid-filter-option, "InvalidFilterValue" :portkey.aws.ssm/invalid-filter-value, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-parameters :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-parameters-result))

(clojure.core/defn resume-session ([resume-session-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-resume-session-request resume-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/resume-session-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/resume-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResumeSession", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef resume-session :args (clojure.spec.alpha/tuple :portkey.aws.ssm/resume-session-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/resume-session-response))

(clojure.core/defn update-managed-instance-role ([update-managed-instance-role-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-managed-instance-role-request update-managed-instance-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-managed-instance-role-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-managed-instance-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateManagedInstanceRole", :http.request.spec/error-spec {"InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef update-managed-instance-role :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-managed-instance-role-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-managed-instance-role-result))

(clojure.core/defn create-activation ([create-activation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-activation-request create-activation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-activation-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-activation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateActivation", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef create-activation :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-activation-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-activation-result))

(clojure.core/defn list-document-versions ([list-document-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-document-versions-request list-document-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-document-versions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-document-versions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDocumentVersions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidDocument" :portkey.aws.ssm/invalid-document}})))))
(clojure.spec.alpha/fdef list-document-versions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/list-document-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-document-versions-result))

(clojure.core/defn describe-effective-instance-associations ([describe-effective-instance-associations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-effective-instance-associations-request describe-effective-instance-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-effective-instance-associations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-effective-instance-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEffectiveInstanceAssociations", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-effective-instance-associations :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-effective-instance-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-effective-instance-associations-result))

(clojure.core/defn describe-maintenance-windows-for-target ([describe-maintenance-windows-for-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-windows-for-target-request describe-maintenance-windows-for-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-windows-for-target-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-windows-for-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowsForTarget", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-windows-for-target :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-windows-for-target-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-windows-for-target-result))

(clojure.core/defn modify-document-permission ([modify-document-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-document-permission-request modify-document-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/modify-document-permission-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/modify-document-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyDocumentPermission", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidPermissionType" :portkey.aws.ssm/invalid-permission-type, "DocumentPermissionLimit" :portkey.aws.ssm/document-permission-limit, "DocumentLimitExceeded" :portkey.aws.ssm/document-limit-exceeded}})))))
(clojure.spec.alpha/fdef modify-document-permission :args (clojure.spec.alpha/tuple :portkey.aws.ssm/modify-document-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/modify-document-permission-response))

(clojure.core/defn get-maintenance-window-execution-task ([get-maintenance-window-execution-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-maintenance-window-execution-task-request get-maintenance-window-execution-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-maintenance-window-execution-task-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-maintenance-window-execution-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMaintenanceWindowExecutionTask", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-maintenance-window-execution-task :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-maintenance-window-execution-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-maintenance-window-execution-task-result))

(clojure.core/defn describe-association-execution-targets ([describe-association-execution-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-association-execution-targets-request describe-association-execution-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-association-execution-targets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-association-execution-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssociationExecutionTargets", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "AssociationExecutionDoesNotExist" :portkey.aws.ssm/association-execution-does-not-exist}})))))
(clojure.spec.alpha/fdef describe-association-execution-targets :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-association-execution-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-association-execution-targets-result))

(clojure.core/defn delete-inventory ([delete-inventory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-inventory-request delete-inventory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-inventory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-inventory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInventory", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidTypeNameException" :portkey.aws.ssm/invalid-type-name-exception, "InvalidOptionException" :portkey.aws.ssm/invalid-option-exception, "InvalidDeleteInventoryParametersException" :portkey.aws.ssm/invalid-delete-inventory-parameters-exception, "InvalidInventoryRequestException" :portkey.aws.ssm/invalid-inventory-request-exception}})))))
(clojure.spec.alpha/fdef delete-inventory :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-inventory-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-inventory-result))

(clojure.core/defn list-resource-compliance-summaries ([] (list-resource-compliance-summaries {})) ([list-resource-compliance-summaries-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-resource-compliance-summaries-request list-resource-compliance-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-resource-compliance-summaries-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-resource-compliance-summaries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceComplianceSummaries", :http.request.spec/error-spec {"InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef list-resource-compliance-summaries :args (clojure.spec.alpha/? :portkey.aws.ssm/list-resource-compliance-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-resource-compliance-summaries-result))

(clojure.core/defn get-patch-baseline-for-patch-group ([get-patch-baseline-for-patch-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-patch-baseline-for-patch-group-request get-patch-baseline-for-patch-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-patch-baseline-for-patch-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-patch-baseline-for-patch-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPatchBaselineForPatchGroup", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-patch-baseline-for-patch-group :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-patch-baseline-for-patch-group-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-patch-baseline-for-patch-group-result))

(clojure.core/defn get-maintenance-window-execution ([get-maintenance-window-execution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-maintenance-window-execution-request get-maintenance-window-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-maintenance-window-execution-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-maintenance-window-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetMaintenanceWindowExecution", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-maintenance-window-execution :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-maintenance-window-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-maintenance-window-execution-result))

(clojure.core/defn delete-parameters ([delete-parameters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-parameters-request delete-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-parameters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteParameters", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-parameters :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-parameters-result))

(clojure.core/defn create-association ([create-association-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-association-request create-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAssociation", :http.request.spec/error-spec {"InvalidSchedule" :portkey.aws.ssm/invalid-schedule, "AssociationLimitExceeded" :portkey.aws.ssm/association-limit-exceeded, "AssociationAlreadyExists" :portkey.aws.ssm/association-already-exists, "UnsupportedPlatformType" :portkey.aws.ssm/unsupported-platform-type, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidParameters" :portkey.aws.ssm/invalid-parameters, "InvalidTarget" :portkey.aws.ssm/invalid-target, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidOutputLocation" :portkey.aws.ssm/invalid-output-location}})))))
(clojure.spec.alpha/fdef create-association :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-association-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-association-result))

(clojure.core/defn list-compliance-items ([] (list-compliance-items {})) ([list-compliance-items-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-compliance-items-request list-compliance-items-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-compliance-items-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-compliance-items-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListComplianceItems", :http.request.spec/error-spec {"InvalidResourceType" :portkey.aws.ssm/invalid-resource-type, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-compliance-items :args (clojure.spec.alpha/? :portkey.aws.ssm/list-compliance-items-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-compliance-items-result))

(clojure.core/defn list-documents ([] (list-documents {})) ([list-documents-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-documents-request list-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-documents-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-documents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDocuments", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key}})))))
(clojure.spec.alpha/fdef list-documents :args (clojure.spec.alpha/? :portkey.aws.ssm/list-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-documents-result))

(clojure.core/defn describe-instance-patch-states-for-patch-group ([describe-instance-patch-states-for-patch-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instance-patch-states-for-patch-group-request describe-instance-patch-states-for-patch-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstancePatchStatesForPatchGroup", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-instance-patch-states-for-patch-group :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-instance-patch-states-for-patch-group-result))

(clojure.core/defn delete-association ([] (delete-association {})) ([delete-association-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-association-request delete-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAssociation", :http.request.spec/error-spec {"AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "TooManyUpdates" :portkey.aws.ssm/too-many-updates}})))))
(clojure.spec.alpha/fdef delete-association :args (clojure.spec.alpha/? :portkey.aws.ssm/delete-association-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-association-result))

(clojure.core/defn get-parameters ([get-parameters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-parameters-request get-parameters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-parameters-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-parameters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetParameters", :http.request.spec/error-spec {"InvalidKeyId" :portkey.aws.ssm/invalid-key-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-parameters :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-parameters-result))

(clojure.core/defn update-association-status ([update-association-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-association-status-request update-association-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-association-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-association-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAssociationStatus", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidDocument" :portkey.aws.ssm/invalid-document, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "StatusUnchanged" :portkey.aws.ssm/status-unchanged, "TooManyUpdates" :portkey.aws.ssm/too-many-updates}})))))
(clojure.spec.alpha/fdef update-association-status :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-association-status-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-association-status-result))

(clojure.core/defn get-command-invocation ([get-command-invocation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-command-invocation-request get-command-invocation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-command-invocation-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-command-invocation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCommandInvocation", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidCommandId" :portkey.aws.ssm/invalid-command-id, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidPluginName" :portkey.aws.ssm/invalid-plugin-name, "InvocationDoesNotExist" :portkey.aws.ssm/invocation-does-not-exist}})))))
(clojure.spec.alpha/fdef get-command-invocation :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-command-invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-command-invocation-result))

(clojure.core/defn describe-automation-step-executions ([describe-automation-step-executions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-automation-step-executions-request describe-automation-step-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-automation-step-executions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-automation-step-executions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAutomationStepExecutions", :http.request.spec/error-spec {"AutomationExecutionNotFoundException" :portkey.aws.ssm/automation-execution-not-found-exception, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidFilterValue" :portkey.aws.ssm/invalid-filter-value, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-automation-step-executions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-automation-step-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-automation-step-executions-result))

(clojure.core/defn update-maintenance-window ([update-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-maintenance-window-request update-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateMaintenanceWindow", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef update-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-maintenance-window-result))

(clojure.core/defn describe-instance-information ([] (describe-instance-information {})) ([describe-instance-information-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instance-information-request describe-instance-information-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-instance-information-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-instance-information-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstanceInformation", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidInstanceInformationFilterValue" :portkey.aws.ssm/invalid-instance-information-filter-value, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key}})))))
(clojure.spec.alpha/fdef describe-instance-information :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-instance-information-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-instance-information-result))

(clojure.core/defn describe-maintenance-window-execution-tasks ([describe-maintenance-window-execution-tasks-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-execution-tasks-request describe-maintenance-window-execution-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-execution-tasks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-execution-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowExecutionTasks", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-execution-tasks :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-window-execution-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-execution-tasks-result))

(clojure.core/defn describe-activations ([] (describe-activations {})) ([describe-activations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-activations-request describe-activations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-activations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-activations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeActivations", :http.request.spec/error-spec {"InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-activations :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-activations-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-activations-result))

(clojure.core/defn list-associations ([] (list-associations {})) ([list-associations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-associations-request list-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-associations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssociations", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-associations :args (clojure.spec.alpha/? :portkey.aws.ssm/list-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-associations-result))

(clojure.core/defn deregister-managed-instance ([deregister-managed-instance-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-managed-instance-request deregister-managed-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/deregister-managed-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/deregister-managed-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterManagedInstance", :http.request.spec/error-spec {"InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef deregister-managed-instance :args (clojure.spec.alpha/tuple :portkey.aws.ssm/deregister-managed-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/deregister-managed-instance-result))

(clojure.core/defn deregister-target-from-maintenance-window ([deregister-target-from-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-target-from-maintenance-window-request deregister-target-from-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/deregister-target-from-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/deregister-target-from-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterTargetFromMaintenanceWindow", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error, "TargetInUseException" :portkey.aws.ssm/target-in-use-exception}})))))
(clojure.spec.alpha/fdef deregister-target-from-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/deregister-target-from-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/deregister-target-from-maintenance-window-result))

(clojure.core/defn describe-sessions ([describe-sessions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-sessions-request describe-sessions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-sessions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-sessions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSessions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-sessions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-sessions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-sessions-response))

(clojure.core/defn stop-automation-execution ([stop-automation-execution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-automation-execution-request stop-automation-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/stop-automation-execution-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/stop-automation-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopAutomationExecution", :http.request.spec/error-spec {"AutomationExecutionNotFoundException" :portkey.aws.ssm/automation-execution-not-found-exception, "InvalidAutomationStatusUpdateException" :portkey.aws.ssm/invalid-automation-status-update-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef stop-automation-execution :args (clojure.spec.alpha/tuple :portkey.aws.ssm/stop-automation-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/stop-automation-execution-result))

(clojure.core/defn start-automation-execution ([start-automation-execution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-automation-execution-request start-automation-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/start-automation-execution-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/start-automation-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartAutomationExecution", :http.request.spec/error-spec {"AutomationDefinitionNotFoundException" :portkey.aws.ssm/automation-definition-not-found-exception, "InvalidAutomationExecutionParametersException" :portkey.aws.ssm/invalid-automation-execution-parameters-exception, "AutomationExecutionLimitExceededException" :portkey.aws.ssm/automation-execution-limit-exceeded-exception, "AutomationDefinitionVersionNotFoundException" :portkey.aws.ssm/automation-definition-version-not-found-exception, "IdempotentParameterMismatch" :portkey.aws.ssm/idempotent-parameter-mismatch, "InvalidTarget" :portkey.aws.ssm/invalid-target, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef start-automation-execution :args (clojure.spec.alpha/tuple :portkey.aws.ssm/start-automation-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/start-automation-execution-result))

(clojure.core/defn get-connection-status ([get-connection-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-connection-status-request get-connection-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-connection-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-connection-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConnectionStatus", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-connection-status :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-connection-status-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-connection-status-response))

(clojure.core/defn describe-instance-patch-states ([describe-instance-patch-states-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instance-patch-states-request describe-instance-patch-states-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-instance-patch-states-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-instance-patch-states-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstancePatchStates", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-instance-patch-states :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-instance-patch-states-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-instance-patch-states-result))

(clojure.core/defn update-document ([update-document-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-document-request update-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/update-document-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/update-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDocument", :http.request.spec/error-spec {"MaxDocumentSizeExceeded" :portkey.aws.ssm/max-document-size-exceeded, "DocumentVersionLimitExceeded" :portkey.aws.ssm/document-version-limit-exceeded, "InternalServerError" :portkey.aws.ssm/internal-server-error, "DuplicateDocumentContent" :portkey.aws.ssm/duplicate-document-content, "InvalidDocumentContent" :portkey.aws.ssm/invalid-document-content, "InvalidDocumentVersion" :portkey.aws.ssm/invalid-document-version, "InvalidDocumentSchemaVersion" :portkey.aws.ssm/invalid-document-schema-version, "InvalidDocument" :portkey.aws.ssm/invalid-document}})))))
(clojure.spec.alpha/fdef update-document :args (clojure.spec.alpha/tuple :portkey.aws.ssm/update-document-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/update-document-result))

(clojure.core/defn describe-available-patches ([] (describe-available-patches {})) ([describe-available-patches-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-available-patches-request describe-available-patches-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-available-patches-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-available-patches-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAvailablePatches", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-available-patches :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-available-patches-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-available-patches-result))

(clojure.core/defn register-patch-baseline-for-patch-group ([register-patch-baseline-for-patch-group-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-patch-baseline-for-patch-group-request register-patch-baseline-for-patch-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/register-patch-baseline-for-patch-group-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/register-patch-baseline-for-patch-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterPatchBaselineForPatchGroup", :http.request.spec/error-spec {"AlreadyExistsException" :portkey.aws.ssm/already-exists-exception, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "ResourceLimitExceededException" :portkey.aws.ssm/resource-limit-exceeded-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef register-patch-baseline-for-patch-group :args (clojure.spec.alpha/tuple :portkey.aws.ssm/register-patch-baseline-for-patch-group-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/register-patch-baseline-for-patch-group-result))

(clojure.core/defn create-patch-baseline ([create-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-patch-baseline-request create-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePatchBaseline", :http.request.spec/error-spec {"IdempotentParameterMismatch" :portkey.aws.ssm/idempotent-parameter-mismatch, "ResourceLimitExceededException" :portkey.aws.ssm/resource-limit-exceeded-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef create-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-patch-baseline-result))

(clojure.core/defn describe-effective-patches-for-patch-baseline ([describe-effective-patches-for-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-effective-patches-for-patch-baseline-request describe-effective-patches-for-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEffectivePatchesForPatchBaseline", :http.request.spec/error-spec {"InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "UnsupportedOperatingSystem" :portkey.aws.ssm/unsupported-operating-system, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-effective-patches-for-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-effective-patches-for-patch-baseline-result))

(clojure.core/defn describe-maintenance-window-executions ([describe-maintenance-window-executions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-executions-request describe-maintenance-window-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-executions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-executions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowExecutions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-executions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-window-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-executions-result))

(clojure.core/defn create-resource-data-sync ([create-resource-data-sync-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-resource-data-sync-request create-resource-data-sync-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-resource-data-sync-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-resource-data-sync-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateResourceDataSync", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "ResourceDataSyncCountExceededException" :portkey.aws.ssm/resource-data-sync-count-exceeded-exception, "ResourceDataSyncAlreadyExistsException" :portkey.aws.ssm/resource-data-sync-already-exists-exception, "ResourceDataSyncInvalidConfigurationException" :portkey.aws.ssm/resource-data-sync-invalid-configuration-exception}})))))
(clojure.spec.alpha/fdef create-resource-data-sync :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-resource-data-sync-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-resource-data-sync-result))

(clojure.core/defn delete-document ([delete-document-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-document-request delete-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-document-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDocument", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidDocumentOperation" :portkey.aws.ssm/invalid-document-operation, "AssociatedInstances" :portkey.aws.ssm/associated-instances}})))))
(clojure.spec.alpha/fdef delete-document :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-document-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-document-result))

(clojure.core/defn delete-patch-baseline ([delete-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-patch-baseline-request delete-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePatchBaseline", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.ssm/resource-in-use-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-patch-baseline-result))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-from-resource-request remove-tags-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/remove-tags-from-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/remove-tags-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.spec/error-spec {"InvalidResourceType" :portkey.aws.ssm/invalid-resource-type, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error, "TooManyUpdates" :portkey.aws.ssm/too-many-updates}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.ssm/remove-tags-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/remove-tags-from-resource-result))

(clojure.core/defn describe-document-permission ([describe-document-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-document-permission-request describe-document-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-document-permission-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-document-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDocumentPermission", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidDocument" :portkey.aws.ssm/invalid-document, "InvalidPermissionType" :portkey.aws.ssm/invalid-permission-type}})))))
(clojure.spec.alpha/fdef describe-document-permission :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-document-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-document-permission-response))

(clojure.core/defn delete-maintenance-window ([delete-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-maintenance-window-request delete-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMaintenanceWindow", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-maintenance-window-result))

(clojure.core/defn get-automation-execution ([get-automation-execution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-automation-execution-request get-automation-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-automation-execution-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-automation-execution-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAutomationExecution", :http.request.spec/error-spec {"AutomationExecutionNotFoundException" :portkey.aws.ssm/automation-execution-not-found-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-automation-execution :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-automation-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-automation-execution-result))

(clojure.core/defn create-maintenance-window ([create-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-maintenance-window-request create-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/create-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/create-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMaintenanceWindow", :http.request.spec/error-spec {"IdempotentParameterMismatch" :portkey.aws.ssm/idempotent-parameter-mismatch, "ResourceLimitExceededException" :portkey.aws.ssm/resource-limit-exceeded-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef create-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/create-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/create-maintenance-window-result))

(clojure.core/defn describe-maintenance-window-targets ([describe-maintenance-window-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-targets-request describe-maintenance-window-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-targets-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowTargets", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-targets :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-window-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-targets-result))

(clojure.core/defn describe-patch-groups ([] (describe-patch-groups {})) ([describe-patch-groups-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-patch-groups-request describe-patch-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-patch-groups-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-patch-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePatchGroups", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-patch-groups :args (clojure.spec.alpha/? :portkey.aws.ssm/describe-patch-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-patch-groups-result))

(clojure.core/defn list-inventory-entries ([list-inventory-entries-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-inventory-entries-request list-inventory-entries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-inventory-entries-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-inventory-entries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInventoryEntries", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidTypeNameException" :portkey.aws.ssm/invalid-type-name-exception, "InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-inventory-entries :args (clojure.spec.alpha/tuple :portkey.aws.ssm/list-inventory-entries-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-inventory-entries-result))

(clojure.core/defn delete-parameter ([delete-parameter-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-parameter-request delete-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/delete-parameter-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/delete-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteParameter", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "ParameterNotFound" :portkey.aws.ssm/parameter-not-found}})))))
(clojure.spec.alpha/fdef delete-parameter :args (clojure.spec.alpha/tuple :portkey.aws.ssm/delete-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/delete-parameter-result))

(clojure.core/defn put-parameter ([put-parameter-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-parameter-request put-parameter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/put-parameter-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/put-parameter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutParameter", :http.request.spec/error-spec {"HierarchyTypeMismatchException" :portkey.aws.ssm/hierarchy-type-mismatch-exception, "TooManyUpdates" :portkey.aws.ssm/too-many-updates, "UnsupportedParameterType" :portkey.aws.ssm/unsupported-parameter-type, "HierarchyLevelLimitExceededException" :portkey.aws.ssm/hierarchy-level-limit-exceeded-exception, "ParameterAlreadyExists" :portkey.aws.ssm/parameter-already-exists, "ParameterLimitExceeded" :portkey.aws.ssm/parameter-limit-exceeded, "ParameterPatternMismatchException" :portkey.aws.ssm/parameter-pattern-mismatch-exception, "InvalidKeyId" :portkey.aws.ssm/invalid-key-id, "ParameterMaxVersionLimitExceeded" :portkey.aws.ssm/parameter-max-version-limit-exceeded, "InvalidAllowedPatternException" :portkey.aws.ssm/invalid-allowed-pattern-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef put-parameter :args (clojure.spec.alpha/tuple :portkey.aws.ssm/put-parameter-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/put-parameter-result))

(clojure.core/defn describe-maintenance-window-execution-task-invocations ([describe-maintenance-window-execution-task-invocations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-maintenance-window-execution-task-invocations-request describe-maintenance-window-execution-task-invocations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeMaintenanceWindowExecutionTaskInvocations", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-window-execution-task-invocations :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-maintenance-window-execution-task-invocations-result))

(clojure.core/defn register-target-with-maintenance-window ([register-target-with-maintenance-window-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-target-with-maintenance-window-request register-target-with-maintenance-window-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/register-target-with-maintenance-window-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/register-target-with-maintenance-window-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterTargetWithMaintenanceWindow", :http.request.spec/error-spec {"IdempotentParameterMismatch" :portkey.aws.ssm/idempotent-parameter-mismatch, "DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "ResourceLimitExceededException" :portkey.aws.ssm/resource-limit-exceeded-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef register-target-with-maintenance-window :args (clojure.spec.alpha/tuple :portkey.aws.ssm/register-target-with-maintenance-window-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/register-target-with-maintenance-window-result))

(clojure.core/defn label-parameter-version ([label-parameter-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-label-parameter-version-request label-parameter-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/label-parameter-version-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/label-parameter-version-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "LabelParameterVersion", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "TooManyUpdates" :portkey.aws.ssm/too-many-updates, "ParameterNotFound" :portkey.aws.ssm/parameter-not-found, "ParameterVersionNotFound" :portkey.aws.ssm/parameter-version-not-found, "ParameterVersionLabelLimitExceeded" :portkey.aws.ssm/parameter-version-label-limit-exceeded}})))))
(clojure.spec.alpha/fdef label-parameter-version :args (clojure.spec.alpha/tuple :portkey.aws.ssm/label-parameter-version-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/label-parameter-version-result))

(clojure.core/defn get-patch-baseline ([get-patch-baseline-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-patch-baseline-request get-patch-baseline-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-patch-baseline-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-patch-baseline-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPatchBaseline", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef get-patch-baseline :args (clojure.spec.alpha/tuple :portkey.aws.ssm/get-patch-baseline-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-patch-baseline-result))

(clojure.core/defn list-compliance-summaries ([] (list-compliance-summaries {})) ([list-compliance-summaries-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-compliance-summaries-request list-compliance-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-compliance-summaries-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-compliance-summaries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListComplianceSummaries", :http.request.spec/error-spec {"InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef list-compliance-summaries :args (clojure.spec.alpha/? :portkey.aws.ssm/list-compliance-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-compliance-summaries-result))

(clojure.core/defn get-inventory ([] (get-inventory {})) ([get-inventory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-inventory-request get-inventory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-inventory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-inventory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInventory", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidInventoryGroupException" :portkey.aws.ssm/invalid-inventory-group-exception, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token, "InvalidTypeNameException" :portkey.aws.ssm/invalid-type-name-exception, "InvalidAggregatorException" :portkey.aws.ssm/invalid-aggregator-exception, "InvalidResultAttributeException" :portkey.aws.ssm/invalid-result-attribute-exception}})))))
(clojure.spec.alpha/fdef get-inventory :args (clojure.spec.alpha/? :portkey.aws.ssm/get-inventory-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-inventory-result))

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-to-resource-request add-tags-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/add-tags-to-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/add-tags-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToResource", :http.request.spec/error-spec {"InvalidResourceType" :portkey.aws.ssm/invalid-resource-type, "InvalidResourceId" :portkey.aws.ssm/invalid-resource-id, "InternalServerError" :portkey.aws.ssm/internal-server-error, "TooManyTagsError" :portkey.aws.ssm/too-many-tags-error, "TooManyUpdates" :portkey.aws.ssm/too-many-updates}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.ssm/add-tags-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/add-tags-to-resource-result))

(clojure.core/defn describe-instance-associations-status ([describe-instance-associations-status-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instance-associations-status-request describe-instance-associations-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-instance-associations-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-instance-associations-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstanceAssociationsStatus", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-instance-associations-status :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-instance-associations-status-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-instance-associations-status-result))

(clojure.core/defn terminate-session ([terminate-session-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-terminate-session-request terminate-session-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/terminate-session-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/terminate-session-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateSession", :http.request.spec/error-spec {"DoesNotExistException" :portkey.aws.ssm/does-not-exist-exception, "InternalServerError" :portkey.aws.ssm/internal-server-error}})))))
(clojure.spec.alpha/fdef terminate-session :args (clojure.spec.alpha/tuple :portkey.aws.ssm/terminate-session-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/terminate-session-response))

(clojure.core/defn list-command-invocations ([] (list-command-invocations {})) ([list-command-invocations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-command-invocations-request list-command-invocations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/list-command-invocations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/list-command-invocations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCommandInvocations", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidCommandId" :portkey.aws.ssm/invalid-command-id, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidFilterKey" :portkey.aws.ssm/invalid-filter-key, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-command-invocations :args (clojure.spec.alpha/? :portkey.aws.ssm/list-command-invocations-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/list-command-invocations-result))

(clojure.core/defn get-inventory-schema ([] (get-inventory-schema {})) ([get-inventory-schema-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-inventory-schema-request get-inventory-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/get-inventory-schema-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/get-inventory-schema-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInventorySchema", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidTypeNameException" :portkey.aws.ssm/invalid-type-name-exception, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef get-inventory-schema :args (clojure.spec.alpha/? :portkey.aws.ssm/get-inventory-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/get-inventory-schema-result))

(clojure.core/defn describe-association-executions ([describe-association-executions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-association-executions-request describe-association-executions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-association-executions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-association-executions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAssociationExecutions", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "AssociationDoesNotExist" :portkey.aws.ssm/association-does-not-exist, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-association-executions :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-association-executions-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-association-executions-result))

(clojure.core/defn describe-instance-patches ([describe-instance-patches-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-instance-patches-request describe-instance-patches-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ssm/endpoints, :http.request.configuration/target-prefix "AmazonSSM", :http.request.spec/output-spec :portkey.aws.ssm/describe-instance-patches-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-06", :http.request.configuration/service-id "SSM", :http.request.spec/input-spec :portkey.aws.ssm/describe-instance-patches-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstancePatches", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.ssm/internal-server-error, "InvalidInstanceId" :portkey.aws.ssm/invalid-instance-id, "InvalidFilter" :portkey.aws.ssm/invalid-filter, "InvalidNextToken" :portkey.aws.ssm/invalid-next-token}})))))
(clojure.spec.alpha/fdef describe-instance-patches :args (clojure.spec.alpha/tuple :portkey.aws.ssm/describe-instance-patches-request) :ret (clojure.spec.alpha/and :portkey.aws.ssm/describe-instance-patches-result))
