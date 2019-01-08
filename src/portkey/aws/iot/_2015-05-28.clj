(ns portkey.aws.iot.-2015-05-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-1"},
    :ssl-common-name "iot.ap-northeast-1.amazonaws.com",
    :endpoint "https://iot.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "execute-api", :region "eu-west-1"},
    :ssl-common-name "iot.eu-west-1.amazonaws.com",
    :endpoint "https://iot.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "execute-api", :region "us-east-2"},
    :ssl-common-name "iot.us-east-2.amazonaws.com",
    :endpoint "https://iot.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-2"},
    :ssl-common-name "iot.ap-southeast-2.amazonaws.com",
    :endpoint "https://iot.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "execute-api", :region "cn-north-1"},
    :ssl-common-name "iot.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iot.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "execute-api", :region "ap-southeast-1"},
    :ssl-common-name "iot.ap-southeast-1.amazonaws.com",
    :endpoint "https://iot.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "execute-api", :region "ap-northeast-2"},
    :ssl-common-name "iot.ap-northeast-2.amazonaws.com",
    :endpoint "https://iot.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "execute-api", :region "eu-central-1"},
    :ssl-common-name "iot.eu-central-1.amazonaws.com",
    :endpoint "https://iot.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "execute-api", :region "eu-west-2"},
    :ssl-common-name "iot.eu-west-2.amazonaws.com",
    :endpoint "https://iot.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "execute-api", :region "us-gov-west-1"},
    :ssl-common-name "iot.us-gov-west-1.amazonaws.com",
    :endpoint "https://iot.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "execute-api", :region "us-west-2"},
    :ssl-common-name "iot.us-west-2.amazonaws.com",
    :endpoint "https://iot.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "execute-api", :region "us-east-1"},
    :ssl-common-name "iot.us-east-1.amazonaws.com",
    :endpoint "https://iot.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "execute-api", :region "ap-south-1"},
    :ssl-common-name "iot.ap-south-1.amazonaws.com",
    :endpoint "https://iot.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-registry-max-results)

(clojure.core/declare ser-stream-id)

(clojure.core/declare ser-expected-version)

(clojure.core/declare ser-auto-registration-status)

(clojure.core/declare ser-thing-indexing-mode)

(clojure.core/declare ser-skyfall-max-results)

(clojure.core/declare ser-thing-group-description)

(clojure.core/declare ser-range-key-field)

(clojure.core/declare ser-thing-group-indexing-configuration)

(clojure.core/declare ser-security-profile-description)

(clojure.core/declare ser-in-progress-timeout-in-minutes)

(clojure.core/declare ser-thing-type-properties)

(clojure.core/declare ser-stream-name)

(clojure.core/declare ser-token-signature)

(clojure.core/declare ser-code-signing)

(clojure.core/declare ser-dynamo-d-bv-2-action)

(clojure.core/declare ser-audit-notification-target-configurations)

(clojure.core/declare ser-topic-rule-payload)

(clojure.core/declare ser-cidr)

(clojure.core/declare ser-platform)

(clojure.core/declare ser-delete-stream)

(clojure.core/declare ser-function-arn)

(clojure.core/declare ser-topic-pattern)

(clojure.core/declare ser-signature-algorithm)

(clojure.core/declare ser-query-version)

(clojure.core/declare ser-rule-name)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-code-signing-certificate-chain)

(clojure.core/declare ser-comment)

(clojure.core/declare ser-certificate-signing-request)

(clojure.core/declare ser-day-of-week)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-thing-type-description)

(clojure.core/declare ser-audit-task-type)

(clojure.core/declare ser-canned-access-control-list)

(clojure.core/declare ser-thing-group-id)

(clojure.core/declare ser-duration-seconds)

(clojure.core/declare ser-thing-type-name)

(clojure.core/declare ser-execution-number)

(clojure.core/declare ser-key-value)

(clojure.core/declare ser-thing-group-arn)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-log-level)

(clojure.core/declare ser-target-audit-check-names)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-action-list)

(clojure.core/declare ser-registration-config)

(clojure.core/declare ser-additional-parameter-map)

(clojure.core/declare ser-laser-max-results)

(clojure.core/declare ser-expires-in-sec)

(clojure.core/declare ser-thing-arn)

(clojure.core/declare ser-template-body)

(clojure.core/declare ser-behavior)

(clojure.core/declare ser-index-name)

(clojure.core/declare ser-endpoint-type)

(clojure.core/declare ser-certificate-name)

(clojure.core/declare ser-attribute-payload)

(clojure.core/declare ser-parameters)

(clojure.core/declare ser-inline-document)

(clojure.core/declare ser-state-value)

(clojure.core/declare ser-use-base-64)

(clojure.core/declare ser-certificate-path-on-device)

(clojure.core/declare ser-security-profile-target-arn)

(clojure.core/declare ser-day-of-month)

(clojure.core/declare ser-max-job-executions-per-min)

(clojure.core/declare ser-ca-certificate-status)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-target-arn)

(clojure.core/declare ser-disable-all-logs)

(clojure.core/declare ser-registry-s-3-key-name)

(clojure.core/declare ser-partition-key)

(clojure.core/declare ser-flag)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-ota-update-files)

(clojure.core/declare ser-start-signing-job-parameter)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-task-id)

(clojure.core/declare ser-policy-names)

(clojure.core/declare ser-elasticsearch-type)

(clojure.core/declare ser-set-as-active-flag)

(clojure.core/declare ser-force-delete-aws-job)

(clojure.core/declare ser-alert-targets)

(clojure.core/declare ser-aws-arn)

(clojure.core/declare ser-stream-files)

(clojure.core/declare ser-key-name)

(clojure.core/declare ser-log-target-type)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-query-string)

(clojure.core/declare ser-status)

(clojure.core/declare ser-behaviors)

(clojure.core/declare ser-allow-auto-registration)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-role-alias)

(clojure.core/declare ser-put-item-input)

(clojure.core/declare ser-log-target-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-behavior-metric)

(clojure.core/declare ser-ota-update-file)

(clojure.core/declare ser-range-key-value)

(clojure.core/declare ser-hash-key-value)

(clojure.core/declare ser-firehose-action)

(clojure.core/declare ser-security-profile-name)

(clojure.core/declare ser-thing-group-properties)

(clojure.core/declare ser-cidrs)

(clojure.core/declare ser-topic)

(clojure.core/declare ser-alert-target-type)

(clojure.core/declare ser-job-document)

(clojure.core/declare ser-audit-check-name)

(clojure.core/declare ser-key)

(clojure.core/declare ser-recursive-without-default)

(clojure.core/declare ser-stream-description)

(clojure.core/declare ser-salesforce-token)

(clojure.core/declare ser-thing-group-indexing-mode)

(clojure.core/declare ser-target-selection)

(clojure.core/declare ser-remove-auto-registration)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-queue-url)

(clojure.core/declare ser-force-flag)

(clojure.core/declare ser-unsigned-long)

(clojure.core/declare ser-signature)

(clojure.core/declare ser-searchable-attributes)

(clojure.core/declare ser-message-format)

(clojure.core/declare ser-thing-indexing-configuration)

(clojure.core/declare ser-audit-frequency)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-ota-update-file-version)

(clojure.core/declare ser-dynamo-key-type)

(clojure.core/declare ser-public-key-map)

(clojure.core/declare ser-behavior-criteria)

(clojure.core/declare ser-signing-profile-parameter)

(clojure.core/declare ser-stream-file)

(clojure.core/declare ser-sns-action)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-presigned-url-config)

(clojure.core/declare ser-undo-deprecate)

(clojure.core/declare ser-value)

(clojure.core/declare ser-credential-duration-seconds)

(clojure.core/declare ser-aws-job-executions-rollout-config)

(clojure.core/declare ser-description)

(clojure.core/declare ser-ota-update-description)

(clojure.core/declare ser-token-key-name)

(clojure.core/declare ser-policy-document)

(clojure.core/declare ser-port)

(clojure.core/declare ser-authorizer-status)

(clojure.core/declare ser-timeout-config)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-message)

(clojure.core/declare ser-is-disabled)

(clojure.core/declare ser-resources)

(clojure.core/declare ser-attribute-key)

(clojure.core/declare ser-file-location)

(clojure.core/declare ser-log-target)

(clojure.core/declare ser-cloudwatch-metric-action)

(clojure.core/declare ser-audit-notification-target)

(clojure.core/declare ser-job-executions-rollout-config)

(clojure.core/declare ser-attributes-map)

(clojure.core/declare ser-job-document-source)

(clojure.core/declare ser-remove-thing-type)

(clojure.core/declare ser-delivery-stream-name)

(clojure.core/declare ser-sqs-action)

(clojure.core/declare ser-s-3-version)

(clojure.core/declare ser-string)

(clojure.core/declare ser-cognito-identity-pool-id)

(clojure.core/declare ser-parameter)

(clojure.core/declare ser-details-value)

(clojure.core/declare ser-ports)

(clojure.core/declare ser-job-targets)

(clojure.core/declare ser-code-signing-signature)

(clojure.core/declare ser-alert-target-arn)

(clojure.core/declare ser-audit-notification-type)

(clojure.core/declare ser-report-type)

(clojure.core/declare ser-alarm-name)

(clojure.core/declare ser-hash-key-field)

(clojure.core/declare ser-targets)

(clojure.core/declare ser-thing-name)

(clojure.core/declare ser-republish-action)

(clojure.core/declare ser-resource-identifier)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-job-execution-status)

(clojure.core/declare ser-metric-value)

(clojure.core/declare ser-client-id)

(clojure.core/declare ser-audit-check-configurations)

(clojure.core/declare ser-delete-scheduled-audits)

(clojure.core/declare ser-elasticsearch-action)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-elasticsearch-index)

(clojure.core/declare ser-certificate-arn)

(clojure.core/declare ser-custom-code-signing)

(clojure.core/declare ser-set-as-active)

(clojure.core/declare ser-table-name)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-aws-iot-sql-version)

(clojure.core/declare ser-auth-infos)

(clojure.core/declare ser-stream)

(clojure.core/declare ser-sql)

(clojure.core/declare ser-details-key)

(clojure.core/declare ser-registry-s-3-bucket-name)

(clojure.core/declare ser-dynamo-db-action)

(clojure.core/declare ser-policy-version-id)

(clojure.core/declare ser-alert-target)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-dynamo-operation)

(clojure.core/declare ser-hash-algorithm)

(clojure.core/declare ser-certificate-status)

(clojure.core/declare ser-policy-version-identifier)

(clojure.core/declare ser-authorizer-name)

(clojure.core/declare ser-maximum-per-minute)

(clojure.core/declare ser-behavior-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-s-3-destination)

(clojure.core/declare ser-set-as-default)

(clojure.core/declare ser-resource)

(clojure.core/declare ser-state-machine-name)

(clojure.core/declare ser-logging-options-payload)

(clojure.core/declare ser-elasticsearch-id)

(clojure.core/declare ser-file-id)

(clojure.core/declare ser-salesforce-action)

(clojure.core/declare ser-event-configurations)

(clojure.core/declare ser-salesforce-endpoint)

(clojure.core/declare ser-step-functions-action)

(clojure.core/declare ser-ascending-order)

(clojure.core/declare ser-auth-info)

(clojure.core/declare ser-target)

(clojure.core/declare ser-ge-max-results)

(clojure.core/declare ser-optional-version)

(clojure.core/declare ser-action-type)

(clojure.core/declare ser-thing-group-name)

(clojure.core/declare ser-principal)

(clojure.core/declare ser-policy-target)

(clojure.core/declare ser-execution-name-prefix)

(clojure.core/declare ser-scheduled-audit-name)

(clojure.core/declare ser-cloudwatch-alarm-action)

(clojure.core/declare ser-signing-job-id)

(clojure.core/declare ser-lambda-action)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-certificate-id)

(clojure.core/declare ser-ota-update-status)

(clojure.core/declare ser-certificate-pem)

(clojure.core/declare ser-file-name)

(clojure.core/declare ser-ota-update-id)

(clojure.core/declare ser-action)

(clojure.core/declare ser-configuration)

(clojure.core/declare ser-token)

(clojure.core/declare ser-job-description)

(clojure.core/declare ser-state-reason)

(clojure.core/declare ser-elasticsearch-endpoint)

(clojure.core/declare ser-signing-profile-name)

(clojure.core/declare ser-details-map)

(clojure.core/declare ser-force-delete)

(clojure.core/declare ser-recursive)

(clojure.core/declare ser-audit-check-configuration)

(clojure.core/declare ser-audit-task-status)

(clojure.core/declare ser-s-3-action)

(clojure.core/declare ser-iot-analytics-action)

(clojure.core/declare ser-kinesis-action)

(clojure.core/declare ser-query-max-results)

(clojure.core/declare ser-audit-task-id)

(clojure.core/declare ser-thing-group-list)

(clojure.core/declare ser-payload-field)

(clojure.core/declare ser-authorizer-function-arn)

(clojure.core/declare ser-firehose-separator)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-registry-max-results [input] #:http.request.field{:value input, :shape "RegistryMaxResults"})

