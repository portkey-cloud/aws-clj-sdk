(ns portkey.aws.cognito-identity (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-northeast-1"},
    :ssl-common-name "cognito-identity.ap-northeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "cognito-identity", :region "eu-west-1"},
    :ssl-common-name "cognito-identity.eu-west-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "cognito-identity", :region "us-east-2"},
    :ssl-common-name "cognito-identity.us-east-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cognito-identity", :region "ap-southeast-2"},
    :ssl-common-name "cognito-identity.ap-southeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "cognito-identity", :region "cn-north-1"},
    :ssl-common-name "cognito-identity.cn-north-1.amazonaws.com.cn",
    :endpoint "https://cognito-identity.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-southeast-1"},
    :ssl-common-name "cognito-identity.ap-southeast-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cognito-identity", :region "ap-northeast-2"},
    :ssl-common-name "cognito-identity.ap-northeast-2.amazonaws.com",
    :endpoint "https://cognito-identity.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "cognito-identity", :region "eu-central-1"},
    :ssl-common-name "cognito-identity.eu-central-1.amazonaws.com",
    :endpoint "https://cognito-identity.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "cognito-identity", :region "eu-west-2"},
    :ssl-common-name "cognito-identity.eu-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "cognito-identity", :region "us-west-2"},
    :ssl-common-name "cognito-identity.us-west-2.amazonaws.com",
    :endpoint "https://cognito-identity.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "cognito-identity", :region "us-east-1"},
    :ssl-common-name "cognito-identity.us-east-1.amazonaws.com",
    :endpoint "https://cognito-identity.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "cognito-identity", :region "ap-south-1"},
    :ssl-common-name "cognito-identity.ap-south-1.amazonaws.com",
    :endpoint "https://cognito-identity.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-cognito-identity-provider-list)

(clojure.core/declare ser-logins-list)

(clojure.core/declare ser-pagination-key)

(clojure.core/declare ser-oidc-provider-list)

(clojure.core/declare ser-identity-pool-unauthenticated)

(clojure.core/declare ser-saml-provider-list)

(clojure.core/declare ser-claim-value)

(clojure.core/declare ser-query-limit)

(clojure.core/declare ser-developer-provider-name)

(clojure.core/declare ser-cognito-identity-provider-token-check)

(clojure.core/declare ser-hide-disabled)

(clojure.core/declare ser-role-mapping)

(clojure.core/declare ser-identity-pool-id)

(clojure.core/declare ser-claim-name)

(clojure.core/declare ser-identity-id)

(clojure.core/declare ser-token-duration)

(clojure.core/declare ser-cognito-identity-provider-name)

(clojure.core/declare ser-role-mapping-map)

(clojure.core/declare ser-cognito-identity-provider-client-id)

(clojure.core/declare ser-identity-pool-name)

(clojure.core/declare ser-identity-provider-id)

(clojure.core/declare ser-role-mapping-type)

(clojure.core/declare ser-mapping-rule)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-mapping-rules-list)

(clojure.core/declare ser-identity-provider-name)

(clojure.core/declare ser-arn-string)

(clojure.core/declare ser-rules-configuration-type)

(clojure.core/declare ser-logins-map)

(clojure.core/declare ser-identity-providers)

(clojure.core/declare ser-cognito-identity-provider)

(clojure.core/declare ser-roles-map)

(clojure.core/declare ser-identity-provider-token)

(clojure.core/declare ser-identity-id-list)

(clojure.core/declare ser-developer-user-identifier)

(clojure.core/declare ser-mapping-rule-match-type)

(clojure.core/declare ser-ambiguous-role-resolution-type)

(clojure.core/declare ser-role-type)

(clojure.core/defn- ser-cognito-identity-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cognito-identity-provider coll) #:http.request.field{:shape "CognitoIdentityProvider"}))) input), :shape "CognitoIdentityProviderList", :type "list"})

(clojure.core/defn- ser-logins-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity-provider-name coll) #:http.request.field{:shape "IdentityProviderName"}))) input), :shape "LoginsList", :type "list"})

