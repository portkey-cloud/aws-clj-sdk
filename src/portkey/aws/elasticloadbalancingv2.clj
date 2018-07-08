(ns portkey.aws.elasticloadbalancingv2 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-tag-keys ser-certificate-list ser-load-balancer-attributes ser-load-balancer-scheme-enum ser-load-balancer-names ser-default ser-target-group-attribute-value ser-rule-priority ser-page-size ser-ssl-policy-names ser-subnets ser-load-balancer-arns ser-subnet-id ser-security-groups ser-subnet-mappings ser-path ser-health-check-timeout-seconds ser-rule-condition-list ser-actions ser-list-of-string ser-load-balancer-attribute-value ser-load-balancer-arn ser-load-balancer-name ser-allocation-id ser-marker ser-tag-key ser-rule-arn ser-protocol-enum ser-resource-arns ser-target-group-arn ser-listener-arns ser-target-group-attribute-key ser-subnet-mapping ser-target-type-enum ser-ip-address-type ser-ssl-policy-name ser-action-type-enum ser-health-check-threshold-count ser-target-group-name ser-target-description ser-load-balancer-type-enum ser-tag-list ser-rule-priority-pair ser-http-code ser-target-id ser-listener-arn ser-target-group-attribute ser-tag-value ser-port ser-security-group-id ser-target-group-arns ser-vpc-id ser-health-check-interval-seconds ser-health-check-port ser-target-descriptions ser-load-balancer-attribute-key ser-certificate-arn ser-condition-field-name ser-rule-condition ser-resource-arn ser-tag ser-target-group-names ser-rule-arns ser-matcher ser-target-group-attributes ser-action ser-certificate ser-load-balancer-attribute ser-string-value ser-rule-priority-list ser-zone-name)

