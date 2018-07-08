(ns portkey.aws.rds.-2013-02-12 (:require [portkey.aws]))

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

(clojure.core/declare ser-subnet-identifier-list ser-parameters-list ser-source-ids-list ser-key-list ser-option-names-list ser-source-type ser-tag-list ser-integer ser-string ser-parameter ser-vpc-security-group-id-list ser-tstamp ser-event-categories-list ser-dbsecurity-group-name-list ser-apply-method ser-long ser-tag ser-boolean-optional ser-option-setting ser-option-configuration-list ser-option-configuration ser-integer-optional ser-option-settings-list ser-boolean)

(clojure.core/defn- ser-subnet-identifier-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-parameters-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
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
(clojure.core/defn- ser-boolean [shape-input] shape-input)

(clojure.core/defn req<-add-source-identifier-to-subscription-message [action-name66282 input66281] {:body {"SubscriptionName" (ser-string (input66281 :subscription-name)), "SourceIdentifier" (ser-string (input66281 :source-identifier)), "Version" "2013-02-12", "Action" action-name66282}})
(clojure.core/defn req<-deletedbsnapshot-message [action-name66284 input66283] {:body {"DBSnapshotIdentifier" (ser-string (input66283 :dbsnapshot-identifier)), "Version" "2013-02-12", "Action" action-name66284}})
(clojure.core/defn req<-deletedbsubnet-group-message [action-name66286 input66285] {:body {"DBSubnetGroupName" (ser-string (input66285 :dbsubnet-group-name)), "Version" "2013-02-12", "Action" action-name66286}})
(clojure.core/defn req<-describe-orderabledbinstance-options-message [action-name66288 input66287] (clojure.core/let [input66289 {:body {"Engine" (ser-string (input66287 :engine)), "Version" "2013-02-12", "Action" action-name66288}}] (clojure.core/cond-> input66289 (clojure.core/contains? input66287 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input66287 :engine-version))) (clojure.core/contains? input66287 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66287 :dbinstance-class))) (clojure.core/contains? input66287 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input66287 :license-model))) (clojure.core/contains? input66287 :vpc) (clojure.core/assoc-in [:body "Vpc"] (ser-boolean-optional (input66287 :vpc))) (clojure.core/contains? input66287 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66287 :max-records))) (clojure.core/contains? input66287 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66287 :marker))))))
(clojure.core/defn req<-revokedbsecurity-group-ingress-message [action-name66291 input66290] (clojure.core/let [input66292 {:body {"DBSecurityGroupName" (ser-string (input66290 :dbsecurity-group-name)), "Version" "2013-02-12", "Action" action-name66291}}] (clojure.core/cond-> input66292 (clojure.core/contains? input66290 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input66290 :cidrip))) (clojure.core/contains? input66290 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input66290 :ec2-security-group-name))) (clojure.core/contains? input66290 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input66290 :ec2-security-group-id))) (clojure.core/contains? input66290 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input66290 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-authorizedbsecurity-group-ingress-message [action-name66294 input66293] (clojure.core/let [input66295 {:body {"DBSecurityGroupName" (ser-string (input66293 :dbsecurity-group-name)), "Version" "2013-02-12", "Action" action-name66294}}] (clojure.core/cond-> input66295 (clojure.core/contains? input66293 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input66293 :cidrip))) (clojure.core/contains? input66293 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input66293 :ec2-security-group-name))) (clojure.core/contains? input66293 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input66293 :ec2-security-group-id))) (clojure.core/contains? input66293 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input66293 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-modifydbsubnet-group-message [action-name66297 input66296] (clojure.core/let [input66298 {:body {"DBSubnetGroupName" (ser-string (input66296 :dbsubnet-group-name)), "SubnetIds" (ser-subnet-identifier-list (input66296 :subnet-ids)), "Version" "2013-02-12", "Action" action-name66297}}] (clojure.core/cond-> input66298 (clojure.core/contains? input66296 :dbsubnet-group-description) (clojure.core/assoc-in [:body "DBSubnetGroupDescription"] (ser-string (input66296 :dbsubnet-group-description))))))
(clojure.core/defn req<-restoredbinstance-to-point-in-time-message [action-name66300 input66299] (clojure.core/let [input66301 {:body {"SourceDBInstanceIdentifier" (ser-string (input66299 :sourcedbinstance-identifier)), "TargetDBInstanceIdentifier" (ser-string (input66299 :targetdbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66300}}] (clojure.core/cond-> input66301 (clojure.core/contains? input66299 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66299 :option-group-name))) (clojure.core/contains? input66299 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input66299 :publicly-accessible))) (clojure.core/contains? input66299 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input66299 :auto-minor-version-upgrade))) (clojure.core/contains? input66299 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input66299 :dbname))) (clojure.core/contains? input66299 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input66299 :availability-zone))) (clojure.core/contains? input66299 :restore-time) (clojure.core/assoc-in [:body "RestoreTime"] (ser-tstamp (input66299 :restore-time))) (clojure.core/contains? input66299 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input66299 :license-model))) (clojure.core/contains? input66299 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input66299 :dbsubnet-group-name))) (clojure.core/contains? input66299 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input66299 :port))) (clojure.core/contains? input66299 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input66299 :iops))) (clojure.core/contains? input66299 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66299 :dbinstance-class))) (clojure.core/contains? input66299 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input66299 :engine))) (clojure.core/contains? input66299 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66299 :multiaz))) (clojure.core/contains? input66299 :use-latest-restorable-time) (clojure.core/assoc-in [:body "UseLatestRestorableTime"] (ser-boolean (input66299 :use-latest-restorable-time))))))
(clojure.core/defn req<-describe-events-message [action-name66303 input66302] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66303}} (clojure.core/contains? input66302 :source-identifier) (clojure.core/assoc-in [:body "SourceIdentifier"] (ser-string (input66302 :source-identifier))) (clojure.core/contains? input66302 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-source-type (input66302 :source-type))) (clojure.core/contains? input66302 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-tstamp (input66302 :start-time))) (clojure.core/contains? input66302 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-tstamp (input66302 :end-time))) (clojure.core/contains? input66302 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-integer-optional (input66302 :duration))) (clojure.core/contains? input66302 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input66302 :event-categories))) (clojure.core/contains? input66302 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66302 :max-records))) (clojure.core/contains? input66302 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66302 :marker)))))
(clojure.core/defn req<-resetdbparameter-group-message [action-name66305 input66304] (clojure.core/let [input66306 {:body {"DBParameterGroupName" (ser-string (input66304 :dbparameter-group-name)), "Version" "2013-02-12", "Action" action-name66305}}] (clojure.core/cond-> input66306 (clojure.core/contains? input66304 :reset-all-parameters) (clojure.core/assoc-in [:body "ResetAllParameters"] (ser-boolean (input66304 :reset-all-parameters))) (clojure.core/contains? input66304 :parameters) (clojure.core/assoc-in [:body "Parameters"] (ser-parameters-list (input66304 :parameters))))))
(clojure.core/defn req<-describe-option-groups-message [action-name66308 input66307] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66308}} (clojure.core/contains? input66307 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66307 :option-group-name))) (clojure.core/contains? input66307 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66307 :marker))) (clojure.core/contains? input66307 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66307 :max-records))) (clojure.core/contains? input66307 :engine-name) (clojure.core/assoc-in [:body "EngineName"] (ser-string (input66307 :engine-name))) (clojure.core/contains? input66307 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input66307 :major-engine-version)))))
(clojure.core/defn req<-rebootdbinstance-message [action-name66310 input66309] (clojure.core/let [input66311 {:body {"DBInstanceIdentifier" (ser-string (input66309 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66310}}] (clojure.core/cond-> input66311 (clojure.core/contains? input66309 :force-failover) (clojure.core/assoc-in [:body "ForceFailover"] (ser-boolean-optional (input66309 :force-failover))))))
(clojure.core/defn req<-deletedbsecurity-group-message [action-name66313 input66312] {:body {"DBSecurityGroupName" (ser-string (input66312 :dbsecurity-group-name)), "Version" "2013-02-12", "Action" action-name66313}})
(clojure.core/defn req<-list-tags-for-resource-message [action-name66315 input66314] {:body {"ResourceName" (ser-string (input66314 :resource-name)), "Version" "2013-02-12", "Action" action-name66315}})
(clojure.core/defn req<-describe-engine-default-parameters-message [action-name66317 input66316] (clojure.core/let [input66318 {:body {"DBParameterGroupFamily" (ser-string (input66316 :dbparameter-group-family)), "Version" "2013-02-12", "Action" action-name66317}}] (clojure.core/cond-> input66318 (clojure.core/contains? input66316 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66316 :max-records))) (clojure.core/contains? input66316 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66316 :marker))))))
(clojure.core/defn req<-deletedbinstance-message [action-name66320 input66319] (clojure.core/let [input66321 {:body {"DBInstanceIdentifier" (ser-string (input66319 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66320}}] (clojure.core/cond-> input66321 (clojure.core/contains? input66319 :skip-final-snapshot) (clojure.core/assoc-in [:body "SkipFinalSnapshot"] (ser-boolean (input66319 :skip-final-snapshot))) (clojure.core/contains? input66319 :finaldbsnapshot-identifier) (clojure.core/assoc-in [:body "FinalDBSnapshotIdentifier"] (ser-string (input66319 :finaldbsnapshot-identifier))))))
(clojure.core/defn req<-describedbsubnet-groups-message [action-name66323 input66322] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66323}} (clojure.core/contains? input66322 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input66322 :dbsubnet-group-name))) (clojure.core/contains? input66322 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66322 :max-records))) (clojure.core/contains? input66322 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66322 :marker)))))
(clojure.core/defn req<-createdbinstance-message [action-name66325 input66324] (clojure.core/let [input66326 {:body {"DBInstanceIdentifier" (ser-string (input66324 :dbinstance-identifier)), "MasterUserPassword" (ser-string (input66324 :master-user-password)), "AllocatedStorage" (ser-integer-optional (input66324 :allocated-storage)), "MasterUsername" (ser-string (input66324 :master-username)), "DBInstanceClass" (ser-string (input66324 :dbinstance-class)), "Engine" (ser-string (input66324 :engine)), "Version" "2013-02-12", "Action" action-name66325}}] (clojure.core/cond-> input66326 (clojure.core/contains? input66324 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input66324 :backup-retention-period))) (clojure.core/contains? input66324 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66324 :option-group-name))) (clojure.core/contains? input66324 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input66324 :dbsecurity-groups))) (clojure.core/contains? input66324 :character-set-name) (clojure.core/assoc-in [:body "CharacterSetName"] (ser-string (input66324 :character-set-name))) (clojure.core/contains? input66324 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input66324 :publicly-accessible))) (clojure.core/contains? input66324 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input66324 :preferred-maintenance-window))) (clojure.core/contains? input66324 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input66324 :auto-minor-version-upgrade))) (clojure.core/contains? input66324 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input66324 :dbname))) (clojure.core/contains? input66324 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input66324 :vpc-security-group-ids))) (clojure.core/contains? input66324 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input66324 :availability-zone))) (clojure.core/contains? input66324 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input66324 :license-model))) (clojure.core/contains? input66324 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input66324 :engine-version))) (clojure.core/contains? input66324 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input66324 :dbsubnet-group-name))) (clojure.core/contains? input66324 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input66324 :port))) (clojure.core/contains? input66324 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input66324 :iops))) (clojure.core/contains? input66324 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input66324 :dbparameter-group-name))) (clojure.core/contains? input66324 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66324 :multiaz))) (clojure.core/contains? input66324 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input66324 :preferred-backup-window))))))
(clojure.core/defn req<-promote-read-replica-message [action-name66328 input66327] (clojure.core/let [input66329 {:body {"DBInstanceIdentifier" (ser-string (input66327 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66328}}] (clojure.core/cond-> input66329 (clojure.core/contains? input66327 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input66327 :backup-retention-period))) (clojure.core/contains? input66327 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input66327 :preferred-backup-window))))))
(clojure.core/defn req<-delete-event-subscription-message [action-name66331 input66330] {:body {"SubscriptionName" (ser-string (input66330 :subscription-name)), "Version" "2013-02-12", "Action" action-name66331}})
(clojure.core/defn req<-describedblog-files-message [action-name66333 input66332] (clojure.core/let [input66334 {:body {"DBInstanceIdentifier" (ser-string (input66332 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66333}}] (clojure.core/cond-> input66334 (clojure.core/contains? input66332 :filename-contains) (clojure.core/assoc-in [:body "FilenameContains"] (ser-string (input66332 :filename-contains))) (clojure.core/contains? input66332 :file-last-written) (clojure.core/assoc-in [:body "FileLastWritten"] (ser-long (input66332 :file-last-written))) (clojure.core/contains? input66332 :file-size) (clojure.core/assoc-in [:body "FileSize"] (ser-long (input66332 :file-size))) (clojure.core/contains? input66332 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66332 :max-records))) (clojure.core/contains? input66332 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66332 :marker))))))
(clojure.core/defn req<-restoredbinstance-fromdbsnapshot-message [action-name66336 input66335] (clojure.core/let [input66337 {:body {"DBInstanceIdentifier" (ser-string (input66335 :dbinstance-identifier)), "DBSnapshotIdentifier" (ser-string (input66335 :dbsnapshot-identifier)), "Version" "2013-02-12", "Action" action-name66336}}] (clojure.core/cond-> input66337 (clojure.core/contains? input66335 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66335 :option-group-name))) (clojure.core/contains? input66335 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input66335 :publicly-accessible))) (clojure.core/contains? input66335 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input66335 :auto-minor-version-upgrade))) (clojure.core/contains? input66335 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input66335 :dbname))) (clojure.core/contains? input66335 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input66335 :availability-zone))) (clojure.core/contains? input66335 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input66335 :license-model))) (clojure.core/contains? input66335 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input66335 :dbsubnet-group-name))) (clojure.core/contains? input66335 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input66335 :port))) (clojure.core/contains? input66335 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input66335 :iops))) (clojure.core/contains? input66335 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66335 :dbinstance-class))) (clojure.core/contains? input66335 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input66335 :engine))) (clojure.core/contains? input66335 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66335 :multiaz))))))
(clojure.core/defn req<-describedbsnapshots-message [action-name66339 input66338] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66339}} (clojure.core/contains? input66338 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input66338 :dbinstance-identifier))) (clojure.core/contains? input66338 :dbsnapshot-identifier) (clojure.core/assoc-in [:body "DBSnapshotIdentifier"] (ser-string (input66338 :dbsnapshot-identifier))) (clojure.core/contains? input66338 :snapshot-type) (clojure.core/assoc-in [:body "SnapshotType"] (ser-string (input66338 :snapshot-type))) (clojure.core/contains? input66338 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66338 :max-records))) (clojure.core/contains? input66338 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66338 :marker)))))
(clojure.core/defn req<-createdbsubnet-group-message [action-name66341 input66340] {:body {"DBSubnetGroupName" (ser-string (input66340 :dbsubnet-group-name)), "DBSubnetGroupDescription" (ser-string (input66340 :dbsubnet-group-description)), "SubnetIds" (ser-subnet-identifier-list (input66340 :subnet-ids)), "Version" "2013-02-12", "Action" action-name66341}})
(clojure.core/defn req<-remove-source-identifier-from-subscription-message [action-name66343 input66342] {:body {"SubscriptionName" (ser-string (input66342 :subscription-name)), "SourceIdentifier" (ser-string (input66342 :source-identifier)), "Version" "2013-02-12", "Action" action-name66343}})
(clojure.core/defn req<-create-option-group-message [action-name66345 input66344] {:body {"OptionGroupName" (ser-string (input66344 :option-group-name)), "EngineName" (ser-string (input66344 :engine-name)), "MajorEngineVersion" (ser-string (input66344 :major-engine-version)), "OptionGroupDescription" (ser-string (input66344 :option-group-description)), "Version" "2013-02-12", "Action" action-name66345}})
(clojure.core/defn req<-describe-event-categories-message [action-name66347 input66346] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66347}} (clojure.core/contains? input66346 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input66346 :source-type)))))
(clojure.core/defn req<-describe-reserveddbinstances-offerings-message [action-name66349 input66348] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66349}} (clojure.core/contains? input66348 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input66348 :reserveddbinstances-offering-id))) (clojure.core/contains? input66348 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66348 :dbinstance-class))) (clojure.core/contains? input66348 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input66348 :duration))) (clojure.core/contains? input66348 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input66348 :product-description))) (clojure.core/contains? input66348 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input66348 :offering-type))) (clojure.core/contains? input66348 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66348 :multiaz))) (clojure.core/contains? input66348 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66348 :max-records))) (clojure.core/contains? input66348 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66348 :marker)))))
(clojure.core/defn req<-createdbsnapshot-message [action-name66351 input66350] {:body {"DBSnapshotIdentifier" (ser-string (input66350 :dbsnapshot-identifier)), "DBInstanceIdentifier" (ser-string (input66350 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66351}})
(clojure.core/defn req<-downloaddblog-file-portion-message [action-name66353 input66352] (clojure.core/let [input66354 {:body {"DBInstanceIdentifier" (ser-string (input66352 :dbinstance-identifier)), "LogFileName" (ser-string (input66352 :log-file-name)), "Version" "2013-02-12", "Action" action-name66353}}] (clojure.core/cond-> input66354 (clojure.core/contains? input66352 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66352 :marker))) (clojure.core/contains? input66352 :number-of-lines) (clojure.core/assoc-in [:body "NumberOfLines"] (ser-integer (input66352 :number-of-lines))))))
(clojure.core/defn req<-describedbinstances-message [action-name66356 input66355] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66356}} (clojure.core/contains? input66355 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input66355 :dbinstance-identifier))) (clojure.core/contains? input66355 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66355 :max-records))) (clojure.core/contains? input66355 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66355 :marker)))))
(clojure.core/defn req<-modify-event-subscription-message [action-name66358 input66357] (clojure.core/let [input66359 {:body {"SubscriptionName" (ser-string (input66357 :subscription-name)), "Version" "2013-02-12", "Action" action-name66358}}] (clojure.core/cond-> input66359 (clojure.core/contains? input66357 :sns-topic-arn) (clojure.core/assoc-in [:body "SnsTopicArn"] (ser-string (input66357 :sns-topic-arn))) (clojure.core/contains? input66357 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input66357 :source-type))) (clojure.core/contains? input66357 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input66357 :event-categories))) (clojure.core/contains? input66357 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input66357 :enabled))))))
(clojure.core/defn req<-describedbengine-versions-message [action-name66361 input66360] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66361}} (clojure.core/contains? input66360 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input66360 :engine))) (clojure.core/contains? input66360 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input66360 :engine-version))) (clojure.core/contains? input66360 :dbparameter-group-family) (clojure.core/assoc-in [:body "DBParameterGroupFamily"] (ser-string (input66360 :dbparameter-group-family))) (clojure.core/contains? input66360 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66360 :max-records))) (clojure.core/contains? input66360 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66360 :marker))) (clojure.core/contains? input66360 :default-only) (clojure.core/assoc-in [:body "DefaultOnly"] (ser-boolean (input66360 :default-only))) (clojure.core/contains? input66360 :list-supported-character-sets) (clojure.core/assoc-in [:body "ListSupportedCharacterSets"] (ser-boolean-optional (input66360 :list-supported-character-sets)))))
(clojure.core/defn req<-describe-option-group-options-message [action-name66363 input66362] (clojure.core/let [input66364 {:body {"EngineName" (ser-string (input66362 :engine-name)), "Version" "2013-02-12", "Action" action-name66363}}] (clojure.core/cond-> input66364 (clojure.core/contains? input66362 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input66362 :major-engine-version))) (clojure.core/contains? input66362 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66362 :max-records))) (clojure.core/contains? input66362 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66362 :marker))))))
(clojure.core/defn req<-createdbsecurity-group-message [action-name66366 input66365] {:body {"DBSecurityGroupName" (ser-string (input66365 :dbsecurity-group-name)), "DBSecurityGroupDescription" (ser-string (input66365 :dbsecurity-group-description)), "Version" "2013-02-12", "Action" action-name66366}})
(clojure.core/defn req<-delete-option-group-message [action-name66368 input66367] {:body {"OptionGroupName" (ser-string (input66367 :option-group-name)), "Version" "2013-02-12", "Action" action-name66368}})
(clojure.core/defn req<-create-event-subscription-message [action-name66370 input66369] (clojure.core/let [input66371 {:body {"SubscriptionName" (ser-string (input66369 :subscription-name)), "SnsTopicArn" (ser-string (input66369 :sns-topic-arn)), "Version" "2013-02-12", "Action" action-name66370}}] (clojure.core/cond-> input66371 (clojure.core/contains? input66369 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input66369 :source-type))) (clojure.core/contains? input66369 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input66369 :event-categories))) (clojure.core/contains? input66369 :source-ids) (clojure.core/assoc-in [:body "SourceIds"] (ser-source-ids-list (input66369 :source-ids))) (clojure.core/contains? input66369 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input66369 :enabled))))))
(clojure.core/defn req<-createdbparameter-group-message [action-name66373 input66372] {:body {"DBParameterGroupName" (ser-string (input66372 :dbparameter-group-name)), "DBParameterGroupFamily" (ser-string (input66372 :dbparameter-group-family)), "Description" (ser-string (input66372 :description)), "Version" "2013-02-12", "Action" action-name66373}})
(clojure.core/defn req<-purchase-reserveddbinstances-offering-message [action-name66375 input66374] (clojure.core/let [input66376 {:body {"ReservedDBInstancesOfferingId" (ser-string (input66374 :reserveddbinstances-offering-id)), "Version" "2013-02-12", "Action" action-name66375}}] (clojure.core/cond-> input66376 (clojure.core/contains? input66374 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input66374 :reserveddbinstance-id))) (clojure.core/contains? input66374 :dbinstance-count) (clojure.core/assoc-in [:body "DBInstanceCount"] (ser-integer-optional (input66374 :dbinstance-count))))))
(clojure.core/defn req<-deletedbparameter-group-message [action-name66378 input66377] {:body {"DBParameterGroupName" (ser-string (input66377 :dbparameter-group-name)), "Version" "2013-02-12", "Action" action-name66378}})
(clojure.core/defn req<-copydbsnapshot-message [action-name66380 input66379] {:body {"SourceDBSnapshotIdentifier" (ser-string (input66379 :sourcedbsnapshot-identifier)), "TargetDBSnapshotIdentifier" (ser-string (input66379 :targetdbsnapshot-identifier)), "Version" "2013-02-12", "Action" action-name66380}})
(clojure.core/defn req<-describe-reserveddbinstances-message [action-name66382 input66381] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66382}} (clojure.core/contains? input66381 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input66381 :reserveddbinstance-id))) (clojure.core/contains? input66381 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input66381 :reserveddbinstances-offering-id))) (clojure.core/contains? input66381 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66381 :max-records))) (clojure.core/contains? input66381 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66381 :marker))) (clojure.core/contains? input66381 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input66381 :duration))) (clojure.core/contains? input66381 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input66381 :product-description))) (clojure.core/contains? input66381 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66381 :dbinstance-class))) (clojure.core/contains? input66381 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input66381 :offering-type))) (clojure.core/contains? input66381 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66381 :multiaz)))))
(clojure.core/defn req<-describe-event-subscriptions-message [action-name66384 input66383] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66384}} (clojure.core/contains? input66383 :subscription-name) (clojure.core/assoc-in [:body "SubscriptionName"] (ser-string (input66383 :subscription-name))) (clojure.core/contains? input66383 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66383 :max-records))) (clojure.core/contains? input66383 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66383 :marker)))))
(clojure.core/defn req<-modifydbinstance-message [action-name66386 input66385] (clojure.core/let [input66387 {:body {"DBInstanceIdentifier" (ser-string (input66385 :dbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66386}}] (clojure.core/cond-> input66387 (clojure.core/contains? input66385 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input66385 :backup-retention-period))) (clojure.core/contains? input66385 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66385 :option-group-name))) (clojure.core/contains? input66385 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input66385 :dbsecurity-groups))) (clojure.core/contains? input66385 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input66385 :preferred-maintenance-window))) (clojure.core/contains? input66385 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input66385 :auto-minor-version-upgrade))) (clojure.core/contains? input66385 :newdbinstance-identifier) (clojure.core/assoc-in [:body "NewDBInstanceIdentifier"] (ser-string (input66385 :newdbinstance-identifier))) (clojure.core/contains? input66385 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input66385 :vpc-security-group-ids))) (clojure.core/contains? input66385 :master-user-password) (clojure.core/assoc-in [:body "MasterUserPassword"] (ser-string (input66385 :master-user-password))) (clojure.core/contains? input66385 :allow-major-version-upgrade) (clojure.core/assoc-in [:body "AllowMajorVersionUpgrade"] (ser-boolean (input66385 :allow-major-version-upgrade))) (clojure.core/contains? input66385 :allocated-storage) (clojure.core/assoc-in [:body "AllocatedStorage"] (ser-integer-optional (input66385 :allocated-storage))) (clojure.core/contains? input66385 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input66385 :engine-version))) (clojure.core/contains? input66385 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input66385 :iops))) (clojure.core/contains? input66385 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input66385 :apply-immediately))) (clojure.core/contains? input66385 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66385 :dbinstance-class))) (clojure.core/contains? input66385 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input66385 :dbparameter-group-name))) (clojure.core/contains? input66385 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input66385 :multiaz))) (clojure.core/contains? input66385 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input66385 :preferred-backup-window))))))
(clojure.core/defn req<-describedbparameters-message [action-name66389 input66388] (clojure.core/let [input66390 {:body {"DBParameterGroupName" (ser-string (input66388 :dbparameter-group-name)), "Version" "2013-02-12", "Action" action-name66389}}] (clojure.core/cond-> input66390 (clojure.core/contains? input66388 :source) (clojure.core/assoc-in [:body "Source"] (ser-string (input66388 :source))) (clojure.core/contains? input66388 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66388 :max-records))) (clojure.core/contains? input66388 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66388 :marker))))))
(clojure.core/defn req<-modify-option-group-message [action-name66392 input66391] (clojure.core/let [input66393 {:body {"OptionGroupName" (ser-string (input66391 :option-group-name)), "Version" "2013-02-12", "Action" action-name66392}}] (clojure.core/cond-> input66393 (clojure.core/contains? input66391 :options-to-include) (clojure.core/assoc-in [:body "OptionsToInclude"] (ser-option-configuration-list (input66391 :options-to-include))) (clojure.core/contains? input66391 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-option-names-list (input66391 :options-to-remove))) (clojure.core/contains? input66391 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input66391 :apply-immediately))))))
(clojure.core/defn req<-describedbparameter-groups-message [action-name66395 input66394] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66395}} (clojure.core/contains? input66394 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input66394 :dbparameter-group-name))) (clojure.core/contains? input66394 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66394 :max-records))) (clojure.core/contains? input66394 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66394 :marker)))))
(clojure.core/defn req<-remove-tags-from-resource-message [action-name66397 input66396] {:body {"ResourceName" (ser-string (input66396 :resource-name)), "TagKeys" (ser-key-list (input66396 :tag-keys)), "Version" "2013-02-12", "Action" action-name66397}})
(clojure.core/defn req<-add-tags-to-resource-message [action-name66399 input66398] {:body {"ResourceName" (ser-string (input66398 :resource-name)), "Tags" (ser-tag-list (input66398 :tags)), "Version" "2013-02-12", "Action" action-name66399}})
(clojure.core/defn req<-modifydbparameter-group-message [action-name66401 input66400] {:body {"DBParameterGroupName" (ser-string (input66400 :dbparameter-group-name)), "Parameters" (ser-parameters-list (input66400 :parameters)), "Version" "2013-02-12", "Action" action-name66401}})
(clojure.core/defn req<-describedbsecurity-groups-message [action-name66403 input66402] (clojure.core/cond-> {:body {"Version" "2013-02-12", "Action" action-name66403}} (clojure.core/contains? input66402 :dbsecurity-group-name) (clojure.core/assoc-in [:body "DBSecurityGroupName"] (ser-string (input66402 :dbsecurity-group-name))) (clojure.core/contains? input66402 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input66402 :max-records))) (clojure.core/contains? input66402 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input66402 :marker)))))
(clojure.core/defn req<-createdbinstance-read-replica-message [action-name66405 input66404] (clojure.core/let [input66406 {:body {"DBInstanceIdentifier" (ser-string (input66404 :dbinstance-identifier)), "SourceDBInstanceIdentifier" (ser-string (input66404 :sourcedbinstance-identifier)), "Version" "2013-02-12", "Action" action-name66405}}] (clojure.core/cond-> input66406 (clojure.core/contains? input66404 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input66404 :option-group-name))) (clojure.core/contains? input66404 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input66404 :publicly-accessible))) (clojure.core/contains? input66404 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input66404 :auto-minor-version-upgrade))) (clojure.core/contains? input66404 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input66404 :availability-zone))) (clojure.core/contains? input66404 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input66404 :port))) (clojure.core/contains? input66404 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input66404 :iops))) (clojure.core/contains? input66404 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input66404 :dbinstance-class))))))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/source-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/vpc-security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/vpc-security-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/snapshot-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/parameters-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/parameter))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/ec2-security-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/ec2-security-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsnapshot-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group-status/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group-status/parameter-apply-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbparameter-group-status/DBParameterGroupName :portkey.aws.rds.-2013-02-12.dbparameter-group-status/ParameterApplyStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbsecurity-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbinstances-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbinstances-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.describedbinstances-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbinstances-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.deletedbsnapshot-message/DBSnapshotIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbsnapshots-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbsnapshots-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/SnapshotType :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbsnapshots-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group-details/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group-details/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbparameter-group-details/Parameters :portkey.aws.rds.-2013-02-12.dbparameter-group-details/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.deletedbparameter-group-message/DBParameterGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/source-ids-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/DBParameterGroupFamily] :opt-un [:portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-engine-default-parameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/snsno-authorization-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/option-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/persistent (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-setting-configuration-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option/OptionName :portkey.aws.rds.-2013-02-12.option/OptionDescription :portkey.aws.rds.-2013-02-12.option/Persistent :portkey.aws.rds.-2013-02-12.option/Port :portkey.aws.rds.-2013-02-12.option/OptionSettings :portkey.aws.rds.-2013-02-12.option/DBSecurityGroupMemberships :portkey.aws.rds.-2013-02-12.option/VpcSecurityGroupMemberships] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-group-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbsnapshot-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-02-12.createdbsnapshot-message/DBInstanceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbparameter-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/rebootdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/instance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-status-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbparameter-group-status))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group-name-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-name-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbparameter-group-name-message/DBParameterGroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/default-only (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/list-supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbengine-versions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbengine-versions-message/Engine :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/EngineVersion :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/DBParameterGroupFamily :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/Marker :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/DefaultOnly :portkey.aws.rds.-2013-02-12.describedbengine-versions-message/ListSupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/SubscriptionName :portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-event-subscriptions-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbsubnet-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbsubnet-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/DBSnapshotIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/OptionGroupName :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/PubliclyAccessible :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/DBName :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/AvailabilityZone :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/LicenseModel :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/Port :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/Iops :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/Engine :portkey.aws.rds.-2013-02-12.restoredbinstance-fromdbsnapshot-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/setting-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/setting-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/default-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option-setting/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-option-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-group-option-setting/SettingName :portkey.aws.rds.-2013-02-12.option-group-option-setting/SettingDescription :portkey.aws.rds.-2013-02-12.option-group-option-setting/DefaultValue :portkey.aws.rds.-2013-02-12.option-group-option-setting/ApplyType :portkey.aws.rds.-2013-02-12.option-group-option-setting/AllowedValues :portkey.aws.rds.-2013-02-12.option-group-option-setting/IsModifiable] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/availability-zone))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.subnet/subnet-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subnet (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.subnet/SubnetIdentifier :portkey.aws.rds.-2013-02-12.subnet/SubnetAvailabilityZone :portkey.aws.rds.-2013-02-12.subnet/SubnetStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsubnet-group-message/Marker :portkey.aws.rds.-2013-02-12/DBSubnetGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/SubnetIds] :opt-un [:portkey.aws.rds.-2013-02-12.modifydbsubnet-group-message/DBSubnetGroupDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.deletedbsecurity-group-message/DBSecurityGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/promote-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbinstance-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.createdbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-02-12.createdbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.createdbinstance-message/Engine :portkey.aws.rds.-2013-02-12.createdbinstance-message/MasterUsername :portkey.aws.rds.-2013-02-12.createdbinstance-message/MasterUserPassword] :opt-un [:portkey.aws.rds.-2013-02-12.createdbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-02-12.createdbinstance-message/OptionGroupName :portkey.aws.rds.-2013-02-12.createdbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-02-12.createdbinstance-message/CharacterSetName :portkey.aws.rds.-2013-02-12.createdbinstance-message/PubliclyAccessible :portkey.aws.rds.-2013-02-12.createdbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-02-12.createdbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.createdbinstance-message/DBName :portkey.aws.rds.-2013-02-12.createdbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-02-12.createdbinstance-message/AvailabilityZone :portkey.aws.rds.-2013-02-12.createdbinstance-message/LicenseModel :portkey.aws.rds.-2013-02-12.createdbinstance-message/EngineVersion :portkey.aws.rds.-2013-02-12.createdbinstance-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.createdbinstance-message/Port :portkey.aws.rds.-2013-02-12.createdbinstance-message/Iops :portkey.aws.rds.-2013-02-12.createdbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-02-12.createdbinstance-message/MultiAZ :portkey.aws.rds.-2013-02-12.createdbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.promote-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.promote-read-replica-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.promote-read-replica-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/promote-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.promote-read-replica-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.promote-read-replica-message/BackupRetentionPeriod :portkey.aws.rds.-2013-02-12.promote-read-replica-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/key-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbengine-version-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbengine-version))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/customer-aws-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/cust-subscription-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscription/subscription-creation-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/SourceIdsList :portkey.aws.rds.-2013-02-12.event-subscription/CustomerAwsId :portkey.aws.rds.-2013-02-12.event-subscription/SourceType :portkey.aws.rds.-2013-02-12.event-subscription/Enabled :portkey.aws.rds.-2013-02-12.event-subscription/Status :portkey.aws.rds.-2013-02-12.event-subscription/SnsTopicArn :portkey.aws.rds.-2013-02-12/EventCategoriesList :portkey.aws.rds.-2013-02-12.event-subscription/CustSubscriptionId :portkey.aws.rds.-2013-02-12.event-subscription/SubscriptionCreationTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/snapshot-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsnapshot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsnapshot/SnapshotCreateTime :portkey.aws.rds.-2013-02-12.dbsnapshot/OptionGroupName :portkey.aws.rds.-2013-02-12.dbsnapshot/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.dbsnapshot/InstanceCreateTime :portkey.aws.rds.-2013-02-12.dbsnapshot/AvailabilityZone :portkey.aws.rds.-2013-02-12.dbsnapshot/Status :portkey.aws.rds.-2013-02-12.dbsnapshot/SnapshotType :portkey.aws.rds.-2013-02-12.dbsnapshot/LicenseModel :portkey.aws.rds.-2013-02-12.dbsnapshot/AllocatedStorage :portkey.aws.rds.-2013-02-12.dbsnapshot/MasterUsername :portkey.aws.rds.-2013-02-12.dbsnapshot/EngineVersion :portkey.aws.rds.-2013-02-12.dbsnapshot/DBSnapshotIdentifier :portkey.aws.rds.-2013-02-12.dbsnapshot/Port :portkey.aws.rds.-2013-02-12.dbsnapshot/VpcId :portkey.aws.rds.-2013-02-12.dbsnapshot/Iops :portkey.aws.rds.-2013-02-12.dbsnapshot/Engine] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-details/log-file-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-details/last-written (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-details/size (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedblog-files-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedblog-files-details/LogFileName :portkey.aws.rds.-2013-02-12.describedblog-files-details/LastWritten :portkey.aws.rds.-2013-02-12.describedblog-files-details/Size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-option-group-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-option-group-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-option-group-message/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/create-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.create-option-group-message/OptionGroupName :portkey.aws.rds.-2013-02-12.create-option-group-message/EngineName :portkey.aws.rds.-2013-02-12.create-option-group-message/MajorEngineVersion :portkey.aws.rds.-2013-02-12.create-option-group-message/OptionGroupDescription] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-names-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbinstance-message/skip-final-snapshot (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbinstance-message/finaldbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.deletedbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.deletedbinstance-message/SkipFinalSnapshot :portkey.aws.rds.-2013-02-12.deletedbinstance-message/FinalDBSnapshotIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/reserveddbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-options-message/orderabledbinstance-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/orderabledbinstance-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/orderabledbinstance-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.orderabledbinstance-options-message/OrderableDBInstanceOptions :portkey.aws.rds.-2013-02-12.orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventCategoriesMapList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-events-message/SourceIdentifier :portkey.aws.rds.-2013-02-12/SourceType :portkey.aws.rds.-2013-02-12.describe-events-message/StartTime :portkey.aws.rds.-2013-02-12.describe-events-message/EndTime :portkey.aws.rds.-2013-02-12.describe-events-message/Duration :portkey.aws.rds.-2013-02-12.describe-events-message/EventCategories :portkey.aws.rds.-2013-02-12.describe-events-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-events-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subscription-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/options (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/allows-vpc-and-non-vpc-instance-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-group/OptionGroupName :portkey.aws.rds.-2013-02-12.option-group/OptionGroupDescription :portkey.aws.rds.-2013-02-12.option-group/EngineName :portkey.aws.rds.-2013-02-12.option-group/MajorEngineVersion :portkey.aws.rds.-2013-02-12.option-group/Options :portkey.aws.rds.-2013-02-12.option-group/AllowsVpcAndNonVpcInstanceMemberships :portkey.aws.rds.-2013-02-12.option-group/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/authorization-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-groups-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/iprange-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/iprange))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbsubnet-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-02-12.authorizedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/snstopic-arn-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/event))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.events-message/events (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.events-message/Marker :portkey.aws.rds.-2013-02-12.events-message/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/source-type {"db-instance" "db-instance", :db-instance "db-instance", "db-parameter-group" "db-parameter-group", :db-parameter-group "db-parameter-group", "db-security-group" "db-security-group", :db-security-group "db-security-group", "db-snapshot" "db-snapshot", :db-snapshot "db-snapshot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/orderabledbinstance-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/orderabledbinstance-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsnapshot-message/dbsnapshots (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsnapshot-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsnapshot-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsnapshot-message/Marker :portkey.aws.rds.-2013-02-12.dbsnapshot-message/DBSnapshots] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subscription-category-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event/message (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event/date (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.event/SourceIdentifier :portkey.aws.rds.-2013-02-12/SourceType :portkey.aws.rds.-2013-02-12.event/Message :portkey.aws.rds.-2013-02-12.event/EventCategories :portkey.aws.rds.-2013-02-12.event/Date] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-options-message/option-group-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-group-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-group-options-message/OptionGroupOptions :portkey.aws.rds.-2013-02-12.option-group-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/availability-zone))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/reset-all-parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/resetdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/ResetAllParameters :portkey.aws.rds.-2013-02-12.resetdbparameter-group-message/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.availability-zone/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.availability-zone/provisioned-iops-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/availability-zone (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.availability-zone/Name :portkey.aws.rds.-2013-02-12.availability-zone/ProvisionedIopsCapable] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.event-subscriptions-message/Marker :portkey.aws.rds.-2013-02-12/EventSubscriptionsList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering-message/reserveddbinstances-offerings (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.reserveddbinstances-offering-message/Marker :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering-message/ReservedDBInstancesOfferings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/create-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsecurity-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-orderabledbinstance-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/Engine] :opt-un [:portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/EngineVersion :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/LicenseModel :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/Vpc :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/DBSubnetGroupDescription :portkey.aws.rds.-2013-02-12.createdbsubnet-group-message/SubnetIds] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbsecurity-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-groups/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-groups (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/OptionGroupsList :portkey.aws.rds.-2013-02-12.option-groups/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.delete-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/delete-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.delete-event-subscription-message/SubscriptionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/read-replicadbinstance-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-groups-message/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbparameter-groups-message/Marker :portkey.aws.rds.-2013-02-12.dbparameter-groups-message/DBParameterGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.recurring-charge/recurring-charge-amount (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.recurring-charge/recurring-charge-frequency (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/recurring-charge (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.recurring-charge/RecurringChargeAmount :portkey.aws.rds.-2013-02-12.recurring-charge/RecurringChargeFrequency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EngineDefaults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/authorization-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.copydbsnapshot-message/sourcedbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.copydbsnapshot-message/targetdbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/copydbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.copydbsnapshot-message/SourceDBSnapshotIdentifier :portkey.aws.rds.-2013-02-12.copydbsnapshot-message/TargetDBSnapshotIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/SourceDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/OptionGroupName :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/PubliclyAccessible :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/AvailabilityZone :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/Port :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/Iops :portkey.aws.rds.-2013-02-12.createdbinstance-read-replica-message/DBInstanceClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subnet-already-in-use (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/create-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/copydbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/port-required (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/option-group-option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-group-option-settings-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/persistent (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/minimum-required-minor-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/default-port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-option/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-group-option/MajorEngineVersion :portkey.aws.rds.-2013-02-12.option-group-option/EngineName :portkey.aws.rds.-2013-02-12.option-group-option/PortRequired :portkey.aws.rds.-2013-02-12.option-group-option/OptionGroupOptionSettings :portkey.aws.rds.-2013-02-12.option-group-option/Persistent :portkey.aws.rds.-2013-02-12.option-group-option/Description :portkey.aws.rds.-2013-02-12.option-group-option/MinimumRequiredMinorEngineVersion :portkey.aws.rds.-2013-02-12.option-group-option/DefaultPort :portkey.aws.rds.-2013-02-12/OptionsDependedOn :portkey.aws.rds.-2013-02-12.option-group-option/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invalid-subnet (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/tag-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/tag))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modify-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/dbengine-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/dbengine-version-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/default-character-set (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/character-set))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version/supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/supported-character-sets-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbengine-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbengine-version/Engine :portkey.aws.rds.-2013-02-12.dbengine-version/EngineVersion :portkey.aws.rds.-2013-02-12.dbengine-version/DBParameterGroupFamily :portkey.aws.rds.-2013-02-12.dbengine-version/DBEngineDescription :portkey.aws.rds.-2013-02-12.dbengine-version/DBEngineVersionDescription :portkey.aws.rds.-2013-02-12.dbengine-version/DefaultCharacterSet :portkey.aws.rds.-2013-02-12.dbengine-version/SupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-setting-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subscription-already-exist-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbupgrade-dependency-failure-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.add-source-identifier-to-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.add-source-identifier-to-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.add-source-identifier-to-subscription-message/SubscriptionName :portkey.aws.rds.-2013-02-12.add-source-identifier-to-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.add-tags-to-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.add-tags-to-resource-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/add-tags-to-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.add-tags-to-resource-message/ResourceName :portkey.aws.rds.-2013-02-12.add-tags-to-resource-message/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invalid-event-subscription-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/tag-list-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/TagList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbparameter-group-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbparameter-group-message/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-02-12.createdbparameter-group-message/DBParameterGroupFamily :portkey.aws.rds.-2013-02-12.createdbparameter-group-message/Description] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.vpc-security-group-membership/vpc-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.vpc-security-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/vpc-security-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.vpc-security-group-membership/VpcSecurityGroupId :portkey.aws.rds.-2013-02-12.vpc-security-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/restore-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/targetdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/use-latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/SourceDBInstanceIdentifier :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/TargetDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/OptionGroupName :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/PubliclyAccessible :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/DBName :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/AvailabilityZone :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/RestoreTime :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/LicenseModel :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/Port :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/Iops :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/Engine :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/MultiAZ :portkey.aws.rds.-2013-02-12.restoredbinstance-to-point-in-time-message/UseLatestRestorableTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/authorization-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dblog-file-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance-message/reserveddbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/reserveddbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.reserveddbinstance-message/Marker :portkey.aws.rds.-2013-02-12.reserveddbinstance-message/ReservedDBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modifydbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.modifydbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-02-12.modifydbparameter-group-message/Parameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modifydbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.rebootdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.rebootdbinstance-message/force-failover (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/rebootdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.rebootdbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.rebootdbinstance-message/ForceFailover] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invalid-option-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/CurrencyCode :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/FixedPrice :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/Duration :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/UsagePrice :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/ProductDescription :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/DBInstanceClass :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/RecurringCharges :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/OfferingType :portkey.aws.rds.-2013-02-12.reserveddbinstances-offering/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.ec2-security-group/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.ec2-security-group/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.ec2-security-group/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.ec2-security-group/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/ec2-security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.ec2-security-group/Status :portkey.aws.rds.-2013-02-12.ec2-security-group/EC2SecurityGroupName :portkey.aws.rds.-2013-02-12.ec2-security-group/EC2SecurityGroupId :portkey.aws.rds.-2013-02-12.ec2-security-group/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.remove-source-identifier-from-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.remove-source-identifier-from-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.remove-source-identifier-from-subscription-message/SubscriptionName :portkey.aws.rds.-2013-02-12.remove-source-identifier-from-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/point-in-time-restore-not-enabled-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.remove-tags-from-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.remove-tags-from-resource-message/tag-keys (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/key-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/remove-tags-from-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.remove-tags-from-resource-message/ResourceName :portkey.aws.rds.-2013-02-12.remove-tags-from-resource-message/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-categories-map-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/event-categories-map))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/data-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/minimum-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/parameter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.parameter/DataType :portkey.aws.rds.-2013-02-12.parameter/ParameterName :portkey.aws.rds.-2013-02-12.parameter/Source :portkey.aws.rds.-2013-02-12.parameter/MinimumEngineVersion :portkey.aws.rds.-2013-02-12.parameter/AllowedValues :portkey.aws.rds.-2013-02-12.parameter/ApplyType :portkey.aws.rds.-2013-02-12.parameter/Description :portkey.aws.rds.-2013-02-12/ApplyMethod :portkey.aws.rds.-2013-02-12.parameter/IsModifiable :portkey.aws.rds.-2013-02-12.parameter/ParameterValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/vpc-security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedblog-files-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/describedblog-files-details))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group-membership/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsecurity-group-membership/DBSecurityGroupName :portkey.aws.rds.-2013-02-12.dbsecurity-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/secondary-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/read-replicadbinstance-identifiers (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/read-replicadbinstance-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/read-replica-sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/option-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-group-status-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/vpc-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/dbinstance-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance/latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbinstance/BackupRetentionPeriod :portkey.aws.rds.-2013-02-12.dbinstance/DBSecurityGroups :portkey.aws.rds.-2013-02-12.dbinstance/SecondaryAvailabilityZone :portkey.aws.rds.-2013-02-12.dbinstance/CharacterSetName :portkey.aws.rds.-2013-02-12.dbinstance/PubliclyAccessible :portkey.aws.rds.-2013-02-12.dbinstance/ReadReplicaDBInstanceIdentifiers :portkey.aws.rds.-2013-02-12.dbinstance/PreferredMaintenanceWindow :portkey.aws.rds.-2013-02-12.dbinstance/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.dbinstance/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.dbinstance/DBName :portkey.aws.rds.-2013-02-12.dbinstance/InstanceCreateTime :portkey.aws.rds.-2013-02-12.dbinstance/AvailabilityZone :portkey.aws.rds.-2013-02-12.dbinstance/ReadReplicaSourceDBInstanceIdentifier :portkey.aws.rds.-2013-02-12.dbinstance/LicenseModel :portkey.aws.rds.-2013-02-12.dbinstance/AllocatedStorage :portkey.aws.rds.-2013-02-12.dbinstance/MasterUsername :portkey.aws.rds.-2013-02-12.dbinstance/EngineVersion :portkey.aws.rds.-2013-02-12.dbinstance/Iops :portkey.aws.rds.-2013-02-12/Endpoint :portkey.aws.rds.-2013-02-12.dbinstance/OptionGroupMemberships :portkey.aws.rds.-2013-02-12.dbinstance/DBInstanceClass :portkey.aws.rds.-2013-02-12.dbinstance/DBParameterGroups :portkey.aws.rds.-2013-02-12.dbinstance/VpcSecurityGroups :portkey.aws.rds.-2013-02-12.dbinstance/Engine :portkey.aws.rds.-2013-02-12.dbinstance/DBInstanceStatus :portkey.aws.rds.-2013-02-12.dbinstance/MultiAZ :portkey.aws.rds.-2013-02-12.dbinstance/PreferredBackupWindow :portkey.aws.rds.-2013-02-12/PendingModifiedValues :portkey.aws.rds.-2013-02-12.dbinstance/LatestRestorableTime :portkey.aws.rds.-2013-02-12/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/tstamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/ReservedDBInstancesOfferingId] :opt-un [:portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/ReservedDBInstanceId :portkey.aws.rds.-2013-02-12.purchase-reserveddbinstances-offering-message/DBInstanceCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbsecurity-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-categories-map/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.event-categories-map/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-categories-map (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.event-categories-map/SourceType :portkey.aws.rds.-2013-02-12.event-categories-map/EventCategories] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-subscription-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/source-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/source-ids-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.create-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/create-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.create-event-subscription-message/SubscriptionName :portkey.aws.rds.-2013-02-12.create-event-subscription-message/SnsTopicArn] :opt-un [:portkey.aws.rds.-2013-02-12.create-event-subscription-message/SourceType :portkey.aws.rds.-2013-02-12.create-event-subscription-message/EventCategories :portkey.aws.rds.-2013-02-12.create-event-subscription-message/SourceIds :portkey.aws.rds.-2013-02-12.create-event-subscription-message/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-response/describedblog-files (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/describedblog-files-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-response/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedblog-files-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedblog-files-response/DescribeDBLogFiles :portkey.aws.rds.-2013-02-12.describedblog-files-response/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/recurring-charge-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/recurring-charge))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-categories-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbengine-version-message/dbengine-versions (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbengine-version-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbengine-version-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbengine-version-message/Marker :portkey.aws.rds.-2013-02-12.dbengine-version-message/DBEngineVersions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbinstance-message/dbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbinstance-message/Marker :portkey.aws.rds.-2013-02-12.dbinstance-message/DBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-supported-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbparameter-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBParameterGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/filename-contains (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/file-last-written (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/file-size (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/long))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedblog-files-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedblog-files-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.describedblog-files-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.describedblog-files-message/FilenameContains :portkey.aws.rds.-2013-02-12.describedblog-files-message/FileLastWritten :portkey.aws.rds.-2013-02-12.describedblog-files-message/FileSize :portkey.aws.rds.-2013-02-12.describedblog-files-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedblog-files-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/apply-method {"immediate" "immediate", :immediate "immediate", "pending-reboot" "pending-reboot", :pending-reboot "pending-reboot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.endpoint/address (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.endpoint/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.endpoint/Address :portkey.aws.rds.-2013-02-12.endpoint/Port] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbparameter-group/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbparameter-group/DBParameterGroupName :portkey.aws.rds.-2013-02-12.dbparameter-group/DBParameterGroupFamily :portkey.aws.rds.-2013-02-12.dbparameter-group/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/supported-character-sets-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/character-set))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invalid-restore-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-membership/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-group-membership/OptionGroupName :portkey.aws.rds.-2013-02-12.option-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/state (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.reserveddbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.reserveddbinstance/ReservedDBInstanceId :portkey.aws.rds.-2013-02-12.reserveddbinstance/CurrencyCode :portkey.aws.rds.-2013-02-12.reserveddbinstance/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-02-12.reserveddbinstance/StartTime :portkey.aws.rds.-2013-02-12.reserveddbinstance/FixedPrice :portkey.aws.rds.-2013-02-12.reserveddbinstance/DBInstanceCount :portkey.aws.rds.-2013-02-12.reserveddbinstance/Duration :portkey.aws.rds.-2013-02-12.reserveddbinstance/UsagePrice :portkey.aws.rds.-2013-02-12.reserveddbinstance/ProductDescription :portkey.aws.rds.-2013-02-12.reserveddbinstance/DBInstanceClass :portkey.aws.rds.-2013-02-12.reserveddbinstance/State :portkey.aws.rds.-2013-02-12.reserveddbinstance/RecurringCharges :portkey.aws.rds.-2013-02-12.reserveddbinstance/OfferingType :portkey.aws.rds.-2013-02-12.reserveddbinstance/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/DBParameterGroupName :portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbparameter-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbsubnet-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.iprange/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.iprange/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/iprange (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.iprange/Status :portkey.aws.rds.-2013-02-12.iprange/CIDRIP] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.character-set/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.character-set/character-set-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/character-set (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.character-set/CharacterSetName :portkey.aws.rds.-2013-02-12.character-set/CharacterSetDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbparameter-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-group-option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-group-option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modify-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.tag/key (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.tag/value (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.tag/Key :portkey.aws.rds.-2013-02-12.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-event-categories-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-event-categories-message/SourceType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/boolean-optional clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/snsinvalid-topic-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/options-depended-on (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/data-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/value (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/default-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/is-collection (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-setting/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.option-setting/DataType :portkey.aws.rds.-2013-02-12.option-setting/AllowedValues :portkey.aws.rds.-2013-02-12.option-setting/Value :portkey.aws.rds.-2013-02-12.option-setting/ApplyType :portkey.aws.rds.-2013-02-12.option-setting/Description :portkey.aws.rds.-2013-02-12.option-setting/DefaultValue :portkey.aws.rds.-2013-02-12.option-setting/IsModifiable :portkey.aws.rds.-2013-02-12.option-setting/IsCollection :portkey.aws.rds.-2013-02-12.option-setting/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.list-tags-for-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/list-tags-for-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.list-tags-for-resource-message/ResourceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.deletedbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.deletedbsubnet-group-message/DBSubnetGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/deletedbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/delete-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-configuration))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/log-file-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/number-of-lines (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/LogFileName] :opt-un [:portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/Marker :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-message/NumberOfLines] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsecurity-group-message/Marker :portkey.aws.rds.-2013-02-12/DBSecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.createdbsecurity-group-message/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.createdbsecurity-group-message/DBSecurityGroupName :portkey.aws.rds.-2013-02-12.createdbsecurity-group-message/DBSecurityGroupDescription] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/event-subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/event-subscription))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsnapshot-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbsnapshot))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.engine-defaults/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.engine-defaults/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.engine-defaults/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/engine-defaults (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.engine-defaults/DBParameterGroupFamily :portkey.aws.rds.-2013-02-12.engine-defaults/Marker :portkey.aws.rds.-2013-02-12.engine-defaults/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/dbsubnet-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-configuration/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-configuration/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-configuration/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-configuration/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.option-configuration/option-settings (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-settings-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-configuration (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.option-configuration/OptionName] :opt-un [:portkey.aws.rds.-2013-02-12.option-configuration/Port :portkey.aws.rds.-2013-02-12.option-configuration/DBSecurityGroupMemberships :portkey.aws.rds.-2013-02-12.option-configuration/VpcSecurityGroupMemberships :portkey.aws.rds.-2013-02-12.option-configuration/OptionSettings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbsnapshot-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/ec2-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/ec2-security-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsecurity-group/ipranges (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/iprange-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsecurity-group/OwnerId :portkey.aws.rds.-2013-02-12.dbsecurity-group/DBSecurityGroupName :portkey.aws.rds.-2013-02-12.dbsecurity-group/DBSecurityGroupDescription :portkey.aws.rds.-2013-02-12.dbsecurity-group/VpcId :portkey.aws.rds.-2013-02-12.dbsecurity-group/EC2SecurityGroups :portkey.aws.rds.-2013-02-12.dbsecurity-group/IPRanges] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-offerings-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/Duration :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/ProductDescription :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/OfferingType :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/MultiAZ :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-offerings-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbsecurity-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/DBSecurityGroupName :portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbsecurity-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/option-settings-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/option-setting))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.delete-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/delete-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.delete-option-group-message/OptionGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameters-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameters-message/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describedbparameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describedbparameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.describedbparameters-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-02-12.describedbparameters-message/Source :portkey.aws.rds.-2013-02-12.describedbparameters-message/MaxRecords :portkey.aws.rds.-2013-02-12.describedbparameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/reserveddbinstance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/ReservedDBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/ReservedDBInstanceId :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/Marker :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/Duration :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/ProductDescription :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/OfferingType :portkey.aws.rds.-2013-02-12.describe-reserveddbinstances-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-02-12.revokedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/availability-zones (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/multiazcapable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/read-replica-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/orderabledbinstance-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.orderabledbinstance-option/Engine :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/EngineVersion :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/DBInstanceClass :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/LicenseModel :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/AvailabilityZones :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/MultiAZCapable :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/ReadReplicaCapable :portkey.aws.rds.-2013-02-12.orderabledbinstance-option/Vpc] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.pending-modified-values/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/pending-modified-values (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.pending-modified-values/BackupRetentionPeriod :portkey.aws.rds.-2013-02-12.pending-modified-values/DBInstanceIdentifier :portkey.aws.rds.-2013-02-12.pending-modified-values/MasterUserPassword :portkey.aws.rds.-2013-02-12.pending-modified-values/AllocatedStorage :portkey.aws.rds.-2013-02-12.pending-modified-values/EngineVersion :portkey.aws.rds.-2013-02-12.pending-modified-values/Port :portkey.aws.rds.-2013-02-12.pending-modified-values/Iops :portkey.aws.rds.-2013-02-12.pending-modified-values/DBInstanceClass :portkey.aws.rds.-2013-02-12.pending-modified-values/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-02-12/subnet))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/log-file-data (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/additional-data-pending (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/LogFileData :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/Marker :portkey.aws.rds.-2013-02-12.downloaddblog-file-portion-details/AdditionalDataPending] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/invaliddbparameter-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/newdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/allow-major-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modifydbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modifydbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.modifydbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-02-12.modifydbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-02-12.modifydbinstance-message/OptionGroupName :portkey.aws.rds.-2013-02-12.modifydbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-02-12.modifydbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-02-12.modifydbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-02-12.modifydbinstance-message/NewDBInstanceIdentifier :portkey.aws.rds.-2013-02-12.modifydbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-02-12.modifydbinstance-message/MasterUserPassword :portkey.aws.rds.-2013-02-12.modifydbinstance-message/AllowMajorVersionUpgrade :portkey.aws.rds.-2013-02-12.modifydbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-02-12.modifydbinstance-message/EngineVersion :portkey.aws.rds.-2013-02-12.modifydbinstance-message/Iops :portkey.aws.rds.-2013-02-12.modifydbinstance-message/ApplyImmediately :portkey.aws.rds.-2013-02-12.modifydbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-02-12.modifydbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-02-12.modifydbinstance-message/MultiAZ :portkey.aws.rds.-2013-02-12.modifydbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-option-group-message/options-to-include (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-configuration-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-option-group-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-names-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-option-group-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modify-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.modify-option-group-message/OptionGroupName] :opt-un [:portkey.aws.rds.-2013-02-12.modify-option-group-message/OptionsToInclude :portkey.aws.rds.-2013-02-12.modify-option-group-message/OptionsToRemove :portkey.aws.rds.-2013-02-12.modify-option-group-message/ApplyImmediately] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsecurity-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group/subnet-group-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.dbsubnet-group/subnets (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/subnet-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/dbsubnet-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.dbsubnet-group/DBSubnetGroupName :portkey.aws.rds.-2013-02-12.dbsubnet-group/DBSubnetGroupDescription :portkey.aws.rds.-2013-02-12.dbsubnet-group/VpcId :portkey.aws.rds.-2013-02-12.dbsubnet-group/SubnetGroupStatus :portkey.aws.rds.-2013-02-12.dbsubnet-group/Subnets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-groups-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-groups-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-groups-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-option-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-02-12.describe-option-groups-message/OptionGroupName :portkey.aws.rds.-2013-02-12.describe-option-groups-message/Marker :portkey.aws.rds.-2013-02-12.describe-option-groups-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-option-groups-message/EngineName :portkey.aws.rds.-2013-02-12.describe-option-groups-message/MajorEngineVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/modify-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.modify-event-subscription-message/SubscriptionName] :opt-un [:portkey.aws.rds.-2013-02-12.modify-event-subscription-message/SnsTopicArn :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/SourceType :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/EventCategories :portkey.aws.rds.-2013-02-12.modify-event-subscription-message/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-02-12/describe-option-group-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-02-12.describe-option-group-options-message/EngineName] :opt-un [:portkey.aws.rds.-2013-02-12.describe-option-group-options-message/MajorEngineVersion :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/MaxRecords :portkey.aws.rds.-2013-02-12.describe-option-group-options-message/Marker] :locations {}))

