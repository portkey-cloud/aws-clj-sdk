(ns portkey.aws.securityhub (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "securityhub", :region "ap-northeast-1"},
    :ssl-common-name "securityhub.ap-northeast-1.amazonaws.com",
    :endpoint "https://securityhub.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "securityhub", :region "eu-west-1"},
    :ssl-common-name "securityhub.eu-west-1.amazonaws.com",
    :endpoint "https://securityhub.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "securityhub", :region "us-east-2"},
    :ssl-common-name "securityhub.us-east-2.amazonaws.com",
    :endpoint "https://securityhub.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "securityhub", :region "ap-southeast-2"},
    :ssl-common-name "securityhub.ap-southeast-2.amazonaws.com",
    :endpoint "https://securityhub.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "securityhub", :region "sa-east-1"},
    :ssl-common-name "securityhub.sa-east-1.amazonaws.com",
    :endpoint "https://securityhub.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "securityhub", :region "ap-southeast-1"},
    :ssl-common-name "securityhub.ap-southeast-1.amazonaws.com",
    :endpoint "https://securityhub.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "securityhub", :region "ap-northeast-2"},
    :ssl-common-name "securityhub.ap-northeast-2.amazonaws.com",
    :endpoint "https://securityhub.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "securityhub", :region "eu-west-3"},
    :ssl-common-name "securityhub.eu-west-3.amazonaws.com",
    :endpoint "https://securityhub.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "securityhub", :region "ca-central-1"},
    :ssl-common-name "securityhub.ca-central-1.amazonaws.com",
    :endpoint "https://securityhub.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "securityhub", :region "eu-central-1"},
    :ssl-common-name "securityhub.eu-central-1.amazonaws.com",
    :endpoint "https://securityhub.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "securityhub", :region "eu-west-2"},
    :ssl-common-name "securityhub.eu-west-2.amazonaws.com",
    :endpoint "https://securityhub.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "securityhub", :region "us-west-2"},
    :ssl-common-name "securityhub.us-west-2.amazonaws.com",
    :endpoint "https://securityhub.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "securityhub", :region "us-east-1"},
    :ssl-common-name "securityhub.us-east-1.amazonaws.com",
    :endpoint "https://securityhub.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "securityhub", :region "us-west-1"},
    :ssl-common-name "securityhub.us-west-1.amazonaws.com",
    :endpoint "https://securityhub.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "securityhub", :region "ap-south-1"},
    :ssl-common-name "securityhub.ap-south-1.amazonaws.com",
    :endpoint "https://securityhub.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-number-filter-list)

(clojure.core/declare ser-standards-subscription-requests)

(clojure.core/declare ser-severity)

(clojure.core/declare ser-account-details-list)

(clojure.core/declare ser-standards-input-parameter-map)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-double)

(clojure.core/declare ser-record-state)

(clojure.core/declare ser-network-direction)

(clojure.core/declare ser-recommendation)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-remediation)

(clojure.core/declare ser-resource-details)

(clojure.core/declare ser-aws-iam-access-key-status)

(clojure.core/declare ser-account-id-list)

(clojure.core/declare ser-malware-state)

(clojure.core/declare ser-note)

(clojure.core/declare ser-threat-intel-indicator-category)

(clojure.core/declare ser-aws-iam-access-key-details)

(clojure.core/declare ser-date-range)

(clojure.core/declare ser-string-filter)

(clojure.core/declare ser-threat-intel-indicator-list)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-malware-type)

(clojure.core/declare ser-map-filter-comparison)

(clojure.core/declare ser-aws-ec-2-instance-details)

(clojure.core/declare ser-string-filter-list)

(clojure.core/declare ser-workflow-state)

(clojure.core/declare ser-container-details)

(clojure.core/declare ser-aws-s-3-bucket-details)

(clojure.core/declare ser-type-list)

(clojure.core/declare ser-malware-list)

(clojure.core/declare ser-aws-security-finding)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-string-filter-comparison)

(clojure.core/declare ser-map-filter)

(clojure.core/declare ser-standards-subscription-request)

(clojure.core/declare ser-verification-state)

(clojure.core/declare ser-compliance-status)

(clojure.core/declare ser-network)

(clojure.core/declare ser-process-details)

(clojure.core/declare ser-date-filter)

(clojure.core/declare ser-threat-intel-indicator-type)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-field-map)

(clojure.core/declare ser-date-range-unit)

(clojure.core/declare ser-date-filter-list)

(clojure.core/declare ser-partition)

(clojure.core/declare ser-resource-list)

(clojure.core/declare ser-compliance)

(clojure.core/declare ser-related-finding-list)

(clojure.core/declare ser-account-details)

(clojure.core/declare ser-keyword-filter)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-resource)

(clojure.core/declare ser-arn-list)

(clojure.core/declare ser-aws-security-finding-list)

(clojure.core/declare ser-related-finding)

(clojure.core/declare ser-map-filter-list)

(clojure.core/declare ser-ip-filter)

(clojure.core/declare ser-threat-intel-indicator)

(clojure.core/declare ser-malware)

(clojure.core/declare ser-sort-criteria)

(clojure.core/declare ser-sort-criterion)

(clojure.core/declare ser-standards-subscription-arns)

(clojure.core/declare ser-ip-filter-list)

(clojure.core/declare ser-keyword-filter-list)

(clojure.core/declare ser-aws-security-finding-filters)

(clojure.core/declare ser-note-update)

(clojure.core/declare ser-number-filter)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-number-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-number-filter coll) #:http.request.field{:shape "NumberFilter"}))) input), :shape "NumberFilterList", :type "list"})

(clojure.core/defn- ser-standards-subscription-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-standards-subscription-request coll) #:http.request.field{:shape "StandardsSubscriptionRequest"}))) input), :shape "StandardsSubscriptionRequests", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-severity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:normalized input)) #:http.request.field{:name "Normalized", :shape "Integer"})], :shape "Severity", :type "structure"} (clojure.core/contains? input :product) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :product)) #:http.request.field{:name "Product", :shape "Double"}))))

(clojure.core/defn- ser-account-details-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-details coll) #:http.request.field{:shape "AccountDetails"}))) input), :shape "AccountDetailsList", :type "list"})

(clojure.core/defn- ser-standards-input-parameter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-empty-string k) #:http.request.field{:map-info "key", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string v) #:http.request.field{:map-info "value", :shape "NonEmptyString"})])) input), :shape "StandardsInputParameterMap", :type "map"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-record-state [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "ARCHIVED" "ARCHIVED", :archived "ARCHIVED"} input), :shape "RecordState"})

(clojure.core/defn- ser-network-direction [input] #:http.request.field{:value (clojure.core/get {"IN" "IN", :in "IN", "OUT" "OUT", :out "OUT"} input), :shape "NetworkDirection"})

(clojure.core/defn- ser-recommendation [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Recommendation", :type "structure"} (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :text)) #:http.request.field{:name "Text", :shape "NonEmptyString"})) (clojure.core/contains? input :url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :url)) #:http.request.field{:name "Url", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-remediation [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Remediation", :type "structure"} (clojure.core/contains? input :recommendation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recommendation (input :recommendation)) #:http.request.field{:name "Recommendation", :shape "Recommendation"}))))

(clojure.core/defn- ser-resource-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceDetails", :type "structure"} (clojure.core/contains? input :aws-ec-2-instance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-ec-2-instance-details (input :aws-ec-2-instance)) #:http.request.field{:name "AwsEc2Instance", :shape "AwsEc2InstanceDetails"})) (clojure.core/contains? input :aws-s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-s-3-bucket-details (input :aws-s-3-bucket)) #:http.request.field{:name "AwsS3Bucket", :shape "AwsS3BucketDetails"})) (clojure.core/contains? input :aws-iam-access-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-iam-access-key-details (input :aws-iam-access-key)) #:http.request.field{:name "AwsIamAccessKey", :shape "AwsIamAccessKeyDetails"})) (clojure.core/contains? input :container) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-details (input :container)) #:http.request.field{:name "Container", :shape "ContainerDetails"})) (clojure.core/contains? input :other) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-map (input :other)) #:http.request.field{:name "Other", :shape "FieldMap"}))))

(clojure.core/defn- ser-aws-iam-access-key-status [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "Inactive" "Inactive", :inactive "Inactive"} input), :shape "AwsIamAccessKeyStatus"})

(clojure.core/defn- ser-account-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "AccountIdList", :type "list"})

