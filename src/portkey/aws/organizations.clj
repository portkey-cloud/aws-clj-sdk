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

(clojure.core/defn- response-organization-not-empty-exception ([input] (response-organization-not-empty-exception nil input)) ([resultWrapper1942437 input] (clojure.core/let [rawinput1942436 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942438 {"Message" (rawinput1942436 "Message")}] (clojure.core/cond-> {} (letvar1942438 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942438 ["Message"])))))))

(clojure.core/defn- response-disable-policy-type-response ([input] (response-disable-policy-type-response nil input)) ([resultWrapper1942440 input] (clojure.core/let [rawinput1942439 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942441 {"Root" (rawinput1942439 "Root")}] (clojure.core/cond-> {} (letvar1942441 "Root") (clojure.core/assoc :root (deser-root (clojure.core/get-in letvar1942441 ["Root"])))))))

(clojure.core/defn- response-handshake-not-found-exception ([input] (response-handshake-not-found-exception nil input)) ([resultWrapper1942443 input] (clojure.core/let [rawinput1942442 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942444 {"Message" (rawinput1942442 "Message")}] (clojure.core/cond-> {} (letvar1942444 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942444 ["Message"])))))))

(clojure.core/defn- response-list-targets-for-policy-response ([input] (response-list-targets-for-policy-response nil input)) ([resultWrapper1942446 input] (clojure.core/let [rawinput1942445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942447 {"Targets" (rawinput1942445 "Targets"), "NextToken" (rawinput1942445 "NextToken")}] (clojure.core/cond-> {} (letvar1942447 "Targets") (clojure.core/assoc :targets (deser-policy-targets (clojure.core/get-in letvar1942447 ["Targets"]))) (letvar1942447 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942447 ["NextToken"])))))))

(clojure.core/defn- response-handshake-already-in-state-exception ([input] (response-handshake-already-in-state-exception nil input)) ([resultWrapper1942449 input] (clojure.core/let [rawinput1942448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942450 {"Message" (rawinput1942448 "Message")}] (clojure.core/cond-> {} (letvar1942450 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942450 ["Message"])))))))

(clojure.core/defn- response-list-aws-service-access-for-organization-response ([input] (response-list-aws-service-access-for-organization-response nil input)) ([resultWrapper1942452 input] (clojure.core/let [rawinput1942451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942453 {"EnabledServicePrincipals" (rawinput1942451 "EnabledServicePrincipals"), "NextToken" (rawinput1942451 "NextToken")}] (clojure.core/cond-> {} (letvar1942453 "EnabledServicePrincipals") (clojure.core/assoc :enabled-service-principals (deser-enabled-service-principals (clojure.core/get-in letvar1942453 ["EnabledServicePrincipals"]))) (letvar1942453 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942453 ["NextToken"])))))))

(clojure.core/defn- response-list-create-account-status-response ([input] (response-list-create-account-status-response nil input)) ([resultWrapper1942455 input] (clojure.core/let [rawinput1942454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942456 {"CreateAccountStatuses" (rawinput1942454 "CreateAccountStatuses"), "NextToken" (rawinput1942454 "NextToken")}] (clojure.core/cond-> {} (letvar1942456 "CreateAccountStatuses") (clojure.core/assoc :create-account-statuses (deser-create-account-statuses (clojure.core/get-in letvar1942456 ["CreateAccountStatuses"]))) (letvar1942456 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942456 ["NextToken"])))))))

(clojure.core/defn- response-accept-handshake-response ([input] (response-accept-handshake-response nil input)) ([resultWrapper1942458 input] (clojure.core/let [rawinput1942457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942459 {"Handshake" (rawinput1942457 "Handshake")}] (clojure.core/cond-> {} (letvar1942459 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942459 ["Handshake"])))))))

(clojure.core/defn- response-describe-policy-response ([input] (response-describe-policy-response nil input)) ([resultWrapper1942461 input] (clojure.core/let [rawinput1942460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942462 {"Policy" (rawinput1942460 "Policy")}] (clojure.core/cond-> {} (letvar1942462 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1942462 ["Policy"])))))))

(clojure.core/defn- response-update-policy-response ([input] (response-update-policy-response nil input)) ([resultWrapper1942464 input] (clojure.core/let [rawinput1942463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942465 {"Policy" (rawinput1942463 "Policy")}] (clojure.core/cond-> {} (letvar1942465 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1942465 ["Policy"])))))))

(clojure.core/defn- response-finalizing-organization-exception ([input] (response-finalizing-organization-exception nil input)) ([resultWrapper1942467 input] (clojure.core/let [rawinput1942466 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942468 {"Message" (rawinput1942466 "Message")}] (clojure.core/cond-> {} (letvar1942468 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942468 ["Message"])))))))

(clojure.core/defn- response-list-parents-response ([input] (response-list-parents-response nil input)) ([resultWrapper1942470 input] (clojure.core/let [rawinput1942469 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942471 {"Parents" (rawinput1942469 "Parents"), "NextToken" (rawinput1942469 "NextToken")}] (clojure.core/cond-> {} (letvar1942471 "Parents") (clojure.core/assoc :parents (deser-parents (clojure.core/get-in letvar1942471 ["Parents"]))) (letvar1942471 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942471 ["NextToken"])))))))

(clojure.core/defn- response-list-policies-for-target-response ([input] (response-list-policies-for-target-response nil input)) ([resultWrapper1942473 input] (clojure.core/let [rawinput1942472 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942474 {"Policies" (rawinput1942472 "Policies"), "NextToken" (rawinput1942472 "NextToken")}] (clojure.core/cond-> {} (letvar1942474 "Policies") (clojure.core/assoc :policies (deser-policies (clojure.core/get-in letvar1942474 ["Policies"]))) (letvar1942474 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942474 ["NextToken"])))))))

(clojure.core/defn- response-describe-create-account-status-response ([input] (response-describe-create-account-status-response nil input)) ([resultWrapper1942476 input] (clojure.core/let [rawinput1942475 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942477 {"CreateAccountStatus" (rawinput1942475 "CreateAccountStatus")}] (clojure.core/cond-> {} (letvar1942477 "CreateAccountStatus") (clojure.core/assoc :create-account-status (deser-create-account-status (clojure.core/get-in letvar1942477 ["CreateAccountStatus"])))))))

