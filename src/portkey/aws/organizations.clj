(ns portkey.aws.organizations (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.organizations.organization-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/organization-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organization-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/cancel-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-constraint-violation-exception-reason #{:organization-already-has-all-features :invite-disabled-during-enable-all-features :organization-membership-change-rate-limit-exceeded "PAYMENT_INSTRUMENT_REQUIRED" "ALREADY_IN_AN_ORGANIZATION" :organization-from-different-seller-of-record "INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES" "HANDSHAKE_RATE_LIMIT_EXCEEDED" :payment-instrument-required "ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD" :handshake-rate-limit-exceeded :account-number-limit-exceeded :already-in-an-organization "ORGANIZATION_ALREADY_HAS_ALL_FEATURES" "ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations/list-parents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/child-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/child-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/iam-user-access-to-billing #{"DENY" :allow "ALLOW" :deny})

(clojure.spec.alpha/def :portkey.aws.organizations/disable-policy-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/root]))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.handshake-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/children (clojure.spec.alpha/coll-of :portkey.aws.organizations/child))

(clojure.spec.alpha/def :portkey.aws.organizations.list-targets-for-policy-response/targets (clojure.spec.alpha/and :portkey.aws.organizations/policy-targets))
(clojure.spec.alpha/def :portkey.aws.organizations/list-targets-for-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.list-targets-for-policy-response/targets :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.parent/id (clojure.spec.alpha/and :portkey.aws.organizations/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations.parent/type (clojure.spec.alpha/and :portkey.aws.organizations/parent-type))
(clojure.spec.alpha/def :portkey.aws.organizations/parent (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.parent/id :portkey.aws.organizations.parent/type]))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-filter/parent-handshake-id (clojure.spec.alpha/and :portkey.aws.organizations/handshake-id))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/action-type :portkey.aws.organizations.handshake-filter/parent-handshake-id]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-children-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/parent-id :portkey.aws.organizations/child-type] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/enabled-service-principals (clojure.spec.alpha/coll-of :portkey.aws.organizations/enabled-service-principal))

(clojure.spec.alpha/def :portkey.aws.organizations/organization-feature-set #{:consolidated-billing :all "CONSOLIDATED_BILLING" "ALL"})

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-already-in-state-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-already-in-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.handshake-already-in-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-status #{"PENDING_DISABLE" :pending-enable "PENDING_ENABLE" "ENABLED" :pending-disable :enabled})

(clojure.spec.alpha/def :portkey.aws.organizations/generic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::.+:.+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-units (clojure.spec.alpha/coll-of :portkey.aws.organizations/organizational-unit))

(clojure.spec.alpha/def :portkey.aws.organizations/list-aws-service-access-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/enabled-service-principals :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 6 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[^\s@]+@[^\s@]+\.[^\s@]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-create-account-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/create-account-statuses :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/accept-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-resources (clojure.spec.alpha/coll-of :portkey.aws.organizations/handshake-resource))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.organization/id (clojure.spec.alpha/and :portkey.aws.organizations/organization-id))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/arn (clojure.spec.alpha/and :portkey.aws.organizations/organization-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/feature-set (clojure.spec.alpha/and :portkey.aws.organizations/organization-feature-set))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/master-account-arn (clojure.spec.alpha/and :portkey.aws.organizations/account-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/master-account-id (clojure.spec.alpha/and :portkey.aws.organizations/account-id))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/master-account-email (clojure.spec.alpha/and :portkey.aws.organizations/email))
(clojure.spec.alpha/def :portkey.aws.organizations.organization/available-policy-types (clojure.spec.alpha/and :portkey.aws.organizations/policy-types))
(clojure.spec.alpha/def :portkey.aws.organizations/organization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organization/id :portkey.aws.organizations.organization/arn :portkey.aws.organizations.organization/feature-set :portkey.aws.organizations.organization/master-account-arn :portkey.aws.organizations.organization/master-account-id :portkey.aws.organizations.organization/master-account-email :portkey.aws.organizations.organization/available-policy-types]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations/update-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-for-parent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/parent-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.finalizing-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/finalizing-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.finalizing-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-parents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/parents :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\w+=,.@-]{1,64}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/id (clojure.spec.alpha/and :portkey.aws.organizations/policy-id))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/arn (clojure.spec.alpha/and :portkey.aws.organizations/policy-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/name (clojure.spec.alpha/and :portkey.aws.organizations/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/description (clojure.spec.alpha/and :portkey.aws.organizations/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/type (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-summary/aws-managed (clojure.spec.alpha/and :portkey.aws.organizations/aws-managed-policy))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-summary/id :portkey.aws.organizations.policy-summary/arn :portkey.aws.organizations.policy-summary/name :portkey.aws.organizations.policy-summary/description :portkey.aws.organizations.policy-summary/type :portkey.aws.organizations.policy-summary/aws-managed]))

