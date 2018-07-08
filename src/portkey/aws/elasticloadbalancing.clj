(ns portkey.aws.elasticloadbalancing (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-1"},
    :ssl-common-name "elasticloadbalancing.eu-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-2"},
    :ssl-common-name "elasticloadbalancing.us-east-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-north-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "sa-east-1"},
    :ssl-common-name "elasticloadbalancing.sa-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-3"},
    :ssl-common-name "elasticloadbalancing.eu-west-3.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ca-central-1"},
    :ssl-common-name "elasticloadbalancing.ca-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-central-1"},
    :ssl-common-name "elasticloadbalancing.eu-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-2"},
    :ssl-common-name "elasticloadbalancing.eu-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-west-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-2"},
    :ssl-common-name "elasticloadbalancing.us-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-1"},
    :ssl-common-name "elasticloadbalancing.us-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-1"},
    :ssl-common-name "elasticloadbalancing.us-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-south-1"},
    :ssl-common-name "elasticloadbalancing.ap-south-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-health-check ser-load-balancer-attributes ser-instance-id ser-policy-type-name ser-policy-type-names ser-cross-zone-load-balancing-enabled ser-health-check-timeout ser-load-balancer-names ser-additional-attributes ser-page-size ser-subnets ser-attribute-name ser-subnet-id ser-policy-name ser-security-groups ser-instance-port ser-policy-attribute ser-marker ser-tag-key ser-s3-bucket-name ser-policy-names ser-availability-zone ser-access-log-interval ser-idle-timeout ser-tag-list ser-tag-key-list ser-access-point-name ser-tag-key-only ser-attribute-value ser-health-check-interval ser-policy-attributes ser-additional-attribute ser-load-balancer-scheme ser-cross-zone-load-balancing ser-tag-value ser-protocol ser-security-group-id ser-connection-draining-timeout ser-additional-attribute-value ser-ports ser-access-log-prefix ser-unhealthy-threshold ser-listener ser-connection-draining ser-additional-attribute-key ser-healthy-threshold ser-access-point-port ser-listeners ser-tag ser-cookie-expiration-period ser-health-check-target ser-instance ser-sslcertificate-id ser-cookie-name ser-connection-draining-enabled ser-availability-zones ser-load-balancer-names-max20 ser-connection-settings ser-access-log-enabled ser-instances ser-access-log ser-end-point-port)

