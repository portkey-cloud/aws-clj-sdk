(ns portkey.aws.organizations.-2016-11-28 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "organizations", :region "us-east-1"},
    :ssl-common-name "organizations.us-east-1.amazonaws.com",
    :endpoint "https://organizations.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-child-id)

(clojure.core/declare ser-iam-user-access-to-billing)

(clojure.core/declare ser-handshake-filter)

(clojure.core/declare ser-organization-feature-set)

(clojure.core/declare ser-email)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-policy-target-id)

(clojure.core/declare ser-role-name)

(clojure.core/declare ser-handshake-notes)

(clojure.core/declare ser-parent-id)

(clojure.core/declare ser-policy-description)

(clojure.core/declare ser-policy-content)

(clojure.core/declare ser-create-account-request-id)

(clojure.core/declare ser-service-principal)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-handshake-party-type)

(clojure.core/declare ser-policy-id)

(clojure.core/declare ser-root-id)

(clojure.core/declare ser-handshake-id)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-organizational-unit-name)

(clojure.core/declare ser-account-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-action-type)

(clojure.core/declare ser-create-account-state)

(clojure.core/declare ser-organizational-unit-id)

(clojure.core/declare ser-policy-type)

(clojure.core/declare ser-handshake-party-id)

(clojure.core/declare ser-handshake-party)

(clojure.core/declare ser-child-type)

(clojure.core/declare ser-create-account-states)

(clojure.core/defn- ser-child-id [input] #:http.request.field{:value input, :shape "ChildId"})

(clojure.core/defn- ser-iam-user-access-to-billing [input] #:http.request.field{:value (clojure.core/get {"ALLOW" "ALLOW", :allow "ALLOW", "DENY" "DENY", :deny "DENY"} input), :shape "IAMUserAccessToBilling"})

(clojure.core/defn- ser-handshake-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HandshakeFilter", :type "structure"} (clojure.core/contains? input :action-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-type (input :action-type)) #:http.request.field{:name "ActionType", :shape "ActionType"})) (clojure.core/contains? input :parent-handshake-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handshake-id (input :parent-handshake-id)) #:http.request.field{:name "ParentHandshakeId", :shape "HandshakeId"}))))

(clojure.core/defn- ser-organization-feature-set [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL", "CONSOLIDATED_BILLING" "CONSOLIDATED_BILLING", :consolidated-billing "CONSOLIDATED_BILLING"} input), :shape "OrganizationFeatureSet"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-policy-target-id [input] #:http.request.field{:value input, :shape "PolicyTargetId"})

(clojure.core/defn- ser-role-name [input] #:http.request.field{:value input, :shape "RoleName"})

(clojure.core/defn- ser-handshake-notes [input] #:http.request.field{:value input, :shape "HandshakeNotes"})

(clojure.core/defn- ser-parent-id [input] #:http.request.field{:value input, :shape "ParentId"})

(clojure.core/defn- ser-policy-description [input] #:http.request.field{:value input, :shape "PolicyDescription"})

(clojure.core/defn- ser-policy-content [input] #:http.request.field{:value input, :shape "PolicyContent"})

(clojure.core/defn- ser-create-account-request-id [input] #:http.request.field{:value input, :shape "CreateAccountRequestId"})

(clojure.core/defn- ser-service-principal [input] #:http.request.field{:value input, :shape "ServicePrincipal"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-handshake-party-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT", "ORGANIZATION" "ORGANIZATION", :organization "ORGANIZATION", "EMAIL" "EMAIL", :email "EMAIL"} input), :shape "HandshakePartyType"})

(clojure.core/defn- ser-policy-id [input] #:http.request.field{:value input, :shape "PolicyId"})

(clojure.core/defn- ser-root-id [input] #:http.request.field{:value input, :shape "RootId"})

(clojure.core/defn- ser-handshake-id [input] #:http.request.field{:value input, :shape "HandshakeId"})

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-organizational-unit-name [input] #:http.request.field{:value input, :shape "OrganizationalUnitName"})

(clojure.core/defn- ser-account-name [input] #:http.request.field{:value input, :shape "AccountName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-action-type [input] #:http.request.field{:value (clojure.core/get {"INVITE" "INVITE", :invite "INVITE", "ENABLE_ALL_FEATURES" "ENABLE_ALL_FEATURES", :enable-all-features "ENABLE_ALL_FEATURES", "APPROVE_ALL_FEATURES" "APPROVE_ALL_FEATURES", :approve-all-features "APPROVE_ALL_FEATURES", "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE", :add-organizations-service-linked-role "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE"} input), :shape "ActionType"})

(clojure.core/defn- ser-create-account-state [input] #:http.request.field{:value (clojure.core/get {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "SUCCEEDED" "SUCCEEDED", :succeeded "SUCCEEDED", "FAILED" "FAILED", :failed "FAILED"} input), :shape "CreateAccountState"})

(clojure.core/defn- ser-organizational-unit-id [input] #:http.request.field{:value input, :shape "OrganizationalUnitId"})

(clojure.core/defn- ser-policy-type [input] #:http.request.field{:value (clojure.core/get {"SERVICE_CONTROL_POLICY" "SERVICE_CONTROL_POLICY", :service-control-policy "SERVICE_CONTROL_POLICY"} input), :shape "PolicyType"})

(clojure.core/defn- ser-handshake-party-id [input] #:http.request.field{:value input, :shape "HandshakePartyId"})

(clojure.core/defn- ser-handshake-party [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-handshake-party-id (:id input)) #:http.request.field{:name "Id", :shape "HandshakePartyId"}) (clojure.core/into (ser-handshake-party-type (:type input)) #:http.request.field{:name "Type", :shape "HandshakePartyType"})], :shape "HandshakeParty", :type "structure"}))

(clojure.core/defn- ser-child-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT", "ORGANIZATIONAL_UNIT" "ORGANIZATIONAL_UNIT", :organizational-unit "ORGANIZATIONAL_UNIT"} input), :shape "ChildType"})

(clojure.core/defn- ser-create-account-states [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-create-account-state coll) #:http.request.field{:shape "CreateAccountState"}))) input), :shape "CreateAccountStates", :type "list"})

(clojure.core/defn- req-cancel-handshake-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-handshake-id (input :handshake-id)) #:http.request.field{:name "HandshakeId", :shape "HandshakeId"})]}))

(clojure.core/defn- req-list-parents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-child-id (input :child-id)) #:http.request.field{:name "ChildId", :shape "ChildId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-children-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parent-id (input :parent-id)) #:http.request.field{:name "ParentId", :shape "ParentId"}) (clojure.core/into (ser-child-type (input :child-type)) #:http.request.field{:name "ChildType", :shape "ChildType"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-handshake-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-handshake-id (input :handshake-id)) #:http.request.field{:name "HandshakeId", :shape "HandshakeId"})]}))

(clojure.core/defn- req-list-accounts-for-parent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parent-id (input :parent-id)) #:http.request.field{:name "ParentId", :shape "ParentId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-attach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"}) (clojure.core/into (ser-policy-target-id (input :target-id)) #:http.request.field{:name "TargetId", :shape "PolicyTargetId"})]}))

(clojure.core/defn- req-list-roots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-remove-account-from-organization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})]}))

(clojure.core/defn- req-list-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-organizational-unit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organizational-unit-id (input :organizational-unit-id)) #:http.request.field{:name "OrganizationalUnitId", :shape "OrganizationalUnitId"})]}))

(clojure.core/defn- req-decline-handshake-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-handshake-id (input :handshake-id)) #:http.request.field{:name "HandshakeId", :shape "HandshakeId"})]}))

(clojure.core/defn- req-list-create-account-status-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :states) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-account-states (input :states)) #:http.request.field{:name "States", :shape "CreateAccountStates"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-content (input :content)) #:http.request.field{:name "Content", :shape "PolicyContent"}) (clojure.core/into (ser-policy-description (input :description)) #:http.request.field{:name "Description", :shape "PolicyDescription"}) (clojure.core/into (ser-policy-name (input :name)) #:http.request.field{:name "Name", :shape "PolicyName"}) (clojure.core/into (ser-policy-type (input :type)) #:http.request.field{:name "Type", :shape "PolicyType"})]}))

(clojure.core/defn- req-list-aws-service-access-for-organization-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-targets-for-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-enable-all-features-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"})]}))

(clojure.core/defn- req-disable-policy-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-root-id (input :root-id)) #:http.request.field{:name "RootId", :shape "RootId"}) (clojure.core/into (ser-policy-type (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "PolicyType"})]}))

(clojure.core/defn- req-delete-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]}))

(clojure.core/defn- req-update-organizational-unit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organizational-unit-id (input :organizational-unit-id)) #:http.request.field{:name "OrganizationalUnitId", :shape "OrganizationalUnitId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-name (input :name)) #:http.request.field{:name "Name", :shape "OrganizationalUnitName"}))))

(clojure.core/defn- req-create-organization-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :feature-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-feature-set (input :feature-set)) #:http.request.field{:name "FeatureSet", :shape "OrganizationFeatureSet"}))))

(clojure.core/defn- req-list-policies-for-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-target-id (input :target-id)) #:http.request.field{:name "TargetId", :shape "PolicyTargetId"}) (clojure.core/into (ser-policy-type (input :filter)) #:http.request.field{:name "Filter", :shape "PolicyType"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-type (input :filter)) #:http.request.field{:name "Filter", :shape "PolicyType"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-name (input :name)) #:http.request.field{:name "Name", :shape "PolicyName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-description (input :description)) #:http.request.field{:name "Description", :shape "PolicyDescription"})) (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-content (input :content)) #:http.request.field{:name "Content", :shape "PolicyContent"}))))

(clojure.core/defn- req-accept-handshake-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-handshake-id (input :handshake-id)) #:http.request.field{:name "HandshakeId", :shape "HandshakeId"})]}))

(clojure.core/defn- req-invite-account-to-organization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-handshake-party (input :target)) #:http.request.field{:name "Target", :shape "HandshakeParty"})]} (clojure.core/contains? input :notes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handshake-notes (input :notes)) #:http.request.field{:name "Notes", :shape "HandshakeNotes"}))))

(clojure.core/defn- req-list-handshakes-for-account-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handshake-filter (input :filter)) #:http.request.field{:name "Filter", :shape "HandshakeFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-create-account-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-create-account-request-id (input :create-account-request-id)) #:http.request.field{:name "CreateAccountRequestId", :shape "CreateAccountRequestId"})]}))

(clojure.core/defn- req-enable-aws-service-access-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-principal (input :service-principal)) #:http.request.field{:name "ServicePrincipal", :shape "ServicePrincipal"})]}))

(clojure.core/defn- req-delete-organizational-unit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organizational-unit-id (input :organizational-unit-id)) #:http.request.field{:name "OrganizationalUnitId", :shape "OrganizationalUnitId"})]}))

(clojure.core/defn- req-detach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"}) (clojure.core/into (ser-policy-target-id (input :target-id)) #:http.request.field{:name "TargetId", :shape "PolicyTargetId"})]}))

(clojure.core/defn- req-create-organizational-unit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parent-id (input :parent-id)) #:http.request.field{:name "ParentId", :shape "ParentId"}) (clojure.core/into (ser-organizational-unit-name (input :name)) #:http.request.field{:name "Name", :shape "OrganizationalUnitName"})]}))

(clojure.core/defn- req-enable-policy-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-root-id (input :root-id)) #:http.request.field{:name "RootId", :shape "RootId"}) (clojure.core/into (ser-policy-type (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "PolicyType"})]}))

(clojure.core/defn- req-disable-aws-service-access-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-principal (input :service-principal)) #:http.request.field{:name "ServicePrincipal", :shape "ServicePrincipal"})]}))

(clojure.core/defn- req-move-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-id (input :account-id)) #:http.request.field{:name "AccountId", :shape "AccountId"}) (clojure.core/into (ser-parent-id (input :source-parent-id)) #:http.request.field{:name "SourceParentId", :shape "ParentId"}) (clojure.core/into (ser-parent-id (input :destination-parent-id)) #:http.request.field{:name "DestinationParentId", :shape "ParentId"})]}))

(clojure.core/defn- req-list-handshakes-for-organization-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handshake-filter (input :filter)) #:http.request.field{:name "Filter", :shape "HandshakeFilter"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId"})]}))

(clojure.core/defn- req-create-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-email (input :email)) #:http.request.field{:name "Email", :shape "Email"}) (clojure.core/into (ser-account-name (input :account-name)) #:http.request.field{:name "AccountName", :shape "AccountName"})]} (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "RoleName", :shape "RoleName"})) (clojure.core/contains? input :iam-user-access-to-billing) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-user-access-to-billing (input :iam-user-access-to-billing)) #:http.request.field{:name "IamUserAccessToBilling", :shape "IAMUserAccessToBilling"}))))

(clojure.core/defn- req-list-organizational-units-for-parent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-parent-id (input :parent-id)) #:http.request.field{:name "ParentId", :shape "ParentId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-handshake-constraint-violation-exception-reason)

(clojure.core/declare deser-child-id)

(clojure.core/declare deser-children)

(clojure.core/declare deser-parent)

(clojure.core/declare deser-enabled-service-principals)

(clojure.core/declare deser-organization-feature-set)

(clojure.core/declare deser-policy-type-status)

(clojure.core/declare deser-generic-arn)

(clojure.core/declare deser-organizational-units)

(clojure.core/declare deser-email)

(clojure.core/declare deser-handshake-resources)

(clojure.core/declare deser-organization)

(clojure.core/declare deser-policy-name)

(clojure.core/declare deser-policy-target-id)

(clojure.core/declare deser-policy-summary)

(clojure.core/declare deser-root)

(clojure.core/declare deser-create-account-statuses)

(clojure.core/declare deser-parent-id)

(clojure.core/declare deser-policy-description)

(clojure.core/declare deser-target-type)

(clojure.core/declare deser-policy-targets)

(clojure.core/declare deser-organization-id)

(clojure.core/declare deser-handshake-state)

(clojure.core/declare deser-policy-content)

(clojure.core/declare deser-create-account-request-id)

(clojure.core/declare deser-service-principal)

(clojure.core/declare deser-policy-types)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-handshake-party-type)

(clojure.core/declare deser-handshake)

(clojure.core/declare deser-policy-target-summary)

(clojure.core/declare deser-parent-type)

(clojure.core/declare deser-policy-id)

(clojure.core/declare deser-root-arn)

(clojure.core/declare deser-handshake-resource-value)

(clojure.core/declare deser-roots)

(clojure.core/declare deser-handshake-parties)

(clojure.core/declare deser-accounts)

(clojure.core/declare deser-handshake-resource)

(clojure.core/declare deser-root-name)

(clojure.core/declare deser-create-account-status)

(clojure.core/declare deser-account)

(clojure.core/declare deser-root-id)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-handshake-id)

(clojure.core/declare deser-account-arn)

(clojure.core/declare deser-policy-type-summary)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-constraint-violation-exception-reason)

(clojure.core/declare deser-policy-arn)

(clojure.core/declare deser-aws-managed-policy)

(clojure.core/declare deser-organizational-unit-name)

(clojure.core/declare deser-handshake-resource-type)

(clojure.core/declare deser-access-denied-for-dependency-exception-reason)

(clojure.core/declare deser-account-joined-method)

(clojure.core/declare deser-enabled-service-principal)

(clojure.core/declare deser-policies)

(clojure.core/declare deser-account-name)

(clojure.core/declare deser-account-status)

(clojure.core/declare deser-exception-type)

(clojure.core/declare deser-organization-arn)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-target-name)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-child)

(clojure.core/declare deser-action-type)

(clojure.core/declare deser-create-account-failure-reason)

(clojure.core/declare deser-create-account-state)

(clojure.core/declare deser-organizational-unit-id)

(clojure.core/declare deser-policy-type)

(clojure.core/declare deser-organizational-unit-arn)

(clojure.core/declare deser-organizational-unit)

(clojure.core/declare deser-parents)

(clojure.core/declare deser-handshake-party-id)

(clojure.core/declare deser-handshakes)

(clojure.core/declare deser-handshake-party)

(clojure.core/declare deser-child-type)

(clojure.core/declare deser-handshake-arn)

(clojure.core/declare deser-invalid-input-exception-reason)

(clojure.core/defn- deser-handshake-constraint-violation-exception-reason [input] (clojure.core/get {"ACCOUNT_NUMBER_LIMIT_EXCEEDED" :account-number-limit-exceeded, "HANDSHAKE_RATE_LIMIT_EXCEEDED" :handshake-rate-limit-exceeded, "ALREADY_IN_AN_ORGANIZATION" :already-in-an-organization, "ORGANIZATION_ALREADY_HAS_ALL_FEATURES" :organization-already-has-all-features, "INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES" :invite-disabled-during-enable-all-features, "PAYMENT_INSTRUMENT_REQUIRED" :payment-instrument-required, "ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD" :organization-from-different-seller-of-record, "ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED" :organization-membership-change-rate-limit-exceeded} input))

(clojure.core/defn- deser-child-id [input] input)

(clojure.core/defn- deser-children [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-child coll))) input))

(clojure.core/defn- deser-parent [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-parent-id (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-parent-type (input "Type")))))

(clojure.core/defn- deser-enabled-service-principals [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-enabled-service-principal coll))) input))

(clojure.core/defn- deser-organization-feature-set [input] (clojure.core/get {"ALL" :all, "CONSOLIDATED_BILLING" :consolidated-billing} input))

(clojure.core/defn- deser-policy-type-status [input] (clojure.core/get {"ENABLED" :enabled, "PENDING_ENABLE" :pending-enable, "PENDING_DISABLE" :pending-disable} input))

(clojure.core/defn- deser-generic-arn [input] input)

(clojure.core/defn- deser-organizational-units [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-organizational-unit coll))) input))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-handshake-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-handshake-resource coll))) input))

