(ns portkey.aws.servicecatalog.-2015-12-10 (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "servicecatalog", :region "us-west-1"},
    :ssl-common-name "servicecatalog-fips.us-west-1.amazonaws.com",
    :endpoint "https://servicecatalog-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "servicecatalog", :region "ap-northeast-1"},
    :ssl-common-name "servicecatalog.ap-northeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "servicecatalog", :region "eu-west-1"},
    :ssl-common-name "servicecatalog.eu-west-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "servicecatalog", :region "us-east-2"},
    :ssl-common-name "servicecatalog.us-east-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "servicecatalog", :region "ap-southeast-2"},
    :ssl-common-name "servicecatalog.ap-southeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "servicecatalog", :region "sa-east-1"},
    :ssl-common-name "servicecatalog.sa-east-1.amazonaws.com",
    :endpoint "https://servicecatalog.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "servicecatalog", :region "ap-southeast-1"},
    :ssl-common-name "servicecatalog.ap-southeast-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "servicecatalog", :region "ap-northeast-2"},
    :ssl-common-name "servicecatalog.ap-northeast-2.amazonaws.com",
    :endpoint "https://servicecatalog.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "servicecatalog", :region "eu-west-3"},
    :ssl-common-name "servicecatalog.eu-west-3.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "servicecatalog", :region "us-east-2"},
    :ssl-common-name "servicecatalog-fips.us-east-2.amazonaws.com",
    :endpoint "https://servicecatalog-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "servicecatalog", :region "ca-central-1"},
    :ssl-common-name "servicecatalog.ca-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "servicecatalog", :region "eu-central-1"},
    :ssl-common-name "servicecatalog.eu-central-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "servicecatalog", :region "eu-west-2"},
    :ssl-common-name "servicecatalog.eu-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "servicecatalog", :region "us-east-1"},
    :ssl-common-name "servicecatalog-fips.us-east-1.amazonaws.com",
    :endpoint "https://servicecatalog-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "servicecatalog", :region "us-west-2"},
    :ssl-common-name "servicecatalog.us-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "servicecatalog", :region "us-west-2"},
    :ssl-common-name "servicecatalog-fips.us-west-2.amazonaws.com",
    :endpoint "https://servicecatalog-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "servicecatalog", :region "us-east-1"},
    :ssl-common-name "servicecatalog.us-east-1.amazonaws.com",
    :endpoint "https://servicecatalog.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "servicecatalog", :region "us-west-1"},
    :ssl-common-name "servicecatalog.us-west-1.amazonaws.com",
    :endpoint "https://servicecatalog.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "servicecatalog", :region "ap-south-1"},
    :ssl-common-name "servicecatalog.ap-south-1.amazonaws.com",
    :endpoint "https://servicecatalog.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "servicecatalog", :region "eu-north-1"},
    :ssl-common-name "servicecatalog.eu-north-1.amazonaws.com",
    :endpoint "https://servicecatalog.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-stack-set-accounts)

(clojure.core/declare ser-product-source)

(clojure.core/declare ser-service-action-definition-type)

(clojure.core/declare ser-principal-type)

(clojure.core/declare ser-product-view-filters)

(clojure.core/declare ser-service-action-association)

(clojure.core/declare ser-copy-options)

(clojure.core/declare ser-provisioned-product-view-filter-value)

(clojure.core/declare ser-portfolio-share-token)

(clojure.core/declare ser-support-description)

(clojure.core/declare ser-product-view-filter-values)

(clojure.core/declare ser-copy-option)

(clojure.core/declare ser-stack-set-operation-type)

(clojure.core/declare ser-product-arn)

(clojure.core/declare ser-provisioning-artifact-property-name)

(clojure.core/declare ser-provisioned-product-plan-name)

(clojure.core/declare ser-parameter-key)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-provisioned-product-plan-type)

(clojure.core/declare ser-provisioned-product-name)

(clojure.core/declare ser-tag-option-active)

(clojure.core/declare ser-product-view-short-description)

(clojure.core/declare ser-access-level-filter)

(clojure.core/declare ser-provisioning-artifact-active)

(clojure.core/declare ser-source-provisioning-artifact-properties)

(clojure.core/declare ser-provisioning-parameter)

(clojure.core/declare ser-provisioning-artifact-name)

(clojure.core/declare ser-provisioned-product-view-filter-values)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-tag-option-value)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-update-provisioning-parameters)

(clojure.core/declare ser-organization-node-value)

(clojure.core/declare ser-service-action-definition-key)

(clojure.core/declare ser-provisioning-artifact-property-value)

(clojure.core/declare ser-service-action-associations)

(clojure.core/declare ser-principal-arn)

(clojure.core/declare ser-service-action-definition-map)

(clojure.core/declare ser-search-filter-value)

(clojure.core/declare ser-provisioning-parameters)

(clojure.core/declare ser-provisioning-artifact-info)

(clojure.core/declare ser-stack-set-failure-tolerance-percentage)

(clojure.core/declare ser-ignore-errors)

(clojure.core/declare ser-update-provisioning-preferences)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-provisioning-artifact-info-value)

(clojure.core/declare ser-search-provisioned-products-page-size)

(clojure.core/declare ser-tag-option-id)

(clojure.core/declare ser-access-level-filter-key)

(clojure.core/declare ser-accept-language)

(clojure.core/declare ser-verbose)

(clojure.core/declare ser-service-action-definition-value)

(clojure.core/declare ser-portfolio-display-name)

(clojure.core/declare ser-notification-arns)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-product-view-filter-value)

(clojure.core/declare ser-provider-name)

(clojure.core/declare ser-stack-set-max-concurrency-percentage)

(clojure.core/declare ser-product-view-owner)

(clojure.core/declare ser-portfolio-description)

(clojure.core/declare ser-service-action-name)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-product-view-filter-by)

(clojure.core/declare ser-provisioning-artifact-info-key)

(clojure.core/declare ser-notification-arn)

(clojure.core/declare ser-sort-field)

(clojure.core/declare ser-provisioning-artifact-properties)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-provisioning-artifact-type)

(clojure.core/declare ser-source-provisioning-artifact-properties-map)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-list-tag-options-filters)

(clojure.core/declare ser-tag-option-key)

(clojure.core/declare ser-product-view-sort-by)

(clojure.core/declare ser-access-level-filter-value)

(clojure.core/declare ser-provisioned-product-filters)

(clojure.core/declare ser-constraint-parameters)

(clojure.core/declare ser-product-view-name)

(clojure.core/declare ser-provisioned-product-name-or-arn)

(clojure.core/declare ser-product-type)

(clojure.core/declare ser-stack-set-max-concurrency-count)

(clojure.core/declare ser-stack-set-failure-tolerance-count)

(clojure.core/declare ser-list-record-history-search-filter)

(clojure.core/declare ser-add-tags)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-stack-set-regions)

(clojure.core/declare ser-provisioned-product-view-filter-by)

(clojure.core/declare ser-provisioning-preferences)

(clojure.core/declare ser-organization-node)

(clojure.core/declare ser-constraint-description)

(clojure.core/declare ser-portfolio-share-type)

(clojure.core/declare ser-use-previous-value)

(clojure.core/declare ser-support-url)

(clojure.core/declare ser-provisioning-artifact-description)

(clojure.core/declare ser-service-action-description)

(clojure.core/declare ser-page-token)

(clojure.core/declare ser-region)

(clojure.core/declare ser-support-email)

(clojure.core/declare ser-constraint-type)

(clojure.core/declare ser-search-filter-key)

(clojure.core/declare ser-id)

(clojure.core/declare ser-organization-node-type)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-update-provisioning-parameter)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-stack-set-accounts [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-id coll) #:http.request.field{:shape "AccountId"}))) input), :shape "StackSetAccounts", :type "list"})

(clojure.core/defn- ser-product-source [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "ProductSource"})

