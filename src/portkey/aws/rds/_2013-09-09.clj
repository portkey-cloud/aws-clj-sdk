(ns portkey.aws.rds.-2013-09-09 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "rds", :region "ap-northeast-1"},
    :ssl-common-name "rds.ap-northeast-1.amazonaws.com",
    :endpoint "https://rds.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "rds", :region "eu-west-1"},
    :ssl-common-name "rds.eu-west-1.amazonaws.com",
    :endpoint "https://rds.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "rds", :region "us-east-2"},
    :ssl-common-name "rds.us-east-2.amazonaws.com",
    :endpoint "https://rds.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "rds", :region "ap-southeast-2"},
    :ssl-common-name "rds.ap-southeast-2.amazonaws.com",
    :endpoint "https://rds.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "rds", :region "cn-north-1"},
    :ssl-common-name "rds.cn-north-1.amazonaws.com.cn",
    :endpoint "https://rds.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "rds", :region "sa-east-1"},
    :ssl-common-name "rds.sa-east-1.amazonaws.com",
    :endpoint "https://rds.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "rds", :region "ap-southeast-1"},
    :ssl-common-name "rds.ap-southeast-1.amazonaws.com",
    :endpoint "https://rds.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "rds", :region "cn-northwest-1"},
    :ssl-common-name "rds.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://rds.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "rds", :region "ap-northeast-2"},
    :ssl-common-name "rds.ap-northeast-2.amazonaws.com",
    :endpoint "https://rds.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "rds", :region "eu-west-3"},
    :ssl-common-name "rds.eu-west-3.amazonaws.com",
    :endpoint "https://rds.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "rds", :region "ca-central-1"},
    :ssl-common-name "rds.ca-central-1.amazonaws.com",
    :endpoint "https://rds.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "rds", :region "eu-central-1"},
    :ssl-common-name "rds.eu-central-1.amazonaws.com",
    :endpoint "https://rds.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "rds", :region "eu-west-2"},
    :ssl-common-name "rds.eu-west-2.amazonaws.com",
    :endpoint "https://rds.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "rds", :region "us-gov-west-1"},
    :ssl-common-name "rds.us-gov-west-1.amazonaws.com",
    :endpoint "https://rds.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "rds", :region "us-west-2"},
    :ssl-common-name "rds.us-west-2.amazonaws.com",
    :endpoint "https://rds.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "rds", :region "us-east-1"},
    :ssl-common-name "rds.amazonaws.com",
    :endpoint "https://rds.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "rds", :region "us-west-1"},
    :ssl-common-name "rds.us-west-1.amazonaws.com",
    :endpoint "https://rds.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "rds", :region "ap-south-1"},
    :ssl-common-name "rds.ap-south-1.amazonaws.com",
    :endpoint "https://rds.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-subnet-identifier-list ser-filter-value-list ser-parameters-list ser-filter ser-source-ids-list ser-key-list ser-option-names-list ser-source-type ser-tag-list ser-integer ser-string ser-parameter ser-vpc-security-group-id-list ser-tstamp ser-event-categories-list ser-dbsecurity-group-name-list ser-apply-method ser-long ser-tag ser-boolean-optional ser-option-setting ser-option-configuration-list ser-option-configuration ser-integer-optional ser-option-settings-list ser-filter-list ser-boolean)

(clojure.core/defn- ser-subnet-identifier-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-filter-value-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-parameters-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-filter [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "Filter.Name" (ser-string (:name shape-input))) (:values shape-input) (clojure.core/assoc "Filter.Values" (ser-filter-value-list (:values shape-input)))))
(clojure.core/defn- ser-source-ids-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-key-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-option-names-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-source-type [shape-input] ({"db-instance" "db-instance", :db-instance "db-instance", "db-parameter-group" "db-parameter-group", :db-parameter-group "db-parameter-group", "db-security-group" "db-security-group", :db-security-group "db-security-group", "db-snapshot" "db-snapshot", :db-snapshot "db-snapshot"} shape-input))
(clojure.core/defn- ser-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-integer [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-parameter [shape-input] (clojure.core/cond-> {} (:data-type shape-input) (clojure.core/assoc "Parameter.DataType" (ser-string (:data-type shape-input))) (:parameter-name shape-input) (clojure.core/assoc "Parameter.ParameterName" (ser-string (:parameter-name shape-input))) (:source shape-input) (clojure.core/assoc "Parameter.Source" (ser-string (:source shape-input))) (:minimum-engine-version shape-input) (clojure.core/assoc "Parameter.MinimumEngineVersion" (ser-string (:minimum-engine-version shape-input))) (:allowed-values shape-input) (clojure.core/assoc "Parameter.AllowedValues" (ser-string (:allowed-values shape-input))) (:apply-type shape-input) (clojure.core/assoc "Parameter.ApplyType" (ser-string (:apply-type shape-input))) (:description shape-input) (clojure.core/assoc "Parameter.Description" (ser-string (:description shape-input))) (:apply-method shape-input) (clojure.core/assoc "Parameter.ApplyMethod" (ser-apply-method (:apply-method shape-input))) (:is-modifiable shape-input) (clojure.core/assoc "Parameter.IsModifiable" (ser-boolean (:is-modifiable shape-input))) (:parameter-value shape-input) (clojure.core/assoc "Parameter.ParameterValue" (ser-string (:parameter-value shape-input)))))
(clojure.core/defn- ser-vpc-security-group-id-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tstamp [shape-input] shape-input)
(clojure.core/defn- ser-event-categories-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dbsecurity-group-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-apply-method [shape-input] ({"immediate" "immediate", :immediate "immediate", "pending-reboot" "pending-reboot", :pending-reboot "pending-reboot"} shape-input))
(clojure.core/defn- ser-long [shape-input] shape-input)
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-string (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-string (:value shape-input)))))
(clojure.core/defn- ser-boolean-optional [shape-input] shape-input)
(clojure.core/defn- ser-option-setting [shape-input] (clojure.core/cond-> {} (:data-type shape-input) (clojure.core/assoc "OptionSetting.DataType" (ser-string (:data-type shape-input))) (:allowed-values shape-input) (clojure.core/assoc "OptionSetting.AllowedValues" (ser-string (:allowed-values shape-input))) (:value shape-input) (clojure.core/assoc "OptionSetting.Value" (ser-string (:value shape-input))) (:apply-type shape-input) (clojure.core/assoc "OptionSetting.ApplyType" (ser-string (:apply-type shape-input))) (:description shape-input) (clojure.core/assoc "OptionSetting.Description" (ser-string (:description shape-input))) (:default-value shape-input) (clojure.core/assoc "OptionSetting.DefaultValue" (ser-string (:default-value shape-input))) (:is-modifiable shape-input) (clojure.core/assoc "OptionSetting.IsModifiable" (ser-boolean (:is-modifiable shape-input))) (:is-collection shape-input) (clojure.core/assoc "OptionSetting.IsCollection" (ser-boolean (:is-collection shape-input))) (:name shape-input) (clojure.core/assoc "OptionSetting.Name" (ser-string (:name shape-input)))))
(clojure.core/defn- ser-option-configuration-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-option-configuration [shape-input] (clojure.core/cond-> {} (:option-name shape-input) (clojure.core/assoc "OptionConfiguration.OptionName" (ser-string (:option-name shape-input))) (:port shape-input) (clojure.core/assoc "OptionConfiguration.Port" (ser-integer-optional (:port shape-input))) (:dbsecurity-group-memberships shape-input) (clojure.core/assoc "OptionConfiguration.DBSecurityGroupMemberships" (ser-dbsecurity-group-name-list (:dbsecurity-group-memberships shape-input))) (:vpc-security-group-memberships shape-input) (clojure.core/assoc "OptionConfiguration.VpcSecurityGroupMemberships" (ser-vpc-security-group-id-list (:vpc-security-group-memberships shape-input))) (:option-settings shape-input) (clojure.core/assoc "OptionConfiguration.OptionSettings" (ser-option-settings-list (:option-settings shape-input)))))
(clojure.core/defn- ser-integer-optional [shape-input] shape-input)
(clojure.core/defn- ser-option-settings-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-filter-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-boolean [shape-input] shape-input)