(clojure.core/defn- deser-organization [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-organization-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-organization-arn (input "Arn"))) (clojure.core/contains? input "FeatureSet") (clojure.core/assoc :feature-set (deser-organization-feature-set (input "FeatureSet"))) (clojure.core/contains? input "MasterAccountArn") (clojure.core/assoc :master-account-arn (deser-account-arn (input "MasterAccountArn"))) (clojure.core/contains? input "MasterAccountId") (clojure.core/assoc :master-account-id (deser-account-id (input "MasterAccountId"))) (clojure.core/contains? input "MasterAccountEmail") (clojure.core/assoc :master-account-email (deser-email (input "MasterAccountEmail"))) (clojure.core/contains? input "AvailablePolicyTypes") (clojure.core/assoc :available-policy-types (deser-policy-types (input "AvailablePolicyTypes")))))

(clojure.core/defn- deser-policy-name [input] input)

(clojure.core/defn- deser-policy-target-id [input] input)

(clojure.core/defn- deser-policy-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-policy-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-policy-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-policy-name (input "Name"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-policy-description (input "Description"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-policy-type (input "Type"))) (clojure.core/contains? input "AwsManaged") (clojure.core/assoc :aws-managed (deser-aws-managed-policy (input "AwsManaged")))))

(clojure.core/defn- deser-root [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-root-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-root-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-root-name (input "Name"))) (clojure.core/contains? input "PolicyTypes") (clojure.core/assoc :policy-types (deser-policy-types (input "PolicyTypes")))))

(clojure.core/defn- deser-create-account-statuses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-create-account-status coll))) input))

(clojure.core/defn- deser-parent-id [input] input)

(clojure.core/defn- deser-policy-description [input] input)

(clojure.core/defn- deser-target-type [input] (clojure.core/get {"ACCOUNT" :account, "ORGANIZATIONAL_UNIT" :organizational-unit, "ROOT" :root} input))

(clojure.core/defn- deser-policy-targets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-target-summary coll))) input))

(clojure.core/defn- deser-organization-id [input] input)

(clojure.core/defn- deser-handshake-state [input] (clojure.core/get {"REQUESTED" :requested, "OPEN" :open, "CANCELED" :canceled, "ACCEPTED" :accepted, "DECLINED" :declined, "EXPIRED" :expired} input))

(clojure.core/defn- deser-policy-content [input] input)

(clojure.core/defn- deser-create-account-request-id [input] input)

(clojure.core/defn- deser-service-principal [input] input)

(clojure.core/defn- deser-policy-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-type-summary coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-handshake-party-type [input] (clojure.core/get {"ACCOUNT" :account, "ORGANIZATION" :organization, "EMAIL" :email} input))

(clojure.core/defn- deser-handshake [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-handshake-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-handshake-arn (input "Arn"))) (clojure.core/contains? input "Parties") (clojure.core/assoc :parties (deser-handshake-parties (input "Parties"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-handshake-state (input "State"))) (clojure.core/contains? input "RequestedTimestamp") (clojure.core/assoc :requested-timestamp (deser-timestamp (input "RequestedTimestamp"))) (clojure.core/contains? input "ExpirationTimestamp") (clojure.core/assoc :expiration-timestamp (deser-timestamp (input "ExpirationTimestamp"))) (clojure.core/contains? input "Action") (clojure.core/assoc :action (deser-action-type (input "Action"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-handshake-resources (input "Resources")))))

(clojure.core/defn- deser-policy-target-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetId") (clojure.core/assoc :target-id (deser-policy-target-id (input "TargetId"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-generic-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-target-name (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-target-type (input "Type")))))

(clojure.core/defn- deser-parent-type [input] (clojure.core/get {"ROOT" :root, "ORGANIZATIONAL_UNIT" :organizational-unit} input))

(clojure.core/defn- deser-policy-id [input] input)

(clojure.core/defn- deser-root-arn [input] input)

(clojure.core/defn- deser-handshake-resource-value [input] input)

(clojure.core/defn- deser-roots [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-root coll))) input))

(clojure.core/defn- deser-handshake-parties [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-handshake-party coll))) input))