(clojure.core/defn- ser-stream-id [input] #:http.request.field{:value input, :shape "StreamId"})

(clojure.core/defn- ser-expected-version [input] #:http.request.field{:value input, :shape "ExpectedVersion"})

(clojure.core/defn- ser-auto-registration-status [input] #:http.request.field{:value (clojure.core/get {"ENABLE" "ENABLE", :enable "ENABLE", "DISABLE" "DISABLE", :disable "DISABLE"} input), :shape "AutoRegistrationStatus"})

(clojure.core/defn- ser-thing-indexing-mode [input] #:http.request.field{:value (clojure.core/get {"OFF" "OFF", :off "OFF", "REGISTRY" "REGISTRY", :registry "REGISTRY", "REGISTRY_AND_SHADOW" "REGISTRY_AND_SHADOW", :registry-and-shadow "REGISTRY_AND_SHADOW"} input), :shape "ThingIndexingMode"})

(clojure.core/defn- ser-skyfall-max-results [input] #:http.request.field{:value input, :shape "SkyfallMaxResults"})

(clojure.core/defn- ser-thing-group-description [input] #:http.request.field{:value input, :shape "ThingGroupDescription"})

(clojure.core/defn- ser-range-key-field [input] #:http.request.field{:value input, :shape "RangeKeyField"})

(clojure.core/defn- ser-thing-group-indexing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-thing-group-indexing-mode (:thing-group-indexing-mode input)) #:http.request.field{:name "thingGroupIndexingMode", :shape "ThingGroupIndexingMode"})], :shape "ThingGroupIndexingConfiguration", :type "structure"}))

(clojure.core/defn- ser-security-profile-description [input] #:http.request.field{:value input, :shape "SecurityProfileDescription"})

(clojure.core/defn- ser-in-progress-timeout-in-minutes [input] #:http.request.field{:value input, :shape "InProgressTimeoutInMinutes"})

(clojure.core/defn- ser-thing-type-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ThingTypeProperties", :type "structure"} (clojure.core/contains? input :thing-type-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-description (input :thing-type-description)) #:http.request.field{:name "thingTypeDescription", :shape "ThingTypeDescription"})) (clojure.core/contains? input :searchable-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-searchable-attributes (input :searchable-attributes)) #:http.request.field{:name "searchableAttributes", :shape "SearchableAttributes"}))))

(clojure.core/defn- ser-stream-name [input] #:http.request.field{:value input, :shape "StreamName"})

(clojure.core/defn- ser-token-signature [input] #:http.request.field{:value input, :shape "TokenSignature"})

(clojure.core/defn- ser-code-signing [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeSigning", :type "structure"} (clojure.core/contains? input :aws-signer-job-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-job-id (input :aws-signer-job-id)) #:http.request.field{:name "awsSignerJobId", :shape "SigningJobId"})) (clojure.core/contains? input :start-signing-job-parameter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-signing-job-parameter (input :start-signing-job-parameter)) #:http.request.field{:name "startSigningJobParameter", :shape "StartSigningJobParameter"})) (clojure.core/contains? input :custom-code-signing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-code-signing (input :custom-code-signing)) #:http.request.field{:name "customCodeSigning", :shape "CustomCodeSigning"}))))

(clojure.core/defn- ser-dynamo-d-bv-2-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DynamoDBv2Action", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "AwsArn"})) (clojure.core/contains? input :put-item) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-put-item-input (input :put-item)) #:http.request.field{:name "putItem", :shape "PutItemInput"}))))

(clojure.core/defn- ser-audit-notification-target-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-audit-notification-type k) #:http.request.field{:map-info "key", :shape "AuditNotificationType"}) (clojure.core/into (ser-audit-notification-target v) #:http.request.field{:map-info "value", :shape "AuditNotificationTarget"})])) input), :shape "AuditNotificationTargetConfigurations", :type "map"})

(clojure.core/defn- ser-topic-rule-payload [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sql (:sql input)) #:http.request.field{:name "sql", :shape "SQL"}) (clojure.core/into (ser-action-list (:actions input)) #:http.request.field{:name "actions", :shape "ActionList"})], :shape "TopicRulePayload", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :rule-disabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-disabled (input :rule-disabled)) #:http.request.field{:name "ruleDisabled", :shape "IsDisabled"})) (clojure.core/contains? input :aws-iot-sql-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-iot-sql-version (input :aws-iot-sql-version)) #:http.request.field{:name "awsIotSqlVersion", :shape "AwsIotSqlVersion"})) (clojure.core/contains? input :error-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action (input :error-action)) #:http.request.field{:name "errorAction", :shape "Action"}))))

(clojure.core/defn- ser-cidr [input] #:http.request.field{:value input, :shape "Cidr"})

(clojure.core/defn- ser-platform [input] #:http.request.field{:value input, :shape "Platform"})

(clojure.core/defn- ser-delete-stream [input] #:http.request.field{:value input, :shape "DeleteStream"})

(clojure.core/defn- ser-function-arn [input] #:http.request.field{:value input, :shape "FunctionArn"})

(clojure.core/defn- ser-topic-pattern [input] #:http.request.field{:value input, :shape "TopicPattern"})

(clojure.core/defn- ser-signature-algorithm [input] #:http.request.field{:value input, :shape "SignatureAlgorithm"})

(clojure.core/defn- ser-query-version [input] #:http.request.field{:value input, :shape "QueryVersion"})

(clojure.core/defn- ser-rule-name [input] #:http.request.field{:value input, :shape "RuleName"})

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "CANCELED" "CANCELED", :canceled "CANCELED", "COMPLETED" "COMPLETED", :completed "COMPLETED", "DELETION_IN_PROGRESS" "DELETION_IN_PROGRESS", :deletion-in-progress "DELETION_IN_PROGRESS"} input), :shape "JobStatus"})

(clojure.core/defn- ser-code-signing-certificate-chain [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeSigningCertificateChain", :type "structure"} (clojure.core/contains? input :certificate-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-name (input :certificate-name)) #:http.request.field{:name "certificateName", :shape "CertificateName"})) (clojure.core/contains? input :inline-document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inline-document (input :inline-document)) #:http.request.field{:name "inlineDocument", :shape "InlineDocument"}))))

(clojure.core/defn- ser-comment [input] #:http.request.field{:value input, :shape "Comment"})

(clojure.core/defn- ser-certificate-signing-request [input] #:http.request.field{:value input, :shape "CertificateSigningRequest"})

(clojure.core/defn- ser-day-of-week [input] #:http.request.field{:value (clojure.core/get {:wed "WED", "TUE" "TUE", "SAT" "SAT", "SUN" "SUN", :sat "SAT", "MON" "MON", :tue "TUE", :fri "FRI", :sun "SUN", "THU" "THU", "WED" "WED", "FRI" "FRI", :mon "MON", :thu "THU"} input), :shape "DayOfWeek"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-thing-type-description [input] #:http.request.field{:value input, :shape "ThingTypeDescription"})

(clojure.core/defn- ser-audit-task-type [input] #:http.request.field{:value (clojure.core/get {"ON_DEMAND_AUDIT_TASK" "ON_DEMAND_AUDIT_TASK", :on-demand-audit-task "ON_DEMAND_AUDIT_TASK", "SCHEDULED_AUDIT_TASK" "SCHEDULED_AUDIT_TASK", :scheduled-audit-task "SCHEDULED_AUDIT_TASK"} input), :shape "AuditTaskType"})

(clojure.core/defn- ser-canned-access-control-list [input] #:http.request.field{:value (clojure.core/get {"authenticated-read" "authenticated-read", :logdeliverywrite "log-delivery-write", :bucketownerfullcontrol "bucket-owner-full-control", "public-read-write" "public-read-write", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :bucketownerread "bucket-owner-read", :publicread "public-read", "aws-exec-read" "aws-exec-read", :publicreadwrite "public-read-write", :awsexecread "aws-exec-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", "log-delivery-write" "log-delivery-write", :authenticatedread "authenticated-read"} input), :shape "CannedAccessControlList"})

(clojure.core/defn- ser-thing-group-id [input] #:http.request.field{:value input, :shape "ThingGroupId"})

(clojure.core/defn- ser-duration-seconds [input] #:http.request.field{:value input, :shape "DurationSeconds"})

(clojure.core/defn- ser-thing-type-name [input] #:http.request.field{:value input, :shape "ThingTypeName"})

(clojure.core/defn- ser-execution-number [input] #:http.request.field{:value input, :shape "ExecutionNumber"})

(clojure.core/defn- ser-key-value [input] #:http.request.field{:value input, :shape "KeyValue"})

(clojure.core/defn- ser-thing-group-arn [input] #:http.request.field{:value input, :shape "ThingGroupArn"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-log-level [input] #:http.request.field{:value (clojure.core/get {"DISABLED" "DISABLED", :disabled "DISABLED", :warn "WARN", "WARN" "WARN", :debug "DEBUG", "ERROR" "ERROR", "DEBUG" "DEBUG", :info "INFO", :error "ERROR", "INFO" "INFO"} input), :shape "LogLevel"})

(clojure.core/defn- ser-target-audit-check-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-audit-check-name coll) #:http.request.field{:shape "AuditCheckName"}))) input), :shape "TargetAuditCheckNames", :type "list"})

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-action-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action coll) #:http.request.field{:shape "Action"}))) input), :shape "ActionList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-registration-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RegistrationConfig", :type "structure"} (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "templateBody", :shape "TemplateBody"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"}))))

(clojure.core/defn- ser-additional-parameter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-key k) #:http.request.field{:map-info "key", :shape "AttributeKey"}) (clojure.core/into (ser-value v) #:http.request.field{:map-info "value", :shape "Value"})])) input), :shape "AdditionalParameterMap", :type "map"})

(clojure.core/defn- ser-laser-max-results [input] #:http.request.field{:value input, :shape "LaserMaxResults"})

(clojure.core/defn- ser-expires-in-sec [input] #:http.request.field{:value input, :shape "ExpiresInSec"})

(clojure.core/defn- ser-thing-arn [input] #:http.request.field{:value input, :shape "ThingArn"})

(clojure.core/defn- ser-template-body [input] #:http.request.field{:value input, :shape "TemplateBody"})

(clojure.core/defn- ser-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-behavior-name (:name input)) #:http.request.field{:name "name", :shape "BehaviorName"})], :shape "Behavior", :type "structure"} (clojure.core/contains? input :metric) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behavior-metric (input :metric)) #:http.request.field{:name "metric", :shape "BehaviorMetric"})) (clojure.core/contains? input :criteria) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behavior-criteria (input :criteria)) #:http.request.field{:name "criteria", :shape "BehaviorCriteria"}))))

(clojure.core/defn- ser-index-name [input] #:http.request.field{:value input, :shape "IndexName"})

(clojure.core/defn- ser-endpoint-type [input] #:http.request.field{:value input, :shape "EndpointType"})

(clojure.core/defn- ser-certificate-name [input] #:http.request.field{:value input, :shape "CertificateName"})

(clojure.core/defn- ser-attribute-payload [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AttributePayload", :type "structure"} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})) (clojure.core/contains? input :merge) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-flag (input :merge)) #:http.request.field{:name "merge", :shape "Flag"}))))

(clojure.core/defn- ser-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-parameter k) #:http.request.field{:map-info "key", :shape "Parameter"}) (clojure.core/into (ser-value v) #:http.request.field{:map-info "value", :shape "Value"})])) input), :shape "Parameters", :type "map"})

(clojure.core/defn- ser-inline-document [input] #:http.request.field{:value input, :shape "InlineDocument"})

(clojure.core/defn- ser-state-value [input] #:http.request.field{:value input, :shape "StateValue"})

(clojure.core/defn- ser-use-base-64 [input] #:http.request.field{:value input, :shape "UseBase64"})

(clojure.core/defn- ser-certificate-path-on-device [input] #:http.request.field{:value input, :shape "CertificatePathOnDevice"})

(clojure.core/defn- ser-security-profile-target-arn [input] #:http.request.field{:value input, :shape "SecurityProfileTargetArn"})

(clojure.core/defn- ser-day-of-month [input] #:http.request.field{:value input, :shape "DayOfMonth"})

(clojure.core/defn- ser-max-job-executions-per-min [input] #:http.request.field{:value input, :shape "MaxJobExecutionsPerMin"})

(clojure.core/defn- ser-ca-certificate-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"} input), :shape "CACertificateStatus"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-target-arn [input] #:http.request.field{:value input, :shape "TargetArn"})

(clojure.core/defn- ser-disable-all-logs [input] #:http.request.field{:value input, :shape "DisableAllLogs"})

(clojure.core/defn- ser-registry-s-3-key-name [input] #:http.request.field{:value input, :shape "RegistryS3KeyName"})

(clojure.core/defn- ser-partition-key [input] #:http.request.field{:value input, :shape "PartitionKey"})

(clojure.core/defn- ser-flag [input] #:http.request.field{:value input, :shape "Flag"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-ota-update-files [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ota-update-file coll) #:http.request.field{:shape "OTAUpdateFile"}))) input), :shape "OTAUpdateFiles", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-start-signing-job-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StartSigningJobParameter", :type "structure"} (clojure.core/contains? input :signing-profile-parameter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-profile-parameter (input :signing-profile-parameter)) #:http.request.field{:name "signingProfileParameter", :shape "SigningProfileParameter"})) (clojure.core/contains? input :signing-profile-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-profile-name (input :signing-profile-name)) #:http.request.field{:name "signingProfileName", :shape "SigningProfileName"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "destination", :shape "Destination"}))))

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :s-3-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination (input :s-3-destination)) #:http.request.field{:name "s3Destination", :shape "S3Destination"}))))

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {"less-than-equals" "less-than-equals", :notinportset "not-in-port-set", :notincidrset "not-in-cidr-set", "greater-than" "greater-than", "not-in-port-set" "not-in-port-set", :lessthan "less-than", "greater-than-equals" "greater-than-equals", :lessthanequals "less-than-equals", :incidrset "in-cidr-set", "in-cidr-set" "in-cidr-set", "not-in-cidr-set" "not-in-cidr-set", :greaterthanequals "greater-than-equals", "in-port-set" "in-port-set", :inportset "in-port-set", :greaterthan "greater-than", "less-than" "less-than"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-task-id [input] #:http.request.field{:value input, :shape "TaskId"})

(clojure.core/defn- ser-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-name coll) #:http.request.field{:shape "PolicyName"}))) input), :shape "PolicyNames", :type "list"})

(clojure.core/defn- ser-elasticsearch-type [input] #:http.request.field{:value input, :shape "ElasticsearchType"})

(clojure.core/defn- ser-set-as-active-flag [input] #:http.request.field{:value input, :shape "SetAsActiveFlag"})

(clojure.core/defn- ser-force-delete-aws-job [input] #:http.request.field{:value input, :shape "ForceDeleteAWSJob"})

(clojure.core/defn- ser-alert-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-alert-target-type k) #:http.request.field{:map-info "key", :shape "AlertTargetType"}) (clojure.core/into (ser-alert-target v) #:http.request.field{:map-info "value", :shape "AlertTarget"})])) input), :shape "AlertTargets", :type "map"})

(clojure.core/defn- ser-aws-arn [input] #:http.request.field{:value input, :shape "AwsArn"})

(clojure.core/defn- ser-stream-files [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stream-file coll) #:http.request.field{:shape "StreamFile"}))) input), :shape "StreamFiles", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-key-name [input] #:http.request.field{:value input, :shape "KeyName"})

(clojure.core/defn- ser-log-target-type [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "THING_GROUP" "THING_GROUP", :thing-group "THING_GROUP"} input), :shape "LogTargetType"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-query-string [input] #:http.request.field{:value input, :shape "QueryString"})

(clojure.core/defn- ser-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Cancelled" "Cancelled", :in-progress "InProgress", "Cancelling" "Cancelling", :completed "Completed", :cancelled "Cancelled", "InProgress" "InProgress", "Completed" "Completed", :cancelling "Cancelling", :failed "Failed"} input), :shape "Status"})

(clojure.core/defn- ser-behaviors [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-behavior coll) #:http.request.field{:shape "Behavior"}))) input), :shape "Behaviors", :type "list", :max 100})

(clojure.core/defn- ser-allow-auto-registration [input] #:http.request.field{:value input, :shape "AllowAutoRegistration"})

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {:ca-certificate "CA_CERTIFICATE", :thing-group "THING_GROUP", "THING_TYPE" "THING_TYPE", "THING_GROUP_HIERARCHY" "THING_GROUP_HIERARCHY", "JOB_EXECUTION" "JOB_EXECUTION", "CA_CERTIFICATE" "CA_CERTIFICATE", :thing-group-membership "THING_GROUP_MEMBERSHIP", :job-execution "JOB_EXECUTION", "THING_TYPE_ASSOCIATION" "THING_TYPE_ASSOCIATION", "JOB" "JOB", :thing-group-hierarchy "THING_GROUP_HIERARCHY", :policy "POLICY", :certificate "CERTIFICATE", :thing "THING", :thing-type "THING_TYPE", "POLICY" "POLICY", "THING_GROUP" "THING_GROUP", "THING_GROUP_MEMBERSHIP" "THING_GROUP_MEMBERSHIP", "THING" "THING", :job "JOB", "CERTIFICATE" "CERTIFICATE", :thing-type-association "THING_TYPE_ASSOCIATION"} input), :shape "EventType"})

(clojure.core/defn- ser-role-alias [input] #:http.request.field{:value input, :shape "RoleAlias"})

(clojure.core/defn- ser-put-item-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-table-name (:table-name input)) #:http.request.field{:name "tableName", :shape "TableName"})], :shape "PutItemInput", :type "structure"}))

(clojure.core/defn- ser-log-target-name [input] #:http.request.field{:value input, :shape "LogTargetName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-behavior-metric [input] #:http.request.field{:value input, :shape "BehaviorMetric"})

(clojure.core/defn- ser-ota-update-file [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OTAUpdateFile", :type "structure"} (clojure.core/contains? input :file-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-name (input :file-name)) #:http.request.field{:name "fileName", :shape "FileName"})) (clojure.core/contains? input :file-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ota-update-file-version (input :file-version)) #:http.request.field{:name "fileVersion", :shape "OTAUpdateFileVersion"})) (clojure.core/contains? input :file-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-location (input :file-location)) #:http.request.field{:name "fileLocation", :shape "FileLocation"})) (clojure.core/contains? input :code-signing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-signing (input :code-signing)) #:http.request.field{:name "codeSigning", :shape "CodeSigning"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes-map (input :attributes)) #:http.request.field{:name "attributes", :shape "AttributesMap"}))))

(clojure.core/defn- ser-range-key-value [input] #:http.request.field{:value input, :shape "RangeKeyValue"})

(clojure.core/defn- ser-hash-key-value [input] #:http.request.field{:value input, :shape "HashKeyValue"})

(clojure.core/defn- ser-firehose-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-delivery-stream-name (:delivery-stream-name input)) #:http.request.field{:name "deliveryStreamName", :shape "DeliveryStreamName"})], :shape "FirehoseAction", :type "structure"} (clojure.core/contains? input :separator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-firehose-separator (input :separator)) #:http.request.field{:name "separator", :shape "FirehoseSeparator"}))))

(clojure.core/defn- ser-security-profile-name [input] #:http.request.field{:value input, :shape "SecurityProfileName"})

(clojure.core/defn- ser-thing-group-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ThingGroupProperties", :type "structure"} (clojure.core/contains? input :thing-group-description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-description (input :thing-group-description)) #:http.request.field{:name "thingGroupDescription", :shape "ThingGroupDescription"})) (clojure.core/contains? input :attribute-payload) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-payload (input :attribute-payload)) #:http.request.field{:name "attributePayload", :shape "AttributePayload"}))))

(clojure.core/defn- ser-cidrs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cidr coll) #:http.request.field{:shape "Cidr"}))) input), :shape "Cidrs", :type "list"})

(clojure.core/defn- ser-topic [input] #:http.request.field{:value input, :shape "Topic"})

(clojure.core/defn- ser-alert-target-type [input] #:http.request.field{:value (clojure.core/get {"SNS" "SNS", :sns "SNS"} input), :shape "AlertTargetType"})

(clojure.core/defn- ser-job-document [input] #:http.request.field{:value input, :shape "JobDocument"})

(clojure.core/defn- ser-audit-check-name [input] #:http.request.field{:value input, :shape "AuditCheckName"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- ser-recursive-without-default [input] #:http.request.field{:value input, :shape "RecursiveWithoutDefault"})

(clojure.core/defn- ser-stream-description [input] #:http.request.field{:value input, :shape "StreamDescription"})

(clojure.core/defn- ser-salesforce-token [input] #:http.request.field{:value input, :shape "SalesforceToken"})

(clojure.core/defn- ser-thing-group-indexing-mode [input] #:http.request.field{:value (clojure.core/get {"OFF" "OFF", :off "OFF", "ON" "ON", :on "ON"} input), :shape "ThingGroupIndexingMode"})

(clojure.core/defn- ser-target-selection [input] #:http.request.field{:value (clojure.core/get {"CONTINUOUS" "CONTINUOUS", :continuous "CONTINUOUS", "SNAPSHOT" "SNAPSHOT", :snapshot "SNAPSHOT"} input), :shape "TargetSelection"})

(clojure.core/defn- ser-remove-auto-registration [input] #:http.request.field{:value input, :shape "RemoveAutoRegistration"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "Attributes", :type "map"})

(clojure.core/defn- ser-queue-url [input] #:http.request.field{:value input, :shape "QueueUrl"})

(clojure.core/defn- ser-force-flag [input] #:http.request.field{:value input, :shape "ForceFlag"})

(clojure.core/defn- ser-unsigned-long [input] #:http.request.field{:value input, :shape "UnsignedLong"})

(clojure.core/defn- ser-signature [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Signature"})

(clojure.core/defn- ser-searchable-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "SearchableAttributes", :type "list"})

(clojure.core/defn- ser-message-format [input] #:http.request.field{:value (clojure.core/get {"RAW" "RAW", :raw "RAW", "JSON" "JSON", :json "JSON"} input), :shape "MessageFormat"})

(clojure.core/defn- ser-thing-indexing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-thing-indexing-mode (:thing-indexing-mode input)) #:http.request.field{:name "thingIndexingMode", :shape "ThingIndexingMode"})], :shape "ThingIndexingConfiguration", :type "structure"}))

(clojure.core/defn- ser-audit-frequency [input] #:http.request.field{:value (clojure.core/get {"DAILY" "DAILY", :daily "DAILY", "WEEKLY" "WEEKLY", :weekly "WEEKLY", "BIWEEKLY" "BIWEEKLY", :biweekly "BIWEEKLY", "MONTHLY" "MONTHLY", :monthly "MONTHLY"} input), :shape "AuditFrequency"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-ota-update-file-version [input] #:http.request.field{:value input, :shape "OTAUpdateFileVersion"})

(clojure.core/defn- ser-dynamo-key-type [input] #:http.request.field{:value (clojure.core/get {"STRING" "STRING", :string "STRING", "NUMBER" "NUMBER", :number "NUMBER"} input), :shape "DynamoKeyType"})

(clojure.core/defn- ser-public-key-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-key-name k) #:http.request.field{:map-info "key", :shape "KeyName"}) (clojure.core/into (ser-key-value v) #:http.request.field{:map-info "value", :shape "KeyValue"})])) input), :shape "PublicKeyMap", :type "map"})

(clojure.core/defn- ser-behavior-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BehaviorCriteria", :type "structure"} (clojure.core/contains? input :comparison-operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comparison-operator (input :comparison-operator)) #:http.request.field{:name "comparisonOperator", :shape "ComparisonOperator"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-value (input :value)) #:http.request.field{:name "value", :shape "MetricValue"})) (clojure.core/contains? input :duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration-seconds (input :duration-seconds)) #:http.request.field{:name "durationSeconds", :shape "DurationSeconds"}))))

(clojure.core/defn- ser-signing-profile-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SigningProfileParameter", :type "structure"} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-arn (input :certificate-arn)) #:http.request.field{:name "certificateArn", :shape "CertificateArn"})) (clojure.core/contains? input :platform) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform (input :platform)) #:http.request.field{:name "platform", :shape "Platform"})) (clojure.core/contains? input :certificate-path-on-device) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-path-on-device (input :certificate-path-on-device)) #:http.request.field{:name "certificatePathOnDevice", :shape "CertificatePathOnDevice"}))))

(clojure.core/defn- ser-stream-file [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamFile", :type "structure"} (clojure.core/contains? input :file-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-id (input :file-id)) #:http.request.field{:name "fileId", :shape "FileId"})) (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3-location)) #:http.request.field{:name "s3Location", :shape "S3Location"}))))

(clojure.core/defn- ser-sns-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:target-arn input)) #:http.request.field{:name "targetArn", :shape "AwsArn"}) (clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"})], :shape "SnsAction", :type "structure"} (clojure.core/contains? input :message-format) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-format (input :message-format)) #:http.request.field{:name "messageFormat", :shape "MessageFormat"}))))

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-presigned-url-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PresignedUrlConfig", :type "structure"} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :expires-in-sec) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expires-in-sec (input :expires-in-sec)) #:http.request.field{:name "expiresInSec", :shape "ExpiresInSec"}))))

(clojure.core/defn- ser-undo-deprecate [input] #:http.request.field{:value input, :shape "UndoDeprecate"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-credential-duration-seconds [input] #:http.request.field{:value input, :shape "CredentialDurationSeconds"})

(clojure.core/defn- ser-aws-job-executions-rollout-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsJobExecutionsRolloutConfig", :type "structure"} (clojure.core/contains? input :maximum-per-minute) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-maximum-per-minute (input :maximum-per-minute)) #:http.request.field{:name "maximumPerMinute", :shape "MaximumPerMinute"}))))

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-ota-update-description [input] #:http.request.field{:value input, :shape "OTAUpdateDescription"})

(clojure.core/defn- ser-token-key-name [input] #:http.request.field{:value input, :shape "TokenKeyName"})

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-authorizer-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"} input), :shape "AuthorizerStatus"})

(clojure.core/defn- ser-timeout-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeoutConfig", :type "structure"} (clojure.core/contains? input :in-progress-timeout-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-in-progress-timeout-in-minutes (input :in-progress-timeout-in-minutes)) #:http.request.field{:name "inProgressTimeoutInMinutes", :shape "InProgressTimeoutInMinutes"}))))

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AwsAccountId"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-is-disabled [input] #:http.request.field{:value input, :shape "IsDisabled"})

(clojure.core/defn- ser-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource coll) #:http.request.field{:shape "Resource"}))) input), :shape "Resources", :type "list"})

(clojure.core/defn- ser-attribute-key [input] #:http.request.field{:value input, :shape "AttributeKey"})

(clojure.core/defn- ser-file-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FileLocation", :type "structure"} (clojure.core/contains? input :stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream (input :stream)) #:http.request.field{:name "stream", :shape "Stream"})) (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3-location)) #:http.request.field{:name "s3Location", :shape "S3Location"}))))

(clojure.core/defn- ser-log-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-log-target-type (:target-type input)) #:http.request.field{:name "targetType", :shape "LogTargetType"})], :shape "LogTarget", :type "structure"} (clojure.core/contains? input :target-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-target-name (input :target-name)) #:http.request.field{:name "targetName", :shape "LogTargetName"}))))

(clojure.core/defn- ser-cloudwatch-metric-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-string (:metric-namespace input)) #:http.request.field{:name "metricNamespace", :shape "String"}) (clojure.core/into (ser-string (:metric-name input)) #:http.request.field{:name "metricName", :shape "String"}) (clojure.core/into (ser-string (:metric-value input)) #:http.request.field{:name "metricValue", :shape "String"}) (clojure.core/into (ser-string (:metric-unit input)) #:http.request.field{:name "metricUnit", :shape "String"})], :shape "CloudwatchMetricAction", :type "structure"} (clojure.core/contains? input :metric-timestamp) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :metric-timestamp)) #:http.request.field{:name "metricTimestamp", :shape "String"}))))

(clojure.core/defn- ser-audit-notification-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AuditNotificationTarget", :type "structure"} (clojure.core/contains? input :target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "targetArn", :shape "TargetArn"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "enabled", :shape "Enabled"}))))

(clojure.core/defn- ser-job-executions-rollout-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobExecutionsRolloutConfig", :type "structure"} (clojure.core/contains? input :maximum-per-minute) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-job-executions-per-min (input :maximum-per-minute)) #:http.request.field{:name "maximumPerMinute", :shape "MaxJobExecutionsPerMin"}))))

(clojure.core/defn- ser-attributes-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-key k) #:http.request.field{:map-info "key", :shape "AttributeKey"}) (clojure.core/into (ser-value v) #:http.request.field{:map-info "value", :shape "Value"})])) input), :shape "AttributesMap", :type "map"})

(clojure.core/defn- ser-job-document-source [input] #:http.request.field{:value input, :shape "JobDocumentSource"})

(clojure.core/defn- ser-remove-thing-type [input] #:http.request.field{:value input, :shape "RemoveThingType"})

(clojure.core/defn- ser-delivery-stream-name [input] #:http.request.field{:value input, :shape "DeliveryStreamName"})

(clojure.core/defn- ser-sqs-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-queue-url (:queue-url input)) #:http.request.field{:name "queueUrl", :shape "QueueUrl"})], :shape "SqsAction", :type "structure"} (clojure.core/contains? input :use-base-64) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-base-64 (input :use-base-64)) #:http.request.field{:name "useBase64", :shape "UseBase64"}))))

(clojure.core/defn- ser-s-3-version [input] #:http.request.field{:value input, :shape "S3Version"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-cognito-identity-pool-id [input] #:http.request.field{:value input, :shape "CognitoIdentityPoolId"})

(clojure.core/defn- ser-parameter [input] #:http.request.field{:value input, :shape "Parameter"})

(clojure.core/defn- ser-details-value [input] #:http.request.field{:value input, :shape "DetailsValue"})

(clojure.core/defn- ser-ports [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-port coll) #:http.request.field{:shape "Port"}))) input), :shape "Ports", :type "list"})

(clojure.core/defn- ser-job-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-arn coll) #:http.request.field{:shape "TargetArn"}))) input), :shape "JobTargets", :type "list", :min 1})

(clojure.core/defn- ser-code-signing-signature [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CodeSigningSignature", :type "structure"} (clojure.core/contains? input :inline-document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signature (input :inline-document)) #:http.request.field{:name "inlineDocument", :shape "Signature"}))))

(clojure.core/defn- ser-alert-target-arn [input] #:http.request.field{:value input, :shape "AlertTargetArn"})

(clojure.core/defn- ser-audit-notification-type [input] #:http.request.field{:value (clojure.core/get {"SNS" "SNS", :sns "SNS"} input), :shape "AuditNotificationType"})

(clojure.core/defn- ser-report-type [input] #:http.request.field{:value (clojure.core/get {"ERRORS" "ERRORS", :errors "ERRORS", "RESULTS" "RESULTS", :results "RESULTS"} input), :shape "ReportType"})

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-hash-key-field [input] #:http.request.field{:value input, :shape "HashKeyField"})

(clojure.core/defn- ser-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "Targets", :type "list", :min 1})

(clojure.core/defn- ser-thing-name [input] #:http.request.field{:value input, :shape "ThingName"})

(clojure.core/defn- ser-republish-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-topic-pattern (:topic input)) #:http.request.field{:name "topic", :shape "TopicPattern"})], :shape "RepublishAction", :type "structure"}))

(clojure.core/defn- ser-resource-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceIdentifier", :type "structure"} (clojure.core/contains? input :device-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-id (input :device-certificate-id)) #:http.request.field{:name "deviceCertificateId", :shape "CertificateId"})) (clojure.core/contains? input :ca-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-id (input :ca-certificate-id)) #:http.request.field{:name "caCertificateId", :shape "CertificateId"})) (clojure.core/contains? input :cognito-identity-pool-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-pool-id (input :cognito-identity-pool-id)) #:http.request.field{:name "cognitoIdentityPoolId", :shape "CognitoIdentityPoolId"})) (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id (input :client-id)) #:http.request.field{:name "clientId", :shape "ClientId"})) (clojure.core/contains? input :policy-version-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-version-identifier (input :policy-version-identifier)) #:http.request.field{:name "policyVersionIdentifier", :shape "PolicyVersionIdentifier"})) (clojure.core/contains? input :account) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id (input :account)) #:http.request.field{:name "account", :shape "AwsAccountId"}))))

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-job-execution-status [input] #:http.request.field{:value (clojure.core/get {"CANCELED" "CANCELED", :timed-out "TIMED_OUT", "IN_PROGRESS" "IN_PROGRESS", "TIMED_OUT" "TIMED_OUT", :in-progress "IN_PROGRESS", :rejected "REJECTED", "REMOVED" "REMOVED", :queued "QUEUED", :canceled "CANCELED", "SUCCEEDED" "SUCCEEDED", "REJECTED" "REJECTED", "QUEUED" "QUEUED", "FAILED" "FAILED", :removed "REMOVED", :failed "FAILED", :succeeded "SUCCEEDED"} input), :shape "JobExecutionStatus"})

(clojure.core/defn- ser-metric-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MetricValue", :type "structure"} (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-unsigned-long (input :count)) #:http.request.field{:name "count", :shape "UnsignedLong"})) (clojure.core/contains? input :cidrs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cidrs (input :cidrs)) #:http.request.field{:name "cidrs", :shape "Cidrs"})) (clojure.core/contains? input :ports) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ports (input :ports)) #:http.request.field{:name "ports", :shape "Ports"}))))

(clojure.core/defn- ser-client-id [input] #:http.request.field{:value input, :shape "ClientId"})

(clojure.core/defn- ser-audit-check-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-audit-check-name k) #:http.request.field{:map-info "key", :shape "AuditCheckName"}) (clojure.core/into (ser-audit-check-configuration v) #:http.request.field{:map-info "value", :shape "AuditCheckConfiguration"})])) input), :shape "AuditCheckConfigurations", :type "map"})

(clojure.core/defn- ser-delete-scheduled-audits [input] #:http.request.field{:value input, :shape "DeleteScheduledAudits"})

(clojure.core/defn- ser-elasticsearch-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-elasticsearch-endpoint (:endpoint input)) #:http.request.field{:name "endpoint", :shape "ElasticsearchEndpoint"}) (clojure.core/into (ser-elasticsearch-index (:index input)) #:http.request.field{:name "index", :shape "ElasticsearchIndex"}) (clojure.core/into (ser-elasticsearch-type (:type input)) #:http.request.field{:name "type", :shape "ElasticsearchType"}) (clojure.core/into (ser-elasticsearch-id (:id input)) #:http.request.field{:name "id", :shape "ElasticsearchId"})], :shape "ElasticsearchAction", :type "structure"}))

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "bucket", :shape "S3Bucket"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :key)) #:http.request.field{:name "key", :shape "S3Key"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-version (input :version)) #:http.request.field{:name "version", :shape "S3Version"}))))

(clojure.core/defn- ser-elasticsearch-index [input] #:http.request.field{:value input, :shape "ElasticsearchIndex"})

(clojure.core/defn- ser-certificate-arn [input] #:http.request.field{:value input, :shape "CertificateArn"})

(clojure.core/defn- ser-custom-code-signing [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CustomCodeSigning", :type "structure"} (clojure.core/contains? input :signature) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-signing-signature (input :signature)) #:http.request.field{:name "signature", :shape "CodeSigningSignature"})) (clojure.core/contains? input :certificate-chain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-signing-certificate-chain (input :certificate-chain)) #:http.request.field{:name "certificateChain", :shape "CodeSigningCertificateChain"})) (clojure.core/contains? input :hash-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-algorithm (input :hash-algorithm)) #:http.request.field{:name "hashAlgorithm", :shape "HashAlgorithm"})) (clojure.core/contains? input :signature-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signature-algorithm (input :signature-algorithm)) #:http.request.field{:name "signatureAlgorithm", :shape "SignatureAlgorithm"}))))

(clojure.core/defn- ser-set-as-active [input] #:http.request.field{:value input, :shape "SetAsActive"})

(clojure.core/defn- ser-table-name [input] #:http.request.field{:value input, :shape "TableName"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-aws-iot-sql-version [input] #:http.request.field{:value input, :shape "AwsIotSqlVersion"})

(clojure.core/defn- ser-auth-infos [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-auth-info coll) #:http.request.field{:shape "AuthInfo"}))) input), :shape "AuthInfos", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Stream", :type "structure"} (clojure.core/contains? input :stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-id (input :stream-id)) #:http.request.field{:name "streamId", :shape "StreamId"})) (clojure.core/contains? input :file-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-id (input :file-id)) #:http.request.field{:name "fileId", :shape "FileId"}))))

(clojure.core/defn- ser-sql [input] #:http.request.field{:value input, :shape "SQL"})

(clojure.core/defn- ser-details-key [input] #:http.request.field{:value input, :shape "DetailsKey"})

(clojure.core/defn- ser-registry-s-3-bucket-name [input] #:http.request.field{:value input, :shape "RegistryS3BucketName"})

(clojure.core/defn- ser-dynamo-db-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-table-name (:table-name input)) #:http.request.field{:name "tableName", :shape "TableName"}) (clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-hash-key-field (:hash-key-field input)) #:http.request.field{:name "hashKeyField", :shape "HashKeyField"}) (clojure.core/into (ser-hash-key-value (:hash-key-value input)) #:http.request.field{:name "hashKeyValue", :shape "HashKeyValue"})], :shape "DynamoDBAction", :type "structure"} (clojure.core/contains? input :range-key-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range-key-value (input :range-key-value)) #:http.request.field{:name "rangeKeyValue", :shape "RangeKeyValue"})) (clojure.core/contains? input :range-key-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-range-key-field (input :range-key-field)) #:http.request.field{:name "rangeKeyField", :shape "RangeKeyField"})) (clojure.core/contains? input :hash-key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-key-type (input :hash-key-type)) #:http.request.field{:name "hashKeyType", :shape "DynamoKeyType"})) (clojure.core/contains? input :operation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-operation (input :operation)) #:http.request.field{:name "operation", :shape "DynamoOperation"})) (clojure.core/contains? input :payload-field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-payload-field (input :payload-field)) #:http.request.field{:name "payloadField", :shape "PayloadField"})) (clojure.core/contains? input :range-key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-key-type (input :range-key-type)) #:http.request.field{:name "rangeKeyType", :shape "DynamoKeyType"}))))

(clojure.core/defn- ser-policy-version-id [input] #:http.request.field{:value input, :shape "PolicyVersionId"})

(clojure.core/defn- ser-alert-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-alert-target-arn (:alert-target-arn input)) #:http.request.field{:name "alertTargetArn", :shape "AlertTargetArn"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"})], :shape "AlertTarget", :type "structure"}))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-dynamo-operation [input] #:http.request.field{:value input, :shape "DynamoOperation"})

(clojure.core/defn- ser-hash-algorithm [input] #:http.request.field{:value input, :shape "HashAlgorithm"})

(clojure.core/defn- ser-certificate-status [input] #:http.request.field{:value (clojure.core/get {:inactive "INACTIVE", "REGISTER_INACTIVE" "REGISTER_INACTIVE", "REVOKED" "REVOKED", :revoked "REVOKED", :pending-activation "PENDING_ACTIVATION", :register-inactive "REGISTER_INACTIVE", :pending-transfer "PENDING_TRANSFER", :active "ACTIVE", "INACTIVE" "INACTIVE", "PENDING_ACTIVATION" "PENDING_ACTIVATION", "ACTIVE" "ACTIVE", "PENDING_TRANSFER" "PENDING_TRANSFER"} input), :shape "CertificateStatus"})

(clojure.core/defn- ser-policy-version-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PolicyVersionIdentifier", :type "structure"} (clojure.core/contains? input :policy-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName"})) (clojure.core/contains? input :policy-version-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-version-id (input :policy-version-id)) #:http.request.field{:name "policyVersionId", :shape "PolicyVersionId"}))))

(clojure.core/defn- ser-authorizer-name [input] #:http.request.field{:value input, :shape "AuthorizerName"})

(clojure.core/defn- ser-maximum-per-minute [input] #:http.request.field{:value input, :shape "MaximumPerMinute"})

(clojure.core/defn- ser-behavior-name [input] #:http.request.field{:value input, :shape "BehaviorName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-s-3-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Destination", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "bucket", :shape "S3Bucket"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-set-as-default [input] #:http.request.field{:value input, :shape "SetAsDefault"})

(clojure.core/defn- ser-resource [input] #:http.request.field{:value input, :shape "Resource"})

(clojure.core/defn- ser-state-machine-name [input] #:http.request.field{:value input, :shape "StateMachineName"})

(clojure.core/defn- ser-logging-options-payload [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"})], :shape "LoggingOptionsPayload", :type "structure"} (clojure.core/contains? input :log-level) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :log-level)) #:http.request.field{:name "logLevel", :shape "LogLevel"}))))

(clojure.core/defn- ser-elasticsearch-id [input] #:http.request.field{:value input, :shape "ElasticsearchId"})

(clojure.core/defn- ser-file-id [input] #:http.request.field{:value input, :shape "FileId"})

(clojure.core/defn- ser-salesforce-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-salesforce-token (:token input)) #:http.request.field{:name "token", :shape "SalesforceToken"}) (clojure.core/into (ser-salesforce-endpoint (:url input)) #:http.request.field{:name "url", :shape "SalesforceEndpoint"})], :shape "SalesforceAction", :type "structure"}))

(clojure.core/defn- ser-event-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-event-type k) #:http.request.field{:map-info "key", :shape "EventType"}) (clojure.core/into (ser-configuration v) #:http.request.field{:map-info "value", :shape "Configuration"})])) input), :shape "EventConfigurations", :type "map"})

(clojure.core/defn- ser-salesforce-endpoint [input] #:http.request.field{:value input, :shape "SalesforceEndpoint"})

(clojure.core/defn- ser-step-functions-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-state-machine-name (:state-machine-name input)) #:http.request.field{:name "stateMachineName", :shape "StateMachineName"}) (clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"})], :shape "StepFunctionsAction", :type "structure"} (clojure.core/contains? input :execution-name-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-name-prefix (input :execution-name-prefix)) #:http.request.field{:name "executionNamePrefix", :shape "ExecutionNamePrefix"}))))

(clojure.core/defn- ser-ascending-order [input] #:http.request.field{:value input, :shape "AscendingOrder"})

(clojure.core/defn- ser-auth-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AuthInfo", :type "structure"} (clojure.core/contains? input :action-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-type (input :action-type)) #:http.request.field{:name "actionType", :shape "ActionType"})) (clojure.core/contains? input :resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resources (input :resources)) #:http.request.field{:name "resources", :shape "Resources"}))))

(clojure.core/defn- ser-target [input] #:http.request.field{:value input, :shape "Target"})

(clojure.core/defn- ser-ge-max-results [input] #:http.request.field{:value input, :shape "GEMaxResults"})

(clojure.core/defn- ser-optional-version [input] #:http.request.field{:value input, :shape "OptionalVersion"})

(clojure.core/defn- ser-action-type [input] #:http.request.field{:value (clojure.core/get {"PUBLISH" "PUBLISH", :publish "PUBLISH", "SUBSCRIBE" "SUBSCRIBE", :subscribe "SUBSCRIBE", "RECEIVE" "RECEIVE", :receive "RECEIVE", "CONNECT" "CONNECT", :connect "CONNECT"} input), :shape "ActionType"})

(clojure.core/defn- ser-thing-group-name [input] #:http.request.field{:value input, :shape "ThingGroupName"})

(clojure.core/defn- ser-principal [input] #:http.request.field{:value input, :shape "Principal"})

(clojure.core/defn- ser-policy-target [input] #:http.request.field{:value input, :shape "PolicyTarget"})

(clojure.core/defn- ser-execution-name-prefix [input] #:http.request.field{:value input, :shape "ExecutionNamePrefix"})

(clojure.core/defn- ser-scheduled-audit-name [input] #:http.request.field{:value input, :shape "ScheduledAuditName"})

(clojure.core/defn- ser-cloudwatch-alarm-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-alarm-name (:alarm-name input)) #:http.request.field{:name "alarmName", :shape "AlarmName"}) (clojure.core/into (ser-state-reason (:state-reason input)) #:http.request.field{:name "stateReason", :shape "StateReason"}) (clojure.core/into (ser-state-value (:state-value input)) #:http.request.field{:name "stateValue", :shape "StateValue"})], :shape "CloudwatchAlarmAction", :type "structure"}))

(clojure.core/defn- ser-signing-job-id [input] #:http.request.field{:value input, :shape "SigningJobId"})

(clojure.core/defn- ser-lambda-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-function-arn (:function-arn input)) #:http.request.field{:name "functionArn", :shape "FunctionArn"})], :shape "LambdaAction", :type "structure"}))

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-certificate-id [input] #:http.request.field{:value input, :shape "CertificateId"})

(clojure.core/defn- ser-ota-update-status [input] #:http.request.field{:value (clojure.core/get {"CREATE_PENDING" "CREATE_PENDING", :create-pending "CREATE_PENDING", "CREATE_IN_PROGRESS" "CREATE_IN_PROGRESS", :create-in-progress "CREATE_IN_PROGRESS", "CREATE_COMPLETE" "CREATE_COMPLETE", :create-complete "CREATE_COMPLETE", "CREATE_FAILED" "CREATE_FAILED", :create-failed "CREATE_FAILED"} input), :shape "OTAUpdateStatus"})

(clojure.core/defn- ser-certificate-pem [input] #:http.request.field{:value input, :shape "CertificatePem"})

(clojure.core/defn- ser-file-name [input] #:http.request.field{:value input, :shape "FileName"})

(clojure.core/defn- ser-ota-update-id [input] #:http.request.field{:value input, :shape "OTAUpdateId"})

(clojure.core/defn- ser-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Action", :type "structure"} (clojure.core/contains? input :dynamo-db) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-db-action (input :dynamo-db)) #:http.request.field{:name "dynamoDB", :shape "DynamoDBAction"})) (clojure.core/contains? input :sns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-action (input :sns)) #:http.request.field{:name "sns", :shape "SnsAction"})) (clojure.core/contains? input :cloudwatch-alarm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloudwatch-alarm-action (input :cloudwatch-alarm)) #:http.request.field{:name "cloudwatchAlarm", :shape "CloudwatchAlarmAction"})) (clojure.core/contains? input :iot-analytics) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iot-analytics-action (input :iot-analytics)) #:http.request.field{:name "iotAnalytics", :shape "IotAnalyticsAction"})) (clojure.core/contains? input :republish) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-republish-action (input :republish)) #:http.request.field{:name "republish", :shape "RepublishAction"})) (clojure.core/contains? input :kinesis) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-action (input :kinesis)) #:http.request.field{:name "kinesis", :shape "KinesisAction"})) (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-action (input :s-3)) #:http.request.field{:name "s3", :shape "S3Action"})) (clojure.core/contains? input :salesforce) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-salesforce-action (input :salesforce)) #:http.request.field{:name "salesforce", :shape "SalesforceAction"})) (clojure.core/contains? input :sqs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sqs-action (input :sqs)) #:http.request.field{:name "sqs", :shape "SqsAction"})) (clojure.core/contains? input :elasticsearch) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elasticsearch-action (input :elasticsearch)) #:http.request.field{:name "elasticsearch", :shape "ElasticsearchAction"})) (clojure.core/contains? input :cloudwatch-metric) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloudwatch-metric-action (input :cloudwatch-metric)) #:http.request.field{:name "cloudwatchMetric", :shape "CloudwatchMetricAction"})) (clojure.core/contains? input :firehose) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-firehose-action (input :firehose)) #:http.request.field{:name "firehose", :shape "FirehoseAction"})) (clojure.core/contains? input :dynamo-d-bv-2) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dynamo-d-bv-2-action (input :dynamo-d-bv-2)) #:http.request.field{:name "dynamoDBv2", :shape "DynamoDBv2Action"})) (clojure.core/contains? input :lambda) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-action (input :lambda)) #:http.request.field{:name "lambda", :shape "LambdaAction"})) (clojure.core/contains? input :step-functions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-functions-action (input :step-functions)) #:http.request.field{:name "stepFunctions", :shape "StepFunctionsAction"}))))

(clojure.core/defn- ser-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Configuration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"}))))

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-job-description [input] #:http.request.field{:value input, :shape "JobDescription"})

(clojure.core/defn- ser-state-reason [input] #:http.request.field{:value input, :shape "StateReason"})

(clojure.core/defn- ser-elasticsearch-endpoint [input] #:http.request.field{:value input, :shape "ElasticsearchEndpoint"})

(clojure.core/defn- ser-signing-profile-name [input] #:http.request.field{:value input, :shape "SigningProfileName"})

(clojure.core/defn- ser-details-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-details-key k) #:http.request.field{:map-info "key", :shape "DetailsKey"}) (clojure.core/into (ser-details-value v) #:http.request.field{:map-info "value", :shape "DetailsValue"})])) input), :shape "DetailsMap", :type "map"})

(clojure.core/defn- ser-force-delete [input] #:http.request.field{:value input, :shape "ForceDelete"})

(clojure.core/defn- ser-recursive [input] #:http.request.field{:value input, :shape "Recursive"})

(clojure.core/defn- ser-audit-check-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AuditCheckConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "enabled", :shape "Enabled"}))))

(clojure.core/defn- ser-audit-task-status [input] #:http.request.field{:value (clojure.core/get {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETED" "COMPLETED", :completed "COMPLETED", "FAILED" "FAILED", :failed "FAILED", "CANCELED" "CANCELED", :canceled "CANCELED"} input), :shape "AuditTaskStatus"})

(clojure.core/defn- ser-s-3-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"}) (clojure.core/into (ser-key (:key input)) #:http.request.field{:name "key", :shape "Key"})], :shape "S3Action", :type "structure"} (clojure.core/contains? input :canned-acl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-canned-access-control-list (input :canned-acl)) #:http.request.field{:name "cannedAcl", :shape "CannedAccessControlList"}))))

(clojure.core/defn- ser-iot-analytics-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IotAnalyticsAction", :type "structure"} (clojure.core/contains? input :channel-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-arn (input :channel-arn)) #:http.request.field{:name "channelArn", :shape "AwsArn"})) (clojure.core/contains? input :channel-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-channel-name (input :channel-name)) #:http.request.field{:name "channelName", :shape "ChannelName"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "AwsArn"}))))

(clojure.core/defn- ser-kinesis-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-aws-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "AwsArn"}) (clojure.core/into (ser-stream-name (:stream-name input)) #:http.request.field{:name "streamName", :shape "StreamName"})], :shape "KinesisAction", :type "structure"} (clojure.core/contains? input :partition-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partition-key (input :partition-key)) #:http.request.field{:name "partitionKey", :shape "PartitionKey"}))))

(clojure.core/defn- ser-query-max-results [input] #:http.request.field{:value input, :shape "QueryMaxResults"})

(clojure.core/defn- ser-audit-task-id [input] #:http.request.field{:value input, :shape "AuditTaskId"})

(clojure.core/defn- ser-thing-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-thing-group-name coll) #:http.request.field{:shape "ThingGroupName"}))) input), :shape "ThingGroupList", :type "list"})

(clojure.core/defn- ser-payload-field [input] #:http.request.field{:value input, :shape "PayloadField"})

(clojure.core/defn- ser-authorizer-function-arn [input] #:http.request.field{:value input, :shape "AuthorizerFunctionArn"})

(clojure.core/defn- ser-firehose-separator [input] #:http.request.field{:value input, :shape "FirehoseSeparator"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-start-on-demand-audit-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-audit-check-names (input :target-check-names)) #:http.request.field{:name "targetCheckNames", :shape "TargetAuditCheckNames"})]}))

(clojure.core/defn- req-accept-certificate-transfer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})]} (clojure.core/contains? input :set-as-active) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-active (input :set-as-active)) #:http.request.field{:name "setAsActive", :shape "SetAsActive", :location "querystring", :location-name "setAsActive"}))))

(clojure.core/defn- req-list-violation-events-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp", :location "querystring", :location-name "startTime"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp", :location "querystring", :location-name "endTime"})]} (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "querystring", :location-name "thingName"})) (clojure.core/contains? input :security-profile-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "querystring", :location-name "securityProfileName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-list-authorizers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorizer-status (input :status)) #:http.request.field{:name "status", :shape "AuthorizerStatus", :location "querystring", :location-name "status"}))))

(clojure.core/defn- req-delete-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})]} (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion", :location "querystring", :location-name "expectedVersion"}))))

(clojure.core/defn- req-deprecate-thing-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "uri", :location-name "thingTypeName"})]} (clojure.core/contains? input :undo-deprecate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-undo-deprecate (input :undo-deprecate)) #:http.request.field{:name "undoDeprecate", :shape "UndoDeprecate"}))))

(clojure.core/defn- req-detach-principal-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-iot-principal"})]}))

(clojure.core/defn- req-test-invoke-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName", :location "uri", :location-name "authorizerName"})], :body [(clojure.core/into (ser-token (input :token)) #:http.request.field{:name "token", :shape "Token"}) (clojure.core/into (ser-token-signature (input :token-signature)) #:http.request.field{:name "tokenSignature", :shape "TokenSignature"})]}))

(clojure.core/defn- req-register-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate-pem (input :certificate-pem)) #:http.request.field{:name "certificatePem", :shape "CertificatePem"})]} (clojure.core/contains? input :ca-certificate-pem) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-pem (input :ca-certificate-pem)) #:http.request.field{:name "caCertificatePem", :shape "CertificatePem"})) (clojure.core/contains? input :set-as-active) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-active-flag (input :set-as-active)) #:http.request.field{:name "setAsActive", :shape "SetAsActiveFlag", :deprecated true, :location "querystring", :location-name "setAsActive"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-status (input :status)) #:http.request.field{:name "status", :shape "CertificateStatus"}))))

(clojure.core/defn- req-create-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :thing-type-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName"})) (clojure.core/contains? input :attribute-payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-payload (input :attribute-payload)) #:http.request.field{:name "attributePayload", :shape "AttributePayload"}))))

(clojure.core/defn- req-list-ota-updates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :ota-update-status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ota-update-status (input :ota-update-status)) #:http.request.field{:name "otaUpdateStatus", :shape "OTAUpdateStatus", :location "querystring", :location-name "otaUpdateStatus"}))))

(clojure.core/defn- req-transfer-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})], :querystring [(clojure.core/into (ser-aws-account-id (input :target-aws-account)) #:http.request.field{:name "targetAwsAccount", :shape "AwsAccountId", :location "querystring", :location-name "targetAwsAccount"})]} (clojure.core/contains? input :transfer-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :transfer-message)) #:http.request.field{:name "transferMessage", :shape "Message"}))))

(clojure.core/defn- req-update-event-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :event-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-configurations (input :event-configurations)) #:http.request.field{:name "eventConfigurations", :shape "EventConfigurations"}))))

(clojure.core/defn- req-update-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})], :querystring [(clojure.core/into (ser-certificate-status (input :new-status)) #:http.request.field{:name "newStatus", :shape "CertificateStatus", :location "querystring", :location-name "newStatus"})]}))

(clojure.core/defn- req-get-v-2-logging-options-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-keys-and-certificate-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :set-as-active) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-active (input :set-as-active)) #:http.request.field{:name "setAsActive", :shape "SetAsActive", :location "querystring", :location-name "setAsActive"}))))

(clojure.core/defn- req-update-ca-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "caCertificateId"})]} (clojure.core/contains? input :new-status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ca-certificate-status (input :new-status)) #:http.request.field{:name "newStatus", :shape "CACertificateStatus", :location "querystring", :location-name "newStatus"})) (clojure.core/contains? input :new-auto-registration-status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-registration-status (input :new-auto-registration-status)) #:http.request.field{:name "newAutoRegistrationStatus", :shape "AutoRegistrationStatus", :location "querystring", :location-name "newAutoRegistrationStatus"})) (clojure.core/contains? input :registration-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registration-config (input :registration-config)) #:http.request.field{:name "registrationConfig", :shape "RegistrationConfig"})) (clojure.core/contains? input :remove-auto-registration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remove-auto-registration (input :remove-auto-registration)) #:http.request.field{:name "removeAutoRegistration", :shape "RemoveAutoRegistration"}))))

(clojure.core/defn- req-search-index-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "queryString", :shape "QueryString"})]} (clojure.core/contains? input :index-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-index-name (input :index-name)) #:http.request.field{:name "indexName", :shape "IndexName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "QueryMaxResults"})) (clojure.core/contains? input :query-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-version (input :query-version)) #:http.request.field{:name "queryVersion", :shape "QueryVersion"}))))

(clojure.core/defn- req-describe-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})]}))

(clojure.core/defn- req-list-topic-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :topic) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic (input :topic)) #:http.request.field{:name "topic", :shape "Topic", :location "querystring", :location-name "topic"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ge-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "GEMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :rule-disabled) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-disabled (input :rule-disabled)) #:http.request.field{:name "ruleDisabled", :shape "IsDisabled", :location "querystring", :location-name "ruleDisabled"}))))

(clojure.core/defn- req-list-outgoing-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-list-principal-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-iot-principal"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-set-default-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"}) (clojure.core/into (ser-policy-version-id (input :policy-version-id)) #:http.request.field{:name "policyVersionId", :shape "PolicyVersionId", :location "uri", :location-name "policyVersionId"})]}))

(clojure.core/defn- req-describe-default-authorizer-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-enable-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})]}))

(clojure.core/defn- req-create-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-stream-id (input :stream-id)) #:http.request.field{:name "streamId", :shape "StreamId", :location "uri", :location-name "streamId"})], :body [(clojure.core/into (ser-stream-files (input :files)) #:http.request.field{:name "files", :shape "StreamFiles"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-description (input :description)) #:http.request.field{:name "description", :shape "StreamDescription"}))))

(clojure.core/defn- req-reject-certificate-transfer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})]} (clojure.core/contains? input :reject-reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :reject-reason)) #:http.request.field{:name "rejectReason", :shape "Message"}))))

(clojure.core/defn- req-list-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-describe-audit-task-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-audit-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "AuditTaskId", :location "uri", :location-name "taskId"})]}))

(clojure.core/defn- req-describe-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]}))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :status)) #:http.request.field{:name "status", :shape "JobStatus", :location "querystring", :location-name "status"})) (clojure.core/contains? input :target-selection) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-selection (input :target-selection)) #:http.request.field{:name "targetSelection", :shape "TargetSelection", :location "querystring", :location-name "targetSelection"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-laser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "LaserMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :thing-group-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "querystring", :location-name "thingGroupName"})) (clojure.core/contains? input :thing-group-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-id (input :thing-group-id)) #:http.request.field{:name "thingGroupId", :shape "ThingGroupId", :location "querystring", :location-name "thingGroupId"}))))

(clojure.core/defn- req-attach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :body [(clojure.core/into (ser-policy-target (input :target)) #:http.request.field{:name "target", :shape "PolicyTarget"})]}))

(clojure.core/defn- req-describe-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-delete-thing-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "uri", :location-name "thingGroupName"})]} (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion", :location "querystring", :location-name "expectedVersion"}))))

(clojure.core/defn- req-create-thing-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "uri", :location-name "thingGroupName"})]} (clojure.core/contains? input :parent-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :parent-group-name)) #:http.request.field{:name "parentGroupName", :shape "ThingGroupName"})) (clojure.core/contains? input :thing-group-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-properties (input :thing-group-properties)) #:http.request.field{:name "thingGroupProperties", :shape "ThingGroupProperties"}))))

(clojure.core/defn- req-describe-thing-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "uri", :location-name "thingTypeName"})]}))

(clojure.core/defn- req-describe-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})]}))

(clojure.core/defn- req-set-v-2-logging-options-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "AwsArn"})) (clojure.core/contains? input :default-log-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-level (input :default-log-level)) #:http.request.field{:name "defaultLogLevel", :shape "LogLevel"})) (clojure.core/contains? input :disable-all-logs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-all-logs (input :disable-all-logs)) #:http.request.field{:name "disableAllLogs", :shape "DisableAllLogs"}))))

(clojure.core/defn- req-list-thing-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :thing-type-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "querystring", :location-name "thingTypeName"}))))

(clojure.core/defn- req-delete-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion", :location "querystring", :location-name "expectedVersion"}))))

(clojure.core/defn- req-create-role-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-role-alias (input :role-alias)) #:http.request.field{:name "roleAlias", :shape "RoleAlias", :location "uri", :location-name "roleAlias"})], :body [(clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})]} (clojure.core/contains? input :credential-duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-credential-duration-seconds (input :credential-duration-seconds)) #:http.request.field{:name "credentialDurationSeconds", :shape "CredentialDurationSeconds"}))))

(clojure.core/defn- req-update-indexing-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :thing-indexing-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-indexing-configuration (input :thing-indexing-configuration)) #:http.request.field{:name "thingIndexingConfiguration", :shape "ThingIndexingConfiguration"})) (clojure.core/contains? input :thing-group-indexing-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-indexing-configuration (input :thing-group-indexing-configuration)) #:http.request.field{:name "thingGroupIndexingConfiguration", :shape "ThingGroupIndexingConfiguration"}))))

(clojure.core/defn- req-update-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-stream-id (input :stream-id)) #:http.request.field{:name "streamId", :shape "StreamId", :location "uri", :location-name "streamId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-description (input :description)) #:http.request.field{:name "description", :shape "StreamDescription"})) (clojure.core/contains? input :files) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stream-files (input :files)) #:http.request.field{:name "files", :shape "StreamFiles"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"}))))

(clojure.core/defn- req-detach-thing-principal-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})], :header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-principal"})]}))

(clojure.core/defn- req-list-indices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "QueryMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-list-thing-groups-for-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-attach-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})], :querystring [(clojure.core/into (ser-security-profile-target-arn (input :security-profile-target-arn)) #:http.request.field{:name "securityProfileTargetArn", :shape "SecurityProfileTargetArn", :location "querystring", :location-name "securityProfileTargetArn"})]}))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment (input :comment)) #:http.request.field{:name "comment", :shape "Comment"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag", :location "querystring", :location-name "force"}))))

(clojure.core/defn- req-create-certificate-from-csr-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate-signing-request (input :certificate-signing-request)) #:http.request.field{:name "certificateSigningRequest", :shape "CertificateSigningRequest"})]} (clojure.core/contains? input :set-as-active) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-active (input :set-as-active)) #:http.request.field{:name "setAsActive", :shape "SetAsActive", :location "querystring", :location-name "setAsActive"}))))

(clojure.core/defn- req-create-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})], :body [(clojure.core/into (ser-behaviors (input :behaviors)) #:http.request.field{:name "behaviors", :shape "Behaviors"})]} (clojure.core/contains? input :security-profile-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-profile-description (input :security-profile-description)) #:http.request.field{:name "securityProfileDescription", :shape "SecurityProfileDescription"})) (clojure.core/contains? input :alert-targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alert-targets (input :alert-targets)) #:http.request.field{:name "alertTargets", :shape "AlertTargets"}))))

(clojure.core/defn- req-delete-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})]}))

(clojure.core/defn- req-list-active-violations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "querystring", :location-name "thingName"})) (clojure.core/contains? input :security-profile-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "querystring", :location-name "securityProfileName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-cancel-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"}) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag", :location "querystring", :location-name "force"})) (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expected-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "ExpectedVersion"})) (clojure.core/contains? input :status-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-details-map (input :status-details)) #:http.request.field{:name "statusDetails", :shape "DetailsMap"}))))

(clojure.core/defn- req-list-thing-principals-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]}))

(clojure.core/defn- req-describe-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName", :location "uri", :location-name "authorizerName"})]}))

(clojure.core/defn- req-delete-registration-code-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-ca-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "caCertificateId"})]}))

(clojure.core/defn- req-describe-index-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-index-name (input :index-name)) #:http.request.field{:name "indexName", :shape "IndexName", :location "uri", :location-name "indexName"})]}))

(clojure.core/defn- req-get-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})]}))

(clojure.core/defn- req-create-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :body [(clojure.core/into (ser-policy-document (input :policy-document)) #:http.request.field{:name "policyDocument", :shape "PolicyDocument"})]}))

(clojure.core/defn- req-attach-principal-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-iot-principal"})]}))

(clojure.core/defn- req-list-scheduled-audits-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-ota-update-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ota-update-id (input :ota-update-id)) #:http.request.field{:name "otaUpdateId", :shape "OTAUpdateId", :location "uri", :location-name "otaUpdateId"})]} (clojure.core/contains? input :delete-stream) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-stream (input :delete-stream)) #:http.request.field{:name "deleteStream", :shape "DeleteStream", :location "querystring", :location-name "deleteStream"})) (clojure.core/contains? input :force-delete-aws-job) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-delete-aws-job (input :force-delete-aws-job)) #:http.request.field{:name "forceDeleteAWSJob", :shape "ForceDeleteAWSJob", :location "querystring", :location-name "forceDeleteAWSJob"}))))

(clojure.core/defn- req-list-thing-registration-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-status (input :status)) #:http.request.field{:name "status", :shape "Status", :location "querystring", :location-name "status"}))))

(clojure.core/defn- req-delete-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-stream-id (input :stream-id)) #:http.request.field{:name "streamId", :shape "StreamId", :location "uri", :location-name "streamId"})]}))

(clojure.core/defn- req-list-security-profiles-for-target-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-security-profile-target-arn (input :security-profile-target-arn)) #:http.request.field{:name "securityProfileTargetArn", :shape "SecurityProfileTargetArn", :location "querystring", :location-name "securityProfileTargetArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recursive (input :recursive)) #:http.request.field{:name "recursive", :shape "Recursive", :location "querystring", :location-name "recursive"}))))

(clojure.core/defn- req-register-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "templateBody", :shape "TemplateBody"})]} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters (input :parameters)) #:http.request.field{:name "parameters", :shape "Parameters"}))))

(clojure.core/defn- req-list-targets-for-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"}))))

(clojure.core/defn- req-list-streams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-stop-thing-registration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "TaskId", :location "uri", :location-name "taskId"})]}))

(clojure.core/defn- req-list-audit-findings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :task-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "AuditTaskId"})) (clojure.core/contains? input :check-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-check-name (input :check-name)) #:http.request.field{:name "checkName", :shape "AuditCheckName"})) (clojure.core/contains? input :resource-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-identifier (input :resource-identifier)) #:http.request.field{:name "resourceIdentifier", :shape "ResourceIdentifier"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp"}))))

(clojure.core/defn- req-list-role-aliases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-describe-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"}) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :execution-number) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-number (input :execution-number)) #:http.request.field{:name "executionNumber", :shape "ExecutionNumber", :location "querystring", :location-name "executionNumber"}))))

(clojure.core/defn- req-describe-thing-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "uri", :location-name "thingGroupName"})]}))

(clojure.core/defn- req-create-ota-update-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ota-update-id (input :ota-update-id)) #:http.request.field{:name "otaUpdateId", :shape "OTAUpdateId", :location "uri", :location-name "otaUpdateId"})], :body [(clojure.core/into (ser-targets (input :targets)) #:http.request.field{:name "targets", :shape "Targets"}) (clojure.core/into (ser-ota-update-files (input :files)) #:http.request.field{:name "files", :shape "OTAUpdateFiles"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ota-update-description (input :description)) #:http.request.field{:name "description", :shape "OTAUpdateDescription"})) (clojure.core/contains? input :target-selection) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-selection (input :target-selection)) #:http.request.field{:name "targetSelection", :shape "TargetSelection"})) (clojure.core/contains? input :aws-job-executions-rollout-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-job-executions-rollout-config (input :aws-job-executions-rollout-config)) #:http.request.field{:name "awsJobExecutionsRolloutConfig", :shape "AwsJobExecutionsRolloutConfig"})) (clojure.core/contains? input :additional-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-parameter-map (input :additional-parameters)) #:http.request.field{:name "additionalParameters", :shape "AdditionalParameterMap"}))))

(clojure.core/defn- req-delete-v-2-logging-level-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-log-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "LogTargetType", :location "querystring", :location-name "targetType"}) (clojure.core/into (ser-log-target-name (input :target-name)) #:http.request.field{:name "targetName", :shape "LogTargetName", :location "querystring", :location-name "targetName"})]}))

(clojure.core/defn- req-list-ca-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-delete-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})]} (clojure.core/contains? input :force-delete) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-delete (input :force-delete)) #:http.request.field{:name "forceDelete", :shape "ForceDelete", :location "querystring", :location-name "forceDelete"}))))

(clojure.core/defn- req-cancel-certificate-transfer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "certificateId"})]}))

(clojure.core/defn- req-get-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})]}))

(clojure.core/defn- req-create-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})], :body [(clojure.core/into (ser-job-targets (input :targets)) #:http.request.field{:name "targets", :shape "JobTargets"})]} (clojure.core/contains? input :target-selection) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-selection (input :target-selection)) #:http.request.field{:name "targetSelection", :shape "TargetSelection"})) (clojure.core/contains? input :timeout-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout-config (input :timeout-config)) #:http.request.field{:name "timeoutConfig", :shape "TimeoutConfig"})) (clojure.core/contains? input :document) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-document (input :document)) #:http.request.field{:name "document", :shape "JobDocument"})) (clojure.core/contains? input :document-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-document-source (input :document-source)) #:http.request.field{:name "documentSource", :shape "JobDocumentSource"})) (clojure.core/contains? input :presigned-url-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-presigned-url-config (input :presigned-url-config)) #:http.request.field{:name "presignedUrlConfig", :shape "PresignedUrlConfig"})) (clojure.core/contains? input :job-executions-rollout-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-executions-rollout-config (input :job-executions-rollout-config)) #:http.request.field{:name "jobExecutionsRolloutConfig", :shape "JobExecutionsRolloutConfig"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-description (input :description)) #:http.request.field{:name "description", :shape "JobDescription"}))))

(clojure.core/defn- req-get-logging-options-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-event-configurations-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-role-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-role-alias (input :role-alias)) #:http.request.field{:name "roleAlias", :shape "RoleAlias", :location "uri", :location-name "roleAlias"})]}))

(clojure.core/defn- req-delete-thing-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "uri", :location-name "thingTypeName"})]}))

(clojure.core/defn- req-delete-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})]}))

(clojure.core/defn- req-delete-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"}) (clojure.core/into (ser-policy-version-id (input :policy-version-id)) #:http.request.field{:name "policyVersionId", :shape "PolicyVersionId", :location "uri", :location-name "policyVersionId"})]}))

(clojure.core/defn- req-list-attached-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-target (input :target)) #:http.request.field{:name "target", :shape "PolicyTarget", :location "uri", :location-name "target"})]} (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recursive (input :recursive)) #:http.request.field{:name "recursive", :shape "Recursive", :location "querystring", :location-name "recursive"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"}))))

(clojure.core/defn- req-set-default-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName"})]}))

(clojure.core/defn- req-describe-account-audit-configuration-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-remove-thing-from-thing-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :thing-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName"})) (clojure.core/contains? input :thing-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-arn (input :thing-group-arn)) #:http.request.field{:name "thingGroupArn", :shape "ThingGroupArn"})) (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName"})) (clojure.core/contains? input :thing-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-arn (input :thing-arn)) #:http.request.field{:name "thingArn", :shape "ThingArn"}))))

(clojure.core/defn- req-list-thing-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :parent-group) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :parent-group)) #:http.request.field{:name "parentGroup", :shape "ThingGroupName", :location "querystring", :location-name "parentGroup"})) (clojure.core/contains? input :name-prefix-filter) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :name-prefix-filter)) #:http.request.field{:name "namePrefixFilter", :shape "ThingGroupName", :location "querystring", :location-name "namePrefixFilter"})) (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recursive-without-default (input :recursive)) #:http.request.field{:name "recursive", :shape "RecursiveWithoutDefault", :location "querystring", :location-name "recursive"}))))

(clojure.core/defn- req-attach-thing-principal-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})], :header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-principal"})]}))

(clojure.core/defn- req-delete-scheduled-audit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-scheduled-audit-name (input :scheduled-audit-name)) #:http.request.field{:name "scheduledAuditName", :shape "ScheduledAuditName", :location "uri", :location-name "scheduledAuditName"})]}))

(clojure.core/defn- req-list-policy-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})]}))

(clojure.core/defn- req-get-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"}) (clojure.core/into (ser-policy-version-id (input :policy-version-id)) #:http.request.field{:name "policyVersionId", :shape "PolicyVersionId", :location "uri", :location-name "policyVersionId"})]}))

(clojure.core/defn- req-list-principal-things-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal", :location "header", :location-name "x-amzn-principal"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-describe-endpoint-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :endpoint-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-type (input :endpoint-type)) #:http.request.field{:name "endpointType", :shape "EndpointType", :location "querystring", :location-name "endpointType"}))))

(clojure.core/defn- req-list-targets-for-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-list-certificates-by-ca-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :ca-certificate-id)) #:http.request.field{:name "caCertificateId", :shape "CertificateId", :location "uri", :location-name "caCertificateId"})]} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-update-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})]} (clojure.core/contains? input :security-profile-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-profile-description (input :security-profile-description)) #:http.request.field{:name "securityProfileDescription", :shape "SecurityProfileDescription"})) (clojure.core/contains? input :behaviors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-behaviors (input :behaviors)) #:http.request.field{:name "behaviors", :shape "Behaviors"})) (clojure.core/contains? input :alert-targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alert-targets (input :alert-targets)) #:http.request.field{:name "alertTargets", :shape "AlertTargets"})) (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion", :location "querystring", :location-name "expectedVersion"}))))

(clojure.core/defn- req-delete-account-audit-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :delete-scheduled-audits) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-scheduled-audits (input :delete-scheduled-audits)) #:http.request.field{:name "deleteScheduledAudits", :shape "DeleteScheduledAudits", :location "querystring", :location-name "deleteScheduledAudits"}))))

(clojure.core/defn- req-get-ota-update-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-ota-update-id (input :ota-update-id)) #:http.request.field{:name "otaUpdateId", :shape "OTAUpdateId", :location "uri", :location-name "otaUpdateId"})]}))

(clojure.core/defn- req-clear-default-authorizer-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-register-ca-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate-pem (input :ca-certificate)) #:http.request.field{:name "caCertificate", :shape "CertificatePem"}) (clojure.core/into (ser-certificate-pem (input :verification-certificate)) #:http.request.field{:name "verificationCertificate", :shape "CertificatePem"})]} (clojure.core/contains? input :set-as-active) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-active (input :set-as-active)) #:http.request.field{:name "setAsActive", :shape "SetAsActive", :location "querystring", :location-name "setAsActive"})) (clojure.core/contains? input :allow-auto-registration) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allow-auto-registration (input :allow-auto-registration)) #:http.request.field{:name "allowAutoRegistration", :shape "AllowAutoRegistration", :location "querystring", :location-name "allowAutoRegistration"})) (clojure.core/contains? input :registration-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registration-config (input :registration-config)) #:http.request.field{:name "registrationConfig", :shape "RegistrationConfig"}))))

(clojure.core/defn- req-list-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-describe-scheduled-audit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-scheduled-audit-name (input :scheduled-audit-name)) #:http.request.field{:name "scheduledAuditName", :shape "ScheduledAuditName", :location "uri", :location-name "scheduledAuditName"})]}))

(clojure.core/defn- req-create-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName", :location "uri", :location-name "authorizerName"})], :body [(clojure.core/into (ser-authorizer-function-arn (input :authorizer-function-arn)) #:http.request.field{:name "authorizerFunctionArn", :shape "AuthorizerFunctionArn"}) (clojure.core/into (ser-token-key-name (input :token-key-name)) #:http.request.field{:name "tokenKeyName", :shape "TokenKeyName"}) (clojure.core/into (ser-public-key-map (input :token-signing-public-keys)) #:http.request.field{:name "tokenSigningPublicKeys", :shape "PublicKeyMap"})]} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorizer-status (input :status)) #:http.request.field{:name "status", :shape "AuthorizerStatus"}))))

(clojure.core/defn- req-set-v-2-logging-level-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-target (input :log-target)) #:http.request.field{:name "logTarget", :shape "LogTarget"}) (clojure.core/into (ser-log-level (input :log-level)) #:http.request.field{:name "logLevel", :shape "LogLevel"})]}))

(clojure.core/defn- req-get-job-document-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-describe-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-stream-id (input :stream-id)) #:http.request.field{:name "streamId", :shape "StreamId", :location "uri", :location-name "streamId"})]}))

(clojure.core/defn- req-disable-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})]}))

(clojure.core/defn- req-detach-security-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-security-profile-name (input :security-profile-name)) #:http.request.field{:name "securityProfileName", :shape "SecurityProfileName", :location "uri", :location-name "securityProfileName"})], :querystring [(clojure.core/into (ser-security-profile-target-arn (input :security-profile-target-arn)) #:http.request.field{:name "securityProfileTargetArn", :shape "SecurityProfileTargetArn", :location "querystring", :location-name "securityProfileTargetArn"})]}))

(clojure.core/defn- req-list-job-executions-for-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-execution-status (input :status)) #:http.request.field{:name "status", :shape "JobExecutionStatus", :location "querystring", :location-name "status"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-laser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "LaserMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-thing-groups-for-thing-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName"})) (clojure.core/contains? input :thing-groups-to-add) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-list (input :thing-groups-to-add)) #:http.request.field{:name "thingGroupsToAdd", :shape "ThingGroupList"})) (clojure.core/contains? input :thing-groups-to-remove) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-list (input :thing-groups-to-remove)) #:http.request.field{:name "thingGroupsToRemove", :shape "ThingGroupList"}))))

(clojure.core/defn- req-create-scheduled-audit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-audit-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "AuditFrequency"}) (clojure.core/into (ser-target-audit-check-names (input :target-check-names)) #:http.request.field{:name "targetCheckNames", :shape "TargetAuditCheckNames"})], :uri [(clojure.core/into (ser-scheduled-audit-name (input :scheduled-audit-name)) #:http.request.field{:name "scheduledAuditName", :shape "ScheduledAuditName", :location "uri", :location-name "scheduledAuditName"})]} (clojure.core/contains? input :day-of-month) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-day-of-month (input :day-of-month)) #:http.request.field{:name "dayOfMonth", :shape "DayOfMonth"})) (clojure.core/contains? input :day-of-week) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-day-of-week (input :day-of-week)) #:http.request.field{:name "dayOfWeek", :shape "DayOfWeek"}))))

(clojure.core/defn- req-update-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :thing-type-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName"})) (clojure.core/contains? input :attribute-payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-payload (input :attribute-payload)) #:http.request.field{:name "attributePayload", :shape "AttributePayload"})) (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion"})) (clojure.core/contains? input :remove-thing-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remove-thing-type (input :remove-thing-type)) #:http.request.field{:name "removeThingType", :shape "RemoveThingType"}))))

(clojure.core/defn- req-describe-ca-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-certificate-id (input :certificate-id)) #:http.request.field{:name "certificateId", :shape "CertificateId", :location "uri", :location-name "caCertificateId"})]}))

(clojure.core/defn- req-test-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-auth-infos (input :auth-infos)) #:http.request.field{:name "authInfos", :shape "AuthInfos"})]} (clojure.core/contains? input :principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal"})) (clojure.core/contains? input :cognito-identity-pool-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-pool-id (input :cognito-identity-pool-id)) #:http.request.field{:name "cognitoIdentityPoolId", :shape "CognitoIdentityPoolId"})) (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-id (input :client-id)) #:http.request.field{:name "clientId", :shape "ClientId", :location "querystring", :location-name "clientId"})) (clojure.core/contains? input :policy-names-to-add) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-names (input :policy-names-to-add)) #:http.request.field{:name "policyNamesToAdd", :shape "PolicyNames"})) (clojure.core/contains? input :policy-names-to-skip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-names (input :policy-names-to-skip)) #:http.request.field{:name "policyNamesToSkip", :shape "PolicyNames"}))))

(clojure.core/defn- req-list-policy-principals-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "header", :location-name "x-amzn-iot-policy"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "marker", :shape "Marker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "pageSize", :shape "PageSize", :location "querystring", :location-name "pageSize"})) (clojure.core/contains? input :ascending-order) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ascending-order (input :ascending-order)) #:http.request.field{:name "ascendingOrder", :shape "AscendingOrder", :location "querystring", :location-name "isAscendingOrder"}))))

(clojure.core/defn- req-validate-security-profile-behaviors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-behaviors (input :behaviors)) #:http.request.field{:name "behaviors", :shape "Behaviors"})]}))

(clojure.core/defn- req-detach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :body [(clojure.core/into (ser-policy-target (input :target)) #:http.request.field{:name "target", :shape "PolicyTarget"})]}))

(clojure.core/defn- req-add-thing-to-thing-group-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :thing-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName"})) (clojure.core/contains? input :thing-group-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-group-arn (input :thing-group-arn)) #:http.request.field{:name "thingGroupArn", :shape "ThingGroupArn"})) (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName"})) (clojure.core/contains? input :thing-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-arn (input :thing-arn)) #:http.request.field{:name "thingArn", :shape "ThingArn"}))))

(clojure.core/defn- req-list-things-in-thing-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "uri", :location-name "thingGroupName"})]} (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recursive (input :recursive)) #:http.request.field{:name "recursive", :shape "Recursive", :location "querystring", :location-name "recursive"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag", :location "querystring", :location-name "force"}))))

(clojure.core/defn- req-cancel-audit-task-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-audit-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "AuditTaskId", :location "uri", :location-name "taskId"})]}))

(clojure.core/defn- req-list-audit-tasks-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp", :location "querystring", :location-name "startTime"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp", :location "querystring", :location-name "endTime"})]} (clojure.core/contains? input :task-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-task-type (input :task-type)) #:http.request.field{:name "taskType", :shape "AuditTaskType", :location "querystring", :location-name "taskType"})) (clojure.core/contains? input :task-status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-task-status (input :task-status)) #:http.request.field{:name "taskStatus", :shape "AuditTaskStatus", :location "querystring", :location-name "taskStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-update-thing-group-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-group-name (input :thing-group-name)) #:http.request.field{:name "thingGroupName", :shape "ThingGroupName", :location "uri", :location-name "thingGroupName"})], :body [(clojure.core/into (ser-thing-group-properties (input :thing-group-properties)) #:http.request.field{:name "thingGroupProperties", :shape "ThingGroupProperties"})]} (clojure.core/contains? input :expected-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-optional-version (input :expected-version)) #:http.request.field{:name "expectedVersion", :shape "OptionalVersion"}))))

(clojure.core/defn- req-start-thing-registration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-template-body (input :template-body)) #:http.request.field{:name "templateBody", :shape "TemplateBody"}) (clojure.core/into (ser-registry-s-3-bucket-name (input :input-file-bucket)) #:http.request.field{:name "inputFileBucket", :shape "RegistryS3BucketName"}) (clojure.core/into (ser-registry-s-3-key-name (input :input-file-key)) #:http.request.field{:name "inputFileKey", :shape "RegistryS3KeyName"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-list-security-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-set-logging-options-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-logging-options-payload (input :logging-options-payload)) #:http.request.field{:name "loggingOptionsPayload", :shape "LoggingOptionsPayload"})]}))

(clojure.core/defn- req-list-thing-registration-task-reports-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "TaskId", :location "uri", :location-name "taskId"})], :querystring [(clojure.core/into (ser-report-type (input :report-type)) #:http.request.field{:name "reportType", :shape "ReportType", :location "querystring", :location-name "reportType"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-list-v-2-logging-levels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "LogTargetType", :location "querystring", :location-name "targetType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-skyfall-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "SkyfallMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-create-thing-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "uri", :location-name "thingTypeName"})]} (clojure.core/contains? input :thing-type-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-properties (input :thing-type-properties)) #:http.request.field{:name "thingTypeProperties", :shape "ThingTypeProperties"}))))

(clojure.core/defn- req-create-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})], :body [(clojure.core/into (ser-topic-rule-payload (input :topic-rule-payload)) #:http.request.field{:name "topicRulePayload", :shape "TopicRulePayload"})]}))

(clojure.core/defn- req-delete-job-execution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"}) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"}) (clojure.core/into (ser-execution-number (input :execution-number)) #:http.request.field{:name "executionNumber", :shape "ExecutionNumber", :location "uri", :location-name "executionNumber"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag", :location "querystring", :location-name "force"}))))

(clojure.core/defn- req-update-role-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-role-alias (input :role-alias)) #:http.request.field{:name "roleAlias", :shape "RoleAlias", :location "uri", :location-name "roleAlias"})]} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :credential-duration-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-credential-duration-seconds (input :credential-duration-seconds)) #:http.request.field{:name "credentialDurationSeconds", :shape "CredentialDurationSeconds"}))))

(clojure.core/defn- req-delete-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName", :location "uri", :location-name "authorizerName"})]}))

(clojure.core/defn- req-list-things-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "RegistryMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name (input :attribute-name)) #:http.request.field{:name "attributeName", :shape "AttributeName", :location "querystring", :location-name "attributeName"})) (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :attribute-value)) #:http.request.field{:name "attributeValue", :shape "AttributeValue", :location "querystring", :location-name "attributeValue"})) (clojure.core/contains? input :thing-type-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-type-name (input :thing-type-name)) #:http.request.field{:name "thingTypeName", :shape "ThingTypeName", :location "querystring", :location-name "thingTypeName"}))))

(clojure.core/defn- req-update-authorizer-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-authorizer-name (input :authorizer-name)) #:http.request.field{:name "authorizerName", :shape "AuthorizerName", :location "uri", :location-name "authorizerName"})]} (clojure.core/contains? input :authorizer-function-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorizer-function-arn (input :authorizer-function-arn)) #:http.request.field{:name "authorizerFunctionArn", :shape "AuthorizerFunctionArn"})) (clojure.core/contains? input :token-key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-key-name (input :token-key-name)) #:http.request.field{:name "tokenKeyName", :shape "TokenKeyName"})) (clojure.core/contains? input :token-signing-public-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-key-map (input :token-signing-public-keys)) #:http.request.field{:name "tokenSigningPublicKeys", :shape "PublicKeyMap"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authorizer-status (input :status)) #:http.request.field{:name "status", :shape "AuthorizerStatus"}))))

(clojure.core/defn- req-describe-thing-registration-task-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "TaskId", :location "uri", :location-name "taskId"})]}))

(clojure.core/defn- req-get-indexing-configuration-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-job-executions-for-thing-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "uri", :location-name "thingName"})]} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-execution-status (input :status)) #:http.request.field{:name "status", :shape "JobExecutionStatus", :location "querystring", :location-name "status"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-laser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "LaserMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-replace-topic-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-rule-name (input :rule-name)) #:http.request.field{:name "ruleName", :shape "RuleName", :location "uri", :location-name "ruleName"})], :body [(clojure.core/into (ser-topic-rule-payload (input :topic-rule-payload)) #:http.request.field{:name "topicRulePayload", :shape "TopicRulePayload"})]}))

(clojure.core/defn- req-get-registration-code-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-account-audit-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :audit-notification-target-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-notification-target-configurations (input :audit-notification-target-configurations)) #:http.request.field{:name "auditNotificationTargetConfigurations", :shape "AuditNotificationTargetConfigurations"})) (clojure.core/contains? input :audit-check-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-check-configurations (input :audit-check-configurations)) #:http.request.field{:name "auditCheckConfigurations", :shape "AuditCheckConfigurations"}))))

(clojure.core/defn- req-create-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName", :location "uri", :location-name "policyName"})], :body [(clojure.core/into (ser-policy-document (input :policy-document)) #:http.request.field{:name "policyDocument", :shape "PolicyDocument"})]} (clojure.core/contains? input :set-as-default) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-set-as-default (input :set-as-default)) #:http.request.field{:name "setAsDefault", :shape "SetAsDefault", :location "querystring", :location-name "setAsDefault"}))))

(clojure.core/defn- req-delete-role-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-role-alias (input :role-alias)) #:http.request.field{:name "roleAlias", :shape "RoleAlias", :location "uri", :location-name "roleAlias"})]}))

(clojure.core/defn- req-associate-targets-with-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-targets (input :targets)) #:http.request.field{:name "targets", :shape "JobTargets"})], :uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comment (input :comment)) #:http.request.field{:name "comment", :shape "Comment"}))))

(clojure.core/defn- req-get-effective-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "principal", :shape "Principal"})) (clojure.core/contains? input :cognito-identity-pool-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-pool-id (input :cognito-identity-pool-id)) #:http.request.field{:name "cognitoIdentityPoolId", :shape "CognitoIdentityPoolId"})) (clojure.core/contains? input :thing-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-thing-name (input :thing-name)) #:http.request.field{:name "thingName", :shape "ThingName", :location "querystring", :location-name "thingName"}))))

(clojure.core/defn- req-update-scheduled-audit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-scheduled-audit-name (input :scheduled-audit-name)) #:http.request.field{:name "scheduledAuditName", :shape "ScheduledAuditName", :location "uri", :location-name "scheduledAuditName"})]} (clojure.core/contains? input :frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-audit-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "AuditFrequency"})) (clojure.core/contains? input :day-of-month) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-day-of-month (input :day-of-month)) #:http.request.field{:name "dayOfMonth", :shape "DayOfMonth"})) (clojure.core/contains? input :day-of-week) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-day-of-week (input :day-of-week)) #:http.request.field{:name "dayOfWeek", :shape "DayOfWeek"})) (clojure.core/contains? input :target-check-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-audit-check-names (input :target-check-names)) #:http.request.field{:name "targetCheckNames", :shape "TargetAuditCheckNames"}))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-stream-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-on-demand-audit-task-request/target-check-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-audit-check-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.start-on-demand-audit-task-request/target-check-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-task-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/audit-task-metadata))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/certificate-id] :opt-un [:portkey.aws.iot.-2015-05-28.accept-certificate-transfer-request/set-as-active]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-finding-severity #{"CRITICAL" :medium "LOW" :high :critical "HIGH" :low "MEDIUM"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registry-max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-effective-policies-response/effective-policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/effective-policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-effective-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-effective-policies-response/effective-policies]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-versions-response/policy-versions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-versions))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-versions-response/policy-versions]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/end-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-violation-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-violation-events-request/start-time :portkey.aws.iot.-2015-05-28.list-violation-events-request/end-time] :opt-un [:portkey.aws.iot.-2015-05-28.list-violation-events-request/thing-name :portkey.aws.iot.-2015-05-28.list-violation-events-request/security-profile-name :portkey.aws.iot.-2015-05-28.list-violation-events-request/next-token :portkey.aws.iot.-2015-05-28.list-violation-events-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/expected-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/compliant-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auto-registration-status #{:disable "DISABLE" :enable "ENABLE"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-targets (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/security-profile-target))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-indexing-mode #{"REGISTRY_AND_SHADOW" :registry "REGISTRY" :registry-and-shadow :off "OFF"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/canceled-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-event-configurations-response/event-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/event-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-event-configurations-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-event-configurations-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-event-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-event-configurations-response/event-configurations :portkey.aws.iot.-2015-05-28.describe-event-configurations-response/creation-date :portkey.aws.iot.-2015-05-28.describe-event-configurations-response/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/skyfall-max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-authorizers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-authorizers-request/page-size :portkey.aws.iot.-2015-05-28.list-authorizers-request/marker :portkey.aws.iot.-2015-05-28.list-authorizers-request/ascending-order :portkey.aws.iot.-2015-05-28.list-authorizers-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-security-profile-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-security-profile-request/security-profile-name] :opt-un [:portkey.aws.iot.-2015-05-28.delete-security-profile-request/expected-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/scheduled-audit-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/undo-deprecate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/undo-deprecate))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/thing-type-name] :opt-un [:portkey.aws.iot.-2015-05-28.deprecate-thing-type-request/undo-deprecate]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/outgoing-certificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/outgoing-certificate))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-principal-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.detach-principal-policy-request/policy-name :portkey.aws.iot.-2015-05-28.detach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/behaviors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behaviors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/alert-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alert-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-name :portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-arn :portkey.aws.iot.-2015-05-28.update-security-profile-response/security-profile-description :portkey.aws.iot.-2015-05-28.update-security-profile-response/behaviors :portkey.aws.iot.-2015-05-28.update-security-profile-response/alert-targets :portkey.aws.iot.-2015-05-28.update-security-profile-response/version :portkey.aws.iot.-2015-05-28.update-security-profile-response/creation-date :portkey.aws.iot.-2015-05-28.update-security-profile-response/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/range-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-indexing-configuration/thing-group-indexing-mode (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-indexing-mode))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-indexing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.thing-group-indexing-configuration/thing-group-indexing-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1000)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-policy-response/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-policy-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-targets-for-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-targets-for-policy-response/targets :portkey.aws.iot.-2015-05-28.list-targets-for-policy-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-attribute))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/token-signature (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/token-signature))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/authorizer-name :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/token :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-request/token-signature] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-document-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-group-document))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-target-configurations (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/log-target-configuration))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/in-progress-timeout-in-minutes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-properties/thing-type-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-properties/searchable-attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/searchable-attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-properties/thing-type-description :portkey.aws.iot.-2015-05-28.thing-type-properties/searchable-attributes]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/ca-certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.register-certificate-request/certificate-pem] :opt-un [:portkey.aws.iot.-2015-05-28.register-certificate-request/ca-certificate-pem :portkey.aws.iot.-2015-05-28.register-certificate-request/set-as-active :portkey.aws.iot.-2015-05-28.register-certificate-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-thing-principal-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-thing-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-request/thing-type-name :portkey.aws.iot.-2015-05-28.create-thing-request/attribute-payload]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/token-signature (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2560)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[A-Za-z0-9+/]+={0,2}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-thing-registration-task-response/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/start-thing-registration-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.start-thing-registration-task-response/task-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary-for-job/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary-for-job/job-execution-summary (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-summary))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-summary-for-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-execution-summary-for-job/thing-arn :portkey.aws.iot.-2015-05-28.job-execution-summary-for-job/job-execution-summary]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing/aws-signer-job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/signing-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing/start-signing-job-parameter (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/start-signing-job-parameter))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing/custom-code-signing (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/custom-code-signing))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/code-signing (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.code-signing/aws-signer-job-id :portkey.aws.iot.-2015-05-28.code-signing/start-signing-job-parameter :portkey.aws.iot.-2015-05-28.code-signing/custom-code-signing]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-d-bv-2-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-d-bv-2-action/put-item (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/put-item-input))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-d-bv-2-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.dynamo-d-bv-2-action/role-arn :portkey.aws.iot.-2015-05-28.dynamo-d-bv-2-action/put-item]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-notification-target-configurations (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/audit-notification-type :portkey.aws.iot.-2015-05-28/audit-notification-target))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-response/thing-groups (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-groups-response/thing-groups :portkey.aws.iot.-2015-05-28.list-thing-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-registration-code-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-response/security-profile-target-mappings (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target-mappings))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-response/security-profile-target-mappings :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/sql (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sql))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/actions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-payload/error-action (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-payload (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.topic-rule-payload/sql :portkey.aws.iot.-2015-05-28.topic-rule-payload/actions] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule-payload/description :portkey.aws.iot.-2015-05-28.topic-rule-payload/rule-disabled :portkey.aws.iot.-2015-05-28.topic-rule-payload/aws-iot-sql-version :portkey.aws.iot.-2015-05-28.topic-rule-payload/error-action]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-things-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-things-response/things :portkey.aws.iot.-2015-05-28.list-principal-things-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-summary/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-summary/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-summary/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.ota-update-summary/ota-update-id :portkey.aws.iot.-2015-05-28.ota-update-summary/ota-update-arn :portkey.aws.iot.-2015-05-28.ota-update-summary/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cidr (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 2 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 43)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-fA-F0-9:\.\/]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/active-violations (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/active-violation))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/string-map (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/string :portkey.aws.iot.-2015-05-28/string))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/platform (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/stream-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/stream-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/files (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-info/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.stream-info/stream-id :portkey.aws.iot.-2015-05-28.stream-info/stream-arn :portkey.aws.iot.-2015-05-28.stream-info/stream-version :portkey.aws.iot.-2015-05-28.stream-info/description :portkey.aws.iot.-2015-05-28.stream-info/files :portkey.aws.iot.-2015-05-28.stream-info/created-at :portkey.aws.iot.-2015-05-28.stream-info/last-updated-at :portkey.aws.iot.-2015-05-28.stream-info/role-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/private-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-response/aws-iot-job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-response/aws-iot-job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-ota-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-id :portkey.aws.iot.-2015-05-28.create-ota-update-response/aws-iot-job-id :portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-arn :portkey.aws.iot.-2015-05-28.create-ota-update-response/aws-iot-job-arn :portkey.aws.iot.-2015-05-28.create-ota-update-response/ota-update-status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ota-updates-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ota-updates-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ota-updates-request/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-ota-updates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-ota-updates-request/max-results :portkey.aws.iot.-2015-05-28.list-ota-updates-request/next-token :portkey.aws.iot.-2015-05-28.list-ota-updates-request/ota-update-status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-response/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.cancel-job-response/job-arn :portkey.aws.iot.-2015-05-28.cancel-job-response/job-id :portkey.aws.iot.-2015-05-28.cancel-job-response/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-scheduled-audits-response/scheduled-audits (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-metadata-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-scheduled-audits-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-scheduled-audits-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-scheduled-audits-response/scheduled-audits :portkey.aws.iot.-2015-05-28.list-scheduled-audits-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/target-aws-account (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-request/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-request/certificate-id :portkey.aws.iot.-2015-05-28.transfer-certificate-request/target-aws-account] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-request/transfer-message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-event-configurations-request/event-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/event-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-event-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-event-configurations-request/event-configurations]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.explicit-deny/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/explicit-deny (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.explicit-deny/policies]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-response/security-profile-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-response/security-profile-targets :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-stream clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-certificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-certificate-request/certificate-id :portkey.aws.iot.-2015-05-28.update-certificate-request/new-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-logical-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-role-alias-response/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-role-alias-response/role-alias-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-role-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-role-alias-response/role-alias :portkey.aws.iot.-2015-05-28.create-role-alias-response/role-alias-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/removed-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/signature-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/index-status #{:building "REBUILDING" :active "BUILDING" "ACTIVE" :rebuilding})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/query-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]+$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/violation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/violation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/behavior (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behavior))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/metric-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/violation-event-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/violation-event-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.violation-event/violation-event-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/violation-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.violation-event/violation-id :portkey.aws.iot.-2015-05-28.violation-event/thing-name :portkey.aws.iot.-2015-05-28.violation-event/security-profile-name :portkey.aws.iot.-2015-05-28.violation-event/behavior :portkey.aws.iot.-2015-05-28.violation-event/metric-value :portkey.aws.iot.-2015-05-28.violation-event/violation-event-type :portkey.aws.iot.-2015-05-28.violation-event/violation-event-time]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-file-url-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/s-3-file-url))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/default-client-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-response/default-client-id :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-name :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-id :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-arn :portkey.aws.iot.-2015-05-28.describe-thing-response/thing-type-name :portkey.aws.iot.-2015-05-28.describe-thing-response/attributes :portkey.aws.iot.-2015-05-28.describe-thing-response/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/non-compliant-resources-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-status #{"COMPLETED" "CANCELED" "IN_PROGRESS" :in-progress :completed :deletion-in-progress :canceled "DELETION_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/failed-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing-certificate-chain/certificate-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing-certificate-chain/inline-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/inline-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/code-signing-certificate-chain (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.code-signing-certificate-chain/certificate-name :portkey.aws.iot.-2015-05-28.code-signing-certificate-chain/inline-document]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-keys-and-certificate-request/set-as-active]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/new-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ca-certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/new-auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/registration-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/remove-auto-registration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/remove-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-ca-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-ca-certificate-request/certificate-id] :opt-un [:portkey.aws.iot.-2015-05-28.update-ca-certificate-request/new-status :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/new-auto-registration-status :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/registration-config :portkey.aws.iot.-2015-05-28.update-ca-certificate-request/remove-auto-registration]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-request/index-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-request/query-string (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/query-string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/query-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-request/query-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/query-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/search-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.search-index-request/query-string] :opt-un [:portkey.aws.iot.-2015-05-28.search-index-request/index-name :portkey.aws.iot.-2015-05-28.search-index-request/next-token :portkey.aws.iot.-2015-05-28.search-index-request/max-results :portkey.aws.iot.-2015-05-28.search-index-request/query-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-state-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-signing-request (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/missing-context-values (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/missing-context-value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/day-of-week #{:wed "TUE" "SAT" "SUN" :sat "MON" :tue :fri :sun "THU" "WED" "FRI" :mon :thu})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/is-authenticated (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-authenticated))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/principal-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/policy-documents (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-documents))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/refresh-after-in-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/disconnect-after-in-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/is-authenticated :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/principal-id :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/policy-documents :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/refresh-after-in-seconds :portkey.aws.iot.-2015-05-28.test-invoke-authorizer-response/disconnect-after-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/page-size (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-audit-task-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.security-profile-target/arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-target (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.security-profile-target/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\p{Graph}\x20]*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/streams-summary (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/stream-summary))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-attribute/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-attribute/thing-name :portkey.aws.iot.-2015-05-28.thing-attribute/thing-type-name :portkey.aws.iot.-2015-05-28.thing-attribute/thing-arn :portkey.aws.iot.-2015-05-28.thing-attribute/attributes :portkey.aws.iot.-2015-05-28.thing-attribute/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.validation-error/error-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.validation-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/index-names-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/index-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-group-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-thing-group-response/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-security-profile-request/security-profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/topic (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ge-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-request/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-topic-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-topic-rules-request/topic :portkey.aws.iot.-2015-05-28.list-topic-rules-request/max-results :portkey.aws.iot.-2015-05-28.list-topic-rules-request/next-token :portkey.aws.iot.-2015-05-28.list-topic-rules-request/rule-disabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-task-type #{"SCHEDULED_AUDIT_TASK" :scheduled-audit-task "ON_DEMAND_AUDIT_TASK" :on-demand-audit-task})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/canned-access-control-list #{"authenticated-read" :logdeliverywrite :bucketownerfullcontrol "public-read-write" :private "bucket-owner-full-control" "private" :bucketownerread :publicread "aws-exec-read" :publicreadwrite :awsexecread "bucket-owner-read" "public-read" "log-delivery-write" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/duration-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/page-size :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/marker :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/violation-events (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/violation-event))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/execution-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-request/principal] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-request/marker :portkey.aws.iot.-2015-05-28.list-principal-policies-request/page-size :portkey.aws.iot.-2015-05-28.list-principal-policies-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.non-compliant-resource/resource-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.non-compliant-resource/resource-identifier (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-identifier))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.non-compliant-resource/additional-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/non-compliant-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.non-compliant-resource/resource-type :portkey.aws.iot.-2015-05-28.non-compliant-resource/resource-identifier :portkey.aws.iot.-2015-05-28.non-compliant-resource/additional-info]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 5120))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-logging-options-response/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-logging-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-logging-options-response/role-arn :portkey.aws.iot.-2015-05-28.get-logging-options-response/log-level]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/default-log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/disable-all-logs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/disable-all-logs))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/role-arn :portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/default-log-level :portkey.aws.iot.-2015-05-28.get-v-2-logging-options-response/disable-all-logs]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-response/thing-groups (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-response/thing-groups :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferred-to (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.outgoing-certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/outgoing-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-arn :portkey.aws.iot.-2015-05-28.outgoing-certificate/certificate-id :portkey.aws.iot.-2015-05-28.outgoing-certificate/transferred-to :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-date :portkey.aws.iot.-2015-05-28.outgoing-certificate/transfer-message :portkey.aws.iot.-2015-05-28.outgoing-certificate/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/audit-notification-target-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-notification-target-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/audit-check-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-check-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/role-arn :portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/audit-notification-target-configurations :portkey.aws.iot.-2015-05-28.describe-account-audit-configuration-response/audit-check-configurations]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-index-response/index-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-index-response/index-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-index-response/schema (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-schema))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-index-response/index-name :portkey.aws.iot.-2015-05-28.describe-index-response/index-status :portkey.aws.iot.-2015-05-28.describe-index-response/schema]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/canceled-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/last-modified-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-response/certificates :portkey.aws.iot.-2015-05-28.list-certificates-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-default-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-name :portkey.aws.iot.-2015-05-28.set-default-policy-version-request/policy-version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-default-authorizer-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.enable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/enable-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.enable-topic-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-level #{"DISABLED" :disabled :warn "WARN" :debug "ERROR" "DEBUG" :info :error "INFO"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-statistics (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-statistics))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-response/audit-details (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-details))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-audit-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-status :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-type :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-start-time :portkey.aws.iot.-2015-05-28.describe-audit-task-response/task-statistics :portkey.aws.iot.-2015-05-28.describe-audit-task-response/scheduled-audit-name :portkey.aws.iot.-2015-05-28.describe-audit-task-response/audit-details]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/target-audit-check-names (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/audit-check-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/effective-policies (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/effective-policy))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-request/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-request/files (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-stream-request/stream-id :portkey.aws.iot.-2015-05-28.create-stream-request/files :portkey.aws.iot.-2015-05-28.create-stream-request/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.create-stream-request/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ca-certificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/ca-certificate))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/action-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/action :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/violation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/violation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/behavior (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behavior))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/last-violation-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/last-violation-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.active-violation/violation-start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/active-violation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.active-violation/violation-id :portkey.aws.iot.-2015-05-28.active-violation/thing-name :portkey.aws.iot.-2015-05-28.active-violation/security-profile-name :portkey.aws.iot.-2015-05-28.active-violation/behavior :portkey.aws.iot.-2015-05-28.active-violation/last-violation-value :portkey.aws.iot.-2015-05-28.active-violation/last-violation-time :portkey.aws.iot.-2015-05-28.active-violation/violation-start-time]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/reject-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/certificate-id] :opt-un [:portkey.aws.iot.-2015-05-28.reject-certificate-transfer-request/reject-reason]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registration-config/template-body (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registration-config/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registration-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.registration-config/template-body :portkey.aws.iot.-2015-05-28.registration-config/role-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-request/page-size :portkey.aws.iot.-2015-05-28.list-certificates-request/marker :portkey.aws.iot.-2015-05-28.list-certificates-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/additional-parameter-map (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/attribute-key :portkey.aws.iot.-2015-05-28/value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/json-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/laser-max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/expires-in-sec clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-audit-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-audit-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-audit-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-request/thing-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/template-body (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior/name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behavior-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior/metric (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behavior-metric))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior/criteria (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behavior-criteria))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.behavior/name] :opt-un [:portkey.aws.iot.-2015-05-28.behavior/metric :portkey.aws.iot.-2015-05-28.behavior/criteria]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-request/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-jobs-request/status :portkey.aws.iot.-2015-05-28.list-jobs-request/target-selection :portkey.aws.iot.-2015-05-28.list-jobs-request/max-results :portkey.aws.iot.-2015-05-28.list-jobs-request/next-token :portkey.aws.iot.-2015-05-28.list-jobs-request/thing-group-name :portkey.aws.iot.-2015-05-28.list-jobs-request/thing-group-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/index-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-topic-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule-arn :portkey.aws.iot.-2015-05-28.get-topic-rule-response/rule]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificates (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/certificate))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/endpoint-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-policy-request/target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.attach-policy-request/policy-name :portkey.aws.iot.-2015-05-28.attach-policy-request/target] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecated (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/boolean))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/deprecation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecated :portkey.aws.iot.-2015-05-28.thing-type-metadata/deprecation-date :portkey.aws.iot.-2015-05-28.thing-type-metadata/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-group-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-thing-group-request/thing-group-name] :opt-un [:portkey.aws.iot.-2015-05-28.delete-thing-group-request/expected-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-request/parent-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-request/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-thing-group-request/thing-group-name] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-group-request/parent-group-name :portkey.aws.iot.-2015-05-28.create-thing-group-request/thing-group-properties]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attribute-payload/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attribute-payload/merge (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-payload (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.attribute-payload/attributes :portkey.aws.iot.-2015-05-28.attribute-payload/merge]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-type-request/thing-type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/parameters (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/parameter :portkey.aws.iot.-2015-05-28/value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-in-thing-group-response/things :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/scheduled-audit-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/scheduled-audit-metadata))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/inline-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-ca-certificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ca-certificate-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-ca-certificate-response/registration-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-ca-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-ca-certificate-response/certificate-description :portkey.aws.iot.-2015-05-28.describe-ca-certificate-response/registration-config]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/state-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/reason-for-non-compliance-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/use-base-64 clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-streams-response/streams (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/streams-summary))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-streams-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-streams-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-streams-response/streams :portkey.aws.iot.-2015-05-28.list-streams-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-response/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-job-response/job-arn :portkey.aws.iot.-2015-05-28.create-job-response/job-id :portkey.aws.iot.-2015-05-28.create-job-response/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-path-on-device (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/day-of-month (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^([1-9]|[12][0-9]|3[01])$|^LAST$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-certificate-request/certificate-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principal-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-role-alias-response/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-role-alias-response/role-alias-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-role-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-role-alias-response/role-alias :portkey.aws.iot.-2015-05-28.update-role-alias-response/role-alias-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-indices-response/index-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-names-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-indices-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-indices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-indices-response/index-names :portkey.aws.iot.-2015-05-28.list-indices-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/default-log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/disable-all-logs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/disable-all-logs))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-v-2-logging-options-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/role-arn :portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/default-log-level :portkey.aws.iot.-2015-05-28.set-v-2-logging-options-request/disable-all-logs]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-types-request/next-token :portkey.aws.iot.-2015-05-28.list-thing-types-request/max-results :portkey.aws.iot.-2015-05-28.list-thing-types-request/thing-type-name]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/max-job-executions-per-min (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ca-certificate-status #{:inactive :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 20 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.invalid-query-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/invalid-query-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.invalid-query-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-response/violation-events (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/violation-events))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-violation-events-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-violation-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-violation-events-response/violation-events :portkey.aws.iot.-2015-05-28.list-violation-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/template-body (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/input-file-bucket (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/last-modified-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/success-count (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/failure-count (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/percentage-progress (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/percentage))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/input-file-key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-s-3-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/message :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/creation-date :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/template-body :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/input-file-bucket :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/role-arn :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/last-modified-date :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/status :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/success-count :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/failure-count :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/percentage-progress :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/input-file-key :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-response/task-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-target-mappings (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/security-profile-target-mapping))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/disable-all-logs clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registry-s-3-key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9!_.*'()-\/]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/partition-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-response/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-response/stream-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-response/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-stream-response/stream-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-stream-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-stream-response/stream-id :portkey.aws.iot.-2015-05-28.create-stream-response/stream-arn :portkey.aws.iot.-2015-05-28.create-stream-response/description :portkey.aws.iot.-2015-05-28.create-stream-response/stream-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-thing-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.delete-thing-request/expected-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-role-alias-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-role-alias-request/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-role-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-role-alias-request/role-alias :portkey.aws.iot.-2015-05-28.create-role-alias-request/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.create-role-alias-request/credential-duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-event-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-policies-response/policies :portkey.aws.iot.-2015-05-28.list-principal-policies-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-indexing-configuration-request/thing-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-indexing-configuration-request/thing-group-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-indexing-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-indexing-configuration-request/thing-indexing-configuration :portkey.aws.iot.-2015-05-28.update-indexing-configuration-request/thing-group-indexing-configuration]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/check-run-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-check-run-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/check-compliant (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/check-compliant))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/total-resources-count (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/total-resources-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/non-compliant-resources-count (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/non-compliant-resources-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/error-code (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-code))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-details/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-check-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.audit-check-details/check-run-status :portkey.aws.iot.-2015-05-28.audit-check-details/check-compliant :portkey.aws.iot.-2015-05-28.audit-check-details/total-resources-count :portkey.aws.iot.-2015-05-28.audit-check-details/non-compliant-resources-count :portkey.aws.iot.-2015-05-28.audit-check-details/error-code :portkey.aws.iot.-2015-05-28.audit-check-details/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-details (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/audit-check-name :portkey.aws.iot.-2015-05-28/audit-check-details))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/customer-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/customer-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/validity (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-validity))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/transfer-data (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/transfer-data))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/generation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/generation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/previous-owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-description/customer-version :portkey.aws.iot.-2015-05-28.certificate-description/creation-date :portkey.aws.iot.-2015-05-28.certificate-description/certificate-pem :portkey.aws.iot.-2015-05-28.certificate-description/ca-certificate-id :portkey.aws.iot.-2015-05-28.certificate-description/validity :portkey.aws.iot.-2015-05-28.certificate-description/last-modified-date :portkey.aws.iot.-2015-05-28.certificate-description/owned-by :portkey.aws.iot.-2015-05-28.certificate-description/transfer-data :portkey.aws.iot.-2015-05-28.certificate-description/generation-id :portkey.aws.iot.-2015-05-28.certificate-description/status :portkey.aws.iot.-2015-05-28.certificate-description/previous-owned-by :portkey.aws.iot.-2015-05-28.certificate-description/certificate-arn :portkey.aws.iot.-2015-05-28.certificate-description/certificate-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-response/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-response/stream-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-response/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-response/stream-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-stream-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-stream-response/stream-id :portkey.aws.iot.-2015-05-28.update-stream-response/stream-arn :portkey.aws.iot.-2015-05-28.update-stream-response/description :portkey.aws.iot.-2015-05-28.update-stream-response/stream-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principal-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.delete-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[A-Za-z0-9+/]+={0,2}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-request/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-request/files (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-files))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-stream-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-stream-request/stream-id] :opt-un [:portkey.aws.iot.-2015-05-28.update-stream-request/description :portkey.aws.iot.-2015-05-28.update-stream-request/files :portkey.aws.iot.-2015-05-28.update-stream-request/role-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/index-schema (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-response/task-ids (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-response/task-ids :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-files (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/ota-update-file :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-document-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-document))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-signing-job-parameter/signing-profile-parameter (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/signing-profile-parameter))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-signing-job-parameter/signing-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/signing-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-signing-job-parameter/destination (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/destination))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/start-signing-job-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.start-signing-job-parameter/signing-profile-parameter :portkey.aws.iot.-2015-05-28.start-signing-job-parameter/signing-profile-name :portkey.aws.iot.-2015-05-28.start-signing-job-parameter/destination]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.destination/s-3-destination (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-destination))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.destination/s-3-destination]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/task-id-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/task-id))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-thing-principal-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.detach-thing-principal-request/thing-name :portkey.aws.iot.-2015-05-28.detach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-certificate-response/transferred-certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-certificate-response/transferred-certificate-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-indices-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-indices-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/query-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-indices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-indices-request/next-token :portkey.aws.iot.-2015-05-28.list-indices-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/next-token :portkey.aws.iot.-2015-05-28.list-thing-groups-for-thing-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/non-compliant-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/comparison-operator #{"less-than-equals" :notinportset :notincidrset "greater-than" "not-in-port-set" :lessthan "greater-than-equals" :lessthanequals :incidrset "in-cidr-set" "not-in-cidr-set" :greaterthanequals "in-port-set" :inportset :greaterthan "less-than"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-name :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-arn :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-properties :portkey.aws.iot.-2015-05-28.thing-type-definition/thing-type-metadata]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-security-profile-request/security-profile-target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.attach-security-profile-request/security-profile-name :portkey.aws.iot.-2015-05-28.attach-security-profile-request/security-profile-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-names (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-response/rules (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-topic-rules-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-topic-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-topic-rules-response/rules :portkey.aws.iot.-2015-05-28.list-topic-rules-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-name-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-request/comment (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/comment))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-request/force (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cancel-job-request/job-id] :opt-un [:portkey.aws.iot.-2015-05-28.cancel-job-request/comment :portkey.aws.iot.-2015-05-28.cancel-job-request/force]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/certificate-signing-request (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-signing-request))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/certificate-signing-request] :opt-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-request/set-as-active]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-request/security-profile-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-request/behaviors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behaviors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-request/alert-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alert-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-security-profile-request/security-profile-name :portkey.aws.iot.-2015-05-28.create-security-profile-request/behaviors] :opt-un [:portkey.aws.iot.-2015-05-28.create-security-profile-request/security-profile-description :portkey.aws.iot.-2015-05-28.create-security-profile-request/alert-targets]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-targets (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy-target))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/forced clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-arns (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/resource-logical-id :portkey.aws.iot.-2015-05-28/resource-arn))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-metadata (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-metadata))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-name :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-id :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-arn :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-properties :portkey.aws.iot.-2015-05-28.describe-thing-type-response/thing-type-metadata]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary/queued-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary/started-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary/execution-number (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-execution-summary/status :portkey.aws.iot.-2015-05-28.job-execution-summary/queued-at :portkey.aws.iot.-2015-05-28.job-execution-summary/started-at :portkey.aws.iot.-2015-05-28.job-execution-summary/last-updated-at :portkey.aws.iot.-2015-05-28.job-execution-summary/execution-number]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-topic-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/waiting-for-data-collection-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-group-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-active-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-already-exists-exception/message :portkey.aws.iot.-2015-05-28/resource-id :portkey.aws.iot.-2015-05-28/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/rejected-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/force-delete-aws-job clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-response/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-by-ca-response/certificates :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alert-targets (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/alert-target-type :portkey.aws.iot.-2015-05-28/alert-target))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-active-violations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-active-violations-request/thing-name :portkey.aws.iot.-2015-05-28.list-active-violations-request/security-profile-name :portkey.aws.iot.-2015-05-28.list-active-violations-request/next-token :portkey.aws.iot.-2015-05-28.list-active-violations-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/force (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/expected-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/status-details (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/details-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cancel-job-execution-request/job-id :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.cancel-job-execution-request/force :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/expected-version :portkey.aws.iot.-2015-05-28.cancel-job-execution-request/status-details]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.implicit-deny/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/implicit-deny (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.implicit-deny/policies]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-principals-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-principals-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-thing-principals-request/thing-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ca-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ca-certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ca-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-ca-certificates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-ca-certificates-response/certificates :portkey.aws.iot.-2015-05-28.list-ca-certificates-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-authorizer-request/authorizer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/key-pair (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/key-pair))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-arn :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-id :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/certificate-pem :portkey.aws.iot.-2015-05-28.create-keys-and-certificate-response/key-pair]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-files (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/stream-file :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-registration-code-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-response/active-violations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/active-violations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-active-violations-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-active-violations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-active-violations-response/active-violations :portkey.aws.iot.-2015-05-28.list-active-violations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-target-type #{:thing-group :default "THING_GROUP" "DEFAULT"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/status #{"Failed" "Cancelled" :in-progress "Cancelling" :completed :cancelled "InProgress" "Completed" :cancelling :failed})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/behaviors (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/behavior :max-count 100))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/allow-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-findings (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/audit-finding))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auth-results (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/auth-result))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.policy-version/version-id :portkey.aws.iot.-2015-05-28.policy-version/is-default-version :portkey.aws.iot.-2015-05-28.policy-version/create-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/event-type #{:ca-certificate :thing-group "THING_TYPE" "THING_GROUP_HIERARCHY" "JOB_EXECUTION" "CA_CERTIFICATE" :thing-group-membership :job-execution "THING_TYPE_ASSOCIATION" "JOB" :thing-group-hierarchy :policy :certificate :thing :thing-type "POLICY" "THING_GROUP" "THING_GROUP_MEMBERSHIP" "THING" :job "CERTIFICATE" :thing-type-association})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/in-progress-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/role-alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w=,@-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.log-target-configuration/log-target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.log-target-configuration/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-target-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.log-target-configuration/log-target :portkey.aws.iot.-2015-05-28.log-target-configuration/log-level]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.put-item-input/table-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/put-item-input (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.put-item-input/table-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-document-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.search-index-response/thing-groups (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-document-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/search-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.search-index-response/next-token :portkey.aws.iot.-2015-05-28.search-index-response/things :portkey.aws.iot.-2015-05-28.search-index-response/thing-groups]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/succeeded-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-target-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/behavior-metric (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-ca-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-ca-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-ca-certificate-request/certificate-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-file/file-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/file-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-file/file-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-file-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-file/file-location (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/file-location))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-file/code-signing (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/code-signing))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-file/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-file (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.ota-update-file/file-name :portkey.aws.iot.-2015-05-28.ota-update-file/file-version :portkey.aws.iot.-2015-05-28.ota-update-file/file-location :portkey.aws.iot.-2015-05-28.ota-update-file/code-signing :portkey.aws.iot.-2015-05-28.ota-update-file/attributes]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/range-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/hash-key-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/delivery-stream-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delivery-stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.firehose-action/separator (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/firehose-separator))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/firehose-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.firehose-action/role-arn :portkey.aws.iot.-2015-05-28.firehose-action/delivery-stream-name] :opt-un [:portkey.aws.iot.-2015-05-28.firehose-action/separator]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/role-alias-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/scheduled-audit-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/frequency (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-frequency))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/day-of-month (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-month))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/day-of-week (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-week))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/scheduled-audit-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/scheduled-audit-name :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/scheduled-audit-arn :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/frequency :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/day-of-month :portkey.aws.iot.-2015-05-28.scheduled-audit-metadata/day-of-week]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-default-authorizer-response/authorizer-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-default-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-default-authorizer-response/authorizer-description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/total-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/timed-out-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-properties/thing-group-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-properties/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-group-properties/thing-group-description :portkey.aws.iot.-2015-05-28.thing-group-properties/attribute-payload]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cidrs (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/cidr))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-task-metadata/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-task-metadata/task-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-task-metadata/task-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-task-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.audit-task-metadata/task-id :portkey.aws.iot.-2015-05-28.audit-task-metadata/task-status :portkey.aws.iot.-2015-05-28.audit-task-metadata/task-type]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-role-aliases-response/role-aliases (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-aliases))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-role-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-role-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-role-aliases-response/role-aliases :portkey.aws.iot.-2015-05-28.list-role-aliases-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-index-request/index-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/index-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-index-request/index-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alert-target-type #{:sns "SNS"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 32768))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-check-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.get-topic-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-policy-request/policy-name :portkey.aws.iot.-2015-05-28.create-policy-request/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-principal-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.attach-principal-policy-request/policy-name :portkey.aws.iot.-2015-05-28.attach-principal-policy-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/recursive-without-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 40 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-attached-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-attached-policies-response/policies :portkey.aws.iot.-2015-05-28.list-attached-policies-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-response/scheduled-audit-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-scheduled-audit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-scheduled-audit-response/scheduled-audit-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-scheduled-audits-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-scheduled-audits-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-scheduled-audits-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-scheduled-audits-request/next-token :portkey.aws.iot.-2015-05-28.list-scheduled-audits-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/resource-links (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-file-url-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/report-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/report-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/resource-links :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/report-type :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-metadata/parent-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-metadata/root-to-parent-thing-groups (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name-and-arn-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-metadata/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/creation-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-group-metadata/parent-group-name :portkey.aws.iot.-2015-05-28.thing-group-metadata/root-to-parent-thing-groups :portkey.aws.iot.-2015-05-28.thing-group-metadata/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-indexing-mode #{"ON" :off :on "OFF"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/target-selection #{"SNAPSHOT" :continuous "CONTINUOUS" :snapshot})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-ota-update-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-ota-update-request/delete-stream (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-stream))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-ota-update-request/force-delete-aws-job (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-delete-aws-job))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-ota-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-ota-update-request/ota-update-id] :opt-un [:portkey.aws.iot.-2015-05-28.delete-ota-update-request/delete-stream :portkey.aws.iot.-2015-05-28.delete-ota-update-request/force-delete-aws-job]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/remove-auto-registration clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attributes (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/attribute-name :portkey.aws.iot.-2015-05-28/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/next-token :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/max-results :portkey.aws.iot.-2015-05-28.list-thing-registration-tasks-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-arn :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-id :portkey.aws.iot.-2015-05-28.create-certificate-from-csr-response/certificate-pem]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-response/security-profile-identifiers (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-identifiers))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-security-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-security-profiles-response/security-profile-identifiers :portkey.aws.iot.-2015-05-28.list-security-profiles-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-stream-request/stream-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/recursive (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/recursive))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/security-profile-target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/security-profile-target-arn] :opt-un [:portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/next-token :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/max-results :portkey.aws.iot.-2015-05-28.list-security-profiles-for-target-request/recursive]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/queue-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/force-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/unsigned-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-thing-request/template-body (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-thing-request/parameters (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/parameters))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.register-thing-request/template-body] :opt-un [:portkey.aws.iot.-2015-05-28.register-thing-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/role-aliases (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/role-alias))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-targets-for-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/policy-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/marker :portkey.aws.iot.-2015-05-28.list-targets-for-policy-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-response/generation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/generation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-arn :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-name :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-document :portkey.aws.iot.-2015-05-28.get-policy-version-response/policy-version-id :portkey.aws.iot.-2015-05-28.get-policy-version-response/is-default-version :portkey.aws.iot.-2015-05-28.get-policy-version-response/creation-date :portkey.aws.iot.-2015-05-28.get-policy-version-response/last-modified-date :portkey.aws.iot.-2015-05-28.get-policy-version-response/generation-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-streams-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-streams-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-streams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-streams-request/max-results :portkey.aws.iot.-2015-05-28.list-streams-request/next-token :portkey.aws.iot.-2015-05-28.list-streams-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stop-thing-registration-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.stop-thing-registration-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-summary/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-summary/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.authorizer-summary/authorizer-name :portkey.aws.iot.-2015-05-28.authorizer-summary/authorizer-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/signature clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.versions-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/versions-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.versions-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/check-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-check-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/resource-identifier (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-identifier))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-request/end-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-audit-findings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-audit-findings-request/task-id :portkey.aws.iot.-2015-05-28.list-audit-findings-request/check-name :portkey.aws.iot.-2015-05-28.list-audit-findings-request/resource-identifier :portkey.aws.iot.-2015-05-28.list-audit-findings-request/max-results :portkey.aws.iot.-2015-05-28.list-audit-findings-request/next-token :portkey.aws.iot.-2015-05-28.list-audit-findings-request/start-time :portkey.aws.iot.-2015-05-28.list-audit-findings-request/end-time]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-role-aliases-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-role-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-role-aliases-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-role-aliases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-role-aliases-request/page-size :portkey.aws.iot.-2015-05-28.list-role-aliases-request/marker :portkey.aws.iot.-2015-05-28.list-role-aliases-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-job-execution-request/job-id :portkey.aws.iot.-2015-05-28.describe-job-execution-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.describe-job-execution-request/execution-number]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-group-request/thing-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/check-compliant clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/searchable-attributes (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/attribute-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/job-summary))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-check-run-status #{"CANCELED" "IN_PROGRESS" :in-progress "COMPLETED_NON_COMPLIANT" :waiting-for-data-collection :completed-non-compliant "COMPLETED_COMPLIANT" :canceled "WAITING_FOR_DATA_COLLECTION" "FAILED" :failed :completed-compliant})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/message-format #{:raw "JSON" "RAW" :json})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-indexing-configuration/thing-indexing-mode (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-indexing-mode))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-indexing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.thing-indexing-configuration/thing-indexing-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/role-alias-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/owner (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.role-alias-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/role-alias-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.role-alias-description/role-alias :portkey.aws.iot.-2015-05-28.role-alias-description/role-alias-arn :portkey.aws.iot.-2015-05-28.role-alias-description/role-arn :portkey.aws.iot.-2015-05-28.role-alias-description/owner :portkey.aws.iot.-2015-05-28.role-alias-description/credential-duration-seconds :portkey.aws.iot.-2015-05-28.role-alias-description/creation-date :portkey.aws.iot.-2015-05-28.role-alias-description/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-frequency #{:daily :biweekly :monthly "MONTHLY" "WEEKLY" "DAILY" "BIWEEKLY" :weekly})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/aws-job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/files (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-files))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-ota-update-request/additional-parameters (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/additional-parameter-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-ota-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-ota-update-request/ota-update-id :portkey.aws.iot.-2015-05-28.create-ota-update-request/targets :portkey.aws.iot.-2015-05-28.create-ota-update-request/files :portkey.aws.iot.-2015-05-28.create-ota-update-request/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.create-ota-update-request/description :portkey.aws.iot.-2015-05-28.create-ota-update-request/target-selection :portkey.aws.iot.-2015-05-28.create-ota-update-request/aws-job-executions-rollout-config :portkey.aws.iot.-2015-05-28.create-ota-update-request/additional-parameters]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-v-2-logging-level-request/target-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-v-2-logging-level-request/target-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-v-2-logging-level-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-v-2-logging-level-request/target-type :portkey.aws.iot.-2015-05-28.delete-v-2-logging-level-request/target-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 800)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.,@/:#-]*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ca-certificates-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ca-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ca-certificates-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-ca-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-ca-certificates-request/page-size :portkey.aws.iot.-2015-05-28.list-ca-certificates-request/marker :portkey.aws.iot.-2015-05-28.list-ca-certificates-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-file-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-iot-job-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-key-type #{:number "NUMBER" :string "STRING"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/public-key-map (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/key-name :portkey.aws.iot.-2015-05-28/key-value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-certificate-request/force-delete (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-delete))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-certificate-request/certificate-id] :opt-un [:portkey.aws.iot.-2015-05-28.delete-certificate-request/force-delete]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-certificate-transfer-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cancel-certificate-transfer-request/certificate-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior-criteria/comparison-operator (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/comparison-operator))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior-criteria/value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/metric-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.behavior-criteria/duration-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/behavior-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.behavior-criteria/comparison-operator :portkey.aws.iot.-2015-05-28.behavior-criteria/value :portkey.aws.iot.-2015-05-28.behavior-criteria/duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.get-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/reason-for-non-compliance (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/timeout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timeout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/document-source (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-document-source))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/presigned-url-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/presigned-url-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-job-request/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-job-request/job-id :portkey.aws.iot.-2015-05-28.create-job-request/targets] :opt-un [:portkey.aws.iot.-2015-05-28.create-job-request/target-selection :portkey.aws.iot.-2015-05-28.create-job-request/timeout-config :portkey.aws.iot.-2015-05-28.create-job-request/document :portkey.aws.iot.-2015-05-28.create-job-request/document-source :portkey.aws.iot.-2015-05-28.create-job-request/presigned-url-config :portkey.aws.iot.-2015-05-28.create-job-request/job-executions-rollout-config :portkey.aws.iot.-2015-05-28.create-job-request/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-identifiers (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/security-profile-identifier))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-registration-code-response/registration-code (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registration-code))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-registration-code-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-registration-code-response/registration-code]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-logging-options-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-response/tasks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-metadata-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-audit-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-audit-tasks-response/tasks :portkey.aws.iot.-2015-05-28.list-audit-tasks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.signing-profile-parameter/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.signing-profile-parameter/platform (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/platform))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.signing-profile-parameter/certificate-path-on-device (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-path-on-device))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/signing-profile-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.signing-profile-parameter/certificate-arn :portkey.aws.iot.-2015-05-28.signing-profile-parameter/platform :portkey.aws.iot.-2015-05-28.signing-profile-parameter/certificate-path-on-device]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-file/file-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/file-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-file/s-3-location (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-location))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-file (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.stream-file/file-id :portkey.aws.iot.-2015-05-28.stream-file/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sns-action/message-format (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message-format))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sns-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.sns-action/target-arn :portkey.aws.iot.-2015-05-28.sns-action/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.sns-action/message-format]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-metadata (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-metadata))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-name :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-id :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-arn :portkey.aws.iot.-2015-05-28.describe-thing-group-response/version :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-properties :portkey.aws.iot.-2015-05-28.describe-thing-group-response/thing-group-metadata]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/channel-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.not-configured-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/not-configured-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.not-configured-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.presigned-url-config/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.presigned-url-config/expires-in-sec (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/expires-in-sec))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/presigned-url-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.presigned-url-config/role-arn :portkey.aws.iot.-2015-05-28.presigned-url-config/expires-in-sec]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.related-resource/resource-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.related-resource/resource-identifier (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-identifier))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.related-resource/additional-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/related-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.related-resource/resource-type :portkey.aws.iot.-2015-05-28.related-resource/resource-identifier :portkey.aws.iot.-2015-05-28.related-resource/additional-info]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/undo-deprecate clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-event-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-ca-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/queued-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-role-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-role-alias-request/role-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.invalid-response-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/invalid-response-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.invalid-response-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-thing-type-request/thing-type-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/credential-duration-seconds (clojure.spec.alpha/int-in 900 3600))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/task-start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/check-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-check-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/related-resources (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/related-resources))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/finding-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/reason-for-non-compliance-code (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/reason-for-non-compliance-code))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/severity (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-finding-severity))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/non-compliant-resource (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/non-compliant-resource))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-finding/reason-for-non-compliance (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/reason-for-non-compliance))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-finding (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.audit-finding/task-start-time :portkey.aws.iot.-2015-05-28.audit-finding/check-name :portkey.aws.iot.-2015-05-28.audit-finding/related-resources :portkey.aws.iot.-2015-05-28.audit-finding/finding-time :portkey.aws.iot.-2015-05-28.audit-finding/reason-for-non-compliance-code :portkey.aws.iot.-2015-05-28.audit-finding/task-id :portkey.aws.iot.-2015-05-28.audit-finding/severity :portkey.aws.iot.-2015-05-28.audit-finding/non-compliant-resource :portkey.aws.iot.-2015-05-28.audit-finding/reason-for-non-compliance]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.index-not-ready-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/index-not-ready-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.index-not-ready-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-summary-for-job-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/job-execution-summary-for-job))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.aws-job-executions-rollout-config/maximum-per-minute (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/maximum-per-minute))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-job-executions-rollout-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.aws-job-executions-rollout-config/maximum-per-minute]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/associate-targets-with-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/job-arn :portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/job-id :portkey.aws.iot.-2015-05-28.associate-targets-with-job-response/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-execution-response/execution (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-job-execution-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-job-execution-response/execution]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/token-key-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-name :portkey.aws.iot.-2015-05-28.delete-policy-version-request/policy-version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/port (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-request/target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-request/recursive (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/recursive))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-attached-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-attached-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-attached-policies-request/target] :opt-un [:portkey.aws.iot.-2015-05-28.list-attached-policies-request/recursive :portkey.aws.iot.-2015-05-28.list-attached-policies-request/marker :portkey.aws.iot.-2015-05-28.list-attached-policies-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-status #{:inactive :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.group-name-and-arn/group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.group-name-and-arn/group-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/group-name-and-arn (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.group-name-and-arn/group-name :portkey.aws.iot.-2015-05-28.group-name-and-arn/group-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.timeout-config/in-progress-timeout-in-minutes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/in-progress-timeout-in-minutes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/timeout-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.timeout-config/in-progress-timeout-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-on-demand-audit-task-response/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.start-on-demand-audit-task-response/task-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 12 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 12)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/is-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sql-parse-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sql-parse-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.sql-parse-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-authorizer-response/authorizer-name :portkey.aws.iot.-2015-05-28.update-authorizer-response/authorizer-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resources (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/resource))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/frequency (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-frequency))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/day-of-month (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-month))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/day-of-week (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-week))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/target-check-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-audit-check-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/scheduled-audit-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/frequency :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/day-of-month :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/day-of-week :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/target-check-names :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/scheduled-audit-name :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-response/scheduled-audit-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-documents (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy-document))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-indexing-configuration-response/thing-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-indexing-configuration-response/thing-group-indexing-configuration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-indexing-configuration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-indexing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-indexing-configuration-response/thing-indexing-configuration :portkey.aws.iot.-2015-05-28.get-indexing-configuration-response/thing-group-indexing-configuration]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auth-decision #{"IMPLICIT_DENY" :explicit-deny "ALLOWED" :implicit-deny "EXPLICIT_DENY" :allowed})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attribute-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-response/authorizers (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizers))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-authorizers-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-authorizers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-authorizers-response/authorizers :portkey.aws.iot.-2015-05-28.list-authorizers-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.internal-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.internal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.file-location/stream (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.file-location/s-3-location (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-location))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/file-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.file-location/stream :portkey.aws.iot.-2015-05-28.file-location/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.log-target/target-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.log-target/target-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/log-target (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.log-target/target-type] :opt-un [:portkey.aws.iot.-2015-05-28.log-target/target-name]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/default-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-response/generation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/generation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-policy-response/policy-name :portkey.aws.iot.-2015-05-28.get-policy-response/policy-arn :portkey.aws.iot.-2015-05-28.get-policy-response/policy-document :portkey.aws.iot.-2015-05-28.get-policy-response/default-version-id :portkey.aws.iot.-2015-05-28.get-policy-response/creation-date :portkey.aws.iot.-2015-05-28.get-policy-response/last-modified-date :portkey.aws.iot.-2015-05-28.get-policy-response/generation-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-namespace (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-unit (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-timestamp (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/string))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cloudwatch-metric-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/role-arn :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-namespace :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-name :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-value :portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-unit] :opt-un [:portkey.aws.iot.-2015-05-28.cloudwatch-metric-action/metric-timestamp]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-default-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.set-default-authorizer-request/authorizer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.version-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/version-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.version-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-notification-target/target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-notification-target/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-notification-target/enabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/enabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-notification-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.audit-notification-target/target-arn :portkey.aws.iot.-2015-05-28.audit-notification-target/role-arn :portkey.aws.iot.-2015-05-28.audit-notification-target/enabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-executions-rollout-config/maximum-per-minute (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-job-executions-per-min))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-executions-rollout-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-executions-rollout-config/maximum-per-minute]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-summary/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-summary/stream-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-summary/stream-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream-summary/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.stream-summary/stream-id :portkey.aws.iot.-2015-05-28.stream-summary/stream-arn :portkey.aws.iot.-2015-05-28.stream-summary/stream-version :portkey.aws.iot.-2015-05-28.stream-summary/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-response/policy-name :portkey.aws.iot.-2015-05-28.create-policy-response/policy-arn :portkey.aws.iot.-2015-05-28.create-policy-response/policy-document :portkey.aws.iot.-2015-05-28.create-policy-response/policy-version-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-group-name :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-group-arn :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-name :portkey.aws.iot.-2015-05-28.remove-thing-from-thing-group-request/thing-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.error-info/code (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/code))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.error-info/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/error-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.error-info/code :portkey.aws.iot.-2015-05-28.error-info/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attributes-map (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/attribute-key :portkey.aws.iot.-2015-05-28/value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-document-source (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1350))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-request/parent-group (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-request/name-prefix-filter (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-groups-request/recursive (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/recursive-without-default))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-groups-request/next-token :portkey.aws.iot.-2015-05-28.list-thing-groups-request/max-results :portkey.aws.iot.-2015-05-28.list-thing-groups-request/parent-group :portkey.aws.iot.-2015-05-28.list-thing-groups-request/name-prefix-filter :portkey.aws.iot.-2015-05-28.list-thing-groups-request/recursive]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/remove-thing-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-document/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-group-document/parent-group-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-name :portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-id :portkey.aws.iot.-2015-05-28.thing-group-document/thing-group-description :portkey.aws.iot.-2015-05-28.thing-group-document/attributes :portkey.aws.iot.-2015-05-28.thing-group-document/parent-group-names]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/token-key-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.authorizer-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-name :portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-arn :portkey.aws.iot.-2015-05-28.authorizer-description/authorizer-function-arn :portkey.aws.iot.-2015-05-28.authorizer-description/token-key-name :portkey.aws.iot.-2015-05-28.authorizer-description/token-signing-public-keys :portkey.aws.iot.-2015-05-28.authorizer-description/status :portkey.aws.iot.-2015-05-28.authorizer-description/creation-date :portkey.aws.iot.-2015-05-28.authorizer-description/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delivery-stream-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-response/findings (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-findings))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-findings-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-audit-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-audit-findings-response/findings :portkey.aws.iot.-2015-05-28.list-audit-findings-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-thing-principal-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.attach-thing-principal-request/thing-name :portkey.aws.iot.-2015-05-28.attach-thing-principal-request/principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-registration-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-registration-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-registration-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/queue-url (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/queue-url))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.sqs-action/use-base-64 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/use-base-64))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sqs-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.sqs-action/role-arn :portkey.aws.iot.-2015-05-28.sqs-action/queue-url] :opt-un [:portkey.aws.iot.-2015-05-28.sqs-action/use-base-64]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-scheduled-audit-request/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-scheduled-audit-request/scheduled-audit-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-versions-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-policy-versions-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cognito-identity-pool-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/parameter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/details-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\p{C}]*+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ports (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/port))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-name :portkey.aws.iot.-2015-05-28.get-policy-version-request/policy-version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.allowed/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/allowed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.allowed/policies]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-targets (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/target-arn :min-count 1))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/missing-context-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.denied/implicit-deny (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/implicit-deny))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.denied/explicit-deny (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/explicit-deny))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.denied/implicit-deny :portkey.aws.iot.-2015-05-28.denied/explicit-deny]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.code-signing-signature/inline-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/signature))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/code-signing-signature (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.code-signing-signature/inline-document]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-principal-things-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-principal-things-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-principal-things-request/principal] :opt-un [:portkey.aws.iot.-2015-05-28.list-principal-things-request/next-token :portkey.aws.iot.-2015-05-28.list-principal-things-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/invalid-state-transition-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.invalid-state-transition-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-certificate-response/certificate-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-certificate-response/certificate-description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.conflicting-resource-update-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/conflicting-resource-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.conflicting-resource-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alert-target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-endpoint-request/endpoint-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/endpoint-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-endpoint-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-endpoint-request/endpoint-type]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/security-profile-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/next-token :portkey.aws.iot.-2015-05-28.list-targets-for-security-profile-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/ca-certificate-id] :opt-un [:portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/page-size :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/marker :portkey.aws.iot.-2015-05-28.list-certificates-by-ca-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-notification-type #{:sns "SNS"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-file-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 65535))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/report-type #{:errors "RESULTS" "ERRORS" :results})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-role-alias-response/role-alias-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-role-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-role-alias-response/role-alias-description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-request/security-profile-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-request/behaviors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behaviors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-request/alert-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alert-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-security-profile-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-security-profile-request/security-profile-name] :opt-un [:portkey.aws.iot.-2015-05-28.update-security-profile-request/security-profile-description :portkey.aws.iot.-2015-05-28.update-security-profile-request/behaviors :portkey.aws.iot.-2015-05-28.update-security-profile-request/alert-targets :portkey.aws.iot.-2015-05-28.update-security-profile-request/expected-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-job-document-response/document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-job-document-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-job-document-response/document]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-type #{:ca-certificate "ACCOUNT_SETTINGS" "CLIENT_ID" :client-id :account-settings "CA_CERTIFICATE" :device-certificate "IOT_POLICY" "COGNITO_IDENTITY_POOL" "DEVICE_CERTIFICATE" :iot-policy :cognito-identity-pool})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alarm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-status-details/details-map (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/details-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-status-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-execution-status-details/details-map]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/hash-key-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/targets (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/target :min-count 1))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-account-audit-configuration-request/delete-scheduled-audits (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-scheduled-audits))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.delete-account-audit-configuration-request/delete-scheduled-audits]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.republish-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.republish-action/topic (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/republish-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.republish-action/role-arn :portkey.aws.iot.-2015-05-28.republish-action/topic] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-response/document-source (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-document-source))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-job-response/job (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-job-response/document-source :portkey.aws.iot.-2015-05-28.describe-job-response/job]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/device-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/ca-certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/cognito-identity-pool-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cognito-identity-pool-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/client-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/policy-version-identifier (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-identifier))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.resource-identifier/account (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.resource-identifier/device-certificate-id :portkey.aws.iot.-2015-05-28.resource-identifier/ca-certificate-id :portkey.aws.iot.-2015-05-28.resource-identifier/cognito-identity-pool-id :portkey.aws.iot.-2015-05-28.resource-identifier/client-id :portkey.aws.iot.-2015-05-28.resource-identifier/policy-version-identifier :portkey.aws.iot.-2015-05-28.resource-identifier/account]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-response/log-target-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-response/log-target-configurations :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-ota-update-request/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-ota-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.get-ota-update-request/ota-update-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/clear-default-authorizer-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/ca-certificate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/verification-certificate (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/set-as-active (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-active))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/allow-auto-registration (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/allow-auto-registration))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/registration-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registration-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-ca-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.register-ca-certificate-request/ca-certificate :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/verification-certificate] :opt-un [:portkey.aws.iot.-2015-05-28.register-ca-certificate-request/set-as-active :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/allow-auto-registration :portkey.aws.iot.-2015-05-28.register-ca-certificate-request/registration-config]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policies-request/marker :portkey.aws.iot.-2015-05-28.list-policies-request/page-size :portkey.aws.iot.-2015-05-28.list-policies-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream-version (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-scheduled-audit-request/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-scheduled-audit-request/scheduled-audit-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-status #{"CANCELED" :timed-out "IN_PROGRESS" "TIMED_OUT" :in-progress :rejected "REMOVED" :queued :canceled "SUCCEEDED" "REJECTED" "QUEUED" "FAILED" :removed :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-arn :portkey.aws.iot.-2015-05-28.register-certificate-response/certificate-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.metric-value/count (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/unsigned-long))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.metric-value/cidrs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cidrs))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.metric-value/ports (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ports))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/metric-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.metric-value/count :portkey.aws.iot.-2015-05-28.metric-value/cidrs :portkey.aws.iot.-2015-05-28.metric-value/ports]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-timed-out-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timed-out-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-canceled-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/canceled-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-queued-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/queued-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-in-progress-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/in-progress-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-removed-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/removed-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-failed-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/failed-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-succeeded-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/succeeded-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/number-of-rejected-things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rejected-things))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-process-details/processing-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/processing-target-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-process-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-process-details/number-of-timed-out-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-canceled-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-queued-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-in-progress-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-removed-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-failed-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-succeeded-things :portkey.aws.iot.-2015-05-28.job-process-details/number-of-rejected-things :portkey.aws.iot.-2015-05-28.job-process-details/processing-targets]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-already-completed-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-already-completed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-request/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-request/token-key-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-request/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-authorizer-request/authorizer-name :portkey.aws.iot.-2015-05-28.create-authorizer-request/authorizer-function-arn :portkey.aws.iot.-2015-05-28.create-authorizer-request/token-key-name :portkey.aws.iot.-2015-05-28.create-authorizer-request/token-signing-public-keys] :opt-un [:portkey.aws.iot.-2015-05-28.create-authorizer-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-check-configurations (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/audit-check-name :portkey.aws.iot.-2015-05-28/audit-check-configuration))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principals))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-principals-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-principals-response/principals]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-scheduled-audits clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/endpoint (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/index (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-index))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.elasticsearch-action/id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.elasticsearch-action/role-arn :portkey.aws.iot.-2015-05-28.elasticsearch-action/endpoint :portkey.aws.iot.-2015-05-28.elasticsearch-action/index :portkey.aws.iot.-2015-05-28.elasticsearch-action/type :portkey.aws.iot.-2015-05-28.elasticsearch-action/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-location/bucket (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-location/key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-key))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-location/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.s-3-location/bucket :portkey.aws.iot.-2015-05-28.s-3-location/key :portkey.aws.iot.-2015-05-28.s-3-location/version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-v-2-logging-level-request/log-target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-v-2-logging-level-request/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-v-2-logging-level-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.set-v-2-logging-level-request/log-target :portkey.aws.iot.-2015-05-28.set-v-2-logging-level-request/log-level] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/total-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/total-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/in-progress-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/in-progress-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/waiting-for-data-collection-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/waiting-for-data-collection-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/compliant-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/compliant-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/non-compliant-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/non-compliant-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/failed-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/failed-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.task-statistics/canceled-checks (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/canceled-checks-count))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/task-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.task-statistics/total-checks :portkey.aws.iot.-2015-05-28.task-statistics/in-progress-checks :portkey.aws.iot.-2015-05-28.task-statistics/waiting-for-data-collection-checks :portkey.aws.iot.-2015-05-28.task-statistics/compliant-checks :portkey.aws.iot.-2015-05-28.task-statistics/non-compliant-checks :portkey.aws.iot.-2015-05-28.task-statistics/failed-checks :portkey.aws.iot.-2015-05-28.task-statistics/canceled-checks]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-index (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-job-document-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-job-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.get-job-document-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policies (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-name :portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-arn :portkey.aws.iot.-2015-05-28.create-thing-group-response/thing-group-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.custom-code-signing/signature (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/code-signing-signature))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.custom-code-signing/certificate-chain (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/code-signing-certificate-chain))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.custom-code-signing/hash-algorithm (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.custom-code-signing/signature-algorithm (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/signature-algorithm))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/custom-code-signing (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.custom-code-signing/signature :portkey.aws.iot.-2015-05-28.custom-code-signing/certificate-chain :portkey.aws.iot.-2015-05-28.custom-code-signing/hash-algorithm :portkey.aws.iot.-2015-05-28.custom-code-signing/signature-algorithm]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/table-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-stream-request/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-stream-request/stream-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-iot-sql-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.disable-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/disable-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.disable-topic-rule-request/rule-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auth-infos (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/auth-info :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-security-profile-request/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-security-profile-request/security-profile-target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-security-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.detach-security-profile-request/security-profile-name :portkey.aws.iot.-2015-05-28.detach-security-profile-request/security-profile-target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream/stream-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.stream/file-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/file-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.stream/stream-id :portkey.aws.iot.-2015-05-28.stream/file-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/sql (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-response/valid (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/valid))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-response/validation-errors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/validation-errors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-response/valid :portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-response/validation-errors]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/details-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registry-s-3-bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 3 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/job-id] :opt-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/status :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/max-results :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/range-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/table-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/table-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/hash-key-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/range-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/operation (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-operation))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/payload-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/payload-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-field (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/hash-key-field))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-key-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-db-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.dynamo-db-action/table-name :portkey.aws.iot.-2015-05-28.dynamo-db-action/role-arn :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-field :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-value] :opt-un [:portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-value :portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-field :portkey.aws.iot.-2015-05-28.dynamo-db-action/hash-key-type :portkey.aws.iot.-2015-05-28.dynamo-db-action/operation :portkey.aws.iot.-2015-05-28.dynamo-db-action/payload-field :portkey.aws.iot.-2015-05-28.dynamo-db-action/range-key-type]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-groups-to-add (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-groups-to-remove (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-name :portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-groups-to-add :portkey.aws.iot.-2015-05-28.update-thing-groups-for-thing-request/thing-groups-to-remove]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/violation-event-type #{:inalarm "alarm-invalidated" :alarmcleared "in-alarm" "alarm-cleared" :alarminvalidated})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/total-resources-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-response/principals (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principals))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-principals-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-response/principals :portkey.aws.iot.-2015-05-28.list-policy-principals-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/frequency (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-frequency))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/day-of-month (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-month))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/day-of-week (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-week))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/target-check-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-audit-check-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-scheduled-audit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/frequency :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/target-check-names :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/scheduled-audit-name] :opt-un [:portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/day-of-month :portkey.aws.iot.-2015-05-28.create-scheduled-audit-request/day-of-week]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/topic-rule-list-item))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/attribute-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-request/remove-thing-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/remove-thing-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-thing-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.update-thing-request/thing-type-name :portkey.aws.iot.-2015-05-28.update-thing-request/attribute-payload :portkey.aws.iot.-2015-05-28.update-thing-request/expected-version :portkey.aws.iot.-2015-05-28.update-thing-request/remove-thing-type]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-version-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.alert-target/alert-target-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alert-target-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.alert-target/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/alert-target (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.alert-target/alert-target-arn :portkey.aws.iot.-2015-05-28.alert-target/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-response/thing-types (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-types-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-types-response/thing-types :portkey.aws.iot.-2015-05-28.list-thing-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-ca-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-ca-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-ca-certificate-request/certificate-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/dynamo-operation (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizers (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/authorizer-summary))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/processing-target-name-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/processing-target-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-response/execution-summaries (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-summary-for-thing-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-response/execution-summaries :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-response/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-response/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-response/thing-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-response/thing-name :portkey.aws.iot.-2015-05-28.create-thing-response/thing-arn :portkey.aws.iot.-2015-05-28.create-thing-response/thing-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/cognito-identity-pool-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cognito-identity-pool-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/auth-infos (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auth-infos))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/client-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/client-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/policy-names-to-add (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-request/policy-names-to-skip (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/test-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.test-authorization-request/auth-infos] :opt-un [:portkey.aws.iot.-2015-05-28.test-authorization-request/principal :portkey.aws.iot.-2015-05-28.test-authorization-request/cognito-identity-pool-id :portkey.aws.iot.-2015-05-28.test-authorization-request/client-id :portkey.aws.iot.-2015-05-28.test-authorization-request/policy-names-to-add :portkey.aws.iot.-2015-05-28.test-authorization-request/policy-names-to-skip]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/clear-default-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/hash-algorithm (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/page-size (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/page-size))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policy-principals-request/ascending-order (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ascending-order))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policy-principals-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-request/policy-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-policy-principals-request/marker :portkey.aws.iot.-2015-05-28.list-policy-principals-request/page-size :portkey.aws.iot.-2015-05-28.list-policy-principals-request/ascending-order]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-status #{:inactive "REGISTER_INACTIVE" "REVOKED" :revoked :pending-activation :register-inactive :pending-transfer :active "INACTIVE" "PENDING_ACTIVATION" "ACTIVE" "PENDING_TRANSFER"})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version-identifier/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy-version-identifier/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-version-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.policy-version-identifier/policy-name :portkey.aws.iot.-2015-05-28.policy-version-identifier/policy-version-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.security-profile-identifier/name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.security-profile-identifier/arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.security-profile-identifier/name :portkey.aws.iot.-2015-05-28.security-profile-identifier/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-authorizer-response/authorizer-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-authorizer-response/authorizer-description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-name-and-arn-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/group-name-and-arn))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-authorizer-response/authorizer-name :portkey.aws.iot.-2015-05-28.create-authorizer-response/authorizer-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-request/behaviors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behaviors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.validate-security-profile-behaviors-request/behaviors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/customer-version (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[\w=,@-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.policy/policy-name :portkey.aws.iot.-2015-05-28.policy/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/key-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28/public-key :portkey.aws.iot.-2015-05-28/private-key]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/maximum-per-minute (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/behavior-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.detach-policy-request/target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/detach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.detach-policy-request/policy-name :portkey.aws.iot.-2015-05-28.detach-policy-request/target] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-destination/bucket (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-destination/prefix (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/prefix))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.s-3-destination/bucket :portkey.aws.iot.-2015-05-28.s-3-destination/prefix]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-response/execution-summaries (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-summary-for-job-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-job-response/execution-summaries :portkey.aws.iot.-2015-05-28.list-job-executions-for-job-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.malformed-policy-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/malformed-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.malformed-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-as-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-ota-update-response/ota-update-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-info))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-ota-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-ota-update-response/ota-update-info]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-response/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-ca-certificate-response/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-ca-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.register-ca-certificate-response/certificate-arn :portkey.aws.iot.-2015-05-28.register-ca-certificate-response/certificate-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/state-machine-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-group-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-group-name :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-group-arn :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-name :portkey.aws.iot.-2015-05-28.add-thing-to-thing-group-request/thing-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-scheduled-audit-response/scheduled-audit-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-scheduled-audit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-scheduled-audit-response/scheduled-audit-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.logging-options-payload/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.logging-options-payload/log-level (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-level))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/logging-options-payload (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.logging-options-payload/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.logging-options-payload/log-level]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/file-id (clojure.spec.alpha/int-in 0 255))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/processing-target-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/behaviors (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/behaviors))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/alert-targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alert-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-security-profile-response/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-name :portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-arn :portkey.aws.iot.-2015-05-28.describe-security-profile-response/security-profile-description :portkey.aws.iot.-2015-05-28.describe-security-profile-response/behaviors :portkey.aws.iot.-2015-05-28.describe-security-profile-response/alert-targets :portkey.aws.iot.-2015-05-28.describe-security-profile-response/version :portkey.aws.iot.-2015-05-28.describe-security-profile-response/creation-date :portkey.aws.iot.-2015-05-28.describe-security-profile-response/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/recursive (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/recursive))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/thing-group-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/recursive :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/next-token :portkey.aws.iot.-2015-05-28.list-things-in-thing-group-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.salesforce-action/token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.salesforce-action/url (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-endpoint))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.salesforce-action/token :portkey.aws.iot.-2015-05-28.salesforce-action/url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-request/force (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-job-request/job-id] :opt-un [:portkey.aws.iot.-2015-05-28.delete-job-request/force]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/event-configurations (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/event-type :portkey.aws.iot.-2015-05-28/configuration))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/salesforce-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2000)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"https://ingestion-[a-zA-Z0-9]{1,12}\.[a-zA-Z0-9]+\.((sfdc-matrix\.net)|(sfdcnow\.com))/streams/\w{1,20}/\w{1,20}/event" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cancel-audit-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cancel-audit-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cancel-audit-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.step-functions-action/execution-name-prefix (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/execution-name-prefix))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.step-functions-action/state-machine-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/state-machine-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.step-functions-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/step-functions-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.step-functions-action/state-machine-name :portkey.aws.iot.-2015-05-28.step-functions-action/role-arn] :opt-un [:portkey.aws.iot.-2015-05-28.step-functions-action/execution-name-prefix]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policies))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-policies-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-policies-response/policies :portkey.aws.iot.-2015-05-28.list-policies-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ascending-order clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/timeout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timeout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/completed-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/presigned-url-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/presigned-url-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/job-process-details (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-process-details))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/comment (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/comment))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/force-canceled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/forced))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job/target-selection :portkey.aws.iot.-2015-05-28.job/created-at :portkey.aws.iot.-2015-05-28.job/timeout-config :portkey.aws.iot.-2015-05-28.job/completed-at :portkey.aws.iot.-2015-05-28.job/status :portkey.aws.iot.-2015-05-28.job/last-updated-at :portkey.aws.iot.-2015-05-28.job/targets :portkey.aws.iot.-2015-05-28.job/job-arn :portkey.aws.iot.-2015-05-28.job/presigned-url-config :portkey.aws.iot.-2015-05-28.job/job-process-details :portkey.aws.iot.-2015-05-28.job/job-id :portkey.aws.iot.-2015-05-28.job/comment :portkey.aws.iot.-2015-05-28.job/job-executions-rollout-config :portkey.aws.iot.-2015-05-28.job/force-canceled :portkey.aws.iot.-2015-05-28.job/description]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/is-default-version clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-info/action-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-info/resources (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resources))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auth-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.auth-info/action-type :portkey.aws.iot.-2015-05-28.auth-info/resources]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ge-max-results (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-validity/not-before (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-validity/not-after (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-validity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-validity/not-before :portkey.aws.iot.-2015-05-28.certificate-validity/not-after]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/violation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/optional-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/start-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/end-time (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/task-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/task-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-task-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-audit-tasks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-audit-tasks-request/start-time :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/end-time] :opt-un [:portkey.aws.iot.-2015-05-28.list-audit-tasks-request/task-type :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/task-status :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/next-token :portkey.aws.iot.-2015-05-28.list-audit-tasks-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/action-type #{"SUBSCRIBE" "PUBLISH" :connect :receive "CONNECT" "RECEIVE" :subscribe :publish})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-summary-for-thing-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/job-execution-summary-for-thing))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9:_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principal (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/customer-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/customer-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/validity (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-validity))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/owned-by (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/auto-registration-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auto-registration-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/generation-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/generation-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ca-certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ca-certificate-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.ca-certificate-description/customer-version :portkey.aws.iot.-2015-05-28.ca-certificate-description/creation-date :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-pem :portkey.aws.iot.-2015-05-28.ca-certificate-description/validity :portkey.aws.iot.-2015-05-28.ca-certificate-description/last-modified-date :portkey.aws.iot.-2015-05-28.ca-certificate-description/owned-by :portkey.aws.iot.-2015-05-28.ca-certificate-description/auto-registration-status :portkey.aws.iot.-2015-05-28.ca-certificate-description/generation-id :portkey.aws.iot.-2015-05-28.ca-certificate-description/status :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-arn :portkey.aws.iot.-2015-05-28.ca-certificate-description/certificate-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/execution-name-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-group-request/thing-group-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-group-request/thing-group-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-thing-group-request/expected-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/optional-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-thing-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-thing-group-request/thing-group-name :portkey.aws.iot.-2015-05-28.update-thing-group-request/thing-group-properties] :opt-un [:portkey.aws.iot.-2015-05-28.update-thing-group-request/expected-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/transfer-message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/reject-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/transfer-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/accept-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.transfer-data/reject-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/transfer-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.transfer-data/transfer-message :portkey.aws.iot.-2015-05-28.transfer-data/reject-reason :portkey.aws.iot.-2015-05-28.transfer-data/transfer-date :portkey.aws.iot.-2015-05-28.transfer-data/accept-date :portkey.aws.iot.-2015-05-28.transfer-data/reject-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/scheduled-audit-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/template-body (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/template-body))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/input-file-bucket (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/input-file-key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-s-3-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/start-thing-registration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/template-body :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/input-file-bucket :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/input-file-key :portkey.aws.iot.-2015-05-28.start-thing-registration-task-request/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.registration-code-validation-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registration-code-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.registration-code-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/policy-versions (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/policy-version))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-security-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-security-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-security-profiles-request/next-token :portkey.aws.iot.-2015-05-28.list-security-profiles-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/alarm-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/alarm-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-reason (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/state-reason))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/state-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/cloudwatch-alarm-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/role-arn :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/alarm-name :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-reason :portkey.aws.iot.-2015-05-28.cloudwatch-alarm-action/state-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/signing-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.test-authorization-response/auth-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auth-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/test-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.test-authorization-response/auth-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.lambda-action/function-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/lambda-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.lambda-action/function-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-jobs-response/jobs :portkey.aws.iot.-2015-05-28.list-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-logging-options-request/logging-options-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/logging-options-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-logging-options-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.set-logging-options-request/logging-options-payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/report-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/report-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/task-id :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/report-type] :opt-un [:portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/next-token :portkey.aws.iot.-2015-05-28.list-thing-registration-task-reports-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/failed-checks-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 64 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-updates-summary (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/ota-update-summary))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-status #{"CREATE_PENDING" :create-complete "CREATE_FAILED" "CREATE_IN_PROGRESS" :create-failed :create-in-progress "CREATE_COMPLETE" :create-pending})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/attach-thing-principal-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/target-type (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/log-target-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/skyfall-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/target-type :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/next-token :portkey.aws.iot.-2015-05-28.list-v-2-logging-levels-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/related-resources (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/related-resource))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/endpoint-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/in-progress-things clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-pem (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 65536))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/file-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/thing-group-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-summary/completed-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-summary/job-arn :portkey.aws.iot.-2015-05-28.job-summary/job-id :portkey.aws.iot.-2015-05-28.job-summary/thing-group-id :portkey.aws.iot.-2015-05-28.job-summary/target-selection :portkey.aws.iot.-2015-05-28.job-summary/status :portkey.aws.iot.-2015-05-28.job-summary/created-at :portkey.aws.iot.-2015-05-28.job-summary/last-updated-at :portkey.aws.iot.-2015-05-28.job-summary/completed-at]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/thing-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/thing-group-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-group-name-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/attributes (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attributes))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.thing-document/shadow (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/json-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.thing-document/thing-name :portkey.aws.iot.-2015-05-28.thing-document/thing-id :portkey.aws.iot.-2015-05-28.thing-document/thing-type-name :portkey.aws.iot.-2015-05-28.thing-document/thing-group-names :portkey.aws.iot.-2015-05-28.thing-document/attributes :portkey.aws.iot.-2015-05-28.thing-document/shadow]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-properties (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-properties))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-name] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-type-request/thing-type-properties]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/dynamo-db (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-db-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/sns (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sns-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/cloudwatch-alarm (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cloudwatch-alarm-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/iot-analytics (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/iot-analytics-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/republish (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/republish-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/kinesis (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/kinesis-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/s-3 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/s-3-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/salesforce (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/salesforce-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/sqs (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sqs-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/elasticsearch (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/elasticsearch-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/cloudwatch-metric (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cloudwatch-metric-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/firehose (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/firehose-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/dynamo-d-bv-2 (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/dynamo-d-bv-2-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/lambda (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/lambda-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.action/step-functions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/step-functions-action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.action/dynamo-db :portkey.aws.iot.-2015-05-28.action/sns :portkey.aws.iot.-2015-05-28.action/cloudwatch-alarm :portkey.aws.iot.-2015-05-28.action/iot-analytics :portkey.aws.iot.-2015-05-28.action/republish :portkey.aws.iot.-2015-05-28.action/kinesis :portkey.aws.iot.-2015-05-28.action/s-3 :portkey.aws.iot.-2015-05-28.action/salesforce :portkey.aws.iot.-2015-05-28.action/sqs :portkey.aws.iot.-2015-05-28.action/elasticsearch :portkey.aws.iot.-2015-05-28.action/cloudwatch-metric :portkey.aws.iot.-2015-05-28.action/firehose :portkey.aws.iot.-2015-05-28.action/dynamo-d-bv-2 :portkey.aws.iot.-2015-05-28.action/lambda :portkey.aws.iot.-2015-05-28.action/step-functions]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28/enabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-type-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-type-definition))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-topic-rule-request/rule-name :portkey.aws.iot.-2015-05-28.create-topic-rule-request/topic-rule-payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/created-at-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary-for-thing/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution-summary-for-thing/job-execution-summary (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-summary))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution-summary-for-thing (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-execution-summary-for-thing/job-id :portkey.aws.iot.-2015-05-28.job-execution-summary-for-thing/job-execution-summary]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 6144))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate/certificate-arn :portkey.aws.iot.-2015-05-28.certificate/certificate-id :portkey.aws.iot.-2015-05-28.certificate/status :portkey.aws.iot.-2015-05-28.certificate/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-execution-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-execution-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-execution-request/execution-number (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-job-execution-request/force (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/force-flag))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-job-execution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-job-execution-request/job-id :portkey.aws.iot.-2015-05-28.delete-job-execution-request/thing-name :portkey.aws.iot.-2015-05-28.delete-job-execution-request/execution-number] :opt-un [:portkey.aws.iot.-2015-05-28.delete-job-execution-request/force]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-stream-response/stream-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-info))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-stream-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-stream-response/stream-info]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-role-alias-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-role-alias-request/credential-duration-seconds (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/credential-duration-seconds))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-role-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-role-alias-request/role-alias] :opt-un [:portkey.aws.iot.-2015-05-28.update-role-alias-request/role-arn :portkey.aws.iot.-2015-05-28.update-role-alias-request/credential-duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 2028)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\p{C}]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-version-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-version-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-response/is-default-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-default-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-arn :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-document :portkey.aws.iot.-2015-05-28.create-policy-version-response/policy-version-id :portkey.aws.iot.-2015-05-28.create-policy-version-response/is-default-version]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-authorizer-request/authorizer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/aws-iot-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-response/security-profile-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-security-profile-response/security-profile-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-security-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-security-profile-response/security-profile-name :portkey.aws.iot.-2015-05-28.create-security-profile-response/security-profile-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/approximate-seconds-before-timed-out clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/elasticsearch-endpoint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"https?://.*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/aws-job-executions-rollout-config (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-job-executions-rollout-config))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/target-selection (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-selection))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-files (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-files))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/error-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-info))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/last-modified-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/aws-iot-job-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-job-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/aws-iot-job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-update-description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ota-update-info/additional-parameters (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/additional-parameter-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ota-update-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.ota-update-info/creation-date :portkey.aws.iot.-2015-05-28.ota-update-info/aws-job-executions-rollout-config :portkey.aws.iot.-2015-05-28.ota-update-info/target-selection :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-id :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-status :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-files :portkey.aws.iot.-2015-05-28.ota-update-info/error-info :portkey.aws.iot.-2015-05-28.ota-update-info/last-modified-date :portkey.aws.iot.-2015-05-28.ota-update-info/ota-update-arn :portkey.aws.iot.-2015-05-28.ota-update-info/targets :portkey.aws.iot.-2015-05-28.ota-update-info/aws-iot-job-arn :portkey.aws.iot.-2015-05-28.ota-update-info/aws-iot-job-id :portkey.aws.iot.-2015-05-28.ota-update-info/description :portkey.aws.iot.-2015-05-28.ota-update-info/additional-parameters]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/signing-profile-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.effective-policy/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.effective-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.effective-policy/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/effective-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.effective-policy/policy-name :portkey.aws.iot.-2015-05-28.effective-policy/policy-arn :portkey.aws.iot.-2015-05-28.effective-policy/policy-document]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/registry-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/attribute-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/attribute-value (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attribute-value))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-request/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-request/next-token :portkey.aws.iot.-2015-05-28.list-things-request/max-results :portkey.aws.iot.-2015-05-28.list-things-request/attribute-name :portkey.aws.iot.-2015-05-28.list-things-request/attribute-value :portkey.aws.iot.-2015-05-28.list-things-request/thing-type-name]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/details-map (clojure.spec.alpha/map-of :portkey.aws.iot.-2015-05-28/details-key :portkey.aws.iot.-2015-05-28/details-value))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-endpoint-response/endpoint-address (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/endpoint-address))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.describe-endpoint-response/endpoint-address]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-request/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-request/authorizer-function-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-function-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-request/token-key-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/token-key-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-request/token-signing-public-keys (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/public-key-map))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-authorizer-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-authorizer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-authorizer-request/authorizer-name] :opt-un [:portkey.aws.iot.-2015-05-28.update-authorizer-request/authorizer-function-arn :portkey.aws.iot.-2015-05-28.update-authorizer-request/token-key-name :portkey.aws.iot.-2015-05-28.update-authorizer-request/token-signing-public-keys :portkey.aws.iot.-2015-05-28.update-authorizer-request/status]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.describe-thing-registration-task-request/task-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/task-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.describe-thing-registration-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/force-delete clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-indexing-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/recursive clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.audit-check-configuration/enabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/enabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-check-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.audit-check-configuration/enabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-thing-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-task-status #{"COMPLETED" "CANCELED" "IN_PROGRESS" :in-progress :completed :canceled "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/max-results (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/laser-max-results))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/thing-name] :opt-un [:portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/status :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/max-results :portkey.aws.iot.-2015-05-28.list-job-executions-for-thing-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/topic-rule-payload (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-rule-payload))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/replace-topic-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.replace-topic-rule-request/rule-name :portkey.aws.iot.-2015-05-28.replace-topic-rule-request/topic-rule-payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-action/bucket-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/bucket-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-action/key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/key))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.s-3-action/canned-acl (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/canned-access-control-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/s-3-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.s-3-action/role-arn :portkey.aws.iot.-2015-05-28.s-3-action/bucket-name :portkey.aws.iot.-2015-05-28.s-3-action/key] :opt-un [:portkey.aws.iot.-2015-05-28.s-3-action/canned-acl]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/queued-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/started-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/approximate-seconds-before-timed-out (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/approximate-seconds-before-timed-out))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/status-details (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-status-details))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/execution-number (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/execution-number))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-execution-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/last-updated-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/thing-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/version-number (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/version-number))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.job-execution/force-canceled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/forced))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.job-execution/queued-at :portkey.aws.iot.-2015-05-28.job-execution/started-at :portkey.aws.iot.-2015-05-28.job-execution/approximate-seconds-before-timed-out :portkey.aws.iot.-2015-05-28.job-execution/status-details :portkey.aws.iot.-2015-05-28.job-execution/execution-number :portkey.aws.iot.-2015-05-28.job-execution/status :portkey.aws.iot.-2015-05-28.job-execution/last-updated-at :portkey.aws.iot.-2015-05-28.job-execution/thing-arn :portkey.aws.iot.-2015-05-28.job-execution/job-id :portkey.aws.iot.-2015-05-28.job-execution/version-number :portkey.aws.iot.-2015-05-28.job-execution/force-canceled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.iot-analytics-action/channel-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.iot-analytics-action/channel-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/channel-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.iot-analytics-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/iot-analytics-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.iot-analytics-action/channel-arn :portkey.aws.iot.-2015-05-28.iot-analytics-action/channel-name :portkey.aws.iot.-2015-05-28.iot-analytics-action/role-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.security-profile-target-mapping/security-profile-identifier (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-identifier))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.security-profile-target-mapping/target (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/security-profile-target))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/security-profile-target-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.security-profile-target-mapping/security-profile-identifier :portkey.aws.iot.-2015-05-28.security-profile-target-mapping/target]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-authorizer-response/authorizer-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.set-default-authorizer-response/authorizer-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/authorizer-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/set-default-authorizer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.set-default-authorizer-response/authorizer-name :portkey.aws.iot.-2015-05-28.set-default-authorizer-response/authorizer-arn]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-registration-code-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/audit-notification-target-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-notification-target-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/audit-check-configurations (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-check-configurations))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/role-arn :portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/audit-notification-target-configurations :portkey.aws.iot.-2015-05-28.update-account-audit-configuration-request/audit-check-configurations]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/generation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/role-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/stream-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stream-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.kinesis-action/partition-key (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/partition-key))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/kinesis-action (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.kinesis-action/role-arn :portkey.aws.iot.-2015-05-28.kinesis-action/stream-name] :opt-un [:portkey.aws.iot.-2015-05-28.kinesis-action/partition-key]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate/certificate-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate/status (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ca-certificate-status))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.ca-certificate/creation-date (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/date-type))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/ca-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.ca-certificate/certificate-arn :portkey.aws.iot.-2015-05-28.ca-certificate/certificate-id :portkey.aws.iot.-2015-05-28.ca-certificate/status :portkey.aws.iot.-2015-05-28.ca-certificate/creation-date]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/query-max-results (clojure.spec.alpha/int-in 1 500))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-indexing-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/public-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__)))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/valid clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-response/things (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-attribute-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-things-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-things-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-things-response/things :portkey.aws.iot.-2015-05-28.list-things-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/policy-document))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-as-default))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-name :portkey.aws.iot.-2015-05-28.create-policy-version-request/policy-document] :opt-un [:portkey.aws.iot.-2015-05-28.create-policy-version-request/set-as-default]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-type-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/create-thing-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-name :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-arn :portkey.aws.iot.-2015-05-28.create-thing-type-response/thing-type-id]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.certificate-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/error-message))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/certificate-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.certificate-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/outgoing-certificates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/outgoing-certificates))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/next-marker (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/marker))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/outgoing-certificates :portkey.aws.iot.-2015-05-28.list-outgoing-certificates-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/audit-task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 40)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/thing-group-list (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/thing-group-name))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/payload-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/authorizer-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-arn (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-arn))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/topic-pattern (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/topic-pattern))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule-list-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-arn :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-name :portkey.aws.iot.-2015-05-28.topic-rule-list-item/topic-pattern :portkey.aws.iot.-2015-05-28.topic-rule-list-item/created-at :portkey.aws.iot.-2015-05-28.topic-rule-list-item/rule-disabled]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-role-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/is-authenticated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/firehose-separator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"([\n\t])|(\r\n)|(,)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.delete-role-alias-request/role-alias (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/role-alias))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-role-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.delete-role-alias-request/role-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/delete-ota-update-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-result/auth-info (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auth-info))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-result/allowed (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/allowed))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-result/denied (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/denied))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-result/auth-decision (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/auth-decision))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.auth-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/missing-context-values))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/auth-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.auth-result/auth-info :portkey.aws.iot.-2015-05-28.auth-result/allowed :portkey.aws.iot.-2015-05-28.auth-result/denied :portkey.aws.iot.-2015-05-28.auth-result/auth-decision :portkey.aws.iot.-2015-05-28.auth-result/missing-context-values]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/targets (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-targets))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/job-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/job-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/comment (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/comment))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/associate-targets-with-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/targets :portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/job-id] :opt-un [:portkey.aws.iot.-2015-05-28.associate-targets-with-job-request/comment]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-thing-response/certificate-pem (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/certificate-pem))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.register-thing-response/resource-arns (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/resource-arns))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/register-thing-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.register-thing-response/certificate-pem :portkey.aws.iot.-2015-05-28.register-thing-response/resource-arns]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-effective-policies-request/principal (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/principal))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-effective-policies-request/cognito-identity-pool-id (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cognito-identity-pool-id))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.get-effective-policies-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/get-effective-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.get-effective-policies-request/principal :portkey.aws.iot.-2015-05-28.get-effective-policies-request/cognito-identity-pool-id :portkey.aws.iot.-2015-05-28.get-effective-policies-request/thing-name]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ota-updates-response/ota-updates (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/ota-updates-summary))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.list-ota-updates-response/next-token (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/next-token))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/list-ota-updates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.list-ota-updates-response/ota-updates :portkey.aws.iot.-2015-05-28.list-ota-updates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/principals (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/principal-arn))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/validation-errors (clojure.spec.alpha/coll-of :portkey.aws.iot.-2015-05-28/validation-error))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/rule-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/rule-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/sql (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/sql))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/description (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/description))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/created-at (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/created-at-date))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/actions (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action-list))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/rule-disabled (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/is-disabled))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/aws-iot-sql-version (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/aws-iot-sql-version))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.topic-rule/error-action (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/action))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/topic-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot.-2015-05-28.topic-rule/rule-name :portkey.aws.iot.-2015-05-28.topic-rule/sql :portkey.aws.iot.-2015-05-28.topic-rule/description :portkey.aws.iot.-2015-05-28.topic-rule/created-at :portkey.aws.iot.-2015-05-28.topic-rule/actions :portkey.aws.iot.-2015-05-28.topic-rule/rule-disabled :portkey.aws.iot.-2015-05-28.topic-rule/aws-iot-sql-version :portkey.aws.iot.-2015-05-28.topic-rule/error-action]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/registration-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 64 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(0x)?[a-fA-F0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/frequency (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/audit-frequency))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/day-of-month (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-month))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/day-of-week (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/day-of-week))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/target-check-names (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/target-audit-check-names))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/scheduled-audit-name (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/scheduled-audit-name))
(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/update-scheduled-audit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/scheduled-audit-name] :opt-un [:portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/frequency :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/day-of-month :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/day-of-week :portkey.aws.iot.-2015-05-28.update-scheduled-audit-request/target-check-names]))

(clojure.spec.alpha/def :portkey.aws.iot.-2015-05-28/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__42949__auto__))))