(clojure.spec.alpha/def :portkey.aws.organizations.attach-policy-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations/attach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id :portkey.aws.organizations.attach-policy-request/target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/list-roots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-policies-for-target-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policies :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-create-account-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/create-account-status]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-for-parent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/accounts :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.root/id (clojure.spec.alpha/and :portkey.aws.organizations/root-id))
(clojure.spec.alpha/def :portkey.aws.organizations.root/arn (clojure.spec.alpha/and :portkey.aws.organizations/root-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.root/name (clojure.spec.alpha/and :portkey.aws.organizations/root-name))
(clojure.spec.alpha/def :portkey.aws.organizations/root (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.root/id :portkey.aws.organizations.root/arn :portkey.aws.organizations.root/name :portkey.aws.organizations/policy-types]))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-statuses (clojure.spec.alpha/coll-of :portkey.aws.organizations/create-account-status))

(clojure.spec.alpha/def :portkey.aws.organizations.service-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-notes (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-organizational-units-for-parent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organizational-units :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/remove-account-from-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/parent-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.organizations/target-type #{"ROOT" :organizational-unit :account "ACCOUNT" :root "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations/decline-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.destination-parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/destination-parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.destination-parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-targets (clojure.spec.alpha/coll-of :portkey.aws.organizations/policy-target-summary))

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/enable-all-features-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^o-[a-z0-9]{10,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-state #{:open "CANCELED" "ACCEPTED" "OPEN" "EXPIRED" "DECLINED" :accepted :canceled :declined :expired :requested "REQUESTED"})

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/accounts :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/organizational-unit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1000000))))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^car-[a-z0-9]{8,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-types (clojure.spec.alpha/coll-of :portkey.aws.organizations/policy-type-summary))

(clojure.spec.alpha/def :portkey.aws.organizations/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations/decline-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.account-owner-not-verified-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/account-owner-not-verified-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.account-owner-not-verified-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-party-type #{:email "ORGANIZATION" :organization :account "ACCOUNT" "EMAIL"})

(clojure.spec.alpha/def :portkey.aws.organizations.policy-not-attached-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-not-attached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-not-attached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.list-create-account-status-request/states (clojure.spec.alpha/and :portkey.aws.organizations/create-account-states))
(clojure.spec.alpha/def :portkey.aws.organizations/list-create-account-status-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.list-create-account-status-request/states :portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.organizations/exception-type))
(clojure.spec.alpha/def :portkey.aws.organizations.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.too-many-requests-exception/type :portkey.aws.organizations.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-policy-request/content (clojure.spec.alpha/and :portkey.aws.organizations/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations.create-policy-request/description (clojure.spec.alpha/and :portkey.aws.organizations/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.create-policy-request/name (clojure.spec.alpha/and :portkey.aws.organizations/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.create-policy-request/type (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations/create-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.create-policy-request/content :portkey.aws.organizations.create-policy-request/description :portkey.aws.organizations.create-policy-request/name :portkey.aws.organizations.create-policy-request/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/list-children-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/children :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake/id (clojure.spec.alpha/and :portkey.aws.organizations/handshake-id))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/arn (clojure.spec.alpha/and :portkey.aws.organizations/handshake-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/parties (clojure.spec.alpha/and :portkey.aws.organizations/handshake-parties))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/state (clojure.spec.alpha/and :portkey.aws.organizations/handshake-state))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/requested-timestamp (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/expiration-timestamp (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/action (clojure.spec.alpha/and :portkey.aws.organizations/action-type))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake/resources (clojure.spec.alpha/and :portkey.aws.organizations/handshake-resources))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.handshake/id :portkey.aws.organizations.handshake/arn :portkey.aws.organizations.handshake/parties :portkey.aws.organizations.handshake/state :portkey.aws.organizations.handshake/requested-timestamp :portkey.aws.organizations.handshake/expiration-timestamp :portkey.aws.organizations.handshake/action :portkey.aws.organizations.handshake/resources]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-aws-service-access-for-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.child-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/child-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.child-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-target-summary/target-id (clojure.spec.alpha/and :portkey.aws.organizations/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-target-summary/arn (clojure.spec.alpha/and :portkey.aws.organizations/generic-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-target-summary/name (clojure.spec.alpha/and :portkey.aws.organizations/target-name))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-target-summary/type (clojure.spec.alpha/and :portkey.aws.organizations/target-type))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-target-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-target-summary/target-id :portkey.aws.organizations.policy-target-summary/arn :portkey.aws.organizations.policy-target-summary/name :portkey.aws.organizations.policy-target-summary/type]))

