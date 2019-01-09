(ns portkey.aws.sms.-2016-10-24 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.disassociate-connector-request/connector-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/disassociate-connector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.disassociate-connector-request/connector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/connector))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-capability-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/connector-capability))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/state (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-state))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/ami-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/scheduled-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/completed-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-run/replication-run-id :portkey.aws.sms.-2016-10-24.replication-run/state :portkey.aws.sms.-2016-10-24.replication-run/type :portkey.aws.sms.-2016-10-24.replication-run/status-message :portkey.aws.sms.-2016-10-24.replication-run/ami-id :portkey.aws.sms.-2016-10-24.replication-run/scheduled-start-time :portkey.aws.sms.-2016-10-24.replication-run/completed-time :portkey.aws.sms.-2016-10-24.replication-run/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.missing-required-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/disassociate-connector-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/capability-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-capability-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/connector-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/mac-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/mac-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/associated-on (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/version (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-version))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.connector/ip-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ip-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.connector/vm-manager-id :portkey.aws.sms.-2016-10-24.connector/vm-manager-type :portkey.aws.sms.-2016-10-24.connector/capability-list :portkey.aws.sms.-2016-10-24.connector/vm-manager-name :portkey.aws.sms.-2016-10-24.connector/connector-id :portkey.aws.sms.-2016-10-24.connector/mac-address :portkey.aws.sms.-2016-10-24.connector/associated-on :portkey.aws.sms.-2016-10-24.connector/status :portkey.aws.sms.-2016-10-24.connector/version :portkey.aws.sms.-2016-10-24.connector/ip-address]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/last-modified-on (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/server-catalog-status (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-catalog-status))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/server-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-servers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-servers-response/last-modified-on :portkey.aws.sms.-2016-10-24.get-servers-response/server-catalog-status :portkey.aws.sms.-2016-10-24.get-servers-response/server-list :portkey.aws.sms.-2016-10-24.get-servers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.internal-error/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/internal-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.internal-error/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.create-replication-job-request/server-id :portkey.aws.sms.-2016-10-24.create-replication-job-request/seed-replication-time :portkey.aws.sms.-2016-10-24.create-replication-job-request/frequency] :opt-un [:portkey.aws.sms.-2016-10-24.create-replication-job-request/license-type :portkey.aws.sms.-2016-10-24.create-replication-job-request/role-name :portkey.aws.sms.-2016-10-24.create-replication-job-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-response/replication-run-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-response/replication-run-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/seed-replication-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/server-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/latest-ami-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/ami-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/status-message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-status-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/vm-server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/state (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-state))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job/license-type :portkey.aws.sms.-2016-10-24.replication-job/seed-replication-time :portkey.aws.sms.-2016-10-24.replication-job/server-type :portkey.aws.sms.-2016-10-24.replication-job/latest-ami-id :portkey.aws.sms.-2016-10-24.replication-job/status-message :portkey.aws.sms.-2016-10-24.replication-job/replication-run-list :portkey.aws.sms.-2016-10-24.replication-job/role-name :portkey.aws.sms.-2016-10-24.replication-job/next-replication-run-start-time :portkey.aws.sms.-2016-10-24.replication-job/vm-server :portkey.aws.sms.-2016-10-24.replication-job/server-id :portkey.aws.sms.-2016-10-24.replication-job/state :portkey.aws.sms.-2016-10-24.replication-job/replication-job-id :portkey.aws.sms.-2016-10-24.replication-job/description :portkey.aws.sms.-2016-10-24.replication-job/frequency]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/role-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/mac-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-servers-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-servers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-servers-request/next-token :portkey.aws.sms.-2016-10-24.get-servers-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-type #{"VIRTUAL_MACHINE" :virtual-machine})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-type #{"ON_DEMAND" "AUTOMATIC" :automatic :on-demand})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/import-server-catalog-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-type #{"VSPHERE" :vsphere})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server-cannot-be-replicated-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server-cannot-be-replicated-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-state #{"COMPLETED" "MISSED" :deleted :missed :pending :completed "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.create-replication-job-response/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/create-replication-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.create-replication-job-response/replication-job-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-manager-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.no-connectors-available-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/no-connectors-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.no-connectors-available-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/ami-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.delete-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.delete-replication-job-request/replication-job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-terminated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.unauthorized-operation-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.unauthorized-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-status #{:unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.start-on-demand-replication-run-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-runs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-request/next-token :portkey.aws.sms.-2016-10-24.get-replication-runs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-connectors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-connectors-request/next-token :portkey.aws.sms.-2016-10-24.get-connectors-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/replication-job-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-jobs-response/replication-job-list :portkey.aws.sms.-2016-10-24.get-replication-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-job (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-run-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-run-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-runs-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-runs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-job :portkey.aws.sms.-2016-10-24.get-replication-runs-response/replication-run-list :portkey.aws.sms.-2016-10-24.get-replication-runs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/server-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/server-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/server-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/vm-server (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.server/replication-job-terminated (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-terminated))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.server/server-id :portkey.aws.sms.-2016-10-24.server/server-type :portkey.aws.sms.-2016-10-24.server/vm-server :portkey.aws.sms.-2016-10-24.server/replication-job-id :portkey.aws.sms.-2016-10-24.server/replication-job-terminated]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/server))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/max-results))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-replication-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-replication-jobs-request/replication-job-id :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/next-token :portkey.aws.sms.-2016-10-24.get-replication-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/delete-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/frequency clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/replication-job))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-response/connector-list (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/connector-list))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.get-connectors-response/next-token (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/next-token))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/get-connectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.get-connectors-response/connector-list :portkey.aws.sms.-2016-10-24.get-connectors-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/connector-capability #{"VSPHERE" :vsphere})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/replication-job-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/replication-job-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/frequency (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/frequency))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/next-replication-run-start-time (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/timestamp))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/license-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/license-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/role-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/role-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.update-replication-job-request/description (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/description))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/update-replication-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms.-2016-10-24.update-replication-job-request/replication-job-id] :opt-un [:portkey.aws.sms.-2016-10-24.update-replication-job-request/frequency :portkey.aws.sms.-2016-10-24.update-replication-job-request/next-replication-run-start-time :portkey.aws.sms.-2016-10-24.update-replication-job-request/license-type :portkey.aws.sms.-2016-10-24.update-replication-job-request/role-name :portkey.aws.sms.-2016-10-24.update-replication-job-request/description]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-run-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-run-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-run-list (clojure.spec.alpha/coll-of :portkey.aws.sms.-2016-10-24/replication-run))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/import-server-catalog-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-state #{:deleted :pending "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server-address/vm-manager-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server-address/vm-id (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-id))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-server-address (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.vm-server-address/vm-manager-id :portkey.aws.sms.-2016-10-24.vm-server-address/vm-id]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/license-type #{:aws "AWS" "BYOL" :byol})

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.replication-job-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/error-message))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.replication-job-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-server-address (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-server-address))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-name (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-name))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-type (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-manager-type))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24.vm-server/vm-path (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/vm-path))
(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/vm-server (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms.-2016-10-24.vm-server/vm-server-address :portkey.aws.sms.-2016-10-24.vm-server/vm-name :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-name :portkey.aws.sms.-2016-10-24.vm-server/vm-manager-type :portkey.aws.sms.-2016-10-24.vm-server/vm-path]))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms.-2016-10-24/server-catalog-status #{:deleted "EXPIRED" :not-imported "AVAILABLE" "NOT_IMPORTED" :expired :available "DELETED" :importing "IMPORTING"})

