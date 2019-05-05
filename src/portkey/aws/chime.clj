(ns portkey.aws.chime (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "chime", :region "us-east-1"},
    :ssl-common-name "service.chime.aws.amazon.com",
    :endpoint "https://service.chime.aws.amazon.com",
    :signature-version :v4}})

(clojure.core/declare ser-profile-service-max-results)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-user-id-list)

(clojure.core/declare ser-account-settings)

(clojure.core/declare ser-update-user-request-item-list)

(clojure.core/declare ser-update-user-request-item)

(clojure.core/declare ser-string)

(clojure.core/declare ser-user-email-list)

(clojure.core/declare ser-account-name)

(clojure.core/declare ser-license)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-profile-service-max-results [input] #:http.request.field{:value input, :shape "ProfileServiceMaxResults"})

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-user-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-non-empty-string coll) #:http.request.field{:shape "NonEmptyString"}))) input), :shape "UserIdList", :type "list", :max 50})

(clojure.core/defn- ser-account-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AccountSettings", :type "structure"} (clojure.core/contains? input :disable-remote-control) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :disable-remote-control)) #:http.request.field{:name "DisableRemoteControl", :shape "Boolean"})) (clojure.core/contains? input :enable-dial-out) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-dial-out)) #:http.request.field{:name "EnableDialOut", :shape "Boolean"}))))

(clojure.core/defn- ser-update-user-request-item-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-update-user-request-item coll) #:http.request.field{:shape "UpdateUserRequestItem"}))) input), :shape "UpdateUserRequestItemList", :type "list", :max 20})

(clojure.core/defn- ser-update-user-request-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-non-empty-string (:user-id input)) #:http.request.field{:name "UserId", :shape "NonEmptyString"})], :shape "UpdateUserRequestItem", :type "structure"} (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license (input :license-type)) #:http.request.field{:name "LicenseType", :shape "License"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-user-email-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-email-address coll) #:http.request.field{:shape "EmailAddress"}))) input), :shape "UserEmailList", :type "list", :max 50})

(clojure.core/defn- ser-account-name [input] #:http.request.field{:value input, :shape "AccountName"})

(clojure.core/defn- ser-license [input] #:http.request.field{:value (clojure.core/get {"Basic" "Basic", :basic "Basic", "Plus" "Plus", :plus "Plus", "Pro" "Pro", :pro "Pro", "ProTrial" "ProTrial", :pro-trial "ProTrial"} input), :shape "License"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]} (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license (input :license-type)) #:http.request.field{:name "LicenseType", :shape "License"}))))

(clojure.core/defn- req-get-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :user-email) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :user-email)) #:http.request.field{:name "UserEmail", :shape "EmailAddress", :location "querystring", :location-name "user-email"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-service-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ProfileServiceMaxResults", :location "querystring", :location-name "max-results"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "next-token"}))))

(clojure.core/defn- req-list-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :user-email) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-email-address (input :user-email)) #:http.request.field{:name "UserEmail", :shape "EmailAddress", :location "querystring", :location-name "user-email"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String", :location "querystring", :location-name "next-token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-service-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ProfileServiceMaxResults", :location "querystring", :location-name "max-results"}))))

(clojure.core/defn- req-update-account-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-account-settings (input :account-settings)) #:http.request.field{:name "AccountSettings", :shape "AccountSettings"})]}))

(clojure.core/defn- req-logout-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-update-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName"}))))

(clojure.core/defn- req-batch-unsuspend-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-id-list (input :user-id-list)) #:http.request.field{:name "UserIdList", :shape "UserIdList"})]}))

(clojure.core/defn- req-delete-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-batch-suspend-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-id-list (input :user-id-list)) #:http.request.field{:name "UserIdList", :shape "UserIdList"})]}))

(clojure.core/defn- req-get-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-reset-personal-pin-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"}) (clojure.core/into (ser-non-empty-string (input :user-id)) #:http.request.field{:name "UserId", :shape "NonEmptyString", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-invite-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-user-email-list (input :user-email-list)) #:http.request.field{:name "UserEmailList", :shape "UserEmailList"})]}))

(clojure.core/defn- req-get-account-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})]}))

(clojure.core/defn- req-create-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-name (input :name)) #:http.request.field{:name "Name", :shape "AccountName"})]}))

(clojure.core/defn- req-batch-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-non-empty-string (input :account-id)) #:http.request.field{:name "AccountId", :shape "NonEmptyString", :location "uri", :location-name "accountId"})], :body [(clojure.core/into (ser-update-user-request-item-list (input :update-user-request-items)) #:http.request.field{:name "UpdateUserRequestItems", :shape "UpdateUserRequestItemList"})]}))

