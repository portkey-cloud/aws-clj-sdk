(ns portkey.aws.cloud9 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "cloud9", :region "eu-west-1"},
    :ssl-common-name "cloud9.eu-west-1.amazonaws.com",
    :endpoint "https://cloud9.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloud9", :region "us-east-2"},
    :ssl-common-name "cloud9.us-east-2.amazonaws.com",
    :endpoint "https://cloud9.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloud9", :region "ap-southeast-1"},
    :ssl-common-name "cloud9.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloud9.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloud9", :region "us-west-2"},
    :ssl-common-name "cloud9.us-west-2.amazonaws.com",
    :endpoint "https://cloud9.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloud9", :region "us-east-1"},
    :ssl-common-name "cloud9.us-east-1.amazonaws.com",
    :endpoint "https://cloud9.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-bounded-environment-id-list)

(clojure.core/declare ser-permissions)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-permissions-list)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-environment-name)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-member-permissions)

(clojure.core/declare ser-automatic-stop-time-minutes)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-environment-id)

(clojure.core/declare ser-environment-description)

(clojure.core/declare ser-user-arn)

(clojure.core/defn- ser-bounded-environment-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-environment-id coll) #:http.request.field{:shape "EnvironmentId"}))) input), :shape "BoundedEnvironmentIdList", :type "list", :max 25, :min 1})

(clojure.core/defn- ser-permissions [input] #:http.request.field{:value (clojure.core/get {"owner" "owner", :owner "owner", "read-write" "read-write", :readwrite "read-write", "read-only" "read-only", :readonly "read-only"} input), :shape "Permissions"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-permissions-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-permissions coll) #:http.request.field{:shape "Permissions"}))) input), :shape "PermissionsList", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-environment-name [input] #:http.request.field{:value input, :shape "EnvironmentName"})

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value input, :shape "InstanceType"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-member-permissions [input] #:http.request.field{:value (clojure.core/get {"read-write" "read-write", :readwrite "read-write", "read-only" "read-only", :readonly "read-only"} input), :shape "MemberPermissions"})

(clojure.core/defn- ser-automatic-stop-time-minutes [input] #:http.request.field{:value input, :shape "AutomaticStopTimeMinutes"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-environment-id [input] #:http.request.field{:value input, :shape "EnvironmentId"})

(clojure.core/defn- ser-environment-description [input] #:http.request.field{:value input, :shape "EnvironmentDescription"})

(clojure.core/defn- ser-user-arn [input] #:http.request.field{:value input, :shape "UserArn"})

(clojure.core/defn- req-list-environments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-environments-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bounded-environment-id-list (input :environment-ids)) #:http.request.field{:name "environmentIds", :shape "BoundedEnvironmentIdList"})]}))

(clojure.core/defn- req-delete-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"})]}))

(clojure.core/defn- req-describe-environment-memberships-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})) (clojure.core/contains? input :environment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"})) (clojure.core/contains? input :permissions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permissions-list (input :permissions)) #:http.request.field{:name "permissions", :shape "PermissionsList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-environment-membership-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"})]}))

(clojure.core/defn- req-update-environment-membership-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-member-permissions (input :permissions)) #:http.request.field{:name "permissions", :shape "MemberPermissions"})]}))

(clojure.core/defn- req-create-environment-ec-2-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-name (input :name)) #:http.request.field{:name "name", :shape "EnvironmentName"}) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "instanceType", :shape "InstanceType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-description (input :description)) #:http.request.field{:name "description", :shape "EnvironmentDescription"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "subnetId", :shape "SubnetId"})) (clojure.core/contains? input :automatic-stop-time-minutes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automatic-stop-time-minutes (input :automatic-stop-time-minutes)) #:http.request.field{:name "automaticStopTimeMinutes", :shape "AutomaticStopTimeMinutes"})) (clojure.core/contains? input :owner-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-arn (input :owner-arn)) #:http.request.field{:name "ownerArn", :shape "UserArn"}))))

(clojure.core/defn- req-describe-environment-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"})]}))

(clojure.core/defn- req-create-environment-membership-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"}) (clojure.core/into (ser-user-arn (input :user-arn)) #:http.request.field{:name "userArn", :shape "UserArn"}) (clojure.core/into (ser-member-permissions (input :permissions)) #:http.request.field{:name "permissions", :shape "MemberPermissions"})]}))

(clojure.core/defn- req-update-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-environment-id (input :environment-id)) #:http.request.field{:name "environmentId", :shape "EnvironmentId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-name (input :name)) #:http.request.field{:name "name", :shape "EnvironmentName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-description (input :description)) #:http.request.field{:name "description", :shape "EnvironmentDescription"}))))

(clojure.spec.alpha/def :portkey.aws.cloud9/bounded-environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cloud9/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-result/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-result/environment-ids (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id-list))
(clojure.spec.alpha/def :portkey.aws.cloud9/list-environments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.list-environments-result/next-token :portkey.aws.cloud9.list-environments-result/environment-ids]))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-result/memberships (clojure.spec.alpha/and :portkey.aws.cloud9/environment-members-list))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-result/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environment-memberships-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environment-memberships-result/memberships :portkey.aws.cloud9.describe-environment-memberships-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloud9/permissions #{"owner" "read-only" :readonly "read-write" :readwrite :owner})

(clojure.spec.alpha/def :portkey.aws.cloud9/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\x20-\x7E]{10,128}" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.cloud9/max-results))
(clojure.spec.alpha/def :portkey.aws.cloud9/list-environments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.list-environments-request/next-token :portkey.aws.cloud9.list-environments-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloud9/permissions-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/permissions))

(clojure.spec.alpha/def :portkey.aws.cloud9/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-type #{"ec2" :ssh :ec-2 "ssh"})

(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-status #{"ready" "stopping" :ready :connecting "deleting" :creating "error" :deleting :stopping :stopped "stopped" "creating" :error "connecting"})

(clojure.spec.alpha/def :portkey.aws.cloud9/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 5 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-result/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-ec-2-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.create-environment-ec-2-result/environment-id]))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 60))))