(clojure.core/defn- deser-accounts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account coll))) input))

(clojure.core/defn- deser-handshake-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-handshake-resource-value (input "Value"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-handshake-resource-type (input "Type"))) (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-handshake-resources (input "Resources")))))

(clojure.core/defn- deser-root-name [input] input)

(clojure.core/defn- deser-create-account-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-create-account-request-id (input "Id"))) (clojure.core/contains? input "AccountName") (clojure.core/assoc :account-name (deser-account-name (input "AccountName"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-create-account-state (input "State"))) (clojure.core/contains? input "RequestedTimestamp") (clojure.core/assoc :requested-timestamp (deser-timestamp (input "RequestedTimestamp"))) (clojure.core/contains? input "CompletedTimestamp") (clojure.core/assoc :completed-timestamp (deser-timestamp (input "CompletedTimestamp"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-account-id (input "AccountId"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-create-account-failure-reason (input "FailureReason")))))

(clojure.core/defn- deser-account [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-account-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-account-arn (input "Arn"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email (input "Email"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-account-name (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-account-status (input "Status"))) (clojure.core/contains? input "JoinedMethod") (clojure.core/assoc :joined-method (deser-account-joined-method (input "JoinedMethod"))) (clojure.core/contains? input "JoinedTimestamp") (clojure.core/assoc :joined-timestamp (deser-timestamp (input "JoinedTimestamp")))))

(clojure.core/defn- deser-root-id [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-handshake-id [input] input)

(clojure.core/defn- deser-account-arn [input] input)

(clojure.core/defn- deser-policy-type-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-policy-type (input "Type"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-policy-type-status (input "Status")))))

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-constraint-violation-exception-reason [input] (clojure.core/get {"MASTER_ACCOUNT_MISSING_CONTACT_INFO" :master-account-missing-contact-info, "ACCOUNT_CANNOT_LEAVE_ORGANIZATION" :account-cannot-leave-organization, "MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" :max-policy-type-attachment-limit-exceeded, "MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE" :master-account-address-does-not-match-marketplace, "ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED" :account-creation-rate-limit-exceeded, "HANDSHAKE_RATE_LIMIT_EXCEEDED" :handshake-rate-limit-exceeded, "EMAIL_VERIFICATION_CODE_EXPIRED" :email-verification-code-expired, "ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION" :account-cannot-leave-without-phone-verification, "MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" :master-account-payment-instrument-required, "OU_DEPTH_LIMIT_EXCEEDED" :ou-depth-limit-exceeded, "ORGANIZATION_NOT_IN_ALL_FEATURES_MODE" :organization-not-in-all-features-mode, "WAIT_PERIOD_ACTIVE" :wait-period-active, "OU_NUMBER_LIMIT_EXCEEDED" :ou-number-limit-exceeded, "MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" :min-policy-type-attachment-limit-exceeded, "POLICY_NUMBER_LIMIT_EXCEEDED" :policy-number-limit-exceeded, "ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA" :account-cannot-leave-without-eula, "MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" :member-account-payment-instrument-required, "ACCOUNT_NUMBER_LIMIT_EXCEEDED" :account-number-limit-exceeded} input))

(clojure.core/defn- deser-policy-arn [input] input)

(clojure.core/defn- deser-aws-managed-policy [input] input)

(clojure.core/defn- deser-organizational-unit-name [input] input)

(clojure.core/defn- deser-handshake-resource-type [input] (clojure.core/get {"ACCOUNT" :account, "ORGANIZATION" :organization, "ORGANIZATION_FEATURE_SET" :organization-feature-set, "EMAIL" :email, "MASTER_EMAIL" :master-email, "MASTER_NAME" :master-name, "NOTES" :notes, "PARENT_HANDSHAKE" :parent-handshake} input))

(clojure.core/defn- deser-access-denied-for-dependency-exception-reason [input] (clojure.core/get {"ACCESS_DENIED_DURING_CREATE_SERVICE_LINKED_ROLE" :access-denied-during-create-service-linked-role} input))

(clojure.core/defn- deser-account-joined-method [input] (clojure.core/get {"INVITED" :invited, "CREATED" :created} input))

(clojure.core/defn- deser-enabled-service-principal [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServicePrincipal") (clojure.core/assoc :service-principal (deser-service-principal (input "ServicePrincipal"))) (clojure.core/contains? input "DateEnabled") (clojure.core/assoc :date-enabled (deser-timestamp (input "DateEnabled")))))

(clojure.core/defn- deser-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-summary coll))) input))

(clojure.core/defn- deser-account-name [input] input)

(clojure.core/defn- deser-account-status [input] (clojure.core/get {"ACTIVE" :active, "SUSPENDED" :suspended} input))

(clojure.core/defn- deser-exception-type [input] input)

(clojure.core/defn- deser-organization-arn [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-target-name [input] input)

(clojure.core/defn- deser-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicySummary") (clojure.core/assoc :policy-summary (deser-policy-summary (input "PolicySummary"))) (clojure.core/contains? input "Content") (clojure.core/assoc :content (deser-policy-content (input "Content")))))

(clojure.core/defn- deser-child [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-child-id (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-child-type (input "Type")))))

(clojure.core/defn- deser-action-type [input] (clojure.core/get {"INVITE" :invite, "ENABLE_ALL_FEATURES" :enable-all-features, "APPROVE_ALL_FEATURES" :approve-all-features, "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" :add-organizations-service-linked-role} input))

(clojure.core/defn- deser-create-account-failure-reason [input] (clojure.core/get {"ACCOUNT_LIMIT_EXCEEDED" :account-limit-exceeded, "EMAIL_ALREADY_EXISTS" :email-already-exists, "INVALID_ADDRESS" :invalid-address, "INVALID_EMAIL" :invalid-email, "CONCURRENT_ACCOUNT_MODIFICATION" :concurrent-account-modification, "INTERNAL_FAILURE" :internal-failure} input))

(clojure.core/defn- deser-create-account-state [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-organizational-unit-id [input] input)

(clojure.core/defn- deser-policy-type [input] (clojure.core/get {"SERVICE_CONTROL_POLICY" :service-control-policy} input))

(clojure.core/defn- deser-organizational-unit-arn [input] input)

(clojure.core/defn- deser-organizational-unit [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-organizational-unit-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-organizational-unit-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-organizational-unit-name (input "Name")))))

(clojure.core/defn- deser-parents [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parent coll))) input))

(clojure.core/defn- deser-handshake-party-id [input] input)

(clojure.core/defn- deser-handshakes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-handshake coll))) input))

(clojure.core/defn- deser-handshake-party [input] (clojure.core/cond-> {:id (deser-handshake-party-id (input "Id")), :type (deser-handshake-party-type (input "Type"))}))

(clojure.core/defn- deser-child-type [input] (clojure.core/get {"ACCOUNT" :account, "ORGANIZATIONAL_UNIT" :organizational-unit} input))

(clojure.core/defn- deser-handshake-arn [input] input)

(clojure.core/defn- deser-invalid-input-exception-reason [input] (clojure.core/get {"INVALID_SYNTAX_POLICY_ID" :invalid-syntax-policy-id, "INVALID_ENUM" :invalid-enum, "IMMUTABLE_POLICY" :immutable-policy, "UNRECOGNIZED_SERVICE_PRINCIPAL" :unrecognized-service-principal, "INVALID_PATTERN" :invalid-pattern, "INVALID_PARTY_TYPE_TARGET" :invalid-party-type-target, "INVALID_PATTERN_TARGET_ID" :invalid-pattern-target-id, "MAX_LIMIT_EXCEEDED_FILTER" :max-limit-exceeded-filter, "MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS" :moving-account-between-different-roots, "INVALID_ROLE_NAME" :invalid-role-name, "MAX_LENGTH_EXCEEDED" :max-length-exceeded, "MIN_LENGTH_EXCEEDED" :min-length-exceeded, "INVALID_SYNTAX_ORGANIZATION_ARN" :invalid-syntax-organization-arn, "INVALID_FULL_NAME_TARGET" :invalid-full-name-target, "MIN_VALUE_EXCEEDED" :min-value-exceeded, "INPUT_REQUIRED" :input-required, "INVALID_NEXT_TOKEN" :invalid-next-token, "MAX_VALUE_EXCEEDED" :max-value-exceeded, "INVALID_LIST_MEMBER" :invalid-list-member} input))

(clojure.core/defn- response-organization-not-empty-exception ([input] (response-organization-not-empty-exception nil input)) ([resultWrapper1945209 input] (clojure.core/let [rawinput1945208 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945210 {"Message" (rawinput1945208 "Message")}] (clojure.core/cond-> {} (letvar1945210 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945210 ["Message"])))))))

(clojure.core/defn- response-disable-policy-type-response ([input] (response-disable-policy-type-response nil input)) ([resultWrapper1945212 input] (clojure.core/let [rawinput1945211 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945213 {"Root" (rawinput1945211 "Root")}] (clojure.core/cond-> {} (letvar1945213 "Root") (clojure.core/assoc :root (deser-root (clojure.core/get-in letvar1945213 ["Root"])))))))

(clojure.core/defn- response-handshake-not-found-exception ([input] (response-handshake-not-found-exception nil input)) ([resultWrapper1945215 input] (clojure.core/let [rawinput1945214 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945216 {"Message" (rawinput1945214 "Message")}] (clojure.core/cond-> {} (letvar1945216 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945216 ["Message"])))))))

(clojure.core/defn- response-list-targets-for-policy-response ([input] (response-list-targets-for-policy-response nil input)) ([resultWrapper1945218 input] (clojure.core/let [rawinput1945217 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945219 {"Targets" (rawinput1945217 "Targets"), "NextToken" (rawinput1945217 "NextToken")}] (clojure.core/cond-> {} (letvar1945219 "Targets") (clojure.core/assoc :targets (deser-policy-targets (clojure.core/get-in letvar1945219 ["Targets"]))) (letvar1945219 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945219 ["NextToken"])))))))

(clojure.core/defn- response-handshake-already-in-state-exception ([input] (response-handshake-already-in-state-exception nil input)) ([resultWrapper1945221 input] (clojure.core/let [rawinput1945220 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945222 {"Message" (rawinput1945220 "Message")}] (clojure.core/cond-> {} (letvar1945222 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945222 ["Message"])))))))

(clojure.core/defn- response-list-aws-service-access-for-organization-response ([input] (response-list-aws-service-access-for-organization-response nil input)) ([resultWrapper1945224 input] (clojure.core/let [rawinput1945223 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945225 {"EnabledServicePrincipals" (rawinput1945223 "EnabledServicePrincipals"), "NextToken" (rawinput1945223 "NextToken")}] (clojure.core/cond-> {} (letvar1945225 "EnabledServicePrincipals") (clojure.core/assoc :enabled-service-principals (deser-enabled-service-principals (clojure.core/get-in letvar1945225 ["EnabledServicePrincipals"]))) (letvar1945225 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945225 ["NextToken"])))))))

