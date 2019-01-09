(ns portkey.aws.fms.-2018-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "fms", :region "eu-west-1"},
    :ssl-common-name "fms.eu-west-1.amazonaws.com",
    :endpoint "https://fms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "fms", :region "us-west-2"},
    :ssl-common-name "fms.us-west-2.amazonaws.com",
    :endpoint "https://fms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "fms", :region "us-east-1"},
    :ssl-common-name "fms.us-east-1.amazonaws.com",
    :endpoint "https://fms.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-pagination-max-results)

(clojure.core/declare ser-resource-tags)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-customer-policy-scope-map)

(clojure.core/declare ser-customer-policy-scope-id-list)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-customer-policy-scope-id-type)

(clojure.core/declare ser-policy-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-resource-tag)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-customer-policy-scope-id)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-security-service-type)

(clojure.core/declare ser-policy)

(clojure.core/declare ser-managed-service-data)

(clojure.core/declare ser-security-service-policy-data)

(clojure.core/declare ser-policy-update-token)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-pagination-max-results [input] #:http.request.field{:value input, :shape "PaginationMaxResults"})

(clojure.core/defn- ser-resource-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-tag coll) #:http.request.field{:shape "ResourceTag"}))) input), :shape "ResourceTags", :type "list", :max 8, :min 0})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-customer-policy-scope-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-customer-policy-scope-id-type k) #:http.request.field{:map-info "key", :shape "CustomerPolicyScopeIdType"}) (clojure.core/into (ser-customer-policy-scope-id-list v) #:http.request.field{:map-info "value", :shape "CustomerPolicyScopeIdList"})])) input), :shape "CustomerPolicyScopeMap", :type "map"})

(clojure.core/defn- ser-customer-policy-scope-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-customer-policy-scope-id coll) #:http.request.field{:shape "CustomerPolicyScopeId"}))) input), :shape "CustomerPolicyScopeIdList", :type "list"})

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AWSAccountId"})

(clojure.core/defn- ser-customer-policy-scope-id-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "CustomerPolicyScopeIdType"})

(clojure.core/defn- ser-policy-id [input] #:http.request.field{:value input, :shape "PolicyId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-resource-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "ResourceTag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value input, :shape "ResourceType"})

(clojure.core/defn- ser-customer-policy-scope-id [input] #:http.request.field{:value input, :shape "CustomerPolicyScopeId"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-security-service-type [input] #:http.request.field{:value (clojure.core/get {"WAF" "WAF", :waf "WAF"} input), :shape "SecurityServiceType"})

(clojure.core/defn- ser-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-name (:policy-name input)) #:http.request.field{:name "PolicyName", :shape "ResourceName"}) (clojure.core/into (ser-security-service-policy-data (:security-service-policy-data input)) #:http.request.field{:name "SecurityServicePolicyData", :shape "SecurityServicePolicyData"}) (clojure.core/into (ser-resource-type (:resource-type input)) #:http.request.field{:name "ResourceType", :shape "ResourceType"}) (clojure.core/into (ser-boolean (:exclude-resource-tags input)) #:http.request.field{:name "ExcludeResourceTags", :shape "Boolean"}) (clojure.core/into (ser-boolean (:remediation-enabled input)) #:http.request.field{:name "RemediationEnabled", :shape "Boolean"})], :shape "Policy", :type "structure"} (clojure.core/contains? input :resource-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-tags (input :resource-tags)) #:http.request.field{:name "ResourceTags", :shape "ResourceTags"})) (clojure.core/contains? input :include-map) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-policy-scope-map (input :include-map)) #:http.request.field{:name "IncludeMap", :shape "CustomerPolicyScopeMap"})) (clojure.core/contains? input :policy-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})) (clojure.core/contains? input :exclude-map) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-policy-scope-map (input :exclude-map)) #:http.request.field{:name "ExcludeMap", :shape "CustomerPolicyScopeMap"})) (clojure.core/contains? input :policy-update-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-update-token (input :policy-update-token)) #:http.request.field{:name "PolicyUpdateToken", :shape "PolicyUpdateToken"}))))

(clojure.core/defn- ser-managed-service-data [input] #:http.request.field{:value input, :shape "ManagedServiceData"})

(clojure.core/defn- ser-security-service-policy-data [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-security-service-type (:type input)) #:http.request.field{:name "Type", :shape "SecurityServiceType"})], :shape "SecurityServicePolicyData", :type "structure"} (clojure.core/contains? input :managed-service-data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-managed-service-data (input :managed-service-data)) #:http.request.field{:name "ManagedServiceData", :shape "ManagedServiceData"}))))

(clojure.core/defn- ser-policy-update-token [input] #:http.request.field{:value input, :shape "PolicyUpdateToken"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-disassociate-admin-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-member-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-put-notification-channel-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :sns-topic-arn)) #:http.request.field{:name "SnsTopicArn", :shape "ResourceArn"}) (clojure.core/into (ser-resource-arn (input :sns-role-name)) #:http.request.field{:name "SnsRoleName", :shape "ResourceArn"})]}))

(clojure.core/defn- req-list-compliance-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-get-admin-account-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-notification-channel-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-compliance-detail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"}) (clojure.core/into (ser-aws-account-id (input :member-account)) #:http.request.field{:name "MemberAccount", :shape "AWSAccountId"})]}))

(clojure.core/defn- req-get-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]}))

(clojure.core/defn- req-put-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy (input :policy)) #:http.request.field{:name "Policy", :shape "Policy"})]}))

(clojure.core/defn- req-delete-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]}))