(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment-id))

(clojure.spec.alpha/def :portkey.aws.cloud9/instance-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 5 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 20)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-z][1-9][.][a-z0-9]+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environments-request/environment-ids (clojure.spec.alpha/and :portkey.aws.cloud9/bounded-environment-id-list))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environments-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.describe-environments-request/environment-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.delete-environment-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.delete-environment-request/environment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-status-result/status (clojure.spec.alpha/and :portkey.aws.cloud9/environment-status))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-status-result/message (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environment-status-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environment-status-result/status :portkey.aws.cloud9.describe-environment-status-result/message]))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-request/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-request/permissions (clojure.spec.alpha/and :portkey.aws.cloud9/permissions-list))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-request/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-request/max-results (clojure.spec.alpha/and :portkey.aws.cloud9/max-results))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environment-memberships-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environment-memberships-request/user-arn :portkey.aws.cloud9.describe-environment-memberships-request/environment-id :portkey.aws.cloud9.describe-environment-memberships-request/permissions :portkey.aws.cloud9.describe-environment-memberships-request/next-token :portkey.aws.cloud9.describe-environment-memberships-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloud9/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.delete-environment-membership-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.delete-environment-membership-request/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-membership-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.delete-environment-membership-request/environment-id :portkey.aws.cloud9.delete-environment-membership-request/user-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-membership-result/membership (clojure.spec.alpha/and :portkey.aws.cloud9/environment-member))
(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-membership-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.update-environment-membership-result/membership]))

(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-membership-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-membership-request/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-membership-request/permissions (clojure.spec.alpha/and :portkey.aws.cloud9/member-permissions))
(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-membership-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.update-environment-membership-request/environment-id :portkey.aws.cloud9.update-environment-membership-request/user-arn :portkey.aws.cloud9.update-environment-membership-request/permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment))

(clojure.spec.alpha/def :portkey.aws.cloud9/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.environment-member/permissions (clojure.spec.alpha/and :portkey.aws.cloud9/permissions))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-member/user-id (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-member/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-member/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-member/last-access (clojure.spec.alpha/and :portkey.aws.cloud9/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloud9/environment-member (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.environment-member/permissions :portkey.aws.cloud9.environment-member/user-id :portkey.aws.cloud9.environment-member/user-arn :portkey.aws.cloud9.environment-member/environment-id :portkey.aws.cloud9.environment-member/last-access]))

(clojure.spec.alpha/def :portkey.aws.cloud9/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-members-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment-member))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/name (clojure.spec.alpha/and :portkey.aws.cloud9/environment-name))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/description (clojure.spec.alpha/and :portkey.aws.cloud9/environment-description))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/client-request-token (clojure.spec.alpha/and :portkey.aws.cloud9/client-request-token))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/instance-type (clojure.spec.alpha/and :portkey.aws.cloud9/instance-type))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/subnet-id (clojure.spec.alpha/and :portkey.aws.cloud9/subnet-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/automatic-stop-time-minutes (clojure.spec.alpha/and :portkey.aws.cloud9/automatic-stop-time-minutes))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-request/owner-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-ec-2-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.create-environment-ec-2-request/name :portkey.aws.cloud9.create-environment-ec-2-request/instance-type] :opt-un [:portkey.aws.cloud9.create-environment-ec-2-request/description :portkey.aws.cloud9.create-environment-ec-2-request/client-request-token :portkey.aws.cloud9.create-environment-ec-2-request/subnet-id :portkey.aws.cloud9.create-environment-ec-2-request/automatic-stop-time-minutes :portkey.aws.cloud9.create-environment-ec-2-request/owner-arn]))

