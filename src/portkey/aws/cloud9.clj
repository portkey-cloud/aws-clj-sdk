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

(clojure.core/declare deser-permissions)

(clojure.core/declare deser-environment-type)

(clojure.core/declare deser-environment-lifecycle)

(clojure.core/declare deser-environment-status)

(clojure.core/declare deser-environment-name)

(clojure.core/declare deser-environment-id-list)

(clojure.core/declare deser-environment-list)

(clojure.core/declare deser-environment-member)

(clojure.core/declare deser-environment-members-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-environment)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-environment-id)

(clojure.core/declare deser-environment-description)

(clojure.core/declare deser-environment-lifecycle-status)

(clojure.core/declare deser-user-arn)

(clojure.core/defn- deser-permissions [input] (clojure.core/get {"owner" :owner, "read-write" :readwrite, "read-only" :readonly} input))

(clojure.core/defn- deser-environment-type [input] (clojure.core/get {"ssh" :ssh, "ec2" :ec-2} input))

(clojure.core/defn- deser-environment-lifecycle [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-environment-lifecycle-status (input "status"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason"))) (clojure.core/contains? input "failureResource") (clojure.core/assoc :failure-resource (deser-string (input "failureResource")))))

(clojure.core/defn- deser-environment-status [input] (clojure.core/get {"error" :error, "creating" :creating, "connecting" :connecting, "ready" :ready, "stopping" :stopping, "stopped" :stopped, "deleting" :deleting} input))

(clojure.core/defn- deser-environment-name [input] input)

(clojure.core/defn- deser-environment-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-id coll))) input))

(clojure.core/defn- deser-environment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment coll))) input))

(clojure.core/defn- deser-environment-member [input] (clojure.core/cond-> {} (clojure.core/contains? input "permissions") (clojure.core/assoc :permissions (deser-permissions (input "permissions"))) (clojure.core/contains? input "userId") (clojure.core/assoc :user-id (deser-string (input "userId"))) (clojure.core/contains? input "userArn") (clojure.core/assoc :user-arn (deser-user-arn (input "userArn"))) (clojure.core/contains? input "environmentId") (clojure.core/assoc :environment-id (deser-environment-id (input "environmentId"))) (clojure.core/contains? input "lastAccess") (clojure.core/assoc :last-access (deser-timestamp (input "lastAccess")))))