(clojure.core/declare deser-user-error-list)

(clojure.core/declare deser-license-list)

(clojure.core/declare deser-user-list)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-registration-status)

(clojure.core/declare deser-account-settings)

(clojure.core/declare deser-user-error)

(clojure.core/declare deser-user)

(clojure.core/declare deser-account-type)

(clojure.core/declare deser-sensitive-string)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-email-status)

(clojure.core/declare deser-account)

(clojure.core/declare deser-string)

(clojure.core/declare deser-invite-status)

(clojure.core/declare deser-iso-8601-timestamp)

(clojure.core/declare deser-account-list)

(clojure.core/declare deser-license)

(clojure.core/declare deser-invite)

(clojure.core/declare deser-invite-list)

(clojure.core/declare deser-email-address)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-user-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-error coll))) input))

(clojure.core/defn- deser-license-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-license coll))) input))

(clojure.core/defn- deser-user-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-registration-status [input] (clojure.core/get {"Unregistered" :unregistered, "Registered" :registered, "Suspended" :suspended} input))

(clojure.core/defn- deser-account-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "DisableRemoteControl") (clojure.core/assoc :disable-remote-control (deser-boolean (input "DisableRemoteControl"))) (clojure.core/contains? input "EnableDialOut") (clojure.core/assoc :enable-dial-out (deser-boolean (input "EnableDialOut")))))

(clojure.core/defn- deser-user-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "UserId") (clojure.core/assoc :user-id (deser-non-empty-string (input "UserId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-string (input "ErrorMessage")))))

(clojure.core/defn- deser-user [input] (clojure.core/cond-> {:user-id (deser-string (input "UserId"))} (clojure.core/contains? input "RegisteredOn") (clojure.core/assoc :registered-on (deser-iso-8601-timestamp (input "RegisteredOn"))) (clojure.core/contains? input "InvitedOn") (clojure.core/assoc :invited-on (deser-iso-8601-timestamp (input "InvitedOn"))) (clojure.core/contains? input "DisplayName") (clojure.core/assoc :display-name (deser-sensitive-string (input "DisplayName"))) (clojure.core/contains? input "UserInvitationStatus") (clojure.core/assoc :user-invitation-status (deser-invite-status (input "UserInvitationStatus"))) (clojure.core/contains? input "PrimaryEmail") (clojure.core/assoc :primary-email (deser-email-address (input "PrimaryEmail"))) (clojure.core/contains? input "AccountId") (clojure.core/assoc :account-id (deser-string (input "AccountId"))) (clojure.core/contains? input "PersonalPIN") (clojure.core/assoc :personal-pin (deser-string (input "PersonalPIN"))) (clojure.core/contains? input "LicenseType") (clojure.core/assoc :license-type (deser-license (input "LicenseType"))) (clojure.core/contains? input "UserRegistrationStatus") (clojure.core/assoc :user-registration-status (deser-registration-status (input "UserRegistrationStatus")))))

(clojure.core/defn- deser-account-type [input] (clojure.core/get {"Team" :team, "EnterpriseDirectory" :enterprise-directory, "EnterpriseLWA" :enterprise-lwa, "EnterpriseOIDC" :enterprise-oidc} input))

(clojure.core/defn- deser-sensitive-string [input] input)

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"Unprocessable" :unprocessable, "NotFound" :not-found, "BadRequest" :bad-request, "Throttled" :throttled, "Conflict" :conflict, "ServiceUnavailable" :service-unavailable, "ServiceFailure" :service-failure, "Unauthorized" :unauthorized, "PreconditionFailed" :precondition-failed, "Forbidden" :forbidden} input))

(clojure.core/defn- deser-email-status [input] (clojure.core/get {"NotSent" :not-sent, "Sent" :sent, "Failed" :failed} input))

(clojure.core/defn- deser-account [input] (clojure.core/cond-> {:aws-account-id (deser-string (input "AwsAccountId")), :account-id (deser-string (input "AccountId")), :name (deser-string (input "Name"))} (clojure.core/contains? input "AccountType") (clojure.core/assoc :account-type (deser-account-type (input "AccountType"))) (clojure.core/contains? input "CreatedTimestamp") (clojure.core/assoc :created-timestamp (deser-iso-8601-timestamp (input "CreatedTimestamp"))) (clojure.core/contains? input "DefaultLicense") (clojure.core/assoc :default-license (deser-license (input "DefaultLicense"))) (clojure.core/contains? input "SupportedLicenses") (clojure.core/assoc :supported-licenses (deser-license-list (input "SupportedLicenses")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-invite-status [input] (clojure.core/get {"Pending" :pending, "Accepted" :accepted, "Failed" :failed} input))

(clojure.core/defn- deser-iso-8601-timestamp [input] input)

(clojure.core/defn- deser-account-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-account coll))) input))