(clojure.core/defn get-connectors ([] (get-connectors {})) ([get-connectors-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-connectors-request get-connectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-connectors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-connectors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConnectors", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-connectors :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-connectors-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-connectors-response))

(clojure.core/defn import-server-catalog ([] (import-server-catalog {})) ([import-server-catalog-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-import-server-catalog-request import-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/import-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/import-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportServerCatalog", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "NoConnectorsAvailableException" :portkey.aws.sms.-2016-10-24/no-connectors-available-exception}})))))
(clojure.spec.alpha/fdef import-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/import-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/import-server-catalog-response))

(clojure.core/defn start-on-demand-replication-run ([start-on-demand-replication-run-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-on-demand-replication-run-request start-on-demand-replication-run-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartOnDemandReplicationRun", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "ReplicationRunLimitExceededException" :portkey.aws.sms.-2016-10-24/replication-run-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-on-demand-replication-run :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/start-on-demand-replication-run-response))

(clojure.core/defn get-replication-runs ([get-replication-runs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-replication-runs-request get-replication-runs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-replication-runs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-replication-runs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReplicationRuns", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-runs :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/get-replication-runs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-replication-runs-response))

(clojure.core/defn delete-replication-job ([delete-replication-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-replication-job-request delete-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "ReplicationJobNotFoundException" :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/delete-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-replication-job-response))

(clojure.core/defn get-replication-jobs ([] (get-replication-jobs {})) ([get-replication-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-replication-jobs-request get-replication-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-replication-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-replication-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReplicationJobs", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-replication-jobs :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-replication-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-replication-jobs-response))

(clojure.core/defn disassociate-connector ([disassociate-connector-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-connector-request disassociate-connector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/disassociate-connector-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/disassociate-connector-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateConnector", :http.request.spec/error-spec {"MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef disassociate-connector :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/disassociate-connector-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/disassociate-connector-response))

(clojure.core/defn delete-server-catalog ([] (delete-server-catalog {})) ([delete-server-catalog-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-server-catalog-request delete-server-catalog-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/delete-server-catalog-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/delete-server-catalog-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServerCatalog", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-server-catalog :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/delete-server-catalog-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/delete-server-catalog-response))

(clojure.core/defn create-replication-job ([create-replication-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-replication-job-request create-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/create-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/create-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "ServerCannotBeReplicatedException" :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception, "ReplicationJobAlreadyExistsException" :portkey.aws.sms.-2016-10-24/replication-job-already-exists-exception, "NoConnectorsAvailableException" :portkey.aws.sms.-2016-10-24/no-connectors-available-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error}})))))
(clojure.spec.alpha/fdef create-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/create-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/create-replication-job-response))

(clojure.core/defn get-servers ([] (get-servers {})) ([get-servers-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-servers-request get-servers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/get-servers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/get-servers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetServers", :http.request.spec/error-spec {"UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception}})))))
(clojure.spec.alpha/fdef get-servers :args (clojure.spec.alpha/? :portkey.aws.sms.-2016-10-24/get-servers-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/get-servers-response))

(clojure.core/defn update-replication-job ([update-replication-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-replication-job-request update-replication-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sms.-2016-10-24/endpoints, :http.request.spec/output-spec :portkey.aws.sms.-2016-10-24/update-replication-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-10-24", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sms.-2016-10-24/update-replication-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateReplicationJob", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.sms.-2016-10-24/invalid-parameter-exception, "MissingRequiredParameterException" :portkey.aws.sms.-2016-10-24/missing-required-parameter-exception, "OperationNotPermittedException" :portkey.aws.sms.-2016-10-24/operation-not-permitted-exception, "UnauthorizedOperationException" :portkey.aws.sms.-2016-10-24/unauthorized-operation-exception, "ServerCannotBeReplicatedException" :portkey.aws.sms.-2016-10-24/server-cannot-be-replicated-exception, "ReplicationJobNotFoundException" :portkey.aws.sms.-2016-10-24/replication-job-not-found-exception, "InternalError" :portkey.aws.sms.-2016-10-24/internal-error}})))))
(clojure.spec.alpha/fdef update-replication-job :args (clojure.spec.alpha/tuple :portkey.aws.sms.-2016-10-24/update-replication-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sms.-2016-10-24/update-replication-job-response))