(clojure.core/defn- ser-health-check [shape-input] (clojure.core/cond-> {} (:target shape-input) (clojure.core/assoc "HealthCheck.Target" (ser-health-check-target (:target shape-input))) (:interval shape-input) (clojure.core/assoc "HealthCheck.Interval" (ser-health-check-interval (:interval shape-input))) (:timeout shape-input) (clojure.core/assoc "HealthCheck.Timeout" (ser-health-check-timeout (:timeout shape-input))) (:unhealthy-threshold shape-input) (clojure.core/assoc "HealthCheck.UnhealthyThreshold" (ser-unhealthy-threshold (:unhealthy-threshold shape-input))) (:healthy-threshold shape-input) (clojure.core/assoc "HealthCheck.HealthyThreshold" (ser-healthy-threshold (:healthy-threshold shape-input)))))
(clojure.core/defn- ser-load-balancer-attributes [shape-input] (clojure.core/cond-> {} (:cross-zone-load-balancing shape-input) (clojure.core/assoc "LoadBalancerAttributes.CrossZoneLoadBalancing" (ser-cross-zone-load-balancing (:cross-zone-load-balancing shape-input))) (:access-log shape-input) (clojure.core/assoc "LoadBalancerAttributes.AccessLog" (ser-access-log (:access-log shape-input))) (:connection-draining shape-input) (clojure.core/assoc "LoadBalancerAttributes.ConnectionDraining" (ser-connection-draining (:connection-draining shape-input))) (:connection-settings shape-input) (clojure.core/assoc "LoadBalancerAttributes.ConnectionSettings" (ser-connection-settings (:connection-settings shape-input))) (:additional-attributes shape-input) (clojure.core/assoc "LoadBalancerAttributes.AdditionalAttributes" (ser-additional-attributes (:additional-attributes shape-input)))))
(clojure.core/defn- ser-instance-id [shape-input] shape-input)
(clojure.core/defn- ser-policy-type-name [shape-input] shape-input)
(clojure.core/defn- ser-policy-type-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-cross-zone-load-balancing-enabled [shape-input] shape-input)
(clojure.core/defn- ser-health-check-timeout [shape-input] shape-input)
(clojure.core/defn- ser-load-balancer-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-additional-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-page-size [shape-input] shape-input)
(clojure.core/defn- ser-subnets [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-attribute-name [shape-input] shape-input)
(clojure.core/defn- ser-subnet-id [shape-input] shape-input)
(clojure.core/defn- ser-policy-name [shape-input] shape-input)
(clojure.core/defn- ser-security-groups [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-instance-port [shape-input] shape-input)
(clojure.core/defn- ser-policy-attribute [shape-input] (clojure.core/cond-> {} (:attribute-name shape-input) (clojure.core/assoc "PolicyAttribute.AttributeName" (ser-attribute-name (:attribute-name shape-input))) (:attribute-value shape-input) (clojure.core/assoc "PolicyAttribute.AttributeValue" (ser-attribute-value (:attribute-value shape-input)))))
(clojure.core/defn- ser-marker [shape-input] shape-input)
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-s3-bucket-name [shape-input] shape-input)
(clojure.core/defn- ser-policy-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-availability-zone [shape-input] shape-input)
(clojure.core/defn- ser-access-log-interval [shape-input] shape-input)
(clojure.core/defn- ser-idle-timeout [shape-input] shape-input)
(clojure.core/defn- ser-tag-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-key-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-access-point-name [shape-input] shape-input)
(clojure.core/defn- ser-tag-key-only [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "TagKeyOnly.Key" (ser-tag-key (:key shape-input)))))
(clojure.core/defn- ser-attribute-value [shape-input] shape-input)
(clojure.core/defn- ser-health-check-interval [shape-input] shape-input)
(clojure.core/defn- ser-policy-attributes [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-additional-attribute [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "AdditionalAttribute.Key" (ser-additional-attribute-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "AdditionalAttribute.Value" (ser-additional-attribute-value (:value shape-input)))))
(clojure.core/defn- ser-load-balancer-scheme [shape-input] shape-input)
(clojure.core/defn- ser-cross-zone-load-balancing [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "CrossZoneLoadBalancing.Enabled" (ser-cross-zone-load-balancing-enabled (:enabled shape-input)))))
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-protocol [shape-input] shape-input)
(clojure.core/defn- ser-security-group-id [shape-input] shape-input)
(clojure.core/defn- ser-connection-draining-timeout [shape-input] shape-input)
(clojure.core/defn- ser-additional-attribute-value [shape-input] shape-input)
(clojure.core/defn- ser-ports [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-access-log-prefix [shape-input] shape-input)
(clojure.core/defn- ser-unhealthy-threshold [shape-input] shape-input)
(clojure.core/defn- ser-listener [shape-input] (clojure.core/cond-> {} (:protocol shape-input) (clojure.core/assoc "Listener.Protocol" (ser-protocol (:protocol shape-input))) (:load-balancer-port shape-input) (clojure.core/assoc "Listener.LoadBalancerPort" (ser-access-point-port (:load-balancer-port shape-input))) (:instance-protocol shape-input) (clojure.core/assoc "Listener.InstanceProtocol" (ser-protocol (:instance-protocol shape-input))) (:instance-port shape-input) (clojure.core/assoc "Listener.InstancePort" (ser-instance-port (:instance-port shape-input))) (:sslcertificate-id shape-input) (clojure.core/assoc "Listener.SSLCertificateId" (ser-sslcertificate-id (:sslcertificate-id shape-input)))))
(clojure.core/defn- ser-connection-draining [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "ConnectionDraining.Enabled" (ser-connection-draining-enabled (:enabled shape-input))) (:timeout shape-input) (clojure.core/assoc "ConnectionDraining.Timeout" (ser-connection-draining-timeout (:timeout shape-input)))))
(clojure.core/defn- ser-additional-attribute-key [shape-input] shape-input)
(clojure.core/defn- ser-healthy-threshold [shape-input] shape-input)
(clojure.core/defn- ser-access-point-port [shape-input] shape-input)
(clojure.core/defn- ser-listeners [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-tag-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-tag-value (:value shape-input)))))
(clojure.core/defn- ser-cookie-expiration-period [shape-input] shape-input)
(clojure.core/defn- ser-health-check-target [shape-input] shape-input)
(clojure.core/defn- ser-instance [shape-input] (clojure.core/cond-> {} (:instance-id shape-input) (clojure.core/assoc "Instance.InstanceId" (ser-instance-id (:instance-id shape-input)))))
(clojure.core/defn- ser-sslcertificate-id [shape-input] shape-input)
(clojure.core/defn- ser-cookie-name [shape-input] shape-input)
(clojure.core/defn- ser-connection-draining-enabled [shape-input] shape-input)
(clojure.core/defn- ser-availability-zones [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-load-balancer-names-max20 [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-connection-settings [shape-input] (clojure.core/cond-> {} (:idle-timeout shape-input) (clojure.core/assoc "ConnectionSettings.IdleTimeout" (ser-idle-timeout (:idle-timeout shape-input)))))
(clojure.core/defn- ser-access-log-enabled [shape-input] shape-input)
(clojure.core/defn- ser-instances [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-access-log [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "AccessLog.Enabled" (ser-access-log-enabled (:enabled shape-input))) (:s3-bucket-name shape-input) (clojure.core/assoc "AccessLog.S3BucketName" (ser-s3-bucket-name (:s3-bucket-name shape-input))) (:emit-interval shape-input) (clojure.core/assoc "AccessLog.EmitInterval" (ser-access-log-interval (:emit-interval shape-input))) (:s3-bucket-prefix shape-input) (clojure.core/assoc "AccessLog.S3BucketPrefix" (ser-access-log-prefix (:s3-bucket-prefix shape-input)))))
(clojure.core/defn- ser-end-point-port [shape-input] shape-input)

(clojure.core/defn req<-remove-tags-input [action-name48193 input48192] {:body {"LoadBalancerNames" (ser-load-balancer-names (input48192 :load-balancer-names)), "Tags" (ser-tag-key-list (input48192 :tags)), "Version" "2012-06-01", "Action" action-name48193}})
(clojure.core/defn req<-apply-security-groups-to-load-balancer-input [action-name48195 input48194] {:body {"LoadBalancerName" (ser-access-point-name (input48194 :load-balancer-name)), "SecurityGroups" (ser-security-groups (input48194 :security-groups)), "Version" "2012-06-01", "Action" action-name48195}})
(clojure.core/defn req<-describe-account-limits-input [action-name48197 input48196] (clojure.core/cond-> {:body {"Version" "2012-06-01", "Action" action-name48197}} (clojure.core/contains? input48196 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input48196 :marker))) (clojure.core/contains? input48196 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input48196 :page-size)))))
(clojure.core/defn req<-describe-load-balancer-policies-input [action-name48199 input48198] (clojure.core/cond-> {:body {"Version" "2012-06-01", "Action" action-name48199}} (clojure.core/contains? input48198 :load-balancer-name) (clojure.core/assoc-in [:body "LoadBalancerName"] (ser-access-point-name (input48198 :load-balancer-name))) (clojure.core/contains? input48198 :policy-names) (clojure.core/assoc-in [:body "PolicyNames"] (ser-policy-names (input48198 :policy-names)))))
(clojure.core/defn req<-set-load-balancer-policies-of-listener-input [action-name48201 input48200] {:body {"LoadBalancerName" (ser-access-point-name (input48200 :load-balancer-name)), "LoadBalancerPort" (ser-access-point-port (input48200 :load-balancer-port)), "PolicyNames" (ser-policy-names (input48200 :policy-names)), "Version" "2012-06-01", "Action" action-name48201}})
(clojure.core/defn req<-remove-availability-zones-input [action-name48203 input48202] {:body {"LoadBalancerName" (ser-access-point-name (input48202 :load-balancer-name)), "AvailabilityZones" (ser-availability-zones (input48202 :availability-zones)), "Version" "2012-06-01", "Action" action-name48203}})
(clojure.core/defn req<-delete-access-point-input [action-name48205 input48204] {:body {"LoadBalancerName" (ser-access-point-name (input48204 :load-balancer-name)), "Version" "2012-06-01", "Action" action-name48205}})
(clojure.core/defn req<-createlbcookie-stickiness-policy-input [action-name48207 input48206] (clojure.core/let [input48208 {:body {"LoadBalancerName" (ser-access-point-name (input48206 :load-balancer-name)), "PolicyName" (ser-policy-name (input48206 :policy-name)), "Version" "2012-06-01", "Action" action-name48207}}] (clojure.core/cond-> input48208 (clojure.core/contains? input48206 :cookie-expiration-period) (clojure.core/assoc-in [:body "CookieExpirationPeriod"] (ser-cookie-expiration-period (input48206 :cookie-expiration-period))))))
(clojure.core/defn req<-describe-end-point-state-input [action-name48210 input48209] (clojure.core/let [input48211 {:body {"LoadBalancerName" (ser-access-point-name (input48209 :load-balancer-name)), "Version" "2012-06-01", "Action" action-name48210}}] (clojure.core/cond-> input48211 (clojure.core/contains? input48209 :instances) (clojure.core/assoc-in [:body "Instances"] (ser-instances (input48209 :instances))))))
(clojure.core/defn req<-modify-load-balancer-attributes-input [action-name48213 input48212] {:body {"LoadBalancerName" (ser-access-point-name (input48212 :load-balancer-name)), "LoadBalancerAttributes" (ser-load-balancer-attributes (input48212 :load-balancer-attributes)), "Version" "2012-06-01", "Action" action-name48213}})
(clojure.core/defn req<-create-access-point-input [action-name48215 input48214] (clojure.core/let [input48216 {:body {"LoadBalancerName" (ser-access-point-name (input48214 :load-balancer-name)), "Listeners" (ser-listeners (input48214 :listeners)), "Version" "2012-06-01", "Action" action-name48215}}] (clojure.core/cond-> input48216 (clojure.core/contains? input48214 :availability-zones) (clojure.core/assoc-in [:body "AvailabilityZones"] (ser-availability-zones (input48214 :availability-zones))) (clojure.core/contains? input48214 :subnets) (clojure.core/assoc-in [:body "Subnets"] (ser-subnets (input48214 :subnets))) (clojure.core/contains? input48214 :security-groups) (clojure.core/assoc-in [:body "SecurityGroups"] (ser-security-groups (input48214 :security-groups))) (clojure.core/contains? input48214 :scheme) (clojure.core/assoc-in [:body "Scheme"] (ser-load-balancer-scheme (input48214 :scheme))) (clojure.core/contains? input48214 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tag-list (input48214 :tags))))))
(clojure.core/defn req<-describe-tags-input [action-name48218 input48217] {:body {"LoadBalancerNames" (ser-load-balancer-names-max20 (input48217 :load-balancer-names)), "Version" "2012-06-01", "Action" action-name48218}})
(clojure.core/defn req<-describe-load-balancer-policy-types-input [action-name48220 input48219] (clojure.core/cond-> {:body {"Version" "2012-06-01", "Action" action-name48220}} (clojure.core/contains? input48219 :policy-type-names) (clojure.core/assoc-in [:body "PolicyTypeNames"] (ser-policy-type-names (input48219 :policy-type-names)))))
(clojure.core/defn req<-attach-load-balancer-to-subnets-input [action-name48222 input48221] {:body {"LoadBalancerName" (ser-access-point-name (input48221 :load-balancer-name)), "Subnets" (ser-subnets (input48221 :subnets)), "Version" "2012-06-01", "Action" action-name48222}})
(clojure.core/defn req<-add-availability-zones-input [action-name48224 input48223] {:body {"LoadBalancerName" (ser-access-point-name (input48223 :load-balancer-name)), "AvailabilityZones" (ser-availability-zones (input48223 :availability-zones)), "Version" "2012-06-01", "Action" action-name48224}})
(clojure.core/defn req<-set-load-balancer-policies-for-backend-server-input [action-name48226 input48225] {:body {"LoadBalancerName" (ser-access-point-name (input48225 :load-balancer-name)), "InstancePort" (ser-end-point-port (input48225 :instance-port)), "PolicyNames" (ser-policy-names (input48225 :policy-names)), "Version" "2012-06-01", "Action" action-name48226}})
(clojure.core/defn req<-create-load-balancer-policy-input [action-name48228 input48227] (clojure.core/let [input48229 {:body {"LoadBalancerName" (ser-access-point-name (input48227 :load-balancer-name)), "PolicyName" (ser-policy-name (input48227 :policy-name)), "PolicyTypeName" (ser-policy-type-name (input48227 :policy-type-name)), "Version" "2012-06-01", "Action" action-name48228}}] (clojure.core/cond-> input48229 (clojure.core/contains? input48227 :policy-attributes) (clojure.core/assoc-in [:body "PolicyAttributes"] (ser-policy-attributes (input48227 :policy-attributes))))))
(clojure.core/defn req<-delete-load-balancer-listener-input [action-name48231 input48230] {:body {"LoadBalancerName" (ser-access-point-name (input48230 :load-balancer-name)), "LoadBalancerPorts" (ser-ports (input48230 :load-balancer-ports)), "Version" "2012-06-01", "Action" action-name48231}})
(clojure.core/defn req<-deregister-end-points-input [action-name48233 input48232] {:body {"LoadBalancerName" (ser-access-point-name (input48232 :load-balancer-name)), "Instances" (ser-instances (input48232 :instances)), "Version" "2012-06-01", "Action" action-name48233}})
(clojure.core/defn req<-detach-load-balancer-from-subnets-input [action-name48235 input48234] {:body {"LoadBalancerName" (ser-access-point-name (input48234 :load-balancer-name)), "Subnets" (ser-subnets (input48234 :subnets)), "Version" "2012-06-01", "Action" action-name48235}})
(clojure.core/defn req<-register-end-points-input [action-name48237 input48236] {:body {"LoadBalancerName" (ser-access-point-name (input48236 :load-balancer-name)), "Instances" (ser-instances (input48236 :instances)), "Version" "2012-06-01", "Action" action-name48237}})
(clojure.core/defn req<-create-app-cookie-stickiness-policy-input [action-name48239 input48238] {:body {"LoadBalancerName" (ser-access-point-name (input48238 :load-balancer-name)), "PolicyName" (ser-policy-name (input48238 :policy-name)), "CookieName" (ser-cookie-name (input48238 :cookie-name)), "Version" "2012-06-01", "Action" action-name48239}})
(clojure.core/defn req<-create-load-balancer-listener-input [action-name48241 input48240] {:body {"LoadBalancerName" (ser-access-point-name (input48240 :load-balancer-name)), "Listeners" (ser-listeners (input48240 :listeners)), "Version" "2012-06-01", "Action" action-name48241}})
(clojure.core/defn req<-add-tags-input [action-name48243 input48242] {:body {"LoadBalancerNames" (ser-load-balancer-names (input48242 :load-balancer-names)), "Tags" (ser-tag-list (input48242 :tags)), "Version" "2012-06-01", "Action" action-name48243}})
(clojure.core/defn req<-configure-health-check-input [action-name48245 input48244] {:body {"LoadBalancerName" (ser-access-point-name (input48244 :load-balancer-name)), "HealthCheck" (ser-health-check (input48244 :health-check)), "Version" "2012-06-01", "Action" action-name48245}})
(clojure.core/defn req<-set-load-balancer-listenersslcertificate-input [action-name48247 input48246] {:body {"LoadBalancerName" (ser-access-point-name (input48246 :load-balancer-name)), "LoadBalancerPort" (ser-access-point-port (input48246 :load-balancer-port)), "SSLCertificateId" (ser-sslcertificate-id (input48246 :sslcertificate-id)), "Version" "2012-06-01", "Action" action-name48247}})
(clojure.core/defn req<-delete-load-balancer-policy-input [action-name48249 input48248] {:body {"LoadBalancerName" (ser-access-point-name (input48248 :load-balancer-name)), "PolicyName" (ser-policy-name (input48248 :policy-name)), "Version" "2012-06-01", "Action" action-name48249}})
(clojure.core/defn req<-describe-access-points-input [action-name48251 input48250] (clojure.core/cond-> {:body {"Version" "2012-06-01", "Action" action-name48251}} (clojure.core/contains? input48250 :load-balancer-names) (clojure.core/assoc-in [:body "LoadBalancerNames"] (ser-load-balancer-names (input48250 :load-balancer-names))) (clojure.core/contains? input48250 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input48250 :marker))) (clojure.core/contains? input48250 :page-size) (clojure.core/assoc-in [:body "PageSize"] (ser-page-size (input48250 :page-size)))))
(clojure.core/defn req<-describe-load-balancer-attributes-input [action-name48253 input48252] {:body {"LoadBalancerName" (ser-access-point-name (input48252 :load-balancer-name)), "Version" "2012-06-01", "Action" action-name48253}})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/attribute-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/backend-server-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/backend-server-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.health-check/target (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/health-check-target))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.health-check/interval (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/health-check-interval))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.health-check/timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/health-check-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/health-check (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.health-check/Target :portkey.aws.elasticloadbalancing.health-check/Interval :portkey.aws.elasticloadbalancing.health-check/Timeout :portkey.aws.elasticloadbalancing/UnhealthyThreshold :portkey.aws.elasticloadbalancing/HealthyThreshold] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-tags-input/load-balancer-names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/load-balancer-names-max20))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.describe-tags-input/LoadBalancerNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-access-points-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-access-points-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/LoadBalancerDescriptions :portkey.aws.elasticloadbalancing.describe-access-points-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-attributes (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/CrossZoneLoadBalancing :portkey.aws.elasticloadbalancing/AccessLog :portkey.aws.elasticloadbalancing/ConnectionDraining :portkey.aws.elasticloadbalancing/ConnectionSettings :portkey.aws.elasticloadbalancing/AdditionalAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-type-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-type-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/cross-zone-load-balancing-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/operation-not-permitted-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/health-check-timeout (clojure.spec.alpha/int-in 2 60))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.attach-load-balancer-to-subnets-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.attach-load-balancer-to-subnets-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Subnets] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/access-point-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/app-cookie-stickiness-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyName :portkey.aws.elasticloadbalancing/CookieName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/cardinality (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/max (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.delete-load-balancer-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.delete-load-balancer-policy-input/LoadBalancerName :portkey.aws.elasticloadbalancing/PolicyName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-account-limits-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-account-limits-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Limits :portkey.aws.elasticloadbalancing.describe-account-limits-output/NextMarker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-type-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyTypeName :portkey.aws.elasticloadbalancing/Description :portkey.aws.elasticloadbalancing/PolicyAttributeTypeDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/additional-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/additional-attribute :max-count 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/page-size (clojure.spec.alpha/int-in 1 400))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.load-balancer-description/canonical-hosted-zone-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/dnsname))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.load-balancer-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.load-balancer-description/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/load-balancer-scheme))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.load-balancer-description/canonical-hosted-zone-nameid (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/dnsname))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/BackendServerDescriptions :portkey.aws.elasticloadbalancing.load-balancer-description/CanonicalHostedZoneName :portkey.aws.elasticloadbalancing/HealthCheck :portkey.aws.elasticloadbalancing/Subnets :portkey.aws.elasticloadbalancing/SecurityGroups :portkey.aws.elasticloadbalancing.load-balancer-description/LoadBalancerName :portkey.aws.elasticloadbalancing/ListenerDescriptions :portkey.aws.elasticloadbalancing/SourceSecurityGroup :portkey.aws.elasticloadbalancing/CreatedTime :portkey.aws.elasticloadbalancing.load-balancer-description/Scheme :portkey.aws.elasticloadbalancing/DNSName :portkey.aws.elasticloadbalancing.load-balancer-description/CanonicalHostedZoneNameID :portkey.aws.elasticloadbalancing/Policies :portkey.aws.elasticloadbalancing/AvailabilityZones :portkey.aws.elasticloadbalancing/VPCId :portkey.aws.elasticloadbalancing/Instances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attribute-type-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AttributeName :portkey.aws.elasticloadbalancing/AttributeType :portkey.aws.elasticloadbalancing/Description :portkey.aws.elasticloadbalancing/DefaultValue :portkey.aws.elasticloadbalancing/Cardinality] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/lbcookie-stickiness-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/lbcookie-stickiness-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/unsupported-protocol-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/subnets (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/subnet-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.deregister-end-points-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/deregister-end-points-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.deregister-end-points-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Instances] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-access-point-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/DNSName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-load-balancer-listener-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-listenersslcertificate-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-listenersslcertificate-input/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.set-load-balancer-listenersslcertificate-input/LoadBalancerName :portkey.aws.elasticloadbalancing.set-load-balancer-listenersslcertificate-input/LoadBalancerPort :portkey.aws.elasticloadbalancing/SSLCertificateId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/security-group-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/invalid-subnet-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instance-states (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/instance-state))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-end-point-state-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-end-point-state-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.describe-end-point-state-input/LoadBalancerName] :opt-un [:portkey.aws.elasticloadbalancing/Instances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyTypeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-load-balancer-attributes-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.describe-load-balancer-attributes-input/LoadBalancerName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instance-port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/register-end-points-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Instances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AttributeName :portkey.aws.elasticloadbalancing/AttributeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.delete-access-point-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-access-point-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.delete-access-point-input/LoadBalancerName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Subnets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-app-cookie-stickiness-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.create-app-cookie-stickiness-policy-input/LoadBalancerName :portkey.aws.elasticloadbalancing/PolicyName :portkey.aws.elasticloadbalancing/CookieName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-access-point-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-access-points-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/LoadBalancerNames :portkey.aws.elasticloadbalancing/Marker :portkey.aws.elasticloadbalancing/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/add-tags-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/listener-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/listener-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/lbcookie-stickiness-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyName :portkey.aws.elasticloadbalancing/CookieExpirationPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.remove-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/remove-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing/LoadBalancerNames :portkey.aws.elasticloadbalancing.remove-tags-input/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyName :portkey.aws.elasticloadbalancing/PolicyTypeName :portkey.aws.elasticloadbalancing/PolicyAttributeDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/s3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.source-security-group/owner-alias (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/security-group-owner-alias))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.source-security-group/group-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/security-group-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/source-security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.source-security-group/OwnerAlias :portkey.aws.elasticloadbalancing.source-security-group/GroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-policies-for-backend-server-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-policies-for-backend-server-input/instance-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/end-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.set-load-balancer-policies-for-backend-server-input/LoadBalancerName :portkey.aws.elasticloadbalancing.set-load-balancer-policies-for-backend-server-input/InstancePort :portkey.aws.elasticloadbalancing/PolicyNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-account-limits-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Marker :portkey.aws.elasticloadbalancing/PageSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/duplicate-listener-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/limit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Name :portkey.aws.elasticloadbalancing/Max] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/load-balancer-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/listener-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Listener :portkey.aws.elasticloadbalancing/PolicyNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/availability-zone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-type-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-type-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/remove-tags-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-attribute-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/too-many-access-points-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.delete-load-balancer-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.delete-load-balancer-listener-input/load-balancer-ports (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/ports))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.delete-load-balancer-listener-input/LoadBalancerName :portkey.aws.elasticloadbalancing.delete-load-balancer-listener-input/LoadBalancerPorts] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-log-interval clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.apply-security-groups-to-load-balancer-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.apply-security-groups-to-load-balancer-input/LoadBalancerName :portkey.aws.elasticloadbalancing/SecurityGroups] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/invalid-end-point-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.tag-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.tag-description/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.tag-description/LoadBalancerName :portkey.aws.elasticloadbalancing.tag-description/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-load-balancer-policy-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/idle-timeout (clojure.spec.alpha/int-in 1 3600))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/limits (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/limit))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.add-availability-zones-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/add-availability-zones-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.add-availability-zones-input/LoadBalancerName :portkey.aws.elasticloadbalancing/AvailabilityZones] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.createlbcookie-stickiness-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.createlbcookie-stickiness-policy-input/LoadBalancerName :portkey.aws.elasticloadbalancing/PolicyName] :opt-un [:portkey.aws.elasticloadbalancing/CookieExpirationPeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/duplicate-access-point-name-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/SecurityGroups] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/tag-key-only :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/duplicate-tag-keys-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-point-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.tag-key-only/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-key-only (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.tag-key-only/Key] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/add-availability-zones-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AvailabilityZones] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/health-check-interval (clojure.spec.alpha/int-in 5 300))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/duplicate-policy-name-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.detach-load-balancer-from-subnets-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.detach-load-balancer-from-subnets-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Subnets] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.configure-health-check-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/configure-health-check-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.configure-health-check-input/LoadBalancerName :portkey.aws.elasticloadbalancing/HealthCheck] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.additional-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/additional-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.additional-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/additional-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/additional-attribute (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.additional-attribute/Key :portkey.aws.elasticloadbalancing.additional-attribute/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/dnsname (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/remove-availability-zones-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AvailabilityZones] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-scheme (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/invalid-scheme-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.cross-zone-load-balancing/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/cross-zone-load-balancing-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/cross-zone-load-balancing (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.cross-zone-load-balancing/Enabled] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/tag-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/add-tags-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing/LoadBalancerNames :portkey.aws.elasticloadbalancing.add-tags-input/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/connection-draining-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/additional-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/ports (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/access-point-port))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-point-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/too-many-tags-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/deregister-end-points-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Instances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/certificate-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-type-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-log-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/unhealthy-threshold (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-tags-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/TagDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.listener/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.listener/instance-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/protocol))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/listener (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing/Protocol :portkey.aws.elasticloadbalancing.listener/LoadBalancerPort :portkey.aws.elasticloadbalancing/InstancePort] :opt-un [:portkey.aws.elasticloadbalancing.listener/InstanceProtocol :portkey.aws.elasticloadbalancing/SSLCertificateId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/too-many-policies-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.connection-draining/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/connection-draining-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.connection-draining/timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/connection-draining-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/connection-draining (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.connection-draining/Enabled] :opt-un [:portkey.aws.elasticloadbalancing.connection-draining/Timeout] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.policies/other-policies (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/policy-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policies (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AppCookieStickinessPolicies :portkey.aws.elasticloadbalancing/LBCookieStickinessPolicies :portkey.aws.elasticloadbalancing.policies/OtherPolicies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-access-point-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-access-point-input/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/load-balancer-scheme))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-access-point-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-access-point-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.create-access-point-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Listeners] :opt-un [:portkey.aws.elasticloadbalancing/AvailabilityZones :portkey.aws.elasticloadbalancing/Subnets :portkey.aws.elasticloadbalancing/SecurityGroups :portkey.aws.elasticloadbalancing.create-access-point-input/Scheme :portkey.aws.elasticloadbalancing.create-access-point-input/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/additional-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/healthy-threshold (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-point-port clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/listeners (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/listener))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/security-group-owner-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.modify-load-balancer-attributes-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.modify-load-balancer-attributes-input/LoadBalancerName :portkey.aws.elasticloadbalancing/LoadBalancerAttributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instance-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/InstanceId :portkey.aws.elasticloadbalancing/State :portkey.aws.elasticloadbalancing/ReasonCode :portkey.aws.elasticloadbalancing/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/security-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/subnet-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/dependency-throttle-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.remove-availability-zones-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/remove-availability-zones-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.remove-availability-zones-input/LoadBalancerName :portkey.aws.elasticloadbalancing/AvailabilityZones] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.tag/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.tag/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/tag (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.tag/Key] :opt-un [:portkey.aws.elasticloadbalancing.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/PolicyTypeDescriptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/reason-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/cookie-expiration-period clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-end-point-state-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/InstanceStates] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-policies-of-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.set-load-balancer-policies-of-listener-input/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.set-load-balancer-policies-of-listener-input/LoadBalancerName :portkey.aws.elasticloadbalancing.set-load-balancer-policies-of-listener-input/LoadBalancerPort :portkey.aws.elasticloadbalancing/PolicyNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/health-check-target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instance (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/InstanceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/sslcertificate-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/app-cookie-stickiness-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/app-cookie-stickiness-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attribute-type-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-attribute-type-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/Subnets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-load-balancer-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-load-balancer-listener-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.create-load-balancer-listener-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Listeners] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.describe-load-balancer-policies-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.describe-load-balancer-policies-input/LoadBalancerName :portkey.aws.elasticloadbalancing/PolicyNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/connection-draining-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/availability-zone))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attribute-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/AttributeName :portkey.aws.elasticloadbalancing/AttributeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/vpcid (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.create-load-balancer-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-load-balancer-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.create-load-balancer-policy-input/LoadBalancerName :portkey.aws.elasticloadbalancing/PolicyName :portkey.aws.elasticloadbalancing/PolicyTypeName] :opt-un [:portkey.aws.elasticloadbalancing/PolicyAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/listener-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/policy-attribute-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/policy-attribute-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-output (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/load-balancer-names-max20 (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/access-point-name :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/connection-settings (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing/IdleTimeout] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.modify-load-balancer-attributes-output/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.modify-load-balancer-attributes-output/LoadBalancerName :portkey.aws.elasticloadbalancing/LoadBalancerAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-log-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/instances (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing/instance))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/LoadBalancerAttributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.access-log/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-log-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.access-log/emit-interval (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-log-interval))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.access-log/s3-bucket-prefix (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-log-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/access-log (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.access-log/Enabled] :opt-un [:portkey.aws.elasticloadbalancing/S3BucketName :portkey.aws.elasticloadbalancing.access-log/EmitInterval :portkey.aws.elasticloadbalancing.access-log/S3BucketPrefix] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/backend-server-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/InstancePort :portkey.aws.elasticloadbalancing/PolicyNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/invalid-security-group-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.register-end-points-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/register-end-points-input (portkey.aws/json-keys :req-un [:portkey.aws.elasticloadbalancing.register-end-points-input/LoadBalancerName :portkey.aws.elasticloadbalancing/Instances] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/end-point-port clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing/configure-health-check-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing/HealthCheck] :locations {}))