(clojure.core/defn- ser-service-action-definition-type [input] #:http.request.field{:value (clojure.core/get {"SSM_AUTOMATION" "SSM_AUTOMATION", :ssm-automation "SSM_AUTOMATION"} input), :shape "ServiceActionDefinitionType"})

(clojure.core/defn- ser-principal-type [input] #:http.request.field{:value (clojure.core/get {"IAM" "IAM", :iam "IAM"} input), :shape "PrincipalType"})

(clojure.core/defn- ser-product-view-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-product-view-filter-by k) #:http.request.field{:map-info "key", :shape "ProductViewFilterBy"}) (clojure.core/into (ser-product-view-filter-values v) #:http.request.field{:map-info "value", :shape "ProductViewFilterValues"})])) input), :shape "ProductViewFilters", :type "map"})

(clojure.core/defn- ser-service-action-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-id (:service-action-id input)) #:http.request.field{:name "ServiceActionId", :shape "Id"}) (clojure.core/into (ser-id (:product-id input)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (:provisioning-artifact-id input)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})], :shape "ServiceActionAssociation", :type "structure"}))

(clojure.core/defn- ser-copy-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-copy-option coll) #:http.request.field{:shape "CopyOption"}))) input), :shape "CopyOptions", :type "list"})

(clojure.core/defn- ser-provisioned-product-view-filter-value [input] #:http.request.field{:value input, :shape "ProvisionedProductViewFilterValue"})

(clojure.core/defn- ser-portfolio-share-token [input] #:http.request.field{:value input, :shape "PortfolioShareToken"})

(clojure.core/defn- ser-support-description [input] #:http.request.field{:value input, :shape "SupportDescription"})

(clojure.core/defn- ser-product-view-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-product-view-filter-value coll) #:http.request.field{:shape "ProductViewFilterValue"}))) input), :shape "ProductViewFilterValues", :type "list"})

(clojure.core/defn- ser-copy-option [input] #:http.request.field{:value (clojure.core/get {"CopyTags" "CopyTags", :copy-tags "CopyTags"} input), :shape "CopyOption"})

(clojure.core/defn- ser-stack-set-operation-type [input] #:http.request.field{:value (clojure.core/get {"CREATE" "CREATE", :create "CREATE", "UPDATE" "UPDATE", :update "UPDATE", "DELETE" "DELETE", :delete "DELETE"} input), :shape "StackSetOperationType"})

(clojure.core/defn- ser-product-arn [input] #:http.request.field{:value input, :shape "ProductArn"})

(clojure.core/defn- ser-provisioning-artifact-property-name [input] #:http.request.field{:value (clojure.core/get {"Id" "Id", :id "Id"} input), :shape "ProvisioningArtifactPropertyName"})

(clojure.core/defn- ser-provisioned-product-plan-name [input] #:http.request.field{:value input, :shape "ProvisionedProductPlanName"})

(clojure.core/defn- ser-parameter-key [input] #:http.request.field{:value input, :shape "ParameterKey"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-provisioned-product-plan-type [input] #:http.request.field{:value (clojure.core/get {"CLOUDFORMATION" "CLOUDFORMATION", :cloudformation "CLOUDFORMATION"} input), :shape "ProvisionedProductPlanType"})

(clojure.core/defn- ser-provisioned-product-name [input] #:http.request.field{:value input, :shape "ProvisionedProductName"})

(clojure.core/defn- ser-tag-option-active [input] #:http.request.field{:value input, :shape "TagOptionActive"})

(clojure.core/defn- ser-product-view-short-description [input] #:http.request.field{:value input, :shape "ProductViewShortDescription"})

(clojure.core/defn- ser-access-level-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccessLevelFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter-key (input :key)) #:http.request.field{:name "Key", :shape "AccessLevelFilterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter-value (input :value)) #:http.request.field{:name "Value", :shape "AccessLevelFilterValue"}))))

(clojure.core/defn- ser-provisioning-artifact-active [input] #:http.request.field{:value input, :shape "ProvisioningArtifactActive"})

(clojure.core/defn- ser-source-provisioning-artifact-properties [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-source-provisioning-artifact-properties-map coll) #:http.request.field{:shape "SourceProvisioningArtifactPropertiesMap"}))) input), :shape "SourceProvisioningArtifactProperties", :type "list"})

(clojure.core/defn- ser-provisioning-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProvisioningParameter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key (input :key)) #:http.request.field{:name "Key", :shape "ParameterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :value)) #:http.request.field{:name "Value", :shape "ParameterValue"}))))

(clojure.core/defn- ser-provisioning-artifact-name [input] #:http.request.field{:value input, :shape "ProvisioningArtifactName"})

(clojure.core/defn- ser-provisioned-product-view-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-provisioned-product-view-filter-value coll) #:http.request.field{:shape "ProvisionedProductViewFilterValue"}))) input), :shape "ProvisionedProductViewFilterValues", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"ASCENDING" "ASCENDING", :ascending "ASCENDING", "DESCENDING" "DESCENDING", :descending "DESCENDING"} input), :shape "SortOrder"})

(clojure.core/defn- ser-tag-option-value [input] #:http.request.field{:value input, :shape "TagOptionValue"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list", :max 50})

(clojure.core/defn- ser-update-provisioning-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-update-provisioning-parameter coll) #:http.request.field{:shape "UpdateProvisioningParameter"}))) input), :shape "UpdateProvisioningParameters", :type "list"})

(clojure.core/defn- ser-organization-node-value [input] #:http.request.field{:value input, :shape "OrganizationNodeValue"})

(clojure.core/defn- ser-service-action-definition-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Version" "Version", :version "Version", "AssumeRole" "AssumeRole", :assume-role "AssumeRole", "Parameters" "Parameters", :parameters "Parameters"} input), :shape "ServiceActionDefinitionKey"})

(clojure.core/defn- ser-provisioning-artifact-property-value [input] #:http.request.field{:value input, :shape "ProvisioningArtifactPropertyValue"})

(clojure.core/defn- ser-service-action-associations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-action-association coll) #:http.request.field{:shape "ServiceActionAssociation"}))) input), :shape "ServiceActionAssociations", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-principal-arn [input] #:http.request.field{:value input, :shape "PrincipalARN"})

(clojure.core/defn- ser-service-action-definition-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-service-action-definition-key k) #:http.request.field{:map-info "key", :shape "ServiceActionDefinitionKey"}) (clojure.core/into (ser-service-action-definition-value v) #:http.request.field{:map-info "value", :shape "ServiceActionDefinitionValue"})])) input), :shape "ServiceActionDefinitionMap", :type "map", :max 100, :min 1})

(clojure.core/defn- ser-search-filter-value [input] #:http.request.field{:value input, :shape "SearchFilterValue"})

(clojure.core/defn- ser-provisioning-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-provisioning-parameter coll) #:http.request.field{:shape "ProvisioningParameter"}))) input), :shape "ProvisioningParameters", :type "list"})

(clojure.core/defn- ser-provisioning-artifact-info [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-provisioning-artifact-info-key k) #:http.request.field{:map-info "key", :shape "ProvisioningArtifactInfoKey"}) (clojure.core/into (ser-provisioning-artifact-info-value v) #:http.request.field{:map-info "value", :shape "ProvisioningArtifactInfoValue"})])) input), :shape "ProvisioningArtifactInfo", :type "map", :max 100, :min 1})

(clojure.core/defn- ser-stack-set-failure-tolerance-percentage [input] #:http.request.field{:value input, :shape "StackSetFailureTolerancePercentage"})

(clojure.core/defn- ser-ignore-errors [input] #:http.request.field{:value input, :shape "IgnoreErrors"})

(clojure.core/defn- ser-update-provisioning-preferences [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateProvisioningPreferences", :type "structure"} (clojure.core/contains? input :stack-set-accounts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-accounts (input :stack-set-accounts)) #:http.request.field{:name "StackSetAccounts", :shape "StackSetAccounts"})) (clojure.core/contains? input :stack-set-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-regions (input :stack-set-regions)) #:http.request.field{:name "StackSetRegions", :shape "StackSetRegions"})) (clojure.core/contains? input :stack-set-failure-tolerance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-failure-tolerance-count (input :stack-set-failure-tolerance-count)) #:http.request.field{:name "StackSetFailureToleranceCount", :shape "StackSetFailureToleranceCount"})) (clojure.core/contains? input :stack-set-failure-tolerance-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-failure-tolerance-percentage (input :stack-set-failure-tolerance-percentage)) #:http.request.field{:name "StackSetFailureTolerancePercentage", :shape "StackSetFailureTolerancePercentage"})) (clojure.core/contains? input :stack-set-max-concurrency-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-max-concurrency-count (input :stack-set-max-concurrency-count)) #:http.request.field{:name "StackSetMaxConcurrencyCount", :shape "StackSetMaxConcurrencyCount"})) (clojure.core/contains? input :stack-set-max-concurrency-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-max-concurrency-percentage (input :stack-set-max-concurrency-percentage)) #:http.request.field{:name "StackSetMaxConcurrencyPercentage", :shape "StackSetMaxConcurrencyPercentage"})) (clojure.core/contains? input :stack-set-operation-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-operation-type (input :stack-set-operation-type)) #:http.request.field{:name "StackSetOperationType", :shape "StackSetOperationType"}))))

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-provisioning-artifact-info-value [input] #:http.request.field{:value input, :shape "ProvisioningArtifactInfoValue"})

(clojure.core/defn- ser-search-provisioned-products-page-size [input] #:http.request.field{:value input, :shape "SearchProvisionedProductsPageSize"})

(clojure.core/defn- ser-tag-option-id [input] #:http.request.field{:value input, :shape "TagOptionId"})

(clojure.core/defn- ser-access-level-filter-key [input] #:http.request.field{:value (clojure.core/get {"Account" "Account", :account "Account", "Role" "Role", :role "Role", "User" "User", :user "User"} input), :shape "AccessLevelFilterKey"})

(clojure.core/defn- ser-accept-language [input] #:http.request.field{:value input, :shape "AcceptLanguage"})

(clojure.core/defn- ser-verbose [input] #:http.request.field{:value input, :shape "Verbose"})

(clojure.core/defn- ser-service-action-definition-value [input] #:http.request.field{:value input, :shape "ServiceActionDefinitionValue"})

(clojure.core/defn- ser-portfolio-display-name [input] #:http.request.field{:value input, :shape "PortfolioDisplayName"})

(clojure.core/defn- ser-notification-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notification-arn coll) #:http.request.field{:shape "NotificationArn"}))) input), :shape "NotificationArns", :type "list", :max 5})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-product-view-filter-value [input] #:http.request.field{:value input, :shape "ProductViewFilterValue"})

(clojure.core/defn- ser-provider-name [input] #:http.request.field{:value input, :shape "ProviderName"})

(clojure.core/defn- ser-stack-set-max-concurrency-percentage [input] #:http.request.field{:value input, :shape "StackSetMaxConcurrencyPercentage"})

(clojure.core/defn- ser-product-view-owner [input] #:http.request.field{:value input, :shape "ProductViewOwner"})

(clojure.core/defn- ser-portfolio-description [input] #:http.request.field{:value input, :shape "PortfolioDescription"})

(clojure.core/defn- ser-service-action-name [input] #:http.request.field{:value input, :shape "ServiceActionName"})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-product-view-filter-by [input] #:http.request.field{:value (clojure.core/get {"FullTextSearch" "FullTextSearch", :full-text-search "FullTextSearch", "Owner" "Owner", :owner "Owner", "ProductType" "ProductType", :product-type "ProductType", "SourceProductId" "SourceProductId", :source-product-id "SourceProductId"} input), :shape "ProductViewFilterBy"})

(clojure.core/defn- ser-provisioning-artifact-info-key [input] #:http.request.field{:value input, :shape "ProvisioningArtifactInfoKey"})

(clojure.core/defn- ser-notification-arn [input] #:http.request.field{:value input, :shape "NotificationArn"})

(clojure.core/defn- ser-sort-field [input] #:http.request.field{:value input, :shape "SortField"})

(clojure.core/defn- ser-provisioning-artifact-properties [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-provisioning-artifact-info (:info input)) #:http.request.field{:name "Info", :shape "ProvisioningArtifactInfo"})], :shape "ProvisioningArtifactProperties", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-name (input :name)) #:http.request.field{:name "Name", :shape "ProvisioningArtifactName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "ProvisioningArtifactDescription"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-type (input :type)) #:http.request.field{:name "Type", :shape "ProvisioningArtifactType"}))))

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value input, :shape "ResourceType"})

(clojure.core/defn- ser-provisioning-artifact-type [input] #:http.request.field{:value (clojure.core/get {"CLOUD_FORMATION_TEMPLATE" "CLOUD_FORMATION_TEMPLATE", :cloud-formation-template "CLOUD_FORMATION_TEMPLATE", "MARKETPLACE_AMI" "MARKETPLACE_AMI", :marketplace-ami "MARKETPLACE_AMI", "MARKETPLACE_CAR" "MARKETPLACE_CAR", :marketplace-car "MARKETPLACE_CAR"} input), :shape "ProvisioningArtifactType"})

(clojure.core/defn- ser-source-provisioning-artifact-properties-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-provisioning-artifact-property-name k) #:http.request.field{:map-info "key", :shape "ProvisioningArtifactPropertyName"}) (clojure.core/into (ser-provisioning-artifact-property-value v) #:http.request.field{:map-info "value", :shape "ProvisioningArtifactPropertyValue"})])) input), :shape "SourceProvisioningArtifactPropertiesMap", :type "map"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-list-tag-options-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListTagOptionsFilters", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-key (input :key)) #:http.request.field{:name "Key", :shape "TagOptionKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-value (input :value)) #:http.request.field{:name "Value", :shape "TagOptionValue"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-active (input :active)) #:http.request.field{:name "Active", :shape "TagOptionActive"}))))

(clojure.core/defn- ser-tag-option-key [input] #:http.request.field{:value input, :shape "TagOptionKey"})

(clojure.core/defn- ser-product-view-sort-by [input] #:http.request.field{:value (clojure.core/get {"Title" "Title", :title "Title", "VersionCount" "VersionCount", :version-count "VersionCount", "CreationDate" "CreationDate", :creation-date "CreationDate"} input), :shape "ProductViewSortBy"})

(clojure.core/defn- ser-access-level-filter-value [input] #:http.request.field{:value input, :shape "AccessLevelFilterValue"})

(clojure.core/defn- ser-provisioned-product-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-provisioned-product-view-filter-by k) #:http.request.field{:map-info "key", :shape "ProvisionedProductViewFilterBy"}) (clojure.core/into (ser-provisioned-product-view-filter-values v) #:http.request.field{:map-info "value", :shape "ProvisionedProductViewFilterValues"})])) input), :shape "ProvisionedProductFilters", :type "map"})

(clojure.core/defn- ser-constraint-parameters [input] #:http.request.field{:value input, :shape "ConstraintParameters"})

(clojure.core/defn- ser-product-view-name [input] #:http.request.field{:value input, :shape "ProductViewName"})

(clojure.core/defn- ser-provisioned-product-name-or-arn [input] #:http.request.field{:value input, :shape "ProvisionedProductNameOrArn"})

(clojure.core/defn- ser-product-type [input] #:http.request.field{:value (clojure.core/get {"CLOUD_FORMATION_TEMPLATE" "CLOUD_FORMATION_TEMPLATE", :cloud-formation-template "CLOUD_FORMATION_TEMPLATE", "MARKETPLACE" "MARKETPLACE", :marketplace "MARKETPLACE"} input), :shape "ProductType"})

(clojure.core/defn- ser-stack-set-max-concurrency-count [input] #:http.request.field{:value input, :shape "StackSetMaxConcurrencyCount"})

(clojure.core/defn- ser-stack-set-failure-tolerance-count [input] #:http.request.field{:value input, :shape "StackSetFailureToleranceCount"})

(clojure.core/defn- ser-list-record-history-search-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListRecordHistorySearchFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-filter-key (input :key)) #:http.request.field{:name "Key", :shape "SearchFilterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-filter-value (input :value)) #:http.request.field{:name "Value", :shape "SearchFilterValue"}))))

(clojure.core/defn- ser-add-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "AddTags", :type "list", :max 20})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-stack-set-regions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-region coll) #:http.request.field{:shape "Region"}))) input), :shape "StackSetRegions", :type "list"})

(clojure.core/defn- ser-provisioned-product-view-filter-by [input] #:http.request.field{:value (clojure.core/get {"SearchQuery" "SearchQuery", :search-query "SearchQuery"} input), :shape "ProvisionedProductViewFilterBy"})

(clojure.core/defn- ser-provisioning-preferences [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProvisioningPreferences", :type "structure"} (clojure.core/contains? input :stack-set-accounts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-accounts (input :stack-set-accounts)) #:http.request.field{:name "StackSetAccounts", :shape "StackSetAccounts"})) (clojure.core/contains? input :stack-set-regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-regions (input :stack-set-regions)) #:http.request.field{:name "StackSetRegions", :shape "StackSetRegions"})) (clojure.core/contains? input :stack-set-failure-tolerance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-failure-tolerance-count (input :stack-set-failure-tolerance-count)) #:http.request.field{:name "StackSetFailureToleranceCount", :shape "StackSetFailureToleranceCount"})) (clojure.core/contains? input :stack-set-failure-tolerance-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-failure-tolerance-percentage (input :stack-set-failure-tolerance-percentage)) #:http.request.field{:name "StackSetFailureTolerancePercentage", :shape "StackSetFailureTolerancePercentage"})) (clojure.core/contains? input :stack-set-max-concurrency-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-max-concurrency-count (input :stack-set-max-concurrency-count)) #:http.request.field{:name "StackSetMaxConcurrencyCount", :shape "StackSetMaxConcurrencyCount"})) (clojure.core/contains? input :stack-set-max-concurrency-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stack-set-max-concurrency-percentage (input :stack-set-max-concurrency-percentage)) #:http.request.field{:name "StackSetMaxConcurrencyPercentage", :shape "StackSetMaxConcurrencyPercentage"}))))

(clojure.core/defn- ser-organization-node [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OrganizationNode", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-node-type (input :type)) #:http.request.field{:name "Type", :shape "OrganizationNodeType"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-node-value (input :value)) #:http.request.field{:name "Value", :shape "OrganizationNodeValue"}))))

(clojure.core/defn- ser-constraint-description [input] #:http.request.field{:value input, :shape "ConstraintDescription"})

(clojure.core/defn- ser-portfolio-share-type [input] #:http.request.field{:value (clojure.core/get {"IMPORTED" "IMPORTED", :imported "IMPORTED", "AWS_SERVICECATALOG" "AWS_SERVICECATALOG", :aws-servicecatalog "AWS_SERVICECATALOG", "AWS_ORGANIZATIONS" "AWS_ORGANIZATIONS", :aws-organizations "AWS_ORGANIZATIONS"} input), :shape "PortfolioShareType"})

(clojure.core/defn- ser-use-previous-value [input] #:http.request.field{:value input, :shape "UsePreviousValue"})

(clojure.core/defn- ser-support-url [input] #:http.request.field{:value input, :shape "SupportUrl"})

(clojure.core/defn- ser-provisioning-artifact-description [input] #:http.request.field{:value input, :shape "ProvisioningArtifactDescription"})

(clojure.core/defn- ser-service-action-description [input] #:http.request.field{:value input, :shape "ServiceActionDescription"})

(clojure.core/defn- ser-page-token [input] #:http.request.field{:value input, :shape "PageToken"})

(clojure.core/defn- ser-region [input] #:http.request.field{:value input, :shape "Region"})

(clojure.core/defn- ser-support-email [input] #:http.request.field{:value input, :shape "SupportEmail"})

(clojure.core/defn- ser-constraint-type [input] #:http.request.field{:value input, :shape "ConstraintType"})

(clojure.core/defn- ser-search-filter-key [input] #:http.request.field{:value input, :shape "SearchFilterKey"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-organization-node-type [input] #:http.request.field{:value (clojure.core/get {"ORGANIZATION" "ORGANIZATION", :organization "ORGANIZATION", "ORGANIZATIONAL_UNIT" "ORGANIZATIONAL_UNIT", :organizational-unit "ORGANIZATIONAL_UNIT", "ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "OrganizationNodeType"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- ser-update-provisioning-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateProvisioningParameter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key (input :key)) #:http.request.field{:name "Key", :shape "ParameterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :value)) #:http.request.field{:name "Value", :shape "ParameterValue"})) (clojure.core/contains? input :use-previous-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-value (input :use-previous-value)) #:http.request.field{:name "UsePreviousValue", :shape "UsePreviousValue"}))))

(clojure.core/defn- req-copy-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-arn (input :source-product-arn)) #:http.request.field{:name "SourceProductArn", :shape "ProductArn"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :target-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :target-product-id)) #:http.request.field{:name "TargetProductId", :shape "Id"})) (clojure.core/contains? input :target-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-name (input :target-product-name)) #:http.request.field{:name "TargetProductName", :shape "ProductViewName"})) (clojure.core/contains? input :source-provisioning-artifact-identifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-provisioning-artifact-properties (input :source-provisioning-artifact-identifiers)) #:http.request.field{:name "SourceProvisioningArtifactIdentifiers", :shape "SourceProvisioningArtifactProperties"})) (clojure.core/contains? input :copy-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-options (input :copy-options)) #:http.request.field{:name "CopyOptions", :shape "CopyOptions"}))))

(clojure.core/defn- req-describe-copy-product-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :copy-product-token)) #:http.request.field{:name "CopyProductToken", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-service-actions-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-describe-record-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-create-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-view-name (input :name)) #:http.request.field{:name "Name", :shape "ProductViewName"}) (clojure.core/into (ser-product-view-owner (input :owner)) #:http.request.field{:name "Owner", :shape "ProductViewOwner"}) (clojure.core/into (ser-product-type (input :product-type)) #:http.request.field{:name "ProductType", :shape "ProductType"}) (clojure.core/into (ser-provisioning-artifact-properties (input :provisioning-artifact-parameters)) #:http.request.field{:name "ProvisioningArtifactParameters", :shape "ProvisioningArtifactProperties"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :support-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-description (input :support-description)) #:http.request.field{:name "SupportDescription", :shape "SupportDescription"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :tags)) #:http.request.field{:name "Tags", :shape "AddTags"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-short-description (input :description)) #:http.request.field{:name "Description", :shape "ProductViewShortDescription"})) (clojure.core/contains? input :distributor) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :distributor)) #:http.request.field{:name "Distributor", :shape "ProductViewOwner"})) (clojure.core/contains? input :support-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-url (input :support-url)) #:http.request.field{:name "SupportUrl", :shape "SupportUrl"})) (clojure.core/contains? input :support-email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-email (input :support-email)) #:http.request.field{:name "SupportEmail", :shape "SupportEmail"}))))

(clojure.core/defn- req-create-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-constraint-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "ConstraintParameters"}) (clojure.core/into (ser-constraint-type (input :type)) #:http.request.field{:name "Type", :shape "ConstraintType"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-constraint-description (input :description)) #:http.request.field{:name "Description", :shape "ConstraintDescription"}))))

(clojure.core/defn- req-update-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-constraint-description (input :description)) #:http.request.field{:name "Description", :shape "ConstraintDescription"}))))

(clojure.core/defn- req-delete-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :organization-node) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-node (input :organization-node)) #:http.request.field{:name "OrganizationNode", :shape "OrganizationNode"}))))

(clojure.core/defn- req-create-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-portfolio-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "PortfolioDisplayName"}) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderName"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-description (input :description)) #:http.request.field{:name "Description", :shape "PortfolioDescription"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :tags)) #:http.request.field{:name "Tags", :shape "AddTags"}))))

(clojure.core/defn- req-update-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-action-name (input :name)) #:http.request.field{:name "Name", :shape "ServiceActionName"})) (clojure.core/contains? input :definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-action-definition-map (input :definition)) #:http.request.field{:name "Definition", :shape "ServiceActionDefinitionMap"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-action-description (input :description)) #:http.request.field{:name "Description", :shape "ServiceActionDescription"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-batch-associate-service-action-with-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-action-associations (input :service-action-associations)) #:http.request.field{:name "ServiceActionAssociations", :shape "ServiceActionAssociations"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-batch-disassociate-service-action-from-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-action-associations (input :service-action-associations)) #:http.request.field{:name "ServiceActionAssociations", :shape "ServiceActionAssociations"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-search-provisioned-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProvisionedProductFilters"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-field (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortField"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-provisioned-products-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "SearchProvisionedProductsPageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-execute-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-launch-paths-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-disassociate-service-action-from-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-id (input :service-action-id)) #:http.request.field{:name "ServiceActionId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-provisioned-product-plans-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :provision-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provision-product-id)) #:http.request.field{:name "ProvisionProductId", :shape "Id"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"}))))

(clojure.core/defn- req-delete-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-principals-for-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-create-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-provisioned-product-plan-name (input :plan-name)) #:http.request.field{:name "PlanName", :shape "ProvisionedProductPlanName"}) (clojure.core/into (ser-provisioned-product-plan-type (input :plan-type)) #:http.request.field{:name "PlanType", :shape "ProvisionedProductPlanType"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-provisioned-product-name (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductName"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "UpdateProvisioningParameters"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :notification-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-arns (input :notification-arns)) #:http.request.field{:name "NotificationArns", :shape "NotificationArns"}))))

(clojure.core/defn- req-delete-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]}))

(clojure.core/defn- req-list-record-history-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :search-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-record-history-search-filter (input :search-filter)) #:http.request.field{:name "SearchFilter", :shape "ListRecordHistorySearchFilter"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-describe-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-provision-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-provisioned-product-name (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductName"}) (clojure.core/into (ser-idempotency-token (input :provision-token)) #:http.request.field{:name "ProvisionToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "ProvisioningParameters"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :notification-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-arns (input :notification-arns)) #:http.request.field{:name "NotificationArns", :shape "NotificationArns"})) (clojure.core/contains? input :provisioning-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-preferences (input :provisioning-preferences)) #:http.request.field{:name "ProvisioningPreferences", :shape "ProvisioningPreferences"}))))

(clojure.core/defn- req-scan-provisioned-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-accept-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :portfolio-share-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-share-type (input :portfolio-share-type)) #:http.request.field{:name "PortfolioShareType", :shape "PortfolioShareType"}))))

(clojure.core/defn- req-list-resources-for-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]} (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceType"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-delete-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-portfolio-share-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-portfolio-share-token (input :portfolio-share-token)) #:http.request.field{:name "PortfolioShareToken", :shape "PortfolioShareToken"})]}))

(clojure.core/defn- req-search-products-as-admin-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :portfolio-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProductViewFilters"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ProductViewSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :product-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-source (input :product-source)) #:http.request.field{:name "ProductSource", :shape "ProductSource"}))))

(clojure.core/defn- req-associate-principal-with-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-principal-arn (input :principal-arn)) #:http.request.field{:name "PrincipalARN", :shape "PrincipalARN"}) (clojure.core/into (ser-principal-type (input :principal-type)) #:http.request.field{:name "PrincipalType", :shape "PrincipalType"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-update-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "PortfolioDisplayName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-description (input :description)) #:http.request.field{:name "Description", :shape "PortfolioDescription"})) (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderName"})) (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :add-tags)) #:http.request.field{:name "AddTags", :shape "AddTags"})) (clojure.core/contains? input :remove-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-keys (input :remove-tags)) #:http.request.field{:name "RemoveTags", :shape "TagKeys"}))))

(clojure.core/defn- req-create-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :organization-node) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-node (input :organization-node)) #:http.request.field{:name "OrganizationNode", :shape "OrganizationNode"}))))

(clojure.core/defn- req-update-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :remove-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-keys (input :remove-tags)) #:http.request.field{:name "RemoveTags", :shape "TagKeys"})) (clojure.core/contains? input :support-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-description (input :support-description)) #:http.request.field{:name "SupportDescription", :shape "SupportDescription"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-short-description (input :description)) #:http.request.field{:name "Description", :shape "ProductViewShortDescription"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :owner)) #:http.request.field{:name "Owner", :shape "ProductViewOwner"})) (clojure.core/contains? input :distributor) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :distributor)) #:http.request.field{:name "Distributor", :shape "ProductViewOwner"})) (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :add-tags)) #:http.request.field{:name "AddTags", :shape "AddTags"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-name (input :name)) #:http.request.field{:name "Name", :shape "ProductViewName"})) (clojure.core/contains? input :support-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-url (input :support-url)) #:http.request.field{:name "SupportUrl", :shape "SupportUrl"})) (clojure.core/contains? input :support-email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-email (input :support-email)) #:http.request.field{:name "SupportEmail", :shape "SupportEmail"}))))

(clojure.core/defn- req-describe-provisioning-parameters-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"}))))

(clojure.core/defn- req-list-tag-options-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tag-options-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ListTagOptionsFilters"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-delete-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-disassociate-principal-from-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-principal-arn (input :principal-arn)) #:http.request.field{:name "PrincipalARN", :shape "PrincipalARN"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-disassociate-tag-option-from-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]}))

(clojure.core/defn- req-describe-product-view-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-organization-portfolio-access-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-organization-node-type (input :organization-node-type)) #:http.request.field{:name "OrganizationNodeType", :shape "OrganizationNodeType"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-create-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-provisioning-artifact-properties (input :parameters)) #:http.request.field{:name "Parameters", :shape "ProvisioningArtifactProperties"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-provisioning-artifacts-for-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :service-action-id)) #:http.request.field{:name "ServiceActionId", :shape "Id"})]} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-update-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-idempotency-token (input :update-token)) #:http.request.field{:name "UpdateToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :provisioned-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-name-or-arn (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductNameOrArn"})) (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "UpdateProvisioningParameters"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :provisioned-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioned-product-id)) #:http.request.field{:name "ProvisionedProductId", :shape "Id"})) (clojure.core/contains? input :provisioning-artifact-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})) (clojure.core/contains? input :provisioning-preferences) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-provisioning-preferences (input :provisioning-preferences)) #:http.request.field{:name "ProvisioningPreferences", :shape "UpdateProvisioningPreferences"})) (clojure.core/contains? input :product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}))))

(clojure.core/defn- req-describe-product-as-admin-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-reject-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :portfolio-share-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-share-type (input :portfolio-share-type)) #:http.request.field{:name "PortfolioShareType", :shape "PortfolioShareType"}))))

(clojure.core/defn- req-delete-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :ignore-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ignore-errors (input :ignore-errors)) #:http.request.field{:name "IgnoreErrors", :shape "IgnoreErrors"}))))

(clojure.core/defn- req-terminate-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-idempotency-token (input :terminate-token)) #:http.request.field{:name "TerminateToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :provisioned-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-name-or-arn (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductNameOrArn"})) (clojure.core/contains? input :provisioned-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioned-product-id)) #:http.request.field{:name "ProvisionedProductId", :shape "Id"})) (clojure.core/contains? input :ignore-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ignore-errors (input :ignore-errors)) #:http.request.field{:name "IgnoreErrors", :shape "IgnoreErrors"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-portfolio-access-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-portfolios-for-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-disassociate-product-from-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-get-aws-organizations-access-status-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-associate-product-with-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :source-portfolio-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :source-portfolio-id)) #:http.request.field{:name "SourcePortfolioId", :shape "Id"}))))

(clojure.core/defn- req-describe-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-delete-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-execute-provisioned-product-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :provisioned-product-id)) #:http.request.field{:name "ProvisionedProductId", :shape "Id"}) (clojure.core/into (ser-id (input :service-action-id)) #:http.request.field{:name "ServiceActionId", :shape "Id"}) (clojure.core/into (ser-idempotency-token (input :execute-token)) #:http.request.field{:name "ExecuteToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-provisioning-artifacts-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-associate-tag-option-with-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]}))

(clojure.core/defn- req-describe-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-disable-aws-organizations-access-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-key (input :key)) #:http.request.field{:name "Key", :shape "TagOptionKey"}) (clojure.core/into (ser-tag-option-value (input :value)) #:http.request.field{:name "Value", :shape "TagOptionValue"})]}))

(clojure.core/defn- req-update-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-name (input :name)) #:http.request.field{:name "Name", :shape "ProvisioningArtifactName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "ProvisioningArtifactDescription"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-active (input :active)) #:http.request.field{:name "Active", :shape "ProvisioningArtifactActive"}))))

(clojure.core/defn- req-list-portfolios-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-enable-aws-organizations-access-input [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]}))

(clojure.core/defn- req-associate-service-action-with-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-id (input :service-action-id)) #:http.request.field{:name "ServiceActionId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :verbose) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verbose (input :verbose)) #:http.request.field{:name "Verbose", :shape "Verbose"}))))

(clojure.core/defn- req-delete-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-create-service-action-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-action-name (input :name)) #:http.request.field{:name "Name", :shape "ServiceActionName"}) (clojure.core/into (ser-service-action-definition-type (input :definition-type)) #:http.request.field{:name "DefinitionType", :shape "ServiceActionDefinitionType"}) (clojure.core/into (ser-service-action-definition-map (input :definition)) #:http.request.field{:name "Definition", :shape "ServiceActionDefinitionMap"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-action-description (input :description)) #:http.request.field{:name "Description", :shape "ServiceActionDescription"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-accepted-portfolio-shares-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :portfolio-share-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-share-type (input :portfolio-share-type)) #:http.request.field{:name "PortfolioShareType", :shape "PortfolioShareType"}))))

(clojure.core/defn- req-update-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-value (input :value)) #:http.request.field{:name "Value", :shape "TagOptionValue"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-active (input :active)) #:http.request.field{:name "Active", :shape "TagOptionActive"}))))

(clojure.core/defn- req-list-service-actions-for-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-search-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProductViewFilters"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ProductViewSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-list-constraints-for-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/declare deser-resource-change)

(clojure.core/declare deser-stack-set-accounts)

(clojure.core/declare deser-service-action-definition-type)

(clojure.core/declare deser-principal-type)

(clojure.core/declare deser-physical-resource-id)

(clojure.core/declare deser-launch-path-summaries)

(clojure.core/declare deser-record-tags)

(clojure.core/declare deser-portfolio-share-token)

(clojure.core/declare deser-support-description)

(clojure.core/declare deser-resource-changes)

(clojure.core/declare deser-provisioning-artifact-summaries)

(clojure.core/declare deser-product-view-detail)

(clojure.core/declare deser-logical-resource-id)

(clojure.core/declare deser-parameter-type)

(clojure.core/declare deser-total-results-count)

(clojure.core/declare deser-user-arn-session)

(clojure.core/declare deser-provisioned-product-plan-name)

(clojure.core/declare deser-parameter-key)

(clojure.core/declare deser-provisioned-product-attributes)

(clojure.core/declare deser-constraint-detail)

(clojure.core/declare deser-resource-details)

(clojure.core/declare deser-resource-detail-id)

(clojure.core/declare deser-approximate-count)

(clojure.core/declare deser-property-name)

(clojure.core/declare deser-provisioned-product-plan-type)

(clojure.core/declare deser-product-view-aggregations)

(clojure.core/declare deser-provisioned-product-name)

(clojure.core/declare deser-product-view-details)

(clojure.core/declare deser-tag-option-active)

(clojure.core/declare deser-product-view-short-description)

(clojure.core/declare deser-provisioning-artifact-parameters)

(clojure.core/declare deser-usage-instructions)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-record-status)

(clojure.core/declare deser-provisioning-artifact-active)

(clojure.core/declare deser-organization-nodes)

(clojure.core/declare deser-provisioning-artifact-name)

(clojure.core/declare deser-record-details)

(clojure.core/declare deser-provisioned-product-plan-status)

(clojure.core/declare deser-change-action)

(clojure.core/declare deser-allowed-values)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tag-option-value)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-evaluation-type)

(clojure.core/declare deser-update-provisioning-parameters)

(clojure.core/declare deser-organization-node-value)

(clojure.core/declare deser-service-action-definition-key)

(clojure.core/declare deser-provisioning-artifact-created-time)

(clojure.core/declare deser-resource-detail-arn)

(clojure.core/declare deser-successful-shares)

(clojure.core/declare deser-provisioning-artifact)

(clojure.core/declare deser-provisioning-artifact-detail)

(clojure.core/declare deser-cloud-watch-dashboards)

(clojure.core/declare deser-has-default-path)

(clojure.core/declare deser-provisioned-product-plans)

(clojure.core/declare deser-status)

(clojure.core/declare deser-principal-arn)

(clojure.core/declare deser-service-action-definition-map)

(clojure.core/declare deser-record-detail)

(clojure.core/declare deser-requires-recreation)

(clojure.core/declare deser-provisioning-artifact-info)

(clojure.core/declare deser-tag-option-values)

(clojure.core/declare deser-instruction-type)

(clojure.core/declare deser-provisioning-artifact-info-value)

(clojure.core/declare deser-record-error)

(clojure.core/declare deser-provisioned-product-plan-summary)

(clojure.core/declare deser-status-detail)

(clojure.core/declare deser-created-time)

(clojure.core/declare deser-provisioning-artifact-views)

(clojure.core/declare deser-tag-option-id)

(clojure.core/declare deser-service-action-association-error-message)

(clojure.core/declare deser-portfolio-detail)

(clojure.core/declare deser-provisioning-artifact-preferences)

(clojure.core/declare deser-share-status)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-last-request-id)

(clojure.core/declare deser-record-output)

(clojure.core/declare deser-service-action-definition-value)

(clojure.core/declare deser-resource-attribute)

(clojure.core/declare deser-portfolio-display-name)

(clojure.core/declare deser-notification-arns)

(clojure.core/declare deser-provisioned-product-status-message)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-resource-detail-created-time)

(clojure.core/declare deser-physical-id)

(clojure.core/declare deser-message)

(clojure.core/declare deser-product-view-summary)

(clojure.core/declare deser-provider-name)

(clojure.core/declare deser-product-view-owner)

(clojure.core/declare deser-record-tag-key)

(clojure.core/declare deser-provisioning-artifact-details)

(clojure.core/declare deser-portfolio-description)

(clojure.core/declare deser-record-tag)

(clojure.core/declare deser-resource-target-definition)

(clojure.core/declare deser-provisioning-artifact-summary)

(clojure.core/declare deser-cloud-watch-dashboard)

(clojure.core/declare deser-record-type)

(clojure.core/declare deser-service-action-name)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-share-error)

(clojure.core/declare deser-provisioning-artifact-info-key)

(clojure.core/declare deser-cloud-watch-dashboard-name)

(clojure.core/declare deser-instruction-value)

(clojure.core/declare deser-error-description)

(clojure.core/declare deser-notification-arn)

(clojure.core/declare deser-provisioned-product-id)

(clojure.core/declare deser-namespaces)

(clojure.core/declare deser-resource-detail-description)

(clojure.core/declare deser-provisioning-artifact-type)

(clojure.core/declare deser-creation-time)

(clojure.core/declare deser-access-status)

(clojure.core/declare deser-resource-change-details)

(clojure.core/declare deser-idempotency-token)

(clojure.core/declare deser-portfolio-details)

(clojure.core/declare deser-product-view-summaries)

(clojure.core/declare deser-provisioned-product-plan-details)

(clojure.core/declare deser-tag-option-key)

(clojure.core/declare deser-tag-option-detail)

(clojure.core/declare deser-failed-service-action-associations)

(clojure.core/declare deser-constraint-summaries)

(clojure.core/declare deser-default-value)

(clojure.core/declare deser-product-view-aggregation-values)

(clojure.core/declare deser-launch-path-summary)

(clojure.core/declare deser-allowed-value)

(clojure.core/declare deser-failed-service-action-association)

(clojure.core/declare deser-resource-detail-name)

(clojure.core/declare deser-constraint-parameters)

(clojure.core/declare deser-provisioned-product-detail)

(clojure.core/declare deser-product-view-name)

(clojure.core/declare deser-provisioned-product-name-or-arn)

(clojure.core/declare deser-product-type)

(clojure.core/declare deser-product-view-aggregation-type)

(clojure.core/declare deser-record-errors)

(clojure.core/declare deser-updated-time)

(clojure.core/declare deser-product-view-distributor)

(clojure.core/declare deser-resource-detail)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-stack-set-regions)

(clojure.core/declare deser-replacement)

(clojure.core/declare deser-organization-node)

(clojure.core/declare deser-error)

(clojure.core/declare deser-service-action-detail)

(clojure.core/declare deser-tag-option-details)

(clojure.core/declare deser-usage-instruction)

(clojure.core/declare deser-no-echo)

(clojure.core/declare deser-constraint-description)

(clojure.core/declare deser-provisioned-product-details)

(clojure.core/declare deser-service-action-summary)

(clojure.core/declare deser-use-previous-value)

(clojure.core/declare deser-output-value)

(clojure.core/declare deser-resource-change-detail)

(clojure.core/declare deser-support-url)

(clojure.core/declare deser-constraint-summary)

(clojure.core/declare deser-tag-option-summary)

(clojure.core/declare deser-account-ids)

(clojure.core/declare deser-principal)

(clojure.core/declare deser-constraint-details)

(clojure.core/declare deser-plan-resource-type)

(clojure.core/declare deser-provisioned-product-status)

(clojure.core/declare deser-copy-product-status)

(clojure.core/declare deser-share-errors)

(clojure.core/declare deser-output-key)

(clojure.core/declare deser-provisioning-artifact-description)

(clojure.core/declare deser-service-action-association-error-code)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-product-view-aggregation-value)

(clojure.core/declare deser-service-action-description)

(clojure.core/declare deser-record-outputs)

(clojure.core/declare deser-page-token)

(clojure.core/declare deser-region)

(clojure.core/declare deser-support-email)

(clojure.core/declare deser-tag-option-summaries)

(clojure.core/declare deser-constraint-type)

(clojure.core/declare deser-scope)

(clojure.core/declare deser-provisioning-artifacts)

(clojure.core/declare deser-record-tag-value)

(clojure.core/declare deser-user-arn)

(clojure.core/declare deser-service-action-summaries)

(clojure.core/declare deser-provisioned-product-attribute)

(clojure.core/declare deser-id)

(clojure.core/declare deser-parameter-constraints)

(clojure.core/declare deser-organization-node-type)

(clojure.core/declare deser-provisioned-product-type)

(clojure.core/declare deser-portfolio-name)

(clojure.core/declare deser-provisioning-artifact-parameter)

(clojure.core/declare deser-parameter-value)

(clojure.core/declare deser-causing-entity)

(clojure.core/declare deser-provisioning-artifact-view)

(clojure.core/declare deser-principals)

(clojure.core/declare deser-update-provisioning-parameter)

(clojure.core/declare deser-share-details)

(clojure.core/defn- deser-resource-change [input] (clojure.core/cond-> {} (clojure.core/contains? input "Action") (clojure.core/assoc :action (deser-change-action (input "Action"))) (clojure.core/contains? input "LogicalResourceId") (clojure.core/assoc :logical-resource-id (deser-logical-resource-id (input "LogicalResourceId"))) (clojure.core/contains? input "PhysicalResourceId") (clojure.core/assoc :physical-resource-id (deser-physical-resource-id (input "PhysicalResourceId"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-plan-resource-type (input "ResourceType"))) (clojure.core/contains? input "Replacement") (clojure.core/assoc :replacement (deser-replacement (input "Replacement"))) (clojure.core/contains? input "Scope") (clojure.core/assoc :scope (deser-scope (input "Scope"))) (clojure.core/contains? input "Details") (clojure.core/assoc :details (deser-resource-change-details (input "Details")))))

(clojure.core/defn- deser-stack-set-accounts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-id coll))) input))

(clojure.core/defn- deser-service-action-definition-type [input] (clojure.core/get {"SSM_AUTOMATION" :ssm-automation} input))

(clojure.core/defn- deser-principal-type [input] (clojure.core/get {"IAM" :iam} input))

(clojure.core/defn- deser-physical-resource-id [input] input)

(clojure.core/defn- deser-launch-path-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-path-summary coll))) input))

(clojure.core/defn- deser-record-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-tag coll))) input))

(clojure.core/defn- deser-portfolio-share-token [input] input)

(clojure.core/defn- deser-support-description [input] input)

(clojure.core/defn- deser-resource-changes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-change coll))) input))

(clojure.core/defn- deser-provisioning-artifact-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioning-artifact-summary coll))) input))

(clojure.core/defn- deser-product-view-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProductViewSummary") (clojure.core/assoc :product-view-summary (deser-product-view-summary (input "ProductViewSummary"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-status (input "Status"))) (clojure.core/contains? input "ProductARN") (clojure.core/assoc :product-arn (deser-resource-arn (input "ProductARN"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (input "CreatedTime")))))

(clojure.core/defn- deser-logical-resource-id [input] input)

(clojure.core/defn- deser-parameter-type [input] input)

(clojure.core/defn- deser-total-results-count [input] input)

(clojure.core/defn- deser-user-arn-session [input] input)

(clojure.core/defn- deser-provisioned-product-plan-name [input] input)

(clojure.core/defn- deser-parameter-key [input] input)

(clojure.core/defn- deser-provisioned-product-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioned-product-attribute coll))) input))

(clojure.core/defn- deser-constraint-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ConstraintId") (clojure.core/assoc :constraint-id (deser-id (input "ConstraintId"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-constraint-type (input "Type"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-constraint-description (input "Description"))) (clojure.core/contains? input "Owner") (clojure.core/assoc :owner (deser-account-id (input "Owner")))))

(clojure.core/defn- deser-resource-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-detail coll))) input))

(clojure.core/defn- deser-resource-detail-id [input] input)

(clojure.core/defn- deser-approximate-count [input] input)

(clojure.core/defn- deser-property-name [input] input)

(clojure.core/defn- deser-provisioned-product-plan-type [input] (clojure.core/get {"CLOUDFORMATION" :cloudformation} input))

(clojure.core/defn- deser-product-view-aggregations [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-product-view-aggregation-type k) (deser-product-view-aggregation-values v)])) input))

(clojure.core/defn- deser-provisioned-product-name [input] input)

(clojure.core/defn- deser-product-view-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-product-view-detail coll))) input))

(clojure.core/defn- deser-tag-option-active [input] input)

(clojure.core/defn- deser-product-view-short-description [input] input)

(clojure.core/defn- deser-provisioning-artifact-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioning-artifact-parameter coll))) input))

(clojure.core/defn- deser-usage-instructions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-usage-instruction coll))) input))

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-record-status [input] (clojure.core/get {"CREATED" :created, "IN_PROGRESS" :in-progress, "IN_PROGRESS_IN_ERROR" :in-progress-in-error, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-provisioning-artifact-active [input] input)

(clojure.core/defn- deser-organization-nodes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-organization-node coll))) input))

(clojure.core/defn- deser-provisioning-artifact-name [input] input)

(clojure.core/defn- deser-record-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-detail coll))) input))

(clojure.core/defn- deser-provisioned-product-plan-status [input] (clojure.core/get {"CREATE_IN_PROGRESS" :create-in-progress, "CREATE_SUCCESS" :create-success, "CREATE_FAILED" :create-failed, "EXECUTE_IN_PROGRESS" :execute-in-progress, "EXECUTE_SUCCESS" :execute-success, "EXECUTE_FAILED" :execute-failed} input))

(clojure.core/defn- deser-change-action [input] (clojure.core/get {"ADD" :add, "MODIFY" :modify, "REMOVE" :remove} input))

(clojure.core/defn- deser-allowed-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-allowed-value coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-tag-option-value [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-evaluation-type [input] (clojure.core/get {"STATIC" :static, "DYNAMIC" :dynamic} input))

(clojure.core/defn- deser-update-provisioning-parameters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-update-provisioning-parameter coll))) input))