(clojure.spec.alpha/def :portkey.aws.organizations/parent-type #{"ROOT" :organizational-unit :root "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations/list-targets-for-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^p-[0-9a-zA-Z_]{8,128}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.root-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/root-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.root-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-roots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/roots :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/create-account-status]))

(clojure.spec.alpha/def :portkey.aws.organizations/root-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:root\/o-[a-z0-9]{10,32}\/r-[0-9a-z]{4,32}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-resource-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organization]))

(clojure.spec.alpha/def :portkey.aws.organizations/enable-all-features-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/create-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organization]))

(clojure.spec.alpha/def :portkey.aws.organizations/roots (clojure.spec.alpha/coll-of :portkey.aws.organizations/root))

(clojure.spec.alpha/def :portkey.aws.organizations/disable-policy-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/root-id :portkey.aws.organizations/policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-parties (clojure.spec.alpha/coll-of :portkey.aws.organizations/handshake-party))

(clojure.spec.alpha/def :portkey.aws.organizations/enable-policy-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/root]))

(clojure.spec.alpha/def :portkey.aws.organizations/accounts (clojure.spec.alpha/coll-of :portkey.aws.organizations/account))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-resource/value (clojure.spec.alpha/and :portkey.aws.organizations/handshake-resource-value))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake-resource/type (clojure.spec.alpha/and :portkey.aws.organizations/handshake-resource-type))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake-resource/resources (clojure.spec.alpha/and :portkey.aws.organizations/handshake-resources))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.handshake-resource/value :portkey.aws.organizations.handshake-resource/type :portkey.aws.organizations.handshake-resource/resources]))

(clojure.spec.alpha/def :portkey.aws.organizations/update-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations/root-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status/id (clojure.spec.alpha/and :portkey.aws.organizations/create-account-request-id))
(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status/state (clojure.spec.alpha/and :portkey.aws.organizations/create-account-state))
(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status/requested-timestamp (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status/completed-timestamp (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status/failure-reason (clojure.spec.alpha/and :portkey.aws.organizations/create-account-failure-reason))
(clojure.spec.alpha/def :portkey.aws.organizations/create-account-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.create-account-status/id :portkey.aws.organizations/account-name :portkey.aws.organizations.create-account-status/state :portkey.aws.organizations.create-account-status/requested-timestamp :portkey.aws.organizations.create-account-status/completed-timestamp :portkey.aws.organizations/account-id :portkey.aws.organizations.create-account-status/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.account/id (clojure.spec.alpha/and :portkey.aws.organizations/account-id))
(clojure.spec.alpha/def :portkey.aws.organizations.account/arn (clojure.spec.alpha/and :portkey.aws.organizations/account-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.account/name (clojure.spec.alpha/and :portkey.aws.organizations/account-name))
(clojure.spec.alpha/def :portkey.aws.organizations.account/status (clojure.spec.alpha/and :portkey.aws.organizations/account-status))
(clojure.spec.alpha/def :portkey.aws.organizations.account/joined-method (clojure.spec.alpha/and :portkey.aws.organizations/account-joined-method))
(clojure.spec.alpha/def :portkey.aws.organizations.account/joined-timestamp (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations/account (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.account/id :portkey.aws.organizations.account/arn :portkey.aws.organizations/email :portkey.aws.organizations.account/name :portkey.aws.organizations.account/status :portkey.aws.organizations.account/joined-method :portkey.aws.organizations.account/joined-timestamp]))

(clojure.spec.alpha/def :portkey.aws.organizations/root-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^r-[0-9a-z]{4,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-organizational-unit-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-organizational-unit-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-organizational-unit-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.invalid-input-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations/invalid-input-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.invalid-input-exception/message :portkey.aws.organizations.invalid-input-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.update-organizational-unit-request/name (clojure.spec.alpha/and :portkey.aws.organizations/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations/update-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/organizational-unit-id] :opt-un [:portkey.aws.organizations.update-organizational-unit-request/name]))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^h-[0-9a-z]{8,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/create-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-summary/type (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-summary/status (clojure.spec.alpha/and :portkey.aws.organizations/policy-type-status))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-summary/type :portkey.aws.organizations.policy-type-summary/status]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-organization-request/feature-set (clojure.spec.alpha/and :portkey.aws.organizations/organization-feature-set))
(clojure.spec.alpha/def :portkey.aws.organizations/create-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.create-organization-request/feature-set]))