(clojure.core/defn remove-tags "Removes one or more tags from the specified load balancer." ([remove-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-remove-tags-input "RemoveTags" remove-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/remove-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/remove-tags-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception}))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/remove-tags-output))

(clojure.core/defn apply-security-groups-to-load-balancer "Associates one or more security groups with your load balancer in a virtual\nprivate cloud (VPC). The specified security groups override the previously\nassociated security groups.\n For more information, see Security Groups for Load Balancers in a VPC\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-groups.html#elb-vpc-security-groups)\nin the Classic Load Balancer Guide." ([apply-security-groups-to-load-balancer-input] (clojure.core/let [req<-input__36755__auto__ (req<-apply-security-groups-to-load-balancer-input "ApplySecurityGroupsToLoadBalancer" apply-security-groups-to-load-balancer-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing/invalid-security-group-exception}))))
(clojure.spec.alpha/fdef apply-security-groups-to-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/apply-security-groups-to-load-balancer-output))

(clojure.core/defn describe-account-limits "Describes the current Elastic Load Balancing resource limits for your AWS\naccount.\n For more information, see Limits for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html)\nin the Classic Load Balancer Guide." ([] (describe-account-limits {})) ([describe-account-limits-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-account-limits-input "DescribeAccountLimits" describe-account-limits-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-account-limits-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-account-limits-output {}))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-account-limits-output))