(clojure.core/defn- ser-tag-keys [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-certificate-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-scheme-enum [shape-input] ({"internet-facing" "internet-facing", :internet-facing "internet-facing", "internal" "internal", :internal "internal"} shape-input))
(clojure.core/defn- ser-load-balancer-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-default [shape-input] shape-input)
(clojure.core/defn- ser-target-group-attribute-value [shape-input] shape-input)
(clojure.core/defn- ser-rule-priority [shape-input] shape-input)
(clojure.core/defn- ser-page-size [shape-input] shape-input)
(clojure.core/defn- ser-ssl-policy-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-subnets [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-arns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-subnet-id [shape-input] shape-input)
(clojure.core/defn- ser-security-groups [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-subnet-mappings [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-path [shape-input] shape-input)
(clojure.core/defn- ser-health-check-timeout-seconds [shape-input] shape-input)
(clojure.core/defn- ser-rule-condition-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-actions [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-list-of-string [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-attribute-value [shape-input] shape-input)
(clojure.core/defn- ser-load-balancer-arn [shape-input] shape-input)
(clojure.core/defn- ser-load-balancer-name [shape-input] shape-input)
(clojure.core/defn- ser-allocation-id [shape-input] shape-input)
(clojure.core/defn- ser-marker [shape-input] shape-input)
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-rule-arn [shape-input] shape-input)
(clojure.core/defn- ser-protocol-enum [shape-input] ({"HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS", "TCP" "TCP", :tcp "TCP"} shape-input))
(clojure.core/defn- ser-resource-arns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-target-group-arn [shape-input] shape-input)
(clojure.core/defn- ser-listener-arns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-target-group-attribute-key [shape-input] shape-input)
(clojure.core/defn- ser-subnet-mapping [shape-input] (clojure.core/cond-> {} (:subnet-id shape-input) (clojure.core/assoc "SubnetMapping.SubnetId" (ser-subnet-id (:subnet-id shape-input))) (:allocation-id shape-input) (clojure.core/assoc "SubnetMapping.AllocationId" (ser-allocation-id (:allocation-id shape-input)))))
(clojure.core/defn- ser-target-type-enum [shape-input] ({"instance" "instance", :instance "instance", "ip" "ip", :ip "ip"} shape-input))
(clojure.core/defn- ser-ip-address-type [shape-input] ({"ipv4" "ipv4", :ipv4 "ipv4", "dualstack" "dualstack", :dualstack "dualstack"} shape-input))
(clojure.core/defn- ser-ssl-policy-name [shape-input] shape-input)
(clojure.core/defn- ser-action-type-enum [shape-input] ({"forward" "forward", :forward "forward"} shape-input))
(clojure.core/defn- ser-health-check-threshold-count [shape-input] shape-input)
(clojure.core/defn- ser-target-group-name [shape-input] shape-input)
(clojure.core/defn- ser-target-description [shape-input] (clojure.core/cond-> {} (:id shape-input) (clojure.core/assoc "TargetDescription.Id" (ser-target-id (:id shape-input))) (:port shape-input) (clojure.core/assoc "TargetDescription.Port" (ser-port (:port shape-input))) (:availability-zone shape-input) (clojure.core/assoc "TargetDescription.AvailabilityZone" (ser-zone-name (:availability-zone shape-input)))))
(clojure.core/defn- ser-load-balancer-type-enum [shape-input] ({"application" "application", :application "application", "network" "network", :network "network"} shape-input))
(clojure.core/defn- ser-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-rule-priority-pair [shape-input] (clojure.core/cond-> {} (:rule-arn shape-input) (clojure.core/assoc "RulePriorityPair.RuleArn" (ser-rule-arn (:rule-arn shape-input))) (:priority shape-input) (clojure.core/assoc "RulePriorityPair.Priority" (ser-rule-priority (:priority shape-input)))))
(clojure.core/defn- ser-http-code [shape-input] shape-input)
(clojure.core/defn- ser-target-id [shape-input] shape-input)
(clojure.core/defn- ser-listener-arn [shape-input] shape-input)
(clojure.core/defn- ser-target-group-attribute [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "TargetGroupAttribute.Key" (ser-target-group-attribute-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "TargetGroupAttribute.Value" (ser-target-group-attribute-value (:value shape-input)))))
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-port [shape-input] shape-input)
(clojure.core/defn- ser-security-group-id [shape-input] shape-input)
(clojure.core/defn- ser-target-group-arns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-vpc-id [shape-input] shape-input)
(clojure.core/defn- ser-health-check-interval-seconds [shape-input] shape-input)
(clojure.core/defn- ser-health-check-port [shape-input] shape-input)
(clojure.core/defn- ser-target-descriptions [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-attribute-key [shape-input] shape-input)
(clojure.core/defn- ser-certificate-arn [shape-input] shape-input)
(clojure.core/defn- ser-condition-field-name [shape-input] shape-input)
(clojure.core/defn- ser-rule-condition [shape-input] (clojure.core/cond-> {} (:field shape-input) (clojure.core/assoc "RuleCondition.Field" (ser-condition-field-name (:field shape-input))) (:values shape-input) (clojure.core/assoc "RuleCondition.Values" (ser-list-of-string (:values shape-input)))))
(clojure.core/defn- ser-resource-arn [shape-input] shape-input)
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-tag-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-tag-value (:value shape-input)))))
(clojure.core/defn- ser-target-group-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-rule-arns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-matcher [shape-input] (clojure.core/cond-> {} (:http-code shape-input) (clojure.core/assoc "Matcher.HttpCode" (ser-http-code (:http-code shape-input)))))
(clojure.core/defn- ser-target-group-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-action [shape-input] (clojure.core/cond-> {} (:type shape-input) (clojure.core/assoc "Action.Type" (ser-action-type-enum (:type shape-input))) (:target-group-arn shape-input) (clojure.core/assoc "Action.TargetGroupArn" (ser-target-group-arn (:target-group-arn shape-input)))))
(clojure.core/defn- ser-certificate [shape-input] (clojure.core/cond-> {} (:certificate-arn shape-input) (clojure.core/assoc "Certificate.CertificateArn" (ser-certificate-arn (:certificate-arn shape-input))) (:is-default shape-input) (clojure.core/assoc "Certificate.IsDefault" (ser-default (:is-default shape-input)))))
(clojure.core/defn- ser-load-balancer-attribute [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "LoadBalancerAttribute.Key" (ser-load-balancer-attribute-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "LoadBalancerAttribute.Value" (ser-load-balancer-attribute-value (:value shape-input)))))
(clojure.core/defn- ser-string-value [shape-input] shape-input)
(clojure.core/defn- ser-rule-priority-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-zone-name [shape-input] shape-input)

(clojure.core/defn req<-describe-target-health-input [action-name50037 input50036] (clojure.core/let [input50038 {:body {"TargetGroupArn" (ser-target-group-arn (input50036 :target-group-arn)), "Version" "2015-12-01", "Action" action-name50037}}] (clojure.core/cond-> input50038 (clojure.core/contains? input50036 :targets) (clojure.core/assoc-in [:body "Targets"] (ser-target-descriptions (input50036 :targets))))))
(clojure.core/defn req<-remove-tags-input [action-name50040 input50039] {:body {"ResourceArns" (ser-resource-arns (input50039 :resource-arns)), "TagKeys" (ser-tag-keys (input50039 :tag-keys)), "Version" "2015-12-01", "Action" action-name50040}})
(clojure.core/defn req<-delete-rule-input [action-name50042 input50041] {:body {"RuleArn" (ser-rule-arn (input50041 :rule-arn)), "Version" "2015-12-01", "Action" action-name50042}})
(clojure.core/defn req<-set-rule-priorities-input [action-name50044 input50043] {:body {"RulePriorities" (ser-rule-priority-list (input50043 :rule-priorities)), "Version" "2015-12-01", "Action" action-name50044}})
(clojure.core/defn req<-describe-account-limits-input [action-name50046 input50045] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50046}} (clojure.core/contains? input50045 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50045 :marker))) (clojure.core/contains? input50045 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50045 :page-size)))))
(clojure.core/defn req<-delete-target-group-input [action-name50048 input50047] {:body {"TargetGroupArn" (ser-target-group-arn (input50047 :target-group-arn)), "Version" "2015-12-01", "Action" action-name50048}})
(clojure.core/defn req<-delete-load-balancer-input [action-name50050 input50049] {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50049 :load-balancer-arn)), "Version" "2015-12-01", "Action" action-name50050}})
(clojure.core/defn req<-set-ip-address-type-input [action-name50052 input50051] {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50051 :load-balancer-arn)), "IpAddressType" (ser-ip-address-type (input50051 :ip-address-type)), "Version" "2015-12-01", "Action" action-name50052}})
(clojure.core/defn req<-describe-rules-input [action-name50054 input50053] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50054}} (clojure.core/contains? input50053 :listener-arn) (clojure.core/assoc-in [:body "ListenerArn"] (ser-listener-arn (input50053 :listener-arn))) (clojure.core/contains? input50053 :rule-arns) (clojure.core/assoc-in [:body "RuleArns"] (ser-rule-arns (input50053 :rule-arns))) (clojure.core/contains? input50053 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50053 :marker))) (clojure.core/contains? input50053 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50053 :page-size)))))
(clojure.core/defn req<-create-listener-input [action-name50056 input50055] (clojure.core/let [input50057 {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50055 :load-balancer-arn)), "Protocol" (ser-protocol-enum (input50055 :protocol)), "Port" (ser-port (input50055 :port)), "DefaultActions" (ser-actions (input50055 :default-actions)), "Version" "2015-12-01", "Action" action-name50056}}] (clojure.core/cond-> input50057 (clojure.core/contains? input50055 :ssl-policy) (clojure.core/assoc-in [:body "SslPolicy"] (ser-ssl-policy-name (input50055 :ssl-policy))) (clojure.core/contains? input50055 :certificates) (clojure.core/assoc-in [:body "Certificates"] (ser-certificate-list (input50055 :certificates))))))
(clojure.core/defn req<-modify-load-balancer-attributes-input [action-name50059 input50058] {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50058 :load-balancer-arn)), "Attributes" (ser-load-balancer-attributes (input50058 :attributes)), "Version" "2015-12-01", "Action" action-name50059}})
(clojure.core/defn req<-add-listener-certificates-input [action-name50061 input50060] {:body {"ListenerArn" (ser-listener-arn (input50060 :listener-arn)), "Certificates" (ser-certificate-list (input50060 :certificates)), "Version" "2015-12-01", "Action" action-name50061}})
(clojure.core/defn req<-create-rule-input [action-name50063 input50062] {:body {"ListenerArn" (ser-listener-arn (input50062 :listener-arn)), "Conditions" (ser-rule-condition-list (input50062 :conditions)), "Priority" (ser-rule-priority (input50062 :priority)), "Actions" (ser-actions (input50062 :actions)), "Version" "2015-12-01", "Action" action-name50063}})
(clojure.core/defn req<-create-load-balancer-input [action-name50065 input50064] (clojure.core/let [input50066 {:body {"Name" (ser-load-balancer-name (input50064 :name)), "Version" "2015-12-01", "Action" action-name50065}}] (clojure.core/cond-> input50066 (clojure.core/contains? input50064 :subnets) (clojure.core/assoc-in [:body "Subnets"] (ser-subnets (input50064 :subnets))) (clojure.core/contains? input50064 :subnet-mappings) (clojure.core/assoc-in [:body "SubnetMappings"] (ser-subnet-mappings (input50064 :subnet-mappings))) (clojure.core/contains? input50064 :security-groups) (clojure.core/assoc-in [:body "SecurityGroups"] (ser-security-groups (input50064 :security-groups))) (clojure.core/contains? input50064 :scheme) (clojure.core/assoc-in [:body "Scheme"] (ser-load-balancer-scheme-enum (input50064 :scheme))) (clojure.core/contains? input50064 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input50064 :tags))) (clojure.core/contains? input50064 :type) (clojure.core/assoc-in [:body "Type"] (ser-load-balancer-type-enum (input50064 :type))) (clojure.core/contains? input50064 :ip-address-type) (clojure.core/assoc-in [:body "IpAddressType"] (ser-ip-address-type (input50064 :ip-address-type))))))
(clojure.core/defn req<-describe-tags-input [action-name50068 input50067] {:body {"ResourceArns" (ser-resource-arns (input50067 :resource-arns)), "Version" "2015-12-01", "Action" action-name50068}})
(clojure.core/defn req<-create-target-group-input [action-name50070 input50069] (clojure.core/let [input50071 {:body {"Protocol" (ser-protocol-enum (input50069 :protocol)), "Port" (ser-port (input50069 :port)), "VpcId" (ser-vpc-id (input50069 :vpc-id)), "Name" (ser-target-group-name (input50069 :name)), "Version" "2015-12-01", "Action" action-name50070}}] (clojure.core/cond-> input50071 (clojure.core/contains? input50069 :healthy-threshold-count) (clojure.core/assoc-in [:body "HealthyThresholdCount"] (ser-health-check-threshold-count (input50069 :healthy-threshold-count))) (clojure.core/contains? input50069 :health-check-timeout-seconds) (clojure.core/assoc-in [:body "HealthCheckTimeoutSeconds"] (ser-health-check-timeout-seconds (input50069 :health-check-timeout-seconds))) (clojure.core/contains? input50069 :target-type) (clojure.core/assoc-in [:body "TargetType"] (ser-target-type-enum (input50069 :target-type))) (clojure.core/contains? input50069 :unhealthy-threshold-count) (clojure.core/assoc-in [:body "UnhealthyThresholdCount"] (ser-health-check-threshold-count (input50069 :unhealthy-threshold-count))) (clojure.core/contains? input50069 :health-check-interval-seconds) (clojure.core/assoc-in [:body "HealthCheckIntervalSeconds"] (ser-health-check-interval-seconds (input50069 :health-check-interval-seconds))) (clojure.core/contains? input50069 :health-check-port) (clojure.core/assoc-in [:body "HealthCheckPort"] (ser-health-check-port (input50069 :health-check-port))) (clojure.core/contains? input50069 :health-check-protocol) (clojure.core/assoc-in [:body "HealthCheckProtocol"] (ser-protocol-enum (input50069 :health-check-protocol))) (clojure.core/contains? input50069 :matcher) (clojure.core/assoc-in [:body "Matcher"] (ser-matcher (input50069 :matcher))) (clojure.core/contains? input50069 :health-check-path) (clojure.core/assoc-in [:body "HealthCheckPath"] (ser-path (input50069 :health-check-path))))))
(clojure.core/defn req<-modify-rule-input [action-name50073 input50072] (clojure.core/let [input50074 {:body {"RuleArn" (ser-rule-arn (input50072 :rule-arn)), "Version" "2015-12-01", "Action" action-name50073}}] (clojure.core/cond-> input50074 (clojure.core/contains? input50072 :conditions) (clojure.core/assoc-in [:body "Conditions"] (ser-rule-condition-list (input50072 :conditions))) (clojure.core/contains? input50072 :actions) (clojure.core/assoc-in [:body "Actions"] (ser-actions (input50072 :actions))))))
(clojure.core/defn req<-modify-target-group-attributes-input [action-name50076 input50075] {:body {"TargetGroupArn" (ser-target-group-arn (input50075 :target-group-arn)), "Attributes" (ser-target-group-attributes (input50075 :attributes)), "Version" "2015-12-01", "Action" action-name50076}})
(clojure.core/defn req<-delete-listener-input [action-name50078 input50077] {:body {"ListenerArn" (ser-listener-arn (input50077 :listener-arn)), "Version" "2015-12-01", "Action" action-name50078}})
(clojure.core/defn req<-deregister-targets-input [action-name50080 input50079] {:body {"TargetGroupArn" (ser-target-group-arn (input50079 :target-group-arn)), "Targets" (ser-target-descriptions (input50079 :targets)), "Version" "2015-12-01", "Action" action-name50080}})
(clojure.core/defn req<-describesslpolicies-input [action-name50082 input50081] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50082}} (clojure.core/contains? input50081 :names) (clojure.core/assoc-in [:body "Names"] (ser-ssl-policy-names (input50081 :names))) (clojure.core/contains? input50081 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50081 :marker))) (clojure.core/contains? input50081 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50081 :page-size)))))
(clojure.core/defn req<-modify-target-group-input [action-name50084 input50083] (clojure.core/let [input50085 {:body {"TargetGroupArn" (ser-target-group-arn (input50083 :target-group-arn)), "Version" "2015-12-01", "Action" action-name50084}}] (clojure.core/cond-> input50085 (clojure.core/contains? input50083 :healthy-threshold-count) (clojure.core/assoc-in [:body "HealthyThresholdCount"] (ser-health-check-threshold-count (input50083 :healthy-threshold-count))) (clojure.core/contains? input50083 :health-check-timeout-seconds) (clojure.core/assoc-in [:body "HealthCheckTimeoutSeconds"] (ser-health-check-timeout-seconds (input50083 :health-check-timeout-seconds))) (clojure.core/contains? input50083 :unhealthy-threshold-count) (clojure.core/assoc-in [:body "UnhealthyThresholdCount"] (ser-health-check-threshold-count (input50083 :unhealthy-threshold-count))) (clojure.core/contains? input50083 :health-check-interval-seconds) (clojure.core/assoc-in [:body "HealthCheckIntervalSeconds"] (ser-health-check-interval-seconds (input50083 :health-check-interval-seconds))) (clojure.core/contains? input50083 :health-check-port) (clojure.core/assoc-in [:body "HealthCheckPort"] (ser-health-check-port (input50083 :health-check-port))) (clojure.core/contains? input50083 :health-check-protocol) (clojure.core/assoc-in [:body "HealthCheckProtocol"] (ser-protocol-enum (input50083 :health-check-protocol))) (clojure.core/contains? input50083 :matcher) (clojure.core/assoc-in [:body "Matcher"] (ser-matcher (input50083 :matcher))) (clojure.core/contains? input50083 :health-check-path) (clojure.core/assoc-in [:body "HealthCheckPath"] (ser-path (input50083 :health-check-path))))))
(clojure.core/defn req<-describe-target-group-attributes-input [action-name50087 input50086] {:body {"TargetGroupArn" (ser-target-group-arn (input50086 :target-group-arn)), "Version" "2015-12-01", "Action" action-name50087}})
(clojure.core/defn req<-register-targets-input [action-name50089 input50088] {:body {"TargetGroupArn" (ser-target-group-arn (input50088 :target-group-arn)), "Targets" (ser-target-descriptions (input50088 :targets)), "Version" "2015-12-01", "Action" action-name50089}})
(clojure.core/defn req<-describe-target-groups-input [action-name50091 input50090] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50091}} (clojure.core/contains? input50090 :load-balancer-arn) (clojure.core/assoc-in [:body "LoadBalancerArn"] (ser-load-balancer-arn (input50090 :load-balancer-arn))) (clojure.core/contains? input50090 :target-group-arns) (clojure.core/assoc-in [:body "TargetGroupArns"] (ser-target-group-arns (input50090 :target-group-arns))) (clojure.core/contains? input50090 :names) (clojure.core/assoc-in [:body "Names"] (ser-target-group-names (input50090 :names))) (clojure.core/contains? input50090 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50090 :marker))) (clojure.core/contains? input50090 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50090 :page-size)))))
(clojure.core/defn req<-add-tags-input [action-name50093 input50092] {:body {"ResourceArns" (ser-resource-arns (input50092 :resource-arns)), "Tags" (ser-tag-list (input50092 :tags)), "Version" "2015-12-01", "Action" action-name50093}})
(clojure.core/defn req<-set-security-groups-input [action-name50095 input50094] {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50094 :load-balancer-arn)), "SecurityGroups" (ser-security-groups (input50094 :security-groups)), "Version" "2015-12-01", "Action" action-name50095}})
(clojure.core/defn req<-remove-listener-certificates-input [action-name50097 input50096] {:body {"ListenerArn" (ser-listener-arn (input50096 :listener-arn)), "Certificates" (ser-certificate-list (input50096 :certificates)), "Version" "2015-12-01", "Action" action-name50097}})
(clojure.core/defn req<-set-subnets-input [action-name50099 input50098] (clojure.core/let [input50100 {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50098 :load-balancer-arn)), "Subnets" (ser-subnets (input50098 :subnets)), "Version" "2015-12-01", "Action" action-name50099}}] (clojure.core/cond-> input50100 (clojure.core/contains? input50098 :subnet-mappings) (clojure.core/assoc-in [:body "SubnetMappings"] (ser-subnet-mappings (input50098 :subnet-mappings))))))
(clojure.core/defn req<-modify-listener-input [action-name50102 input50101] (clojure.core/let [input50103 {:body {"ListenerArn" (ser-listener-arn (input50101 :listener-arn)), "Version" "2015-12-01", "Action" action-name50102}}] (clojure.core/cond-> input50103 (clojure.core/contains? input50101 :port) (clojure.core/assoc-in [:body "Port"] (ser-port (input50101 :port))) (clojure.core/contains? input50101 :protocol) (clojure.core/assoc-in [:body "Protocol"] (ser-protocol-enum (input50101 :protocol))) (clojure.core/contains? input50101 :ssl-policy) (clojure.core/assoc-in [:body "SslPolicy"] (ser-ssl-policy-name (input50101 :ssl-policy))) (clojure.core/contains? input50101 :certificates) (clojure.core/assoc-in [:body "Certificates"] (ser-certificate-list (input50101 :certificates))) (clojure.core/contains? input50101 :default-actions) (clojure.core/assoc-in [:body "DefaultActions"] (ser-actions (input50101 :default-actions))))))
(clojure.core/defn req<-describe-load-balancers-input [action-name50105 input50104] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50105}} (clojure.core/contains? input50104 :load-balancer-arns) (clojure.core/assoc-in [:body "LoadBalancerArns"] (ser-load-balancer-arns (input50104 :load-balancer-arns))) (clojure.core/contains? input50104 :names) (clojure.core/assoc-in [:body "Names"] (ser-load-balancer-names (input50104 :names))) (clojure.core/contains? input50104 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50104 :marker))) (clojure.core/contains? input50104 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50104 :page-size)))))
(clojure.core/defn req<-describe-listeners-input [action-name50107 input50106] (clojure.core/cond-> {:body {"Version" "2015-12-01", "Action" action-name50107}} (clojure.core/contains? input50106 :load-balancer-arn) (clojure.core/assoc-in [:body "LoadBalancerArn"] (ser-load-balancer-arn (input50106 :load-balancer-arn))) (clojure.core/contains? input50106 :listener-arns) (clojure.core/assoc-in [:body "ListenerArns"] (ser-listener-arns (input50106 :listener-arns))) (clojure.core/contains? input50106 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50106 :marker))) (clojure.core/contains? input50106 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50106 :page-size)))))
(clojure.core/defn req<-describe-load-balancer-attributes-input [action-name50109 input50108] {:body {"LoadBalancerArn" (ser-load-balancer-arn (input50108 :load-balancer-arn)), "Version" "2015-12-01", "Action" action-name50109}})
(clojure.core/defn req<-describe-listener-certificates-input [action-name50111 input50110] (clojure.core/let [input50112 {:body {"ListenerArn" (ser-listener-arn (input50110 :listener-arn)), "Version" "2015-12-01", "Action" action-name50111}}] (clojure.core/cond-> input50112 (clojure.core/contains? input50110 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input50110 :marker))) (clojure.core/contains? input50110 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input50110 :page-size))))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-state-enum {"healthy" "healthy", :draining "draining", :unhealthy "unhealthy", :unavailable "unavailable", :unused "unused", "initial" "initial", :healthy "healthy", "unhealthy" "unhealthy", "unused" "unused", :initial "initial", "draining" "draining", "unavailable" "unavailable"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/certificate))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/Certificates] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-rules-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ResourceArns] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-attribute :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum {"internet-facing" "internet-facing", :internet-facing "internet-facing", "internal" "internal", :internal "internal"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-addresses (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-address))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2.create-listener-input/Protocol :portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2.create-listener-input/DefaultActions] :opt-un [:portkey.aws.elasticloadbalancingv2.create-listener-input/SslPolicy :portkey.aws.elasticloadbalancingv2.create-listener-input/Certificates] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority (clojure.spec.alpha/int-in 1 50000))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/max (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Limits :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/page-size (clojure.spec.alpha/int-in 1 400))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.cipher/Name :portkey.aws.elasticloadbalancingv2.cipher/Priority] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnets (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/SecurityGroups] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/security-group-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mappings (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-mapping))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/Certificates :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/IpAddressType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-security-groups-output/security-group-ids (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/security-groups))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.set-security-groups-output/SecurityGroupIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds (clojure.spec.alpha/int-in 2 60))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-target-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-condition))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/actions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/action))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/string-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/Certificates] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ResourceArns :portkey.aws.elasticloadbalancingv2/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.register-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn :portkey.aws.elasticloadbalancingv2.register-targets-input/Targets] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describesslpolicies-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describesslpolicies-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/SslPolicies :portkey.aws.elasticloadbalancingv2.describesslpolicies-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/protocol-enum {"HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS", "TCP" "TCP", :tcp "TCP"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/resource-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum {"active" "active", :active "active", "provisioning" "provisioning", :provisioning "provisioning", "active_impaired" "active_impaired", :active-impaired "active_impaired", "failed" "failed", :failed "failed"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/ListenerArns :portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/TargetGroupArns :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/Names :portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Name :portkey.aws.elasticloadbalancingv2/Max] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mapping (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/SubnetId :portkey.aws.elasticloadbalancingv2/AllocationId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/IpAddressType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ZoneName :portkey.aws.elasticloadbalancingv2/SubnetId :portkey.aws.elasticloadbalancingv2/LoadBalancerAddresses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-type-enum {"instance" "instance", :instance "instance", "ip" "ip", :ip "ip"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ciphers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/cipher))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address-type {"ipv4" "ipv4", :ipv4 "ipv4", "dualstack" "dualstack", :dualstack "dualstack"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/sslpolicy-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action-type-enum {"forward" "forward", :forward "forward"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/canonical-hosted-zone-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/TargetHealthDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-threshold-count (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-input/HealthyThresholdCount :portkey.aws.elasticloadbalancingv2/HealthCheckTimeoutSeconds :portkey.aws.elasticloadbalancingv2.modify-target-group-input/UnhealthyThresholdCount :portkey.aws.elasticloadbalancingv2/HealthCheckIntervalSeconds :portkey.aws.elasticloadbalancingv2/HealthCheckPort :portkey.aws.elasticloadbalancingv2.modify-target-group-input/HealthCheckProtocol :portkey.aws.elasticloadbalancingv2/Matcher :portkey.aws.elasticloadbalancingv2.modify-target-group-input/HealthCheckPath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/RuleArn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-rule-input/Conditions :portkey.aws.elasticloadbalancingv2/Actions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/LoadBalancers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Listeners] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag-description/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ResourceArn :portkey.aws.elasticloadbalancingv2.tag-description/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.ssl-policy/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/SslProtocols :portkey.aws.elasticloadbalancingv2/Ciphers :portkey.aws.elasticloadbalancingv2.ssl-policy/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn :portkey.aws.elasticloadbalancingv2.create-rule-input/Conditions :portkey.aws.elasticloadbalancingv2.create-rule-input/Priority :portkey.aws.elasticloadbalancingv2/Actions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/zone-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-description (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.target-description/Id] :opt-un [:portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2.target-description/AvailabilityZone] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limits (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/limit))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/Certificates] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum {"application" "application", :application "application", "network" "network", :network "network"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-priority-pair/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-pair (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/RuleArn :portkey.aws.elasticloadbalancingv2.rule-priority-pair/Priority] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/http-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArns :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/Names :portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/state-reason))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-state/Code :portkey.aws.elasticloadbalancingv2.load-balancer-state/Reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-reason-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health/State :portkey.aws.elasticloadbalancingv2.target-health/Reason :portkey.aws.elasticloadbalancingv2/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/dnsname (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-health-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-health-input/Targets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group-attribute/Key :portkey.aws.elasticloadbalancingv2.target-group-attribute/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.deregister-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn :portkey.aws.elasticloadbalancingv2.deregister-targets-input/Targets] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ResourceArns :portkey.aws.elasticloadbalancingv2.add-tags-input/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ListenerArn :portkey.aws.elasticloadbalancingv2/RuleArns :portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-targets-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds (clojure.spec.alpha/int-in 5 300))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-tags-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/LoadBalancers :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-port (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/AvailabilityZones] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/TagDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/RuleArn :portkey.aws.elasticloadbalancingv2.rule/Priority :portkey.aws.elasticloadbalancingv2.rule/Conditions :portkey.aws.elasticloadbalancingv2/Actions :portkey.aws.elasticloadbalancingv2/IsDefault] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ListenerArn :portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2.listener/Protocol :portkey.aws.elasticloadbalancingv2.listener/Certificates :portkey.aws.elasticloadbalancingv2.listener/SslPolicy :portkey.aws.elasticloadbalancingv2.listener/DefaultActions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn] :opt-un [:portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2.modify-listener-input/Protocol :portkey.aws.elasticloadbalancingv2.modify-listener-input/SslPolicy :portkey.aws.elasticloadbalancingv2.modify-listener-input/Certificates :portkey.aws.elasticloadbalancingv2.modify-listener-input/DefaultActions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/TargetGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-reason-enum {"Elb.InitialHealthChecking" "Elb.InitialHealthChecking", "Target.NotInUse" "Target.NotInUse", :target.invalid-state "Target.InvalidState", "Elb.RegistrationInProgress" "Elb.RegistrationInProgress", :target.failed-health-checks "Target.FailedHealthChecks", :target.not-registered "Target.NotRegistered", "Target.InvalidState" "Target.InvalidState", "Target.ResponseCodeMismatch" "Target.ResponseCodeMismatch", :target.response-code-mismatch "Target.ResponseCodeMismatch", :elb.initial-health-checking "Elb.InitialHealthChecking", :target.deregistration-in-progress "Target.DeregistrationInProgress", "Target.DeregistrationInProgress" "Target.DeregistrationInProgress", "Target.Timeout" "Target.Timeout", "Target.IpUnusable" "Target.IpUnusable", "Elb.InternalError" "Elb.InternalError", :target.not-in-use "Target.NotInUse", :elb.internal-error "Elb.InternalError", :elb.registration-in-progress "Elb.RegistrationInProgress", :target.timeout "Target.Timeout", :target.ip-unusable "Target.IpUnusable", "Target.NotRegistered" "Target.NotRegistered", "Target.FailedHealthChecks" "Target.FailedHealthChecks"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listeners-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Listeners :portkey.aws.elasticloadbalancingv2.describe-listeners-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/Subnets] :opt-un [:portkey.aws.elasticloadbalancingv2/SubnetMappings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/condition-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listeners (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/field (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/condition-field-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/values (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/list-of-string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.rule-condition/Field :portkey.aws.elasticloadbalancingv2.rule-condition/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.create-load-balancer-input/Name] :opt-un [:portkey.aws.elasticloadbalancingv2/Subnets :portkey.aws.elasticloadbalancingv2/SubnetMappings :portkey.aws.elasticloadbalancingv2/SecurityGroups :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/Scheme :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/Tags :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/Type :portkey.aws.elasticloadbalancingv2/IpAddressType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer/Type :portkey.aws.elasticloadbalancingv2/SecurityGroups :portkey.aws.elasticloadbalancingv2/LoadBalancerArn :portkey.aws.elasticloadbalancingv2/LoadBalancerName :portkey.aws.elasticloadbalancingv2/IpAddressType :portkey.aws.elasticloadbalancingv2/CanonicalHostedZoneId :portkey.aws.elasticloadbalancingv2/CreatedTime :portkey.aws.elasticloadbalancingv2.load-balancer/Scheme :portkey.aws.elasticloadbalancingv2/DNSName :portkey.aws.elasticloadbalancingv2/VpcId :portkey.aws.elasticloadbalancingv2.load-balancer/State :portkey.aws.elasticloadbalancingv2/AvailabilityZones] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/LoadBalancerArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-health-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocols (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn] :opt-un [:portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.tag/Key] :opt-un [:portkey.aws.elasticloadbalancingv2.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/rule-priorities (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/RulePriorities] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describesslpolicies-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describesslpolicies-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describesslpolicies-input/Names :portkey.aws.elasticloadbalancingv2/Marker :portkey.aws.elasticloadbalancingv2/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/ListenerArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/Name :portkey.aws.elasticloadbalancingv2.create-target-group-input/Protocol :portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2/VpcId] :opt-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/HealthyThresholdCount :portkey.aws.elasticloadbalancingv2/HealthCheckTimeoutSeconds :portkey.aws.elasticloadbalancingv2.create-target-group-input/TargetType :portkey.aws.elasticloadbalancingv2.create-target-group-input/UnhealthyThresholdCount :portkey.aws.elasticloadbalancingv2/HealthCheckIntervalSeconds :portkey.aws.elasticloadbalancingv2/HealthCheckPort :portkey.aws.elasticloadbalancingv2.create-target-group-input/HealthCheckProtocol :portkey.aws.elasticloadbalancingv2/Matcher :portkey.aws.elasticloadbalancingv2.create-target-group-input/HealthCheckPath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rules (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/TargetGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/is-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/TargetGroups :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/TargetGroupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group/HealthyThresholdCount :portkey.aws.elasticloadbalancingv2/LoadBalancerArns :portkey.aws.elasticloadbalancingv2/HealthCheckTimeoutSeconds :portkey.aws.elasticloadbalancingv2.target-group/TargetType :portkey.aws.elasticloadbalancingv2.target-group/UnhealthyThresholdCount :portkey.aws.elasticloadbalancingv2/TargetGroupArn :portkey.aws.elasticloadbalancingv2/TargetGroupName :portkey.aws.elasticloadbalancingv2.target-group/Protocol :portkey.aws.elasticloadbalancingv2/Port :portkey.aws.elasticloadbalancingv2/VpcId :portkey.aws.elasticloadbalancingv2/HealthCheckIntervalSeconds :portkey.aws.elasticloadbalancingv2/HealthCheckPort :portkey.aws.elasticloadbalancingv2.target-group/HealthCheckProtocol :portkey.aws.elasticloadbalancingv2/Matcher :portkey.aws.elasticloadbalancingv2.target-group/HealthCheckPath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/matcher (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/HttpCode] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/availability-zone))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2/RuleArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/action-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancingv2.action/Type :portkey.aws.elasticloadbalancingv2/TargetGroupArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.certificate/is-default (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/default))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/CertificateArn :portkey.aws.elasticloadbalancingv2.certificate/IsDefault] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-address (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/IpAddress :portkey.aws.elasticloadbalancingv2/AllocationId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/priority-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-rules-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Rules :portkey.aws.elasticloadbalancingv2.describe-rules-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-attribute/Key :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health-description/target (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-description))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health-description/Target :portkey.aws.elasticloadbalancingv2/HealthCheckPort :portkey.aws.elasticloadbalancingv2/TargetHealth] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-priority-pair))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/zone-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/Listeners] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.core/defn describe-target-health "Describes the health of the specified targets or all of your targets." ([describe-target-health-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-target-health-input "DescribeTargetHealth" describe-target-health-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-target-health-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-target-health-output {"InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "HealthUnavailableException" :portkey.aws.elasticloadbalancingv2/health-unavailable-exception}))))
(clojure.spec.alpha/fdef describe-target-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-health-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-health-output))

(clojure.core/defn remove-tags "Removes the specified tags from the specified Elastic Load Balancing resource.\n To list the current tags for your resources, use DescribeTags." ([remove-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-remove-tags-input "RemoveTags" remove-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/remove-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/remove-tags-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception}))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-tags-output))