(clojure.core/defn- ser-malware-state [input] #:http.request.field{:value (clojure.core/get {"OBSERVED" "OBSERVED", :observed "OBSERVED", "REMOVAL_FAILED" "REMOVAL_FAILED", :removal-failed "REMOVAL_FAILED", "REMOVED" "REMOVED", :removed "REMOVED"} input), :shape "MalwareState"})

(clojure.core/defn- ser-note [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:text input)) #:http.request.field{:name "Text", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:updated-by input)) #:http.request.field{:name "UpdatedBy", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:updated-at input)) #:http.request.field{:name "UpdatedAt", :shape "NonEmptyString"})], :shape "Note", :type "structure"}))

(clojure.core/defn- ser-threat-intel-indicator-category [input] #:http.request.field{:value (clojure.core/get {:drop-site "DROP_SITE", :backdoor "BACKDOOR", :card-stealer "CARD_STEALER", :exploit-site "EXPLOIT_SITE", "BACKDOOR" "BACKDOOR", "CARD_STEALER" "CARD_STEALER", "KEYLOGGER" "KEYLOGGER", :keylogger "KEYLOGGER", "DROP_SITE" "DROP_SITE", "EXPLOIT_SITE" "EXPLOIT_SITE", "COMMAND_AND_CONTROL" "COMMAND_AND_CONTROL", :command-and-control "COMMAND_AND_CONTROL"} input), :shape "ThreatIntelIndicatorCategory"})

(clojure.core/defn- ser-aws-iam-access-key-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsIamAccessKeyDetails", :type "structure"} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :user-name)) #:http.request.field{:name "UserName", :shape "NonEmptyString"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-iam-access-key-status (input :status)) #:http.request.field{:name "Status", :shape "AwsIamAccessKeyStatus"})) (clojure.core/contains? input :created-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :created-at)) #:http.request.field{:name "CreatedAt", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-date-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateRange", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :value)) #:http.request.field{:name "Value", :shape "Integer"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-range-unit (input :unit)) #:http.request.field{:name "Unit", :shape "DateRangeUnit"}))))

(clojure.core/defn- ser-string-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StringFilter", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :value)) #:http.request.field{:name "Value", :shape "NonEmptyString"})) (clojure.core/contains? input :comparison) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-comparison (input :comparison)) #:http.request.field{:name "Comparison", :shape "StringFilterComparison"}))))

(clojure.core/defn- ser-threat-intel-indicator-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-threat-intel-indicator coll) #:http.request.field{:shape "ThreatIntelIndicator"}))) input), :shape "ThreatIntelIndicatorList", :type "list"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"asc" "asc", :asc "asc", "desc" "desc", :desc "desc"} input), :shape "SortOrder"})

(clojure.core/defn- ser-malware-type [input] #:http.request.field{:value (clojure.core/get {"BOTNET_AGENT" "BOTNET_AGENT", :worm "WORM", :trojan "TROJAN", :adware "ADWARE", :rootkit "ROOTKIT", "TROJAN" "TROJAN", :exploit-kit "EXPLOIT_KIT", "REMOTE_ACCESS" "REMOTE_ACCESS", "EXPLOIT_KIT" "EXPLOIT_KIT", "COIN_MINER" "COIN_MINER", :coin-miner "COIN_MINER", "POTENTIALLY_UNWANTED" "POTENTIALLY_UNWANTED", :potentially-unwanted "POTENTIALLY_UNWANTED", "BLENDED_THREAT" "BLENDED_THREAT", "KEYLOGGER" "KEYLOGGER", "RANSOMWARE" "RANSOMWARE", :ransomware "RANSOMWARE", :botnet-agent "BOTNET_AGENT", :keylogger "KEYLOGGER", "WORM" "WORM", :macro "MACRO", "VIRUS" "VIRUS", :spyware "SPYWARE", :remote-access "REMOTE_ACCESS", "ADWARE" "ADWARE", :virus "VIRUS", "ROOTKIT" "ROOTKIT", "MACRO" "MACRO", :blended-threat "BLENDED_THREAT", "SPYWARE" "SPYWARE"} input), :shape "MalwareType"})

(clojure.core/defn- ser-map-filter-comparison [input] #:http.request.field{:value (clojure.core/get {"CONTAINS" "CONTAINS", :contains "CONTAINS"} input), :shape "MapFilterComparison"})

(clojure.core/defn- ser-aws-ec-2-instance-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsEc2InstanceDetails", :type "structure"} (clojure.core/contains? input :launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :launched-at)) #:http.request.field{:name "LaunchedAt", :shape "NonEmptyString"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :type)) #:http.request.field{:name "Type", :shape "NonEmptyString"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-id)) #:http.request.field{:name "ImageId", :shape "NonEmptyString"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "NonEmptyString"})) (clojure.core/contains? input :key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :key-name)) #:http.request.field{:name "KeyName", :shape "NonEmptyString"})) (clojure.core/contains? input :ip-v-4-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :ip-v-4-addresses)) #:http.request.field{:name "IpV4Addresses", :shape "StringList"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "NonEmptyString"})) (clojure.core/contains? input :iam-instance-profile-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :iam-instance-profile-arn)) #:http.request.field{:name "IamInstanceProfileArn", :shape "NonEmptyString"})) (clojure.core/contains? input :ip-v-6-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :ip-v-6-addresses)) #:http.request.field{:name "IpV6Addresses", :shape "StringList"}))))

(clojure.core/defn- ser-string-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-filter coll) #:http.request.field{:shape "StringFilter"}))) input), :shape "StringFilterList", :type "list"})

(clojure.core/defn- ser-workflow-state [input] #:http.request.field{:value (clojure.core/get {"DEFERRED" "DEFERRED", "IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "NEW" "NEW", :new "NEW", :assigned "ASSIGNED", "RESOLVED" "RESOLVED", :resolved "RESOLVED", :deferred "DEFERRED", "ASSIGNED" "ASSIGNED"} input), :shape "WorkflowState"})

(clojure.core/defn- ser-container-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerDetails", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "Name", :shape "NonEmptyString"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-id)) #:http.request.field{:name "ImageId", :shape "NonEmptyString"})) (clojure.core/contains? input :image-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :image-name)) #:http.request.field{:name "ImageName", :shape "NonEmptyString"})) (clojure.core/contains? input :launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :launched-at)) #:http.request.field{:name "LaunchedAt", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-aws-s-3-bucket-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsS3BucketDetails", :type "structure"} (clojure.core/contains? input :owner-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :owner-id)) #:http.request.field{:name "OwnerId", :shape "NonEmptyString"})) (clojure.core/contains? input :owner-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :owner-name)) #:http.request.field{:name "OwnerName", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "TypeList", :type "list"})

(clojure.core/defn- ser-malware-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-malware coll) #:http.request.field{:shape "Malware"}))) input), :shape "MalwareList", :type "list"})

(clojure.core/defn- ser-aws-security-finding [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:schema-version input)) #:http.request.field{:name "SchemaVersion", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:id input)) #:http.request.field{:name "Id", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:product-arn input)) #:http.request.field{:name "ProductArn", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:generator-id input)) #:http.request.field{:name "GeneratorId", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:aws-account-id input)) #:http.request.field{:name "AwsAccountId", :shape "NonEmptyString"}) (clojure.core/into (ser-type-list (:types input)) #:http.request.field{:name "Types", :shape "TypeList"}) (clojure.core/into (ser-non-empty-string (:created-at input)) #:http.request.field{:name "CreatedAt", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:updated-at input)) #:http.request.field{:name "UpdatedAt", :shape "NonEmptyString"}) (clojure.core/into (ser-severity (:severity input)) #:http.request.field{:name "Severity", :shape "Severity"}) (clojure.core/into (ser-resource-list (:resources input)) #:http.request.field{:name "Resources", :shape "ResourceList"})], :shape "AwsSecurityFinding", :type "structure"} (clojure.core/contains? input :record-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-state (input :record-state)) #:http.request.field{:name "RecordState", :shape "RecordState"})) (clojure.core/contains? input :remediation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remediation (input :remediation)) #:http.request.field{:name "Remediation", :shape "Remediation"})) (clojure.core/contains? input :note) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-note (input :note)) #:http.request.field{:name "Note", :shape "Note"})) (clojure.core/contains? input :last-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :last-observed-at)) #:http.request.field{:name "LastObservedAt", :shape "NonEmptyString"})) (clojure.core/contains? input :title) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :title)) #:http.request.field{:name "Title", :shape "NonEmptyString"})) (clojure.core/contains? input :product-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-map (input :product-fields)) #:http.request.field{:name "ProductFields", :shape "FieldMap"})) (clojure.core/contains? input :threat-intel-indicators) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threat-intel-indicator-list (input :threat-intel-indicators)) #:http.request.field{:name "ThreatIntelIndicators", :shape "ThreatIntelIndicatorList"})) (clojure.core/contains? input :criticality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :criticality)) #:http.request.field{:name "Criticality", :shape "Integer"})) (clojure.core/contains? input :workflow-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workflow-state (input :workflow-state)) #:http.request.field{:name "WorkflowState", :shape "WorkflowState"})) (clojure.core/contains? input :user-defined-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-map (input :user-defined-fields)) #:http.request.field{:name "UserDefinedFields", :shape "FieldMap"})) (clojure.core/contains? input :verification-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-verification-state (input :verification-state)) #:http.request.field{:name "VerificationState", :shape "VerificationState"})) (clojure.core/contains? input :first-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :first-observed-at)) #:http.request.field{:name "FirstObservedAt", :shape "NonEmptyString"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :description)) #:http.request.field{:name "Description", :shape "NonEmptyString"})) (clojure.core/contains? input :network) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network (input :network)) #:http.request.field{:name "Network", :shape "Network"})) (clojure.core/contains? input :compliance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance (input :compliance)) #:http.request.field{:name "Compliance", :shape "Compliance"})) (clojure.core/contains? input :related-findings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-related-finding-list (input :related-findings)) #:http.request.field{:name "RelatedFindings", :shape "RelatedFindingList"})) (clojure.core/contains? input :process) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-process-details (input :process)) #:http.request.field{:name "Process", :shape "ProcessDetails"})) (clojure.core/contains? input :source-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-url)) #:http.request.field{:name "SourceUrl", :shape "NonEmptyString"})) (clojure.core/contains? input :malware) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-malware-list (input :malware)) #:http.request.field{:name "Malware", :shape "MalwareList"})) (clojure.core/contains? input :confidence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :confidence)) #:http.request.field{:name "Confidence", :shape "Integer"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-string-filter-comparison [input] #:http.request.field{:value (clojure.core/get {"EQUALS" "EQUALS", :equals "EQUALS", "CONTAINS" "CONTAINS", :contains "CONTAINS", "PREFIX" "PREFIX", :prefix "PREFIX"} input), :shape "StringFilterComparison"})

(clojure.core/defn- ser-map-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MapFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :key)) #:http.request.field{:name "Key", :shape "NonEmptyString"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :value)) #:http.request.field{:name "Value", :shape "NonEmptyString"})) (clojure.core/contains? input :comparison) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-filter-comparison (input :comparison)) #:http.request.field{:name "Comparison", :shape "MapFilterComparison"}))))

(clojure.core/defn- ser-standards-subscription-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:standards-arn input)) #:http.request.field{:name "StandardsArn", :shape "NonEmptyString"})], :shape "StandardsSubscriptionRequest", :type "structure"} (clojure.core/contains? input :standards-input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standards-input-parameter-map (input :standards-input)) #:http.request.field{:name "StandardsInput", :shape "StandardsInputParameterMap"}))))

(clojure.core/defn- ser-verification-state [input] #:http.request.field{:value (clojure.core/get {"UNKNOWN" "UNKNOWN", :unknown "UNKNOWN", "TRUE_POSITIVE" "TRUE_POSITIVE", :true-positive "TRUE_POSITIVE", "FALSE_POSITIVE" "FALSE_POSITIVE", :false-positive "FALSE_POSITIVE", "BENIGN_POSITIVE" "BENIGN_POSITIVE", :benign-positive "BENIGN_POSITIVE"} input), :shape "VerificationState"})

(clojure.core/defn- ser-compliance-status [input] #:http.request.field{:value (clojure.core/get {"PASSED" "PASSED", :passed "PASSED", "WARNING" "WARNING", :warning "WARNING", "FAILED" "FAILED", :failed "FAILED", "NOT_AVAILABLE" "NOT_AVAILABLE", :not-available "NOT_AVAILABLE"} input), :shape "ComplianceStatus"})

(clojure.core/defn- ser-network [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Network", :type "structure"} (clojure.core/contains? input :direction) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-direction (input :direction)) #:http.request.field{:name "Direction", :shape "NetworkDirection"})) (clojure.core/contains? input :source-mac) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-mac)) #:http.request.field{:name "SourceMac", :shape "NonEmptyString"})) (clojure.core/contains? input :source-ip-v-6) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-ip-v-6)) #:http.request.field{:name "SourceIpV6", :shape "NonEmptyString"})) (clojure.core/contains? input :source-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :source-port)) #:http.request.field{:name "SourcePort", :shape "Integer"})) (clojure.core/contains? input :source-ip-v-4) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-ip-v-4)) #:http.request.field{:name "SourceIpV4", :shape "NonEmptyString"})) (clojure.core/contains? input :source-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-domain)) #:http.request.field{:name "SourceDomain", :shape "NonEmptyString"})) (clojure.core/contains? input :destination-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :destination-port)) #:http.request.field{:name "DestinationPort", :shape "Integer"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :protocol)) #:http.request.field{:name "Protocol", :shape "NonEmptyString"})) (clojure.core/contains? input :destination-ip-v-6) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :destination-ip-v-6)) #:http.request.field{:name "DestinationIpV6", :shape "NonEmptyString"})) (clojure.core/contains? input :destination-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :destination-domain)) #:http.request.field{:name "DestinationDomain", :shape "NonEmptyString"})) (clojure.core/contains? input :destination-ip-v-4) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :destination-ip-v-4)) #:http.request.field{:name "DestinationIpV4", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-process-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ProcessDetails", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "Name", :shape "NonEmptyString"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :path)) #:http.request.field{:name "Path", :shape "NonEmptyString"})) (clojure.core/contains? input :pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :pid)) #:http.request.field{:name "Pid", :shape "Integer"})) (clojure.core/contains? input :parent-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :parent-pid)) #:http.request.field{:name "ParentPid", :shape "Integer"})) (clojure.core/contains? input :launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :launched-at)) #:http.request.field{:name "LaunchedAt", :shape "NonEmptyString"})) (clojure.core/contains? input :terminated-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :terminated-at)) #:http.request.field{:name "TerminatedAt", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-date-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DateFilter", :type "structure"} (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :start)) #:http.request.field{:name "Start", :shape "NonEmptyString"})) (clojure.core/contains? input :end) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :end)) #:http.request.field{:name "End", :shape "NonEmptyString"})) (clojure.core/contains? input :date-range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-range (input :date-range)) #:http.request.field{:name "DateRange", :shape "DateRange"}))))

(clojure.core/defn- ser-threat-intel-indicator-type [input] #:http.request.field{:value (clojure.core/get {"URL" "URL", :ipv-4-address "IPV4_ADDRESS", :hash-md-5 "HASH_MD5", "EMAIL_ADDRESS" "EMAIL_ADDRESS", "IPV6_ADDRESS" "IPV6_ADDRESS", "PROCESS" "PROCESS", "HASH_SHA1" "HASH_SHA1", "HASH_MD5" "HASH_MD5", "MUTEX" "MUTEX", :process "PROCESS", "IPV4_ADDRESS" "IPV4_ADDRESS", :hash-sha-256 "HASH_SHA256", "HASH_SHA256" "HASH_SHA256", :url "URL", :mutex "MUTEX", :email-address "EMAIL_ADDRESS", :ipv-6-address "IPV6_ADDRESS", :domain "DOMAIN", :hash-sha-512 "HASH_SHA512", "DOMAIN" "DOMAIN", :hash-sha-1 "HASH_SHA1", "HASH_SHA512" "HASH_SHA512"} input), :shape "ThreatIntelIndicatorType"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-field-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-non-empty-string k) #:http.request.field{:map-info "key", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string v) #:http.request.field{:map-info "value", :shape "NonEmptyString"})])) input), :shape "FieldMap", :type "map"})

(clojure.core/defn- ser-date-range-unit [input] #:http.request.field{:value (clojure.core/get {"DAYS" "DAYS", :days "DAYS"} input), :shape "DateRangeUnit"})

(clojure.core/defn- ser-date-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-date-filter coll) #:http.request.field{:shape "DateFilter"}))) input), :shape "DateFilterList", :type "list"})

(clojure.core/defn- ser-partition [input] #:http.request.field{:value (clojure.core/get {"aws" "aws", :aws "aws", "aws-cn" "aws-cn", :awscn "aws-cn", "aws-us-gov" "aws-us-gov", :awsusgov "aws-us-gov"} input), :shape "Partition"})

(clojure.core/defn- ser-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource coll) #:http.request.field{:shape "Resource"}))) input), :shape "ResourceList", :type "list"})

(clojure.core/defn- ser-compliance [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Compliance", :type "structure"} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compliance-status (input :status)) #:http.request.field{:name "Status", :shape "ComplianceStatus"}))))

(clojure.core/defn- ser-related-finding-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-related-finding coll) #:http.request.field{:shape "RelatedFinding"}))) input), :shape "RelatedFindingList", :type "list"})

(clojure.core/defn- ser-account-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccountDetails", :type "structure"} (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :email) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :email)) #:http.request.field{:name "Email", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-keyword-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeywordFilter", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :value)) #:http.request.field{:name "Value", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:type input)) #:http.request.field{:name "Type", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:id input)) #:http.request.field{:name "Id", :shape "NonEmptyString"})], :shape "Resource", :type "structure"} (clojure.core/contains? input :partition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partition (input :partition)) #:http.request.field{:name "Partition", :shape "Partition"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :region)) #:http.request.field{:name "Region", :shape "NonEmptyString"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-map (input :tags)) #:http.request.field{:name "Tags", :shape "FieldMap"})) (clojure.core/contains? input :details) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-details (input :details)) #:http.request.field{:name "Details", :shape "ResourceDetails"}))))

(clojure.core/defn- ser-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "ArnList", :type "list"})

(clojure.core/defn- ser-aws-security-finding-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-aws-security-finding coll) #:http.request.field{:shape "AwsSecurityFinding"}))) input), :shape "AwsSecurityFindingList", :type "list"})

(clojure.core/defn- ser-related-finding [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:product-arn input)) #:http.request.field{:name "ProductArn", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:id input)) #:http.request.field{:name "Id", :shape "NonEmptyString"})], :shape "RelatedFinding", :type "structure"}))

(clojure.core/defn- ser-map-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-map-filter coll) #:http.request.field{:shape "MapFilter"}))) input), :shape "MapFilterList", :type "list"})

(clojure.core/defn- ser-ip-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpFilter", :type "structure"} (clojure.core/contains? input :cidr) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :cidr)) #:http.request.field{:name "Cidr", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-threat-intel-indicator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ThreatIntelIndicator", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threat-intel-indicator-type (input :type)) #:http.request.field{:name "Type", :shape "ThreatIntelIndicatorType"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :value)) #:http.request.field{:name "Value", :shape "NonEmptyString"})) (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threat-intel-indicator-category (input :category)) #:http.request.field{:name "Category", :shape "ThreatIntelIndicatorCategory"})) (clojure.core/contains? input :last-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :last-observed-at)) #:http.request.field{:name "LastObservedAt", :shape "NonEmptyString"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source)) #:http.request.field{:name "Source", :shape "NonEmptyString"})) (clojure.core/contains? input :source-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :source-url)) #:http.request.field{:name "SourceUrl", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-malware [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:name input)) #:http.request.field{:name "Name", :shape "NonEmptyString"})], :shape "Malware", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-malware-type (input :type)) #:http.request.field{:name "Type", :shape "MalwareType"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :path)) #:http.request.field{:name "Path", :shape "NonEmptyString"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-malware-state (input :state)) #:http.request.field{:name "State", :shape "MalwareState"}))))

(clojure.core/defn- ser-sort-criteria [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-sort-criterion coll) #:http.request.field{:shape "SortCriterion"}))) input), :shape "SortCriteria", :type "list"})

(clojure.core/defn- ser-sort-criterion [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SortCriterion", :type "structure"} (clojure.core/contains? input :field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :field)) #:http.request.field{:name "Field", :shape "NonEmptyString"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- ser-standards-subscription-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "StandardsSubscriptionArns", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-ip-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-filter coll) #:http.request.field{:shape "IpFilter"}))) input), :shape "IpFilterList", :type "list"})

(clojure.core/defn- ser-keyword-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-keyword-filter coll) #:http.request.field{:shape "KeywordFilter"}))) input), :shape "KeywordFilterList", :type "list"})

(clojure.core/defn- ser-aws-security-finding-filters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AwsSecurityFindingFilters", :type "structure"} (clojure.core/contains? input :resource-partition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-partition)) #:http.request.field{:name "ResourcePartition", :shape "StringFilterList"})) (clojure.core/contains? input :recommendation-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :recommendation-text)) #:http.request.field{:name "RecommendationText", :shape "StringFilterList"})) (clojure.core/contains? input :company-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :company-name)) #:http.request.field{:name "CompanyName", :shape "StringFilterList"})) (clojure.core/contains? input :threat-intel-indicator-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :threat-intel-indicator-source)) #:http.request.field{:name "ThreatIntelIndicatorSource", :shape "StringFilterList"})) (clojure.core/contains? input :malware-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :malware-path)) #:http.request.field{:name "MalwarePath", :shape "StringFilterList"})) (clojure.core/contains? input :record-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :record-state)) #:http.request.field{:name "RecordState", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-type)) #:http.request.field{:name "ResourceAwsEc2InstanceType", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-iam-access-key-user-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-iam-access-key-user-name)) #:http.request.field{:name "ResourceAwsIamAccessKeyUserName", :shape "StringFilterList"})) (clojure.core/contains? input :process-terminated-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :process-terminated-at)) #:http.request.field{:name "ProcessTerminatedAt", :shape "DateFilterList"})) (clojure.core/contains? input :network-direction) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :network-direction)) #:http.request.field{:name "NetworkDirection", :shape "StringFilterList"})) (clojure.core/contains? input :process-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :process-pid)) #:http.request.field{:name "ProcessPid", :shape "NumberFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-iam-instance-profile-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-iam-instance-profile-arn)) #:http.request.field{:name "ResourceAwsEc2InstanceIamInstanceProfileArn", :shape "StringFilterList"})) (clojure.core/contains? input :threat-intel-indicator-source-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :threat-intel-indicator-source-url)) #:http.request.field{:name "ThreatIntelIndicatorSourceUrl", :shape "StringFilterList"})) (clojure.core/contains? input :product-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :product-arn)) #:http.request.field{:name "ProductArn", :shape "StringFilterList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :type)) #:http.request.field{:name "Type", :shape "StringFilterList"})) (clojure.core/contains? input :note-text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :note-text)) #:http.request.field{:name "NoteText", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-vpc-id)) #:http.request.field{:name "ResourceAwsEc2InstanceVpcId", :shape "StringFilterList"})) (clojure.core/contains? input :malware-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :malware-state)) #:http.request.field{:name "MalwareState", :shape "StringFilterList"})) (clojure.core/contains? input :resource-container-launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :resource-container-launched-at)) #:http.request.field{:name "ResourceContainerLaunchedAt", :shape "DateFilterList"})) (clojure.core/contains? input :network-destination-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :network-destination-domain)) #:http.request.field{:name "NetworkDestinationDomain", :shape "StringFilterList"})) (clojure.core/contains? input :severity-normalized) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :severity-normalized)) #:http.request.field{:name "SeverityNormalized", :shape "NumberFilterList"})) (clojure.core/contains? input :threat-intel-indicator-category) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :threat-intel-indicator-category)) #:http.request.field{:name "ThreatIntelIndicatorCategory", :shape "StringFilterList"})) (clojure.core/contains? input :last-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :last-observed-at)) #:http.request.field{:name "LastObservedAt", :shape "DateFilterList"})) (clojure.core/contains? input :title) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :title)) #:http.request.field{:name "Title", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-image-id)) #:http.request.field{:name "ResourceAwsEc2InstanceImageId", :shape "StringFilterList"})) (clojure.core/contains? input :malware-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :malware-name)) #:http.request.field{:name "MalwareName", :shape "StringFilterList"})) (clojure.core/contains? input :resource-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-filter-list (input :resource-tags)) #:http.request.field{:name "ResourceTags", :shape "MapFilterList"})) (clojure.core/contains? input :product-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-filter-list (input :product-fields)) #:http.request.field{:name "ProductFields", :shape "MapFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-subnet-id)) #:http.request.field{:name "ResourceAwsEc2InstanceSubnetId", :shape "StringFilterList"})) (clojure.core/contains? input :network-destination-ip-v-4) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :network-destination-ip-v-4)) #:http.request.field{:name "NetworkDestinationIpV4", :shape "IpFilterList"})) (clojure.core/contains? input :malware-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :malware-type)) #:http.request.field{:name "MalwareType", :shape "StringFilterList"})) (clojure.core/contains? input :resource-container-image-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-container-image-name)) #:http.request.field{:name "ResourceContainerImageName", :shape "StringFilterList"})) (clojure.core/contains? input :criticality) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :criticality)) #:http.request.field{:name "Criticality", :shape "NumberFilterList"})) (clojure.core/contains? input :network-destination-ip-v-6) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :network-destination-ip-v-6)) #:http.request.field{:name "NetworkDestinationIpV6", :shape "IpFilterList"})) (clojure.core/contains? input :workflow-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :workflow-state)) #:http.request.field{:name "WorkflowState", :shape "StringFilterList"})) (clojure.core/contains? input :resource-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-region)) #:http.request.field{:name "ResourceRegion", :shape "StringFilterList"})) (clojure.core/contains? input :user-defined-fields) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-filter-list (input :user-defined-fields)) #:http.request.field{:name "UserDefinedFields", :shape "MapFilterList"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "StringFilterList"})) (clojure.core/contains? input :severity-product) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :severity-product)) #:http.request.field{:name "SeverityProduct", :shape "NumberFilterList"})) (clojure.core/contains? input :verification-state) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :verification-state)) #:http.request.field{:name "VerificationState", :shape "StringFilterList"})) (clojure.core/contains? input :note-updated-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :note-updated-at)) #:http.request.field{:name "NoteUpdatedAt", :shape "DateFilterList"})) (clojure.core/contains? input :network-source-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :network-source-port)) #:http.request.field{:name "NetworkSourcePort", :shape "NumberFilterList"})) (clojure.core/contains? input :compliance-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :compliance-status)) #:http.request.field{:name "ComplianceStatus", :shape "StringFilterList"})) (clojure.core/contains? input :first-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :first-observed-at)) #:http.request.field{:name "FirstObservedAt", :shape "DateFilterList"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :description)) #:http.request.field{:name "Description", :shape "StringFilterList"})) (clojure.core/contains? input :aws-account-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :aws-account-id)) #:http.request.field{:name "AwsAccountId", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-ip-v-4-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :resource-aws-ec-2-instance-ip-v-4-addresses)) #:http.request.field{:name "ResourceAwsEc2InstanceIpV4Addresses", :shape "IpFilterList"})) (clojure.core/contains? input :network-source-mac) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :network-source-mac)) #:http.request.field{:name "NetworkSourceMac", :shape "StringFilterList"})) (clojure.core/contains? input :threat-intel-indicator-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :threat-intel-indicator-type)) #:http.request.field{:name "ThreatIntelIndicatorType", :shape "StringFilterList"})) (clojure.core/contains? input :network-destination-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :network-destination-port)) #:http.request.field{:name "NetworkDestinationPort", :shape "NumberFilterList"})) (clojure.core/contains? input :keyword) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-keyword-filter-list (input :keyword)) #:http.request.field{:name "Keyword", :shape "KeywordFilterList"})) (clojure.core/contains? input :product-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :product-name)) #:http.request.field{:name "ProductName", :shape "StringFilterList"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "StringFilterList"})) (clojure.core/contains? input :threat-intel-indicator-last-observed-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :threat-intel-indicator-last-observed-at)) #:http.request.field{:name "ThreatIntelIndicatorLastObservedAt", :shape "DateFilterList"})) (clojure.core/contains? input :resource-container-image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-container-image-id)) #:http.request.field{:name "ResourceContainerImageId", :shape "StringFilterList"})) (clojure.core/contains? input :created-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :created-at)) #:http.request.field{:name "CreatedAt", :shape "DateFilterList"})) (clojure.core/contains? input :network-source-ip-v-4) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :network-source-ip-v-4)) #:http.request.field{:name "NetworkSourceIpV4", :shape "IpFilterList"})) (clojure.core/contains? input :resource-container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-container-name)) #:http.request.field{:name "ResourceContainerName", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-iam-access-key-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-iam-access-key-status)) #:http.request.field{:name "ResourceAwsIamAccessKeyStatus", :shape "StringFilterList"})) (clojure.core/contains? input :related-findings-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :related-findings-id)) #:http.request.field{:name "RelatedFindingsId", :shape "StringFilterList"})) (clojure.core/contains? input :process-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :process-name)) #:http.request.field{:name "ProcessName", :shape "StringFilterList"})) (clojure.core/contains? input :network-protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :network-protocol)) #:http.request.field{:name "NetworkProtocol", :shape "StringFilterList"})) (clojure.core/contains? input :related-findings-product-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :related-findings-product-arn)) #:http.request.field{:name "RelatedFindingsProductArn", :shape "StringFilterList"})) (clojure.core/contains? input :updated-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :updated-at)) #:http.request.field{:name "UpdatedAt", :shape "DateFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :resource-aws-ec-2-instance-launched-at)) #:http.request.field{:name "ResourceAwsEc2InstanceLaunchedAt", :shape "DateFilterList"})) (clojure.core/contains? input :source-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :source-url)) #:http.request.field{:name "SourceUrl", :shape "StringFilterList"})) (clojure.core/contains? input :threat-intel-indicator-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :threat-intel-indicator-value)) #:http.request.field{:name "ThreatIntelIndicatorValue", :shape "StringFilterList"})) (clojure.core/contains? input :network-source-domain) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :network-source-domain)) #:http.request.field{:name "NetworkSourceDomain", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-s-3-bucket-owner-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-s-3-bucket-owner-name)) #:http.request.field{:name "ResourceAwsS3BucketOwnerName", :shape "StringFilterList"})) (clojure.core/contains? input :process-launched-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :process-launched-at)) #:http.request.field{:name "ProcessLaunchedAt", :shape "DateFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-ip-v-6-addresses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :resource-aws-ec-2-instance-ip-v-6-addresses)) #:http.request.field{:name "ResourceAwsEc2InstanceIpV6Addresses", :shape "IpFilterList"})) (clojure.core/contains? input :severity-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :severity-label)) #:http.request.field{:name "SeverityLabel", :shape "StringFilterList"})) (clojure.core/contains? input :process-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :process-path)) #:http.request.field{:name "ProcessPath", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-iam-access-key-created-at) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date-filter-list (input :resource-aws-iam-access-key-created-at)) #:http.request.field{:name "ResourceAwsIamAccessKeyCreatedAt", :shape "DateFilterList"})) (clojure.core/contains? input :resource-details-other) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-filter-list (input :resource-details-other)) #:http.request.field{:name "ResourceDetailsOther", :shape "MapFilterList"})) (clojure.core/contains? input :resource-aws-s-3-bucket-owner-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-s-3-bucket-owner-id)) #:http.request.field{:name "ResourceAwsS3BucketOwnerId", :shape "StringFilterList"})) (clojure.core/contains? input :network-source-ip-v-6) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-filter-list (input :network-source-ip-v-6)) #:http.request.field{:name "NetworkSourceIpV6", :shape "IpFilterList"})) (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :id)) #:http.request.field{:name "Id", :shape "StringFilterList"})) (clojure.core/contains? input :process-parent-pid) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :process-parent-pid)) #:http.request.field{:name "ProcessParentPid", :shape "NumberFilterList"})) (clojure.core/contains? input :confidence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-filter-list (input :confidence)) #:http.request.field{:name "Confidence", :shape "NumberFilterList"})) (clojure.core/contains? input :note-updated-by) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :note-updated-by)) #:http.request.field{:name "NoteUpdatedBy", :shape "StringFilterList"})) (clojure.core/contains? input :resource-aws-ec-2-instance-key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :resource-aws-ec-2-instance-key-name)) #:http.request.field{:name "ResourceAwsEc2InstanceKeyName", :shape "StringFilterList"})) (clojure.core/contains? input :generator-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-filter-list (input :generator-id)) #:http.request.field{:name "GeneratorId", :shape "StringFilterList"}))))

(clojure.core/defn- ser-note-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:text input)) #:http.request.field{:name "Text", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (:updated-by input)) #:http.request.field{:name "UpdatedBy", :shape "NonEmptyString"})], :shape "NoteUpdate", :type "structure"}))

(clojure.core/defn- ser-number-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NumberFilter", :type "structure"} (clojure.core/contains? input :gte) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :gte)) #:http.request.field{:name "Gte", :shape "Double"})) (clojure.core/contains? input :lte) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :lte)) #:http.request.field{:name "Lte", :shape "Double"})) (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :eq)) #:http.request.field{:name "Eq", :shape "Double"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-disable-import-findings-for-product-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :product-subscription-arn)) #:http.request.field{:name "ProductSubscriptionArn", :shape "NonEmptyString", :location "uri", :location-name "ProductSubscriptionArn"})]}))

(clojure.core/defn- req-invite-members-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"}))))

(clojure.core/defn- req-enable-security-hub-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-batch-enable-standards-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-standards-subscription-requests (input :standards-subscription-requests)) #:http.request.field{:name "StandardsSubscriptionRequests", :shape "StandardsSubscriptionRequests"})]}))

(clojure.core/defn- req-delete-members-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"}))))

(clojure.core/defn- req-disassociate-from-master-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-insight-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :insight-arn)) #:http.request.field{:name "InsightArn", :shape "NonEmptyString", :location "uri", :location-name "InsightArn"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "Name", :shape "NonEmptyString"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-security-finding-filters (input :filters)) #:http.request.field{:name "Filters", :shape "AwsSecurityFindingFilters"})) (clojure.core/contains? input :group-by-attribute) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :group-by-attribute)) #:http.request.field{:name "GroupByAttribute", :shape "NonEmptyString"}))))

(clojure.core/defn- req-get-members-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"})]}))

(clojure.core/defn- req-get-enabled-standards-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :standards-subscription-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-standards-subscription-arns (input :standards-subscription-arns)) #:http.request.field{:name "StandardsSubscriptionArns", :shape "StandardsSubscriptionArns"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-master-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-insight-results-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :insight-arn)) #:http.request.field{:name "InsightArn", :shape "NonEmptyString", :location "uri", :location-name "InsightArn"})]}))

(clojure.core/defn- req-list-invitations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-update-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-security-finding-filters (input :filters)) #:http.request.field{:name "Filters", :shape "AwsSecurityFindingFilters"})]} (clojure.core/contains? input :note) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-note-update (input :note)) #:http.request.field{:name "Note", :shape "NoteUpdate"})) (clojure.core/contains? input :record-state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-state (input :record-state)) #:http.request.field{:name "RecordState", :shape "RecordState"}))))

(clojure.core/defn- req-get-insights-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :insight-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-list (input :insight-arns)) #:http.request.field{:name "InsightArns", :shape "ArnList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-insight-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :name)) #:http.request.field{:name "Name", :shape "NonEmptyString"}) (clojure.core/into (ser-aws-security-finding-filters (input :filters)) #:http.request.field{:name "Filters", :shape "AwsSecurityFindingFilters"}) (clojure.core/into (ser-non-empty-string (input :group-by-attribute)) #:http.request.field{:name "GroupByAttribute", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-enable-import-findings-for-product-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :product-arn)) #:http.request.field{:name "ProductArn", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-create-members-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-details-list (input :account-details)) #:http.request.field{:name "AccountDetails", :shape "AccountDetailsList"}))))

(clojure.core/defn- req-delete-invitations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"}))))

(clojure.core/defn- req-disassociate-members-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"}))))

(clojure.core/defn- req-list-enabled-products-for-import-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "MaxResults"}))))

(clojure.core/defn- req-get-invitations-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-disable-security-hub-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-decline-invitations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :account-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id-list (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIdList"}))))

(clojure.core/defn- req-delete-insight-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :insight-arn)) #:http.request.field{:name "InsightArn", :shape "NonEmptyString", :location "uri", :location-name "InsightArn"})]}))

(clojure.core/defn- req-batch-import-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-security-finding-list (input :findings)) #:http.request.field{:name "Findings", :shape "AwsSecurityFindingList"})]}))

(clojure.core/defn- req-accept-invitation-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :master-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :master-id)) #:http.request.field{:name "MasterId", :shape "NonEmptyString"})) (clojure.core/contains? input :invitation-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :invitation-id)) #:http.request.field{:name "InvitationId", :shape "NonEmptyString"}))))

(clojure.core/defn- req-list-members-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :only-associated) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :only-associated)) #:http.request.field{:name "OnlyAssociated", :shape "Boolean", :location "querystring", :location-name "OnlyAssociated"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location "querystring", :location-name "NextToken"}))))

(clojure.core/defn- req-get-findings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-security-finding-filters (input :filters)) #:http.request.field{:name "Filters", :shape "AwsSecurityFindingFilters"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-criteria (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortCriteria"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-batch-disable-standards-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-standards-subscription-arns (input :standards-subscription-arns)) #:http.request.field{:name "StandardsSubscriptionArns", :shape "StandardsSubscriptionArns"})]}))

(clojure.core/declare deser-number-filter-list)

(clojure.core/declare deser-severity)

(clojure.core/declare deser-standards-input-parameter-map)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-double)

(clojure.core/declare deser-record-state)

(clojure.core/declare deser-result-list)

(clojure.core/declare deser-network-direction)

(clojure.core/declare deser-recommendation)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-remediation)

(clojure.core/declare deser-resource-details)

(clojure.core/declare deser-aws-iam-access-key-status)

(clojure.core/declare deser-malware-state)

(clojure.core/declare deser-note)

(clojure.core/declare deser-threat-intel-indicator-category)

(clojure.core/declare deser-standards-subscription)

(clojure.core/declare deser-aws-iam-access-key-details)

(clojure.core/declare deser-date-range)

(clojure.core/declare deser-string-filter)

(clojure.core/declare deser-member)

(clojure.core/declare deser-invitation-list)

(clojure.core/declare deser-threat-intel-indicator-list)

(clojure.core/declare deser-result)

(clojure.core/declare deser-product-subscription-arn-list)

(clojure.core/declare deser-standards-status)

(clojure.core/declare deser-malware-type)

(clojure.core/declare deser-map-filter-comparison)

(clojure.core/declare deser-aws-ec-2-instance-details)

(clojure.core/declare deser-string-filter-list)

(clojure.core/declare deser-import-findings-error)

(clojure.core/declare deser-insight-results)

(clojure.core/declare deser-workflow-state)

(clojure.core/declare deser-container-details)

(clojure.core/declare deser-aws-s-3-bucket-details)

(clojure.core/declare deser-type-list)

(clojure.core/declare deser-malware-list)

(clojure.core/declare deser-aws-security-finding)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-string-filter-comparison)

(clojure.core/declare deser-import-findings-error-list)

(clojure.core/declare deser-map-filter)

(clojure.core/declare deser-verification-state)

(clojure.core/declare deser-compliance-status)

(clojure.core/declare deser-insight)

(clojure.core/declare deser-network)

(clojure.core/declare deser-process-details)

(clojure.core/declare deser-date-filter)

(clojure.core/declare deser-threat-intel-indicator-type)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-field-map)

(clojure.core/declare deser-date-range-unit)

(clojure.core/declare deser-date-filter-list)

(clojure.core/declare deser-partition)

(clojure.core/declare deser-resource-list)

(clojure.core/declare deser-compliance)

(clojure.core/declare deser-invitation)

(clojure.core/declare deser-related-finding-list)

(clojure.core/declare deser-insight-result-value)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-keyword-filter)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-standards-subscriptions)

(clojure.core/declare deser-aws-security-finding-list)

(clojure.core/declare deser-related-finding)

(clojure.core/declare deser-map-filter-list)

(clojure.core/declare deser-ip-filter)

(clojure.core/declare deser-threat-intel-indicator)

(clojure.core/declare deser-insight-list)

(clojure.core/declare deser-insight-result-value-list)

(clojure.core/declare deser-malware)

(clojure.core/declare deser-ip-filter-list)

(clojure.core/declare deser-keyword-filter-list)

(clojure.core/declare deser-aws-security-finding-filters)

(clojure.core/declare deser-number-filter)

(clojure.core/declare deser-member-list)

(clojure.core/defn- deser-number-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-number-filter coll))) input))