(clojure.core/defn- deser-organization-node-value [input] input)

(clojure.core/defn- deser-service-action-definition-key [input] (clojure.core/get {"Name" :name, "Version" :version, "AssumeRole" :assume-role, "Parameters" :parameters} input))

(clojure.core/defn- deser-provisioning-artifact-created-time [input] input)

(clojure.core/defn- deser-resource-detail-arn [input] input)

(clojure.core/defn- deser-successful-shares [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-id coll))) input))

(clojure.core/defn- deser-provisioning-artifact [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-provisioning-artifact-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-provisioning-artifact-description (input "Description"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-provisioning-artifact-created-time (input "CreatedTime")))))

(clojure.core/defn- deser-provisioning-artifact-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-provisioning-artifact-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-provisioning-artifact-name (input "Description"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-provisioning-artifact-type (input "Type"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-creation-time (input "CreatedTime"))) (clojure.core/contains? input "Active") (clojure.core/assoc :active (deser-provisioning-artifact-active (input "Active")))))

(clojure.core/defn- deser-cloud-watch-dashboards [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-watch-dashboard coll))) input))

(clojure.core/defn- deser-has-default-path [input] input)

(clojure.core/defn- deser-provisioned-product-plans [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioned-product-plan-summary coll))) input))

(clojure.core/defn- deser-status [input] (clojure.core/get {"AVAILABLE" :available, "CREATING" :creating, "FAILED" :failed} input))

(clojure.core/defn- deser-principal-arn [input] input)

(clojure.core/defn- deser-service-action-definition-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-service-action-definition-key k) (deser-service-action-definition-value v)])) input))

(clojure.core/defn- deser-record-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "RecordTags") (clojure.core/assoc :record-tags (deser-record-tags (input "RecordTags"))) (clojure.core/contains? input "ProvisionedProductName") (clojure.core/assoc :provisioned-product-name (deser-provisioned-product-name (input "ProvisionedProductName"))) (clojure.core/contains? input "PathId") (clojure.core/assoc :path-id (deser-id (input "PathId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-record-status (input "Status"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (input "CreatedTime"))) (clojure.core/contains? input "RecordId") (clojure.core/assoc :record-id (deser-id (input "RecordId"))) (clojure.core/contains? input "RecordType") (clojure.core/assoc :record-type (deser-record-type (input "RecordType"))) (clojure.core/contains? input "ProvisionedProductId") (clojure.core/assoc :provisioned-product-id (deser-id (input "ProvisionedProductId"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId"))) (clojure.core/contains? input "RecordErrors") (clojure.core/assoc :record-errors (deser-record-errors (input "RecordErrors"))) (clojure.core/contains? input "UpdatedTime") (clojure.core/assoc :updated-time (deser-updated-time (input "UpdatedTime"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "ProvisionedProductType") (clojure.core/assoc :provisioned-product-type (deser-provisioned-product-type (input "ProvisionedProductType")))))

(clojure.core/defn- deser-requires-recreation [input] (clojure.core/get {"NEVER" :never, "CONDITIONALLY" :conditionally, "ALWAYS" :always} input))

(clojure.core/defn- deser-provisioning-artifact-info [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-provisioning-artifact-info-key k) (deser-provisioning-artifact-info-value v)])) input))

(clojure.core/defn- deser-tag-option-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-option-value coll))) input))

(clojure.core/defn- deser-instruction-type [input] input)

(clojure.core/defn- deser-provisioning-artifact-info-value [input] input)

(clojure.core/defn- deser-record-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-error-code (input "Code"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-error-description (input "Description")))))

(clojure.core/defn- deser-provisioned-product-plan-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "PlanName") (clojure.core/assoc :plan-name (deser-provisioned-product-plan-name (input "PlanName"))) (clojure.core/contains? input "PlanId") (clojure.core/assoc :plan-id (deser-id (input "PlanId"))) (clojure.core/contains? input "ProvisionProductId") (clojure.core/assoc :provision-product-id (deser-id (input "ProvisionProductId"))) (clojure.core/contains? input "ProvisionProductName") (clojure.core/assoc :provision-product-name (deser-provisioned-product-name (input "ProvisionProductName"))) (clojure.core/contains? input "PlanType") (clojure.core/assoc :plan-type (deser-provisioned-product-plan-type (input "PlanType"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId")))))

(clojure.core/defn- deser-status-detail [input] input)

(clojure.core/defn- deser-created-time [input] input)

(clojure.core/defn- deser-provisioning-artifact-views [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioning-artifact-view coll))) input))

(clojure.core/defn- deser-tag-option-id [input] input)

(clojure.core/defn- deser-service-action-association-error-message [input] input)

(clojure.core/defn- deser-portfolio-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-resource-arn (input "ARN"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-portfolio-display-name (input "DisplayName"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-portfolio-description (input "Description"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-creation-time (input "CreatedTime"))) (clojure.core/contains? input "ProviderName") (clojure.core/assoc :provider-name (deser-provider-name (input "ProviderName")))))

(clojure.core/defn- deser-provisioning-artifact-preferences [input] (clojure.core/cond-> {} (clojure.core/contains? input "StackSetAccounts") (clojure.core/assoc :stack-set-accounts (deser-stack-set-accounts (input "StackSetAccounts"))) (clojure.core/contains? input "StackSetRegions") (clojure.core/assoc :stack-set-regions (deser-stack-set-regions (input "StackSetRegions")))))

(clojure.core/defn- deser-share-status [input] (clojure.core/get {"NOT_STARTED" :not-started, "IN_PROGRESS" :in-progress, "COMPLETED" :completed, "COMPLETED_WITH_ERRORS" :completed-with-errors, "ERROR" :error} input))

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-last-request-id [input] input)

(clojure.core/defn- deser-record-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "OutputKey") (clojure.core/assoc :output-key (deser-output-key (input "OutputKey"))) (clojure.core/contains? input "OutputValue") (clojure.core/assoc :output-value (deser-output-value (input "OutputValue"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description")))))

(clojure.core/defn- deser-service-action-definition-value [input] input)

(clojure.core/defn- deser-resource-attribute [input] (clojure.core/get {"PROPERTIES" :properties, "METADATA" :metadata, "CREATIONPOLICY" :creationpolicy, "UPDATEPOLICY" :updatepolicy, "DELETIONPOLICY" :deletionpolicy, "TAGS" :tags} input))

(clojure.core/defn- deser-portfolio-display-name [input] input)

(clojure.core/defn- deser-notification-arns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification-arn coll))) input))

(clojure.core/defn- deser-provisioned-product-status-message [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-resource-detail-created-time [input] input)

(clojure.core/defn- deser-physical-id [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-product-view-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "SupportDescription") (clojure.core/assoc :support-description (deser-support-description (input "SupportDescription"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-product-type (input "Type"))) (clojure.core/contains? input "ShortDescription") (clojure.core/assoc :short-description (deser-product-view-short-description (input "ShortDescription"))) (clojure.core/contains? input "HasDefaultPath") (clojure.core/assoc :has-default-path (deser-has-default-path (input "HasDefaultPath"))) (clojure.core/contains? input "Owner") (clojure.core/assoc :owner (deser-product-view-owner (input "Owner"))) (clojure.core/contains? input "Distributor") (clojure.core/assoc :distributor (deser-product-view-distributor (input "Distributor"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-product-view-name (input "Name"))) (clojure.core/contains? input "SupportUrl") (clojure.core/assoc :support-url (deser-support-url (input "SupportUrl"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "SupportEmail") (clojure.core/assoc :support-email (deser-support-email (input "SupportEmail"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id")))))

(clojure.core/defn- deser-provider-name [input] input)

(clojure.core/defn- deser-product-view-owner [input] input)

(clojure.core/defn- deser-record-tag-key [input] input)

(clojure.core/defn- deser-provisioning-artifact-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioning-artifact-detail coll))) input))

(clojure.core/defn- deser-portfolio-description [input] input)

(clojure.core/defn- deser-record-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-record-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-record-tag-value (input "Value")))))

(clojure.core/defn- deser-resource-target-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attribute") (clojure.core/assoc :attribute (deser-resource-attribute (input "Attribute"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-property-name (input "Name"))) (clojure.core/contains? input "RequiresRecreation") (clojure.core/assoc :requires-recreation (deser-requires-recreation (input "RequiresRecreation")))))

(clojure.core/defn- deser-provisioning-artifact-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-provisioning-artifact-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-provisioning-artifact-description (input "Description"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-provisioning-artifact-created-time (input "CreatedTime"))) (clojure.core/contains? input "ProvisioningArtifactMetadata") (clojure.core/assoc :provisioning-artifact-metadata (deser-provisioning-artifact-info (input "ProvisioningArtifactMetadata")))))

(clojure.core/defn- deser-cloud-watch-dashboard [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-cloud-watch-dashboard-name (input "Name")))))

