(ns portkey.aws.rds.-2013-01-10 (:require [portkey.aws]))

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

(clojure.core/declare ser-subnet-identifier-list ser-parameters-list ser-source-ids-list ser-key-list ser-option-names-list ser-source-type ser-tag-list ser-string ser-parameter ser-vpc-security-group-id-list ser-tstamp ser-event-categories-list ser-dbsecurity-group-name-list ser-apply-method ser-tag ser-boolean-optional ser-option-configuration-list ser-option-configuration ser-integer-optional ser-boolean)

(clojure.core/defn- ser-subnet-identifier-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-parameters-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-source-ids-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-key-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-option-names-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-source-type [shape-input] ({"db-instance" "db-instance", :db-instance "db-instance", "db-parameter-group" "db-parameter-group", :db-parameter-group "db-parameter-group", "db-security-group" "db-security-group", :db-security-group "db-security-group", "db-snapshot" "db-snapshot", :db-snapshot "db-snapshot"} shape-input))
(clojure.core/defn- ser-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-parameter [shape-input] (clojure.core/cond-> {} (:data-type shape-input) (clojure.core/assoc "Parameter.DataType" (ser-string (:data-type shape-input))) (:parameter-name shape-input) (clojure.core/assoc "Parameter.ParameterName" (ser-string (:parameter-name shape-input))) (:source shape-input) (clojure.core/assoc "Parameter.Source" (ser-string (:source shape-input))) (:minimum-engine-version shape-input) (clojure.core/assoc "Parameter.MinimumEngineVersion" (ser-string (:minimum-engine-version shape-input))) (:allowed-values shape-input) (clojure.core/assoc "Parameter.AllowedValues" (ser-string (:allowed-values shape-input))) (:apply-type shape-input) (clojure.core/assoc "Parameter.ApplyType" (ser-string (:apply-type shape-input))) (:description shape-input) (clojure.core/assoc "Parameter.Description" (ser-string (:description shape-input))) (:apply-method shape-input) (clojure.core/assoc "Parameter.ApplyMethod" (ser-apply-method (:apply-method shape-input))) (:is-modifiable shape-input) (clojure.core/assoc "Parameter.IsModifiable" (ser-boolean (:is-modifiable shape-input))) (:parameter-value shape-input) (clojure.core/assoc "Parameter.ParameterValue" (ser-string (:parameter-value shape-input)))))
(clojure.core/defn- ser-vpc-security-group-id-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tstamp [shape-input] shape-input)
(clojure.core/defn- ser-event-categories-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dbsecurity-group-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-apply-method [shape-input] ({"immediate" "immediate", :immediate "immediate", "pending-reboot" "pending-reboot", :pending-reboot "pending-reboot"} shape-input))
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-string (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-string (:value shape-input)))))
(clojure.core/defn- ser-boolean-optional [shape-input] shape-input)
(clojure.core/defn- ser-option-configuration-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-option-configuration [shape-input] (clojure.core/cond-> {} (:option-name shape-input) (clojure.core/assoc "OptionConfiguration.OptionName" (ser-string (:option-name shape-input))) (:port shape-input) (clojure.core/assoc "OptionConfiguration.Port" (ser-integer-optional (:port shape-input))) (:dbsecurity-group-memberships shape-input) (clojure.core/assoc "OptionConfiguration.DBSecurityGroupMemberships" (ser-dbsecurity-group-name-list (:dbsecurity-group-memberships shape-input))) (:vpc-security-group-memberships shape-input) (clojure.core/assoc "OptionConfiguration.VpcSecurityGroupMemberships" (ser-vpc-security-group-id-list (:vpc-security-group-memberships shape-input)))))
(clojure.core/defn- ser-integer-optional [shape-input] shape-input)
(clojure.core/defn- ser-boolean [shape-input] shape-input)