(clojure.core/defn describe-load-balancer-policies "Describes the specified policies.\n If you specify a load balancer name, the action returns the descriptions of all\npolicies created for the load balancer. If you specify a policy name associated\nwith your load balancer, the action returns the description of that policy. If\nyou don't specify a load balancer name, the action returns descriptions of the\nspecified sample policies, or descriptions of all sample policies. The names of\nthe sample policies have the ELBSample- prefix." ([] (describe-load-balancer-policies {})) ([describe-load-balancer-policies-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancer-policies-input "DescribeLoadBalancerPolicies" describe-load-balancer-policies-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing/policy-not-found-exception}))))
(clojure.spec.alpha/fdef describe-load-balancer-policies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-load-balancer-policies-output))

(clojure.core/defn set-load-balancer-policies-of-listener "Replaces the current set of policies for the specified load balancer port with\nthe specified set of policies.\n To enable back-end server authentication, use\nSetLoadBalancerPoliciesForBackendServer.\n For more information about setting policies, see Update the SSL Negotiation\nConfiguration\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html),\nDuration-Based Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration),\nand Application-Controlled Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application)\nin the Classic Load Balancer Guide." ([set-load-balancer-policies-of-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-load-balancer-policies-of-listener-input "SetLoadBalancerPoliciesOfListener" set-load-balancer-policies-of-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing/policy-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef set-load-balancer-policies-of-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/set-load-balancer-policies-of-listener-output))

(clojure.core/defn disable-availability-zones-for-load-balancer "Removes the specified Availability Zones from the set of Availability Zones for\nthe specified load balancer.\n There must be at least one Availability Zone registered with a load balancer at\nall times. After an Availability Zone is removed, all instances registered with\nthe load balancer that are in the removed Availability Zone go into the\nOutOfService state. Then, the load balancer attempts to equally balance the\ntraffic among its remaining Availability Zones.\n For more information, see Add or Remove Availability Zones\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html)\nin the Classic Load Balancer Guide." ([remove-availability-zones-input] (clojure.core/let [req<-input__36755__auto__ (req<-remove-availability-zones-input "DisableAvailabilityZonesForLoadBalancer" remove-availability-zones-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/remove-availability-zones-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/remove-availability-zones-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef disable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/remove-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/remove-availability-zones-output))

(clojure.core/defn delete-load-balancer "Deletes the specified load balancer.\n If you are attempting to recreate a load balancer, you must reconfigure all\nsettings. The DNS name associated with a deleted load balancer are no longer\nusable. The name and associated DNS record of the deleted load balancer no\nlonger exist and traffic sent to any of its IP addresses is no longer delivered\nto your instances.\n If the load balancer does not exist or has already been deleted, the call to\nDeleteLoadBalancer still succeeds." ([delete-access-point-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-access-point-input "DeleteLoadBalancer" delete-access-point-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/delete-access-point-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/delete-access-point-output {}))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/delete-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/delete-access-point-output))

(clojure.core/defn createlbcookie-stickiness-policy "Generates a stickiness policy with sticky session lifetimes controlled by the\nlifetime of the browser (user-agent) or a specified expiration period. This\npolicy can be associated only with HTTP/HTTPS listeners.\n When a load balancer implements this policy, the load balancer uses a special\ncookie to track the instance for each request. When the load balancer receives a\nrequest, it first checks to see if this cookie is present in the request. If so,\nthe load balancer sends the request to the application server specified in the\ncookie. If not, the load balancer sends the request to a server that is chosen\nbased on the existing load-balancing algorithm.\n A cookie is inserted into the response for binding subsequent requests from the\nsame user to that server. The validity of the cookie is based on the cookie\nexpiration time, which is specified in the policy configuration.\n For more information, see Duration-Based Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration)\nin the Classic Load Balancer Guide." ([createlbcookie-stickiness-policy-input] (clojure.core/let [req<-input__36755__auto__ (req<-createlbcookie-stickiness-policy-input "CreateLBCookieStickinessPolicy" createlbcookie-stickiness-policy-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef createlbcookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/createlbcookie-stickiness-policy-output))

(clojure.core/defn describe-instance-health "Describes the state of the specified instances with respect to the specified\nload balancer. If no instances are specified, the call describes the state of\nall instances that are currently registered with the load balancer. If instances\nare specified, their state is returned even if they are no longer registered\nwith the load balancer. The state of terminated instances is not returned." ([describe-end-point-state-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-end-point-state-input "DescribeInstanceHealth" describe-end-point-state-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-end-point-state-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-end-point-state-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing/invalid-end-point-exception}))))
(clojure.spec.alpha/fdef describe-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/describe-end-point-state-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-end-point-state-output))

(clojure.core/defn modify-load-balancer-attributes "Modifies the attributes of the specified load balancer.\n You can modify the load balancer attributes, such as AccessLogs,\nConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling\nthem. Or, you can modify the load balancer attribute ConnectionSettings by\nspecifying an idle connection timeout value for your load balancer.\n For more information, see the following in the Classic Load Balancer Guide:\n * Cross-Zone Load Balancing\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)\n * Connection Draining\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)\n * Access Logs\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html)\n * Idle Connection Timeout\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)" ([modify-load-balancer-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-modify-load-balancer-attributes-input "ModifyLoadBalancerAttributes" modify-load-balancer-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing/load-balancer-attribute-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/modify-load-balancer-attributes-output))

(clojure.core/defn create-load-balancer "Creates a Classic Load Balancer.\n You can add listeners, security groups, subnets, and tags when you create your\nload balancer, or you can add them later using CreateLoadBalancerListeners,\nApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags.\n To describe your current load balancers, see DescribeLoadBalancers. When you\nare finished with a load balancer, you can delete it using DeleteLoadBalancer.\n You can create up to 20 load balancers per region per account. You can request\nan increase for the number of load balancers for your account. For more\ninformation, see Limits for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html)\nin the Classic Load Balancer Guide." ([create-access-point-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-access-point-input "CreateLoadBalancer" create-access-point-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/create-access-point-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/create-access-point-output {"OperationNotPermittedException" :portkey.aws.elasticloadbalancing/operation-not-permitted-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing/unsupported-protocol-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing/invalid-subnet-exception, "TooManyAccessPointsException" :portkey.aws.elasticloadbalancing/too-many-access-points-exception, "DuplicateAccessPointNameException" :portkey.aws.elasticloadbalancing/duplicate-access-point-name-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancing/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing/too-many-tags-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing/certificate-not-found-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing/invalid-security-group-exception}))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/create-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/create-access-point-output))

(clojure.core/defn describe-tags "Describes the tags associated with the specified load balancers." ([describe-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-tags-input "DescribeTags" describe-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-tags-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception}))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-tags-output))

(clojure.core/defn describe-load-balancer-policy-types "Describes the specified load balancer policy types or all load balancer policy\ntypes.\n The description of each type indicates how it can be used. For example, some\npolicies can be used only with layer 7 listeners, some policies can be used only\nwith layer 4 listeners, and some policies can be used only with your EC2\ninstances.\n You can use CreateLoadBalancerPolicy to create a policy configuration for any\nof these policy types. Then, depending on the policy type, use either\nSetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to\nset the policy." ([] (describe-load-balancer-policy-types {})) ([describe-load-balancer-policy-types-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancer-policy-types-input "DescribeLoadBalancerPolicyTypes" describe-load-balancer-policy-types-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-output {"PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing/policy-type-not-found-exception}))))
(clojure.spec.alpha/fdef describe-load-balancer-policy-types :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-load-balancer-policy-types-output))

(clojure.core/defn attach-load-balancer-to-subnets "Adds one or more subnets to the set of configured subnets for the specified load\nbalancer.\n The load balancer evenly distributes requests across all registered subnets.\nFor more information, see Add or Remove Subnets for Your Load Balancer in a VPC\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html)\nin the Classic Load Balancer Guide." ([attach-load-balancer-to-subnets-input] (clojure.core/let [req<-input__36755__auto__ (req<-attach-load-balancer-to-subnets-input "AttachLoadBalancerToSubnets" attach-load-balancer-to-subnets-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing/invalid-subnet-exception}))))
(clojure.spec.alpha/fdef attach-load-balancer-to-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/attach-load-balancer-to-subnets-output))

(clojure.core/defn enable-availability-zones-for-load-balancer "Adds the specified Availability Zones to the set of Availability Zones for the\nspecified load balancer.\n The load balancer evenly distributes requests across all its registered\nAvailability Zones that contain instances.\n For more information, see Add or Remove Availability Zones\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html)\nin the Classic Load Balancer Guide." ([add-availability-zones-input] (clojure.core/let [req<-input__36755__auto__ (req<-add-availability-zones-input "EnableAvailabilityZonesForLoadBalancer" add-availability-zones-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/add-availability-zones-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/add-availability-zones-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception}))))
(clojure.spec.alpha/fdef enable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/add-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/add-availability-zones-output))

(clojure.core/defn set-load-balancer-policies-for-backend-server "Replaces the set of policies associated with the specified port on which the EC2\ninstance is listening with a new set of policies. At this time, only the\nback-end server authentication policy type can be applied to the instance ports;\nthis policy type is composed of multiple public key policies.\n Each time you use SetLoadBalancerPoliciesForBackendServer to enable the\npolicies, use the PolicyNames parameter to list the policies that you want to\nenable.\n You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify\nthat the policy is associated with the EC2 instance.\n For more information about enabling back-end instance authentication, see\nConfigure Back-end Instance Authentication\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt)\nin the Classic Load Balancer Guide. For more information about Proxy Protocol,\nsee Configure Proxy Protocol Support\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html)\nin the Classic Load Balancer Guide." ([set-load-balancer-policies-for-backend-server-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-load-balancer-policies-for-backend-server-input "SetLoadBalancerPoliciesForBackendServer" set-load-balancer-policies-for-backend-server-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing/policy-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef set-load-balancer-policies-for-backend-server :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/set-load-balancer-policies-for-backend-server-output))

(clojure.core/defn create-load-balancer-policy "Creates a policy with the specified attributes for the specified load balancer.\n Policies are settings that are saved for your load balancer and that can be\napplied to the listener or the application server, depending on the policy type." ([create-load-balancer-policy-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-load-balancer-policy-input "CreateLoadBalancerPolicy" create-load-balancer-policy-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/create-load-balancer-policy-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/create-load-balancer-policy-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing/policy-type-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef create-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/create-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/create-load-balancer-policy-output))

(clojure.core/defn delete-load-balancer-listeners "Deletes the specified listeners from the specified load balancer." ([delete-load-balancer-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-load-balancer-listener-input "DeleteLoadBalancerListeners" delete-load-balancer-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception}))))
(clojure.spec.alpha/fdef delete-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/delete-load-balancer-listener-output))

(clojure.core/defn deregister-instances-from-load-balancer "Deregisters the specified instances from the specified load balancer. After the\ninstance is deregistered, it no longer receives traffic from the load balancer.\n You can use DescribeLoadBalancers to verify that the instance is deregistered\nfrom the load balancer.\n For more information, see Register or De-Register EC2 Instances\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html)\nin the Classic Load Balancer Guide." ([deregister-end-points-input] (clojure.core/let [req<-input__36755__auto__ (req<-deregister-end-points-input "DeregisterInstancesFromLoadBalancer" deregister-end-points-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/deregister-end-points-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/deregister-end-points-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing/invalid-end-point-exception}))))
(clojure.spec.alpha/fdef deregister-instances-from-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/deregister-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/deregister-end-points-output))