(clojure.core/defn- deser-severity [input] (clojure.core/cond-> {:normalized (deser-integer (input "Normalized"))} (clojure.core/contains? input "Product") (clojure.core/assoc :product (deser-double (input "Product")))))

(clojure.core/defn- deser-standards-input-parameter-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-non-empty-string k) (deser-non-empty-string v)])) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-record-state [input] (clojure.core/get {"ACTIVE" :active, "ARCHIVED" :archived} input))

(clojure.core/defn- deser-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-result coll))) input))

(clojure.core/defn- deser-network-direction [input] (clojure.core/get {"IN" :in, "OUT" :out} input))

(clojure.core/defn- deser-recommendation [input] (clojure.core/cond-> {} (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-non-empty-string (input "Text"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-non-empty-string (input "Url")))))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-remediation [input] (clojure.core/cond-> {} (clojure.core/contains? input "Recommendation") (clojure.core/assoc :recommendation (deser-recommendation (input "Recommendation")))))

(clojure.core/defn- deser-resource-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "AwsEc2Instance") (clojure.core/assoc :aws-ec-2-instance (deser-aws-ec-2-instance-details (input "AwsEc2Instance"))) (clojure.core/contains? input "AwsS3Bucket") (clojure.core/assoc :aws-s-3-bucket (deser-aws-s-3-bucket-details (input "AwsS3Bucket"))) (clojure.core/contains? input "AwsIamAccessKey") (clojure.core/assoc :aws-iam-access-key (deser-aws-iam-access-key-details (input "AwsIamAccessKey"))) (clojure.core/contains? input "Container") (clojure.core/assoc :container (deser-container-details (input "Container"))) (clojure.core/contains? input "Other") (clojure.core/assoc :other (deser-field-map (input "Other")))))

(clojure.core/defn- deser-aws-iam-access-key-status [input] (clojure.core/get {"Active" :active, "Inactive" :inactive} input))

(clojure.core/defn- deser-malware-state [input] (clojure.core/get {"OBSERVED" :observed, "REMOVAL_FAILED" :removal-failed, "REMOVED" :removed} input))

(clojure.core/defn- deser-note [input] (clojure.core/cond-> {:text (deser-non-empty-string (input "Text")), :updated-by (deser-non-empty-string (input "UpdatedBy")), :updated-at (deser-non-empty-string (input "UpdatedAt"))}))

(clojure.core/defn- deser-threat-intel-indicator-category [input] (clojure.core/get {"BACKDOOR" :backdoor, "CARD_STEALER" :card-stealer, "COMMAND_AND_CONTROL" :command-and-control, "DROP_SITE" :drop-site, "EXPLOIT_SITE" :exploit-site, "KEYLOGGER" :keylogger} input))

(clojure.core/defn- deser-standards-subscription [input] (clojure.core/cond-> {:standards-subscription-arn (deser-non-empty-string (input "StandardsSubscriptionArn")), :standards-arn (deser-non-empty-string (input "StandardsArn")), :standards-input (deser-standards-input-parameter-map (input "StandardsInput")), :standards-status (deser-standards-status (input "StandardsStatus"))}))

(clojure.core/defn- deser-aws-iam-access-key-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserName") (clojure.core/assoc :user-name (deser-non-empty-string (input "UserName"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-aws-iam-access-key-status (input "Status"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-non-empty-string (input "CreatedAt")))))

(clojure.core/defn- deser-date-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-integer (input "Value"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-date-range-unit (input "Unit")))))

(clojure.core/defn- deser-string-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-non-empty-string (input "Value"))) (clojure.core/contains? input "Comparison") (clojure.core/assoc :comparison (deser-string-filter-comparison (input "Comparison")))))

(clojure.core/defn- deser-member [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-account-id (input "AccountId"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-non-empty-string (input "Email"))) (clojure.core/contains? input "MasterId") (clojure.core/assoc :master-id (deser-non-empty-string (input "MasterId"))) (clojure.core/contains? input "MemberStatus") (clojure.core/assoc :member-status (deser-non-empty-string (input "MemberStatus"))) (clojure.core/contains? input "InvitedAt") (clojure.core/assoc :invited-at (deser-timestamp (input "InvitedAt"))) (clojure.core/contains? input "UpdatedAt") (clojure.core/assoc :updated-at (deser-timestamp (input "UpdatedAt")))))

(clojure.core/defn- deser-invitation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invitation coll))) input))

(clojure.core/defn- deser-threat-intel-indicator-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-threat-intel-indicator coll))) input))

(clojure.core/defn- deser-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-account-id (input "AccountId"))) (clojure.core/contains? input "ProcessingResult") (clojure.core/assoc :processing-result (deser-non-empty-string (input "ProcessingResult")))))

(clojure.core/defn- deser-product-subscription-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-standards-status [input] (clojure.core/get {"PENDING" :pending, "READY" :ready, "FAILED" :failed, "DELETING" :deleting} input))