(clojure.core/defn- deser-license [input] (clojure.core/get {"Basic" :basic, "Plus" :plus, "Pro" :pro, "ProTrial" :pro-trial} input))

(clojure.core/defn- deser-invite [input] (clojure.core/cond-> {} (clojure.core/contains? input "InviteId") (clojure.core/assoc :invite-id (deser-string (input "InviteId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-invite-status (input "Status"))) (clojure.core/contains? input "EmailAddress") (clojure.core/assoc :email-address (deser-email-address (input "EmailAddress"))) (clojure.core/contains? input "EmailStatus") (clojure.core/assoc :email-status (deser-email-status (input "EmailStatus")))))

(clojure.core/defn- deser-invite-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invite coll))) input))

(clojure.core/defn- deser-email-address [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-logout-user-response ([input] (response-logout-user-response nil input)) ([resultWrapper1073215 input] (clojure.core/let [rawinput1073214 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073216 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1073218 input] (clojure.core/let [rawinput1073217 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073219 {"Code" (rawinput1073217 "Code"), "Message" (rawinput1073217 "Message")}] (clojure.core/cond-> {} (letvar1073219 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073219 ["Code"]))) (letvar1073219 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073219 ["Message"])))))))

(clojure.core/defn- response-delete-account-response ([input] (response-delete-account-response nil input)) ([resultWrapper1073221 input] (clojure.core/let [rawinput1073220 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073222 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-account-settings-response ([input] (response-update-account-settings-response nil input)) ([resultWrapper1073224 input] (clojure.core/let [rawinput1073223 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073225 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1073227 input] (clojure.core/let [rawinput1073226 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073228 {"Code" (rawinput1073226 "Code"), "Message" (rawinput1073226 "Message")}] (clojure.core/cond-> {} (letvar1073228 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073228 ["Code"]))) (letvar1073228 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073228 ["Message"])))))))

(clojure.core/defn- response-update-account-response ([input] (response-update-account-response nil input)) ([resultWrapper1073230 input] (clojure.core/let [rawinput1073229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073231 {"Account" (rawinput1073229 "Account")}] (clojure.core/cond-> {} (letvar1073231 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar1073231 ["Account"])))))))

(clojure.core/defn- response-unprocessable-entity-exception ([input] (response-unprocessable-entity-exception nil input)) ([resultWrapper1073233 input] (clojure.core/let [rawinput1073232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073234 {"Code" (rawinput1073232 "Code"), "Message" (rawinput1073232 "Message")}] (clojure.core/cond-> {} (letvar1073234 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073234 ["Code"]))) (letvar1073234 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073234 ["Message"])))))))

(clojure.core/defn- response-get-account-response ([input] (response-get-account-response nil input)) ([resultWrapper1073236 input] (clojure.core/let [rawinput1073235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073237 {"Account" (rawinput1073235 "Account")}] (clojure.core/cond-> {} (letvar1073237 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar1073237 ["Account"])))))))

(clojure.core/defn- response-service-failure-exception ([input] (response-service-failure-exception nil input)) ([resultWrapper1073239 input] (clojure.core/let [rawinput1073238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073240 {"Code" (rawinput1073238 "Code"), "Message" (rawinput1073238 "Message")}] (clojure.core/cond-> {} (letvar1073240 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073240 ["Code"]))) (letvar1073240 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073240 ["Message"])))))))

(clojure.core/defn- response-list-accounts-response ([input] (response-list-accounts-response nil input)) ([resultWrapper1073242 input] (clojure.core/let [rawinput1073241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073243 {"Accounts" (rawinput1073241 "Accounts"), "NextToken" (rawinput1073241 "NextToken")}] (clojure.core/cond-> {} (letvar1073243 "Accounts") (clojure.core/assoc :accounts (deser-account-list (clojure.core/get-in letvar1073243 ["Accounts"]))) (letvar1073243 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1073243 ["NextToken"])))))))

(clojure.core/defn- response-batch-unsuspend-user-response ([input] (response-batch-unsuspend-user-response nil input)) ([resultWrapper1073245 input] (clojure.core/let [rawinput1073244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073246 {"UserErrors" (rawinput1073244 "UserErrors")}] (clojure.core/cond-> {} (letvar1073246 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar1073246 ["UserErrors"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1073248 input] (clojure.core/let [rawinput1073247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073249 {"Code" (rawinput1073247 "Code"), "Message" (rawinput1073247 "Message")}] (clojure.core/cond-> {} (letvar1073249 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073249 ["Code"]))) (letvar1073249 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073249 ["Message"])))))))