(clojure.core/defn- response-list-accounts-for-parent-response ([input] (response-list-accounts-for-parent-response nil input)) ([resultWrapper1942479 input] (clojure.core/let [rawinput1942478 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942480 {"Accounts" (rawinput1942478 "Accounts"), "NextToken" (rawinput1942478 "NextToken")}] (clojure.core/cond-> {} (letvar1942480 "Accounts") (clojure.core/assoc :accounts (deser-accounts (clojure.core/get-in letvar1942480 ["Accounts"]))) (letvar1942480 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942480 ["NextToken"])))))))

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper1942482 input] (clojure.core/let [rawinput1942481 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942483 {"Message" (rawinput1942481 "Message")}] (clojure.core/cond-> {} (letvar1942483 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942483 ["Message"])))))))

(clojure.core/defn- response-list-organizational-units-for-parent-response ([input] (response-list-organizational-units-for-parent-response nil input)) ([resultWrapper1942485 input] (clojure.core/let [rawinput1942484 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942486 {"OrganizationalUnits" (rawinput1942484 "OrganizationalUnits"), "NextToken" (rawinput1942484 "NextToken")}] (clojure.core/cond-> {} (letvar1942486 "OrganizationalUnits") (clojure.core/assoc :organizational-units (deser-organizational-units (clojure.core/get-in letvar1942486 ["OrganizationalUnits"]))) (letvar1942486 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942486 ["NextToken"])))))))

(clojure.core/defn- response-decline-handshake-response ([input] (response-decline-handshake-response nil input)) ([resultWrapper1942488 input] (clojure.core/let [rawinput1942487 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942489 {"Handshake" (rawinput1942487 "Handshake")}] (clojure.core/cond-> {} (letvar1942489 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942489 ["Handshake"])))))))

(clojure.core/defn- response-destination-parent-not-found-exception ([input] (response-destination-parent-not-found-exception nil input)) ([resultWrapper1942491 input] (clojure.core/let [rawinput1942490 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942492 {"Message" (rawinput1942490 "Message")}] (clojure.core/cond-> {} (letvar1942492 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942492 ["Message"])))))))

(clojure.core/defn- response-enable-all-features-response ([input] (response-enable-all-features-response nil input)) ([resultWrapper1942494 input] (clojure.core/let [rawinput1942493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942495 {"Handshake" (rawinput1942493 "Handshake")}] (clojure.core/cond-> {} (letvar1942495 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942495 ["Handshake"])))))))

(clojure.core/defn- response-list-accounts-response ([input] (response-list-accounts-response nil input)) ([resultWrapper1942497 input] (clojure.core/let [rawinput1942496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942498 {"Accounts" (rawinput1942496 "Accounts"), "NextToken" (rawinput1942496 "NextToken")}] (clojure.core/cond-> {} (letvar1942498 "Accounts") (clojure.core/assoc :accounts (deser-accounts (clojure.core/get-in letvar1942498 ["Accounts"]))) (letvar1942498 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942498 ["NextToken"])))))))

(clojure.core/defn- response-account-owner-not-verified-exception ([input] (response-account-owner-not-verified-exception nil input)) ([resultWrapper1942500 input] (clojure.core/let [rawinput1942499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942501 {"Message" (rawinput1942499 "Message")}] (clojure.core/cond-> {} (letvar1942501 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942501 ["Message"])))))))

(clojure.core/defn- response-policy-not-attached-exception ([input] (response-policy-not-attached-exception nil input)) ([resultWrapper1942503 input] (clojure.core/let [rawinput1942502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942504 {"Message" (rawinput1942502 "Message")}] (clojure.core/cond-> {} (letvar1942504 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942504 ["Message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1942506 input] (clojure.core/let [rawinput1942505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942507 {"Type" (rawinput1942505 "Type"), "Message" (rawinput1942505 "Message")}] (clojure.core/cond-> {} (letvar1942507 "Type") (clojure.core/assoc :type (deser-exception-type (clojure.core/get-in letvar1942507 ["Type"]))) (letvar1942507 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942507 ["Message"])))))))

(clojure.core/defn- response-list-children-response ([input] (response-list-children-response nil input)) ([resultWrapper1942509 input] (clojure.core/let [rawinput1942508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942510 {"Children" (rawinput1942508 "Children"), "NextToken" (rawinput1942508 "NextToken")}] (clojure.core/cond-> {} (letvar1942510 "Children") (clojure.core/assoc :children (deser-children (clojure.core/get-in letvar1942510 ["Children"]))) (letvar1942510 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942510 ["NextToken"])))))))

(clojure.core/defn- response-describe-handshake-response ([input] (response-describe-handshake-response nil input)) ([resultWrapper1942512 input] (clojure.core/let [rawinput1942511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942513 {"Handshake" (rawinput1942511 "Handshake")}] (clojure.core/cond-> {} (letvar1942513 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942513 ["Handshake"])))))))

(clojure.core/defn- response-child-not-found-exception ([input] (response-child-not-found-exception nil input)) ([resultWrapper1942515 input] (clojure.core/let [rawinput1942514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942516 {"Message" (rawinput1942514 "Message")}] (clojure.core/cond-> {} (letvar1942516 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942516 ["Message"])))))))

(clojure.core/defn- response-root-not-found-exception ([input] (response-root-not-found-exception nil input)) ([resultWrapper1942518 input] (clojure.core/let [rawinput1942517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942519 {"Message" (rawinput1942517 "Message")}] (clojure.core/cond-> {} (letvar1942519 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942519 ["Message"])))))))

(clojure.core/defn- response-list-roots-response ([input] (response-list-roots-response nil input)) ([resultWrapper1942521 input] (clojure.core/let [rawinput1942520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942522 {"Roots" (rawinput1942520 "Roots"), "NextToken" (rawinput1942520 "NextToken")}] (clojure.core/cond-> {} (letvar1942522 "Roots") (clojure.core/assoc :roots (deser-roots (clojure.core/get-in letvar1942522 ["Roots"]))) (letvar1942522 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942522 ["NextToken"])))))))

(clojure.core/defn- response-create-account-response ([input] (response-create-account-response nil input)) ([resultWrapper1942524 input] (clojure.core/let [rawinput1942523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942525 {"CreateAccountStatus" (rawinput1942523 "CreateAccountStatus")}] (clojure.core/cond-> {} (letvar1942525 "CreateAccountStatus") (clojure.core/assoc :create-account-status (deser-create-account-status (clojure.core/get-in letvar1942525 ["CreateAccountStatus"])))))))