(clojure.core/defn delete-rule "Deletes the specified rule." ([delete-rule-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-rule-input "DeleteRule" delete-rule-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/delete-rule-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/delete-rule-output {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-rule-output))

(clojure.core/defn set-rule-priorities "Sets the priorities of the specified rules.\n You can reorder the rules as long as there are no priority conflicts in the new\norder. Any existing rules that you do not specify retain their current priority." ([set-rule-priorities-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-rule-priorities-input "SetRulePriorities" set-rule-priorities-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}))))
(clojure.spec.alpha/fdef set-rule-priorities :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output))

(clojure.core/defn describe-account-limits "Describes the current Elastic Load Balancing resource limits for your AWS\naccount.\n For more information, see Limits for Your Application Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html)\nin the Application Load Balancer Guide or Limits for Your Network Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html)\nin the Network Load Balancers Guide." ([] (describe-account-limits {})) ([describe-account-limits-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-account-limits-input "DescribeAccountLimits" describe-account-limits-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-account-limits-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-account-limits-output {}))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-account-limits-output))

(clojure.core/defn delete-target-group "Deletes the specified target group.\n You can delete a target group if it is not referenced by any actions. Deleting\na target group also deletes any associated health checks." ([delete-target-group-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-target-group-input "DeleteTargetGroup" delete-target-group-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/delete-target-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/delete-target-group-output {"ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}))))
(clojure.spec.alpha/fdef delete-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-target-group-output))

(clojure.core/defn delete-load-balancer "Deletes the specified Application Load Balancer or Network Load Balancer and its\nattached listeners.\n You can't delete a load balancer if deletion protection is enabled. If the load\nbalancer does not exist or has already been deleted, the call succeeds.\n Deleting a load balancer does not affect its registered targets. For example,\nyour EC2 instances continue to run and are still registered to their target\ngroups. If you no longer need these EC2 instances, you can stop or terminate\nthem." ([delete-load-balancer-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-load-balancer-input "DeleteLoadBalancer" delete-load-balancer-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output))

(clojure.core/defn set-ip-address-type "Sets the type of IP addresses used by the subnets of the specified Application\nLoad Balancer or Network Load Balancer.\n Note that Network Load Balancers must use ipv4." ([set-ip-address-type-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-ip-address-type-input "SetIpAddressType" set-ip-address-type-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception}))))
(clojure.spec.alpha/fdef set-ip-address-type :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output))

(clojure.core/defn describe-rules "Describes the specified rules or the rules for the specified listener. You must\nspecify either a listener or one or more rules." ([] (describe-rules {})) ([describe-rules-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-rules-input "DescribeRules" describe-rules-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-rules-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-rules-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception}))))
(clojure.spec.alpha/fdef describe-rules :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-rules-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-rules-output))