(clojure.core/defn detach-load-balancer-from-subnets "Removes the specified subnets from the set of configured subnets for the load\nbalancer.\n After a subnet is removed, all EC2 instances registered with the load balancer\nin the removed subnet go into the OutOfService state. Then, the load balancer\nbalances the traffic among the remaining routable subnets." ([detach-load-balancer-from-subnets-input] (clojure.core/let [req<-input__36755__auto__ (req<-detach-load-balancer-from-subnets-input "DetachLoadBalancerFromSubnets" detach-load-balancer-from-subnets-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef detach-load-balancer-from-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/detach-load-balancer-from-subnets-output))

(clojure.core/defn register-instances-with-load-balancer "Adds the specified instances to the specified load balancer.\n The instance must be a running instance in the same network as the load\nbalancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a\nload balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic\ninstances to that VPC and then register the linked EC2-Classic instances with\nthe load balancer in the VPC.\n Note that RegisterInstanceWithLoadBalancer completes when the request has been\nregistered. Instance registration takes a little time to complete. To check the\nstate of the registered instances, use DescribeLoadBalancers or\nDescribeInstanceHealth.\n After the instance is registered, it starts receiving traffic and requests from\nthe load balancer. Any instance that is not in one of the Availability Zones\nregistered for the load balancer is moved to the OutOfService state. If an\nAvailability Zone is added to the load balancer later, any instances registered\nwith the load balancer move to the InService state.\n To deregister instances from a load balancer, use\nDeregisterInstancesFromLoadBalancer.\n For more information, see Register or De-Register EC2 Instances\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html)\nin the Classic Load Balancer Guide." ([register-end-points-input] (clojure.core/let [req<-input__36755__auto__ (req<-register-end-points-input "RegisterInstancesWithLoadBalancer" register-end-points-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/register-end-points-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/register-end-points-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing/invalid-end-point-exception}))))
(clojure.spec.alpha/fdef register-instances-with-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/register-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/register-end-points-output))

(clojure.core/defn create-app-cookie-stickiness-policy "Generates a stickiness policy with sticky session lifetimes that follow that of\nan application-generated cookie. This policy can be associated only with\nHTTP/HTTPS listeners.\n This policy is similar to the policy created by CreateLBCookieStickinessPolicy,\nexcept that the lifetime of the special Elastic Load Balancing cookie, AWSELB,\nfollows the lifetime of the application-generated cookie specified in the policy\nconfiguration. The load balancer only inserts a new stickiness cookie when the\napplication response includes a new application cookie.\n If the application cookie is explicitly removed or expires, the session stops\nbeing sticky until a new application cookie is issued.\n For more information, see Application-Controlled Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application)\nin the Classic Load Balancer Guide." ([create-app-cookie-stickiness-policy-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-app-cookie-stickiness-policy-input "CreateAppCookieStickinessPolicy" create-app-cookie-stickiness-policy-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef create-app-cookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/create-app-cookie-stickiness-policy-output))

(clojure.core/defn create-load-balancer-listeners "Creates one or more listeners for the specified load balancer. If a listener\nwith the specified port does not already exist, it is created; otherwise, the\nproperties of the new listener must match the properties of the existing\nlistener.\n For more information, see Listeners for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html)\nin the Classic Load Balancer Guide." ([create-load-balancer-listener-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-load-balancer-listener-input "CreateLoadBalancerListeners" create-load-balancer-listener-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/create-load-balancer-listener-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/create-load-balancer-listener-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancing/duplicate-listener-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing/certificate-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing/unsupported-protocol-exception}))))
(clojure.spec.alpha/fdef create-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/create-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/create-load-balancer-listener-output))