(clojure.core/defn- response-describe-organization-response ([input] (response-describe-organization-response nil input)) ([resultWrapper1942527 input] (clojure.core/let [rawinput1942526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942528 {"Organization" (rawinput1942526 "Organization")}] (clojure.core/cond-> {} (letvar1942528 "Organization") (clojure.core/assoc :organization (deser-organization (clojure.core/get-in letvar1942528 ["Organization"])))))))

(clojure.core/defn- response-create-organization-response ([input] (response-create-organization-response nil input)) ([resultWrapper1942530 input] (clojure.core/let [rawinput1942529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942531 {"Organization" (rawinput1942529 "Organization")}] (clojure.core/cond-> {} (letvar1942531 "Organization") (clojure.core/assoc :organization (deser-organization (clojure.core/get-in letvar1942531 ["Organization"])))))))

(clojure.core/defn- response-enable-policy-type-response ([input] (response-enable-policy-type-response nil input)) ([resultWrapper1942533 input] (clojure.core/let [rawinput1942532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942534 {"Root" (rawinput1942532 "Root")}] (clojure.core/cond-> {} (letvar1942534 "Root") (clojure.core/assoc :root (deser-root (clojure.core/get-in letvar1942534 ["Root"])))))))

(clojure.core/defn- response-update-organizational-unit-response ([input] (response-update-organizational-unit-response nil input)) ([resultWrapper1942536 input] (clojure.core/let [rawinput1942535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942537 {"OrganizationalUnit" (rawinput1942535 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1942537 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1942537 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-policy-not-found-exception ([input] (response-policy-not-found-exception nil input)) ([resultWrapper1942539 input] (clojure.core/let [rawinput1942538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942540 {"Message" (rawinput1942538 "Message")}] (clojure.core/cond-> {} (letvar1942540 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942540 ["Message"])))))))

(clojure.core/defn- response-duplicate-organizational-unit-exception ([input] (response-duplicate-organizational-unit-exception nil input)) ([resultWrapper1942542 input] (clojure.core/let [rawinput1942541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942543 {"Message" (rawinput1942541 "Message")}] (clojure.core/cond-> {} (letvar1942543 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942543 ["Message"])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper1942545 input] (clojure.core/let [rawinput1942544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942546 {"Message" (rawinput1942544 "Message")}] (clojure.core/cond-> {} (letvar1942546 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942546 ["Message"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1942548 input] (clojure.core/let [rawinput1942547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942549 {"Message" (rawinput1942547 "Message"), "Reason" (rawinput1942547 "Reason")}] (clojure.core/cond-> {} (letvar1942549 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942549 ["Message"]))) (letvar1942549 "Reason") (clojure.core/assoc :reason (deser-invalid-input-exception-reason (clojure.core/get-in letvar1942549 ["Reason"])))))))

(clojure.core/defn- response-create-policy-response ([input] (response-create-policy-response nil input)) ([resultWrapper1942551 input] (clojure.core/let [rawinput1942550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942552 {"Policy" (rawinput1942550 "Policy")}] (clojure.core/cond-> {} (letvar1942552 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar1942552 ["Policy"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1942554 input] (clojure.core/let [rawinput1942553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942555 {"Message" (rawinput1942553 "Message")}] (clojure.core/cond-> {} (letvar1942555 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942555 ["Message"])))))))

(clojure.core/defn- response-list-handshakes-for-organization-response ([input] (response-list-handshakes-for-organization-response nil input)) ([resultWrapper1942557 input] (clojure.core/let [rawinput1942556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942558 {"Handshakes" (rawinput1942556 "Handshakes"), "NextToken" (rawinput1942556 "NextToken")}] (clojure.core/cond-> {} (letvar1942558 "Handshakes") (clojure.core/assoc :handshakes (deser-handshakes (clojure.core/get-in letvar1942558 ["Handshakes"]))) (letvar1942558 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942558 ["NextToken"])))))))

(clojure.core/defn- response-duplicate-policy-attachment-exception ([input] (response-duplicate-policy-attachment-exception nil input)) ([resultWrapper1942560 input] (clojure.core/let [rawinput1942559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942561 {"Message" (rawinput1942559 "Message")}] (clojure.core/cond-> {} (letvar1942561 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942561 ["Message"])))))))

(clojure.core/defn- response-duplicate-policy-exception ([input] (response-duplicate-policy-exception nil input)) ([resultWrapper1942563 input] (clojure.core/let [rawinput1942562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942564 {"Message" (rawinput1942562 "Message")}] (clojure.core/cond-> {} (letvar1942564 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942564 ["Message"])))))))

(clojure.core/defn- response-describe-organizational-unit-response ([input] (response-describe-organizational-unit-response nil input)) ([resultWrapper1942566 input] (clojure.core/let [rawinput1942565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942567 {"OrganizationalUnit" (rawinput1942565 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1942567 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1942567 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-describe-account-response ([input] (response-describe-account-response nil input)) ([resultWrapper1942569 input] (clojure.core/let [rawinput1942568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942570 {"Account" (rawinput1942568 "Account")}] (clojure.core/cond-> {} (letvar1942570 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar1942570 ["Account"])))))))

(clojure.core/defn- response-aws-organizations-not-in-use-exception ([input] (response-aws-organizations-not-in-use-exception nil input)) ([resultWrapper1942572 input] (clojure.core/let [rawinput1942571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942573 {"Message" (rawinput1942571 "Message")}] (clojure.core/cond-> {} (letvar1942573 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942573 ["Message"])))))))

(clojure.core/defn- response-organizational-unit-not-found-exception ([input] (response-organizational-unit-not-found-exception nil input)) ([resultWrapper1942575 input] (clojure.core/let [rawinput1942574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942576 {"Message" (rawinput1942574 "Message")}] (clojure.core/cond-> {} (letvar1942576 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942576 ["Message"])))))))

(clojure.core/defn- response-account-not-found-exception ([input] (response-account-not-found-exception nil input)) ([resultWrapper1942578 input] (clojure.core/let [rawinput1942577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942579 {"Message" (rawinput1942577 "Message")}] (clojure.core/cond-> {} (letvar1942579 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942579 ["Message"])))))))

(clojure.core/defn- response-constraint-violation-exception ([input] (response-constraint-violation-exception nil input)) ([resultWrapper1942581 input] (clojure.core/let [rawinput1942580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942582 {"Message" (rawinput1942580 "Message"), "Reason" (rawinput1942580 "Reason")}] (clojure.core/cond-> {} (letvar1942582 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942582 ["Message"]))) (letvar1942582 "Reason") (clojure.core/assoc :reason (deser-constraint-violation-exception-reason (clojure.core/get-in letvar1942582 ["Reason"])))))))