(clojure.core/defn- deser-environment-members-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-environment-member coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-environment [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-environment-id (input "id"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-environment-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-environment-description (input "description"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-environment-type (input "type"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "ownerArn") (clojure.core/assoc :owner-arn (deser-string (input "ownerArn"))) (clojure.core/contains? input "lifecycle") (clojure.core/assoc :lifecycle (deser-environment-lifecycle (input "lifecycle")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-environment-id [input] input)

(clojure.core/defn- deser-environment-description [input] input)

(clojure.core/defn- deser-environment-lifecycle-status [input] (clojure.core/get {"CREATED" :created, "DELETING" :deleting, "DELETE_FAILED" :delete-failed} input))

(clojure.core/defn- deser-user-arn [input] input)

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper166582 input] (clojure.core/let [rawinput166581 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166583 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-environments-result ([input] (response-list-environments-result nil input)) ([resultWrapper166585 input] (clojure.core/let [rawinput166584 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166586 {"nextToken" (rawinput166584 "nextToken"), "environmentIds" (rawinput166584 "environmentIds")}] (clojure.core/cond-> {} (letvar166586 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar166586 ["nextToken"]))) (letvar166586 "environmentIds") (clojure.core/assoc :environment-ids (deser-environment-id-list (clojure.core/get-in letvar166586 ["environmentIds"])))))))

(clojure.core/defn- response-describe-environment-memberships-result ([input] (response-describe-environment-memberships-result nil input)) ([resultWrapper166588 input] (clojure.core/let [rawinput166587 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166589 {"memberships" (rawinput166587 "memberships"), "nextToken" (rawinput166587 "nextToken")}] (clojure.core/cond-> {} (letvar166589 "memberships") (clojure.core/assoc :memberships (deser-environment-members-list (clojure.core/get-in letvar166589 ["memberships"]))) (letvar166589 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar166589 ["nextToken"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper166591 input] (clojure.core/let [rawinput166590 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166592 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-environment-result ([input] (response-delete-environment-result nil input)) ([resultWrapper166594 input] (clojure.core/let [rawinput166593 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166595 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-environment-ec-2-result ([input] (response-create-environment-ec-2-result nil input)) ([resultWrapper166597 input] (clojure.core/let [rawinput166596 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166598 {"environmentId" (rawinput166596 "environmentId")}] (clojure.core/cond-> {} (letvar166598 "environmentId") (clojure.core/assoc :environment-id (deser-environment-id (clojure.core/get-in letvar166598 ["environmentId"])))))))

(clojure.core/defn- response-update-environment-result ([input] (response-update-environment-result nil input)) ([resultWrapper166600 input] (clojure.core/let [rawinput166599 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166601 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper166603 input] (clojure.core/let [rawinput166602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166604 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper166606 input] (clojure.core/let [rawinput166605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166607 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-environment-status-result ([input] (response-describe-environment-status-result nil input)) ([resultWrapper166609 input] (clojure.core/let [rawinput166608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166610 {"status" (rawinput166608 "status"), "message" (rawinput166608 "message")}] (clojure.core/cond-> {} (letvar166610 "status") (clojure.core/assoc :status (deser-environment-status (clojure.core/get-in letvar166610 ["status"]))) (letvar166610 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar166610 ["message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper166612 input] (clojure.core/let [rawinput166611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166613 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-environment-membership-result ([input] (response-update-environment-membership-result nil input)) ([resultWrapper166615 input] (clojure.core/let [rawinput166614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166616 {"membership" (rawinput166614 "membership")}] (clojure.core/cond-> {} (letvar166616 "membership") (clojure.core/assoc :membership (deser-environment-member (clojure.core/get-in letvar166616 ["membership"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper166618 input] (clojure.core/let [rawinput166617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166619 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper166621 input] (clojure.core/let [rawinput166620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166622 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-environment-membership-result ([input] (response-create-environment-membership-result nil input)) ([resultWrapper166624 input] (clojure.core/let [rawinput166623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166625 {"membership" (rawinput166623 "membership")}] (clojure.core/cond-> {} (letvar166625 "membership") (clojure.core/assoc :membership (deser-environment-member (clojure.core/get-in letvar166625 ["membership"])))))))

(clojure.core/defn- response-delete-environment-membership-result ([input] (response-delete-environment-membership-result nil input)) ([resultWrapper166627 input] (clojure.core/let [rawinput166626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166628 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-environments-result ([input] (response-describe-environments-result nil input)) ([resultWrapper166630 input] (clojure.core/let [rawinput166629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar166631 {"environments" (rawinput166629 "environments")}] (clojure.core/cond-> {} (letvar166631 "environments") (clojure.core/assoc :environments (deser-environment-list (clojure.core/get-in letvar166631 ["environments"])))))))

(clojure.spec.alpha/def :portkey.aws.cloud9/bounded-environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment-id :min-count 1 :max-count 25))

(clojure.spec.alpha/def :portkey.aws.cloud9/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-result/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-result/environment-ids (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id-list))
(clojure.spec.alpha/def :portkey.aws.cloud9/list-environments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.list-environments-result/next-token :portkey.aws.cloud9.list-environments-result/environment-ids]))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-result/memberships (clojure.spec.alpha/and :portkey.aws.cloud9/environment-members-list))
(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environment-memberships-result/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environment-memberships-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environment-memberships-result/memberships :portkey.aws.cloud9.describe-environment-memberships-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloud9/permissions #{"owner" "read-only" :readonly "read-write" :readwrite :owner})

(clojure.spec.alpha/def :portkey.aws.cloud9/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\x20-\x7E]{10,128}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.list-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.cloud9/max-results))
(clojure.spec.alpha/def :portkey.aws.cloud9/list-environments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.list-environments-request/next-token :portkey.aws.cloud9.list-environments-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.cloud9/permissions-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/permissions))

(clojure.spec.alpha/def :portkey.aws.cloud9/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-type #{"ec2" :ssh :ec-2 "ssh"})

(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.environment-lifecycle/status (clojure.spec.alpha/and :portkey.aws.cloud9/environment-lifecycle-status))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-lifecycle/reason (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9.environment-lifecycle/failure-resource (clojure.spec.alpha/and :portkey.aws.cloud9/string))
(clojure.spec.alpha/def :portkey.aws.cloud9/environment-lifecycle (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.environment-lifecycle/status :portkey.aws.cloud9.environment-lifecycle/reason :portkey.aws.cloud9.environment-lifecycle/failure-resource]))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-status #{"ready" "stopping" :ready :connecting "deleting" :creating "error" :deleting :stopping :stopped "stopped" "creating" :error "connecting"})

(clojure.spec.alpha/def :portkey.aws.cloud9/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-ec-2-result/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-ec-2-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.create-environment-ec-2-result/environment-id]))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 60))))

(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloud9/environment-id))

(clojure.spec.alpha/def :portkey.aws.cloud9/instance-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-z][1-9][.][a-z0-9]+$" s__21078__auto__))))

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
(clojure.spec.alpha/def :portkey.aws.cloud9.environment/lifecycle (clojure.spec.alpha/and :portkey.aws.cloud9/environment-lifecycle))
(clojure.spec.alpha/def :portkey.aws.cloud9/environment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.environment/id :portkey.aws.cloud9.environment/name :portkey.aws.cloud9.environment/description :portkey.aws.cloud9.environment/type :portkey.aws.cloud9.environment/arn :portkey.aws.cloud9.environment/owner-arn :portkey.aws.cloud9.environment/lifecycle]))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-result/membership (clojure.spec.alpha/and :portkey.aws.cloud9/environment-member))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-membership-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.create-environment-membership-result/membership]))

(clojure.spec.alpha/def :portkey.aws.cloud9/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloud9/delete-environment-membership-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/user-arn (clojure.spec.alpha/and :portkey.aws.cloud9/user-arn))
(clojure.spec.alpha/def :portkey.aws.cloud9.create-environment-membership-request/permissions (clojure.spec.alpha/and :portkey.aws.cloud9/member-permissions))
(clojure.spec.alpha/def :portkey.aws.cloud9/create-environment-membership-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.create-environment-membership-request/environment-id :portkey.aws.cloud9.create-environment-membership-request/user-arn :portkey.aws.cloud9.create-environment-membership-request/permissions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloud9/max-results (clojure.spec.alpha/int-in 0 25))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9]{8,32}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.cloud9.describe-environments-result/environments (clojure.spec.alpha/and :portkey.aws.cloud9/environment-list))
(clojure.spec.alpha/def :portkey.aws.cloud9/describe-environments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloud9.describe-environments-result/environments]))

(clojure.spec.alpha/def :portkey.aws.cloud9/environment-lifecycle-status #{:delete-failed :created :deleting "DELETING" "DELETE_FAILED" "CREATED"})

(clojure.spec.alpha/def :portkey.aws.cloud9/user-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:(iam|sts)::\d+:(root|user|federated-user|assumed-role)\/?\S*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/environment-id (clojure.spec.alpha/and :portkey.aws.cloud9/environment-id))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/name (clojure.spec.alpha/and :portkey.aws.cloud9/environment-name))
(clojure.spec.alpha/def :portkey.aws.cloud9.update-environment-request/description (clojure.spec.alpha/and :portkey.aws.cloud9/environment-description))
(clojure.spec.alpha/def :portkey.aws.cloud9/update-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloud9.update-environment-request/environment-id] :opt-un [:portkey.aws.cloud9.update-environment-request/name :portkey.aws.cloud9.update-environment-request/description]))

(clojure.core/defn update-environment "Changes the settings of an existing AWS Cloud9 development environment." ([update-environment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-environment-request update-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/update-environment-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/update-environment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEnvironment", :http.request.configuration/output-deser-fn response-update-environment-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-environment :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/update-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/update-environment-result))

(clojure.core/defn describe-environment-status "Gets status information for an AWS Cloud9 development environment." ([describe-environment-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-status-request describe-environment-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/describe-environment-status-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/describe-environment-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEnvironmentStatus", :http.request.configuration/output-deser-fn response-describe-environment-status-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environment-status :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/describe-environment-status-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environment-status-result))

(clojure.core/defn create-environment-ec-2 "Creates an AWS Cloud9 development environment, launches an Amazon Elastic\nCompute Cloud (Amazon EC2) instance, and then connects from the instance to the\nenvironment." ([create-environment-ec-2-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-environment-ec-2-request create-environment-ec-2-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/create-environment-ec-2-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/create-environment-ec-2-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEnvironmentEC2", :http.request.configuration/output-deser-fn response-create-environment-ec-2-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-environment-ec-2 :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/create-environment-ec-2-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/create-environment-ec-2-result))

(clojure.core/defn list-environments "Gets a list of AWS Cloud9 development environment identifiers." ([] (list-environments {})) ([list-environments-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-environments-request list-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/list-environments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/list-environments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEnvironments", :http.request.configuration/output-deser-fn response-list-environments-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-environments :args (clojure.spec.alpha/? :portkey.aws.cloud9/list-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/list-environments-result))

(clojure.core/defn delete-environment "Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is\nconnected to the environment, also terminates the instance." ([delete-environment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-environment-request delete-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/delete-environment-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/delete-environment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEnvironment", :http.request.configuration/output-deser-fn response-delete-environment-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-environment :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/delete-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/delete-environment-result))

(clojure.core/defn describe-environments "Gets information about AWS Cloud9 development environments." ([describe-environments-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environments-request describe-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/describe-environments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/describe-environments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEnvironments", :http.request.configuration/output-deser-fn response-describe-environments-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environments :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/describe-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environments-result))

(clojure.core/defn describe-environment-memberships "Gets information about environment members for an AWS Cloud9 development\nenvironment." ([] (describe-environment-memberships {})) ([describe-environment-memberships-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-environment-memberships-request describe-environment-memberships-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/describe-environment-memberships-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/describe-environment-memberships-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEnvironmentMemberships", :http.request.configuration/output-deser-fn response-describe-environment-memberships-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef describe-environment-memberships :args (clojure.spec.alpha/? :portkey.aws.cloud9/describe-environment-memberships-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/describe-environment-memberships-result))

(clojure.core/defn update-environment-membership "Changes the settings of an existing environment member for an AWS Cloud9\ndevelopment environment." ([update-environment-membership-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-environment-membership-request update-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/update-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/update-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEnvironmentMembership", :http.request.configuration/output-deser-fn response-update-environment-membership-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/update-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/update-environment-membership-result))

(clojure.core/defn delete-environment-membership "Deletes an environment member from an AWS Cloud9 development environment." ([delete-environment-membership-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-environment-membership-request delete-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/delete-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/delete-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEnvironmentMembership", :http.request.configuration/output-deser-fn response-delete-environment-membership-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/delete-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/delete-environment-membership-result))

(clojure.core/defn create-environment-membership "Adds an environment member to an AWS Cloud9 development environment." ([create-environment-membership-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-environment-membership-request create-environment-membership-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloud9/endpoints, :http.request.configuration/target-prefix "AWSCloud9WorkspaceManagementService", :http.request.spec/output-spec :portkey.aws.cloud9/create-environment-membership-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-09-23", :http.request.configuration/service-id "Cloud9", :http.request.spec/input-spec :portkey.aws.cloud9/create-environment-membership-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEnvironmentMembership", :http.request.configuration/output-deser-fn response-create-environment-membership-result, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.cloud9/bad-request-exception, "ConflictException" :portkey.aws.cloud9/conflict-exception, "NotFoundException" :portkey.aws.cloud9/not-found-exception, "ForbiddenException" :portkey.aws.cloud9/forbidden-exception, "TooManyRequestsException" :portkey.aws.cloud9/too-many-requests-exception, "LimitExceededException" :portkey.aws.cloud9/limit-exceeded-exception, "InternalServerErrorException" :portkey.aws.cloud9/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-environment-membership :args (clojure.spec.alpha/tuple :portkey.aws.cloud9/create-environment-membership-request) :ret (clojure.spec.alpha/and :portkey.aws.cloud9/create-environment-membership-result))