(clojure.spec.alpha/def :portkey.aws.organizations.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^\d{12}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-handshakes-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshakes :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/constraint-violation-exception-reason #{:master-account-missing-contact-info "MASTER_ACCOUNT_MISSING_CONTACT_INFO" "ACCOUNT_CANNOT_LEAVE_ORGANIZATION" :email-verification-code-expired "MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" "MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE" :min-policy-type-attachment-limit-exceeded "ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED" "HANDSHAKE_RATE_LIMIT_EXCEEDED" "EMAIL_VERIFICATION_CODE_EXPIRED" "ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION" :handshake-rate-limit-exceeded :account-number-limit-exceeded "MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "OU_DEPTH_LIMIT_EXCEEDED" "ORGANIZATION_NOT_IN_ALL_FEATURES_MODE" "WAIT_PERIOD_ACTIVE" :organization-not-in-all-features-mode :policy-number-limit-exceeded :wait-period-active :account-cannot-leave-organization :ou-number-limit-exceeded "OU_NUMBER_LIMIT_EXCEEDED" :master-account-address-does-not-match-marketplace :max-policy-type-attachment-limit-exceeded :master-account-payment-instrument-required "MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" :member-account-payment-instrument-required :account-cannot-leave-without-eula :account-cannot-leave-without-phone-verification "POLICY_NUMBER_LIMIT_EXCEEDED" :ou-depth-limit-exceeded "ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA" :account-creation-rate-limit-exceeded "MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations/policy-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\/[0-9a-z_]+\/p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-z_]+\/p-[0-9a-zA-Z_]{10,128})" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-policy-attachment-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-policy-attachment-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-policy-attachment-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/aws-managed-policy clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-resource-type #{:email "ORGANIZATION" "MASTER_EMAIL" :master-email "NOTES" :organization :master-name :account :parent-handshake :organization-feature-set "PARENT_HANDSHAKE" "ACCOUNT" :notes "ORGANIZATION_FEATURE_SET" "EMAIL" "MASTER_NAME"})

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-policy-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.list-policies-for-target-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations.list-policies-for-target-request/filter (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations/list-policies-for-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.list-policies-for-target-request/target-id :portkey.aws.organizations.list-policies-for-target-request/filter] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/access-denied-for-dependency-exception-reason #{"ACCESS_DENIED_DURING_CREATE_SERVICE_LINKED_ROLE" :access-denied-during-create-service-linked-role})

(clojure.spec.alpha/def :portkey.aws.organizations.list-policies-request/filter (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations/list-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.list-policies-request/filter] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-joined-method #{:invited "INVITED" :created "CREATED"})

(clojure.spec.alpha/def :portkey.aws.organizations.enabled-service-principal/date-enabled (clojure.spec.alpha/and :portkey.aws.organizations/timestamp))
(clojure.spec.alpha/def :portkey.aws.organizations/enabled-service-principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/service-principal :portkey.aws.organizations.enabled-service-principal/date-enabled]))

(clojure.spec.alpha/def :portkey.aws.organizations.update-policy-request/name (clojure.spec.alpha/and :portkey.aws.organizations/policy-name))
(clojure.spec.alpha/def :portkey.aws.organizations.update-policy-request/description (clojure.spec.alpha/and :portkey.aws.organizations/policy-description))
(clojure.spec.alpha/def :portkey.aws.organizations.update-policy-request/content (clojure.spec.alpha/and :portkey.aws.organizations/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations/update-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id] :opt-un [:portkey.aws.organizations.update-policy-request/name :portkey.aws.organizations.update-policy-request/description :portkey.aws.organizations.update-policy-request/content]))

(clojure.spec.alpha/def :portkey.aws.organizations/policies (clojure.spec.alpha/coll-of :portkey.aws.organizations/policy-summary))

(clojure.spec.alpha/def :portkey.aws.organizations/accept-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.invite-account-to-organization-request/target (clojure.spec.alpha/and :portkey.aws.organizations/handshake-party))
(clojure.spec.alpha/def :portkey.aws.organizations.invite-account-to-organization-request/notes (clojure.spec.alpha/and :portkey.aws.organizations/handshake-notes))
(clojure.spec.alpha/def :portkey.aws.organizations/invite-account-to-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.invite-account-to-organization-request/target] :opt-un [:portkey.aws.organizations.invite-account-to-organization-request/notes]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 50)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\u007E]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/account-status #{:suspended :active "ACTIVE" "SUSPENDED"})