(clojure.core/defn- response-update-user-response ([input] (response-update-user-response nil input)) ([resultWrapper1073251 input] (clojure.core/let [rawinput1073250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073252 {"User" (rawinput1073250 "User")}] (clojure.core/cond-> {} (letvar1073252 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1073252 ["User"])))))))

(clojure.core/defn- response-get-account-settings-response ([input] (response-get-account-settings-response nil input)) ([resultWrapper1073254 input] (clojure.core/let [rawinput1073253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073255 {"AccountSettings" (rawinput1073253 "AccountSettings")}] (clojure.core/cond-> {} (letvar1073255 "AccountSettings") (clojure.core/assoc :account-settings (deser-account-settings (clojure.core/get-in letvar1073255 ["AccountSettings"])))))))

(clojure.core/defn- response-create-account-response ([input] (response-create-account-response nil input)) ([resultWrapper1073257 input] (clojure.core/let [rawinput1073256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073258 {"Account" (rawinput1073256 "Account")}] (clojure.core/cond-> {} (letvar1073258 "Account") (clojure.core/assoc :account (deser-account (clojure.core/get-in letvar1073258 ["Account"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1073260 input] (clojure.core/let [rawinput1073259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073261 {"Code" (rawinput1073259 "Code"), "Message" (rawinput1073259 "Message")}] (clojure.core/cond-> {} (letvar1073261 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073261 ["Code"]))) (letvar1073261 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073261 ["Message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1073263 input] (clojure.core/let [rawinput1073262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073264 {"Code" (rawinput1073262 "Code"), "Message" (rawinput1073262 "Message")}] (clojure.core/cond-> {} (letvar1073264 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073264 ["Code"]))) (letvar1073264 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073264 ["Message"])))))))

(clojure.core/defn- response-unauthorized-client-exception ([input] (response-unauthorized-client-exception nil input)) ([resultWrapper1073266 input] (clojure.core/let [rawinput1073265 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073267 {"Code" (rawinput1073265 "Code"), "Message" (rawinput1073265 "Message")}] (clojure.core/cond-> {} (letvar1073267 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073267 ["Code"]))) (letvar1073267 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073267 ["Message"])))))))

(clojure.core/defn- response-batch-suspend-user-response ([input] (response-batch-suspend-user-response nil input)) ([resultWrapper1073269 input] (clojure.core/let [rawinput1073268 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073270 {"UserErrors" (rawinput1073268 "UserErrors")}] (clojure.core/cond-> {} (letvar1073270 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar1073270 ["UserErrors"])))))))

(clojure.core/defn- response-invite-users-response ([input] (response-invite-users-response nil input)) ([resultWrapper1073272 input] (clojure.core/let [rawinput1073271 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073273 {"Invites" (rawinput1073271 "Invites")}] (clojure.core/cond-> {} (letvar1073273 "Invites") (clojure.core/assoc :invites (deser-invite-list (clojure.core/get-in letvar1073273 ["Invites"])))))))

(clojure.core/defn- response-reset-personal-pin-response ([input] (response-reset-personal-pin-response nil input)) ([resultWrapper1073275 input] (clojure.core/let [rawinput1073274 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073276 {"User" (rawinput1073274 "User")}] (clojure.core/cond-> {} (letvar1073276 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1073276 ["User"])))))))

(clojure.core/defn- response-throttled-client-exception ([input] (response-throttled-client-exception nil input)) ([resultWrapper1073278 input] (clojure.core/let [rawinput1073277 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073279 {"Code" (rawinput1073277 "Code"), "Message" (rawinput1073277 "Message")}] (clojure.core/cond-> {} (letvar1073279 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar1073279 ["Code"]))) (letvar1073279 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1073279 ["Message"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper1073281 input] (clojure.core/let [rawinput1073280 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073282 {"Users" (rawinput1073280 "Users"), "NextToken" (rawinput1073280 "NextToken")}] (clojure.core/cond-> {} (letvar1073282 "Users") (clojure.core/assoc :users (deser-user-list (clojure.core/get-in letvar1073282 ["Users"]))) (letvar1073282 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1073282 ["NextToken"])))))))

(clojure.core/defn- response-batch-update-user-response ([input] (response-batch-update-user-response nil input)) ([resultWrapper1073284 input] (clojure.core/let [rawinput1073283 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073285 {"UserErrors" (rawinput1073283 "UserErrors")}] (clojure.core/cond-> {} (letvar1073285 "UserErrors") (clojure.core/assoc :user-errors (deser-user-error-list (clojure.core/get-in letvar1073285 ["UserErrors"])))))))

