(ns portkey.aws.elasticloadbalancingv2 (:require [portkey.aws]))

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

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-certificate-list)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-extra-params)

(clojure.core/declare ser-load-balancer-attributes)

(clojure.core/declare ser-load-balancer-scheme-enum)

(clojure.core/declare ser-load-balancer-names)

(clojure.core/declare ser-default)

(clojure.core/declare ser-target-group-attribute-value)

(clojure.core/declare ser-rule-priority)

(clojure.core/declare ser-authenticate-oidc-action-conditional-behavior-enum)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-param-value)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-authenticate-cognito-action-config)

(clojure.core/declare ser-redirect-action-protocol)

(clojure.core/declare ser-ssl-policy-names)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-param-value)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-authenticate-oidc-action-authorization-endpoint)

(clojure.core/declare ser-load-balancer-arns)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-param-name)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-subnet-mappings)

(clojure.core/declare ser-path)

(clojure.core/declare ser-health-check-timeout-seconds)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-client-id)

(clojure.core/declare ser-rule-condition-list)

(clojure.core/declare ser-authenticate-oidc-action-user-info-endpoint)

(clojure.core/declare ser-actions)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-domain)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-load-balancer-attribute-value)

(clojure.core/declare ser-load-balancer-arn)

(clojure.core/declare ser-load-balancer-name)

(clojure.core/declare ser-allocation-id)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-authenticate-cognito-action-session-timeout)

(clojure.core/declare ser-rule-arn)

(clojure.core/declare ser-protocol-enum)

(clojure.core/declare ser-authenticate-oidc-action-client-id)

(clojure.core/declare ser-resource-arns)

(clojure.core/declare ser-target-group-arn)

(clojure.core/declare ser-redirect-action-status-code-enum)

(clojure.core/declare ser-listener-arns)

(clojure.core/declare ser-target-group-attribute-key)

(clojure.core/declare ser-subnet-mapping)

(clojure.core/declare ser-fixed-response-action-config)

(clojure.core/declare ser-target-type-enum)

(clojure.core/declare ser-ip-address-type)

(clojure.core/declare ser-ssl-policy-name)

(clojure.core/declare ser-action-type-enum)

(clojure.core/declare ser-fixed-response-action-content-type)

(clojure.core/declare ser-authenticate-oidc-action-config)

(clojure.core/declare ser-health-check-threshold-count)

(clojure.core/declare ser-authenticate-oidc-action-scope)

(clojure.core/declare ser-target-group-name)

(clojure.core/declare ser-target-description)

(clojure.core/declare ser-load-balancer-type-enum)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-rule-priority-pair)

(clojure.core/declare ser-http-code)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-authenticate-oidc-action-token-endpoint)

(clojure.core/declare ser-redirect-action-path)

(clojure.core/declare ser-redirect-action-config)

(clojure.core/declare ser-listener-arn)

(clojure.core/declare ser-redirect-action-query)

(clojure.core/declare ser-target-group-attribute)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-port)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-target-group-arns)

(clojure.core/declare ser-authenticate-oidc-action-issuer)

(clojure.core/declare ser-authenticate-cognito-action-scope)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-health-check-interval-seconds)

(clojure.core/declare ser-health-check-port)

(clojure.core/declare ser-target-descriptions)

(clojure.core/declare ser-redirect-action-host)

(clojure.core/declare ser-load-balancer-attribute-key)

(clojure.core/declare ser-authenticate-cognito-action-user-pool-arn)

(clojure.core/declare ser-certificate-arn)

(clojure.core/declare ser-fixed-response-action-message)

(clojure.core/declare ser-condition-field-name)

(clojure.core/declare ser-rule-condition)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-authenticate-oidc-action-session-cookie-name)

(clojure.core/declare ser-fixed-response-action-status-code)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-action-order)

(clojure.core/declare ser-authenticate-oidc-action-authentication-request-extra-params)

(clojure.core/declare ser-target-group-names)

(clojure.core/declare ser-rule-arns)

(clojure.core/declare ser-authenticate-cognito-action-session-cookie-name)

(clojure.core/declare ser-authenticate-cognito-action-authentication-request-param-name)

(clojure.core/declare ser-authenticate-oidc-action-session-timeout)

(clojure.core/declare ser-matcher)

(clojure.core/declare ser-target-group-attributes)

(clojure.core/declare ser-redirect-action-port)

(clojure.core/declare ser-authenticate-oidc-action-client-secret)

(clojure.core/declare ser-action)

(clojure.core/declare ser-authenticate-cognito-action-conditional-behavior-enum)

(clojure.core/declare ser-certificate)

(clojure.core/declare ser-load-balancer-attribute)

(clojure.core/declare ser-string-value)

(clojure.core/declare ser-rule-priority-list)

(clojure.core/declare ser-zone-name)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-certificate-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-certificate coll) #:http.request.field{:shape "Certificate"}))) input), :shape "CertificateList", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-extra-params [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-authenticate-cognito-action-authentication-request-param-name k) #:http.request.field{:map-info "key", :shape "AuthenticateCognitoActionAuthenticationRequestParamName"}) (clojure.core/into (ser-authenticate-cognito-action-authentication-request-param-value v) #:http.request.field{:map-info "value", :shape "AuthenticateCognitoActionAuthenticationRequestParamValue"})])) input), :shape "AuthenticateCognitoActionAuthenticationRequestExtraParams", :type "map"})

(clojure.core/defn- ser-load-balancer-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-attribute coll) #:http.request.field{:shape "LoadBalancerAttribute"}))) input), :shape "LoadBalancerAttributes", :type "list", :max 20})