(clojure.spec.alpha/def :portkey.aws.organizations/describe-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/account]))

(clojure.spec.alpha/def :portkey.aws.organizations.list-handshakes-for-account-request/filter (clojure.spec.alpha/and :portkey.aws.organizations/handshake-filter))
(clojure.spec.alpha/def :portkey.aws.organizations/list-handshakes-for-account-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.list-handshakes-for-account-request/filter :portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-create-account-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/create-account-request-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.aws-organizations-not-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/aws-organizations-not-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.aws-organizations-not-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/exception-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.organizations.organizational-unit-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organizational-unit-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/organization-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.account-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/account-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.account-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.organizations/enable-aws-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/service-principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations.policy/content (clojure.spec.alpha/and :portkey.aws.organizations/policy-content))
(clojure.spec.alpha/def :portkey.aws.organizations/policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policy-summary :portkey.aws.organizations.policy/content]))

(clojure.spec.alpha/def :portkey.aws.organizations/delete-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/organizational-unit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/max-results (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.organizations.detach-policy-request/target-id (clojure.spec.alpha/and :portkey.aws.organizations/policy-target-id))
(clojure.spec.alpha/def :portkey.aws.organizations/detach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id :portkey.aws.organizations.detach-policy-request/target-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.constraint-violation-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.constraint-violation-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations/constraint-violation-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations/constraint-violation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.constraint-violation-exception/message :portkey.aws.organizations.constraint-violation-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-organizational-unit-request/name (clojure.spec.alpha/and :portkey.aws.organizations/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations/create-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/parent-id :portkey.aws.organizations.create-organizational-unit-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/enable-policy-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/root-id :portkey.aws.organizations/policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/create-organizational-unit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organizational-unit]))

(clojure.spec.alpha/def :portkey.aws.organizations.access-denied-for-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.access-denied-for-dependency-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations/access-denied-for-dependency-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations/access-denied-for-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.access-denied-for-dependency-exception/message :portkey.aws.organizations.access-denied-for-dependency-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.source-parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/source-parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.source-parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-not-available-for-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-not-available-for-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-not-available-for-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.target-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/target-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.target-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-account-status-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/create-account-status-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.create-account-status-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policies :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.already-in-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/already-in-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.already-in-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-constraint-violation-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake-constraint-violation-exception/reason (clojure.spec.alpha/and :portkey.aws.organizations/handshake-constraint-violation-exception-reason))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-constraint-violation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.handshake-constraint-violation-exception/message :portkey.aws.organizations.handshake-constraint-violation-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.organizations.child/id (clojure.spec.alpha/and :portkey.aws.organizations/child-id))
(clojure.spec.alpha/def :portkey.aws.organizations.child/type (clojure.spec.alpha/and :portkey.aws.organizations/child-type))
(clojure.spec.alpha/def :portkey.aws.organizations/child (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.child/id :portkey.aws.organizations.child/type]))

(clojure.spec.alpha/def :portkey.aws.organizations/disable-aws-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/service-principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-handshakes-for-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshakes :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations.organizational-unit-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organizational-unit-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/action-type #{"ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" "ENABLE_ALL_FEATURES" "INVITE" :invite :enable-all-features :approve-all-features "APPROVE_ALL_FEATURES" :add-organizations-service-linked-role})

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-failure-reason #{"INTERNAL_FAILURE" "CONCURRENT_ACCOUNT_MODIFICATION" :internal-failure :concurrent-account-modification :account-limit-exceeded "INVALID_ADDRESS" :invalid-email "ACCOUNT_LIMIT_EXCEEDED" "INVALID_EMAIL" "EMAIL_ALREADY_EXISTS" :email-already-exists :invalid-address})

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-state #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.organizations.invalid-handshake-transition-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/invalid-handshake-transition-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.invalid-handshake-transition-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.master-cannot-leave-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/master-cannot-leave-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.master-cannot-leave-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-type #{:service-control-policy "SERVICE_CONTROL_POLICY"})

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.organizational-unit/id (clojure.spec.alpha/and :portkey.aws.organizations/organizational-unit-id))
(clojure.spec.alpha/def :portkey.aws.organizations.organizational-unit/arn (clojure.spec.alpha/and :portkey.aws.organizations/organizational-unit-arn))
(clojure.spec.alpha/def :portkey.aws.organizations.organizational-unit/name (clojure.spec.alpha/and :portkey.aws.organizations/organizational-unit-name))
(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organizational-unit/id :portkey.aws.organizations.organizational-unit/arn :portkey.aws.organizations.organizational-unit/name]))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-already-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-already-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-already-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/parents (clojure.spec.alpha/coll-of :portkey.aws.organizations/parent))