(clojure.core/defn req<-add-source-identifier-to-subscription-message [action-name64977 input64976] {:body {"SubscriptionName" (ser-string (input64976 :subscription-name)), "SourceIdentifier" (ser-string (input64976 :source-identifier)), "Version" "2013-01-10", "Action" action-name64977}})
(clojure.core/defn req<-deletedbsnapshot-message [action-name64979 input64978] {:body {"DBSnapshotIdentifier" (ser-string (input64978 :dbsnapshot-identifier)), "Version" "2013-01-10", "Action" action-name64979}})
(clojure.core/defn req<-deletedbsubnet-group-message [action-name64981 input64980] {:body {"DBSubnetGroupName" (ser-string (input64980 :dbsubnet-group-name)), "Version" "2013-01-10", "Action" action-name64981}})
(clojure.core/defn req<-describe-orderabledbinstance-options-message [action-name64983 input64982] (clojure.core/let [input64984 {:body {"Engine" (ser-string (input64982 :engine)), "Version" "2013-01-10", "Action" action-name64983}}] (clojure.core/cond-> input64984 (clojure.core/contains? input64982 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input64982 :engine-version))) (clojure.core/contains? input64982 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input64982 :dbinstance-class))) (clojure.core/contains? input64982 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input64982 :license-model))) (clojure.core/contains? input64982 :vpc) (clojure.core/assoc-in [:body "Vpc"] (ser-boolean-optional (input64982 :vpc))) (clojure.core/contains? input64982 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input64982 :max-records))) (clojure.core/contains? input64982 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input64982 :marker))))))
(clojure.core/defn req<-revokedbsecurity-group-ingress-message [action-name64986 input64985] (clojure.core/let [input64987 {:body {"DBSecurityGroupName" (ser-string (input64985 :dbsecurity-group-name)), "Version" "2013-01-10", "Action" action-name64986}}] (clojure.core/cond-> input64987 (clojure.core/contains? input64985 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input64985 :cidrip))) (clojure.core/contains? input64985 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input64985 :ec2-security-group-name))) (clojure.core/contains? input64985 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input64985 :ec2-security-group-id))) (clojure.core/contains? input64985 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input64985 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-authorizedbsecurity-group-ingress-message [action-name64989 input64988] (clojure.core/let [input64990 {:body {"DBSecurityGroupName" (ser-string (input64988 :dbsecurity-group-name)), "Version" "2013-01-10", "Action" action-name64989}}] (clojure.core/cond-> input64990 (clojure.core/contains? input64988 :cidrip) (clojure.core/assoc-in [:body "CIDRIP"] (ser-string (input64988 :cidrip))) (clojure.core/contains? input64988 :ec2-security-group-name) (clojure.core/assoc-in [:body "EC2SecurityGroupName"] (ser-string (input64988 :ec2-security-group-name))) (clojure.core/contains? input64988 :ec2-security-group-id) (clojure.core/assoc-in [:body "EC2SecurityGroupId"] (ser-string (input64988 :ec2-security-group-id))) (clojure.core/contains? input64988 :ec2-security-group-owner-id) (clojure.core/assoc-in [:body "EC2SecurityGroupOwnerId"] (ser-string (input64988 :ec2-security-group-owner-id))))))
(clojure.core/defn req<-modifydbsubnet-group-message [action-name64992 input64991] (clojure.core/let [input64993 {:body {"DBSubnetGroupName" (ser-string (input64991 :dbsubnet-group-name)), "SubnetIds" (ser-subnet-identifier-list (input64991 :subnet-ids)), "Version" "2013-01-10", "Action" action-name64992}}] (clojure.core/cond-> input64993 (clojure.core/contains? input64991 :dbsubnet-group-description) (clojure.core/assoc-in [:body "DBSubnetGroupDescription"] (ser-string (input64991 :dbsubnet-group-description))))))
(clojure.core/defn req<-restoredbinstance-to-point-in-time-message [action-name64995 input64994] (clojure.core/let [input64996 {:body {"SourceDBInstanceIdentifier" (ser-string (input64994 :sourcedbinstance-identifier)), "TargetDBInstanceIdentifier" (ser-string (input64994 :targetdbinstance-identifier)), "Version" "2013-01-10", "Action" action-name64995}}] (clojure.core/cond-> input64996 (clojure.core/contains? input64994 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input64994 :option-group-name))) (clojure.core/contains? input64994 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input64994 :publicly-accessible))) (clojure.core/contains? input64994 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input64994 :auto-minor-version-upgrade))) (clojure.core/contains? input64994 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input64994 :dbname))) (clojure.core/contains? input64994 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input64994 :availability-zone))) (clojure.core/contains? input64994 :restore-time) (clojure.core/assoc-in [:body "RestoreTime"] (ser-tstamp (input64994 :restore-time))) (clojure.core/contains? input64994 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input64994 :license-model))) (clojure.core/contains? input64994 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input64994 :dbsubnet-group-name))) (clojure.core/contains? input64994 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input64994 :port))) (clojure.core/contains? input64994 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input64994 :iops))) (clojure.core/contains? input64994 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input64994 :dbinstance-class))) (clojure.core/contains? input64994 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input64994 :engine))) (clojure.core/contains? input64994 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input64994 :multiaz))) (clojure.core/contains? input64994 :use-latest-restorable-time) (clojure.core/assoc-in [:body "UseLatestRestorableTime"] (ser-boolean (input64994 :use-latest-restorable-time))))))
(clojure.core/defn req<-describe-events-message [action-name64998 input64997] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name64998}} (clojure.core/contains? input64997 :source-identifier) (clojure.core/assoc-in [:body "SourceIdentifier"] (ser-string (input64997 :source-identifier))) (clojure.core/contains? input64997 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-source-type (input64997 :source-type))) (clojure.core/contains? input64997 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-tstamp (input64997 :start-time))) (clojure.core/contains? input64997 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-tstamp (input64997 :end-time))) (clojure.core/contains? input64997 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-integer-optional (input64997 :duration))) (clojure.core/contains? input64997 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input64997 :event-categories))) (clojure.core/contains? input64997 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input64997 :max-records))) (clojure.core/contains? input64997 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input64997 :marker)))))
(clojure.core/defn req<-resetdbparameter-group-message [action-name65000 input64999] (clojure.core/let [input65001 {:body {"DBParameterGroupName" (ser-string (input64999 :dbparameter-group-name)), "Version" "2013-01-10", "Action" action-name65000}}] (clojure.core/cond-> input65001 (clojure.core/contains? input64999 :reset-all-parameters) (clojure.core/assoc-in [:body "ResetAllParameters"] (ser-boolean (input64999 :reset-all-parameters))) (clojure.core/contains? input64999 :parameters) (clojure.core/assoc-in [:body "Parameters"] (ser-parameters-list (input64999 :parameters))))))
(clojure.core/defn req<-describe-option-groups-message [action-name65003 input65002] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65003}} (clojure.core/contains? input65002 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input65002 :option-group-name))) (clojure.core/contains? input65002 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65002 :marker))) (clojure.core/contains? input65002 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65002 :max-records))) (clojure.core/contains? input65002 :engine-name) (clojure.core/assoc-in [:body "EngineName"] (ser-string (input65002 :engine-name))) (clojure.core/contains? input65002 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input65002 :major-engine-version)))))
(clojure.core/defn req<-rebootdbinstance-message [action-name65005 input65004] (clojure.core/let [input65006 {:body {"DBInstanceIdentifier" (ser-string (input65004 :dbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65005}}] (clojure.core/cond-> input65006 (clojure.core/contains? input65004 :force-failover) (clojure.core/assoc-in [:body "ForceFailover"] (ser-boolean-optional (input65004 :force-failover))))))
(clojure.core/defn req<-deletedbsecurity-group-message [action-name65008 input65007] {:body {"DBSecurityGroupName" (ser-string (input65007 :dbsecurity-group-name)), "Version" "2013-01-10", "Action" action-name65008}})
(clojure.core/defn req<-list-tags-for-resource-message [action-name65010 input65009] {:body {"ResourceName" (ser-string (input65009 :resource-name)), "Version" "2013-01-10", "Action" action-name65010}})
(clojure.core/defn req<-describe-engine-default-parameters-message [action-name65012 input65011] (clojure.core/let [input65013 {:body {"DBParameterGroupFamily" (ser-string (input65011 :dbparameter-group-family)), "Version" "2013-01-10", "Action" action-name65012}}] (clojure.core/cond-> input65013 (clojure.core/contains? input65011 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65011 :max-records))) (clojure.core/contains? input65011 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65011 :marker))))))
(clojure.core/defn req<-deletedbinstance-message [action-name65015 input65014] (clojure.core/let [input65016 {:body {"DBInstanceIdentifier" (ser-string (input65014 :dbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65015}}] (clojure.core/cond-> input65016 (clojure.core/contains? input65014 :skip-final-snapshot) (clojure.core/assoc-in [:body "SkipFinalSnapshot"] (ser-boolean (input65014 :skip-final-snapshot))) (clojure.core/contains? input65014 :finaldbsnapshot-identifier) (clojure.core/assoc-in [:body "FinalDBSnapshotIdentifier"] (ser-string (input65014 :finaldbsnapshot-identifier))))))
(clojure.core/defn req<-describedbsubnet-groups-message [action-name65018 input65017] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65018}} (clojure.core/contains? input65017 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input65017 :dbsubnet-group-name))) (clojure.core/contains? input65017 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65017 :max-records))) (clojure.core/contains? input65017 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65017 :marker)))))
(clojure.core/defn req<-createdbinstance-message [action-name65020 input65019] (clojure.core/let [input65021 {:body {"DBInstanceIdentifier" (ser-string (input65019 :dbinstance-identifier)), "MasterUserPassword" (ser-string (input65019 :master-user-password)), "AllocatedStorage" (ser-integer-optional (input65019 :allocated-storage)), "MasterUsername" (ser-string (input65019 :master-username)), "DBInstanceClass" (ser-string (input65019 :dbinstance-class)), "Engine" (ser-string (input65019 :engine)), "Version" "2013-01-10", "Action" action-name65020}}] (clojure.core/cond-> input65021 (clojure.core/contains? input65019 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input65019 :backup-retention-period))) (clojure.core/contains? input65019 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input65019 :option-group-name))) (clojure.core/contains? input65019 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input65019 :dbsecurity-groups))) (clojure.core/contains? input65019 :character-set-name) (clojure.core/assoc-in [:body "CharacterSetName"] (ser-string (input65019 :character-set-name))) (clojure.core/contains? input65019 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input65019 :publicly-accessible))) (clojure.core/contains? input65019 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input65019 :preferred-maintenance-window))) (clojure.core/contains? input65019 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input65019 :auto-minor-version-upgrade))) (clojure.core/contains? input65019 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input65019 :dbname))) (clojure.core/contains? input65019 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input65019 :vpc-security-group-ids))) (clojure.core/contains? input65019 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input65019 :availability-zone))) (clojure.core/contains? input65019 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input65019 :license-model))) (clojure.core/contains? input65019 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input65019 :engine-version))) (clojure.core/contains? input65019 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input65019 :dbsubnet-group-name))) (clojure.core/contains? input65019 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input65019 :port))) (clojure.core/contains? input65019 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input65019 :iops))) (clojure.core/contains? input65019 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input65019 :dbparameter-group-name))) (clojure.core/contains? input65019 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input65019 :multiaz))) (clojure.core/contains? input65019 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input65019 :preferred-backup-window))))))
(clojure.core/defn req<-promote-read-replica-message [action-name65023 input65022] (clojure.core/let [input65024 {:body {"DBInstanceIdentifier" (ser-string (input65022 :dbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65023}}] (clojure.core/cond-> input65024 (clojure.core/contains? input65022 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input65022 :backup-retention-period))) (clojure.core/contains? input65022 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input65022 :preferred-backup-window))))))
(clojure.core/defn req<-delete-event-subscription-message [action-name65026 input65025] {:body {"SubscriptionName" (ser-string (input65025 :subscription-name)), "Version" "2013-01-10", "Action" action-name65026}})
(clojure.core/defn req<-restoredbinstance-fromdbsnapshot-message [action-name65028 input65027] (clojure.core/let [input65029 {:body {"DBInstanceIdentifier" (ser-string (input65027 :dbinstance-identifier)), "DBSnapshotIdentifier" (ser-string (input65027 :dbsnapshot-identifier)), "Version" "2013-01-10", "Action" action-name65028}}] (clojure.core/cond-> input65029 (clojure.core/contains? input65027 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input65027 :option-group-name))) (clojure.core/contains? input65027 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input65027 :publicly-accessible))) (clojure.core/contains? input65027 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input65027 :auto-minor-version-upgrade))) (clojure.core/contains? input65027 :dbname) (clojure.core/assoc-in [:body "DBName"] (ser-string (input65027 :dbname))) (clojure.core/contains? input65027 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input65027 :availability-zone))) (clojure.core/contains? input65027 :license-model) (clojure.core/assoc-in [:body "LicenseModel"] (ser-string (input65027 :license-model))) (clojure.core/contains? input65027 :dbsubnet-group-name) (clojure.core/assoc-in [:body "DBSubnetGroupName"] (ser-string (input65027 :dbsubnet-group-name))) (clojure.core/contains? input65027 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input65027 :port))) (clojure.core/contains? input65027 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input65027 :iops))) (clojure.core/contains? input65027 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input65027 :dbinstance-class))) (clojure.core/contains? input65027 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input65027 :engine))) (clojure.core/contains? input65027 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input65027 :multiaz))))))
(clojure.core/defn req<-describedbsnapshots-message [action-name65031 input65030] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65031}} (clojure.core/contains? input65030 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input65030 :dbinstance-identifier))) (clojure.core/contains? input65030 :dbsnapshot-identifier) (clojure.core/assoc-in [:body "DBSnapshotIdentifier"] (ser-string (input65030 :dbsnapshot-identifier))) (clojure.core/contains? input65030 :snapshot-type) (clojure.core/assoc-in [:body "SnapshotType"] (ser-string (input65030 :snapshot-type))) (clojure.core/contains? input65030 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65030 :max-records))) (clojure.core/contains? input65030 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65030 :marker)))))
(clojure.core/defn req<-createdbsubnet-group-message [action-name65033 input65032] {:body {"DBSubnetGroupName" (ser-string (input65032 :dbsubnet-group-name)), "DBSubnetGroupDescription" (ser-string (input65032 :dbsubnet-group-description)), "SubnetIds" (ser-subnet-identifier-list (input65032 :subnet-ids)), "Version" "2013-01-10", "Action" action-name65033}})
(clojure.core/defn req<-remove-source-identifier-from-subscription-message [action-name65035 input65034] {:body {"SubscriptionName" (ser-string (input65034 :subscription-name)), "SourceIdentifier" (ser-string (input65034 :source-identifier)), "Version" "2013-01-10", "Action" action-name65035}})
(clojure.core/defn req<-create-option-group-message [action-name65037 input65036] {:body {"OptionGroupName" (ser-string (input65036 :option-group-name)), "EngineName" (ser-string (input65036 :engine-name)), "MajorEngineVersion" (ser-string (input65036 :major-engine-version)), "OptionGroupDescription" (ser-string (input65036 :option-group-description)), "Version" "2013-01-10", "Action" action-name65037}})
(clojure.core/defn req<-describe-event-categories-message [action-name65039 input65038] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65039}} (clojure.core/contains? input65038 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input65038 :source-type)))))
(clojure.core/defn req<-describe-reserveddbinstances-offerings-message [action-name65041 input65040] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65041}} (clojure.core/contains? input65040 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input65040 :reserveddbinstances-offering-id))) (clojure.core/contains? input65040 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input65040 :dbinstance-class))) (clojure.core/contains? input65040 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input65040 :duration))) (clojure.core/contains? input65040 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input65040 :product-description))) (clojure.core/contains? input65040 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input65040 :offering-type))) (clojure.core/contains? input65040 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input65040 :multiaz))) (clojure.core/contains? input65040 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65040 :max-records))) (clojure.core/contains? input65040 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65040 :marker)))))
(clojure.core/defn req<-createdbsnapshot-message [action-name65043 input65042] {:body {"DBSnapshotIdentifier" (ser-string (input65042 :dbsnapshot-identifier)), "DBInstanceIdentifier" (ser-string (input65042 :dbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65043}})
(clojure.core/defn req<-describedbinstances-message [action-name65045 input65044] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65045}} (clojure.core/contains? input65044 :dbinstance-identifier) (clojure.core/assoc-in [:body "DBInstanceIdentifier"] (ser-string (input65044 :dbinstance-identifier))) (clojure.core/contains? input65044 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65044 :max-records))) (clojure.core/contains? input65044 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65044 :marker)))))
(clojure.core/defn req<-modify-event-subscription-message [action-name65047 input65046] (clojure.core/let [input65048 {:body {"SubscriptionName" (ser-string (input65046 :subscription-name)), "Version" "2013-01-10", "Action" action-name65047}}] (clojure.core/cond-> input65048 (clojure.core/contains? input65046 :sns-topic-arn) (clojure.core/assoc-in [:body "SnsTopicArn"] (ser-string (input65046 :sns-topic-arn))) (clojure.core/contains? input65046 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input65046 :source-type))) (clojure.core/contains? input65046 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input65046 :event-categories))) (clojure.core/contains? input65046 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input65046 :enabled))))))
(clojure.core/defn req<-describedbengine-versions-message [action-name65050 input65049] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65050}} (clojure.core/contains? input65049 :engine) (clojure.core/assoc-in [:body "Engine"] (ser-string (input65049 :engine))) (clojure.core/contains? input65049 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input65049 :engine-version))) (clojure.core/contains? input65049 :dbparameter-group-family) (clojure.core/assoc-in [:body "DBParameterGroupFamily"] (ser-string (input65049 :dbparameter-group-family))) (clojure.core/contains? input65049 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65049 :max-records))) (clojure.core/contains? input65049 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65049 :marker))) (clojure.core/contains? input65049 :default-only) (clojure.core/assoc-in [:body "DefaultOnly"] (ser-boolean (input65049 :default-only))) (clojure.core/contains? input65049 :list-supported-character-sets) (clojure.core/assoc-in [:body "ListSupportedCharacterSets"] (ser-boolean-optional (input65049 :list-supported-character-sets)))))
(clojure.core/defn req<-describe-option-group-options-message [action-name65052 input65051] (clojure.core/let [input65053 {:body {"EngineName" (ser-string (input65051 :engine-name)), "Version" "2013-01-10", "Action" action-name65052}}] (clojure.core/cond-> input65053 (clojure.core/contains? input65051 :major-engine-version) (clojure.core/assoc-in [:body "MajorEngineVersion"] (ser-string (input65051 :major-engine-version))) (clojure.core/contains? input65051 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65051 :max-records))) (clojure.core/contains? input65051 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65051 :marker))))))
(clojure.core/defn req<-createdbsecurity-group-message [action-name65055 input65054] {:body {"DBSecurityGroupName" (ser-string (input65054 :dbsecurity-group-name)), "DBSecurityGroupDescription" (ser-string (input65054 :dbsecurity-group-description)), "Version" "2013-01-10", "Action" action-name65055}})
(clojure.core/defn req<-delete-option-group-message [action-name65057 input65056] {:body {"OptionGroupName" (ser-string (input65056 :option-group-name)), "Version" "2013-01-10", "Action" action-name65057}})
(clojure.core/defn req<-create-event-subscription-message [action-name65059 input65058] (clojure.core/let [input65060 {:body {"SubscriptionName" (ser-string (input65058 :subscription-name)), "SnsTopicArn" (ser-string (input65058 :sns-topic-arn)), "Version" "2013-01-10", "Action" action-name65059}}] (clojure.core/cond-> input65060 (clojure.core/contains? input65058 :source-type) (clojure.core/assoc-in [:body "SourceType"] (ser-string (input65058 :source-type))) (clojure.core/contains? input65058 :event-categories) (clojure.core/assoc-in [:body "EventCategories"] (ser-event-categories-list (input65058 :event-categories))) (clojure.core/contains? input65058 :source-ids) (clojure.core/assoc-in [:body "SourceIds"] (ser-source-ids-list (input65058 :source-ids))) (clojure.core/contains? input65058 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-boolean-optional (input65058 :enabled))))))
(clojure.core/defn req<-createdbparameter-group-message [action-name65062 input65061] {:body {"DBParameterGroupName" (ser-string (input65061 :dbparameter-group-name)), "DBParameterGroupFamily" (ser-string (input65061 :dbparameter-group-family)), "Description" (ser-string (input65061 :description)), "Version" "2013-01-10", "Action" action-name65062}})
(clojure.core/defn req<-purchase-reserveddbinstances-offering-message [action-name65064 input65063] (clojure.core/let [input65065 {:body {"ReservedDBInstancesOfferingId" (ser-string (input65063 :reserveddbinstances-offering-id)), "Version" "2013-01-10", "Action" action-name65064}}] (clojure.core/cond-> input65065 (clojure.core/contains? input65063 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input65063 :reserveddbinstance-id))) (clojure.core/contains? input65063 :dbinstance-count) (clojure.core/assoc-in [:body "DBInstanceCount"] (ser-integer-optional (input65063 :dbinstance-count))))))
(clojure.core/defn req<-deletedbparameter-group-message [action-name65067 input65066] {:body {"DBParameterGroupName" (ser-string (input65066 :dbparameter-group-name)), "Version" "2013-01-10", "Action" action-name65067}})
(clojure.core/defn req<-copydbsnapshot-message [action-name65069 input65068] {:body {"SourceDBSnapshotIdentifier" (ser-string (input65068 :sourcedbsnapshot-identifier)), "TargetDBSnapshotIdentifier" (ser-string (input65068 :targetdbsnapshot-identifier)), "Version" "2013-01-10", "Action" action-name65069}})
(clojure.core/defn req<-describe-reserveddbinstances-message [action-name65071 input65070] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65071}} (clojure.core/contains? input65070 :reserveddbinstance-id) (clojure.core/assoc-in [:body "ReservedDBInstanceId"] (ser-string (input65070 :reserveddbinstance-id))) (clojure.core/contains? input65070 :reserveddbinstances-offering-id) (clojure.core/assoc-in [:body "ReservedDBInstancesOfferingId"] (ser-string (input65070 :reserveddbinstances-offering-id))) (clojure.core/contains? input65070 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65070 :max-records))) (clojure.core/contains? input65070 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65070 :marker))) (clojure.core/contains? input65070 :duration) (clojure.core/assoc-in [:body "Duration"] (ser-string (input65070 :duration))) (clojure.core/contains? input65070 :product-description) (clojure.core/assoc-in [:body "ProductDescription"] (ser-string (input65070 :product-description))) (clojure.core/contains? input65070 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input65070 :dbinstance-class))) (clojure.core/contains? input65070 :offering-type) (clojure.core/assoc-in [:body "OfferingType"] (ser-string (input65070 :offering-type))) (clojure.core/contains? input65070 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input65070 :multiaz)))))
(clojure.core/defn req<-describe-event-subscriptions-message [action-name65073 input65072] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65073}} (clojure.core/contains? input65072 :subscription-name) (clojure.core/assoc-in [:body "SubscriptionName"] (ser-string (input65072 :subscription-name))) (clojure.core/contains? input65072 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65072 :max-records))) (clojure.core/contains? input65072 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65072 :marker)))))
(clojure.core/defn req<-modifydbinstance-message [action-name65075 input65074] (clojure.core/let [input65076 {:body {"DBInstanceIdentifier" (ser-string (input65074 :dbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65075}}] (clojure.core/cond-> input65076 (clojure.core/contains? input65074 :backup-retention-period) (clojure.core/assoc-in [:body "BackupRetentionPeriod"] (ser-integer-optional (input65074 :backup-retention-period))) (clojure.core/contains? input65074 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input65074 :option-group-name))) (clojure.core/contains? input65074 :dbsecurity-groups) (clojure.core/assoc-in [:body "DBSecurityGroups"] (ser-dbsecurity-group-name-list (input65074 :dbsecurity-groups))) (clojure.core/contains? input65074 :preferred-maintenance-window) (clojure.core/assoc-in [:body "PreferredMaintenanceWindow"] (ser-string (input65074 :preferred-maintenance-window))) (clojure.core/contains? input65074 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input65074 :auto-minor-version-upgrade))) (clojure.core/contains? input65074 :newdbinstance-identifier) (clojure.core/assoc-in [:body "NewDBInstanceIdentifier"] (ser-string (input65074 :newdbinstance-identifier))) (clojure.core/contains? input65074 :vpc-security-group-ids) (clojure.core/assoc-in [:body "VpcSecurityGroupIds"] (ser-vpc-security-group-id-list (input65074 :vpc-security-group-ids))) (clojure.core/contains? input65074 :master-user-password) (clojure.core/assoc-in [:body "MasterUserPassword"] (ser-string (input65074 :master-user-password))) (clojure.core/contains? input65074 :allow-major-version-upgrade) (clojure.core/assoc-in [:body "AllowMajorVersionUpgrade"] (ser-boolean (input65074 :allow-major-version-upgrade))) (clojure.core/contains? input65074 :allocated-storage) (clojure.core/assoc-in [:body "AllocatedStorage"] (ser-integer-optional (input65074 :allocated-storage))) (clojure.core/contains? input65074 :engine-version) (clojure.core/assoc-in [:body "EngineVersion"] (ser-string (input65074 :engine-version))) (clojure.core/contains? input65074 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input65074 :iops))) (clojure.core/contains? input65074 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input65074 :apply-immediately))) (clojure.core/contains? input65074 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input65074 :dbinstance-class))) (clojure.core/contains? input65074 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input65074 :dbparameter-group-name))) (clojure.core/contains? input65074 :multiaz) (clojure.core/assoc-in [:body "MultiAZ"] (ser-boolean-optional (input65074 :multiaz))) (clojure.core/contains? input65074 :preferred-backup-window) (clojure.core/assoc-in [:body "PreferredBackupWindow"] (ser-string (input65074 :preferred-backup-window))))))
(clojure.core/defn req<-describedbparameters-message [action-name65078 input65077] (clojure.core/let [input65079 {:body {"DBParameterGroupName" (ser-string (input65077 :dbparameter-group-name)), "Version" "2013-01-10", "Action" action-name65078}}] (clojure.core/cond-> input65079 (clojure.core/contains? input65077 :source) (clojure.core/assoc-in [:body "Source"] (ser-string (input65077 :source))) (clojure.core/contains? input65077 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65077 :max-records))) (clojure.core/contains? input65077 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65077 :marker))))))
(clojure.core/defn req<-modify-option-group-message [action-name65081 input65080] (clojure.core/let [input65082 {:body {"OptionGroupName" (ser-string (input65080 :option-group-name)), "Version" "2013-01-10", "Action" action-name65081}}] (clojure.core/cond-> input65082 (clojure.core/contains? input65080 :options-to-include) (clojure.core/assoc-in [:body "OptionsToInclude"] (ser-option-configuration-list (input65080 :options-to-include))) (clojure.core/contains? input65080 :options-to-remove) (clojure.core/assoc-in [:body "OptionsToRemove"] (ser-option-names-list (input65080 :options-to-remove))) (clojure.core/contains? input65080 :apply-immediately) (clojure.core/assoc-in [:body "ApplyImmediately"] (ser-boolean (input65080 :apply-immediately))))))
(clojure.core/defn req<-describedbparameter-groups-message [action-name65084 input65083] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65084}} (clojure.core/contains? input65083 :dbparameter-group-name) (clojure.core/assoc-in [:body "DBParameterGroupName"] (ser-string (input65083 :dbparameter-group-name))) (clojure.core/contains? input65083 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65083 :max-records))) (clojure.core/contains? input65083 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65083 :marker)))))
(clojure.core/defn req<-remove-tags-from-resource-message [action-name65086 input65085] {:body {"ResourceName" (ser-string (input65085 :resource-name)), "TagKeys" (ser-key-list (input65085 :tag-keys)), "Version" "2013-01-10", "Action" action-name65086}})
(clojure.core/defn req<-add-tags-to-resource-message [action-name65088 input65087] {:body {"ResourceName" (ser-string (input65087 :resource-name)), "Tags" (ser-tag-list (input65087 :tags)), "Version" "2013-01-10", "Action" action-name65088}})
(clojure.core/defn req<-modifydbparameter-group-message [action-name65090 input65089] {:body {"DBParameterGroupName" (ser-string (input65089 :dbparameter-group-name)), "Parameters" (ser-parameters-list (input65089 :parameters)), "Version" "2013-01-10", "Action" action-name65090}})
(clojure.core/defn req<-describedbsecurity-groups-message [action-name65092 input65091] (clojure.core/cond-> {:body {"Version" "2013-01-10", "Action" action-name65092}} (clojure.core/contains? input65091 :dbsecurity-group-name) (clojure.core/assoc-in [:body "DBSecurityGroupName"] (ser-string (input65091 :dbsecurity-group-name))) (clojure.core/contains? input65091 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-integer-optional (input65091 :max-records))) (clojure.core/contains? input65091 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-string (input65091 :marker)))))
(clojure.core/defn req<-createdbinstance-read-replica-message [action-name65094 input65093] (clojure.core/let [input65095 {:body {"DBInstanceIdentifier" (ser-string (input65093 :dbinstance-identifier)), "SourceDBInstanceIdentifier" (ser-string (input65093 :sourcedbinstance-identifier)), "Version" "2013-01-10", "Action" action-name65094}}] (clojure.core/cond-> input65095 (clojure.core/contains? input65093 :option-group-name) (clojure.core/assoc-in [:body "OptionGroupName"] (ser-string (input65093 :option-group-name))) (clojure.core/contains? input65093 :publicly-accessible) (clojure.core/assoc-in [:body "PubliclyAccessible"] (ser-boolean-optional (input65093 :publicly-accessible))) (clojure.core/contains? input65093 :auto-minor-version-upgrade) (clojure.core/assoc-in [:body "AutoMinorVersionUpgrade"] (ser-boolean-optional (input65093 :auto-minor-version-upgrade))) (clojure.core/contains? input65093 :availability-zone) (clojure.core/assoc-in [:body "AvailabilityZone"] (ser-string (input65093 :availability-zone))) (clojure.core/contains? input65093 :port) (clojure.core/assoc-in [:body "Port"] (ser-integer-optional (input65093 :port))) (clojure.core/contains? input65093 :iops) (clojure.core/assoc-in [:body "Iops"] (ser-integer-optional (input65093 :iops))) (clojure.core/contains? input65093 :dbinstance-class) (clojure.core/assoc-in [:body "DBInstanceClass"] (ser-string (input65093 :dbinstance-class))))))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/source-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/vpc-security-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/vpc-security-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subnet-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/snapshot-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/parameters-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/parameter))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/ec2-security-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/ec2-security-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsnapshot-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group-status/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group-status/parameter-apply-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbparameter-group-status/DBParameterGroupName :portkey.aws.rds.-2013-01-10.dbparameter-group-status/ParameterApplyStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbsecurity-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbinstances-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbinstances-message/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.describedbinstances-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbinstances-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.deletedbsnapshot-message/DBSnapshotIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbsnapshots-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbsnapshots-message/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/SnapshotType :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbsnapshots-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group-details/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group-details/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbparameter-group-details/Parameters :portkey.aws.rds.-2013-01-10.dbparameter-group-details/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.deletedbparameter-group-message/DBParameterGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/source-ids-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/DBParameterGroupFamily] :opt-un [:portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-engine-default-parameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/snsno-authorization-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option/option-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.option/OptionName :portkey.aws.rds.-2013-01-10.option/OptionDescription :portkey.aws.rds.-2013-01-10.option/Port :portkey.aws.rds.-2013-01-10.option/DBSecurityGroupMemberships :portkey.aws.rds.-2013-01-10.option/VpcSecurityGroupMemberships] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/option-group-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbsnapshot-message/DBSnapshotIdentifier :portkey.aws.rds.-2013-01-10.createdbsnapshot-message/DBInstanceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbparameter-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/rebootdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/instance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-status-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbparameter-group-status))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group-name-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-name-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbparameter-group-name-message/DBParameterGroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/default-only (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/list-supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbengine-versions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbengine-versions-message/Engine :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/EngineVersion :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/DBParameterGroupFamily :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/Marker :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/DefaultOnly :portkey.aws.rds.-2013-01-10.describedbengine-versions-message/ListSupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/SubscriptionName :portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-event-subscriptions-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbsubnet-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbsubnet-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/DBSnapshotIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/OptionGroupName :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/PubliclyAccessible :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/DBName :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/AvailabilityZone :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/LicenseModel :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/Port :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/Iops :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/Engine :portkey.aws.rds.-2013-01-10.restoredbinstance-fromdbsnapshot-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.subnet/subnet-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.subnet/subnet-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/availability-zone))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.subnet/subnet-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subnet (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.subnet/SubnetIdentifier :portkey.aws.rds.-2013-01-10.subnet/SubnetAvailabilityZone :portkey.aws.rds.-2013-01-10.subnet/SubnetStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsubnet-group-message/Marker :portkey.aws.rds.-2013-01-10/DBSubnetGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/SubnetIds] :opt-un [:portkey.aws.rds.-2013-01-10.modifydbsubnet-group-message/DBSubnetGroupDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.deletedbsecurity-group-message/DBSecurityGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/promote-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbinstance-message/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.createdbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-01-10.createdbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.createdbinstance-message/Engine :portkey.aws.rds.-2013-01-10.createdbinstance-message/MasterUsername :portkey.aws.rds.-2013-01-10.createdbinstance-message/MasterUserPassword] :opt-un [:portkey.aws.rds.-2013-01-10.createdbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-01-10.createdbinstance-message/OptionGroupName :portkey.aws.rds.-2013-01-10.createdbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-01-10.createdbinstance-message/CharacterSetName :portkey.aws.rds.-2013-01-10.createdbinstance-message/PubliclyAccessible :portkey.aws.rds.-2013-01-10.createdbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-01-10.createdbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.createdbinstance-message/DBName :portkey.aws.rds.-2013-01-10.createdbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-01-10.createdbinstance-message/AvailabilityZone :portkey.aws.rds.-2013-01-10.createdbinstance-message/LicenseModel :portkey.aws.rds.-2013-01-10.createdbinstance-message/EngineVersion :portkey.aws.rds.-2013-01-10.createdbinstance-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.createdbinstance-message/Port :portkey.aws.rds.-2013-01-10.createdbinstance-message/Iops :portkey.aws.rds.-2013-01-10.createdbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-01-10.createdbinstance-message/MultiAZ :portkey.aws.rds.-2013-01-10.createdbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.promote-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.promote-read-replica-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.promote-read-replica-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/promote-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.promote-read-replica-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.promote-read-replica-message/BackupRetentionPeriod :portkey.aws.rds.-2013-01-10.promote-read-replica-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/key-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbengine-version-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbengine-version))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/customer-aws-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/cust-subscription-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/subscription-creation-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscription/id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-subscription (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/SourceIdsList :portkey.aws.rds.-2013-01-10.event-subscription/CustomerAwsId :portkey.aws.rds.-2013-01-10.event-subscription/SourceType :portkey.aws.rds.-2013-01-10.event-subscription/Enabled :portkey.aws.rds.-2013-01-10.event-subscription/Status :portkey.aws.rds.-2013-01-10.event-subscription/SnsTopicArn :portkey.aws.rds.-2013-01-10/EventCategoriesList :portkey.aws.rds.-2013-01-10.event-subscription/CustSubscriptionId :portkey.aws.rds.-2013-01-10.event-subscription/SubscriptionCreationTime :portkey.aws.rds.-2013-01-10.event-subscription/Id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/snapshot-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/snapshot-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/dbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsnapshot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsnapshot/SnapshotCreateTime :portkey.aws.rds.-2013-01-10.dbsnapshot/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.dbsnapshot/InstanceCreateTime :portkey.aws.rds.-2013-01-10.dbsnapshot/AvailabilityZone :portkey.aws.rds.-2013-01-10.dbsnapshot/Status :portkey.aws.rds.-2013-01-10.dbsnapshot/SnapshotType :portkey.aws.rds.-2013-01-10.dbsnapshot/LicenseModel :portkey.aws.rds.-2013-01-10.dbsnapshot/AllocatedStorage :portkey.aws.rds.-2013-01-10.dbsnapshot/MasterUsername :portkey.aws.rds.-2013-01-10.dbsnapshot/EngineVersion :portkey.aws.rds.-2013-01-10.dbsnapshot/DBSnapshotIdentifier :portkey.aws.rds.-2013-01-10.dbsnapshot/Port :portkey.aws.rds.-2013-01-10.dbsnapshot/VpcId :portkey.aws.rds.-2013-01-10.dbsnapshot/Iops :portkey.aws.rds.-2013-01-10.dbsnapshot/Engine] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-option-group-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-option-group-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-option-group-message/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/create-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.create-option-group-message/OptionGroupName :portkey.aws.rds.-2013-01-10.create-option-group-message/EngineName :portkey.aws.rds.-2013-01-10.create-option-group-message/MajorEngineVersion :portkey.aws.rds.-2013-01-10.create-option-group-message/OptionGroupDescription] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-names-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbinstance-message/skip-final-snapshot (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbinstance-message/finaldbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.deletedbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.deletedbinstance-message/SkipFinalSnapshot :portkey.aws.rds.-2013-01-10.deletedbinstance-message/FinalDBSnapshotIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/reserveddbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-options-message/orderabledbinstance-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/orderabledbinstance-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/orderabledbinstance-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.orderabledbinstance-options-message/OrderableDBInstanceOptions :portkey.aws.rds.-2013-01-10.orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventCategoriesMapList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/end-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-events-message/SourceIdentifier :portkey.aws.rds.-2013-01-10/SourceType :portkey.aws.rds.-2013-01-10.describe-events-message/StartTime :portkey.aws.rds.-2013-01-10.describe-events-message/EndTime :portkey.aws.rds.-2013-01-10.describe-events-message/Duration :portkey.aws.rds.-2013-01-10.describe-events-message/EventCategories :portkey.aws.rds.-2013-01-10.describe-events-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-events-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subscription-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/option-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/options (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/allows-vpc-and-non-vpc-instance-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.option-group/OptionGroupName :portkey.aws.rds.-2013-01-10.option-group/OptionGroupDescription :portkey.aws.rds.-2013-01-10.option-group/EngineName :portkey.aws.rds.-2013-01-10.option-group/MajorEngineVersion :portkey.aws.rds.-2013-01-10.option-group/Options :portkey.aws.rds.-2013-01-10.option-group/AllowsVpcAndNonVpcInstanceMemberships :portkey.aws.rds.-2013-01-10.option-group/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/authorization-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-groups-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/option-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/iprange-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/iprange))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbsubnet-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-01-10.authorizedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/snstopic-arn-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/event))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.events-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.events-message/events (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/events-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.events-message/Marker :portkey.aws.rds.-2013-01-10.events-message/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/source-type {"db-instance" "db-instance", :db-instance "db-instance", "db-parameter-group" "db-parameter-group", :db-parameter-group "db-parameter-group", "db-security-group" "db-security-group", :db-security-group "db-security-group", "db-snapshot" "db-snapshot", :db-snapshot "db-snapshot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/orderabledbinstance-options-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/orderabledbinstance-option))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsnapshot-message/dbsnapshots (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsnapshot-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsnapshot-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsnapshot-message/Marker :portkey.aws.rds.-2013-01-10.dbsnapshot-message/DBSnapshots] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subscription-category-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event/message (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event/date (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.event/SourceIdentifier :portkey.aws.rds.-2013-01-10/SourceType :portkey.aws.rds.-2013-01-10.event/Message :portkey.aws.rds.-2013-01-10.event/EventCategories :portkey.aws.rds.-2013-01-10.event/Date] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-options-message/option-group-options (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/option-group-options-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-options-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.option-group-options-message/OptionGroupOptions :portkey.aws.rds.-2013-01-10.option-group-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/availability-zone))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/reset-all-parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/resetdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/ResetAllParameters :portkey.aws.rds.-2013-01-10.resetdbparameter-group-message/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.availability-zone/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.availability-zone/provisioned-iops-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/availability-zone (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.availability-zone/Name :portkey.aws.rds.-2013-01-10.availability-zone/ProvisionedIopsCapable] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-subscriptions-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-subscriptions-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.event-subscriptions-message/Marker :portkey.aws.rds.-2013-01-10/EventSubscriptionsList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering-message/reserveddbinstances-offerings (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.reserveddbinstances-offering-message/Marker :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering-message/ReservedDBInstancesOfferings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/create-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsecurity-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-orderabledbinstance-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/Engine] :opt-un [:portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/EngineVersion :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/LicenseModel :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/Vpc :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-orderabledbinstance-options-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/subnet-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/subnet-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/DBSubnetGroupDescription :portkey.aws.rds.-2013-01-10.createdbsubnet-group-message/SubnetIds] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbsecurity-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-groups/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-groups (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/OptionGroupsList :portkey.aws.rds.-2013-01-10.option-groups/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.delete-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/delete-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.delete-event-subscription-message/SubscriptionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/read-replicadbinstance-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSecurityGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-groups-message/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbparameter-groups-message/Marker :portkey.aws.rds.-2013-01-10.dbparameter-groups-message/DBParameterGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.recurring-charge/recurring-charge-amount (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.recurring-charge/recurring-charge-frequency (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/recurring-charge (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.recurring-charge/RecurringChargeAmount :portkey.aws.rds.-2013-01-10.recurring-charge/RecurringChargeFrequency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EngineDefaults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/authorization-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.copydbsnapshot-message/sourcedbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.copydbsnapshot-message/targetdbsnapshot-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/copydbsnapshot-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.copydbsnapshot-message/SourceDBSnapshotIdentifier :portkey.aws.rds.-2013-01-10.copydbsnapshot-message/TargetDBSnapshotIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/SourceDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/OptionGroupName :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/PubliclyAccessible :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/AvailabilityZone :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/Port :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/Iops :portkey.aws.rds.-2013-01-10.createdbinstance-read-replica-message/DBInstanceClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subnet-already-in-use (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/create-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/copydbsnapshot-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSnapshot] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/minimum-required-minor-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/port-required (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-option/default-port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.option-group-option/Name :portkey.aws.rds.-2013-01-10.option-group-option/Description :portkey.aws.rds.-2013-01-10.option-group-option/EngineName :portkey.aws.rds.-2013-01-10.option-group-option/MajorEngineVersion :portkey.aws.rds.-2013-01-10.option-group-option/MinimumRequiredMinorEngineVersion :portkey.aws.rds.-2013-01-10.option-group-option/PortRequired :portkey.aws.rds.-2013-01-10.option-group-option/DefaultPort :portkey.aws.rds.-2013-01-10/OptionsDependedOn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invalid-subnet (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/tag-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/tag))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modify-option-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/OptionGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/dbengine-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/dbengine-version-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/default-character-set (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/character-set))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version/supported-character-sets (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/supported-character-sets-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbengine-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbengine-version/Engine :portkey.aws.rds.-2013-01-10.dbengine-version/EngineVersion :portkey.aws.rds.-2013-01-10.dbengine-version/DBParameterGroupFamily :portkey.aws.rds.-2013-01-10.dbengine-version/DBEngineDescription :portkey.aws.rds.-2013-01-10.dbengine-version/DBEngineVersionDescription :portkey.aws.rds.-2013-01-10.dbengine-version/DefaultCharacterSet :portkey.aws.rds.-2013-01-10.dbengine-version/SupportedCharacterSets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subscription-already-exist-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbupgrade-dependency-failure-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.add-source-identifier-to-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.add-source-identifier-to-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.add-source-identifier-to-subscription-message/SubscriptionName :portkey.aws.rds.-2013-01-10.add-source-identifier-to-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.add-tags-to-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.add-tags-to-resource-message/tags (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tag-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/add-tags-to-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.add-tags-to-resource-message/ResourceName :portkey.aws.rds.-2013-01-10.add-tags-to-resource-message/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invalid-event-subscription-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/tag-list-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/TagList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbparameter-group-message/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbparameter-group-message/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-01-10.createdbparameter-group-message/DBParameterGroupFamily :portkey.aws.rds.-2013-01-10.createdbparameter-group-message/Description] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.vpc-security-group-membership/vpc-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.vpc-security-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/vpc-security-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.vpc-security-group-membership/VpcSecurityGroupId :portkey.aws.rds.-2013-01-10.vpc-security-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/restore-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/targetdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/use-latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/SourceDBInstanceIdentifier :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/TargetDBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/OptionGroupName :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/PubliclyAccessible :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/DBName :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/AvailabilityZone :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/RestoreTime :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/LicenseModel :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/Port :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/Iops :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/Engine :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/MultiAZ :portkey.aws.rds.-2013-01-10.restoredbinstance-to-point-in-time-message/UseLatestRestorableTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/authorization-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance-message/reserveddbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/reserveddbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.reserveddbinstance-message/Marker :portkey.aws.rds.-2013-01-10.reserveddbinstance-message/ReservedDBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbparameter-group-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbparameter-group-message/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modifydbparameter-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.modifydbparameter-group-message/DBParameterGroupName :portkey.aws.rds.-2013-01-10.modifydbparameter-group-message/Parameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modifydbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.rebootdbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.rebootdbinstance-message/force-failover (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/rebootdbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.rebootdbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.rebootdbinstance-message/ForceFailover] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invalid-option-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/CurrencyCode :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/FixedPrice :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/Duration :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/UsagePrice :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/ProductDescription :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/DBInstanceClass :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/RecurringCharges :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/OfferingType :portkey.aws.rds.-2013-01-10.reserveddbinstances-offering/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.ec2-security-group/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.ec2-security-group/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.ec2-security-group/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.ec2-security-group/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/ec2-security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.ec2-security-group/Status :portkey.aws.rds.-2013-01-10.ec2-security-group/EC2SecurityGroupName :portkey.aws.rds.-2013-01-10.ec2-security-group/EC2SecurityGroupId :portkey.aws.rds.-2013-01-10.ec2-security-group/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.remove-source-identifier-from-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.remove-source-identifier-from-subscription-message/source-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.remove-source-identifier-from-subscription-message/SubscriptionName :portkey.aws.rds.-2013-01-10.remove-source-identifier-from-subscription-message/SourceIdentifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/point-in-time-restore-not-enabled-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.remove-tags-from-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.remove-tags-from-resource-message/tag-keys (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/key-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/remove-tags-from-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.remove-tags-from-resource-message/ResourceName :portkey.aws.rds.-2013-01-10.remove-tags-from-resource-message/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-categories-map-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/event-categories-map))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/data-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/parameter-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/minimum-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/allowed-values (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/apply-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/is-modifiable (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.parameter/parameter-value (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/parameter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.parameter/DataType :portkey.aws.rds.-2013-01-10.parameter/ParameterName :portkey.aws.rds.-2013-01-10.parameter/Source :portkey.aws.rds.-2013-01-10.parameter/MinimumEngineVersion :portkey.aws.rds.-2013-01-10.parameter/AllowedValues :portkey.aws.rds.-2013-01-10.parameter/ApplyType :portkey.aws.rds.-2013-01-10.parameter/Description :portkey.aws.rds.-2013-01-10/ApplyMethod :portkey.aws.rds.-2013-01-10.parameter/IsModifiable :portkey.aws.rds.-2013-01-10.parameter/ParameterValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/vpc-security-group-id-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group-membership/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsecurity-group-membership/DBSecurityGroupName :portkey.aws.rds.-2013-01-10.dbsecurity-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/secondary-availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/publicly-accessible (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/read-replicadbinstance-identifiers (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/read-replicadbinstance-identifier-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbname (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/instance-create-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/availability-zone (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/read-replica-sourcedbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/master-username (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbparameter-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-group-status-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/vpc-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/vpc-security-group-membership-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/dbinstance-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance/latest-restorable-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbinstance/BackupRetentionPeriod :portkey.aws.rds.-2013-01-10.dbinstance/DBSecurityGroups :portkey.aws.rds.-2013-01-10.dbinstance/SecondaryAvailabilityZone :portkey.aws.rds.-2013-01-10.dbinstance/CharacterSetName :portkey.aws.rds.-2013-01-10.dbinstance/PubliclyAccessible :portkey.aws.rds.-2013-01-10.dbinstance/ReadReplicaDBInstanceIdentifiers :portkey.aws.rds.-2013-01-10.dbinstance/PreferredMaintenanceWindow :portkey.aws.rds.-2013-01-10.dbinstance/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.dbinstance/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.dbinstance/DBName :portkey.aws.rds.-2013-01-10.dbinstance/InstanceCreateTime :portkey.aws.rds.-2013-01-10.dbinstance/AvailabilityZone :portkey.aws.rds.-2013-01-10.dbinstance/ReadReplicaSourceDBInstanceIdentifier :portkey.aws.rds.-2013-01-10.dbinstance/LicenseModel :portkey.aws.rds.-2013-01-10.dbinstance/AllocatedStorage :portkey.aws.rds.-2013-01-10.dbinstance/MasterUsername :portkey.aws.rds.-2013-01-10.dbinstance/EngineVersion :portkey.aws.rds.-2013-01-10.dbinstance/Iops :portkey.aws.rds.-2013-01-10/Endpoint :portkey.aws.rds.-2013-01-10/OptionGroupMembership :portkey.aws.rds.-2013-01-10.dbinstance/DBInstanceClass :portkey.aws.rds.-2013-01-10.dbinstance/DBParameterGroups :portkey.aws.rds.-2013-01-10.dbinstance/VpcSecurityGroups :portkey.aws.rds.-2013-01-10.dbinstance/Engine :portkey.aws.rds.-2013-01-10.dbinstance/DBInstanceStatus :portkey.aws.rds.-2013-01-10.dbinstance/MultiAZ :portkey.aws.rds.-2013-01-10.dbinstance/PreferredBackupWindow :portkey.aws.rds.-2013-01-10/PendingModifiedValues :portkey.aws.rds.-2013-01-10.dbinstance/LatestRestorableTime :portkey.aws.rds.-2013-01-10/DBSubnetGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/tstamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/ReservedDBInstancesOfferingId] :opt-un [:portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/ReservedDBInstanceId :portkey.aws.rds.-2013-01-10.purchase-reserveddbinstances-offering-message/DBInstanceCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-membership-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbsecurity-group-membership))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-categories-map/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.event-categories-map/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-categories-map (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.event-categories-map/SourceType :portkey.aws.rds.-2013-01-10.event-categories-map/EventCategories] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-subscription-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/source-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/source-ids-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.create-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/create-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.create-event-subscription-message/SubscriptionName :portkey.aws.rds.-2013-01-10.create-event-subscription-message/SnsTopicArn] :opt-un [:portkey.aws.rds.-2013-01-10.create-event-subscription-message/SourceType :portkey.aws.rds.-2013-01-10.create-event-subscription-message/EventCategories :portkey.aws.rds.-2013-01-10.create-event-subscription-message/SourceIds :portkey.aws.rds.-2013-01-10.create-event-subscription-message/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/recurring-charge-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/recurring-charge))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-categories-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbengine-version-message/dbengine-versions (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbengine-version-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbengine-version-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbengine-version-message/Marker :portkey.aws.rds.-2013-01-10.dbengine-version-message/DBEngineVersions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbinstance-message/dbinstances (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbinstance-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbinstance-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbinstance-message/Marker :portkey.aws.rds.-2013-01-10.dbinstance-message/DBInstances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-supported-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbparameter-group-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBParameterGroup] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/apply-method {"immediate" "immediate", :immediate "immediate", "pending-reboot" "pending-reboot", :pending-reboot "pending-reboot"})

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.endpoint/address (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.endpoint/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.endpoint/Address :portkey.aws.rds.-2013-01-10.endpoint/Port] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbparameter-group/description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbparameter-group/DBParameterGroupName :portkey.aws.rds.-2013-01-10.dbparameter-group/DBParameterGroupFamily :portkey.aws.rds.-2013-01-10.dbparameter-group/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/supported-character-sets-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/character-set))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invalid-restore-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-membership/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-group-membership/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-group-membership (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.option-group-membership/OptionGroupName :portkey.aws.rds.-2013-01-10.option-group-membership/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/currency-code (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/start-time (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tstamp))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/fixed-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/dbinstance-count (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/usage-price (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/double))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/state (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/recurring-charges (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/recurring-charge-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.reserveddbinstance/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.reserveddbinstance/ReservedDBInstanceId :portkey.aws.rds.-2013-01-10.reserveddbinstance/CurrencyCode :portkey.aws.rds.-2013-01-10.reserveddbinstance/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-01-10.reserveddbinstance/StartTime :portkey.aws.rds.-2013-01-10.reserveddbinstance/FixedPrice :portkey.aws.rds.-2013-01-10.reserveddbinstance/DBInstanceCount :portkey.aws.rds.-2013-01-10.reserveddbinstance/Duration :portkey.aws.rds.-2013-01-10.reserveddbinstance/UsagePrice :portkey.aws.rds.-2013-01-10.reserveddbinstance/ProductDescription :portkey.aws.rds.-2013-01-10.reserveddbinstance/DBInstanceClass :portkey.aws.rds.-2013-01-10.reserveddbinstance/State :portkey.aws.rds.-2013-01-10.reserveddbinstance/RecurringCharges :portkey.aws.rds.-2013-01-10.reserveddbinstance/OfferingType :portkey.aws.rds.-2013-01-10.reserveddbinstance/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbparameter-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/DBParameterGroupName :portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbparameter-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbsubnet-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.iprange/status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.iprange/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/iprange (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.iprange/Status :portkey.aws.rds.-2013-01-10.iprange/CIDRIP] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.character-set/character-set-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.character-set/character-set-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/character-set (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.character-set/CharacterSetName :portkey.aws.rds.-2013-01-10.character-set/CharacterSetDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbparameter-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modify-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.tag/key (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.tag/value (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.tag/Key :portkey.aws.rds.-2013-01-10.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-event-categories-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-event-categories-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-event-categories-message/SourceType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/boolean-optional clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/snsinvalid-topic-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/options-depended-on (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/string))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.list-tags-for-resource-message/resource-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/list-tags-for-resource-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.list-tags-for-resource-message/ResourceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.deletedbsubnet-group-message/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbsubnet-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.deletedbsubnet-group-message/DBSubnetGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbinstance-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbinstance))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/deletedbinstance-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/delete-event-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/option-configuration))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/EventSubscription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsecurity-group-message/Marker :portkey.aws.rds.-2013-01-10/DBSecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsecurity-group-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.createdbsecurity-group-message/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbsecurity-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.createdbsecurity-group-message/DBSecurityGroupName :portkey.aws.rds.-2013-01-10.createdbsecurity-group-message/DBSecurityGroupDescription] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/event-subscriptions-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/event-subscription))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsnapshot-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbsnapshot))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.engine-defaults/dbparameter-group-family (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.engine-defaults/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.engine-defaults/parameters (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/parameters-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/engine-defaults (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.engine-defaults/DBParameterGroupFamily :portkey.aws.rds.-2013-01-10.engine-defaults/Marker :portkey.aws.rds.-2013-01-10.engine-defaults/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-groups (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/dbsubnet-group))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-configuration/option-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-configuration/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-configuration/dbsecurity-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.option-configuration/vpc-security-group-memberships (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/option-configuration (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.option-configuration/OptionName] :opt-un [:portkey.aws.rds.-2013-01-10.option-configuration/Port :portkey.aws.rds.-2013-01-10.option-configuration/DBSecurityGroupMemberships :portkey.aws.rds.-2013-01-10.option-configuration/VpcSecurityGroupMemberships] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbsnapshot-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/integer-optional clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/dbsecurity-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/ec2-security-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/ec2-security-group-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsecurity-group/ipranges (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/iprange-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsecurity-group/OwnerId :portkey.aws.rds.-2013-01-10.dbsecurity-group/DBSecurityGroupName :portkey.aws.rds.-2013-01-10.dbsecurity-group/DBSecurityGroupDescription :portkey.aws.rds.-2013-01-10.dbsecurity-group/VpcId :portkey.aws.rds.-2013-01-10.dbsecurity-group/EC2SecurityGroups :portkey.aws.rds.-2013-01-10.dbsecurity-group/IPRanges] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-offerings-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/Duration :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/ProductDescription :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/OfferingType :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/MultiAZ :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-offerings-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbsecurity-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/DBSecurityGroupName :portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbsecurity-groups-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.delete-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/delete-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.delete-option-group-message/OptionGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameters-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameters-message/source (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameters-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describedbparameters-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describedbparameters-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.describedbparameters-message/DBParameterGroupName] :opt-un [:portkey.aws.rds.-2013-01-10.describedbparameters-message/Source :portkey.aws.rds.-2013-01-10.describedbparameters-message/MaxRecords :portkey.aws.rds.-2013-01-10.describedbparameters-message/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/reserveddbinstance-quota-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/ReservedDBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/reserveddbinstance-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/reserveddbinstances-offering-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/duration (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/product-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/offering-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/ReservedDBInstanceId :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/ReservedDBInstancesOfferingId :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/Marker :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/Duration :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/ProductDescription :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/OfferingType :portkey.aws.rds.-2013-01-10.describe-reserveddbinstances-message/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/dbsecurity-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/cidrip (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/ec2-security-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/ec2-security-group-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/ec2-security-group-owner-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/DBSecurityGroupName] :opt-un [:portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/CIDRIP :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/EC2SecurityGroupName :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/EC2SecurityGroupId :portkey.aws.rds.-2013-01-10.revokedbsecurity-group-ingress-message/EC2SecurityGroupOwnerId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/engine (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/license-model (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/availability-zones (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/multiazcapable (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/read-replica-capable (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/vpc (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/orderabledbinstance-option (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.orderabledbinstance-option/Engine :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/EngineVersion :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/DBInstanceClass :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/LicenseModel :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/AvailabilityZones :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/MultiAZCapable :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/ReadReplicaCapable :portkey.aws.rds.-2013-01-10.orderabledbinstance-option/Vpc] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/port (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.pending-modified-values/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/pending-modified-values (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.pending-modified-values/BackupRetentionPeriod :portkey.aws.rds.-2013-01-10.pending-modified-values/DBInstanceIdentifier :portkey.aws.rds.-2013-01-10.pending-modified-values/MasterUserPassword :portkey.aws.rds.-2013-01-10.pending-modified-values/AllocatedStorage :portkey.aws.rds.-2013-01-10.pending-modified-values/EngineVersion :portkey.aws.rds.-2013-01-10.pending-modified-values/Port :portkey.aws.rds.-2013-01-10.pending-modified-values/Iops :portkey.aws.rds.-2013-01-10.pending-modified-values/DBInstanceClass :portkey.aws.rds.-2013-01-10.pending-modified-values/MultiAZ] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/subnet-list (clojure.spec.alpha/coll-of :portkey.aws.rds.-2013-01-10/subnet))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10/DBInstance] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/invaliddbparameter-group-state-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/backup-retention-period (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/dbsecurity-groups (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-name-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/preferred-maintenance-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/dbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/newdbinstance-identifier (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/vpc-security-group-ids (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/vpc-security-group-id-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/master-user-password (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/allow-major-version-upgrade (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/allocated-storage (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/iops (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/dbinstance-class (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/dbparameter-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/multiaz (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modifydbinstance-message/preferred-backup-window (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modifydbinstance-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.modifydbinstance-message/DBInstanceIdentifier] :opt-un [:portkey.aws.rds.-2013-01-10.modifydbinstance-message/BackupRetentionPeriod :portkey.aws.rds.-2013-01-10.modifydbinstance-message/OptionGroupName :portkey.aws.rds.-2013-01-10.modifydbinstance-message/DBSecurityGroups :portkey.aws.rds.-2013-01-10.modifydbinstance-message/PreferredMaintenanceWindow :portkey.aws.rds.-2013-01-10.modifydbinstance-message/AutoMinorVersionUpgrade :portkey.aws.rds.-2013-01-10.modifydbinstance-message/NewDBInstanceIdentifier :portkey.aws.rds.-2013-01-10.modifydbinstance-message/VpcSecurityGroupIds :portkey.aws.rds.-2013-01-10.modifydbinstance-message/MasterUserPassword :portkey.aws.rds.-2013-01-10.modifydbinstance-message/AllowMajorVersionUpgrade :portkey.aws.rds.-2013-01-10.modifydbinstance-message/AllocatedStorage :portkey.aws.rds.-2013-01-10.modifydbinstance-message/EngineVersion :portkey.aws.rds.-2013-01-10.modifydbinstance-message/Iops :portkey.aws.rds.-2013-01-10.modifydbinstance-message/ApplyImmediately :portkey.aws.rds.-2013-01-10.modifydbinstance-message/DBInstanceClass :portkey.aws.rds.-2013-01-10.modifydbinstance-message/DBParameterGroupName :portkey.aws.rds.-2013-01-10.modifydbinstance-message/MultiAZ :portkey.aws.rds.-2013-01-10.modifydbinstance-message/PreferredBackupWindow] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-option-group-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-option-group-message/options-to-include (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/option-configuration-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-option-group-message/options-to-remove (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/option-names-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-option-group-message/apply-immediately (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modify-option-group-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.modify-option-group-message/OptionGroupName] :opt-un [:portkey.aws.rds.-2013-01-10.modify-option-group-message/OptionsToInclude :portkey.aws.rds.-2013-01-10.modify-option-group-message/OptionsToRemove :portkey.aws.rds.-2013-01-10.modify-option-group-message/ApplyImmediately] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsecurity-group-already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group/dbsubnet-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group/dbsubnet-group-description (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group/vpc-id (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group/subnet-group-status (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.dbsubnet-group/subnets (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/subnet-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/dbsubnet-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.dbsubnet-group/DBSubnetGroupName :portkey.aws.rds.-2013-01-10.dbsubnet-group/DBSubnetGroupDescription :portkey.aws.rds.-2013-01-10.dbsubnet-group/VpcId :portkey.aws.rds.-2013-01-10.dbsubnet-group/SubnetGroupStatus :portkey.aws.rds.-2013-01-10.dbsubnet-group/Subnets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-groups-message/option-group-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-groups-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-groups-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-groups-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-groups-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-option-groups-message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.rds.-2013-01-10.describe-option-groups-message/OptionGroupName :portkey.aws.rds.-2013-01-10.describe-option-groups-message/Marker :portkey.aws.rds.-2013-01-10.describe-option-groups-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-option-groups-message/EngineName :portkey.aws.rds.-2013-01-10.describe-option-groups-message/MajorEngineVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/subscription-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/source-type (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/event-categories (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-list))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/enabled (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/boolean-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/modify-event-subscription-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.modify-event-subscription-message/SubscriptionName] :opt-un [:portkey.aws.rds.-2013-01-10.modify-event-subscription-message/SnsTopicArn :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/SourceType :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/EventCategories :portkey.aws.rds.-2013-01-10.modify-event-subscription-message/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/engine-name (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/major-engine-version (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/max-records (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/integer-optional))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/marker (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/string))
(clojure.spec.alpha/def :portkey.aws.rds.-2013-01-10/describe-option-group-options-message (portkey.aws/json-keys :req-un [:portkey.aws.rds.-2013-01-10.describe-option-group-options-message/EngineName] :opt-un [:portkey.aws.rds.-2013-01-10.describe-option-group-options-message/MajorEngineVersion :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/MaxRecords :portkey.aws.rds.-2013-01-10.describe-option-group-options-message/Marker] :locations {}))

(clojure.core/defn add-source-identifier-to-subscription ([add-source-identifier-to-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-source-identifier-to-subscription-message "AddSourceIdentifierToSubscription" add-source-identifier-to-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-01-10/source-not-found-fault}))))
(clojure.spec.alpha/fdef add-source-identifier-to-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/add-source-identifier-to-subscription-result))

(clojure.core/defn deletedbsnapshot ([deletedbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsnapshot-message "DeleteDBSnapshot" deletedbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/deletedbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/deletedbsnapshot-result {"InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/deletedbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/deletedbsnapshot-result))

(clojure.core/defn deletedbsubnet-group ([deletedbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsubnet-group-message "DeleteDBSubnetGroup" deletedbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/deletedbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSubnetGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsubnet-group-state-fault, "InvalidDBSubnetStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsubnet-state-fault, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/deletedbsubnet-group-message) :ret clojure.core/true?)

(clojure.core/defn describe-orderabledbinstance-options ([describe-orderabledbinstance-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-orderabledbinstance-options-message "DescribeOrderableDBInstanceOptions" describe-orderabledbinstance-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-orderabledbinstance-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/orderabledbinstance-options-message {}))))
(clojure.spec.alpha/fdef describe-orderabledbinstance-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/describe-orderabledbinstance-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/orderabledbinstance-options-message))

(clojure.core/defn revokedbsecurity-group-ingress ([revokedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-revokedbsecurity-group-ingress-message "RevokeDBSecurityGroupIngress" revokedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault, "AuthorizationNotFoundFault" :portkey.aws.rds.-2013-01-10/authorization-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsecurity-group-state-fault}))))
(clojure.spec.alpha/fdef revokedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/revokedbsecurity-group-ingress-result))

(clojure.core/defn authorizedbsecurity-group-ingress ([authorizedbsecurity-group-ingress-message] (clojure.core/let [req<-input__36755__auto__ (req<-authorizedbsecurity-group-ingress-message "AuthorizeDBSecurityGroupIngress" authorizedbsecurity-group-ingress-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-result {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsecurity-group-state-fault, "AuthorizationAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/authorization-already-exists-fault, "AuthorizationQuotaExceededFault" :portkey.aws.rds.-2013-01-10/authorization-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef authorizedbsecurity-group-ingress :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/authorizedbsecurity-group-ingress-result))

(clojure.core/defn modifydbsubnet-group ([modifydbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbsubnet-group-message "ModifyDBSubnetGroup" modifydbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-result {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-01-10/dbsubnet-quota-exceeded-fault, "SubnetAlreadyInUse" :portkey.aws.rds.-2013-01-10/subnet-already-in-use, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet}))))
(clojure.spec.alpha/fdef modifydbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/modifydbsubnet-group-result))

(clojure.core/defn restoredbinstance-to-point-in-time ([restoredbinstance-to-point-in-time-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-to-point-in-time-message "RestoreDBInstanceToPointInTime" restoredbinstance-to-point-in-time-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-01-10/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault, "PointInTimeRestoreNotEnabledFault" :portkey.aws.rds.-2013-01-10/point-in-time-restore-not-enabled-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-01-10/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-to-point-in-time :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/restoredbinstance-to-point-in-time-result))

(clojure.core/defn describe-events ([] (describe-events {})) ([describe-events-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-events-message "DescribeEvents" describe-events-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-events-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/events-message {}))))
(clojure.spec.alpha/fdef describe-events :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-events-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/events-message))

(clojure.core/defn resetdbparameter-group ([resetdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-resetdbparameter-group-message "ResetDBParameterGroup" resetdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/resetdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbparameter-group-name-message {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef resetdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/resetdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-group-name-message))

(clojure.core/defn describe-option-groups ([] (describe-option-groups {})) ([describe-option-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-groups-message "DescribeOptionGroups" describe-option-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-option-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/option-groups {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef describe-option-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-option-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/option-groups))

(clojure.core/defn rebootdbinstance ([rebootdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-rebootdbinstance-message "RebootDBInstance" rebootdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/rebootdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/rebootdbinstance-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef rebootdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/rebootdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/rebootdbinstance-result))

(clojure.core/defn deletedbsecurity-group ([deletedbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbsecurity-group-message "DeleteDBSecurityGroup" deletedbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/deletedbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsecurity-group-state-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/deletedbsecurity-group-message) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-list-tags-for-resource-message "ListTagsForResource" list-tags-for-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/list-tags-for-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/tag-list-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/list-tags-for-resource-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/tag-list-message))

(clojure.core/defn describe-engine-default-parameters ([describe-engine-default-parameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-engine-default-parameters-message "DescribeEngineDefaultParameters" describe-engine-default-parameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-result {}))))
(clojure.spec.alpha/fdef describe-engine-default-parameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/describe-engine-default-parameters-result))

(clojure.core/defn deletedbinstance ([deletedbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbinstance-message "DeleteDBInstance" deletedbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/deletedbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/deletedbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-already-exists-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-01-10/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef deletedbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/deletedbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/deletedbinstance-result))

(clojure.core/defn describedbsubnet-groups ([] (describedbsubnet-groups {})) ([describedbsubnet-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsubnet-groups-message "DescribeDBSubnetGroups" describedbsubnet-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbsubnet-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbsubnet-group-message {"DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsubnet-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbsubnet-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsubnet-group-message))

(clojure.core/defn createdbinstance ([createdbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-message "CreateDBInstance" createdbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbinstance-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-01-10/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbinstance-result))

(clojure.core/defn promote-read-replica ([promote-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-promote-read-replica-message "PromoteReadReplica" promote-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/promote-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/promote-read-replica-result {"InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef promote-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/promote-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/promote-read-replica-result))

(clojure.core/defn delete-event-subscription ([delete-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-event-subscription-message "DeleteEventSubscription" delete-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/delete-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/delete-event-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-not-found-fault, "InvalidEventSubscriptionStateFault" :portkey.aws.rds.-2013-01-10/invalid-event-subscription-state-fault}))))
(clojure.spec.alpha/fdef delete-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/delete-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/delete-event-subscription-result))

(clojure.core/defn restoredbinstance-fromdbsnapshot ([restoredbinstance-fromdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-restoredbinstance-fromdbsnapshot-message "RestoreDBInstanceFromDBSnapshot" restoredbinstance-fromdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-result {"InstanceQuotaExceededFault" :portkey.aws.rds.-2013-01-10/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault, "InvalidRestoreFault" :portkey.aws.rds.-2013-01-10/invalid-restore-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsnapshot-state-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef restoredbinstance-fromdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/restoredbinstance-fromdbsnapshot-result))

(clojure.core/defn describedbsnapshots ([] (describedbsnapshots {})) ([describedbsnapshots-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsnapshots-message "DescribeDBSnapshots" describedbsnapshots-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbsnapshots-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbsnapshot-message {"DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsnapshots :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbsnapshots-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsnapshot-message))

(clojure.core/defn createdbsubnet-group ([createdbsubnet-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsubnet-group-message "CreateDBSubnetGroup" createdbsubnet-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbsubnet-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbsubnet-group-result {"DBSubnetGroupAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-already-exists-fault, "DBSubnetGroupQuotaExceededFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-quota-exceeded-fault, "DBSubnetQuotaExceededFault" :portkey.aws.rds.-2013-01-10/dbsubnet-quota-exceeded-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet}))))
(clojure.spec.alpha/fdef createdbsubnet-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbsubnet-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbsubnet-group-result))

(clojure.core/defn remove-source-identifier-from-subscription ([remove-source-identifier-from-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-source-identifier-from-subscription-message "RemoveSourceIdentifierFromSubscription" remove-source-identifier-from-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-result {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-01-10/source-not-found-fault}))))
(clojure.spec.alpha/fdef remove-source-identifier-from-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/remove-source-identifier-from-subscription-result))

(clojure.core/defn create-option-group ([create-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-option-group-message "CreateOptionGroup" create-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/create-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/create-option-group-result {"OptionGroupAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/option-group-already-exists-fault, "OptionGroupQuotaExceededFault" :portkey.aws.rds.-2013-01-10/option-group-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef create-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/create-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/create-option-group-result))

(clojure.core/defn describe-event-categories ([] (describe-event-categories {})) ([describe-event-categories-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-categories-message "DescribeEventCategories" describe-event-categories-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-event-categories-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/event-categories-message {}))))
(clojure.spec.alpha/fdef describe-event-categories :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-event-categories-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-categories-message))

(clojure.core/defn describe-reserveddbinstances-offerings ([] (describe-reserveddbinstances-offerings {})) ([describe-reserveddbinstances-offerings-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-offerings-message "DescribeReservedDBInstancesOfferings" describe-reserveddbinstances-offerings-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-offerings-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-message {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances-offerings :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-offerings-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-message))

(clojure.core/defn createdbsnapshot ([createdbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsnapshot-message "CreateDBSnapshot" createdbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-already-exists-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-01-10/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef createdbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbsnapshot-result))

(clojure.core/defn describedbinstances ([] (describedbinstances {})) ([describedbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbinstances-message "DescribeDBInstances" describedbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbinstance-message {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describedbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbinstance-message))

(clojure.core/defn modify-event-subscription ([modify-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-event-subscription-message "ModifyEventSubscription" modify-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/modify-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/modify-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-01-10/event-subscription-quota-exceeded-fault, "SubscriptionNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-not-found-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-01-10/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-01-10/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-01-10/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-category-not-found-fault}))))
(clojure.spec.alpha/fdef modify-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/modify-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/modify-event-subscription-result))

(clojure.core/defn describedbengine-versions ([] (describedbengine-versions {})) ([describedbengine-versions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbengine-versions-message "DescribeDBEngineVersions" describedbengine-versions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbengine-versions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbengine-version-message {}))))
(clojure.spec.alpha/fdef describedbengine-versions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbengine-versions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbengine-version-message))

(clojure.core/defn describe-option-group-options ([describe-option-group-options-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-option-group-options-message "DescribeOptionGroupOptions" describe-option-group-options-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-option-group-options-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/option-group-options-message {}))))
(clojure.spec.alpha/fdef describe-option-group-options :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/describe-option-group-options-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/option-group-options-message))

(clojure.core/defn createdbsecurity-group ([createdbsecurity-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbsecurity-group-message "CreateDBSecurityGroup" createdbsecurity-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbsecurity-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbsecurity-group-result {"DBSecurityGroupAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-already-exists-fault, "DBSecurityGroupQuotaExceededFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-quota-exceeded-fault, "DBSecurityGroupNotSupportedFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-supported-fault}))))
(clojure.spec.alpha/fdef createdbsecurity-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbsecurity-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbsecurity-group-result))

(clojure.core/defn delete-option-group ([delete-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-delete-option-group-message "DeleteOptionGroup" delete-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/delete-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-01-10/invalid-option-group-state-fault}))))
(clojure.spec.alpha/fdef delete-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/delete-option-group-message) :ret clojure.core/true?)

(clojure.core/defn create-event-subscription ([create-event-subscription-message] (clojure.core/let [req<-input__36755__auto__ (req<-create-event-subscription-message "CreateEventSubscription" create-event-subscription-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/create-event-subscription-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/create-event-subscription-result {"EventSubscriptionQuotaExceededFault" :portkey.aws.rds.-2013-01-10/event-subscription-quota-exceeded-fault, "SubscriptionAlreadyExistFault" :portkey.aws.rds.-2013-01-10/subscription-already-exist-fault, "SNSInvalidTopicFault" :portkey.aws.rds.-2013-01-10/snsinvalid-topic-fault, "SNSNoAuthorizationFault" :portkey.aws.rds.-2013-01-10/snsno-authorization-fault, "SNSTopicArnNotFoundFault" :portkey.aws.rds.-2013-01-10/snstopic-arn-not-found-fault, "SubscriptionCategoryNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-category-not-found-fault, "SourceNotFoundFault" :portkey.aws.rds.-2013-01-10/source-not-found-fault}))))
(clojure.spec.alpha/fdef create-event-subscription :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/create-event-subscription-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/create-event-subscription-result))

(clojure.core/defn createdbparameter-group ([createdbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbparameter-group-message "CreateDBParameterGroup" createdbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbparameter-group-result {"DBParameterGroupQuotaExceededFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-quota-exceeded-fault, "DBParameterGroupAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-already-exists-fault}))))
(clojure.spec.alpha/fdef createdbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbparameter-group-result))

(clojure.core/defn purchase-reserveddbinstances-offering ([purchase-reserveddbinstances-offering-message] (clojure.core/let [req<-input__36755__auto__ (req<-purchase-reserveddbinstances-offering-message "PurchaseReservedDBInstancesOffering" purchase-reserveddbinstances-offering-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-result {"ReservedDBInstancesOfferingNotFoundFault" :portkey.aws.rds.-2013-01-10/reserveddbinstances-offering-not-found-fault, "ReservedDBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/reserveddbinstance-already-exists-fault, "ReservedDBInstanceQuotaExceededFault" :portkey.aws.rds.-2013-01-10/reserveddbinstance-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef purchase-reserveddbinstances-offering :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/purchase-reserveddbinstances-offering-result))

(clojure.core/defn deletedbparameter-group ([deletedbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-deletedbparameter-group-message "DeleteDBParameterGroup" deletedbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/deletedbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbparameter-group-state-fault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef deletedbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/deletedbparameter-group-message) :ret clojure.core/true?)

(clojure.core/defn copydbsnapshot ([copydbsnapshot-message] (clojure.core/let [req<-input__36755__auto__ (req<-copydbsnapshot-message "CopyDBSnapshot" copydbsnapshot-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/copydbsnapshot-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/copydbsnapshot-result {"DBSnapshotAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-already-exists-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault, "InvalidDBSnapshotStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsnapshot-state-fault, "SnapshotQuotaExceededFault" :portkey.aws.rds.-2013-01-10/snapshot-quota-exceeded-fault}))))
(clojure.spec.alpha/fdef copydbsnapshot :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/copydbsnapshot-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/copydbsnapshot-result))

(clojure.core/defn describe-reserveddbinstances ([] (describe-reserveddbinstances {})) ([describe-reserveddbinstances-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-reserveddbinstances-message "DescribeReservedDBInstances" describe-reserveddbinstances-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/reserveddbinstance-message {"ReservedDBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/reserveddbinstance-not-found-fault}))))
(clojure.spec.alpha/fdef describe-reserveddbinstances :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-reserveddbinstances-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/reserveddbinstance-message))

(clojure.core/defn describe-event-subscriptions ([] (describe-event-subscriptions {})) ([describe-event-subscriptions-message] (clojure.core/let [req<-input__36755__auto__ (req<-describe-event-subscriptions-message "DescribeEventSubscriptions" describe-event-subscriptions-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describe-event-subscriptions-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/event-subscriptions-message {"SubscriptionNotFoundFault" :portkey.aws.rds.-2013-01-10/subscription-not-found-fault}))))
(clojure.spec.alpha/fdef describe-event-subscriptions :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describe-event-subscriptions-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/event-subscriptions-message))

(clojure.core/defn modifydbinstance ([modifydbinstance-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbinstance-message "ModifyDBInstance" modifydbinstance-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/modifydbinstance-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/modifydbinstance-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault, "InvalidDBSecurityGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbsecurity-group-state-fault, "DBUpgradeDependencyFailureFault" :portkey.aws.rds.-2013-01-10/dbupgrade-dependency-failure-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef modifydbinstance :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/modifydbinstance-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/modifydbinstance-result))

(clojure.core/defn describedbparameters ([describedbparameters-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameters-message "DescribeDBParameters" describedbparameters-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbparameters-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbparameter-group-details {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameters :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/describedbparameters-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-group-details))

(clojure.core/defn modify-option-group ([modify-option-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modify-option-group-message "ModifyOptionGroup" modify-option-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/modify-option-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/modify-option-group-result {"InvalidOptionGroupStateFault" :portkey.aws.rds.-2013-01-10/invalid-option-group-state-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault}))))
(clojure.spec.alpha/fdef modify-option-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/modify-option-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/modify-option-group-result))

(clojure.core/defn describedbparameter-groups ([] (describedbparameter-groups {})) ([describedbparameter-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbparameter-groups-message "DescribeDBParameterGroups" describedbparameter-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbparameter-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbparameter-groups-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbparameter-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbparameter-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-groups-message))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-remove-tags-from-resource-message "RemoveTagsFromResource" remove-tags-from-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/remove-tags-from-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/remove-tags-from-resource-message) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-message] (clojure.core/let [req<-input__36755__auto__ (req<-add-tags-to-resource-message "AddTagsToResource" add-tags-to-resource-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/add-tags-to-resource-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "DBSnapshotNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsnapshot-not-found-fault}))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/add-tags-to-resource-message) :ret clojure.core/true?)

(clojure.core/defn modifydbparameter-group ([modifydbparameter-group-message] (clojure.core/let [req<-input__36755__auto__ (req<-modifydbparameter-group-message "ModifyDBParameterGroup" modifydbparameter-group-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/modifydbparameter-group-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbparameter-group-name-message {"DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault, "InvalidDBParameterGroupStateFault" :portkey.aws.rds.-2013-01-10/invaliddbparameter-group-state-fault}))))
(clojure.spec.alpha/fdef modifydbparameter-group :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/modifydbparameter-group-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbparameter-group-name-message))

(clojure.core/defn describedbsecurity-groups ([] (describedbsecurity-groups {})) ([describedbsecurity-groups-message] (clojure.core/let [req<-input__36755__auto__ (req<-describedbsecurity-groups-message "DescribeDBSecurityGroups" describedbsecurity-groups-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/describedbsecurity-groups-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/dbsecurity-group-message {"DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef describedbsecurity-groups :args (clojure.spec.alpha/? :portkey.aws.rds.-2013-01-10/describedbsecurity-groups-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/dbsecurity-group-message))

(clojure.core/defn createdbinstance-read-replica ([createdbinstance-read-replica-message] (clojure.core/let [req<-input__36755__auto__ (req<-createdbinstance-read-replica-message "CreateDBInstanceReadReplica" createdbinstance-read-replica-message)] (portkey.aws/-query-call portkey.aws.rds.-2013-01-10/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-message {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-result {"DBInstanceNotFoundFault" :portkey.aws.rds.-2013-01-10/dbinstance-not-found-fault, "InvalidDBInstanceStateFault" :portkey.aws.rds.-2013-01-10/invaliddbinstance-state-fault, "InstanceQuotaExceededFault" :portkey.aws.rds.-2013-01-10/instance-quota-exceeded-fault, "OptionGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/option-group-not-found-fault, "InvalidVPCNetworkStateFault" :portkey.aws.rds.-2013-01-10/invalidvpcnetwork-state-fault, "DBInstanceAlreadyExistsFault" :portkey.aws.rds.-2013-01-10/dbinstance-already-exists-fault, "DBSubnetGroupDoesNotCoverEnoughAZs" :portkey.aws.rds.-2013-01-10/dbsubnet-group-does-not-cover-enoughazs, "InvalidSubnet" :portkey.aws.rds.-2013-01-10/invalid-subnet, "DBSubnetGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsubnet-group-not-found-fault, "ProvisionedIopsNotAvailableInAZFault" :portkey.aws.rds.-2013-01-10/provisioned-iops-not-available-inazfault, "DBParameterGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbparameter-group-not-found-fault, "StorageQuotaExceededFault" :portkey.aws.rds.-2013-01-10/storage-quota-exceeded-fault, "InsufficientDBInstanceCapacityFault" :portkey.aws.rds.-2013-01-10/insufficientdbinstance-capacity-fault, "DBSecurityGroupNotFoundFault" :portkey.aws.rds.-2013-01-10/dbsecurity-group-not-found-fault}))))
(clojure.spec.alpha/fdef createdbinstance-read-replica :args (clojure.spec.alpha/tuple :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-message) :ret (clojure.spec.alpha/and :portkey.aws.rds.-2013-01-10/createdbinstance-read-replica-result))