(clojure.core/defn- req-list-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PaginationMaxResults"}))))

(clojure.core/defn- req-get-notification-channel-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-associate-admin-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-account-id (input :admin-account)) #:http.request.field{:name "AdminAccount", :shape "AWSAccountId"})]}))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/disassociate-admin-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-detail/policy-owner (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-detail/member-account (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-detail/violators (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/compliance-violators))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-detail/evaluation-limit-exceeded (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-detail/expired-at (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-compliance-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.policy-compliance-detail/policy-owner :portkey.aws.fms.-2018-01-01/policy-id :portkey.aws.fms.-2018-01-01.policy-compliance-detail/member-account :portkey.aws.fms.-2018-01-01.policy-compliance-detail/violators :portkey.aws.fms.-2018-01-01.policy-compliance-detail/evaluation-limit-exceeded :portkey.aws.fms.-2018-01-01.policy-compliance-detail/expired-at :portkey.aws.fms.-2018-01-01/issue-info-map]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-member-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-member-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-member-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.list-member-accounts-request/next-token :portkey.aws.fms.-2018-01-01.list-member-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/dependent-service-name #{"AWSWAF" "AWSCONFIG" :awswaf :awsconfig})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-compliance-status-response/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-compliance-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/policy-compliance-status-list :portkey.aws.fms.-2018-01-01.list-compliance-status-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.put-notification-channel-request/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.put-notification-channel-request/sns-role-name (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/put-notification-channel-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01.put-notification-channel-request/sns-topic-arn :portkey.aws.fms.-2018-01-01.put-notification-channel-request/sns-role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-member-accounts-response/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-member-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/member-accounts :portkey.aws.fms.-2018-01-01.list-member-accounts-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-compliance-status-type #{"NON_COMPLIANT" "COMPLIANT" :compliant :non-compliant})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/compliance-violators (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/compliance-violator))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/pagination-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-compliance-status-request/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-compliance-status-request/max-results (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-compliance-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01/policy-id] :opt-un [:portkey.aws.fms.-2018-01-01.list-compliance-status-request/next-token :portkey.aws.fms.-2018-01-01.list-compliance-status-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-admin-account-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-summary/policy-arn (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-summary/policy-name (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-summary/remediation-enabled (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.policy-summary/policy-arn :portkey.aws.fms.-2018-01-01/policy-id :portkey.aws.fms.-2018-01-01.policy-summary/policy-name :portkey.aws.fms.-2018-01-01/resource-type :portkey.aws.fms.-2018-01-01/security-service-type :portkey.aws.fms.-2018-01-01.policy-summary/remediation-enabled]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/delete-notification-channel-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-tags (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/resource-tag :min-count 0 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/violation-reason #{"RESOURCE_INCORRECT_WEB_ACL" "WEB_ACL_MISSING_RULE_GROUP" "RESOURCE_MISSING_WEB_ACL" :web-acl-missing-rule-group :resource-incorrect-web-acl :resource-missing-web-acl})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/customer-policy-scope-map (clojure.spec.alpha/map-of :portkey.aws.fms.-2018-01-01/customer-policy-scope-id-type :portkey.aws.fms.-2018-01-01/customer-policy-scope-id-list))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-compliance-detail-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/policy-compliance-detail]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/customer-policy-scope-id-list (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/customer-policy-scope-id))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.invalid-type-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/invalid-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.invalid-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/evaluation-results (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/evaluation-result))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.evaluation-result/compliance-status (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/policy-compliance-status-type))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.evaluation-result/violator-count (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-count))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.evaluation-result/evaluation-limit-exceeded (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/evaluation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.evaluation-result/compliance-status :portkey.aws.fms.-2018-01-01.evaluation-result/violator-count :portkey.aws.fms.-2018-01-01.evaluation-result/evaluation-limit-exceeded]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/issue-info-map (clojure.spec.alpha/map-of :portkey.aws.fms.-2018-01-01/dependent-service-name :portkey.aws.fms.-2018-01-01/detailed-info))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-compliance-detail-request/member-account (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-compliance-detail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01/policy-id :portkey.aws.fms.-2018-01-01.get-compliance-detail-request/member-account] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/customer-policy-scope-id-type #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 36 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-status/policy-owner (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-status/policy-name (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-status/member-account (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy-compliance-status/last-updated (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-compliance-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.policy-compliance-status/policy-owner :portkey.aws.fms.-2018-01-01/policy-id :portkey.aws.fms.-2018-01-01.policy-compliance-status/policy-name :portkey.aws.fms.-2018-01-01.policy-compliance-status/member-account :portkey.aws.fms.-2018-01-01/evaluation-results :portkey.aws.fms.-2018-01-01.policy-compliance-status/last-updated :portkey.aws.fms.-2018-01-01/issue-info-map]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/compliance-violator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/resource-id :portkey.aws.fms.-2018-01-01/violation-reason :portkey.aws.fms.-2018-01-01/resource-type]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/put-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01/policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-notification-channel-response/sns-topic-arn (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-notification-channel-response/sns-role-name (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-notification-channel-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.get-notification-channel-response/sns-topic-arn :portkey.aws.fms.-2018-01-01.get-notification-channel-response/sns-role-name]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/member-accounts (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/aws-account-id))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/policy :portkey.aws.fms.-2018-01-01.get-policy-response/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-compliance-status-list (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/policy-compliance-status))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-summary-list (clojure.spec.alpha/coll-of :portkey.aws.fms.-2018-01-01/policy-summary))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.resource-tag/key (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.resource-tag/value (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-tag (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01.resource-tag/key] :opt-un [:portkey.aws.fms.-2018-01-01.resource-tag/value]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-policies-request/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-policies-request/max-results (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-max-results))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.list-policies-request/next-token :portkey.aws.fms.-2018-01-01.list-policies-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-admin-account-response/admin-account (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.get-admin-account-response/role-status (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/account-role-status))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-admin-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.get-admin-account-response/admin-account :portkey.aws.fms.-2018-01-01.get-admin-account-response/role-status]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/customer-policy-scope-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.put-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/put-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01/policy :portkey.aws.fms.-2018-01-01.put-policy-response/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/security-service-type #{:waf "WAF"})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy/policy-name (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/resource-name))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy/remediation-enabled (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy/include-map (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/customer-policy-scope-map))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy/exclude-map (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/customer-policy-scope-map))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.policy/exclude-resource-tags (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01.policy/policy-name :portkey.aws.fms.-2018-01-01/security-service-policy-data :portkey.aws.fms.-2018-01-01/resource-type :portkey.aws.fms.-2018-01-01.policy/exclude-resource-tags :portkey.aws.fms.-2018-01-01.policy/remediation-enabled] :opt-un [:portkey.aws.fms.-2018-01-01/resource-tags :portkey.aws.fms.-2018-01-01.policy/include-map :portkey.aws.fms.-2018-01-01/policy-id :portkey.aws.fms.-2018-01-01.policy/exclude-map :portkey.aws.fms.-2018-01-01/policy-update-token]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/get-notification-channel-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-policies-response/policy-list (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/policy-summary-list))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.list-policies-response/next-token (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.fms.-2018-01-01.list-policies-response/policy-list :portkey.aws.fms.-2018-01-01.list-policies-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/managed-service-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/detailed-info (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/account-role-status #{:deleted :ready :creating :pending-deletion "READY" :deleting "DELETING" "CREATING" "PENDING_DELETION" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.security-service-policy-data/type (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/security-service-type))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/security-service-policy-data (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01.security-service-policy-data/type] :opt-un [:portkey.aws.fms.-2018-01-01/managed-service-data]))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/policy-update-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01.associate-admin-account-request/admin-account (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/associate-admin-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.fms.-2018-01-01.associate-admin-account-request/admin-account] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.fms.-2018-01-01/boolean clojure.core/boolean?)

(clojure.core/defn list-member-accounts ([] (list-member-accounts {})) ([list-member-accounts-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-member-accounts-request list-member-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/list-member-accounts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/list-member-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMemberAccounts", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-member-accounts :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/list-member-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/list-member-accounts-response))

(clojure.core/defn associate-admin-account ([associate-admin-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-admin-account-request associate-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/associate-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateAdminAccount", :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InvalidInputException" :portkey.aws.fms.-2018-01-01/invalid-input-exception, "ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef associate-admin-account :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/associate-admin-account-request) :ret clojure.core/true?)

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/list-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicies", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "LimitExceededException" :portkey.aws.fms.-2018-01-01/limit-exceeded-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/list-policies-response))

(clojure.core/defn put-notification-channel ([put-notification-channel-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-notification-channel-request put-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/put-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutNotificationChannel", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef put-notification-channel :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/put-notification-channel-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-admin-account ([] (disassociate-admin-account {})) ([disassociate-admin-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-admin-account-request disassociate-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/disassociate-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateAdminAccount", :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-admin-account :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/disassociate-admin-account-request) :ret clojure.core/true?)

(clojure.core/defn get-compliance-detail ([get-compliance-detail-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-compliance-detail-request get-compliance-detail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/get-compliance-detail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/get-compliance-detail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetComplianceDetail", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-compliance-detail :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/get-compliance-detail-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/get-compliance-detail-response))

(clojure.core/defn get-notification-channel ([] (get-notification-channel {})) ([get-notification-channel-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-notification-channel-request get-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/get-notification-channel-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/get-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetNotificationChannel", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-notification-channel :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/get-notification-channel-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/get-notification-channel-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/get-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception, "InvalidTypeException" :portkey.aws.fms.-2018-01-01/invalid-type-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/get-policy-response))

(clojure.core/defn delete-notification-channel ([] (delete-notification-channel {})) ([delete-notification-channel-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-notification-channel-request delete-notification-channel-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/delete-notification-channel-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotificationChannel", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-notification-channel :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/delete-notification-channel-request) :ret clojure.core/true?)

(clojure.core/defn put-policy ([put-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-policy-request put-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/put-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/put-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutPolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InvalidInputException" :portkey.aws.fms.-2018-01-01/invalid-input-exception, "LimitExceededException" :portkey.aws.fms.-2018-01-01/limit-exceeded-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception, "InvalidTypeException" :portkey.aws.fms.-2018-01-01/invalid-type-exception}})))))
(clojure.spec.alpha/fdef put-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/put-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/put-policy-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/delete-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicy", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-compliance-status ([list-compliance-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-compliance-status-request list-compliance-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/list-compliance-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/list-compliance-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListComplianceStatus", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef list-compliance-status :args (clojure.spec.alpha/tuple :portkey.aws.fms.-2018-01-01/list-compliance-status-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/list-compliance-status-response))

(clojure.core/defn get-admin-account ([] (get-admin-account {})) ([get-admin-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-admin-account-request get-admin-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.fms.-2018-01-01/endpoints, :http.request.spec/output-spec :portkey.aws.fms.-2018-01-01/get-admin-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-01", :http.request.configuration/service-id "FMS", :http.request.spec/input-spec :portkey.aws.fms.-2018-01-01/get-admin-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAdminAccount", :http.request.spec/error-spec {"InvalidOperationException" :portkey.aws.fms.-2018-01-01/invalid-operation-exception, "ResourceNotFoundException" :portkey.aws.fms.-2018-01-01/resource-not-found-exception, "InternalErrorException" :portkey.aws.fms.-2018-01-01/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-admin-account :args (clojure.spec.alpha/? :portkey.aws.fms.-2018-01-01/get-admin-account-request) :ret (clojure.spec.alpha/and :portkey.aws.fms.-2018-01-01/get-admin-account-response))