(clojure.core/defn create-listener "Creates a listener for the specified Application Load Balancer or Network Load\nBalancer.\n To update a listener, use ModifyListener. When you are finished with a\nlistener, you can delete it using DeleteListener. If you are finished with both\nthe listener and the load balancer, you can delete them both using\nDeleteLoadBalancer.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple listeners with the same settings, each call\nsucceeds.\n For more information, see Listeners for Your Application Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html)\nin the Application Load Balancers Guide and Listeners for Your Network Load\nBalancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-listeners.html)\nin the Network Load Balancers Guide." ([create-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-listener-input "CreateListener" create-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/create-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/create-listener-output {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/sslpolicy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}))))
(clojure.spec.alpha/fdef create-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-listener-output))

(clojure.core/defn modify-load-balancer-attributes "Modifies the specified attributes of the specified Application Load Balancer or\nNetwork Load Balancer.\n If any of the specified attributes can't be modified as requested, the call\nfails. Any existing attributes that you do not modify retain their current\nvalues." ([modify-load-balancer-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-load-balancer-attributes-input "ModifyLoadBalancerAttributes" modify-load-balancer-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output))

(clojure.core/defn add-listener-certificates "Adds the specified certificate to the specified secure listener.\n If the certificate was already added, the call is successful but the\ncertificate is not added again.\n To list the certificates for your listener, use DescribeListenerCertificates.\nTo remove certificates from your listener, use RemoveListenerCertificates." ([add-listener-certificates-input] (clojure.core/let [req<-input__36755__auto__ (req<-add-listener-certificates-input "AddListenerCertificates" add-listener-certificates-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception}))))
(clojure.spec.alpha/fdef add-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output))

