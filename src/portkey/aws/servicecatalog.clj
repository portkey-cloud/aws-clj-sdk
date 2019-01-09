(ns portkey.aws.servicecatalog (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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
   "us-west-2"
   {:credential-scope {:service "servicecatalog", :region "us-west-2"},
    :ssl-common-name "servicecatalog.us-west-2.amazonaws.com",
    :endpoint "https://servicecatalog.us-west-2.amazonaws.com",
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
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-product-source)

(clojure.core/declare ser-principal-type)

(clojure.core/declare ser-product-view-filters)

(clojure.core/declare ser-copy-options)

(clojure.core/declare ser-provisioned-product-view-filter-value)

(clojure.core/declare ser-support-description)

(clojure.core/declare ser-product-view-filter-values)

(clojure.core/declare ser-copy-option)

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

(clojure.core/declare ser-provisioning-artifact-property-value)

(clojure.core/declare ser-principal-arn)

(clojure.core/declare ser-search-filter-value)

(clojure.core/declare ser-provisioning-parameters)

(clojure.core/declare ser-provisioning-artifact-info)

(clojure.core/declare ser-ignore-errors)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-provisioning-artifact-info-value)

(clojure.core/declare ser-search-provisioned-products-page-size)

(clojure.core/declare ser-tag-option-id)

(clojure.core/declare ser-access-level-filter-key)

(clojure.core/declare ser-accept-language)

(clojure.core/declare ser-verbose)

(clojure.core/declare ser-portfolio-display-name)

(clojure.core/declare ser-notification-arns)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-product-view-filter-value)

(clojure.core/declare ser-provider-name)

(clojure.core/declare ser-product-view-owner)

(clojure.core/declare ser-portfolio-description)

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

(clojure.core/declare ser-list-record-history-search-filter)

(clojure.core/declare ser-add-tags)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-provisioned-product-view-filter-by)

(clojure.core/declare ser-constraint-description)

(clojure.core/declare ser-portfolio-share-type)

(clojure.core/declare ser-use-previous-value)

(clojure.core/declare ser-support-url)

(clojure.core/declare ser-provisioning-artifact-description)

(clojure.core/declare ser-page-token)

(clojure.core/declare ser-support-email)

(clojure.core/declare ser-constraint-type)

(clojure.core/declare ser-search-filter-key)

(clojure.core/declare ser-id)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-update-provisioning-parameter)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-product-source [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "ProductSource"})

