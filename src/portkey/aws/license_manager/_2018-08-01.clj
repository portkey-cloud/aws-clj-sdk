(ns portkey.aws.license-manager.-2018-08-01 (:require [portkey.aws]))

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

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1869001 input] (clojure.core/let [rawinput1869000 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869002 {"Tags" (rawinput1869000 "Tags")}] (clojure.core/cond-> {} (letvar1869002 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1869002 ["Tags"])))))))

(clojure.core/defn- response-update-license-specifications-for-resource-response ([input] (response-update-license-specifications-for-resource-response nil input)) ([resultWrapper1869004 input] (clojure.core/let [rawinput1869003 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869005 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-authorization-exception ([input] (response-authorization-exception nil input)) ([resultWrapper1869007 input] (clojure.core/let [rawinput1869006 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869008 {"Message" (rawinput1869006 "Message")}] (clojure.core/cond-> {} (letvar1869008 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869008 ["Message"])))))))

(clojure.core/defn- response-list-associations-for-license-configuration-response ([input] (response-list-associations-for-license-configuration-response nil input)) ([resultWrapper1869010 input] (clojure.core/let [rawinput1869009 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869011 {"LicenseConfigurationAssociations" (rawinput1869009 "LicenseConfigurationAssociations"), "NextToken" (rawinput1869009 "NextToken")}] (clojure.core/cond-> {} (letvar1869011 "LicenseConfigurationAssociations") (clojure.core/assoc :license-configuration-associations (deser-license-configuration-associations (clojure.core/get-in letvar1869011 ["LicenseConfigurationAssociations"]))) (letvar1869011 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1869011 ["NextToken"])))))))

(clojure.core/defn- response-failed-dependency-exception ([input] (response-failed-dependency-exception nil input)) ([resultWrapper1869013 input] (clojure.core/let [rawinput1869012 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869014 {"Message" (rawinput1869012 "Message")}] (clojure.core/cond-> {} (letvar1869014 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869014 ["Message"])))))))

(clojure.core/defn- response-get-service-settings-response ([input] (response-get-service-settings-response nil input)) ([resultWrapper1869016 input] (clojure.core/let [rawinput1869015 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869017 {"S3BucketArn" (rawinput1869015 "S3BucketArn"), "SnsTopicArn" (rawinput1869015 "SnsTopicArn"), "OrganizationConfiguration" (rawinput1869015 "OrganizationConfiguration"), "EnableCrossAccountsDiscovery" (rawinput1869015 "EnableCrossAccountsDiscovery")}] (clojure.core/cond-> {} (letvar1869017 "S3BucketArn") (clojure.core/assoc :s-3-bucket-arn (deser-string (clojure.core/get-in letvar1869017 ["S3BucketArn"]))) (letvar1869017 "SnsTopicArn") (clojure.core/assoc :sns-topic-arn (deser-string (clojure.core/get-in letvar1869017 ["SnsTopicArn"]))) (letvar1869017 "OrganizationConfiguration") (clojure.core/assoc :organization-configuration (deser-organization-configuration (clojure.core/get-in letvar1869017 ["OrganizationConfiguration"]))) (letvar1869017 "EnableCrossAccountsDiscovery") (clojure.core/assoc :enable-cross-accounts-discovery (deser-box-boolean (clojure.core/get-in letvar1869017 ["EnableCrossAccountsDiscovery"])))))))