(clojure.spec.alpha/def :portkey.aws.organizations.move-account-request/source-parent-id (clojure.spec.alpha/and :portkey.aws.organizations/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations.move-account-request/destination-parent-id (clojure.spec.alpha/and :portkey.aws.organizations/parent-id))
(clojure.spec.alpha/def :portkey.aws.organizations/move-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/account-id :portkey.aws.organizations.move-account-request/source-parent-id :portkey.aws.organizations.move-account-request/destination-parent-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-party-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-handshake-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-handshake-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-handshake-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.list-handshakes-for-organization-request/filter (clojure.spec.alpha/and :portkey.aws.organizations/handshake-filter))
(clojure.spec.alpha/def :portkey.aws.organizations/list-handshakes-for-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.list-handshakes-for-organization-request/filter :portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.create-account-request/iam-user-access-to-billing (clojure.spec.alpha/and :portkey.aws.organizations/iam-user-access-to-billing))
(clojure.spec.alpha/def :portkey.aws.organizations/create-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/email :portkey.aws.organizations/account-name] :opt-un [:portkey.aws.organizations/role-name :portkey.aws.organizations.create-account-request/iam-user-access-to-billing]))

(clojure.spec.alpha/def :portkey.aws.organizations/handshakes (clojure.spec.alpha/coll-of :portkey.aws.organizations/handshake))