(clojure.core/defn add-tags "Adds the specified tags to the specified load balancer. Each load balancer can\nhave a maximum of 10 tags.\n Each tag consists of a key and an optional value. If a tag with the same key is\nalready associated with the load balancer, AddTags updates its value.\n For more information, see Tag Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html)\nin the Classic Load Balancer Guide." ([add-tags-input] (clojure.core/let [req<-input__36755__auto__ (req<-add-tags-input "AddTags" add-tags-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/add-tags-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/add-tags-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing/too-many-tags-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing/duplicate-tag-keys-exception}))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/add-tags-output))

(clojure.core/defn configure-health-check "Specifies the health check settings to use when evaluating the health state of\nyour EC2 instances.\n For more information, see Configure Health Checks for Your Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html)\nin the Classic Load Balancer Guide." ([configure-health-check-input] (clojure.core/let [req<-input__36755__auto__ (req<-configure-health-check-input "ConfigureHealthCheck" configure-health-check-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/configure-health-check-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/configure-health-check-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception}))))
(clojure.spec.alpha/fdef configure-health-check :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/configure-health-check-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/configure-health-check-output))

(clojure.core/defn set-load-balancer-listenersslcertificate "Sets the certificate that terminates the specified listener's SSL connections.\nThe specified certificate replaces any prior certificate that was used on the\nsame load balancer and port.\n For more information about updating your SSL certificate, see Replace the SSL\nCertificate for Your Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-update-ssl-cert.html)\nin the Classic Load Balancer Guide." ([set-load-balancer-listenersslcertificate-input] (clojure.core/let [req<-input__36755__auto__ (req<-set-load-balancer-listenersslcertificate-input "SetLoadBalancerListenerSSLCertificate" set-load-balancer-listenersslcertificate-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-output {"CertificateNotFoundException" :portkey.aws.elasticloadbalancing/certificate-not-found-exception, "AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing/unsupported-protocol-exception}))))
(clojure.spec.alpha/fdef set-load-balancer-listenersslcertificate :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/set-load-balancer-listenersslcertificate-output))

(clojure.core/defn delete-load-balancer-policy "Deletes the specified policy from the specified load balancer. This policy must\nnot be enabled for any listeners." ([delete-load-balancer-policy-input] (clojure.core/let [req<-input__36755__auto__ (req<-delete-load-balancer-policy-input "DeleteLoadBalancerPolicy" delete-load-balancer-policy-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing/invalid-configuration-request-exception}))))
(clojure.spec.alpha/fdef delete-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/delete-load-balancer-policy-output))

(clojure.core/defn describe-load-balancers "Describes the specified the load balancers. If no load balancers are specified,\nthe call describes all of your load balancers." ([] (describe-load-balancers {})) ([describe-access-points-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-access-points-input "DescribeLoadBalancers" describe-access-points-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-access-points-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-access-points-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "DependencyThrottleException" :portkey.aws.elasticloadbalancing/dependency-throttle-exception}))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing/describe-access-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-access-points-output))

(clojure.core/defn describe-load-balancer-attributes "Describes the attributes for the specified load balancer." ([describe-load-balancer-attributes-input] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancer-attributes-input "DescribeLoadBalancerAttributes" describe-load-balancer-attributes-input)] (portkey.aws/-query-call portkey.aws.elasticloadbalancing/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-output {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing/load-balancer-attribute-not-found-exception}))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing/describe-load-balancer-attributes-output))
