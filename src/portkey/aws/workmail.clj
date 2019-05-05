(ns portkey.aws.workmail (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "workmail", :region "eu-west-1"},
    :ssl-common-name "workmail.eu-west-1.amazonaws.com",
    :endpoint "https://workmail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "workmail", :region "us-west-2"},
    :ssl-common-name "workmail.us-west-2.amazonaws.com",
    :endpoint "https://workmail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "workmail", :region "us-east-1"},
    :ssl-common-name "workmail.us-east-1.amazonaws.com",
    :endpoint "https://workmail.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-booking-options)

(clojure.core/declare ser-password)

(clojure.core/declare ser-permission-values)

(clojure.core/declare ser-work-mail-identifier)

(clojure.core/declare ser-organization-id)

(clojure.core/declare ser-group-name)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-permission-type)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-booking-options [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BookingOptions", :type "structure"} (clojure.core/contains? input :auto-accept-requests) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-accept-requests)) #:http.request.field{:name "AutoAcceptRequests", :shape "Boolean"})) (clojure.core/contains? input :auto-decline-recurring-requests) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-decline-recurring-requests)) #:http.request.field{:name "AutoDeclineRecurringRequests", :shape "Boolean"})) (clojure.core/contains? input :auto-decline-conflicting-requests) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-decline-conflicting-requests)) #:http.request.field{:name "AutoDeclineConflictingRequests", :shape "Boolean"}))))

(clojure.core/defn- ser-password [input] #:http.request.field{:value input, :shape "Password"})

(clojure.core/defn- ser-permission-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-permission-type coll) #:http.request.field{:shape "PermissionType"}))) input), :shape "PermissionValues", :type "list"})

(clojure.core/defn- ser-work-mail-identifier [input] #:http.request.field{:value input, :shape "WorkMailIdentifier"})

(clojure.core/defn- ser-organization-id [input] #:http.request.field{:value input, :shape "OrganizationId"})

(clojure.core/defn- ser-group-name [input] #:http.request.field{:value input, :shape "GroupName"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-permission-type [input] #:http.request.field{:value (clojure.core/get {"FULL_ACCESS" "FULL_ACCESS", :full-access "FULL_ACCESS", "SEND_AS" "SEND_AS", :send-as "SEND_AS", "SEND_ON_BEHALF" "SEND_ON_BEHALF", :send-on-behalf "SEND_ON_BEHALF"} input), :shape "PermissionType"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"ROOM" "ROOM", :room "ROOM", "EQUIPMENT" "EQUIPMENT", :equipment "EQUIPMENT"} input), :shape "ResourceType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"}) (clojure.core/into (ser-resource-type (input :type)) #:http.request.field{:name "Type", :shape "ResourceType"})]}))

(clojure.core/defn- req-put-mailbox-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-work-mail-identifier (input :grantee-id)) #:http.request.field{:name "GranteeId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-permission-values (input :permission-values)) #:http.request.field{:name "PermissionValues", :shape "PermissionValues"})]}))

(clojure.core/defn- req-delete-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-associate-delegate-to-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-list-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-deregister-from-work-mail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-update-primary-email-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-email-address (input :email)) #:http.request.field{:name "Email", :shape "EmailAddress"})]}))

(clojure.core/defn- req-list-mailbox-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :group-id)) #:http.request.field{:name "GroupId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-disassociate-member-from-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :group-id)) #:http.request.field{:name "GroupId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-work-mail-identifier (input :member-id)) #:http.request.field{:name "MemberId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-update-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :name)) #:http.request.field{:name "Name", :shape "ResourceName"})) (clojure.core/contains? input :booking-options) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-booking-options (input :booking-options)) #:http.request.field{:name "BookingOptions", :shape "BookingOptions"}))))

(clojure.core/defn- req-describe-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-email-address (input :alias)) #:http.request.field{:name "Alias", :shape "EmailAddress"})]}))

(clojure.core/defn- req-reset-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :user-id)) #:http.request.field{:name "UserId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"})]}))

(clojure.core/defn- req-describe-organization-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"})]}))

(clojure.core/defn- req-describe-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :user-id)) #:http.request.field{:name "UserId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-list-group-members-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :group-id)) #:http.request.field{:name "GroupId", :shape "WorkMailIdentifier"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :group-id)) #:http.request.field{:name "GroupId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-delete-mailbox-permissions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-work-mail-identifier (input :grantee-id)) #:http.request.field{:name "GranteeId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-list-organizations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-register-to-work-mail-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-email-address (input :email)) #:http.request.field{:name "Email", :shape "EmailAddress"})]}))

(clojure.core/defn- req-delete-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-email-address (input :alias)) #:http.request.field{:name "Alias", :shape "EmailAddress"})]}))

(clojure.core/defn- req-list-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-user-name (input :name)) #:http.request.field{:name "Name", :shape "UserName"}) (clojure.core/into (ser-string (input :display-name)) #:http.request.field{:name "DisplayName", :shape "String"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"})]}))

(clojure.core/defn- req-create-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-group-name (input :name)) #:http.request.field{:name "Name", :shape "GroupName"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :user-id)) #:http.request.field{:name "UserId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-disassociate-delegate-from-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-list-aliases-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :entity-id)) #:http.request.field{:name "EntityId", :shape "WorkMailIdentifier"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-associate-member-to-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :group-id)) #:http.request.field{:name "GroupId", :shape "WorkMailIdentifier"}) (clojure.core/into (ser-work-mail-identifier (input :member-id)) #:http.request.field{:name "MemberId", :shape "WorkMailIdentifier"})]}))

(clojure.core/defn- req-list-resource-delegates-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"}) (clojure.core/into (ser-work-mail-identifier (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "WorkMailIdentifier"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-booking-options)

(clojure.core/declare deser-permissions)

(clojure.core/declare deser-permission)

(clojure.core/declare deser-permission-values)

(clojure.core/declare deser-work-mail-identifier)

(clojure.core/declare deser-member)

(clojure.core/declare deser-organization-name)

(clojure.core/declare deser-organization-id)

(clojure.core/declare deser-user)

(clojure.core/declare deser-members)

(clojure.core/declare deser-group-name)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-resource-delegates)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-user-name)

(clojure.core/declare deser-organization-summary)

(clojure.core/declare deser-user-role)

(clojure.core/declare deser-delegate)

(clojure.core/declare deser-resources)

(clojure.core/declare deser-entity-state)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-permission-type)

(clojure.core/declare deser-users)

(clojure.core/declare deser-groups)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-organization-summaries)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-group)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-member-type)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-booking-options [input] (clojure.core/cond-> {} (clojure.core/contains? input "AutoAcceptRequests") (clojure.core/assoc :auto-accept-requests (deser-boolean (input "AutoAcceptRequests"))) (clojure.core/contains? input "AutoDeclineRecurringRequests") (clojure.core/assoc :auto-decline-recurring-requests (deser-boolean (input "AutoDeclineRecurringRequests"))) (clojure.core/contains? input "AutoDeclineConflictingRequests") (clojure.core/assoc :auto-decline-conflicting-requests (deser-boolean (input "AutoDeclineConflictingRequests")))))