(clojure.core/defn- response-get-user-response ([input] (response-get-user-response nil input)) ([resultWrapper1073287 input] (clojure.core/let [rawinput1073286 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1073288 {"User" (rawinput1073286 "User")}] (clojure.core/cond-> {} (letvar1073288 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar1073288 ["User"])))))))

(clojure.spec.alpha/def :portkey.aws.chime/user-error-list (clojure.spec.alpha/coll-of :portkey.aws.chime/user-error))

(clojure.spec.alpha/def :portkey.aws.chime/license-list (clojure.spec.alpha/coll-of :portkey.aws.chime/license))

(clojure.spec.alpha/def :portkey.aws.chime/logout-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.update-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.update-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.update-user-request/license-type (clojure.spec.alpha/and :portkey.aws.chime/license))
(clojure.spec.alpha/def :portkey.aws.chime/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.update-user-request/account-id :portkey.aws.chime.update-user-request/user-id] :opt-un [:portkey.aws.chime.update-user-request/license-type]))

(clojure.spec.alpha/def :portkey.aws.chime.get-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.get-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/get-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.get-user-request/account-id :portkey.aws.chime.get-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/user-list (clojure.spec.alpha/coll-of :portkey.aws.chime/user))

(clojure.spec.alpha/def :portkey.aws.chime/profile-service-max-results (clojure.spec.alpha/int-in 1 200))

(clojure.spec.alpha/def :portkey.aws.chime/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #".*\S.*" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime.list-users-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.list-users-request/user-email (clojure.spec.alpha/and :portkey.aws.chime/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.list-users-request/max-results (clojure.spec.alpha/and :portkey.aws.chime/profile-service-max-results))
(clojure.spec.alpha/def :portkey.aws.chime.list-users-request/next-token (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.list-users-request/account-id] :opt-un [:portkey.aws.chime.list-users-request/user-email :portkey.aws.chime.list-users-request/max-results :portkey.aws.chime.list-users-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.bad-request-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.bad-request-exception/code :portkey.aws.chime.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime/delete-account-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/update-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/user-id-list (clojure.spec.alpha/coll-of :portkey.aws.chime/non-empty-string :max-count 50))

(clojure.spec.alpha/def :portkey.aws.chime/registration-status #{"Unregistered" "Suspended" :unregistered "Registered" :suspended :registered})

(clojure.spec.alpha/def :portkey.aws.chime.forbidden-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.forbidden-exception/code :portkey.aws.chime.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.account-settings/disable-remote-control (clojure.spec.alpha/and :portkey.aws.chime/boolean))
(clojure.spec.alpha/def :portkey.aws.chime.account-settings/enable-dial-out (clojure.spec.alpha/and :portkey.aws.chime/boolean))
(clojure.spec.alpha/def :portkey.aws.chime/account-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.account-settings/disable-remote-control :portkey.aws.chime.account-settings/enable-dial-out]))

(clojure.spec.alpha/def :portkey.aws.chime/update-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/account]))

(clojure.spec.alpha/def :portkey.aws.chime.unprocessable-entity-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.unprocessable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/unprocessable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.unprocessable-entity-exception/code :portkey.aws.chime.unprocessable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime/get-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/account]))

(clojure.spec.alpha/def :portkey.aws.chime.service-failure-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.service-failure-exception/code :portkey.aws.chime.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-request/name (clojure.spec.alpha/and :portkey.aws.chime/account-name))
(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-request/user-email (clojure.spec.alpha/and :portkey.aws.chime/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.chime/profile-service-max-results))
(clojure.spec.alpha/def :portkey.aws.chime/list-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.list-accounts-request/name :portkey.aws.chime.list-accounts-request/user-email :portkey.aws.chime.list-accounts-request/next-token :portkey.aws.chime.list-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.chime.user-error/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.user-error/error-message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/user-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.user-error/user-id :portkey.aws.chime/error-code :portkey.aws.chime.user-error/error-message]))

