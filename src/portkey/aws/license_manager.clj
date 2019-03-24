(ns portkey.aws.license-manager (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "license-manager", :region "ap-northeast-1"},
    :ssl-common-name "license-manager.ap-northeast-1.amazonaws.com",
    :endpoint "https://license-manager.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "license-manager", :region "eu-west-1"},
    :ssl-common-name "license-manager.eu-west-1.amazonaws.com",
    :endpoint "https://license-manager.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "license-manager", :region "us-east-2"},
    :ssl-common-name "license-manager.us-east-2.amazonaws.com",
    :endpoint "https://license-manager.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "license-manager", :region "ap-southeast-2"},
    :ssl-common-name "license-manager.ap-southeast-2.amazonaws.com",
    :endpoint "https://license-manager.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "license-manager", :region "ap-southeast-1"},
    :ssl-common-name "license-manager.ap-southeast-1.amazonaws.com",
    :endpoint "https://license-manager.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "license-manager", :region "ap-northeast-2"},
    :ssl-common-name "license-manager.ap-northeast-2.amazonaws.com",
    :endpoint "https://license-manager.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "license-manager", :region "eu-central-1"},
    :ssl-common-name "license-manager.eu-central-1.amazonaws.com",
    :endpoint "https://license-manager.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "license-manager", :region "eu-west-2"},
    :ssl-common-name "license-manager.eu-west-2.amazonaws.com",
    :endpoint "https://license-manager.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "license-manager", :region "us-west-2"},
    :ssl-common-name "license-manager.us-west-2.amazonaws.com",
    :endpoint "https://license-manager.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "license-manager", :region "us-east-1"},
    :ssl-common-name "license-manager.us-east-1.amazonaws.com",
    :endpoint "https://license-manager.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "license-manager", :region "ap-south-1"},
    :ssl-common-name "license-manager.ap-south-1.amazonaws.com",
    :endpoint "https://license-manager.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-license-specification)

(clojure.core/declare ser-inventory-filter)

(clojure.core/declare ser-organization-configuration)

(clojure.core/declare ser-inventory-filter-condition)

(clojure.core/declare ser-inventory-filter-list)

(clojure.core/declare ser-box-long)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-license-specifications)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-string)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-box-integer)

(clojure.core/declare ser-license-configuration-status)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-license-counting-type)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-box-boolean)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-name (input :name)) #:http.request.field{:name "Name", :shape "FilterName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-values (input :values)) #:http.request.field{:name "Values", :shape "FilterValues"}))))

(clojure.core/defn- ser-license-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:license-configuration-arn input)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})], :shape "LicenseSpecification", :type "structure"}))

(clojure.core/defn- ser-inventory-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-inventory-filter-condition (:condition input)) #:http.request.field{:name "Condition", :shape "InventoryFilterCondition"})], :shape "InventoryFilter", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-organization-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-boolean (:enable-integration input)) #:http.request.field{:name "EnableIntegration", :shape "Boolean"})], :shape "OrganizationConfiguration", :type "structure"}))

(clojure.core/defn- ser-inventory-filter-condition [input] #:http.request.field{:value (clojure.core/get {"EQUALS" "EQUALS", :equals "EQUALS", "NOT_EQUALS" "NOT_EQUALS", :not-equals "NOT_EQUALS", "BEGINS_WITH" "BEGINS_WITH", :begins-with "BEGINS_WITH", "CONTAINS" "CONTAINS", :contains "CONTAINS"} input), :shape "InventoryFilterCondition"})

(clojure.core/defn- ser-inventory-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-inventory-filter coll) #:http.request.field{:shape "InventoryFilter"}))) input), :shape "InventoryFilterList", :type "list"})

(clojure.core/defn- ser-box-long [input] #:http.request.field{:value input, :shape "BoxLong"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list"})

(clojure.core/defn- ser-license-specifications [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-license-specification coll) #:http.request.field{:shape "LicenseSpecification"}))) input), :shape "LicenseSpecifications", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- ser-box-integer [input] #:http.request.field{:value input, :shape "BoxInteger"})

(clojure.core/defn- ser-license-configuration-status [input] #:http.request.field{:value (clojure.core/get {"AVAILABLE" "AVAILABLE", :available "AVAILABLE", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "LicenseConfigurationStatus"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-license-counting-type [input] #:http.request.field{:value (clojure.core/get {"vCPU" "vCPU", :v-cpu "vCPU", "Instance" "Instance", :instance "Instance", "Core" "Core", :core "Core", "Socket" "Socket", :socket "Socket"} input), :shape "LicenseCountingType"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-box-boolean [input] #:http.request.field{:value input, :shape "BoxBoolean"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-license-counting-type (input :license-counting-type)) #:http.request.field{:name "LicenseCountingType", :shape "LicenseCountingType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :license-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-long (input :license-count)) #:http.request.field{:name "LicenseCount", :shape "BoxLong"})) (clojure.core/contains? input :license-count-hard-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-boolean (input :license-count-hard-limit)) #:http.request.field{:name "LicenseCountHardLimit", :shape "BoxBoolean"})) (clojure.core/contains? input :license-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :license-rules)) #:http.request.field{:name "LicenseRules", :shape "StringList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-update-service-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :s-3-bucket-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :s-3-bucket-arn)) #:http.request.field{:name "S3BucketArn", :shape "String"})) (clojure.core/contains? input :sns-topic-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "String"})) (clojure.core/contains? input :organization-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-configuration (input :organization-configuration)) #:http.request.field{:name "OrganizationConfiguration", :shape "OrganizationConfiguration"})) (clojure.core/contains? input :enable-cross-accounts-discovery) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-boolean (input :enable-cross-accounts-discovery)) #:http.request.field{:name "EnableCrossAccountsDiscovery", :shape "BoxBoolean"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-get-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :license-configuration-arn)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})]}))

(clojure.core/defn- req-list-associations-for-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :license-configuration-arn)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-list-usage-for-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :license-configuration-arn)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"}))))

(clojure.core/defn- req-update-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :license-configuration-arn)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})]} (clojure.core/contains? input :license-configuration-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-configuration-status (input :license-configuration-status)) #:http.request.field{:name "LicenseConfigurationStatus", :shape "LicenseConfigurationStatus"})) (clojure.core/contains? input :license-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :license-rules)) #:http.request.field{:name "LicenseRules", :shape "StringList"})) (clojure.core/contains? input :license-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-long (input :license-count)) #:http.request.field{:name "LicenseCount", :shape "BoxLong"})) (clojure.core/contains? input :license-count-hard-limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-boolean (input :license-count-hard-limit)) #:http.request.field{:name "LicenseCountHardLimit", :shape "BoxBoolean"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}))))