(clojure.core/defn- response-list-license-configurations-response ([input] (response-list-license-configurations-response nil input)) ([resultWrapper1869019 input] (clojure.core/let [rawinput1869018 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869020 {"LicenseConfigurations" (rawinput1869018 "LicenseConfigurations"), "NextToken" (rawinput1869018 "NextToken")}] (clojure.core/cond-> {} (letvar1869020 "LicenseConfigurations") (clojure.core/assoc :license-configurations (deser-license-configurations (clojure.core/get-in letvar1869020 ["LicenseConfigurations"]))) (letvar1869020 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1869020 ["NextToken"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1869022 input] (clojure.core/let [rawinput1869021 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869023 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-filter-limit-exceeded-exception ([input] (response-filter-limit-exceeded-exception nil input)) ([resultWrapper1869025 input] (clojure.core/let [rawinput1869024 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869026 {"Message" (rawinput1869024 "Message")}] (clojure.core/cond-> {} (letvar1869026 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869026 ["Message"])))))))

(clojure.core/defn- response-get-license-configuration-response ([input] (response-get-license-configuration-response nil input)) ([resultWrapper1869028 input] (clojure.core/let [rawinput1869027 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869029 {"LicenseCount" (rawinput1869027 "LicenseCount"), "OwnerAccountId" (rawinput1869027 "OwnerAccountId"), "ManagedResourceSummaryList" (rawinput1869027 "ManagedResourceSummaryList"), "Tags" (rawinput1869027 "Tags"), "Status" (rawinput1869027 "Status"), "ConsumedLicenseSummaryList" (rawinput1869027 "ConsumedLicenseSummaryList"), "Description" (rawinput1869027 "Description"), "LicenseCountHardLimit" (rawinput1869027 "LicenseCountHardLimit"), "LicenseConfigurationArn" (rawinput1869027 "LicenseConfigurationArn"), "LicenseCountingType" (rawinput1869027 "LicenseCountingType"), "Name" (rawinput1869027 "Name"), "LicenseConfigurationId" (rawinput1869027 "LicenseConfigurationId"), "LicenseRules" (rawinput1869027 "LicenseRules"), "ConsumedLicenses" (rawinput1869027 "ConsumedLicenses")}] (clojure.core/cond-> {} (letvar1869029 "LicenseCount") (clojure.core/assoc :license-count (deser-box-long (clojure.core/get-in letvar1869029 ["LicenseCount"]))) (letvar1869029 "OwnerAccountId") (clojure.core/assoc :owner-account-id (deser-string (clojure.core/get-in letvar1869029 ["OwnerAccountId"]))) (letvar1869029 "ManagedResourceSummaryList") (clojure.core/assoc :managed-resource-summary-list (deser-managed-resource-summary-list (clojure.core/get-in letvar1869029 ["ManagedResourceSummaryList"]))) (letvar1869029 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1869029 ["Tags"]))) (letvar1869029 "Status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar1869029 ["Status"]))) (letvar1869029 "ConsumedLicenseSummaryList") (clojure.core/assoc :consumed-license-summary-list (deser-consumed-license-summary-list (clojure.core/get-in letvar1869029 ["ConsumedLicenseSummaryList"]))) (letvar1869029 "Description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1869029 ["Description"]))) (letvar1869029 "LicenseCountHardLimit") (clojure.core/assoc :license-count-hard-limit (deser-box-boolean (clojure.core/get-in letvar1869029 ["LicenseCountHardLimit"]))) (letvar1869029 "LicenseConfigurationArn") (clojure.core/assoc :license-configuration-arn (deser-string (clojure.core/get-in letvar1869029 ["LicenseConfigurationArn"]))) (letvar1869029 "LicenseCountingType") (clojure.core/assoc :license-counting-type (deser-license-counting-type (clojure.core/get-in letvar1869029 ["LicenseCountingType"]))) (letvar1869029 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1869029 ["Name"]))) (letvar1869029 "LicenseConfigurationId") (clojure.core/assoc :license-configuration-id (deser-string (clojure.core/get-in letvar1869029 ["LicenseConfigurationId"]))) (letvar1869029 "LicenseRules") (clojure.core/assoc :license-rules (deser-string-list (clojure.core/get-in letvar1869029 ["LicenseRules"]))) (letvar1869029 "ConsumedLicenses") (clojure.core/assoc :consumed-licenses (deser-box-long (clojure.core/get-in letvar1869029 ["ConsumedLicenses"])))))))

(clojure.core/defn- response-rate-limit-exceeded-exception ([input] (response-rate-limit-exceeded-exception nil input)) ([resultWrapper1869031 input] (clojure.core/let [rawinput1869030 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869032 {"Message" (rawinput1869030 "Message")}] (clojure.core/cond-> {} (letvar1869032 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869032 ["Message"])))))))