(clojure.core/defn- deser-record-type [input] input)

(clojure.core/defn- deser-service-action-name [input] input)

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-share-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Accounts") (clojure.core/assoc :accounts (deser-namespaces (input "Accounts"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-message (input "Message"))) (clojure.core/contains? input "Error") (clojure.core/assoc :error (deser-error (input "Error")))))

(clojure.core/defn- deser-provisioning-artifact-info-key [input] input)

(clojure.core/defn- deser-cloud-watch-dashboard-name [input] input)

(clojure.core/defn- deser-instruction-value [input] input)

(clojure.core/defn- deser-error-description [input] input)

(clojure.core/defn- deser-notification-arn [input] input)

(clojure.core/defn- deser-provisioned-product-id [input] input)

(clojure.core/defn- deser-namespaces [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-id coll))) input))

(clojure.core/defn- deser-resource-detail-description [input] input)

(clojure.core/defn- deser-provisioning-artifact-type [input] (clojure.core/get {"CLOUD_FORMATION_TEMPLATE" :cloud-formation-template, "MARKETPLACE_AMI" :marketplace-ami, "MARKETPLACE_CAR" :marketplace-car} input))

(clojure.core/defn- deser-creation-time [input] input)

(clojure.core/defn- deser-access-status [input] (clojure.core/get {"ENABLED" :enabled, "UNDER_CHANGE" :under-change, "DISABLED" :disabled} input))

(clojure.core/defn- deser-resource-change-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-change-detail coll))) input))

(clojure.core/defn- deser-idempotency-token [input] input)

(clojure.core/defn- deser-portfolio-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-portfolio-detail coll))) input))

(clojure.core/defn- deser-product-view-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-product-view-summary coll))) input))

(clojure.core/defn- deser-provisioned-product-plan-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage"))) (clojure.core/contains? input "PathId") (clojure.core/assoc :path-id (deser-id (input "PathId"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "ProvisionProductId") (clojure.core/assoc :provision-product-id (deser-id (input "ProvisionProductId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-provisioned-product-plan-status (input "Status"))) (clojure.core/contains? input "ProvisioningParameters") (clojure.core/assoc :provisioning-parameters (deser-update-provisioning-parameters (input "ProvisioningParameters"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (input "CreatedTime"))) (clojure.core/contains? input "PlanType") (clojure.core/assoc :plan-type (deser-provisioned-product-plan-type (input "PlanType"))) (clojure.core/contains? input "NotificationArns") (clojure.core/assoc :notification-arns (deser-notification-arns (input "NotificationArns"))) (clojure.core/contains? input "PlanName") (clojure.core/assoc :plan-name (deser-provisioned-product-plan-name (input "PlanName"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId"))) (clojure.core/contains? input "UpdatedTime") (clojure.core/assoc :updated-time (deser-updated-time (input "UpdatedTime"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "ProvisionProductName") (clojure.core/assoc :provision-product-name (deser-provisioned-product-name (input "ProvisionProductName"))) (clojure.core/contains? input "PlanId") (clojure.core/assoc :plan-id (deser-id (input "PlanId")))))

(clojure.core/defn- deser-tag-option-key [input] input)

(clojure.core/defn- deser-tag-option-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-option-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-option-value (input "Value"))) (clojure.core/contains? input "Active") (clojure.core/assoc :active (deser-tag-option-active (input "Active"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-tag-option-id (input "Id")))))

(clojure.core/defn- deser-failed-service-action-associations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-service-action-association coll))) input))

(clojure.core/defn- deser-constraint-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-constraint-summary coll))) input))

(clojure.core/defn- deser-default-value [input] input)

(clojure.core/defn- deser-product-view-aggregation-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-product-view-aggregation-value coll))) input))

(clojure.core/defn- deser-launch-path-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "ConstraintSummaries") (clojure.core/assoc :constraint-summaries (deser-constraint-summaries (input "ConstraintSummaries"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-portfolio-name (input "Name")))))

(clojure.core/defn- deser-allowed-value [input] input)

(clojure.core/defn- deser-failed-service-action-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceActionId") (clojure.core/assoc :service-action-id (deser-id (input "ServiceActionId"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-service-action-association-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-service-action-association-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-resource-detail-name [input] input)

(clojure.core/defn- deser-constraint-parameters [input] input)

(clojure.core/defn- deser-provisioned-product-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-provisioned-product-type (input "Type"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-provisioned-product-status-message (input "StatusMessage"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-provisioned-product-status (input "Status"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (input "CreatedTime"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-provisioned-product-name-or-arn (input "Arn"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId"))) (clojure.core/contains? input "IdempotencyToken") (clojure.core/assoc :idempotency-token (deser-idempotency-token (input "IdempotencyToken"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-provisioned-product-name-or-arn (input "Name"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "LastRecordId") (clojure.core/assoc :last-record-id (deser-last-request-id (input "LastRecordId"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-provisioned-product-id (input "Id")))))

(clojure.core/defn- deser-product-view-name [input] input)

(clojure.core/defn- deser-provisioned-product-name-or-arn [input] input)

(clojure.core/defn- deser-product-type [input] (clojure.core/get {"CLOUD_FORMATION_TEMPLATE" :cloud-formation-template, "MARKETPLACE" :marketplace} input))

(clojure.core/defn- deser-product-view-aggregation-type [input] input)

(clojure.core/defn- deser-record-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-error coll))) input))

(clojure.core/defn- deser-updated-time [input] input)

(clojure.core/defn- deser-product-view-distributor [input] input)

(clojure.core/defn- deser-resource-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-detail-id (input "Id"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-resource-detail-arn (input "ARN"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-detail-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-resource-detail-description (input "Description"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-resource-detail-created-time (input "CreatedTime")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-stack-set-regions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-region coll))) input))

(clojure.core/defn- deser-replacement [input] (clojure.core/get {"TRUE" :true, "FALSE" :false, "CONDITIONAL" :conditional} input))

(clojure.core/defn- deser-organization-node [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-organization-node-type (input "Type"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-organization-node-value (input "Value")))))

(clojure.core/defn- deser-error [input] input)

(clojure.core/defn- deser-service-action-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceActionSummary") (clojure.core/assoc :service-action-summary (deser-service-action-summary (input "ServiceActionSummary"))) (clojure.core/contains? input "Definition") (clojure.core/assoc :definition (deser-service-action-definition-map (input "Definition")))))

(clojure.core/defn- deser-tag-option-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-option-detail coll))) input))

(clojure.core/defn- deser-usage-instruction [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-instruction-type (input "Type"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-instruction-value (input "Value")))))

(clojure.core/defn- deser-no-echo [input] input)

(clojure.core/defn- deser-constraint-description [input] input)

(clojure.core/defn- deser-provisioned-product-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioned-product-detail coll))) input))

(clojure.core/defn- deser-service-action-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-service-action-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-service-action-description (input "Description"))) (clojure.core/contains? input "DefinitionType") (clojure.core/assoc :definition-type (deser-service-action-definition-type (input "DefinitionType")))))

(clojure.core/defn- deser-use-previous-value [input] input)

(clojure.core/defn- deser-output-value [input] input)

(clojure.core/defn- deser-resource-change-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Target") (clojure.core/assoc :target (deser-resource-target-definition (input "Target"))) (clojure.core/contains? input "Evaluation") (clojure.core/assoc :evaluation (deser-evaluation-type (input "Evaluation"))) (clojure.core/contains? input "CausingEntity") (clojure.core/assoc :causing-entity (deser-causing-entity (input "CausingEntity")))))

(clojure.core/defn- deser-support-url [input] input)

(clojure.core/defn- deser-constraint-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-constraint-type (input "Type"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-constraint-description (input "Description")))))

(clojure.core/defn- deser-tag-option-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-option-key (input "Key"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-tag-option-values (input "Values")))))

(clojure.core/defn- deser-account-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account-id coll))) input))

(clojure.core/defn- deser-principal [input] (clojure.core/cond-> {} (clojure.core/contains? input "PrincipalARN") (clojure.core/assoc :principal-arn (deser-principal-arn (input "PrincipalARN"))) (clojure.core/contains? input "PrincipalType") (clojure.core/assoc :principal-type (deser-principal-type (input "PrincipalType")))))

(clojure.core/defn- deser-constraint-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-constraint-detail coll))) input))

(clojure.core/defn- deser-plan-resource-type [input] input)

(clojure.core/defn- deser-provisioned-product-status [input] (clojure.core/get {"AVAILABLE" :available, "UNDER_CHANGE" :under-change, "TAINTED" :tainted, "ERROR" :error, "PLAN_IN_PROGRESS" :plan-in-progress} input))

(clojure.core/defn- deser-copy-product-status [input] (clojure.core/get {"SUCCEEDED" :succeeded, "IN_PROGRESS" :in-progress, "FAILED" :failed} input))

(clojure.core/defn- deser-share-errors [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-share-error coll))) input))

(clojure.core/defn- deser-output-key [input] input)

(clojure.core/defn- deser-provisioning-artifact-description [input] input)

(clojure.core/defn- deser-service-action-association-error-code [input] (clojure.core/get {"DUPLICATE_RESOURCE" :duplicate-resource, "INTERNAL_FAILURE" :internal-failure, "LIMIT_EXCEEDED" :limit-exceeded, "RESOURCE_NOT_FOUND" :resource-not-found, "THROTTLING" :throttling} input))

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-product-view-aggregation-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-attribute-value (input "Value"))) (clojure.core/contains? input "ApproximateCount") (clojure.core/assoc :approximate-count (deser-approximate-count (input "ApproximateCount")))))

(clojure.core/defn- deser-service-action-description [input] input)

(clojure.core/defn- deser-record-outputs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-output coll))) input))

(clojure.core/defn- deser-page-token [input] input)

(clojure.core/defn- deser-region [input] input)

(clojure.core/defn- deser-support-email [input] input)

(clojure.core/defn- deser-tag-option-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-option-summary coll))) input))

(clojure.core/defn- deser-constraint-type [input] input)

(clojure.core/defn- deser-scope [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-attribute coll))) input))

(clojure.core/defn- deser-provisioning-artifacts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-provisioning-artifact coll))) input))

(clojure.core/defn- deser-record-tag-value [input] input)

(clojure.core/defn- deser-user-arn [input] input)

(clojure.core/defn- deser-service-action-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-action-summary coll))) input))

(clojure.core/defn- deser-provisioned-product-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserArnSession") (clojure.core/assoc :user-arn-session (deser-user-arn-session (input "UserArnSession"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-provisioned-product-type (input "Type"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-provisioned-product-status-message (input "StatusMessage"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-provisioned-product-status (input "Status"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (input "CreatedTime"))) (clojure.core/contains? input "PhysicalId") (clojure.core/assoc :physical-id (deser-physical-id (input "PhysicalId"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-provisioned-product-name-or-arn (input "Arn"))) (clojure.core/contains? input "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (input "ProvisioningArtifactId"))) (clojure.core/contains? input "IdempotencyToken") (clojure.core/assoc :idempotency-token (deser-idempotency-token (input "IdempotencyToken"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-provisioned-product-name-or-arn (input "Name"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-id (input "ProductId"))) (clojure.core/contains? input "LastRecordId") (clojure.core/assoc :last-record-id (deser-id (input "LastRecordId"))) (clojure.core/contains? input "UserArn") (clojure.core/assoc :user-arn (deser-user-arn (input "UserArn"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-id (input "Id")))))

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-parameter-constraints [input] (clojure.core/cond-> {} (clojure.core/contains? input "AllowedValues") (clojure.core/assoc :allowed-values (deser-allowed-values (input "AllowedValues")))))

(clojure.core/defn- deser-organization-node-type [input] (clojure.core/get {"ORGANIZATION" :organization, "ORGANIZATIONAL_UNIT" :organizational-unit, "ACCOUNT" :account} input))

(clojure.core/defn- deser-provisioned-product-type [input] input)

(clojure.core/defn- deser-portfolio-name [input] input)

(clojure.core/defn- deser-provisioning-artifact-parameter [input] (clojure.core/cond-> {} (clojure.core/contains? input "ParameterKey") (clojure.core/assoc :parameter-key (deser-parameter-key (input "ParameterKey"))) (clojure.core/contains? input "DefaultValue") (clojure.core/assoc :default-value (deser-default-value (input "DefaultValue"))) (clojure.core/contains? input "ParameterType") (clojure.core/assoc :parameter-type (deser-parameter-type (input "ParameterType"))) (clojure.core/contains? input "IsNoEcho") (clojure.core/assoc :is-no-echo (deser-no-echo (input "IsNoEcho"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "ParameterConstraints") (clojure.core/assoc :parameter-constraints (deser-parameter-constraints (input "ParameterConstraints")))))

(clojure.core/defn- deser-parameter-value [input] input)

(clojure.core/defn- deser-causing-entity [input] input)

(clojure.core/defn- deser-provisioning-artifact-view [input] (clojure.core/cond-> {} (clojure.core/contains? input "ProductViewSummary") (clojure.core/assoc :product-view-summary (deser-product-view-summary (input "ProductViewSummary"))) (clojure.core/contains? input "ProvisioningArtifact") (clojure.core/assoc :provisioning-artifact (deser-provisioning-artifact (input "ProvisioningArtifact")))))

(clojure.core/defn- deser-principals [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-principal coll))) input))

(clojure.core/defn- deser-update-provisioning-parameter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-parameter-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-parameter-value (input "Value"))) (clojure.core/contains? input "UsePreviousValue") (clojure.core/assoc :use-previous-value (deser-use-previous-value (input "UsePreviousValue")))))

(clojure.core/defn- deser-share-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "SuccessfulShares") (clojure.core/assoc :successful-shares (deser-successful-shares (input "SuccessfulShares"))) (clojure.core/contains? input "ShareErrors") (clojure.core/assoc :share-errors (deser-share-errors (input "ShareErrors")))))

(clojure.core/defn- response-list-service-actions-output ([input] (response-list-service-actions-output nil input)) ([resultWrapper2020923 input] (clojure.core/let [rawinput2020922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020924 {"ServiceActionSummaries" (rawinput2020922 "ServiceActionSummaries"), "NextPageToken" (rawinput2020922 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020924 "ServiceActionSummaries") (clojure.core/assoc :service-action-summaries (deser-service-action-summaries (clojure.core/get-in letvar2020924 ["ServiceActionSummaries"]))) (letvar2020924 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020924 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-product-view-output ([input] (response-describe-product-view-output nil input)) ([resultWrapper2020926 input] (clojure.core/let [rawinput2020925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020927 {"ProductViewSummary" (rawinput2020925 "ProductViewSummary"), "ProvisioningArtifacts" (rawinput2020925 "ProvisioningArtifacts")}] (clojure.core/cond-> {} (letvar2020927 "ProductViewSummary") (clojure.core/assoc :product-view-summary (deser-product-view-summary (clojure.core/get-in letvar2020927 ["ProductViewSummary"]))) (letvar2020927 "ProvisioningArtifacts") (clojure.core/assoc :provisioning-artifacts (deser-provisioning-artifacts (clojure.core/get-in letvar2020927 ["ProvisioningArtifacts"])))))))

(clojure.core/defn- response-execute-provisioned-product-plan-output ([input] (response-execute-provisioned-product-plan-output nil input)) ([resultWrapper2020929 input] (clojure.core/let [rawinput2020928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020930 {"RecordDetail" (rawinput2020928 "RecordDetail")}] (clojure.core/cond-> {} (letvar2020930 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2020930 ["RecordDetail"])))))))

(clojure.core/defn- response-describe-provisioned-product-plan-output ([input] (response-describe-provisioned-product-plan-output nil input)) ([resultWrapper2020932 input] (clojure.core/let [rawinput2020931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020933 {"ProvisionedProductPlanDetails" (rawinput2020931 "ProvisionedProductPlanDetails"), "ResourceChanges" (rawinput2020931 "ResourceChanges"), "NextPageToken" (rawinput2020931 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020933 "ProvisionedProductPlanDetails") (clojure.core/assoc :provisioned-product-plan-details (deser-provisioned-product-plan-details (clojure.core/get-in letvar2020933 ["ProvisionedProductPlanDetails"]))) (letvar2020933 "ResourceChanges") (clojure.core/assoc :resource-changes (deser-resource-changes (clojure.core/get-in letvar2020933 ["ResourceChanges"]))) (letvar2020933 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020933 ["NextPageToken"])))))))

(clojure.core/defn- response-update-provisioned-product-output ([input] (response-update-provisioned-product-output nil input)) ([resultWrapper2020935 input] (clojure.core/let [rawinput2020934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020936 {"RecordDetail" (rawinput2020934 "RecordDetail")}] (clojure.core/cond-> {} (letvar2020936 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2020936 ["RecordDetail"])))))))