(clojure.core/defn- req-get-service-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-license-specifications-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"})]} (clojure.core/contains? input :add-license-specifications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-specifications (input :add-license-specifications)) #:http.request.field{:name "AddLicenseSpecifications", :shape "LicenseSpecifications"})) (clojure.core/contains? input :remove-license-specifications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-specifications (input :remove-license-specifications)) #:http.request.field{:name "RemoveLicenseSpecifications", :shape "LicenseSpecifications"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-list-license-specifications-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-delete-license-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :license-configuration-arn)) #:http.request.field{:name "LicenseConfigurationArn", :shape "String"})]}))

(clojure.core/defn- req-list-license-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :license-configuration-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :license-configuration-arns)) #:http.request.field{:name "LicenseConfigurationArns", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"}))))

(clojure.core/defn- req-list-resource-inventory-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-box-integer (input :max-results)) #:http.request.field{:name "MaxResults", :shape "BoxInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inventory-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "InventoryFilterList"}))))

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-license-configuration-associations)

(clojure.core/declare deser-license-specification)

(clojure.core/declare deser-organization-configuration)

(clojure.core/declare deser-managed-resource-summary-list)

(clojure.core/declare deser-consumed-license-summary)

(clojure.core/declare deser-license-configuration-usage)

(clojure.core/declare deser-box-long)

(clojure.core/declare deser-license-specifications)

(clojure.core/declare deser-consumed-license-summary-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-license-configuration-association)

(clojure.core/declare deser-license-configuration)

(clojure.core/declare deser-message)

(clojure.core/declare deser-string)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-resource-inventory)

(clojure.core/declare deser-managed-resource-summary)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-license-counting-type)

(clojure.core/declare deser-license-configuration-usage-list)

(clojure.core/declare deser-resource-inventory-list)

(clojure.core/declare deser-box-boolean)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-license-configurations)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-license-configuration-associations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license-configuration-association coll))) input))

(clojure.core/defn- deser-license-specification [input] (clojure.core/cond-> {:license-configuration-arn (deser-string (input "LicenseConfigurationArn"))}))

(clojure.core/defn- deser-organization-configuration [input] (clojure.core/cond-> {:enable-integration (deser-boolean (input "EnableIntegration"))}))

(clojure.core/defn- deser-managed-resource-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-resource-summary coll))) input))

(clojure.core/defn- deser-consumed-license-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "ConsumedLicenses") (clojure.core/assoc :consumed-licenses (deser-box-long (input "ConsumedLicenses")))))

(clojure.core/defn- deser-license-configuration-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-string (input "ResourceArn"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "ResourceStatus") (clojure.core/assoc :resource-status (deser-string (input "ResourceStatus"))) (clojure.core/contains? input "ResourceOwnerId") (clojure.core/assoc :resource-owner-id (deser-string (input "ResourceOwnerId"))) (clojure.core/contains? input "AssociationTime") (clojure.core/assoc :association-time (deser-date-time (input "AssociationTime"))) (clojure.core/contains? input "ConsumedLicenses") (clojure.core/assoc :consumed-licenses (deser-box-long (input "ConsumedLicenses")))))

(clojure.core/defn- deser-box-long [input] input)

(clojure.core/defn- deser-license-specifications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license-specification coll))) input))

(clojure.core/defn- deser-consumed-license-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-consumed-license-summary coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-license-configuration-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-string (input "ResourceArn"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "ResourceOwnerId") (clojure.core/assoc :resource-owner-id (deser-string (input "ResourceOwnerId"))) (clojure.core/contains? input "AssociationTime") (clojure.core/assoc :association-time (deser-date-time (input "AssociationTime")))))