(clojure.core/defn- deser-malware-type [input] (clojure.core/get {"BOTNET_AGENT" :botnet-agent, "TROJAN" :trojan, "REMOTE_ACCESS" :remote-access, "EXPLOIT_KIT" :exploit-kit, "COIN_MINER" :coin-miner, "POTENTIALLY_UNWANTED" :potentially-unwanted, "BLENDED_THREAT" :blended-threat, "KEYLOGGER" :keylogger, "RANSOMWARE" :ransomware, "WORM" :worm, "VIRUS" :virus, "ADWARE" :adware, "ROOTKIT" :rootkit, "MACRO" :macro, "SPYWARE" :spyware} input))

(clojure.core/defn- deser-map-filter-comparison [input] (clojure.core/get {"CONTAINS" :contains} input))

(clojure.core/defn- deser-aws-ec-2-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "LaunchedAt") (clojure.core/assoc :launched-at (deser-non-empty-string (input "LaunchedAt"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-non-empty-string (input "Type"))) (clojure.core/contains? input "ImageId") (clojure.core/assoc :image-id (deser-non-empty-string (input "ImageId"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-non-empty-string (input "SubnetId"))) (clojure.core/contains? input "KeyName") (clojure.core/assoc :key-name (deser-non-empty-string (input "KeyName"))) (clojure.core/contains? input "IpV4Addresses") (clojure.core/assoc :ip-v-4-addresses (deser-string-list (input "IpV4Addresses"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-non-empty-string (input "VpcId"))) (clojure.core/contains? input "IamInstanceProfileArn") (clojure.core/assoc :iam-instance-profile-arn (deser-non-empty-string (input "IamInstanceProfileArn"))) (clojure.core/contains? input "IpV6Addresses") (clojure.core/assoc :ip-v-6-addresses (deser-string-list (input "IpV6Addresses")))))

(clojure.core/defn- deser-string-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string-filter coll))) input))

(clojure.core/defn- deser-import-findings-error [input] (clojure.core/cond-> {:id (deser-non-empty-string (input "Id")), :error-code (deser-non-empty-string (input "ErrorCode")), :error-message (deser-non-empty-string (input "ErrorMessage"))}))

(clojure.core/defn- deser-insight-results [input] (clojure.core/cond-> {:insight-arn (deser-non-empty-string (input "InsightArn")), :group-by-attribute (deser-non-empty-string (input "GroupByAttribute")), :result-values (deser-insight-result-value-list (input "ResultValues"))}))

(clojure.core/defn- deser-workflow-state [input] (clojure.core/get {"NEW" :new, "ASSIGNED" :assigned, "IN_PROGRESS" :in-progress, "DEFERRED" :deferred, "RESOLVED" :resolved} input))

(clojure.core/defn- deser-container-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-empty-string (input "Name"))) (clojure.core/contains? input "ImageId") (clojure.core/assoc :image-id (deser-non-empty-string (input "ImageId"))) (clojure.core/contains? input "ImageName") (clojure.core/assoc :image-name (deser-non-empty-string (input "ImageName"))) (clojure.core/contains? input "LaunchedAt") (clojure.core/assoc :launched-at (deser-non-empty-string (input "LaunchedAt")))))

(clojure.core/defn- deser-aws-s-3-bucket-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "OwnerId") (clojure.core/assoc :owner-id (deser-non-empty-string (input "OwnerId"))) (clojure.core/contains? input "OwnerName") (clojure.core/assoc :owner-name (deser-non-empty-string (input "OwnerName")))))

(clojure.core/defn- deser-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-malware-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-malware coll))) input))

(clojure.core/defn- deser-aws-security-finding [input] (clojure.core/cond-> {:updated-at (deser-non-empty-string (input "UpdatedAt")), :schema-version (deser-non-empty-string (input "SchemaVersion")), :aws-account-id (deser-non-empty-string (input "AwsAccountId")), :types (deser-type-list (input "Types")), :product-arn (deser-non-empty-string (input "ProductArn")), :id (deser-non-empty-string (input "Id")), :severity (deser-severity (input "Severity")), :generator-id (deser-non-empty-string (input "GeneratorId")), :resources (deser-resource-list (input "Resources")), :created-at (deser-non-empty-string (input "CreatedAt"))} (clojure.core/contains? input "RecordState") (clojure.core/assoc :record-state (deser-record-state (input "RecordState"))) (clojure.core/contains? input "Remediation") (clojure.core/assoc :remediation (deser-remediation (input "Remediation"))) (clojure.core/contains? input "Note") (clojure.core/assoc :note (deser-note (input "Note"))) (clojure.core/contains? input "LastObservedAt") (clojure.core/assoc :last-observed-at (deser-non-empty-string (input "LastObservedAt"))) (clojure.core/contains? input "Title") (clojure.core/assoc :title (deser-non-empty-string (input "Title"))) (clojure.core/contains? input "ProductFields") (clojure.core/assoc :product-fields (deser-field-map (input "ProductFields"))) (clojure.core/contains? input "ThreatIntelIndicators") (clojure.core/assoc :threat-intel-indicators (deser-threat-intel-indicator-list (input "ThreatIntelIndicators"))) (clojure.core/contains? input "Criticality") (clojure.core/assoc :criticality (deser-integer (input "Criticality"))) (clojure.core/contains? input "WorkflowState") (clojure.core/assoc :workflow-state (deser-workflow-state (input "WorkflowState"))) (clojure.core/contains? input "UserDefinedFields") (clojure.core/assoc :user-defined-fields (deser-field-map (input "UserDefinedFields"))) (clojure.core/contains? input "VerificationState") (clojure.core/assoc :verification-state (deser-verification-state (input "VerificationState"))) (clojure.core/contains? input "FirstObservedAt") (clojure.core/assoc :first-observed-at (deser-non-empty-string (input "FirstObservedAt"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-non-empty-string (input "Description"))) (clojure.core/contains? input "Network") (clojure.core/assoc :network (deser-network (input "Network"))) (clojure.core/contains? input "Compliance") (clojure.core/assoc :compliance (deser-compliance (input "Compliance"))) (clojure.core/contains? input "RelatedFindings") (clojure.core/assoc :related-findings (deser-related-finding-list (input "RelatedFindings"))) (clojure.core/contains? input "Process") (clojure.core/assoc :process (deser-process-details (input "Process"))) (clojure.core/contains? input "SourceUrl") (clojure.core/assoc :source-url (deser-non-empty-string (input "SourceUrl"))) (clojure.core/contains? input "Malware") (clojure.core/assoc :malware (deser-malware-list (input "Malware"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-integer (input "Confidence")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-string-filter-comparison [input] (clojure.core/get {"EQUALS" :equals, "CONTAINS" :contains, "PREFIX" :prefix} input))

(clojure.core/defn- deser-import-findings-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-import-findings-error coll))) input))

(clojure.core/defn- deser-map-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-non-empty-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-non-empty-string (input "Value"))) (clojure.core/contains? input "Comparison") (clojure.core/assoc :comparison (deser-map-filter-comparison (input "Comparison")))))

(clojure.core/defn- deser-verification-state [input] (clojure.core/get {"UNKNOWN" :unknown, "TRUE_POSITIVE" :true-positive, "FALSE_POSITIVE" :false-positive, "BENIGN_POSITIVE" :benign-positive} input))

(clojure.core/defn- deser-compliance-status [input] (clojure.core/get {"PASSED" :passed, "WARNING" :warning, "FAILED" :failed, "NOT_AVAILABLE" :not-available} input))

(clojure.core/defn- deser-insight [input] (clojure.core/cond-> {:insight-arn (deser-non-empty-string (input "InsightArn")), :name (deser-non-empty-string (input "Name")), :filters (deser-aws-security-finding-filters (input "Filters")), :group-by-attribute (deser-non-empty-string (input "GroupByAttribute"))}))

(clojure.core/defn- deser-network [input] (clojure.core/cond-> {} (clojure.core/contains? input "Direction") (clojure.core/assoc :direction (deser-network-direction (input "Direction"))) (clojure.core/contains? input "SourceMac") (clojure.core/assoc :source-mac (deser-non-empty-string (input "SourceMac"))) (clojure.core/contains? input "SourceIpV6") (clojure.core/assoc :source-ip-v-6 (deser-non-empty-string (input "SourceIpV6"))) (clojure.core/contains? input "SourcePort") (clojure.core/assoc :source-port (deser-integer (input "SourcePort"))) (clojure.core/contains? input "SourceIpV4") (clojure.core/assoc :source-ip-v-4 (deser-non-empty-string (input "SourceIpV4"))) (clojure.core/contains? input "SourceDomain") (clojure.core/assoc :source-domain (deser-non-empty-string (input "SourceDomain"))) (clojure.core/contains? input "DestinationPort") (clojure.core/assoc :destination-port (deser-integer (input "DestinationPort"))) (clojure.core/contains? input "Protocol") (clojure.core/assoc :protocol (deser-non-empty-string (input "Protocol"))) (clojure.core/contains? input "DestinationIpV6") (clojure.core/assoc :destination-ip-v-6 (deser-non-empty-string (input "DestinationIpV6"))) (clojure.core/contains? input "DestinationDomain") (clojure.core/assoc :destination-domain (deser-non-empty-string (input "DestinationDomain"))) (clojure.core/contains? input "DestinationIpV4") (clojure.core/assoc :destination-ip-v-4 (deser-non-empty-string (input "DestinationIpV4")))))

(clojure.core/defn- deser-process-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-non-empty-string (input "Name"))) (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-non-empty-string (input "Path"))) (clojure.core/contains? input "Pid") (clojure.core/assoc :pid (deser-integer (input "Pid"))) (clojure.core/contains? input "ParentPid") (clojure.core/assoc :parent-pid (deser-integer (input "ParentPid"))) (clojure.core/contains? input "LaunchedAt") (clojure.core/assoc :launched-at (deser-non-empty-string (input "LaunchedAt"))) (clojure.core/contains? input "TerminatedAt") (clojure.core/assoc :terminated-at (deser-non-empty-string (input "TerminatedAt")))))

(clojure.core/defn- deser-date-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Start") (clojure.core/assoc :start (deser-non-empty-string (input "Start"))) (clojure.core/contains? input "End") (clojure.core/assoc :end (deser-non-empty-string (input "End"))) (clojure.core/contains? input "DateRange") (clojure.core/assoc :date-range (deser-date-range (input "DateRange")))))

(clojure.core/defn- deser-threat-intel-indicator-type [input] (clojure.core/get {"URL" :url, "EMAIL_ADDRESS" :email-address, "IPV6_ADDRESS" :ipv-6-address, "PROCESS" :process, "HASH_SHA1" :hash-sha-1, "HASH_MD5" :hash-md-5, "MUTEX" :mutex, "IPV4_ADDRESS" :ipv-4-address, "HASH_SHA256" :hash-sha-256, "DOMAIN" :domain, "HASH_SHA512" :hash-sha-512} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-field-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-non-empty-string k) (deser-non-empty-string v)])) input))

(clojure.core/defn- deser-date-range-unit [input] (clojure.core/get {"DAYS" :days} input))

(clojure.core/defn- deser-date-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-date-filter coll))) input))

(clojure.core/defn- deser-partition [input] (clojure.core/get {"aws" :aws, "aws-cn" :awscn, "aws-us-gov" :awsusgov} input))

(clojure.core/defn- deser-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-compliance [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-compliance-status (input "Status")))))

(clojure.core/defn- deser-invitation [input] (clojure.core/cond-> {} (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-account-id (input "AccountId"))) (clojure.core/contains? input "InvitationId") (clojure.core/assoc :invitation-id (deser-non-empty-string (input "InvitationId"))) (clojure.core/contains? input "InvitedAt") (clojure.core/assoc :invited-at (deser-timestamp (input "InvitedAt"))) (clojure.core/contains? input "MemberStatus") (clojure.core/assoc :member-status (deser-non-empty-string (input "MemberStatus")))))

(clojure.core/defn- deser-related-finding-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-related-finding coll))) input))

(clojure.core/defn- deser-insight-result-value [input] (clojure.core/cond-> {:group-by-attribute-value (deser-non-empty-string (input "GroupByAttributeValue")), :count (deser-integer (input "Count"))}))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-keyword-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-non-empty-string (input "Value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {:type (deser-non-empty-string (input "Type")), :id (deser-non-empty-string (input "Id"))} (clojure.core/contains? input "Partition") (clojure.core/assoc :partition (deser-partition (input "Partition"))) (clojure.core/contains? input "Region") (clojure.core/assoc :region (deser-non-empty-string (input "Region"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-field-map (input "Tags"))) (clojure.core/contains? input "Details") (clojure.core/assoc :details (deser-resource-details (input "Details")))))

(clojure.core/defn- deser-standards-subscriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-standards-subscription coll))) input))

(clojure.core/defn- deser-aws-security-finding-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-aws-security-finding coll))) input))

(clojure.core/defn- deser-related-finding [input] (clojure.core/cond-> {:product-arn (deser-non-empty-string (input "ProductArn")), :id (deser-non-empty-string (input "Id"))}))

(clojure.core/defn- deser-map-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-map-filter coll))) input))

(clojure.core/defn- deser-ip-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Cidr") (clojure.core/assoc :cidr (deser-non-empty-string (input "Cidr")))))

(clojure.core/defn- deser-threat-intel-indicator [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-threat-intel-indicator-type (input "Type"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-non-empty-string (input "Value"))) (clojure.core/contains? input "Category") (clojure.core/assoc :category (deser-threat-intel-indicator-category (input "Category"))) (clojure.core/contains? input "LastObservedAt") (clojure.core/assoc :last-observed-at (deser-non-empty-string (input "LastObservedAt"))) (clojure.core/contains? input "Source") (clojure.core/assoc :source (deser-non-empty-string (input "Source"))) (clojure.core/contains? input "SourceUrl") (clojure.core/assoc :source-url (deser-non-empty-string (input "SourceUrl")))))

(clojure.core/defn- deser-insight-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-insight coll))) input))

(clojure.core/defn- deser-insight-result-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-insight-result-value coll))) input))

(clojure.core/defn- deser-malware [input] (clojure.core/cond-> {:name (deser-non-empty-string (input "Name"))} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-malware-type (input "Type"))) (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-non-empty-string (input "Path"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-malware-state (input "State")))))

(clojure.core/defn- deser-ip-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-filter coll))) input))

(clojure.core/defn- deser-keyword-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-keyword-filter coll))) input))