(clojure.core/defn req<-add-source-identifier-to-subscription-message [action-name67657 input67656] {:body {"SubscriptionName" (ser-string (input67656 :subscription-name)), "SourceIdentifier" (ser-string (input67656 :source-identifier)), "Version" "2013-09-09", "Action" action-name67657}})
(clojure.core/defn req<-deletedbsnapshot-message [action-name67659 input67658] {:body {"DBSnapshotIdentifier" (ser-string (input67658 :dbsnapshot-identifier)), "Version" "2013-09-09", "Action" action-name67659}})
(clojure.core/defn req<-deletedbsubnet-group-message [action-name67661 input67660] {:body {"DBSubnetGroupName" (ser-string (input67660 :dbsubnet-group-name)), "Version" "2013-09-09", "Action" action-name67661}})
(clojure.core/defn req<-describe-orderabledbinstance-options-message [action-name67663 input67662] (clojure.core/let [input67664 {:body {"Engine" (ser-string (input67662 :engine)), "Version" "2013-09-09", "Action" action-name67663}}] (clojure.core/cond-> input67664 (clojure.core/contains? input67662 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input67662 :engine-version))) (clojure.core/contains? input67662 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67662 :dbinstance-class))) (clojure.core/contains? input67662 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input67662 :license-model))) (clojure.core/contains? input67662 :vpc) (clojure.core/assoc-in [:body "Vpc"] (ser-boolean-optional (input67662 :vpc))) (clojure.core/contains? input67662 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67662 :filters))) (clojure.core/contains? input67662 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67662 :max-records))) (clojure.core/contains? input67662 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67662 :marker))))))
(clojure.core/defn req<-revokedbsecurity-group-ingress-message [action-name67666 input67665] (clojure.core/let [input67667 {:body {"DBSecurityGroupName" (ser-string (input67665 :dbsecurity-group-name)), "Version" "2013-09-09", "Action" action-name67666}}] (clojure.core/cond-> input67667 (clojure.core/contains? input67665 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input67665 :cidrip))) (clojure.core/contains? input67665 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input67665 :ec2-security-group-name))) (clojure.core/contains? input67665 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input67665 :ec2-security-group-id))) (clojure.core/contains? input67665 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input67665 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-authorizedbsecurity-group-ingress-message [action-name67669 input67668] (clojure.core/let [input67670 {:body {"DBSecurityGroupName" (ser-string (input67668 :dbsecurity-group-name)), "Version" "2013-09-09", "Action" action-name67669}}] (clojure.core/cond-> input67670 (clojure.core/contains? input67668 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input67668 :cidrip))) (clojure.core/contains? input67668 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input67668 :ec2-security-group-name))) (clojure.core/contains? input67668 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input67668 :ec2-security-group-id))) (clojure.core/contains? input67668 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input67668 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-modifydbsubnet-group-message [action-name67672 input67671] (clojure.core/let [input67673 {:body {"DBSubnetGroupName" (ser-string (input67671 :dbsubnet-group-name)), "SubnetIds" (ser-subnet-identifier-list (input67671 :subnet-ids)), "Version" "2013-09-09", "Action" action-name67672}}] (clojure.core/cond-> input67673 (clojure.core/contains? input67671 :dbsubnet-group-description) (clojure.core/assoc-in [:body "DBSubnetGroupDescription"] (ser-string (input67671 :dbsubnet-group-description))))))
(clojure.core/defn req<-restoredbinstance-to-point-in-time-message [action-name67675 input67674] (clojure.core/let [input67676 {:body {"SourceDBInstanceIdentifier" (ser-string (input67674 :sourcedbinstance-identifier)), "TargetDBInstanceIdentifier" (ser-string (input67674 :targetdbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67675}}] (clojure.core/cond-> input67676 (clojure.core/contains? input67674 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67674 :option-group-name))) (clojure.core/contains? input67674 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input67674 :publicly-accessible))) (clojure.core/contains? input67674 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input67674 :auto-minor-version-upgrade))) (clojure.core/contains? input67674 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67674 :tags))) (clojure.core/contains? input67674 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input67674 :dbname))) (clojure.core/contains? input67674 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input67674 :availability-zone))) (clojure.core/contains? input67674 :restore-time) (clojure.core/assoc-in [:body "RestoreTime"] (ser-tstamp (input67674 :restore-time))) (clojure.core/contains? input67674 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input67674 :license-model))) (clojure.core/contains? input67674 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input67674 :dbsubnet-group-name))) (clojure.core/contains? input67674 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input67674 :port))) (clojure.core/contains? input67674 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input67674 :iops))) (clojure.core/contains? input67674 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67674 :dbinstance-class))) (clojure.core/contains? input67674 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input67674 :engine))) (clojure.core/contains? input67674 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67674 :multiaz))) (clojure.core/contains? input67674 :use-latest-restorable-time) (clojure.core/assoc-in [:body "UseLatestRestorableTime"] (ser-boolean (input67674 :use-latest-restorable-time))))))
(clojure.core/defn req<-describe-events-message [action-name67678 input67677] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67678}} (clojure.core/contains? input67677 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-tstamp (input67677 :end-time))) (clojure.core/contains? input67677 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-tstamp (input67677 :start-time))) (clojure.core/contains? input67677 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67677 :max-records))) (clojure.core/contains? input67677 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67677 :marker))) (clojure.core/contains? input67677 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-source-type (input67677 :source-type))) (clojure.core/contains? input67677 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-integer-optional (input67677 :duration))) (clojure.core/contains? input67677 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input67677 :event-categories))) (clojure.core/contains? input67677 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67677 :filters))) (clojure.core/contains? input67677 :source-identifier) (clojure.core/assoc-in [:body "SourceIdentifier"] (ser-string (input67677 :source-identifier)))))
(clojure.core/defn req<-resetdbparameter-group-message [action-name67680 input67679] (clojure.core/let [input67681 {:body {"DBParameterGroupName" (ser-string (input67679 :dbparameter-group-name)), "Version" "2013-09-09", "Action" action-name67680}}] (clojure.core/cond-> input67681 (clojure.core/contains? input67679 :reset-all-parameters) (clojure.core/assoc-in [:body "ResetAllParameters"] (ser-boolean (input67679 :reset-all-parameters))) (clojure.core/contains? input67679 :parameters) (clojure.core/assoc-in [:body "Parameters"] (ser-parameters-list (input67679 :parameters))))))
(clojure.core/defn req<-describe-option-groups-message [action-name67683 input67682] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67683}} (clojure.core/contains? input67682 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67682 :option-group-name))) (clojure.core/contains? input67682 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67682 :filters))) (clojure.core/contains? input67682 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67682 :marker))) (clojure.core/contains? input67682 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67682 :max-records))) (clojure.core/contains? input67682 :engine-name) (clojure.core/assoc-in [:body "EngineName"] (ser-string (input67682 :engine-name))) (clojure.core/contains? input67682 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input67682 :major-engine-version)))))
(clojure.core/defn req<-rebootdbinstance-message [action-name67685 input67684] (clojure.core/let [input67686 {:body {"DBInstanceIdentifier" (ser-string (input67684 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67685}}] (clojure.core/cond-> input67686 (clojure.core/contains? input67684 :force-failover) (clojure.core/assoc-in [:body "ForceFailover"] (ser-boolean-optional (input67684 :force-failover))))))
(clojure.core/defn req<-deletedbsecurity-group-message [action-name67688 input67687] {:body {"DBSecurityGroupName" (ser-string (input67687 :dbsecurity-group-name)), "Version" "2013-09-09", "Action" action-name67688}})
(clojure.core/defn req<-list-tags-for-resource-message [action-name67690 input67689] (clojure.core/let [input67691 {:body {"ResourceName" (ser-string (input67689 :resource-name)), "Version" "2013-09-09", "Action" action-name67690}}] (clojure.core/cond-> input67691 (clojure.core/contains? input67689 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67689 :filters))))))
(clojure.core/defn req<-describe-engine-default-parameters-message [action-name67693 input67692] (clojure.core/let [input67694 {:body {"DBParameterGroupFamily" (ser-string (input67692 :dbparameter-group-family)), "Version" "2013-09-09", "Action" action-name67693}}] (clojure.core/cond-> input67694 (clojure.core/contains? input67692 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67692 :filters))) (clojure.core/contains? input67692 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67692 :max-records))) (clojure.core/contains? input67692 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67692 :marker))))))
(clojure.core/defn req<-deletedbinstance-message [action-name67696 input67695] (clojure.core/let [input67697 {:body {"DBInstanceIdentifier" (ser-string (input67695 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67696}}] (clojure.core/cond-> input67697 (clojure.core/contains? input67695 :skip-final-snapshot) (clojure.core/assoc-in [:body "SkipFinalSnapshot"] (ser-boolean (input67695 :skip-final-snapshot))) (clojure.core/contains? input67695 :finaldbsnapshot-identifier) (clojure.core/assoc-in [:body "FinalDBSnapshotIdentifier"] (ser-string (input67695 :finaldbsnapshot-identifier))))))
(clojure.core/defn req<-describedbsubnet-groups-message [action-name67699 input67698] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67699}} (clojure.core/contains? input67698 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input67698 :dbsubnet-group-name))) (clojure.core/contains? input67698 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67698 :filters))) (clojure.core/contains? input67698 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67698 :max-records))) (clojure.core/contains? input67698 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67698 :marker)))))
(clojure.core/defn req<-createdbinstance-message [action-name67701 input67700] (clojure.core/let [input67702 {:body {"DBInstanceIdentifier" (ser-string (input67700 :dbinstance-identifier)), "MasterUserPassword" (ser-string (input67700 :master-user-password)), "AllocatedStorage" (ser-integer-optional (input67700 :allocated-storage)), "MasterUsername" (ser-string (input67700 :master-username)), "DBInstanceClass" (ser-string (input67700 :dbinstance-class)), "Engine" (ser-string (input67700 :engine)), "Version" "2013-09-09", "Action" action-name67701}}] (clojure.core/cond-> input67702 (clojure.core/contains? input67700 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input67700 :backup-retention-period))) (clojure.core/contains? input67700 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67700 :option-group-name))) (clojure.core/contains? input67700 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input67700 :dbsecurity-groups))) (clojure.core/contains? input67700 :character-set-name) (clojure.core/assoc-in [:body "CharacterSetName"] (ser-string (input67700 :character-set-name))) (clojure.core/contains? input67700 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input67700 :publicly-accessible))) (clojure.core/contains? input67700 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input67700 :preferred-maintenance-window))) (clojure.core/contains? input67700 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input67700 :auto-minor-version-upgrade))) (clojure.core/contains? input67700 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67700 :tags))) (clojure.core/contains? input67700 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input67700 :dbname))) (clojure.core/contains? input67700 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input67700 :vpc-security-group-ids))) (clojure.core/contains? input67700 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input67700 :availability-zone))) (clojure.core/contains? input67700 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input67700 :license-model))) (clojure.core/contains? input67700 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input67700 :engine-version))) (clojure.core/contains? input67700 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input67700 :dbsubnet-group-name))) (clojure.core/contains? input67700 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input67700 :port))) (clojure.core/contains? input67700 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input67700 :iops))) (clojure.core/contains? input67700 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input67700 :dbparameter-group-name))) (clojure.core/contains? input67700 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67700 :multiaz))) (clojure.core/contains? input67700 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input67700 :preferred-backup-window))))))
(clojure.core/defn req<-promote-read-replica-message [action-name67704 input67703] (clojure.core/let [input67705 {:body {"DBInstanceIdentifier" (ser-string (input67703 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67704}}] (clojure.core/cond-> input67705 (clojure.core/contains? input67703 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input67703 :backup-retention-period))) (clojure.core/contains? input67703 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input67703 :preferred-backup-window))))))
(clojure.core/defn req<-delete-event-subscription-message [action-name67707 input67706] {:body {"SubscriptionName" (ser-string (input67706 :subscription-name)), "Version" "2013-09-09", "Action" action-name67707}})
(clojure.core/defn req<-describedblog-files-message [action-name67709 input67708] (clojure.core/let [input67710 {:body {"DBInstanceIdentifier" (ser-string (input67708 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67709}}] (clojure.core/cond-> input67710 (clojure.core/contains? input67708 :filename-contains) (clojure.core/assoc-in [:body "FilenameContains"] (ser-string (input67708 :filename-contains))) (clojure.core/contains? input67708 :file-last-written) (clojure.core/assoc-in [:body "FileLastWritten"] (ser-long (input67708 :file-last-written))) (clojure.core/contains? input67708 :file-size) (clojure.core/assoc-in [:body "FileSize"] (ser-long (input67708 :file-size))) (clojure.core/contains? input67708 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67708 :filters))) (clojure.core/contains? input67708 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67708 :max-records))) (clojure.core/contains? input67708 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67708 :marker))))))
(clojure.core/defn req<-restoredbinstance-fromdbsnapshot-message [action-name67712 input67711] (clojure.core/let [input67713 {:body {"DBInstanceIdentifier" (ser-string (input67711 :dbinstance-identifier)), "DBSnapshotIdentifier" (ser-string (input67711 :dbsnapshot-identifier)), "Version" "2013-09-09", "Action" action-name67712}}] (clojure.core/cond-> input67713 (clojure.core/contains? input67711 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67711 :option-group-name))) (clojure.core/contains? input67711 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input67711 :publicly-accessible))) (clojure.core/contains? input67711 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input67711 :auto-minor-version-upgrade))) (clojure.core/contains? input67711 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67711 :tags))) (clojure.core/contains? input67711 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input67711 :dbname))) (clojure.core/contains? input67711 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input67711 :availability-zone))) (clojure.core/contains? input67711 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input67711 :license-model))) (clojure.core/contains? input67711 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input67711 :dbsubnet-group-name))) (clojure.core/contains? input67711 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input67711 :port))) (clojure.core/contains? input67711 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input67711 :iops))) (clojure.core/contains? input67711 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67711 :dbinstance-class))) (clojure.core/contains? input67711 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input67711 :engine))) (clojure.core/contains? input67711 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67711 :multiaz))))))
(clojure.core/defn req<-describedbsnapshots-message [action-name67715 input67714] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67715}} (clojure.core/contains? input67714 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input67714 :dbinstance-identifier))) (clojure.core/contains? input67714 :dbsnapshot-identifier) (clojure.core/assoc-in [:body "DBSnapshotIdentifier"] (ser-string (input67714 :dbsnapshot-identifier))) (clojure.core/contains? input67714 :snapshot-type) (clojure.core/assoc-in [:body "SnapshotType"] (ser-string (input67714 :snapshot-type))) (clojure.core/contains? input67714 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67714 :filters))) (clojure.core/contains? input67714 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67714 :max-records))) (clojure.core/contains? input67714 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67714 :marker)))))
(clojure.core/defn req<-createdbsubnet-group-message [action-name67717 input67716] (clojure.core/let [input67718 {:body {"DBSubnetGroupName" (ser-string (input67716 :dbsubnet-group-name)), "DBSubnetGroupDescription" (ser-string (input67716 :dbsubnet-group-description)), "SubnetIds" (ser-subnet-identifier-list (input67716 :subnet-ids)), "Version" "2013-09-09", "Action" action-name67717}}] (clojure.core/cond-> input67718 (clojure.core/contains? input67716 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67716 :tags))))))
(clojure.core/defn req<-remove-source-identifier-from-subscription-message [action-name67720 input67719] {:body {"SubscriptionName" (ser-string (input67719 :subscription-name)), "SourceIdentifier" (ser-string (input67719 :source-identifier)), "Version" "2013-09-09", "Action" action-name67720}})
(clojure.core/defn req<-create-option-group-message [action-name67722 input67721] (clojure.core/let [input67723 {:body {"OptionGroupName" (ser-string (input67721 :option-group-name)), "EngineName" (ser-string (input67721 :engine-name)), "MajorEngineVersion" (ser-string (input67721 :major-engine-version)), "OptionGroupDescription" (ser-string (input67721 :option-group-description)), "Version" "2013-09-09", "Action" action-name67722}}] (clojure.core/cond-> input67723 (clojure.core/contains? input67721 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67721 :tags))))))
(clojure.core/defn req<-describe-event-categories-message [action-name67725 input67724] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67725}} (clojure.core/contains? input67724 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input67724 :source-type))) (clojure.core/contains? input67724 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67724 :filters)))))
(clojure.core/defn req<-describe-reserveddbinstances-offerings-message [action-name67727 input67726] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67727}} (clojure.core/contains? input67726 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input67726 :reserveddbinstances-offering-id))) (clojure.core/contains? input67726 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67726 :max-records))) (clojure.core/contains? input67726 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67726 :marker))) (clojure.core/contains? input67726 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input67726 :duration))) (clojure.core/contains? input67726 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67726 :filters))) (clojure.core/contains? input67726 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input67726 :product-description))) (clojure.core/contains? input67726 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67726 :dbinstance-class))) (clojure.core/contains? input67726 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input67726 :offering-type))) (clojure.core/contains? input67726 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67726 :multiaz)))))
(clojure.core/defn req<-createdbsnapshot-message [action-name67729 input67728] (clojure.core/let [input67730 {:body {"DBSnapshotIdentifier" (ser-string (input67728 :dbsnapshot-identifier)), "DBInstanceIdentifier" (ser-string (input67728 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67729}}] (clojure.core/cond-> input67730 (clojure.core/contains? input67728 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67728 :tags))))))
(clojure.core/defn req<-downloaddblog-file-portion-message [action-name67732 input67731] (clojure.core/let [input67733 {:body {"DBInstanceIdentifier" (ser-string (input67731 :dbinstance-identifier)), "LogFileName" (ser-string (input67731 :log-file-name)), "Version" "2013-09-09", "Action" action-name67732}}] (clojure.core/cond-> input67733 (clojure.core/contains? input67731 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67731 :marker))) (clojure.core/contains? input67731 :number-of-lines) (clojure.core/assoc-in [:body "NumberOfLines"] (ser-integer (input67731 :number-of-lines))))))
(clojure.core/defn req<-describedbinstances-message [action-name67735 input67734] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67735}} (clojure.core/contains? input67734 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input67734 :dbinstance-identifier))) (clojure.core/contains? input67734 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67734 :filters))) (clojure.core/contains? input67734 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67734 :max-records))) (clojure.core/contains? input67734 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67734 :marker)))))
(clojure.core/defn req<-modify-event-subscription-message [action-name67737 input67736] (clojure.core/let [input67738 {:body {"SubscriptionName" (ser-string (input67736 :subscription-name)), "Version" "2013-09-09", "Action" action-name67737}}] (clojure.core/cond-> input67738 (clojure.core/contains? input67736 :sns-topic-arn) (clojure.core/assoc-in [:body "SnsTopicArn"] (ser-string (input67736 :sns-topic-arn))) (clojure.core/contains? input67736 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input67736 :source-type))) (clojure.core/contains? input67736 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input67736 :event-categories))) (clojure.core/contains? input67736 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input67736 :enabled))))))
(clojure.core/defn req<-describedbengine-versions-message [action-name67740 input67739] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67740}} (clojure.core/contains? input67739 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input67739 :engine))) (clojure.core/contains? input67739 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input67739 :engine-version))) (clojure.core/contains? input67739 :dbparameter-group-family) (clojure.core/assoc-in [:body "DBParameterGroupFamily"] (ser-string (input67739 :dbparameter-group-family))) (clojure.core/contains? input67739 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67739 :filters))) (clojure.core/contains? input67739 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67739 :max-records))) (clojure.core/contains? input67739 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67739 :marker))) (clojure.core/contains? input67739 :default-only) (clojure.core/assoc-in [:body "DefaultOnly"] (ser-boolean (input67739 :default-only))) (clojure.core/contains? input67739 :list-supported-character-sets) (clojure.core/assoc-in [:body "ListSupportedCharacterSets"] (ser-boolean-optional (input67739 :list-supported-character-sets)))))
(clojure.core/defn req<-describe-option-group-options-message [action-name67742 input67741] (clojure.core/let [input67743 {:body {"EngineName" (ser-string (input67741 :engine-name)), "Version" "2013-09-09", "Action" action-name67742}}] (clojure.core/cond-> input67743 (clojure.core/contains? input67741 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input67741 :major-engine-version))) (clojure.core/contains? input67741 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67741 :filters))) (clojure.core/contains? input67741 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67741 :max-records))) (clojure.core/contains? input67741 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67741 :marker))))))
(clojure.core/defn req<-createdbsecurity-group-message [action-name67745 input67744] (clojure.core/let [input67746 {:body {"DBSecurityGroupName" (ser-string (input67744 :dbsecurity-group-name)), "DBSecurityGroupDescription" (ser-string (input67744 :dbsecurity-group-description)), "Version" "2013-09-09", "Action" action-name67745}}] (clojure.core/cond-> input67746 (clojure.core/contains? input67744 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67744 :tags))))))
(clojure.core/defn req<-delete-option-group-message [action-name67748 input67747] {:body {"OptionGroupName" (ser-string (input67747 :option-group-name)), "Version" "2013-09-09", "Action" action-name67748}})
(clojure.core/defn req<-create-event-subscription-message [action-name67750 input67749] (clojure.core/let [input67751 {:body {"SubscriptionName" (ser-string (input67749 :subscription-name)), "SnsTopicArn" (ser-string (input67749 :sns-topic-arn)), "Version" "2013-09-09", "Action" action-name67750}}] (clojure.core/cond-> input67751 (clojure.core/contains? input67749 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input67749 :source-type))) (clojure.core/contains? input67749 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input67749 :event-categories))) (clojure.core/contains? input67749 :source-ids) (clojure.core/assoc-in [:body "SourceIds"] (ser-source-ids-list (input67749 :source-ids))) (clojure.core/contains? input67749 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input67749 :enabled))) (clojure.core/contains? input67749 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67749 :tags))))))
(clojure.core/defn req<-createdbparameter-group-message [action-name67753 input67752] (clojure.core/let [input67754 {:body {"DBParameterGroupName" (ser-string (input67752 :dbparameter-group-name)), "DBParameterGroupFamily" (ser-string (input67752 :dbparameter-group-family)), "Description" (ser-string (input67752 :description)), "Version" "2013-09-09", "Action" action-name67753}}] (clojure.core/cond-> input67754 (clojure.core/contains? input67752 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67752 :tags))))))
(clojure.core/defn req<-purchase-reserveddbinstances-offering-message [action-name67756 input67755] (clojure.core/let [input67757 {:body {"ReservedDBInstancesOfferingId" (ser-string (input67755 :reserveddbinstances-offering-id)), "Version" "2013-09-09", "Action" action-name67756}}] (clojure.core/cond-> input67757 (clojure.core/contains? input67755 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input67755 :reserveddbinstance-id))) (clojure.core/contains? input67755 :dbinstance-count) (clojure.core/assoc-in [:body "DBInstanceCount"] (ser-integer-optional (input67755 :dbinstance-count))) (clojure.core/contains? input67755 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67755 :tags))))))
(clojure.core/defn req<-deletedbparameter-group-message [action-name67759 input67758] {:body {"DBParameterGroupName" (ser-string (input67758 :dbparameter-group-name)), "Version" "2013-09-09", "Action" action-name67759}})
(clojure.core/defn req<-copydbsnapshot-message [action-name67761 input67760] (clojure.core/let [input67762 {:body {"SourceDBSnapshotIdentifier" (ser-string (input67760 :sourcedbsnapshot-identifier)), "TargetDBSnapshotIdentifier" (ser-string (input67760 :targetdbsnapshot-identifier)), "Version" "2013-09-09", "Action" action-name67761}}] (clojure.core/cond-> input67762 (clojure.core/contains? input67760 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67760 :tags))))))
(clojure.core/defn req<-describe-reserveddbinstances-message [action-name67764 input67763] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67764}} (clojure.core/contains? input67763 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input67763 :reserveddbinstance-id))) (clojure.core/contains? input67763 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input67763 :reserveddbinstances-offering-id))) (clojure.core/contains? input67763 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67763 :max-records))) (clojure.core/contains? input67763 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67763 :marker))) (clojure.core/contains? input67763 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input67763 :duration))) (clojure.core/contains? input67763 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67763 :filters))) (clojure.core/contains? input67763 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input67763 :product-description))) (clojure.core/contains? input67763 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67763 :dbinstance-class))) (clojure.core/contains? input67763 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input67763 :offering-type))) (clojure.core/contains? input67763 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67763 :multiaz)))))
(clojure.core/defn req<-describe-event-subscriptions-message [action-name67766 input67765] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67766}} (clojure.core/contains? input67765 :subscription-name) (clojure.core/assoc-in [:body "SubscriptionName"] (ser-string (input67765 :subscription-name))) (clojure.core/contains? input67765 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67765 :filters))) (clojure.core/contains? input67765 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67765 :max-records))) (clojure.core/contains? input67765 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67765 :marker)))))
(clojure.core/defn req<-modifydbinstance-message [action-name67768 input67767] (clojure.core/let [input67769 {:body {"DBInstanceIdentifier" (ser-string (input67767 :dbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67768}}] (clojure.core/cond-> input67769 (clojure.core/contains? input67767 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input67767 :backup-retention-period))) (clojure.core/contains? input67767 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67767 :option-group-name))) (clojure.core/contains? input67767 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input67767 :dbsecurity-groups))) (clojure.core/contains? input67767 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input67767 :preferred-maintenance-window))) (clojure.core/contains? input67767 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input67767 :auto-minor-version-upgrade))) (clojure.core/contains? input67767 :newdbinstance-identifier) (clojure.core/assoc-in [:body "NewDBInstanceIdentifier"] (ser-string (input67767 :newdbinstance-identifier))) (clojure.core/contains? input67767 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input67767 :vpc-security-group-ids))) (clojure.core/contains? input67767 :master-user-password) (clojure.core/assoc-in [:body "MasterUserPassword"] (ser-string (input67767 :master-user-password))) (clojure.core/contains? input67767 :allow-major-version-upgrade) (clojure.core/assoc-in [:body "AllowMajorVersionUpgrade"] (ser-boolean (input67767 :allow-major-version-upgrade))) (clojure.core/contains? input67767 :allocated-storage) (clojure.core/assoc-in [:body "AllocatedStorage"] (ser-integer-optional (input67767 :allocated-storage))) (clojure.core/contains? input67767 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input67767 :engine-version))) (clojure.core/contains? input67767 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input67767 :iops))) (clojure.core/contains? input67767 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input67767 :apply-immediately))) (clojure.core/contains? input67767 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67767 :dbinstance-class))) (clojure.core/contains? input67767 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input67767 :dbparameter-group-name))) (clojure.core/contains? input67767 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input67767 :multiaz))) (clojure.core/contains? input67767 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input67767 :preferred-backup-window))))))
(clojure.core/defn req<-describedbparameters-message [action-name67771 input67770] (clojure.core/let [input67772 {:body {"DBParameterGroupName" (ser-string (input67770 :dbparameter-group-name)), "Version" "2013-09-09", "Action" action-name67771}}] (clojure.core/cond-> input67772 (clojure.core/contains? input67770 :source) (clojure.core/assoc-in [:body "Source"] (ser-string (input67770 :source))) (clojure.core/contains? input67770 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67770 :filters))) (clojure.core/contains? input67770 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67770 :max-records))) (clojure.core/contains? input67770 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67770 :marker))))))
(clojure.core/defn req<-modify-option-group-message [action-name67774 input67773] (clojure.core/let [input67775 {:body {"OptionGroupName" (ser-string (input67773 :option-group-name)), "Version" "2013-09-09", "Action" action-name67774}}] (clojure.core/cond-> input67775 (clojure.core/contains? input67773 :options-to-include) (clojure.core/assoc-in [:body "OptionsToInclude"] (ser-option-configuration-list (input67773 :options-to-include))) (clojure.core/contains? input67773 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-option-names-list (input67773 :options-to-remove))) (clojure.core/contains? input67773 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input67773 :apply-immediately))))))
(clojure.core/defn req<-describedbparameter-groups-message [action-name67777 input67776] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67777}} (clojure.core/contains? input67776 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input67776 :dbparameter-group-name))) (clojure.core/contains? input67776 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67776 :filters))) (clojure.core/contains? input67776 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67776 :max-records))) (clojure.core/contains? input67776 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67776 :marker)))))
(clojure.core/defn req<-remove-tags-from-resource-message [action-name67779 input67778] {:body {"ResourceName" (ser-string (input67778 :resource-name)), "TagKeys" (ser-key-list (input67778 :tag-keys)), "Version" "2013-09-09", "Action" action-name67779}})
(clojure.core/defn req<-add-tags-to-resource-message [action-name67781 input67780] {:body {"ResourceName" (ser-string (input67780 :resource-name)), "Tags" (ser-tag-list (input67780 :tags)), "Version" "2013-09-09", "Action" action-name67781}})
(clojure.core/defn req<-modifydbparameter-group-message [action-name67783 input67782] {:body {"DBParameterGroupName" (ser-string (input67782 :dbparameter-group-name)), "Parameters" (ser-parameters-list (input67782 :parameters)), "Version" "2013-09-09", "Action" action-name67783}})
(clojure.core/defn req<-describedbsecurity-groups-message [action-name67785 input67784] (clojure.core/cond-> {:body {"Version" "2013-09-09", "Action" action-name67785}} (clojure.core/contains? input67784 :dbsecurity-group-name) (clojure.core/assoc-in [:body "DBSecurityGroupName"] (ser-string (input67784 :dbsecurity-group-name))) (clojure.core/contains? input67784 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filter-list (input67784 :filters))) (clojure.core/contains? input67784 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input67784 :max-records))) (clojure.core/contains? input67784 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input67784 :marker)))))
(clojure.core/defn req<-createdbinstance-read-replica-message [action-name67787 input67786] (clojure.core/let [input67788 {:body {"DBInstanceIdentifier" (ser-string (input67786 :dbinstance-identifier)), "SourceDBInstanceIdentifier" (ser-string (input67786 :sourcedbinstance-identifier)), "Version" "2013-09-09", "Action" action-name67787}}] (clojure.core/cond-> input67788 (clojure.core/contains? input67786 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input67786 :option-group-name))) (clojure.core/contains? input67786 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input67786 :publicly-accessible))) (clojure.core/contains? input67786 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input67786 :auto-minor-version-upgrade))) (clojure.core/contains? input67786 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input67786 :tags))) (clojure.core/contains? input67786 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input67786 :availability-zone))) (clojure.core/contains? input67786 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input67786 :dbsubnet-group-name))) (clojure.core/contains? input67786 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input67786 :port))) (clojure.core/contains? input67786 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input67786 :iops))) (clojure.core/contains? input67786 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input67786 :dbinstance-class))))))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/source-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/vpc-security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/vpc-security-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/snapshot-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/parameters-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/parameter))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/ec2-security-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/ec2-security-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsnapshot-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.filter/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.filter/values (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-value-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/filter (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.filter/Name :portkey.aws.rds.-2013-09-09.filter/Values] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group-status/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group-status/parameter-apply-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbparameter-group-status/DBParameterGroupName :portkey.aws.rds.-2013-09-09.dbparameter-group-status/ParameterApplyStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbsecurity-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbinstances-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbinstances-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbinstances-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.describedbinstances-message/Filters :portkey.aws.rds.-2013-09-09.describedbinstances-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbinstances-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.deletedbsnapshot-message/DBSnapshotIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbsnapshots-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbsnapshots-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/SnapshotType :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/Filters :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbsnapshots-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group-details/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group-details/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbparameter-group-details/Parameters :portkey.aws.rds.-2013-09-09.dbparameter-group-details/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.deletedbparameter-group-message/DBParameterGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/source-ids-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/DBParameterGroupFamily] :opt-un [:portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/Filters :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-engine-default-parameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/snsno-authorization-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/option-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/persistent (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/permanent (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-setting-configuration-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option/OptionName :portkey.aws.rds.-2013-09-09.option/OptionDescription :portkey.aws.rds.-2013-09-09.option/Persistent :portkey.aws.rds.-2013-09-09.option/Permanent :portkey.aws.rds.-2013-09-09.option/Port :portkey.aws.rds.-2013-09-09.option/OptionSettings :portkey.aws.rds.-2013-09-09.option/DBSecurityGroupMemberships :portkey.aws.rds.-2013-09-09.option/VpcSecurityGroupMemberships] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-group-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsnapshot-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbsnapshot-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-09-09.createdbsnapshot-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.createdbsnapshot-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbparameter-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/rebootdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/instance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-status-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbparameter-group-status))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group-name-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-name-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbparameter-group-name-message/DBParameterGroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/default-only (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/list-supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbengine-versions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbengine-versions-message/Engine :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/EngineVersion :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/DBParameterGroupFamily :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/Filters :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/Marker :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/DefaultOnly :portkey.aws.rds.-2013-09-09.describedbengine-versions-message/ListSupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/SubscriptionName :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/Filters :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-event-subscriptions-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbsubnet-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/Filters :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbsubnet-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/DBSnapshotIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/OptionGroupName :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/PubliclyAccessible :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/Tags :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/DBName :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/AvailabilityZone :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/LicenseModel :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/Port :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/Iops :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/Engine :portkey.aws.rds.-2013-09-09.restoredbinstance-fromdbsnapshot-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/setting-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/setting-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/default-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option-setting/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-option-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-group-option-setting/SettingName :portkey.aws.rds.-2013-09-09.option-group-option-setting/SettingDescription :portkey.aws.rds.-2013-09-09.option-group-option-setting/DefaultValue :portkey.aws.rds.-2013-09-09.option-group-option-setting/ApplyType :portkey.aws.rds.-2013-09-09.option-group-option-setting/AllowedValues :portkey.aws.rds.-2013-09-09.option-group-option-setting/IsModifiable] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/availability-zone))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.subnet/subnet-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subnet (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.subnet/SubnetIdentifier :portkey.aws.rds.-2013-09-09.subnet/SubnetAvailabilityZone :portkey.aws.rds.-2013-09-09.subnet/SubnetStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsubnet-group-message/Marker :portkey.aws.rds.-2013-09-09/DBSubnetGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/SubnetIds] :opt-un [:portkey.aws.rds.-2013-09-09.modifydbsubnet-group-message/DBSubnetGroupDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.deletedbsecurity-group-message/DBSecurityGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/promote-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbinstance-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.createdbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-09-09.createdbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.createdbinstance-message/Engine :portkey.aws.rds.-2013-09-09.createdbinstance-message/MasterUsername :portkey.aws.rds.-2013-09-09.createdbinstance-message/MasterUserPassword] :opt-un [:portkey.aws.rds.-2013-09-09.createdbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-09-09.createdbinstance-message/OptionGroupName :portkey.aws.rds.-2013-09-09.createdbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-09-09.createdbinstance-message/CharacterSetName :portkey.aws.rds.-2013-09-09.createdbinstance-message/PubliclyAccessible :portkey.aws.rds.-2013-09-09.createdbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-09-09.createdbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.createdbinstance-message/Tags :portkey.aws.rds.-2013-09-09.createdbinstance-message/DBName :portkey.aws.rds.-2013-09-09.createdbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-09-09.createdbinstance-message/AvailabilityZone :portkey.aws.rds.-2013-09-09.createdbinstance-message/LicenseModel :portkey.aws.rds.-2013-09-09.createdbinstance-message/EngineVersion :portkey.aws.rds.-2013-09-09.createdbinstance-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.createdbinstance-message/Port :portkey.aws.rds.-2013-09-09.createdbinstance-message/Iops :portkey.aws.rds.-2013-09-09.createdbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-09-09.createdbinstance-message/MultiAZ :portkey.aws.rds.-2013-09-09.createdbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.promote-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.promote-read-replica-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.promote-read-replica-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/promote-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.promote-read-replica-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.promote-read-replica-message/BackupRetentionPeriod :portkey.aws.rds.-2013-09-09.promote-read-replica-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/key-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbengine-version-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbengine-version))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/customer-aws-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/cust-subscription-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscription/subscription-creation-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/SourceIdsList :portkey.aws.rds.-2013-09-09.event-subscription/CustomerAwsId :portkey.aws.rds.-2013-09-09.event-subscription/SourceType :portkey.aws.rds.-2013-09-09.event-subscription/Enabled :portkey.aws.rds.-2013-09-09.event-subscription/Status :portkey.aws.rds.-2013-09-09.event-subscription/SnsTopicArn :portkey.aws.rds.-2013-09-09/EventCategoriesList :portkey.aws.rds.-2013-09-09.event-subscription/CustSubscriptionId :portkey.aws.rds.-2013-09-09.event-subscription/SubscriptionCreationTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/snapshot-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/source-region (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot/percent-progress (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsnapshot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsnapshot/SnapshotCreateTime :portkey.aws.rds.-2013-09-09.dbsnapshot/OptionGroupName :portkey.aws.rds.-2013-09-09.dbsnapshot/SourceRegion :portkey.aws.rds.-2013-09-09.dbsnapshot/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.dbsnapshot/InstanceCreateTime :portkey.aws.rds.-2013-09-09.dbsnapshot/AvailabilityZone :portkey.aws.rds.-2013-09-09.dbsnapshot/Status :portkey.aws.rds.-2013-09-09.dbsnapshot/SnapshotType :portkey.aws.rds.-2013-09-09.dbsnapshot/LicenseModel :portkey.aws.rds.-2013-09-09.dbsnapshot/AllocatedStorage :portkey.aws.rds.-2013-09-09.dbsnapshot/MasterUsername :portkey.aws.rds.-2013-09-09.dbsnapshot/EngineVersion :portkey.aws.rds.-2013-09-09.dbsnapshot/DBSnapshotIdentifier :portkey.aws.rds.-2013-09-09.dbsnapshot/Port :portkey.aws.rds.-2013-09-09.dbsnapshot/VpcId :portkey.aws.rds.-2013-09-09.dbsnapshot/Iops :portkey.aws.rds.-2013-09-09.dbsnapshot/Engine :portkey.aws.rds.-2013-09-09.dbsnapshot/PercentProgress] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-details/log-file-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-details/last-written (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-details/size (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedblog-files-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedblog-files-details/LogFileName :portkey.aws.rds.-2013-09-09.describedblog-files-details/LastWritten :portkey.aws.rds.-2013-09-09.describedblog-files-details/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-option-group-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-option-group-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-option-group-message/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-option-group-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/create-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.create-option-group-message/OptionGroupName :portkey.aws.rds.-2013-09-09.create-option-group-message/EngineName :portkey.aws.rds.-2013-09-09.create-option-group-message/MajorEngineVersion :portkey.aws.rds.-2013-09-09.create-option-group-message/OptionGroupDescription] :opt-un [:portkey.aws.rds.-2013-09-09.create-option-group-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-names-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbinstance-message/skip-final-snapshot (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbinstance-message/finaldbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.deletedbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.deletedbinstance-message/SkipFinalSnapshot :portkey.aws.rds.-2013-09-09.deletedbinstance-message/FinalDBSnapshotIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbsubnet-group-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/reserveddbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-options-message/orderabledbinstance-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/orderabledbinstance-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/orderabledbinstance-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.orderabledbinstance-options-message/OrderableDBInstanceOptions :portkey.aws.rds.-2013-09-09.orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventCategoriesMapList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-events-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-events-message/EndTime :portkey.aws.rds.-2013-09-09.describe-events-message/StartTime :portkey.aws.rds.-2013-09-09.describe-events-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-events-message/Marker :portkey.aws.rds.-2013-09-09/SourceType :portkey.aws.rds.-2013-09-09.describe-events-message/Duration :portkey.aws.rds.-2013-09-09.describe-events-message/EventCategories :portkey.aws.rds.-2013-09-09.describe-events-message/Filters :portkey.aws.rds.-2013-09-09.describe-events-message/SourceIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subscription-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/options (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/allows-vpc-and-non-vpc-instance-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-group/OptionGroupName :portkey.aws.rds.-2013-09-09.option-group/OptionGroupDescription :portkey.aws.rds.-2013-09-09.option-group/EngineName :portkey.aws.rds.-2013-09-09.option-group/MajorEngineVersion :portkey.aws.rds.-2013-09-09.option-group/Options :portkey.aws.rds.-2013-09-09.option-group/AllowsVpcAndNonVpcInstanceMemberships :portkey.aws.rds.-2013-09-09.option-group/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/authorization-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-groups-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/iprange-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/iprange))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbsubnet-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-status-info/status-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-status-info/normal (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-status-info/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-status-info/message (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-status-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbinstance-status-info/StatusType :portkey.aws.rds.-2013-09-09.dbinstance-status-info/Normal :portkey.aws.rds.-2013-09-09.dbinstance-status-info/Status :portkey.aws.rds.-2013-09-09.dbinstance-status-info/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-09-09.authorizedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/snstopic-arn-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/event))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.events-message/events (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.events-message/Marker :portkey.aws.rds.-2013-09-09.events-message/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/source-type {"db-instance" "db-instance", :db-instance "db-instance", "db-parameter-group" "db-parameter-group", :db-parameter-group "db-parameter-group", "db-security-group" "db-security-group", :db-security-group "db-security-group", "db-snapshot" "db-snapshot", :db-snapshot "db-snapshot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/orderabledbinstance-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/orderabledbinstance-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsnapshot-message/dbsnapshots (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsnapshot-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsnapshot-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsnapshot-message/Marker :portkey.aws.rds.-2013-09-09.dbsnapshot-message/DBSnapshots] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subscription-category-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event/message (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event/date (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.event/SourceIdentifier :portkey.aws.rds.-2013-09-09/SourceType :portkey.aws.rds.-2013-09-09.event/Message :portkey.aws.rds.-2013-09-09.event/EventCategories :portkey.aws.rds.-2013-09-09.event/Date] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-options-message/option-group-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-group-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-group-options-message/OptionGroupOptions :portkey.aws.rds.-2013-09-09.option-group-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/availability-zone))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/reset-all-parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/resetdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/ResetAllParameters :portkey.aws.rds.-2013-09-09.resetdbparameter-group-message/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.availability-zone/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.availability-zone/provisioned-iops-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/availability-zone (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.availability-zone/Name :portkey.aws.rds.-2013-09-09.availability-zone/ProvisionedIopsCapable] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.event-subscriptions-message/Marker :portkey.aws.rds.-2013-09-09/EventSubscriptionsList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering-message/reserveddbinstances-offerings (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.reserveddbinstances-offering-message/Marker :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering-message/ReservedDBInstancesOfferings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/create-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsecurity-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-orderabledbinstance-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/Engine] :opt-un [:portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/EngineVersion :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/LicenseModel :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/Vpc :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/Filters :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/DBSubnetGroupDescription :portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/SubnetIds] :opt-un [:portkey.aws.rds.-2013-09-09.createdbsubnet-group-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbsecurity-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-groups/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-groups (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/OptionGroupsList :portkey.aws.rds.-2013-09-09.option-groups/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.delete-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/delete-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.delete-event-subscription-message/SubscriptionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/read-replicadbinstance-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-groups-message/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbparameter-groups-message/Marker :portkey.aws.rds.-2013-09-09.dbparameter-groups-message/DBParameterGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.recurring-charge/recurring-charge-amount (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.recurring-charge/recurring-charge-frequency (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/recurring-charge (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.recurring-charge/RecurringChargeAmount :portkey.aws.rds.-2013-09-09.recurring-charge/RecurringChargeFrequency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EngineDefaults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/authorization-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.copydbsnapshot-message/sourcedbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.copydbsnapshot-message/targetdbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.copydbsnapshot-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/copydbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.copydbsnapshot-message/SourceDBSnapshotIdentifier :portkey.aws.rds.-2013-09-09.copydbsnapshot-message/TargetDBSnapshotIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.copydbsnapshot-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/SourceDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/OptionGroupName :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/PubliclyAccessible :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/Tags :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/AvailabilityZone :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/Port :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/Iops :portkey.aws.rds.-2013-09-09.createdbinstance-read-replica-message/DBInstanceClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subnet-already-in-use (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/create-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/copydbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/permanent (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/port-required (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/option-group-option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-group-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/persistent (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/minimum-required-minor-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/default-port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-option/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-group-option/MajorEngineVersion :portkey.aws.rds.-2013-09-09.option-group-option/EngineName :portkey.aws.rds.-2013-09-09.option-group-option/Permanent :portkey.aws.rds.-2013-09-09.option-group-option/PortRequired :portkey.aws.rds.-2013-09-09.option-group-option/OptionGroupOptionSettings :portkey.aws.rds.-2013-09-09.option-group-option/Persistent :portkey.aws.rds.-2013-09-09.option-group-option/Description :portkey.aws.rds.-2013-09-09.option-group-option/MinimumRequiredMinorEngineVersion :portkey.aws.rds.-2013-09-09.option-group-option/DefaultPort :portkey.aws.rds.-2013-09-09/OptionsDependedOn :portkey.aws.rds.-2013-09-09.option-group-option/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invalid-subnet (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/tag-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/tag))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modify-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/dbengine-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/dbengine-version-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/default-character-set (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/character-set))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version/supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/supported-character-sets-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbengine-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbengine-version/Engine :portkey.aws.rds.-2013-09-09.dbengine-version/EngineVersion :portkey.aws.rds.-2013-09-09.dbengine-version/DBParameterGroupFamily :portkey.aws.rds.-2013-09-09.dbengine-version/DBEngineDescription :portkey.aws.rds.-2013-09-09.dbengine-version/DBEngineVersionDescription :portkey.aws.rds.-2013-09-09.dbengine-version/DefaultCharacterSet :portkey.aws.rds.-2013-09-09.dbengine-version/SupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-setting-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subscription-already-exist-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbupgrade-dependency-failure-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.add-source-identifier-to-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.add-source-identifier-to-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.add-source-identifier-to-subscription-message/SubscriptionName :portkey.aws.rds.-2013-09-09.add-source-identifier-to-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.add-tags-to-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.add-tags-to-resource-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/add-tags-to-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.add-tags-to-resource-message/ResourceName :portkey.aws.rds.-2013-09-09.add-tags-to-resource-message/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invalid-event-subscription-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/tag-list-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/TagList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/DBParameterGroupFamily :portkey.aws.rds.-2013-09-09.createdbparameter-group-message/Description] :opt-un [:portkey.aws.rds.-2013-09-09.createdbparameter-group-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.vpc-security-group-membership/vpc-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.vpc-security-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/vpc-security-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.vpc-security-group-membership/VpcSecurityGroupId :portkey.aws.rds.-2013-09-09.vpc-security-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/restore-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/targetdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/use-latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/SourceDBInstanceIdentifier :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/TargetDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/OptionGroupName :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/PubliclyAccessible :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/Tags :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/DBName :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/AvailabilityZone :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/RestoreTime :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/LicenseModel :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/Port :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/Iops :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/Engine :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/MultiAZ :portkey.aws.rds.-2013-09-09.restoredbinstance-to-point-in-time-message/UseLatestRestorableTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/authorization-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dblog-file-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance-message/reserveddbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/reserveddbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.reserveddbinstance-message/Marker :portkey.aws.rds.-2013-09-09.reserveddbinstance-message/ReservedDBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modifydbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.modifydbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-09-09.modifydbparameter-group-message/Parameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modifydbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.rebootdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.rebootdbinstance-message/force-failover (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/rebootdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.rebootdbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.rebootdbinstance-message/ForceFailover] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invalid-option-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/CurrencyCode :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/FixedPrice :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/Duration :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/UsagePrice :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/ProductDescription :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/DBInstanceClass :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/RecurringCharges :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/OfferingType :portkey.aws.rds.-2013-09-09.reserveddbinstances-offering/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.ec2-security-group/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.ec2-security-group/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.ec2-security-group/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.ec2-security-group/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/ec2-security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.ec2-security-group/Status :portkey.aws.rds.-2013-09-09.ec2-security-group/EC2SecurityGroupName :portkey.aws.rds.-2013-09-09.ec2-security-group/EC2SecurityGroupId :portkey.aws.rds.-2013-09-09.ec2-security-group/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.remove-source-identifier-from-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.remove-source-identifier-from-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.remove-source-identifier-from-subscription-message/SubscriptionName :portkey.aws.rds.-2013-09-09.remove-source-identifier-from-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/point-in-time-restore-not-enabled-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.remove-tags-from-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.remove-tags-from-resource-message/tag-keys (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/key-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/remove-tags-from-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.remove-tags-from-resource-message/ResourceName :portkey.aws.rds.-2013-09-09.remove-tags-from-resource-message/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-categories-map-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/event-categories-map))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/data-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/minimum-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/parameter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.parameter/DataType :portkey.aws.rds.-2013-09-09.parameter/ParameterName :portkey.aws.rds.-2013-09-09.parameter/Source :portkey.aws.rds.-2013-09-09.parameter/MinimumEngineVersion :portkey.aws.rds.-2013-09-09.parameter/AllowedValues :portkey.aws.rds.-2013-09-09.parameter/ApplyType :portkey.aws.rds.-2013-09-09.parameter/Description :portkey.aws.rds.-2013-09-09/ApplyMethod :portkey.aws.rds.-2013-09-09.parameter/IsModifiable :portkey.aws.rds.-2013-09-09.parameter/ParameterValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/vpc-security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedblog-files-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/describedblog-files-details))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group-membership/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsecurity-group-membership/DBSecurityGroupName :portkey.aws.rds.-2013-09-09.dbsecurity-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/secondary-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/read-replicadbinstance-identifiers (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/read-replicadbinstance-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/read-replica-sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/option-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-group-status-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/vpc-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/dbinstance-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/status-infos (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbinstance-status-info-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance/latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbinstance/BackupRetentionPeriod :portkey.aws.rds.-2013-09-09.dbinstance/DBSecurityGroups :portkey.aws.rds.-2013-09-09.dbinstance/SecondaryAvailabilityZone :portkey.aws.rds.-2013-09-09.dbinstance/CharacterSetName :portkey.aws.rds.-2013-09-09.dbinstance/PubliclyAccessible :portkey.aws.rds.-2013-09-09.dbinstance/ReadReplicaDBInstanceIdentifiers :portkey.aws.rds.-2013-09-09.dbinstance/PreferredMaintenanceWindow :portkey.aws.rds.-2013-09-09.dbinstance/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.dbinstance/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.dbinstance/DBName :portkey.aws.rds.-2013-09-09.dbinstance/InstanceCreateTime :portkey.aws.rds.-2013-09-09.dbinstance/AvailabilityZone :portkey.aws.rds.-2013-09-09.dbinstance/ReadReplicaSourceDBInstanceIdentifier :portkey.aws.rds.-2013-09-09.dbinstance/LicenseModel :portkey.aws.rds.-2013-09-09.dbinstance/AllocatedStorage :portkey.aws.rds.-2013-09-09.dbinstance/MasterUsername :portkey.aws.rds.-2013-09-09.dbinstance/EngineVersion :portkey.aws.rds.-2013-09-09.dbinstance/Iops :portkey.aws.rds.-2013-09-09/Endpoint :portkey.aws.rds.-2013-09-09.dbinstance/OptionGroupMemberships :portkey.aws.rds.-2013-09-09.dbinstance/DBInstanceClass :portkey.aws.rds.-2013-09-09.dbinstance/DBParameterGroups :portkey.aws.rds.-2013-09-09.dbinstance/VpcSecurityGroups :portkey.aws.rds.-2013-09-09.dbinstance/Engine :portkey.aws.rds.-2013-09-09.dbinstance/DBInstanceStatus :portkey.aws.rds.-2013-09-09.dbinstance/StatusInfos :portkey.aws.rds.-2013-09-09.dbinstance/MultiAZ :portkey.aws.rds.-2013-09-09.dbinstance/PreferredBackupWindow :portkey.aws.rds.-2013-09-09/PendingModifiedValues :portkey.aws.rds.-2013-09-09.dbinstance/LatestRestorableTime :portkey.aws.rds.-2013-09-09/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-allowed-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/tstamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/ReservedDBInstancesOfferingId] :opt-un [:portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/ReservedDBInstanceId :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/DBInstanceCount :portkey.aws.rds.-2013-09-09.purchase-reserveddbinstances-offering-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbsecurity-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-categories-map/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.event-categories-map/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-categories-map (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.event-categories-map/SourceType :portkey.aws.rds.-2013-09-09.event-categories-map/EventCategories] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-subscription-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/source-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/source-ids-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.create-event-subscription-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/create-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.create-event-subscription-message/SubscriptionName :portkey.aws.rds.-2013-09-09.create-event-subscription-message/SnsTopicArn] :opt-un [:portkey.aws.rds.-2013-09-09.create-event-subscription-message/SourceType :portkey.aws.rds.-2013-09-09.create-event-subscription-message/EventCategories :portkey.aws.rds.-2013-09-09.create-event-subscription-message/SourceIds :portkey.aws.rds.-2013-09-09.create-event-subscription-message/Enabled :portkey.aws.rds.-2013-09-09.create-event-subscription-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-response/describedblog-files (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/describedblog-files-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-response/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedblog-files-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedblog-files-response/DescribeDBLogFiles :portkey.aws.rds.-2013-09-09.describedblog-files-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/recurring-charge-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/recurring-charge))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-categories-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbengine-version-message/dbengine-versions (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbengine-version-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbengine-version-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbengine-version-message/Marker :portkey.aws.rds.-2013-09-09.dbengine-version-message/DBEngineVersions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbinstance-message/dbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbinstance-message/Marker :portkey.aws.rds.-2013-09-09.dbinstance-message/DBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-supported-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbparameter-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBParameterGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/filename-contains (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/file-last-written (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/file-size (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedblog-files-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedblog-files-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.describedblog-files-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.describedblog-files-message/FilenameContains :portkey.aws.rds.-2013-09-09.describedblog-files-message/FileLastWritten :portkey.aws.rds.-2013-09-09.describedblog-files-message/FileSize :portkey.aws.rds.-2013-09-09.describedblog-files-message/Filters :portkey.aws.rds.-2013-09-09.describedblog-files-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedblog-files-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/apply-method {"immediate" "immediate", :immediate "immediate", "pending-reboot" "pending-reboot", :pending-reboot "pending-reboot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.endpoint/address (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.endpoint/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.endpoint/Address :portkey.aws.rds.-2013-09-09.endpoint/Port] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbparameter-group/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbparameter-group/DBParameterGroupName :portkey.aws.rds.-2013-09-09.dbparameter-group/DBParameterGroupFamily :portkey.aws.rds.-2013-09-09.dbparameter-group/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/supported-character-sets-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/character-set))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invalid-restore-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-membership/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-group-membership/OptionGroupName :portkey.aws.rds.-2013-09-09.option-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/state (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.reserveddbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.reserveddbinstance/ReservedDBInstanceId :portkey.aws.rds.-2013-09-09.reserveddbinstance/CurrencyCode :portkey.aws.rds.-2013-09-09.reserveddbinstance/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-09-09.reserveddbinstance/StartTime :portkey.aws.rds.-2013-09-09.reserveddbinstance/FixedPrice :portkey.aws.rds.-2013-09-09.reserveddbinstance/DBInstanceCount :portkey.aws.rds.-2013-09-09.reserveddbinstance/Duration :portkey.aws.rds.-2013-09-09.reserveddbinstance/UsagePrice :portkey.aws.rds.-2013-09-09.reserveddbinstance/ProductDescription :portkey.aws.rds.-2013-09-09.reserveddbinstance/DBInstanceClass :portkey.aws.rds.-2013-09-09.reserveddbinstance/State :portkey.aws.rds.-2013-09-09.reserveddbinstance/RecurringCharges :portkey.aws.rds.-2013-09-09.reserveddbinstance/OfferingType :portkey.aws.rds.-2013-09-09.reserveddbinstance/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/DBParameterGroupName :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/Filters :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbparameter-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbsubnet-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.iprange/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.iprange/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/iprange (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.iprange/Status :portkey.aws.rds.-2013-09-09.iprange/CIDRIP] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.character-set/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.character-set/character-set-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/character-set (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.character-set/CharacterSetName :portkey.aws.rds.-2013-09-09.character-set/CharacterSetDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbparameter-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-group-option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-group-option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modify-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.tag/key (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.tag/value (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.tag/Key :portkey.aws.rds.-2013-09-09.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-categories-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-event-categories-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-event-categories-message/SourceType :portkey.aws.rds.-2013-09-09.describe-event-categories-message/Filters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/boolean-optional clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/snsinvalid-topic-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/options-depended-on (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/data-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/value (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/default-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/is-collection (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-setting/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.option-setting/DataType :portkey.aws.rds.-2013-09-09.option-setting/AllowedValues :portkey.aws.rds.-2013-09-09.option-setting/Value :portkey.aws.rds.-2013-09-09.option-setting/ApplyType :portkey.aws.rds.-2013-09-09.option-setting/Description :portkey.aws.rds.-2013-09-09.option-setting/DefaultValue :portkey.aws.rds.-2013-09-09.option-setting/IsModifiable :portkey.aws.rds.-2013-09-09.option-setting/IsCollection :portkey.aws.rds.-2013-09-09.option-setting/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.list-tags-for-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.list-tags-for-resource-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/list-tags-for-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.list-tags-for-resource-message/ResourceName] :opt-un [:portkey.aws.rds.-2013-09-09.list-tags-for-resource-message/Filters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.deletedbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.deletedbsubnet-group-message/DBSubnetGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/deletedbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/delete-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-configuration))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/log-file-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/number-of-lines (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/LogFileName] :opt-un [:portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/Marker :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-message/NumberOfLines] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsecurity-group-message/Marker :portkey.aws.rds.-2013-09-09/DBSecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/DBSecurityGroupName :portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/DBSecurityGroupDescription] :opt-un [:portkey.aws.rds.-2013-09-09.createdbsecurity-group-message/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/event-subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/event-subscription))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsnapshot-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbsnapshot))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.engine-defaults/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.engine-defaults/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.engine-defaults/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/engine-defaults (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.engine-defaults/DBParameterGroupFamily :portkey.aws.rds.-2013-09-09.engine-defaults/Marker :portkey.aws.rds.-2013-09-09.engine-defaults/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbsubnet-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-configuration/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-configuration/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-configuration/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-configuration/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.option-configuration/option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-settings-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-configuration (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.option-configuration/OptionName] :opt-un [:portkey.aws.rds.-2013-09-09.option-configuration/Port :portkey.aws.rds.-2013-09-09.option-configuration/DBSecurityGroupMemberships :portkey.aws.rds.-2013-09-09.option-configuration/VpcSecurityGroupMemberships :portkey.aws.rds.-2013-09-09.option-configuration/OptionSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbsnapshot-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/ec2-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/ec2-security-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsecurity-group/ipranges (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/iprange-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsecurity-group/OwnerId :portkey.aws.rds.-2013-09-09.dbsecurity-group/DBSecurityGroupName :portkey.aws.rds.-2013-09-09.dbsecurity-group/DBSecurityGroupDescription :portkey.aws.rds.-2013-09-09.dbsecurity-group/VpcId :portkey.aws.rds.-2013-09-09.dbsecurity-group/EC2SecurityGroups :portkey.aws.rds.-2013-09-09.dbsecurity-group/IPRanges] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-offerings-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/Marker :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/Duration :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/Filters :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/ProductDescription :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/OfferingType :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-offerings-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbsecurity-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/DBSecurityGroupName :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/Filters :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbsecurity-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.delete-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/delete-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.delete-option-group-message/OptionGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbinstance-status-info-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/dbinstance-status-info))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameters-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameters-message/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameters-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describedbparameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describedbparameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.describedbparameters-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-09-09.describedbparameters-message/Source :portkey.aws.rds.-2013-09-09.describedbparameters-message/Filters :portkey.aws.rds.-2013-09-09.describedbparameters-message/MaxRecords :portkey.aws.rds.-2013-09-09.describedbparameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/reserveddbinstance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/ReservedDBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/ReservedDBInstanceId :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/Marker :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/Duration :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/Filters :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/ProductDescription :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/OfferingType :portkey.aws.rds.-2013-09-09.describe-reserveddbinstances-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-09-09.revokedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/availability-zones (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/multiazcapable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/read-replica-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/orderabledbinstance-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.orderabledbinstance-option/Engine :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/EngineVersion :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/DBInstanceClass :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/LicenseModel :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/AvailabilityZones :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/MultiAZCapable :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/ReadReplicaCapable :portkey.aws.rds.-2013-09-09.orderabledbinstance-option/Vpc] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.pending-modified-values/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/pending-modified-values (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.pending-modified-values/BackupRetentionPeriod :portkey.aws.rds.-2013-09-09.pending-modified-values/DBInstanceIdentifier :portkey.aws.rds.-2013-09-09.pending-modified-values/MasterUserPassword :portkey.aws.rds.-2013-09-09.pending-modified-values/AllocatedStorage :portkey.aws.rds.-2013-09-09.pending-modified-values/EngineVersion :portkey.aws.rds.-2013-09-09.pending-modified-values/Port :portkey.aws.rds.-2013-09-09.pending-modified-values/Iops :portkey.aws.rds.-2013-09-09.pending-modified-values/DBInstanceClass :portkey.aws.rds.-2013-09-09.pending-modified-values/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/subnet))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/filter-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-09-09/filter))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/log-file-data (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/additional-data-pending (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/LogFileData :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/Marker :portkey.aws.rds.-2013-09-09.downloaddblog-file-portion-details/AdditionalDataPending] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/invaliddbparameter-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/newdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/allow-major-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modifydbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modifydbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.modifydbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-09-09.modifydbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-09-09.modifydbinstance-message/OptionGroupName :portkey.aws.rds.-2013-09-09.modifydbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-09-09.modifydbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-09-09.modifydbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-09-09.modifydbinstance-message/NewDBInstanceIdentifier :portkey.aws.rds.-2013-09-09.modifydbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-09-09.modifydbinstance-message/MasterUserPassword :portkey.aws.rds.-2013-09-09.modifydbinstance-message/AllowMajorVersionUpgrade :portkey.aws.rds.-2013-09-09.modifydbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-09-09.modifydbinstance-message/EngineVersion :portkey.aws.rds.-2013-09-09.modifydbinstance-message/Iops :portkey.aws.rds.-2013-09-09.modifydbinstance-message/ApplyImmediately :portkey.aws.rds.-2013-09-09.modifydbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-09-09.modifydbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-09-09.modifydbinstance-message/MultiAZ :portkey.aws.rds.-2013-09-09.modifydbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-option-group-message/options-to-include (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-configuration-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-option-group-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-names-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-option-group-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modify-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.modify-option-group-message/OptionGroupName] :opt-un [:portkey.aws.rds.-2013-09-09.modify-option-group-message/OptionsToInclude :portkey.aws.rds.-2013-09-09.modify-option-group-message/OptionsToRemove :portkey.aws.rds.-2013-09-09.modify-option-group-message/ApplyImmediately] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsecurity-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group/subnet-group-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.dbsubnet-group/subnets (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/subnet-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/dbsubnet-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.dbsubnet-group/DBSubnetGroupName :portkey.aws.rds.-2013-09-09.dbsubnet-group/DBSubnetGroupDescription :portkey.aws.rds.-2013-09-09.dbsubnet-group/VpcId :portkey.aws.rds.-2013-09-09.dbsubnet-group/SubnetGroupStatus :portkey.aws.rds.-2013-09-09.dbsubnet-group/Subnets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-groups-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-option-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-09-09.describe-option-groups-message/OptionGroupName :portkey.aws.rds.-2013-09-09.describe-option-groups-message/Filters :portkey.aws.rds.-2013-09-09.describe-option-groups-message/Marker :portkey.aws.rds.-2013-09-09.describe-option-groups-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-option-groups-message/EngineName :portkey.aws.rds.-2013-09-09.describe-option-groups-message/MajorEngineVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/modify-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.modify-event-subscription-message/SubscriptionName] :opt-un [:portkey.aws.rds.-2013-09-09.modify-event-subscription-message/SnsTopicArn :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/SourceType :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/EventCategories :portkey.aws.rds.-2013-09-09.modify-event-subscription-message/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/filters (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/filter-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-09-09/describe-option-group-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-09-09.describe-option-group-options-message/EngineName] :opt-un [:portkey.aws.rds.-2013-09-09.describe-option-group-options-message/MajorEngineVersion :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/Filters :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/MaxRecords :portkey.aws.rds.-2013-09-09.describe-option-group-options-message/Marker] :locations {}))

(clojure.core/defn add-source-identifier-to-subscription ([add-source-identifier-to-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-source-identifier-to-subscription-message "AddSourceIdentifierToSubscription" add-source-identifier-to-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-09-09/source-not-found-fault}))))
(clojure.spec.alpha/fdef add-source-identifier-to-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/add-source-identifier-to-subscription-result))