(clojure.core/defn- deser-license-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "LicenseCount") (clojure.core/assoc :license-count (deser-box-long (input "LicenseCount"))) (clojure.core/contains? input "OwnerAccountId") (clojure.core/assoc :owner-account-id (deser-string (input "OwnerAccountId"))) (clojure.core/contains? input "ManagedResourceSummaryList") (clojure.core/assoc :managed-resource-summary-list (deser-managed-resource-summary-list (input "ManagedResourceSummaryList"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-string (input "Status"))) (clojure.core/contains? input "ConsumedLicenseSummaryList") (clojure.core/assoc :consumed-license-summary-list (deser-consumed-license-summary-list (input "ConsumedLicenseSummaryList"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "LicenseCountHardLimit") (clojure.core/assoc :license-count-hard-limit (deser-box-boolean (input "LicenseCountHardLimit"))) (clojure.core/contains? input "LicenseConfigurationArn") (clojure.core/assoc :license-configuration-arn (deser-string (input "LicenseConfigurationArn"))) (clojure.core/contains? input "LicenseCountingType") (clojure.core/assoc :license-counting-type (deser-license-counting-type (input "LicenseCountingType"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "LicenseConfigurationId") (clojure.core/assoc :license-configuration-id (deser-string (input "LicenseConfigurationId"))) (clojure.core/contains? input "LicenseRules") (clojure.core/assoc :license-rules (deser-string-list (input "LicenseRules"))) (clojure.core/contains? input "ConsumedLicenses") (clojure.core/assoc :consumed-licenses (deser-box-long (input "ConsumedLicenses")))))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"EC2_INSTANCE" :ec-2-instance, "EC2_HOST" :ec-2-host, "EC2_AMI" :ec-2-ami} input))

(clojure.core/defn- deser-resource-inventory [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-string (input "ResourceId"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "ResourceArn") (clojure.core/assoc :resource-arn (deser-string (input "ResourceArn"))) (clojure.core/contains? input "Platform") (clojure.core/assoc :platform (deser-string (input "Platform"))) (clojure.core/contains? input "PlatformVersion") (clojure.core/assoc :platform-version (deser-string (input "PlatformVersion"))) (clojure.core/contains? input "ResourceOwningAccountId") (clojure.core/assoc :resource-owning-account-id (deser-string (input "ResourceOwningAccountId")))))

(clojure.core/defn- deser-managed-resource-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "ResourceType"))) (clojure.core/contains? input "AssociationCount") (clojure.core/assoc :association-count (deser-box-long (input "AssociationCount")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-license-counting-type [input] (clojure.core/get {"vCPU" :v-cpu, "Instance" :instance, "Core" :core, "Socket" :socket} input))

(clojure.core/defn- deser-license-configuration-usage-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license-configuration-usage coll))) input))

(clojure.core/defn- deser-resource-inventory-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-inventory coll))) input))

(clojure.core/defn- deser-box-boolean [input] input)

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-license-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license-configuration coll))) input))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1885908 input] (clojure.core/let [rawinput1885907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885909 {"Tags" (rawinput1885907 "Tags")}] (clojure.core/cond-> {} (letvar1885909 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1885909 ["Tags"])))))))

(clojure.core/defn- response-update-license-specifications-for-resource-response ([input] (response-update-license-specifications-for-resource-response nil input)) ([resultWrapper1885911 input] (clojure.core/let [rawinput1885910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885912 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-authorization-exception ([input] (response-authorization-exception nil input)) ([resultWrapper1885914 input] (clojure.core/let [rawinput1885913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885915 {"Message" (rawinput1885913 "Message")}] (clojure.core/cond-> {} (letvar1885915 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885915 ["Message"])))))))

(clojure.core/defn- response-list-associations-for-license-configuration-response ([input] (response-list-associations-for-license-configuration-response nil input)) ([resultWrapper1885917 input] (clojure.core/let [rawinput1885916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885918 {"LicenseConfigurationAssociations" (rawinput1885916 "LicenseConfigurationAssociations"), "NextToken" (rawinput1885916 "NextToken")}] (clojure.core/cond-> {} (letvar1885918 "LicenseConfigurationAssociations") (clojure.core/assoc :license-configuration-associations (deser-license-configuration-associations (clojure.core/get-in letvar1885918 ["LicenseConfigurationAssociations"]))) (letvar1885918 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1885918 ["NextToken"])))))))

(clojure.core/defn- response-failed-dependency-exception ([input] (response-failed-dependency-exception nil input)) ([resultWrapper1885920 input] (clojure.core/let [rawinput1885919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885921 {"Message" (rawinput1885919 "Message")}] (clojure.core/cond-> {} (letvar1885921 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885921 ["Message"])))))))

