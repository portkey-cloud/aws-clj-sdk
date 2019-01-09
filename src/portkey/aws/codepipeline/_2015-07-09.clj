(ns portkey.aws.codepipeline.-2015-07-09 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codepipeline", :region "ap-northeast-1"},
    :ssl-common-name "codepipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codepipeline", :region "eu-west-1"},
    :ssl-common-name "codepipeline.eu-west-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codepipeline", :region "us-east-2"},
    :ssl-common-name "codepipeline.us-east-2.amazonaws.com",
    :endpoint "https://codepipeline.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codepipeline", :region "ap-southeast-2"},
    :ssl-common-name "codepipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codepipeline", :region "sa-east-1"},
    :ssl-common-name "codepipeline.sa-east-1.amazonaws.com",
    :endpoint "https://codepipeline.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codepipeline", :region "ap-southeast-1"},
    :ssl-common-name "codepipeline.ap-southeast-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codepipeline", :region "ap-northeast-2"},
    :ssl-common-name "codepipeline.ap-northeast-2.amazonaws.com",
    :endpoint "https://codepipeline.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codepipeline", :region "eu-west-3"},
    :ssl-common-name "codepipeline.eu-west-3.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "codepipeline", :region "ca-central-1"},
    :ssl-common-name "codepipeline.ca-central-1.amazonaws.com",
    :endpoint "https://codepipeline.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "codepipeline", :region "eu-central-1"},
    :ssl-common-name "codepipeline.eu-central-1.amazonaws.com",
    :endpoint "https://codepipeline.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codepipeline", :region "eu-west-2"},
    :ssl-common-name "codepipeline.eu-west-2.amazonaws.com",
    :endpoint "https://codepipeline.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codepipeline", :region "us-west-2"},
    :ssl-common-name "codepipeline.us-west-2.amazonaws.com",
    :endpoint "https://codepipeline.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codepipeline", :region "us-east-1"},
    :ssl-common-name "codepipeline.us-east-1.amazonaws.com",
    :endpoint "https://codepipeline.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codepipeline", :region "us-west-1"},
    :ssl-common-name "codepipeline.us-west-1.amazonaws.com",
    :endpoint "https://codepipeline.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codepipeline", :region "ap-south-1"},
    :ssl-common-name "codepipeline.ap-south-1.amazonaws.com",
    :endpoint "https://codepipeline.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-webhook-auth-configuration)

(clojure.core/declare ser-action-category)

(clojure.core/declare ser-artifact-store-type)

(clojure.core/declare ser-action-type-id)

(clojure.core/declare ser-max-batch-size)

(clojure.core/declare ser-input-artifact)

(clojure.core/declare ser-action-configuration-queryable-value)

(clojure.core/declare ser-action-configuration-key)

(clojure.core/declare ser-encryption-key-type)

(clojure.core/declare ser-pipeline-execution-id)

(clojure.core/declare ser-artifact-store)

(clojure.core/declare ser-revision-summary)

(clojure.core/declare ser-webhook-auth-configuration-allowed-ip-range)

(clojure.core/declare ser-encryption-key-id)

(clojure.core/declare ser-webhook-authentication-type)

(clojure.core/declare ser-webhook-auth-configuration-secret-token)

(clojure.core/declare ser-execution-details)

(clojure.core/declare ser-disabled-reason)

(clojure.core/declare ser-action-owner)

(clojure.core/declare ser-approval-token)

(clojure.core/declare ser-pipeline-name)

(clojure.core/declare ser-json-path)

(clojure.core/declare ser-action-provider)

(clojure.core/declare ser-action-configuration-property-type)

(clojure.core/declare ser-action-revision)

(clojure.core/declare ser-output-artifact)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-approval-status)

(clojure.core/declare ser-blocker-name)

(clojure.core/declare ser-third-party-job-id)

(clojure.core/declare ser-stage-transition-type)

(clojure.core/declare ser-maximum-artifact-count)

(clojure.core/declare ser-stage-blocker-declaration-list)

(clojure.core/declare ser-approval-result)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-blocker-type)

(clojure.core/declare ser-webhook-filters)

(clojure.core/declare ser-match-equals)

(clojure.core/declare ser-pipeline-declaration)

(clojure.core/declare ser-action-run-order)

(clojure.core/declare ser-revision)

(clojure.core/declare ser-output-artifact-list)

(clojure.core/declare ser-execution-summary)

(clojure.core/declare ser-execution-id)

(clojure.core/declare ser-url)

(clojure.core/declare ser-description)

(clojure.core/declare ser-message)

(clojure.core/declare ser-webhook-filter-rule)

(clojure.core/declare ser-failure-details)

(clojure.core/declare ser-action-configuration-value)

(clojure.core/declare ser-revision-change-identifier)

(clojure.core/declare ser-action-name)

(clojure.core/declare ser-action-type-settings)

(clojure.core/declare ser-blocker-declaration)

(clojure.core/declare ser-percentage)

(clojure.core/declare ser-pipeline-version)

(clojure.core/declare ser-webhook-name)

(clojure.core/declare ser-approval-summary)

(clojure.core/declare ser-url-template)

(clojure.core/declare ser-continuation-token)

(clojure.core/declare ser-input-artifact-list)

(clojure.core/declare ser-failure-type)

(clojure.core/declare ser-stage-declaration)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-artifact-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-artifact-details)

(clojure.core/declare ser-version)

(clojure.core/declare ser-nonce)

(clojure.core/declare ser-stage-name)

(clojure.core/declare ser-action-configuration-map)

(clojure.core/declare ser-pipeline-stage-declaration-list)

(clojure.core/declare ser-query-param-map)

(clojure.core/declare ser-current-revision)

(clojure.core/declare ser-webhook-definition)

(clojure.core/declare ser-artifact-store-location)

(clojure.core/declare ser-minimum-artifact-count)

(clojure.core/declare ser-action-configuration-property-list)

(clojure.core/declare ser-action-declaration)

(clojure.core/declare ser-action-configuration-property)

(clojure.core/declare ser-stage-action-declaration-list)

(clojure.core/declare ser-stage-retry-mode)

(clojure.core/declare ser-time)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-encryption-key)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-webhook-auth-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WebhookAuthConfiguration", :type "structure"} (clojure.core/contains? input :allowed-ip-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-webhook-auth-configuration-allowed-ip-range (input :allowed-ip-range)) #:http.request.field{:name "AllowedIPRange", :shape "WebhookAuthConfigurationAllowedIPRange"})) (clojure.core/contains? input :secret-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-webhook-auth-configuration-secret-token (input :secret-token)) #:http.request.field{:name "SecretToken", :shape "WebhookAuthConfigurationSecretToken"}))))