(clojure.spec.alpha/def :portkey.aws.chime.user/registered-on (clojure.spec.alpha/and :portkey.aws.chime/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.user/invited-on (clojure.spec.alpha/and :portkey.aws.chime/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.user/user-id (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.user/display-name (clojure.spec.alpha/and :portkey.aws.chime/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.chime.user/user-invitation-status (clojure.spec.alpha/and :portkey.aws.chime/invite-status))
(clojure.spec.alpha/def :portkey.aws.chime.user/primary-email (clojure.spec.alpha/and :portkey.aws.chime/email-address))
(clojure.spec.alpha/def :portkey.aws.chime.user/account-id (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.user/personal-pin (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.user/license-type (clojure.spec.alpha/and :portkey.aws.chime/license))
(clojure.spec.alpha/def :portkey.aws.chime.user/user-registration-status (clojure.spec.alpha/and :portkey.aws.chime/registration-status))
(clojure.spec.alpha/def :portkey.aws.chime/user (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.user/user-id] :opt-un [:portkey.aws.chime.user/registered-on :portkey.aws.chime.user/invited-on :portkey.aws.chime.user/display-name :portkey.aws.chime.user/user-invitation-status :portkey.aws.chime.user/primary-email :portkey.aws.chime.user/account-id :portkey.aws.chime.user/personal-pin :portkey.aws.chime.user/license-type :portkey.aws.chime.user/user-registration-status]))

(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-response/accounts (clojure.spec.alpha/and :portkey.aws.chime/account-list))
(clojure.spec.alpha/def :portkey.aws.chime.list-accounts-response/next-token (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/list-accounts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.list-accounts-response/accounts :portkey.aws.chime.list-accounts-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.batch-unsuspend-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime/batch-unsuspend-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.batch-unsuspend-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.service-unavailable-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.service-unavailable-exception/code :portkey.aws.chime.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime/account-type #{"EnterpriseLWA" "EnterpriseDirectory" "EnterpriseOIDC" :team "Team" :enterprise-oidc :enterprise-directory :enterprise-lwa})

(clojure.spec.alpha/def :portkey.aws.chime.update-account-settings-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/update-account-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.update-account-settings-request/account-id :portkey.aws.chime/account-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.logout-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.logout-user-request/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/logout-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.logout-user-request/account-id :portkey.aws.chime.logout-user-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/update-user-request-item-list (clojure.spec.alpha/coll-of :portkey.aws.chime/update-user-request-item :max-count 20))

(clojure.spec.alpha/def :portkey.aws.chime/update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/user]))

(clojure.spec.alpha/def :portkey.aws.chime/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.chime.update-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.update-account-request/name (clojure.spec.alpha/and :portkey.aws.chime/account-name))
(clojure.spec.alpha/def :portkey.aws.chime/update-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.update-account-request/account-id] :opt-un [:portkey.aws.chime.update-account-request/name]))

(clojure.spec.alpha/def :portkey.aws.chime/get-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/account-settings]))

(clojure.spec.alpha/def :portkey.aws.chime/create-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/account]))

(clojure.spec.alpha/def :portkey.aws.chime.update-user-request-item/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.update-user-request-item/license-type (clojure.spec.alpha/and :portkey.aws.chime/license))
(clojure.spec.alpha/def :portkey.aws.chime/update-user-request-item (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.update-user-request-item/user-id] :opt-un [:portkey.aws.chime.update-user-request-item/license-type]))