(clojure.core/defn- response-list-create-account-status-response ([input] (response-list-create-account-status-response nil input)) ([resultWrapper1945227 input] (clojure.core/let [rawinput1945226 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945228 {"CreateAccountStatuses" (rawinput1945226 "CreateAccountStatuses"), "NextToken" (rawinput1945226 "NextToken")}] (clojure.core/cond-> {} (letvar1945228 "CreateAccountStatuses") (clojure.core/assoc :create-account-statuses (deser-create-account-statuses (clojure.core/get-in letvar1945228 ["CreateAccountStatuses"]))) (letvar1945228 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945228 ["NextToken"])))))))

(clojure.core/defn- response-accept-handshake-response ([input] (response-accept-handshake-response nil input)) ([resultWrapper1945230 input] (clojure.core/let [rawinput1945229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945231 {"Handshake" (rawinput1945229 "Handshake")}] (clojure.core/cond-> {} (letvar1945231 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945231 ["Handshake"])))))))

(clojure.core/defn- response-describe-policy-response ([input] (response-describe-policy-response nil input)) ([resultWrapper1945233 input] (clojure.core/let [rawinput1945232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945234 {"Policy" (rawinput1945232 "Policy")}] (clojure.core/cond-> {} (letvar1945234 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1945234 ["Policy"])))))))

(clojure.core/defn- response-update-policy-response ([input] (response-update-policy-response nil input)) ([resultWrapper1945236 input] (clojure.core/let [rawinput1945235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945237 {"Policy" (rawinput1945235 "Policy")}] (clojure.core/cond-> {} (letvar1945237 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1945237 ["Policy"])))))))

(clojure.core/defn- response-finalizing-organization-exception ([input] (response-finalizing-organization-exception nil input)) ([resultWrapper1945239 input] (clojure.core/let [rawinput1945238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945240 {"Message" (rawinput1945238 "Message")}] (clojure.core/cond-> {} (letvar1945240 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945240 ["Message"])))))))

(clojure.core/defn- response-list-parents-response ([input] (response-list-parents-response nil input)) ([resultWrapper1945242 input] (clojure.core/let [rawinput1945241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945243 {"Parents" (rawinput1945241 "Parents"), "NextToken" (rawinput1945241 "NextToken")}] (clojure.core/cond-> {} (letvar1945243 "Parents") (clojure.core/assoc :parents (deser-parents (clojure.core/get-in letvar1945243 ["Parents"]))) (letvar1945243 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945243 ["NextToken"])))))))

(clojure.core/defn- response-list-policies-for-target-response ([input] (response-list-policies-for-target-response nil input)) ([resultWrapper1945245 input] (clojure.core/let [rawinput1945244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945246 {"Policies" (rawinput1945244 "Policies"), "NextToken" (rawinput1945244 "NextToken")}] (clojure.core/cond-> {} (letvar1945246 "Policies") (clojure.core/assoc :policies (deser-policies (clojure.core/get-in letvar1945246 ["Policies"]))) (letvar1945246 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945246 ["NextToken"])))))))

(clojure.core/defn- response-describe-create-account-status-response ([input] (response-describe-create-account-status-response nil input)) ([resultWrapper1945248 input] (clojure.core/let [rawinput1945247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945249 {"CreateAccountStatus" (rawinput1945247 "CreateAccountStatus")}] (clojure.core/cond-> {} (letvar1945249 "CreateAccountStatus") (clojure.core/assoc :create-account-status (deser-create-account-status (clojure.core/get-in letvar1945249 ["CreateAccountStatus"])))))))

(clojure.core/defn- response-list-accounts-for-parent-response ([input] (response-list-accounts-for-parent-response nil input)) ([resultWrapper1945251 input] (clojure.core/let [rawinput1945250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945252 {"Accounts" (rawinput1945250 "Accounts"), "NextToken" (rawinput1945250 "NextToken")}] (clojure.core/cond-> {} (letvar1945252 "Accounts") (clojure.core/assoc :accounts (deser-accounts (clojure.core/get-in letvar1945252 ["Accounts"]))) (letvar1945252 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945252 ["NextToken"])))))))

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper1945254 input] (clojure.core/let [rawinput1945253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945255 {"Message" (rawinput1945253 "Message")}] (clojure.core/cond-> {} (letvar1945255 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945255 ["Message"])))))))

(clojure.core/defn- response-list-organizational-units-for-parent-response ([input] (response-list-organizational-units-for-parent-response nil input)) ([resultWrapper1945257 input] (clojure.core/let [rawinput1945256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945258 {"OrganizationalUnits" (rawinput1945256 "OrganizationalUnits"), "NextToken" (rawinput1945256 "NextToken")}] (clojure.core/cond-> {} (letvar1945258 "OrganizationalUnits") (clojure.core/assoc :organizational-units (deser-organizational-units (clojure.core/get-in letvar1945258 ["OrganizationalUnits"]))) (letvar1945258 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945258 ["NextToken"])))))))

(clojure.core/defn- response-decline-handshake-response ([input] (response-decline-handshake-response nil input)) ([resultWrapper1945260 input] (clojure.core/let [rawinput1945259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945261 {"Handshake" (rawinput1945259 "Handshake")}] (clojure.core/cond-> {} (letvar1945261 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945261 ["Handshake"])))))))

(clojure.core/defn- response-destination-parent-not-found-exception ([input] (response-destination-parent-not-found-exception nil input)) ([resultWrapper1945263 input] (clojure.core/let [rawinput1945262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945264 {"Message" (rawinput1945262 "Message")}] (clojure.core/cond-> {} (letvar1945264 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945264 ["Message"])))))))

(clojure.core/defn- response-enable-all-features-response ([input] (response-enable-all-features-response nil input)) ([resultWrapper1945266 input] (clojure.core/let [rawinput1945265 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945267 {"Handshake" (rawinput1945265 "Handshake")}] (clojure.core/cond-> {} (letvar1945267 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945267 ["Handshake"])))))))

(clojure.core/defn- response-list-accounts-response ([input] (response-list-accounts-response nil input)) ([resultWrapper1945269 input] (clojure.core/let [rawinput1945268 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945270 {"Accounts" (rawinput1945268 "Accounts"), "NextToken" (rawinput1945268 "NextToken")}] (clojure.core/cond-> {} (letvar1945270 "Accounts") (clojure.core/assoc :accounts (deser-accounts (clojure.core/get-in letvar1945270 ["Accounts"]))) (letvar1945270 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945270 ["NextToken"])))))))

(clojure.core/defn- response-account-owner-not-verified-exception ([input] (response-account-owner-not-verified-exception nil input)) ([resultWrapper1945272 input] (clojure.core/let [rawinput1945271 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945273 {"Message" (rawinput1945271 "Message")}] (clojure.core/cond-> {} (letvar1945273 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945273 ["Message"])))))))

(clojure.core/defn- response-policy-not-attached-exception ([input] (response-policy-not-attached-exception nil input)) ([resultWrapper1945275 input] (clojure.core/let [rawinput1945274 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945276 {"Message" (rawinput1945274 "Message")}] (clojure.core/cond-> {} (letvar1945276 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945276 ["Message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1945278 input] (clojure.core/let [rawinput1945277 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945279 {"Type" (rawinput1945277 "Type"), "Message" (rawinput1945277 "Message")}] (clojure.core/cond-> {} (letvar1945279 "Type") (clojure.core/assoc :type (deser-exception-type (clojure.core/get-in letvar1945279 ["Type"]))) (letvar1945279 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945279 ["Message"])))))))

(clojure.core/defn- response-list-children-response ([input] (response-list-children-response nil input)) ([resultWrapper1945281 input] (clojure.core/let [rawinput1945280 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945282 {"Children" (rawinput1945280 "Children"), "NextToken" (rawinput1945280 "NextToken")}] (clojure.core/cond-> {} (letvar1945282 "Children") (clojure.core/assoc :children (deser-children (clojure.core/get-in letvar1945282 ["Children"]))) (letvar1945282 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945282 ["NextToken"])))))))

(clojure.core/defn- response-describe-handshake-response ([input] (response-describe-handshake-response nil input)) ([resultWrapper1945284 input] (clojure.core/let [rawinput1945283 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945285 {"Handshake" (rawinput1945283 "Handshake")}] (clojure.core/cond-> {} (letvar1945285 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945285 ["Handshake"])))))))

(clojure.core/defn- response-child-not-found-exception ([input] (response-child-not-found-exception nil input)) ([resultWrapper1945287 input] (clojure.core/let [rawinput1945286 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945288 {"Message" (rawinput1945286 "Message")}] (clojure.core/cond-> {} (letvar1945288 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945288 ["Message"])))))))

(clojure.core/defn- response-root-not-found-exception ([input] (response-root-not-found-exception nil input)) ([resultWrapper1945290 input] (clojure.core/let [rawinput1945289 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945291 {"Message" (rawinput1945289 "Message")}] (clojure.core/cond-> {} (letvar1945291 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945291 ["Message"])))))))

(clojure.core/defn- response-list-roots-response ([input] (response-list-roots-response nil input)) ([resultWrapper1945293 input] (clojure.core/let [rawinput1945292 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945294 {"Roots" (rawinput1945292 "Roots"), "NextToken" (rawinput1945292 "NextToken")}] (clojure.core/cond-> {} (letvar1945294 "Roots") (clojure.core/assoc :roots (deser-roots (clojure.core/get-in letvar1945294 ["Roots"]))) (letvar1945294 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945294 ["NextToken"])))))))

(clojure.core/defn- response-create-account-response ([input] (response-create-account-response nil input)) ([resultWrapper1945296 input] (clojure.core/let [rawinput1945295 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945297 {"CreateAccountStatus" (rawinput1945295 "CreateAccountStatus")}] (clojure.core/cond-> {} (letvar1945297 "CreateAccountStatus") (clojure.core/assoc :create-account-status (deser-create-account-status (clojure.core/get-in letvar1945297 ["CreateAccountStatus"])))))))

(clojure.core/defn- response-describe-organization-response ([input] (response-describe-organization-response nil input)) ([resultWrapper1945299 input] (clojure.core/let [rawinput1945298 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945300 {"Organization" (rawinput1945298 "Organization")}] (clojure.core/cond-> {} (letvar1945300 "Organization") (clojure.core/assoc :organization (deser-organization (clojure.core/get-in letvar1945300 ["Organization"])))))))

(clojure.core/defn- response-create-organization-response ([input] (response-create-organization-response nil input)) ([resultWrapper1945302 input] (clojure.core/let [rawinput1945301 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945303 {"Organization" (rawinput1945301 "Organization")}] (clojure.core/cond-> {} (letvar1945303 "Organization") (clojure.core/assoc :organization (deser-organization (clojure.core/get-in letvar1945303 ["Organization"])))))))

(clojure.core/defn- response-enable-policy-type-response ([input] (response-enable-policy-type-response nil input)) ([resultWrapper1945305 input] (clojure.core/let [rawinput1945304 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945306 {"Root" (rawinput1945304 "Root")}] (clojure.core/cond-> {} (letvar1945306 "Root") (clojure.core/assoc :root (deser-root (clojure.core/get-in letvar1945306 ["Root"])))))))