(clojure.core/defn- ser-action-category [input] #:http.request.field{:value (clojure.core/get {"Source" "Source", "Invoke" "Invoke", "Test" "Test", :source "Source", :build "Build", "Build" "Build", :invoke "Invoke", :deploy "Deploy", :test "Test", "Deploy" "Deploy", :approval "Approval", "Approval" "Approval"} input), :shape "ActionCategory"})

(clojure.core/defn- ser-artifact-store-type [input] #:http.request.field{:value (clojure.core/get {"S3" "S3", :s-3 "S3"} input), :shape "ArtifactStoreType"})

(clojure.core/defn- ser-action-type-id [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action-category (:category input)) #:http.request.field{:name "category", :shape "ActionCategory"}) (clojure.core/into (ser-action-owner (:owner input)) #:http.request.field{:name "owner", :shape "ActionOwner"}) (clojure.core/into (ser-action-provider (:provider input)) #:http.request.field{:name "provider", :shape "ActionProvider"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "version", :shape "Version"})], :shape "ActionTypeId", :type "structure"}))

(clojure.core/defn- ser-max-batch-size [input] #:http.request.field{:value input, :shape "MaxBatchSize"})

(clojure.core/defn- ser-input-artifact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-artifact-name (:name input)) #:http.request.field{:name "name", :shape "ArtifactName"})], :shape "InputArtifact", :type "structure"}))

(clojure.core/defn- ser-action-configuration-queryable-value [input] #:http.request.field{:value input, :shape "ActionConfigurationQueryableValue"})

(clojure.core/defn- ser-action-configuration-key [input] #:http.request.field{:value input, :shape "ActionConfigurationKey"})

(clojure.core/defn- ser-encryption-key-type [input] #:http.request.field{:value (clojure.core/get {"KMS" "KMS", :kms "KMS"} input), :shape "EncryptionKeyType"})

(clojure.core/defn- ser-pipeline-execution-id [input] #:http.request.field{:value input, :shape "PipelineExecutionId"})

(clojure.core/defn- ser-artifact-store [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-artifact-store-type (:type input)) #:http.request.field{:name "type", :shape "ArtifactStoreType"}) (clojure.core/into (ser-artifact-store-location (:location input)) #:http.request.field{:name "location", :shape "ArtifactStoreLocation"})], :shape "ArtifactStore", :type "structure"} (clojure.core/contains? input :encryption-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-key (input :encryption-key)) #:http.request.field{:name "encryptionKey", :shape "EncryptionKey"}))))

(clojure.core/defn- ser-revision-summary [input] #:http.request.field{:value input, :shape "RevisionSummary"})

(clojure.core/defn- ser-webhook-auth-configuration-allowed-ip-range [input] #:http.request.field{:value input, :shape "WebhookAuthConfigurationAllowedIPRange"})

(clojure.core/defn- ser-encryption-key-id [input] #:http.request.field{:value input, :shape "EncryptionKeyId"})

(clojure.core/defn- ser-webhook-authentication-type [input] #:http.request.field{:value (clojure.core/get {"GITHUB_HMAC" "GITHUB_HMAC", :github-hmac "GITHUB_HMAC", "IP" "IP", :ip "IP", "UNAUTHENTICATED" "UNAUTHENTICATED", :unauthenticated "UNAUTHENTICATED"} input), :shape "WebhookAuthenticationType"})

(clojure.core/defn- ser-webhook-auth-configuration-secret-token [input] #:http.request.field{:value input, :shape "WebhookAuthConfigurationSecretToken"})

(clojure.core/defn- ser-execution-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ExecutionDetails", :type "structure"} (clojure.core/contains? input :summary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-summary (input :summary)) #:http.request.field{:name "summary", :shape "ExecutionSummary"})) (clojure.core/contains? input :external-execution-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-id (input :external-execution-id)) #:http.request.field{:name "externalExecutionId", :shape "ExecutionId"})) (clojure.core/contains? input :percent-complete) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :percent-complete)) #:http.request.field{:name "percentComplete", :shape "Percentage"}))))

(clojure.core/defn- ser-disabled-reason [input] #:http.request.field{:value input, :shape "DisabledReason"})

(clojure.core/defn- ser-action-owner [input] #:http.request.field{:value (clojure.core/get {"AWS" "AWS", :aws "AWS", "ThirdParty" "ThirdParty", :third-party "ThirdParty", "Custom" "Custom", :custom "Custom"} input), :shape "ActionOwner"})

(clojure.core/defn- ser-approval-token [input] #:http.request.field{:value input, :shape "ApprovalToken"})

(clojure.core/defn- ser-pipeline-name [input] #:http.request.field{:value input, :shape "PipelineName"})

(clojure.core/defn- ser-json-path [input] #:http.request.field{:value input, :shape "JsonPath"})

(clojure.core/defn- ser-action-provider [input] #:http.request.field{:value input, :shape "ActionProvider"})

(clojure.core/defn- ser-action-configuration-property-type [input] #:http.request.field{:value (clojure.core/get {"String" "String", :string "String", "Number" "Number", :number "Number", "Boolean" "Boolean", :boolean "Boolean"} input), :shape "ActionConfigurationPropertyType"})

(clojure.core/defn- ser-action-revision [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-revision (:revision-id input)) #:http.request.field{:name "revisionId", :shape "Revision"}) (clojure.core/into (ser-revision-change-identifier (:revision-change-id input)) #:http.request.field{:name "revisionChangeId", :shape "RevisionChangeIdentifier"}) (clojure.core/into (ser-timestamp (:created input)) #:http.request.field{:name "created", :shape "Timestamp"})], :shape "ActionRevision", :type "structure"}))

(clojure.core/defn- ser-output-artifact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-artifact-name (:name input)) #:http.request.field{:name "name", :shape "ArtifactName"})], :shape "OutputArtifact", :type "structure"}))

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-approval-status [input] #:http.request.field{:value (clojure.core/get {"Approved" "Approved", :approved "Approved", "Rejected" "Rejected", :rejected "Rejected"} input), :shape "ApprovalStatus"})

(clojure.core/defn- ser-blocker-name [input] #:http.request.field{:value input, :shape "BlockerName"})

(clojure.core/defn- ser-third-party-job-id [input] #:http.request.field{:value input, :shape "ThirdPartyJobId"})

(clojure.core/defn- ser-stage-transition-type [input] #:http.request.field{:value (clojure.core/get {"Inbound" "Inbound", :inbound "Inbound", "Outbound" "Outbound", :outbound "Outbound"} input), :shape "StageTransitionType"})

(clojure.core/defn- ser-maximum-artifact-count [input] #:http.request.field{:value input, :shape "MaximumArtifactCount"})

(clojure.core/defn- ser-stage-blocker-declaration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-blocker-declaration coll) #:http.request.field{:shape "BlockerDeclaration"}))) input), :shape "StageBlockerDeclarationList", :type "list"})

(clojure.core/defn- ser-approval-result [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-approval-summary (:summary input)) #:http.request.field{:name "summary", :shape "ApprovalSummary"}) (clojure.core/into (ser-approval-status (:status input)) #:http.request.field{:name "status", :shape "ApprovalStatus"})], :shape "ApprovalResult", :type "structure"}))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-blocker-type [input] #:http.request.field{:value (clojure.core/get {"Schedule" "Schedule", :schedule "Schedule"} input), :shape "BlockerType"})

(clojure.core/defn- ser-webhook-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-webhook-filter-rule coll) #:http.request.field{:shape "WebhookFilterRule"}))) input), :shape "WebhookFilters", :type "list", :max 5})

(clojure.core/defn- ser-match-equals [input] #:http.request.field{:value input, :shape "MatchEquals"})

(clojure.core/defn- ser-pipeline-declaration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-pipeline-name (:name input)) #:http.request.field{:name "name", :shape "PipelineName"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "roleArn", :shape "RoleArn"}) (clojure.core/into (ser-artifact-store (:artifact-store input)) #:http.request.field{:name "artifactStore", :shape "ArtifactStore"}) (clojure.core/into (ser-pipeline-stage-declaration-list (:stages input)) #:http.request.field{:name "stages", :shape "PipelineStageDeclarationList"})], :shape "PipelineDeclaration", :type "structure"} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-version (input :version)) #:http.request.field{:name "version", :shape "PipelineVersion"}))))

(clojure.core/defn- ser-action-run-order [input] #:http.request.field{:value input, :shape "ActionRunOrder"})

(clojure.core/defn- ser-revision [input] #:http.request.field{:value input, :shape "Revision"})

(clojure.core/defn- ser-output-artifact-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-output-artifact coll) #:http.request.field{:shape "OutputArtifact"}))) input), :shape "OutputArtifactList", :type "list"})

(clojure.core/defn- ser-execution-summary [input] #:http.request.field{:value input, :shape "ExecutionSummary"})

(clojure.core/defn- ser-execution-id [input] #:http.request.field{:value input, :shape "ExecutionId"})

(clojure.core/defn- ser-url [input] #:http.request.field{:value input, :shape "Url"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-webhook-filter-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-json-path (:json-path input)) #:http.request.field{:name "jsonPath", :shape "JsonPath"})], :shape "WebhookFilterRule", :type "structure"} (clojure.core/contains? input :match-equals) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-match-equals (input :match-equals)) #:http.request.field{:name "matchEquals", :shape "MatchEquals"}))))

(clojure.core/defn- ser-failure-details [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-failure-type (:type input)) #:http.request.field{:name "type", :shape "FailureType"}) (clojure.core/into (ser-message (:message input)) #:http.request.field{:name "message", :shape "Message"})], :shape "FailureDetails", :type "structure"} (clojure.core/contains? input :external-execution-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-id (input :external-execution-id)) #:http.request.field{:name "externalExecutionId", :shape "ExecutionId"}))))

(clojure.core/defn- ser-action-configuration-value [input] #:http.request.field{:value input, :shape "ActionConfigurationValue"})

(clojure.core/defn- ser-revision-change-identifier [input] #:http.request.field{:value input, :shape "RevisionChangeIdentifier"})

(clojure.core/defn- ser-action-name [input] #:http.request.field{:value input, :shape "ActionName"})

(clojure.core/defn- ser-action-type-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ActionTypeSettings", :type "structure"} (clojure.core/contains? input :third-party-configuration-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :third-party-configuration-url)) #:http.request.field{:name "thirdPartyConfigurationUrl", :shape "Url"})) (clojure.core/contains? input :entity-url-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url-template (input :entity-url-template)) #:http.request.field{:name "entityUrlTemplate", :shape "UrlTemplate"})) (clojure.core/contains? input :execution-url-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url-template (input :execution-url-template)) #:http.request.field{:name "executionUrlTemplate", :shape "UrlTemplate"})) (clojure.core/contains? input :revision-url-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url-template (input :revision-url-template)) #:http.request.field{:name "revisionUrlTemplate", :shape "UrlTemplate"}))))

(clojure.core/defn- ser-blocker-declaration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-blocker-name (:name input)) #:http.request.field{:name "name", :shape "BlockerName"}) (clojure.core/into (ser-blocker-type (:type input)) #:http.request.field{:name "type", :shape "BlockerType"})], :shape "BlockerDeclaration", :type "structure"}))

(clojure.core/defn- ser-percentage [input] #:http.request.field{:value input, :shape "Percentage"})

(clojure.core/defn- ser-pipeline-version [input] #:http.request.field{:value input, :shape "PipelineVersion"})

(clojure.core/defn- ser-webhook-name [input] #:http.request.field{:value input, :shape "WebhookName"})

(clojure.core/defn- ser-approval-summary [input] #:http.request.field{:value input, :shape "ApprovalSummary"})

(clojure.core/defn- ser-url-template [input] #:http.request.field{:value input, :shape "UrlTemplate"})

(clojure.core/defn- ser-continuation-token [input] #:http.request.field{:value input, :shape "ContinuationToken"})

(clojure.core/defn- ser-input-artifact-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-artifact coll) #:http.request.field{:shape "InputArtifact"}))) input), :shape "InputArtifactList", :type "list"})

(clojure.core/defn- ser-failure-type [input] #:http.request.field{:value (clojure.core/get {"SystemUnavailable" "SystemUnavailable", "PermissionError" "PermissionError", :revision-out-of-sync "RevisionOutOfSync", "RevisionUnavailable" "RevisionUnavailable", "ConfigurationError" "ConfigurationError", :system-unavailable "SystemUnavailable", :permission-error "PermissionError", :configuration-error "ConfigurationError", :revision-unavailable "RevisionUnavailable", :job-failed "JobFailed", "JobFailed" "JobFailed", "RevisionOutOfSync" "RevisionOutOfSync"} input), :shape "FailureType"})

(clojure.core/defn- ser-stage-declaration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-stage-name (:name input)) #:http.request.field{:name "name", :shape "StageName"}) (clojure.core/into (ser-stage-action-declaration-list (:actions input)) #:http.request.field{:name "actions", :shape "StageActionDeclarationList"})], :shape "StageDeclaration", :type "structure"} (clojure.core/contains? input :blockers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stage-blocker-declaration-list (input :blockers)) #:http.request.field{:name "blockers", :shape "StageBlockerDeclarationList"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-artifact-name [input] #:http.request.field{:value input, :shape "ArtifactName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-artifact-details [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-minimum-artifact-count (:minimum-count input)) #:http.request.field{:name "minimumCount", :shape "MinimumArtifactCount"}) (clojure.core/into (ser-maximum-artifact-count (:maximum-count input)) #:http.request.field{:name "maximumCount", :shape "MaximumArtifactCount"})], :shape "ArtifactDetails", :type "structure"}))

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-nonce [input] #:http.request.field{:value input, :shape "Nonce"})

(clojure.core/defn- ser-stage-name [input] #:http.request.field{:value input, :shape "StageName"})

(clojure.core/defn- ser-action-configuration-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-action-configuration-key k) #:http.request.field{:map-info "key", :shape "ActionConfigurationKey"}) (clojure.core/into (ser-action-configuration-value v) #:http.request.field{:map-info "value", :shape "ActionConfigurationValue"})])) input), :shape "ActionConfigurationMap", :type "map"})

(clojure.core/defn- ser-pipeline-stage-declaration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-stage-declaration coll) #:http.request.field{:shape "StageDeclaration"}))) input), :shape "PipelineStageDeclarationList", :type "list"})

(clojure.core/defn- ser-query-param-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-action-configuration-key k) #:http.request.field{:map-info "key", :shape "ActionConfigurationKey"}) (clojure.core/into (ser-action-configuration-queryable-value v) #:http.request.field{:map-info "value", :shape "ActionConfigurationQueryableValue"})])) input), :shape "QueryParamMap", :type "map", :max 1, :min 0})

(clojure.core/defn- ser-current-revision [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-revision (:revision input)) #:http.request.field{:name "revision", :shape "Revision"}) (clojure.core/into (ser-revision-change-identifier (:change-identifier input)) #:http.request.field{:name "changeIdentifier", :shape "RevisionChangeIdentifier"})], :shape "CurrentRevision", :type "structure"} (clojure.core/contains? input :created) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time (input :created)) #:http.request.field{:name "created", :shape "Time"})) (clojure.core/contains? input :revision-summary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-summary (input :revision-summary)) #:http.request.field{:name "revisionSummary", :shape "RevisionSummary"}))))

(clojure.core/defn- ser-webhook-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-webhook-name (:name input)) #:http.request.field{:name "name", :shape "WebhookName"}) (clojure.core/into (ser-pipeline-name (:target-pipeline input)) #:http.request.field{:name "targetPipeline", :shape "PipelineName"}) (clojure.core/into (ser-action-name (:target-action input)) #:http.request.field{:name "targetAction", :shape "ActionName"}) (clojure.core/into (ser-webhook-filters (:filters input)) #:http.request.field{:name "filters", :shape "WebhookFilters"}) (clojure.core/into (ser-webhook-authentication-type (:authentication input)) #:http.request.field{:name "authentication", :shape "WebhookAuthenticationType"}) (clojure.core/into (ser-webhook-auth-configuration (:authentication-configuration input)) #:http.request.field{:name "authenticationConfiguration", :shape "WebhookAuthConfiguration"})], :shape "WebhookDefinition", :type "structure"}))

(clojure.core/defn- ser-artifact-store-location [input] #:http.request.field{:value input, :shape "ArtifactStoreLocation"})

(clojure.core/defn- ser-minimum-artifact-count [input] #:http.request.field{:value input, :shape "MinimumArtifactCount"})

(clojure.core/defn- ser-action-configuration-property-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action-configuration-property coll) #:http.request.field{:shape "ActionConfigurationProperty"}))) input), :shape "ActionConfigurationPropertyList", :type "list", :max 10})

(clojure.core/defn- ser-action-declaration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action-name (:name input)) #:http.request.field{:name "name", :shape "ActionName"}) (clojure.core/into (ser-action-type-id (:action-type-id input)) #:http.request.field{:name "actionTypeId", :shape "ActionTypeId"})], :shape "ActionDeclaration", :type "structure"} (clojure.core/contains? input :run-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-run-order (input :run-order)) #:http.request.field{:name "runOrder", :shape "ActionRunOrder"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-configuration-map (input :configuration)) #:http.request.field{:name "configuration", :shape "ActionConfigurationMap"})) (clojure.core/contains? input :output-artifacts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-artifact-list (input :output-artifacts)) #:http.request.field{:name "outputArtifacts", :shape "OutputArtifactList"})) (clojure.core/contains? input :input-artifacts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-artifact-list (input :input-artifacts)) #:http.request.field{:name "inputArtifacts", :shape "InputArtifactList"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"}))))

(clojure.core/defn- ser-action-configuration-property [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action-configuration-key (:name input)) #:http.request.field{:name "name", :shape "ActionConfigurationKey"}) (clojure.core/into (ser-boolean (:required input)) #:http.request.field{:name "required", :shape "Boolean"}) (clojure.core/into (ser-boolean (:key input)) #:http.request.field{:name "key", :shape "Boolean"}) (clojure.core/into (ser-boolean (:secret input)) #:http.request.field{:name "secret", :shape "Boolean"})], :shape "ActionConfigurationProperty", :type "structure"} (clojure.core/contains? input :queryable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :queryable)) #:http.request.field{:name "queryable", :shape "Boolean"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-configuration-property-type (input :type)) #:http.request.field{:name "type", :shape "ActionConfigurationPropertyType"}))))

(clojure.core/defn- ser-stage-action-declaration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action-declaration coll) #:http.request.field{:shape "ActionDeclaration"}))) input), :shape "StageActionDeclarationList", :type "list"})

(clojure.core/defn- ser-stage-retry-mode [input] #:http.request.field{:value (clojure.core/get {"FAILED_ACTIONS" "FAILED_ACTIONS", :failed-actions "FAILED_ACTIONS"} input), :shape "StageRetryMode"})

(clojure.core/defn- ser-time [input] #:http.request.field{:value input, :shape "Time"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-encryption-key [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-encryption-key-id (:id input)) #:http.request.field{:name "id", :shape "EncryptionKeyId"}) (clojure.core/into (ser-encryption-key-type (:type input)) #:http.request.field{:name "type", :shape "EncryptionKeyType"})], :shape "EncryptionKey", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-get-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :name)) #:http.request.field{:name "name", :shape "PipelineName"})]} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pipeline-version (input :version)) #:http.request.field{:name "version", :shape "PipelineVersion"}))))

(clojure.core/defn- req-list-webhooks-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-third-party-job-failure-result-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-third-party-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "ThirdPartyJobId"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "clientToken", :shape "ClientToken"}) (clojure.core/into (ser-failure-details (input :failure-details)) #:http.request.field{:name "failureDetails", :shape "FailureDetails"})]}))

(clojure.core/defn- req-put-job-success-result-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId"})]} (clojure.core/contains? input :current-revision) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-current-revision (input :current-revision)) #:http.request.field{:name "currentRevision", :shape "CurrentRevision"})) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuation-token (input :continuation-token)) #:http.request.field{:name "continuationToken", :shape "ContinuationToken"})) (clojure.core/contains? input :execution-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-details (input :execution-details)) #:http.request.field{:name "executionDetails", :shape "ExecutionDetails"}))))

(clojure.core/defn- req-update-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-declaration (input :pipeline)) #:http.request.field{:name "pipeline", :shape "PipelineDeclaration"})]}))

(clojure.core/defn- req-start-pipeline-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :name)) #:http.request.field{:name "name", :shape "PipelineName"})]}))

(clojure.core/defn- req-put-third-party-job-success-result-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-third-party-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "ThirdPartyJobId"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "clientToken", :shape "ClientToken"})]} (clojure.core/contains? input :current-revision) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-current-revision (input :current-revision)) #:http.request.field{:name "currentRevision", :shape "CurrentRevision"})) (clojure.core/contains? input :continuation-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuation-token (input :continuation-token)) #:http.request.field{:name "continuationToken", :shape "ContinuationToken"})) (clojure.core/contains? input :execution-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-details (input :execution-details)) #:http.request.field{:name "executionDetails", :shape "ExecutionDetails"}))))

(clojure.core/defn- req-deregister-webhook-with-third-party-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :webhook-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-webhook-name (input :webhook-name)) #:http.request.field{:name "webhookName", :shape "WebhookName"}))))

(clojure.core/defn- req-delete-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :name)) #:http.request.field{:name "name", :shape "PipelineName"})]}))

(clojure.core/defn- req-create-custom-action-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action-category (input :category)) #:http.request.field{:name "category", :shape "ActionCategory"}) (clojure.core/into (ser-action-provider (input :provider)) #:http.request.field{:name "provider", :shape "ActionProvider"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version"}) (clojure.core/into (ser-artifact-details (input :input-artifact-details)) #:http.request.field{:name "inputArtifactDetails", :shape "ArtifactDetails"}) (clojure.core/into (ser-artifact-details (input :output-artifact-details)) #:http.request.field{:name "outputArtifactDetails", :shape "ArtifactDetails"})]} (clojure.core/contains? input :settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-type-settings (input :settings)) #:http.request.field{:name "settings", :shape "ActionTypeSettings"})) (clojure.core/contains? input :configuration-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-configuration-property-list (input :configuration-properties)) #:http.request.field{:name "configurationProperties", :shape "ActionConfigurationPropertyList"}))))

(clojure.core/defn- req-list-pipeline-executions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-custom-action-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action-category (input :category)) #:http.request.field{:name "category", :shape "ActionCategory"}) (clojure.core/into (ser-action-provider (input :provider)) #:http.request.field{:name "provider", :shape "ActionProvider"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version"})]}))

(clojure.core/defn- req-enable-stage-transition-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-stage-name (input :stage-name)) #:http.request.field{:name "stageName", :shape "StageName"}) (clojure.core/into (ser-stage-transition-type (input :transition-type)) #:http.request.field{:name "transitionType", :shape "StageTransitionType"})]}))

(clojure.core/defn- req-put-action-revision-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-stage-name (input :stage-name)) #:http.request.field{:name "stageName", :shape "StageName"}) (clojure.core/into (ser-action-name (input :action-name)) #:http.request.field{:name "actionName", :shape "ActionName"}) (clojure.core/into (ser-action-revision (input :action-revision)) #:http.request.field{:name "actionRevision", :shape "ActionRevision"})]}))

(clojure.core/defn- req-create-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-declaration (input :pipeline)) #:http.request.field{:name "pipeline", :shape "PipelineDeclaration"})]}))

(clojure.core/defn- req-acknowledge-third-party-job-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-third-party-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "ThirdPartyJobId"}) (clojure.core/into (ser-nonce (input :nonce)) #:http.request.field{:name "nonce", :shape "Nonce"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "clientToken", :shape "ClientToken"})]}))

(clojure.core/defn- req-put-approval-result-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-stage-name (input :stage-name)) #:http.request.field{:name "stageName", :shape "StageName"}) (clojure.core/into (ser-action-name (input :action-name)) #:http.request.field{:name "actionName", :shape "ActionName"}) (clojure.core/into (ser-approval-result (input :result)) #:http.request.field{:name "result", :shape "ApprovalResult"}) (clojure.core/into (ser-approval-token (input :token)) #:http.request.field{:name "token", :shape "ApprovalToken"})]}))

(clojure.core/defn- req-register-webhook-with-third-party-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :webhook-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-webhook-name (input :webhook-name)) #:http.request.field{:name "webhookName", :shape "WebhookName"}))))

(clojure.core/defn- req-acknowledge-job-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId"}) (clojure.core/into (ser-nonce (input :nonce)) #:http.request.field{:name "nonce", :shape "Nonce"})]}))

(clojure.core/defn- req-list-pipelines-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-disable-stage-transition-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-stage-name (input :stage-name)) #:http.request.field{:name "stageName", :shape "StageName"}) (clojure.core/into (ser-stage-transition-type (input :transition-type)) #:http.request.field{:name "transitionType", :shape "StageTransitionType"}) (clojure.core/into (ser-disabled-reason (input :reason)) #:http.request.field{:name "reason", :shape "DisabledReason"})]}))

(clojure.core/defn- req-delete-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-webhook-name (input :name)) #:http.request.field{:name "name", :shape "WebhookName"})]}))

(clojure.core/defn- req-list-action-types-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :action-owner-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-owner (input :action-owner-filter)) #:http.request.field{:name "actionOwnerFilter", :shape "ActionOwner"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-job-details-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId"})]}))

(clojure.core/defn- req-poll-for-third-party-jobs-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action-type-id (input :action-type-id)) #:http.request.field{:name "actionTypeId", :shape "ActionTypeId"})]} (clojure.core/contains? input :max-batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-batch-size (input :max-batch-size)) #:http.request.field{:name "maxBatchSize", :shape "MaxBatchSize"}))))

(clojure.core/defn- req-get-pipeline-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-pipeline-execution-id (input :pipeline-execution-id)) #:http.request.field{:name "pipelineExecutionId", :shape "PipelineExecutionId"})]}))

(clojure.core/defn- req-put-job-failure-result-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId"}) (clojure.core/into (ser-failure-details (input :failure-details)) #:http.request.field{:name "failureDetails", :shape "FailureDetails"})]}))

(clojure.core/defn- req-retry-stage-execution-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :pipeline-name)) #:http.request.field{:name "pipelineName", :shape "PipelineName"}) (clojure.core/into (ser-stage-name (input :stage-name)) #:http.request.field{:name "stageName", :shape "StageName"}) (clojure.core/into (ser-pipeline-execution-id (input :pipeline-execution-id)) #:http.request.field{:name "pipelineExecutionId", :shape "PipelineExecutionId"}) (clojure.core/into (ser-stage-retry-mode (input :retry-mode)) #:http.request.field{:name "retryMode", :shape "StageRetryMode"})]}))

(clojure.core/defn- req-poll-for-jobs-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action-type-id (input :action-type-id)) #:http.request.field{:name "actionTypeId", :shape "ActionTypeId"})]} (clojure.core/contains? input :max-batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-batch-size (input :max-batch-size)) #:http.request.field{:name "maxBatchSize", :shape "MaxBatchSize"})) (clojure.core/contains? input :query-param) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-param-map (input :query-param)) #:http.request.field{:name "queryParam", :shape "QueryParamMap"}))))

(clojure.core/defn- req-get-pipeline-state-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-pipeline-name (input :name)) #:http.request.field{:name "name", :shape "PipelineName"})]}))

(clojure.core/defn- req-put-webhook-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-webhook-definition (input :webhook)) #:http.request.field{:name "webhook", :shape "WebhookDefinition"})]}))

(clojure.core/defn- req-get-third-party-job-details-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-third-party-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "ThirdPartyJobId"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "clientToken", :shape "ClientToken"})]}))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-state-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/action-state))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-input/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-input/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-input/name] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-input/version]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-auth-configuration/allowed-ip-range (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration-allowed-ip-range))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-auth-configuration/secret-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration-secret-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.webhook-auth-configuration/allowed-ip-range :portkey.aws.codepipeline.-2015-07-09.webhook-auth-configuration/secret-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-category #{"Source" "Invoke" "Test" :source :build "Build" :invoke :deploy :test "Deploy" :approval "Approval"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-structure-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/last-changed-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-store-type #{:s-3 "S3"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.transition-state/enabled (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/enabled))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.transition-state/last-changed-by (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/last-changed-by))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.transition-state/last-changed-at (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/last-changed-at))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.transition-state/disabled-reason (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/disabled-reason))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/transition-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.transition-state/enabled :portkey.aws.codepipeline.-2015-07-09.transition-state/last-changed-by :portkey.aws.codepipeline.-2015-07-09.transition-state/last-changed-at :portkey.aws.codepipeline.-2015-07-09.transition-state/disabled-reason]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/last-status-change (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-execution-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/external-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-execution-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/error-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/error-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/percent-complete (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/percentage))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/external-execution-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-execution/last-updated-by (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/last-updated-by))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-execution/last-status-change :portkey.aws.codepipeline.-2015-07-09.action-execution/token :portkey.aws.codepipeline.-2015-07-09.action-execution/external-execution-id :portkey.aws.codepipeline.-2015-07-09.action-execution/summary :portkey.aws.codepipeline.-2015-07-09.action-execution/status :portkey.aws.codepipeline.-2015-07-09.action-execution/error-details :portkey.aws.codepipeline.-2015-07-09.action-execution/percent-complete :portkey.aws.codepipeline.-2015-07-09.action-execution/external-execution-url :portkey.aws.codepipeline.-2015-07-09.action-execution/last-updated-by]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-details/id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-details/data (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-data))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-details/account-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/account-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.job-details/id :portkey.aws.codepipeline.-2015-07-09.job-details/data :portkey.aws.codepipeline.-2015-07-09.job-details/account-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/action-type-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/action-configuration (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/pipeline-context (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-context))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/input-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/output-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/artifact-credentials (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/aws-session-credentials))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/continuation-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/continuation-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/encryption-key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/encryption-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/third-party-job-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.third-party-job-data/action-type-id :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/action-configuration :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/pipeline-context :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/input-artifacts :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/output-artifacts :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/artifact-credentials :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/continuation-token :portkey.aws.codepipeline.-2015-07-09.third-party-job-data/encryption-key]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-webhooks-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09/next-token :portkey.aws.codepipeline.-2015-07-09/max-results]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/client-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/client-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/failure-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/failure-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-failure-result-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/job-id :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/client-token :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-failure-result-input/failure-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/definition (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-definition))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/error-message (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-error-message))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/error-code (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-error-code))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/last-triggered (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-last-triggered))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/arn (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-arn))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-webhook-item (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.list-webhook-item/definition :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/url] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-webhook-item/error-message :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/error-code :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/last-triggered :portkey.aws.codepipeline.-2015-07-09.list-webhook-item/arn]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-id/category (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-category))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-id/owner (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-owner))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-id/provider (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-provider))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-id/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-type-id (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.action-type-id/category :portkey.aws.codepipeline.-2015-07-09.action-type-id/owner :portkey.aws.codepipeline.-2015-07-09.action-type-id/provider :portkey.aws.codepipeline.-2015-07-09.action-type-id/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/max-batch-size (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-output/new-revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-output/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-action-revision-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.put-action-revision-output/new-revision :portkey.aws.codepipeline.-2015-07-09.put-action-revision-output/pipeline-execution-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.input-artifact/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/input-artifact (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.input-artifact/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-queryable-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/encryption-key-type #{"KMS" :kms})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-execution-status #{"Failed" :in-progress "Succeeded" "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-webhook-output/webhook (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/list-webhook-item))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.put-webhook-output/webhook]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-state/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-state/inbound-transition-state (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/transition-state))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-state/action-states (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-state-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-state/latest-execution (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-execution))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.stage-state/stage-name :portkey.aws.codepipeline.-2015-07-09.stage-state/inbound-transition-state :portkey.aws.codepipeline.-2015-07-09.stage-state/action-states :portkey.aws.codepipeline.-2015-07-09.stage-state/latest-execution]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/job))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-status #{:timed-out "Created" "Failed" "Dispatched" :in-progress "Succeeded" "TimedOut" :created :queued "InProgress" :dispatched "Queued" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-store/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-store-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-store/location (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-store-location))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-store/encryption-key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/encryption-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-store (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.artifact-store/type :portkey.aws.codepipeline.-2015-07-09.artifact-store/location] :opt-un [:portkey.aws.codepipeline.-2015-07-09.artifact-store/encryption-key]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-output/pipeline-execution (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-output/pipeline-execution]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/revision-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-client-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/artifact))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration-allowed-ip-range (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/encryption-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/pipeline-version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/stage-states (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-state-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/updated (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/pipeline-name :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/pipeline-version :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/stage-states :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/created :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-output/updated]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-authentication-type #{:ip "GITHUB_HMAC" :github-hmac "IP" "UNAUTHENTICATED" :unauthenticated})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-output/approved-at (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-approval-result-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.put-approval-result-output/approved-at]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration-secret-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/current-revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/current-revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/continuation-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/continuation-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/execution-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-job-success-result-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/job-id] :opt-un [:portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/current-revision :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/continuation-token :portkey.aws.codepipeline.-2015-07-09.put-job-success-result-input/execution-details]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.update-pipeline-input/pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/update-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.update-pipeline-input/pipeline] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-location-type #{:s-3 "S3"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.execution-details/summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.execution-details/external-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.execution-details/percent-complete (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/percentage))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/execution-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.execution-details/summary :portkey.aws.codepipeline.-2015-07-09.execution-details/external-execution-id :portkey.aws.codepipeline.-2015-07-09.execution-details/percent-complete]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-stage-declaration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/disabled-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 300)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9!@ \(\)\.\*\?\-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-owner #{:aws "Custom" "AWS" "ThirdParty" :custom :third-party})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/approval-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.start-pipeline-execution-output/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.start-pipeline-execution-output/pipeline-execution-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9.@\-_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-webhook-filter-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.start-pipeline-execution-input/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.start-pipeline-execution-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/approval-already-completed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/json-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/client-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/client-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/current-revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/current-revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/continuation-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/continuation-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/execution-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-success-result-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/job-id :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/client-token] :opt-un [:portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/current-revision :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/continuation-token :portkey.aws.codepipeline.-2015-07-09.put-third-party-job-success-result-input/execution-details]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-provider (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 25)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9A-Za-z_-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-output/jobs]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-type-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.deregister-webhook-with-third-party-input/webhook-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.deregister-webhook-with-third-party-input/webhook-name]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-output/jobs]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-property-type #{:number "Number" :string "String" :boolean "Boolean"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-revision/revision-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-revision/revision-change-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-change-identifier))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-revision/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-revision (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.action-revision/revision-id :portkey.aws.codepipeline.-2015-07-09.action-revision/revision-change-id :portkey.aws.codepipeline.-2015-07-09.action-revision/created] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-type-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/action-type))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.output-artifact/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/output-artifact (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.output-artifact/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-output/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-output/pipeline-execution-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/last-changed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws(-[\w]+)*:iam::[0-9]{12}:role/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/source-revision-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/source-revision))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/approval-status #{:rejected "Rejected" "Approved" :approved})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-state-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/stage-state))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/blocker-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/pipeline-summary))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/third-party-job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/s-3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-transition-type #{:outbound "Outbound" :inbound "Inbound"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-execution-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration/configuration (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-map))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-configuration/configuration]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.delete-pipeline-input/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/delete-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.delete-pipeline-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/maximum-artifact-count (clojure.spec.alpha/int-in 0 5))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-output/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-output/status]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-webhooks-output/webhooks (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-webhooks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-webhooks-output/webhooks :portkey.aws.codepipeline.-2015-07-09/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-revision-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/artifact-revision))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-blocker-declaration-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/blocker-declaration))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.source-revision/action-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.source-revision/revision-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.source-revision/revision-summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.source-revision/revision-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/source-revision (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.source-revision/action-name] :opt-un [:portkey.aws.codepipeline.-2015-07-09.source-revision/revision-id :portkey.aws.codepipeline.-2015-07-09.source-revision/revision-summary :portkey.aws.codepipeline.-2015-07-09.source-revision/revision-url]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/category (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-category))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/provider (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-provider))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/settings (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-settings))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/configuration-properties (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-property-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/input-artifact-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/output-artifact-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/category :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/provider :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/version :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/input-artifact-details :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/output-artifact-details] :opt-un [:portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/settings :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-input/configuration-properties]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.approval-result/summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/approval-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.approval-result/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/approval-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/approval-result (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.approval-result/summary :portkey.aws.codepipeline.-2015-07-09.approval-result/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-change-identifier (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-change-identifier))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-revision (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.artifact-revision/name :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-id :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-change-identifier :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-summary :portkey.aws.codepipeline.-2015-07-09.artifact-revision/created :portkey.aws.codepipeline.-2015-07-09.artifact-revision/revision-url]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-blocker-declaration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-execution/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-execution/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-execution-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-execution (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.stage-execution/pipeline-execution-id :portkey.aws.codepipeline.-2015-07-09.stage-execution/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/max-results (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/max-results))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/pipeline-name] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/max-results :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact/revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact/location (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-location))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.artifact/name :portkey.aws.codepipeline.-2015-07-09.artifact/revision :portkey.aws.codepipeline.-2015-07-09.artifact/location]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-context/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-context/name]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/category (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-category))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/provider (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-provider))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/delete-custom-action-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/category :portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/provider :portkey.aws.codepipeline.-2015-07-09.delete-custom-action-type-input/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-details/id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-details/data (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-data))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job-details/nonce (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/nonce))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/third-party-job-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.third-party-job-details/id :portkey.aws.codepipeline.-2015-07-09.third-party-job-details/data :portkey.aws.codepipeline.-2015-07-09.third-party-job-details/nonce]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/blocker-type #{:schedule "Schedule"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/transition-type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-transition-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/enable-stage-transition-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/stage-name :portkey.aws.codepipeline.-2015-07-09.enable-stage-transition-input/transition-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/access-key-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/secret-access-key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/secret-access-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/session-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/session-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/aws-session-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/access-key-id :portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/secret-access-key :portkey.aws.codepipeline.-2015-07-09.aws-session-credentials/session-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-filters (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/webhook-filter-rule :max-count 5))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/action-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/action-revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-action-revision-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/stage-name :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/action-name :portkey.aws.codepipeline.-2015-07-09.put-action-revision-input/action-revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-output/job-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-output/job-details]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-context/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-context/stage (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-context))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-context/action (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-context))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-context/pipeline-name :portkey.aws.codepipeline.-2015-07-09.pipeline-context/stage :portkey.aws.codepipeline.-2015-07-09.pipeline-context/action]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/session-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/match-equals (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-nonce-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/role-arn (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/role-arn))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/artifact-store (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-store))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/stages (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-stage-declaration-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/name :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/role-arn :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/artifact-store :portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/stages] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-declaration/version]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/third-party-job-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/third-party-job))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-pipeline-input/pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/create-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.create-pipeline-input/pipeline] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/nonce (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/nonce))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/client-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/client-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/job-id :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/nonce :portkey.aws.codepipeline.-2015-07-09.acknowledge-third-party-job-input/client-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/action-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/result (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/approval-result))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/approval-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-approval-result-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/stage-name :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/action-name :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/result :portkey.aws.codepipeline.-2015-07-09.put-approval-result-input/token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-output/pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-output/metadata (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-metadata))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-output/pipeline :portkey.aws.codepipeline.-2015-07-09.get-pipeline-output/metadata]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-action-declaration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.register-webhook-with-third-party-input/webhook-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.register-webhook-with-third-party-input/webhook-name]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-run-order (clojure.spec.alpha/int-in 1 999))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/revision (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1500))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/updated (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-summary/name :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/version :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/created :portkey.aws.codepipeline.-2015-07-09.pipeline-summary/updated]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/output-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/output-artifact))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/delete-webhook-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/execution-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/execution-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1500))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 160))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipelines-output/pipelines (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipelines-output/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-pipelines-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-pipelines-output/pipelines :portkey.aws.codepipeline.-2015-07-09.list-pipelines-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-summary))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-job-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-job-input/nonce (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/nonce))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.acknowledge-job-input/job-id :portkey.aws.codepipeline.-2015-07-09.acknowledge-job-input/nonce] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 5000))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job/client-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/client-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.third-party-job/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/third-party-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.third-party-job/client-id :portkey.aws.codepipeline.-2015-07-09.third-party-job/job-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-filter-rule/json-path (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/json-path))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-filter-rule/match-equals (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/match-equals))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-filter-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.webhook-filter-rule/json-path] :opt-un [:portkey.aws.codepipeline.-2015-07-09.webhook-filter-rule/match-equals]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/list-webhook-item))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/start-time (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/last-update-time (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/source-revisions (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/source-revision-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/pipeline-execution-id :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/status :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/start-time :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/last-update-time :portkey.aws.codepipeline.-2015-07-09.pipeline-execution-summary/source-revisions]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-pipeline-output/pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/create-pipeline-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.create-pipeline-output/pipeline]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-state/action-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-state/current-revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-state/latest-execution (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-execution))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-state/entity-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-state/revision-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-state/action-name :portkey.aws.codepipeline.-2015-07-09.action-state/current-revision :portkey.aws.codepipeline.-2015-07-09.action-state/latest-execution :portkey.aws.codepipeline.-2015-07-09.action-state/entity-url :portkey.aws.codepipeline.-2015-07-09.action-state/revision-url]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.failure-details/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/failure-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.failure-details/message (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/message))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.failure-details/external-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/failure-details (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.failure-details/type :portkey.aws.codepipeline.-2015-07-09.failure-details/message] :opt-un [:portkey.aws.codepipeline.-2015-07-09.failure-details/external-execution-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/revision-change-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-job-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipelines-input/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-pipelines-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-pipelines-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9.@\-_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-version-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.update-pipeline-output/pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-declaration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/update-pipeline-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.update-pipeline-output/pipeline]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-settings/third-party-configuration-url (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-settings/entity-url-template (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url-template))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-settings/execution-url-template (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url-template))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type-settings/revision-url-template (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/url-template))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-type-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-type-settings/third-party-configuration-url :portkey.aws.codepipeline.-2015-07-09.action-type-settings/entity-url-template :portkey.aws.codepipeline.-2015-07-09.action-type-settings/execution-url-template :portkey.aws.codepipeline.-2015-07-09.action-type-settings/revision-url-template]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/transition-type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-transition-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/reason (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/disabled-reason))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/disable-stage-transition-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/stage-name :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/transition-type :portkey.aws.codepipeline.-2015-07-09.disable-stage-transition-input/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.blocker-declaration/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/blocker-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.blocker-declaration/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/blocker-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/blocker-declaration (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.blocker-declaration/name :portkey.aws.codepipeline.-2015-07-09.blocker-declaration/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-version (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/s-3-object-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9.@\-_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/approval-summary (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/url-template (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-location/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-location-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-location/s-3-location (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/s-3-artifact-location))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.artifact-location/type :portkey.aws.codepipeline.-2015-07-09.artifact-location/s-3-location]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/continuation-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/input-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/input-artifact))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.delete-webhook-input/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/delete-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.delete-webhook-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-status #{"Failed" :in-progress "Succeeded" "Superseded" :superseded "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/failure-type #{"SystemUnavailable" "PermissionError" :revision-out-of-sync "RevisionUnavailable" "ConfigurationError" :system-unavailable :permission-error :configuration-error :revision-unavailable :job-failed "JobFailed" "RevisionOutOfSync"})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-declaration/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-declaration/blockers (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-blocker-declaration-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-declaration/actions (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-action-declaration-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-declaration (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.stage-declaration/name :portkey.aws.codepipeline.-2015-07-09.stage-declaration/actions] :opt-un [:portkey.aws.codepipeline.-2015-07-09.stage-declaration/blockers]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/not-latest-pipeline-execution-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-action-types-input/action-owner-filter (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-owner))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-action-types-input/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-action-types-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-action-types-input/action-owner-filter :portkey.aws.codepipeline.-2015-07-09.list-action-types-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-job-details-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-job-details-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.get-job-details-input/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.error-details/code (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/code))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.error-details/message (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/message))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/error-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.error-details/code :portkey.aws.codepipeline.-2015-07-09.error-details/message]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/action-type-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/action-configuration (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/pipeline-context (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-context))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/input-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/output-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/artifact-credentials (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/aws-session-credentials))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/continuation-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/continuation-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job-data/encryption-key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/encryption-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.job-data/action-type-id :portkey.aws.codepipeline.-2015-07-09.job-data/action-configuration :portkey.aws.codepipeline.-2015-07-09.job-data/pipeline-context :portkey.aws.codepipeline.-2015-07-09.job-data/input-artifacts :portkey.aws.codepipeline.-2015-07-09.job-data/output-artifacts :portkey.aws.codepipeline.-2015-07-09.job-data/artifact-credentials :portkey.aws.codepipeline.-2015-07-09.job-data/continuation-token :portkey.aws.codepipeline.-2015-07-09.job-data/encryption-key]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-input/action-type-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-input/max-batch-size (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/max-batch-size))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-input/action-type-id] :opt-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-third-party-jobs-input/max-batch-size]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-execution-status #{"Failed" :in-progress "Succeeded" "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-input/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.get-pipeline-execution-input/pipeline-execution-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-not-retryable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-failure-result-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-job-failure-result-input/failure-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/failure-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-job-failure-result-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-job-failure-result-input/job-id :portkey.aws.codepipeline.-2015-07-09.put-job-failure-result-input/failure-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-approval-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/stage-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/retry-mode (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-retry-mode))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/pipeline-name :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/stage-name :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/pipeline-execution-id :portkey.aws.codepipeline.-2015-07-09.retry-stage-execution-input/retry-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-details/minimum-count (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/minimum-artifact-count))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.artifact-details/maximum-count (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/maximum-artifact-count))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-details (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.artifact-details/minimum-count :portkey.aws.codepipeline.-2015-07-09.artifact-details/maximum-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 9)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9A-Za-z_-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-webhook-authentication-parameters-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.s-3-artifact-location/bucket-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/s-3-bucket-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.s-3-artifact-location/object-key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/s-3-object-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/s-3-artifact-location (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.s-3-artifact-location/bucket-name :portkey.aws.codepipeline.-2015-07-09.s-3-artifact-location/object-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-output/pipeline-execution-summaries (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-summary-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-output/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-output/pipeline-execution-summaries :portkey.aws.codepipeline.-2015-07-09.list-pipeline-executions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/action-type-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/max-batch-size (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/max-batch-size))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/query-param (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/query-param-map))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/action-type-id] :opt-un [:portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/max-batch-size :portkey.aws.codepipeline.-2015-07-09.poll-for-jobs-input/query-param]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9.@\-_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job/id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job/data (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-data))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job/nonce (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/nonce))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.job/account-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/account-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.job/id :portkey.aws.codepipeline.-2015-07-09.job/data :portkey.aws.codepipeline.-2015-07-09.job/nonce :portkey.aws.codepipeline.-2015-07-09.job/account-id]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-last-triggered clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-map (clojure.spec.alpha/map-of :portkey.aws.codepipeline.-2015-07-09/action-configuration-key :portkey.aws.codepipeline.-2015-07-09/action-configuration-value))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-stage-declaration-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/stage-declaration))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/invalid-job-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-name-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.acknowledge-job-output/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.acknowledge-job-output/status]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type/id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type/settings (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-settings))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type/action-configuration-properties (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-property-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type/input-artifact-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-type/output-artifact-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.action-type/id :portkey.aws.codepipeline.-2015-07-09.action-type/input-artifact-details :portkey.aws.codepipeline.-2015-07-09.action-type/output-artifact-details] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-type/settings :portkey.aws.codepipeline.-2015-07-09.action-type/action-configuration-properties]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-input/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.get-pipeline-state-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/query-param-map (clojure.spec.alpha/map-of :portkey.aws.codepipeline.-2015-07-09/action-configuration-key :portkey.aws.codepipeline.-2015-07-09/action-configuration-queryable-value))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.current-revision/revision (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.current-revision/change-identifier (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-change-identifier))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.current-revision/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/time))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.current-revision/revision-summary (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/revision-summary))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/current-revision (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.current-revision/revision :portkey.aws.codepipeline.-2015-07-09.current-revision/change-identifier] :opt-un [:portkey.aws.codepipeline.-2015-07-09.current-revision/created :portkey.aws.codepipeline.-2015-07-09.current-revision/revision-summary]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/target-pipeline (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/target-action (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/filters (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-filters))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/authentication (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-authentication-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.webhook-definition/authentication-configuration (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-auth-configuration))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.webhook-definition/name :portkey.aws.codepipeline.-2015-07-09.webhook-definition/target-pipeline :portkey.aws.codepipeline.-2015-07-09.webhook-definition/target-action :portkey.aws.codepipeline.-2015-07-09.webhook-definition/filters :portkey.aws.codepipeline.-2015-07-09.webhook-definition/authentication :portkey.aws.codepipeline.-2015-07-09.webhook-definition/authentication-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.stage-context/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/stage-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-context (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.stage-context/name]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-action-types-output/action-types (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.list-action-types-output/next-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/next-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/list-action-types-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.list-action-types-output/action-types] :opt-un [:portkey.aws.codepipeline.-2015-07-09.list-action-types-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/artifact-store-location (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 3 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-\.]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws(-[\w]+)*:codepipeline:.+:[0-9]{12}:.+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/minimum-artifact-count (clojure.spec.alpha/int-in 0 5))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-version (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-version))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-execution-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/status (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-status))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/artifact-revisions (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/artifact-revision-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-execution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-name :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-version :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/pipeline-execution-id :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/status :portkey.aws.codepipeline.-2015-07-09.pipeline-execution/artifact-revisions]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-property-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/action-configuration-property :max-count 10))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-name))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/action-type-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/run-order (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-run-order))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/configuration (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-map))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/output-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/output-artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/input-artifacts (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/input-artifact-list))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-declaration/role-arn (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/role-arn))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-declaration (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.action-declaration/name :portkey.aws.codepipeline.-2015-07-09.action-declaration/action-type-id] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-declaration/run-order :portkey.aws.codepipeline.-2015-07-09.action-declaration/configuration :portkey.aws.codepipeline.-2015-07-09.action-declaration/output-artifacts :portkey.aws.codepipeline.-2015-07-09.action-declaration/input-artifacts :portkey.aws.codepipeline.-2015-07-09.action-declaration/role-arn]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.put-webhook-input/webhook (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/webhook-definition))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/put-webhook-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.put-webhook-input/webhook] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-output/action-type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-output (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.create-custom-action-type-output/action-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/secret-access-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/name (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-key))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/required (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/key (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/secret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/queryable (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/description (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/description))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/action-configuration-property-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/action-configuration-property (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.action-configuration-property/name :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/required :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/key :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/secret] :opt-un [:portkey.aws.codepipeline.-2015-07-09.action-configuration-property/queryable :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/description :portkey.aws.codepipeline.-2015-07-09.action-configuration-property/type]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-action-declaration-list (clojure.spec.alpha/coll-of :portkey.aws.codepipeline.-2015-07-09/action-declaration))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/last-updated-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/stage-retry-mode #{"FAILED_ACTIONS" :failed-actions})

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/webhook-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-job-details-output/job-details (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/job-details))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-job-details-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.get-job-details-output/job-details]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/access-key-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.encryption-key/id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/encryption-key-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.encryption-key/type (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/encryption-key-type))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/encryption-key (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.encryption-key/id :portkey.aws.codepipeline.-2015-07-09.encryption-key/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/pipeline-arn (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/pipeline-arn))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/created (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/updated (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/pipeline-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/pipeline-arn :portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/created :portkey.aws.codepipeline.-2015-07-09.pipeline-metadata/updated]))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-input/job-id (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/third-party-job-id))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-input/client-token (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/client-token))
(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-input/job-id :portkey.aws.codepipeline.-2015-07-09.get-third-party-job-details-input/client-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codepipeline.-2015-07-09/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__27967__auto__))))

(clojure.core/defn create-pipeline ([create-pipeline-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-pipeline-input create-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/create-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/create-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNameInUseException" :portkey.aws.codepipeline.-2015-07-09/pipeline-name-in-use-exception, "InvalidStageDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-stage-declaration-exception, "InvalidActionDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-action-declaration-exception, "InvalidBlockerDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-blocker-declaration-exception, "InvalidStructureException" :portkey.aws.codepipeline.-2015-07-09/invalid-structure-exception, "LimitExceededException" :portkey.aws.codepipeline.-2015-07-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/create-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/create-pipeline-output))

(clojure.core/defn list-pipelines ([] (list-pipelines {})) ([list-pipelines-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-pipelines-input list-pipelines-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/list-pipelines-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/list-pipelines-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPipelines", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidNextTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.codepipeline.-2015-07-09/list-pipelines-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/list-pipelines-output))

(clojure.core/defn acknowledge-job ([acknowledge-job-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-acknowledge-job-input acknowledge-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcknowledgeJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidNonceException" :portkey.aws.codepipeline.-2015-07-09/invalid-nonce-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception}})))))
(clojure.spec.alpha/fdef acknowledge-job :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/acknowledge-job-output))

(clojure.core/defn create-custom-action-type ([create-custom-action-type-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-custom-action-type-input create-custom-action-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCustomActionType", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "LimitExceededException" :portkey.aws.codepipeline.-2015-07-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-custom-action-type :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/create-custom-action-type-output))

(clojure.core/defn list-pipeline-executions ([list-pipeline-executions-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-pipeline-executions-input list-pipeline-executions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPipelineExecutions", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "InvalidNextTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-pipeline-executions :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/list-pipeline-executions-output))

(clojure.core/defn poll-for-jobs ([poll-for-jobs-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-poll-for-jobs-input poll-for-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PollForJobs", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "ActionTypeNotFoundException" :portkey.aws.codepipeline.-2015-07-09/action-type-not-found-exception}})))))
(clojure.spec.alpha/fdef poll-for-jobs :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/poll-for-jobs-output))

(clojure.core/defn retry-stage-execution ([retry-stage-execution-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-retry-stage-execution-input retry-stage-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RetryStageExecution", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "StageNotFoundException" :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception, "StageNotRetryableException" :portkey.aws.codepipeline.-2015-07-09/stage-not-retryable-exception, "NotLatestPipelineExecutionException" :portkey.aws.codepipeline.-2015-07-09/not-latest-pipeline-execution-exception}})))))
(clojure.spec.alpha/fdef retry-stage-execution :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/retry-stage-execution-output))

(clojure.core/defn delete-webhook ([delete-webhook-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-webhook-input delete-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/delete-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/delete-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteWebhook", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef delete-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/delete-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/delete-webhook-output))

(clojure.core/defn get-pipeline-state ([get-pipeline-state-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-pipeline-state-input get-pipeline-state-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPipelineState", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception}})))))
(clojure.spec.alpha/fdef get-pipeline-state :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/get-pipeline-state-output))

(clojure.core/defn put-third-party-job-success-result ([put-third-party-job-success-result-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-third-party-job-success-result-input put-third-party-job-success-result-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-success-result-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutThirdPartyJobSuccessResult", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "InvalidJobStateException" :portkey.aws.codepipeline.-2015-07-09/invalid-job-state-exception, "InvalidClientTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-client-token-exception}})))))
(clojure.spec.alpha/fdef put-third-party-job-success-result :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-success-result-input) :ret clojure.core/true?)

(clojure.core/defn put-third-party-job-failure-result ([put-third-party-job-failure-result-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-third-party-job-failure-result-input put-third-party-job-failure-result-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-failure-result-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutThirdPartyJobFailureResult", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "InvalidJobStateException" :portkey.aws.codepipeline.-2015-07-09/invalid-job-state-exception, "InvalidClientTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-client-token-exception}})))))
(clojure.spec.alpha/fdef put-third-party-job-failure-result :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-third-party-job-failure-result-input) :ret clojure.core/true?)

(clojure.core/defn poll-for-third-party-jobs ([poll-for-third-party-jobs-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-poll-for-third-party-jobs-input poll-for-third-party-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PollForThirdPartyJobs", :http.request.spec/error-spec {"ActionTypeNotFoundException" :portkey.aws.codepipeline.-2015-07-09/action-type-not-found-exception, "ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef poll-for-third-party-jobs :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/poll-for-third-party-jobs-output))

(clojure.core/defn put-job-success-result ([put-job-success-result-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-job-success-result-input put-job-success-result-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-job-success-result-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutJobSuccessResult", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "InvalidJobStateException" :portkey.aws.codepipeline.-2015-07-09/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef put-job-success-result :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-job-success-result-input) :ret clojure.core/true?)

(clojure.core/defn get-pipeline ([get-pipeline-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-pipeline-input get-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "PipelineVersionNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-version-not-found-exception}})))))
(clojure.spec.alpha/fdef get-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/get-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/get-pipeline-output))

(clojure.core/defn put-webhook ([put-webhook-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-webhook-input put-webhook-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/put-webhook-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-webhook-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutWebhook", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "LimitExceededException" :portkey.aws.codepipeline.-2015-07-09/limit-exceeded-exception, "InvalidWebhookFilterPatternException" :portkey.aws.codepipeline.-2015-07-09/invalid-webhook-filter-pattern-exception, "InvalidWebhookAuthenticationParametersException" :portkey.aws.codepipeline.-2015-07-09/invalid-webhook-authentication-parameters-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception}})))))
(clojure.spec.alpha/fdef put-webhook :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-webhook-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/put-webhook-output))

(clojure.core/defn get-third-party-job-details ([get-third-party-job-details-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-third-party-job-details-input get-third-party-job-details-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetThirdPartyJobDetails", :http.request.spec/error-spec {"JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidClientTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-client-token-exception, "InvalidJobException" :portkey.aws.codepipeline.-2015-07-09/invalid-job-exception}})))))
(clojure.spec.alpha/fdef get-third-party-job-details :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/get-third-party-job-details-output))

(clojure.core/defn deregister-webhook-with-third-party ([] (deregister-webhook-with-third-party {})) ([deregister-webhook-with-third-party-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-deregister-webhook-with-third-party-input deregister-webhook-with-third-party-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterWebhookWithThirdParty", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "WebhookNotFoundException" :portkey.aws.codepipeline.-2015-07-09/webhook-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-webhook-with-third-party :args (clojure.spec.alpha/? :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/deregister-webhook-with-third-party-output))

(clojure.core/defn disable-stage-transition ([disable-stage-transition-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-stage-transition-input disable-stage-transition-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/disable-stage-transition-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableStageTransition", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "StageNotFoundException" :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception}})))))
(clojure.spec.alpha/fdef disable-stage-transition :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/disable-stage-transition-input) :ret clojure.core/true?)

(clojure.core/defn delete-custom-action-type ([delete-custom-action-type-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-custom-action-type-input delete-custom-action-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/delete-custom-action-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCustomActionType", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef delete-custom-action-type :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/delete-custom-action-type-input) :ret clojure.core/true?)

(clojure.core/defn enable-stage-transition ([enable-stage-transition-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-stage-transition-input enable-stage-transition-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/enable-stage-transition-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableStageTransition", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "StageNotFoundException" :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception}})))))
(clojure.spec.alpha/fdef enable-stage-transition :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/enable-stage-transition-input) :ret clojure.core/true?)

(clojure.core/defn put-job-failure-result ([put-job-failure-result-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-job-failure-result-input put-job-failure-result-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-job-failure-result-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutJobFailureResult", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "InvalidJobStateException" :portkey.aws.codepipeline.-2015-07-09/invalid-job-state-exception}})))))
(clojure.spec.alpha/fdef put-job-failure-result :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-job-failure-result-input) :ret clojure.core/true?)

(clojure.core/defn put-approval-result ([put-approval-result-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-approval-result-input put-approval-result-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/put-approval-result-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-approval-result-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutApprovalResult", :http.request.spec/error-spec {"InvalidApprovalTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-approval-token-exception, "ApprovalAlreadyCompletedException" :portkey.aws.codepipeline.-2015-07-09/approval-already-completed-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "StageNotFoundException" :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception, "ActionNotFoundException" :portkey.aws.codepipeline.-2015-07-09/action-not-found-exception, "ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef put-approval-result :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-approval-result-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/put-approval-result-output))

(clojure.core/defn delete-pipeline ([delete-pipeline-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-pipeline-input delete-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/delete-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/delete-pipeline-input) :ret clojure.core/true?)

(clojure.core/defn put-action-revision ([put-action-revision-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-action-revision-input put-action-revision-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/put-action-revision-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/put-action-revision-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutActionRevision", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "StageNotFoundException" :portkey.aws.codepipeline.-2015-07-09/stage-not-found-exception, "ActionNotFoundException" :portkey.aws.codepipeline.-2015-07-09/action-not-found-exception, "ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception}})))))
(clojure.spec.alpha/fdef put-action-revision :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/put-action-revision-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/put-action-revision-output))

(clojure.core/defn get-pipeline-execution ([get-pipeline-execution-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-pipeline-execution-input get-pipeline-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPipelineExecution", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception, "PipelineExecutionNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-execution-not-found-exception}})))))
(clojure.spec.alpha/fdef get-pipeline-execution :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/get-pipeline-execution-output))

(clojure.core/defn get-job-details ([get-job-details-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-job-details-input get-job-details-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/get-job-details-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/get-job-details-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetJobDetails", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception}})))))
(clojure.spec.alpha/fdef get-job-details :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/get-job-details-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/get-job-details-output))

(clojure.core/defn list-action-types ([] (list-action-types {})) ([list-action-types-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-action-types-input list-action-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/list-action-types-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/list-action-types-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListActionTypes", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidNextTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-action-types :args (clojure.spec.alpha/? :portkey.aws.codepipeline.-2015-07-09/list-action-types-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/list-action-types-output))

(clojure.core/defn update-pipeline ([update-pipeline-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-pipeline-input update-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/update-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/update-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePipeline", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidStageDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-stage-declaration-exception, "InvalidActionDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-action-declaration-exception, "InvalidBlockerDeclarationException" :portkey.aws.codepipeline.-2015-07-09/invalid-blocker-declaration-exception, "InvalidStructureException" :portkey.aws.codepipeline.-2015-07-09/invalid-structure-exception, "LimitExceededException" :portkey.aws.codepipeline.-2015-07-09/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/update-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/update-pipeline-output))

(clojure.core/defn register-webhook-with-third-party ([] (register-webhook-with-third-party {})) ([register-webhook-with-third-party-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-register-webhook-with-third-party-input register-webhook-with-third-party-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterWebhookWithThirdParty", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "WebhookNotFoundException" :portkey.aws.codepipeline.-2015-07-09/webhook-not-found-exception}})))))
(clojure.spec.alpha/fdef register-webhook-with-third-party :args (clojure.spec.alpha/? :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/register-webhook-with-third-party-output))

(clojure.core/defn start-pipeline-execution ([start-pipeline-execution-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-pipeline-execution-input start-pipeline-execution-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartPipelineExecution", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "PipelineNotFoundException" :portkey.aws.codepipeline.-2015-07-09/pipeline-not-found-exception}})))))
(clojure.spec.alpha/fdef start-pipeline-execution :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/start-pipeline-execution-output))

(clojure.core/defn list-webhooks ([] (list-webhooks {})) ([list-webhooks-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-webhooks-input list-webhooks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/list-webhooks-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/list-webhooks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListWebhooks", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidNextTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-webhooks :args (clojure.spec.alpha/? :portkey.aws.codepipeline.-2015-07-09/list-webhooks-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/list-webhooks-output))

(clojure.core/defn acknowledge-third-party-job ([acknowledge-third-party-job-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-acknowledge-third-party-job-input acknowledge-third-party-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.codepipeline.-2015-07-09/endpoints, :http.request.spec/output-spec :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-07-09", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcknowledgeThirdPartyJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.codepipeline.-2015-07-09/validation-exception, "InvalidNonceException" :portkey.aws.codepipeline.-2015-07-09/invalid-nonce-exception, "JobNotFoundException" :portkey.aws.codepipeline.-2015-07-09/job-not-found-exception, "InvalidClientTokenException" :portkey.aws.codepipeline.-2015-07-09/invalid-client-token-exception}})))))
(clojure.spec.alpha/fdef acknowledge-third-party-job :args (clojure.spec.alpha/tuple :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-input) :ret (clojure.spec.alpha/and :portkey.aws.codepipeline.-2015-07-09/acknowledge-third-party-job-output))