(clojure.core/defn- deser-permissions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-permission coll))) input))

(clojure.core/defn- deser-permission [input] (clojure.core/cond-> {:grantee-id (deser-work-mail-identifier (input "GranteeId")), :grantee-type (deser-member-type (input "GranteeType")), :permission-values (deser-permission-values (input "PermissionValues"))}))

(clojure.core/defn- deser-permission-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-permission-type coll))) input))

(clojure.core/defn- deser-work-mail-identifier [input] input)

(clojure.core/defn- deser-member [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-string (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-member-type (input "Type"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-organization-name [input] input)

(clojure.core/defn- deser-organization-id [input] input)

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-work-mail-identifier (input "Id"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-user-name (input "Name"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "UserRole") (clojure.core/assoc :user-role (deser-user-role (input "UserRole"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-members [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-member coll))) input))

(clojure.core/defn- deser-group-name [input] input)

(clojure.core/defn- deser-aliases [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-email-address coll))) input))

(clojure.core/defn- deser-resource-delegates [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delegate coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-user-name [input] input)

(clojure.core/defn- deser-organization-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "OrganizationId") (clojure.core/assoc :organization-id (deser-organization-id (input "OrganizationId"))) (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-organization-name (input "Alias"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string (input "State")))))

(clojure.core/defn- deser-user-role [input] (clojure.core/get {"USER" :user, "RESOURCE" :resource, "SYSTEM_USER" :system-user} input))

(clojure.core/defn- deser-delegate [input] (clojure.core/cond-> {:id (deser-string (input "Id")), :type (deser-member-type (input "Type"))}))

(clojure.core/defn- deser-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-entity-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled, "DELETED" :deleted} input))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-permission-type [input] (clojure.core/get {"FULL_ACCESS" :full-access, "SEND_AS" :send-as, "SEND_ON_BEHALF" :send-on-behalf} input))

(clojure.core/defn- deser-users [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- deser-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group coll))) input))

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"ROOM" :room, "EQUIPMENT" :equipment} input))