(clojure.spec.alpha/def :portkey.aws.organizations/invite-account-to-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-account-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-account-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-account-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations.handshake-party/id (clojure.spec.alpha/and :portkey.aws.organizations/handshake-party-id))
(clojure.spec.alpha/def :portkey.aws.organizations.handshake-party/type (clojure.spec.alpha/and :portkey.aws.organizations/handshake-party-type))
(clojure.spec.alpha/def :portkey.aws.organizations/handshake-party (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations.handshake-party/id :portkey.aws.organizations.handshake-party/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/child-type #{:organizational-unit :account "ACCOUNT" "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations/cancel-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-states (clojure.spec.alpha/coll-of :portkey.aws.organizations/create-account-state))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:handshake\/o-[a-z0-9]{10,32}\/[a-z_]{1,32}\/h-[0-9a-z]{8,32}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-organizational-units-for-parent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/parent-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-not-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/invalid-input-exception-reason #{:invalid-pattern-target-id "INVALID_SYNTAX_POLICY_ID" "INVALID_ENUM" :max-length-exceeded :invalid-syntax-organization-arn :immutable-policy :invalid-next-token :moving-account-between-different-roots "IMMUTABLE_POLICY" :invalid-role-name "UNRECOGNIZED_SERVICE_PRINCIPAL" "INVALID_PATTERN" :unrecognized-service-principal :invalid-list-member "INVALID_PARTY_TYPE_TARGET" "INVALID_PATTERN_TARGET_ID" :min-length-exceeded :invalid-full-name-target "MAX_LIMIT_EXCEEDED_FILTER" "MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS" "INVALID_ROLE_NAME" :invalid-party-type-target "MAX_LENGTH_EXCEEDED" :min-value-exceeded :input-required :invalid-enum :max-limit-exceeded-filter "MIN_LENGTH_EXCEEDED" "INVALID_SYNTAX_ORGANIZATION_ARN" "INVALID_FULL_NAME_TARGET" :max-value-exceeded :invalid-syntax-policy-id "MIN_VALUE_EXCEEDED" "INPUT_REQUIRED" "INVALID_NEXT_TOKEN" "MAX_VALUE_EXCEEDED" :invalid-pattern "INVALID_LIST_MEMBER"})

(clojure.core/defn move-account ([move-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-move-account-request move-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/move-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "MoveAccount", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "DestinationParentNotFoundException" :portkey.aws.organizations/destination-parent-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "SourceParentNotFoundException" :portkey.aws.organizations/source-parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateAccountException" :portkey.aws.organizations/duplicate-account-exception}})))))
(clojure.spec.alpha/fdef move-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/move-account-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts-for-parent ([list-accounts-for-parent-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-accounts-for-parent-request list-accounts-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-accounts-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-accounts-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAccountsForParent", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-accounts-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-accounts-for-parent-response))

(clojure.core/defn describe-handshake ([describe-handshake-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-handshake-request describe-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeHandshake", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-handshake-response))

(clojure.core/defn update-policy ([update-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-policy-request update-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/update-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/update-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePolicy", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/update-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/update-policy-response))

(clojure.core/defn detach-policy ([detach-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-detach-policy-request detach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/detach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachPolicy", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "PolicyNotAttachedException" :portkey.aws.organizations/policy-not-attached-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/detach-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-handshakes-for-account ([] (list-handshakes-for-account {})) ([list-handshakes-for-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-handshakes-for-account-request list-handshakes-for-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-handshakes-for-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-handshakes-for-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHandshakesForAccount", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-account :args (clojure.spec.alpha/? :portkey.aws.organizations/list-handshakes-for-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-handshakes-for-account-response))

(clojure.core/defn list-create-account-status ([] (list-create-account-status {})) ([list-create-account-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-create-account-status-request list-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCreateAccountStatus", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-create-account-status :args (clojure.spec.alpha/? :portkey.aws.organizations/list-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-create-account-status-response))

(clojure.core/defn list-children ([list-children-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-children-request list-children-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-children-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-children-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListChildren", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-children :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-children-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-children-response))

(clojure.core/defn list-roots ([] (list-roots {})) ([list-roots-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-roots-request list-roots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-roots-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-roots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRoots", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-roots :args (clojure.spec.alpha/? :portkey.aws.organizations/list-roots-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-roots-response))

(clojure.core/defn disable-aws-service-access ([disable-aws-service-access-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-aws-service-access-request disable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/disable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableAWSServiceAccess", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations/disable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn list-policies ([list-policies-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicies", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-policies-response))

(clojure.core/defn enable-all-features ([] (enable-all-features {})) ([enable-all-features-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-all-features-request enable-all-features-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/enable-all-features-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-all-features-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableAllFeatures", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-all-features :args (clojure.spec.alpha/? :portkey.aws.organizations/enable-all-features-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/enable-all-features-response))

(clojure.core/defn create-organizational-unit ([create-organizational-unit-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-organizational-unit-request create-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/create-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateOrganizationalUnit", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-organizational-unit-response))

(clojure.core/defn leave-organization ([] (leave-organization {})) ([_] (clojure.core/let [request-function-result__28606__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "LeaveOrganization", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef leave-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn create-account ([create-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-account-request create-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/create-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAccount", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "FinalizingOrganizationException" :portkey.aws.organizations/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-account-response))

(clojure.core/defn disable-policy-type ([disable-policy-type-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disable-policy-type-request disable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/disable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/disable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisablePolicyType", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef disable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations/disable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/disable-policy-type-response))

(clojure.core/defn accept-handshake ([accept-handshake-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-accept-handshake-request accept-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/accept-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/accept-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptHandshake", :http.request.spec/error-spec {"HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations/access-denied-for-dependency-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception}})))))
(clojure.spec.alpha/fdef accept-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/accept-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/accept-handshake-response))

(clojure.core/defn list-targets-for-policy ([list-targets-for-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-targets-for-policy-request list-targets-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-targets-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-targets-for-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTargetsForPolicy", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-targets-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-targets-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-targets-for-policy-response))

(clojure.core/defn remove-account-from-organization ([remove-account-from-organization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-remove-account-from-organization-request remove-account-from-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/remove-account-from-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveAccountFromOrganization", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef remove-account-from-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations/remove-account-from-organization-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts ([] (list-accounts {})) ([list-accounts-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-accounts-request list-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-accounts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAccounts", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts :args (clojure.spec.alpha/? :portkey.aws.organizations/list-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-accounts-response))

(clojure.core/defn delete-organizational-unit ([delete-organizational-unit-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-organizational-unit-request delete-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/delete-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteOrganizationalUnit", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotEmptyException" :portkey.aws.organizations/organizational-unit-not-empty-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/delete-organizational-unit-request) :ret clojure.core/true?)

(clojure.core/defn list-organizational-units-for-parent ([list-organizational-units-for-parent-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-organizational-units-for-parent-request list-organizational-units-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-organizational-units-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-organizational-units-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOrganizationalUnitsForParent", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-organizational-units-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-organizational-units-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-organizational-units-for-parent-response))

(clojure.core/defn delete-organization ([] (delete-organization {})) ([_] (clojure.core/let [request-function-result__28606__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteOrganization", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationNotEmptyException" :portkey.aws.organizations/organization-not-empty-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn invite-account-to-organization ([invite-account-to-organization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-invite-account-to-organization-request invite-account-to-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/invite-account-to-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/invite-account-to-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InviteAccountToOrganization", :http.request.spec/error-spec {"FinalizingOrganizationException" :portkey.aws.organizations/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations/service-exception, "AccountOwnerNotVerifiedException" :portkey.aws.organizations/account-owner-not-verified-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateHandshakeException" :portkey.aws.organizations/duplicate-handshake-exception}})))))
(clojure.spec.alpha/fdef invite-account-to-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations/invite-account-to-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/invite-account-to-organization-response))

(clojure.core/defn list-handshakes-for-organization ([] (list-handshakes-for-organization {})) ([list-handshakes-for-organization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-handshakes-for-organization-request list-handshakes-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-handshakes-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-handshakes-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHandshakesForOrganization", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/list-handshakes-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-handshakes-for-organization-response))

(clojure.core/defn describe-policy ([describe-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-policy-request describe-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePolicy", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-policy-response))

(clojure.core/defn describe-create-account-status ([describe-create-account-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-create-account-status-request describe-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCreateAccountStatus", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "CreateAccountStatusNotFoundException" :portkey.aws.organizations/create-account-status-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-create-account-status :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-create-account-status-response))

(clojure.core/defn describe-organizational-unit ([describe-organizational-unit-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-organizational-unit-request describe-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeOrganizationalUnit", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-organizational-unit-response))

(clojure.core/defn decline-handshake ([decline-handshake-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-decline-handshake-request decline-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/decline-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/decline-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeclineHandshake", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef decline-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/decline-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/decline-handshake-response))

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePolicy", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-policy-response))

(clojure.core/defn list-policies-for-target ([list-policies-for-target-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-policies-for-target-request list-policies-for-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-policies-for-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-policies-for-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPoliciesForTarget", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies-for-target :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-policies-for-target-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-policies-for-target-response))

(clojure.core/defn enable-policy-type ([enable-policy-type-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-policy-type-request enable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/enable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnablePolicyType", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeAlreadyEnabledException" :portkey.aws.organizations/policy-type-already-enabled-exception}})))))
(clojure.spec.alpha/fdef enable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations/enable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/enable-policy-type-response))

(clojure.core/defn describe-account ([describe-account-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-account-request describe-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccount", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-account-response))

(clojure.core/defn list-parents ([list-parents-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-parents-request list-parents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-parents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-parents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListParents", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ChildNotFoundException" :portkey.aws.organizations/child-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-parents :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-parents-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-parents-response))

(clojure.core/defn cancel-handshake ([cancel-handshake-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-cancel-handshake-request cancel-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/cancel-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/cancel-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelHandshake", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef cancel-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/cancel-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/cancel-handshake-response))

(clojure.core/defn enable-aws-service-access ([enable-aws-service-access-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-enable-aws-service-access-request enable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableAWSServiceAccess", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations/enable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn attach-policy ([attach-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-attach-policy-request attach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/attach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachPolicy", :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyAttachmentException" :portkey.aws.organizations/duplicate-policy-attachment-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/attach-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-organization ([] (describe-organization {})) ([_] (clojure.core/let [request-function-result__28606__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/describe-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeOrganization", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organization :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-organization-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/delete-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicy", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyInUseException" :portkey.aws.organizations/policy-in-use-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-organizational-unit ([update-organizational-unit-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-organizational-unit-request update-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/update-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/update-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateOrganizationalUnit", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/update-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/update-organizational-unit-response))

(clojure.core/defn create-organization ([] (create-organization {})) ([create-organization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-organization-request create-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/create-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateOrganization", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AlreadyInOrganizationException" :portkey.aws.organizations/already-in-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations/access-denied-for-dependency-exception}})))))
(clojure.spec.alpha/fdef create-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/create-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-organization-response))

(clojure.core/defn list-aws-service-access-for-organization ([] (list-aws-service-access-for-organization {})) ([list-aws-service-access-for-organization-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-aws-service-access-for-organization-request list-aws-service-access-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.spec/output-spec :portkey.aws.organizations/list-aws-service-access-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-aws-service-access-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAWSServiceAccessForOrganization", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aws-service-access-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/list-aws-service-access-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-aws-service-access-for-organization-response))