(clojure.core/defn create-rule "Creates a rule for the specified listener. The listener must be associated with\nan Application Load Balancer.\n Rules are evaluated in priority order, from the lowest value to the highest\nvalue. When the condition for a rule is met, the specified action is taken. If\nno conditions are met, the action for the default rule is taken. For more\ninformation, see Listener Rules\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-listeners.html#listener-rules)\nin the Application Load Balancers Guide.\n To view your current rules, use DescribeRules. To update a rule, use\nModifyRule. To set the priorities of your rules, use SetRulePriorities. To\ndelete a rule, use DeleteRule." ([create-rule-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-rule-input "CreateRule" create-rule-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/create-rule-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/create-rule-output {"TooManyRulesException" :portkey.aws.elasticloadbalancingv2/too-many-rules-exception, "TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}))))
(clojure.spec.alpha/fdef create-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-rule-output))

(clojure.core/defn create-load-balancer "Creates an Application Load Balancer or a Network Load Balancer.\n When you create a load balancer, you can specify security groups, public\nsubnets, IP address type, and tags. Otherwise, you could do so later using\nSetSecurityGroups, SetSubnets, SetIpAddressType, and AddTags.\n To create listeners for your load balancer, use CreateListener. To describe\nyour current load balancers, see DescribeLoadBalancers. When you are finished\nwith a load balancer, you can delete it using DeleteLoadBalancer.\n For limit information, see Limits for Your Application Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-limits.html)\nin the Application Load Balancers Guide and Limits for Your Network Load\nBalancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-limits.html)\nin the Network Load Balancers Guide.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple load balancers with the same settings, each\ncall succeeds.\n For more information, see Application Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html)\nin the Application Load Balancers Guide and Network Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/network/network-load-balancers.html)\nin the Network Load Balancers Guide." ([create-load-balancer-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-load-balancer-input "CreateLoadBalancer" create-load-balancer-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/create-load-balancer-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/create-load-balancer-output {"OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "DuplicateLoadBalancerNameException" :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "TooManyLoadBalancersException" :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-load-balancer-output))

(clojure.core/defn describe-tags "Describes the tags for the specified resources. You can describe the tags for\none or more Application Load Balancers, Network Load Balancers, and target\ngroups." ([describe-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-tags-input "DescribeTags" describe-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-tags-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception}))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-tags-output))

(clojure.core/defn create-target-group "Creates a target group.\n To register targets with the target group, use RegisterTargets. To update the\nhealth check settings for the target group, use ModifyTargetGroup. To monitor\nthe health of targets in the target group, use DescribeTargetHealth.\n To route traffic to the targets in a target group, specify the target group in\nan action using CreateListener or CreateRule.\n To delete a target group, use DeleteTargetGroup.\n This operation is idempotent, which means that it completes at most one time.\nIf you attempt to create multiple target groups with the same settings, each\ncall succeeds.\n For more information, see Target Groups for Your Application Load Balancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/load-balancer-target-groups.html)\nin the Application Load Balancers Guide or Target Groups for Your Network Load\nBalancers\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html)\nin the Network Load Balancers Guide." ([create-target-group-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-target-group-input "CreateTargetGroup" create-target-group-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/create-target-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/create-target-group-output {"DuplicateTargetGroupNameException" :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef create-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-target-group-output))

(clojure.core/defn modify-rule "Modifies the specified rule.\n Any existing properties that you do not modify retain their current values.\n To modify the default action, use ModifyListener." ([modify-rule-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-rule-input "ModifyRule" modify-rule-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/modify-rule-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/modify-rule-output {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}))))
(clojure.spec.alpha/fdef modify-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-rule-output))

(clojure.core/defn modify-target-group-attributes "Modifies the specified attributes of the specified target group." ([modify-target-group-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-target-group-attributes-input "ModifyTargetGroupAttributes" modify-target-group-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef modify-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output))

(clojure.core/defn delete-listener "Deletes the specified listener.\n Alternatively, your listener is deleted when you delete the load balancer it is\nattached to using DeleteLoadBalancer." ([delete-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-listener-input "DeleteListener" delete-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/delete-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/delete-listener-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}))))
(clojure.spec.alpha/fdef delete-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-listener-output))

(clojure.core/defn deregister-targets "Deregisters the specified targets from the specified target group. After the\ntargets are deregistered, they no longer receive traffic from the load balancer." ([deregister-targets-input] (clojure.core/let [req<-input__36755__auto__ (req<-deregister-targets-input "DeregisterTargets" deregister-targets-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/deregister-targets-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/deregister-targets-output {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception}))))
(clojure.spec.alpha/fdef deregister-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/deregister-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/deregister-targets-output))

(clojure.core/defn describesslpolicies "Describes the specified policies or all policies used for SSL negotiation.\n For more information, see Security Policies\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/application/create-https-listener.html#describe-ssl-policies)\nin the Application Load Balancers Guide." ([] (describesslpolicies {})) ([describesslpolicies-input] (clojure.core/let [req<-input__36755__auto__ (req<-describesslpolicies-input "DescribeSSLPolicies" describesslpolicies-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describesslpolicies-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describesslpolicies-output {"SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/sslpolicy-not-found-exception}))))
(clojure.spec.alpha/fdef describesslpolicies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describesslpolicies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describesslpolicies-output))

(clojure.core/defn modify-target-group "Modifies the health checks used when evaluating the health state of the targets\nin the specified target group.\n To monitor the health of the targets, use DescribeTargetHealth." ([modify-target-group-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-target-group-input "ModifyTargetGroup" modify-target-group-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/modify-target-group-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/modify-target-group-output {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef modify-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-output))

(clojure.core/defn describe-target-group-attributes "Describes the attributes for the specified target group." ([describe-target-group-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-target-group-attributes-input "DescribeTargetGroupAttributes" describe-target-group-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}))))
(clojure.spec.alpha/fdef describe-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output))

(clojure.core/defn register-targets "Registers the specified targets with the specified target group.\n You can register targets by instance ID or by IP address. If the target is an\nEC2 instance, it must be in the running state when you register it.\n By default, the load balancer routes requests to registered targets using the\nprotocol and port for the target group. Alternatively, you can override the port\nfor a target when you register it. You can register each EC2 instance or IP\naddress with the same target group multiple times using different ports.\n With a Network Load Balancer, you cannot register instances by instance ID if\nthey have the following instance types: C1, CC1, CC2, CG1, CG2, CR1, CS1, G1,\nG2, HI1, HS1, M1, M2, M3, and T1. You can register instances of these types by\nIP address.\n To remove a target from a target group, use DeregisterTargets." ([register-targets-input] (clojure.core/let [req<-input__36755__auto__ (req<-register-targets-input "RegisterTargets" register-targets-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/register-targets-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/register-targets-output {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}))))
(clojure.spec.alpha/fdef register-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/register-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/register-targets-output))

(clojure.core/defn describe-target-groups "Describes the specified target groups or all of your target groups. By default,\nall target groups are described. Alternatively, you can specify one of the\nfollowing to filter the results: the ARN of the load balancer, the names of one\nor more target groups, or the ARNs of one or more target groups.\n To describe the targets for a target group, use DescribeTargetHealth. To\ndescribe the attributes of a target group, use DescribeTargetGroupAttributes." ([] (describe-target-groups {})) ([describe-target-groups-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-target-groups-input "DescribeTargetGroups" describe-target-groups-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-target-groups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-target-groups-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}))))
(clojure.spec.alpha/fdef describe-target-groups :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-target-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-groups-output))

(clojure.core/defn add-tags "Adds the specified tags to the specified Elastic Load Balancing resource. You\ncan tag your Application Load Balancers, Network Load Balancers, and your target\ngroups.\n Each tag consists of a key and an optional value. If a resource already has a\ntag with the same key, AddTags updates its value.\n To list the current tags for your resources, use DescribeTags. To remove tags\nfrom your resources, use RemoveTags." ([add-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-add-tags-input "AddTags" add-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/add-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/add-tags-output {"DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-tags-output))

(clojure.core/defn set-security-groups "Associates the specified security groups with the specified Application Load\nBalancer. The specified security groups override the previously associated\nsecurity groups.\n Note that you can't specify a security group for a Network Load Balancer." ([set-security-groups-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-security-groups-input "SetSecurityGroups" set-security-groups-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/set-security-groups-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/set-security-groups-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}))))
(clojure.spec.alpha/fdef set-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-security-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-security-groups-output))

(clojure.core/defn remove-listener-certificates "Removes the specified certificate from the specified secure listener.\n You can't remove the default certificate for a listener. To replace the default\ncertificate, call ModifyListener.\n To list the certificates for your listener, use DescribeListenerCertificates." ([remove-listener-certificates-input] (clojure.core/let [req<-input__36755__auto__ (req<-remove-listener-certificates-input "RemoveListenerCertificates" remove-listener-certificates-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}))))
(clojure.spec.alpha/fdef remove-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output))

(clojure.core/defn set-subnets "Enables the Availability Zone for the specified public subnets for the specified\nApplication Load Balancer. The specified subnets replace the previously enabled\nsubnets.\n Note that you can't change the subnets for a Network Load Balancer." ([set-subnets-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-subnets-input "SetSubnets" set-subnets-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/set-subnets-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/set-subnets-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception}))))
(clojure.spec.alpha/fdef set-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-subnets-output))

(clojure.core/defn modify-listener "Modifies the specified properties of the specified listener.\n Any properties that you do not specify retain their current values. However,\nchanging the protocol from HTTPS to HTTP removes the security policy and SSL\ncertificate properties. If you change the protocol from HTTP to HTTPS, you must\nadd the security policy and server certificate." ([modify-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-listener-input "ModifyListener" modify-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/modify-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/modify-listener-output {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/sslpolicy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}))))
(clojure.spec.alpha/fdef modify-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-listener-output))