(clojure.core/defn- deser-organization-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-organization-summary coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-work-mail-identifier (input "Id"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-resource-type (input "Type"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-work-mail-identifier (input "Id"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-group-name (input "Name"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-email-address [input] input)

(clojure.core/defn- deser-member-type [input] (clojure.core/get {"GROUP" :group, "USER" :user} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper2174874 input] (clojure.core/let [rawinput2174873 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174875 {"UserId" (rawinput2174873 "UserId")}] (clojure.core/cond-> {} (letvar2174875 "UserId") (clojure.core/assoc :user-id (deser-work-mail-identifier (clojure.core/get-in letvar2174875 ["UserId"])))))))

(clojure.core/defn- response-deregister-from-work-mail-response ([input] (response-deregister-from-work-mail-response nil input)) ([resultWrapper2174877 input] (clojure.core/let [rawinput2174876 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174878 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-resource-response ([input] (response-delete-resource-response nil input)) ([resultWrapper2174880 input] (clojure.core/let [rawinput2174879 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174881 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-group-members-response ([input] (response-list-group-members-response nil input)) ([resultWrapper2174883 input] (clojure.core/let [rawinput2174882 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174884 {"Members" (rawinput2174882 "Members"), "NextToken" (rawinput2174882 "NextToken")}] (clojure.core/cond-> {} (letvar2174884 "Members") (clojure.core/assoc :members (deser-members (clojure.core/get-in letvar2174884 ["Members"]))) (letvar2174884 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174884 ["NextToken"])))))))

(clojure.core/defn- response-delete-alias-response ([input] (response-delete-alias-response nil input)) ([resultWrapper2174886 input] (clojure.core/let [rawinput2174885 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174887 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reset-password-response ([input] (response-reset-password-response nil input)) ([resultWrapper2174889 input] (clojure.core/let [rawinput2174888 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174890 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-delegate-from-resource-response ([input] (response-disassociate-delegate-from-resource-response nil input)) ([resultWrapper2174892 input] (clojure.core/let [rawinput2174891 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174893 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-organization-not-found-exception ([input] (response-organization-not-found-exception nil input)) ([resultWrapper2174895 input] (clojure.core/let [rawinput2174894 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174896 {"Message" (rawinput2174894 "Message")}] (clojure.core/cond-> {} (letvar2174896 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174896 ["Message"])))))))

(clojure.core/defn- response-update-resource-response ([input] (response-update-resource-response nil input)) ([resultWrapper2174898 input] (clojure.core/let [rawinput2174897 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174899 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-primary-email-address-response ([input] (response-update-primary-email-address-response nil input)) ([resultWrapper2174901 input] (clojure.core/let [rawinput2174900 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174902 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-mailbox-permissions-response ([input] (response-delete-mailbox-permissions-response nil input)) ([resultWrapper2174904 input] (clojure.core/let [rawinput2174903 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174905 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-resource-response ([input] (response-describe-resource-response nil input)) ([resultWrapper2174907 input] (clojure.core/let [rawinput2174906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174908 {"ResourceId" (rawinput2174906 "ResourceId"), "Email" (rawinput2174906 "Email"), "Name" (rawinput2174906 "Name"), "Type" (rawinput2174906 "Type"), "BookingOptions" (rawinput2174906 "BookingOptions"), "State" (rawinput2174906 "State"), "EnabledDate" (rawinput2174906 "EnabledDate"), "DisabledDate" (rawinput2174906 "DisabledDate")}] (clojure.core/cond-> {} (letvar2174908 "ResourceId") (clojure.core/assoc :resource-id (deser-resource-id (clojure.core/get-in letvar2174908 ["ResourceId"]))) (letvar2174908 "Email") (clojure.core/assoc :email (deser-email-address (clojure.core/get-in letvar2174908 ["Email"]))) (letvar2174908 "Name") (clojure.core/assoc :name (deser-resource-name (clojure.core/get-in letvar2174908 ["Name"]))) (letvar2174908 "Type") (clojure.core/assoc :type (deser-resource-type (clojure.core/get-in letvar2174908 ["Type"]))) (letvar2174908 "BookingOptions") (clojure.core/assoc :booking-options (deser-booking-options (clojure.core/get-in letvar2174908 ["BookingOptions"]))) (letvar2174908 "State") (clojure.core/assoc :state (deser-entity-state (clojure.core/get-in letvar2174908 ["State"]))) (letvar2174908 "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (clojure.core/get-in letvar2174908 ["EnabledDate"]))) (letvar2174908 "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (clojure.core/get-in letvar2174908 ["DisabledDate"])))))))

(clojure.core/defn- response-directory-service-authentication-failed-exception ([input] (response-directory-service-authentication-failed-exception nil input)) ([resultWrapper2174910 input] (clojure.core/let [rawinput2174909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174911 {"Message" (rawinput2174909 "Message")}] (clojure.core/cond-> {} (letvar2174911 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174911 ["Message"])))))))

(clojure.core/defn- response-list-resources-response ([input] (response-list-resources-response nil input)) ([resultWrapper2174913 input] (clojure.core/let [rawinput2174912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174914 {"Resources" (rawinput2174912 "Resources"), "NextToken" (rawinput2174912 "NextToken")}] (clojure.core/cond-> {} (letvar2174914 "Resources") (clojure.core/assoc :resources (deser-resources (clojure.core/get-in letvar2174914 ["Resources"]))) (letvar2174914 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174914 ["NextToken"])))))))

(clojure.core/defn- response-list-organizations-response ([input] (response-list-organizations-response nil input)) ([resultWrapper2174916 input] (clojure.core/let [rawinput2174915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174917 {"OrganizationSummaries" (rawinput2174915 "OrganizationSummaries"), "NextToken" (rawinput2174915 "NextToken")}] (clojure.core/cond-> {} (letvar2174917 "OrganizationSummaries") (clojure.core/assoc :organization-summaries (deser-organization-summaries (clojure.core/get-in letvar2174917 ["OrganizationSummaries"]))) (letvar2174917 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174917 ["NextToken"])))))))

(clojure.core/defn- response-list-resource-delegates-response ([input] (response-list-resource-delegates-response nil input)) ([resultWrapper2174919 input] (clojure.core/let [rawinput2174918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174920 {"Delegates" (rawinput2174918 "Delegates"), "NextToken" (rawinput2174918 "NextToken")}] (clojure.core/cond-> {} (letvar2174920 "Delegates") (clojure.core/assoc :delegates (deser-resource-delegates (clojure.core/get-in letvar2174920 ["Delegates"]))) (letvar2174920 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174920 ["NextToken"])))))))

(clojure.core/defn- response-list-groups-response ([input] (response-list-groups-response nil input)) ([resultWrapper2174922 input] (clojure.core/let [rawinput2174921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174923 {"Groups" (rawinput2174921 "Groups"), "NextToken" (rawinput2174921 "NextToken")}] (clojure.core/cond-> {} (letvar2174923 "Groups") (clojure.core/assoc :groups (deser-groups (clojure.core/get-in letvar2174923 ["Groups"]))) (letvar2174923 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174923 ["NextToken"])))))))

(clojure.core/defn- response-delete-group-response ([input] (response-delete-group-response nil input)) ([resultWrapper2174925 input] (clojure.core/let [rawinput2174924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174926 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-password-exception ([input] (response-invalid-password-exception nil input)) ([resultWrapper2174928 input] (clojure.core/let [rawinput2174927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174929 {"Message" (rawinput2174927 "Message")}] (clojure.core/cond-> {} (letvar2174929 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174929 ["Message"])))))))

(clojure.core/defn- response-delete-user-response ([input] (response-delete-user-response nil input)) ([resultWrapper2174931 input] (clojure.core/let [rawinput2174930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174932 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-disassociate-member-from-group-response ([input] (response-disassociate-member-from-group-response nil input)) ([resultWrapper2174934 input] (clojure.core/let [rawinput2174933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174935 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-register-to-work-mail-response ([input] (response-register-to-work-mail-response nil input)) ([resultWrapper2174937 input] (clojure.core/let [rawinput2174936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174938 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-resource-response ([input] (response-create-resource-response nil input)) ([resultWrapper2174940 input] (clojure.core/let [rawinput2174939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174941 {"ResourceId" (rawinput2174939 "ResourceId")}] (clojure.core/cond-> {} (letvar2174941 "ResourceId") (clojure.core/assoc :resource-id (deser-resource-id (clojure.core/get-in letvar2174941 ["ResourceId"])))))))

(clojure.core/defn- response-directory-unavailable-exception ([input] (response-directory-unavailable-exception nil input)) ([resultWrapper2174943 input] (clojure.core/let [rawinput2174942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174944 {"Message" (rawinput2174942 "Message")}] (clojure.core/cond-> {} (letvar2174944 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174944 ["Message"])))))))

(clojure.core/defn- response-entity-already-registered-exception ([input] (response-entity-already-registered-exception nil input)) ([resultWrapper2174946 input] (clojure.core/let [rawinput2174945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174947 {"Message" (rawinput2174945 "Message")}] (clojure.core/cond-> {} (letvar2174947 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174947 ["Message"])))))))

(clojure.core/defn- response-describe-user-response ([input] (response-describe-user-response nil input)) ([resultWrapper2174949 input] (clojure.core/let [rawinput2174948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174950 {"UserId" (rawinput2174948 "UserId"), "Name" (rawinput2174948 "Name"), "Email" (rawinput2174948 "Email"), "DisplayName" (rawinput2174948 "DisplayName"), "State" (rawinput2174948 "State"), "UserRole" (rawinput2174948 "UserRole"), "EnabledDate" (rawinput2174948 "EnabledDate"), "DisabledDate" (rawinput2174948 "DisabledDate")}] (clojure.core/cond-> {} (letvar2174950 "UserId") (clojure.core/assoc :user-id (deser-work-mail-identifier (clojure.core/get-in letvar2174950 ["UserId"]))) (letvar2174950 "Name") (clojure.core/assoc :name (deser-user-name (clojure.core/get-in letvar2174950 ["Name"]))) (letvar2174950 "Email") (clojure.core/assoc :email (deser-email-address (clojure.core/get-in letvar2174950 ["Email"]))) (letvar2174950 "DisplayName") (clojure.core/assoc :display-name (deser-string (clojure.core/get-in letvar2174950 ["DisplayName"]))) (letvar2174950 "State") (clojure.core/assoc :state (deser-entity-state (clojure.core/get-in letvar2174950 ["State"]))) (letvar2174950 "UserRole") (clojure.core/assoc :user-role (deser-user-role (clojure.core/get-in letvar2174950 ["UserRole"]))) (letvar2174950 "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (clojure.core/get-in letvar2174950 ["EnabledDate"]))) (letvar2174950 "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (clojure.core/get-in letvar2174950 ["DisabledDate"])))))))

(clojure.core/defn- response-describe-organization-response ([input] (response-describe-organization-response nil input)) ([resultWrapper2174952 input] (clojure.core/let [rawinput2174951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174953 {"OrganizationId" (rawinput2174951 "OrganizationId"), "Alias" (rawinput2174951 "Alias"), "State" (rawinput2174951 "State"), "DirectoryId" (rawinput2174951 "DirectoryId"), "DirectoryType" (rawinput2174951 "DirectoryType"), "DefaultMailDomain" (rawinput2174951 "DefaultMailDomain"), "CompletedDate" (rawinput2174951 "CompletedDate"), "ErrorMessage" (rawinput2174951 "ErrorMessage")}] (clojure.core/cond-> {} (letvar2174953 "OrganizationId") (clojure.core/assoc :organization-id (deser-organization-id (clojure.core/get-in letvar2174953 ["OrganizationId"]))) (letvar2174953 "Alias") (clojure.core/assoc :alias (deser-organization-name (clojure.core/get-in letvar2174953 ["Alias"]))) (letvar2174953 "State") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar2174953 ["State"]))) (letvar2174953 "DirectoryId") (clojure.core/assoc :directory-id (deser-string (clojure.core/get-in letvar2174953 ["DirectoryId"]))) (letvar2174953 "DirectoryType") (clojure.core/assoc :directory-type (deser-string (clojure.core/get-in letvar2174953 ["DirectoryType"]))) (letvar2174953 "DefaultMailDomain") (clojure.core/assoc :default-mail-domain (deser-string (clojure.core/get-in letvar2174953 ["DefaultMailDomain"]))) (letvar2174953 "CompletedDate") (clojure.core/assoc :completed-date (deser-timestamp (clojure.core/get-in letvar2174953 ["CompletedDate"]))) (letvar2174953 "ErrorMessage") (clojure.core/assoc :error-message (deser-string (clojure.core/get-in letvar2174953 ["ErrorMessage"])))))))

(clojure.core/defn- response-unsupported-operation-exception ([input] (response-unsupported-operation-exception nil input)) ([resultWrapper2174955 input] (clojure.core/let [rawinput2174954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174956 {"Message" (rawinput2174954 "Message")}] (clojure.core/cond-> {} (letvar2174956 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174956 ["Message"])))))))

(clojure.core/defn- response-organization-state-exception ([input] (response-organization-state-exception nil input)) ([resultWrapper2174958 input] (clojure.core/let [rawinput2174957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174959 {"Message" (rawinput2174957 "Message")}] (clojure.core/cond-> {} (letvar2174959 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174959 ["Message"])))))))

(clojure.core/defn- response-reserved-name-exception ([input] (response-reserved-name-exception nil input)) ([resultWrapper2174961 input] (clojure.core/let [rawinput2174960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174962 {"Message" (rawinput2174960 "Message")}] (clojure.core/cond-> {} (letvar2174962 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174962 ["Message"])))))))

(clojure.core/defn- response-entity-state-exception ([input] (response-entity-state-exception nil input)) ([resultWrapper2174964 input] (clojure.core/let [rawinput2174963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174965 {"Message" (rawinput2174963 "Message")}] (clojure.core/cond-> {} (letvar2174965 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174965 ["Message"])))))))

(clojure.core/defn- response-list-aliases-response ([input] (response-list-aliases-response nil input)) ([resultWrapper2174967 input] (clojure.core/let [rawinput2174966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174968 {"Aliases" (rawinput2174966 "Aliases"), "NextToken" (rawinput2174966 "NextToken")}] (clojure.core/cond-> {} (letvar2174968 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar2174968 ["Aliases"]))) (letvar2174968 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174968 ["NextToken"])))))))

(clojure.core/defn- response-create-group-response ([input] (response-create-group-response nil input)) ([resultWrapper2174970 input] (clojure.core/let [rawinput2174969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174971 {"GroupId" (rawinput2174969 "GroupId")}] (clojure.core/cond-> {} (letvar2174971 "GroupId") (clojure.core/assoc :group-id (deser-work-mail-identifier (clojure.core/get-in letvar2174971 ["GroupId"])))))))

(clojure.core/defn- response-list-mailbox-permissions-response ([input] (response-list-mailbox-permissions-response nil input)) ([resultWrapper2174973 input] (clojure.core/let [rawinput2174972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174974 {"Permissions" (rawinput2174972 "Permissions"), "NextToken" (rawinput2174972 "NextToken")}] (clojure.core/cond-> {} (letvar2174974 "Permissions") (clojure.core/assoc :permissions (deser-permissions (clojure.core/get-in letvar2174974 ["Permissions"]))) (letvar2174974 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2174974 ["NextToken"])))))))