(clojure.core/defn- response-update-organizational-unit-response ([input] (response-update-organizational-unit-response nil input)) ([resultWrapper1945308 input] (clojure.core/let [rawinput1945307 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945309 {"OrganizationalUnit" (rawinput1945307 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1945309 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1945309 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-policy-not-found-exception ([input] (response-policy-not-found-exception nil input)) ([resultWrapper1945311 input] (clojure.core/let [rawinput1945310 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945312 {"Message" (rawinput1945310 "Message")}] (clojure.core/cond-> {} (letvar1945312 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945312 ["Message"])))))))

(clojure.core/defn- response-duplicate-organizational-unit-exception ([input] (response-duplicate-organizational-unit-exception nil input)) ([resultWrapper1945314 input] (clojure.core/let [rawinput1945313 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945315 {"Message" (rawinput1945313 "Message")}] (clojure.core/cond-> {} (letvar1945315 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945315 ["Message"])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper1945317 input] (clojure.core/let [rawinput1945316 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945318 {"Message" (rawinput1945316 "Message")}] (clojure.core/cond-> {} (letvar1945318 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945318 ["Message"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1945320 input] (clojure.core/let [rawinput1945319 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945321 {"Message" (rawinput1945319 "Message"), "Reason" (rawinput1945319 "Reason")}] (clojure.core/cond-> {} (letvar1945321 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945321 ["Message"]))) (letvar1945321 "Reason") (clojure.core/assoc :reason (deser-invalid-input-exception-reason (clojure.core/get-in letvar1945321 ["Reason"])))))))

(clojure.core/defn- response-create-policy-response ([input] (response-create-policy-response nil input)) ([resultWrapper1945323 input] (clojure.core/let [rawinput1945322 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945324 {"Policy" (rawinput1945322 "Policy")}] (clojure.core/cond-> {} (letvar1945324 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1945324 ["Policy"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1945326 input] (clojure.core/let [rawinput1945325 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945327 {"Message" (rawinput1945325 "Message")}] (clojure.core/cond-> {} (letvar1945327 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945327 ["Message"])))))))

(clojure.core/defn- response-list-handshakes-for-organization-response ([input] (response-list-handshakes-for-organization-response nil input)) ([resultWrapper1945329 input] (clojure.core/let [rawinput1945328 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945330 {"Handshakes" (rawinput1945328 "Handshakes"), "NextToken" (rawinput1945328 "NextToken")}] (clojure.core/cond-> {} (letvar1945330 "Handshakes") (clojure.core/assoc :handshakes (deser-handshakes (clojure.core/get-in letvar1945330 ["Handshakes"]))) (letvar1945330 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945330 ["NextToken"])))))))

(clojure.core/defn- response-duplicate-policy-attachment-exception ([input] (response-duplicate-policy-attachment-exception nil input)) ([resultWrapper1945332 input] (clojure.core/let [rawinput1945331 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945333 {"Message" (rawinput1945331 "Message")}] (clojure.core/cond-> {} (letvar1945333 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945333 ["Message"])))))))

(clojure.core/defn- response-duplicate-policy-exception ([input] (response-duplicate-policy-exception nil input)) ([resultWrapper1945335 input] (clojure.core/let [rawinput1945334 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945336 {"Message" (rawinput1945334 "Message")}] (clojure.core/cond-> {} (letvar1945336 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945336 ["Message"])))))))

(clojure.core/defn- response-describe-organizational-unit-response ([input] (response-describe-organizational-unit-response nil input)) ([resultWrapper1945338 input] (clojure.core/let [rawinput1945337 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945339 {"OrganizationalUnit" (rawinput1945337 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1945339 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1945339 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-describe-account-response ([input] (response-describe-account-response nil input)) ([resultWrapper1945341 input] (clojure.core/let [rawinput1945340 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945342 {"Account" (rawinput1945340 "Account")}] (clojure.core/cond-> {} (letvar1945342 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar1945342 ["Account"])))))))

(clojure.core/defn- response-aws-organizations-not-in-use-exception ([input] (response-aws-organizations-not-in-use-exception nil input)) ([resultWrapper1945344 input] (clojure.core/let [rawinput1945343 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945345 {"Message" (rawinput1945343 "Message")}] (clojure.core/cond-> {} (letvar1945345 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945345 ["Message"])))))))

(clojure.core/defn- response-organizational-unit-not-found-exception ([input] (response-organizational-unit-not-found-exception nil input)) ([resultWrapper1945347 input] (clojure.core/let [rawinput1945346 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945348 {"Message" (rawinput1945346 "Message")}] (clojure.core/cond-> {} (letvar1945348 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945348 ["Message"])))))))

(clojure.core/defn- response-account-not-found-exception ([input] (response-account-not-found-exception nil input)) ([resultWrapper1945350 input] (clojure.core/let [rawinput1945349 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945351 {"Message" (rawinput1945349 "Message")}] (clojure.core/cond-> {} (letvar1945351 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945351 ["Message"])))))))

(clojure.core/defn- response-constraint-violation-exception ([input] (response-constraint-violation-exception nil input)) ([resultWrapper1945353 input] (clojure.core/let [rawinput1945352 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945354 {"Message" (rawinput1945352 "Message"), "Reason" (rawinput1945352 "Reason")}] (clojure.core/cond-> {} (letvar1945354 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945354 ["Message"]))) (letvar1945354 "Reason") (clojure.core/assoc :reason (deser-constraint-violation-exception-reason (clojure.core/get-in letvar1945354 ["Reason"])))))))

(clojure.core/defn- response-parent-not-found-exception ([input] (response-parent-not-found-exception nil input)) ([resultWrapper1945356 input] (clojure.core/let [rawinput1945355 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945357 {"Message" (rawinput1945355 "Message")}] (clojure.core/cond-> {} (letvar1945357 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945357 ["Message"])))))))

(clojure.core/defn- response-create-organizational-unit-response ([input] (response-create-organizational-unit-response nil input)) ([resultWrapper1945359 input] (clojure.core/let [rawinput1945358 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945360 {"OrganizationalUnit" (rawinput1945358 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1945360 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1945360 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-access-denied-for-dependency-exception ([input] (response-access-denied-for-dependency-exception nil input)) ([resultWrapper1945362 input] (clojure.core/let [rawinput1945361 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945363 {"Message" (rawinput1945361 "Message"), "Reason" (rawinput1945361 "Reason")}] (clojure.core/cond-> {} (letvar1945363 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945363 ["Message"]))) (letvar1945363 "Reason") (clojure.core/assoc :reason (deser-access-denied-for-dependency-exception-reason (clojure.core/get-in letvar1945363 ["Reason"])))))))

(clojure.core/defn- response-source-parent-not-found-exception ([input] (response-source-parent-not-found-exception nil input)) ([resultWrapper1945365 input] (clojure.core/let [rawinput1945364 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945366 {"Message" (rawinput1945364 "Message")}] (clojure.core/cond-> {} (letvar1945366 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945366 ["Message"])))))))

(clojure.core/defn- response-policy-type-not-available-for-organization-exception ([input] (response-policy-type-not-available-for-organization-exception nil input)) ([resultWrapper1945368 input] (clojure.core/let [rawinput1945367 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945369 {"Message" (rawinput1945367 "Message")}] (clojure.core/cond-> {} (letvar1945369 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945369 ["Message"])))))))

(clojure.core/defn- response-target-not-found-exception ([input] (response-target-not-found-exception nil input)) ([resultWrapper1945371 input] (clojure.core/let [rawinput1945370 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945372 {"Message" (rawinput1945370 "Message")}] (clojure.core/cond-> {} (letvar1945372 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945372 ["Message"])))))))

(clojure.core/defn- response-create-account-status-not-found-exception ([input] (response-create-account-status-not-found-exception nil input)) ([resultWrapper1945374 input] (clojure.core/let [rawinput1945373 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945375 {"Message" (rawinput1945373 "Message")}] (clojure.core/cond-> {} (letvar1945375 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945375 ["Message"])))))))

(clojure.core/defn- response-list-policies-response ([input] (response-list-policies-response nil input)) ([resultWrapper1945377 input] (clojure.core/let [rawinput1945376 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945378 {"Policies" (rawinput1945376 "Policies"), "NextToken" (rawinput1945376 "NextToken")}] (clojure.core/cond-> {} (letvar1945378 "Policies") (clojure.core/assoc :policies (deser-policies (clojure.core/get-in letvar1945378 ["Policies"]))) (letvar1945378 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945378 ["NextToken"])))))))

(clojure.core/defn- response-already-in-organization-exception ([input] (response-already-in-organization-exception nil input)) ([resultWrapper1945380 input] (clojure.core/let [rawinput1945379 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945381 {"Message" (rawinput1945379 "Message")}] (clojure.core/cond-> {} (letvar1945381 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945381 ["Message"])))))))

(clojure.core/defn- response-handshake-constraint-violation-exception ([input] (response-handshake-constraint-violation-exception nil input)) ([resultWrapper1945383 input] (clojure.core/let [rawinput1945382 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945384 {"Message" (rawinput1945382 "Message"), "Reason" (rawinput1945382 "Reason")}] (clojure.core/cond-> {} (letvar1945384 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945384 ["Message"]))) (letvar1945384 "Reason") (clojure.core/assoc :reason (deser-handshake-constraint-violation-exception-reason (clojure.core/get-in letvar1945384 ["Reason"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1945386 input] (clojure.core/let [rawinput1945385 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945387 {"Message" (rawinput1945385 "Message")}] (clojure.core/cond-> {} (letvar1945387 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945387 ["Message"])))))))

(clojure.core/defn- response-list-handshakes-for-account-response ([input] (response-list-handshakes-for-account-response nil input)) ([resultWrapper1945389 input] (clojure.core/let [rawinput1945388 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945390 {"Handshakes" (rawinput1945388 "Handshakes"), "NextToken" (rawinput1945388 "NextToken")}] (clojure.core/cond-> {} (letvar1945390 "Handshakes") (clojure.core/assoc :handshakes (deser-handshakes (clojure.core/get-in letvar1945390 ["Handshakes"]))) (letvar1945390 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1945390 ["NextToken"])))))))

(clojure.core/defn- response-organizational-unit-not-empty-exception ([input] (response-organizational-unit-not-empty-exception nil input)) ([resultWrapper1945392 input] (clojure.core/let [rawinput1945391 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945393 {"Message" (rawinput1945391 "Message")}] (clojure.core/cond-> {} (letvar1945393 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945393 ["Message"])))))))

(clojure.core/defn- response-invalid-handshake-transition-exception ([input] (response-invalid-handshake-transition-exception nil input)) ([resultWrapper1945395 input] (clojure.core/let [rawinput1945394 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945396 {"Message" (rawinput1945394 "Message")}] (clojure.core/cond-> {} (letvar1945396 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945396 ["Message"])))))))