(clojure.core/defn describe-load-balancers "Describes the specified load balancers or all of your load balancers.\n To describe the listeners for a load balancer, use DescribeListeners. To\ndescribe the attributes for a load balancer, use DescribeLoadBalancerAttributes." ([] (describe-load-balancers {})) ([describe-load-balancers-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancers-input "DescribeLoadBalancers" describe-load-balancers-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output))

(clojure.core/defn describe-listeners "Describes the specified listeners or the listeners for the specified Application\nLoad Balancer or Network Load Balancer. You must specify either a load balancer\nor one or more listeners." ([] (describe-listeners {})) ([describe-listeners-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-listeners-input "DescribeListeners" describe-listeners-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-listeners-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-listeners-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}))))
(clojure.spec.alpha/fdef describe-listeners :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-listeners-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listeners-output))

(clojure.core/defn describe-load-balancer-attributes "Describes the attributes for the specified Application Load Balancer or Network\nLoad Balancer." ([describe-load-balancer-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancer-attributes-input "DescribeLoadBalancerAttributes" describe-load-balancer-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output))

(clojure.core/defn describe-listener-certificates "Describes the certificates for the specified secure listener." ([describe-listener-certificates-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-listener-certificates-input "DescribeListenerCertificates" describe-listener-certificates-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancingv2/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}))))
(clojure.spec.alpha/fdef describe-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output))