(clojure.core/defn- response-get-service-settings-response ([input] (response-get-service-settings-response nil input)) ([resultWrapper1885923 input] (clojure.core/let [rawinput1885922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885924 {"S3BucketArn" (rawinput1885922 "S3BucketArn"), "SnsTopicArn" (rawinput1885922 "SnsTopicArn"), "OrganizationConfiguration" (rawinput1885922 "OrganizationConfiguration"), "EnableCrossAccountsDiscovery" (rawinput1885922 "EnableCrossAccountsDiscovery")}] (clojure.core/cond-> {} (letvar1885924 "S3BucketArn") (clojure.core/assoc :s-3-bucket-arn (deser-string (clojure.core/get-in letvar1885924 ["S3BucketArn"]))) (letvar1885924 "SnsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar1885924 ["SnsTopicArn"]))) (letvar1885924 "OrganizationConfiguration") (clojure.core/assoc :organization-configuration (deser-organization-configuration (clojure.core/get-in letvar1885924 ["OrganizationConfiguration"]))) (letvar1885924 "EnableCrossAccountsDiscovery") (clojure.core/assoc :enable-cross-accounts-discovery (deser-box-boolean (clojure.core/get-in letvar1885924 ["EnableCrossAccountsDiscovery"])))))))

(clojure.core/defn- response-list-license-configurations-response ([input] (response-list-license-configurations-response nil input)) ([resultWrapper1885926 input] (clojure.core/let [rawinput1885925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885927 {"LicenseConfigurations" (rawinput1885925 "LicenseConfigurations"), "NextToken" (rawinput1885925 "NextToken")}] (clojure.core/cond-> {} (letvar1885927 "LicenseConfigurations") (clojure.core/assoc :license-configurations (deser-license-configurations (clojure.core/get-in letvar1885927 ["LicenseConfigurations"]))) (letvar1885927 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1885927 ["NextToken"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1885929 input] (clojure.core/let [rawinput1885928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885930 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-filter-limit-exceeded-exception ([input] (response-filter-limit-exceeded-exception nil input)) ([resultWrapper1885932 input] (clojure.core/let [rawinput1885931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885933 {"Message" (rawinput1885931 "Message")}] (clojure.core/cond-> {} (letvar1885933 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885933 ["Message"])))))))

(clojure.core/defn- response-get-license-configuration-response ([input] (response-get-license-configuration-response nil input)) ([resultWrapper1885935 input] (clojure.core/let [rawinput1885934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885936 {"LicenseCount" (rawinput1885934 "LicenseCount"), "OwnerAccountId" (rawinput1885934 "OwnerAccountId"), "ManagedResourceSummaryList" (rawinput1885934 "ManagedResourceSummaryList"), "Tags" (rawinput1885934 "Tags"), "Status" (rawinput1885934 "Status"), "ConsumedLicenseSummaryList" (rawinput1885934 "ConsumedLicenseSummaryList"), "Description" (rawinput1885934 "Description"), "LicenseCountHardLimit" (rawinput1885934 "LicenseCountHardLimit"), "LicenseConfigurationArn" (rawinput1885934 "LicenseConfigurationArn"), "LicenseCountingType" (rawinput1885934 "LicenseCountingType"), "Name" (rawinput1885934 "Name"), "LicenseConfigurationId" (rawinput1885934 "LicenseConfigurationId"), "LicenseRules" (rawinput1885934 "LicenseRules"), "ConsumedLicenses" (rawinput1885934 "ConsumedLicenses")}] (clojure.core/cond-> {} (letvar1885936 "LicenseCount") (clojure.core/assoc :license-count (deser-box-long (clojure.core/get-in letvar1885936 ["LicenseCount"]))) (letvar1885936 "OwnerAccountId") (clojure.core/assoc :owner-account-id (deser-string (clojure.core/get-in letvar1885936 ["OwnerAccountId"]))) (letvar1885936 "ManagedResourceSummaryList") (clojure.core/assoc :managed-resource-summary-list (deser-managed-resource-summary-list (clojure.core/get-in letvar1885936 ["ManagedResourceSummaryList"]))) (letvar1885936 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1885936 ["Tags"]))) (letvar1885936 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar1885936 ["Status"]))) (letvar1885936 "ConsumedLicenseSummaryList") (clojure.core/assoc :consumed-license-summary-list (deser-consumed-license-summary-list (clojure.core/get-in letvar1885936 ["ConsumedLicenseSummaryList"]))) (letvar1885936 "Description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1885936 ["Description"]))) (letvar1885936 "LicenseCountHardLimit") (clojure.core/assoc :license-count-hard-limit (deser-box-boolean (clojure.core/get-in letvar1885936 ["LicenseCountHardLimit"]))) (letvar1885936 "LicenseConfigurationArn") (clojure.core/assoc :license-configuration-arn (deser-string (clojure.core/get-in letvar1885936 ["LicenseConfigurationArn"]))) (letvar1885936 "LicenseCountingType") (clojure.core/assoc :license-counting-type (deser-license-counting-type (clojure.core/get-in letvar1885936 ["LicenseCountingType"]))) (letvar1885936 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1885936 ["Name"]))) (letvar1885936 "LicenseConfigurationId") (clojure.core/assoc :license-configuration-id (deser-string (clojure.core/get-in letvar1885936 ["LicenseConfigurationId"]))) (letvar1885936 "LicenseRules") (clojure.core/assoc :license-rules (deser-string-list (clojure.core/get-in letvar1885936 ["LicenseRules"]))) (letvar1885936 "ConsumedLicenses") (clojure.core/assoc :consumed-licenses (deser-box-long (clojure.core/get-in letvar1885936 ["ConsumedLicenses"])))))))

(clojure.core/defn- response-rate-limit-exceeded-exception ([input] (response-rate-limit-exceeded-exception nil input)) ([resultWrapper1885938 input] (clojure.core/let [rawinput1885937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885939 {"Message" (rawinput1885937 "Message")}] (clojure.core/cond-> {} (letvar1885939 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885939 ["Message"])))))))

(clojure.core/defn- response-update-service-settings-response ([input] (response-update-service-settings-response nil input)) ([resultWrapper1885941 input] (clojure.core/let [rawinput1885940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885942 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1885944 input] (clojure.core/let [rawinput1885943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885945 {"Message" (rawinput1885943 "Message")}] (clojure.core/cond-> {} (letvar1885945 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885945 ["Message"])))))))

(clojure.core/defn- response-create-license-configuration-response ([input] (response-create-license-configuration-response nil input)) ([resultWrapper1885947 input] (clojure.core/let [rawinput1885946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885948 {"LicenseConfigurationArn" (rawinput1885946 "LicenseConfigurationArn")}] (clojure.core/cond-> {} (letvar1885948 "LicenseConfigurationArn") (clojure.core/assoc :license-configuration-arn (deser-string (clojure.core/get-in letvar1885948 ["LicenseConfigurationArn"])))))))

(clojure.core/defn- response-delete-license-configuration-response ([input] (response-delete-license-configuration-response nil input)) ([resultWrapper1885950 input] (clojure.core/let [rawinput1885949 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885951 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-usage-for-license-configuration-response ([input] (response-list-usage-for-license-configuration-response nil input)) ([resultWrapper1885953 input] (clojure.core/let [rawinput1885952 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885954 {"LicenseConfigurationUsageList" (rawinput1885952 "LicenseConfigurationUsageList"), "NextToken" (rawinput1885952 "NextToken")}] (clojure.core/cond-> {} (letvar1885954 "LicenseConfigurationUsageList") (clojure.core/assoc :license-configuration-usage-list (deser-license-configuration-usage-list (clojure.core/get-in letvar1885954 ["LicenseConfigurationUsageList"]))) (letvar1885954 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1885954 ["NextToken"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper1885956 input] (clojure.core/let [rawinput1885955 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885957 {"Message" (rawinput1885955 "Message")}] (clojure.core/cond-> {} (letvar1885957 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885957 ["Message"])))))))

(clojure.core/defn- response-invalid-resource-state-exception ([input] (response-invalid-resource-state-exception nil input)) ([resultWrapper1885959 input] (clojure.core/let [rawinput1885958 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885960 {"Message" (rawinput1885958 "Message")}] (clojure.core/cond-> {} (letvar1885960 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885960 ["Message"])))))))

(clojure.core/defn- response-list-license-specifications-for-resource-response ([input] (response-list-license-specifications-for-resource-response nil input)) ([resultWrapper1885962 input] (clojure.core/let [rawinput1885961 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885963 {"LicenseSpecifications" (rawinput1885961 "LicenseSpecifications"), "NextToken" (rawinput1885961 "NextToken")}] (clojure.core/cond-> {} (letvar1885963 "LicenseSpecifications") (clojure.core/assoc :license-specifications (deser-license-specifications (clojure.core/get-in letvar1885963 ["LicenseSpecifications"]))) (letvar1885963 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1885963 ["NextToken"])))))))

(clojure.core/defn- response-license-usage-exception ([input] (response-license-usage-exception nil input)) ([resultWrapper1885965 input] (clojure.core/let [rawinput1885964 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885966 {"Message" (rawinput1885964 "Message")}] (clojure.core/cond-> {} (letvar1885966 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885966 ["Message"])))))))

(clojure.core/defn- response-server-internal-exception ([input] (response-server-internal-exception nil input)) ([resultWrapper1885968 input] (clojure.core/let [rawinput1885967 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885969 {"Message" (rawinput1885967 "Message")}] (clojure.core/cond-> {} (letvar1885969 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885969 ["Message"])))))))

(clojure.core/defn- response-update-license-configuration-response ([input] (response-update-license-configuration-response nil input)) ([resultWrapper1885971 input] (clojure.core/let [rawinput1885970 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885972 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1885974 input] (clojure.core/let [rawinput1885973 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885975 {"Message" (rawinput1885973 "Message")}] (clojure.core/cond-> {} (letvar1885975 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1885975 ["Message"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1885977 input] (clojure.core/let [rawinput1885976 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885978 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resource-inventory-response ([input] (response-list-resource-inventory-response nil input)) ([resultWrapper1885980 input] (clojure.core/let [rawinput1885979 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1885981 {"ResourceInventoryList" (rawinput1885979 "ResourceInventoryList"), "NextToken" (rawinput1885979 "NextToken")}] (clojure.core/cond-> {} (letvar1885981 "ResourceInventoryList") (clojure.core/assoc :resource-inventory-list (deser-resource-inventory-list (clojure.core/get-in letvar1885981 ["ResourceInventoryList"]))) (letvar1885981 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1885981 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/name (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/description (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/license-count (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-request/tags (clojure.spec.alpha/and :portkey.aws.license-manager/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager/create-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.create-license-configuration-request/name :portkey.aws.license-manager/license-counting-type] :opt-un [:portkey.aws.license-manager.create-license-configuration-request/description :portkey.aws.license-manager.create-license-configuration-request/license-count :portkey.aws.license-manager.create-license-configuration-request/license-count-hard-limit :portkey.aws.license-manager.create-license-configuration-request/license-rules :portkey.aws.license-manager.create-license-configuration-request/tags]))

(clojure.spec.alpha/def :portkey.aws.license-manager/string-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/string))

(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration-associations (clojure.spec.alpha/coll-of :portkey.aws.license-manager/license-configuration-association))

(clojure.spec.alpha/def :portkey.aws.license-manager.filter/name (clojure.spec.alpha/and :portkey.aws.license-manager/filter-name))
(clojure.spec.alpha/def :portkey.aws.license-manager.filter/values (clojure.spec.alpha/and :portkey.aws.license-manager/filter-values))
(clojure.spec.alpha/def :portkey.aws.license-manager/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.filter/name :portkey.aws.license-manager.filter/values]))

(clojure.spec.alpha/def :portkey.aws.license-manager.license-specification/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/license-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.license-specification/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.license-manager/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.license-manager.inventory-filter/name (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.inventory-filter/condition (clojure.spec.alpha/and :portkey.aws.license-manager/inventory-filter-condition))
(clojure.spec.alpha/def :portkey.aws.license-manager.inventory-filter/value (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.inventory-filter/name :portkey.aws.license-manager.inventory-filter/condition] :opt-un [:portkey.aws.license-manager.inventory-filter/value]))

(clojure.spec.alpha/def :portkey.aws.license-manager/update-license-specifications-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.organization-configuration/enable-integration (clojure.spec.alpha/and :portkey.aws.license-manager/boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager/organization-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.organization-configuration/enable-integration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager/authorization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.update-service-settings-request/s-3-bucket-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-service-settings-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-service-settings-request/enable-cross-accounts-discovery (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager/update-service-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.update-service-settings-request/s-3-bucket-arn :portkey.aws.license-manager.update-service-settings-request/sns-topic-arn :portkey.aws.license-manager/organization-configuration :portkey.aws.license-manager.update-service-settings-request/enable-cross-accounts-discovery]))

(clojure.spec.alpha/def :portkey.aws.license-manager/inventory-filter-condition #{"NOT_EQUALS" :contains "CONTAINS" :equals "BEGINS_WITH" :not-equals "EQUALS" :begins-with})

(clojure.spec.alpha/def :portkey.aws.license-manager/managed-resource-summary-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/managed-resource-summary))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.consumed-license-summary/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager/consumed-license-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/resource-type :portkey.aws.license-manager.consumed-license-summary/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-usage/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-usage/resource-status (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-usage/resource-owner-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-usage/association-time (clojure.spec.alpha/and :portkey.aws.license-manager/date-time))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-usage/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.license-configuration-usage/resource-arn :portkey.aws.license-manager/resource-type :portkey.aws.license-manager.license-configuration-usage/resource-status :portkey.aws.license-manager.license-configuration-usage/resource-owner-id :portkey.aws.license-manager.license-configuration-usage/association-time :portkey.aws.license-manager.license-configuration-usage/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-associations-for-license-configuration-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-associations-for-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/license-configuration-associations :portkey.aws.license-manager.list-associations-for-license-configuration-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager/inventory-filter-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/inventory-filter))

(clojure.spec.alpha/def :portkey.aws.license-manager/failed-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.get-service-settings-response/s-3-bucket-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-service-settings-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-service-settings-response/enable-cross-accounts-discovery (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager/get-service-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.get-service-settings-response/s-3-bucket-arn :portkey.aws.license-manager.get-service-settings-response/sns-topic-arn :portkey.aws.license-manager/organization-configuration :portkey.aws.license-manager.get-service-settings-response/enable-cross-accounts-discovery]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-license-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/license-configurations :portkey.aws.license-manager.list-license-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager/filter-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/box-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.license-manager/filter-values (clojure.spec.alpha/coll-of :portkey.aws.license-manager/filter-value))

(clojure.spec.alpha/def :portkey.aws.license-manager/license-specifications (clojure.spec.alpha/coll-of :portkey.aws.license-manager/license-specification))

(clojure.spec.alpha/def :portkey.aws.license-manager.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.license-manager/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.tag-resource-request/resource-arn :portkey.aws.license-manager.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager/consumed-license-summary-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/consumed-license-summary))

(clojure.spec.alpha/def :portkey.aws.license-manager/tag-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/tag))

(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/license-count (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/owner-account-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/tags (clojure.spec.alpha/and :portkey.aws.license-manager/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/status (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/description (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/name (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/license-configuration-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-response/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager/get-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.get-license-configuration-response/license-count :portkey.aws.license-manager.get-license-configuration-response/owner-account-id :portkey.aws.license-manager/managed-resource-summary-list :portkey.aws.license-manager.get-license-configuration-response/tags :portkey.aws.license-manager.get-license-configuration-response/status :portkey.aws.license-manager/consumed-license-summary-list :portkey.aws.license-manager.get-license-configuration-response/description :portkey.aws.license-manager.get-license-configuration-response/license-count-hard-limit :portkey.aws.license-manager.get-license-configuration-response/license-configuration-arn :portkey.aws.license-manager/license-counting-type :portkey.aws.license-manager.get-license-configuration-response/name :portkey.aws.license-manager.get-license-configuration-response/license-configuration-id :portkey.aws.license-manager.get-license-configuration-response/license-rules :portkey.aws.license-manager.get-license-configuration-response/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/string))

(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-association/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-association/resource-owner-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration-association/association-time (clojure.spec.alpha/and :portkey.aws.license-manager/date-time))
(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.license-configuration-association/resource-arn :portkey.aws.license-manager/resource-type :portkey.aws.license-manager.license-configuration-association/resource-owner-id :portkey.aws.license-manager.license-configuration-association/association-time]))

(clojure.spec.alpha/def :portkey.aws.license-manager/rate-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.get-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/get-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.get-license-configuration-request/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/license-count (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/owner-account-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/status (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/description (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/name (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/license-configuration-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.license-configuration/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.license-configuration/license-count :portkey.aws.license-manager.license-configuration/owner-account-id :portkey.aws.license-manager/managed-resource-summary-list :portkey.aws.license-manager.license-configuration/status :portkey.aws.license-manager/consumed-license-summary-list :portkey.aws.license-manager.license-configuration/description :portkey.aws.license-manager.license-configuration/license-count-hard-limit :portkey.aws.license-manager.license-configuration/license-configuration-arn :portkey.aws.license-manager/license-counting-type :portkey.aws.license-manager.license-configuration/name :portkey.aws.license-manager.license-configuration/license-configuration-id :portkey.aws.license-manager.license-configuration/license-rules :portkey.aws.license-manager.license-configuration/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-associations-for-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-associations-for-license-configuration-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-associations-for-license-configuration-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-associations-for-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.list-associations-for-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager.list-associations-for-license-configuration-request/max-results :portkey.aws.license-manager.list-associations-for-license-configuration-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager/update-service-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-usage-for-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-usage-for-license-configuration-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-usage-for-license-configuration-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-usage-for-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.list-usage-for-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager.list-usage-for-license-configuration-request/max-results :portkey.aws.license-manager.list-usage-for-license-configuration-request/next-token :portkey.aws.license-manager/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager/resource-type #{"EC2_HOST" :ec-2-ami "EC2_AMI" "EC2_INSTANCE" :ec-2-host :ec-2-instance})

(clojure.spec.alpha/def :portkey.aws.license-manager/filters (clojure.spec.alpha/coll-of :portkey.aws.license-manager/filter))

(clojure.spec.alpha/def :portkey.aws.license-manager.create-license-configuration-response/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/create-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.create-license-configuration-response/license-configuration-arn]))

(clojure.spec.alpha/def :portkey.aws.license-manager/delete-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.resource-inventory/resource-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.resource-inventory/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.resource-inventory/platform (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.resource-inventory/platform-version (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.resource-inventory/resource-owning-account-id (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/resource-inventory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.resource-inventory/resource-id :portkey.aws.license-manager/resource-type :portkey.aws.license-manager.resource-inventory/resource-arn :portkey.aws.license-manager.resource-inventory/platform :portkey.aws.license-manager.resource-inventory/platform-version :portkey.aws.license-manager.resource-inventory/resource-owning-account-id]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-usage-for-license-configuration-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-usage-for-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/license-configuration-usage-list :portkey.aws.license-manager.list-usage-for-license-configuration-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager/box-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/license-count (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/name (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-configuration-request/description (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/update-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.update-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager/license-configuration-status :portkey.aws.license-manager.update-license-configuration-request/license-rules :portkey.aws.license-manager.update-license-configuration-request/license-count :portkey.aws.license-manager.update-license-configuration-request/license-count-hard-limit :portkey.aws.license-manager.update-license-configuration-request/name :portkey.aws.license-manager.update-license-configuration-request/description]))

(clojure.spec.alpha/def :portkey.aws.license-manager/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/invalid-resource-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.managed-resource-summary/association-count (clojure.spec.alpha/and :portkey.aws.license-manager/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager/managed-resource-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/resource-type :portkey.aws.license-manager.managed-resource-summary/association-count]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-specifications-for-resource-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-license-specifications-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/license-specifications :portkey.aws.license-manager.list-license-specifications-for-resource-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration-status #{"DISABLED" :disabled "AVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.license-manager/get-service-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.tag/key (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.tag/value (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.tag/key :portkey.aws.license-manager.tag/value]))

(clojure.spec.alpha/def :portkey.aws.license-manager/license-counting-type #{:instance :socket "Socket" "vCPU" :core "Core" "Instance" :v-cpu})

(clojure.spec.alpha/def :portkey.aws.license-manager/license-configuration-usage-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/license-configuration-usage))

(clojure.spec.alpha/def :portkey.aws.license-manager/license-usage-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/server-internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/update-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-specifications-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-specifications-for-resource-request/add-license-specifications (clojure.spec.alpha/and :portkey.aws.license-manager/license-specifications))
(clojure.spec.alpha/def :portkey.aws.license-manager.update-license-specifications-for-resource-request/remove-license-specifications (clojure.spec.alpha/and :portkey.aws.license-manager/license-specifications))
(clojure.spec.alpha/def :portkey.aws.license-manager/update-license-specifications-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.update-license-specifications-for-resource-request/resource-arn] :opt-un [:portkey.aws.license-manager.update-license-specifications-for-resource-request/add-license-specifications :portkey.aws.license-manager.update-license-specifications-for-resource-request/remove-license-specifications]))

(clojure.spec.alpha/def :portkey.aws.license-manager/filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager/resource-inventory-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager/resource-inventory))

(clojure.spec.alpha/def :portkey.aws.license-manager/box-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.license-manager/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.license-manager/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.license-manager/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.untag-resource-request/resource-arn :portkey.aws.license-manager.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-specifications-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-specifications-for-resource-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-specifications-for-resource-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-license-specifications-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.list-license-specifications-for-resource-request/resource-arn] :opt-un [:portkey.aws.license-manager.list-license-specifications-for-resource-request/max-results :portkey.aws.license-manager.list-license-specifications-for-resource-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-resource-inventory-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-resource-inventory-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager/resource-inventory-list :portkey.aws.license-manager.list-resource-inventory-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.delete-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/delete-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.delete-license-configuration-request/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-configurations-request/license-configuration-arns (clojure.spec.alpha/and :portkey.aws.license-manager/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-license-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-license-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.list-license-configurations-request/license-configuration-arns :portkey.aws.license-manager.list-license-configurations-request/max-results :portkey.aws.license-manager.list-license-configurations-request/next-token :portkey.aws.license-manager/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.license-manager.list-resource-inventory-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-resource-inventory-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.list-resource-inventory-request/filters (clojure.spec.alpha/and :portkey.aws.license-manager/inventory-filter-list))
(clojure.spec.alpha/def :portkey.aws.license-manager/list-resource-inventory-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.list-resource-inventory-request/max-results :portkey.aws.license-manager.list-resource-inventory-request/next-token :portkey.aws.license-manager.list-resource-inventory-request/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.license-manager/license-configurations (clojure.spec.alpha/coll-of :portkey.aws.license-manager/license-configuration))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/tag-resource-response))

(clojure.core/defn list-resource-inventory ([] (list-resource-inventory {})) ([list-resource-inventory-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resource-inventory-request list-resource-inventory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-resource-inventory-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-resource-inventory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourceInventory", :http.request.configuration/output-deser-fn response-list-resource-inventory-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "FilterLimitExceededException" :portkey.aws.license-manager/filter-limit-exceeded-exception, "FailedDependencyException" :portkey.aws.license-manager/failed-dependency-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-resource-inventory :args (clojure.spec.alpha/? :portkey.aws.license-manager/list-resource-inventory-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-resource-inventory-response))

(clojure.core/defn update-license-configuration ([update-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-license-configuration-request update-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/update-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/update-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLicenseConfiguration", :http.request.configuration/output-deser-fn response-update-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/update-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/update-license-configuration-response))

(clojure.core/defn update-license-specifications-for-resource ([update-license-specifications-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-license-specifications-for-resource-request update-license-specifications-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/update-license-specifications-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/update-license-specifications-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLicenseSpecificationsForResource", :http.request.configuration/output-deser-fn response-update-license-specifications-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "InvalidResourceStateException" :portkey.aws.license-manager/invalid-resource-state-exception, "LicenseUsageException" :portkey.aws.license-manager/license-usage-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-license-specifications-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/update-license-specifications-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/update-license-specifications-for-resource-response))

(clojure.core/defn delete-license-configuration ([delete-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-license-configuration-request delete-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/delete-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/delete-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLicenseConfiguration", :http.request.configuration/output-deser-fn response-delete-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/delete-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/delete-license-configuration-response))

(clojure.core/defn list-associations-for-license-configuration ([list-associations-for-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-associations-for-license-configuration-request list-associations-for-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-associations-for-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-associations-for-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAssociationsForLicenseConfiguration", :http.request.configuration/output-deser-fn response-list-associations-for-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "FilterLimitExceededException" :portkey.aws.license-manager/filter-limit-exceeded-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-associations-for-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/list-associations-for-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-associations-for-license-configuration-response))

(clojure.core/defn list-license-configurations ([] (list-license-configurations {})) ([list-license-configurations-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-license-configurations-request list-license-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-license-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-license-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLicenseConfigurations", :http.request.configuration/output-deser-fn response-list-license-configurations-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "FilterLimitExceededException" :portkey.aws.license-manager/filter-limit-exceeded-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-license-configurations :args (clojure.spec.alpha/? :portkey.aws.license-manager/list-license-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-license-configurations-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-tags-for-resource-response))

(clojure.core/defn get-service-settings ([] (get-service-settings {})) ([get-service-settings-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-service-settings-request get-service-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/get-service-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/get-service-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetServiceSettings", :http.request.configuration/output-deser-fn response-get-service-settings-response, :http.request.spec/error-spec {"ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-service-settings :args (clojure.spec.alpha/? :portkey.aws.license-manager/get-service-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/get-service-settings-response))

(clojure.core/defn list-license-specifications-for-resource ([list-license-specifications-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-license-specifications-for-resource-request list-license-specifications-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-license-specifications-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-license-specifications-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLicenseSpecificationsForResource", :http.request.configuration/output-deser-fn response-list-license-specifications-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-license-specifications-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/list-license-specifications-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-license-specifications-for-resource-response))

(clojure.core/defn list-usage-for-license-configuration ([list-usage-for-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-usage-for-license-configuration-request list-usage-for-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/list-usage-for-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/list-usage-for-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsageForLicenseConfiguration", :http.request.configuration/output-deser-fn response-list-usage-for-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "FilterLimitExceededException" :portkey.aws.license-manager/filter-limit-exceeded-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-usage-for-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/list-usage-for-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/list-usage-for-license-configuration-response))

(clojure.core/defn create-license-configuration ([create-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-license-configuration-request create-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/create-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/create-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLicenseConfiguration", :http.request.configuration/output-deser-fn response-create-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "ResourceLimitExceededException" :portkey.aws.license-manager/resource-limit-exceeded-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/create-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/create-license-configuration-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/untag-resource-response))

(clojure.core/defn update-service-settings ([] (update-service-settings {})) ([update-service-settings-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-service-settings-request update-service-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/update-service-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/update-service-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServiceSettings", :http.request.configuration/output-deser-fn response-update-service-settings-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-service-settings :args (clojure.spec.alpha/? :portkey.aws.license-manager/update-service-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/update-service-settings-response))

(clojure.core/defn get-license-configuration ([get-license-configuration-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-license-configuration-request get-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager/get-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager/get-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLicenseConfiguration", :http.request.configuration/output-deser-fn response-get-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager/get-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager/get-license-configuration-response))