(clojure.core/defn- response-parent-not-found-exception ([input] (response-parent-not-found-exception nil input)) ([resultWrapper1942584 input] (clojure.core/let [rawinput1942583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942585 {"Message" (rawinput1942583 "Message")}] (clojure.core/cond-> {} (letvar1942585 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942585 ["Message"])))))))

(clojure.core/defn- response-create-organizational-unit-response ([input] (response-create-organizational-unit-response nil input)) ([resultWrapper1942587 input] (clojure.core/let [rawinput1942586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942588 {"OrganizationalUnit" (rawinput1942586 "OrganizationalUnit")}] (clojure.core/cond-> {} (letvar1942588 "OrganizationalUnit") (clojure.core/assoc :organizational-unit (deser-organizational-unit (clojure.core/get-in letvar1942588 ["OrganizationalUnit"])))))))

(clojure.core/defn- response-access-denied-for-dependency-exception ([input] (response-access-denied-for-dependency-exception nil input)) ([resultWrapper1942590 input] (clojure.core/let [rawinput1942589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942591 {"Message" (rawinput1942589 "Message"), "Reason" (rawinput1942589 "Reason")}] (clojure.core/cond-> {} (letvar1942591 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942591 ["Message"]))) (letvar1942591 "Reason") (clojure.core/assoc :reason (deser-access-denied-for-dependency-exception-reason (clojure.core/get-in letvar1942591 ["Reason"])))))))

(clojure.core/defn- response-source-parent-not-found-exception ([input] (response-source-parent-not-found-exception nil input)) ([resultWrapper1942593 input] (clojure.core/let [rawinput1942592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942594 {"Message" (rawinput1942592 "Message")}] (clojure.core/cond-> {} (letvar1942594 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942594 ["Message"])))))))

(clojure.core/defn- response-policy-type-not-available-for-organization-exception ([input] (response-policy-type-not-available-for-organization-exception nil input)) ([resultWrapper1942596 input] (clojure.core/let [rawinput1942595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942597 {"Message" (rawinput1942595 "Message")}] (clojure.core/cond-> {} (letvar1942597 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942597 ["Message"])))))))

(clojure.core/defn- response-target-not-found-exception ([input] (response-target-not-found-exception nil input)) ([resultWrapper1942599 input] (clojure.core/let [rawinput1942598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942600 {"Message" (rawinput1942598 "Message")}] (clojure.core/cond-> {} (letvar1942600 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942600 ["Message"])))))))

(clojure.core/defn- response-create-account-status-not-found-exception ([input] (response-create-account-status-not-found-exception nil input)) ([resultWrapper1942602 input] (clojure.core/let [rawinput1942601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942603 {"Message" (rawinput1942601 "Message")}] (clojure.core/cond-> {} (letvar1942603 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942603 ["Message"])))))))

(clojure.core/defn- response-list-policies-response ([input] (response-list-policies-response nil input)) ([resultWrapper1942605 input] (clojure.core/let [rawinput1942604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942606 {"Policies" (rawinput1942604 "Policies"), "NextToken" (rawinput1942604 "NextToken")}] (clojure.core/cond-> {} (letvar1942606 "Policies") (clojure.core/assoc :policies (deser-policies (clojure.core/get-in letvar1942606 ["Policies"]))) (letvar1942606 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942606 ["NextToken"])))))))

(clojure.core/defn- response-already-in-organization-exception ([input] (response-already-in-organization-exception nil input)) ([resultWrapper1942608 input] (clojure.core/let [rawinput1942607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942609 {"Message" (rawinput1942607 "Message")}] (clojure.core/cond-> {} (letvar1942609 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942609 ["Message"])))))))

(clojure.core/defn- response-handshake-constraint-violation-exception ([input] (response-handshake-constraint-violation-exception nil input)) ([resultWrapper1942611 input] (clojure.core/let [rawinput1942610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942612 {"Message" (rawinput1942610 "Message"), "Reason" (rawinput1942610 "Reason")}] (clojure.core/cond-> {} (letvar1942612 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942612 ["Message"]))) (letvar1942612 "Reason") (clojure.core/assoc :reason (deser-handshake-constraint-violation-exception-reason (clojure.core/get-in letvar1942612 ["Reason"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1942614 input] (clojure.core/let [rawinput1942613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942615 {"Message" (rawinput1942613 "Message")}] (clojure.core/cond-> {} (letvar1942615 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942615 ["Message"])))))))

(clojure.core/defn- response-list-handshakes-for-account-response ([input] (response-list-handshakes-for-account-response nil input)) ([resultWrapper1942617 input] (clojure.core/let [rawinput1942616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942618 {"Handshakes" (rawinput1942616 "Handshakes"), "NextToken" (rawinput1942616 "NextToken")}] (clojure.core/cond-> {} (letvar1942618 "Handshakes") (clojure.core/assoc :handshakes (deser-handshakes (clojure.core/get-in letvar1942618 ["Handshakes"]))) (letvar1942618 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1942618 ["NextToken"])))))))

(clojure.core/defn- response-organizational-unit-not-empty-exception ([input] (response-organizational-unit-not-empty-exception nil input)) ([resultWrapper1942620 input] (clojure.core/let [rawinput1942619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942621 {"Message" (rawinput1942619 "Message")}] (clojure.core/cond-> {} (letvar1942621 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942621 ["Message"])))))))

(clojure.core/defn- response-invalid-handshake-transition-exception ([input] (response-invalid-handshake-transition-exception nil input)) ([resultWrapper1942623 input] (clojure.core/let [rawinput1942622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942624 {"Message" (rawinput1942622 "Message")}] (clojure.core/cond-> {} (letvar1942624 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942624 ["Message"])))))))

(clojure.core/defn- response-master-cannot-leave-organization-exception ([input] (response-master-cannot-leave-organization-exception nil input)) ([resultWrapper1942626 input] (clojure.core/let [rawinput1942625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942627 {"Message" (rawinput1942625 "Message")}] (clojure.core/cond-> {} (letvar1942627 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942627 ["Message"])))))))