(clojure.core/defn- ser-pagination-key [input] #:http.request.field{:value input, :shape "PaginationKey"})

(clojure.core/defn- ser-oidc-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn-string coll) #:http.request.field{:shape "ARNString"}))) input), :shape "OIDCProviderList", :type "list"})

(clojure.core/defn- ser-identity-pool-unauthenticated [input] #:http.request.field{:value input, :shape "IdentityPoolUnauthenticated"})

(clojure.core/defn- ser-saml-provider-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn-string coll) #:http.request.field{:shape "ARNString"}))) input), :shape "SAMLProviderList", :type "list"})

(clojure.core/defn- ser-claim-value [input] #:http.request.field{:value input, :shape "ClaimValue"})

(clojure.core/defn- ser-query-limit [input] #:http.request.field{:value input, :shape "QueryLimit"})

(clojure.core/defn- ser-developer-provider-name [input] #:http.request.field{:value input, :shape "DeveloperProviderName"})

(clojure.core/defn- ser-cognito-identity-provider-token-check [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderTokenCheck"})

(clojure.core/defn- ser-hide-disabled [input] #:http.request.field{:value input, :shape "HideDisabled"})

(clojure.core/defn- ser-role-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-mapping-type (:type input)) #:http.request.field{:name "Type", :shape "RoleMappingType"})], :shape "RoleMapping", :type "structure"} (clojure.core/contains? input :ambiguous-role-resolution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ambiguous-role-resolution-type (input :ambiguous-role-resolution)) #:http.request.field{:name "AmbiguousRoleResolution", :shape "AmbiguousRoleResolutionType"})) (clojure.core/contains? input :rules-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rules-configuration-type (input :rules-configuration)) #:http.request.field{:name "RulesConfiguration", :shape "RulesConfigurationType"}))))

(clojure.core/defn- ser-identity-pool-id [input] #:http.request.field{:value input, :shape "IdentityPoolId"})

(clojure.core/defn- ser-claim-name [input] #:http.request.field{:value input, :shape "ClaimName"})

(clojure.core/defn- ser-identity-id [input] #:http.request.field{:value input, :shape "IdentityId"})

(clojure.core/defn- ser-token-duration [input] #:http.request.field{:value input, :shape "TokenDuration"})

(clojure.core/defn- ser-cognito-identity-provider-name [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderName"})

(clojure.core/defn- ser-role-mapping-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-role-mapping v) #:http.request.field{:map-info "value", :shape "RoleMapping"})])) input), :shape "RoleMappingMap", :type "map", :max 10})

(clojure.core/defn- ser-cognito-identity-provider-client-id [input] #:http.request.field{:value input, :shape "CognitoIdentityProviderClientId"})

(clojure.core/defn- ser-identity-pool-name [input] #:http.request.field{:value input, :shape "IdentityPoolName"})

(clojure.core/defn- ser-identity-provider-id [input] #:http.request.field{:value input, :shape "IdentityProviderId"})

(clojure.core/defn- ser-role-mapping-type [input] #:http.request.field{:value (clojure.core/get {"Token" "Token", :token "Token", "Rules" "Rules", :rules "Rules"} input), :shape "RoleMappingType"})

(clojure.core/defn- ser-mapping-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-claim-name (:claim input)) #:http.request.field{:name "Claim", :shape "ClaimName"}) (clojure.core/into (ser-mapping-rule-match-type (:match-type input)) #:http.request.field{:name "MatchType", :shape "MappingRuleMatchType"}) (clojure.core/into (ser-claim-value (:value input)) #:http.request.field{:name "Value", :shape "ClaimValue"}) (clojure.core/into (ser-arn-string (:role-arn input)) #:http.request.field{:name "RoleARN", :shape "ARNString"})], :shape "MappingRule", :type "structure"}))

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-mapping-rules-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mapping-rule coll) #:http.request.field{:shape "MappingRule"}))) input), :shape "MappingRulesList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-identity-provider-name [input] #:http.request.field{:value input, :shape "IdentityProviderName"})

(clojure.core/defn- ser-arn-string [input] #:http.request.field{:value input, :shape "ARNString"})

(clojure.core/defn- ser-rules-configuration-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-mapping-rules-list (:rules input)) #:http.request.field{:name "Rules", :shape "MappingRulesList"})], :shape "RulesConfigurationType", :type "structure"}))

(clojure.core/defn- ser-logins-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-identity-provider-token v) #:http.request.field{:map-info "value", :shape "IdentityProviderToken"})])) input), :shape "LoginsMap", :type "map", :max 10})

(clojure.core/defn- ser-identity-providers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-identity-provider-name k) #:http.request.field{:map-info "key", :shape "IdentityProviderName"}) (clojure.core/into (ser-identity-provider-id v) #:http.request.field{:map-info "value", :shape "IdentityProviderId"})])) input), :shape "IdentityProviders", :type "map", :max 10})

(clojure.core/defn- ser-cognito-identity-provider [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CognitoIdentityProvider", :type "structure"} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-name (input :provider-name)) #:http.request.field{:name "ProviderName", :shape "CognitoIdentityProviderName"})) (clojure.core/contains? input :client-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-client-id (input :client-id)) #:http.request.field{:name "ClientId", :shape "CognitoIdentityProviderClientId"})) (clojure.core/contains? input :server-side-token-check) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-token-check (input :server-side-token-check)) #:http.request.field{:name "ServerSideTokenCheck", :shape "CognitoIdentityProviderTokenCheck", :box true}))))

(clojure.core/defn- ser-roles-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-role-type k) #:http.request.field{:map-info "key", :shape "RoleType"}) (clojure.core/into (ser-arn-string v) #:http.request.field{:map-info "value", :shape "ARNString"})])) input), :shape "RolesMap", :type "map", :max 2})

(clojure.core/defn- ser-identity-provider-token [input] #:http.request.field{:value input, :shape "IdentityProviderToken"})

(clojure.core/defn- ser-identity-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-identity-id coll) #:http.request.field{:shape "IdentityId"}))) input), :shape "IdentityIdList", :type "list", :max 60, :min 1})

(clojure.core/defn- ser-developer-user-identifier [input] #:http.request.field{:value input, :shape "DeveloperUserIdentifier"})

(clojure.core/defn- ser-mapping-rule-match-type [input] #:http.request.field{:value (clojure.core/get {"Equals" "Equals", :equals "Equals", "Contains" "Contains", :contains "Contains", "StartsWith" "StartsWith", :starts-with "StartsWith", "NotEqual" "NotEqual", :not-equal "NotEqual"} input), :shape "MappingRuleMatchType"})

(clojure.core/defn- ser-ambiguous-role-resolution-type [input] #:http.request.field{:value (clojure.core/get {"AuthenticatedRole" "AuthenticatedRole", :authenticated-role "AuthenticatedRole", "Deny" "Deny", :deny "Deny"} input), :shape "AmbiguousRoleResolutionType"})

(clojure.core/defn- ser-role-type [input] #:http.request.field{:value input, :shape "RoleType"})

(clojure.core/defn- req-list-identity-pools-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.core/defn- req-delete-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-identity-pool-roles-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-id-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]} (clojure.core/contains? input :account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})) (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}))))

(clojure.core/defn- req-set-identity-pool-roles-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-roles-map (input :roles)) #:http.request.field{:name "Roles", :shape "RolesMap"})]} (clojure.core/contains? input :role-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-mapping-map (input :role-mappings)) #:http.request.field{:name "RoleMappings", :shape "RoleMappingMap"}))))

(clojure.core/defn- req-get-open-id-token-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]} (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}))))

(clojure.core/defn- req-get-credentials-for-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]} (clojure.core/contains? input :logins) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"})) (clojure.core/contains? input :custom-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-string (input :custom-role-arn)) #:http.request.field{:name "CustomRoleArn", :shape "ARNString"}))))

(clojure.core/defn- req-unlink-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"}) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"}) (clojure.core/into (ser-logins-list (input :logins-to-remove)) #:http.request.field{:name "LoginsToRemove", :shape "LoginsList"})]}))

(clojure.core/defn- req-describe-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})]}))

(clojure.core/defn- req-merge-developer-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-developer-user-identifier (input :source-user-identifier)) #:http.request.field{:name "SourceUserIdentifier", :shape "DeveloperUserIdentifier"}) (clojure.core/into (ser-developer-user-identifier (input :destination-user-identifier)) #:http.request.field{:name "DestinationUserIdentifier", :shape "DeveloperUserIdentifier"}) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"}) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-get-open-id-token-for-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-logins-map (input :logins)) #:http.request.field{:name "Logins", :shape "LoginsMap"})]} (clojure.core/contains? input :identity-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})) (clojure.core/contains? input :token-duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token-duration (input :token-duration)) #:http.request.field{:name "TokenDuration", :shape "TokenDuration"}))))

(clojure.core/defn- req-unlink-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"}) (clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"}) (clojure.core/into (ser-developer-user-identifier (input :developer-user-identifier)) #:http.request.field{:name "DeveloperUserIdentifier", :shape "DeveloperUserIdentifier"})]}))

(clojure.core/defn- req-list-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"})) (clojure.core/contains? input :hide-disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hide-disabled (input :hide-disabled)) #:http.request.field{:name "HideDisabled", :shape "HideDisabled"}))))

(clojure.core/defn- req-identity-pool [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"}) (clojure.core/into (ser-identity-pool-name (input :identity-pool-name)) #:http.request.field{:name "IdentityPoolName", :shape "IdentityPoolName"}) (clojure.core/into (ser-identity-pool-unauthenticated (input :allow-unauthenticated-identities)) #:http.request.field{:name "AllowUnauthenticatedIdentities", :shape "IdentityPoolUnauthenticated"})]} (clojure.core/contains? input :supported-login-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-providers (input :supported-login-providers)) #:http.request.field{:name "SupportedLoginProviders", :shape "IdentityProviders"})) (clojure.core/contains? input :developer-provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"})) (clojure.core/contains? input :open-id-connect-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-oidc-provider-list (input :open-id-connect-provider-ar-ns)) #:http.request.field{:name "OpenIdConnectProviderARNs", :shape "OIDCProviderList"})) (clojure.core/contains? input :cognito-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-list (input :cognito-identity-providers)) #:http.request.field{:name "CognitoIdentityProviders", :shape "CognitoIdentityProviderList"})) (clojure.core/contains? input :saml-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-provider-list (input :saml-provider-ar-ns)) #:http.request.field{:name "SamlProviderARNs", :shape "SAMLProviderList"}))))

(clojure.core/defn- req-create-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-name (input :identity-pool-name)) #:http.request.field{:name "IdentityPoolName", :shape "IdentityPoolName"}) (clojure.core/into (ser-identity-pool-unauthenticated (input :allow-unauthenticated-identities)) #:http.request.field{:name "AllowUnauthenticatedIdentities", :shape "IdentityPoolUnauthenticated"})]} (clojure.core/contains? input :supported-login-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-providers (input :supported-login-providers)) #:http.request.field{:name "SupportedLoginProviders", :shape "IdentityProviders"})) (clojure.core/contains? input :developer-provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-provider-name (input :developer-provider-name)) #:http.request.field{:name "DeveloperProviderName", :shape "DeveloperProviderName"})) (clojure.core/contains? input :open-id-connect-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-oidc-provider-list (input :open-id-connect-provider-ar-ns)) #:http.request.field{:name "OpenIdConnectProviderARNs", :shape "OIDCProviderList"})) (clojure.core/contains? input :cognito-identity-providers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-identity-provider-list (input :cognito-identity-providers)) #:http.request.field{:name "CognitoIdentityProviders", :shape "CognitoIdentityProviderList"})) (clojure.core/contains? input :saml-provider-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-saml-provider-list (input :saml-provider-ar-ns)) #:http.request.field{:name "SamlProviderARNs", :shape "SAMLProviderList"}))))

(clojure.core/defn- req-delete-identities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-id-list (input :identity-ids-to-delete)) #:http.request.field{:name "IdentityIdsToDelete", :shape "IdentityIdList"})]}))

(clojure.core/defn- req-describe-identity-pool-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]}))

(clojure.core/defn- req-lookup-developer-identity-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-identity-pool-id (input :identity-pool-id)) #:http.request.field{:name "IdentityPoolId", :shape "IdentityPoolId"})]} (clojure.core/contains? input :identity-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-identity-id (input :identity-id)) #:http.request.field{:name "IdentityId", :shape "IdentityId"})) (clojure.core/contains? input :developer-user-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-developer-user-identifier (input :developer-user-identifier)) #:http.request.field{:name "DeveloperUserIdentifier", :shape "DeveloperUserIdentifier"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-limit (input :max-results)) #:http.request.field{:name "MaxResults", :shape "QueryLimit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-key (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationKey"}))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identity-pools-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identity-pools-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/list-identity-pools-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.list-identity-pools-input/max-results] :opt-un [:portkey.aws.cognito-identity.list-identity-pools-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.lookup-developer-identity-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/lookup-developer-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/developer-user-identifier-list :portkey.aws.cognito-identity.lookup-developer-identity-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/delete-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/cognito-identity-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/cognito-identity-provider))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-open-id-token-response/token (clojure.spec.alpha/and :portkey.aws.cognito-identity/oidc-token))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-open-id-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity.get-open-id-token-response/token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/logins-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/identity-provider-name))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-id-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/pagination-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\S]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.delete-identities-response/unprocessed-identity-ids (clojure.spec.alpha/and :portkey.aws.cognito-identity/unprocessed-identity-id-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/delete-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.delete-identities-response/unprocessed-identity-ids]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/oidc-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.invalid-identity-pool-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/invalid-identity-pool-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.invalid-identity-pool-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-identity-pool-roles-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pool-unauthenticated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity/saml-provider-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.developer-user-already-registered-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/developer-user-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.developer-user-already-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-credentials-for-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/credentials]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-id-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-id-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id] :opt-un [:portkey.aws.cognito-identity/account-id :portkey.aws.cognito-identity.get-id-input/logins]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/claim-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/query-limit (clojure.spec.alpha/int-in 1 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/developer-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w._-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-open-id-token-for-developer-identity-response/token (clojure.spec.alpha/and :portkey.aws.cognito-identity/oidc-token))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity.get-open-id-token-for-developer-identity-response/token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.set-identity-pool-roles-input/roles (clojure.spec.alpha/and :portkey.aws.cognito-identity/roles-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.set-identity-pool-roles-input/role-mappings (clojure.spec.alpha/and :portkey.aws.cognito-identity/role-mapping-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/set-identity-pool-roles-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity.set-identity-pool-roles-input/roles] :opt-un [:portkey.aws.cognito-identity.set-identity-pool-roles-input/role-mappings]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-open-id-token-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-open-id-token-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-id] :opt-un [:portkey.aws.cognito-identity.get-open-id-token-input/logins]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-credentials-for-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-credentials-for-identity-input/custom-role-arn (clojure.spec.alpha/and :portkey.aws.cognito-identity/arn-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-credentials-for-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-id] :opt-un [:portkey.aws.cognito-identity.get-credentials-for-identity-input/logins :portkey.aws.cognito-identity.get-credentials-for-identity-input/custom-role-arn]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/cognito-identity-provider-token-check clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity/hide-disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity.unlink-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.unlink-identity-input/logins-to-remove (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/unlink-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity.unlink-identity-input/logins :portkey.aws.cognito-identity.unlink-identity-input/logins-to-remove] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.role-mapping/type (clojure.spec.alpha/and :portkey.aws.cognito-identity/role-mapping-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.role-mapping/ambiguous-role-resolution (clojure.spec.alpha/and :portkey.aws.cognito-identity/ambiguous-role-resolution-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.role-mapping/rules-configuration (clojure.spec.alpha/and :portkey.aws.cognito-identity/rules-configuration-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/role-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.role-mapping/type] :opt-un [:portkey.aws.cognito-identity.role-mapping/ambiguous-role-resolution :portkey.aws.cognito-identity.role-mapping/rules-configuration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-description/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-description/creation-date (clojure.spec.alpha/and :portkey.aws.cognito-identity/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-description/last-modified-date (clojure.spec.alpha/and :portkey.aws.cognito-identity/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity.identity-description/logins :portkey.aws.cognito-identity.identity-description/creation-date :portkey.aws.cognito-identity.identity-description/last-modified-date]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pool-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 55)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/describe-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identity-pools-response/identity-pools (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pools-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identity-pools-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/list-identity-pools-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.list-identity-pools-response/identity-pools :portkey.aws.cognito-identity.list-identity-pools-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.merge-developer-identities-input/source-user-identifier (clojure.spec.alpha/and :portkey.aws.cognito-identity/developer-user-identifier))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.merge-developer-identities-input/destination-user-identifier (clojure.spec.alpha/and :portkey.aws.cognito-identity/developer-user-identifier))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/merge-developer-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.merge-developer-identities-input/source-user-identifier :portkey.aws.cognito-identity.merge-developer-identities-input/destination-user-identifier :portkey.aws.cognito-identity/developer-provider-name :portkey.aws.cognito-identity/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/claim-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 55)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w-]+:[0-9a-f-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-open-id-token-for-developer-identity-input/logins (clojure.spec.alpha/and :portkey.aws.cognito-identity/logins-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity.get-open-id-token-for-developer-identity-input/logins] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/token-duration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/token-duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cognito-identity/cognito-identity-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w._:/-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/error-code #{"AccessDenied" :internal-server-error "InternalServerError" :access-denied})

(clojure.spec.alpha/def :portkey.aws.cognito-identity/role-mapping-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity/identity-provider-name :portkey.aws.cognito-identity/role-mapping))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/cognito-identity-provider-client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w_]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.credentials/access-key-id (clojure.spec.alpha/and :portkey.aws.cognito-identity/access-key-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.credentials/secret-key (clojure.spec.alpha/and :portkey.aws.cognito-identity/secret-key-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.credentials/session-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/session-token-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.credentials/expiration (clojure.spec.alpha/and :portkey.aws.cognito-identity/date-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/credentials (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.credentials/access-key-id :portkey.aws.cognito-identity.credentials/secret-key :portkey.aws.cognito-identity.credentials/session-token :portkey.aws.cognito-identity.credentials/expiration]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/unlink-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity/developer-provider-name :portkey.aws.cognito-identity/developer-user-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/unprocessed-identity-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/error-code]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pool-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w ]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identities-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identities-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/list-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity.list-identities-input/max-results] :opt-un [:portkey.aws.cognito-identity.list-identities-input/next-token :portkey.aws.cognito-identity/hide-disabled]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-provider-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w.;_/-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/role-mapping-type #{:rules :token "Rules" "Token"})

(clojure.spec.alpha/def :portkey.aws.cognito-identity.mapping-rule/claim (clojure.spec.alpha/and :portkey.aws.cognito-identity/claim-name))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.mapping-rule/match-type (clojure.spec.alpha/and :portkey.aws.cognito-identity/mapping-rule-match-type))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.mapping-rule/value (clojure.spec.alpha/and :portkey.aws.cognito-identity/claim-value))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.mapping-rule/role-arn (clojure.spec.alpha/and :portkey.aws.cognito-identity/arn-string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/mapping-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.mapping-rule/claim :portkey.aws.cognito-identity.mapping-rule/match-type :portkey.aws.cognito-identity.mapping-rule/value :portkey.aws.cognito-identity.mapping-rule/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/secret-key-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 15)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/mapping-rules-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/mapping-rule :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-provider-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-pool/allow-unauthenticated-identities (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pool-unauthenticated))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-pool/supported-login-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-providers))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-pool/open-id-connect-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity/oidc-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-pool/cognito-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity/cognito-identity-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.identity-pool/saml-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity/saml-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pool (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity/identity-pool-name :portkey.aws.cognito-identity.identity-pool/allow-unauthenticated-identities] :opt-un [:portkey.aws.cognito-identity.identity-pool/supported-login-providers :portkey.aws.cognito-identity/developer-provider-name :portkey.aws.cognito-identity.identity-pool/open-id-connect-provider-ar-ns :portkey.aws.cognito-identity.identity-pool/cognito-identity-providers :portkey.aws.cognito-identity.identity-pool/saml-provider-ar-ns]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/unprocessed-identity-id-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/unprocessed-identity-id :max-count 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/arn-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 20 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pools-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/identity-pool-short-description))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.create-identity-pool-input/allow-unauthenticated-identities (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pool-unauthenticated))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.create-identity-pool-input/supported-login-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-providers))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.create-identity-pool-input/open-id-connect-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity/oidc-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.create-identity-pool-input/cognito-identity-providers (clojure.spec.alpha/and :portkey.aws.cognito-identity/cognito-identity-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.create-identity-pool-input/saml-provider-ar-ns (clojure.spec.alpha/and :portkey.aws.cognito-identity/saml-provider-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/create-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-name :portkey.aws.cognito-identity.create-identity-pool-input/allow-unauthenticated-identities] :opt-un [:portkey.aws.cognito-identity.create-identity-pool-input/supported-login-providers :portkey.aws.cognito-identity/developer-provider-name :portkey.aws.cognito-identity.create-identity-pool-input/open-id-connect-provider-ar-ns :portkey.aws.cognito-identity.create-identity-pool-input/cognito-identity-providers :portkey.aws.cognito-identity.create-identity-pool-input/saml-provider-ar-ns]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identities-response/identities (clojure.spec.alpha/and :portkey.aws.cognito-identity/identities-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.list-identities-response/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/list-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity.list-identities-response/identities :portkey.aws.cognito-identity.list-identities-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-pool-short-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity/identity-pool-name]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.external-service-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/external-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.external-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.delete-identities-input/identity-ids-to-delete (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-id-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/delete-identities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.delete-identities-input/identity-ids-to-delete] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.rules-configuration-type/rules (clojure.spec.alpha/and :portkey.aws.cognito-identity/mapping-rules-list))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/rules-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity.rules-configuration-type/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/oidc-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/logins-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity/identity-provider-name :portkey.aws.cognito-identity/identity-provider-token))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/describe-identity-pool-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/session-token-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/developer-user-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/developer-user-identifier))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identities-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/identity-description))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-providers (clojure.spec.alpha/map-of :portkey.aws.cognito-identity/identity-provider-name :portkey.aws.cognito-identity/identity-provider-id))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.cognito-identity-provider/provider-name (clojure.spec.alpha/and :portkey.aws.cognito-identity/cognito-identity-provider-name))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.cognito-identity-provider/client-id (clojure.spec.alpha/and :portkey.aws.cognito-identity/cognito-identity-provider-client-id))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.cognito-identity-provider/server-side-token-check (clojure.spec.alpha/and :portkey.aws.cognito-identity/cognito-identity-provider-token-check))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/cognito-identity-provider (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.cognito-identity-provider/provider-name :portkey.aws.cognito-identity.cognito-identity-provider/client-id :portkey.aws.cognito-identity.cognito-identity-provider/server-side-token-check]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/roles-map (clojure.spec.alpha/map-of :portkey.aws.cognito-identity/role-type :portkey.aws.cognito-identity/arn-string))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-provider-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.cognito-identity/string))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/identity-id-list (clojure.spec.alpha/coll-of :portkey.aws.cognito-identity/identity-id :min-count 1 :max-count 60))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/developer-user-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/access-key-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/mapping-rule-match-type #{:starts-with "NotEqual" "StartsWith" :contains "Contains" :equals :not-equal "Equals"})