(clojure.core/defn- response-master-cannot-leave-organization-exception ([input] (response-master-cannot-leave-organization-exception nil input)) ([resultWrapper1945398 input] (clojure.core/let [rawinput1945397 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945399 {"Message" (rawinput1945397 "Message")}] (clojure.core/cond-> {} (letvar1945399 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945399 ["Message"])))))))

(clojure.core/defn- response-policy-type-already-enabled-exception ([input] (response-policy-type-already-enabled-exception nil input)) ([resultWrapper1945401 input] (clojure.core/let [rawinput1945400 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945402 {"Message" (rawinput1945400 "Message")}] (clojure.core/cond-> {} (letvar1945402 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945402 ["Message"])))))))

(clojure.core/defn- response-duplicate-handshake-exception ([input] (response-duplicate-handshake-exception nil input)) ([resultWrapper1945404 input] (clojure.core/let [rawinput1945403 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945405 {"Message" (rawinput1945403 "Message")}] (clojure.core/cond-> {} (letvar1945405 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945405 ["Message"])))))))

(clojure.core/defn- response-invite-account-to-organization-response ([input] (response-invite-account-to-organization-response nil input)) ([resultWrapper1945407 input] (clojure.core/let [rawinput1945406 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945408 {"Handshake" (rawinput1945406 "Handshake")}] (clojure.core/cond-> {} (letvar1945408 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945408 ["Handshake"])))))))

(clojure.core/defn- response-duplicate-account-exception ([input] (response-duplicate-account-exception nil input)) ([resultWrapper1945410 input] (clojure.core/let [rawinput1945409 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945411 {"Message" (rawinput1945409 "Message")}] (clojure.core/cond-> {} (letvar1945411 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945411 ["Message"])))))))

(clojure.core/defn- response-policy-in-use-exception ([input] (response-policy-in-use-exception nil input)) ([resultWrapper1945413 input] (clojure.core/let [rawinput1945412 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945414 {"Message" (rawinput1945412 "Message")}] (clojure.core/cond-> {} (letvar1945414 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945414 ["Message"])))))))

(clojure.core/defn- response-cancel-handshake-response ([input] (response-cancel-handshake-response nil input)) ([resultWrapper1945416 input] (clojure.core/let [rawinput1945415 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945417 {"Handshake" (rawinput1945415 "Handshake")}] (clojure.core/cond-> {} (letvar1945417 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1945417 ["Handshake"])))))))