(clojure.core/defn- response-policy-type-already-enabled-exception ([input] (response-policy-type-already-enabled-exception nil input)) ([resultWrapper1942629 input] (clojure.core/let [rawinput1942628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942630 {"Message" (rawinput1942628 "Message")}] (clojure.core/cond-> {} (letvar1942630 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942630 ["Message"])))))))

(clojure.core/defn- response-duplicate-handshake-exception ([input] (response-duplicate-handshake-exception nil input)) ([resultWrapper1942632 input] (clojure.core/let [rawinput1942631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942633 {"Message" (rawinput1942631 "Message")}] (clojure.core/cond-> {} (letvar1942633 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942633 ["Message"])))))))

(clojure.core/defn- response-invite-account-to-organization-response ([input] (response-invite-account-to-organization-response nil input)) ([resultWrapper1942635 input] (clojure.core/let [rawinput1942634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942636 {"Handshake" (rawinput1942634 "Handshake")}] (clojure.core/cond-> {} (letvar1942636 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942636 ["Handshake"])))))))

(clojure.core/defn- response-duplicate-account-exception ([input] (response-duplicate-account-exception nil input)) ([resultWrapper1942638 input] (clojure.core/let [rawinput1942637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942639 {"Message" (rawinput1942637 "Message")}] (clojure.core/cond-> {} (letvar1942639 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942639 ["Message"])))))))

(clojure.core/defn- response-policy-in-use-exception ([input] (response-policy-in-use-exception nil input)) ([resultWrapper1942641 input] (clojure.core/let [rawinput1942640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942642 {"Message" (rawinput1942640 "Message")}] (clojure.core/cond-> {} (letvar1942642 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942642 ["Message"])))))))

(clojure.core/defn- response-cancel-handshake-response ([input] (response-cancel-handshake-response nil input)) ([resultWrapper1942644 input] (clojure.core/let [rawinput1942643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942645 {"Handshake" (rawinput1942643 "Handshake")}] (clojure.core/cond-> {} (letvar1942645 "Handshake") (clojure.core/assoc :handshake (deser-handshake (clojure.core/get-in letvar1942645 ["Handshake"])))))))

(clojure.core/defn- response-policy-type-not-enabled-exception ([input] (response-policy-type-not-enabled-exception nil input)) ([resultWrapper1942647 input] (clojure.core/let [rawinput1942646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1942648 {"Message" (rawinput1942646 "Message")}] (clojure.core/cond-> {} (letvar1942648 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1942648 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.organizations.organization-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/organization-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.organization-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/cancel-handshake-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/handshake-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-constraint-violation-exception-reason #{:organization-already-has-all-features :invite-disabled-during-enable-all-features :organization-membership-change-rate-limit-exceeded "PAYMENT_INSTRUMENT_REQUIRED" "ALREADY_IN_AN_ORGANIZATION" :organization-from-different-seller-of-record "INVITE_DISABLED_DURING_ENABLE_ALL_FEATURES" "HANDSHAKE_RATE_LIMIT_EXCEEDED" :payment-instrument-required "ORGANIZATION_FROM_DIFFERENT_SELLER_OF_RECORD" :handshake-rate-limit-exceeded :account-number-limit-exceeded :already-in-an-organization "ORGANIZATION_ALREADY_HAS_ALL_FEATURES" "ORGANIZATION_MEMBERSHIP_CHANGE_RATE_LIMIT_EXCEEDED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations/list-parents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/child-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/child-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/generic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::.+:.+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-units (clojure.spec.alpha/coll-of :portkey.aws.organizations/organizational-unit))

(clojure.spec.alpha/def :portkey.aws.organizations/list-aws-service-access-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/enabled-service-principals :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/email (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 6 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^\s@]+@[^\s@]+\.[^\s@]+" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(\d{12})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.finalizing-organization-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/finalizing-organization-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.finalizing-organization-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-parents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/parents :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/role-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\w+=,.@-]{1,64}" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-notes (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-organizational-units-for-parent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/organizational-units :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/remove-account-from-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/parent-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(r-[0-9a-z]{4,32})|(ou-[0-9a-z]{4,32}-[a-z0-9]{8,32})$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.organizations/target-type #{"ROOT" :organizational-unit :account "ACCOUNT" :root "ORGANIZATIONAL_UNIT"})

(clojure.spec.alpha/def :portkey.aws.organizations/decline-handshake-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations.destination-parent-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/destination-parent-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.destination-parent-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-targets (clojure.spec.alpha/coll-of :portkey.aws.organizations/policy-target-summary))

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations/enable-all-features-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshake]))

(clojure.spec.alpha/def :portkey.aws.organizations/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^o-[a-z0-9]{10,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-state #{:open "CANCELED" "ACCEPTED" "OPEN" "EXPIRED" "DECLINED" :accepted :canceled :declined :expired :requested "REQUESTED"})

(clojure.spec.alpha/def :portkey.aws.organizations/list-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/accounts :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/describe-organizational-unit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/organizational-unit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000000))))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^car-[a-z0-9]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\w+=,.@-]*" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^p-[0-9a-zA-Z_]{8,128}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.root-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/root-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.root-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/list-roots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/roots :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/create-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/create-account-status]))

(clojure.spec.alpha/def :portkey.aws.organizations/root-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:root\/o-[a-z0-9]{10,32}\/r-[0-9a-z]{4,32}" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/root-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/root-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^r-[0-9a-z]{4,32}$" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^h-[0-9a-z]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/create-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/policy]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:account\/o-[a-z0-9]{10,32}\/\d{12}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-summary/type (clojure.spec.alpha/and :portkey.aws.organizations/policy-type))
(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-summary/status (clojure.spec.alpha/and :portkey.aws.organizations/policy-type-status))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-summary/type :portkey.aws.organizations.policy-type-summary/status]))

(clojure.spec.alpha/def :portkey.aws.organizations.create-organization-request/feature-set (clojure.spec.alpha/and :portkey.aws.organizations/organization-feature-set))
(clojure.spec.alpha/def :portkey.aws.organizations/create-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.create-organization-request/feature-set]))

(clojure.spec.alpha/def :portkey.aws.organizations.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\d{12}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-handshakes-for-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations/handshakes :portkey.aws.organizations/next-token]))