(clojure.core/defn- ser-principal-type [input] #:http.request.field{:value (clojure.core/get {"IAM" "IAM", :iam "IAM"} input), :shape "PrincipalType"})

(clojure.core/defn- ser-product-view-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-product-view-filter-by k) #:http.request.field{:map-info "key", :shape "ProductViewFilterBy"}) (clojure.core/into (ser-product-view-filter-values v) #:http.request.field{:map-info "value", :shape "ProductViewFilterValues"})])) input), :shape "ProductViewFilters", :type "map"})

(clojure.core/defn- ser-copy-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-copy-option coll) #:http.request.field{:shape "CopyOption"}))) input), :shape "CopyOptions", :type "list"})

(clojure.core/defn- ser-provisioned-product-view-filter-value [input] #:http.request.field{:value input, :shape "ProvisionedProductViewFilterValue"})

(clojure.core/defn- ser-support-description [input] #:http.request.field{:value input, :shape "SupportDescription"})

(clojure.core/defn- ser-product-view-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-product-view-filter-value coll) #:http.request.field{:shape "ProductViewFilterValue"}))) input), :shape "ProductViewFilterValues", :type "list"})

(clojure.core/defn- ser-copy-option [input] #:http.request.field{:value (clojure.core/get {"CopyTags" "CopyTags", :copy-tags "CopyTags"} input), :shape "CopyOption"})

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

(clojure.core/defn- ser-provisioning-artifact-property-value [input] #:http.request.field{:value input, :shape "ProvisioningArtifactPropertyValue"})

(clojure.core/defn- ser-principal-arn [input] #:http.request.field{:value input, :shape "PrincipalARN"})

(clojure.core/defn- ser-search-filter-value [input] #:http.request.field{:value input, :shape "SearchFilterValue"})

(clojure.core/defn- ser-provisioning-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-provisioning-parameter coll) #:http.request.field{:shape "ProvisioningParameter"}))) input), :shape "ProvisioningParameters", :type "list"})

(clojure.core/defn- ser-provisioning-artifact-info [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-provisioning-artifact-info-key k) #:http.request.field{:map-info "key", :shape "ProvisioningArtifactInfoKey"}) (clojure.core/into (ser-provisioning-artifact-info-value v) #:http.request.field{:map-info "value", :shape "ProvisioningArtifactInfoValue"})])) input), :shape "ProvisioningArtifactInfo", :type "map", :max 100, :min 1})

(clojure.core/defn- ser-ignore-errors [input] #:http.request.field{:value input, :shape "IgnoreErrors"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-provisioning-artifact-info-value [input] #:http.request.field{:value input, :shape "ProvisioningArtifactInfoValue"})

(clojure.core/defn- ser-search-provisioned-products-page-size [input] #:http.request.field{:value input, :shape "SearchProvisionedProductsPageSize"})

(clojure.core/defn- ser-tag-option-id [input] #:http.request.field{:value input, :shape "TagOptionId"})

(clojure.core/defn- ser-access-level-filter-key [input] #:http.request.field{:value (clojure.core/get {"Account" "Account", :account "Account", "Role" "Role", :role "Role", "User" "User", :user "User"} input), :shape "AccessLevelFilterKey"})

(clojure.core/defn- ser-accept-language [input] #:http.request.field{:value input, :shape "AcceptLanguage"})

(clojure.core/defn- ser-verbose [input] #:http.request.field{:value input, :shape "Verbose"})

(clojure.core/defn- ser-portfolio-display-name [input] #:http.request.field{:value input, :shape "PortfolioDisplayName"})

(clojure.core/defn- ser-notification-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notification-arn coll) #:http.request.field{:shape "NotificationArn"}))) input), :shape "NotificationArns", :type "list", :max 5})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-product-view-filter-value [input] #:http.request.field{:value input, :shape "ProductViewFilterValue"})

(clojure.core/defn- ser-provider-name [input] #:http.request.field{:value input, :shape "ProviderName"})

(clojure.core/defn- ser-product-view-owner [input] #:http.request.field{:value input, :shape "ProductViewOwner"})

(clojure.core/defn- ser-portfolio-description [input] #:http.request.field{:value input, :shape "PortfolioDescription"})

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

(clojure.core/defn- ser-list-record-history-search-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListRecordHistorySearchFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-filter-key (input :key)) #:http.request.field{:name "Key", :shape "SearchFilterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-filter-value (input :value)) #:http.request.field{:name "Value", :shape "SearchFilterValue"}))))

(clojure.core/defn- ser-add-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "AddTags", :type "list", :max 20})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-provisioned-product-view-filter-by [input] #:http.request.field{:value (clojure.core/get {"SearchQuery" "SearchQuery", :search-query "SearchQuery"} input), :shape "ProvisionedProductViewFilterBy"})

(clojure.core/defn- ser-constraint-description [input] #:http.request.field{:value input, :shape "ConstraintDescription"})

(clojure.core/defn- ser-portfolio-share-type [input] #:http.request.field{:value (clojure.core/get {"IMPORTED" "IMPORTED", :imported "IMPORTED", "AWS_SERVICECATALOG" "AWS_SERVICECATALOG", :aws-servicecatalog "AWS_SERVICECATALOG"} input), :shape "PortfolioShareType"})

(clojure.core/defn- ser-use-previous-value [input] #:http.request.field{:value input, :shape "UsePreviousValue"})

(clojure.core/defn- ser-support-url [input] #:http.request.field{:value input, :shape "SupportUrl"})

(clojure.core/defn- ser-provisioning-artifact-description [input] #:http.request.field{:value input, :shape "ProvisioningArtifactDescription"})

(clojure.core/defn- ser-page-token [input] #:http.request.field{:value input, :shape "PageToken"})

(clojure.core/defn- ser-support-email [input] #:http.request.field{:value input, :shape "SupportEmail"})

(clojure.core/defn- ser-constraint-type [input] #:http.request.field{:value input, :shape "ConstraintType"})

(clojure.core/defn- ser-search-filter-key [input] #:http.request.field{:value input, :shape "SearchFilterKey"})

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- ser-update-provisioning-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateProvisioningParameter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-key (input :key)) #:http.request.field{:name "Key", :shape "ParameterKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :value)) #:http.request.field{:name "Value", :shape "ParameterValue"})) (clojure.core/contains? input :use-previous-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-previous-value (input :use-previous-value)) #:http.request.field{:name "UsePreviousValue", :shape "UsePreviousValue"}))))

(clojure.core/defn- req-copy-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-arn (input :source-product-arn)) #:http.request.field{:name "SourceProductArn", :shape "ProductArn"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :target-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :target-product-id)) #:http.request.field{:name "TargetProductId", :shape "Id"})) (clojure.core/contains? input :target-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-name (input :target-product-name)) #:http.request.field{:name "TargetProductName", :shape "ProductViewName"})) (clojure.core/contains? input :source-provisioning-artifact-identifiers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-provisioning-artifact-properties (input :source-provisioning-artifact-identifiers)) #:http.request.field{:name "SourceProvisioningArtifactIdentifiers", :shape "SourceProvisioningArtifactProperties"})) (clojure.core/contains? input :copy-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-options (input :copy-options)) #:http.request.field{:name "CopyOptions", :shape "CopyOptions"}))))

(clojure.core/defn- req-describe-copy-product-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :copy-product-token)) #:http.request.field{:name "CopyProductToken", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-record-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-create-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-product-view-name (input :name)) #:http.request.field{:name "Name", :shape "ProductViewName"}) (clojure.core/into (ser-product-view-owner (input :owner)) #:http.request.field{:name "Owner", :shape "ProductViewOwner"}) (clojure.core/into (ser-product-type (input :product-type)) #:http.request.field{:name "ProductType", :shape "ProductType"}) (clojure.core/into (ser-provisioning-artifact-properties (input :provisioning-artifact-parameters)) #:http.request.field{:name "ProvisioningArtifactParameters", :shape "ProvisioningArtifactProperties"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :support-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-description (input :support-description)) #:http.request.field{:name "SupportDescription", :shape "SupportDescription"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :tags)) #:http.request.field{:name "Tags", :shape "AddTags"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-short-description (input :description)) #:http.request.field{:name "Description", :shape "ProductViewShortDescription"})) (clojure.core/contains? input :distributor) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :distributor)) #:http.request.field{:name "Distributor", :shape "ProductViewOwner"})) (clojure.core/contains? input :support-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-url (input :support-url)) #:http.request.field{:name "SupportUrl", :shape "SupportUrl"})) (clojure.core/contains? input :support-email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-email (input :support-email)) #:http.request.field{:name "SupportEmail", :shape "SupportEmail"}))))

(clojure.core/defn- req-create-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-constraint-parameters (input :parameters)) #:http.request.field{:name "Parameters", :shape "ConstraintParameters"}) (clojure.core/into (ser-constraint-type (input :type)) #:http.request.field{:name "Type", :shape "ConstraintType"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-constraint-description (input :description)) #:http.request.field{:name "Description", :shape "ConstraintDescription"}))))

(clojure.core/defn- req-update-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-constraint-description (input :description)) #:http.request.field{:name "Description", :shape "ConstraintDescription"}))))

(clojure.core/defn- req-delete-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-create-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-portfolio-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "PortfolioDisplayName"}) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderName"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-description (input :description)) #:http.request.field{:name "Description", :shape "PortfolioDescription"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :tags)) #:http.request.field{:name "Tags", :shape "AddTags"}))))

(clojure.core/defn- req-search-provisioned-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProvisionedProductFilters"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-field (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortField"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-provisioned-products-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "SearchProvisionedProductsPageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-execute-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-launch-paths-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-list-provisioned-product-plans-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :provision-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provision-product-id)) #:http.request.field{:name "ProvisionProductId", :shape "Id"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"}))))

(clojure.core/defn- req-delete-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-principals-for-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-create-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-provisioned-product-plan-name (input :plan-name)) #:http.request.field{:name "PlanName", :shape "ProvisionedProductPlanName"}) (clojure.core/into (ser-provisioned-product-plan-type (input :plan-type)) #:http.request.field{:name "PlanType", :shape "ProvisionedProductPlanType"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-provisioned-product-name (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductName"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "UpdateProvisioningParameters"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :notification-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-arns (input :notification-arns)) #:http.request.field{:name "NotificationArns", :shape "NotificationArns"}))))

(clojure.core/defn- req-delete-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]}))

(clojure.core/defn- req-list-record-history-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :search-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-record-history-search-filter (input :search-filter)) #:http.request.field{:name "SearchFilter", :shape "ListRecordHistorySearchFilter"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-describe-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-provision-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-provisioned-product-name (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductName"}) (clojure.core/into (ser-idempotency-token (input :provision-token)) #:http.request.field{:name "ProvisionToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "ProvisioningParameters"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :notification-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-arns (input :notification-arns)) #:http.request.field{:name "NotificationArns", :shape "NotificationArns"}))))

(clojure.core/defn- req-scan-provisioned-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :access-level-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-level-filter (input :access-level-filter)) #:http.request.field{:name "AccessLevelFilter", :shape "AccessLevelFilter"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-accept-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-resources-for-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]} (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "ResourceType"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-delete-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-search-products-as-admin-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :portfolio-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProductViewFilters"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ProductViewSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :product-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-source (input :product-source)) #:http.request.field{:name "ProductSource", :shape "ProductSource"}))))

(clojure.core/defn- req-associate-principal-with-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-principal-arn (input :principal-arn)) #:http.request.field{:name "PrincipalARN", :shape "PrincipalARN"}) (clojure.core/into (ser-principal-type (input :principal-type)) #:http.request.field{:name "PrincipalType", :shape "PrincipalType"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-update-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :display-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-display-name (input :display-name)) #:http.request.field{:name "DisplayName", :shape "PortfolioDisplayName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-description (input :description)) #:http.request.field{:name "Description", :shape "PortfolioDescription"})) (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "ProviderName"})) (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :add-tags)) #:http.request.field{:name "AddTags", :shape "AddTags"})) (clojure.core/contains? input :remove-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-keys (input :remove-tags)) #:http.request.field{:name "RemoveTags", :shape "TagKeys"}))))

(clojure.core/defn- req-create-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-update-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :remove-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-keys (input :remove-tags)) #:http.request.field{:name "RemoveTags", :shape "TagKeys"})) (clojure.core/contains? input :support-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-description (input :support-description)) #:http.request.field{:name "SupportDescription", :shape "SupportDescription"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-short-description (input :description)) #:http.request.field{:name "Description", :shape "ProductViewShortDescription"})) (clojure.core/contains? input :owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :owner)) #:http.request.field{:name "Owner", :shape "ProductViewOwner"})) (clojure.core/contains? input :distributor) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-owner (input :distributor)) #:http.request.field{:name "Distributor", :shape "ProductViewOwner"})) (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-add-tags (input :add-tags)) #:http.request.field{:name "AddTags", :shape "AddTags"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-name (input :name)) #:http.request.field{:name "Name", :shape "ProductViewName"})) (clojure.core/contains? input :support-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-url (input :support-url)) #:http.request.field{:name "SupportUrl", :shape "SupportUrl"})) (clojure.core/contains? input :support-email) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-support-email (input :support-email)) #:http.request.field{:name "SupportEmail", :shape "SupportEmail"}))))

(clojure.core/defn- req-describe-provisioning-parameters-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"}))))

(clojure.core/defn- req-list-tag-options-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tag-options-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ListTagOptionsFilters"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-delete-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-disassociate-principal-from-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"}) (clojure.core/into (ser-principal-arn (input :principal-arn)) #:http.request.field{:name "PrincipalARN", :shape "PrincipalARN"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-disassociate-tag-option-from-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]}))

(clojure.core/defn- req-describe-product-view-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-describe-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-create-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-provisioning-artifact-properties (input :parameters)) #:http.request.field{:name "Parameters", :shape "ProvisioningArtifactProperties"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-update-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-idempotency-token (input :update-token)) #:http.request.field{:name "UpdateToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :provisioned-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-name-or-arn (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductNameOrArn"})) (clojure.core/contains? input :provisioned-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioned-product-id)) #:http.request.field{:name "ProvisionedProductId", :shape "Id"})) (clojure.core/contains? input :product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})) (clojure.core/contains? input :provisioning-artifact-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})) (clojure.core/contains? input :path-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :path-id)) #:http.request.field{:name "PathId", :shape "Id"})) (clojure.core/contains? input :provisioning-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-provisioning-parameters (input :provisioning-parameters)) #:http.request.field{:name "ProvisioningParameters", :shape "UpdateProvisioningParameters"}))))

(clojure.core/defn- req-describe-product-as-admin-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-reject-portfolio-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-delete-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :ignore-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ignore-errors (input :ignore-errors)) #:http.request.field{:name "IgnoreErrors", :shape "IgnoreErrors"}))))

(clojure.core/defn- req-terminate-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-idempotency-token (input :terminate-token)) #:http.request.field{:name "TerminateToken", :shape "IdempotencyToken", :idempotency-token true})]} (clojure.core/contains? input :provisioned-product-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioned-product-name-or-arn (input :provisioned-product-name)) #:http.request.field{:name "ProvisionedProductName", :shape "ProvisionedProductNameOrArn"})) (clojure.core/contains? input :provisioned-product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :provisioned-product-id)) #:http.request.field{:name "ProvisionedProductId", :shape "Id"})) (clojure.core/contains? input :ignore-errors) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ignore-errors (input :ignore-errors)) #:http.request.field{:name "IgnoreErrors", :shape "IgnoreErrors"})) (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-portfolio-access-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-portfolios-for-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-disassociate-product-from-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-associate-product-with-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :source-portfolio-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :source-portfolio-id)) #:http.request.field{:name "SourcePortfolioId", :shape "Id"}))))

(clojure.core/defn- req-describe-provisioned-product-plan-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :plan-id)) #:http.request.field{:name "PlanId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-describe-provisioned-product-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-provisioning-artifacts-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-associate-tag-option-with-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-option-id (input :tag-option-id)) #:http.request.field{:name "TagOptionId", :shape "TagOptionId"})]}))

(clojure.core/defn- req-describe-constraint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :id)) #:http.request.field{:name "Id", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-create-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-key (input :key)) #:http.request.field{:name "Key", :shape "TagOptionKey"}) (clojure.core/into (ser-tag-option-value (input :value)) #:http.request.field{:name "Value", :shape "TagOptionValue"})]}))

(clojure.core/defn- req-update-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-name (input :name)) #:http.request.field{:name "Name", :shape "ProvisioningArtifactName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-description (input :description)) #:http.request.field{:name "Description", :shape "ProvisioningArtifactDescription"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provisioning-artifact-active (input :active)) #:http.request.field{:name "Active", :shape "ProvisioningArtifactActive"}))))

(clojure.core/defn- req-list-portfolios-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]}))

(clojure.core/defn- req-describe-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"}) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :verbose) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verbose (input :verbose)) #:http.request.field{:name "Verbose", :shape "Verbose"}))))

(clojure.core/defn- req-delete-provisioning-artifact-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"}) (clojure.core/into (ser-id (input :provisioning-artifact-id)) #:http.request.field{:name "ProvisioningArtifactId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"}))))

(clojure.core/defn- req-list-accepted-portfolio-shares-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :portfolio-share-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-portfolio-share-type (input :portfolio-share-type)) #:http.request.field{:name "PortfolioShareType", :shape "PortfolioShareType"}))))

(clojure.core/defn- req-update-tag-option-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-option-id (input :id)) #:http.request.field{:name "Id", :shape "TagOptionId"})]} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-value (input :value)) #:http.request.field{:name "Value", :shape "TagOptionValue"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-option-active (input :active)) #:http.request.field{:name "Active", :shape "TagOptionActive"}))))

(clojure.core/defn- req-search-products-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ProductViewFilters"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-view-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ProductViewSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.core/defn- req-list-constraints-for-portfolio-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-id (input :portfolio-id)) #:http.request.field{:name "PortfolioId", :shape "Id"})]} (clojure.core/contains? input :accept-language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept-language (input :accept-language)) #:http.request.field{:name "AcceptLanguage", :shape "AcceptLanguage"})) (clojure.core/contains? input :product-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "Id"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-token (input :page-token)) #:http.request.field{:name "PageToken", :shape "PageToken"}))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag-key))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-change/action (clojure.spec.alpha/and :portkey.aws.servicecatalog/change-action))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-change/resource-type (clojure.spec.alpha/and :portkey.aws.servicecatalog/plan-resource-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-change/details (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-change-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.resource-change/action :portkey.aws.servicecatalog/logical-resource-id :portkey.aws.servicecatalog/physical-resource-id :portkey.aws.servicecatalog.resource-change/resource-type :portkey.aws.servicecatalog/replacement :portkey.aws.servicecatalog/scope :portkey.aws.servicecatalog.resource-change/details]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-source #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.copy-product-input/source-product-arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.copy-product-input/target-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.copy-product-input/target-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.copy-product-input/source-provisioning-artifact-identifiers (clojure.spec.alpha/and :portkey.aws.servicecatalog/source-provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/copy-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.copy-product-input/source-product-arn :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.copy-product-input/target-product-id :portkey.aws.servicecatalog.copy-product-input/target-product-name :portkey.aws.servicecatalog.copy-product-input/source-provisioning-artifact-identifiers :portkey.aws.servicecatalog/copy-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-copy-product-status-input/copy-product-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-copy-product-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.describe-copy-product-status-input/copy-product-token] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/principal-type #{"IAM" :iam})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-view-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-summary :portkey.aws.servicecatalog/provisioning-artifacts]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/physical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/execute-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-filters (clojure.spec.alpha/map-of :portkey.aws.servicecatalog/product-view-filter-by :portkey.aws.servicecatalog/product-view-filter-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioned-product-plan-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioned-product-plan-details :portkey.aws.servicecatalog/resource-changes :portkey.aws.servicecatalog.describe-provisioned-product-plan-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/launch-path-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/launch-path-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/copy-options (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/copy-option))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-view-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/record-tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-record-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/support-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-changes (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/resource-change))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/product-view-filter-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioning-artifact-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-detail/product-arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-summary :portkey.aws.servicecatalog/status :portkey.aws.servicecatalog.product-view-detail/product-arn :portkey.aws.servicecatalog/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-product-with-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/provisioning-artifact-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/tags (clojure.spec.alpha/and :portkey.aws.servicecatalog/add-tags))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-product-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-product-input/name :portkey.aws.servicecatalog.create-product-input/owner :portkey.aws.servicecatalog/product-type :portkey.aws.servicecatalog.create-product-input/provisioning-artifact-parameters :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/support-description :portkey.aws.servicecatalog.create-product-input/tags :portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.create-product-input/description :portkey.aws.servicecatalog.create-product-input/distributor :portkey.aws.servicecatalog/support-url :portkey.aws.servicecatalog/support-email]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/logical-resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provision-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/parameter-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/total-results-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/accept-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/user-arn-session (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/copy-option #{:copy-tags "CopyTags"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-constraint-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-constraint-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-constraint-input/parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-constraint-input/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-constraint-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-constraint-input/portfolio-id :portkey.aws.servicecatalog.create-constraint-input/product-id :portkey.aws.servicecatalog.create-constraint-input/parameters :portkey.aws.servicecatalog.create-constraint-input/type :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.create-constraint-input/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-constraint-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.update-constraint-input/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.delete-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.delete-portfolio-share-input/portfolio-id :portkey.aws.servicecatalog/account-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1224)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-property-name #{:id "Id"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plan-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-portfolio-input/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-portfolio-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-portfolio-input/tags (clojure.spec.alpha/and :portkey.aws.servicecatalog/add-tags))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-portfolio-input/display-name :portkey.aws.servicecatalog/provider-name :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.create-portfolio-input/description :portkey.aws.servicecatalog.create-portfolio-input/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/page-size (clojure.spec.alpha/int-in 0 20))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-attributes (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioned-product-attribute))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-portfolios-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolios-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-details :portkey.aws.servicecatalog.list-portfolios-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-detail/constraint-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-detail/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog/account-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.constraint-detail/constraint-id :portkey.aws.servicecatalog.constraint-detail/type :portkey.aws.servicecatalog.constraint-detail/description :portkey.aws.servicecatalog.constraint-detail/owner]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/resource-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/approximate-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-product-from-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/property-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plan-type #{:cloudformation "CLOUDFORMATION"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-aggregations (clojure.spec.alpha/map-of :portkey.aws.servicecatalog/product-view-aggregation-type :portkey.aws.servicecatalog/product-view-aggregation-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9._-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/product-view-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-short-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.access-level-filter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/access-level-filter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.access-level-filter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/access-level-filter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/access-level-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.access-level-filter/key :portkey.aws.servicecatalog.access-level-filter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioning-artifact-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/terminate-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/usage-instructions (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/usage-instruction))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/status-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0009\u000a\u000d\u0020-\uD7FF\uE000-\uFFFD]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-provisioned-products-output/provisioned-products (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-attributes))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-provisioned-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-provisioned-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.search-provisioned-products-output/provisioned-products :portkey.aws.servicecatalog/total-results-count :portkey.aws.servicecatalog.search-provisioned-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-status #{"IN_PROGRESS" :in-progress "IN_PROGRESS_IN_ERROR" :created "SUCCEEDED" "FAILED" :in-progress-in-error :failed :succeeded "CREATED"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/source-provisioning-artifact-properties (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/source-provisioning-artifact-properties-map))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-parameter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/parameter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-parameter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/parameter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.provisioning-parameter/key :portkey.aws.servicecatalog.provisioning-parameter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-product-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/constraint-detail :portkey.aws.servicecatalog/constraint-parameters :portkey.aws.servicecatalog/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-constraints-for-portfolio-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-constraints-for-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/constraint-details :portkey.aws.servicecatalog.list-constraints-for-portfolio-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-view-filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioned-product-view-filter-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/record-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-tag-options-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/tag-option-details :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plan-status #{:create-success :execute-success "CREATE_SUCCESS" :execute-failed "CREATE_FAILED" "EXECUTE_FAILED" "CREATE_IN_PROGRESS" :create-failed :create-in-progress "EXECUTE_IN_PROGRESS" "EXECUTE_SUCCESS" :execute-in-progress})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/change-action #{"ADD" :remove "MODIFY" "REMOVE" :add :modify})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-provisioned-products-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-provisioned-products-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog/sort-field))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-provisioned-products-input/page-size (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-provisioned-products-page-size))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-provisioned-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/access-level-filter :portkey.aws.servicecatalog.search-provisioned-products-input/filters :portkey.aws.servicecatalog.search-provisioned-products-input/sort-by :portkey.aws.servicecatalog/sort-order :portkey.aws.servicecatalog.search-provisioned-products-input/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.execute-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/execute-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.execute-provisioned-product-plan-input/plan-id :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/allowed-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/allowed-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-launch-paths-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-launch-paths-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-launch-paths-input/product-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-accepted-portfolio-shares-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-accepted-portfolio-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-details :portkey.aws.servicecatalog.list-accepted-portfolio-shares-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/sort-order #{:descending :ascending "ASCENDING" "DESCENDING"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-principals-for-portfolio-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-principals-for-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/principals :portkey.aws.servicecatalog.list-principals-for-portfolio-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/evaluation-type #{:static :dynamic "STATIC" "DYNAMIC"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioning-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/update-provisioning-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-as-admin-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-products-as-admin-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-details :portkey.aws.servicecatalog.search-products-as-admin-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-provisioned-product-plans-input/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-provisioned-product-plans-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.list-provisioned-product-plans-input/provision-product-id :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/access-level-filter]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-property-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-principals-for-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-principals-for-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-principals-for-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/tag-option-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/id :portkey.aws.servicecatalog.provisioning-artifact/name :portkey.aws.servicecatalog.provisioning-artifact/description :portkey.aws.servicecatalog.provisioning-artifact/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-provisioned-product-plan-input/plan-name :portkey.aws.servicecatalog.create-provisioned-product-plan-input/plan-type :portkey.aws.servicecatalog.create-provisioned-product-plan-input/product-id :portkey.aws.servicecatalog/provisioned-product-name :portkey.aws.servicecatalog.create-provisioned-product-plan-input/provisioning-artifact-id :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog.create-provisioned-product-plan-input/path-id :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.create-provisioned-product-plan-input/provisioning-parameters :portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/notification-arns]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.delete-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.delete-tag-option-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-record-history-input/search-filter (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-record-history-search-filter))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-record-history-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/access-level-filter :portkey.aws.servicecatalog.list-record-history-input/search-filter :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog/creation-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-detail/active (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/id :portkey.aws.servicecatalog.provisioning-artifact-detail/name :portkey.aws.servicecatalog.provisioning-artifact-detail/description :portkey.aws.servicecatalog.provisioning-artifact-detail/type :portkey.aws.servicecatalog.provisioning-artifact-detail/created-time :portkey.aws.servicecatalog.provisioning-artifact-detail/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-principal-with-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/cloud-watch-dashboards (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/cloud-watch-dashboard))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/has-default-path clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plans (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioned-product-plan-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/status #{:creating "AVAILABLE" "CREATING" "FAILED" :available :failed})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/principal-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioning-artifact-detail :portkey.aws.servicecatalog.update-provisioning-artifact-output/info :portkey.aws.servicecatalog/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provision-product-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provision-product-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provision-product-input/provision-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provision-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provision-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.provision-product-input/product-id :portkey.aws.servicecatalog.provision-product-input/provisioning-artifact-id :portkey.aws.servicecatalog/provisioned-product-name :portkey.aws.servicecatalog.provision-product-input/provision-token] :opt-un [:portkey.aws.servicecatalog.provision-product-input/path-id :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog/provisioning-parameters :portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/notification-arns]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/scan-provisioned-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/access-level-filter :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/invalid-parameters-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/status (clojure.spec.alpha/and :portkey.aws.servicecatalog/record-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-detail/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-tags :portkey.aws.servicecatalog/provisioned-product-name :portkey.aws.servicecatalog.record-detail/path-id :portkey.aws.servicecatalog.record-detail/status :portkey.aws.servicecatalog/created-time :portkey.aws.servicecatalog.record-detail/record-id :portkey.aws.servicecatalog/record-type :portkey.aws.servicecatalog.record-detail/provisioned-product-id :portkey.aws.servicecatalog.record-detail/provisioning-artifact-id :portkey.aws.servicecatalog/record-errors :portkey.aws.servicecatalog/updated-time :portkey.aws.servicecatalog.record-detail/product-id :portkey.aws.servicecatalog/provisioned-product-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-parameters (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioning-parameter))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-output/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-output/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-output/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioned-product-plan-output/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.create-provisioned-product-plan-output/plan-name :portkey.aws.servicecatalog.create-provisioned-product-plan-output/plan-id :portkey.aws.servicecatalog.create-provisioned-product-plan-output/provision-product-id :portkey.aws.servicecatalog/provisioned-product-name :portkey.aws.servicecatalog.create-provisioned-product-plan-output/provisioning-artifact-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-detail :portkey.aws.servicecatalog/provisioning-artifact-detail :portkey.aws.servicecatalog/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-record-history-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-record-history-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-details :portkey.aws.servicecatalog.list-record-history-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/requires-recreation #{"ALWAYS" :conditionally :never "NEVER" "CONDITIONALLY" :always})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-info (clojure.spec.alpha/map-of :portkey.aws.servicecatalog/provisioning-artifact-info-key :portkey.aws.servicecatalog/provisioning-artifact-info-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag-option-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.accept-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/accept-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.accept-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-resources-for-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/tag-option-id] :opt-un [:portkey.aws.servicecatalog/resource-type :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/ignore-errors clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/instruction-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-info-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-as-admin-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-as-admin-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-as-admin-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-sort-by))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-products-as-admin-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.search-products-as-admin-input/portfolio-id :portkey.aws.servicecatalog.search-products-as-admin-input/filters :portkey.aws.servicecatalog.search-products-as-admin-input/sort-by :portkey.aws.servicecatalog/sort-order :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/product-source]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-error/code (clojure.spec.alpha/and :portkey.aws.servicecatalog/error-code))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-error/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/error-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.record-error/code :portkey.aws.servicecatalog.record-error/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.associate-principal-with-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-principal-with-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.associate-principal-with-portfolio-input/portfolio-id :portkey.aws.servicecatalog/principal-arn :portkey.aws.servicecatalog/principal-type] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/provision-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-summary/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plan-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-name :portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-id :portkey.aws.servicecatalog.provisioned-product-plan-summary/provision-product-id :portkey.aws.servicecatalog.provisioned-product-plan-summary/provision-product-name :portkey.aws.servicecatalog.provisioned-product-plan-summary/plan-type :portkey.aws.servicecatalog.provisioned-product-plan-summary/provisioning-artifact-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/status-detail (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-provisioned-products-page-size (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-portfolio-input/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-portfolio-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-portfolio-input/remove-tags (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-keys))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.update-portfolio-input/display-name :portkey.aws.servicecatalog.update-portfolio-input/description :portkey.aws.servicecatalog/provider-name :portkey.aws.servicecatalog/add-tags :portkey.aws.servicecatalog.update-portfolio-input/remove-tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/access-level-filter-key #{:role "User" "Role" :account "Account" :user})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioning-artifact-detail :portkey.aws.servicecatalog.describe-provisioning-artifact-output/info :portkey.aws.servicecatalog/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/accept-language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.portfolio-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.portfolio-detail/display-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-display-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.portfolio-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.portfolio-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog/creation-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/id :portkey.aws.servicecatalog.portfolio-detail/arn :portkey.aws.servicecatalog.portfolio-detail/display-name :portkey.aws.servicecatalog.portfolio-detail/description :portkey.aws.servicecatalog.portfolio-detail/created-time :portkey.aws.servicecatalog/provider-name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-portfolio-share-input/portfolio-id :portkey.aws.servicecatalog/account-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-detail :portkey.aws.servicecatalog/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-product-input/remove-tags (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-keys))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-product-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-product-input/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-product-input/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-product-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog.update-product-input/remove-tags :portkey.aws.servicecatalog/support-description :portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.update-product-input/description :portkey.aws.servicecatalog.update-product-input/owner :portkey.aws.servicecatalog.update-product-input/distributor :portkey.aws.servicecatalog/add-tags :portkey.aws.servicecatalog.update-product-input/name :portkey.aws.servicecatalog/support-url :portkey.aws.servicecatalog/support-email]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-copy-product-status-output/target-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-copy-product-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/copy-product-status :portkey.aws.servicecatalog.describe-copy-product-status-output/target-product-id :portkey.aws.servicecatalog/status-detail]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/verbose clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-parameters-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-parameters-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-parameters-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioning-parameters-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.describe-provisioning-parameters-input/product-id :portkey.aws.servicecatalog.describe-provisioning-parameters-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.describe-provisioning-parameters-input/path-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-tag-options-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-tag-options-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-tag-options-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.list-tag-options-input/filters :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/last-request-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/output-key :portkey.aws.servicecatalog/output-value :portkey.aws.servicecatalog/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-attribute #{:properties :tags "METADATA" "DELETIONPOLICY" :creationpolicy "UPDATEPOLICY" "CREATIONPOLICY" :updatepolicy :deletionpolicy "PROPERTIES" "TAGS" :metadata})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-detail :portkey.aws.servicecatalog/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-resources-for-tag-option-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/resource-details :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-portfolio-access-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolio-access-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/account-ids :portkey.aws.servicecatalog.list-portfolio-access-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.disassociate-principal-from-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.disassociate-principal-from-portfolio-input/portfolio-id :portkey.aws.servicecatalog/principal-arn] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-display-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-provisioned-product-plans-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-provisioned-product-plans-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioned-product-plans :portkey.aws.servicecatalog.list-provisioned-product-plans-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/notification-arns (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/notification-arn :max-count 5))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/resource-id :portkey.aws.servicecatalog/tag-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail-created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/physical-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/short-description (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-short-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/owner (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-owner))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/distributor (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-distributor))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-summary/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/support-description :portkey.aws.servicecatalog.product-view-summary/type :portkey.aws.servicecatalog.product-view-summary/short-description :portkey.aws.servicecatalog/has-default-path :portkey.aws.servicecatalog.product-view-summary/owner :portkey.aws.servicecatalog.product-view-summary/distributor :portkey.aws.servicecatalog.product-view-summary/name :portkey.aws.servicecatalog/support-url :portkey.aws.servicecatalog.product-view-summary/product-id :portkey.aws.servicecatalog/support-email :portkey.aws.servicecatalog/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/reject-portfolio-share-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-view-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/constraint-detail :portkey.aws.servicecatalog/constraint-parameters :portkey.aws.servicecatalog/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioning-artifact-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-tag/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/record-tag-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.record-tag/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/record-tag-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.record-tag/key :portkey.aws.servicecatalog.record-tag/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-target-definition/attribute (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-attribute))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-target-definition/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/property-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-target-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.resource-target-definition/attribute :portkey.aws.servicecatalog.resource-target-definition/name :portkey.aws.servicecatalog/requires-recreation]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-summary/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-summary/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-summary/provisioning-artifact-metadata (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/id :portkey.aws.servicecatalog.provisioning-artifact-summary/name :portkey.aws.servicecatalog.provisioning-artifact-summary/description :portkey.aws.servicecatalog.provisioning-artifact-summary/created-time :portkey.aws.servicecatalog.provisioning-artifact-summary/provisioning-artifact-metadata]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioning-artifact-input/parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-properties))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.create-provisioning-artifact-input/parameters :portkey.aws.servicecatalog/idempotency-token] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.cloud-watch-dashboard/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/cloud-watch-dashboard-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/cloud-watch-dashboard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.cloud-watch-dashboard/name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-portfolios-for-product-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolios-for-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-details :portkey.aws.servicecatalog.list-portfolios-for-product-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/provisioned-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioned-product-input/update-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.update-provisioned-product-input/update-token] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.update-provisioned-product-input/provisioned-product-name :portkey.aws.servicecatalog.update-provisioned-product-input/provisioned-product-id :portkey.aws.servicecatalog.update-provisioned-product-input/product-id :portkey.aws.servicecatalog.update-provisioned-product-input/provisioning-artifact-id :portkey.aws.servicecatalog.update-provisioned-product-input/path-id :portkey.aws.servicecatalog.update-provisioned-product-input/provisioning-parameters]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-as-admin-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.reject-portfolio-share-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/reject-portfolio-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.reject-portfolio-share-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-parameters-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-summaries))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioning-parameters-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioning-artifact-parameters :portkey.aws.servicecatalog/constraint-summaries :portkey.aws.servicecatalog/usage-instructions :portkey.aws.servicecatalog.describe-provisioning-parameters-output/tag-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[0-9]{12}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-filter-by #{:source-product-id "FullTextSearch" :full-text-search "SourceProductId" :product-type "Owner" "ProductType" :owner})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-info-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-launch-paths-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-launch-paths-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/launch-path-summaries :portkey.aws.servicecatalog.list-launch-paths-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/cloud-watch-dashboard-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/instruction-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-product-as-admin-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-as-admin-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-detail :portkey.aws.servicecatalog/provisioning-artifact-summaries :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.describe-product-as-admin-output/tag-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.copy-product-output/copy-product-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/copy-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.copy-product-output/copy-product-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/error-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-portfolio-output/tag-options (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-detail :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.describe-portfolio-output/tag-options]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/notification-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1224)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/sort-field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.delete-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.delete-provisioned-product-plan-input/plan-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/ignore-errors]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-properties/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-properties/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-properties/info (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-properties/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-properties (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.provisioning-artifact-properties/info] :opt-un [:portkey.aws.servicecatalog.provisioning-artifact-properties/name :portkey.aws.servicecatalog.provisioning-artifact-properties/description :portkey.aws.servicecatalog.provisioning-artifact-properties/type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-type #{:marketplace-ami :cloud-formation-template :marketplace-car "CLOUD_FORMATION_TEMPLATE" "MARKETPLACE_AMI" "MARKETPLACE_CAR"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.terminate-provisioned-product-input/provisioned-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.terminate-provisioned-product-input/provisioned-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.terminate-provisioned-product-input/terminate-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/terminate-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.terminate-provisioned-product-input/terminate-token] :opt-un [:portkey.aws.servicecatalog.terminate-provisioned-product-input/provisioned-product-name :portkey.aws.servicecatalog.terminate-provisioned-product-input/provisioned-product-id :portkey.aws.servicecatalog/ignore-errors :portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-portfolio-access-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolio-access-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-portfolio-access-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-portfolios-for-product-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolios-for-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-portfolios-for-product-input/product-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/source-provisioning-artifact-properties-map (clojure.spec.alpha/map-of :portkey.aws.servicecatalog/provisioning-artifact-property-name :portkey.aws.servicecatalog/provisioning-artifact-property-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-change-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/resource-change-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.disassociate-product-from-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.disassociate-product-from-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/disassociate-product-from-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.disassociate-product-from-portfolio-input/product-id :portkey.aws.servicecatalog.disassociate-product-from-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9_-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/portfolio-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-tag-options-filters/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-tag-options-filters/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-tag-options-filters/active (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-tag-options-filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.list-tag-options-filters/key :portkey.aws.servicecatalog.list-tag-options-filters/value :portkey.aws.servicecatalog.list-tag-options-filters/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioned-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioned-product-detail :portkey.aws.servicecatalog/cloud-watch-dashboards]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/product-view-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/path-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/provision-product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/status (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/provisioning-parameters (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-provisioning-parameters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-plan-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/provision-product-name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-plan-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/status-message :portkey.aws.servicecatalog.provisioned-product-plan-details/path-id :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.provisioned-product-plan-details/provision-product-id :portkey.aws.servicecatalog.provisioned-product-plan-details/status :portkey.aws.servicecatalog.provisioned-product-plan-details/provisioning-parameters :portkey.aws.servicecatalog/created-time :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-type :portkey.aws.servicecatalog/notification-arns :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-name :portkey.aws.servicecatalog.provisioned-product-plan-details/provisioning-artifact-id :portkey.aws.servicecatalog/updated-time :portkey.aws.servicecatalog.provisioned-product-plan-details/product-id :portkey.aws.servicecatalog.provisioned-product-plan-details/provision-product-name :portkey.aws.servicecatalog.provisioned-product-plan-details/plan-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-detail/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-detail/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-detail/active (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.tag-option-detail/key :portkey.aws.servicecatalog.tag-option-detail/value :portkey.aws.servicecatalog.tag-option-detail/active :portkey.aws.servicecatalog.tag-option-detail/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.associate-product-with-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.associate-product-with-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.associate-product-with-portfolio-input/source-portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-product-with-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.associate-product-with-portfolio-input/product-id :portkey.aws.servicecatalog.associate-product-with-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.associate-product-with-portfolio-input/source-portfolio-id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/constraint-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-sort-by #{"Title" :title "VersionCount" :creation-date :version-count "CreationDate"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioned-product-plan-input/plan-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioned-product-plan-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.describe-provisioned-product-plan-input/plan-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/access-level-filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-aggregation-values (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/product-view-aggregation-value))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.launch-path-summary/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/portfolio-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/launch-path-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/id :portkey.aws.servicecatalog/constraint-summaries :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.launch-path-summary/name]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-filters (clojure.spec.alpha/map-of :portkey.aws.servicecatalog/provisioned-product-view-filter-by :portkey.aws.servicecatalog/provisioned-product-view-filter-values))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/allowed-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-parameters (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/status-message (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-status-message))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/status (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/last-record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/last-request-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.provisioned-product-detail/type :portkey.aws.servicecatalog.provisioned-product-detail/status-message :portkey.aws.servicecatalog.provisioned-product-detail/status :portkey.aws.servicecatalog/created-time :portkey.aws.servicecatalog.provisioned-product-detail/arn :portkey.aws.servicecatalog/idempotency-token :portkey.aws.servicecatalog.provisioned-product-detail/name :portkey.aws.servicecatalog.provisioned-product-detail/last-record-id :portkey.aws.servicecatalog.provisioned-product-detail/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8191))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioned-product-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-name-or-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1224)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9][a-zA-Z0-9._-]{0,127}|arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:[^/].{0,1023}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-type #{:cloud-formation-template "CLOUD_FORMATION_TEMPLATE" "MARKETPLACE" :marketplace})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-aggregation-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-errors (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/record-error))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/updated-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-tag-option-with-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-distributor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-detail/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-detail-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-detail/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-detail-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-detail/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-detail-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-detail/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-detail-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-detail/created-time (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-detail-created-time))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.resource-detail/id :portkey.aws.servicecatalog.resource-detail/arn :portkey.aws.servicecatalog.resource-detail/name :portkey.aws.servicecatalog.resource-detail/description :portkey.aws.servicecatalog.resource-detail/created-time]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-record-history-search-filter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-filter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-record-history-search-filter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-filter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-record-history-search-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.list-record-history-search-filter/key :portkey.aws.servicecatalog.list-record-history-search-filter/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/add-tags (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag :max-count 20))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-provisioned-product-plan-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-provisioning-artifacts-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-provisioning-artifacts-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-provisioning-artifacts-input/product-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/associate-tag-option-with-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/resource-id :portkey.aws.servicecatalog/tag-option-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-constraint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog/id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.tag/key :portkey.aws.servicecatalog.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-view-filter-by #{"SearchQuery" :search-query})

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-record-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-record-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/record-detail :portkey.aws.servicecatalog/record-outputs :portkey.aws.servicecatalog.describe-record-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/replacement #{:true "CONDITIONAL" :false "TRUE" "FALSE" :conditional})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag-option-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.usage-instruction/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/instruction-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.usage-instruction/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/instruction-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/usage-instruction (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.usage-instruction/type :portkey.aws.servicecatalog.usage-instruction/value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/no-echo clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioned-product-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-tag-option-input/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-tag-option-input/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.create-tag-option-input/key :portkey.aws.servicecatalog.create-tag-option-input/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-share-type #{:imported "IMPORTED" :aws-servicecatalog "AWS_SERVICECATALOG"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-product-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-summary :portkey.aws.servicecatalog/provisioning-artifacts]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/use-previous-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/product-view-summaries :portkey.aws.servicecatalog/product-view-aggregations :portkey.aws.servicecatalog.search-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/output-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.create-provisioning-artifact-output/info (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-info))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/create-provisioning-artifact-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioning-artifact-detail :portkey.aws.servicecatalog.create-provisioning-artifact-output/info :portkey.aws.servicecatalog/status]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-change-detail/target (clojure.spec.alpha/and :portkey.aws.servicecatalog/resource-target-definition))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.resource-change-detail/evaluation (clojure.spec.alpha/and :portkey.aws.servicecatalog/evaluation-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-change-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.resource-change-detail/target :portkey.aws.servicecatalog.resource-change-detail/evaluation :portkey.aws.servicecatalog/causing-entity]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-input/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-name))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-input/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-artifact-input/active (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioning-artifact-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.update-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.update-provisioning-artifact-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.update-provisioning-artifact-input/name :portkey.aws.servicecatalog.update-provisioning-artifact-input/description :portkey.aws.servicecatalog.update-provisioning-artifact-input/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/support-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2083))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-summary/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.constraint-summary/description (clojure.spec.alpha/and :portkey.aws.servicecatalog/constraint-description))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.constraint-summary/type :portkey.aws.servicecatalog.constraint-summary/description]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-summary/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.tag-option-summary/values (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-values))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.tag-option-summary/key :portkey.aws.servicecatalog.tag-option-summary/values]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-provisioning-artifacts-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-provisioning-artifacts-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/provisioning-artifact-details :portkey.aws.servicecatalog.list-provisioning-artifacts-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/account-ids (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/account-id))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/principal-arn :portkey.aws.servicecatalog/principal-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-portfolios-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/page-size]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.describe-tag-option-input/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-details (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/constraint-detail))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/plan-resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-status #{:tainted :under-change "TAINTED" "AVAILABLE" "ERROR" :plan-in-progress :error :available "UNDER_CHANGE" "PLAN_IN_PROGRESS"})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/copy-product-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.servicecatalog/output-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-portfolio-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/portfolio-detail :portkey.aws.servicecatalog/tags]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.describe-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.describe-provisioning-artifact-input/provisioning-artifact-id :portkey.aws.servicecatalog.describe-provisioning-artifact-input/product-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/verbose]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 150))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.product-view-aggregation-value/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/attribute-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/product-view-aggregation-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.product-view-aggregation-value/value :portkey.aws.servicecatalog/approximate-count]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-outputs (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/record-output))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/page-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0009\u000a\u000d\u0020-\uD7FF\uE000-\uFFFD]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/support-email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 254))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.delete-provisioning-artifact-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.delete-provisioning-artifact-input/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/delete-provisioning-artifact-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.delete-provisioning-artifact-input/product-id :portkey.aws.servicecatalog.delete-provisioning-artifact-input/provisioning-artifact-id] :opt-un [:portkey.aws.servicecatalog/accept-language]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-summaries (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/tag-option-summary))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/constraint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/scope (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/resource-attribute))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-filter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifacts (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/provisioning-artifact))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/record-tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-%@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/user-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/type (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-type))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/status-message (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-status-message))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/status (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-status))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/arn (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/provisioning-artifact-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/name (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-name-or-arn))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioned-product-attribute/last-record-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/user-arn-session :portkey.aws.servicecatalog.provisioned-product-attribute/type :portkey.aws.servicecatalog.provisioned-product-attribute/status-message :portkey.aws.servicecatalog/tags :portkey.aws.servicecatalog.provisioned-product-attribute/status :portkey.aws.servicecatalog/created-time :portkey.aws.servicecatalog/physical-id :portkey.aws.servicecatalog.provisioned-product-attribute/arn :portkey.aws.servicecatalog.provisioned-product-attribute/provisioning-artifact-id :portkey.aws.servicecatalog/idempotency-token :portkey.aws.servicecatalog.provisioned-product-attribute/name :portkey.aws.servicecatalog.provisioned-product-attribute/product-id :portkey.aws.servicecatalog.provisioned-product-attribute/last-record-id :portkey.aws.servicecatalog/user-arn :portkey.aws.servicecatalog/id]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/tag-option-not-migrated-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-accepted-portfolio-shares-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog/page-token :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/portfolio-share-type]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-tag-option-input/id (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-tag-option-input/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-tag-option-input/active (clojure.spec.alpha/and :portkey.aws.servicecatalog/tag-option-active))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-tag-option-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.update-tag-option-input/id] :opt-un [:portkey.aws.servicecatalog.update-tag-option-input/value :portkey.aws.servicecatalog.update-tag-option-input/active]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/parameter-constraints (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/allowed-values]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.scan-provisioned-products-output/provisioned-products (clojure.spec.alpha/and :portkey.aws.servicecatalog/provisioned-product-details))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.scan-provisioned-products-output/next-page-token (clojure.spec.alpha/and :portkey.aws.servicecatalog/page-token))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/scan-provisioned-products-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.scan-provisioned-products-output/provisioned-products :portkey.aws.servicecatalog.scan-provisioned-products-output/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/duplicate-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioned-product-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-input/filters (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-filters))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.search-products-input/sort-by (clojure.spec.alpha/and :portkey.aws.servicecatalog/product-view-sort-by))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/search-products-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.search-products-input/filters :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog.search-products-input/sort-by :portkey.aws.servicecatalog/sort-order :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/portfolio-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.provisioning-artifact-parameter/is-no-echo (clojure.spec.alpha/and :portkey.aws.servicecatalog/no-echo))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/provisioning-artifact-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/parameter-key :portkey.aws.servicecatalog/default-value :portkey.aws.servicecatalog/parameter-type :portkey.aws.servicecatalog.provisioning-artifact-parameter/is-no-echo :portkey.aws.servicecatalog/description :portkey.aws.servicecatalog/parameter-constraints]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/causing-entity (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/principals (clojure.spec.alpha/coll-of :portkey.aws.servicecatalog/principal))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-parameter/key (clojure.spec.alpha/and :portkey.aws.servicecatalog/parameter-key))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.update-provisioning-parameter/value (clojure.spec.alpha/and :portkey.aws.servicecatalog/parameter-value))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/update-provisioning-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog.update-provisioning-parameter/key :portkey.aws.servicecatalog.update-provisioning-parameter/value :portkey.aws.servicecatalog/use-previous-value]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-constraints-for-portfolio-input/portfolio-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog.list-constraints-for-portfolio-input/product-id (clojure.spec.alpha/and :portkey.aws.servicecatalog/id))
(clojure.spec.alpha/def :portkey.aws.servicecatalog/list-constraints-for-portfolio-input (clojure.spec.alpha/keys :req-un [:portkey.aws.servicecatalog.list-constraints-for-portfolio-input/portfolio-id] :opt-un [:portkey.aws.servicecatalog/accept-language :portkey.aws.servicecatalog.list-constraints-for-portfolio-input/product-id :portkey.aws.servicecatalog/page-size :portkey.aws.servicecatalog/page-token]))

(clojure.spec.alpha/def :portkey.aws.servicecatalog/describe-constraint-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicecatalog/constraint-detail :portkey.aws.servicecatalog/constraint-parameters :portkey.aws.servicecatalog/status]))

(clojure.core/defn list-accepted-portfolio-shares ([] (list-accepted-portfolio-shares {})) ([list-accepted-portfolio-shares-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-accepted-portfolio-shares-input list-accepted-portfolio-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-accepted-portfolio-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-accepted-portfolio-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAcceptedPortfolioShares", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-accepted-portfolio-shares :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/list-accepted-portfolio-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-accepted-portfolio-shares-output))

(clojure.core/defn describe-provisioning-artifact ([describe-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-provisioning-artifact-input describe-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProvisioningArtifact", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-provisioning-artifact-output))

(clojure.core/defn update-tag-option ([update-tag-option-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-tag-option-input update-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTagOption", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "DuplicateResourceException" :portkey.aws.servicecatalog/duplicate-resource-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-tag-option-output))

(clojure.core/defn disassociate-product-from-portfolio ([disassociate-product-from-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-product-from-portfolio-input disassociate-product-from-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/disassociate-product-from-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/disassociate-product-from-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateProductFromPortfolio", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef disassociate-product-from-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/disassociate-product-from-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/disassociate-product-from-portfolio-output))

(clojure.core/defn describe-copy-product-status ([describe-copy-product-status-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-copy-product-status-input describe-copy-product-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-copy-product-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-copy-product-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCopyProductStatus", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-copy-product-status :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-copy-product-status-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-copy-product-status-output))

(clojure.core/defn list-provisioning-artifacts ([list-provisioning-artifacts-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-provisioning-artifacts-input list-provisioning-artifacts-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-provisioning-artifacts-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-provisioning-artifacts-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProvisioningArtifacts", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-provisioning-artifacts :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-provisioning-artifacts-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-provisioning-artifacts-output))

(clojure.core/defn associate-principal-with-portfolio ([associate-principal-with-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-principal-with-portfolio-input associate-principal-with-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/associate-principal-with-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/associate-principal-with-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociatePrincipalWithPortfolio", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-principal-with-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/associate-principal-with-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/associate-principal-with-portfolio-output))

(clojure.core/defn provision-product ([provision-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-provision-product-input provision-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/provision-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/provision-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ProvisionProduct", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "DuplicateResourceException" :portkey.aws.servicecatalog/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef provision-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/provision-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/provision-product-output))

(clojure.core/defn list-portfolios-for-product ([list-portfolios-for-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-portfolios-for-product-input list-portfolios-for-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-portfolios-for-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-portfolios-for-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPortfoliosForProduct", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-portfolios-for-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-portfolios-for-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-portfolios-for-product-output))

(clojure.core/defn list-provisioned-product-plans ([] (list-provisioned-product-plans {})) ([list-provisioned-product-plans-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-provisioned-product-plans-input list-provisioned-product-plans-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-provisioned-product-plans-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-provisioned-product-plans-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProvisionedProductPlans", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-provisioned-product-plans :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/list-provisioned-product-plans-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-provisioned-product-plans-output))

(clojure.core/defn delete-portfolio ([delete-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-portfolio-input delete-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePortfolio", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceInUseException" :portkey.aws.servicecatalog/resource-in-use-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef delete-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-portfolio-output))

(clojure.core/defn accept-portfolio-share ([accept-portfolio-share-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-accept-portfolio-share-input accept-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/accept-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/accept-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptPortfolioShare", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef accept-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/accept-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/accept-portfolio-share-output))

(clojure.core/defn describe-provisioning-parameters ([describe-provisioning-parameters-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-provisioning-parameters-input describe-provisioning-parameters-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-provisioning-parameters-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-provisioning-parameters-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProvisioningParameters", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioning-parameters :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-provisioning-parameters-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-provisioning-parameters-output))

(clojure.core/defn describe-product ([describe-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-product-input describe-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-product-output))

(clojure.core/defn search-products ([] (search-products {})) ([search-products-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-search-products-input search-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/search-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/search-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchProducts", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/search-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-products-output))

(clojure.core/defn list-record-history ([] (list-record-history {})) ([list-record-history-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-record-history-input list-record-history-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-record-history-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-record-history-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRecordHistory", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-record-history :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/list-record-history-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-record-history-output))

(clojure.core/defn search-provisioned-products ([] (search-provisioned-products {})) ([search-provisioned-products-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-search-provisioned-products-input search-provisioned-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/search-provisioned-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/search-provisioned-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchProvisionedProducts", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-provisioned-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/search-provisioned-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-provisioned-products-output))

(clojure.core/defn create-portfolio-share ([create-portfolio-share-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-portfolio-share-input create-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePortfolioShare", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef create-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-portfolio-share-output))

(clojure.core/defn describe-product-as-admin ([describe-product-as-admin-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-product-as-admin-input describe-product-as-admin-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-product-as-admin-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-product-as-admin-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProductAsAdmin", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-product-as-admin :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-product-as-admin-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-product-as-admin-output))

(clojure.core/defn associate-product-with-portfolio ([associate-product-with-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-product-with-portfolio-input associate-product-with-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/associate-product-with-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/associate-product-with-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateProductWithPortfolio", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef associate-product-with-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/associate-product-with-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/associate-product-with-portfolio-output))

(clojure.core/defn list-tag-options ([] (list-tag-options {})) ([list-tag-options-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tag-options-input list-tag-options-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-tag-options-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-tag-options-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagOptions", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-tag-options :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/list-tag-options-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-tag-options-output))

(clojure.core/defn update-product ([update-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-product-input update-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef update-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-product-output))

(clojure.core/defn describe-portfolio ([describe-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-portfolio-input describe-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePortfolio", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-portfolio-output))

(clojure.core/defn execute-provisioned-product-plan ([execute-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-execute-provisioned-product-plan-input execute-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/execute-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/execute-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExecuteProvisionedProductPlan", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog/invalid-state-exception}})))))
(clojure.spec.alpha/fdef execute-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/execute-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/execute-provisioned-product-plan-output))

(clojure.core/defn delete-provisioned-product-plan ([delete-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-provisioned-product-plan-input delete-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProvisionedProductPlan", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-provisioned-product-plan-output))

(clojure.core/defn describe-provisioned-product ([describe-provisioned-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-provisioned-product-input describe-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProvisionedProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-provisioned-product-output))

(clojure.core/defn delete-constraint ([delete-constraint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-constraint-input delete-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConstraint", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef delete-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-constraint-output))

(clojure.core/defn update-portfolio ([update-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-portfolio-input update-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePortfolio", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef update-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-portfolio-output))

(clojure.core/defn list-portfolios ([] (list-portfolios {})) ([list-portfolios-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-portfolios-input list-portfolios-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-portfolios-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-portfolios-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPortfolios", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-portfolios :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/list-portfolios-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-portfolios-output))

(clojure.core/defn update-provisioned-product ([update-provisioned-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-provisioned-product-input update-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProvisionedProduct", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-provisioned-product-output))

(clojure.core/defn delete-product ([delete-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-product-input delete-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef delete-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-product-output))

(clojure.core/defn disassociate-principal-from-portfolio ([disassociate-principal-from-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-principal-from-portfolio-input disassociate-principal-from-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociatePrincipalFromPortfolio", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-principal-from-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/disassociate-principal-from-portfolio-output))

(clojure.core/defn list-principals-for-portfolio ([list-principals-for-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-principals-for-portfolio-input list-principals-for-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-principals-for-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-principals-for-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPrincipalsForPortfolio", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-principals-for-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-principals-for-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-principals-for-portfolio-output))

(clojure.core/defn delete-tag-option ([delete-tag-option-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tag-option-input delete-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTagOption", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceInUseException" :portkey.aws.servicecatalog/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-tag-option-output))

(clojure.core/defn search-products-as-admin ([] (search-products-as-admin {})) ([search-products-as-admin-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-search-products-as-admin-input search-products-as-admin-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/search-products-as-admin-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/search-products-as-admin-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SearchProductsAsAdmin", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef search-products-as-admin :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/search-products-as-admin-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/search-products-as-admin-output))

(clojure.core/defn associate-tag-option-with-resource ([associate-tag-option-with-resource-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-tag-option-with-resource-input associate-tag-option-with-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/associate-tag-option-with-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/associate-tag-option-with-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateTagOptionWithResource", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.servicecatalog/duplicate-resource-exception, "InvalidStateException" :portkey.aws.servicecatalog/invalid-state-exception}})))))
(clojure.spec.alpha/fdef associate-tag-option-with-resource :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/associate-tag-option-with-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/associate-tag-option-with-resource-output))

(clojure.core/defn list-launch-paths ([list-launch-paths-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-launch-paths-input list-launch-paths-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-launch-paths-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-launch-paths-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListLaunchPaths", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-launch-paths :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-launch-paths-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-launch-paths-output))

(clojure.core/defn create-product ([create-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-product-input create-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProduct", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef create-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-product-output))

(clojure.core/defn create-constraint ([create-constraint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-constraint-input create-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConstraint", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "DuplicateResourceException" :portkey.aws.servicecatalog/duplicate-resource-exception}})))))
(clojure.spec.alpha/fdef create-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-constraint-output))

(clojure.core/defn disassociate-tag-option-from-resource ([disassociate-tag-option-from-resource-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-tag-option-from-resource-input disassociate-tag-option-from-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateTagOptionFromResource", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-tag-option-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/disassociate-tag-option-from-resource-output))

(clojure.core/defn delete-portfolio-share ([delete-portfolio-share-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-portfolio-share-input delete-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePortfolioShare", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-portfolio-share-output))

(clojure.core/defn list-resources-for-tag-option ([list-resources-for-tag-option-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-resources-for-tag-option-input list-resources-for-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-resources-for-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-resources-for-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourcesForTagOption", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-resources-for-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-resources-for-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-resources-for-tag-option-output))

(clojure.core/defn update-constraint ([update-constraint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-constraint-input update-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConstraint", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-constraint-output))

(clojure.core/defn terminate-provisioned-product ([terminate-provisioned-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-terminate-provisioned-product-input terminate-provisioned-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/terminate-provisioned-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/terminate-provisioned-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateProvisionedProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef terminate-provisioned-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/terminate-provisioned-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/terminate-provisioned-product-output))

(clojure.core/defn update-provisioning-artifact ([update-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-provisioning-artifact-input update-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/update-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/update-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProvisioningArtifact", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef update-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/update-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/update-provisioning-artifact-output))

(clojure.core/defn reject-portfolio-share ([reject-portfolio-share-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-reject-portfolio-share-input reject-portfolio-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/reject-portfolio-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/reject-portfolio-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RejectPortfolioShare", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef reject-portfolio-share :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/reject-portfolio-share-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/reject-portfolio-share-output))

(clojure.core/defn describe-provisioned-product-plan ([describe-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-provisioned-product-plan-input describe-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProvisionedProductPlan", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-provisioned-product-plan-output))

(clojure.core/defn create-provisioned-product-plan ([create-provisioned-product-plan-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-provisioned-product-plan-input create-provisioned-product-plan-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-provisioned-product-plan-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-provisioned-product-plan-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProvisionedProductPlan", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidStateException" :portkey.aws.servicecatalog/invalid-state-exception}})))))
(clojure.spec.alpha/fdef create-provisioned-product-plan :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-provisioned-product-plan-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-provisioned-product-plan-output))

(clojure.core/defn create-provisioning-artifact ([create-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-provisioning-artifact-input create-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProvisioningArtifact", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-provisioning-artifact-output))

(clojure.core/defn list-portfolio-access ([list-portfolio-access-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-portfolio-access-input list-portfolio-access-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-portfolio-access-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-portfolio-access-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPortfolioAccess", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-portfolio-access :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-portfolio-access-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-portfolio-access-output))

(clojure.core/defn describe-product-view ([describe-product-view-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-product-view-input describe-product-view-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-product-view-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-product-view-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProductView", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef describe-product-view :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-product-view-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-product-view-output))

(clojure.core/defn copy-product ([copy-product-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-copy-product-input copy-product-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/copy-product-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/copy-product-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CopyProduct", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef copy-product :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/copy-product-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/copy-product-output))

(clojure.core/defn create-tag-option ([create-tag-option-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-tag-option-input create-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTagOption", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "DuplicateResourceException" :portkey.aws.servicecatalog/duplicate-resource-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-tag-option-output))

(clojure.core/defn describe-tag-option ([describe-tag-option-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-tag-option-input describe-tag-option-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-tag-option-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-tag-option-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTagOption", :http.request.spec/error-spec {"TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception, "ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tag-option :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-tag-option-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-tag-option-output))

(clojure.core/defn list-constraints-for-portfolio ([list-constraints-for-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-constraints-for-portfolio-input list-constraints-for-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/list-constraints-for-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/list-constraints-for-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListConstraintsForPortfolio", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef list-constraints-for-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/list-constraints-for-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/list-constraints-for-portfolio-output))

(clojure.core/defn describe-constraint ([describe-constraint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-constraint-input describe-constraint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-constraint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-constraint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConstraint", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-constraint :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-constraint-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-constraint-output))

(clojure.core/defn describe-record ([describe-record-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-record-input describe-record-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/describe-record-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/describe-record-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRecord", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-record :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/describe-record-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/describe-record-output))

(clojure.core/defn delete-provisioning-artifact ([delete-provisioning-artifact-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-provisioning-artifact-input delete-provisioning-artifact-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/delete-provisioning-artifact-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/delete-provisioning-artifact-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProvisioningArtifact", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.servicecatalog/resource-not-found-exception, "ResourceInUseException" :portkey.aws.servicecatalog/resource-in-use-exception, "InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef delete-provisioning-artifact :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/delete-provisioning-artifact-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/delete-provisioning-artifact-output))

(clojure.core/defn scan-provisioned-products ([] (scan-provisioned-products {})) ([scan-provisioned-products-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-scan-provisioned-products-input scan-provisioned-products-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/scan-provisioned-products-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/scan-provisioned-products-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ScanProvisionedProducts", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception}})))))
(clojure.spec.alpha/fdef scan-provisioned-products :args (clojure.spec.alpha/? :portkey.aws.servicecatalog/scan-provisioned-products-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/scan-provisioned-products-output))

(clojure.core/defn create-portfolio ([create-portfolio-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-portfolio-input create-portfolio-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicecatalog/endpoints, :http.request.spec/output-spec :portkey.aws.servicecatalog/create-portfolio-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-10", :http.request.configuration/service-id "Service Catalog", :http.request.spec/input-spec :portkey.aws.servicecatalog/create-portfolio-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePortfolio", :http.request.spec/error-spec {"InvalidParametersException" :portkey.aws.servicecatalog/invalid-parameters-exception, "LimitExceededException" :portkey.aws.servicecatalog/limit-exceeded-exception, "TagOptionNotMigratedException" :portkey.aws.servicecatalog/tag-option-not-migrated-exception}})))))
(clojure.spec.alpha/fdef create-portfolio :args (clojure.spec.alpha/tuple :portkey.aws.servicecatalog/create-portfolio-input) :ret (clojure.spec.alpha/and :portkey.aws.servicecatalog/create-portfolio-output))