(clojure.spec.alpha/def :portkey.aws.cloud9/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-status-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environment-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.describe-environment-status-request/environment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/member-permissions #{"read-only" :readonly "read-write" :readwrite})

(clojure.spec.alpha/def :portkey.aws.cloud9/automatic-stop-time-minutes (clojure.spec.alpha/int-in Long/MIN_VALUE 20160))

(clojure.spec.alpha/def :portkey.aws.cloud9.environment/id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/name (clojure.spec.alpha/and :portkey.aws.cloud9/environment-name))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/description (clojure.spec.alpha/and :portkey.aws.cloud9/environment-description))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/type (clojure.spec.alpha/and :portkey.aws.cloud9/environment-type))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/arn (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/owner-arn (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9/environment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.environment/id :portkey.aws.cloud9.environment/name :portkey.aws.cloud9.environment/description :portkey.aws.cloud9.environment/type :portkey.aws.cloud9.environment/arn :portkey.aws.cloud9.environment/owner-arn]))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-result/membership (clojure.spec.alpha/and :portkey.aws.cloud9/environment-member))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-membership-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.create-environment-membership-result/membership]))

(clojure.spec.alpha/def :portkey.aws.cloud9/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-membership-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/permissions (clojure.spec.alpha/and :portkey.aws.cloud9/member-permissions))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-membership-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.create-environment-membership-request/environment-id :portkey.aws.cloud9.create-environment-membership-request/user-arn :portkey.aws.cloud9.create-environment-membership-request/permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9]{8,32}$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environments-result/environments (clojure.spec.alpha/and :portkey.aws.cloud9/environment-list))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environments-result/environments]))

(clojure.spec.alpha/def :portkey.aws.cloud9/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws:(iam|sts)::\d+:\S+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/name (clojure.spec.alpha/and :portkey.aws.cloud9/environment-name))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/description (clojure.spec.alpha/and :portkey.aws.cloud9/environment-description))
(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.update-environment-request/environment-id] :opt-un [:portkey.aws.cloud9.update-environment-request/name :portkey.aws.cloud9.update-environment-request/description]))

(clojure.core/defn update-environment ([update-environment-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-environment-request update-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/update-environment-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/update-environment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEnvironment", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/update-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/update-environment-result))

(clojure.core/defn describe-environment-status ([describe-environment-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-environment-status-request describe-environment-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/describe-environment-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/describe-environment-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentStatus", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environment-status :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/describe-environment-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environment-status-result))

(clojure.core/defn create-environment-ec-2 ([create-environment-ec-2-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-environment-ec-2-request create-environment-ec-2-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/create-environment-ec-2-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/create-environment-ec-2-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEnvironmentEC2", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-environment-ec-2 :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/create-environment-ec-2-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/create-environment-ec-2-result))

(clojure.core/defn list-environments ([] (list-environments {})) ([list-environments-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-environments-request list-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/list-environments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/list-environments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEnvironments", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-environments :args (clojure.spec.alpha/? :portkey.aws.cloud9/list-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/list-environments-result))

(clojure.core/defn delete-environment ([delete-environment-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-environment-request delete-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/delete-environment-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/delete-environment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEnvironment", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-environment :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/delete-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/delete-environment-result))

(clojure.core/defn describe-environments ([describe-environments-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-environments-request describe-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/describe-environments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/describe-environments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironments", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/describe-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environments-result))

(clojure.core/defn describe-environment-memberships ([] (describe-environment-memberships {})) ([describe-environment-memberships-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-environment-memberships-request describe-environment-memberships-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/describe-environment-memberships-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/describe-environment-memberships-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEnvironmentMemberships", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environment-memberships :args (clojure.spec.alpha/? :portkey.aws.cloud9/describe-environment-memberships-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environment-memberships-result))

(clojure.core/defn update-environment-membership ([update-environment-membership-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-environment-membership-request update-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/update-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/update-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEnvironmentMembership", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/update-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/update-environment-membership-result))

(clojure.core/defn delete-environment-membership ([delete-environment-membership-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-environment-membership-request delete-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/delete-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/delete-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEnvironmentMembership", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/delete-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/delete-environment-membership-result))

(clojure.core/defn create-environment-membership ([create-environment-membership-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-environment-membership-request create-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.spec/output-spec :portkey.aws.cloud9/create-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloud9/create-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEnvironmentMembership", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/create-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/create-environment-membership-result))
