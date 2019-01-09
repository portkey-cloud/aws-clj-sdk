(ns portkey.aws.sms (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sms", :region "ap-northeast-1"},
    :ssl-common-name "sms.ap-northeast-1.amazonaws.com",
    :endpoint "https://sms.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sms", :region "eu-west-1"},
    :ssl-common-name "sms.eu-west-1.amazonaws.com",
    :endpoint "https://sms.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sms", :region "us-east-2"},
    :ssl-common-name "sms.us-east-2.amazonaws.com",
    :endpoint "https://sms.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sms", :region "ap-southeast-2"},
    :ssl-common-name "sms.ap-southeast-2.amazonaws.com",
    :endpoint "https://sms.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sms", :region "cn-north-1"},
    :ssl-common-name "sms.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sms.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sms", :region "sa-east-1"},
    :ssl-common-name "sms.sa-east-1.amazonaws.com",
    :endpoint "https://sms.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sms", :region "ap-southeast-1"},
    :ssl-common-name "sms.ap-southeast-1.amazonaws.com",
    :endpoint "https://sms.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sms", :region "cn-northwest-1"},
    :ssl-common-name "sms.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://sms.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sms", :region "ap-northeast-2"},
    :ssl-common-name "sms.ap-northeast-2.amazonaws.com",
    :endpoint "https://sms.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sms", :region "eu-west-3"},
    :ssl-common-name "sms.eu-west-3.amazonaws.com",
    :endpoint "https://sms.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sms", :region "ca-central-1"},
    :ssl-common-name "sms.ca-central-1.amazonaws.com",
    :endpoint "https://sms.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sms", :region "eu-central-1"},
    :ssl-common-name "sms.eu-central-1.amazonaws.com",
    :endpoint "https://sms.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sms", :region "eu-west-2"},
    :ssl-common-name "sms.eu-west-2.amazonaws.com",
    :endpoint "https://sms.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sms", :region "us-gov-west-1"},
    :ssl-common-name "sms.us-gov-west-1.amazonaws.com",
    :endpoint "https://sms.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sms", :region "us-west-2"},
    :ssl-common-name "sms.us-west-2.amazonaws.com",
    :endpoint "https://sms.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sms", :region "us-east-1"},
    :ssl-common-name "sms.us-east-1.amazonaws.com",
    :endpoint "https://sms.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sms", :region "us-west-1"},
    :ssl-common-name "sms.us-west-1.amazonaws.com",
    :endpoint "https://sms.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sms", :region "ap-south-1"},
    :ssl-common-name "sms.ap-south-1.amazonaws.com",
    :endpoint "https://sms.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-role-name)

(clojure.core/declare ser-connector-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-replication-job-id)

(clojure.core/declare ser-description)

(clojure.core/declare ser-frequency)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-license-type)

(clojure.core/declare ser-server-id)