(clojure.core/defn add-source-identifier-to-subscription ([add-source-identifier-to-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-source-identifier-to-subscription-message "AddSourceIdentifierToSubscription" add-source-identifier-to-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-02-12/source-not-found-fault}))))
(clojure.spec.alpha/fdef add-source-identifier-to-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/add-source-identifier-to-subscription-result))

(clojure.core/defn deletedbsnapshot ([deletedbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsnapshot-message "DeleteDBSnapshot" deletedbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/deletedbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/deletedbsnapshot-result {"InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/deletedbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/deletedbsnapshot-result))

(clojure.core/defn deletedbsubnet-group ([deletedbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsubnet-group-message "DeleteDBSubnetGroup" deletedbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/deletedbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSubnetGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsubnet-group-state-fault, "InvalidDBSubnetStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsubnet-state-fault, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/deletedbsubnet-group-message) :ret clojure.core/true?)

(clojure.core/defn describe-orderabledbinstance-options ([describe-orderabledbinstance-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-orderabledbinstance-options-message "DescribeOrderableDBInstanceOptions" describe-orderabledbinstance-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-orderabledbinstance-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/orderabledbinstance-options-message {}))))
(clojure.spec.alpha/fdef describe-orderabledbinstance-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/describe-orderabledbinstance-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/orderabledbinstance-options-message))

(clojure.core/defn revokedbsecurity-group-ingress ([revokedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-revokedbsecurity-group-ingress-message "RevokeDBSecurityGroupIngress" revokedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault, "AuthorizationNotFoundFault" :portkey.aws.rds.-2013-02-12/authorization-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsecurity-group-state-fault}))))
(clojure.spec.alpha/fdef revokedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/revokedbsecurity-group-ingress-result))

(clojure.core/defn authorizedbsecurity-group-ingress ([authorizedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-authorizedbsecurity-group-ingress-message "AuthorizeDBSecurityGroupIngress" authorizedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsecurity-group-state-fault, "AuthorizationAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/authorization-already-exists-fault, "AuthorizationQuotaExceededFault" :portkey.aws.rds.-2013-02-12/authorization-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef authorizedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/authorizedbsecurity-group-ingress-result))

(clojure.core/defn modifydbsubnet-group ([modifydbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbsubnet-group-message "ModifyDBSubnetGroup" modifydbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-result {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-02-12/dbsubnet-quota-exceeded-fault, "SubnetAlreadyInUse" :portkey.aws.rds.-2013-02-12/subnet-already-in-use, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet}))))
(clojure.spec.alpha/fdef modifydbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/modifydbsubnet-group-result))

(clojure.core/defn restoredbinstance-to-point-in-time ([restoredbinstance-to-point-in-time-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-to-point-in-time-message "RestoreDBInstanceToPointInTime" restoredbinstance-to-point-in-time-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-02-12/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault, "PointInTimeRestoreNotEnabledFault" :portkey.aws.rds.-2013-02-12/point-in-time-restore-not-enabled-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-02-12/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-to-point-in-time :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/restoredbinstance-to-point-in-time-result))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-events-message "DescribeEvents" describe-events-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-events-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/events-message {}))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/events-message))