(clojure.core/defn deletedbsnapshot ([deletedbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsnapshot-message "DeleteDBSnapshot" deletedbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/deletedbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/deletedbsnapshot-result {"InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/deletedbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/deletedbsnapshot-result))

(clojure.core/defn deletedbsubnet-group ([deletedbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsubnet-group-message "DeleteDBSubnetGroup" deletedbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/deletedbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSubnetGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsubnet-group-state-fault, "InvalidDBSubnetStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsubnet-state-fault, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/deletedbsubnet-group-message) :ret clojure.core/true?)

(clojure.core/defn describe-orderabledbinstance-options ([describe-orderabledbinstance-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-orderabledbinstance-options-message "DescribeOrderableDBInstanceOptions" describe-orderabledbinstance-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-orderabledbinstance-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/orderabledbinstance-options-message {}))))
(clojure.spec.alpha/fdef describe-orderabledbinstance-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/describe-orderabledbinstance-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/orderabledbinstance-options-message))

(clojure.core/defn revokedbsecurity-group-ingress ([revokedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-revokedbsecurity-group-ingress-message "RevokeDBSecurityGroupIngress" revokedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault, "AuthorizationNotFoundFault" :portkey.aws.rds.-2013-09-09/authorization-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsecurity-group-state-fault}))))
(clojure.spec.alpha/fdef revokedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/revokedbsecurity-group-ingress-result))

(clojure.core/defn authorizedbsecurity-group-ingress ([authorizedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-authorizedbsecurity-group-ingress-message "AuthorizeDBSecurityGroupIngress" authorizedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsecurity-group-state-fault, "AuthorizationAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/authorization-already-exists-fault, "AuthorizationQuotaExceededFault" :portkey.aws.rds.-2013-09-09/authorization-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef authorizedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/authorizedbsecurity-group-ingress-result))

(clojure.core/defn modifydbsubnet-group ([modifydbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbsubnet-group-message "ModifyDBSubnetGroup" modifydbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-result {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-09-09/dbsubnet-quota-exceeded-fault, "SubnetAlreadyInUse" :portkey.aws.rds.-2013-09-09/subnet-already-in-use, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet}))))
(clojure.spec.alpha/fdef modifydbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/modifydbsubnet-group-result))

(clojure.core/defn restoredbinstance-to-point-in-time ([restoredbinstance-to-point-in-time-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-to-point-in-time-message "RestoreDBInstanceToPointInTime" restoredbinstance-to-point-in-time-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-09-09/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault, "PointInTimeRestoreNotEnabledFault" :portkey.aws.rds.-2013-09-09/point-in-time-restore-not-enabled-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-09-09/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-to-point-in-time :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/restoredbinstance-to-point-in-time-result))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-events-message "DescribeEvents" describe-events-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-events-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/events-message {}))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/events-message))