(clojure.core/defn- response-update-service-settings-response ([input] (response-update-service-settings-response nil input)) ([resultWrapper1869034 input] (clojure.core/let [rawinput1869033 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869035 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1869037 input] (clojure.core/let [rawinput1869036 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869038 {"Message" (rawinput1869036 "Message")}] (clojure.core/cond-> {} (letvar1869038 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869038 ["Message"])))))))

(clojure.core/defn- response-create-license-configuration-response ([input] (response-create-license-configuration-response nil input)) ([resultWrapper1869040 input] (clojure.core/let [rawinput1869039 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869041 {"LicenseConfigurationArn" (rawinput1869039 "LicenseConfigurationArn")}] (clojure.core/cond-> {} (letvar1869041 "LicenseConfigurationArn") (clojure.core/assoc :license-configuration-arn (deser-string (clojure.core/get-in letvar1869041 ["LicenseConfigurationArn"])))))))

(clojure.core/defn- response-delete-license-configuration-response ([input] (response-delete-license-configuration-response nil input)) ([resultWrapper1869043 input] (clojure.core/let [rawinput1869042 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869044 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-usage-for-license-configuration-response ([input] (response-list-usage-for-license-configuration-response nil input)) ([resultWrapper1869046 input] (clojure.core/let [rawinput1869045 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869047 {"LicenseConfigurationUsageList" (rawinput1869045 "LicenseConfigurationUsageList"), "NextToken" (rawinput1869045 "NextToken")}] (clojure.core/cond-> {} (letvar1869047 "LicenseConfigurationUsageList") (clojure.core/assoc :license-configuration-usage-list (deser-license-configuration-usage-list (clojure.core/get-in letvar1869047 ["LicenseConfigurationUsageList"]))) (letvar1869047 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1869047 ["NextToken"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper1869049 input] (clojure.core/let [rawinput1869048 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869050 {"Message" (rawinput1869048 "Message")}] (clojure.core/cond-> {} (letvar1869050 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869050 ["Message"])))))))

(clojure.core/defn- response-invalid-resource-state-exception ([input] (response-invalid-resource-state-exception nil input)) ([resultWrapper1869052 input] (clojure.core/let [rawinput1869051 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869053 {"Message" (rawinput1869051 "Message")}] (clojure.core/cond-> {} (letvar1869053 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869053 ["Message"])))))))

(clojure.core/defn- response-list-license-specifications-for-resource-response ([input] (response-list-license-specifications-for-resource-response nil input)) ([resultWrapper1869055 input] (clojure.core/let [rawinput1869054 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869056 {"LicenseSpecifications" (rawinput1869054 "LicenseSpecifications"), "NextToken" (rawinput1869054 "NextToken")}] (clojure.core/cond-> {} (letvar1869056 "LicenseSpecifications") (clojure.core/assoc :license-specifications (deser-license-specifications (clojure.core/get-in letvar1869056 ["LicenseSpecifications"]))) (letvar1869056 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1869056 ["NextToken"])))))))

(clojure.core/defn- response-license-usage-exception ([input] (response-license-usage-exception nil input)) ([resultWrapper1869058 input] (clojure.core/let [rawinput1869057 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869059 {"Message" (rawinput1869057 "Message")}] (clojure.core/cond-> {} (letvar1869059 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869059 ["Message"])))))))

(clojure.core/defn- response-server-internal-exception ([input] (response-server-internal-exception nil input)) ([resultWrapper1869061 input] (clojure.core/let [rawinput1869060 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869062 {"Message" (rawinput1869060 "Message")}] (clojure.core/cond-> {} (letvar1869062 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869062 ["Message"])))))))