(clojure.core/defn- deser-aws-security-finding-filters [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourcePartition") (clojure.core/assoc :resource-partition (deser-string-filter-list (input "ResourcePartition"))) (clojure.core/contains? input "RecommendationText") (clojure.core/assoc :recommendation-text (deser-string-filter-list (input "RecommendationText"))) (clojure.core/contains? input "CompanyName") (clojure.core/assoc :company-name (deser-string-filter-list (input "CompanyName"))) (clojure.core/contains? input "ThreatIntelIndicatorSource") (clojure.core/assoc :threat-intel-indicator-source (deser-string-filter-list (input "ThreatIntelIndicatorSource"))) (clojure.core/contains? input "MalwarePath") (clojure.core/assoc :malware-path (deser-string-filter-list (input "MalwarePath"))) (clojure.core/contains? input "RecordState") (clojure.core/assoc :record-state (deser-string-filter-list (input "RecordState"))) (clojure.core/contains? input "ResourceAwsEc2InstanceType") (clojure.core/assoc :resource-aws-ec-2-instance-type (deser-string-filter-list (input "ResourceAwsEc2InstanceType"))) (clojure.core/contains? input "ResourceAwsIamAccessKeyUserName") (clojure.core/assoc :resource-aws-iam-access-key-user-name (deser-string-filter-list (input "ResourceAwsIamAccessKeyUserName"))) (clojure.core/contains? input "ProcessTerminatedAt") (clojure.core/assoc :process-terminated-at (deser-date-filter-list (input "ProcessTerminatedAt"))) (clojure.core/contains? input "NetworkDirection") (clojure.core/assoc :network-direction (deser-string-filter-list (input "NetworkDirection"))) (clojure.core/contains? input "ProcessPid") (clojure.core/assoc :process-pid (deser-number-filter-list (input "ProcessPid"))) (clojure.core/contains? input "ResourceAwsEc2InstanceIamInstanceProfileArn") (clojure.core/assoc :resource-aws-ec-2-instance-iam-instance-profile-arn (deser-string-filter-list (input "ResourceAwsEc2InstanceIamInstanceProfileArn"))) (clojure.core/contains? input "ThreatIntelIndicatorSourceUrl") (clojure.core/assoc :threat-intel-indicator-source-url (deser-string-filter-list (input "ThreatIntelIndicatorSourceUrl"))) (clojure.core/contains? input "ProductArn") (clojure.core/assoc :product-arn (deser-string-filter-list (input "ProductArn"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-string-filter-list (input "Type"))) (clojure.core/contains? input "NoteText") (clojure.core/assoc :note-text (deser-string-filter-list (input "NoteText"))) (clojure.core/contains? input "ResourceAwsEc2InstanceVpcId") (clojure.core/assoc :resource-aws-ec-2-instance-vpc-id (deser-string-filter-list (input "ResourceAwsEc2InstanceVpcId"))) (clojure.core/contains? input "MalwareState") (clojure.core/assoc :malware-state (deser-string-filter-list (input "MalwareState"))) (clojure.core/contains? input "ResourceContainerLaunchedAt") (clojure.core/assoc :resource-container-launched-at (deser-date-filter-list (input "ResourceContainerLaunchedAt"))) (clojure.core/contains? input "NetworkDestinationDomain") (clojure.core/assoc :network-destination-domain (deser-string-filter-list (input "NetworkDestinationDomain"))) (clojure.core/contains? input "SeverityNormalized") (clojure.core/assoc :severity-normalized (deser-number-filter-list (input "SeverityNormalized"))) (clojure.core/contains? input "ThreatIntelIndicatorCategory") (clojure.core/assoc :threat-intel-indicator-category (deser-string-filter-list (input "ThreatIntelIndicatorCategory"))) (clojure.core/contains? input "LastObservedAt") (clojure.core/assoc :last-observed-at (deser-date-filter-list (input "LastObservedAt"))) (clojure.core/contains? input "Title") (clojure.core/assoc :title (deser-string-filter-list (input "Title"))) (clojure.core/contains? input "ResourceAwsEc2InstanceImageId") (clojure.core/assoc :resource-aws-ec-2-instance-image-id (deser-string-filter-list (input "ResourceAwsEc2InstanceImageId"))) (clojure.core/contains? input "MalwareName") (clojure.core/assoc :malware-name (deser-string-filter-list (input "MalwareName"))) (clojure.core/contains? input "ResourceTags") (clojure.core/assoc :resource-tags (deser-map-filter-list (input "ResourceTags"))) (clojure.core/contains? input "ProductFields") (clojure.core/assoc :product-fields (deser-map-filter-list (input "ProductFields"))) (clojure.core/contains? input "ResourceAwsEc2InstanceSubnetId") (clojure.core/assoc :resource-aws-ec-2-instance-subnet-id (deser-string-filter-list (input "ResourceAwsEc2InstanceSubnetId"))) (clojure.core/contains? input "NetworkDestinationIpV4") (clojure.core/assoc :network-destination-ip-v-4 (deser-ip-filter-list (input "NetworkDestinationIpV4"))) (clojure.core/contains? input "MalwareType") (clojure.core/assoc :malware-type (deser-string-filter-list (input "MalwareType"))) (clojure.core/contains? input "ResourceContainerImageName") (clojure.core/assoc :resource-container-image-name (deser-string-filter-list (input "ResourceContainerImageName"))) (clojure.core/contains? input "Criticality") (clojure.core/assoc :criticality (deser-number-filter-list (input "Criticality"))) (clojure.core/contains? input "NetworkDestinationIpV6") (clojure.core/assoc :network-destination-ip-v-6 (deser-ip-filter-list (input "NetworkDestinationIpV6"))) (clojure.core/contains? input "WorkflowState") (clojure.core/assoc :workflow-state (deser-string-filter-list (input "WorkflowState"))) (clojure.core/contains? input "ResourceRegion") (clojure.core/assoc :resource-region (deser-string-filter-list (input "ResourceRegion"))) (clojure.core/contains? input "UserDefinedFields") (clojure.core/assoc :user-defined-fields (deser-map-filter-list (input "UserDefinedFields"))) (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-string-filter-list (input "ResourceId"))) (clojure.core/contains? input "SeverityProduct") (clojure.core/assoc :severity-product (deser-number-filter-list (input "SeverityProduct"))) (clojure.core/contains? input "VerificationState") (clojure.core/assoc :verification-state (deser-string-filter-list (input "VerificationState"))) (clojure.core/contains? input "NoteUpdatedAt") (clojure.core/assoc :note-updated-at (deser-date-filter-list (input "NoteUpdatedAt"))) (clojure.core/contains? input "NetworkSourcePort") (clojure.core/assoc :network-source-port (deser-number-filter-list (input "NetworkSourcePort"))) (clojure.core/contains? input "ComplianceStatus") (clojure.core/assoc :compliance-status (deser-string-filter-list (input "ComplianceStatus"))) (clojure.core/contains? input "FirstObservedAt") (clojure.core/assoc :first-observed-at (deser-date-filter-list (input "FirstObservedAt"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string-filter-list (input "Description"))) (clojure.core/contains? input "AwsAccountId") (clojure.core/assoc :aws-account-id (deser-string-filter-list (input "AwsAccountId"))) (clojure.core/contains? input "ResourceAwsEc2InstanceIpV4Addresses") (clojure.core/assoc :resource-aws-ec-2-instance-ip-v-4-addresses (deser-ip-filter-list (input "ResourceAwsEc2InstanceIpV4Addresses"))) (clojure.core/contains? input "NetworkSourceMac") (clojure.core/assoc :network-source-mac (deser-string-filter-list (input "NetworkSourceMac"))) (clojure.core/contains? input "ThreatIntelIndicatorType") (clojure.core/assoc :threat-intel-indicator-type (deser-string-filter-list (input "ThreatIntelIndicatorType"))) (clojure.core/contains? input "NetworkDestinationPort") (clojure.core/assoc :network-destination-port (deser-number-filter-list (input "NetworkDestinationPort"))) (clojure.core/contains? input "Keyword") (clojure.core/assoc :keyword (deser-keyword-filter-list (input "Keyword"))) (clojure.core/contains? input "ProductName") (clojure.core/assoc :product-name (deser-string-filter-list (input "ProductName"))) (clojure.core/contains? input "ResourceType") (clojure.core/assoc :resource-type (deser-string-filter-list (input "ResourceType"))) (clojure.core/contains? input "ThreatIntelIndicatorLastObservedAt") (clojure.core/assoc :threat-intel-indicator-last-observed-at (deser-date-filter-list (input "ThreatIntelIndicatorLastObservedAt"))) (clojure.core/contains? input "ResourceContainerImageId") (clojure.core/assoc :resource-container-image-id (deser-string-filter-list (input "ResourceContainerImageId"))) (clojure.core/contains? input "CreatedAt") (clojure.core/assoc :created-at (deser-date-filter-list (input "CreatedAt"))) (clojure.core/contains? input "NetworkSourceIpV4") (clojure.core/assoc :network-source-ip-v-4 (deser-ip-filter-list (input "NetworkSourceIpV4"))) (clojure.core/contains? input "ResourceContainerName") (clojure.core/assoc :resource-container-name (deser-string-filter-list (input "ResourceContainerName"))) (clojure.core/contains? input "ResourceAwsIamAccessKeyStatus") (clojure.core/assoc :resource-aws-iam-access-key-status (deser-string-filter-list (input "ResourceAwsIamAccessKeyStatus"))) (clojure.core/contains? input "RelatedFindingsId") (clojure.core/assoc :related-findings-id (deser-string-filter-list (input "RelatedFindingsId"))) (clojure.core/contains? input "ProcessName") (clojure.core/assoc :process-name (deser-string-filter-list (input "ProcessName"))) (clojure.core/contains? input "NetworkProtocol") (clojure.core/assoc :network-protocol (deser-string-filter-list (input "NetworkProtocol"))) (clojure.core/contains? input "RelatedFindingsProductArn") (clojure.core/assoc :related-findings-product-arn (deser-string-filter-list (input "RelatedFindingsProductArn"))) (clojure.core/contains? input "UpdatedAt") (clojure.core/assoc :updated-at (deser-date-filter-list (input "UpdatedAt"))) (clojure.core/contains? input "ResourceAwsEc2InstanceLaunchedAt") (clojure.core/assoc :resource-aws-ec-2-instance-launched-at (deser-date-filter-list (input "ResourceAwsEc2InstanceLaunchedAt"))) (clojure.core/contains? input "SourceUrl") (clojure.core/assoc :source-url (deser-string-filter-list (input "SourceUrl"))) (clojure.core/contains? input "ThreatIntelIndicatorValue") (clojure.core/assoc :threat-intel-indicator-value (deser-string-filter-list (input "ThreatIntelIndicatorValue"))) (clojure.core/contains? input "NetworkSourceDomain") (clojure.core/assoc :network-source-domain (deser-string-filter-list (input "NetworkSourceDomain"))) (clojure.core/contains? input "ResourceAwsS3BucketOwnerName") (clojure.core/assoc :resource-aws-s-3-bucket-owner-name (deser-string-filter-list (input "ResourceAwsS3BucketOwnerName"))) (clojure.core/contains? input "ProcessLaunchedAt") (clojure.core/assoc :process-launched-at (deser-date-filter-list (input "ProcessLaunchedAt"))) (clojure.core/contains? input "ResourceAwsEc2InstanceIpV6Addresses") (clojure.core/assoc :resource-aws-ec-2-instance-ip-v-6-addresses (deser-ip-filter-list (input "ResourceAwsEc2InstanceIpV6Addresses"))) (clojure.core/contains? input "SeverityLabel") (clojure.core/assoc :severity-label (deser-string-filter-list (input "SeverityLabel"))) (clojure.core/contains? input "ProcessPath") (clojure.core/assoc :process-path (deser-string-filter-list (input "ProcessPath"))) (clojure.core/contains? input "ResourceAwsIamAccessKeyCreatedAt") (clojure.core/assoc :resource-aws-iam-access-key-created-at (deser-date-filter-list (input "ResourceAwsIamAccessKeyCreatedAt"))) (clojure.core/contains? input "ResourceDetailsOther") (clojure.core/assoc :resource-details-other (deser-map-filter-list (input "ResourceDetailsOther"))) (clojure.core/contains? input "ResourceAwsS3BucketOwnerId") (clojure.core/assoc :resource-aws-s-3-bucket-owner-id (deser-string-filter-list (input "ResourceAwsS3BucketOwnerId"))) (clojure.core/contains? input "NetworkSourceIpV6") (clojure.core/assoc :network-source-ip-v-6 (deser-ip-filter-list (input "NetworkSourceIpV6"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string-filter-list (input "Id"))) (clojure.core/contains? input "ProcessParentPid") (clojure.core/assoc :process-parent-pid (deser-number-filter-list (input "ProcessParentPid"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-number-filter-list (input "Confidence"))) (clojure.core/contains? input "NoteUpdatedBy") (clojure.core/assoc :note-updated-by (deser-string-filter-list (input "NoteUpdatedBy"))) (clojure.core/contains? input "ResourceAwsEc2InstanceKeyName") (clojure.core/assoc :resource-aws-ec-2-instance-key-name (deser-string-filter-list (input "ResourceAwsEc2InstanceKeyName"))) (clojure.core/contains? input "GeneratorId") (clojure.core/assoc :generator-id (deser-string-filter-list (input "GeneratorId")))))

(clojure.core/defn- deser-number-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Gte") (clojure.core/assoc :gte (deser-double (input "Gte"))) (clojure.core/contains? input "Lte") (clojure.core/assoc :lte (deser-double (input "Lte"))) (clojure.core/contains? input "Eq") (clojure.core/assoc :eq (deser-double (input "Eq")))))

(clojure.core/defn- deser-member-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-member coll))) input))