(clojure.spec.alpha/def :portkey.aws.chime/error-code #{"Unprocessable" "NotFound" :unauthorized "BadRequest" :precondition-failed "Throttled" "Conflict" "ServiceUnavailable" :forbidden "ServiceFailure" :service-unavailable :not-found :unprocessable "Unauthorized" "PreconditionFailed" :bad-request :throttled "Forbidden" :conflict :service-failure})

(clojure.spec.alpha/def :portkey.aws.chime/email-status #{:not-sent "Failed" "Sent" :sent "NotSent" :failed})

(clojure.spec.alpha/def :portkey.aws.chime.conflict-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.conflict-exception/code :portkey.aws.chime.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.account/aws-account-id (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.account/account-id (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.account/name (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.account/created-timestamp (clojure.spec.alpha/and :portkey.aws.chime/iso-8601-timestamp))
(clojure.spec.alpha/def :portkey.aws.chime.account/default-license (clojure.spec.alpha/and :portkey.aws.chime/license))
(clojure.spec.alpha/def :portkey.aws.chime.account/supported-licenses (clojure.spec.alpha/and :portkey.aws.chime/license-list))
(clojure.spec.alpha/def :portkey.aws.chime/account (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.account/aws-account-id :portkey.aws.chime.account/account-id :portkey.aws.chime.account/name] :opt-un [:portkey.aws.chime/account-type :portkey.aws.chime.account/created-timestamp :portkey.aws.chime.account/default-license :portkey.aws.chime.account/supported-licenses]))

(clojure.spec.alpha/def :portkey.aws.chime.batch-unsuspend-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/batch-unsuspend-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.batch-unsuspend-user-request/account-id :portkey.aws.chime/user-id-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.not-found-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.not-found-exception/code :portkey.aws.chime.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.chime.delete-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/delete-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.delete-account-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/invite-status #{"Failed" :pending :accepted "Pending" "Accepted" :failed})

(clojure.spec.alpha/def :portkey.aws.chime.unauthorized-client-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.unauthorized-client-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/unauthorized-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.unauthorized-client-exception/code :portkey.aws.chime.unauthorized-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime.batch-suspend-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime/batch-suspend-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.batch-suspend-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.invite-users-response/invites (clojure.spec.alpha/and :portkey.aws.chime/invite-list))
(clojure.spec.alpha/def :portkey.aws.chime/invite-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.invite-users-response/invites]))

(clojure.spec.alpha/def :portkey.aws.chime/iso-8601-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.chime/user-email-list (clojure.spec.alpha/coll-of :portkey.aws.chime/email-address :max-count 50))

(clojure.spec.alpha/def :portkey.aws.chime/account-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #".*\S.*" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime/reset-personal-pin-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/user]))

(clojure.spec.alpha/def :portkey.aws.chime.batch-suspend-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/batch-suspend-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.batch-suspend-user-request/account-id :portkey.aws.chime/user-id-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.get-account-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/get-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.get-account-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.reset-personal-pin-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.reset-personal-pin-request/user-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/reset-personal-pin-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.reset-personal-pin-request/account-id :portkey.aws.chime.reset-personal-pin-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/account-list (clojure.spec.alpha/coll-of :portkey.aws.chime/account))

(clojure.spec.alpha/def :portkey.aws.chime.invite-users-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/invite-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.invite-users-request/account-id :portkey.aws.chime/user-email-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/license #{:pro-trial "ProTrial" :pro "Plus" :plus "Basic" :basic "Pro"})

(clojure.spec.alpha/def :portkey.aws.chime.invite/invite-id (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime.invite/status (clojure.spec.alpha/and :portkey.aws.chime/invite-status))
(clojure.spec.alpha/def :portkey.aws.chime/invite (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.invite/invite-id :portkey.aws.chime.invite/status :portkey.aws.chime/email-address :portkey.aws.chime/email-status]))

(clojure.spec.alpha/def :portkey.aws.chime/invite-list (clojure.spec.alpha/coll-of :portkey.aws.chime/invite))

(clojure.spec.alpha/def :portkey.aws.chime.throttled-client-exception/code (clojure.spec.alpha/and :portkey.aws.chime/error-code))
(clojure.spec.alpha/def :portkey.aws.chime.throttled-client-exception/message (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/throttled-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.throttled-client-exception/code :portkey.aws.chime.throttled-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.chime/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #".+@.+\..+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.chime.list-users-response/users (clojure.spec.alpha/and :portkey.aws.chime/user-list))
(clojure.spec.alpha/def :portkey.aws.chime.list-users-response/next-token (clojure.spec.alpha/and :portkey.aws.chime/string))
(clojure.spec.alpha/def :portkey.aws.chime/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.list-users-response/users :portkey.aws.chime.list-users-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.chime.get-account-settings-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime/get-account-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.get-account-settings-request/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.batch-update-user-response/user-errors (clojure.spec.alpha/and :portkey.aws.chime/user-error-list))
(clojure.spec.alpha/def :portkey.aws.chime/batch-update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime.batch-update-user-response/user-errors]))

(clojure.spec.alpha/def :portkey.aws.chime.create-account-request/name (clojure.spec.alpha/and :portkey.aws.chime/account-name))
(clojure.spec.alpha/def :portkey.aws.chime/create-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.create-account-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime.batch-update-user-request/account-id (clojure.spec.alpha/and :portkey.aws.chime/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.chime.batch-update-user-request/update-user-request-items (clojure.spec.alpha/and :portkey.aws.chime/update-user-request-item-list))
(clojure.spec.alpha/def :portkey.aws.chime/batch-update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.chime.batch-update-user-request/account-id :portkey.aws.chime.batch-update-user-request/update-user-request-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.chime/get-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.chime/user]))

(clojure.spec.alpha/def :portkey.aws.chime/boolean clojure.core/boolean?)

(clojure.core/defn update-account ([update-account-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-account-request update-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/update-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/update-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccount", :http.request.configuration/output-deser-fn response-update-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account :args (clojure.spec.alpha/tuple :portkey.aws.chime/update-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/update-account-response))

(clojure.core/defn update-account-settings ([update-account-settings-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-account-settings-request update-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/update-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/settings", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/update-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccountSettings", :http.request.configuration/output-deser-fn response-update-account-settings-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "ConflictException" :portkey.aws.chime/conflict-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account-settings :args (clojure.spec.alpha/tuple :portkey.aws.chime/update-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/update-account-settings-response))

(clojure.core/defn invite-users ([invite-users-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invite-users-request invite-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/invite-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=add", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/invite-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteUsers", :http.request.configuration/output-deser-fn response-invite-users-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef invite-users :args (clojure.spec.alpha/tuple :portkey.aws.chime/invite-users-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/invite-users-response))

(clojure.core/defn get-account-settings ([get-account-settings-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/get-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/settings", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/get-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccountSettings", :http.request.configuration/output-deser-fn response-get-account-settings-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/tuple :portkey.aws.chime/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/get-account-settings-response))

(clojure.core/defn create-account ([create-account-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-account-request create-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/create-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/create-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccount", :http.request.configuration/output-deser-fn response-create-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-account :args (clojure.spec.alpha/tuple :portkey.aws.chime/create-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/create-account-response))

(clojure.core/defn delete-account ([delete-account-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-account-request delete-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/delete-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/delete-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccount", :http.request.configuration/output-deser-fn response-delete-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "UnprocessableEntityException" :portkey.aws.chime/unprocessable-entity-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account :args (clojure.spec.alpha/tuple :portkey.aws.chime/delete-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/delete-account-response))

(clojure.core/defn list-accounts ([] (list-accounts {})) ([list-accounts-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-accounts-request list-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/list-accounts-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/list-accounts-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccounts", :http.request.configuration/output-deser-fn response-list-accounts-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-accounts :args (clojure.spec.alpha/? :portkey.aws.chime/list-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/list-accounts-response))

(clojure.core/defn logout-user ([logout-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-logout-user-request logout-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/logout-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}?operation=logout", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/logout-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LogoutUser", :http.request.configuration/output-deser-fn response-logout-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef logout-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/logout-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/logout-user-response))

(clojure.core/defn reset-personal-pin ([reset-personal-pin-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-reset-personal-pin-request reset-personal-pin-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/reset-personal-pin-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}?operation=reset-personal-pin", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/reset-personal-pin-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetPersonalPIN", :http.request.configuration/output-deser-fn response-reset-personal-pin-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef reset-personal-pin :args (clojure.spec.alpha/tuple :portkey.aws.chime/reset-personal-pin-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/reset-personal-pin-response))

(clojure.core/defn get-account ([get-account-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-account-request get-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/get-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/get-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccount", :http.request.configuration/output-deser-fn response-get-account-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account :args (clojure.spec.alpha/tuple :portkey.aws.chime/get-account-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/get-account-response))

(clojure.core/defn list-users ([list-users-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.chime/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/list-users-response))

(clojure.core/defn batch-update-user ([batch-update-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-batch-update-user-request batch-update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/batch-update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/batch-update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchUpdateUser", :http.request.configuration/output-deser-fn response-batch-update-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-update-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/batch-update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/batch-update-user-response))

(clojure.core/defn batch-unsuspend-user ([batch-unsuspend-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-batch-unsuspend-user-request batch-unsuspend-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/batch-unsuspend-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=unsuspend", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/batch-unsuspend-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchUnsuspendUser", :http.request.configuration/output-deser-fn response-batch-unsuspend-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-unsuspend-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/batch-unsuspend-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/batch-unsuspend-user-response))

(clojure.core/defn batch-suspend-user ([batch-suspend-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-batch-suspend-user-request batch-suspend-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/batch-suspend-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users?operation=suspend", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/batch-suspend-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchSuspendUser", :http.request.configuration/output-deser-fn response-batch-suspend-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef batch-suspend-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/batch-suspend-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/batch-suspend-user-response))

(clojure.core/defn update-user ([update-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn response-update-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/update-user-response))

(clojure.core/defn get-user ([get-user-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-user-request get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.chime/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.chime/get-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/console/accounts/{accountId}/users/{userId}", :http.request.configuration/version "2018-05-01", :http.request.configuration/service-id "Chime", :http.request.spec/input-spec :portkey.aws.chime/get-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUser", :http.request.configuration/output-deser-fn response-get-user-response, :http.request.spec/error-spec {"UnauthorizedClientException" :portkey.aws.chime/unauthorized-client-exception, "NotFoundException" :portkey.aws.chime/not-found-exception, "ForbiddenException" :portkey.aws.chime/forbidden-exception, "BadRequestException" :portkey.aws.chime/bad-request-exception, "ThrottledClientException" :portkey.aws.chime/throttled-client-exception, "ServiceUnavailableException" :portkey.aws.chime/service-unavailable-exception, "ServiceFailureException" :portkey.aws.chime/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/tuple :portkey.aws.chime/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.chime/get-user-response))