(clojure.spec.alpha/def :portkey.aws.organizations/constraint-violation-exception-reason #{:master-account-missing-contact-info "MASTER_ACCOUNT_MISSING_CONTACT_INFO" "ACCOUNT_CANNOT_LEAVE_ORGANIZATION" :email-verification-code-expired "MAX_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" "MASTER_ACCOUNT_ADDRESS_DOES_NOT_MATCH_MARKETPLACE" :min-policy-type-attachment-limit-exceeded "ACCOUNT_CREATION_RATE_LIMIT_EXCEEDED" "HANDSHAKE_RATE_LIMIT_EXCEEDED" "EMAIL_VERIFICATION_CODE_EXPIRED" "ACCOUNT_CANNOT_LEAVE_WITHOUT_PHONE_VERIFICATION" :handshake-rate-limit-exceeded :account-number-limit-exceeded "MASTER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "OU_DEPTH_LIMIT_EXCEEDED" "ORGANIZATION_NOT_IN_ALL_FEATURES_MODE" "WAIT_PERIOD_ACTIVE" :organization-not-in-all-features-mode :policy-number-limit-exceeded :wait-period-active :account-cannot-leave-organization :ou-number-limit-exceeded "OU_NUMBER_LIMIT_EXCEEDED" :master-account-address-does-not-match-marketplace :max-policy-type-attachment-limit-exceeded :master-account-payment-instrument-required "MIN_POLICY_TYPE_ATTACHMENT_LIMIT_EXCEEDED" :member-account-payment-instrument-required :account-cannot-leave-without-eula :account-cannot-leave-without-phone-verification "POLICY_NUMBER_LIMIT_EXCEEDED" :ou-depth-limit-exceeded "ACCOUNT_CANNOT_LEAVE_WITHOUT_EULA" :account-creation-rate-limit-exceeded "MEMBER_ACCOUNT_PAYMENT_INSTRUMENT_REQUIRED" "ACCOUNT_NUMBER_LIMIT_EXCEEDED"})

(clojure.spec.alpha/def :portkey.aws.organizations/policy-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(arn:aws:organizations::\d{12}:policy\/o-[a-z0-9]{10,32}\/[0-9a-z_]+\/p-[0-9a-z]{10,32})|(arn:aws:organizations::aws:policy\/[0-9a-z_]+\/p-[0-9a-zA-Z_]{10,128})" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.duplicate-policy-attachment-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/duplicate-policy-attachment-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.duplicate-policy-attachment-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/aws-managed-policy clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\u0020-\u007E]+" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/organization-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:organization\/o-[a-z0-9]{10,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations.account-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/account-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.account-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.organizations/enable-aws-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/service-principal] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.organizations/target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^ou-[0-9a-z]{4,32}-[a-z0-9]{8,32}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/policy-type #{:service-control-policy "SERVICE_CONTROL_POLICY"})

(clojure.spec.alpha/def :portkey.aws.organizations/organizational-unit-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:ou\/o-[a-z0-9]{10,32}\/ou-[0-9a-z]{4,32}-[0-9a-z]{8,32}" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-party-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.organizations/handshake-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:aws:organizations::\d{12}:handshake\/o-[a-z0-9]{10,32}\/[a-z_]{1,32}\/h-[0-9a-z]{8,32}" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.organizations/list-organizational-units-for-parent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.organizations/parent-id] :opt-un [:portkey.aws.organizations/next-token :portkey.aws.organizations/max-results]))