(clojure.core/defn- response-update-license-configuration-response ([input] (response-update-license-configuration-response nil input)) ([resultWrapper1869064 input] (clojure.core/let [rawinput1869063 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869065 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1869067 input] (clojure.core/let [rawinput1869066 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869068 {"Message" (rawinput1869066 "Message")}] (clojure.core/cond-> {} (letvar1869068 "Message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar1869068 ["Message"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1869070 input] (clojure.core/let [rawinput1869069 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869071 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-resource-inventory-response ([input] (response-list-resource-inventory-response nil input)) ([resultWrapper1869073 input] (clojure.core/let [rawinput1869072 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1869074 {"ResourceInventoryList" (rawinput1869072 "ResourceInventoryList"), "NextToken" (rawinput1869072 "NextToken")}] (clojure.core/cond-> {} (letvar1869074 "ResourceInventoryList") (clojure.core/assoc :resource-inventory-list (deser-resource-inventory-list (clojure.core/get-in letvar1869074 ["ResourceInventoryList"]))) (letvar1869074 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1869074 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/description (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-count (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/tags (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/create-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/name :portkey.aws.license-manager.-2018-08-01/license-counting-type] :opt-un [:portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/description :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-count :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-count-hard-limit :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/license-rules :portkey.aws.license-manager.-2018-08-01.create-license-configuration-request/tags]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/string-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/string))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration-associations (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/license-configuration-association))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.filter/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/filter-name))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.filter/values (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/filter-values))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.filter/name :portkey.aws.license-manager.-2018-08-01.filter/values]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-specification/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.license-specification/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.inventory-filter/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.inventory-filter/condition (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/inventory-filter-condition))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.inventory-filter/value (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/inventory-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.inventory-filter/name :portkey.aws.license-manager.-2018-08-01.inventory-filter/condition] :opt-un [:portkey.aws.license-manager.-2018-08-01.inventory-filter/value]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.organization-configuration/enable-integration (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/organization-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.organization-configuration/enable-integration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/authorization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-service-settings-request/s-3-bucket-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-service-settings-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-service-settings-request/enable-cross-accounts-discovery (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-service-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.update-service-settings-request/s-3-bucket-arn :portkey.aws.license-manager.-2018-08-01.update-service-settings-request/sns-topic-arn :portkey.aws.license-manager.-2018-08-01/organization-configuration :portkey.aws.license-manager.-2018-08-01.update-service-settings-request/enable-cross-accounts-discovery]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/inventory-filter-condition #{"NOT_EQUALS" :contains "CONTAINS" :equals "BEGINS_WITH" :not-equals "EQUALS" :begins-with})

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/managed-resource-summary-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/managed-resource-summary))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.consumed-license-summary/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/consumed-license-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/resource-type :portkey.aws.license-manager.-2018-08-01.consumed-license-summary/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-status (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-owner-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/association-time (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/date-time))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-arn :portkey.aws.license-manager.-2018-08-01/resource-type :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-status :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/resource-owner-id :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/association-time :portkey.aws.license-manager.-2018-08-01.license-configuration-usage/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/license-configuration-associations :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/inventory-filter-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/inventory-filter))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/failed-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-service-settings-response/s-3-bucket-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-service-settings-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-service-settings-response/enable-cross-accounts-discovery (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/get-service-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.get-service-settings-response/s-3-bucket-arn :portkey.aws.license-manager.-2018-08-01.get-service-settings-response/sns-topic-arn :portkey.aws.license-manager.-2018-08-01/organization-configuration :portkey.aws.license-manager.-2018-08-01.get-service-settings-response/enable-cross-accounts-discovery]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-license-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/license-configurations :portkey.aws.license-manager.-2018-08-01.list-license-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filter-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/box-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filter-values (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/filter-value))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-specifications (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/license-specification))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.tag-resource-request/resource-arn :portkey.aws.license-manager.-2018-08-01.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/consumed-license-summary-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/consumed-license-summary))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/tag))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-count (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/owner-account-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/tags (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/status (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/description (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-configuration-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/get-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-count :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/owner-account-id :portkey.aws.license-manager.-2018-08-01/managed-resource-summary-list :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/tags :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/status :portkey.aws.license-manager.-2018-08-01/consumed-license-summary-list :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/description :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-count-hard-limit :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-configuration-arn :portkey.aws.license-manager.-2018-08-01/license-counting-type :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/name :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-configuration-id :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/license-rules :portkey.aws.license-manager.-2018-08-01.get-license-configuration-response/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/string))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-association/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-association/resource-owner-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration-association/association-time (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/date-time))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.license-configuration-association/resource-arn :portkey.aws.license-manager.-2018-08-01/resource-type :portkey.aws.license-manager.-2018-08-01.license-configuration-association/resource-owner-id :portkey.aws.license-manager.-2018-08-01.license-configuration-association/association-time]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.get-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/get-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.get-license-configuration-request/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/license-count (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/owner-account-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/status (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/description (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/license-configuration-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.license-configuration/consumed-licenses (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.license-configuration/license-count :portkey.aws.license-manager.-2018-08-01.license-configuration/owner-account-id :portkey.aws.license-manager.-2018-08-01/managed-resource-summary-list :portkey.aws.license-manager.-2018-08-01.license-configuration/status :portkey.aws.license-manager.-2018-08-01/consumed-license-summary-list :portkey.aws.license-manager.-2018-08-01.license-configuration/description :portkey.aws.license-manager.-2018-08-01.license-configuration/license-count-hard-limit :portkey.aws.license-manager.-2018-08-01.license-configuration/license-configuration-arn :portkey.aws.license-manager.-2018-08-01/license-counting-type :portkey.aws.license-manager.-2018-08-01.license-configuration/name :portkey.aws.license-manager.-2018-08-01.license-configuration/license-configuration-id :portkey.aws.license-manager.-2018-08-01.license-configuration/license-rules :portkey.aws.license-manager.-2018-08-01.license-configuration/consumed-licenses]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/max-results :portkey.aws.license-manager.-2018-08-01.list-associations-for-license-configuration-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-service-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/max-results :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-request/next-token :portkey.aws.license-manager.-2018-08-01/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/resource-type #{"EC2_HOST" :ec-2-ami "EC2_AMI" "EC2_INSTANCE" :ec-2-host :ec-2-instance})

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filters (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/filter))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.create-license-configuration-response/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/create-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.create-license-configuration-response/license-configuration-arn]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.resource-inventory/platform (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.resource-inventory/platform-version (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-owning-account-id (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/resource-inventory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-id :portkey.aws.license-manager.-2018-08-01/resource-type :portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-arn :portkey.aws.license-manager.-2018-08-01.resource-inventory/platform :portkey.aws.license-manager.-2018-08-01.resource-inventory/platform-version :portkey.aws.license-manager.-2018-08-01.resource-inventory/resource-owning-account-id]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/license-configuration-usage-list :portkey.aws.license-manager.-2018-08-01.list-usage-for-license-configuration-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/box-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-rules (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-count (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-count-hard-limit (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-boolean))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/name (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/description (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-configuration-arn] :opt-un [:portkey.aws.license-manager.-2018-08-01/license-configuration-status :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-rules :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-count :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/license-count-hard-limit :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/name :portkey.aws.license-manager.-2018-08-01.update-license-configuration-request/description]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/invalid-resource-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.managed-resource-summary/association-count (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-long))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/managed-resource-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/resource-type :portkey.aws.license-manager.-2018-08-01.managed-resource-summary/association-count]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/license-specifications :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration-status #{"DISABLED" :disabled "AVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/get-service-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.tag/key (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.tag/value (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.tag/key :portkey.aws.license-manager.-2018-08-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-counting-type #{:instance :socket "Socket" "vCPU" :core "Core" "Instance" :v-cpu})

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configuration-usage-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/license-configuration-usage))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-usage-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/server-internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-license-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/add-license-specifications (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/license-specifications))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/remove-license-specifications (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/license-specifications))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/resource-arn] :opt-un [:portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/add-license-specifications :portkey.aws.license-manager.-2018-08-01.update-license-specifications-for-resource-request/remove-license-specifications]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/message]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/resource-inventory-list (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/resource-inventory))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/box-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.untag-resource-request/resource-arn :portkey.aws.license-manager.-2018-08-01.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/resource-arn] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/max-results :portkey.aws.license-manager.-2018-08-01.list-license-specifications-for-resource-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-response/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01/resource-inventory-list :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.delete-license-configuration-request/license-configuration-arn (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.license-manager.-2018-08-01.delete-license-configuration-request/license-configuration-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/license-configuration-arns (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-license-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/license-configuration-arns :portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/max-results :portkey.aws.license-manager.-2018-08-01.list-license-configurations-request/next-token :portkey.aws.license-manager.-2018-08-01/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/max-results (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/box-integer))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/next-token (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/string))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/filters (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/inventory-filter-list))
(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/max-results :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/next-token :portkey.aws.license-manager.-2018-08-01.list-resource-inventory-request/filters]))

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.license-manager.-2018-08-01/license-configurations (clojure.spec.alpha/coll-of :portkey.aws.license-manager.-2018-08-01/license-configuration))