(clojure.spec.alpha/def :portkey.aws.cognito-identity/merge-developer-identities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-id]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.lookup-developer-identity-input/max-results (clojure.spec.alpha/and :portkey.aws.cognito-identity/query-limit))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.lookup-developer-identity-input/next-token (clojure.spec.alpha/and :portkey.aws.cognito-identity/pagination-key))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/lookup-developer-identity-input (clojure.spec.alpha/keys :req-un [:portkey.aws.cognito-identity/identity-pool-id] :opt-un [:portkey.aws.cognito-identity/identity-id :portkey.aws.cognito-identity/developer-user-identifier :portkey.aws.cognito-identity.lookup-developer-identity-input/max-results :portkey.aws.cognito-identity.lookup-developer-identity-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.cognito-identity/ambiguous-role-resolution-type #{:authenticated-role "AuthenticatedRole" "Deny" :deny})

(clojure.spec.alpha/def :portkey.aws.cognito-identity/role-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(un)?authenticated" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-identity-pool-roles-response/roles (clojure.spec.alpha/and :portkey.aws.cognito-identity/roles-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity.get-identity-pool-roles-response/role-mappings (clojure.spec.alpha/and :portkey.aws.cognito-identity/role-mapping-map))
(clojure.spec.alpha/def :portkey.aws.cognito-identity/get-identity-pool-roles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cognito-identity/identity-pool-id :portkey.aws.cognito-identity.get-identity-pool-roles-response/roles :portkey.aws.cognito-identity.get-identity-pool-roles-response/role-mappings]))

(clojure.core/defn get-credentials-for-identity ([get-credentials-for-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-credentials-for-identity-input get-credentials-for-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/get-credentials-for-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/get-credentials-for-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCredentialsForIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InvalidIdentityPoolConfigurationException" :portkey.aws.cognito-identity/invalid-identity-pool-configuration-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity/external-service-exception}})))))
(clojure.spec.alpha/fdef get-credentials-for-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/get-credentials-for-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/get-credentials-for-identity-response))

(clojure.core/defn delete-identities ([delete-identities-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-identities-input delete-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/delete-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/delete-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIdentities", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/delete-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/delete-identities-response))

(clojure.core/defn describe-identity ([describe-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-identity-input describe-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/identity-description, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/describe-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/describe-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-description))

(clojure.core/defn get-id ([get-id-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-id-input get-id-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/get-id-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/get-id-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetId", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "LimitExceededException" :portkey.aws.cognito-identity/limit-exceeded-exception, "ExternalServiceException" :portkey.aws.cognito-identity/external-service-exception}})))))
(clojure.spec.alpha/fdef get-id :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/get-id-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/get-id-response))

(clojure.core/defn delete-identity-pool ([delete-identity-pool-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-identity-pool-input delete-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/delete-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteIdentityPool", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/delete-identity-pool-input) :ret clojure.core/true?)

(clojure.core/defn list-identity-pools ([list-identity-pools-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-identity-pools-input list-identity-pools-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/list-identity-pools-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/list-identity-pools-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIdentityPools", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-identity-pools :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/list-identity-pools-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/list-identity-pools-response))

(clojure.core/defn get-open-id-token-for-developer-identity ([get-open-id-token-for-developer-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-open-id-token-for-developer-identity-input get-open-id-token-for-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOpenIdTokenForDeveloperIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "DeveloperUserAlreadyRegisteredException" :portkey.aws.cognito-identity/developer-user-already-registered-exception}})))))
(clojure.spec.alpha/fdef get-open-id-token-for-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/get-open-id-token-for-developer-identity-response))

(clojure.core/defn create-identity-pool ([create-identity-pool-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-identity-pool-input create-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/create-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateIdentityPool", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "LimitExceededException" :portkey.aws.cognito-identity/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/create-identity-pool-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pool))

(clojure.core/defn lookup-developer-identity ([lookup-developer-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-lookup-developer-identity-input lookup-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/lookup-developer-identity-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/lookup-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "LookupDeveloperIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef lookup-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/lookup-developer-identity-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/lookup-developer-identity-response))

(clojure.core/defn set-identity-pool-roles ([set-identity-pool-roles-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-identity-pool-roles-input set-identity-pool-roles-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/set-identity-pool-roles-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetIdentityPoolRoles", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "ConcurrentModificationException" :portkey.aws.cognito-identity/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef set-identity-pool-roles :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/set-identity-pool-roles-input) :ret clojure.core/true?)

(clojure.core/defn list-identities ([list-identities-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-identities-input list-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/list-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/list-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIdentities", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/list-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/list-identities-response))

(clojure.core/defn get-identity-pool-roles ([get-identity-pool-roles-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-identity-pool-roles-input get-identity-pool-roles-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/get-identity-pool-roles-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/get-identity-pool-roles-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetIdentityPoolRoles", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-identity-pool-roles :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/get-identity-pool-roles-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/get-identity-pool-roles-response))

(clojure.core/defn merge-developer-identities ([merge-developer-identities-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-merge-developer-identities-input merge-developer-identities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/merge-developer-identities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/merge-developer-identities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MergeDeveloperIdentities", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef merge-developer-identities :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/merge-developer-identities-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/merge-developer-identities-response))

(clojure.core/defn get-open-id-token ([get-open-id-token-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-open-id-token-input get-open-id-token-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/get-open-id-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/get-open-id-token-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOpenIdToken", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity/external-service-exception}})))))
(clojure.spec.alpha/fdef get-open-id-token :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/get-open-id-token-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/get-open-id-token-response))

(clojure.core/defn unlink-identity ([unlink-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-unlink-identity-input unlink-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/unlink-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnlinkIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "ExternalServiceException" :portkey.aws.cognito-identity/external-service-exception}})))))
(clojure.spec.alpha/fdef unlink-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/unlink-identity-input) :ret clojure.core/true?)

(clojure.core/defn update-identity-pool ([identity-poolinput] (clojure.core/let [request-function-result__28521__auto__ (req-identity-pool identity-poolinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/identity-pool, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateIdentityPool", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception, "ConcurrentModificationException" :portkey.aws.cognito-identity/concurrent-modification-exception, "LimitExceededException" :portkey.aws.cognito-identity/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/identity-pool) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pool))

(clojure.core/defn unlink-developer-identity ([unlink-developer-identity-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-unlink-developer-identity-input unlink-developer-identity-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/unlink-developer-identity-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnlinkDeveloperIdentity", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "ResourceConflictException" :portkey.aws.cognito-identity/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef unlink-developer-identity :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/unlink-developer-identity-input) :ret clojure.core/true?)

(clojure.core/defn describe-identity-pool ([describe-identity-pool-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-identity-pool-input describe-identity-pool-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cognito-identity/endpoints, :http.request.configuration/target-prefix "AWSCognitoIdentityService", :http.request.spec/output-spec :portkey.aws.cognito-identity/identity-pool, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-06-30", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cognito-identity/describe-identity-pool-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeIdentityPool", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.cognito-identity/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.cognito-identity/resource-not-found-exception, "NotAuthorizedException" :portkey.aws.cognito-identity/not-authorized-exception, "TooManyRequestsException" :portkey.aws.cognito-identity/too-many-requests-exception, "InternalErrorException" :portkey.aws.cognito-identity/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-identity-pool :args (clojure.spec.alpha/tuple :portkey.aws.cognito-identity/describe-identity-pool-input) :ret (clojure.spec.alpha/and :portkey.aws.cognito-identity/identity-pool))