(clojure.core/defn- response-create-members-response ([input] (response-create-members-response nil input)) ([resultWrapper1693494 input] (clojure.core/let [rawinput1693493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693495 {"UnprocessedAccounts" (rawinput1693493 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693495 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693495 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-get-master-account-response ([input] (response-get-master-account-response nil input)) ([resultWrapper1693497 input] (clojure.core/let [rawinput1693496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693498 {"Master" (rawinput1693496 "Master")}] (clojure.core/cond-> {} (letvar1693498 "Master") (clojure.core/assoc :master (deser-invitation (clojure.core/get-in letvar1693498 ["Master"])))))))

(clojure.core/defn- response-delete-invitations-response ([input] (response-delete-invitations-response nil input)) ([resultWrapper1693500 input] (clojure.core/let [rawinput1693499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693501 {"UnprocessedAccounts" (rawinput1693499 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693501 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693501 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-disable-import-findings-for-product-response ([input] (response-disable-import-findings-for-product-response nil input)) ([resultWrapper1693503 input] (clojure.core/let [rawinput1693502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693504 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-decline-invitations-response ([input] (response-decline-invitations-response nil input)) ([resultWrapper1693506 input] (clojure.core/let [rawinput1693505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693507 {"UnprocessedAccounts" (rawinput1693505 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693507 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693507 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-disassociate-members-response ([input] (response-disassociate-members-response nil input)) ([resultWrapper1693509 input] (clojure.core/let [rawinput1693508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693510 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-from-master-account-response ([input] (response-disassociate-from-master-account-response nil input)) ([resultWrapper1693512 input] (clojure.core/let [rawinput1693511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693513 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-members-response ([input] (response-get-members-response nil input)) ([resultWrapper1693515 input] (clojure.core/let [rawinput1693514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693516 {"Members" (rawinput1693514 "Members"), "UnprocessedAccounts" (rawinput1693514 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693516 "Members") (clojure.core/assoc :members (deser-member-list (clojure.core/get-in letvar1693516 ["Members"]))) (letvar1693516 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693516 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-batch-enable-standards-response ([input] (response-batch-enable-standards-response nil input)) ([resultWrapper1693518 input] (clojure.core/let [rawinput1693517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693519 {"StandardsSubscriptions" (rawinput1693517 "StandardsSubscriptions")}] (clojure.core/cond-> {} (letvar1693519 "StandardsSubscriptions") (clojure.core/assoc :standards-subscriptions (deser-standards-subscriptions (clojure.core/get-in letvar1693519 ["StandardsSubscriptions"])))))))

(clojure.core/defn- response-get-enabled-standards-response ([input] (response-get-enabled-standards-response nil input)) ([resultWrapper1693521 input] (clojure.core/let [rawinput1693520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693522 {"StandardsSubscriptions" (rawinput1693520 "StandardsSubscriptions"), "NextToken" (rawinput1693520 "NextToken")}] (clojure.core/cond-> {} (letvar1693522 "StandardsSubscriptions") (clojure.core/assoc :standards-subscriptions (deser-standards-subscriptions (clojure.core/get-in letvar1693522 ["StandardsSubscriptions"]))) (letvar1693522 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1693522 ["NextToken"])))))))

(clojure.core/defn- response-get-insight-results-response ([input] (response-get-insight-results-response nil input)) ([resultWrapper1693524 input] (clojure.core/let [rawinput1693523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693525 {"InsightResults" (rawinput1693523 "InsightResults")}] (clojure.core/cond-> {:insight-results (deser-insight-results (clojure.core/get-in letvar1693525 ["InsightResults"]))}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1693527 input] (clojure.core/let [rawinput1693526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693528 {"Message" (rawinput1693526 "Message"), "Code" (rawinput1693526 "Code")}] (clojure.core/cond-> {} (letvar1693528 "Message") (clojure.core/assoc :message (deser-non-empty-string (clojure.core/get-in letvar1693528 ["Message"]))) (letvar1693528 "Code") (clojure.core/assoc :code (deser-non-empty-string (clojure.core/get-in letvar1693528 ["Code"])))))))

(clojure.core/defn- response-batch-import-findings-response ([input] (response-batch-import-findings-response nil input)) ([resultWrapper1693530 input] (clojure.core/let [rawinput1693529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693531 {"FailedCount" (rawinput1693529 "FailedCount"), "SuccessCount" (rawinput1693529 "SuccessCount"), "FailedFindings" (rawinput1693529 "FailedFindings")}] (clojure.core/cond-> {:failed-count (deser-integer (clojure.core/get-in letvar1693531 ["FailedCount"])), :success-count (deser-integer (clojure.core/get-in letvar1693531 ["SuccessCount"]))} (letvar1693531 "FailedFindings") (clojure.core/assoc :failed-findings (deser-import-findings-error-list (clojure.core/get-in letvar1693531 ["FailedFindings"])))))))

(clojure.core/defn- response-list-invitations-response ([input] (response-list-invitations-response nil input)) ([resultWrapper1693533 input] (clojure.core/let [rawinput1693532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693534 {"Invitations" (rawinput1693532 "Invitations"), "NextToken" (rawinput1693532 "NextToken")}] (clojure.core/cond-> {} (letvar1693534 "Invitations") (clojure.core/assoc :invitations (deser-invitation-list (clojure.core/get-in letvar1693534 ["Invitations"]))) (letvar1693534 "NextToken") (clojure.core/assoc :next-token (deser-non-empty-string (clojure.core/get-in letvar1693534 ["NextToken"])))))))

(clojure.core/defn- response-enable-import-findings-for-product-response ([input] (response-enable-import-findings-for-product-response nil input)) ([resultWrapper1693536 input] (clojure.core/let [rawinput1693535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693537 {"ProductSubscriptionArn" (rawinput1693535 "ProductSubscriptionArn")}] (clojure.core/cond-> {} (letvar1693537 "ProductSubscriptionArn") (clojure.core/assoc :product-subscription-arn (deser-non-empty-string (clojure.core/get-in letvar1693537 ["ProductSubscriptionArn"])))))))

(clojure.core/defn- response-batch-disable-standards-response ([input] (response-batch-disable-standards-response nil input)) ([resultWrapper1693539 input] (clojure.core/let [rawinput1693538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693540 {"StandardsSubscriptions" (rawinput1693538 "StandardsSubscriptions")}] (clojure.core/cond-> {} (letvar1693540 "StandardsSubscriptions") (clojure.core/assoc :standards-subscriptions (deser-standards-subscriptions (clojure.core/get-in letvar1693540 ["StandardsSubscriptions"])))))))

(clojure.core/defn- response-get-insights-response ([input] (response-get-insights-response nil input)) ([resultWrapper1693542 input] (clojure.core/let [rawinput1693541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693543 {"Insights" (rawinput1693541 "Insights"), "NextToken" (rawinput1693541 "NextToken")}] (clojure.core/cond-> {:insights (deser-insight-list (clojure.core/get-in letvar1693543 ["Insights"]))} (letvar1693543 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1693543 ["NextToken"])))))))

(clojure.core/defn- response-disable-security-hub-response ([input] (response-disable-security-hub-response nil input)) ([resultWrapper1693545 input] (clojure.core/let [rawinput1693544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693546 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-enable-security-hub-response ([input] (response-enable-security-hub-response nil input)) ([resultWrapper1693548 input] (clojure.core/let [rawinput1693547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693549 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-findings-response ([input] (response-update-findings-response nil input)) ([resultWrapper1693551 input] (clojure.core/let [rawinput1693550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693552 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1693554 input] (clojure.core/let [rawinput1693553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693555 {"Message" (rawinput1693553 "Message"), "Code" (rawinput1693553 "Code")}] (clojure.core/cond-> {} (letvar1693555 "Message") (clojure.core/assoc :message (deser-non-empty-string (clojure.core/get-in letvar1693555 ["Message"]))) (letvar1693555 "Code") (clojure.core/assoc :code (deser-non-empty-string (clojure.core/get-in letvar1693555 ["Code"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1693557 input] (clojure.core/let [rawinput1693556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693558 {"Message" (rawinput1693556 "Message"), "Code" (rawinput1693556 "Code")}] (clojure.core/cond-> {} (letvar1693558 "Message") (clojure.core/assoc :message (deser-non-empty-string (clojure.core/get-in letvar1693558 ["Message"]))) (letvar1693558 "Code") (clojure.core/assoc :code (deser-non-empty-string (clojure.core/get-in letvar1693558 ["Code"])))))))

(clojure.core/defn- response-internal-exception ([input] (response-internal-exception nil input)) ([resultWrapper1693560 input] (clojure.core/let [rawinput1693559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693561 {"Message" (rawinput1693559 "Message"), "Code" (rawinput1693559 "Code")}] (clojure.core/cond-> {} (letvar1693561 "Message") (clojure.core/assoc :message (deser-non-empty-string (clojure.core/get-in letvar1693561 ["Message"]))) (letvar1693561 "Code") (clojure.core/assoc :code (deser-non-empty-string (clojure.core/get-in letvar1693561 ["Code"])))))))

(clojure.core/defn- response-delete-insight-response ([input] (response-delete-insight-response nil input)) ([resultWrapper1693563 input] (clojure.core/let [rawinput1693562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693564 {"InsightArn" (rawinput1693562 "InsightArn")}] (clojure.core/cond-> {:insight-arn (deser-non-empty-string (clojure.core/get-in letvar1693564 ["InsightArn"]))}))))

(clojure.core/defn- response-list-enabled-products-for-import-response ([input] (response-list-enabled-products-for-import-response nil input)) ([resultWrapper1693566 input] (clojure.core/let [rawinput1693565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693567 {"ProductSubscriptions" (rawinput1693565 "ProductSubscriptions"), "NextToken" (rawinput1693565 "NextToken")}] (clojure.core/cond-> {} (letvar1693567 "ProductSubscriptions") (clojure.core/assoc :product-subscriptions (deser-product-subscription-arn-list (clojure.core/get-in letvar1693567 ["ProductSubscriptions"]))) (letvar1693567 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1693567 ["NextToken"])))))))

(clojure.core/defn- response-get-invitations-count-response ([input] (response-get-invitations-count-response nil input)) ([resultWrapper1693569 input] (clojure.core/let [rawinput1693568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693570 {"InvitationsCount" (rawinput1693568 "InvitationsCount")}] (clojure.core/cond-> {} (letvar1693570 "InvitationsCount") (clojure.core/assoc :invitations-count (deser-integer (clojure.core/get-in letvar1693570 ["InvitationsCount"])))))))

(clojure.core/defn- response-accept-invitation-response ([input] (response-accept-invitation-response nil input)) ([resultWrapper1693572 input] (clojure.core/let [rawinput1693571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693573 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-findings-response ([input] (response-get-findings-response nil input)) ([resultWrapper1693575 input] (clojure.core/let [rawinput1693574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693576 {"Findings" (rawinput1693574 "Findings"), "NextToken" (rawinput1693574 "NextToken")}] (clojure.core/cond-> {:findings (deser-aws-security-finding-list (clojure.core/get-in letvar1693576 ["Findings"]))} (letvar1693576 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1693576 ["NextToken"])))))))

(clojure.core/defn- response-delete-members-response ([input] (response-delete-members-response nil input)) ([resultWrapper1693578 input] (clojure.core/let [rawinput1693577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693579 {"UnprocessedAccounts" (rawinput1693577 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693579 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693579 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-invite-members-response ([input] (response-invite-members-response nil input)) ([resultWrapper1693581 input] (clojure.core/let [rawinput1693580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693582 {"UnprocessedAccounts" (rawinput1693580 "UnprocessedAccounts")}] (clojure.core/cond-> {} (letvar1693582 "UnprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-result-list (clojure.core/get-in letvar1693582 ["UnprocessedAccounts"])))))))

(clojure.core/defn- response-update-insight-response ([input] (response-update-insight-response nil input)) ([resultWrapper1693584 input] (clojure.core/let [rawinput1693583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693585 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-insight-response ([input] (response-create-insight-response nil input)) ([resultWrapper1693587 input] (clojure.core/let [rawinput1693586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693588 {"InsightArn" (rawinput1693586 "InsightArn")}] (clojure.core/cond-> {:insight-arn (deser-non-empty-string (clojure.core/get-in letvar1693588 ["InsightArn"]))}))))

(clojure.core/defn- response-list-members-response ([input] (response-list-members-response nil input)) ([resultWrapper1693590 input] (clojure.core/let [rawinput1693589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1693591 {"Members" (rawinput1693589 "Members"), "NextToken" (rawinput1693589 "NextToken")}] (clojure.core/cond-> {} (letvar1693591 "Members") (clojure.core/assoc :members (deser-member-list (clojure.core/get-in letvar1693591 ["Members"]))) (letvar1693591 "NextToken") (clojure.core/assoc :next-token (deser-non-empty-string (clojure.core/get-in letvar1693591 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.securityhub.create-members-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/create-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.create-members-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub/number-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/number-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub/standards-subscription-requests (clojure.spec.alpha/coll-of :portkey.aws.securityhub/standards-subscription-request :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.securityhub.severity/product (clojure.spec.alpha/and :portkey.aws.securityhub/double))
(clojure.spec.alpha/def :portkey.aws.securityhub.severity/normalized (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub/severity (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.severity/normalized] :opt-un [:portkey.aws.securityhub.severity/product]))

(clojure.spec.alpha/def :portkey.aws.securityhub/account-details-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/account-details))

(clojure.spec.alpha/def :portkey.aws.securityhub/standards-input-parameter-map (clojure.spec.alpha/map-of :portkey.aws.securityhub/non-empty-string :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub/string-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-master-account-response/master (clojure.spec.alpha/and :portkey.aws.securityhub/invitation))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-master-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.get-master-account-response/master]))

(clojure.spec.alpha/def :portkey.aws.securityhub/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.securityhub.disable-import-findings-for-product-request/product-subscription-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/disable-import-findings-for-product-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.disable-import-findings-for-product-request/product-subscription-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.invite-members-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/invite-members-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.invite-members-request/account-ids]))

(clojure.spec.alpha/def :portkey.aws.securityhub/enable-security-hub-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/batch-enable-standards-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub/standards-subscription-requests] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/record-state #{:archived "ARCHIVED" :active "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-invitations-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.delete-invitations-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub/result-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/result))

(clojure.spec.alpha/def :portkey.aws.securityhub/disable-import-findings-for-product-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-members-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-members-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.delete-members-request/account-ids]))

(clojure.spec.alpha/def :portkey.aws.securityhub/network-direction #{:out "OUT" "IN" :in})

(clojure.spec.alpha/def :portkey.aws.securityhub.recommendation/text (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.recommendation/url (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/recommendation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.recommendation/text :portkey.aws.securityhub.recommendation/url]))

(clojure.spec.alpha/def :portkey.aws.securityhub/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #".*\S.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.securityhub/remediation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/recommendation]))

(clojure.spec.alpha/def :portkey.aws.securityhub.decline-invitations-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/decline-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.decline-invitations-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub/disassociate-members-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.resource-details/aws-ec-2-instance (clojure.spec.alpha/and :portkey.aws.securityhub/aws-ec-2-instance-details))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource-details/aws-s-3-bucket (clojure.spec.alpha/and :portkey.aws.securityhub/aws-s-3-bucket-details))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource-details/aws-iam-access-key (clojure.spec.alpha/and :portkey.aws.securityhub/aws-iam-access-key-details))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource-details/container (clojure.spec.alpha/and :portkey.aws.securityhub/container-details))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource-details/other (clojure.spec.alpha/and :portkey.aws.securityhub/field-map))
(clojure.spec.alpha/def :portkey.aws.securityhub/resource-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.resource-details/aws-ec-2-instance :portkey.aws.securityhub.resource-details/aws-s-3-bucket :portkey.aws.securityhub.resource-details/aws-iam-access-key :portkey.aws.securityhub.resource-details/container :portkey.aws.securityhub.resource-details/other]))

(clojure.spec.alpha/def :portkey.aws.securityhub/disassociate-from-master-account-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/aws-iam-access-key-status #{:inactive "Active" "Inactive" :active})

(clojure.spec.alpha/def :portkey.aws.securityhub/account-id-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub/malware-state #{:removal-failed "OBSERVED" "REMOVED" "REMOVAL_FAILED" :observed :removed})

(clojure.spec.alpha/def :portkey.aws.securityhub.note/text (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.note/updated-by (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.note/updated-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/note (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.note/text :portkey.aws.securityhub.note/updated-by :portkey.aws.securityhub.note/updated-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/threat-intel-indicator-category #{:drop-site :backdoor :card-stealer :exploit-site "BACKDOOR" "CARD_STEALER" "KEYLOGGER" :keylogger "DROP_SITE" "EXPLOIT_SITE" "COMMAND_AND_CONTROL" :command-and-control})

(clojure.spec.alpha/def :portkey.aws.securityhub/disassociate-from-master-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.standards-subscription/standards-subscription-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.standards-subscription/standards-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.standards-subscription/standards-input (clojure.spec.alpha/and :portkey.aws.securityhub/standards-input-parameter-map))
(clojure.spec.alpha/def :portkey.aws.securityhub/standards-subscription (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.standards-subscription/standards-subscription-arn :portkey.aws.securityhub.standards-subscription/standards-arn :portkey.aws.securityhub.standards-subscription/standards-input :portkey.aws.securityhub/standards-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.aws-iam-access-key-details/user-name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-iam-access-key-details/status (clojure.spec.alpha/and :portkey.aws.securityhub/aws-iam-access-key-status))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-iam-access-key-details/created-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/aws-iam-access-key-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.aws-iam-access-key-details/user-name :portkey.aws.securityhub.aws-iam-access-key-details/status :portkey.aws.securityhub.aws-iam-access-key-details/created-at]))

(clojure.spec.alpha/def :portkey.aws.securityhub.date-range/value (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.date-range/unit (clojure.spec.alpha/and :portkey.aws.securityhub/date-range-unit))
(clojure.spec.alpha/def :portkey.aws.securityhub/date-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.date-range/value :portkey.aws.securityhub.date-range/unit]))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-members-response/members (clojure.spec.alpha/and :portkey.aws.securityhub/member-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.get-members-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.get-members-response/members :portkey.aws.securityhub.get-members-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub.string-filter/value (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.string-filter/comparison (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-comparison))
(clojure.spec.alpha/def :portkey.aws.securityhub/string-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.string-filter/value :portkey.aws.securityhub.string-filter/comparison]))

(clojure.spec.alpha/def :portkey.aws.securityhub.member/email (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.member/master-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.member/member-status (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.member/invited-at (clojure.spec.alpha/and :portkey.aws.securityhub/timestamp))
(clojure.spec.alpha/def :portkey.aws.securityhub.member/updated-at (clojure.spec.alpha/and :portkey.aws.securityhub/timestamp))
(clojure.spec.alpha/def :portkey.aws.securityhub/member (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/account-id :portkey.aws.securityhub.member/email :portkey.aws.securityhub.member/master-id :portkey.aws.securityhub.member/member-status :portkey.aws.securityhub.member/invited-at :portkey.aws.securityhub.member/updated-at]))

(clojure.spec.alpha/def :portkey.aws.securityhub/batch-enable-standards-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/standards-subscriptions]))

(clojure.spec.alpha/def :portkey.aws.securityhub/invitation-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/invitation))

(clojure.spec.alpha/def :portkey.aws.securityhub.update-insight-request/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.update-insight-request/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.update-insight-request/filters (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-filters))
(clojure.spec.alpha/def :portkey.aws.securityhub.update-insight-request/group-by-attribute (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/update-insight-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.update-insight-request/insight-arn] :opt-un [:portkey.aws.securityhub.update-insight-request/name :portkey.aws.securityhub.update-insight-request/filters :portkey.aws.securityhub.update-insight-request/group-by-attribute]))

(clojure.spec.alpha/def :portkey.aws.securityhub/get-enabled-standards-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/standards-subscriptions :portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub/threat-intel-indicator-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/threat-intel-indicator))

(clojure.spec.alpha/def :portkey.aws.securityhub/sort-order #{:desc :asc "desc" "asc"})

(clojure.spec.alpha/def :portkey.aws.securityhub.result/processing-result (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/account-id :portkey.aws.securityhub.result/processing-result]))

(clojure.spec.alpha/def :portkey.aws.securityhub/product-subscription-arn-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub/get-insight-results-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub/insight-results] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/standards-status #{:ready :pending "READY" "PENDING" :deleting "DELETING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.securityhub.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.limit-exceeded-exception/message :portkey.aws.securityhub.limit-exceeded-exception/code]))

(clojure.spec.alpha/def :portkey.aws.securityhub/malware-type #{"BOTNET_AGENT" :worm :trojan :adware :rootkit "TROJAN" :exploit-kit "REMOTE_ACCESS" "EXPLOIT_KIT" "COIN_MINER" :coin-miner "POTENTIALLY_UNWANTED" :potentially-unwanted "BLENDED_THREAT" "KEYLOGGER" "RANSOMWARE" :ransomware :botnet-agent :keylogger "WORM" :macro "VIRUS" :spyware :remote-access "ADWARE" :virus "ROOTKIT" "MACRO" :blended-threat "SPYWARE"})

(clojure.spec.alpha/def :portkey.aws.securityhub/map-filter-comparison #{:contains "CONTAINS"})

(clojure.spec.alpha/def :portkey.aws.securityhub.batch-import-findings-response/failed-count (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.batch-import-findings-response/success-count (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.batch-import-findings-response/failed-findings (clojure.spec.alpha/and :portkey.aws.securityhub/import-findings-error-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/batch-import-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.batch-import-findings-response/failed-count :portkey.aws.securityhub.batch-import-findings-response/success-count] :opt-un [:portkey.aws.securityhub.batch-import-findings-response/failed-findings]))

(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/type (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/image-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/subnet-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/key-name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/ip-v-4-addresses (clojure.spec.alpha/and :portkey.aws.securityhub/string-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/vpc-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/iam-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-ec-2-instance-details/ip-v-6-addresses (clojure.spec.alpha/and :portkey.aws.securityhub/string-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/aws-ec-2-instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.aws-ec-2-instance-details/launched-at :portkey.aws.securityhub.aws-ec-2-instance-details/type :portkey.aws.securityhub.aws-ec-2-instance-details/image-id :portkey.aws.securityhub.aws-ec-2-instance-details/subnet-id :portkey.aws.securityhub.aws-ec-2-instance-details/key-name :portkey.aws.securityhub.aws-ec-2-instance-details/ip-v-4-addresses :portkey.aws.securityhub.aws-ec-2-instance-details/vpc-id :portkey.aws.securityhub.aws-ec-2-instance-details/iam-instance-profile-arn :portkey.aws.securityhub.aws-ec-2-instance-details/ip-v-6-addresses]))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-members-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.get-members-request/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/string-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/string-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub.import-findings-error/id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.import-findings-error/error-code (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.import-findings-error/error-message (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/import-findings-error (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.import-findings-error/id :portkey.aws.securityhub.import-findings-error/error-code :portkey.aws.securityhub.import-findings-error/error-message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.insight-results/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight-results/group-by-attribute (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight-results/result-values (clojure.spec.alpha/and :portkey.aws.securityhub/insight-result-value-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/insight-results (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.insight-results/insight-arn :portkey.aws.securityhub.insight-results/group-by-attribute :portkey.aws.securityhub.insight-results/result-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/workflow-state #{"DEFERRED" "IN_PROGRESS" :in-progress "NEW" :new :assigned "RESOLVED" :resolved :deferred "ASSIGNED"})

(clojure.spec.alpha/def :portkey.aws.securityhub.container-details/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.container-details/image-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.container-details/image-name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.container-details/launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/container-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.container-details/name :portkey.aws.securityhub.container-details/image-id :portkey.aws.securityhub.container-details/image-name :portkey.aws.securityhub.container-details/launched-at]))

(clojure.spec.alpha/def :portkey.aws.securityhub.list-invitations-response/invitations (clojure.spec.alpha/and :portkey.aws.securityhub/invitation-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.list-invitations-response/next-token (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/list-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.list-invitations-response/invitations :portkey.aws.securityhub.list-invitations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub.aws-s-3-bucket-details/owner-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-s-3-bucket-details/owner-name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/aws-s-3-bucket-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.aws-s-3-bucket-details/owner-id :portkey.aws.securityhub.aws-s-3-bucket-details/owner-name]))

(clojure.spec.alpha/def :portkey.aws.securityhub/type-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub/malware-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/malware))

(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/schema-version (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/product-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/last-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/title (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/product-fields (clojure.spec.alpha/and :portkey.aws.securityhub/field-map))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/threat-intel-indicators (clojure.spec.alpha/and :portkey.aws.securityhub/threat-intel-indicator-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/criticality (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/user-defined-fields (clojure.spec.alpha/and :portkey.aws.securityhub/field-map))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/first-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/description (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/aws-account-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/resources (clojure.spec.alpha/and :portkey.aws.securityhub/resource-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/created-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/related-findings (clojure.spec.alpha/and :portkey.aws.securityhub/related-finding-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/process (clojure.spec.alpha/and :portkey.aws.securityhub/process-details))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/types (clojure.spec.alpha/and :portkey.aws.securityhub/type-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/updated-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/source-url (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/malware (clojure.spec.alpha/and :portkey.aws.securityhub/malware-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/confidence (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding/generator-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/aws-security-finding (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.aws-security-finding/schema-version :portkey.aws.securityhub.aws-security-finding/id :portkey.aws.securityhub.aws-security-finding/product-arn :portkey.aws.securityhub.aws-security-finding/generator-id :portkey.aws.securityhub.aws-security-finding/aws-account-id :portkey.aws.securityhub.aws-security-finding/types :portkey.aws.securityhub.aws-security-finding/created-at :portkey.aws.securityhub.aws-security-finding/updated-at :portkey.aws.securityhub/severity :portkey.aws.securityhub.aws-security-finding/resources] :opt-un [:portkey.aws.securityhub/record-state :portkey.aws.securityhub/remediation :portkey.aws.securityhub/note :portkey.aws.securityhub.aws-security-finding/last-observed-at :portkey.aws.securityhub.aws-security-finding/title :portkey.aws.securityhub.aws-security-finding/product-fields :portkey.aws.securityhub.aws-security-finding/threat-intel-indicators :portkey.aws.securityhub.aws-security-finding/criticality :portkey.aws.securityhub/workflow-state :portkey.aws.securityhub.aws-security-finding/user-defined-fields :portkey.aws.securityhub/verification-state :portkey.aws.securityhub.aws-security-finding/first-observed-at :portkey.aws.securityhub.aws-security-finding/description :portkey.aws.securityhub/network :portkey.aws.securityhub/compliance :portkey.aws.securityhub.aws-security-finding/related-findings :portkey.aws.securityhub.aws-security-finding/process :portkey.aws.securityhub.aws-security-finding/source-url :portkey.aws.securityhub.aws-security-finding/malware :portkey.aws.securityhub.aws-security-finding/confidence]))

(clojure.spec.alpha/def :portkey.aws.securityhub/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.securityhub/string-filter-comparison #{:contains "CONTAINS" :equals :prefix "PREFIX" "EQUALS"})

(clojure.spec.alpha/def :portkey.aws.securityhub.enable-import-findings-for-product-response/product-subscription-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/enable-import-findings-for-product-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.enable-import-findings-for-product-response/product-subscription-arn]))

(clojure.spec.alpha/def :portkey.aws.securityhub/get-enabled-standards-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/standards-subscription-arns :portkey.aws.securityhub/next-token :portkey.aws.securityhub/max-results]))

(clojure.spec.alpha/def :portkey.aws.securityhub/import-findings-error-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/import-findings-error))

(clojure.spec.alpha/def :portkey.aws.securityhub.map-filter/key (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.map-filter/value (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.map-filter/comparison (clojure.spec.alpha/and :portkey.aws.securityhub/map-filter-comparison))
(clojure.spec.alpha/def :portkey.aws.securityhub/map-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.map-filter/key :portkey.aws.securityhub.map-filter/value :portkey.aws.securityhub.map-filter/comparison]))

(clojure.spec.alpha/def :portkey.aws.securityhub/get-master-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/batch-disable-standards-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/standards-subscriptions]))

(clojure.spec.alpha/def :portkey.aws.securityhub.standards-subscription-request/standards-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.standards-subscription-request/standards-input (clojure.spec.alpha/and :portkey.aws.securityhub/standards-input-parameter-map))
(clojure.spec.alpha/def :portkey.aws.securityhub/standards-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.standards-subscription-request/standards-arn] :opt-un [:portkey.aws.securityhub.standards-subscription-request/standards-input]))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-insight-results-request/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-insight-results-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.get-insight-results-request/insight-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/verification-state #{"UNKNOWN" :true-positive :unknown :false-positive "FALSE_POSITIVE" :benign-positive "BENIGN_POSITIVE" "TRUE_POSITIVE"})

(clojure.spec.alpha/def :portkey.aws.securityhub.get-insights-response/insights (clojure.spec.alpha/and :portkey.aws.securityhub/insight-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-insights-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.get-insights-response/insights] :opt-un [:portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub/list-invitations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/max-results :portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub.update-findings-request/filters (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-filters))
(clojure.spec.alpha/def :portkey.aws.securityhub.update-findings-request/note (clojure.spec.alpha/and :portkey.aws.securityhub/note-update))
(clojure.spec.alpha/def :portkey.aws.securityhub/update-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.update-findings-request/filters] :opt-un [:portkey.aws.securityhub.update-findings-request/note :portkey.aws.securityhub/record-state]))

(clojure.spec.alpha/def :portkey.aws.securityhub/disable-security-hub-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/enable-security-hub-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/update-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-insights-request/insight-arns (clojure.spec.alpha/and :portkey.aws.securityhub/arn-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-insights-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.get-insights-request/insight-arns :portkey.aws.securityhub/next-token :portkey.aws.securityhub/max-results]))

(clojure.spec.alpha/def :portkey.aws.securityhub.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.resource-not-found-exception/message :portkey.aws.securityhub.resource-not-found-exception/code]))

(clojure.spec.alpha/def :portkey.aws.securityhub/compliance-status #{:passed "WARNING" :warning "NOT_AVAILABLE" "PASSED" :not-available "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.securityhub.insight/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight/filters (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-filters))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight/group-by-attribute (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/insight (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.insight/insight-arn :portkey.aws.securityhub.insight/name :portkey.aws.securityhub.insight/filters :portkey.aws.securityhub.insight/group-by-attribute] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.invalid-input-exception/code (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.invalid-input-exception/message :portkey.aws.securityhub.invalid-input-exception/code]))

(clojure.spec.alpha/def :portkey.aws.securityhub.network/direction (clojure.spec.alpha/and :portkey.aws.securityhub/network-direction))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/source-mac (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/source-ip-v-6 (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/source-port (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/source-ip-v-4 (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/source-domain (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/destination-port (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/protocol (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/destination-ip-v-6 (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/destination-domain (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.network/destination-ip-v-4 (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/network (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.network/direction :portkey.aws.securityhub.network/source-mac :portkey.aws.securityhub.network/source-ip-v-6 :portkey.aws.securityhub.network/source-port :portkey.aws.securityhub.network/source-ip-v-4 :portkey.aws.securityhub.network/source-domain :portkey.aws.securityhub.network/destination-port :portkey.aws.securityhub.network/protocol :portkey.aws.securityhub.network/destination-ip-v-6 :portkey.aws.securityhub.network/destination-domain :portkey.aws.securityhub.network/destination-ip-v-4]))

(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/path (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/pid (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/parent-pid (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.process-details/terminated-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/process-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.process-details/name :portkey.aws.securityhub.process-details/path :portkey.aws.securityhub.process-details/pid :portkey.aws.securityhub.process-details/parent-pid :portkey.aws.securityhub.process-details/launched-at :portkey.aws.securityhub.process-details/terminated-at]))

(clojure.spec.alpha/def :portkey.aws.securityhub.date-filter/start (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.date-filter/end (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/date-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.date-filter/start :portkey.aws.securityhub.date-filter/end :portkey.aws.securityhub/date-range]))

(clojure.spec.alpha/def :portkey.aws.securityhub.internal-exception/message (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.internal-exception/code (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.internal-exception/message :portkey.aws.securityhub.internal-exception/code]))

(clojure.spec.alpha/def :portkey.aws.securityhub/threat-intel-indicator-type #{"URL" :ipv-4-address :hash-md-5 "EMAIL_ADDRESS" "IPV6_ADDRESS" "PROCESS" "HASH_SHA1" "HASH_MD5" "MUTEX" :process "IPV4_ADDRESS" :hash-sha-256 "HASH_SHA256" :url :mutex :email-address :ipv-6-address :domain :hash-sha-512 "DOMAIN" :hash-sha-1 "HASH_SHA512"})

(clojure.spec.alpha/def :portkey.aws.securityhub.create-insight-request/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.create-insight-request/filters (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-filters))
(clojure.spec.alpha/def :portkey.aws.securityhub.create-insight-request/group-by-attribute (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/create-insight-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.create-insight-request/name :portkey.aws.securityhub.create-insight-request/filters :portkey.aws.securityhub.create-insight-request/group-by-attribute] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-insight-response/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-insight-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.delete-insight-response/insight-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.securityhub/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.securityhub/field-map (clojure.spec.alpha/map-of :portkey.aws.securityhub/non-empty-string :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub.enable-import-findings-for-product-request/product-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/enable-import-findings-for-product-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.enable-import-findings-for-product-request/product-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.list-enabled-products-for-import-response/product-subscriptions (clojure.spec.alpha/and :portkey.aws.securityhub/product-subscription-arn-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/list-enabled-products-for-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.list-enabled-products-for-import-response/product-subscriptions :portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub/date-range-unit #{"DAYS" :days})

(clojure.spec.alpha/def :portkey.aws.securityhub/date-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/date-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub/partition #{"aws-cn" :aws "aws" :awscn "aws-us-gov" :awsusgov})

(clojure.spec.alpha/def :portkey.aws.securityhub/resource-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/resource))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-invitations-count-response/invitations-count (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-invitations-count-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.get-invitations-count-response/invitations-count]))

(clojure.spec.alpha/def :portkey.aws.securityhub.compliance/status (clojure.spec.alpha/and :portkey.aws.securityhub/compliance-status))
(clojure.spec.alpha/def :portkey.aws.securityhub/compliance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.compliance/status]))

(clojure.spec.alpha/def :portkey.aws.securityhub.create-members-request/account-details (clojure.spec.alpha/and :portkey.aws.securityhub/account-details-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/create-members-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.create-members-request/account-details]))

(clojure.spec.alpha/def :portkey.aws.securityhub.invitation/invitation-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.invitation/invited-at (clojure.spec.alpha/and :portkey.aws.securityhub/timestamp))
(clojure.spec.alpha/def :portkey.aws.securityhub.invitation/member-status (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/invitation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/account-id :portkey.aws.securityhub.invitation/invitation-id :portkey.aws.securityhub.invitation/invited-at :portkey.aws.securityhub.invitation/member-status]))

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-invitations-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-invitations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.delete-invitations-request/account-ids]))

(clojure.spec.alpha/def :portkey.aws.securityhub.disassociate-members-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/disassociate-members-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.disassociate-members-request/account-ids]))

(clojure.spec.alpha/def :portkey.aws.securityhub/related-finding-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/related-finding))

(clojure.spec.alpha/def :portkey.aws.securityhub/list-enabled-products-for-import-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/next-token :portkey.aws.securityhub/max-results]))

(clojure.spec.alpha/def :portkey.aws.securityhub/get-invitations-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.insight-result-value/group-by-attribute-value (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.insight-result-value/count (clojure.spec.alpha/and :portkey.aws.securityhub/integer))
(clojure.spec.alpha/def :portkey.aws.securityhub/insight-result-value (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.insight-result-value/group-by-attribute-value :portkey.aws.securityhub.insight-result-value/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.securityhub.account-details/email (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/account-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub/account-id :portkey.aws.securityhub.account-details/email]))

(clojure.spec.alpha/def :portkey.aws.securityhub.keyword-filter/value (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/keyword-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.keyword-filter/value]))

(clojure.spec.alpha/def :portkey.aws.securityhub/accept-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-findings-response/findings (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-findings-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.get-findings-response/findings] :opt-un [:portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.securityhub.resource/type (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource/id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource/region (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource/tags (clojure.spec.alpha/and :portkey.aws.securityhub/field-map))
(clojure.spec.alpha/def :portkey.aws.securityhub.resource/details (clojure.spec.alpha/and :portkey.aws.securityhub/resource-details))
(clojure.spec.alpha/def :portkey.aws.securityhub/resource (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.resource/type :portkey.aws.securityhub.resource/id] :opt-un [:portkey.aws.securityhub/partition :portkey.aws.securityhub.resource/region :portkey.aws.securityhub.resource/tags :portkey.aws.securityhub.resource/details]))

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-members-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.delete-members-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub/standards-subscriptions (clojure.spec.alpha/coll-of :portkey.aws.securityhub/standards-subscription))

(clojure.spec.alpha/def :portkey.aws.securityhub/arn-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.securityhub/aws-security-finding-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/aws-security-finding))

(clojure.spec.alpha/def :portkey.aws.securityhub/disable-security-hub-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.decline-invitations-request/account-ids (clojure.spec.alpha/and :portkey.aws.securityhub/account-id-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/decline-invitations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.decline-invitations-request/account-ids]))

(clojure.spec.alpha/def :portkey.aws.securityhub.related-finding/product-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.related-finding/id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/related-finding (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.related-finding/product-arn :portkey.aws.securityhub.related-finding/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.delete-insight-request/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/delete-insight-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.delete-insight-request/insight-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/map-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/map-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub.ip-filter/cidr (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/ip-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.ip-filter/cidr]))

(clojure.spec.alpha/def :portkey.aws.securityhub.batch-import-findings-request/findings (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/batch-import-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.batch-import-findings-request/findings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/type (clojure.spec.alpha/and :portkey.aws.securityhub/threat-intel-indicator-type))
(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/value (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/category (clojure.spec.alpha/and :portkey.aws.securityhub/threat-intel-indicator-category))
(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/last-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/source (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.threat-intel-indicator/source-url (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/threat-intel-indicator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.threat-intel-indicator/type :portkey.aws.securityhub.threat-intel-indicator/value :portkey.aws.securityhub.threat-intel-indicator/category :portkey.aws.securityhub.threat-intel-indicator/last-observed-at :portkey.aws.securityhub.threat-intel-indicator/source :portkey.aws.securityhub.threat-intel-indicator/source-url]))

(clojure.spec.alpha/def :portkey.aws.securityhub/insight-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/insight))

(clojure.spec.alpha/def :portkey.aws.securityhub.invite-members-response/unprocessed-accounts (clojure.spec.alpha/and :portkey.aws.securityhub/result-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/invite-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.invite-members-response/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.securityhub/insight-result-value-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/insight-result-value))

(clojure.spec.alpha/def :portkey.aws.securityhub.malware/name (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.malware/type (clojure.spec.alpha/and :portkey.aws.securityhub/malware-type))
(clojure.spec.alpha/def :portkey.aws.securityhub.malware/path (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.malware/state (clojure.spec.alpha/and :portkey.aws.securityhub/malware-state))
(clojure.spec.alpha/def :portkey.aws.securityhub/malware (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.malware/name] :opt-un [:portkey.aws.securityhub.malware/type :portkey.aws.securityhub.malware/path :portkey.aws.securityhub.malware/state]))

(clojure.spec.alpha/def :portkey.aws.securityhub/update-insight-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub/sort-criteria (clojure.spec.alpha/coll-of :portkey.aws.securityhub/sort-criterion))

(clojure.spec.alpha/def :portkey.aws.securityhub.accept-invitation-request/master-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.accept-invitation-request/invitation-id (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/accept-invitation-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.accept-invitation-request/master-id :portkey.aws.securityhub.accept-invitation-request/invitation-id]))

(clojure.spec.alpha/def :portkey.aws.securityhub.sort-criterion/field (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/sort-criterion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.sort-criterion/field :portkey.aws.securityhub/sort-order]))

(clojure.spec.alpha/def :portkey.aws.securityhub/standards-subscription-arns (clojure.spec.alpha/coll-of :portkey.aws.securityhub/non-empty-string :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.securityhub/ip-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/ip-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub/keyword-filter-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/keyword-filter))

(clojure.spec.alpha/def :portkey.aws.securityhub.create-insight-response/insight-arn (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/create-insight-response (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.create-insight-response/insight-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-partition (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/recommendation-text (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/company-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-source (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/malware-path (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/record-state (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-type (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-user-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-terminated-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-direction (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-pid (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-iam-instance-profile-arn (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-source-url (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/product-arn (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/type (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/note-text (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-vpc-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/malware-state (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-container-launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-destination-domain (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/severity-normalized (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-category (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/last-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/title (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-image-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/malware-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-tags (clojure.spec.alpha/and :portkey.aws.securityhub/map-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/product-fields (clojure.spec.alpha/and :portkey.aws.securityhub/map-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-subnet-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-destination-ip-v-4 (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/malware-type (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-container-image-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/criticality (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-destination-ip-v-6 (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/workflow-state (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-region (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/user-defined-fields (clojure.spec.alpha/and :portkey.aws.securityhub/map-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/severity-product (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/verification-state (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/note-updated-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-source-port (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/compliance-status (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/first-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/description (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/aws-account-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-ip-v-4-addresses (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-source-mac (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-type (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-destination-port (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/keyword (clojure.spec.alpha/and :portkey.aws.securityhub/keyword-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/product-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-type (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-last-observed-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-container-image-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/created-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-source-ip-v-4 (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-container-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-status (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/related-findings-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-protocol (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/related-findings-product-arn (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/updated-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/source-url (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-value (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-source-domain (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-s-3-bucket-owner-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-launched-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-ip-v-6-addresses (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/severity-label (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-path (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-created-at (clojure.spec.alpha/and :portkey.aws.securityhub/date-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-details-other (clojure.spec.alpha/and :portkey.aws.securityhub/map-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-s-3-bucket-owner-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/network-source-ip-v-6 (clojure.spec.alpha/and :portkey.aws.securityhub/ip-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/process-parent-pid (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/confidence (clojure.spec.alpha/and :portkey.aws.securityhub/number-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/note-updated-by (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-key-name (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.aws-security-finding-filters/generator-id (clojure.spec.alpha/and :portkey.aws.securityhub/string-filter-list))
(clojure.spec.alpha/def :portkey.aws.securityhub/aws-security-finding-filters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.aws-security-finding-filters/resource-partition :portkey.aws.securityhub.aws-security-finding-filters/recommendation-text :portkey.aws.securityhub.aws-security-finding-filters/company-name :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-source :portkey.aws.securityhub.aws-security-finding-filters/malware-path :portkey.aws.securityhub.aws-security-finding-filters/record-state :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-type :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-user-name :portkey.aws.securityhub.aws-security-finding-filters/process-terminated-at :portkey.aws.securityhub.aws-security-finding-filters/network-direction :portkey.aws.securityhub.aws-security-finding-filters/process-pid :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-iam-instance-profile-arn :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-source-url :portkey.aws.securityhub.aws-security-finding-filters/product-arn :portkey.aws.securityhub.aws-security-finding-filters/type :portkey.aws.securityhub.aws-security-finding-filters/note-text :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-vpc-id :portkey.aws.securityhub.aws-security-finding-filters/malware-state :portkey.aws.securityhub.aws-security-finding-filters/resource-container-launched-at :portkey.aws.securityhub.aws-security-finding-filters/network-destination-domain :portkey.aws.securityhub.aws-security-finding-filters/severity-normalized :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-category :portkey.aws.securityhub.aws-security-finding-filters/last-observed-at :portkey.aws.securityhub.aws-security-finding-filters/title :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-image-id :portkey.aws.securityhub.aws-security-finding-filters/malware-name :portkey.aws.securityhub.aws-security-finding-filters/resource-tags :portkey.aws.securityhub.aws-security-finding-filters/product-fields :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-subnet-id :portkey.aws.securityhub.aws-security-finding-filters/network-destination-ip-v-4 :portkey.aws.securityhub.aws-security-finding-filters/malware-type :portkey.aws.securityhub.aws-security-finding-filters/resource-container-image-name :portkey.aws.securityhub.aws-security-finding-filters/criticality :portkey.aws.securityhub.aws-security-finding-filters/network-destination-ip-v-6 :portkey.aws.securityhub.aws-security-finding-filters/workflow-state :portkey.aws.securityhub.aws-security-finding-filters/resource-region :portkey.aws.securityhub.aws-security-finding-filters/user-defined-fields :portkey.aws.securityhub.aws-security-finding-filters/resource-id :portkey.aws.securityhub.aws-security-finding-filters/severity-product :portkey.aws.securityhub.aws-security-finding-filters/verification-state :portkey.aws.securityhub.aws-security-finding-filters/note-updated-at :portkey.aws.securityhub.aws-security-finding-filters/network-source-port :portkey.aws.securityhub.aws-security-finding-filters/compliance-status :portkey.aws.securityhub.aws-security-finding-filters/first-observed-at :portkey.aws.securityhub.aws-security-finding-filters/description :portkey.aws.securityhub.aws-security-finding-filters/aws-account-id :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-ip-v-4-addresses :portkey.aws.securityhub.aws-security-finding-filters/network-source-mac :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-type :portkey.aws.securityhub.aws-security-finding-filters/network-destination-port :portkey.aws.securityhub.aws-security-finding-filters/keyword :portkey.aws.securityhub.aws-security-finding-filters/product-name :portkey.aws.securityhub.aws-security-finding-filters/resource-type :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-last-observed-at :portkey.aws.securityhub.aws-security-finding-filters/resource-container-image-id :portkey.aws.securityhub.aws-security-finding-filters/created-at :portkey.aws.securityhub.aws-security-finding-filters/network-source-ip-v-4 :portkey.aws.securityhub.aws-security-finding-filters/resource-container-name :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-status :portkey.aws.securityhub.aws-security-finding-filters/related-findings-id :portkey.aws.securityhub.aws-security-finding-filters/process-name :portkey.aws.securityhub.aws-security-finding-filters/network-protocol :portkey.aws.securityhub.aws-security-finding-filters/related-findings-product-arn :portkey.aws.securityhub.aws-security-finding-filters/updated-at :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-launched-at :portkey.aws.securityhub.aws-security-finding-filters/source-url :portkey.aws.securityhub.aws-security-finding-filters/threat-intel-indicator-value :portkey.aws.securityhub.aws-security-finding-filters/network-source-domain :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-s-3-bucket-owner-name :portkey.aws.securityhub.aws-security-finding-filters/process-launched-at :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-ip-v-6-addresses :portkey.aws.securityhub.aws-security-finding-filters/severity-label :portkey.aws.securityhub.aws-security-finding-filters/process-path :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-iam-access-key-created-at :portkey.aws.securityhub.aws-security-finding-filters/resource-details-other :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-s-3-bucket-owner-id :portkey.aws.securityhub.aws-security-finding-filters/network-source-ip-v-6 :portkey.aws.securityhub.aws-security-finding-filters/id :portkey.aws.securityhub.aws-security-finding-filters/process-parent-pid :portkey.aws.securityhub.aws-security-finding-filters/confidence :portkey.aws.securityhub.aws-security-finding-filters/note-updated-by :portkey.aws.securityhub.aws-security-finding-filters/resource-aws-ec-2-instance-key-name :portkey.aws.securityhub.aws-security-finding-filters/generator-id]))

(clojure.spec.alpha/def :portkey.aws.securityhub.note-update/text (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub.note-update/updated-by (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/note-update (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub.note-update/text :portkey.aws.securityhub.note-update/updated-by] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.securityhub.list-members-response/members (clojure.spec.alpha/and :portkey.aws.securityhub/member-list))
(clojure.spec.alpha/def :portkey.aws.securityhub.list-members-response/next-token (clojure.spec.alpha/and :portkey.aws.securityhub/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.securityhub/list-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.list-members-response/members :portkey.aws.securityhub.list-members-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub.list-members-request/only-associated (clojure.spec.alpha/and :portkey.aws.securityhub/boolean))
(clojure.spec.alpha/def :portkey.aws.securityhub/list-members-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.list-members-request/only-associated :portkey.aws.securityhub/max-results :portkey.aws.securityhub/next-token]))

(clojure.spec.alpha/def :portkey.aws.securityhub.number-filter/gte (clojure.spec.alpha/and :portkey.aws.securityhub/double))
(clojure.spec.alpha/def :portkey.aws.securityhub.number-filter/lte (clojure.spec.alpha/and :portkey.aws.securityhub/double))
(clojure.spec.alpha/def :portkey.aws.securityhub.number-filter/eq (clojure.spec.alpha/and :portkey.aws.securityhub/double))
(clojure.spec.alpha/def :portkey.aws.securityhub/number-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.number-filter/gte :portkey.aws.securityhub.number-filter/lte :portkey.aws.securityhub.number-filter/eq]))

(clojure.spec.alpha/def :portkey.aws.securityhub/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.securityhub/member-list (clojure.spec.alpha/coll-of :portkey.aws.securityhub/member))

(clojure.spec.alpha/def :portkey.aws.securityhub.get-findings-request/filters (clojure.spec.alpha/and :portkey.aws.securityhub/aws-security-finding-filters))
(clojure.spec.alpha/def :portkey.aws.securityhub/get-findings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.securityhub.get-findings-request/filters :portkey.aws.securityhub/sort-criteria :portkey.aws.securityhub/next-token :portkey.aws.securityhub/max-results]))

(clojure.spec.alpha/def :portkey.aws.securityhub/batch-disable-standards-request (clojure.spec.alpha/keys :req-un [:portkey.aws.securityhub/standards-subscription-arns] :opt-un []))

(clojure.core/defn get-invitations-count "Returns the count of all Security Hub membership invitations that were sent to\nthe current member account, not including the currently accepted invitation." ([] (get-invitations-count {})) ([get-invitations-count-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invitations-count-request get-invitations-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-invitations-count-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitations/count", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-invitations-count-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvitationsCount", :http.request.configuration/output-deser-fn response-get-invitations-count-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-invitations-count :args (clojure.spec.alpha/? :portkey.aws.securityhub/get-invitations-count-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-invitations-count-response))

(clojure.core/defn get-members "Returns the details on the Security Hub member accounts that are specified by\nthe account IDs." ([get-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-members-request get-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members/get", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMembers", :http.request.configuration/output-deser-fn response-get-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-members :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/get-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-members-response))

(clojure.core/defn update-findings "Updates the AWS Security Hub-aggregated findings specified by the filter\nattributes." ([update-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-findings-request update-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/update-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/findings", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/update-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFindings", :http.request.configuration/output-deser-fn response-update-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-findings :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/update-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/update-findings-response))

(clojure.core/defn decline-invitations "Declines invitations that are sent to this AWS account (invitee) by the AWS\naccounts (inviters) that are specified by the account IDs." ([] (decline-invitations {})) ([decline-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-decline-invitations-request decline-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/decline-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitations/decline", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/decline-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeclineInvitations", :http.request.configuration/output-deser-fn response-decline-invitations-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef decline-invitations :args (clojure.spec.alpha/? :portkey.aws.securityhub/decline-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/decline-invitations-response))

(clojure.core/defn list-enabled-products-for-import "Lists all Security Hub-integrated third-party findings providers." ([] (list-enabled-products-for-import {})) ([list-enabled-products-for-import-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-enabled-products-for-import-request list-enabled-products-for-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/list-enabled-products-for-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/productSubscriptions", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/list-enabled-products-for-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEnabledProductsForImport", :http.request.configuration/output-deser-fn response-list-enabled-products-for-import-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-enabled-products-for-import :args (clojure.spec.alpha/? :portkey.aws.securityhub/list-enabled-products-for-import-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/list-enabled-products-for-import-response))

(clojure.core/defn get-master-account "Provides the details for the Security Hub master account to the current member\naccount." ([] (get-master-account {})) ([get-master-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-master-account-request get-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/master", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMasterAccount", :http.request.configuration/output-deser-fn response-get-master-account-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-master-account :args (clojure.spec.alpha/? :portkey.aws.securityhub/get-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-master-account-response))

(clojure.core/defn enable-security-hub "Enables the AWS Security Hub service." ([] (enable-security-hub {})) ([enable-security-hub-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-security-hub-request enable-security-hub-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/enable-security-hub-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/accounts", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/enable-security-hub-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableSecurityHub", :http.request.configuration/output-deser-fn response-enable-security-hub-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef enable-security-hub :args (clojure.spec.alpha/? :portkey.aws.securityhub/enable-security-hub-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/enable-security-hub-response))

(clojure.core/defn disassociate-members "Disassociates the Security Hub member accounts that are specified by the account\nIDs from their master account." ([] (disassociate-members {})) ([disassociate-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-members-request disassociate-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/disassociate-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members/disassociate", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/disassociate-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateMembers", :http.request.configuration/output-deser-fn response-disassociate-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-members :args (clojure.spec.alpha/? :portkey.aws.securityhub/disassociate-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/disassociate-members-response))

(clojure.core/defn create-insight "Creates an insight, which is a consolidation of findings that identifies a\nsecurity area that requires attention or intervention." ([create-insight-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-insight-request create-insight-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/create-insight-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/insights", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/create-insight-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInsight", :http.request.configuration/output-deser-fn response-create-insight-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-insight :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/create-insight-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/create-insight-response))

(clojure.core/defn invite-members "Invites other AWS accounts to enable Security Hub and become Security Hub member\naccounts. When an account accepts the invitation and becomes a member account,\nthe master account can view Security Hub findings of the member account." ([] (invite-members {})) ([invite-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-invite-members-request invite-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/invite-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members/invite", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/invite-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteMembers", :http.request.configuration/output-deser-fn response-invite-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef invite-members :args (clojure.spec.alpha/? :portkey.aws.securityhub/invite-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/invite-members-response))

(clojure.core/defn enable-import-findings-for-product "Enables you to import findings generated by integrated third-party providers\ninto Security Hub." ([enable-import-findings-for-product-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-enable-import-findings-for-product-request enable-import-findings-for-product-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/enable-import-findings-for-product-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/productSubscriptions", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/enable-import-findings-for-product-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableImportFindingsForProduct", :http.request.configuration/output-deser-fn response-enable-import-findings-for-product-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception}})))))
(clojure.spec.alpha/fdef enable-import-findings-for-product :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/enable-import-findings-for-product-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/enable-import-findings-for-product-response))

(clojure.core/defn list-invitations "Lists all Security Hub membership invitations that were sent to the current AWS\naccount." ([] (list-invitations {})) ([list-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invitations-request list-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/list-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitations", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/list-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvitations", :http.request.configuration/output-deser-fn response-list-invitations-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-invitations :args (clojure.spec.alpha/? :portkey.aws.securityhub/list-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/list-invitations-response))

(clojure.core/defn disable-security-hub "Disables the AWS Security Hub Service." ([] (disable-security-hub {})) ([disable-security-hub-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-security-hub-request disable-security-hub-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/disable-security-hub-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/accounts", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/disable-security-hub-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableSecurityHub", :http.request.configuration/output-deser-fn response-disable-security-hub-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef disable-security-hub :args (clojure.spec.alpha/? :portkey.aws.securityhub/disable-security-hub-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/disable-security-hub-response))

(clojure.core/defn get-insight-results "Lists the results of the Security Hub insight specified by the insight ARN." ([get-insight-results-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-insight-results-request get-insight-results-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-insight-results-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/insights/results/{InsightArn+}", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-insight-results-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInsightResults", :http.request.configuration/output-deser-fn response-get-insight-results-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-insight-results :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/get-insight-results-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-insight-results-response))

(clojure.core/defn delete-insight "Deletes an insight that is specified by the insight ARN." ([delete-insight-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-insight-request delete-insight-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/delete-insight-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/insights/{InsightArn+}", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/delete-insight-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInsight", :http.request.configuration/output-deser-fn response-delete-insight-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-insight :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/delete-insight-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/delete-insight-response))

(clojure.core/defn disassociate-from-master-account "Disassociates the current Security Hub member account from its master account." ([] (disassociate-from-master-account {})) ([disassociate-from-master-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-from-master-account-request disassociate-from-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/disassociate-from-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/master/disassociate", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/disassociate-from-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateFromMasterAccount", :http.request.configuration/output-deser-fn response-disassociate-from-master-account-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-from-master-account :args (clojure.spec.alpha/? :portkey.aws.securityhub/disassociate-from-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/disassociate-from-master-account-response))

(clojure.core/defn batch-enable-standards "Enables the standards specified by the standards ARNs. In the context of\nSecurity Hub, supported standards (for example, CIS AWS Foundations) are\nautomated and continuous checks that help determine your compliance status\nagainst security industry (including AWS) best practices." ([batch-enable-standards-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-enable-standards-request batch-enable-standards-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/batch-enable-standards-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/standards/register", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/batch-enable-standards-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchEnableStandards", :http.request.configuration/output-deser-fn response-batch-enable-standards-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-enable-standards :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/batch-enable-standards-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/batch-enable-standards-response))

(clojure.core/defn get-insights "Lists and describes insights that are specified by insight ARNs." ([] (get-insights {})) ([get-insights-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-insights-request get-insights-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-insights-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/insights/get", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-insights-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInsights", :http.request.configuration/output-deser-fn response-get-insights-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-insights :args (clojure.spec.alpha/? :portkey.aws.securityhub/get-insights-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-insights-response))

(clojure.core/defn disable-import-findings-for-product "Stops you from being able to import findings generated by integrated third-party\nproviders into Security Hub." ([disable-import-findings-for-product-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-import-findings-for-product-request disable-import-findings-for-product-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/disable-import-findings-for-product-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/productSubscriptions/{ProductSubscriptionArn+}", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/disable-import-findings-for-product-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableImportFindingsForProduct", :http.request.configuration/output-deser-fn response-disable-import-findings-for-product-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disable-import-findings-for-product :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/disable-import-findings-for-product-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/disable-import-findings-for-product-response))

(clojure.core/defn batch-import-findings "Imports security findings that are generated by the integrated third-party\nproducts into Security Hub." ([batch-import-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-import-findings-request batch-import-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/batch-import-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/findings/import", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/batch-import-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchImportFindings", :http.request.configuration/output-deser-fn response-batch-import-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-import-findings :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/batch-import-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/batch-import-findings-response))

(clojure.core/defn get-enabled-standards "Lists and describes enabled standards." ([] (get-enabled-standards {})) ([get-enabled-standards-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-enabled-standards-request get-enabled-standards-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-enabled-standards-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/standards/get", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-enabled-standards-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEnabledStandards", :http.request.configuration/output-deser-fn response-get-enabled-standards-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-enabled-standards :args (clojure.spec.alpha/? :portkey.aws.securityhub/get-enabled-standards-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-enabled-standards-response))

(clojure.core/defn accept-invitation "Accepts the invitation to be monitored by a master SecurityHub account." ([] (accept-invitation {})) ([accept-invitation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-accept-invitation-request accept-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/accept-invitation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/master", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/accept-invitation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptInvitation", :http.request.configuration/output-deser-fn response-accept-invitation-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef accept-invitation :args (clojure.spec.alpha/? :portkey.aws.securityhub/accept-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/accept-invitation-response))

(clojure.core/defn create-members "Creates member Security Hub accounts in the current AWS account (which becomes\nthe master Security Hub account) that has Security Hub enabled." ([] (create-members {})) ([create-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-members-request create-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/create-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/create-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMembers", :http.request.configuration/output-deser-fn response-create-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-members :args (clojure.spec.alpha/? :portkey.aws.securityhub/create-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/create-members-response))

(clojure.core/defn update-insight "Updates the AWS Security Hub insight specified by the insight ARN." ([update-insight-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-insight-request update-insight-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/update-insight-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/insights/{InsightArn+}", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/update-insight-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateInsight", :http.request.configuration/output-deser-fn response-update-insight-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-insight :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/update-insight-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/update-insight-response))

(clojure.core/defn batch-disable-standards "Disables the standards specified by the standards subscription ARNs. In the\ncontext of Security Hub, supported standards (for example, CIS AWS Foundations)\nare automated and continuous checks that help determine your compliance status\nagainst security industry (including AWS) best practices." ([batch-disable-standards-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-disable-standards-request batch-disable-standards-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/batch-disable-standards-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/standards/deregister", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/batch-disable-standards-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDisableStandards", :http.request.configuration/output-deser-fn response-batch-disable-standards-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-disable-standards :args (clojure.spec.alpha/tuple :portkey.aws.securityhub/batch-disable-standards-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/batch-disable-standards-response))

(clojure.core/defn list-members "Lists details about all member accounts for the current Security Hub master\naccount." ([] (list-members {})) ([list-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-members-request list-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/list-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/list-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMembers", :http.request.configuration/output-deser-fn response-list-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-members :args (clojure.spec.alpha/? :portkey.aws.securityhub/list-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/list-members-response))

(clojure.core/defn delete-invitations "Deletes invitations that are sent to this AWS account (invitee) by the AWS\naccounts (inviters) that are specified by their account IDs." ([] (delete-invitations {})) ([delete-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-invitations-request delete-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/delete-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitations/delete", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/delete-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInvitations", :http.request.configuration/output-deser-fn response-delete-invitations-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-invitations :args (clojure.spec.alpha/? :portkey.aws.securityhub/delete-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/delete-invitations-response))

(clojure.core/defn get-findings "Lists and describes Security Hub-aggregated findings that are specified by\nfilter attributes." ([] (get-findings {})) ([get-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-findings-request get-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/get-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/findings", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/get-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFindings", :http.request.configuration/output-deser-fn response-get-findings-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-findings :args (clojure.spec.alpha/? :portkey.aws.securityhub/get-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/get-findings-response))

(clojure.core/defn delete-members "Deletes the Security Hub member accounts that are specified by the account IDs." ([] (delete-members {})) ([delete-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-members-request delete-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.securityhub/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.securityhub/delete-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/members/delete", :http.request.configuration/version "2018-10-26", :http.request.configuration/service-id "SecurityHub", :http.request.spec/input-spec :portkey.aws.securityhub/delete-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMembers", :http.request.configuration/output-deser-fn response-delete-members-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.securityhub/internal-exception, "InvalidInputException" :portkey.aws.securityhub/invalid-input-exception, "LimitExceededException" :portkey.aws.securityhub/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.securityhub/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-members :args (clojure.spec.alpha/? :portkey.aws.securityhub/delete-members-request) :ret (clojure.spec.alpha/and :portkey.aws.securityhub/delete-members-response))