(clojure.core/defn- ser-role-name [input] #:http.request.field{:value input, :shape "RoleName"})

(clojure.core/defn- ser-connector-id [input] #:http.request.field{:value input, :shape "ConnectorId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-replication-job-id [input] #:http.request.field{:value input, :shape "ReplicationJobId"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-frequency [input] #:http.request.field{:value input, :shape "Frequency"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-license-type [input] #:http.request.field{:value (clojure.core/get {"AWS" "AWS", :aws "AWS", "BYOL" "BYOL", :byol "BYOL"} input), :shape "LicenseType"})

(clojure.core/defn- ser-server-id [input] #:http.request.field{:value input, :shape "ServerId"})

(clojure.core/defn- req-disassociate-connector-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connector-id (input :connector-id)) #:http.request.field{:name "connectorId", :shape "ConnectorId"})]}))

(clojure.core/defn- req-create-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-server-id (input :server-id)) #:http.request.field{:name "serverId", :shape "ServerId"}) (clojure.core/into (ser-timestamp (input :seed-replication-time)) #:http.request.field{:name "seedReplicationTime", :shape "Timestamp"}) (clojure.core/into (ser-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "Frequency"})]} (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-type (input :license-type)) #:http.request.field{:name "licenseType", :shape "LicenseType"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-get-servers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]}))

(clojure.core/defn- req-start-on-demand-replication-run-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-get-replication-runs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-connectors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-replication-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :replication-job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-delete-server-catalog-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-replication-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-replication-job-id (input :replication-job-id)) #:http.request.field{:name "replicationJobId", :shape "ReplicationJobId"})]} (clojure.core/contains? input :frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-frequency (input :frequency)) #:http.request.field{:name "frequency", :shape "Frequency"})) (clojure.core/contains? input :next-replication-run-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :next-replication-run-start-time)) #:http.request.field{:name "nextReplicationRunStartTime", :shape "Timestamp"})) (clojure.core/contains? input :license-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-type (input :license-type)) #:http.request.field{:name "licenseType", :shape "LicenseType"})) (clojure.core/contains? input :role-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-name (input :role-name)) #:http.request.field{:name "roleName", :shape "RoleName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-import-server-catalog-request [input] (clojure.core/cond-> {}))

(clojure.spec.alpha/def :portkey.aws.sms.disassociate-connector-request/connector-id (clojure.spec.alpha/and :portkey.aws.sms/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms/disassociate-connector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.disassociate-connector-request/connector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/replication-job-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/connector-list (clojure.spec.alpha/coll-of :portkey.aws.sms/connector))

(clojure.spec.alpha/def :portkey.aws.sms/delete-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/connector-capability-list (clojure.spec.alpha/coll-of :portkey.aws.sms/connector-capability))

(clojure.spec.alpha/def :portkey.aws.sms.replication-run/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/state (clojure.spec.alpha/and :portkey.aws.sms/replication-run-state))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/type (clojure.spec.alpha/and :portkey.aws.sms/replication-run-type))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/status-message (clojure.spec.alpha/and :portkey.aws.sms/replication-run-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/ami-id (clojure.spec.alpha/and :portkey.aws.sms/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/scheduled-start-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/completed-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.replication-run/description (clojure.spec.alpha/and :portkey.aws.sms/description))
(clojure.spec.alpha/def :portkey.aws.sms/replication-run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.replication-run/replication-run-id :portkey.aws.sms.replication-run/state :portkey.aws.sms.replication-run/type :portkey.aws.sms.replication-run/status-message :portkey.aws.sms.replication-run/ami-id :portkey.aws.sms.replication-run/scheduled-start-time :portkey.aws.sms.replication-run/completed-time :portkey.aws.sms.replication-run/description]))

(clojure.spec.alpha/def :portkey.aws.sms.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/missing-required-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.missing-required-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/disassociate-connector-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.connector/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.connector/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.connector/capability-list (clojure.spec.alpha/and :portkey.aws.sms/connector-capability-list))
(clojure.spec.alpha/def :portkey.aws.sms.connector/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.connector/connector-id (clojure.spec.alpha/and :portkey.aws.sms/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms.connector/mac-address (clojure.spec.alpha/and :portkey.aws.sms/mac-address))
(clojure.spec.alpha/def :portkey.aws.sms.connector/associated-on (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.connector/status (clojure.spec.alpha/and :portkey.aws.sms/connector-status))
(clojure.spec.alpha/def :portkey.aws.sms.connector/version (clojure.spec.alpha/and :portkey.aws.sms/connector-version))
(clojure.spec.alpha/def :portkey.aws.sms.connector/ip-address (clojure.spec.alpha/and :portkey.aws.sms/ip-address))
(clojure.spec.alpha/def :portkey.aws.sms/connector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.connector/vm-manager-id :portkey.aws.sms.connector/vm-manager-type :portkey.aws.sms.connector/capability-list :portkey.aws.sms.connector/vm-manager-name :portkey.aws.sms.connector/connector-id :portkey.aws.sms.connector/mac-address :portkey.aws.sms.connector/associated-on :portkey.aws.sms.connector/status :portkey.aws.sms.connector/version :portkey.aws.sms.connector/ip-address]))

(clojure.spec.alpha/def :portkey.aws.sms.get-servers-response/last-modified-on (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.get-servers-response/server-catalog-status (clojure.spec.alpha/and :portkey.aws.sms/server-catalog-status))
(clojure.spec.alpha/def :portkey.aws.sms.get-servers-response/server-list (clojure.spec.alpha/and :portkey.aws.sms/server-list))
(clojure.spec.alpha/def :portkey.aws.sms.get-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms/get-servers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-servers-response/last-modified-on :portkey.aws.sms.get-servers-response/server-catalog-status :portkey.aws.sms.get-servers-response/server-list :portkey.aws.sms.get-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms/vm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.internal-error/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/internal-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.internal-error/message]))

(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/server-id (clojure.spec.alpha/and :portkey.aws.sms/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms/description))
(clojure.spec.alpha/def :portkey.aws.sms/create-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.create-replication-job-request/server-id :portkey.aws.sms.create-replication-job-request/seed-replication-time :portkey.aws.sms.create-replication-job-request/frequency] :opt-un [:portkey.aws.sms.create-replication-job-request/license-type :portkey.aws.sms.create-replication-job-request/role-name :portkey.aws.sms.create-replication-job-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.start-on-demand-replication-run-response/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms/start-on-demand-replication-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.start-on-demand-replication-run-response/replication-run-id]))