(clojure.core/defn resetdbparameter-group ([resetdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-resetdbparameter-group-message "ResetDBParameterGroup" resetdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/resetdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbparameter-group-name-message {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef resetdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/resetdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-group-name-message))

(clojure.core/defn describe-option-groups ([] (describe-option-groups {})) ([describe-option-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-groups-message "DescribeOptionGroups" describe-option-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-option-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/option-groups {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef describe-option-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-option-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-groups))

(clojure.core/defn rebootdbinstance ([rebootdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-rebootdbinstance-message "RebootDBInstance" rebootdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/rebootdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/rebootdbinstance-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef rebootdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/rebootdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/rebootdbinstance-result))

(clojure.core/defn deletedbsecurity-group ([deletedbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsecurity-group-message "DeleteDBSecurityGroup" deletedbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/deletedbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsecurity-group-state-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/deletedbsecurity-group-message) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-list-tags-for-resource-message "ListTagsForResource" list-tags-for-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/list-tags-for-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/tag-list-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/tag-list-message))

(clojure.core/defn describe-engine-default-parameters ([describe-engine-default-parameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-engine-default-parameters-message "DescribeEngineDefaultParameters" describe-engine-default-parameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-result {}))))
(clojure.spec.alpha/fdef describe-engine-default-parameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/describe-engine-default-parameters-result))

(clojure.core/defn deletedbinstance ([deletedbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbinstance-message "DeleteDBInstance" deletedbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/deletedbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/deletedbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-already-exists-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-09-09/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef deletedbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/deletedbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/deletedbinstance-result))

(clojure.core/defn describedbsubnet-groups ([] (describedbsubnet-groups {})) ([describedbsubnet-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsubnet-groups-message "DescribeDBSubnetGroups" describedbsubnet-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbsubnet-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbsubnet-group-message {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsubnet-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbsubnet-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsubnet-group-message))

(clojure.core/defn createdbinstance ([createdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-message "CreateDBInstance" createdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbinstance-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-09-09/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbinstance-result))

(clojure.core/defn promote-read-replica ([promote-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-promote-read-replica-message "PromoteReadReplica" promote-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/promote-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/promote-read-replica-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef promote-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/promote-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/promote-read-replica-result))

(clojure.core/defn delete-event-subscription ([delete-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-event-subscription-message "DeleteEventSubscription" delete-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/delete-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/delete-event-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-not-found-fault, "InvalidEventSubscriptionStateFault" :portkey.aws.rds.-2013-09-09/invalid-event-subscription-state-fault}))))
(clojure.spec.alpha/fdef delete-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/delete-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/delete-event-subscription-result))

(clojure.core/defn describedblog-files ([describedblog-files-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedblog-files-message "DescribeDBLogFiles" describedblog-files-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedblog-files-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/describedblog-files-response {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describedblog-files :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/describedblog-files-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/describedblog-files-response))

(clojure.core/defn restoredbinstance-fromdbsnapshot ([restoredbinstance-fromdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-fromdbsnapshot-message "RestoreDBInstanceFromDBSnapshot" restoredbinstance-fromdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-09-09/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-09-09/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-fromdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/restoredbinstance-fromdbsnapshot-result))

(clojure.core/defn describedbsnapshots ([] (describedbsnapshots {})) ([describedbsnapshots-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsnapshots-message "DescribeDBSnapshots" describedbsnapshots-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbsnapshots-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbsnapshot-message {"DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsnapshots :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbsnapshots-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsnapshot-message))

(clojure.core/defn createdbsubnet-group ([createdbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsubnet-group-message "CreateDBSubnetGroup" createdbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbsubnet-group-result {"DBSubnetGroupAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-already-exists-fault, "DBSubnetGroupQuotaExceededFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-quota-exceeded-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-09-09/dbsubnet-quota-exceeded-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet}))))
(clojure.spec.alpha/fdef createdbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbsubnet-group-result))

(clojure.core/defn remove-source-identifier-from-subscription ([remove-source-identifier-from-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-source-identifier-from-subscription-message "RemoveSourceIdentifierFromSubscription" remove-source-identifier-from-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-09-09/source-not-found-fault}))))
(clojure.spec.alpha/fdef remove-source-identifier-from-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/remove-source-identifier-from-subscription-result))

(clojure.core/defn create-option-group ([create-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-option-group-message "CreateOptionGroup" create-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/create-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/create-option-group-result {"OptionGroupAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/option-group-already-exists-fault, "OptionGroupQuotaExceededFault" :portkey.aws.rds.-2013-09-09/option-group-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef create-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/create-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/create-option-group-result))

(clojure.core/defn describe-event-categories ([] (describe-event-categories {})) ([describe-event-categories-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-categories-message "DescribeEventCategories" describe-event-categories-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-event-categories-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/event-categories-message {}))))
(clojure.spec.alpha/fdef describe-event-categories :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-event-categories-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-categories-message))

(clojure.core/defn describe-reserveddbinstances-offerings ([] (describe-reserveddbinstances-offerings {})) ([describe-reserveddbinstances-offerings-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-offerings-message "DescribeReservedDBInstancesOfferings" describe-reserveddbinstances-offerings-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-offerings-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-message {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances-offerings :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-offerings-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-message))

(clojure.core/defn createdbsnapshot ([createdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsnapshot-message "CreateDBSnapshot" createdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-already-exists-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-09-09/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef createdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbsnapshot-result))

(clojure.core/defn downloaddblog-file-portion ([downloaddblog-file-portion-message] (clojure.core/let [req<-input__36755__auto__ (req<-downloaddblog-file-portion-message "DownloadDBLogFilePortion" downloaddblog-file-portion-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-details {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "DBLogFileNotFoundFault" :portkey.aws.rds.-2013-09-09/dblog-file-not-found-fault}))))
(clojure.spec.alpha/fdef downloaddblog-file-portion :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/downloaddblog-file-portion-details))

(clojure.core/defn describedbinstances ([] (describedbinstances {})) ([describedbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbinstances-message "DescribeDBInstances" describedbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbinstance-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describedbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbinstance-message))

(clojure.core/defn modify-event-subscription ([modify-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-event-subscription-message "ModifyEventSubscription" modify-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/modify-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/modify-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-09-09/event-subscription-quota-exceeded-fault, "SubscriptionNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-not-found-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-09-09/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-09-09/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-09-09/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-category-not-found-fault}))))
(clojure.spec.alpha/fdef modify-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/modify-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/modify-event-subscription-result))

(clojure.core/defn describedbengine-versions ([] (describedbengine-versions {})) ([describedbengine-versions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbengine-versions-message "DescribeDBEngineVersions" describedbengine-versions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbengine-versions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbengine-version-message {}))))
(clojure.spec.alpha/fdef describedbengine-versions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbengine-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbengine-version-message))

(clojure.core/defn describe-option-group-options ([describe-option-group-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-group-options-message "DescribeOptionGroupOptions" describe-option-group-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-option-group-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/option-group-options-message {}))))
(clojure.spec.alpha/fdef describe-option-group-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/describe-option-group-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/option-group-options-message))

(clojure.core/defn createdbsecurity-group ([createdbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsecurity-group-message "CreateDBSecurityGroup" createdbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbsecurity-group-result {"DBSecurityGroupAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-already-exists-fault, "DBSecurityGroupQuotaExceededFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-quota-exceeded-fault, "DBSecurityGroupNotSupportedFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-supported-fault}))))
(clojure.spec.alpha/fdef createdbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbsecurity-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbsecurity-group-result))

(clojure.core/defn delete-option-group ([delete-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-option-group-message "DeleteOptionGroup" delete-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/delete-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-09-09/invalid-option-group-state-fault}))))
(clojure.spec.alpha/fdef delete-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/delete-option-group-message) :ret clojure.core/true?)

(clojure.core/defn create-event-subscription ([create-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-event-subscription-message "CreateEventSubscription" create-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/create-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/create-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-09-09/event-subscription-quota-exceeded-fault, "SubscriptionAlreadyExistFault" :portkey.aws.rds.-2013-09-09/subscription-already-exist-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-09-09/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-09-09/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-09-09/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-category-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-09-09/source-not-found-fault}))))
(clojure.spec.alpha/fdef create-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/create-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/create-event-subscription-result))

(clojure.core/defn createdbparameter-group ([createdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbparameter-group-message "CreateDBParameterGroup" createdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbparameter-group-result {"DBParameterGroupQuotaExceededFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-quota-exceeded-fault, "DBParameterGroupAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-already-exists-fault}))))
(clojure.spec.alpha/fdef createdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbparameter-group-result))

(clojure.core/defn purchase-reserveddbinstances-offering ([purchase-reserveddbinstances-offering-message] (clojure.core/let [req<-input__36755__auto__ (req<-purchase-reserveddbinstances-offering-message "PurchaseReservedDBInstancesOffering" purchase-reserveddbinstances-offering-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-result {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-09-09/reserveddbinstances-offering-not-found-fault, "ReservedDBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/reserveddbinstance-already-exists-fault, "ReservedDBInstanceQuotaExceededFault" :portkey.aws.rds.-2013-09-09/reserveddbinstance-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef purchase-reserveddbinstances-offering :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/purchase-reserveddbinstances-offering-result))

(clojure.core/defn deletedbparameter-group ([deletedbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbparameter-group-message "DeleteDBParameterGroup" deletedbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/deletedbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/deletedbparameter-group-message) :ret clojure.core/true?)

(clojure.core/defn copydbsnapshot ([copydbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-copydbsnapshot-message "CopyDBSnapshot" copydbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/copydbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/copydbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-already-exists-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsnapshot-state-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-09-09/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef copydbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/copydbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/copydbsnapshot-result))

(clojure.core/defn describe-reserveddbinstances ([] (describe-reserveddbinstances {})) ([describe-reserveddbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-message "DescribeReservedDBInstances" describe-reserveddbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/reserveddbinstance-message {"ReservedDBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/reserveddbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-reserveddbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/reserveddbinstance-message))

(clojure.core/defn describe-event-subscriptions ([] (describe-event-subscriptions {})) ([describe-event-subscriptions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-subscriptions-message "DescribeEventSubscriptions" describe-event-subscriptions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describe-event-subscriptions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/event-subscriptions-message {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-09-09/subscription-not-found-fault}))))
(clojure.spec.alpha/fdef describe-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describe-event-subscriptions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/event-subscriptions-message))

(clojure.core/defn modifydbinstance ([modifydbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbinstance-message "ModifyDBInstance" modifydbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/modifydbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/modifydbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbsecurity-group-state-fault, "DBUpgradeDependencyFailureFault" :portkey.aws.rds.-2013-09-09/dbupgrade-dependency-failure-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef modifydbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/modifydbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/modifydbinstance-result))

(clojure.core/defn describedbparameters ([describedbparameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameters-message "DescribeDBParameters" describedbparameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbparameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbparameter-group-details {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/describedbparameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-group-details))

(clojure.core/defn modify-option-group ([modify-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-option-group-message "ModifyOptionGroup" modify-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/modify-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/modify-option-group-result {"InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-09-09/invalid-option-group-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef modify-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/modify-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/modify-option-group-result))

(clojure.core/defn describedbparameter-groups ([] (describedbparameter-groups {})) ([describedbparameter-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameter-groups-message "DescribeDBParameterGroups" describedbparameter-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbparameter-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbparameter-groups-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameter-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbparameter-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-groups-message))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-tags-from-resource-message "RemoveTagsFromResource" remove-tags-from-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/remove-tags-from-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/remove-tags-from-resource-message) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-tags-to-resource-message "AddTagsToResource" add-tags-to-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/add-tags-to-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/add-tags-to-resource-message) :ret clojure.core/true?)

(clojure.core/defn modifydbparameter-group ([modifydbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbparameter-group-message "ModifyDBParameterGroup" modifydbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/modifydbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbparameter-group-name-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault, "InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-09-09/invaliddbparameter-group-state-fault}))))
(clojure.spec.alpha/fdef modifydbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/modifydbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbparameter-group-name-message))

(clojure.core/defn describedbsecurity-groups ([] (describedbsecurity-groups {})) ([describedbsecurity-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsecurity-groups-message "DescribeDBSecurityGroups" describedbsecurity-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/describedbsecurity-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/dbsecurity-group-message {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsecurity-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-09-09/describedbsecurity-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/dbsecurity-group-message))

(clojure.core/defn createdbinstance-read-replica ([createdbinstance-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-read-replica-message "CreateDBInstanceReadReplica" createdbinstance-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-09-09/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-09-09/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-09-09/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-09-09/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-09-09/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-09-09/dbinstance-already-exists-fault, "InvalidDBSubnetGroupFault" :portkey.aws.rds.-2013-09-09/invaliddbsubnet-group-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-09-09/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-09-09/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-09-09/provisioned-iops-not-available-inazfault, "DBSubnetGroupNotAllowedFault" :portkey.aws.rds.-2013-09-09/dbsubnet-group-not-allowed-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-09-09/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-09-09/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-09-09/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-09-09/createdbinstance-read-replica-result))