(clojure.core/defn resetdbparameter-group ([resetdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-resetdbparameter-group-message "ResetDBParameterGroup" resetdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/resetdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbparameter-group-name-message {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef resetdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/resetdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-group-name-message))

(clojure.core/defn describe-option-groups ([] (describe-option-groups {})) ([describe-option-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-groups-message "DescribeOptionGroups" describe-option-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-option-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/option-groups {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef describe-option-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-option-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-groups))

(clojure.core/defn rebootdbinstance ([rebootdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-rebootdbinstance-message "RebootDBInstance" rebootdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/rebootdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/rebootdbinstance-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef rebootdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/rebootdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/rebootdbinstance-result))

(clojure.core/defn deletedbsecurity-group ([deletedbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsecurity-group-message "DeleteDBSecurityGroup" deletedbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/deletedbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsecurity-group-state-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/deletedbsecurity-group-message) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-list-tags-for-resource-message "ListTagsForResource" list-tags-for-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/list-tags-for-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/tag-list-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/tag-list-message))

(clojure.core/defn describe-engine-default-parameters ([describe-engine-default-parameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-engine-default-parameters-message "DescribeEngineDefaultParameters" describe-engine-default-parameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-result {}))))
(clojure.spec.alpha/fdef describe-engine-default-parameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/describe-engine-default-parameters-result))

(clojure.core/defn deletedbinstance ([deletedbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbinstance-message "DeleteDBInstance" deletedbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/deletedbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/deletedbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-already-exists-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-02-12/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef deletedbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/deletedbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/deletedbinstance-result))

(clojure.core/defn describedbsubnet-groups ([] (describedbsubnet-groups {})) ([describedbsubnet-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsubnet-groups-message "DescribeDBSubnetGroups" describedbsubnet-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbsubnet-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbsubnet-group-message {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsubnet-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbsubnet-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsubnet-group-message))

(clojure.core/defn createdbinstance ([createdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-message "CreateDBInstance" createdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbinstance-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-02-12/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbinstance-result))

(clojure.core/defn promote-read-replica ([promote-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-promote-read-replica-message "PromoteReadReplica" promote-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/promote-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/promote-read-replica-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef promote-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/promote-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/promote-read-replica-result))

(clojure.core/defn delete-event-subscription ([delete-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-event-subscription-message "DeleteEventSubscription" delete-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/delete-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/delete-event-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-not-found-fault, "InvalidEventSubscriptionStateFault" :portkey.aws.rds.-2013-02-12/invalid-event-subscription-state-fault}))))
(clojure.spec.alpha/fdef delete-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/delete-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/delete-event-subscription-result))

(clojure.core/defn describedblog-files ([describedblog-files-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedblog-files-message "DescribeDBLogFiles" describedblog-files-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedblog-files-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/describedblog-files-response {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describedblog-files :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/describedblog-files-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/describedblog-files-response))

(clojure.core/defn restoredbinstance-fromdbsnapshot ([restoredbinstance-fromdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-fromdbsnapshot-message "RestoreDBInstanceFromDBSnapshot" restoredbinstance-fromdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-02-12/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-02-12/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-fromdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/restoredbinstance-fromdbsnapshot-result))

(clojure.core/defn describedbsnapshots ([] (describedbsnapshots {})) ([describedbsnapshots-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsnapshots-message "DescribeDBSnapshots" describedbsnapshots-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbsnapshots-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbsnapshot-message {"DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsnapshots :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbsnapshots-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsnapshot-message))

(clojure.core/defn createdbsubnet-group ([createdbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsubnet-group-message "CreateDBSubnetGroup" createdbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbsubnet-group-result {"DBSubnetGroupAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-already-exists-fault, "DBSubnetGroupQuotaExceededFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-quota-exceeded-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-02-12/dbsubnet-quota-exceeded-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet}))))
(clojure.spec.alpha/fdef createdbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbsubnet-group-result))

(clojure.core/defn remove-source-identifier-from-subscription ([remove-source-identifier-from-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-source-identifier-from-subscription-message "RemoveSourceIdentifierFromSubscription" remove-source-identifier-from-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-02-12/source-not-found-fault}))))
(clojure.spec.alpha/fdef remove-source-identifier-from-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/remove-source-identifier-from-subscription-result))

(clojure.core/defn create-option-group ([create-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-option-group-message "CreateOptionGroup" create-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/create-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/create-option-group-result {"OptionGroupAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/option-group-already-exists-fault, "OptionGroupQuotaExceededFault" :portkey.aws.rds.-2013-02-12/option-group-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef create-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/create-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/create-option-group-result))

(clojure.core/defn describe-event-categories ([] (describe-event-categories {})) ([describe-event-categories-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-categories-message "DescribeEventCategories" describe-event-categories-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-event-categories-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/event-categories-message {}))))
(clojure.spec.alpha/fdef describe-event-categories :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-event-categories-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-categories-message))

(clojure.core/defn describe-reserveddbinstances-offerings ([] (describe-reserveddbinstances-offerings {})) ([describe-reserveddbinstances-offerings-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-offerings-message "DescribeReservedDBInstancesOfferings" describe-reserveddbinstances-offerings-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-offerings-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-message {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances-offerings :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-offerings-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-message))

(clojure.core/defn createdbsnapshot ([createdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsnapshot-message "CreateDBSnapshot" createdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-already-exists-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-02-12/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef createdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbsnapshot-result))

(clojure.core/defn downloaddblog-file-portion ([downloaddblog-file-portion-message] (clojure.core/let [req<-input__36755__auto__ (req<-downloaddblog-file-portion-message "DownloadDBLogFilePortion" downloaddblog-file-portion-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-details {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "DBLogFileNotFoundFault" :portkey.aws.rds.-2013-02-12/dblog-file-not-found-fault}))))
(clojure.spec.alpha/fdef downloaddblog-file-portion :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/downloaddblog-file-portion-details))

(clojure.core/defn describedbinstances ([] (describedbinstances {})) ([describedbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbinstances-message "DescribeDBInstances" describedbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbinstance-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describedbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbinstance-message))

(clojure.core/defn modify-event-subscription ([modify-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-event-subscription-message "ModifyEventSubscription" modify-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/modify-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/modify-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-02-12/event-subscription-quota-exceeded-fault, "SubscriptionNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-not-found-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-02-12/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-02-12/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-02-12/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-category-not-found-fault}))))
(clojure.spec.alpha/fdef modify-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/modify-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/modify-event-subscription-result))

(clojure.core/defn describedbengine-versions ([] (describedbengine-versions {})) ([describedbengine-versions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbengine-versions-message "DescribeDBEngineVersions" describedbengine-versions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbengine-versions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbengine-version-message {}))))
(clojure.spec.alpha/fdef describedbengine-versions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbengine-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbengine-version-message))

(clojure.core/defn describe-option-group-options ([describe-option-group-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-group-options-message "DescribeOptionGroupOptions" describe-option-group-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-option-group-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/option-group-options-message {}))))
(clojure.spec.alpha/fdef describe-option-group-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/describe-option-group-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/option-group-options-message))

(clojure.core/defn createdbsecurity-group ([createdbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsecurity-group-message "CreateDBSecurityGroup" createdbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbsecurity-group-result {"DBSecurityGroupAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-already-exists-fault, "DBSecurityGroupQuotaExceededFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-quota-exceeded-fault, "DBSecurityGroupNotSupportedFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-supported-fault}))))
(clojure.spec.alpha/fdef createdbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbsecurity-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbsecurity-group-result))

(clojure.core/defn delete-option-group ([delete-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-option-group-message "DeleteOptionGroup" delete-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/delete-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-02-12/invalid-option-group-state-fault}))))
(clojure.spec.alpha/fdef delete-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/delete-option-group-message) :ret clojure.core/true?)

(clojure.core/defn create-event-subscription ([create-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-event-subscription-message "CreateEventSubscription" create-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/create-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/create-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-02-12/event-subscription-quota-exceeded-fault, "SubscriptionAlreadyExistFault" :portkey.aws.rds.-2013-02-12/subscription-already-exist-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-02-12/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-02-12/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-02-12/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-category-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-02-12/source-not-found-fault}))))
(clojure.spec.alpha/fdef create-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/create-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/create-event-subscription-result))

(clojure.core/defn createdbparameter-group ([createdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbparameter-group-message "CreateDBParameterGroup" createdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbparameter-group-result {"DBParameterGroupQuotaExceededFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-quota-exceeded-fault, "DBParameterGroupAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-already-exists-fault}))))
(clojure.spec.alpha/fdef createdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbparameter-group-result))

(clojure.core/defn purchase-reserveddbinstances-offering ([purchase-reserveddbinstances-offering-message] (clojure.core/let [req<-input__36755__auto__ (req<-purchase-reserveddbinstances-offering-message "PurchaseReservedDBInstancesOffering" purchase-reserveddbinstances-offering-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-result {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-02-12/reserveddbinstances-offering-not-found-fault, "ReservedDBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/reserveddbinstance-already-exists-fault, "ReservedDBInstanceQuotaExceededFault" :portkey.aws.rds.-2013-02-12/reserveddbinstance-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef purchase-reserveddbinstances-offering :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/purchase-reserveddbinstances-offering-result))

(clojure.core/defn deletedbparameter-group ([deletedbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbparameter-group-message "DeleteDBParameterGroup" deletedbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/deletedbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/deletedbparameter-group-message) :ret clojure.core/true?)

(clojure.core/defn copydbsnapshot ([copydbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-copydbsnapshot-message "CopyDBSnapshot" copydbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/copydbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/copydbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-already-exists-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsnapshot-state-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-02-12/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef copydbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/copydbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/copydbsnapshot-result))

(clojure.core/defn describe-reserveddbinstances ([] (describe-reserveddbinstances {})) ([describe-reserveddbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-message "DescribeReservedDBInstances" describe-reserveddbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/reserveddbinstance-message {"ReservedDBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/reserveddbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-reserveddbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/reserveddbinstance-message))

(clojure.core/defn describe-event-subscriptions ([] (describe-event-subscriptions {})) ([describe-event-subscriptions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-subscriptions-message "DescribeEventSubscriptions" describe-event-subscriptions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describe-event-subscriptions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/event-subscriptions-message {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-02-12/subscription-not-found-fault}))))
(clojure.spec.alpha/fdef describe-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describe-event-subscriptions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/event-subscriptions-message))

(clojure.core/defn modifydbinstance ([modifydbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbinstance-message "ModifyDBInstance" modifydbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/modifydbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/modifydbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbsecurity-group-state-fault, "DBUpgradeDependencyFailureFault" :portkey.aws.rds.-2013-02-12/dbupgrade-dependency-failure-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef modifydbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/modifydbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/modifydbinstance-result))

(clojure.core/defn describedbparameters ([describedbparameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameters-message "DescribeDBParameters" describedbparameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbparameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbparameter-group-details {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/describedbparameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-group-details))

(clojure.core/defn modify-option-group ([modify-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-option-group-message "ModifyOptionGroup" modify-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/modify-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/modify-option-group-result {"InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-02-12/invalid-option-group-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef modify-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/modify-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/modify-option-group-result))

(clojure.core/defn describedbparameter-groups ([] (describedbparameter-groups {})) ([describedbparameter-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameter-groups-message "DescribeDBParameterGroups" describedbparameter-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbparameter-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbparameter-groups-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameter-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbparameter-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-groups-message))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-tags-from-resource-message "RemoveTagsFromResource" remove-tags-from-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/remove-tags-from-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/remove-tags-from-resource-message) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-tags-to-resource-message "AddTagsToResource" add-tags-to-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/add-tags-to-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/add-tags-to-resource-message) :ret clojure.core/true?)

(clojure.core/defn modifydbparameter-group ([modifydbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbparameter-group-message "ModifyDBParameterGroup" modifydbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/modifydbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbparameter-group-name-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault, "InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-02-12/invaliddbparameter-group-state-fault}))))
(clojure.spec.alpha/fdef modifydbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/modifydbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbparameter-group-name-message))

(clojure.core/defn describedbsecurity-groups ([] (describedbsecurity-groups {})) ([describedbsecurity-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsecurity-groups-message "DescribeDBSecurityGroups" describedbsecurity-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/describedbsecurity-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/dbsecurity-group-message {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsecurity-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-02-12/describedbsecurity-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/dbsecurity-group-message))

(clojure.core/defn createdbinstance-read-replica ([createdbinstance-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-read-replica-message "CreateDBInstanceReadReplica" createdbinstance-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-02-12/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-02-12/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-02-12/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-02-12/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-02-12/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-02-12/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-02-12/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-02-12/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-02-12/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-02-12/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-02-12/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-02-12/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-02-12/createdbinstance-read-replica-result))