(clojure.core/defn tag-resource "Attach one of more tags to any resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/tag-resource-response))

(clojure.core/defn list-resource-inventory "Returns a detailed list of resources." ([] (list-resource-inventory {})) ([list-resource-inventory-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-resource-inventory-request list-resource-inventory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourceInventory", :http.request.configuration/output-deser-fn response-list-resource-inventory-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "FilterLimitExceededException" :portkey.aws.license-manager.-2018-08-01/filter-limit-exceeded-exception, "FailedDependencyException" :portkey.aws.license-manager.-2018-08-01/failed-dependency-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-resource-inventory :args (clojure.spec.alpha/? :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-resource-inventory-response))

(clojure.core/defn update-license-configuration "Modifies the attributes of an existing license configuration object. A license\nconfiguration is an abstraction of a customer license agreement that can be\nconsumed and enforced by License Manager. Components include specifications for\nthe license type (Instances, cores, sockets, VCPUs), tenancy (shared or\nDedicated Host), host affinity (how long a VM is associated with a host), the\nnumber of licenses purchased and used." ([update-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-license-configuration-request update-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/update-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/update-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLicenseConfiguration", :http.request.configuration/output-deser-fn response-update-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/update-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/update-license-configuration-response))

(clojure.core/defn update-license-specifications-for-resource "Adds or removes license configurations for a specified AWS resource. This\noperation currently supports updating the license specifications of AMIs,\ninstances, and hosts. Launch templates and AWS CloudFormation templates are not\nmanaged from this operation as those resources send the license configurations\ndirectly to a resource creation operation, such as RunInstances." ([update-license-specifications-for-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-license-specifications-for-resource-request update-license-specifications-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLicenseSpecificationsForResource", :http.request.configuration/output-deser-fn response-update-license-specifications-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "InvalidResourceStateException" :portkey.aws.license-manager.-2018-08-01/invalid-resource-state-exception, "LicenseUsageException" :portkey.aws.license-manager.-2018-08-01/license-usage-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-license-specifications-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/update-license-specifications-for-resource-response))

(clojure.core/defn delete-license-configuration "Deletes an existing license configuration. This action fails if the\nconfiguration is in use." ([delete-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-license-configuration-request delete-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLicenseConfiguration", :http.request.configuration/output-deser-fn response-delete-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/delete-license-configuration-response))

(clojure.core/defn list-associations-for-license-configuration "Lists the resource associations for a license configuration. Resource\nassociations need not consume licenses from a license configuration. For\nexample, an AMI or a stopped instance may not consume a license (depending on\nthe license rules). Use this operation to find all resources associated with a\nlicense configuration." ([list-associations-for-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-associations-for-license-configuration-request list-associations-for-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAssociationsForLicenseConfiguration", :http.request.configuration/output-deser-fn response-list-associations-for-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "FilterLimitExceededException" :portkey.aws.license-manager.-2018-08-01/filter-limit-exceeded-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-associations-for-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-associations-for-license-configuration-response))

(clojure.core/defn list-license-configurations "Lists license configuration objects for an account, each containing the name,\ndescription, license type, and other license terms modeled from a license\nagreement." ([] (list-license-configurations {})) ([list-license-configurations-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-license-configurations-request list-license-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-license-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-license-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLicenseConfigurations", :http.request.configuration/output-deser-fn response-list-license-configurations-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "FilterLimitExceededException" :portkey.aws.license-manager.-2018-08-01/filter-limit-exceeded-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-license-configurations :args (clojure.spec.alpha/? :portkey.aws.license-manager.-2018-08-01/list-license-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-license-configurations-response))

(clojure.core/defn list-tags-for-resource "Lists tags attached to a resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-tags-for-resource-response))

(clojure.core/defn get-service-settings "Gets License Manager settings for a region. Exposes the configured S3 bucket,\nSNS topic, etc., for inspection." ([] (get-service-settings {})) ([get-service-settings-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-service-settings-request get-service-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/get-service-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/get-service-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetServiceSettings", :http.request.configuration/output-deser-fn response-get-service-settings-response, :http.request.spec/error-spec {"ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-service-settings :args (clojure.spec.alpha/? :portkey.aws.license-manager.-2018-08-01/get-service-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/get-service-settings-response))

(clojure.core/defn list-license-specifications-for-resource "Returns the license configuration for a resource." ([list-license-specifications-for-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-license-specifications-for-resource-request list-license-specifications-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLicenseSpecificationsForResource", :http.request.configuration/output-deser-fn response-list-license-specifications-for-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-license-specifications-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-license-specifications-for-resource-response))

(clojure.core/defn list-usage-for-license-configuration "Lists all license usage records for a license configuration, displaying license\nconsumption details by resource at a selected point in time. Use this action to\naudit the current license consumption for any license inventory and\nconfiguration." ([list-usage-for-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-usage-for-license-configuration-request list-usage-for-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsageForLicenseConfiguration", :http.request.configuration/output-deser-fn response-list-usage-for-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "FilterLimitExceededException" :portkey.aws.license-manager.-2018-08-01/filter-limit-exceeded-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-usage-for-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/list-usage-for-license-configuration-response))

(clojure.core/defn create-license-configuration "Creates a new license configuration object. A license configuration is an\nabstraction of a customer license agreement that can be consumed and enforced by\nLicense Manager. Components include specifications for the license type\n(licensing by instance, socket, CPU, or VCPU), tenancy (shared tenancy, Amazon\nEC2 Dedicated Instance, Amazon EC2 Dedicated Host, or any of these), host\naffinity (how long a VM must be associated with a host), the number of licenses\npurchased and used." ([create-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-license-configuration-request create-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/create-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/create-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLicenseConfiguration", :http.request.configuration/output-deser-fn response-create-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "ResourceLimitExceededException" :portkey.aws.license-manager.-2018-08-01/resource-limit-exceeded-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/create-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/create-license-configuration-response))

(clojure.core/defn untag-resource "Remove tags from a resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/untag-resource-response))

(clojure.core/defn update-service-settings "Updates License Manager service settings." ([] (update-service-settings {})) ([update-service-settings-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-service-settings-request update-service-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/update-service-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/update-service-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServiceSettings", :http.request.configuration/output-deser-fn response-update-service-settings-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-service-settings :args (clojure.spec.alpha/? :portkey.aws.license-manager.-2018-08-01/update-service-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/update-service-settings-response))

(clojure.core/defn get-license-configuration "Returns a detailed description of a license configuration." ([get-license-configuration-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-license-configuration-request get-license-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.license-manager.-2018-08-01/endpoints, :http.request.configuration/target-prefix "AWSLicenseManager", :http.request.spec/output-spec :portkey.aws.license-manager.-2018-08-01/get-license-configuration-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-01", :http.request.configuration/service-id "License Manager", :http.request.spec/input-spec :portkey.aws.license-manager.-2018-08-01/get-license-configuration-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLicenseConfiguration", :http.request.configuration/output-deser-fn response-get-license-configuration-response, :http.request.spec/error-spec {"InvalidParameterValueException" :portkey.aws.license-manager.-2018-08-01/invalid-parameter-value-exception, "ServerInternalException" :portkey.aws.license-manager.-2018-08-01/server-internal-exception, "AuthorizationException" :portkey.aws.license-manager.-2018-08-01/authorization-exception, "AccessDeniedException" :portkey.aws.license-manager.-2018-08-01/access-denied-exception, "RateLimitExceededException" :portkey.aws.license-manager.-2018-08-01/rate-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-license-configuration :args (clojure.spec.alpha/tuple :portkey.aws.license-manager.-2018-08-01/get-license-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.license-manager.-2018-08-01/get-license-configuration-response))
