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

(clojure.core/defn- deser-create-user-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserId") (clojure.core/assoc :user-id (deser-work-mail-identifier (input "UserId")))))

(clojure.core/defn- deser-deregister-from-work-mail-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-group-members-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Members") (clojure.core/assoc :members (deser-members (input "Members"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-delete-alias-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-reset-password-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-disassociate-delegate-from-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-organization-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-update-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-primary-email-address-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-mailbox-permissions-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-resource-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-resource-id (input "ResourceId"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-resource-name (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-resource-type (input "Type"))) (clojure.core/contains? input "BookingOptions") (clojure.core/assoc :booking-options (deser-booking-options (input "BookingOptions"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-directory-service-authentication-failed-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-list-resources-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Resources") (clojure.core/assoc :resources (deser-resources (input "Resources"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-organizations-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "OrganizationSummaries") (clojure.core/assoc :organization-summaries (deser-organization-summaries (input "OrganizationSummaries"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-resource-delegates-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Delegates") (clojure.core/assoc :delegates (deser-resource-delegates (input "Delegates"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-list-groups-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Groups") (clojure.core/assoc :groups (deser-groups (input "Groups"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-delete-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-password-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-delete-user-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-disassociate-member-from-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-register-to-work-mail-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-resource-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceId") (clojure.core/assoc :resource-id (deser-resource-id (input "ResourceId")))))

(clojure.core/defn- deser-directory-unavailable-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-entity-already-registered-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-describe-user-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserId") (clojure.core/assoc :user-id (deser-work-mail-identifier (input "UserId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-user-name (input "Name"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-string (input "DisplayName"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "UserRole") (clojure.core/assoc :user-role (deser-user-role (input "UserRole"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-describe-organization-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "OrganizationId") (clojure.core/assoc :organization-id (deser-organization-id (input "OrganizationId"))) (clojure.core/contains? input "Alias") (clojure.core/assoc :alias (deser-organization-name (input "Alias"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string (input "State"))) (clojure.core/contains? input "DirectoryId") (clojure.core/assoc :directory-id (deser-string (input "DirectoryId"))) (clojure.core/contains? input "DirectoryType") (clojure.core/assoc :directory-type (deser-string (input "DirectoryType"))) (clojure.core/contains? input "DefaultMailDomain") (clojure.core/assoc :default-mail-domain (deser-string (input "DefaultMailDomain"))) (clojure.core/contains? input "CompletedDate") (clojure.core/assoc :completed-date (deser-timestamp (input "CompletedDate"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-unsupported-operation-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-organization-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-reserved-name-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-entity-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-list-aliases-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Aliases") (clojure.core/assoc :aliases (deser-aliases (input "Aliases"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-create-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupId") (clojure.core/assoc :group-id (deser-work-mail-identifier (input "GroupId")))))

(clojure.core/defn- deser-list-mailbox-permissions-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Permissions") (clojure.core/assoc :permissions (deser-permissions (input "Permissions"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-mail-domain-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-email-address-in-use-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-name-availability-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-put-mailbox-permissions-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-group-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "GroupId") (clojure.core/assoc :group-id (deser-work-mail-identifier (input "GroupId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-group-name (input "Name"))) (clojure.core/contains? input "Email") (clojure.core/assoc :email (deser-email-address (input "Email"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-entity-state (input "State"))) (clojure.core/contains? input "EnabledDate") (clojure.core/assoc :enabled-date (deser-timestamp (input "EnabledDate"))) (clojure.core/contains? input "DisabledDate") (clojure.core/assoc :disabled-date (deser-timestamp (input "DisabledDate")))))

(clojure.core/defn- deser-associate-member-to-group-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-associate-delegate-to-resource-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-mail-domain-state-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-create-alias-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-invalid-parameter-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-entity-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-list-users-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Users") (clojure.core/assoc :users (deser-users (input "Users"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-invalid-configuration-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

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

(clojure.spec.alpha/def :portkey.aws.workmail/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__27881__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.workmail/work-mail-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 12 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.workmail/organization-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 62)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.list-resource-delegates-response/delegates (clojure.spec.alpha/and :portkey.aws.workmail/resource-delegates))
(clojure.spec.alpha/def :portkey.aws.workmail/list-resource-delegates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.list-resource-delegates-response/delegates :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail.disassociate-member-from-group-request/group-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.disassociate-member-from-group-request/member-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-member-from-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.disassociate-member-from-group-request/group-id :portkey.aws.workmail.disassociate-member-from-group-request/member-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/list-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail/groups :portkey.aws.workmail/next-token]))

(clojure.spec.alpha/def :portkey.aws.workmail/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^m-[0-9a-f]{32}$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.user/id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.user/email (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail.user/name (clojure.spec.alpha/and :portkey.aws.workmail/user-name))
(clojure.spec.alpha/def :portkey.aws.workmail.user/display-name (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail.user/state (clojure.spec.alpha/and :portkey.aws.workmail/entity-state))
(clojure.spec.alpha/def :portkey.aws.workmail.user/enabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail.user/disabled-date (clojure.spec.alpha/and :portkey.aws.workmail/timestamp))
(clojure.spec.alpha/def :portkey.aws.workmail/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.user/id :portkey.aws.workmail.user/email :portkey.aws.workmail.user/name :portkey.aws.workmail.user/display-name :portkey.aws.workmail.user/state :portkey.aws.workmail/user-role :portkey.aws.workmail.user/enabled-date :portkey.aws.workmail.user/disabled-date]))

(clojure.spec.alpha/def :portkey.aws.workmail/members (clojure.spec.alpha/coll-of :portkey.aws.workmail/member))

(clojure.spec.alpha/def :portkey.aws.workmail/group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.invalid-password-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.update-resource-request/name (clojure.spec.alpha/and :portkey.aws.workmail/resource-name))
(clojure.spec.alpha/def :portkey.aws.workmail/update-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id] :opt-un [:portkey.aws.workmail.update-resource-request/name :portkey.aws.workmail/booking-options]))

(clojure.spec.alpha/def :portkey.aws.workmail/describe-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/aliases (clojure.spec.alpha/coll-of :portkey.aws.workmail/email-address))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-delegates (clojure.spec.alpha/coll-of :portkey.aws.workmail/delegate))

(clojure.spec.alpha/def :portkey.aws.workmail/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.workmail.create-alias-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.create-alias-request/alias (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.create-alias-request/entity-id :portkey.aws.workmail.create-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail.reset-password-request/user-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail/reset-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.reset-password-request/user-id :portkey.aws.workmail/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/describe-organization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/disassociate-member-from-group-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^r-[0-9a-f]{32}$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail/register-to-work-mail-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?" s__27881__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.workmail/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 20)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\w\-.]+(@[a-zA-Z0-9.\-]+\.[a-zA-Z0-9]{2,})?" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.workmail.organization-state-exception/message (clojure.spec.alpha/and :portkey.aws.workmail/string))
(clojure.spec.alpha/def :portkey.aws.workmail/organization-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.workmail.organization-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.workmail.delete-alias-request/entity-id (clojure.spec.alpha/and :portkey.aws.workmail/work-mail-identifier))
(clojure.spec.alpha/def :portkey.aws.workmail.delete-alias-request/alias (clojure.spec.alpha/and :portkey.aws.workmail/email-address))
(clojure.spec.alpha/def :portkey.aws.workmail/delete-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.workmail/organization-id :portkey.aws.workmail.delete-alias-request/entity-id :portkey.aws.workmail.delete-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.workmail/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.workmail/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 254)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._%+-]{1,64}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" s__27881__auto__))))

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

(clojure.core/defn create-alias ([create-alias-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-alias-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn deser-create-alias-response, :http.request.spec/error-spec {"EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-alias-response))

(clojure.core/defn associate-member-to-group ([associate-member-to-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-member-to-group-request associate-member-to-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/associate-member-to-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/associate-member-to-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateMemberToGroup", :http.request.configuration/output-deser-fn deser-associate-member-to-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef associate-member-to-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/associate-member-to-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/associate-member-to-group-response))

(clojure.core/defn delete-group ([delete-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn deser-delete-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-group-response))

(clojure.core/defn create-resource ([create-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-resource-request create-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateResource", :http.request.configuration/output-deser-fn deser-create-resource-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception}})))))
(clojure.spec.alpha/fdef create-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-resource-response))

(clojure.core/defn list-mailbox-permissions ([list-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-mailbox-permissions-request list-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMailboxPermissions", :http.request.configuration/output-deser-fn deser-list-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-mailbox-permissions-response))

(clojure.core/defn describe-resource ([describe-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-resource-request describe-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeResource", :http.request.configuration/output-deser-fn deser-describe-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-resource-response))

(clojure.core/defn update-primary-email-address ([update-primary-email-address-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-primary-email-address-request update-primary-email-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/update-primary-email-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/update-primary-email-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePrimaryEmailAddress", :http.request.configuration/output-deser-fn deser-update-primary-email-address-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef update-primary-email-address :args (clojure.spec.alpha/tuple :portkey.aws.workmail/update-primary-email-address-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/update-primary-email-address-response))

(clojure.core/defn list-groups ([list-groups-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-groups-request list-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroups", :http.request.configuration/output-deser-fn deser-list-groups-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-groups-response))

(clojure.core/defn update-resource ([update-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-resource-request update-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/update-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/update-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateResource", :http.request.configuration/output-deser-fn deser-update-resource-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidConfigurationException" :portkey.aws.workmail/invalid-configuration-exception}})))))
(clojure.spec.alpha/fdef update-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/update-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/update-resource-response))

(clojure.core/defn describe-group ([describe-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-group-request describe-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeGroup", :http.request.configuration/output-deser-fn deser-describe-group-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-group-response))

(clojure.core/defn put-mailbox-permissions ([put-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-mailbox-permissions-request put-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/put-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/put-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutMailboxPermissions", :http.request.configuration/output-deser-fn deser-put-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef put-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/put-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/put-mailbox-permissions-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn deser-delete-user-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-user-response))

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn deser-create-user-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "InvalidPasswordException" :portkey.aws.workmail/invalid-password-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-user-response))

(clojure.core/defn list-resources ([list-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn deser-list-resources-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-resources-response))

(clojure.core/defn list-aliases ([list-aliases-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-aliases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn deser-list-aliases-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-aliases-response))

(clojure.core/defn disassociate-delegate-from-resource ([disassociate-delegate-from-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-delegate-from-resource-request disassociate-delegate-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/disassociate-delegate-from-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/disassociate-delegate-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDelegateFromResource", :http.request.configuration/output-deser-fn deser-disassociate-delegate-from-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef disassociate-delegate-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/disassociate-delegate-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/disassociate-delegate-from-resource-response))

(clojure.core/defn delete-resource ([delete-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-resource-request delete-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteResource", :http.request.configuration/output-deser-fn deser-delete-resource-response, :http.request.spec/error-spec {"EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-resource-response))

(clojure.core/defn deregister-from-work-mail ([deregister-from-work-mail-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-deregister-from-work-mail-request deregister-from-work-mail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/deregister-from-work-mail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/deregister-from-work-mail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterFromWorkMail", :http.request.configuration/output-deser-fn deser-deregister-from-work-mail-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef deregister-from-work-mail :args (clojure.spec.alpha/tuple :portkey.aws.workmail/deregister-from-work-mail-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/deregister-from-work-mail-response))

(clojure.core/defn delete-alias ([delete-alias-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-alias-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn deser-delete-alias-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-alias-response))

(clojure.core/defn associate-delegate-to-resource ([associate-delegate-to-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-delegate-to-resource-request associate-delegate-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/associate-delegate-to-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/associate-delegate-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDelegateToResource", :http.request.configuration/output-deser-fn deser-associate-delegate-to-resource-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef associate-delegate-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.workmail/associate-delegate-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/associate-delegate-to-resource-response))

(clojure.core/defn register-to-work-mail ([register-to-work-mail-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-register-to-work-mail-request register-to-work-mail-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/register-to-work-mail-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/register-to-work-mail-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterToWorkMail", :http.request.configuration/output-deser-fn deser-register-to-work-mail-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityAlreadyRegisteredException" :portkey.aws.workmail/entity-already-registered-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "MailDomainNotFoundException" :portkey.aws.workmail/mail-domain-not-found-exception, "EmailAddressInUseException" :portkey.aws.workmail/email-address-in-use-exception, "MailDomainStateException" :portkey.aws.workmail/mail-domain-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef register-to-work-mail :args (clojure.spec.alpha/tuple :portkey.aws.workmail/register-to-work-mail-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/register-to-work-mail-response))

(clojure.core/defn list-users ([list-users-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-users-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn deser-list-users-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-users-response))

(clojure.core/defn list-resource-delegates ([list-resource-delegates-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-resource-delegates-request list-resource-delegates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-resource-delegates-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-resource-delegates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceDelegates", :http.request.configuration/output-deser-fn deser-list-resource-delegates-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-resource-delegates :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-resource-delegates-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-resource-delegates-response))

(clojure.core/defn create-group ([create-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/create-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/create-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn deser-create-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "NameAvailabilityException" :portkey.aws.workmail/name-availability-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "ReservedNameException" :portkey.aws.workmail/reserved-name-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/create-group-response))

(clojure.core/defn delete-mailbox-permissions ([delete-mailbox-permissions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-mailbox-permissions-request delete-mailbox-permissions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/delete-mailbox-permissions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/delete-mailbox-permissions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMailboxPermissions", :http.request.configuration/output-deser-fn deser-delete-mailbox-permissions-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef delete-mailbox-permissions :args (clojure.spec.alpha/tuple :portkey.aws.workmail/delete-mailbox-permissions-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/delete-mailbox-permissions-response))

(clojure.core/defn disassociate-member-from-group ([disassociate-member-from-group-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-member-from-group-request disassociate-member-from-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/disassociate-member-from-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/disassociate-member-from-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateMemberFromGroup", :http.request.configuration/output-deser-fn deser-disassociate-member-from-group-response, :http.request.spec/error-spec {"DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef disassociate-member-from-group :args (clojure.spec.alpha/tuple :portkey.aws.workmail/disassociate-member-from-group-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/disassociate-member-from-group-response))

(clojure.core/defn describe-organization ([describe-organization-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-organization-request describe-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-organization-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-organization-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeOrganization", :http.request.configuration/output-deser-fn deser-describe-organization-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-organization :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-organization-response))

(clojure.core/defn list-organizations ([] (list-organizations {})) ([list-organizations-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-organizations-request list-organizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-organizations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-organizations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOrganizations", :http.request.configuration/output-deser-fn deser-list-organizations-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-organizations :args (clojure.spec.alpha/? :portkey.aws.workmail/list-organizations-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-organizations-response))

(clojure.core/defn reset-password ([reset-password-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-reset-password-request reset-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/reset-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/reset-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResetPassword", :http.request.configuration/output-deser-fn deser-reset-password-response, :http.request.spec/error-spec {"OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "DirectoryServiceAuthenticationFailedException" :portkey.aws.workmail/directory-service-authentication-failed-exception, "InvalidPasswordException" :portkey.aws.workmail/invalid-password-exception, "DirectoryUnavailableException" :portkey.aws.workmail/directory-unavailable-exception, "UnsupportedOperationException" :portkey.aws.workmail/unsupported-operation-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception}})))))
(clojure.spec.alpha/fdef reset-password :args (clojure.spec.alpha/tuple :portkey.aws.workmail/reset-password-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/reset-password-response))

(clojure.core/defn list-group-members ([list-group-members-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-group-members-request list-group-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/list-group-members-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/list-group-members-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroupMembers", :http.request.configuration/output-deser-fn deser-list-group-members-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "EntityStateException" :portkey.aws.workmail/entity-state-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef list-group-members :args (clojure.spec.alpha/tuple :portkey.aws.workmail/list-group-members-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/list-group-members-response))

(clojure.core/defn describe-user ([describe-user-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.workmail/endpoints, :http.request.configuration/target-prefix "WorkMailService", :http.request.spec/output-spec :portkey.aws.workmail/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.workmail/describe-user-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeUser", :http.request.configuration/output-deser-fn deser-describe-user-response, :http.request.spec/error-spec {"EntityNotFoundException" :portkey.aws.workmail/entity-not-found-exception, "InvalidParameterException" :portkey.aws.workmail/invalid-parameter-exception, "OrganizationNotFoundException" :portkey.aws.workmail/organization-not-found-exception, "OrganizationStateException" :portkey.aws.workmail/organization-state-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.workmail/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.workmail/describe-user-response))