(clojure.core/defn describe-audit-task ([describe-audit-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-audit-task-request describe-audit-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-audit-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/tasks/{taskId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-audit-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAuditTask", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-audit-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-audit-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-audit-task-response))

(clojure.core/defn update-role-alias ([update-role-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-role-alias-request update-role-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-role-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/role-aliases/{roleAlias}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-role-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRoleAlias", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-role-alias-response))

(clojure.core/defn get-ota-update ([get-ota-update-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-ota-update-request get-ota-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-ota-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/otaUpdates/{otaUpdateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-ota-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOTAUpdate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-ota-update :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-ota-update-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-ota-update-response))

(clojure.core/defn list-indices ([] (list-indices {})) ([list-indices-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-indices-request list-indices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-indices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/indices", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-indices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIndices", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-indices :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-indices-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-indices-response))

(clojure.core/defn list-policy-versions ([list-policy-versions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-policy-versions-request list-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}/version", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-policy-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicyVersions", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policy-versions-response))

(clojure.core/defn delete-policy-version ([delete-policy-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-policy-version-request delete-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}/version/{policyVersionId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-policy-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicyVersion", :http.request.spec/error-spec {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-role-alias ([create-role-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-role-alias-request create-role-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-role-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/role-aliases/{roleAlias}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-role-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRoleAlias", :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-role-alias-response))

(clojure.core/defn update-authorizer ([update-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-authorizer-request update-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizer/{authorizerName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-authorizer-response))

(clojure.core/defn attach-principal-policy ([attach-principal-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-attach-principal-policy-request attach-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/principal-policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/attach-principal-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachPrincipalPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef attach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-authorizers ([] (list-authorizers {})) ([list-authorizers-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-authorizers-request list-authorizers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-authorizers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizers/", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-authorizers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAuthorizers", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-authorizers :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-authorizers-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-authorizers-response))

(clojure.core/defn detach-policy ([detach-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-detach-policy-request detach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/target-policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/detach-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachPolicy", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-policy-request) :ret clojure.core/true?)

(clojure.core/defn search-index ([search-index-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-search-index-request search-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/search-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/indices/search", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/search-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchIndex", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidQueryException" :portkey.aws.iot.-2015-05-28/invalid-query-exception, "IndexNotReadyException" :portkey.aws.iot.-2015-05-28/index-not-ready-exception}})))))
(clojure.spec.alpha/fdef search-index :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/search-index-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/search-index-response))

(clojure.core/defn delete-job-execution ([delete-job-execution-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-job-execution-request delete-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/{jobId}/executionNumber/{executionNumber}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteJobExecution", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InvalidStateTransitionException" :portkey.aws.iot.-2015-05-28/invalid-state-transition-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-job-execution-request) :ret clojure.core/true?)

(clojure.core/defn list-certificates-by-ca ([list-certificates-by-ca-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-certificates-by-ca-request list-certificates-by-ca-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates-by-ca/{caCertificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCertificatesByCA", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-certificates-by-ca :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-certificates-by-ca-response))

(clojure.core/defn delete-stream ([delete-stream-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-stream-request delete-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-stream-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/streams/{streamId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-stream-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteStream", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-stream-response))

(clojure.core/defn get-policy-version ([get-policy-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-policy-version-request get-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}/version/{policyVersionId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-policy-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPolicyVersion", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-policy-version-response))

(clojure.core/defn cancel-certificate-transfer ([cancel-certificate-transfer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-certificate-transfer-request cancel-certificate-transfer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cancel-certificate-transfer/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelCertificateTransfer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef cancel-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/cancel-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-job-document ([get-job-document-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-job-document-request get-job-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-job-document-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}/job-document", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-job-document-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobDocument", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-job-document :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-job-document-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-job-document-response))

(clojure.core/defn set-v-2-logging-options ([] (set-v-2-logging-options {})) ([set-v-2-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-v-2-logging-options-request set-v-2-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v2LoggingOptions", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/set-v-2-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetV2LoggingOptions", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-v-2-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/set-v-2-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn update-indexing-configuration ([] (update-indexing-configuration {})) ([update-indexing-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-indexing-configuration-request update-indexing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-indexing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/indexing/config", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-indexing-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateIndexingConfiguration", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-indexing-configuration :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/update-indexing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-indexing-configuration-response))

(clojure.core/defn create-authorizer ([create-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-authorizer-request create-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizer/{authorizerName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAuthorizer", :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-authorizer-response))

(clojure.core/defn list-scheduled-audits ([] (list-scheduled-audits {})) ([list-scheduled-audits-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-scheduled-audits-request list-scheduled-audits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-scheduled-audits-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/scheduledaudits", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-scheduled-audits-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListScheduledAudits", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-scheduled-audits :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-scheduled-audits-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-scheduled-audits-response))

(clojure.core/defn list-ca-certificates ([] (list-ca-certificates {})) ([list-ca-certificates-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-ca-certificates-request list-ca-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-ca-certificates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cacertificates", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-ca-certificates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCACertificates", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-ca-certificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-ca-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-ca-certificates-response))

(clojure.core/defn create-ota-update ([create-ota-update-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-ota-update-request create-ota-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-ota-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/otaUpdates/{otaUpdateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-ota-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateOTAUpdate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-ota-update :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-ota-update-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-ota-update-response))

(clojure.core/defn list-violation-events ([list-violation-events-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-violation-events-request list-violation-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-violation-events-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/violation-events", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-violation-events-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListViolationEvents", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-violation-events :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-violation-events-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-violation-events-response))

(clojure.core/defn list-v-2-logging-levels ([] (list-v-2-logging-levels {})) ([list-v-2-logging-levels-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-v-2-logging-levels-request list-v-2-logging-levels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v2LoggingLevel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListV2LoggingLevels", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "NotConfiguredException" :portkey.aws.iot.-2015-05-28/not-configured-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-v-2-logging-levels :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-v-2-logging-levels-response))

(clojure.core/defn list-security-profiles ([] (list-security-profiles {})) ([list-security-profiles-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-security-profiles-request list-security-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-security-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-security-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSecurityProfiles", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-security-profiles :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-security-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-security-profiles-response))

(clojure.core/defn create-thing ([create-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-thing-request create-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateThing", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-thing-response))

(clojure.core/defn delete-account-audit-configuration ([] (delete-account-audit-configuration {})) ([delete-account-audit-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-account-audit-configuration-request delete-account-audit-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/configuration", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAccountAuditConfiguration", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account-audit-configuration :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-account-audit-configuration-response))

(clojure.core/defn delete-scheduled-audit ([delete-scheduled-audit-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-scheduled-audit-request delete-scheduled-audit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/scheduledaudits/{scheduledAuditName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteScheduledAudit", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-scheduled-audit :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-scheduled-audit-response))

(clojure.core/defn update-event-configurations ([] (update-event-configurations {})) ([update-event-configurations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-event-configurations-request update-event-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-event-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/event-configurations", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-event-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEventConfigurations", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception}})))))
(clojure.spec.alpha/fdef update-event-configurations :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/update-event-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-event-configurations-response))

(clojure.core/defn create-topic-rule ([create-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-topic-rule-request create-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTopicRule", :http.request.spec/error-spec {"SqlParseException" :portkey.aws.iot.-2015-05-28/sql-parse-exception, "InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn accept-certificate-transfer ([accept-certificate-transfer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-accept-certificate-transfer-request accept-certificate-transfer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/accept-certificate-transfer/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptCertificateTransfer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef accept-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/accept-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn get-registration-code ([] (get-registration-code {})) ([get-registration-code-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-registration-code-request get-registration-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-registration-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/registrationcode", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-registration-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRegistrationCode", :http.request.spec/error-spec {"ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-registration-code-response))

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicies", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policies-response))

(clojure.core/defn list-thing-registration-task-reports ([list-thing-registration-task-reports-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-registration-task-reports-request list-thing-registration-task-reports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-registration-tasks/{taskId}/reports", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingRegistrationTaskReports", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-thing-registration-task-reports :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-registration-task-reports-response))

(clojure.core/defn set-v-2-logging-level ([set-v-2-logging-level-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-v-2-logging-level-request set-v-2-logging-level-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v2LoggingLevel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/set-v-2-logging-level-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetV2LoggingLevel", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "NotConfiguredException" :portkey.aws.iot.-2015-05-28/not-configured-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-v-2-logging-level :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-v-2-logging-level-request) :ret clojure.core/true?)

(clojure.core/defn delete-registration-code ([] (delete-registration-code {})) ([delete-registration-code-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-registration-code-request delete-registration-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-registration-code-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/registrationcode", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-registration-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRegistrationCode", :http.request.spec/error-spec {"ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-registration-code :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/delete-registration-code-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-registration-code-response))

(clojure.core/defn describe-ca-certificate ([describe-ca-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-ca-certificate-request describe-ca-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-ca-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cacertificate/{caCertificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-ca-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCACertificate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-ca-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-ca-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-ca-certificate-response))

(clojure.core/defn detach-thing-principal ([detach-thing-principal-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-detach-thing-principal-request detach-thing-principal-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/detach-thing-principal-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/principals", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/detach-thing-principal-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachThingPrincipal", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef detach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/detach-thing-principal-response))

(clojure.core/defn create-security-profile ([create-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-security-profile-request create-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-security-profile-response))

(clojure.core/defn list-thing-registration-tasks ([] (list-thing-registration-tasks {})) ([list-thing-registration-tasks-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-registration-tasks-request list-thing-registration-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-registration-tasks", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingRegistrationTasks", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-thing-registration-tasks :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-registration-tasks-response))

(clojure.core/defn associate-targets-with-job ([associate-targets-with-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-associate-targets-with-job-request associate-targets-with-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/associate-targets-with-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}/targets", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/associate-targets-with-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateTargetsWithJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef associate-targets-with-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/associate-targets-with-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/associate-targets-with-job-response))

(clojure.core/defn get-indexing-configuration ([] (get-indexing-configuration {})) ([get-indexing-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-indexing-configuration-request get-indexing-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-indexing-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/indexing/config", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-indexing-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIndexingConfiguration", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-indexing-configuration :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-indexing-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-indexing-configuration-response))

(clojure.core/defn cancel-job-execution ([cancel-job-execution-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-job-execution-request cancel-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/{jobId}/cancel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/cancel-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelJobExecution", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InvalidStateTransitionException" :portkey.aws.iot.-2015-05-28/invalid-state-transition-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception}})))))
(clojure.spec.alpha/fdef cancel-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/cancel-job-execution-request) :ret clojure.core/true?)

(clojure.core/defn list-outgoing-certificates ([] (list-outgoing-certificates {})) ([list-outgoing-certificates-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-outgoing-certificates-request list-outgoing-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates-out-going", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOutgoingCertificates", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-outgoing-certificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-outgoing-certificates-response))

(clojure.core/defn start-thing-registration-task ([start-thing-registration-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-thing-registration-task-request start-thing-registration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/start-thing-registration-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-registration-tasks", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/start-thing-registration-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartThingRegistrationTask", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef start-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/start-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/start-thing-registration-task-response))

(clojure.core/defn update-account-audit-configuration ([] (update-account-audit-configuration {})) ([update-account-audit-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-account-audit-configuration-request update-account-audit-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/configuration", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAccountAuditConfiguration", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-account-audit-configuration :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-account-audit-configuration-response))

(clojure.core/defn list-streams ([] (list-streams {})) ([list-streams-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-streams-request list-streams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-streams-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/streams", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-streams-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreams", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-streams :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-streams-response))

(clojure.core/defn list-thing-groups-for-thing ([list-thing-groups-for-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-groups-for-thing-request list-thing-groups-for-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/thing-groups", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingGroupsForThing", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-thing-groups-for-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-groups-for-thing-response))

(clojure.core/defn delete-v-2-logging-level ([delete-v-2-logging-level-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-v-2-logging-level-request delete-v-2-logging-level-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v2LoggingLevel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-v-2-logging-level-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteV2LoggingLevel", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-v-2-logging-level :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-v-2-logging-level-request) :ret clojure.core/true?)

(clojure.core/defn delete-ca-certificate ([delete-ca-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-ca-certificate-request delete-ca-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-ca-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cacertificate/{caCertificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-ca-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCACertificate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-ca-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-ca-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-ca-certificate-response))

(clojure.core/defn list-principal-things ([list-principal-things-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-principal-things-request list-principal-things-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-principal-things-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/principals/things", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-principal-things-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPrincipalThings", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-principal-things :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-principal-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-principal-things-response))

(clojure.core/defn test-invoke-authorizer ([test-invoke-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-test-invoke-authorizer-request test-invoke-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizer/{authorizerName}/test", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestInvokeAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "InvalidResponseException" :portkey.aws.iot.-2015-05-28/invalid-response-exception}})))))
(clojure.spec.alpha/fdef test-invoke-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/test-invoke-authorizer-response))

(clojure.core/defn describe-account-audit-configuration ([] (describe-account-audit-configuration {})) ([describe-account-audit-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-account-audit-configuration-request describe-account-audit-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/configuration", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountAuditConfiguration", :http.request.spec/error-spec {"ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-account-audit-configuration :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-account-audit-configuration-response))

(clojure.core/defn delete-role-alias ([delete-role-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-role-alias-request delete-role-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-role-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/role-aliases/{roleAlias}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-role-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRoleAlias", :http.request.spec/error-spec {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-role-alias-response))

(clojure.core/defn list-audit-findings ([] (list-audit-findings {})) ([list-audit-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-audit-findings-request list-audit-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-audit-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/findings", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-audit-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAuditFindings", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-audit-findings :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-audit-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-audit-findings-response))

(clojure.core/defn create-policy-version ([create-policy-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-policy-version-request create-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}/version", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-policy-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePolicyVersion", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "MalformedPolicyException" :portkey.aws.iot.-2015-05-28/malformed-policy-exception, "VersionsLimitExceededException" :portkey.aws.iot.-2015-05-28/versions-limit-exceeded-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-policy-version-response))

(clojure.core/defn list-role-aliases ([] (list-role-aliases {})) ([list-role-aliases-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-role-aliases-request list-role-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-role-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/role-aliases", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-role-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRoleAliases", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-role-aliases :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-role-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-role-aliases-response))

(clojure.core/defn describe-job ([describe-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-job-request describe-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-job-response))

(clojure.core/defn describe-endpoint ([] (describe-endpoint {})) ([describe-endpoint-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-endpoint-request describe-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/endpoint", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-endpoint-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpoint", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/describe-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-endpoint-response))

(clojure.core/defn list-ota-updates ([] (list-ota-updates {})) ([list-ota-updates-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-ota-updates-request list-ota-updates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-ota-updates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/otaUpdates", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-ota-updates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOTAUpdates", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-ota-updates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-ota-updates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-ota-updates-response))

(clojure.core/defn register-certificate ([register-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-register-certificate-request register-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/register-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificate/register", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/register-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterCertificate", :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot.-2015-05-28/certificate-validation-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "CertificateConflictException" :portkey.aws.iot.-2015-05-28/certificate-conflict-exception}})))))
(clojure.spec.alpha/fdef register-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/register-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/register-certificate-response))

(clojure.core/defn list-job-executions-for-job ([list-job-executions-for-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-job-executions-for-job-request list-job-executions-for-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}/things", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobExecutionsForJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-job-executions-for-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-job-executions-for-job-response))

(clojure.core/defn describe-thing-group ([describe-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-thing-group-request describe-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/{thingGroupName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-group-response))

(clojure.core/defn list-security-profiles-for-target ([list-security-profiles-for-target-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-security-profiles-for-target-request list-security-profiles-for-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles-for-target", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSecurityProfilesForTarget", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-security-profiles-for-target :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-security-profiles-for-target-response))

(clojure.core/defn list-job-executions-for-thing ([list-job-executions-for-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-job-executions-for-thing-request list-job-executions-for-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobExecutionsForThing", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-job-executions-for-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-job-executions-for-thing-response))

(clojure.core/defn register-thing ([register-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-register-thing-request register-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/register-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/register-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterThing", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ConflictingResourceUpdateException" :portkey.aws.iot.-2015-05-28/conflicting-resource-update-exception, "ResourceRegistrationFailureException" :portkey.aws.iot.-2015-05-28/resource-registration-failure-exception}})))))
(clojure.spec.alpha/fdef register-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/register-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/register-thing-response))

(clojure.core/defn delete-ota-update ([delete-ota-update-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-ota-update-request delete-ota-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-ota-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/otaUpdates/{otaUpdateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-ota-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteOTAUpdate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-ota-update :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-ota-update-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-ota-update-response))

(clojure.core/defn update-stream ([update-stream-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-stream-request update-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-stream-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/streams/{streamId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-stream-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStream", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-stream-response))

(clojure.core/defn update-thing-group ([update-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-thing-group-request update-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/{thingGroupName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-thing-group-response))

(clojure.core/defn describe-index ([describe-index-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-index-request describe-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/indices/{indexName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeIndex", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-index :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-index-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-index-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-policy-response))

(clojure.core/defn cancel-audit-task ([cancel-audit-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-audit-task-request cancel-audit-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/cancel-audit-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/tasks/{taskId}/cancel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/cancel-audit-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelAuditTask", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef cancel-audit-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/cancel-audit-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cancel-audit-task-response))

(clojure.core/defn delete-security-profile ([delete-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-security-profile-request delete-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-security-profile-response))

(clojure.core/defn enable-topic-rule ([enable-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-enable-topic-rule-request enable-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}/enable", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/enable-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableTopicRule", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception}})))))
(clojure.spec.alpha/fdef enable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/enable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn deprecate-thing-type ([deprecate-thing-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-deprecate-thing-type-request deprecate-thing-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-types/{thingTypeName}/deprecate", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeprecateThingType", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef deprecate-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/deprecate-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/deprecate-thing-type-response))

(clojure.core/defn list-targets-for-security-profile ([list-targets-for-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-targets-for-security-profile-request list-targets-for-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}/targets", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTargetsForSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-targets-for-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-targets-for-security-profile-response))

(clojure.core/defn delete-thing-type ([delete-thing-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-thing-type-request delete-thing-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-thing-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-types/{thingTypeName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-thing-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteThingType", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-thing-type-response))

(clojure.core/defn list-thing-groups ([] (list-thing-groups {})) ([list-thing-groups-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-groups-request list-thing-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-groups-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-groups-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingGroups", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-thing-groups :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-thing-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-groups-response))

(clojure.core/defn list-targets-for-policy ([list-targets-for-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-targets-for-policy-request list-targets-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-targets-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policy-targets/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-targets-for-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTargetsForPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-targets-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-targets-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-targets-for-policy-response))

(clojure.core/defn replace-topic-rule ([replace-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-replace-topic-rule-request replace-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/replace-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "ReplaceTopicRule", :http.request.spec/error-spec {"SqlParseException" :portkey.aws.iot.-2015-05-28/sql-parse-exception, "InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception}})))))
(clojure.spec.alpha/fdef replace-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/replace-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn get-topic-rule ([get-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-topic-rule-request get-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-topic-rule-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTopicRule", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception}})))))
(clojure.spec.alpha/fdef get-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/get-topic-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-topic-rule-response))

(clojure.core/defn attach-security-profile ([attach-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-attach-security-profile-request attach-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/attach-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}/targets", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/attach-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef attach-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attach-security-profile-response))

(clojure.core/defn reject-certificate-transfer ([reject-certificate-transfer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-reject-certificate-transfer-request reject-certificate-transfer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/reject-certificate-transfer/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "RejectCertificateTransfer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "TransferAlreadyCompletedException" :portkey.aws.iot.-2015-05-28/transfer-already-completed-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef reject-certificate-transfer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/reject-certificate-transfer-request) :ret clojure.core/true?)

(clojure.core/defn remove-thing-from-thing-group ([] (remove-thing-from-thing-group {})) ([remove-thing-from-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-remove-thing-from-thing-group-request remove-thing-from-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/removeThingFromThingGroup", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveThingFromThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef remove-thing-from-thing-group :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/remove-thing-from-thing-group-response))

(clojure.core/defn delete-authorizer ([delete-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-authorizer-request delete-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizer/{authorizerName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAuthorizer", :http.request.spec/error-spec {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-authorizer-response))

(clojure.core/defn delete-thing ([delete-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-thing-request delete-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteThing", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-thing-response))

(clojure.core/defn get-v-2-logging-options ([] (get-v-2-logging-options {})) ([get-v-2-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-v-2-logging-options-request get-v-2-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v2LoggingOptions", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetV2LoggingOptions", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "NotConfiguredException" :portkey.aws.iot.-2015-05-28/not-configured-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-v-2-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-v-2-logging-options-response))

(clojure.core/defn list-certificates ([] (list-certificates {})) ([list-certificates-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-certificates-request list-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-certificates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-certificates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCertificates", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-certificates :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-certificates-response))

(clojure.core/defn list-thing-types ([] (list-thing-types {})) ([list-thing-types-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-types-request list-thing-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-types", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingTypes", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-thing-types :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-thing-types-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-types-response))

(clojure.core/defn detach-security-profile ([detach-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-detach-security-profile-request detach-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/detach-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}/targets", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/detach-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef detach-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/detach-security-profile-response))

(clojure.core/defn describe-thing ([describe-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-thing-request describe-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeThing", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-response))

(clojure.core/defn list-policy-principals ([list-policy-principals-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-policy-principals-request list-policy-principals-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-policy-principals-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policy-principals", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-policy-principals-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicyPrincipals", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-policy-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-policy-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-policy-principals-response))

(clojure.core/defn update-security-profile ([update-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-security-profile-request update-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-security-profile-response))

(clojure.core/defn validate-security-profile-behaviors ([validate-security-profile-behaviors-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-validate-security-profile-behaviors-request validate-security-profile-behaviors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profile-behaviors/validate", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ValidateSecurityProfileBehaviors", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef validate-security-profile-behaviors :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/validate-security-profile-behaviors-response))

(clojure.core/defn create-scheduled-audit ([create-scheduled-audit-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-scheduled-audit-request create-scheduled-audit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-scheduled-audit-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/scheduledaudits/{scheduledAuditName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-scheduled-audit-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateScheduledAudit", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-scheduled-audit :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-scheduled-audit-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-scheduled-audit-response))

(clojure.core/defn set-default-policy-version ([set-default-policy-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-default-policy-version-request set-default-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}/version/{policyVersionId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/set-default-policy-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "SetDefaultPolicyVersion", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePolicy", :http.request.spec/error-spec {"ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "MalformedPolicyException" :portkey.aws.iot.-2015-05-28/malformed-policy-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-policy-response))

(clojure.core/defn describe-thing-type ([describe-thing-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-thing-type-request describe-thing-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-thing-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-types/{thingTypeName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-thing-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeThingType", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-type-response))

(clojure.core/defn attach-thing-principal ([attach-thing-principal-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-attach-thing-principal-request attach-thing-principal-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/attach-thing-principal-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/principals", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/attach-thing-principal-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachThingPrincipal", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef attach-thing-principal :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-thing-principal-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/attach-thing-principal-response))

(clojure.core/defn delete-thing-group ([delete-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-thing-group-request delete-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/delete-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/{thingGroupName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/delete-thing-group-response))

(clojure.core/defn list-attached-policies ([list-attached-policies-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-attached-policies-request list-attached-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-attached-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/attached-policies/{target}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-attached-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttachedPolicies", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-attached-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-attached-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-attached-policies-response))

(clojure.core/defn create-keys-and-certificate ([] (create-keys-and-certificate {})) ([create-keys-and-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-keys-and-certificate-request create-keys-and-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/keys-and-certificate", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateKeysAndCertificate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-keys-and-certificate :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-keys-and-certificate-response))

(clojure.core/defn create-job ([create-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-job-request create-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-job-response))

(clojure.core/defn describe-authorizer ([describe-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-authorizer-request describe-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/authorizer/{authorizerName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-authorizer-response))

(clojure.core/defn register-ca-certificate ([register-ca-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-register-ca-certificate-request register-ca-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/register-ca-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cacertificate", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/register-ca-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterCACertificate", :http.request.spec/error-spec {"UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "CertificateValidationException" :portkey.aws.iot.-2015-05-28/certificate-validation-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "RegistrationCodeValidationException" :portkey.aws.iot.-2015-05-28/registration-code-validation-exception}})))))
(clojure.spec.alpha/fdef register-ca-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/register-ca-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/register-ca-certificate-response))

(clojure.core/defn delete-job ([delete-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-job-request delete-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InvalidStateTransitionException" :portkey.aws.iot.-2015-05-28/invalid-state-transition-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-job-request) :ret clojure.core/true?)

(clojure.core/defn start-on-demand-audit-task ([start-on-demand-audit-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-on-demand-audit-task-request start-on-demand-audit-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/tasks", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartOnDemandAuditTask", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-on-demand-audit-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/start-on-demand-audit-task-response))

(clojure.core/defn describe-event-configurations ([] (describe-event-configurations {})) ([describe-event-configurations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-event-configurations-request describe-event-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-event-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/event-configurations", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-event-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventConfigurations", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-event-configurations :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/describe-event-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-event-configurations-response))

(clojure.core/defn disable-topic-rule ([disable-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-disable-topic-rule-request disable-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}/disable", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/disable-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableTopicRule", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception}})))))
(clojure.spec.alpha/fdef disable-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/disable-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-thing-registration-task ([describe-thing-registration-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-thing-registration-task-request describe-thing-registration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-registration-tasks/{taskId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeThingRegistrationTask", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-thing-registration-task-response))

(clojure.core/defn list-topic-rules ([] (list-topic-rules {})) ([list-topic-rules-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-topic-rules-request list-topic-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-topic-rules-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-topic-rules-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTopicRules", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-topic-rules :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-topic-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-topic-rules-response))

(clojure.core/defn list-active-violations ([] (list-active-violations {})) ([list-active-violations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-active-violations-request list-active-violations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-active-violations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/active-violations", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-active-violations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListActiveViolations", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-active-violations :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-active-violations-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-active-violations-response))

(clojure.core/defn update-scheduled-audit ([update-scheduled-audit-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-scheduled-audit-request update-scheduled-audit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-scheduled-audit-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/scheduledaudits/{scheduledAuditName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-scheduled-audit-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateScheduledAudit", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-scheduled-audit :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-scheduled-audit-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-scheduled-audit-response))

(clojure.core/defn detach-principal-policy ([detach-principal-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-detach-principal-policy-request detach-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/principal-policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/detach-principal-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachPrincipalPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef detach-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/detach-principal-policy-request) :ret clojure.core/true?)

(clojure.core/defn create-stream ([create-stream-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-stream-request create-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-stream-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/streams/{streamId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-stream-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateStream", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-stream-response))

(clojure.core/defn update-ca-certificate ([update-ca-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-ca-certificate-request update-ca-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cacertificate/{caCertificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-ca-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCACertificate", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-ca-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-ca-certificate-request) :ret clojure.core/true?)

(clojure.core/defn describe-scheduled-audit ([describe-scheduled-audit-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-scheduled-audit-request describe-scheduled-audit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/scheduledaudits/{scheduledAuditName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScheduledAudit", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-scheduled-audit :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-scheduled-audit-response))

(clojure.core/defn describe-security-profile ([describe-security-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-security-profile-request describe-security-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-security-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/security-profiles/{securityProfileName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-security-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSecurityProfile", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-security-profile :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-security-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-security-profile-response))

(clojure.core/defn delete-topic-rule ([delete-topic-rule-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-topic-rule-request delete-topic-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rules/{ruleName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-topic-rule-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTopicRule", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception}})))))
(clojure.spec.alpha/fdef delete-topic-rule :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-topic-rule-request) :ret clojure.core/true?)

(clojure.core/defn describe-stream ([describe-stream-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-stream-request describe-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-stream-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/streams/{streamId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-stream-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStream", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-stream :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-stream-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-stream-response))

(clojure.core/defn describe-certificate ([describe-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-certificate-request describe-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCertificate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-certificate-response))

(clojure.core/defn set-logging-options ([set-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-logging-options-request set-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/loggingOptions", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/set-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetLoggingOptions", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef set-logging-options :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-logging-options-request) :ret clojure.core/true?)

(clojure.core/defn test-authorization ([test-authorization-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-test-authorization-request test-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/test-authorization-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/test-authorization", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/test-authorization-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestAuthorization", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef test-authorization :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/test-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/test-authorization-response))

(clojure.core/defn describe-default-authorizer ([] (describe-default-authorizer {})) ([describe-default-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-default-authorizer-request describe-default-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-default-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/default-authorizer", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-default-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDefaultAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef describe-default-authorizer :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/describe-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-default-authorizer-response))

(clojure.core/defn attach-policy ([attach-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-attach-policy-request attach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/target-policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/attach-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/attach-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-job-execution ([describe-job-execution-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-job-execution-request describe-job-execution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-job-execution-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/jobs/{jobId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-job-execution-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJobExecution", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-job-execution :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-job-execution-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-job-execution-response))

(clojure.core/defn update-thing-groups-for-thing ([] (update-thing-groups-for-thing {})) ([update-thing-groups-for-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-thing-groups-for-thing-request update-thing-groups-for-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/updateThingGroupsForThing", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateThingGroupsForThing", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-thing-groups-for-thing :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-thing-groups-for-thing-response))

(clojure.core/defn list-thing-principals ([list-thing-principals-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-thing-principals-request list-thing-principals-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-thing-principals-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}/principals", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-thing-principals-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingPrincipals", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-thing-principals :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-thing-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-thing-principals-response))

(clojure.core/defn stop-thing-registration-task ([stop-thing-registration-task-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-stop-thing-registration-task-request stop-thing-registration-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-registration-tasks/{taskId}/cancel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "StopThingRegistrationTask", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-thing-registration-task :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/stop-thing-registration-task-response))

(clojure.core/defn list-principal-policies ([list-principal-policies-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-principal-policies-request list-principal-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-principal-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/principal-policies", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-principal-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPrincipalPolicies", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-principal-policies :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-principal-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-principal-policies-response))

(clojure.core/defn describe-role-alias ([describe-role-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-role-alias-request describe-role-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/describe-role-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/role-aliases/{roleAlias}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/describe-role-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRoleAlias", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-role-alias :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/describe-role-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/describe-role-alias-response))

(clojure.core/defn transfer-certificate ([transfer-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-transfer-certificate-request transfer-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/transfer-certificate-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/transfer-certificate/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/transfer-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "TransferCertificate", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "TransferConflictException" :portkey.aws.iot.-2015-05-28/transfer-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef transfer-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/transfer-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/transfer-certificate-response))

(clojure.core/defn list-audit-tasks ([list-audit-tasks-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-audit-tasks-request list-audit-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-audit-tasks-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/audit/tasks", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-audit-tasks-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAuditTasks", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-audit-tasks :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-audit-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-audit-tasks-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicy", :http.request.spec/error-spec {"DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-thing ([update-thing-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-thing-request update-thing-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/update-thing-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things/{thingName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-thing-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateThing", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "VersionConflictException" :portkey.aws.iot.-2015-05-28/version-conflict-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-thing :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-thing-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/update-thing-response))

(clojure.core/defn delete-certificate ([delete-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-certificate-request delete-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/delete-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCertificate", :http.request.spec/error-spec {"CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "DeleteConflictException" :portkey.aws.iot.-2015-05-28/delete-conflict-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/delete-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-logging-options ([] (get-logging-options {})) ([get-logging-options-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-logging-options-request get-logging-options-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-logging-options-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/loggingOptions", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-logging-options-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoggingOptions", :http.request.spec/error-spec {"InternalException" :portkey.aws.iot.-2015-05-28/internal-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-logging-options :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-logging-options-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-logging-options-response))

(clojure.core/defn create-thing-group ([create-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-thing-group-request create-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/{thingGroupName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-thing-group-response))

(clojure.core/defn clear-default-authorizer ([] (clear-default-authorizer {})) ([clear-default-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-clear-default-authorizer-request clear-default-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/clear-default-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/default-authorizer", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/clear-default-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "ClearDefaultAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef clear-default-authorizer :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/clear-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/clear-default-authorizer-response))

(clojure.core/defn add-thing-to-thing-group ([] (add-thing-to-thing-group {})) ([add-thing-to-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-add-thing-to-thing-group-request add-thing-to-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/addThingToThingGroup", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AddThingToThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef add-thing-to-thing-group :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/add-thing-to-thing-group-response))

(clojure.core/defn get-effective-policies ([] (get-effective-policies {})) ([get-effective-policies-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-effective-policies-request get-effective-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/get-effective-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/effective-policies", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/get-effective-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetEffectivePolicies", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "LimitExceededException" :portkey.aws.iot.-2015-05-28/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-effective-policies :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/get-effective-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/get-effective-policies-response))

(clojure.core/defn list-things-in-thing-group ([list-things-in-thing-group-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-things-in-thing-group-request list-things-in-thing-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-groups/{thingGroupName}/things", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThingsInThingGroup", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-things-in-thing-group :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-things-in-thing-group-response))

(clojure.core/defn create-thing-type ([create-thing-type-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-thing-type-request create-thing-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-thing-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/thing-types/{thingTypeName}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-thing-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateThingType", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-thing-type :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-thing-type-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-thing-type-response))

(clojure.core/defn set-default-authorizer ([set-default-authorizer-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-set-default-authorizer-request set-default-authorizer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/set-default-authorizer-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/default-authorizer", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/set-default-authorizer-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetDefaultAuthorizer", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception, "ResourceAlreadyExistsException" :portkey.aws.iot.-2015-05-28/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef set-default-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/set-default-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/set-default-authorizer-response))

(clojure.core/defn update-certificate ([update-certificate-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-certificate-request update-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates/{certificateId}", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/update-certificate-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCertificate", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "CertificateStateException" :portkey.aws.iot.-2015-05-28/certificate-state-exception, "InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef update-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/update-certificate-request) :ret clojure.core/true?)

(clojure.core/defn create-certificate-from-csr ([create-certificate-from-csr-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-certificate-from-csr-request create-certificate-from-csr-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/certificates", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCertificateFromCsr", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef create-certificate-from-csr :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/create-certificate-from-csr-response))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-jobs-response))

(clojure.core/defn list-things ([] (list-things {})) ([list-things-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-things-request list-things-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/list-things-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/things", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/list-things-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListThings", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "UnauthorizedException" :portkey.aws.iot.-2015-05-28/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot.-2015-05-28/internal-failure-exception}})))))
(clojure.spec.alpha/fdef list-things :args (clojure.spec.alpha/? :portkey.aws.iot.-2015-05-28/list-things-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/list-things-response))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.iot.-2015-05-28/endpoints, :http.request.spec/output-spec :portkey.aws.iot.-2015-05-28/cancel-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/jobs/{jobId}/cancel", :http.request.configuration/version "2015-05-28", :http.request.configuration/service-id "IoT", :http.request.spec/input-spec :portkey.aws.iot.-2015-05-28/cancel-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelJob", :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.iot.-2015-05-28/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot.-2015-05-28/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot.-2015-05-28/throttling-exception, "ServiceUnavailableException" :portkey.aws.iot.-2015-05-28/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.iot.-2015-05-28/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.iot.-2015-05-28/cancel-job-response))