(clojure.spec.alpha/def :portkey.aws.organizations.policy-type-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.organizations/exception-message))
(clojure.spec.alpha/def :portkey.aws.organizations/policy-type-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.organizations.policy-type-not-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.organizations/invalid-input-exception-reason #{:invalid-pattern-target-id "INVALID_SYNTAX_POLICY_ID" "INVALID_ENUM" :max-length-exceeded :invalid-syntax-organization-arn :immutable-policy :invalid-next-token :moving-account-between-different-roots "IMMUTABLE_POLICY" :invalid-role-name "UNRECOGNIZED_SERVICE_PRINCIPAL" "INVALID_PATTERN" :unrecognized-service-principal :invalid-list-member "INVALID_PARTY_TYPE_TARGET" "INVALID_PATTERN_TARGET_ID" :min-length-exceeded :invalid-full-name-target "MAX_LIMIT_EXCEEDED_FILTER" "MOVING_ACCOUNT_BETWEEN_DIFFERENT_ROOTS" "INVALID_ROLE_NAME" :invalid-party-type-target "MAX_LENGTH_EXCEEDED" :min-value-exceeded :input-required :invalid-enum :max-limit-exceeded-filter "MIN_LENGTH_EXCEEDED" "INVALID_SYNTAX_ORGANIZATION_ARN" "INVALID_FULL_NAME_TARGET" :max-value-exceeded :invalid-syntax-policy-id "MIN_VALUE_EXCEEDED" "INPUT_REQUIRED" "INVALID_NEXT_TOKEN" "MAX_VALUE_EXCEEDED" :invalid-pattern "INVALID_LIST_MEMBER"})

(clojure.core/defn move-account ([move-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-move-account-request move-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/move-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "MoveAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "DestinationParentNotFoundException" :portkey.aws.organizations/destination-parent-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "SourceParentNotFoundException" :portkey.aws.organizations/source-parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateAccountException" :portkey.aws.organizations/duplicate-account-exception}})))))
(clojure.spec.alpha/fdef move-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/move-account-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts-for-parent ([list-accounts-for-parent-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-accounts-for-parent-request list-accounts-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-accounts-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-accounts-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccountsForParent", :http.request.configuration/output-deser-fn response-list-accounts-for-parent-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-accounts-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-accounts-for-parent-response))

(clojure.core/defn describe-handshake ([describe-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-handshake-request describe-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHandshake", :http.request.configuration/output-deser-fn response-describe-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-handshake-response))

(clojure.core/defn update-policy ([update-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-policy-request update-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/update-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/update-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePolicy", :http.request.configuration/output-deser-fn response-update-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef update-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/update-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/update-policy-response))

(clojure.core/defn detach-policy ([detach-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-detach-policy-request detach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/detach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "PolicyNotAttachedException" :portkey.aws.organizations/policy-not-attached-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/detach-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-handshakes-for-account ([] (list-handshakes-for-account {})) ([list-handshakes-for-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-handshakes-for-account-request list-handshakes-for-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-handshakes-for-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-handshakes-for-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHandshakesForAccount", :http.request.configuration/output-deser-fn response-list-handshakes-for-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-account :args (clojure.spec.alpha/? :portkey.aws.organizations/list-handshakes-for-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-handshakes-for-account-response))

(clojure.core/defn list-create-account-status ([] (list-create-account-status {})) ([list-create-account-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-create-account-status-request list-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCreateAccountStatus", :http.request.configuration/output-deser-fn response-list-create-account-status-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-create-account-status :args (clojure.spec.alpha/? :portkey.aws.organizations/list-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-create-account-status-response))

(clojure.core/defn list-children ([list-children-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-children-request list-children-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-children-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-children-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListChildren", :http.request.configuration/output-deser-fn response-list-children-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-children :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-children-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-children-response))

(clojure.core/defn list-roots ([] (list-roots {})) ([list-roots-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-roots-request list-roots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-roots-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-roots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRoots", :http.request.configuration/output-deser-fn response-list-roots-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-roots :args (clojure.spec.alpha/? :portkey.aws.organizations/list-roots-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-roots-response))

(clojure.core/defn disable-aws-service-access ([disable-aws-service-access-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-aws-service-access-request disable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/disable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableAWSServiceAccess", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations/disable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn list-policies ([list-policies-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPolicies", :http.request.configuration/output-deser-fn response-list-policies-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-policies-response))

(clojure.core/defn enable-all-features ([] (enable-all-features {})) ([enable-all-features-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-all-features-request enable-all-features-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/enable-all-features-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-all-features-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAllFeatures", :http.request.configuration/output-deser-fn response-enable-all-features-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-all-features :args (clojure.spec.alpha/? :portkey.aws.organizations/enable-all-features-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/enable-all-features-response))

(clojure.core/defn create-organizational-unit ([create-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-organizational-unit-request create-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/create-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrganizationalUnit", :http.request.configuration/output-deser-fn response-create-organizational-unit-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-organizational-unit-response))

(clojure.core/defn leave-organization ([] (leave-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LeaveOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef leave-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn create-account ([create-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-account-request create-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/create-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccount", :http.request.configuration/output-deser-fn response-create-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "FinalizingOrganizationException" :portkey.aws.organizations/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-account-response))

(clojure.core/defn disable-policy-type ([disable-policy-type-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-policy-type-request disable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/disable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/disable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisablePolicyType", :http.request.configuration/output-deser-fn response-disable-policy-type-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef disable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations/disable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/disable-policy-type-response))

(clojure.core/defn accept-handshake ([accept-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-accept-handshake-request accept-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/accept-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/accept-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptHandshake", :http.request.configuration/output-deser-fn response-accept-handshake-response, :http.request.spec/error-spec {"HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations/access-denied-for-dependency-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception}})))))
(clojure.spec.alpha/fdef accept-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/accept-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/accept-handshake-response))

(clojure.core/defn list-targets-for-policy ([list-targets-for-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-targets-for-policy-request list-targets-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-targets-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-targets-for-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTargetsForPolicy", :http.request.configuration/output-deser-fn response-list-targets-for-policy-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-targets-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-targets-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-targets-for-policy-response))

(clojure.core/defn remove-account-from-organization ([remove-account-from-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-remove-account-from-organization-request remove-account-from-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/remove-account-from-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveAccountFromOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "MasterCannotLeaveOrganizationException" :portkey.aws.organizations/master-cannot-leave-organization-exception}})))))
(clojure.spec.alpha/fdef remove-account-from-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations/remove-account-from-organization-request) :ret clojure.core/true?)

(clojure.core/defn list-accounts ([] (list-accounts {})) ([list-accounts-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-accounts-request list-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-accounts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccounts", :http.request.configuration/output-deser-fn response-list-accounts-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-accounts :args (clojure.spec.alpha/? :portkey.aws.organizations/list-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-accounts-response))

(clojure.core/defn delete-organizational-unit ([delete-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-organizational-unit-request delete-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/delete-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOrganizationalUnit", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotEmptyException" :portkey.aws.organizations/organizational-unit-not-empty-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/delete-organizational-unit-request) :ret clojure.core/true?)

(clojure.core/defn list-organizational-units-for-parent ([list-organizational-units-for-parent-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-organizational-units-for-parent-request list-organizational-units-for-parent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-organizational-units-for-parent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-organizational-units-for-parent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOrganizationalUnitsForParent", :http.request.configuration/output-deser-fn response-list-organizational-units-for-parent-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ParentNotFoundException" :portkey.aws.organizations/parent-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-organizational-units-for-parent :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-organizational-units-for-parent-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-organizational-units-for-parent-response))

(clojure.core/defn delete-organization ([] (delete-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOrganization", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationNotEmptyException" :portkey.aws.organizations/organization-not-empty-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-organization :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn invite-account-to-organization ([invite-account-to-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-invite-account-to-organization-request invite-account-to-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/invite-account-to-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/invite-account-to-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteAccountToOrganization", :http.request.configuration/output-deser-fn response-invite-account-to-organization-response, :http.request.spec/error-spec {"FinalizingOrganizationException" :portkey.aws.organizations/finalizing-organization-exception, "ServiceException" :portkey.aws.organizations/service-exception, "AccountOwnerNotVerifiedException" :portkey.aws.organizations/account-owner-not-verified-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "HandshakeConstraintViolationException" :portkey.aws.organizations/handshake-constraint-violation-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateHandshakeException" :portkey.aws.organizations/duplicate-handshake-exception}})))))
(clojure.spec.alpha/fdef invite-account-to-organization :args (clojure.spec.alpha/tuple :portkey.aws.organizations/invite-account-to-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/invite-account-to-organization-response))

(clojure.core/defn list-handshakes-for-organization ([] (list-handshakes-for-organization {})) ([list-handshakes-for-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-handshakes-for-organization-request list-handshakes-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-handshakes-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-handshakes-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHandshakesForOrganization", :http.request.configuration/output-deser-fn response-list-handshakes-for-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-handshakes-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/list-handshakes-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-handshakes-for-organization-response))

(clojure.core/defn describe-policy ([describe-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-policy-request describe-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePolicy", :http.request.configuration/output-deser-fn response-describe-policy-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-policy-response))

(clojure.core/defn describe-create-account-status ([describe-create-account-status-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-create-account-status-request describe-create-account-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-create-account-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-create-account-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCreateAccountStatus", :http.request.configuration/output-deser-fn response-describe-create-account-status-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "CreateAccountStatusNotFoundException" :portkey.aws.organizations/create-account-status-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-create-account-status :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-create-account-status-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-create-account-status-response))

(clojure.core/defn describe-organizational-unit ([describe-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-organizational-unit-request describe-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOrganizationalUnit", :http.request.configuration/output-deser-fn response-describe-organizational-unit-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-organizational-unit-response))

(clojure.core/defn decline-handshake ([decline-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-decline-handshake-request decline-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/decline-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/decline-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeclineHandshake", :http.request.configuration/output-deser-fn response-decline-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef decline-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/decline-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/decline-handshake-response))

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePolicy", :http.request.configuration/output-deser-fn response-create-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "MalformedPolicyDocumentException" :portkey.aws.organizations/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyException" :portkey.aws.organizations/duplicate-policy-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-policy-response))

(clojure.core/defn list-policies-for-target ([list-policies-for-target-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-policies-for-target-request list-policies-for-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-policies-for-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-policies-for-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPoliciesForTarget", :http.request.configuration/output-deser-fn response-list-policies-for-target-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-policies-for-target :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-policies-for-target-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-policies-for-target-response))

(clojure.core/defn enable-policy-type ([enable-policy-type-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-policy-type-request enable-policy-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/enable-policy-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-policy-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnablePolicyType", :http.request.configuration/output-deser-fn response-enable-policy-type-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "RootNotFoundException" :portkey.aws.organizations/root-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "PolicyTypeNotAvailableForOrganizationException" :portkey.aws.organizations/policy-type-not-available-for-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeAlreadyEnabledException" :portkey.aws.organizations/policy-type-already-enabled-exception}})))))
(clojure.spec.alpha/fdef enable-policy-type :args (clojure.spec.alpha/tuple :portkey.aws.organizations/enable-policy-type-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/enable-policy-type-response))

(clojure.core/defn describe-account ([describe-account-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-account-request describe-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-account-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/describe-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccount", :http.request.configuration/output-deser-fn response-describe-account-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AccountNotFoundException" :portkey.aws.organizations/account-not-found-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-account :args (clojure.spec.alpha/tuple :portkey.aws.organizations/describe-account-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-account-response))

(clojure.core/defn list-parents ([list-parents-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-parents-request list-parents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-parents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-parents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListParents", :http.request.configuration/output-deser-fn response-list-parents-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ChildNotFoundException" :portkey.aws.organizations/child-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-parents :args (clojure.spec.alpha/tuple :portkey.aws.organizations/list-parents-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-parents-response))

(clojure.core/defn cancel-handshake ([cancel-handshake-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-handshake-request cancel-handshake-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/cancel-handshake-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/cancel-handshake-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelHandshake", :http.request.configuration/output-deser-fn response-cancel-handshake-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "HandshakeNotFoundException" :portkey.aws.organizations/handshake-not-found-exception, "InvalidHandshakeTransitionException" :portkey.aws.organizations/invalid-handshake-transition-exception, "HandshakeAlreadyInStateException" :portkey.aws.organizations/handshake-already-in-state-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef cancel-handshake :args (clojure.spec.alpha/tuple :portkey.aws.organizations/cancel-handshake-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/cancel-handshake-response))

(clojure.core/defn enable-aws-service-access ([enable-aws-service-access-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-enable-aws-service-access-request enable-aws-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/enable-aws-service-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableAWSServiceAccess", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef enable-aws-service-access :args (clojure.spec.alpha/tuple :portkey.aws.organizations/enable-aws-service-access-request) :ret clojure.core/true?)

(clojure.core/defn attach-policy ([attach-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-attach-policy-request attach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/attach-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "DuplicatePolicyAttachmentException" :portkey.aws.organizations/duplicate-policy-attachment-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "TargetNotFoundException" :portkey.aws.organizations/target-not-found-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "PolicyTypeNotEnabledException" :portkey.aws.organizations/policy-type-not-enabled-exception}})))))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/attach-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-organization ([] (describe-organization {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/describe-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOrganization", :http.request.configuration/output-deser-fn response-describe-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-organization :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.organizations/describe-organization-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/delete-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "PolicyInUseException" :portkey.aws.organizations/policy-in-use-exception, "PolicyNotFoundException" :portkey.aws.organizations/policy-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.organizations/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-organizational-unit ([update-organizational-unit-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-organizational-unit-request update-organizational-unit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/update-organizational-unit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/update-organizational-unit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateOrganizationalUnit", :http.request.configuration/output-deser-fn response-update-organizational-unit-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "DuplicateOrganizationalUnitException" :portkey.aws.organizations/duplicate-organizational-unit-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "OrganizationalUnitNotFoundException" :portkey.aws.organizations/organizational-unit-not-found-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-organizational-unit :args (clojure.spec.alpha/tuple :portkey.aws.organizations/update-organizational-unit-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/update-organizational-unit-response))

(clojure.core/defn create-organization ([] (create-organization {})) ([create-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-organization-request create-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/create-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/create-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrganization", :http.request.configuration/output-deser-fn response-create-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AlreadyInOrganizationException" :portkey.aws.organizations/already-in-organization-exception, "ConcurrentModificationException" :portkey.aws.organizations/concurrent-modification-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception, "AccessDeniedForDependencyException" :portkey.aws.organizations/access-denied-for-dependency-exception}})))))
(clojure.spec.alpha/fdef create-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/create-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/create-organization-response))

(clojure.core/defn list-aws-service-access-for-organization ([] (list-aws-service-access-for-organization {})) ([list-aws-service-access-for-organization-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-aws-service-access-for-organization-request list-aws-service-access-for-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.organizations/endpoints, :http.request.configuration/target-prefix "AWSOrganizationsV20161128", :http.request.spec/output-spec :portkey.aws.organizations/list-aws-service-access-for-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Organizations", :http.request.spec/input-spec :portkey.aws.organizations/list-aws-service-access-for-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAWSServiceAccessForOrganization", :http.request.configuration/output-deser-fn response-list-aws-service-access-for-organization-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.organizations/access-denied-exception, "AWSOrganizationsNotInUseException" :portkey.aws.organizations/aws-organizations-not-in-use-exception, "ConstraintViolationException" :portkey.aws.organizations/constraint-violation-exception, "InvalidInputException" :portkey.aws.organizations/invalid-input-exception, "ServiceException" :portkey.aws.organizations/service-exception, "TooManyRequestsException" :portkey.aws.organizations/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aws-service-access-for-organization :args (clojure.spec.alpha/? :portkey.aws.organizations/list-aws-service-access-for-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.organizations/list-aws-service-access-for-organization-response))