(clojure.core/defn- response-mail-domain-not-found-exception ([input] (response-mail-domain-not-found-exception nil input)) ([resultWrapper2174976 input] (clojure.core/let [rawinput2174975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174977 {"Message" (rawinput2174975 "Message")}] (clojure.core/cond-> {} (letvar2174977 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174977 ["Message"])))))))

(clojure.core/defn- response-email-address-in-use-exception ([input] (response-email-address-in-use-exception nil input)) ([resultWrapper2174979 input] (clojure.core/let [rawinput2174978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174980 {"Message" (rawinput2174978 "Message")}] (clojure.core/cond-> {} (letvar2174980 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174980 ["Message"])))))))

(clojure.core/defn- response-name-availability-exception ([input] (response-name-availability-exception nil input)) ([resultWrapper2174982 input] (clojure.core/let [rawinput2174981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174983 {"Message" (rawinput2174981 "Message")}] (clojure.core/cond-> {} (letvar2174983 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174983 ["Message"])))))))

(clojure.core/defn- response-put-mailbox-permissions-response ([input] (response-put-mailbox-permissions-response nil input)) ([resultWrapper2174985 input] (clojure.core/let [rawinput2174984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174986 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-group-response ([input] (response-describe-group-response nil input)) ([resultWrapper2174988 input] (clojure.core/let [rawinput2174987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174989 {"GroupId" (rawinput2174987 "GroupId"), "Name" (rawinput2174987 "Name"), "Email" (rawinput2174987 "Email"), "State" (rawinput2174987 "State"), "EnabledDate" (rawinput2174987 "EnabledDate"), "DisabledDate" (rawinput2174987 "DisabledDate")}] (clojure.core/cond-> {} (letvar2174989 "GroupId") (clojure.core/assoc :group-id (deser-work-mail-identifier (clojure.core/get-in letvar2174989 ["GroupId"]))) (letvar2174989 "Name") (clojure.core/assoc :name (deser-group-name (clojure.core/get-in letvar2174989 ["Name"]))) (letvar2174989 "Email") (clojure.core/assoc :email (deser-email-address (clojure.core/get-in letvar2174989 ["Email"]))) (letvar2174989 "State") (clojure.core/assoc :state (deser-entity-state (clojure.core/get-in letvar2174989 ["State"]))) (letvar2174989 "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (clojure.core/get-in letvar2174989 ["EnabledDate"]))) (letvar2174989 "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (clojure.core/get-in letvar2174989 ["DisabledDate"])))))))

(clojure.core/defn- response-associate-member-to-group-response ([input] (response-associate-member-to-group-response nil input)) ([resultWrapper2174991 input] (clojure.core/let [rawinput2174990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174992 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-delegate-to-resource-response ([input] (response-associate-delegate-to-resource-response nil input)) ([resultWrapper2174994 input] (clojure.core/let [rawinput2174993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174995 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-mail-domain-state-exception ([input] (response-mail-domain-state-exception nil input)) ([resultWrapper2174997 input] (clojure.core/let [rawinput2174996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2174998 {"Message" (rawinput2174996 "Message")}] (clojure.core/cond-> {} (letvar2174998 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2174998 ["Message"])))))))

(clojure.core/defn- response-create-alias-response ([input] (response-create-alias-response nil input)) ([resultWrapper2175000 input] (clojure.core/let [rawinput2174999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2175001 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper2175003 input] (clojure.core/let [rawinput2175002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2175004 {"Message" (rawinput2175002 "Message")}] (clojure.core/cond-> {} (letvar2175004 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2175004 ["Message"])))))))

(clojure.core/defn- response-entity-not-found-exception ([input] (response-entity-not-found-exception nil input)) ([resultWrapper2175006 input] (clojure.core/let [rawinput2175005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2175007 {"Message" (rawinput2175005 "Message")}] (clojure.core/cond-> {} (letvar2175007 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2175007 ["Message"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper2175009 input] (clojure.core/let [rawinput2175008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2175010 {"Users" (rawinput2175008 "Users"), "NextToken" (rawinput2175008 "NextToken")}] (clojure.core/cond-> {} (letvar2175010 "Users") (clojure.core/assoc :users (deser-users (clojure.core/get-in letvar2175010 ["Users"]))) (letvar2175010 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2175010 ["NextToken"])))))))

(clojure.core/defn- response-invalid-configuration-exception ([input] (response-invalid-configuration-exception nil input)) ([resultWrapper2175012 input] (clojure.core/let [rawinput2175011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2175013 {"Message" (rawinput2175011 "Message")}] (clojure.core/cond-> {} (letvar2175013 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar2175013 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.workmail.create-resource-request/name (clojure.spec.alpha/and :portkey.aws.workmail/resource-name))
(clojure.spec.alpha/def :portkey.aws.workmail.create-resource-request/type (clojure.spec.alpha/and :portkey.aws.workmail/resource-type))
(clojure.spec.alpha/def :portkey.aws.workmail/create-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.create-resource-request/name :portkey.aws.workmail.create-resource-request/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.put-mailbox-permissions-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.put-mailbox-permissions-request/grantee-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/put-mailbox-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.put-mailbox-permissions-request/entity-id :portkey.aws.workmail.put-mailbox-permissions-request/grantee-id :portkey.aws.workmail/permission-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.create-user-response/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.create-user-response/user-id]))

(clojure.spec.alpha/def :portkey.aws.workmail/deregister-from-work-mail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.booking-options/auto-accept-requests (clojure.spec.alpha/and :portkey.aws.workmail/boolean))
(clojure.spec.alpha/def :portkey.aws.workmail.booking-options/auto-decline-recurring-requests (clojure.spec.alpha/and :portkey.aws.workmail/boolean))
(clojure.spec.alpha/def :portkey.aws.workmail.booking-options/auto-decline-conflicting-requests (clojure.spec.alpha/and :portkey.aws.workmail/boolean))
(clojure.spec.alpha/def :portkey.aws.workmail/booking-options (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.booking-options/auto-accept-requests :portkey.aws.workmail.booking-options/auto-decline-recurring-requests :portkey.aws.workmail.booking-options/auto-decline-conflicting-requests]))

(clojure.spec.alpha/def :portkey.aws.workmail.associate-delegate-to-resource-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/associate-delegate-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id :portkey.aws.workmail.associate-delegate-to-resource-request/entity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/permissions (clojure.spec.alpha/coll-of :portkey.aws.workmail/permission))

(clojure.spec.alpha/def :portkey.aws.workmail/list-group-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/members :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/reset-password-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.permission/grantee-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.permission/grantee-type (clojure.spec.alpha/and :portkey.aws.workmail/member-type))
(clojure.spec.alpha/def :portkey.aws.workmail/permission (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail.permission/grantee-id :portkey.aws.workmail.permission/grantee-type :portkey.aws.workmail/permission-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.deregister-from-work-mail-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/deregister-from-work-mail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.deregister-from-work-mail-request/entity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-delegate-from-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.update-primary-email-address-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.update-primary-email-address-request/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/update-primary-email-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.update-primary-email-address-request/entity-id :portkey.aws.workmail.update-primary-email-address-request/email] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.organization-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/organization-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.organization-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/permission-values (clojure.spec.alpha/coll-of :portkey.aws.workmail/permission-type))

(clojure.spec.alpha/def :portkey.aws.workmail.list-mailbox-permissions-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/list-mailbox-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.list-mailbox-permissions-request/entity-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/update-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.describe-group-request/group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/work-mail-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 12 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workmail/update-primary-email-address-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-mailbox-permissions-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/name (clojure.spec.alpha/and :portkey.aws.workmail/resource-name))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/type (clojure.spec.alpha/and :portkey.aws.workmail/resource-type))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-resource-response/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/resource-id :portkey.aws.workmail.describe-resource-response/email :portkey.aws.workmail.describe-resource-response/name :portkey.aws.workmail.describe-resource-response/type :portkey.aws.workmail/booking-options :portkey.aws.workmail.describe-resource-response/state :portkey.aws.workmail.describe-resource-response/enabled-date :portkey.aws.workmail.describe-resource-response/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail.member/id (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.member/name (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.member/type (clojure.spec.alpha/and :portkey.aws.workmail/member-type))
(clojure.spec.alpha/def :portkey.aws.workmail.member/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.member/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.member/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/member (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.member/id :portkey.aws.workmail.member/name :portkey.aws.workmail.member/type :portkey.aws.workmail.member/state :portkey.aws.workmail.member/enabled-date :portkey.aws.workmail.member/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail.directory-service-authentication-failed-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/directory-service-authentication-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.directory-service-authentication-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/resources :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-organizations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/organization-summaries :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/organization-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 62)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.list-resource-delegates-response/delegates (clojure.spec.alpha/and :portkey.aws.workmail/resource-delegates))
(clojure.spec.alpha/def :portkey.aws.workmail/list-resource-delegates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.list-resource-delegates-response/delegates :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail.disassociate-member-from-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.disassociate-member-from-group-request/member-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-member-from-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.disassociate-member-from-group-request/group-id :portkey.aws.workmail.disassociate-member-from-group-request/member-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/list-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/groups :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^m-[0-9a-f]{32}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.user/id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.user/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.user/name (clojure.spec.alpha/and :portkey.aws.workmail/user-name))
(clojure.spec.alpha/def :portkey.aws.workmail.user/display-name (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.user/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.user/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.user/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.user/id :portkey.aws.workmail.user/email :portkey.aws.workmail.user/name :portkey.aws.workmail.user/display-name :portkey.aws.workmail.user/state :portkey.aws.workmail/user-role :portkey.aws.workmail.user/enabled-date :portkey.aws.workmail.user/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail/members (clojure.spec.alpha/coll-of :portkey.aws.workmail/member))

(clojure.spec.alpha/def :portkey.aws.workmail/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.invalid-password-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.update-resource-request/name (clojure.spec.alpha/and :portkey.aws.workmail/resource-name))
(clojure.spec.alpha/def :portkey.aws.workmail/update-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id] :opt-un [:portkey.aws.workmail.update-resource-request/name :portkey.aws.workmail/booking-options]))

(clojure.spec.alpha/def :portkey.aws.workmail/describe-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/aliases (clojure.spec.alpha/coll-of :portkey.aws.workmail/email-address))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-delegates (clojure.spec.alpha/coll-of :portkey.aws.workmail/delegate))

(clojure.spec.alpha/def :portkey.aws.workmail/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workmail.create-alias-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.create-alias-request/alias (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.create-alias-request/entity-id :portkey.aws.workmail.create-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.reset-password-request/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/reset-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.reset-password-request/user-id :portkey.aws.workmail/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/describe-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-member-from-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^r-[0-9a-f]{32}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail/register-to-work-mail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail/create-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/resource-id]))

(clojure.spec.alpha/def :portkey.aws.workmail.directory-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/directory-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.directory-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.organization-summary/alias (clojure.spec.alpha/and :portkey.aws.workmail/organization-name))
(clojure.spec.alpha/def :portkey.aws.workmail.organization-summary/error-message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.organization-summary/state (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/organization-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.organization-summary/alias :portkey.aws.workmail.organization-summary/error-message :portkey.aws.workmail.organization-summary/state]))

(clojure.spec.alpha/def :portkey.aws.workmail.entity-already-registered-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/entity-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.entity-already-registered-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/name (clojure.spec.alpha/and :portkey.aws.workmail/user-name))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/display-name (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-response/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.describe-user-response/user-id :portkey.aws.workmail.describe-user-response/name :portkey.aws.workmail.describe-user-response/email :portkey.aws.workmail.describe-user-response/display-name :portkey.aws.workmail.describe-user-response/state :portkey.aws.workmail/user-role :portkey.aws.workmail.describe-user-response/enabled-date :portkey.aws.workmail.describe-user-response/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/alias (clojure.spec.alpha/and :portkey.aws.workmail/organization-name))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/state (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/directory-id (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/directory-type (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/default-mail-domain (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/completed-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-organization-response/error-message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.describe-organization-response/alias :portkey.aws.workmail.describe-organization-response/state :portkey.aws.workmail.describe-organization-response/directory-id :portkey.aws.workmail.describe-organization-response/directory-type :portkey.aws.workmail.describe-organization-response/default-mail-domain :portkey.aws.workmail.describe-organization-response/completed-date :portkey.aws.workmail.describe-organization-response/error-message]))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.describe-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.unsupported-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.list-group-members-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/list-group-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.list-group-members-request/group-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/user-role #{"USER" "SYSTEM_USER" :resource "RESOURCE" :user :system-user})

(clojure.spec.alpha/def :portkey.aws.workmail.delegate/id (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.delegate/type (clojure.spec.alpha/and :portkey.aws.workmail/member-type))
(clojure.spec.alpha/def :portkey.aws.workmail/delegate (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail.delegate/id :portkey.aws.workmail.delegate/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.delete-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/delete-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.delete-group-request/group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/resources (clojure.spec.alpha/coll-of :portkey.aws.workmail/resource))

(clojure.spec.alpha/def :portkey.aws.workmail/entity-state #{:deleted "DISABLED" :disabled "DELETED" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.workmail.delete-mailbox-permissions-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.delete-mailbox-permissions-request/grantee-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/delete-mailbox-permissions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.delete-mailbox-permissions-request/entity-id :portkey.aws.workmail.delete-mailbox-permissions-request/grantee-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/list-organizations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail.register-to-work-mail-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.register-to-work-mail-request/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/register-to-work-mail-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.register-to-work-mail-request/entity-id :portkey.aws.workmail.register-to-work-mail-request/email] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 20)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.organization-state-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/organization-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.organization-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.delete-alias-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.delete-alias-request/alias (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/delete-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.delete-alias-request/entity-id :portkey.aws.workmail.delete-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.workmail/permission-type #{"FULL_ACCESS" "SEND_ON_BEHALF" :send-on-behalf "SEND_AS" :full-access :send-as})

(clojure.spec.alpha/def :portkey.aws.workmail/users (clojure.spec.alpha/coll-of :portkey.aws.workmail/user))

(clojure.spec.alpha/def :portkey.aws.workmail/groups (clojure.spec.alpha/coll-of :portkey.aws.workmail/group))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-type #{:equipment "ROOM" "EQUIPMENT" :room})

(clojure.spec.alpha/def :portkey.aws.workmail.reserved-name-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/reserved-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.reserved-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.entity-state-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/entity-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.entity-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/aliases :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail.create-user-request/name (clojure.spec.alpha/and :portkey.aws.workmail/user-name))
(clojure.spec.alpha/def :portkey.aws.workmail.create-user-request/display-name (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.create-user-request/name :portkey.aws.workmail.create-user-request/display-name :portkey.aws.workmail/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.create-group-response/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/create-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.create-group-response/group-id]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-mailbox-permissions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/permissions :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/organization-summaries (clojure.spec.alpha/coll-of :portkey.aws.workmail/organization-summary))

(clojure.spec.alpha/def :portkey.aws.workmail/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.workmail.create-group-request/name (clojure.spec.alpha/and :portkey.aws.workmail/group-name))
(clojure.spec.alpha/def :portkey.aws.workmail/create-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.create-group-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.mail-domain-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/mail-domain-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.mail-domain-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.delete-user-request/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.delete-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.workmail.resource/id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/name (clojure.spec.alpha/and :portkey.aws.workmail/resource-name))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/type (clojure.spec.alpha/and :portkey.aws.workmail/resource-type))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.resource/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.resource/id :portkey.aws.workmail.resource/email :portkey.aws.workmail.resource/name :portkey.aws.workmail.resource/type :portkey.aws.workmail.resource/state :portkey.aws.workmail.resource/enabled-date :portkey.aws.workmail.resource/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail.email-address-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/email-address-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.email-address-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.name-availability-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/name-availability-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.name-availability-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/put-mailbox-permissions-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/name (clojure.spec.alpha/and :portkey.aws.workmail/group-name))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.describe-group-response/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/describe-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.describe-group-response/group-id :portkey.aws.workmail.describe-group-response/name :portkey.aws.workmail.describe-group-response/email :portkey.aws.workmail.describe-group-response/state :portkey.aws.workmail.describe-group-response/enabled-date :portkey.aws.workmail.describe-group-response/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail/associate-member-to-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/associate-delegate-to-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.mail-domain-state-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/mail-domain-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.mail-domain-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/create-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.group/id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.group/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.group/name (clojure.spec.alpha/and :portkey.aws.workmail/group-name))
(clojure.spec.alpha/def :portkey.aws.workmail.group/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.group/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.group/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.group/id :portkey.aws.workmail.group/email :portkey.aws.workmail.group/name :portkey.aws.workmail.group/state :portkey.aws.workmail.group/enabled-date :portkey.aws.workmail.group/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 254)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.entity-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/entity-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.entity-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/users :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail.disassociate-delegate-from-resource-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-delegate-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id :portkey.aws.workmail.disassociate-delegate-from-resource-request/entity-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.list-aliases-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/list-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.list-aliases-request/entity-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/member-type #{"USER" :group :user "GROUP"})

(clojure.spec.alpha/def :portkey.aws.workmail.invalid-configuration-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/invalid-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.invalid-configuration-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.associate-member-to-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.associate-member-to-group-request/member-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/associate-member-to-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.associate-member-to-group-request/group-id :portkey.aws.workmail.associate-member-to-group-request/member-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.list-resource-delegates-request/resource-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/list-resource-delegates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.list-resource-delegates-request/resource-id] :opt-un [:portkey.aws.workmail/next-token :portkey.aws.workmail/max-results]))

(clojure.spec.alpha/def :portkey.aws.workmail/boolean clojure.core/boolean?)

(clojure.core/defn create-alias "Adds an alias to the set of a given member of Amazon WorkMail." ([create-alias-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-alias-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn response-create-alias-response, :http.request.spec/error-spec {"EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-alias-response))

(clojure.core/defn associate-member-to-group "Adds a member to the group's set." ([associate-member-to-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-member-to-group-request associate-member-to-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/associate-member-to-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/associate-member-to-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateMemberToGroup", :http.request.configuration/output-deser-fn response-associate-member-to-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef associate-member-to-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/associate-member-to-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/associate-member-to-group-response))

(clojure.core/defn delete-group "Deletes a group from Amazon WorkMail." ([delete-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn response-delete-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-group-response))

(clojure.core/defn create-resource "Creates a new Amazon WorkMail resource. The available types are equipment and\nroom." ([create-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-resource-request create-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResource", :http.request.configuration/output-deser-fn response-create-resource-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception}})))))
(clojure.spec.alpha/fdef create-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-resource-response))

(clojure.core/defn list-mailbox-permissions "Lists the mailbox permissions associated with a mailbox." ([list-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-mailbox-permissions-request list-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMailboxPermissions", :http.request.configuration/output-deser-fn response-list-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-mailbox-permissions-response))

(clojure.core/defn describe-resource "Returns the data available for the resource." ([describe-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-resource-request describe-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeResource", :http.request.configuration/output-deser-fn response-describe-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-resource-response))

(clojure.core/defn update-primary-email-address "Updates the primary email for an entity. The current email is moved into the\nlist of aliases (or swapped between an existing alias and the current primary\nemail) and the email provided in the input is promoted as the primary." ([update-primary-email-address-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-primary-email-address-request update-primary-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/update-primary-email-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/update-primary-email-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePrimaryEmailAddress", :http.request.configuration/output-deser-fn response-update-primary-email-address-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef update-primary-email-address :args (clojure.spec.alpha/tuple :portkey.aws.workmail/update-primary-email-address-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/update-primary-email-address-response))

(clojure.core/defn list-groups "Returns summaries of the organization's groups." ([list-groups-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-groups-request list-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGroups", :http.request.configuration/output-deser-fn response-list-groups-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-groups-response))

(clojure.core/defn update-resource "Updates data for the resource. It must be preceded by a describe call in order\nto have the latest information. The dataset in the request should be the one\nexpected when performing another describe call." ([update-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-resource-request update-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/update-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/update-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResource", :http.request.configuration/output-deser-fn response-update-resource-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidConfigurationException" :portkey.aws.workmail/invalid-configuration-exception}})))))
(clojure.spec.alpha/fdef update-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/update-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/update-resource-response))

(clojure.core/defn describe-group "Returns the data available for the group." ([describe-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-group-request describe-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeGroup", :http.request.configuration/output-deser-fn response-describe-group-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-group-response))

(clojure.core/defn put-mailbox-permissions "Sets permissions for a user or group. This replaces any pre-existing permissions\nset for the entity." ([put-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-mailbox-permissions-request put-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/put-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/put-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutMailboxPermissions", :http.request.configuration/output-deser-fn response-put-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef put-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/put-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/put-mailbox-permissions-response))

(clojure.core/defn delete-user "Deletes a user from Amazon WorkMail and all subsequent systems. The action can't\nbe undone. The mailbox is kept as-is for a minimum of 30 days, without any means\nto restore it." ([delete-user-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn response-delete-user-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-user-response))

(clojure.core/defn create-user "Creates a user who can be used in Amazon WorkMail by calling the\nRegisterToWorkMail operation." ([create-user-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "InvalidPasswordException" :portkey.aws.workmail/invalid-password-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-user-response))

(clojure.core/defn list-resources "Returns summaries of the organization's resources." ([list-resources-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn response-list-resources-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-resources-response))

(clojure.core/defn list-aliases "Creates a paginated call to list the aliases associated with a given entity." ([list-aliases-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-aliases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn response-list-aliases-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-aliases-response))

(clojure.core/defn disassociate-delegate-from-resource "Removes a member from the resource's set of delegates." ([disassociate-delegate-from-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-delegate-from-resource-request disassociate-delegate-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/disassociate-delegate-from-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/disassociate-delegate-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDelegateFromResource", :http.request.configuration/output-deser-fn response-disassociate-delegate-from-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef disassociate-delegate-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/disassociate-delegate-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/disassociate-delegate-from-resource-response))

(clojure.core/defn delete-resource "Deletes the specified resource." ([delete-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-resource-request delete-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResource", :http.request.configuration/output-deser-fn response-delete-resource-response, :http.request.spec/error-spec {"EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-resource-response))

(clojure.core/defn deregister-from-work-mail "Mark a user, group, or resource as no longer used in Amazon WorkMail. This\naction disassociates the mailbox and schedules it for clean-up. Amazon WorkMail\nkeeps mailboxes for 30 days before they are permanently removed. The\nfunctionality in the console is Disable." ([deregister-from-work-mail-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-deregister-from-work-mail-request deregister-from-work-mail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/deregister-from-work-mail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/deregister-from-work-mail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterFromWorkMail", :http.request.configuration/output-deser-fn response-deregister-from-work-mail-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef deregister-from-work-mail :args (clojure.spec.alpha/tuple :portkey.aws.workmail/deregister-from-work-mail-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/deregister-from-work-mail-response))

(clojure.core/defn delete-alias "Remove the alias from a set of aliases for a given user." ([delete-alias-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-alias-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn response-delete-alias-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-alias-response))

(clojure.core/defn associate-delegate-to-resource "Adds a member to the resource's set of delegates." ([associate-delegate-to-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-associate-delegate-to-resource-request associate-delegate-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/associate-delegate-to-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/associate-delegate-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDelegateToResource", :http.request.configuration/output-deser-fn response-associate-delegate-to-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef associate-delegate-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/associate-delegate-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/associate-delegate-to-resource-response))

(clojure.core/defn register-to-work-mail "Registers an existing and disabled user, group, or resource/entity for Amazon\nWorkMail use by associating a mailbox and calendaring capabilities. It performs\nno change if the entity is enabled and fails if the entity is deleted. This\noperation results in the accumulation of costs. For more information, see\nPricing (http://aws.amazon.com/workmail/pricing). The equivalent console\nfunctionality for this operation is Enable. Users can either be created by\ncalling the CreateUser API or they can be synchronized from your directory. For\nmore information, see DeregisterFromWorkMail." ([register-to-work-mail-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-register-to-work-mail-request register-to-work-mail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/register-to-work-mail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/register-to-work-mail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterToWorkMail", :http.request.configuration/output-deser-fn response-register-to-work-mail-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityAlreadyRegisteredException" :portkey.aws.workmail/entity-already-registered-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef register-to-work-mail :args (clojure.spec.alpha/tuple :portkey.aws.workmail/register-to-work-mail-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/register-to-work-mail-response))

(clojure.core/defn list-users "Returns summaries of the organization's users." ([list-users-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-users-response))

(clojure.core/defn list-resource-delegates "Lists the delegates associated with a resource. Users and groups can be resource\ndelegates and answer requests on behalf of the resource." ([list-resource-delegates-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-resource-delegates-request list-resource-delegates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-resource-delegates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-resource-delegates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourceDelegates", :http.request.configuration/output-deser-fn response-list-resource-delegates-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-resource-delegates :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-resource-delegates-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-resource-delegates-response))

(clojure.core/defn create-group "Creates a group that can be used in Amazon WorkMail by calling the\nRegisterToWorkMail operation." ([create-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn response-create-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-group-response))

(clojure.core/defn delete-mailbox-permissions "Deletes permissions granted to a user or group." ([delete-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-mailbox-permissions-request delete-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMailboxPermissions", :http.request.configuration/output-deser-fn response-delete-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-mailbox-permissions-response))

(clojure.core/defn disassociate-member-from-group "Removes a member from a group." ([disassociate-member-from-group-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disassociate-member-from-group-request disassociate-member-from-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/disassociate-member-from-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/disassociate-member-from-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateMemberFromGroup", :http.request.configuration/output-deser-fn response-disassociate-member-from-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef disassociate-member-from-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/disassociate-member-from-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/disassociate-member-from-group-response))

(clojure.core/defn describe-organization "Provides more information regarding a given organization based on its\nidentifier." ([describe-organization-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-organization-request describe-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeOrganization", :http.request.configuration/output-deser-fn response-describe-organization-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-organization :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-organization-response))

(clojure.core/defn list-organizations "Returns summaries of the customer's non-deleted organizations." ([] (list-organizations {})) ([list-organizations-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-organizations-request list-organizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-organizations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-organizations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOrganizations", :http.request.configuration/output-deser-fn response-list-organizations-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-organizations :args (clojure.spec.alpha/? :portkey.aws.workmail/list-organizations-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-organizations-response))

(clojure.core/defn reset-password "Allows the administrator to reset the password for a user." ([reset-password-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-reset-password-request reset-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/reset-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/reset-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetPassword", :http.request.configuration/output-deser-fn response-reset-password-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "InvalidPasswordException" :portkey.aws.workmail/invalid-password-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef reset-password :args (clojure.spec.alpha/tuple :portkey.aws.workmail/reset-password-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/reset-password-response))

(clojure.core/defn list-group-members "Returns an overview of the members of a group." ([list-group-members-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-group-members-request list-group-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-group-members-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-group-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGroupMembers", :http.request.configuration/output-deser-fn response-list-group-members-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-group-members :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-group-members-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-group-members-response))

(clojure.core/defn describe-user "Provides information regarding the user." ([describe-user-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUser", :http.request.configuration/output-deser-fn response-describe-user-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-user-response))