(clojure.spec.alpha/def :portkey.aws.sms.replication-job/license-type (clojure.spec.alpha/and :portkey.aws.sms/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/server-type (clojure.spec.alpha/and :portkey.aws.sms/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/latest-ami-id (clojure.spec.alpha/and :portkey.aws.sms/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/status-message (clojure.spec.alpha/and :portkey.aws.sms/replication-job-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/role-name (clojure.spec.alpha/and :portkey.aws.sms/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/vm-server (clojure.spec.alpha/and :portkey.aws.sms/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/server-id (clojure.spec.alpha/and :portkey.aws.sms/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/state (clojure.spec.alpha/and :portkey.aws.sms/replication-job-state))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/description (clojure.spec.alpha/and :portkey.aws.sms/description))
(clojure.spec.alpha/def :portkey.aws.sms.replication-job/frequency (clojure.spec.alpha/and :portkey.aws.sms/frequency))
(clojure.spec.alpha/def :portkey.aws.sms/replication-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.replication-job/license-type :portkey.aws.sms.replication-job/seed-replication-time :portkey.aws.sms.replication-job/server-type :portkey.aws.sms.replication-job/latest-ami-id :portkey.aws.sms.replication-job/status-message :portkey.aws.sms.replication-job/replication-run-list :portkey.aws.sms.replication-job/role-name :portkey.aws.sms.replication-job/next-replication-run-start-time :portkey.aws.sms.replication-job/vm-server :portkey.aws.sms.replication-job/server-id :portkey.aws.sms.replication-job/state :portkey.aws.sms.replication-job/replication-job-id :portkey.aws.sms.replication-job/description :portkey.aws.sms.replication-job/frequency]))

(clojure.spec.alpha/def :portkey.aws.sms/role-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/vm-manager-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/connector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.get-servers-request/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.get-servers-request/max-results (clojure.spec.alpha/and :portkey.aws.sms/max-results))
(clojure.spec.alpha/def :portkey.aws.sms/get-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-servers-request/next-token :portkey.aws.sms.get-servers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms/server-type #{"VIRTUAL_MACHINE" :virtual-machine})

(clojure.spec.alpha/def :portkey.aws.sms/replication-run-type #{"ON_DEMAND" "AUTOMATIC" :automatic :on-demand})

(clojure.spec.alpha/def :portkey.aws.sms/update-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/import-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/vm-manager-type #{"VSPHERE" :vsphere})

(clojure.spec.alpha/def :portkey.aws.sms/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.server-cannot-be-replicated-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/server-cannot-be-replicated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.server-cannot-be-replicated-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/replication-run-state #{"COMPLETED" "MISSED" :deleted :missed :pending :completed "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.sms/vm-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/delete-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.create-replication-job-response/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms/create-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.create-replication-job-response/replication-job-id]))

(clojure.spec.alpha/def :portkey.aws.sms/vm-manager-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/replication-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/replication-run-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.no-connectors-available-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/no-connectors-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.no-connectors-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/ami-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.delete-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms/delete-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.delete-replication-job-request/replication-job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/replication-job-terminated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.unauthorized-operation-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/unauthorized-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.unauthorized-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/connector-status #{:unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.sms.start-on-demand-replication-run-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.start-on-demand-replication-run-request/description (clojure.spec.alpha/and :portkey.aws.sms/description))
(clojure.spec.alpha/def :portkey.aws.sms/start-on-demand-replication-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.start-on-demand-replication-run-request/replication-job-id] :opt-un [:portkey.aws.sms.start-on-demand-replication-run-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.replication-job-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/replication-job-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.replication-job-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms/max-results))
(clojure.spec.alpha/def :portkey.aws.sms/get-replication-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.get-replication-runs-request/replication-job-id] :opt-un [:portkey.aws.sms.get-replication-runs-request/next-token :portkey.aws.sms.get-replication-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms/replication-run-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.get-connectors-request/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.get-connectors-request/max-results (clojure.spec.alpha/and :portkey.aws.sms/max-results))
(clojure.spec.alpha/def :portkey.aws.sms/get-connectors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-connectors-request/next-token :portkey.aws.sms.get-connectors-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.get-replication-jobs-response/replication-job-list (clojure.spec.alpha/and :portkey.aws.sms/replication-job-list))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms/get-replication-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-replication-jobs-response/replication-job-list :portkey.aws.sms.get-replication-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-response/replication-job (clojure.spec.alpha/and :portkey.aws.sms/replication-job))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-response/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms/get-replication-runs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-replication-runs-response/replication-job :portkey.aws.sms.get-replication-runs-response/replication-run-list :portkey.aws.sms.get-replication-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.server/server-id (clojure.spec.alpha/and :portkey.aws.sms/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.server/server-type (clojure.spec.alpha/and :portkey.aws.sms/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.server/vm-server (clojure.spec.alpha/and :portkey.aws.sms/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.server/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.server/replication-job-terminated (clojure.spec.alpha/and :portkey.aws.sms/replication-job-terminated))
(clojure.spec.alpha/def :portkey.aws.sms/server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.server/server-id :portkey.aws.sms.server/server-type :portkey.aws.sms.server/vm-server :portkey.aws.sms.server/replication-job-id :portkey.aws.sms.server/replication-job-terminated]))

(clojure.spec.alpha/def :portkey.aws.sms/server-list (clojure.spec.alpha/coll-of :portkey.aws.sms/server))

(clojure.spec.alpha/def :portkey.aws.sms.get-replication-jobs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.get-replication-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms/max-results))
(clojure.spec.alpha/def :portkey.aws.sms/get-replication-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-replication-jobs-request/replication-job-id :portkey.aws.sms.get-replication-jobs-request/next-token :portkey.aws.sms.get-replication-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms/delete-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/frequency clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms/replication-job-list (clojure.spec.alpha/coll-of :portkey.aws.sms/replication-job))

(clojure.spec.alpha/def :portkey.aws.sms/connector-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sms.get-connectors-response/connector-list (clojure.spec.alpha/and :portkey.aws.sms/connector-list))
(clojure.spec.alpha/def :portkey.aws.sms.get-connectors-response/next-token (clojure.spec.alpha/and :portkey.aws.sms/next-token))
(clojure.spec.alpha/def :portkey.aws.sms/get-connectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.get-connectors-response/connector-list :portkey.aws.sms.get-connectors-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms/connector-capability #{"VSPHERE" :vsphere})

(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.update-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms/description))
(clojure.spec.alpha/def :portkey.aws.sms/update-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.update-replication-job-request/replication-job-id] :opt-un [:portkey.aws.sms.update-replication-job-request/frequency :portkey.aws.sms.update-replication-job-request/next-replication-run-start-time :portkey.aws.sms.update-replication-job-request/license-type :portkey.aws.sms.update-replication-job-request/role-name :portkey.aws.sms.update-replication-job-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.replication-run-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/replication-run-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.replication-run-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/replication-run-list (clojure.spec.alpha/coll-of :portkey.aws.sms/replication-run))

(clojure.spec.alpha/def :portkey.aws.sms/import-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms/replication-job-state #{:deleted :pending "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.sms.vm-server-address/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.vm-server-address/vm-id (clojure.spec.alpha/and :portkey.aws.sms/vm-id))
(clojure.spec.alpha/def :portkey.aws.sms/vm-server-address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.vm-server-address/vm-manager-id :portkey.aws.sms.vm-server-address/vm-id]))

(clojure.spec.alpha/def :portkey.aws.sms.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/license-type #{:aws "AWS" "BYOL" :byol})

(clojure.spec.alpha/def :portkey.aws.sms.replication-job-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sms/error-message))
(clojure.spec.alpha/def :portkey.aws.sms/replication-job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.replication-job-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms/vm-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.vm-server/vm-server-address (clojure.spec.alpha/and :portkey.aws.sms/vm-server-address))
(clojure.spec.alpha/def :portkey.aws.sms.vm-server/vm-name (clojure.spec.alpha/and :portkey.aws.sms/vm-name))
(clojure.spec.alpha/def :portkey.aws.sms.vm-server/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.vm-server/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.vm-server/vm-path (clojure.spec.alpha/and :portkey.aws.sms/vm-path))
(clojure.spec.alpha/def :portkey.aws.sms/vm-server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.vm-server/vm-server-address :portkey.aws.sms.vm-server/vm-name :portkey.aws.sms.vm-server/vm-manager-name :portkey.aws.sms.vm-server/vm-manager-type :portkey.aws.sms.vm-server/vm-path]))

(clojure.spec.alpha/def :portkey.aws.sms/server-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms/server-catalog-status #{:deleted "EXPIRED" :not-imported "AVAILABLE" "NOT_IMPORTED" :expired :available "DELETED" :importing "IMPORTING"})

(clojure.core/defn get-connectors ([] (get-connectors {})) ([get-connectors-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-connectors-request get-connectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/get-connectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/get-connectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConnectors", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-connectors :args (clojure.spec.alpha/? :portkey.aws.sms/get-connectors-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/get-connectors-response))

(clojure.core/defn import-server-catalog ([] (import-server-catalog {})) ([import-server-catalog-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-import-server-catalog-request import-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/import-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/import-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportServerCatalog", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "NoConnectorsAvailableException" :portkey.aws.sms/no-connectors-available-exception}})))))
(clojure.spec.alpha/fdef import-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms/import-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/import-server-catalog-response))

(clojure.core/defn start-on-demand-replication-run ([start-on-demand-replication-run-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-on-demand-replication-run-request start-on-demand-replication-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/start-on-demand-replication-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/start-on-demand-replication-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartOnDemandReplicationRun", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "ReplicationRunLimitExceededException" :portkey.aws.sms/replication-run-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-on-demand-replication-run :args (clojure.spec.alpha/tuple :portkey.aws.sms/start-on-demand-replication-run-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/start-on-demand-replication-run-response))

(clojure.core/defn get-replication-runs ([get-replication-runs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-replication-runs-request get-replication-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/get-replication-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/get-replication-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReplicationRuns", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-runs :args (clojure.spec.alpha/tuple :portkey.aws.sms/get-replication-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/get-replication-runs-response))

(clojure.core/defn delete-replication-job ([delete-replication-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-replication-job-request delete-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/delete-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/delete-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "ReplicationJobNotFoundException" :portkey.aws.sms/replication-job-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms/delete-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/delete-replication-job-response))

(clojure.core/defn get-replication-jobs ([] (get-replication-jobs {})) ([get-replication-jobs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-replication-jobs-request get-replication-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/get-replication-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/get-replication-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReplicationJobs", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-jobs :args (clojure.spec.alpha/? :portkey.aws.sms/get-replication-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/get-replication-jobs-response))

(clojure.core/defn disassociate-connector ([disassociate-connector-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disassociate-connector-request disassociate-connector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/disassociate-connector-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/disassociate-connector-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateConnector", :http.request.spec/error-spec {"MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef disassociate-connector :args (clojure.spec.alpha/tuple :portkey.aws.sms/disassociate-connector-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/disassociate-connector-response))

(clojure.core/defn delete-server-catalog ([] (delete-server-catalog {})) ([delete-server-catalog-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-server-catalog-request delete-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/delete-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/delete-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServerCatalog", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms/delete-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/delete-server-catalog-response))

(clojure.core/defn create-replication-job ([create-replication-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-replication-job-request create-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/create-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/create-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "ServerCannotBeReplicatedException" :portkey.aws.sms/server-cannot-be-replicated-exception, "ReplicationJobAlreadyExistsException" :portkey.aws.sms/replication-job-already-exists-exception, "NoConnectorsAvailableException" :portkey.aws.sms/no-connectors-available-exception, "InternalError" :portkey.aws.sms/internal-error}})))))
(clojure.spec.alpha/fdef create-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms/create-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/create-replication-job-response))

(clojure.core/defn get-servers ([] (get-servers {})) ([get-servers-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-servers-request get-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/get-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/get-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetServers", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-servers :args (clojure.spec.alpha/? :portkey.aws.sms/get-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/get-servers-response))

(clojure.core/defn update-replication-job ([update-replication-job-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-replication-job-request update-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sms/endpoints, :http.request.configuration/target-prefix "AWSServerMigrationService_V2016_10_24", :http.request.spec/output-spec :portkey.aws.sms/update-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms/update-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms/missing-required-parameter-exception, "OperationNotPermittedException" :portkey.aws.sms/operation-not-permitted-exception, "UnauthorizedOperationException" :portkey.aws.sms/unauthorized-operation-exception, "ServerCannotBeReplicatedException" :portkey.aws.sms/server-cannot-be-replicated-exception, "ReplicationJobNotFoundException" :portkey.aws.sms/replication-job-not-found-exception, "InternalError" :portkey.aws.sms/internal-error}})))))
(clojure.spec.alpha/fdef update-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms/update-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms/update-replication-job-response))