(clojure.core/defn- ser-load-balancer-scheme-enum [input] #:http.request.field{:value (clojure.core/get {"internet-facing" "internet-facing", :internetfacing "internet-facing", "internal" "internal", :internal "internal"} input), :shape "LoadBalancerSchemeEnum"})

(clojure.core/defn- ser-load-balancer-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-name coll) #:http.request.field{:shape "LoadBalancerName"}))) input), :shape "LoadBalancerNames", :type "list"})

(clojure.core/defn- ser-default [input] #:http.request.field{:value input, :shape "Default"})

(clojure.core/defn- ser-target-group-attribute-value [input] #:http.request.field{:value input, :shape "TargetGroupAttributeValue"})

(clojure.core/defn- ser-rule-priority [input] #:http.request.field{:value input, :shape "RulePriority"})

(clojure.core/defn- ser-authenticate-oidc-action-conditional-behavior-enum [input] #:http.request.field{:value (clojure.core/get {"deny" "deny", :deny "deny", "allow" "allow", :allow "allow", "authenticate" "authenticate", :authenticate "authenticate"} input), :shape "AuthenticateOidcActionConditionalBehaviorEnum"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-param-value [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthenticationRequestParamValue"})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-authenticate-cognito-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authenticate-cognito-action-user-pool-arn (:user-pool-arn input)) #:http.request.field{:name "UserPoolArn", :shape "AuthenticateCognitoActionUserPoolArn"}) (clojure.core/into (ser-authenticate-cognito-action-user-pool-client-id (:user-pool-client-id input)) #:http.request.field{:name "UserPoolClientId", :shape "AuthenticateCognitoActionUserPoolClientId"}) (clojure.core/into (ser-authenticate-cognito-action-user-pool-domain (:user-pool-domain input)) #:http.request.field{:name "UserPoolDomain", :shape "AuthenticateCognitoActionUserPoolDomain"})], :shape "AuthenticateCognitoActionConfig", :type "structure"} (clojure.core/contains? input :session-cookie-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-session-cookie-name (input :session-cookie-name)) #:http.request.field{:name "SessionCookieName", :shape "AuthenticateCognitoActionSessionCookieName"})) (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-scope (input :scope)) #:http.request.field{:name "Scope", :shape "AuthenticateCognitoActionScope"})) (clojure.core/contains? input :session-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-session-timeout (input :session-timeout)) #:http.request.field{:name "SessionTimeout", :shape "AuthenticateCognitoActionSessionTimeout"})) (clojure.core/contains? input :authentication-request-extra-params) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-authentication-request-extra-params (input :authentication-request-extra-params)) #:http.request.field{:name "AuthenticationRequestExtraParams", :shape "AuthenticateCognitoActionAuthenticationRequestExtraParams"})) (clojure.core/contains? input :on-unauthenticated-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-conditional-behavior-enum (input :on-unauthenticated-request)) #:http.request.field{:name "OnUnauthenticatedRequest", :shape "AuthenticateCognitoActionConditionalBehaviorEnum"}))))

(clojure.core/defn- ser-redirect-action-protocol [input] #:http.request.field{:value input, :shape "RedirectActionProtocol"})

(clojure.core/defn- ser-ssl-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-policy-name coll) #:http.request.field{:shape "SslPolicyName"}))) input), :shape "SslPolicyNames", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-param-value [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionAuthenticationRequestParamValue"})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-authorization-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthorizationEndpoint"})

(clojure.core/defn- ser-load-balancer-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer-arn coll) #:http.request.field{:shape "LoadBalancerArn"}))) input), :shape "LoadBalancerArns", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-param-name [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionAuthenticationRequestParamName"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroups", :type "list"})

(clojure.core/defn- ser-subnet-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-mapping coll) #:http.request.field{:shape "SubnetMapping"}))) input), :shape "SubnetMappings", :type "list"})

(clojure.core/defn- ser-path [input] #:http.request.field{:value input, :shape "Path"})

(clojure.core/defn- ser-health-check-timeout-seconds [input] #:http.request.field{:value input, :shape "HealthCheckTimeoutSeconds"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-client-id [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolClientId"})

(clojure.core/defn- ser-rule-condition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-condition coll) #:http.request.field{:shape "RuleCondition"}))) input), :shape "RuleConditionList", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-user-info-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionUserInfoEndpoint"})

(clojure.core/defn- ser-actions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action coll) #:http.request.field{:shape "Action"}))) input), :shape "Actions", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-domain [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolDomain"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string-value coll) #:http.request.field{:shape "StringValue"}))) input), :shape "ListOfString", :type "list"})

(clojure.core/defn- ser-load-balancer-attribute-value [input] #:http.request.field{:value input, :shape "LoadBalancerAttributeValue"})

(clojure.core/defn- ser-load-balancer-arn [input] #:http.request.field{:value input, :shape "LoadBalancerArn"})

(clojure.core/defn- ser-load-balancer-name [input] #:http.request.field{:value input, :shape "LoadBalancerName"})

(clojure.core/defn- ser-allocation-id [input] #:http.request.field{:value input, :shape "AllocationId"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-authenticate-cognito-action-session-timeout [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionSessionTimeout"})

(clojure.core/defn- ser-rule-arn [input] #:http.request.field{:value input, :shape "RuleArn"})

(clojure.core/defn- ser-protocol-enum [input] #:http.request.field{:value (clojure.core/get {"HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS", "TCP" "TCP", :tcp "TCP"} input), :shape "ProtocolEnum"})

(clojure.core/defn- ser-authenticate-oidc-action-client-id [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionClientId"})

(clojure.core/defn- ser-resource-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "ResourceArns", :type "list"})

(clojure.core/defn- ser-target-group-arn [input] #:http.request.field{:value input, :shape "TargetGroupArn"})

(clojure.core/defn- ser-redirect-action-status-code-enum [input] #:http.request.field{:value (clojure.core/get {"HTTP_301" "HTTP_301", :http-301 "HTTP_301", "HTTP_302" "HTTP_302", :http-302 "HTTP_302"} input), :shape "RedirectActionStatusCodeEnum"})

(clojure.core/defn- ser-listener-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-listener-arn coll) #:http.request.field{:shape "ListenerArn"}))) input), :shape "ListenerArns", :type "list"})

(clojure.core/defn- ser-target-group-attribute-key [input] #:http.request.field{:value input, :shape "TargetGroupAttributeKey"})

(clojure.core/defn- ser-subnet-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SubnetMapping", :type "structure"} (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})) (clojure.core/contains? input :allocation-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allocation-id (input :allocation-id)) #:http.request.field{:name "AllocationId", :shape "AllocationId"}))))

(clojure.core/defn- ser-fixed-response-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fixed-response-action-status-code (:status-code input)) #:http.request.field{:name "StatusCode", :shape "FixedResponseActionStatusCode"})], :shape "FixedResponseActionConfig", :type "structure"} (clojure.core/contains? input :message-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-message (input :message-body)) #:http.request.field{:name "MessageBody", :shape "FixedResponseActionMessage"})) (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "FixedResponseActionContentType"}))))

(clojure.core/defn- ser-target-type-enum [input] #:http.request.field{:value (clojure.core/get {"instance" "instance", :instance "instance", "ip" "ip", :ip "ip"} input), :shape "TargetTypeEnum"})

(clojure.core/defn- ser-ip-address-type [input] #:http.request.field{:value (clojure.core/get {"ipv4" "ipv4", :ipv-4 "ipv4", "dualstack" "dualstack", :dualstack "dualstack"} input), :shape "IpAddressType"})

(clojure.core/defn- ser-ssl-policy-name [input] #:http.request.field{:value input, :shape "SslPolicyName"})

(clojure.core/defn- ser-action-type-enum [input] #:http.request.field{:value (clojure.core/get {"authenticate-oidc" "authenticate-oidc", "redirect" "redirect", :forward "forward", :authenticateoidc "authenticate-oidc", "fixed-response" "fixed-response", :fixedresponse "fixed-response", :authenticatecognito "authenticate-cognito", "forward" "forward", "authenticate-cognito" "authenticate-cognito", :redirect "redirect"} input), :shape "ActionTypeEnum"})

(clojure.core/defn- ser-fixed-response-action-content-type [input] #:http.request.field{:value input, :shape "FixedResponseActionContentType"})

(clojure.core/defn- ser-authenticate-oidc-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-authenticate-oidc-action-issuer (:issuer input)) #:http.request.field{:name "Issuer", :shape "AuthenticateOidcActionIssuer"}) (clojure.core/into (ser-authenticate-oidc-action-authorization-endpoint (:authorization-endpoint input)) #:http.request.field{:name "AuthorizationEndpoint", :shape "AuthenticateOidcActionAuthorizationEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-token-endpoint (:token-endpoint input)) #:http.request.field{:name "TokenEndpoint", :shape "AuthenticateOidcActionTokenEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-user-info-endpoint (:user-info-endpoint input)) #:http.request.field{:name "UserInfoEndpoint", :shape "AuthenticateOidcActionUserInfoEndpoint"}) (clojure.core/into (ser-authenticate-oidc-action-client-id (:client-id input)) #:http.request.field{:name "ClientId", :shape "AuthenticateOidcActionClientId"}) (clojure.core/into (ser-authenticate-oidc-action-client-secret (:client-secret input)) #:http.request.field{:name "ClientSecret", :shape "AuthenticateOidcActionClientSecret"})], :shape "AuthenticateOidcActionConfig", :type "structure"} (clojure.core/contains? input :on-unauthenticated-request) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-conditional-behavior-enum (input :on-unauthenticated-request)) #:http.request.field{:name "OnUnauthenticatedRequest", :shape "AuthenticateOidcActionConditionalBehaviorEnum"})) (clojure.core/contains? input :session-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-session-timeout (input :session-timeout)) #:http.request.field{:name "SessionTimeout", :shape "AuthenticateOidcActionSessionTimeout"})) (clojure.core/contains? input :authentication-request-extra-params) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-authentication-request-extra-params (input :authentication-request-extra-params)) #:http.request.field{:name "AuthenticationRequestExtraParams", :shape "AuthenticateOidcActionAuthenticationRequestExtraParams"})) (clojure.core/contains? input :session-cookie-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-session-cookie-name (input :session-cookie-name)) #:http.request.field{:name "SessionCookieName", :shape "AuthenticateOidcActionSessionCookieName"})) (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-scope (input :scope)) #:http.request.field{:name "Scope", :shape "AuthenticateOidcActionScope"}))))

(clojure.core/defn- ser-health-check-threshold-count [input] #:http.request.field{:value input, :shape "HealthCheckThresholdCount"})

(clojure.core/defn- ser-authenticate-oidc-action-scope [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionScope"})

(clojure.core/defn- ser-target-group-name [input] #:http.request.field{:value input, :shape "TargetGroupName"})

(clojure.core/defn- ser-target-description [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"})], :shape "TargetDescription", :type "structure"} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-zone-name (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "ZoneName"}))))

(clojure.core/defn- ser-load-balancer-type-enum [input] #:http.request.field{:value (clojure.core/get {"application" "application", :application "application", "network" "network", :network "network"} input), :shape "LoadBalancerTypeEnum"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :min 1})

(clojure.core/defn- ser-rule-priority-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RulePriorityPair", :type "structure"} (clojure.core/contains? input :rule-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-priority (input :priority)) #:http.request.field{:name "Priority", :shape "RulePriority"}))))

(clojure.core/defn- ser-http-code [input] #:http.request.field{:value input, :shape "HttpCode"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-authenticate-oidc-action-token-endpoint [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionTokenEndpoint"})

(clojure.core/defn- ser-redirect-action-path [input] #:http.request.field{:value input, :shape "RedirectActionPath"})

(clojure.core/defn- ser-redirect-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-redirect-action-status-code-enum (:status-code input)) #:http.request.field{:name "StatusCode", :shape "RedirectActionStatusCodeEnum"})], :shape "RedirectActionConfig", :type "structure"} (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "RedirectActionProtocol"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-port (input :port)) #:http.request.field{:name "Port", :shape "RedirectActionPort"})) (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-host (input :host)) #:http.request.field{:name "Host", :shape "RedirectActionHost"})) (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-path (input :path)) #:http.request.field{:name "Path", :shape "RedirectActionPath"})) (clojure.core/contains? input :query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-query (input :query)) #:http.request.field{:name "Query", :shape "RedirectActionQuery"}))))

(clojure.core/defn- ser-listener-arn [input] #:http.request.field{:value input, :shape "ListenerArn"})

(clojure.core/defn- ser-redirect-action-query [input] #:http.request.field{:value input, :shape "RedirectActionQuery"})

(clojure.core/defn- ser-target-group-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGroupAttribute", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-attribute-key (input :key)) #:http.request.field{:name "Key", :shape "TargetGroupAttributeKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "TargetGroupAttributeValue"}))))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-target-group-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-arn coll) #:http.request.field{:shape "TargetGroupArn"}))) input), :shape "TargetGroupArns", :type "list"})

(clojure.core/defn- ser-authenticate-oidc-action-issuer [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionIssuer"})

(clojure.core/defn- ser-authenticate-cognito-action-scope [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionScope"})

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-health-check-interval-seconds [input] #:http.request.field{:value input, :shape "HealthCheckIntervalSeconds"})

(clojure.core/defn- ser-health-check-port [input] #:http.request.field{:value input, :shape "HealthCheckPort"})

(clojure.core/defn- ser-target-descriptions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-description coll) #:http.request.field{:shape "TargetDescription"}))) input), :shape "TargetDescriptions", :type "list"})

(clojure.core/defn- ser-redirect-action-host [input] #:http.request.field{:value input, :shape "RedirectActionHost"})

(clojure.core/defn- ser-load-balancer-attribute-key [input] #:http.request.field{:value input, :shape "LoadBalancerAttributeKey"})

(clojure.core/defn- ser-authenticate-cognito-action-user-pool-arn [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionUserPoolArn"})

(clojure.core/defn- ser-certificate-arn [input] #:http.request.field{:value input, :shape "CertificateArn"})

(clojure.core/defn- ser-fixed-response-action-message [input] #:http.request.field{:value input, :shape "FixedResponseActionMessage"})

(clojure.core/defn- ser-condition-field-name [input] #:http.request.field{:value input, :shape "ConditionFieldName"})

(clojure.core/defn- ser-rule-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RuleCondition", :type "structure"} (clojure.core/contains? input :field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition-field-name (input :field)) #:http.request.field{:name "Field", :shape "ConditionFieldName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :values)) #:http.request.field{:name "Values", :shape "ListOfString"}))))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-authenticate-oidc-action-session-cookie-name [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionSessionCookieName"})

(clojure.core/defn- ser-fixed-response-action-status-code [input] #:http.request.field{:value input, :shape "FixedResponseActionStatusCode"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-action-order [input] #:http.request.field{:value input, :shape "ActionOrder"})

(clojure.core/defn- ser-authenticate-oidc-action-authentication-request-extra-params [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-authenticate-oidc-action-authentication-request-param-name k) #:http.request.field{:map-info "key", :shape "AuthenticateOidcActionAuthenticationRequestParamName"}) (clojure.core/into (ser-authenticate-oidc-action-authentication-request-param-value v) #:http.request.field{:map-info "value", :shape "AuthenticateOidcActionAuthenticationRequestParamValue"})])) input), :shape "AuthenticateOidcActionAuthenticationRequestExtraParams", :type "map"})

(clojure.core/defn- ser-target-group-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-name coll) #:http.request.field{:shape "TargetGroupName"}))) input), :shape "TargetGroupNames", :type "list"})

(clojure.core/defn- ser-rule-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-arn coll) #:http.request.field{:shape "RuleArn"}))) input), :shape "RuleArns", :type "list"})

(clojure.core/defn- ser-authenticate-cognito-action-session-cookie-name [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionSessionCookieName"})

(clojure.core/defn- ser-authenticate-cognito-action-authentication-request-param-name [input] #:http.request.field{:value input, :shape "AuthenticateCognitoActionAuthenticationRequestParamName"})

(clojure.core/defn- ser-authenticate-oidc-action-session-timeout [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionSessionTimeout"})

(clojure.core/defn- ser-matcher [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-http-code (:http-code input)) #:http.request.field{:name "HttpCode", :shape "HttpCode"})], :shape "Matcher", :type "structure"}))

(clojure.core/defn- ser-target-group-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-attribute coll) #:http.request.field{:shape "TargetGroupAttribute"}))) input), :shape "TargetGroupAttributes", :type "list"})

(clojure.core/defn- ser-redirect-action-port [input] #:http.request.field{:value input, :shape "RedirectActionPort"})

(clojure.core/defn- ser-authenticate-oidc-action-client-secret [input] #:http.request.field{:value input, :shape "AuthenticateOidcActionClientSecret"})

(clojure.core/defn- ser-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-action-type-enum (:type input)) #:http.request.field{:name "Type", :shape "ActionTypeEnum"})], :shape "Action", :type "structure"} (clojure.core/contains? input :target-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})) (clojure.core/contains? input :authenticate-oidc-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-oidc-action-config (input :authenticate-oidc-config)) #:http.request.field{:name "AuthenticateOidcConfig", :shape "AuthenticateOidcActionConfig"})) (clojure.core/contains? input :authenticate-cognito-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authenticate-cognito-action-config (input :authenticate-cognito-config)) #:http.request.field{:name "AuthenticateCognitoConfig", :shape "AuthenticateCognitoActionConfig"})) (clojure.core/contains? input :order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-order (input :order)) #:http.request.field{:name "Order", :shape "ActionOrder"})) (clojure.core/contains? input :redirect-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-redirect-action-config (input :redirect-config)) #:http.request.field{:name "RedirectConfig", :shape "RedirectActionConfig"})) (clojure.core/contains? input :fixed-response-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fixed-response-action-config (input :fixed-response-config)) #:http.request.field{:name "FixedResponseConfig", :shape "FixedResponseActionConfig"}))))

(clojure.core/defn- ser-authenticate-cognito-action-conditional-behavior-enum [input] #:http.request.field{:value (clojure.core/get {"deny" "deny", :deny "deny", "allow" "allow", :allow "allow", "authenticate" "authenticate", :authenticate "authenticate"} input), :shape "AuthenticateCognitoActionConditionalBehaviorEnum"})

(clojure.core/defn- ser-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Certificate", :type "structure"} (clojure.core/contains? input :certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-arn (input :certificate-arn)) #:http.request.field{:name "CertificateArn", :shape "CertificateArn"})) (clojure.core/contains? input :is-default) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default (input :is-default)) #:http.request.field{:name "IsDefault", :shape "Default"}))))

(clojure.core/defn- ser-load-balancer-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancerAttribute", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-attribute-key (input :key)) #:http.request.field{:name "Key", :shape "LoadBalancerAttributeKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "LoadBalancerAttributeValue"}))))

(clojure.core/defn- ser-string-value [input] #:http.request.field{:value input, :shape "StringValue"})

(clojure.core/defn- ser-rule-priority-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-rule-priority-pair coll) #:http.request.field{:shape "RulePriorityPair"}))) input), :shape "RulePriorityList", :type "list"})

(clojure.core/defn- ser-zone-name [input] #:http.request.field{:value input, :shape "ZoneName"})

(clojure.core/defn- req-add-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})]}))

(clojure.core/defn- req-describe-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"})]}))

(clojure.core/defn- req-create-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"}) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"}) (clojure.core/into (ser-actions (input :default-actions)) #:http.request.field{:name "DefaultActions", :shape "Actions"})]} (clojure.core/contains? input :ssl-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-name (input :ssl-policy)) #:http.request.field{:name "SslPolicy", :shape "SslPolicyName"})) (clojure.core/contains? input :certificates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"}))))

(clojure.core/defn- req-modify-target-group-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-group-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "TargetGroupAttributes"})]}))

(clojure.core/defn- req-set-security-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})]}))

(clojure.core/defn- req-set-ip-address-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"})]}))

(clojure.core/defn- req-describe-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]}))

(clojure.core/defn- req-remove-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})]}))

(clojure.core/defn- req-remove-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-register-targets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"})]}))

(clojure.core/defn- req-describe-listeners-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})) (clojure.core/contains? input :listener-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listener-arns (input :listener-arns)) #:http.request.field{:name "ListenerArns", :shape "ListenerArns"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-account-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-target-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})) (clojure.core/contains? input :target-group-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-arns (input :target-group-arns)) #:http.request.field{:name "TargetGroupArns", :shape "TargetGroupArns"})) (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-names (input :names)) #:http.request.field{:name "Names", :shape "TargetGroupNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-modify-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]} (clojure.core/contains? input :healthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :healthy-threshold-count)) #:http.request.field{:name "HealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-timeout-seconds (input :health-check-timeout-seconds)) #:http.request.field{:name "HealthCheckTimeoutSeconds", :shape "HealthCheckTimeoutSeconds"})) (clojure.core/contains? input :unhealthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :unhealthy-threshold-count)) #:http.request.field{:name "UnhealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :matcher) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matcher (input :matcher)) #:http.request.field{:name "Matcher", :shape "Matcher"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "Path"}))))

(clojure.core/defn- req-modify-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})]} (clojure.core/contains? input :conditions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "RuleConditionList"})) (clojure.core/contains? input :actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-actions (input :actions)) #:http.request.field{:name "Actions", :shape "Actions"}))))

(clojure.core/defn- req-create-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"}) (clojure.core/into (ser-rule-condition-list (input :conditions)) #:http.request.field{:name "Conditions", :shape "RuleConditionList"}) (clojure.core/into (ser-rule-priority (input :priority)) #:http.request.field{:name "Priority", :shape "RulePriority"}) (clojure.core/into (ser-actions (input :actions)) #:http.request.field{:name "Actions", :shape "Actions"})]}))

(clojure.core/defn- req-describe-load-balancers-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-arns (input :load-balancer-arns)) #:http.request.field{:name "LoadBalancerArns", :shape "LoadBalancerArns"})) (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-names (input :names)) #:http.request.field{:name "Names", :shape "LoadBalancerNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-describe-target-health-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]} (clojure.core/contains? input :targets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"}))))

(clojure.core/defn- req-deregister-targets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"}) (clojure.core/into (ser-target-descriptions (input :targets)) #:http.request.field{:name "Targets", :shape "TargetDescriptions"})]}))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arns (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArns"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-describe-rules-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :listener-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})) (clojure.core/contains? input :rule-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-arns (input :rule-arns)) #:http.request.field{:name "RuleArns", :shape "RuleArns"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-modify-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :ssl-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-name (input :ssl-policy)) #:http.request.field{:name "SslPolicy", :shape "SslPolicyName"})) (clojure.core/contains? input :certificates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-list (input :certificates)) #:http.request.field{:name "Certificates", :shape "CertificateList"})) (clojure.core/contains? input :default-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-actions (input :default-actions)) #:http.request.field{:name "DefaultActions", :shape "Actions"}))))

(clojure.core/defn- req-delete-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]}))

(clojure.core/defn- req-set-subnets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]} (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})) (clojure.core/contains? input :subnet-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mappings (input :subnet-mappings)) #:http.request.field{:name "SubnetMappings", :shape "SubnetMappings"}))))

(clojure.core/defn- req-modify-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"}) (clojure.core/into (ser-load-balancer-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "LoadBalancerAttributes"})]}))

(clojure.core/defn- req-create-load-balancer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-name (input :name)) #:http.request.field{:name "Name", :shape "LoadBalancerName"})]} (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})) (clojure.core/contains? input :subnet-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mappings (input :subnet-mappings)) #:http.request.field{:name "SubnetMappings", :shape "SubnetMappings"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :scheme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-scheme-enum (input :scheme)) #:http.request.field{:name "Scheme", :shape "LoadBalancerSchemeEnum"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-type-enum (input :type)) #:http.request.field{:name "Type", :shape "LoadBalancerTypeEnum"})) (clojure.core/contains? input :ip-address-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"}))))

(clojure.core/defn- req-delete-load-balancer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-arn (input :load-balancer-arn)) #:http.request.field{:name "LoadBalancerArn", :shape "LoadBalancerArn"})]}))

(clojure.core/defn- req-describe-listener-certificates-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-set-rule-priorities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-priority-list (input :rule-priorities)) #:http.request.field{:name "RulePriorities", :shape "RulePriorityList"})]}))

(clojure.core/defn- req-describe-ssl-policies-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-policy-names (input :names)) #:http.request.field{:name "Names", :shape "SslPolicyNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-delete-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-listener-arn (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "ListenerArn"})]}))

(clojure.core/defn- req-create-target-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-name (input :name)) #:http.request.field{:name "Name", :shape "TargetGroupName"}) (clojure.core/into (ser-protocol-enum (input :protocol)) #:http.request.field{:name "Protocol", :shape "ProtocolEnum"}) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"}) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VpcId", :shape "VpcId"})]} (clojure.core/contains? input :healthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :healthy-threshold-count)) #:http.request.field{:name "HealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-timeout-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-timeout-seconds (input :health-check-timeout-seconds)) #:http.request.field{:name "HealthCheckTimeoutSeconds", :shape "HealthCheckTimeoutSeconds"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type-enum (input :target-type)) #:http.request.field{:name "TargetType", :shape "TargetTypeEnum"})) (clojure.core/contains? input :unhealthy-threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-threshold-count (input :unhealthy-threshold-count)) #:http.request.field{:name "UnhealthyThresholdCount", :shape "HealthCheckThresholdCount"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol-enum (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "ProtocolEnum"})) (clojure.core/contains? input :matcher) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-matcher (input :matcher)) #:http.request.field{:name "Matcher", :shape "Matcher"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "Path"}))))

(clojure.core/defn- req-describe-target-group-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-group-arn (input :target-group-arn)) #:http.request.field{:name "TargetGroupArn", :shape "TargetGroupArn"})]}))

(clojure.core/defn- req-delete-rule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-arn (input :rule-arn)) #:http.request.field{:name "RuleArn", :shape "RuleArn"})]}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-key))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-state-enum #{"healthy" :draining :unhealthy :unavailable :unused "initial" :healthy "unhealthy" "unused" :initial "draining" "unavailable"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/certificate))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.add-listener-certificates-input/certificates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-extra-params (clojure.spec.alpha/map-of :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-name :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-rules-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-priority clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-attribute :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum #{"internal" "internet-facing" :internal :internetfacing})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-addresses (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-address))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2.create-listener-input/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.create-listener-input/default-actions] :opt-un [:portkey.aws.elasticloadbalancingv2.create-listener-input/ssl-policy :portkey.aws.elasticloadbalancingv2.create-listener-input/certificates]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority (clojure.spec.alpha/int-in 1 50000))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/max (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-conditional-behavior-enum #{"authenticate" "allow" :allow "deny" :deny :authenticate})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/limits :portkey.aws.elasticloadbalancingv2.describe-account-limits-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/page-size (clojure.spec.alpha/int-in 1 400))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-arn (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-arn))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-client-id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-client-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-domain (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-domain))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-cookie-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-cookie-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/scope (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-scope))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/authentication-request-extra-params (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-extra-params))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/on-unauthenticated-request (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-conditional-behavior-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-arn :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-client-id :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/user-pool-domain] :opt-un [:portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-cookie-name :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/scope :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/session-timeout :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/authentication-request-extra-params :portkey.aws.elasticloadbalancingv2.authenticate-cognito-action-config/on-unauthenticated-request]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.cipher/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/cipher-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.cipher/name :portkey.aws.elasticloadbalancingv2.cipher/priority]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-protocol (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(HTTPS?|#\{protocol\})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnets (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authorization-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-actions-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/security-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/security-group-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mappings (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/subnet-mapping))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/certificates :portkey.aws.elasticloadbalancingv2.describe-listener-certificates-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/ip-address-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-group-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/cipher-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-security-groups-output/security-group-ids (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/security-groups))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-security-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.set-security-groups-output/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds (clojure.spec.alpha/int-in 2 60))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-condition))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-user-info-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/actions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/action))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/string-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.remove-listener-certificates-input/certificates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns :portkey.aws.elasticloadbalancingv2/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.register-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/register-targets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.register-targets-input/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ssl-policies :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/protocol-enum #{:tcp "TCP" "HTTPS" :http "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/resource-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum #{"active_impaired" :active-impaired "failed" "provisioning" :active :provisioning "active" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/listener-arns :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-account-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/target-group-arns :portkey.aws.elasticloadbalancingv2.describe-target-groups-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/name :portkey.aws.elasticloadbalancingv2/max]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-status-code-enum #{"HTTP_302" :http-302 "HTTP_301" :http-301})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/subnet-id :portkey.aws.elasticloadbalancingv2/allocation-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/message-body (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-message))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/status-code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-status-code))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/content-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-content-type))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.fixed-response-action-config/status-code] :opt-un [:portkey.aws.elasticloadbalancingv2.fixed-response-action-config/message-body :portkey.aws.elasticloadbalancingv2.fixed-response-action-config/content-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ip-address-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/zone-name :portkey.aws.elasticloadbalancingv2/subnet-id :portkey.aws.elasticloadbalancingv2/load-balancer-addresses]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-type-enum #{:ip :instance "ip" "instance"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ciphers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/cipher))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address-type #{:dualstack "ipv4" "dualstack" :ipv-4})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action-type-enum #{"authenticate-oidc" "redirect" :forward :authenticateoidc "fixed-response" :fixedresponse :authenticatecognito "forward" "authenticate-cognito" :redirect})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/canonical-hosted-zone-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/user-info-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-user-info-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/on-unauthenticated-request (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-conditional-behavior-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/token-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-token-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/issuer (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-issuer))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authentication-request-extra-params (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-extra-params))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-secret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-secret))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-cookie-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-cookie-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authorization-endpoint (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authorization-endpoint))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/scope (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-scope))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/issuer :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authorization-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/token-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/user-info-endpoint :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-id :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/client-secret] :opt-un [:portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/on-unauthenticated-request :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-timeout :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/authentication-request-extra-params :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/session-cookie-name :portkey.aws.elasticloadbalancingv2.authenticate-oidc-action-config/scope]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-health-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-threshold-count (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-scope (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-input/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.modify-target-group-input/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-protocol :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.modify-target-group-input/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/rule-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-rule-input/conditions :portkey.aws.elasticloadbalancingv2/actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancers]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag-description/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/resource-arn :portkey.aws.elasticloadbalancingv2.tag-description/tags]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.ssl-policy/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ssl-protocols :portkey.aws.elasticloadbalancingv2/ciphers :portkey.aws.elasticloadbalancingv2.ssl-policy/name]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-rule-input/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2.create-rule-input/conditions :portkey.aws.elasticloadbalancingv2.create-rule-input/priority :portkey.aws.elasticloadbalancingv2/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-id))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-description/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/zone-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-description (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.target-description/id] :opt-un [:portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.target-description/availability-zone]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/limits (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/limit))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.add-listener-certificates-output/certificates]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum #{:application "network" "application" :network})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancers (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/load-balancer))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-priority-pair/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rule-arn :portkey.aws.elasticloadbalancingv2.rule-priority-pair/priority]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/http-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arns :portkey.aws.elasticloadbalancingv2.describe-load-balancers-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-state/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/state-reason))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-state/code :portkey.aws.elasticloadbalancingv2.load-balancer-state/reason]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-token-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-protocol))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/host (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-host))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/query (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-query))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.redirect-action-config/status-code (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-status-code-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.redirect-action-config/status-code] :opt-un [:portkey.aws.elasticloadbalancingv2.redirect-action-config/protocol :portkey.aws.elasticloadbalancingv2.redirect-action-config/port :portkey.aws.elasticloadbalancingv2.redirect-action-config/host :portkey.aws.elasticloadbalancingv2.redirect-action-config/path :portkey.aws.elasticloadbalancingv2.redirect-action-config/query]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-state-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health/reason (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-health-reason-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health/state :portkey.aws.elasticloadbalancingv2.target-health/reason :portkey.aws.elasticloadbalancingv2/description]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-target-group-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-health-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-health-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-target-health-input/targets]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-query (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group-attribute/key :portkey.aws.elasticloadbalancingv2.target-group-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.deregister-targets-input/targets (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-descriptions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/deregister-targets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.deregister-targets-input/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/tag-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-issuer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-scope (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/resource-arns :portkey.aws.elasticloadbalancingv2.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2/rule-arns :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-targets-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds (clojure.spec.alpha/int-in 5 300))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/load-balancers :portkey.aws.elasticloadbalancingv2.describe-load-balancers-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/health-check-port (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/tag-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/priority (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule/conditions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-condition-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rule-arn :portkey.aws.elasticloadbalancingv2.rule/priority :portkey.aws.elasticloadbalancingv2.rule/conditions :portkey.aws.elasticloadbalancingv2/actions :portkey.aws.elasticloadbalancingv2/is-default]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.listener/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listener-arn :portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.listener/protocol :portkey.aws.elasticloadbalancingv2.listener/certificates :portkey.aws.elasticloadbalancingv2.listener/ssl-policy :portkey.aws.elasticloadbalancingv2.listener/default-actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/ssl-policy (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/certificates (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/certificate-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-listener-input/default-actions (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/actions))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2.modify-listener-input/protocol :portkey.aws.elasticloadbalancingv2.modify-listener-input/ssl-policy :portkey.aws.elasticloadbalancingv2.modify-listener-input/certificates :portkey.aws.elasticloadbalancingv2.modify-listener-input/default-actions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-reason-enum #{:target-ip-unusable :target-timeout "Elb.InitialHealthChecking" :target-deregistration-in-progress "Target.NotInUse" "Elb.RegistrationInProgress" :target-not-registered "Target.InvalidState" "Target.ResponseCodeMismatch" "Target.DeregistrationInProgress" :target-failed-health-checks "Target.Timeout" :target-not-in-use "Target.IpUnusable" :elb-internal-error "Elb.InternalError" :target-response-code-mismatch :elb-registration-in-progress :elb-initial-health-checking "Target.NotRegistered" :target-invalid-state "Target.FailedHealthChecks"})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-user-pool-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-listeners-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listeners-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners :portkey.aws.elasticloadbalancingv2.describe-listeners-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-subnets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/subnets :portkey.aws.elasticloadbalancingv2/subnet-mappings]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/condition-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listeners (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/listener))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/field (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/condition-field-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.rule-condition/values (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/list-of-string))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.rule-condition/field :portkey.aws.elasticloadbalancingv2.rule-condition/values]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-input/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-load-balancer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.create-load-balancer-input/name] :opt-un [:portkey.aws.elasticloadbalancingv2/subnets :portkey.aws.elasticloadbalancingv2/subnet-mappings :portkey.aws.elasticloadbalancingv2/security-groups :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/scheme :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/tags :portkey.aws.elasticloadbalancingv2.create-load-balancer-input/type :portkey.aws.elasticloadbalancingv2/ip-address-type]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-scheme-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer/state (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-state))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer/type :portkey.aws.elasticloadbalancingv2/security-groups :portkey.aws.elasticloadbalancingv2/load-balancer-arn :portkey.aws.elasticloadbalancingv2/load-balancer-name :portkey.aws.elasticloadbalancingv2/ip-address-type :portkey.aws.elasticloadbalancingv2/canonical-hosted-zone-id :portkey.aws.elasticloadbalancingv2/created-time :portkey.aws.elasticloadbalancingv2.load-balancer/scheme :portkey.aws.elasticloadbalancingv2/dns-name :portkey.aws.elasticloadbalancingv2/vpc-id :portkey.aws.elasticloadbalancingv2.load-balancer/state :portkey.aws.elasticloadbalancingv2/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/load-balancer-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-health-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocols (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un [:portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/fixed-response-action-status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(2|4|5)\d\d$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.tag/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.tag/key] :opt-un [:portkey.aws.elasticloadbalancingv2.tag/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action-order (clojure.spec.alpha/int-in 1 50000))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/rule-priorities (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/rule-priority-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.set-rule-priorities-input/rule-priorities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/ssl-protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-extra-params (clojure.spec.alpha/map-of :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-name :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-authentication-request-param-value))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-ssl-policies-input/names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/ssl-policy-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-ssl-policies-input/names :portkey.aws.elasticloadbalancingv2/marker :portkey.aws.elasticloadbalancingv2/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/listener-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-arns (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-arn))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-session-cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-group-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/name :portkey.aws.elasticloadbalancingv2.create-target-group-input/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2/vpc-id] :opt-un [:portkey.aws.elasticloadbalancingv2.create-target-group-input/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.create-target-group-input/target-type :portkey.aws.elasticloadbalancingv2.create-target-group-input/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-protocol :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.create-target-group-input/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-authentication-request-param-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rules (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-session-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/is-default clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/create-rule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/target-groups :portkey.aws.elasticloadbalancingv2.describe-target-groups-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/target-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/healthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/target-type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/unhealthy-threshold-count (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/health-check-threshold-count))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/protocol-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-group/health-check-path (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/path))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-group/healthy-threshold-count :portkey.aws.elasticloadbalancingv2/load-balancer-arns :portkey.aws.elasticloadbalancingv2/health-check-timeout-seconds :portkey.aws.elasticloadbalancingv2.target-group/target-type :portkey.aws.elasticloadbalancingv2.target-group/unhealthy-threshold-count :portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2/target-group-name :portkey.aws.elasticloadbalancingv2.target-group/protocol :portkey.aws.elasticloadbalancingv2/port :portkey.aws.elasticloadbalancingv2/vpc-id :portkey.aws.elasticloadbalancingv2/health-check-interval-seconds :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2.target-group/health-check-protocol :portkey.aws.elasticloadbalancingv2/matcher :portkey.aws.elasticloadbalancingv2.target-group/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/matcher (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/http-code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/availability-zone))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/target-group-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-rule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2/rule-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/redirect-action-port (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-client-secret (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/type (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/action-type-enum))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/authenticate-oidc-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-oidc-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/authenticate-cognito-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/order (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/action-order))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/redirect-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/redirect-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.action/fixed-response-config (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/fixed-response-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/action (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancingv2.action/type] :opt-un [:portkey.aws.elasticloadbalancingv2/target-group-arn :portkey.aws.elasticloadbalancingv2.action/authenticate-oidc-config :portkey.aws.elasticloadbalancingv2.action/authenticate-cognito-config :portkey.aws.elasticloadbalancingv2.action/order :portkey.aws.elasticloadbalancingv2.action/redirect-config :portkey.aws.elasticloadbalancingv2.action/fixed-response-config]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/authenticate-cognito-action-conditional-behavior-enum #{"authenticate" "allow" :allow "deny" :deny :authenticate})

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-target-group-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/listener-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.certificate/is-default (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/default))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/certificate-arn :portkey.aws.elasticloadbalancingv2.certificate/is-default]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/ip-address :portkey.aws.elasticloadbalancingv2/allocation-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/priority-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-rules-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-rules-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/rules :portkey.aws.elasticloadbalancingv2.describe-rules-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.modify-load-balancer-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/delete-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/load-balancer-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.load-balancer-attribute/key :portkey.aws.elasticloadbalancingv2.load-balancer-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.target-health-description/target (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/target-description))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/target-health-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.target-health-description/target :portkey.aws.elasticloadbalancingv2/health-check-port :portkey.aws.elasticloadbalancingv2/target-health]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/string-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/attributes (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/load-balancer-attributes))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2.describe-load-balancer-attributes-output/attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/rule-priority-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancingv2/rule-priority-pair))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/zone-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/modify-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancingv2/listeners]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.core/defn describe-target-health ([describe-target-health-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-target-health-input describe-target-health-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-health-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-health-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTargetHealth", :http.request.spec/error-spec {"InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "HealthUnavailableException" :portkey.aws.elasticloadbalancingv2/health-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-target-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-health-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-health-output))

(clojure.core/defn remove-tags ([remove-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/remove-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-tags-output))

(clojure.core/defn delete-rule ([delete-rule-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-rule-input delete-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRule", :http.request.spec/error-spec {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-rule-output))

(clojure.core/defn set-rule-priorities ([set-rule-priorities-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-rule-priorities-input set-rule-priorities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetRulePriorities", :http.request.spec/error-spec {"RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef set-rule-priorities :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-rule-priorities-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-rule-priorities-output))

(clojure.core/defn describe-account-limits ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountLimits", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-account-limits-output))

(clojure.core/defn delete-target-group ([delete-target-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-target-group-input delete-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTargetGroup", :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-target-group-output))

(clojure.core/defn delete-load-balancer ([delete-load-balancer-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-load-balancer-input delete-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancer", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-load-balancer-output))

(clojure.core/defn set-ip-address-type ([set-ip-address-type-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-ip-address-type-input set-ip-address-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIpAddressType", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception}})))))
(clojure.spec.alpha/fdef set-ip-address-type :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-ip-address-type-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-ip-address-type-output))

(clojure.core/defn describe-rules ([] (describe-rules {})) ([describe-rules-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-rules-input describe-rules-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-rules-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-rules-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRules", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef describe-rules :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-rules-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-rules-output))

(clojure.core/defn create-listener ([create-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-listener-input create-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateListener", :http.request.spec/error-spec {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef create-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-listener-output))

(clojure.core/defn modify-load-balancer-attributes ([modify-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-load-balancer-attributes-input modify-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyLoadBalancerAttributes", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-load-balancer-attributes-output))

(clojure.core/defn add-listener-certificates ([add-listener-certificates-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-listener-certificates-input add-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddListenerCertificates", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception}})))))
(clojure.spec.alpha/fdef add-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-listener-certificates-output))

(clojure.core/defn create-rule ([create-rule-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-rule-input create-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRule", :http.request.spec/error-spec {"TooManyRulesException" :portkey.aws.elasticloadbalancingv2/too-many-rules-exception, "TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "PriorityInUseException" :portkey.aws.elasticloadbalancingv2/priority-in-use-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef create-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-rule-output))

(clojure.core/defn create-load-balancer ([create-load-balancer-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-load-balancer-input create-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancer", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "DuplicateLoadBalancerNameException" :portkey.aws.elasticloadbalancingv2/duplicate-load-balancer-name-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception, "ResourceInUseException" :portkey.aws.elasticloadbalancingv2/resource-in-use-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "TooManyLoadBalancersException" :portkey.aws.elasticloadbalancingv2/too-many-load-balancers-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancingv2/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-load-balancer-output))

(clojure.core/defn describe-tags ([describe-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-tags-output))

(clojure.core/defn create-target-group ([create-target-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-target-group-input create-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/create-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/create-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTargetGroup", :http.request.spec/error-spec {"DuplicateTargetGroupNameException" :portkey.aws.elasticloadbalancingv2/duplicate-target-group-name-exception, "TooManyTargetGroupsException" :portkey.aws.elasticloadbalancingv2/too-many-target-groups-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/create-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/create-target-group-output))

(clojure.core/defn modify-rule ([modify-rule-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-rule-input modify-rule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-rule-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-rule-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyRule", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception, "TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "RuleNotFoundException" :portkey.aws.elasticloadbalancingv2/rule-not-found-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef modify-rule :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-rule-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-rule-output))

(clojure.core/defn modify-target-group-attributes ([modify-target-group-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-target-group-attributes-input modify-target-group-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyTargetGroupAttributes", :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-attributes-output))

(clojure.core/defn delete-listener ([delete-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-listener-input delete-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/delete-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/delete-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteListener", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/delete-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/delete-listener-output))

(clojure.core/defn deregister-targets ([deregister-targets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-targets-input deregister-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/deregister-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/deregister-targets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterTargets", :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception}})))))
(clojure.spec.alpha/fdef deregister-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/deregister-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/deregister-targets-output))

(clojure.core/defn describe-ssl-policies ([] (describe-ssl-policies {})) ([describe-ssl-policies-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-ssl-policies-input describe-ssl-policies-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSSLPolicies", :http.request.spec/error-spec {"SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-ssl-policies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-ssl-policies-output))

(clojure.core/defn modify-target-group ([modify-target-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-target-group-input modify-target-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-target-group-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyTargetGroup", :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-target-group :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-target-group-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-target-group-output))

(clojure.core/defn describe-target-group-attributes ([describe-target-group-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-target-group-attributes-input describe-target-group-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTargetGroupAttributes", :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-target-group-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-group-attributes-output))

(clojure.core/defn register-targets ([register-targets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-targets-input register-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/register-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/register-targets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterTargets", :http.request.spec/error-spec {"TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "InvalidTargetException" :portkey.aws.elasticloadbalancingv2/invalid-target-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef register-targets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/register-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/register-targets-output))

(clojure.core/defn describe-target-groups ([] (describe-target-groups {})) ([describe-target-groups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-target-groups-input describe-target-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-target-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-target-groups-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTargetGroups", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-target-groups :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-target-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-target-groups-output))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/add-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"DuplicateTagKeysException" :portkey.aws.elasticloadbalancingv2/duplicate-tag-keys-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancingv2/too-many-tags-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/add-tags-output))

(clojure.core/defn set-security-groups ([set-security-groups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-security-groups-input set-security-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-security-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-security-groups-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetSecurityGroups", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancingv2/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef set-security-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-security-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-security-groups-output))

(clojure.core/defn remove-listener-certificates ([remove-listener-certificates-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-listener-certificates-input remove-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveListenerCertificates", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "OperationNotPermittedException" :portkey.aws.elasticloadbalancingv2/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef remove-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/remove-listener-certificates-output))

(clojure.core/defn set-subnets ([set-subnets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-subnets-input set-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/set-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/set-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetSubnets", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancingv2/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancingv2/invalid-subnet-exception, "AllocationIdNotFoundException" :portkey.aws.elasticloadbalancingv2/allocation-id-not-found-exception, "AvailabilityZoneNotSupportedException" :portkey.aws.elasticloadbalancingv2/availability-zone-not-supported-exception}})))))
(clojure.spec.alpha/fdef set-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/set-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/set-subnets-output))

(clojure.core/defn modify-listener ([modify-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-listener-input modify-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/modify-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/modify-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyListener", :http.request.spec/error-spec {"TargetGroupAssociationLimitException" :portkey.aws.elasticloadbalancingv2/target-group-association-limit-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception, "TooManyActionsException" :portkey.aws.elasticloadbalancingv2/too-many-actions-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancingv2/duplicate-listener-exception, "SSLPolicyNotFoundException" :portkey.aws.elasticloadbalancingv2/ssl-policy-not-found-exception, "TooManyListenersException" :portkey.aws.elasticloadbalancingv2/too-many-listeners-exception, "TooManyCertificatesException" :portkey.aws.elasticloadbalancingv2/too-many-certificates-exception, "InvalidLoadBalancerActionException" :portkey.aws.elasticloadbalancingv2/invalid-load-balancer-action-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancingv2/invalid-configuration-request-exception, "TooManyTargetsException" :portkey.aws.elasticloadbalancingv2/too-many-targets-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancingv2/certificate-not-found-exception, "IncompatibleProtocolsException" :portkey.aws.elasticloadbalancingv2/incompatible-protocols-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "TargetGroupNotFoundException" :portkey.aws.elasticloadbalancingv2/target-group-not-found-exception, "TooManyRegistrationsForTargetIdException" :portkey.aws.elasticloadbalancingv2/too-many-registrations-for-target-id-exception}})))))
(clojure.spec.alpha/fdef modify-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/modify-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/modify-listener-output))

(clojure.core/defn describe-load-balancers ([] (describe-load-balancers {})) ([describe-load-balancers-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-load-balancers-input describe-load-balancers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancers", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-load-balancers-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancers-output))

(clojure.core/defn describe-listeners ([] (describe-listeners {})) ([describe-listeners-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-listeners-input describe-listeners-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-listeners-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-listeners-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeListeners", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception, "LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancingv2/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef describe-listeners :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancingv2/describe-listeners-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listeners-output))

(clojure.core/defn describe-load-balancer-attributes ([describe-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-load-balancer-attributes-input describe-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancerAttributes", :http.request.spec/error-spec {"LoadBalancerNotFoundException" :portkey.aws.elasticloadbalancingv2/load-balancer-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-load-balancer-attributes-output))

(clojure.core/defn describe-listener-certificates ([describe-listener-certificates-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-listener-certificates-input describe-listener-certificates-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancingv2/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-12-01", :http.request.configuration/service-id "Elastic Load Balancing v2", :http.request.spec/input-spec :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeListenerCertificates", :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.elasticloadbalancingv2/listener-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-listener-certificates :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancingv2/describe-listener-certificates-output))