(clojure.core/defn- response-policy-type-not-enabled-exception ([input] (response-policy-type-not-enabled-exception nil input)) ([resultWrapper1945419 input] (clojure.core/let [rawinput1945418 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1945420 {"Message" (rawinput1945418 "Message")}] (clojure.core/cond-> {} (letvar1945420 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1945420 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organization-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.organization-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/cancel-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception-reason #{:organization-already-has-all-features :invite-disabled-during-enable-all-features :organization-membership-change-rate-limit-exceeded "PAYMENT_INSTRUMENT_REQUIRED" "ALREADY_IN_AN_ORGANIZATION" :organization-from-different-seller-of-record "INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES" "HANDSHAKE_RATE_LIMIT_EXCEEDED" :payment-instrument-required "ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD" :handshake-rate-limit-exceeded :account-number-limit-exceeded :already-in-an-organization "ORGANIZATION_ALREADY_HAS_ALL_FEATURES" "ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-parents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/child-id] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/child-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/iam-user-access-to-billing #{"DENY" :allow "ALLOW" :deny})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/disable-policy-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/root]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.handshake-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/children (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/child))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-targets-for-policy-response/targets (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-targets))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.list-targets-for-policy-response/targets :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.parent/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.parent/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/parent-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/parent (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.parent/id :portkey.aws.organizations.-2016-11-28.parent/type]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-filter/parent-handshake-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/action-type :portkey.aws.organizations.-2016-11-28.handshake-filter/parent-handshake-id]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-children-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/parent-id :portkey.aws.organizations.-2016-11-28/child-type] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enabled-service-principals (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/enabled-service-principal))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organization-feature-set #{:consolidated-billing :all "CONSOLIDATED_BILLING" "ALL"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-already-in-state-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-already-in-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.handshake-already-in-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type-status #{"PENDING_DISABLE" :pending-enable "PENDING_ENABLE" "ENABLED" :pending-disable :enabled})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/generic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::.+:.+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-units (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/organizational-unit))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/enabled-service-principals :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 6 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^\s@]+@[^\s@]+\.[^\s@]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-create-account-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/create-account-statuses :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/accept-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-resources (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/handshake-resource))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organization-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organization-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/feature-set (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organization-feature-set))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/master-account-arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/master-account-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/master-account-email (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/email))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organization/available-policy-types (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-types))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.organization/id :portkey.aws.organizations.-2016-11-28.organization/arn :portkey.aws.organizations.-2016-11-28.organization/feature-set :portkey.aws.organizations.-2016-11-28.organization/master-account-arn :portkey.aws.organizations.-2016-11-28.organization/master-account-id :portkey.aws.organizations.-2016-11-28.organization/master-account-email :portkey.aws.organizations.-2016-11-28.organization/available-policy-types]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/update-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/parent-id] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.finalizing-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/finalizing-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.finalizing-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-parents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/parents :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\w+=,.@-]{1,64}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/description (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-summary/aws-managed (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/aws-managed-policy))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-summary/id :portkey.aws.organizations.-2016-11-28.policy-summary/arn :portkey.aws.organizations.-2016-11-28.policy-summary/name :portkey.aws.organizations.-2016-11-28.policy-summary/description :portkey.aws.organizations.-2016-11-28.policy-summary/type :portkey.aws.organizations.-2016-11-28.policy-summary/aws-managed]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.attach-policy-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/attach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id :portkey.aws.organizations.-2016-11-28.attach-policy-request/target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-roots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-policies-for-target-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policies :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-create-account-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/create-account-status]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/accounts :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.root/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/root-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.root/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/root-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.root/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/root-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/root (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.root/id :portkey.aws.organizations.-2016-11-28.root/arn :portkey.aws.organizations.-2016-11-28.root/name :portkey.aws.organizations.-2016-11-28/policy-types]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-statuses (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/create-account-status))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.service-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-notes (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organizational-units :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/remove-account-from-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/parent-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/target-type #{"ROOT" :organizational-unit :account "ACCOUNT" :root "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/decline-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.destination-parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/destination-parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.destination-parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-targets (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/policy-target-summary))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enable-all-features-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^o-[a-z0-9]{10,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-state #{:open "CANCELED" "ACCEPTED" "OPEN" "EXPIRED" "DECLINED" :accepted :canceled :declined :expired :requested "REQUESTED"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/accounts :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/organizational-unit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000000))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^car-[a-z0-9]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-types (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/policy-type-summary))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/decline-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account-owner-not-verified-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-owner-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.account-owner-not-verified-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-party-type #{:email "ORGANIZATION" :organization :account "ACCOUNT" "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-not-attached-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-not-attached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-not-attached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-create-account-status-request/states (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-account-states))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-create-account-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.list-create-account-status-request/states :portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.too-many-requests-exception/type :portkey.aws.organizations.-2016-11-28.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-policy-request/content (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-policy-request/description (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-policy-request/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-policy-request/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28.create-policy-request/content :portkey.aws.organizations.-2016-11-28.create-policy-request/description :portkey.aws.organizations.-2016-11-28.create-policy-request/name :portkey.aws.organizations.-2016-11-28.create-policy-request/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-children-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/children :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/parties (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-parties))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/state (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-state))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/requested-timestamp (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/expiration-timestamp (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/action (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/action-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake/resources (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-resources))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.handshake/id :portkey.aws.organizations.-2016-11-28.handshake/arn :portkey.aws.organizations.-2016-11-28.handshake/parties :portkey.aws.organizations.-2016-11-28.handshake/state :portkey.aws.organizations.-2016-11-28.handshake/requested-timestamp :portkey.aws.organizations.-2016-11-28.handshake/expiration-timestamp :portkey.aws.organizations.-2016-11-28.handshake/action :portkey.aws.organizations.-2016-11-28.handshake/resources]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.child-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/child-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.child-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-target-summary/target-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-target-summary/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/generic-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-target-summary/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/target-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-target-summary/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/target-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-target-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-target-summary/target-id :portkey.aws.organizations.-2016-11-28.policy-target-summary/arn :portkey.aws.organizations.-2016-11-28.policy-target-summary/name :portkey.aws.organizations.-2016-11-28.policy-target-summary/type]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/parent-type #{"ROOT" :organizational-unit :root "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^p-[0-9a-zA-Z_]{8,128}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.root-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/root-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.root-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-roots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/roots :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/create-account-status]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/root-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:root\/o-[a-z0-9]{10,32}\/r-[0-9a-z]{4,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-resource-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organization]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enable-all-features-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organization]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/roots (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/root))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/disable-policy-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/root-id :portkey.aws.organizations.-2016-11-28/policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-parties (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/handshake-party))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enable-policy-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/root]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/accounts (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/account))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-resource/value (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-resource-value))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-resource/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-resource-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-resource/resources (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-resources))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.handshake-resource/value :portkey.aws.organizations.-2016-11-28.handshake-resource/type :portkey.aws.organizations.-2016-11-28.handshake-resource/resources]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/update-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/root-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-account-request-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status/state (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-account-state))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status/requested-timestamp (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status/completed-timestamp (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status/failure-reason (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-account-failure-reason))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.create-account-status/id :portkey.aws.organizations.-2016-11-28/account-name :portkey.aws.organizations.-2016-11-28.create-account-status/state :portkey.aws.organizations.-2016-11-28.create-account-status/requested-timestamp :portkey.aws.organizations.-2016-11-28.create-account-status/completed-timestamp :portkey.aws.organizations.-2016-11-28/account-id :portkey.aws.organizations.-2016-11-28.create-account-status/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/status (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-status))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/joined-method (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/account-joined-method))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account/joined-timestamp (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.account/id :portkey.aws.organizations.-2016-11-28.account/arn :portkey.aws.organizations.-2016-11-28/email :portkey.aws.organizations.-2016-11-28.account/name :portkey.aws.organizations.-2016-11-28.account/status :portkey.aws.organizations.-2016-11-28.account/joined-method :portkey.aws.organizations.-2016-11-28.account/joined-timestamp]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/root-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^r-[0-9a-z]{4,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.duplicate-organizational-unit-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/duplicate-organizational-unit-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.duplicate-organizational-unit-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.invalid-input-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/invalid-input-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.invalid-input-exception/message :portkey.aws.organizations.-2016-11-28.invalid-input-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.update-organizational-unit-request/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/update-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/organizational-unit-id] :opt-un [:portkey.aws.organizations.-2016-11-28.update-organizational-unit-request/name]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^h-[0-9a-z]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-type-summary/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-type-summary/status (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type-status))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-type-summary/type :portkey.aws.organizations.-2016-11-28.policy-type-summary/status]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-organization-request/feature-set (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organization-feature-set))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.create-organization-request/feature-set]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\d{12}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshakes :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/constraint-violation-exception-reason #{:master-account-missing-contact-info "MASTER_ACCOUNT_MISSING_CONTACT_INFO" "ACCOUNT_CANNOT_LEAVE_ORGANIZATION" :email-verification-code-expired "MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" "MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE" :min-policy-type-attachment-limit-exceeded "ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED" "HANDSHAKE_RATE_LIMIT_EXCEEDED" "EMAIL_VERIFICATION_CODE_EXPIRED" "ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION" :handshake-rate-limit-exceeded :account-number-limit-exceeded "MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "OU_DEPTH_LIMIT_EXCEEDED" "ORGANIZATION_NOT_IN_ALL_FEATURES_MODE" "WAIT_PERIOD_ACTIVE" :organization-not-in-all-features-mode :policy-number-limit-exceeded :wait-period-active :account-cannot-leave-organization :ou-number-limit-exceeded "OU_NUMBER_LIMIT_EXCEEDED" :master-account-address-does-not-match-marketplace :max-policy-type-attachment-limit-exceeded :master-account-payment-instrument-required "MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" :member-account-payment-instrument-required :account-cannot-leave-without-eula :account-cannot-leave-without-phone-verification "POLICY_NUMBER_LIMIT_EXCEEDED" :ou-depth-limit-exceeded "ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA" :account-creation-rate-limit-exceeded "MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\/[0-9a-z_]+\/p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-z_]+\/p-[0-9a-zA-Z_]{10,128})" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.duplicate-policy-attachment-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/duplicate-policy-attachment-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.duplicate-policy-attachment-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/aws-managed-policy clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-resource-type #{:email "ORGANIZATION" "MASTER_EMAIL" :master-email "NOTES" :organization :master-name :account :parent-handshake :organization-feature-set "PARENT_HANDSHAKE" "ACCOUNT" :notes "ORGANIZATION_FEATURE_SET" "EMAIL" "MASTER_NAME"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.duplicate-policy-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/duplicate-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.duplicate-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-policies-for-target-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-policies-for-target-request/filter (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-policies-for-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28.list-policies-for-target-request/target-id :portkey.aws.organizations.-2016-11-28.list-policies-for-target-request/filter] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/access-denied-for-dependency-exception-reason #{"ACCESS_DENIED_DURING_CREATE_SERVICE_LINKED_ROLE" :access-denied-during-create-service-linked-role})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-policies-request/filter (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28.list-policies-request/filter] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-joined-method #{:invited "INVITED" :created "CREATED"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.enabled-service-principal/date-enabled (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enabled-service-principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/service-principal :portkey.aws.organizations.-2016-11-28.enabled-service-principal/date-enabled]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.update-policy-request/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.update-policy-request/description (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.update-policy-request/content (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/update-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id] :opt-un [:portkey.aws.organizations.-2016-11-28.update-policy-request/name :portkey.aws.organizations.-2016-11-28.update-policy-request/description :portkey.aws.organizations.-2016-11-28.update-policy-request/content]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policies (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/policy-summary))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/accept-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.invite-account-to-organization-request/target (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-party))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.invite-account-to-organization-request/notes (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-notes))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28.invite-account-to-organization-request/target] :opt-un [:portkey.aws.organizations.-2016-11-28.invite-account-to-organization-request/notes]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0020-\u007E]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-status #{:suspended :active "ACTIVE" "SUSPENDED"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/account]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-handshakes-for-account-request/filter (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-filter))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.list-handshakes-for-account-request/filter :portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-create-account-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/create-account-request-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.aws-organizations-not-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.aws-organizations-not-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/exception-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organizational-unit-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.organizational-unit-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organization-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.account-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/account-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.account-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enable-aws-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/service-principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy/content (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policy-summary :portkey.aws.organizations.-2016-11-28.policy/content]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/delete-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/organizational-unit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/max-results (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.detach-policy-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/detach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id :portkey.aws.organizations.-2016-11-28.detach-policy-request/target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.constraint-violation-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.constraint-violation-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/constraint-violation-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/constraint-violation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.constraint-violation-exception/message :portkey.aws.organizations.-2016-11-28.constraint-violation-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-organizational-unit-request/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/parent-id :portkey.aws.organizations.-2016-11-28.create-organizational-unit-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/enable-policy-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/root-id :portkey.aws.organizations.-2016-11-28/policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.access-denied-for-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.access-denied-for-dependency-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/access-denied-for-dependency-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/access-denied-for-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.access-denied-for-dependency-exception/message :portkey.aws.organizations.-2016-11-28.access-denied-for-dependency-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.source-parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/source-parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.source-parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-type-not-available-for-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type-not-available-for-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-type-not-available-for-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.target-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/target-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.target-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-status-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-status-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.create-account-status-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/policies :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.already-in-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/already-in-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.already-in-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-constraint-violation-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-constraint-violation-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.handshake-constraint-violation-exception/message :portkey.aws.organizations.-2016-11-28.handshake-constraint-violation-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.child/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/child-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.child/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/child-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/child (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.child/id :portkey.aws.organizations.-2016-11-28.child/type]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/disable-aws-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/service-principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshakes :portkey.aws.organizations.-2016-11-28/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organizational-unit-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.organizational-unit-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/action-type #{"ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" "ENABLE_ALL_FEATURES" "INVITE" :invite :enable-all-features :approve-all-features "APPROVE_ALL_FEATURES" :add-organizations-service-linked-role})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-failure-reason #{"INTERNAL_FAILURE" "CONCURRENT_ACCOUNT_MODIFICATION" :internal-failure :concurrent-account-modification :account-limit-exceeded "INVALID_ADDRESS" :invalid-email "ACCOUNT_LIMIT_EXCEEDED" "INVALID_EMAIL" "EMAIL_ALREADY_EXISTS" :email-already-exists :invalid-address})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-state #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.invalid-handshake-transition-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/invalid-handshake-transition-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.invalid-handshake-transition-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.master-cannot-leave-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/master-cannot-leave-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.master-cannot-leave-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type #{:service-control-policy "SERVICE_CONTROL_POLICY"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organizational-unit/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organizational-unit-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organizational-unit/arn (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organizational-unit-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.organizational-unit/name (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/organizational-unit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.organizational-unit/id :portkey.aws.organizations.-2016-11-28.organizational-unit/arn :portkey.aws.organizations.-2016-11-28.organizational-unit/name]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-type-already-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type-already-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-type-already-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/parents (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/parent))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.move-account-request/source-parent-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.move-account-request/destination-parent-id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/move-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/account-id :portkey.aws.organizations.-2016-11-28.move-account-request/source-parent-id :portkey.aws.organizations.-2016-11-28.move-account-request/destination-parent-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-party-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.duplicate-handshake-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/duplicate-handshake-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.duplicate-handshake-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.list-handshakes-for-organization-request/filter (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-filter))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.list-handshakes-for-organization-request/filter :portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/describe-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.create-account-request/iam-user-access-to-billing (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/iam-user-access-to-billing))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/email :portkey.aws.organizations.-2016-11-28/account-name] :opt-un [:portkey.aws.organizations.-2016-11-28/role-name :portkey.aws.organizations.-2016-11-28.create-account-request/iam-user-access-to-billing]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshakes (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/handshake))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.duplicate-account-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/duplicate-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.duplicate-account-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-party/id (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-party-id))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.handshake-party/type (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/handshake-party-type))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-party (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28.handshake-party/id :portkey.aws.organizations.-2016-11-28.handshake-party/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/child-type #{:organizational-unit :account "ACCOUNT" "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/cancel-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/create-account-states (clojure.spec.alpha/coll-of :portkey.aws.organizations.-2016-11-28/create-account-state))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/handshake-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:handshake\/o-[a-z0-9]{10,32}\/[a-z_]{1,32}\/h-[0-9a-z]{8,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.-2016-11-28/parent-id] :opt-un [:portkey.aws.organizations.-2016-11-28/next-token :portkey.aws.organizations.-2016-11-28/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28.policy-type-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/policy-type-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.-2016-11-28.policy-type-not-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.-2016-11-28/invalid-input-exception-reason #{:invalid-pattern-target-id "INVALID_SYNTAX_POLICY_ID" "INVALID_ENUM" :max-length-exceeded :invalid-syntax-organization-arn :immutable-policy :invalid-next-token :moving-account-between-different-roots "IMMUTABLE_POLICY" :invalid-role-name "UNRECOGNIZED_SERVICE_PRINCIPAL" "INVALID_PATTERN" :unrecognized-service-principal :invalid-list-member "INVALID_PARTY_TYPE_TARGET" "INVALID_PATTERN_TARGET_ID" :min-length-exceeded :invalid-full-name-target "MAX_LIMIT_EXCEEDED_FILTER" "MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS" "INVALID_ROLE_NAME" :invalid-party-type-target "MAX_LENGTH_EXCEEDED" :min-value-exceeded :input-required :invalid-enum :max-limit-exceeded-filter "MIN_LENGTH_EXCEEDED" "INVALID_SYNTAX_ORGANIZATION_ARN" "INVALID_FULL_NAME_TARGET" :max-value-exceeded :invalid-syntax-policy-id "MIN_VALUE_EXCEEDED" "INPUT_REQUIRED" "INVALID_NEXT_TOKEN" "MAX_VALUE_EXCEEDED" :invalid-pattern "INVALID_LIST_MEMBER"})

(clojure.core/defn move-account ([move-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-move-account-request move-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/move-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MoveAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "DestinationParentNotFoundException" :portkey.aws.organizations.-2016-11-28/destination-parent-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations.-2016-11-28/account-not-found-exception, "SourceParentNotFoundException" :portkey.aws.organizations.-2016-11-28/source-parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "DuplicateAccountException" :portkey.aws.organizations.-2016-11-28/duplicate-account-exception}})))))
(clojure.spec.alpha/fdef move-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/move-account-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts-for-parent ([list-accounts-for-parent-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-accounts-for-parent-request list-accounts-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccountsForParent", :http.request.configuration/output-deser-fn response-list-accounts-for-parent-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations.-2016-11-28/parent-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-accounts-for-parent-response))

(clojure.core/defn describe-handshake ([describe-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-handshake-request describe-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/describe-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHandshake", :http.request.configuration/output-deser-fn response-describe-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations.-2016-11-28/handshake-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/describe-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-handshake-response))

(clojure.core/defn update-policy ([update-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-policy-request update-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/update-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/update-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePolicy", :http.request.configuration/output-deser-fn response-update-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations.-2016-11-28/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations.-2016-11-28/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/update-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/update-policy-response))

(clojure.core/defn detach-policy ([detach-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-detach-policy-request detach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/detach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "PolicyNotAttachedException" :portkey.aws.organizations.-2016-11-28/policy-not-attached-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations.-2016-11-28/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/detach-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-handshakes-for-account ([] (list-handshakes-for-account {})) ([list-handshakes-for-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-handshakes-for-account-request list-handshakes-for-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHandshakesForAccount", :http.request.configuration/output-deser-fn response-list-handshakes-for-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-account :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-handshakes-for-account-response))

(clojure.core/defn list-create-account-status ([] (list-create-account-status {})) ([list-create-account-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-create-account-status-request list-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCreateAccountStatus", :http.request.configuration/output-deser-fn response-list-create-account-status-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-create-account-status :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-create-account-status-response))

(clojure.core/defn list-children ([list-children-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-children-request list-children-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-children-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-children-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListChildren", :http.request.configuration/output-deser-fn response-list-children-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations.-2016-11-28/parent-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-children :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-children-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-children-response))

(clojure.core/defn list-roots ([] (list-roots {})) ([list-roots-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-roots-request list-roots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-roots-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-roots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRoots", :http.request.configuration/output-deser-fn response-list-roots-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-roots :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-roots-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-roots-response))

(clojure.core/defn disable-aws-service-access ([disable-aws-service-access-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-aws-service-access-request disable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/disable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableAWSServiceAccess", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/disable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn list-policies ([list-policies-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPolicies", :http.request.configuration/output-deser-fn response-list-policies-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-policies-response))

(clojure.core/defn enable-all-features ([] (enable-all-features {})) ([enable-all-features-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-all-features-request enable-all-features-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/enable-all-features-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/enable-all-features-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAllFeatures", :http.request.configuration/output-deser-fn response-enable-all-features-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-all-features :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/enable-all-features-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/enable-all-features-response))

(clojure.core/defn create-organizational-unit ([create-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-organizational-unit-request create-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/create-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/create-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrganizationalUnit", :http.request.configuration/output-deser-fn response-create-organizational-unit-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations.-2016-11-28/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "ParentNotFoundException" :portkey.aws.organizations.-2016-11-28/parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/create-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-organizational-unit-response))

(clojure.core/defn leave-organization ([] (leave-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LeaveOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations.-2016-11-28/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations.-2016-11-28/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef leave-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn create-account ([create-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-account-request create-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/create-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/create-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccount", :http.request.configuration/output-deser-fn response-create-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "FinalizingOrganizationException" :portkey.aws.organizations.-2016-11-28/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/create-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-account-response))

(clojure.core/defn disable-policy-type ([disable-policy-type-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-policy-type-request disable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/disable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/disable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisablePolicyType", :http.request.configuration/output-deser-fn response-disable-policy-type-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations.-2016-11-28/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations.-2016-11-28/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef disable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/disable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/disable-policy-type-response))

(clojure.core/defn accept-handshake ([accept-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-accept-handshake-request accept-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/accept-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/accept-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptHandshake", :http.request.configuration/output-deser-fn response-accept-handshake-response, :http.request.spec/error-spec {"HandshakeNotFoundException" :portkey.aws.organizations.-2016-11-28/handshake-not-found-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations.-2016-11-28/handshake-already-in-state-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations.-2016-11-28/access-denied-for-dependency-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations.-2016-11-28/invalid-handshake-transition-exception}})))))
(clojure.spec.alpha/fdef accept-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/accept-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/accept-handshake-response))

(clojure.core/defn list-targets-for-policy ([list-targets-for-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-targets-for-policy-request list-targets-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTargetsForPolicy", :http.request.configuration/output-deser-fn response-list-targets-for-policy-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-targets-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-targets-for-policy-response))

(clojure.core/defn remove-account-from-organization ([remove-account-from-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-remove-account-from-organization-request remove-account-from-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/remove-account-from-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveAccountFromOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations.-2016-11-28/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations.-2016-11-28/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef remove-account-from-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/remove-account-from-organization-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts ([] (list-accounts {})) ([list-accounts-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-accounts-request list-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-accounts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccounts", :http.request.configuration/output-deser-fn response-list-accounts-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-accounts-response))

(clojure.core/defn delete-organizational-unit ([delete-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-organizational-unit-request delete-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/delete-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOrganizationalUnit", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "OrganizationalUnitNotEmptyException" :portkey.aws.organizations.-2016-11-28/organizational-unit-not-empty-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations.-2016-11-28/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/delete-organizational-unit-request) :ret clojure.core/true?)

(clojure.core/defn list-organizational-units-for-parent ([list-organizational-units-for-parent-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-organizational-units-for-parent-request list-organizational-units-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOrganizationalUnitsForParent", :http.request.configuration/output-deser-fn response-list-organizational-units-for-parent-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations.-2016-11-28/parent-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-organizational-units-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-organizational-units-for-parent-response))

(clojure.core/defn delete-organization ([] (delete-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "OrganizationNotEmptyException" :portkey.aws.organizations.-2016-11-28/organization-not-empty-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn invite-account-to-organization ([invite-account-to-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-invite-account-to-organization-request invite-account-to-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteAccountToOrganization", :http.request.configuration/output-deser-fn response-invite-account-to-organization-response, :http.request.spec/error-spec {"FinalizingOrganizationException" :portkey.aws.organizations.-2016-11-28/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "AccountOwnerNotVerifiedException" :portkey.aws.organizations.-2016-11-28/account-owner-not-verified-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations.-2016-11-28/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "DuplicateHandshakeException" :portkey.aws.organizations.-2016-11-28/duplicate-handshake-exception}})))))
(clojure.spec.alpha/fdef invite-account-to-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/invite-account-to-organization-response))

(clojure.core/defn list-handshakes-for-organization ([] (list-handshakes-for-organization {})) ([list-handshakes-for-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-handshakes-for-organization-request list-handshakes-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHandshakesForOrganization", :http.request.configuration/output-deser-fn response-list-handshakes-for-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-handshakes-for-organization-response))

(clojure.core/defn describe-policy ([describe-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-policy-request describe-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/describe-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePolicy", :http.request.configuration/output-deser-fn response-describe-policy-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/describe-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-policy-response))

(clojure.core/defn describe-create-account-status ([describe-create-account-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-create-account-status-request describe-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/describe-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCreateAccountStatus", :http.request.configuration/output-deser-fn response-describe-create-account-status-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "CreateAccountStatusNotFoundException" :portkey.aws.organizations.-2016-11-28/create-account-status-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-create-account-status :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/describe-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-create-account-status-response))

(clojure.core/defn describe-organizational-unit ([describe-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-organizational-unit-request describe-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOrganizationalUnit", :http.request.configuration/output-deser-fn response-describe-organizational-unit-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations.-2016-11-28/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-organizational-unit-response))

(clojure.core/defn decline-handshake ([decline-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-decline-handshake-request decline-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/decline-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/decline-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeclineHandshake", :http.request.configuration/output-deser-fn response-decline-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations.-2016-11-28/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations.-2016-11-28/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations.-2016-11-28/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef decline-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/decline-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/decline-handshake-response))

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/create-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePolicy", :http.request.configuration/output-deser-fn response-create-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations.-2016-11-28/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations.-2016-11-28/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations.-2016-11-28/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-policy-response))

(clojure.core/defn list-policies-for-target ([list-policies-for-target-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-policies-for-target-request list-policies-for-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-policies-for-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-policies-for-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPoliciesForTarget", :http.request.configuration/output-deser-fn response-list-policies-for-target-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TargetNotFoundException" :portkey.aws.organizations.-2016-11-28/target-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies-for-target :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-policies-for-target-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-policies-for-target-response))

(clojure.core/defn enable-policy-type ([enable-policy-type-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-policy-type-request enable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/enable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/enable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnablePolicyType", :http.request.configuration/output-deser-fn response-enable-policy-type-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations.-2016-11-28/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations.-2016-11-28/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "PolicyTypeAlreadyEnabledException" :portkey.aws.organizations.-2016-11-28/policy-type-already-enabled-exception}})))))
(clojure.spec.alpha/fdef enable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/enable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/enable-policy-type-response))

(clojure.core/defn describe-account ([describe-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-account-request describe-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/describe-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccount", :http.request.configuration/output-deser-fn response-describe-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AccountNotFoundException" :portkey.aws.organizations.-2016-11-28/account-not-found-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/describe-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-account-response))

(clojure.core/defn list-parents ([list-parents-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-parents-request list-parents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-parents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-parents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListParents", :http.request.configuration/output-deser-fn response-list-parents-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ChildNotFoundException" :portkey.aws.organizations.-2016-11-28/child-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-parents :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/list-parents-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-parents-response))

(clojure.core/defn cancel-handshake ([cancel-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-handshake-request cancel-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/cancel-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/cancel-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelHandshake", :http.request.configuration/output-deser-fn response-cancel-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations.-2016-11-28/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations.-2016-11-28/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations.-2016-11-28/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef cancel-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/cancel-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/cancel-handshake-response))

(clojure.core/defn enable-aws-service-access ([enable-aws-service-access-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-aws-service-access-request enable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/enable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAWSServiceAccess", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/enable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn attach-policy ([attach-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-attach-policy-request attach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/attach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "DuplicatePolicyAttachmentException" :portkey.aws.organizations.-2016-11-28/duplicate-policy-attachment-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations.-2016-11-28/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations.-2016-11-28/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/attach-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-organization ([] (describe-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/describe-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOrganization", :http.request.configuration/output-deser-fn response-describe-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organization :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/describe-organization-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/delete-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "PolicyInUseException" :portkey.aws.organizations.-2016-11-28/policy-in-use-exception, "PolicyNotFoundException" :portkey.aws.organizations.-2016-11-28/policy-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-organizational-unit ([update-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-organizational-unit-request update-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/update-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/update-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateOrganizationalUnit", :http.request.configuration/output-deser-fn response-update-organizational-unit-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations.-2016-11-28/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations.-2016-11-28/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations.-2016-11-28/update-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/update-organizational-unit-response))

(clojure.core/defn create-organization ([] (create-organization {})) ([create-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-organization-request create-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/create-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/create-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrganization", :http.request.configuration/output-deser-fn response-create-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AlreadyInOrganizationException" :portkey.aws.organizations.-2016-11-28/already-in-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations.-2016-11-28/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations.-2016-11-28/access-denied-for-dependency-exception}})))))
(clojure.spec.alpha/fdef create-organization :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/create-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/create-organization-response))

(clojure.core/defn list-aws-service-access-for-organization ([] (list-aws-service-access-for-organization {})) ([list-aws-service-access-for-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-aws-service-access-for-organization-request list-aws-service-access-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations.-2016-11-28/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAWSServiceAccessForOrganization", :http.request.configuration/output-deser-fn response-list-aws-service-access-for-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations.-2016-11-28/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations.-2016-11-28/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations.-2016-11-28/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations.-2016-11-28/invalid-input-exception, "ServiceException" :portkey.aws.organizations.-2016-11-28/service-exception, "TooManyRequestsException" :portkey.aws.organizations.-2016-11-28/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aws-service-access-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations.-2016-11-28/list-aws-service-access-for-organization-response))