(clojure.core/defn- response-associate-product-with-portfolio-output ([input] (response-associate-product-with-portfolio-output nil input)) ([resultWrapper2020938 input] (clojure.core/let [rawinput2020937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020939 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-tag-option-from-resource-output ([input] (response-disassociate-tag-option-from-resource-output nil input)) ([resultWrapper2020941 input] (clojure.core/let [rawinput2020940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020942 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-provision-product-output ([input] (response-provision-product-output nil input)) ([resultWrapper2020944 input] (clojure.core/let [rawinput2020943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020945 {"RecordDetail" (rawinput2020943 "RecordDetail")}] (clojure.core/cond-> {} (letvar2020945 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2020945 ["RecordDetail"])))))))

(clojure.core/defn- response-accept-portfolio-share-output ([input] (response-accept-portfolio-share-output nil input)) ([resultWrapper2020947 input] (clojure.core/let [rawinput2020946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020948 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-portfolios-output ([input] (response-list-portfolios-output nil input)) ([resultWrapper2020950 input] (clojure.core/let [rawinput2020949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020951 {"PortfolioDetails" (rawinput2020949 "PortfolioDetails"), "NextPageToken" (rawinput2020949 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020951 "PortfolioDetails") (clojure.core/assoc :portfolio-details (deser-portfolio-details (clojure.core/get-in letvar2020951 ["PortfolioDetails"]))) (letvar2020951 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020951 ["NextPageToken"])))))))

(clojure.core/defn- response-create-tag-option-output ([input] (response-create-tag-option-output nil input)) ([resultWrapper2020953 input] (clojure.core/let [rawinput2020952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020954 {"TagOptionDetail" (rawinput2020952 "TagOptionDetail")}] (clojure.core/cond-> {} (letvar2020954 "TagOptionDetail") (clojure.core/assoc :tag-option-detail (deser-tag-option-detail (clojure.core/get-in letvar2020954 ["TagOptionDetail"])))))))

(clojure.core/defn- response-disassociate-product-from-portfolio-output ([input] (response-disassociate-product-from-portfolio-output nil input)) ([resultWrapper2020956 input] (clojure.core/let [rawinput2020955 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020957 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-terminate-provisioned-product-output ([input] (response-terminate-provisioned-product-output nil input)) ([resultWrapper2020959 input] (clojure.core/let [rawinput2020958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020960 {"RecordDetail" (rawinput2020958 "RecordDetail")}] (clojure.core/cond-> {} (letvar2020960 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2020960 ["RecordDetail"])))))))

(clojure.core/defn- response-search-provisioned-products-output ([input] (response-search-provisioned-products-output nil input)) ([resultWrapper2020962 input] (clojure.core/let [rawinput2020961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020963 {"ProvisionedProducts" (rawinput2020961 "ProvisionedProducts"), "TotalResultsCount" (rawinput2020961 "TotalResultsCount"), "NextPageToken" (rawinput2020961 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020963 "ProvisionedProducts") (clojure.core/assoc :provisioned-products (deser-provisioned-product-attributes (clojure.core/get-in letvar2020963 ["ProvisionedProducts"]))) (letvar2020963 "TotalResultsCount") (clojure.core/assoc :total-results-count (deser-total-results-count (clojure.core/get-in letvar2020963 ["TotalResultsCount"]))) (letvar2020963 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020963 ["NextPageToken"])))))))

(clojure.core/defn- response-create-portfolio-share-output ([input] (response-create-portfolio-share-output nil input)) ([resultWrapper2020965 input] (clojure.core/let [rawinput2020964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020966 {"PortfolioShareToken" (rawinput2020964 "PortfolioShareToken")}] (clojure.core/cond-> {} (letvar2020966 "PortfolioShareToken") (clojure.core/assoc :portfolio-share-token (deser-portfolio-share-token (clojure.core/get-in letvar2020966 ["PortfolioShareToken"])))))))

(clojure.core/defn- response-update-tag-option-output ([input] (response-update-tag-option-output nil input)) ([resultWrapper2020968 input] (clojure.core/let [rawinput2020967 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020969 {"TagOptionDetail" (rawinput2020967 "TagOptionDetail")}] (clojure.core/cond-> {} (letvar2020969 "TagOptionDetail") (clojure.core/assoc :tag-option-detail (deser-tag-option-detail (clojure.core/get-in letvar2020969 ["TagOptionDetail"])))))))

(clojure.core/defn- response-get-aws-organizations-access-status-output ([input] (response-get-aws-organizations-access-status-output nil input)) ([resultWrapper2020971 input] (clojure.core/let [rawinput2020970 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020972 {"AccessStatus" (rawinput2020970 "AccessStatus")}] (clojure.core/cond-> {} (letvar2020972 "AccessStatus") (clojure.core/assoc :access-status (deser-access-status (clojure.core/get-in letvar2020972 ["AccessStatus"])))))))

(clojure.core/defn- response-delete-product-output ([input] (response-delete-product-output nil input)) ([resultWrapper2020974 input] (clojure.core/let [rawinput2020973 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020975 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-constraint-output ([input] (response-update-constraint-output nil input)) ([resultWrapper2020977 input] (clojure.core/let [rawinput2020976 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020978 {"ConstraintDetail" (rawinput2020976 "ConstraintDetail"), "ConstraintParameters" (rawinput2020976 "ConstraintParameters"), "Status" (rawinput2020976 "Status")}] (clojure.core/cond-> {} (letvar2020978 "ConstraintDetail") (clojure.core/assoc :constraint-detail (deser-constraint-detail (clojure.core/get-in letvar2020978 ["ConstraintDetail"]))) (letvar2020978 "ConstraintParameters") (clojure.core/assoc :constraint-parameters (deser-constraint-parameters (clojure.core/get-in letvar2020978 ["ConstraintParameters"]))) (letvar2020978 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2020978 ["Status"])))))))

(clojure.core/defn- response-list-constraints-for-portfolio-output ([input] (response-list-constraints-for-portfolio-output nil input)) ([resultWrapper2020980 input] (clojure.core/let [rawinput2020979 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020981 {"ConstraintDetails" (rawinput2020979 "ConstraintDetails"), "NextPageToken" (rawinput2020979 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020981 "ConstraintDetails") (clojure.core/assoc :constraint-details (deser-constraint-details (clojure.core/get-in letvar2020981 ["ConstraintDetails"]))) (letvar2020981 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020981 ["NextPageToken"])))))))

(clojure.core/defn- response-list-tag-options-output ([input] (response-list-tag-options-output nil input)) ([resultWrapper2020983 input] (clojure.core/let [rawinput2020982 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020984 {"TagOptionDetails" (rawinput2020982 "TagOptionDetails"), "PageToken" (rawinput2020982 "PageToken")}] (clojure.core/cond-> {} (letvar2020984 "TagOptionDetails") (clojure.core/assoc :tag-option-details (deser-tag-option-details (clojure.core/get-in letvar2020984 ["TagOptionDetails"]))) (letvar2020984 "PageToken") (clojure.core/assoc :page-token (deser-page-token (clojure.core/get-in letvar2020984 ["PageToken"])))))))

(clojure.core/defn- response-list-accepted-portfolio-shares-output ([input] (response-list-accepted-portfolio-shares-output nil input)) ([resultWrapper2020986 input] (clojure.core/let [rawinput2020985 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020987 {"PortfolioDetails" (rawinput2020985 "PortfolioDetails"), "NextPageToken" (rawinput2020985 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020987 "PortfolioDetails") (clojure.core/assoc :portfolio-details (deser-portfolio-details (clojure.core/get-in letvar2020987 ["PortfolioDetails"]))) (letvar2020987 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020987 ["NextPageToken"])))))))

(clojure.core/defn- response-delete-service-action-output ([input] (response-delete-service-action-output nil input)) ([resultWrapper2020989 input] (clojure.core/let [rawinput2020988 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020990 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-principals-for-portfolio-output ([input] (response-list-principals-for-portfolio-output nil input)) ([resultWrapper2020992 input] (clojure.core/let [rawinput2020991 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020993 {"Principals" (rawinput2020991 "Principals"), "NextPageToken" (rawinput2020991 "NextPageToken")}] (clojure.core/cond-> {} (letvar2020993 "Principals") (clojure.core/assoc :principals (deser-principals (clojure.core/get-in letvar2020993 ["Principals"]))) (letvar2020993 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2020993 ["NextPageToken"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper2020995 input] (clojure.core/let [rawinput2020994 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020996 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-principal-from-portfolio-output ([input] (response-disassociate-principal-from-portfolio-output nil input)) ([resultWrapper2020998 input] (clojure.core/let [rawinput2020997 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2020999 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2021001 input] (clojure.core/let [rawinput2021000 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021002 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-provisioning-artifacts-for-service-action-output ([input] (response-list-provisioning-artifacts-for-service-action-output nil input)) ([resultWrapper2021004 input] (clojure.core/let [rawinput2021003 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021005 {"ProvisioningArtifactViews" (rawinput2021003 "ProvisioningArtifactViews"), "NextPageToken" (rawinput2021003 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021005 "ProvisioningArtifactViews") (clojure.core/assoc :provisioning-artifact-views (deser-provisioning-artifact-views (clojure.core/get-in letvar2021005 ["ProvisioningArtifactViews"]))) (letvar2021005 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021005 ["NextPageToken"])))))))

(clojure.core/defn- response-search-products-as-admin-output ([input] (response-search-products-as-admin-output nil input)) ([resultWrapper2021007 input] (clojure.core/let [rawinput2021006 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021008 {"ProductViewDetails" (rawinput2021006 "ProductViewDetails"), "NextPageToken" (rawinput2021006 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021008 "ProductViewDetails") (clojure.core/assoc :product-view-details (deser-product-view-details (clojure.core/get-in letvar2021008 ["ProductViewDetails"]))) (letvar2021008 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021008 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-tag-option-output ([input] (response-describe-tag-option-output nil input)) ([resultWrapper2021010 input] (clojure.core/let [rawinput2021009 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021011 {"TagOptionDetail" (rawinput2021009 "TagOptionDetail")}] (clojure.core/cond-> {} (letvar2021011 "TagOptionDetail") (clojure.core/assoc :tag-option-detail (deser-tag-option-detail (clojure.core/get-in letvar2021011 ["TagOptionDetail"])))))))

(clojure.core/defn- response-delete-tag-option-output ([input] (response-delete-tag-option-output nil input)) ([resultWrapper2021013 input] (clojure.core/let [rawinput2021012 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021014 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-principal-with-portfolio-output ([input] (response-associate-principal-with-portfolio-output nil input)) ([resultWrapper2021016 input] (clojure.core/let [rawinput2021015 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021017 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disable-aws-organizations-access-output ([input] (response-disable-aws-organizations-access-output nil input)) ([resultWrapper2021019 input] (clojure.core/let [rawinput2021018 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021020 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-provisioning-artifact-output ([input] (response-update-provisioning-artifact-output nil input)) ([resultWrapper2021022 input] (clojure.core/let [rawinput2021021 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021023 {"ProvisioningArtifactDetail" (rawinput2021021 "ProvisioningArtifactDetail"), "Info" (rawinput2021021 "Info"), "Status" (rawinput2021021 "Status")}] (clojure.core/cond-> {} (letvar2021023 "ProvisioningArtifactDetail") (clojure.core/assoc :provisioning-artifact-detail (deser-provisioning-artifact-detail (clojure.core/get-in letvar2021023 ["ProvisioningArtifactDetail"]))) (letvar2021023 "Info") (clojure.core/assoc :info (deser-provisioning-artifact-info (clojure.core/get-in letvar2021023 ["Info"]))) (letvar2021023 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2021023 ["Status"])))))))

(clojure.core/defn- response-invalid-parameters-exception ([input] (response-invalid-parameters-exception nil input)) ([resultWrapper2021025 input] (clojure.core/let [rawinput2021024 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021026 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-service-action-with-provisioning-artifact-output ([input] (response-associate-service-action-with-provisioning-artifact-output nil input)) ([resultWrapper2021028 input] (clojure.core/let [rawinput2021027 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021029 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-provisioned-product-plan-output ([input] (response-create-provisioned-product-plan-output nil input)) ([resultWrapper2021031 input] (clojure.core/let [rawinput2021030 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021032 {"PlanName" (rawinput2021030 "PlanName"), "PlanId" (rawinput2021030 "PlanId"), "ProvisionProductId" (rawinput2021030 "ProvisionProductId"), "ProvisionedProductName" (rawinput2021030 "ProvisionedProductName"), "ProvisioningArtifactId" (rawinput2021030 "ProvisioningArtifactId")}] (clojure.core/cond-> {} (letvar2021032 "PlanName") (clojure.core/assoc :plan-name (deser-provisioned-product-plan-name (clojure.core/get-in letvar2021032 ["PlanName"]))) (letvar2021032 "PlanId") (clojure.core/assoc :plan-id (deser-id (clojure.core/get-in letvar2021032 ["PlanId"]))) (letvar2021032 "ProvisionProductId") (clojure.core/assoc :provision-product-id (deser-id (clojure.core/get-in letvar2021032 ["ProvisionProductId"]))) (letvar2021032 "ProvisionedProductName") (clojure.core/assoc :provisioned-product-name (deser-provisioned-product-name (clojure.core/get-in letvar2021032 ["ProvisionedProductName"]))) (letvar2021032 "ProvisioningArtifactId") (clojure.core/assoc :provisioning-artifact-id (deser-id (clojure.core/get-in letvar2021032 ["ProvisioningArtifactId"])))))))

(clojure.core/defn- response-create-product-output ([input] (response-create-product-output nil input)) ([resultWrapper2021034 input] (clojure.core/let [rawinput2021033 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021035 {"ProductViewDetail" (rawinput2021033 "ProductViewDetail"), "ProvisioningArtifactDetail" (rawinput2021033 "ProvisioningArtifactDetail"), "Tags" (rawinput2021033 "Tags")}] (clojure.core/cond-> {} (letvar2021035 "ProductViewDetail") (clojure.core/assoc :product-view-detail (deser-product-view-detail (clojure.core/get-in letvar2021035 ["ProductViewDetail"]))) (letvar2021035 "ProvisioningArtifactDetail") (clojure.core/assoc :provisioning-artifact-detail (deser-provisioning-artifact-detail (clojure.core/get-in letvar2021035 ["ProvisioningArtifactDetail"]))) (letvar2021035 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021035 ["Tags"])))))))

(clojure.core/defn- response-list-record-history-output ([input] (response-list-record-history-output nil input)) ([resultWrapper2021037 input] (clojure.core/let [rawinput2021036 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021038 {"RecordDetails" (rawinput2021036 "RecordDetails"), "NextPageToken" (rawinput2021036 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021038 "RecordDetails") (clojure.core/assoc :record-details (deser-record-details (clojure.core/get-in letvar2021038 ["RecordDetails"]))) (letvar2021038 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021038 ["NextPageToken"])))))))

(clojure.core/defn- response-delete-portfolio-output ([input] (response-delete-portfolio-output nil input)) ([resultWrapper2021040 input] (clojure.core/let [rawinput2021039 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021041 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-service-action-output ([input] (response-describe-service-action-output nil input)) ([resultWrapper2021043 input] (clojure.core/let [rawinput2021042 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021044 {"ServiceActionDetail" (rawinput2021042 "ServiceActionDetail")}] (clojure.core/cond-> {} (letvar2021044 "ServiceActionDetail") (clojure.core/assoc :service-action-detail (deser-service-action-detail (clojure.core/get-in letvar2021044 ["ServiceActionDetail"])))))))

(clojure.core/defn- response-delete-portfolio-share-output ([input] (response-delete-portfolio-share-output nil input)) ([resultWrapper2021046 input] (clojure.core/let [rawinput2021045 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021047 {"PortfolioShareToken" (rawinput2021045 "PortfolioShareToken")}] (clojure.core/cond-> {} (letvar2021047 "PortfolioShareToken") (clojure.core/assoc :portfolio-share-token (deser-portfolio-share-token (clojure.core/get-in letvar2021047 ["PortfolioShareToken"])))))))

(clojure.core/defn- response-describe-provisioning-artifact-output ([input] (response-describe-provisioning-artifact-output nil input)) ([resultWrapper2021049 input] (clojure.core/let [rawinput2021048 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021050 {"ProvisioningArtifactDetail" (rawinput2021048 "ProvisioningArtifactDetail"), "Info" (rawinput2021048 "Info"), "Status" (rawinput2021048 "Status")}] (clojure.core/cond-> {} (letvar2021050 "ProvisioningArtifactDetail") (clojure.core/assoc :provisioning-artifact-detail (deser-provisioning-artifact-detail (clojure.core/get-in letvar2021050 ["ProvisioningArtifactDetail"]))) (letvar2021050 "Info") (clojure.core/assoc :info (deser-provisioning-artifact-info (clojure.core/get-in letvar2021050 ["Info"]))) (letvar2021050 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2021050 ["Status"])))))))

(clojure.core/defn- response-enable-aws-organizations-access-output ([input] (response-enable-aws-organizations-access-output nil input)) ([resultWrapper2021052 input] (clojure.core/let [rawinput2021051 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021053 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-portfolio-output ([input] (response-create-portfolio-output nil input)) ([resultWrapper2021055 input] (clojure.core/let [rawinput2021054 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021056 {"PortfolioDetail" (rawinput2021054 "PortfolioDetail"), "Tags" (rawinput2021054 "Tags")}] (clojure.core/cond-> {} (letvar2021056 "PortfolioDetail") (clojure.core/assoc :portfolio-detail (deser-portfolio-detail (clojure.core/get-in letvar2021056 ["PortfolioDetail"]))) (letvar2021056 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021056 ["Tags"])))))))

(clojure.core/defn- response-describe-copy-product-status-output ([input] (response-describe-copy-product-status-output nil input)) ([resultWrapper2021058 input] (clojure.core/let [rawinput2021057 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021059 {"CopyProductStatus" (rawinput2021057 "CopyProductStatus"), "TargetProductId" (rawinput2021057 "TargetProductId"), "StatusDetail" (rawinput2021057 "StatusDetail")}] (clojure.core/cond-> {} (letvar2021059 "CopyProductStatus") (clojure.core/assoc :copy-product-status (deser-copy-product-status (clojure.core/get-in letvar2021059 ["CopyProductStatus"]))) (letvar2021059 "TargetProductId") (clojure.core/assoc :target-product-id (deser-id (clojure.core/get-in letvar2021059 ["TargetProductId"]))) (letvar2021059 "StatusDetail") (clojure.core/assoc :status-detail (deser-status-detail (clojure.core/get-in letvar2021059 ["StatusDetail"])))))))

(clojure.core/defn- response-delete-constraint-output ([input] (response-delete-constraint-output nil input)) ([resultWrapper2021061 input] (clojure.core/let [rawinput2021060 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021062 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-service-actions-for-provisioning-artifact-output ([input] (response-list-service-actions-for-provisioning-artifact-output nil input)) ([resultWrapper2021064 input] (clojure.core/let [rawinput2021063 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021065 {"ServiceActionSummaries" (rawinput2021063 "ServiceActionSummaries"), "NextPageToken" (rawinput2021063 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021065 "ServiceActionSummaries") (clojure.core/assoc :service-action-summaries (deser-service-action-summaries (clojure.core/get-in letvar2021065 ["ServiceActionSummaries"]))) (letvar2021065 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021065 ["NextPageToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper2021067 input] (clojure.core/let [rawinput2021066 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021068 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-product-output ([input] (response-update-product-output nil input)) ([resultWrapper2021070 input] (clojure.core/let [rawinput2021069 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021071 {"ProductViewDetail" (rawinput2021069 "ProductViewDetail"), "Tags" (rawinput2021069 "Tags")}] (clojure.core/cond-> {} (letvar2021071 "ProductViewDetail") (clojure.core/assoc :product-view-detail (deser-product-view-detail (clojure.core/get-in letvar2021071 ["ProductViewDetail"]))) (letvar2021071 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021071 ["Tags"])))))))

(clojure.core/defn- response-delete-provisioning-artifact-output ([input] (response-delete-provisioning-artifact-output nil input)) ([resultWrapper2021073 input] (clojure.core/let [rawinput2021072 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021074 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resources-for-tag-option-output ([input] (response-list-resources-for-tag-option-output nil input)) ([resultWrapper2021076 input] (clojure.core/let [rawinput2021075 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021077 {"ResourceDetails" (rawinput2021075 "ResourceDetails"), "PageToken" (rawinput2021075 "PageToken")}] (clojure.core/cond-> {} (letvar2021077 "ResourceDetails") (clojure.core/assoc :resource-details (deser-resource-details (clojure.core/get-in letvar2021077 ["ResourceDetails"]))) (letvar2021077 "PageToken") (clojure.core/assoc :page-token (deser-page-token (clojure.core/get-in letvar2021077 ["PageToken"])))))))

(clojure.core/defn- response-list-portfolio-access-output ([input] (response-list-portfolio-access-output nil input)) ([resultWrapper2021079 input] (clojure.core/let [rawinput2021078 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021080 {"AccountIds" (rawinput2021078 "AccountIds"), "NextPageToken" (rawinput2021078 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021080 "AccountIds") (clojure.core/assoc :account-ids (deser-account-ids (clojure.core/get-in letvar2021080 ["AccountIds"]))) (letvar2021080 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021080 ["NextPageToken"])))))))

(clojure.core/defn- response-list-provisioned-product-plans-output ([input] (response-list-provisioned-product-plans-output nil input)) ([resultWrapper2021082 input] (clojure.core/let [rawinput2021081 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021083 {"ProvisionedProductPlans" (rawinput2021081 "ProvisionedProductPlans"), "NextPageToken" (rawinput2021081 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021083 "ProvisionedProductPlans") (clojure.core/assoc :provisioned-product-plans (deser-provisioned-product-plans (clojure.core/get-in letvar2021083 ["ProvisionedProductPlans"]))) (letvar2021083 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021083 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-portfolio-share-status-output ([input] (response-describe-portfolio-share-status-output nil input)) ([resultWrapper2021085 input] (clojure.core/let [rawinput2021084 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021086 {"PortfolioShareToken" (rawinput2021084 "PortfolioShareToken"), "PortfolioId" (rawinput2021084 "PortfolioId"), "OrganizationNodeValue" (rawinput2021084 "OrganizationNodeValue"), "Status" (rawinput2021084 "Status"), "ShareDetails" (rawinput2021084 "ShareDetails")}] (clojure.core/cond-> {} (letvar2021086 "PortfolioShareToken") (clojure.core/assoc :portfolio-share-token (deser-portfolio-share-token (clojure.core/get-in letvar2021086 ["PortfolioShareToken"]))) (letvar2021086 "PortfolioId") (clojure.core/assoc :portfolio-id (deser-id (clojure.core/get-in letvar2021086 ["PortfolioId"]))) (letvar2021086 "OrganizationNodeValue") (clojure.core/assoc :organization-node-value (deser-organization-node-value (clojure.core/get-in letvar2021086 ["OrganizationNodeValue"]))) (letvar2021086 "Status") (clojure.core/assoc :status (deser-share-status (clojure.core/get-in letvar2021086 ["Status"]))) (letvar2021086 "ShareDetails") (clojure.core/assoc :share-details (deser-share-details (clojure.core/get-in letvar2021086 ["ShareDetails"])))))))

(clojure.core/defn- response-reject-portfolio-share-output ([input] (response-reject-portfolio-share-output nil input)) ([resultWrapper2021088 input] (clojure.core/let [rawinput2021087 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021089 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-constraint-output ([input] (response-create-constraint-output nil input)) ([resultWrapper2021091 input] (clojure.core/let [rawinput2021090 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021092 {"ConstraintDetail" (rawinput2021090 "ConstraintDetail"), "ConstraintParameters" (rawinput2021090 "ConstraintParameters"), "Status" (rawinput2021090 "Status")}] (clojure.core/cond-> {} (letvar2021092 "ConstraintDetail") (clojure.core/assoc :constraint-detail (deser-constraint-detail (clojure.core/get-in letvar2021092 ["ConstraintDetail"]))) (letvar2021092 "ConstraintParameters") (clojure.core/assoc :constraint-parameters (deser-constraint-parameters (clojure.core/get-in letvar2021092 ["ConstraintParameters"]))) (letvar2021092 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2021092 ["Status"])))))))

(clojure.core/defn- response-batch-associate-service-action-with-provisioning-artifact-output ([input] (response-batch-associate-service-action-with-provisioning-artifact-output nil input)) ([resultWrapper2021094 input] (clojure.core/let [rawinput2021093 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021095 {"FailedServiceActionAssociations" (rawinput2021093 "FailedServiceActionAssociations")}] (clojure.core/cond-> {} (letvar2021095 "FailedServiceActionAssociations") (clojure.core/assoc :failed-service-action-associations (deser-failed-service-action-associations (clojure.core/get-in letvar2021095 ["FailedServiceActionAssociations"])))))))

(clojure.core/defn- response-operation-not-supported-exception ([input] (response-operation-not-supported-exception nil input)) ([resultWrapper2021097 input] (clojure.core/let [rawinput2021096 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021098 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-portfolios-for-product-output ([input] (response-list-portfolios-for-product-output nil input)) ([resultWrapper2021100 input] (clojure.core/let [rawinput2021099 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021101 {"PortfolioDetails" (rawinput2021099 "PortfolioDetails"), "NextPageToken" (rawinput2021099 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021101 "PortfolioDetails") (clojure.core/assoc :portfolio-details (deser-portfolio-details (clojure.core/get-in letvar2021101 ["PortfolioDetails"]))) (letvar2021101 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021101 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-provisioning-parameters-output ([input] (response-describe-provisioning-parameters-output nil input)) ([resultWrapper2021103 input] (clojure.core/let [rawinput2021102 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021104 {"ProvisioningArtifactParameters" (rawinput2021102 "ProvisioningArtifactParameters"), "ConstraintSummaries" (rawinput2021102 "ConstraintSummaries"), "UsageInstructions" (rawinput2021102 "UsageInstructions"), "TagOptions" (rawinput2021102 "TagOptions"), "ProvisioningArtifactPreferences" (rawinput2021102 "ProvisioningArtifactPreferences")}] (clojure.core/cond-> {} (letvar2021104 "ProvisioningArtifactParameters") (clojure.core/assoc :provisioning-artifact-parameters (deser-provisioning-artifact-parameters (clojure.core/get-in letvar2021104 ["ProvisioningArtifactParameters"]))) (letvar2021104 "ConstraintSummaries") (clojure.core/assoc :constraint-summaries (deser-constraint-summaries (clojure.core/get-in letvar2021104 ["ConstraintSummaries"]))) (letvar2021104 "UsageInstructions") (clojure.core/assoc :usage-instructions (deser-usage-instructions (clojure.core/get-in letvar2021104 ["UsageInstructions"]))) (letvar2021104 "TagOptions") (clojure.core/assoc :tag-options (deser-tag-option-summaries (clojure.core/get-in letvar2021104 ["TagOptions"]))) (letvar2021104 "ProvisioningArtifactPreferences") (clojure.core/assoc :provisioning-artifact-preferences (deser-provisioning-artifact-preferences (clojure.core/get-in letvar2021104 ["ProvisioningArtifactPreferences"])))))))

(clojure.core/defn- response-execute-provisioned-product-service-action-output ([input] (response-execute-provisioned-product-service-action-output nil input)) ([resultWrapper2021106 input] (clojure.core/let [rawinput2021105 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021107 {"RecordDetail" (rawinput2021105 "RecordDetail")}] (clojure.core/cond-> {} (letvar2021107 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2021107 ["RecordDetail"])))))))

(clojure.core/defn- response-list-launch-paths-output ([input] (response-list-launch-paths-output nil input)) ([resultWrapper2021109 input] (clojure.core/let [rawinput2021108 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021110 {"LaunchPathSummaries" (rawinput2021108 "LaunchPathSummaries"), "NextPageToken" (rawinput2021108 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021110 "LaunchPathSummaries") (clojure.core/assoc :launch-path-summaries (deser-launch-path-summaries (clojure.core/get-in letvar2021110 ["LaunchPathSummaries"]))) (letvar2021110 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021110 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-product-as-admin-output ([input] (response-describe-product-as-admin-output nil input)) ([resultWrapper2021112 input] (clojure.core/let [rawinput2021111 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021113 {"ProductViewDetail" (rawinput2021111 "ProductViewDetail"), "ProvisioningArtifactSummaries" (rawinput2021111 "ProvisioningArtifactSummaries"), "Tags" (rawinput2021111 "Tags"), "TagOptions" (rawinput2021111 "TagOptions")}] (clojure.core/cond-> {} (letvar2021113 "ProductViewDetail") (clojure.core/assoc :product-view-detail (deser-product-view-detail (clojure.core/get-in letvar2021113 ["ProductViewDetail"]))) (letvar2021113 "ProvisioningArtifactSummaries") (clojure.core/assoc :provisioning-artifact-summaries (deser-provisioning-artifact-summaries (clojure.core/get-in letvar2021113 ["ProvisioningArtifactSummaries"]))) (letvar2021113 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021113 ["Tags"]))) (letvar2021113 "TagOptions") (clojure.core/assoc :tag-options (deser-tag-option-details (clojure.core/get-in letvar2021113 ["TagOptions"])))))))

(clojure.core/defn- response-copy-product-output ([input] (response-copy-product-output nil input)) ([resultWrapper2021115 input] (clojure.core/let [rawinput2021114 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021116 {"CopyProductToken" (rawinput2021114 "CopyProductToken")}] (clojure.core/cond-> {} (letvar2021116 "CopyProductToken") (clojure.core/assoc :copy-product-token (deser-id (clojure.core/get-in letvar2021116 ["CopyProductToken"])))))))

(clojure.core/defn- response-describe-portfolio-output ([input] (response-describe-portfolio-output nil input)) ([resultWrapper2021118 input] (clojure.core/let [rawinput2021117 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021119 {"PortfolioDetail" (rawinput2021117 "PortfolioDetail"), "Tags" (rawinput2021117 "Tags"), "TagOptions" (rawinput2021117 "TagOptions")}] (clojure.core/cond-> {} (letvar2021119 "PortfolioDetail") (clojure.core/assoc :portfolio-detail (deser-portfolio-detail (clojure.core/get-in letvar2021119 ["PortfolioDetail"]))) (letvar2021119 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021119 ["Tags"]))) (letvar2021119 "TagOptions") (clojure.core/assoc :tag-options (deser-tag-option-details (clojure.core/get-in letvar2021119 ["TagOptions"])))))))

(clojure.core/defn- response-describe-provisioned-product-output ([input] (response-describe-provisioned-product-output nil input)) ([resultWrapper2021121 input] (clojure.core/let [rawinput2021120 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021122 {"ProvisionedProductDetail" (rawinput2021120 "ProvisionedProductDetail"), "CloudWatchDashboards" (rawinput2021120 "CloudWatchDashboards")}] (clojure.core/cond-> {} (letvar2021122 "ProvisionedProductDetail") (clojure.core/assoc :provisioned-product-detail (deser-provisioned-product-detail (clojure.core/get-in letvar2021122 ["ProvisionedProductDetail"]))) (letvar2021122 "CloudWatchDashboards") (clojure.core/assoc :cloud-watch-dashboards (deser-cloud-watch-dashboards (clojure.core/get-in letvar2021122 ["CloudWatchDashboards"])))))))

(clojure.core/defn- response-batch-disassociate-service-action-from-provisioning-artifact-output ([input] (response-batch-disassociate-service-action-from-provisioning-artifact-output nil input)) ([resultWrapper2021124 input] (clojure.core/let [rawinput2021123 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021125 {"FailedServiceActionAssociations" (rawinput2021123 "FailedServiceActionAssociations")}] (clojure.core/cond-> {} (letvar2021125 "FailedServiceActionAssociations") (clojure.core/assoc :failed-service-action-associations (deser-failed-service-action-associations (clojure.core/get-in letvar2021125 ["FailedServiceActionAssociations"])))))))

(clojure.core/defn- response-list-organization-portfolio-access-output ([input] (response-list-organization-portfolio-access-output nil input)) ([resultWrapper2021127 input] (clojure.core/let [rawinput2021126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021128 {"OrganizationNodes" (rawinput2021126 "OrganizationNodes"), "NextPageToken" (rawinput2021126 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021128 "OrganizationNodes") (clojure.core/assoc :organization-nodes (deser-organization-nodes (clojure.core/get-in letvar2021128 ["OrganizationNodes"]))) (letvar2021128 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021128 ["NextPageToken"])))))))

(clojure.core/defn- response-invalid-state-exception ([input] (response-invalid-state-exception nil input)) ([resultWrapper2021130 input] (clojure.core/let [rawinput2021129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021131 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-tag-option-with-resource-output ([input] (response-associate-tag-option-with-resource-output nil input)) ([resultWrapper2021133 input] (clojure.core/let [rawinput2021132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021134 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-service-action-output ([input] (response-update-service-action-output nil input)) ([resultWrapper2021136 input] (clojure.core/let [rawinput2021135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021137 {"ServiceActionDetail" (rawinput2021135 "ServiceActionDetail")}] (clojure.core/cond-> {} (letvar2021137 "ServiceActionDetail") (clojure.core/assoc :service-action-detail (deser-service-action-detail (clojure.core/get-in letvar2021137 ["ServiceActionDetail"])))))))

(clojure.core/defn- response-delete-provisioned-product-plan-output ([input] (response-delete-provisioned-product-plan-output nil input)) ([resultWrapper2021139 input] (clojure.core/let [rawinput2021138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021140 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-record-output ([input] (response-describe-record-output nil input)) ([resultWrapper2021142 input] (clojure.core/let [rawinput2021141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021143 {"RecordDetail" (rawinput2021141 "RecordDetail"), "RecordOutputs" (rawinput2021141 "RecordOutputs"), "NextPageToken" (rawinput2021141 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021143 "RecordDetail") (clojure.core/assoc :record-detail (deser-record-detail (clojure.core/get-in letvar2021143 ["RecordDetail"]))) (letvar2021143 "RecordOutputs") (clojure.core/assoc :record-outputs (deser-record-outputs (clojure.core/get-in letvar2021143 ["RecordOutputs"]))) (letvar2021143 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021143 ["NextPageToken"])))))))

(clojure.core/defn- response-describe-product-output ([input] (response-describe-product-output nil input)) ([resultWrapper2021145 input] (clojure.core/let [rawinput2021144 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021146 {"ProductViewSummary" (rawinput2021144 "ProductViewSummary"), "ProvisioningArtifacts" (rawinput2021144 "ProvisioningArtifacts")}] (clojure.core/cond-> {} (letvar2021146 "ProductViewSummary") (clojure.core/assoc :product-view-summary (deser-product-view-summary (clojure.core/get-in letvar2021146 ["ProductViewSummary"]))) (letvar2021146 "ProvisioningArtifacts") (clojure.core/assoc :provisioning-artifacts (deser-provisioning-artifacts (clojure.core/get-in letvar2021146 ["ProvisioningArtifacts"])))))))

(clojure.core/defn- response-search-products-output ([input] (response-search-products-output nil input)) ([resultWrapper2021148 input] (clojure.core/let [rawinput2021147 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021149 {"ProductViewSummaries" (rawinput2021147 "ProductViewSummaries"), "ProductViewAggregations" (rawinput2021147 "ProductViewAggregations"), "NextPageToken" (rawinput2021147 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021149 "ProductViewSummaries") (clojure.core/assoc :product-view-summaries (deser-product-view-summaries (clojure.core/get-in letvar2021149 ["ProductViewSummaries"]))) (letvar2021149 "ProductViewAggregations") (clojure.core/assoc :product-view-aggregations (deser-product-view-aggregations (clojure.core/get-in letvar2021149 ["ProductViewAggregations"]))) (letvar2021149 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021149 ["NextPageToken"])))))))

(clojure.core/defn- response-create-provisioning-artifact-output ([input] (response-create-provisioning-artifact-output nil input)) ([resultWrapper2021151 input] (clojure.core/let [rawinput2021150 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021152 {"ProvisioningArtifactDetail" (rawinput2021150 "ProvisioningArtifactDetail"), "Info" (rawinput2021150 "Info"), "Status" (rawinput2021150 "Status")}] (clojure.core/cond-> {} (letvar2021152 "ProvisioningArtifactDetail") (clojure.core/assoc :provisioning-artifact-detail (deser-provisioning-artifact-detail (clojure.core/get-in letvar2021152 ["ProvisioningArtifactDetail"]))) (letvar2021152 "Info") (clojure.core/assoc :info (deser-provisioning-artifact-info (clojure.core/get-in letvar2021152 ["Info"]))) (letvar2021152 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2021152 ["Status"])))))))

(clojure.core/defn- response-disassociate-service-action-from-provisioning-artifact-output ([input] (response-disassociate-service-action-from-provisioning-artifact-output nil input)) ([resultWrapper2021154 input] (clojure.core/let [rawinput2021153 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021155 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-provisioning-artifacts-output ([input] (response-list-provisioning-artifacts-output nil input)) ([resultWrapper2021157 input] (clojure.core/let [rawinput2021156 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021158 {"ProvisioningArtifactDetails" (rawinput2021156 "ProvisioningArtifactDetails"), "NextPageToken" (rawinput2021156 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021158 "ProvisioningArtifactDetails") (clojure.core/assoc :provisioning-artifact-details (deser-provisioning-artifact-details (clojure.core/get-in letvar2021158 ["ProvisioningArtifactDetails"]))) (letvar2021158 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021158 ["NextPageToken"])))))))

(clojure.core/defn- response-create-service-action-output ([input] (response-create-service-action-output nil input)) ([resultWrapper2021160 input] (clojure.core/let [rawinput2021159 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021161 {"ServiceActionDetail" (rawinput2021159 "ServiceActionDetail")}] (clojure.core/cond-> {} (letvar2021161 "ServiceActionDetail") (clojure.core/assoc :service-action-detail (deser-service-action-detail (clojure.core/get-in letvar2021161 ["ServiceActionDetail"])))))))

(clojure.core/defn- response-update-portfolio-output ([input] (response-update-portfolio-output nil input)) ([resultWrapper2021163 input] (clojure.core/let [rawinput2021162 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021164 {"PortfolioDetail" (rawinput2021162 "PortfolioDetail"), "Tags" (rawinput2021162 "Tags")}] (clojure.core/cond-> {} (letvar2021164 "PortfolioDetail") (clojure.core/assoc :portfolio-detail (deser-portfolio-detail (clojure.core/get-in letvar2021164 ["PortfolioDetail"]))) (letvar2021164 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2021164 ["Tags"])))))))

(clojure.core/defn- response-tag-option-not-migrated-exception ([input] (response-tag-option-not-migrated-exception nil input)) ([resultWrapper2021166 input] (clojure.core/let [rawinput2021165 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021167 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-scan-provisioned-products-output ([input] (response-scan-provisioned-products-output nil input)) ([resultWrapper2021169 input] (clojure.core/let [rawinput2021168 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021170 {"ProvisionedProducts" (rawinput2021168 "ProvisionedProducts"), "NextPageToken" (rawinput2021168 "NextPageToken")}] (clojure.core/cond-> {} (letvar2021170 "ProvisionedProducts") (clojure.core/assoc :provisioned-products (deser-provisioned-product-details (clojure.core/get-in letvar2021170 ["ProvisionedProducts"]))) (letvar2021170 "NextPageToken") (clojure.core/assoc :next-page-token (deser-page-token (clojure.core/get-in letvar2021170 ["NextPageToken"])))))))

(clojure.core/defn- response-duplicate-resource-exception ([input] (response-duplicate-resource-exception nil input)) ([resultWrapper2021172 input] (clojure.core/let [rawinput2021171 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021173 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-constraint-output ([input] (response-describe-constraint-output nil input)) ([resultWrapper2021175 input] (clojure.core/let [rawinput2021174 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2021176 {"ConstraintDetail" (rawinput2021174 "ConstraintDetail"), "ConstraintParameters" (rawinput2021174 "ConstraintParameters"), "Status" (rawinput2021174 "Status")}] (clojure.core/cond-> {} (letvar2021176 "ConstraintDetail") (clojure.core/assoc :constraint-detail (deser-constraint-detail (clojure.core/get-in letvar2021176 ["ConstraintDetail"]))) (letvar2021176 "ConstraintParameters") (clojure.core/assoc :constraint-parameters (deser-constraint-parameters (clojure.core/get-in letvar2021176 ["ConstraintParameters"]))) (letvar2021176 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar2021176 ["Status"])))))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag-key))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-summaries :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-change/action (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/change-action))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-change/resource-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/plan-resource-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-change/details (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-change-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.resource-change/action :portkey.aws.servicecatalog.-2015-12-10/logical-resource-id :portkey.aws.servicecatalog.-2015-12-10/physical-resource-id :portkey.aws.servicecatalog.-2015-12-10.resource-change/resource-type :portkey.aws.servicecatalog.-2015-12-10/replacement :portkey.aws.servicecatalog.-2015-12-10/scope :portkey.aws.servicecatalog.-2015-12-10.resource-change/details]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-accounts (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/account-id))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-source #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/source-product-arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/target-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/target-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/source-provisioning-artifact-identifiers (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/source-provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/copy-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.copy-product-input/source-product-arn :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/target-product-id :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/target-product-name :portkey.aws.servicecatalog.-2015-12-10.copy-product-input/source-provisioning-artifact-identifiers :portkey.aws.servicecatalog.-2015-12-10/copy-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-type #{:ssm-automation "SSM_AUTOMATION"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-copy-product-status-input/copy-product-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.describe-copy-product-status-input/copy-product-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/principal-type #{"IAM" :iam})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-summary :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifacts]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/physical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-filters (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-by :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-association/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-association/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-association/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-association (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.service-action-association/service-action-id :portkey.aws.servicecatalog.-2015-12-10.service-action-association/product-id :portkey.aws.servicecatalog.-2015-12-10.service-action-association/provisioning-artifact-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioned-product-plan-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-details :portkey.aws.servicecatalog.-2015-12-10/resource-changes :portkey.aws.servicecatalog.-2015-12-10.describe-provisioned-product-plan-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/launch-path-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/launch-path-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/copy-options (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/copy-option))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/record-tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-share-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-record-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/support-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-changes (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/resource-change))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-detail/product-arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-summary :portkey.aws.servicecatalog.-2015-12-10/status :portkey.aws.servicecatalog.-2015-12-10.product-view-detail/product-arn :portkey.aws.servicecatalog.-2015-12-10/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/provisioning-artifact-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/tags (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/add-tags))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-product-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-product-input/name :portkey.aws.servicecatalog.-2015-12-10.create-product-input/owner :portkey.aws.servicecatalog.-2015-12-10/product-type :portkey.aws.servicecatalog.-2015-12-10.create-product-input/provisioning-artifact-parameters :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/support-description :portkey.aws.servicecatalog.-2015-12-10.create-product-input/tags :portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.create-product-input/description :portkey.aws.servicecatalog.-2015-12-10.create-product-input/distributor :portkey.aws.servicecatalog.-2015-12-10/support-url :portkey.aws.servicecatalog.-2015-12-10/support-email]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/logical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provision-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/parameter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/total-results-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/user-arn-session (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/copy-option #{:copy-tags "CopyTags"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/portfolio-id :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/product-id :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/parameters :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/type :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.create-constraint-input/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-constraint-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.update-constraint-input/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.delete-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.delete-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/account-id :portkey.aws.servicecatalog.-2015-12-10/organization-node]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-operation-type #{"DELETE" :create :update :delete "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1224)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-property-name #{:id "Id"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/tags (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/add-tags))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/display-name :portkey.aws.servicecatalog.-2015-12-10/provider-name :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/description :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-input/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/page-size (clojure.spec.alpha/int-in 0 20))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-attributes (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-attribute))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-portfolios-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-details :portkey.aws.servicecatalog.-2015-12-10.list-portfolios-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/constraint-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/account-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.constraint-detail/constraint-id :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/type :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/description :portkey.aws.servicecatalog.-2015-12-10.constraint-detail/owner]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/resource-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/definition (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-map))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/name :portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/definition :portkey.aws.servicecatalog.-2015-12-10.update-service-action-input/description :portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/approximate-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/property-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-type #{:cloudformation "CLOUDFORMATION"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregations (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-type :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9._-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/product-view-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-short-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.access-level-filter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/access-level-filter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.access-level-filter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/access-level-filter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/access-level-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.access-level-filter/key :portkey.aws.servicecatalog.-2015-12-10.access-level-filter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/usage-instructions (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/usage-instruction))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/status-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000a\u000d\u0020-\uD7FF\uE000-\uFFFD]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-output/provisioned-products (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-attributes))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-output/provisioned-products :portkey.aws.servicecatalog.-2015-12-10/total-results-count :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-share-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-status #{"IN_PROGRESS" :in-progress "IN_PROGRESS_IN_ERROR" :created "SUCCEEDED" "FAILED" :in-progress-in-error :failed :succeeded "CREATED"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/source-provisioning-artifact-properties (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/source-provisioning-artifact-properties-map))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-parameter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/parameter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-parameter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/parameter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.provisioning-parameter/key :portkey.aws.servicecatalog.-2015-12-10.provisioning-parameter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/access-status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-product-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-associations] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/constraint-detail :portkey.aws.servicecatalog.-2015-12-10/constraint-parameters :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-associations] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/organization-nodes (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/organization-node))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/constraint-details :portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/record-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/tag-option-details :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-status #{:create-success :execute-success "CREATE_SUCCESS" :execute-failed "CREATE_FAILED" "EXECUTE_FAILED" "CREATE_IN_PROGRESS" :create-failed :create-in-progress "EXECUTE_IN_PROGRESS" "EXECUTE_SUCCESS" :execute-in-progress})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/change-action #{"ADD" :remove "MODIFY" "REMOVE" :add :modify})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/sort-field))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/page-size (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-page-size))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/access-level-filter :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/filters :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/sort-by :portkey.aws.servicecatalog.-2015-12-10/sort-order :portkey.aws.servicecatalog.-2015-12-10.search-provisioned-products-input/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-plan-input/plan-id :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/allowed-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/allowed-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-launch-paths-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-launch-paths-input/product-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-accepted-portfolio-shares-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-details :portkey.aws.servicecatalog.-2015-12-10.list-accepted-portfolio-shares-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/sort-order #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-principals-for-portfolio-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/principals :portkey.aws.servicecatalog.-2015-12-10.list-principals-for-portfolio-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10.disassociate-service-action-from-provisioning-artifact-input/service-action-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/evaluation-type #{:static :dynamic "STATIC" "DYNAMIC"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-for-service-action-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-views :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-for-service-action-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-details :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioned-product-plans-input/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.list-provisioned-product-plans-input/provision-product-id :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/access-level-filter]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/organization-node-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"(^[0-9]{12}$)|(^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32})|(^o-[a-z0-9]{10,32}$)|(^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}$)|(^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$)" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-key #{:assume-role "Parameters" "AssumeRole" :name "Version" :version "Name" :parameters})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-principals-for-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-principals-for-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/successful-shares (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/account-id))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/name :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/description :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-associations (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/service-action-association :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/plan-name :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/plan-type :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/product-id :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/path-id :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-input/provisioning-parameters :portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/notification-arns]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.delete-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.delete-tag-option-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-record-history-input/search-filter (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-record-history-search-filter))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-record-history-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/access-level-filter :portkey.aws.servicecatalog.-2015-12-10.list-record-history-input/search-filter :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/creation-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/active (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/name :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/description :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/type :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/created-time :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-detail/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboards (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboard))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/has-default-path clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plans (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/status #{:creating "AVAILABLE" "CREATING" "FAILED" :available :failed})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/principal-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-output/info :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/provision-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provision-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.provision-product-input/product-id :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.provision-product-input/provision-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.provision-product-input/path-id :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10/provisioning-parameters :portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/notification-arns :portkey.aws.servicecatalog.-2015-12-10/provisioning-preferences]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-map (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-key :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/access-level-filter :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/status (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/record-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-detail/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-tags :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.record-detail/path-id :portkey.aws.servicecatalog.-2015-12-10.record-detail/status :portkey.aws.servicecatalog.-2015-12-10/created-time :portkey.aws.servicecatalog.-2015-12-10.record-detail/record-id :portkey.aws.servicecatalog.-2015-12-10/record-type :portkey.aws.servicecatalog.-2015-12-10.record-detail/provisioned-product-id :portkey.aws.servicecatalog.-2015-12-10.record-detail/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/record-errors :portkey.aws.servicecatalog.-2015-12-10/updated-time :portkey.aws.servicecatalog.-2015-12-10.record-detail/product-id :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/plan-name :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/plan-id :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/provision-product-id :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.create-provisioned-product-plan-output/provisioning-artifact-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-detail :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail :portkey.aws.servicecatalog.-2015-12-10/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-record-history-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-record-history-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-details :portkey.aws.servicecatalog.-2015-12-10.list-record-history-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/requires-recreation #{"ALWAYS" :conditionally :never "NEVER" "CONDITIONALLY" :always})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info-key :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag-option-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.accept-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.accept-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/portfolio-share-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/tag-option-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/resource-type :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/ignore-errors clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/instruction-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-preferences (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/stack-set-accounts :portkey.aws.servicecatalog.-2015-12-10/stack-set-regions :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-count :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-percentage :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-count :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-percentage :portkey.aws.servicecatalog.-2015-12-10/stack-set-operation-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-share-token] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-sort-by))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/portfolio-id :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/filters :portkey.aws.servicecatalog.-2015-12-10.search-products-as-admin-input/sort-by :portkey.aws.servicecatalog.-2015-12-10/sort-order :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/product-source]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-error/code (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/error-code))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-error/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/error-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.record-error/code :portkey.aws.servicecatalog.-2015-12-10.record-error/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-principal-with-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.associate-principal-with-portfolio-input/portfolio-id :portkey.aws.servicecatalog.-2015-12-10/principal-arn :portkey.aws.servicecatalog.-2015-12-10/principal-type] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provision-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provision-product-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provision-product-name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/plan-type :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-summary/provisioning-artifact-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/status-detail (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-page-size (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-views (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-view))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-share-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/remove-tags (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-keys))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/display-name :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/description :portkey.aws.servicecatalog.-2015-12-10/provider-name :portkey.aws.servicecatalog.-2015-12-10/add-tags :portkey.aws.servicecatalog.-2015-12-10.update-portfolio-input/remove-tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/access-level-filter-key #{:role "User" "Role" :account "Account" :user})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-association-error-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-output/info :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/accept-language (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/creation-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/arn :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/display-name :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/description :portkey.aws.servicecatalog.-2015-12-10.portfolio-detail/created-time :portkey.aws.servicecatalog.-2015-12-10/provider-name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/account-id :portkey.aws.servicecatalog.-2015-12-10/organization-node]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-detail :portkey.aws.servicecatalog.-2015-12-10/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-preferences (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/stack-set-accounts :portkey.aws.servicecatalog.-2015-12-10/stack-set-regions]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/share-status #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "COMPLETED_WITH_ERRORS" "ERROR" "NOT_STARTED" :error :not-started :completed-with-errors})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-product-input/remove-tags (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-keys))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-product-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-product-input/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-product-input/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-product-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.update-product-input/remove-tags :portkey.aws.servicecatalog.-2015-12-10/support-description :portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.update-product-input/description :portkey.aws.servicecatalog.-2015-12-10.update-product-input/owner :portkey.aws.servicecatalog.-2015-12-10.update-product-input/distributor :portkey.aws.servicecatalog.-2015-12-10/add-tags :portkey.aws.servicecatalog.-2015-12-10.update-product-input/name :portkey.aws.servicecatalog.-2015-12-10/support-url :portkey.aws.servicecatalog.-2015-12-10/support-email]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-copy-product-status-output/target-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/copy-product-status :portkey.aws.servicecatalog.-2015-12-10.describe-copy-product-status-output/target-product-id :portkey.aws.servicecatalog.-2015-12-10/status-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/verbose clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/product-id :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-input/path-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-summaries :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.list-tag-options-input/filters :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/last-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/output-key :portkey.aws.servicecatalog.-2015-12-10/output-value :portkey.aws.servicecatalog.-2015-12-10/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-attribute #{:properties :tags "METADATA" "DELETIONPOLICY" :creationpolicy "UPDATEPOLICY" "CREATIONPOLICY" :updatepolicy :deletionpolicy "PROPERTIES" "TAGS" :metadata})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-detail :portkey.aws.servicecatalog.-2015-12-10/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/resource-details :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-portfolio-access-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/account-ids :portkey.aws.servicecatalog.-2015-12-10.list-portfolio-access-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-principal-from-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.disassociate-principal-from-portfolio-input/portfolio-id :portkey.aws.servicecatalog.-2015-12-10/principal-arn] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioned-product-plans-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plans :portkey.aws.servicecatalog.-2015-12-10.list-provisioned-product-plans-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/notification-arns (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/notification-arn :max-count 5))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/resource-id :portkey.aws.servicecatalog.-2015-12-10/tag-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail-created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-share-status-output/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-share-status-output/status (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/share-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-share-token :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-share-status-output/portfolio-id :portkey.aws.servicecatalog.-2015-12-10/organization-node-value :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-share-status-output/status :portkey.aws.servicecatalog.-2015-12-10/share-details]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/physical-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/short-description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-distributor))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/support-description :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/type :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/short-description :portkey.aws.servicecatalog.-2015-12-10/has-default-path :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/owner :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/distributor :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/name :portkey.aws.servicecatalog.-2015-12-10/support-url :portkey.aws.servicecatalog.-2015-12-10.product-view-summary/product-id :portkey.aws.servicecatalog.-2015-12-10/support-email :portkey.aws.servicecatalog.-2015-12-10/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-percentage (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/constraint-detail :portkey.aws.servicecatalog.-2015-12-10/constraint-parameters :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-organization-portfolio-access-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-organization-portfolio-access-input/portfolio-id :portkey.aws.servicecatalog.-2015-12-10/organization-node-type] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-tag/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/record-tag-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.record-tag/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/record-tag-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.record-tag/key :portkey.aws.servicecatalog.-2015-12-10.record-tag/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-target-definition/attribute (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-attribute))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-target-definition/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/property-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-target-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.resource-target-definition/attribute :portkey.aws.servicecatalog.-2015-12-10.resource-target-definition/name :portkey.aws.servicecatalog.-2015-12-10/requires-recreation]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/provisioning-artifact-metadata (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/name :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/description :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/created-time :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-summary/provisioning-artifact-metadata]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/failed-service-action-associations]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-input/parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-input/parameters :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-for-service-action-input/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-for-service-action-input/service-action-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.cloud-watch-dashboard/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboard-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.cloud-watch-dashboard/name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-portfolios-for-product-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-details :portkey.aws.servicecatalog.-2015-12-10.list-portfolios-for-product-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioned-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/update-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-preferences (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-preferences))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/update-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/path-id :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-parameters :portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioned-product-id :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/provisioning-preferences :portkey.aws.servicecatalog.-2015-12-10.update-provisioned-product-input/product-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.reject-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.reject-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/portfolio-share-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-summaries))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-parameters :portkey.aws.servicecatalog.-2015-12-10/constraint-summaries :portkey.aws.servicecatalog.-2015-12-10/usage-instructions :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-parameters-output/tag-options :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-preferences]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-.]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[0-9]{12}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-filter-by #{:source-product-id "FullTextSearch" :full-text-search "SourceProductId" :product-type "Owner" "ProductType" :owner})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.share-error/accounts (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/namespaces))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/share-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.share-error/accounts :portkey.aws.servicecatalog.-2015-12-10/message :portkey.aws.servicecatalog.-2015-12-10/error]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-launch-paths-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/launch-path-summaries :portkey.aws.servicecatalog.-2015-12-10.list-launch-paths-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboard-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/instruction-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-product-as-admin-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-detail :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-summaries :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.describe-product-as-admin-output/tag-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.copy-product-output/copy-product-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/copy-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.copy-product-output/copy-product-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/error-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-detail :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.describe-portfolio-output/tag-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/notification-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1224)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/sort-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.delete-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.delete-provisioned-product-plan-input/plan-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/ignore-errors]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/info (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-properties (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/info] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/name :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/description :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-properties/type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/namespaces (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/account-id))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-type #{:marketplace-ami :cloud-formation-template :marketplace-car "CLOUD_FORMATION_TEMPLATE" "MARKETPLACE_AMI" "MARKETPLACE_CAR"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/provisioned-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/terminate-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/terminate-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/provisioned-product-name :portkey.aws.servicecatalog.-2015-12-10.terminate-provisioned-product-input/provisioned-product-id :portkey.aws.servicecatalog.-2015-12-10/ignore-errors :portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-portfolio-access-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-portfolio-access-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-portfolios-for-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-portfolios-for-product-input/product-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/source-provisioning-artifact-properties-map (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-property-name :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-property-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/access-status #{"DISABLED" :disabled :under-change "ENABLED" :enabled "UNDER_CHANGE"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-change-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/resource-change-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-product-from-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.disassociate-product-from-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.disassociate-product-from-portfolio-input/product-id :portkey.aws.servicecatalog.-2015-12-10.disassociate-product-from-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9_-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/portfolio-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/active (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/key :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/value :portkey.aws.servicecatalog.-2015-12-10.list-tag-options-filters/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioned-product-detail :portkey.aws.servicecatalog.-2015-12-10/cloud-watch-dashboards]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/product-view-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/status (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provision-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-plan-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/status-message :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/path-id :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provision-product-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/status :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provisioning-parameters :portkey.aws.servicecatalog.-2015-12-10/created-time :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-type :portkey.aws.servicecatalog.-2015-12-10/notification-arns :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/updated-time :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/product-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/provision-product-name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-plan-details/plan-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/active (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/key :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/value :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/active :portkey.aws.servicecatalog.-2015-12-10.tag-option-detail/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/failed-service-action-associations (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/failed-service-action-association :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/source-portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/product-id :portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.associate-product-with-portfolio-input/source-portfolio-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/constraint-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-sort-by #{"Title" :title "VersionCount" :creation-date :version-count "CreationDate"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.describe-provisioned-product-plan-input/plan-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/execute-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/provisioned-product-id :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/service-action-id :portkey.aws.servicecatalog.-2015-12-10.execute-provisioned-product-service-action-input/execute-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/access-level-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/failed-service-action-associations]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.launch-path-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/portfolio-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/launch-path-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10/constraint-summaries :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.launch-path-summary/name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-filters (clojure.spec.alpha/map-of :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-by :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/allowed-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/error-code (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-association-error-code))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/error-message (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-association-error-message))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/failed-service-action-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/service-action-id :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/product-id :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/error-code :portkey.aws.servicecatalog.-2015-12-10.failed-service-action-association/error-message]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-organization-portfolio-access-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/organization-nodes :portkey.aws.servicecatalog.-2015-12-10.list-organization-portfolio-access-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-parameters (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/status-message (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status-message))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/status (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/last-record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/last-request-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/type :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/status-message :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/status :portkey.aws.servicecatalog.-2015-12-10/created-time :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/arn :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/idempotency-token :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/product-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/last-record-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-detail/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1224)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-type #{:cloud-formation-template "CLOUD_FORMATION_TEMPLATE" "MARKETPLACE" :marketplace})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-errors (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/record-error))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/updated-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-distributor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-detail-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-detail-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-detail-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-detail-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-detail-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.resource-detail/id :portkey.aws.servicecatalog.-2015-12-10.resource-detail/arn :portkey.aws.servicecatalog.-2015-12-10.resource-detail/name :portkey.aws.servicecatalog.-2015-12-10.resource-detail/description :portkey.aws.servicecatalog.-2015-12-10.resource-detail/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-record-history-search-filter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-filter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-record-history-search-filter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-filter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-record-history-search-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.list-record-history-search-filter/key :portkey.aws.servicecatalog.-2015-12-10.list-record-history-search-filter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/add-tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag :max-count 20))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-input/product-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/resource-id :portkey.aws.servicecatalog.-2015-12-10/tag-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.tag/key :portkey.aws.servicecatalog.-2015-12-10.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/stack-set-regions (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/region))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-view-filter-by #{"SearchQuery" :search-query})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-record-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-record-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/record-detail :portkey.aws.servicecatalog.-2015-12-10/record-outputs :portkey.aws.servicecatalog.-2015-12-10.describe-record-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-preferences (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/stack-set-accounts :portkey.aws.servicecatalog.-2015-12-10/stack-set-regions :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-count :portkey.aws.servicecatalog.-2015-12-10/stack-set-failure-tolerance-percentage :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-count :portkey.aws.servicecatalog.-2015-12-10/stack-set-max-concurrency-percentage]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/replacement #{:true "CONDITIONAL" :false "TRUE" "FALSE" :conditional})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.organization-node/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/organization-node-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.organization-node/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/organization-node-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/organization-node (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.organization-node/type :portkey.aws.servicecatalog.-2015-12-10.organization-node/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-detail/definition (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-map))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-summary :portkey.aws.servicecatalog.-2015-12-10.service-action-detail/definition]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag-option-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.usage-instruction/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/instruction-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.usage-instruction/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/instruction-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/usage-instruction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.usage-instruction/type :portkey.aws.servicecatalog.-2015-12-10.usage-instruction/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/no-echo clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-tag-option-input/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-tag-option-input/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-tag-option-input/key :portkey.aws.servicecatalog.-2015-12-10.create-tag-option-input/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-share-type #{:imported "IMPORTED" :aws-servicecatalog "AWS_SERVICECATALOG" :aws-organizations "AWS_ORGANIZATIONS"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-summary :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifacts]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/definition-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/id :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/name :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/description :portkey.aws.servicecatalog.-2015-12-10.service-action-summary/definition-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/use-previous-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-summaries :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregations :portkey.aws.servicecatalog.-2015-12-10.search-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/output-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-detail :portkey.aws.servicecatalog.-2015-12-10.create-provisioning-artifact-output/info :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-change-detail/target (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/resource-target-definition))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.resource-change-detail/evaluation (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/evaluation-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-change-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.resource-change-detail/target :portkey.aws.servicecatalog.-2015-12-10.resource-change-detail/evaluation :portkey.aws.servicecatalog.-2015-12-10/causing-entity]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/active (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/name :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/description :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-artifact-input/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/support-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2083))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-summary/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.constraint-summary/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.constraint-summary/type :portkey.aws.servicecatalog.-2015-12-10.constraint-summary/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-summary/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.tag-option-summary/values (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-values))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.tag-option-summary/key :portkey.aws.servicecatalog.-2015-12-10.tag-option-summary/values]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-details :portkey.aws.servicecatalog.-2015-12-10.list-provisioning-artifacts-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/account-ids (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/account-id))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/principal-arn :portkey.aws.servicecatalog.-2015-12-10/principal-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-input (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.describe-tag-option-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/constraint-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-service-action-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/service-action-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/plan-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status #{:tainted :under-change "TAINTED" "AVAILABLE" "ERROR" :plan-in-progress :error :available "UNDER_CHANGE" "PLAN_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/copy-product-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/share-errors (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/share-error))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/output-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/portfolio-detail :portkey.aws.servicecatalog.-2015-12-10/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-association-error-code #{:limit-exceeded "INTERNAL_FAILURE" "RESOURCE_NOT_FOUND" "LIMIT_EXCEEDED" :internal-failure :throttling "THROTTLING" :duplicate-resource "DUPLICATE_RESOURCE" :resource-not-found})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/service-action-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10.associate-service-action-with-provisioning-artifact-input/service-action-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-input/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10.describe-provisioning-artifact-input/product-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/verbose]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.product-view-aggregation-value/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/attribute-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/product-view-aggregation-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.product-view-aggregation-value/value :portkey.aws.servicecatalog.-2015-12-10/approximate-count]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-outputs (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/record-output))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2024)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0009\u000a\u000d\u0020-\uD7FF\uE000-\uFFFD]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/support-email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 254))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.delete-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.delete-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.delete-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.delete-provisioning-artifact-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/tag-option-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/constraint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/scope (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/resource-attribute))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-filter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/definition-type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/definition (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-definition-map))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/service-action-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/create-service-action-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/name :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/definition-type :portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/definition :portkey.aws.servicecatalog.-2015-12-10/idempotency-token] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.create-service-action-input/description :portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifacts (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/record-tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/user-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/service-action-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/service-action-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/type (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/status-message (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status-message))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/status (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/name (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/last-record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/user-arn-session :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/type :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/status-message :portkey.aws.servicecatalog.-2015-12-10/tags :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/status :portkey.aws.servicecatalog.-2015-12-10/created-time :portkey.aws.servicecatalog.-2015-12-10/physical-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/arn :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/provisioning-artifact-id :portkey.aws.servicecatalog.-2015-12-10/idempotency-token :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/name :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/product-id :portkey.aws.servicecatalog.-2015-12-10.provisioned-product-attribute/last-record-id :portkey.aws.servicecatalog.-2015-12-10/user-arn :portkey.aws.servicecatalog.-2015-12-10/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_\-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/portfolio-share-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/active (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/value :portkey.aws.servicecatalog.-2015-12-10.update-tag-option-input/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/parameter-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/allowed-values]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.scan-provisioned-products-output/provisioned-products (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.scan-provisioned-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.scan-provisioned-products-output/provisioned-products :portkey.aws.servicecatalog.-2015-12-10.scan-provisioned-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/organization-node-type #{"ORGANIZATION" :organization :organizational-unit :account "ACCOUNT" "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioned-product-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.-2015-12-10.list-service-actions-for-provisioning-artifact-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token :portkey.aws.servicecatalog.-2015-12-10/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.search-products-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/product-view-sort-by))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/search-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.search-products-input/filters :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10.search-products-input/sort-by :portkey.aws.servicecatalog.-2015-12-10/sort-order :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/portfolio-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-parameter/is-no-echo (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/no-echo))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/parameter-key :portkey.aws.servicecatalog.-2015-12-10/default-value :portkey.aws.servicecatalog.-2015-12-10/parameter-type :portkey.aws.servicecatalog.-2015-12-10.provisioning-artifact-parameter/is-no-echo :portkey.aws.servicecatalog.-2015-12-10/description :portkey.aws.servicecatalog.-2015-12-10/parameter-constraints]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/causing-entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact-view (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/product-view-summary :portkey.aws.servicecatalog.-2015-12-10/provisioning-artifact]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/principals (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog.-2015-12-10/principal))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-parameter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/parameter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-parameter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/parameter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10.update-provisioning-parameter/key :portkey.aws.servicecatalog.-2015-12-10.update-provisioning-parameter/value :portkey.aws.servicecatalog.-2015-12-10/use-previous-value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/accept-language :portkey.aws.servicecatalog.-2015-12-10.list-constraints-for-portfolio-input/product-id :portkey.aws.servicecatalog.-2015-12-10/page-size :portkey.aws.servicecatalog.-2015-12-10/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/constraint-detail :portkey.aws.servicecatalog.-2015-12-10/constraint-parameters :portkey.aws.servicecatalog.-2015-12-10/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.-2015-12-10/share-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.-2015-12-10/successful-shares :portkey.aws.servicecatalog.-2015-12-10/share-errors]))

(clojure.core/defn list-accepted-portfolio-shares ([] (list-accepted-portfolio-shares {})) ([list-accepted-portfolio-shares-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-accepted-portfolio-shares-input list-accepted-portfolio-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAcceptedPortfolioShares", :http.request.configuration/output-deser-fn response-list-accepted-portfolio-shares-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-accepted-portfolio-shares :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-accepted-portfolio-shares-output))

(clojure.core/defn describe-provisioning-artifact ([describe-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-provisioning-artifact-input describe-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProvisioningArtifact", :http.request.configuration/output-deser-fn response-describe-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-artifact-output))

(clojure.core/defn update-tag-option ([update-tag-option-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-tag-option-input update-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTagOption", :http.request.configuration/output-deser-fn response-update-tag-option-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-tag-option-output))

(clojure.core/defn list-organization-portfolio-access ([list-organization-portfolio-access-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-organization-portfolio-access-input list-organization-portfolio-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOrganizationPortfolioAccess", :http.request.configuration/output-deser-fn response-list-organization-portfolio-access-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-organization-portfolio-access :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-organization-portfolio-access-output))

(clojure.core/defn list-service-actions ([] (list-service-actions {})) ([list-service-actions-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-service-actions-input list-service-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServiceActions", :http.request.configuration/output-deser-fn response-list-service-actions-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-service-actions :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-output))

(clojure.core/defn delete-service-action ([delete-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-service-action-input delete-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServiceAction", :http.request.configuration/output-deser-fn response-delete-service-action-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-service-action-output))

(clojure.core/defn disassociate-product-from-portfolio ([disassociate-product-from-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-product-from-portfolio-input disassociate-product-from-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateProductFromPortfolio", :http.request.configuration/output-deser-fn response-disassociate-product-from-portfolio-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef disassociate-product-from-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/disassociate-product-from-portfolio-output))

(clojure.core/defn describe-copy-product-status ([describe-copy-product-status-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-copy-product-status-input describe-copy-product-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCopyProductStatus", :http.request.configuration/output-deser-fn response-describe-copy-product-status-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-copy-product-status :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-copy-product-status-output))

(clojure.core/defn list-provisioning-artifacts ([list-provisioning-artifacts-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-provisioning-artifacts-input list-provisioning-artifacts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProvisioningArtifacts", :http.request.configuration/output-deser-fn response-list-provisioning-artifacts-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-provisioning-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-output))

(clojure.core/defn describe-portfolio-share-status ([describe-portfolio-share-status-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-portfolio-share-status-input describe-portfolio-share-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePortfolioShareStatus", :http.request.configuration/output-deser-fn response-describe-portfolio-share-status-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef describe-portfolio-share-status :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-share-status-output))

(clojure.core/defn associate-principal-with-portfolio ([associate-principal-with-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-principal-with-portfolio-input associate-principal-with-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociatePrincipalWithPortfolio", :http.request.configuration/output-deser-fn response-associate-principal-with-portfolio-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-principal-with-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/associate-principal-with-portfolio-output))

(clojure.core/defn provision-product ([provision-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-provision-product-input provision-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/provision-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/provision-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ProvisionProduct", :http.request.configuration/output-deser-fn response-provision-product-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef provision-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/provision-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/provision-product-output))

(clojure.core/defn list-portfolios-for-product ([list-portfolios-for-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-portfolios-for-product-input list-portfolios-for-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPortfoliosForProduct", :http.request.configuration/output-deser-fn response-list-portfolios-for-product-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-portfolios-for-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-for-product-output))

(clojure.core/defn list-provisioned-product-plans ([] (list-provisioned-product-plans {})) ([list-provisioned-product-plans-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-provisioned-product-plans-input list-provisioned-product-plans-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProvisionedProductPlans", :http.request.configuration/output-deser-fn response-list-provisioned-product-plans-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-provisioned-product-plans :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-provisioned-product-plans-output))

(clojure.core/defn delete-portfolio ([delete-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-portfolio-input delete-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePortfolio", :http.request.configuration/output-deser-fn response-delete-portfolio-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef delete-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-output))

(clojure.core/defn enable-aws-organizations-access ([] (enable-aws-organizations-access {})) ([enable-aws-organizations-access-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-aws-organizations-access-input enable-aws-organizations-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAWSOrganizationsAccess", :http.request.configuration/output-deser-fn response-enable-aws-organizations-access-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef enable-aws-organizations-access :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/enable-aws-organizations-access-output))

(clojure.core/defn accept-portfolio-share ([accept-portfolio-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-accept-portfolio-share-input accept-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptPortfolioShare", :http.request.configuration/output-deser-fn response-accept-portfolio-share-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef accept-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/accept-portfolio-share-output))

(clojure.core/defn describe-provisioning-parameters ([describe-provisioning-parameters-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-provisioning-parameters-input describe-provisioning-parameters-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProvisioningParameters", :http.request.configuration/output-deser-fn response-describe-provisioning-parameters-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioning-parameters :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-provisioning-parameters-output))

(clojure.core/defn describe-product ([describe-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-product-input describe-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProduct", :http.request.configuration/output-deser-fn response-describe-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-product-output))

(clojure.core/defn search-products ([] (search-products {})) ([search-products-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-products-input search-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/search-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/search-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchProducts", :http.request.configuration/output-deser-fn response-search-products-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/search-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-products-output))

(clojure.core/defn list-record-history ([] (list-record-history {})) ([list-record-history-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-record-history-input list-record-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-record-history-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-record-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRecordHistory", :http.request.configuration/output-deser-fn response-list-record-history-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-record-history :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-record-history-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-record-history-output))

(clojure.core/defn search-provisioned-products ([] (search-provisioned-products {})) ([search-provisioned-products-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-provisioned-products-input search-provisioned-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchProvisionedProducts", :http.request.configuration/output-deser-fn response-search-provisioned-products-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-provisioned-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-provisioned-products-output))

(clojure.core/defn create-portfolio-share ([create-portfolio-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-portfolio-share-input create-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePortfolioShare", :http.request.configuration/output-deser-fn response-create-portfolio-share-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef create-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-share-output))

(clojure.core/defn describe-product-as-admin ([describe-product-as-admin-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-product-as-admin-input describe-product-as-admin-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProductAsAdmin", :http.request.configuration/output-deser-fn response-describe-product-as-admin-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-product-as-admin :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-product-as-admin-output))

(clojure.core/defn associate-product-with-portfolio ([associate-product-with-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-product-with-portfolio-input associate-product-with-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateProductWithPortfolio", :http.request.configuration/output-deser-fn response-associate-product-with-portfolio-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-product-with-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/associate-product-with-portfolio-output))

(clojure.core/defn list-tag-options ([] (list-tag-options {})) ([list-tag-options-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tag-options-input list-tag-options-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagOptions", :http.request.configuration/output-deser-fn response-list-tag-options-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-tag-options :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-tag-options-output))

(clojure.core/defn create-service-action ([create-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-service-action-input create-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateServiceAction", :http.request.configuration/output-deser-fn response-create-service-action-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-service-action-output))

(clojure.core/defn update-product ([update-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-product-input update-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProduct", :http.request.configuration/output-deser-fn response-update-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef update-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-product-output))

(clojure.core/defn describe-portfolio ([describe-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-portfolio-input describe-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePortfolio", :http.request.configuration/output-deser-fn response-describe-portfolio-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-portfolio-output))

(clojure.core/defn execute-provisioned-product-plan ([execute-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-execute-provisioned-product-plan-input execute-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExecuteProvisionedProductPlan", :http.request.configuration/output-deser-fn response-execute-provisioned-product-plan-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception}})))))
(clojure.spec.alpha/fdef execute-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-plan-output))

(clojure.core/defn delete-provisioned-product-plan ([delete-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-provisioned-product-plan-input delete-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProvisionedProductPlan", :http.request.configuration/output-deser-fn response-delete-provisioned-product-plan-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-provisioned-product-plan-output))

(clojure.core/defn describe-provisioned-product ([describe-provisioned-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-provisioned-product-input describe-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProvisionedProduct", :http.request.configuration/output-deser-fn response-describe-provisioned-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-output))

(clojure.core/defn delete-constraint ([delete-constraint-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-constraint-input delete-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConstraint", :http.request.configuration/output-deser-fn response-delete-constraint-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef delete-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-constraint-output))

(clojure.core/defn update-portfolio ([update-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-portfolio-input update-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePortfolio", :http.request.configuration/output-deser-fn response-update-portfolio-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef update-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-portfolio-output))

(clojure.core/defn list-portfolios ([] (list-portfolios {})) ([list-portfolios-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-portfolios-input list-portfolios-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPortfolios", :http.request.configuration/output-deser-fn response-list-portfolios-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-portfolios :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-portfolios-output))

(clojure.core/defn update-provisioned-product ([update-provisioned-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-provisioned-product-input update-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProvisionedProduct", :http.request.configuration/output-deser-fn response-update-provisioned-product-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioned-product-output))

(clojure.core/defn delete-product ([delete-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-product-input delete-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProduct", :http.request.configuration/output-deser-fn response-delete-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef delete-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-product-output))

(clojure.core/defn disassociate-principal-from-portfolio ([disassociate-principal-from-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-principal-from-portfolio-input disassociate-principal-from-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociatePrincipalFromPortfolio", :http.request.configuration/output-deser-fn response-disassociate-principal-from-portfolio-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-principal-from-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/disassociate-principal-from-portfolio-output))

(clojure.core/defn list-principals-for-portfolio ([list-principals-for-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-principals-for-portfolio-input list-principals-for-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPrincipalsForPortfolio", :http.request.configuration/output-deser-fn response-list-principals-for-portfolio-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-principals-for-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-principals-for-portfolio-output))

(clojure.core/defn delete-tag-option ([delete-tag-option-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-tag-option-input delete-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTagOption", :http.request.configuration/output-deser-fn response-delete-tag-option-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-tag-option-output))

(clojure.core/defn search-products-as-admin ([] (search-products-as-admin {})) ([search-products-as-admin-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-search-products-as-admin-input search-products-as-admin-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchProductsAsAdmin", :http.request.configuration/output-deser-fn response-search-products-as-admin-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-products-as-admin :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/search-products-as-admin-output))

(clojure.core/defn associate-tag-option-with-resource ([associate-tag-option-with-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-tag-option-with-resource-input associate-tag-option-with-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateTagOptionWithResource", :http.request.configuration/output-deser-fn response-associate-tag-option-with-resource-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception}})))))
(clojure.spec.alpha/fdef associate-tag-option-with-resource :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/associate-tag-option-with-resource-output))

(clojure.core/defn list-launch-paths ([list-launch-paths-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-launch-paths-input list-launch-paths-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLaunchPaths", :http.request.configuration/output-deser-fn response-list-launch-paths-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-launch-paths :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-launch-paths-output))

(clojure.core/defn create-product ([create-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-product-input create-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProduct", :http.request.configuration/output-deser-fn response-create-product-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef create-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-product-output))

(clojure.core/defn create-constraint ([create-constraint-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-constraint-input create-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConstraint", :http.request.configuration/output-deser-fn response-create-constraint-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef create-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-constraint-output))

(clojure.core/defn disassociate-tag-option-from-resource ([disassociate-tag-option-from-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-tag-option-from-resource-input disassociate-tag-option-from-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateTagOptionFromResource", :http.request.configuration/output-deser-fn response-disassociate-tag-option-from-resource-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-tag-option-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/disassociate-tag-option-from-resource-output))

(clojure.core/defn delete-portfolio-share ([delete-portfolio-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-portfolio-share-input delete-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePortfolioShare", :http.request.configuration/output-deser-fn response-delete-portfolio-share-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef delete-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-portfolio-share-output))

(clojure.core/defn get-aws-organizations-access-status ([] (get-aws-organizations-access-status {})) ([get-aws-organizations-access-status-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-aws-organizations-access-status-input get-aws-organizations-access-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAWSOrganizationsAccessStatus", :http.request.configuration/output-deser-fn response-get-aws-organizations-access-status-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef get-aws-organizations-access-status :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/get-aws-organizations-access-status-output))

(clojure.core/defn list-resources-for-tag-option ([list-resources-for-tag-option-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resources-for-tag-option-input list-resources-for-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourcesForTagOption", :http.request.configuration/output-deser-fn response-list-resources-for-tag-option-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-resources-for-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-resources-for-tag-option-output))

(clojure.core/defn update-service-action ([update-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-service-action-input update-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServiceAction", :http.request.configuration/output-deser-fn response-update-service-action-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-service-action-output))

(clojure.core/defn list-provisioning-artifacts-for-service-action ([list-provisioning-artifacts-for-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-provisioning-artifacts-for-service-action-input list-provisioning-artifacts-for-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProvisioningArtifactsForServiceAction", :http.request.configuration/output-deser-fn response-list-provisioning-artifacts-for-service-action-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-provisioning-artifacts-for-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-provisioning-artifacts-for-service-action-output))

(clojure.core/defn update-constraint ([update-constraint-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-constraint-input update-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConstraint", :http.request.configuration/output-deser-fn response-update-constraint-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-constraint-output))

(clojure.core/defn terminate-provisioned-product ([terminate-provisioned-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-terminate-provisioned-product-input terminate-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TerminateProvisionedProduct", :http.request.configuration/output-deser-fn response-terminate-provisioned-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef terminate-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/terminate-provisioned-product-output))

(clojure.core/defn update-provisioning-artifact ([update-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-provisioning-artifact-input update-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProvisioningArtifact", :http.request.configuration/output-deser-fn response-update-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/update-provisioning-artifact-output))

(clojure.core/defn reject-portfolio-share ([reject-portfolio-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-reject-portfolio-share-input reject-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RejectPortfolioShare", :http.request.configuration/output-deser-fn response-reject-portfolio-share-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef reject-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/reject-portfolio-share-output))

(clojure.core/defn describe-provisioned-product-plan ([describe-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-provisioned-product-plan-input describe-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProvisionedProductPlan", :http.request.configuration/output-deser-fn response-describe-provisioned-product-plan-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-provisioned-product-plan-output))

(clojure.core/defn create-provisioned-product-plan ([create-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-provisioned-product-plan-input create-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProvisionedProductPlan", :http.request.configuration/output-deser-fn response-create-provisioned-product-plan-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-provisioned-product-plan-output))

(clojure.core/defn create-provisioning-artifact ([create-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-provisioning-artifact-input create-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProvisioningArtifact", :http.request.configuration/output-deser-fn response-create-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-provisioning-artifact-output))

(clojure.core/defn associate-service-action-with-provisioning-artifact ([associate-service-action-with-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-service-action-with-provisioning-artifact-input associate-service-action-with-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateServiceActionWithProvisioningArtifact", :http.request.configuration/output-deser-fn response-associate-service-action-with-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-service-action-with-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/associate-service-action-with-provisioning-artifact-output))

(clojure.core/defn list-portfolio-access ([list-portfolio-access-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-portfolio-access-input list-portfolio-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPortfolioAccess", :http.request.configuration/output-deser-fn response-list-portfolio-access-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-portfolio-access :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-portfolio-access-output))

(clojure.core/defn describe-product-view ([describe-product-view-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-product-view-input describe-product-view-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProductView", :http.request.configuration/output-deser-fn response-describe-product-view-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-product-view :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-product-view-output))

(clojure.core/defn batch-associate-service-action-with-provisioning-artifact ([batch-associate-service-action-with-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-associate-service-action-with-provisioning-artifact-input batch-associate-service-action-with-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchAssociateServiceActionWithProvisioningArtifact", :http.request.configuration/output-deser-fn response-batch-associate-service-action-with-provisioning-artifact-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef batch-associate-service-action-with-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/batch-associate-service-action-with-provisioning-artifact-output))

(clojure.core/defn copy-product ([copy-product-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-copy-product-input copy-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/copy-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/copy-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CopyProduct", :http.request.configuration/output-deser-fn response-copy-product-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef copy-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/copy-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/copy-product-output))

(clojure.core/defn create-tag-option ([create-tag-option-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-tag-option-input create-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTagOption", :http.request.configuration/output-deser-fn response-create-tag-option-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "DuplicateResourceException" :portkey.aws.servicecatalog.-2015-12-10/duplicate-resource-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-tag-option-output))

(clojure.core/defn execute-provisioned-product-service-action ([execute-provisioned-product-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-execute-provisioned-product-service-action-input execute-provisioned-product-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExecuteProvisionedProductServiceAction", :http.request.configuration/output-deser-fn response-execute-provisioned-product-service-action-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception}})))))
(clojure.spec.alpha/fdef execute-provisioned-product-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/execute-provisioned-product-service-action-output))

(clojure.core/defn describe-tag-option ([describe-tag-option-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tag-option-input describe-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTagOption", :http.request.configuration/output-deser-fn response-describe-tag-option-output, :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-tag-option-output))

(clojure.core/defn disassociate-service-action-from-provisioning-artifact ([disassociate-service-action-from-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-service-action-from-provisioning-artifact-input disassociate-service-action-from-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateServiceActionFromProvisioningArtifact", :http.request.configuration/output-deser-fn response-disassociate-service-action-from-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-service-action-from-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/disassociate-service-action-from-provisioning-artifact-output))

(clojure.core/defn list-service-actions-for-provisioning-artifact ([list-service-actions-for-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-service-actions-for-provisioning-artifact-input list-service-actions-for-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServiceActionsForProvisioningArtifact", :http.request.configuration/output-deser-fn response-list-service-actions-for-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-service-actions-for-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-service-actions-for-provisioning-artifact-output))

(clojure.core/defn disable-aws-organizations-access ([] (disable-aws-organizations-access {})) ([disable-aws-organizations-access-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-aws-organizations-access-input disable-aws-organizations-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableAWSOrganizationsAccess", :http.request.configuration/output-deser-fn response-disable-aws-organizations-access-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog.-2015-12-10/invalid-state-exception, "OperationNotSupportedException" :portkey.aws.servicecatalog.-2015-12-10/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef disable-aws-organizations-access :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/disable-aws-organizations-access-output))

(clojure.core/defn list-constraints-for-portfolio ([list-constraints-for-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-constraints-for-portfolio-input list-constraints-for-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConstraintsForPortfolio", :http.request.configuration/output-deser-fn response-list-constraints-for-portfolio-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-constraints-for-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/list-constraints-for-portfolio-output))

(clojure.core/defn describe-constraint ([describe-constraint-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-constraint-input describe-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConstraint", :http.request.configuration/output-deser-fn response-describe-constraint-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-constraint-output))

(clojure.core/defn describe-record ([describe-record-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-record-input describe-record-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-record-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-record-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRecord", :http.request.configuration/output-deser-fn response-describe-record-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-record :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-record-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-record-output))

(clojure.core/defn delete-provisioning-artifact ([delete-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-provisioning-artifact-input delete-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProvisioningArtifact", :http.request.configuration/output-deser-fn response-delete-provisioning-artifact-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog.-2015-12-10/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef delete-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/delete-provisioning-artifact-output))

(clojure.core/defn scan-provisioned-products ([] (scan-provisioned-products {})) ([scan-provisioned-products-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-scan-provisioned-products-input scan-provisioned-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ScanProvisionedProducts", :http.request.configuration/output-deser-fn response-scan-provisioned-products-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef scan-provisioned-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/scan-provisioned-products-output))

(clojure.core/defn batch-disassociate-service-action-from-provisioning-artifact ([batch-disassociate-service-action-from-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-batch-disassociate-service-action-from-provisioning-artifact-input batch-disassociate-service-action-from-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDisassociateServiceActionFromProvisioningArtifact", :http.request.configuration/output-deser-fn response-batch-disassociate-service-action-from-provisioning-artifact-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef batch-disassociate-service-action-from-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/batch-disassociate-service-action-from-provisioning-artifact-output))

(clojure.core/defn describe-service-action ([describe-service-action-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-service-action-input describe-service-action-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServiceAction", :http.request.configuration/output-deser-fn response-describe-service-action-output, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog.-2015-12-10/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-service-action :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/describe-service-action-output))

(clojure.core/defn create-portfolio ([create-portfolio-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-portfolio-input create-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog.-2015-12-10/endpoints, :http.request.configuration/target-prefix "AWS242ServiceCatalogService", :http.request.spec/output-spec :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePortfolio", :http.request.configuration/output-deser-fn response-create-portfolio-output, :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog.-2015-12-10/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog.-2015-12-10/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog.-2015-12-10/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef create-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog.-2015-12-10/create-portfolio-output))
