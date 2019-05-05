(ns portkey.aws.mq (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "mq", :region "ap-northeast-1"},
    :ssl-common-name "mq.ap-northeast-1.amazonaws.com",
    :endpoint "https://mq.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "mq", :region "eu-west-1"},
    :ssl-common-name "mq.eu-west-1.amazonaws.com",
    :endpoint "https://mq.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "mq", :region "us-east-2"},
    :ssl-common-name "mq.us-east-2.amazonaws.com",
    :endpoint "https://mq.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "mq", :region "ap-southeast-2"},
    :ssl-common-name "mq.ap-southeast-2.amazonaws.com",
    :endpoint "https://mq.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "mq", :region "ap-southeast-1"},
    :ssl-common-name "mq.ap-southeast-1.amazonaws.com",
    :endpoint "https://mq.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "mq", :region "ap-northeast-2"},
    :ssl-common-name "mq.ap-northeast-2.amazonaws.com",
    :endpoint "https://mq.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "mq", :region "eu-central-1"},
    :ssl-common-name "mq.eu-central-1.amazonaws.com",
    :endpoint "https://mq.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "mq", :region "us-west-2"},
    :ssl-common-name "mq.us-west-2.amazonaws.com",
    :endpoint "https://mq.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "mq", :region "us-east-1"},
    :ssl-common-name "mq.us-east-1.amazonaws.com",
    :endpoint "https://mq.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "mq", :region "us-west-1"},
    :ssl-common-name "mq.us-west-1.amazonaws.com",
    :endpoint "https://mq.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-day-of-week)

(clojure.core/declare ser-string)

(clojure.core/declare ser-logs)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-user)

(clojure.core/declare ser-weekly-start-time)

(clojure.core/declare ser-engine-type)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-deployment-mode)

(clojure.core/declare ser-list-of-user)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-map-of-string)

(clojure.core/defn- ser-day-of-week [input] #:http.request.field{:value (clojure.core/get {"WEDNESDAY" "WEDNESDAY", :saturday "SATURDAY", "SUNDAY" "SUNDAY", "THURSDAY" "THURSDAY", :tuesday "TUESDAY", :wednesday "WEDNESDAY", :sunday "SUNDAY", "TUESDAY" "TUESDAY", :friday "FRIDAY", "FRIDAY" "FRIDAY", "SATURDAY" "SATURDAY", :monday "MONDAY", "MONDAY" "MONDAY", :thursday "THURSDAY"} input), :shape "DayOfWeek"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-logs [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Logs", :type "structure"} (clojure.core/contains? input :audit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :audit)) #:http.request.field{:name "Audit", :shape "__boolean", :location-name "audit"})) (clojure.core/contains? input :general) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :general)) #:http.request.field{:name "General", :shape "__boolean", :location-name "general"}))))

(clojure.core/defn- ser-configuration-id [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ConfigurationId", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :id)) #:http.request.field{:name "Id", :shape "__string", :location-name "id"})) (clojure.core/contains? input :revision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :revision)) #:http.request.field{:name "Revision", :shape "__integer", :location-name "revision"}))))

(clojure.core/defn- ser-user [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "User", :type "structure"} (clojure.core/contains? input :console-access) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :console-access)) #:http.request.field{:name "ConsoleAccess", :shape "__boolean", :location-name "consoleAccess"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :groups)) #:http.request.field{:name "Groups", :shape "__listOf__string", :location-name "groups"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "__string", :location-name "password"})) (clojure.core/contains? input :username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location-name "username"}))))

(clojure.core/defn- ser-weekly-start-time [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WeeklyStartTime", :type "structure"} (clojure.core/contains? input :day-of-week) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-day-of-week (input :day-of-week)) #:http.request.field{:name "DayOfWeek", :shape "DayOfWeek", :location-name "dayOfWeek"})) (clojure.core/contains? input :time-of-day) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :time-of-day)) #:http.request.field{:name "TimeOfDay", :shape "__string", :location-name "timeOfDay"})) (clojure.core/contains? input :time-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :time-zone)) #:http.request.field{:name "TimeZone", :shape "__string", :location-name "timeZone"}))))

(clojure.core/defn- ser-engine-type [input] #:http.request.field{:value (clojure.core/get {"ACTIVEMQ" "ACTIVEMQ", :activemq "ACTIVEMQ"} input), :shape "EngineType"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "__boolean"})

(clojure.core/defn- ser-deployment-mode [input] #:http.request.field{:value (clojure.core/get {"SINGLE_INSTANCE" "SINGLE_INSTANCE", :single-instance "SINGLE_INSTANCE", "ACTIVE_STANDBY_MULTI_AZ" "ACTIVE_STANDBY_MULTI_AZ", :active-standby-multi-az "ACTIVE_STANDBY_MULTI_AZ"} input), :shape "DeploymentMode"})

(clojure.core/defn- ser-list-of-user [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-user coll) #:http.request.field{:shape "User"}))) input), :shape "__listOfUser", :type "list"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-map-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "__mapOf__string", :type "map"})

(clojure.core/defn- req-list-brokers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :console-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :console-access)) #:http.request.field{:name "ConsoleAccess", :shape "__boolean", :location-name "consoleAccess"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :groups)) #:http.request.field{:name "Groups", :shape "__listOf__string", :location-name "groups"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "__string", :location-name "password"}))))

(clojure.core/defn- req-create-broker-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :publicly-accessible) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publicly-accessible)) #:http.request.field{:name "PubliclyAccessible", :shape "__boolean", :location-name "publiclyAccessible"})) (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "__listOf__string", :location-name "subnetIds"})) (clojure.core/contains? input :maintenance-window-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-start-time (input :maintenance-window-start-time)) #:http.request.field{:name "MaintenanceWindowStartTime", :shape "WeeklyStartTime", :location-name "maintenanceWindowStartTime"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "__listOf__string", :location-name "securityGroups"})) (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "__string", :location-name "creatorRequestId", :idempotency-token true})) (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "__boolean", :location-name "autoMinorVersionUpgrade"})) (clojure.core/contains? input :logs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs (input :logs)) #:http.request.field{:name "Logs", :shape "Logs", :location-name "logs"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"})) (clojure.core/contains? input :engine-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-type (input :engine-type)) #:http.request.field{:name "EngineType", :shape "EngineType", :location-name "engineType"})) (clojure.core/contains? input :host-instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :host-instance-type)) #:http.request.field{:name "HostInstanceType", :shape "__string", :location-name "hostInstanceType"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :users) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-user (input :users)) #:http.request.field{:name "Users", :shape "__listOfUser", :location-name "users"})) (clojure.core/contains? input :deployment-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-mode (input :deployment-mode)) #:http.request.field{:name "DeploymentMode", :shape "DeploymentMode", :location-name "deploymentMode"})) (clojure.core/contains? input :broker-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :broker-name)) #:http.request.field{:name "BrokerName", :shape "__string", :location-name "brokerName"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-id (input :configuration)) #:http.request.field{:name "Configuration", :shape "ConfigurationId", :location-name "configuration"}))))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "__boolean", :location-name "autoMinorVersionUpgrade"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-id (input :configuration)) #:http.request.field{:name "Configuration", :shape "ConfigurationId", :location-name "configuration"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :logs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs (input :logs)) #:http.request.field{:name "Logs", :shape "Logs", :location-name "logs"}))))

(clojure.core/defn- req-describe-configuration-revision-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-revision)) #:http.request.field{:name "ConfigurationRevision", :shape "__string", :location "uri", :location-name "configuration-revision"}) (clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]}))

(clojure.core/defn- req-describe-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]}))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "__listOf__string", :location "querystring", :location-name "tagKeys"})], :uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]}))

(clojure.core/defn- req-delete-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-list-configuration-revisions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-create-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :engine-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-type (input :engine-type)) #:http.request.field{:name "EngineType", :shape "EngineType", :location-name "engineType"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"}))))

(clojure.core/defn- req-reboot-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-describe-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :console-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :console-access)) #:http.request.field{:name "ConsoleAccess", :shape "__boolean", :location-name "consoleAccess"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :groups)) #:http.request.field{:name "Groups", :shape "__listOf__string", :location-name "groups"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "__string", :location-name "password"}))))

(clojure.core/defn- req-describe-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-list-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]} (clojure.core/contains? input :data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :data)) #:http.request.field{:name "Data", :shape "__string", :location-name "data"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"}))))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resource-arn"})]}))

(clojure.core/declare deser-list-of-configuration-revision)

(clojure.core/declare deser-list-of-broker-summary)

(clojure.core/declare deser-list-of-sanitization-warning)

(clojure.core/declare deser-change-type)

(clojure.core/declare deser-day-of-week)

(clojure.core/declare deser-list-of-configuration)

(clojure.core/declare deser-string)

(clojure.core/declare deser-logs)

(clojure.core/declare deser-configurations)

(clojure.core/declare deser-configuration-revision)

(clojure.core/declare deser-configuration-id)

(clojure.core/declare deser-broker-instance)

(clojure.core/declare deser-weekly-start-time)

(clojure.core/declare deser-user-summary)

(clojure.core/declare deser-logs-summary)

(clojure.core/declare deser-engine-type)

(clojure.core/declare deser-list-of-broker-instance)

(clojure.core/declare deser-broker-state)

(clojure.core/declare deser-integer-min-5-max-100)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-list-of-configuration-id)

(clojure.core/declare deser-broker-summary)

(clojure.core/declare deser-deployment-mode)

(clojure.core/declare deser-timestamp-iso-8601)

(clojure.core/declare deser-list-of-user-summary)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-pending-logs)

(clojure.core/declare deser-sanitization-warning)

(clojure.core/declare deser-configuration)

(clojure.core/declare deser-map-of-string)

(clojure.core/declare deser-sanitization-warning-reason)

(clojure.core/declare deser-user-pending-changes)

(clojure.core/defn- deser-list-of-configuration-revision [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-revision coll))) input))

(clojure.core/defn- deser-list-of-broker-summary [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-broker-summary coll))) input))

(clojure.core/defn- deser-list-of-sanitization-warning [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-sanitization-warning coll))) input))

(clojure.core/defn- deser-change-type [input] (clojure.core/get {"CREATE" :create, "UPDATE" :update, "DELETE" :delete} input))

(clojure.core/defn- deser-day-of-week [input] (clojure.core/get {"MONDAY" :monday, "TUESDAY" :tuesday, "WEDNESDAY" :wednesday, "THURSDAY" :thursday, "FRIDAY" :friday, "SATURDAY" :saturday, "SUNDAY" :sunday} input))

(clojure.core/defn- deser-list-of-configuration [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-logs [input] (clojure.core/cond-> {} (clojure.core/contains? input "audit") (clojure.core/assoc :audit (deser-boolean (input "audit"))) (clojure.core/contains? input "general") (clojure.core/assoc :general (deser-boolean (input "general")))))

(clojure.core/defn- deser-configurations [input] (clojure.core/cond-> {} (clojure.core/contains? input "current") (clojure.core/assoc :current (deser-configuration-id (input "current"))) (clojure.core/contains? input "history") (clojure.core/assoc :history (deser-list-of-configuration-id (input "history"))) (clojure.core/contains? input "pending") (clojure.core/assoc :pending (deser-configuration-id (input "pending")))))

(clojure.core/defn- deser-configuration-revision [input] (clojure.core/cond-> {} (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (input "created"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "revision") (clojure.core/assoc :revision (deser-integer (input "revision")))))

(clojure.core/defn- deser-configuration-id [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "revision") (clojure.core/assoc :revision (deser-integer (input "revision")))))

(clojure.core/defn- deser-broker-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "consoleURL") (clojure.core/assoc :console-url (deser-string (input "consoleURL"))) (clojure.core/contains? input "endpoints") (clojure.core/assoc :endpoints (deser-list-of-string (input "endpoints"))) (clojure.core/contains? input "ipAddress") (clojure.core/assoc :ip-address (deser-string (input "ipAddress")))))

(clojure.core/defn- deser-weekly-start-time [input] (clojure.core/cond-> {} (clojure.core/contains? input "dayOfWeek") (clojure.core/assoc :day-of-week (deser-day-of-week (input "dayOfWeek"))) (clojure.core/contains? input "timeOfDay") (clojure.core/assoc :time-of-day (deser-string (input "timeOfDay"))) (clojure.core/contains? input "timeZone") (clojure.core/assoc :time-zone (deser-string (input "timeZone")))))

(clojure.core/defn- deser-user-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "pendingChange") (clojure.core/assoc :pending-change (deser-change-type (input "pendingChange"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-string (input "username")))))

(clojure.core/defn- deser-logs-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "audit") (clojure.core/assoc :audit (deser-boolean (input "audit"))) (clojure.core/contains? input "auditLogGroup") (clojure.core/assoc :audit-log-group (deser-string (input "auditLogGroup"))) (clojure.core/contains? input "general") (clojure.core/assoc :general (deser-boolean (input "general"))) (clojure.core/contains? input "generalLogGroup") (clojure.core/assoc :general-log-group (deser-string (input "generalLogGroup"))) (clojure.core/contains? input "pending") (clojure.core/assoc :pending (deser-pending-logs (input "pending")))))

(clojure.core/defn- deser-engine-type [input] (clojure.core/get {"ACTIVEMQ" :activemq} input))

(clojure.core/defn- deser-list-of-broker-instance [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-broker-instance coll))) input))

(clojure.core/defn- deser-broker-state [input] (clojure.core/get {"CREATION_IN_PROGRESS" :creation-in-progress, "CREATION_FAILED" :creation-failed, "DELETION_IN_PROGRESS" :deletion-in-progress, "RUNNING" :running, "REBOOT_IN_PROGRESS" :reboot-in-progress} input))

(clojure.core/defn- deser-integer-min-5-max-100 [input] input)

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-list-of-configuration-id [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-id coll))) input))

(clojure.core/defn- deser-broker-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "brokerArn") (clojure.core/assoc :broker-arn (deser-string (input "brokerArn"))) (clojure.core/contains? input "brokerId") (clojure.core/assoc :broker-id (deser-string (input "brokerId"))) (clojure.core/contains? input "brokerName") (clojure.core/assoc :broker-name (deser-string (input "brokerName"))) (clojure.core/contains? input "brokerState") (clojure.core/assoc :broker-state (deser-broker-state (input "brokerState"))) (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (input "created"))) (clojure.core/contains? input "deploymentMode") (clojure.core/assoc :deployment-mode (deser-deployment-mode (input "deploymentMode"))) (clojure.core/contains? input "hostInstanceType") (clojure.core/assoc :host-instance-type (deser-string (input "hostInstanceType")))))

(clojure.core/defn- deser-deployment-mode [input] (clojure.core/get {"SINGLE_INSTANCE" :single-instance, "ACTIVE_STANDBY_MULTI_AZ" :active-standby-multi-az} input))

(clojure.core/defn- deser-timestamp-iso-8601 [input] input)

(clojure.core/defn- deser-list-of-user-summary [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-summary coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-pending-logs [input] (clojure.core/cond-> {} (clojure.core/contains? input "audit") (clojure.core/assoc :audit (deser-boolean (input "audit"))) (clojure.core/contains? input "general") (clojure.core/assoc :general (deser-boolean (input "general")))))

(clojure.core/defn- deser-sanitization-warning [input] (clojure.core/cond-> {} (clojure.core/contains? input "attributeName") (clojure.core/assoc :attribute-name (deser-string (input "attributeName"))) (clojure.core/contains? input "elementName") (clojure.core/assoc :element-name (deser-string (input "elementName"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-sanitization-warning-reason (input "reason")))))

(clojure.core/defn- deser-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (input "created"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-map-of-string (input "tags"))) (clojure.core/contains? input "engineType") (clojure.core/assoc :engine-type (deser-engine-type (input "engineType"))) (clojure.core/contains? input "engineVersion") (clojure.core/assoc :engine-version (deser-string (input "engineVersion"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "latestRevision") (clojure.core/assoc :latest-revision (deser-configuration-revision (input "latestRevision"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-map-of-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-sanitization-warning-reason [input] (clojure.core/get {"DISALLOWED_ELEMENT_REMOVED" :disallowed-element-removed, "DISALLOWED_ATTRIBUTE_REMOVED" :disallowed-attribute-removed, "INVALID_ATTRIBUTE_VALUE_REMOVED" :invalid-attribute-value-removed} input))

(clojure.core/defn- deser-user-pending-changes [input] (clojure.core/cond-> {} (clojure.core/contains? input "consoleAccess") (clojure.core/assoc :console-access (deser-boolean (input "consoleAccess"))) (clojure.core/contains? input "groups") (clojure.core/assoc :groups (deser-list-of-string (input "groups"))) (clojure.core/contains? input "pendingChange") (clojure.core/assoc :pending-change (deser-change-type (input "pendingChange")))))

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper1379445 input] (clojure.core/let [rawinput1379444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379446 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1379448 input] (clojure.core/let [rawinput1379447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379449 {"errorAttribute" (rawinput1379447 "errorAttribute"), "message" (rawinput1379447 "message")}] (clojure.core/cond-> {} (letvar1379449 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379449 ["errorAttribute"]))) (letvar1379449 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379449 ["message"])))))))

(clojure.core/defn- response-unauthorized-exception ([input] (response-unauthorized-exception nil input)) ([resultWrapper1379451 input] (clojure.core/let [rawinput1379450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379452 {"errorAttribute" (rawinput1379450 "errorAttribute"), "message" (rawinput1379450 "message")}] (clojure.core/cond-> {} (letvar1379452 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379452 ["errorAttribute"]))) (letvar1379452 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379452 ["message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1379454 input] (clojure.core/let [rawinput1379453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379455 {"errorAttribute" (rawinput1379453 "errorAttribute"), "message" (rawinput1379453 "message")}] (clojure.core/cond-> {} (letvar1379455 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379455 ["errorAttribute"]))) (letvar1379455 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379455 ["message"])))))))

(clojure.core/defn- response-describe-broker-response ([input] (response-describe-broker-response nil input)) ([resultWrapper1379457 input] (clojure.core/let [rawinput1379456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379458 {"created" (rawinput1379456 "created"), "pendingEngineVersion" (rawinput1379456 "pendingEngineVersion"), "subnetIds" (rawinput1379456 "subnetIds"), "configurations" (rawinput1379456 "configurations"), "brokerInstances" (rawinput1379456 "brokerInstances"), "hostInstanceType" (rawinput1379456 "hostInstanceType"), "tags" (rawinput1379456 "tags"), "securityGroups" (rawinput1379456 "securityGroups"), "brokerArn" (rawinput1379456 "brokerArn"), "brokerId" (rawinput1379456 "brokerId"), "users" (rawinput1379456 "users"), "brokerName" (rawinput1379456 "brokerName"), "logs" (rawinput1379456 "logs"), "publiclyAccessible" (rawinput1379456 "publiclyAccessible"), "autoMinorVersionUpgrade" (rawinput1379456 "autoMinorVersionUpgrade"), "brokerState" (rawinput1379456 "brokerState"), "engineVersion" (rawinput1379456 "engineVersion"), "deploymentMode" (rawinput1379456 "deploymentMode"), "maintenanceWindowStartTime" (rawinput1379456 "maintenanceWindowStartTime"), "engineType" (rawinput1379456 "engineType")}] (clojure.core/cond-> {} (letvar1379458 "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (clojure.core/get-in letvar1379458 ["created"]))) (letvar1379458 "publiclyAccessible") (clojure.core/assoc :publicly-accessible (deser-boolean (clojure.core/get-in letvar1379458 ["publiclyAccessible"]))) (letvar1379458 "subnetIds") (clojure.core/assoc :subnet-ids (deser-list-of-string (clojure.core/get-in letvar1379458 ["subnetIds"]))) (letvar1379458 "maintenanceWindowStartTime") (clojure.core/assoc :maintenance-window-start-time (deser-weekly-start-time (clojure.core/get-in letvar1379458 ["maintenanceWindowStartTime"]))) (letvar1379458 "securityGroups") (clojure.core/assoc :security-groups (deser-list-of-string (clojure.core/get-in letvar1379458 ["securityGroups"]))) (letvar1379458 "autoMinorVersionUpgrade") (clojure.core/assoc :auto-minor-version-upgrade (deser-boolean (clojure.core/get-in letvar1379458 ["autoMinorVersionUpgrade"]))) (letvar1379458 "logs") (clojure.core/assoc :logs (deser-logs-summary (clojure.core/get-in letvar1379458 ["logs"]))) (letvar1379458 "configurations") (clojure.core/assoc :configurations (deser-configurations (clojure.core/get-in letvar1379458 ["configurations"]))) (letvar1379458 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1379458 ["tags"]))) (letvar1379458 "pendingEngineVersion") (clojure.core/assoc :pending-engine-version (deser-string (clojure.core/get-in letvar1379458 ["pendingEngineVersion"]))) (letvar1379458 "engineType") (clojure.core/assoc :engine-type (deser-engine-type (clojure.core/get-in letvar1379458 ["engineType"]))) (letvar1379458 "hostInstanceType") (clojure.core/assoc :host-instance-type (deser-string (clojure.core/get-in letvar1379458 ["hostInstanceType"]))) (letvar1379458 "brokerState") (clojure.core/assoc :broker-state (deser-broker-state (clojure.core/get-in letvar1379458 ["brokerState"]))) (letvar1379458 "engineVersion") (clojure.core/assoc :engine-version (deser-string (clojure.core/get-in letvar1379458 ["engineVersion"]))) (letvar1379458 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379458 ["brokerId"]))) (letvar1379458 "brokerArn") (clojure.core/assoc :broker-arn (deser-string (clojure.core/get-in letvar1379458 ["brokerArn"]))) (letvar1379458 "brokerInstances") (clojure.core/assoc :broker-instances (deser-list-of-broker-instance (clojure.core/get-in letvar1379458 ["brokerInstances"]))) (letvar1379458 "users") (clojure.core/assoc :users (deser-list-of-user-summary (clojure.core/get-in letvar1379458 ["users"]))) (letvar1379458 "deploymentMode") (clojure.core/assoc :deployment-mode (deser-deployment-mode (clojure.core/get-in letvar1379458 ["deploymentMode"]))) (letvar1379458 "brokerName") (clojure.core/assoc :broker-name (deser-string (clojure.core/get-in letvar1379458 ["brokerName"])))))))

(clojure.core/defn- response-list-configurations-response ([input] (response-list-configurations-response nil input)) ([resultWrapper1379460 input] (clojure.core/let [rawinput1379459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379461 {"configurations" (rawinput1379459 "configurations"), "maxResults" (rawinput1379459 "maxResults"), "nextToken" (rawinput1379459 "nextToken")}] (clojure.core/cond-> {} (letvar1379461 "configurations") (clojure.core/assoc :configurations (deser-list-of-configuration (clojure.core/get-in letvar1379461 ["configurations"]))) (letvar1379461 "maxResults") (clojure.core/assoc :max-results (deser-integer (clojure.core/get-in letvar1379461 ["maxResults"]))) (letvar1379461 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1379461 ["nextToken"])))))))

(clojure.core/defn- response-reboot-broker-response ([input] (response-reboot-broker-response nil input)) ([resultWrapper1379463 input] (clojure.core/let [rawinput1379462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379464 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1379466 input] (clojure.core/let [rawinput1379465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379467 {"errorAttribute" (rawinput1379465 "errorAttribute"), "message" (rawinput1379465 "message")}] (clojure.core/cond-> {} (letvar1379467 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379467 ["errorAttribute"]))) (letvar1379467 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379467 ["message"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1379469 input] (clojure.core/let [rawinput1379468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379470 {"tags" (rawinput1379468 "tags")}] (clojure.core/cond-> {} (letvar1379470 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1379470 ["tags"])))))))

(clojure.core/defn- response-create-broker-response ([input] (response-create-broker-response nil input)) ([resultWrapper1379472 input] (clojure.core/let [rawinput1379471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379473 {"brokerArn" (rawinput1379471 "brokerArn"), "brokerId" (rawinput1379471 "brokerId")}] (clojure.core/cond-> {} (letvar1379473 "brokerArn") (clojure.core/assoc :broker-arn (deser-string (clojure.core/get-in letvar1379473 ["brokerArn"]))) (letvar1379473 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379473 ["brokerId"])))))))

(clojure.core/defn- response-list-brokers-response ([input] (response-list-brokers-response nil input)) ([resultWrapper1379475 input] (clojure.core/let [rawinput1379474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379476 {"brokerSummaries" (rawinput1379474 "brokerSummaries"), "nextToken" (rawinput1379474 "nextToken")}] (clojure.core/cond-> {} (letvar1379476 "brokerSummaries") (clojure.core/assoc :broker-summaries (deser-list-of-broker-summary (clojure.core/get-in letvar1379476 ["brokerSummaries"]))) (letvar1379476 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1379476 ["nextToken"])))))))

(clojure.core/defn- response-update-configuration-response ([input] (response-update-configuration-response nil input)) ([resultWrapper1379478 input] (clojure.core/let [rawinput1379477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379479 {"arn" (rawinput1379477 "arn"), "created" (rawinput1379477 "created"), "id" (rawinput1379477 "id"), "latestRevision" (rawinput1379477 "latestRevision"), "name" (rawinput1379477 "name"), "warnings" (rawinput1379477 "warnings")}] (clojure.core/cond-> {} (letvar1379479 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1379479 ["arn"]))) (letvar1379479 "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (clojure.core/get-in letvar1379479 ["created"]))) (letvar1379479 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1379479 ["id"]))) (letvar1379479 "latestRevision") (clojure.core/assoc :latest-revision (deser-configuration-revision (clojure.core/get-in letvar1379479 ["latestRevision"]))) (letvar1379479 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1379479 ["name"]))) (letvar1379479 "warnings") (clojure.core/assoc :warnings (deser-list-of-sanitization-warning (clojure.core/get-in letvar1379479 ["warnings"])))))))

(clojure.core/defn- response-delete-broker-response ([input] (response-delete-broker-response nil input)) ([resultWrapper1379481 input] (clojure.core/let [rawinput1379480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379482 {"brokerId" (rawinput1379480 "brokerId")}] (clojure.core/cond-> {} (letvar1379482 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379482 ["brokerId"])))))))

(clojure.core/defn- response-update-user-response ([input] (response-update-user-response nil input)) ([resultWrapper1379484 input] (clojure.core/let [rawinput1379483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379485 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-user-response ([input] (response-delete-user-response nil input)) ([resultWrapper1379487 input] (clojure.core/let [rawinput1379486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379488 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-user-response ([input] (response-describe-user-response nil input)) ([resultWrapper1379490 input] (clojure.core/let [rawinput1379489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379491 {"brokerId" (rawinput1379489 "brokerId"), "consoleAccess" (rawinput1379489 "consoleAccess"), "groups" (rawinput1379489 "groups"), "pending" (rawinput1379489 "pending"), "username" (rawinput1379489 "username")}] (clojure.core/cond-> {} (letvar1379491 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379491 ["brokerId"]))) (letvar1379491 "consoleAccess") (clojure.core/assoc :console-access (deser-boolean (clojure.core/get-in letvar1379491 ["consoleAccess"]))) (letvar1379491 "groups") (clojure.core/assoc :groups (deser-list-of-string (clojure.core/get-in letvar1379491 ["groups"]))) (letvar1379491 "pending") (clojure.core/assoc :pending (deser-user-pending-changes (clojure.core/get-in letvar1379491 ["pending"]))) (letvar1379491 "username") (clojure.core/assoc :username (deser-string (clojure.core/get-in letvar1379491 ["username"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1379493 input] (clojure.core/let [rawinput1379492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379494 {"errorAttribute" (rawinput1379492 "errorAttribute"), "message" (rawinput1379492 "message")}] (clojure.core/cond-> {} (letvar1379494 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379494 ["errorAttribute"]))) (letvar1379494 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379494 ["message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1379496 input] (clojure.core/let [rawinput1379495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379497 {"errorAttribute" (rawinput1379495 "errorAttribute"), "message" (rawinput1379495 "message")}] (clojure.core/cond-> {} (letvar1379497 "errorAttribute") (clojure.core/assoc :error-attribute (deser-string (clojure.core/get-in letvar1379497 ["errorAttribute"]))) (letvar1379497 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1379497 ["message"])))))))

(clojure.core/defn- response-update-broker-response ([input] (response-update-broker-response nil input)) ([resultWrapper1379499 input] (clojure.core/let [rawinput1379498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379500 {"autoMinorVersionUpgrade" (rawinput1379498 "autoMinorVersionUpgrade"), "brokerId" (rawinput1379498 "brokerId"), "configuration" (rawinput1379498 "configuration"), "engineVersion" (rawinput1379498 "engineVersion"), "logs" (rawinput1379498 "logs")}] (clojure.core/cond-> {} (letvar1379500 "autoMinorVersionUpgrade") (clojure.core/assoc :auto-minor-version-upgrade (deser-boolean (clojure.core/get-in letvar1379500 ["autoMinorVersionUpgrade"]))) (letvar1379500 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379500 ["brokerId"]))) (letvar1379500 "configuration") (clojure.core/assoc :configuration (deser-configuration-id (clojure.core/get-in letvar1379500 ["configuration"]))) (letvar1379500 "engineVersion") (clojure.core/assoc :engine-version (deser-string (clojure.core/get-in letvar1379500 ["engineVersion"]))) (letvar1379500 "logs") (clojure.core/assoc :logs (deser-logs (clojure.core/get-in letvar1379500 ["logs"])))))))

(clojure.core/defn- response-describe-configuration-revision-response ([input] (response-describe-configuration-revision-response nil input)) ([resultWrapper1379502 input] (clojure.core/let [rawinput1379501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379503 {"configurationId" (rawinput1379501 "configurationId"), "created" (rawinput1379501 "created"), "data" (rawinput1379501 "data"), "description" (rawinput1379501 "description")}] (clojure.core/cond-> {} (letvar1379503 "configurationId") (clojure.core/assoc :configuration-id (deser-string (clojure.core/get-in letvar1379503 ["configurationId"]))) (letvar1379503 "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (clojure.core/get-in letvar1379503 ["created"]))) (letvar1379503 "data") (clojure.core/assoc :data (deser-string (clojure.core/get-in letvar1379503 ["data"]))) (letvar1379503 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1379503 ["description"])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper1379505 input] (clojure.core/let [rawinput1379504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379506 {"brokerId" (rawinput1379504 "brokerId"), "maxResults" (rawinput1379504 "maxResults"), "nextToken" (rawinput1379504 "nextToken"), "users" (rawinput1379504 "users")}] (clojure.core/cond-> {} (letvar1379506 "brokerId") (clojure.core/assoc :broker-id (deser-string (clojure.core/get-in letvar1379506 ["brokerId"]))) (letvar1379506 "maxResults") (clojure.core/assoc :max-results (deser-integer-min-5-max-100 (clojure.core/get-in letvar1379506 ["maxResults"]))) (letvar1379506 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1379506 ["nextToken"]))) (letvar1379506 "users") (clojure.core/assoc :users (deser-list-of-user-summary (clojure.core/get-in letvar1379506 ["users"])))))))

(clojure.core/defn- response-list-configuration-revisions-response ([input] (response-list-configuration-revisions-response nil input)) ([resultWrapper1379508 input] (clojure.core/let [rawinput1379507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379509 {"configurationId" (rawinput1379507 "configurationId"), "maxResults" (rawinput1379507 "maxResults"), "nextToken" (rawinput1379507 "nextToken"), "revisions" (rawinput1379507 "revisions")}] (clojure.core/cond-> {} (letvar1379509 "configurationId") (clojure.core/assoc :configuration-id (deser-string (clojure.core/get-in letvar1379509 ["configurationId"]))) (letvar1379509 "maxResults") (clojure.core/assoc :max-results (deser-integer (clojure.core/get-in letvar1379509 ["maxResults"]))) (letvar1379509 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1379509 ["nextToken"]))) (letvar1379509 "revisions") (clojure.core/assoc :revisions (deser-list-of-configuration-revision (clojure.core/get-in letvar1379509 ["revisions"])))))))

(clojure.core/defn- response-describe-configuration-response ([input] (response-describe-configuration-response nil input)) ([resultWrapper1379511 input] (clojure.core/let [rawinput1379510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379512 {"latestRevision" (rawinput1379510 "latestRevision"), "created" (rawinput1379510 "created"), "arn" (rawinput1379510 "arn"), "tags" (rawinput1379510 "tags"), "id" (rawinput1379510 "id"), "name" (rawinput1379510 "name"), "engineVersion" (rawinput1379510 "engineVersion"), "engineType" (rawinput1379510 "engineType"), "description" (rawinput1379510 "description")}] (clojure.core/cond-> {} (letvar1379512 "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (clojure.core/get-in letvar1379512 ["created"]))) (letvar1379512 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar1379512 ["tags"]))) (letvar1379512 "engineType") (clojure.core/assoc :engine-type (deser-engine-type (clojure.core/get-in letvar1379512 ["engineType"]))) (letvar1379512 "engineVersion") (clojure.core/assoc :engine-version (deser-string (clojure.core/get-in letvar1379512 ["engineVersion"]))) (letvar1379512 "description") (clojure.core/assoc :description (deser-string (clojure.core/get-in letvar1379512 ["description"]))) (letvar1379512 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1379512 ["arn"]))) (letvar1379512 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1379512 ["name"]))) (letvar1379512 "latestRevision") (clojure.core/assoc :latest-revision (deser-configuration-revision (clojure.core/get-in letvar1379512 ["latestRevision"]))) (letvar1379512 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1379512 ["id"])))))))

(clojure.core/defn- response-create-configuration-response ([input] (response-create-configuration-response nil input)) ([resultWrapper1379514 input] (clojure.core/let [rawinput1379513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1379515 {"arn" (rawinput1379513 "arn"), "created" (rawinput1379513 "created"), "id" (rawinput1379513 "id"), "latestRevision" (rawinput1379513 "latestRevision"), "name" (rawinput1379513 "name")}] (clojure.core/cond-> {} (letvar1379515 "arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1379515 ["arn"]))) (letvar1379515 "created") (clojure.core/assoc :created (deser-timestamp-iso-8601 (clojure.core/get-in letvar1379515 ["created"]))) (letvar1379515 "id") (clojure.core/assoc :id (deser-string (clojure.core/get-in letvar1379515 ["id"]))) (letvar1379515 "latestRevision") (clojure.core/assoc :latest-revision (deser-configuration-revision (clojure.core/get-in letvar1379515 ["latestRevision"]))) (letvar1379515 "name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1379515 ["name"])))))))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-configuration-revision (clojure.spec.alpha/coll-of :portkey.aws.mq/configuration-revision))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-broker-summary (clojure.spec.alpha/coll-of :portkey.aws.mq/broker-summary))

(clojure.spec.alpha/def :portkey.aws.mq.list-brokers-request/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-brokers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/max-results :portkey.aws.mq.list-brokers-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.internal-server-error-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.internal-server-error-exception/error-attribute :portkey.aws.mq.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq.unauthorized-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/unauthorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.unauthorized-exception/error-attribute :portkey.aws.mq.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-sanitization-warning (clojure.spec.alpha/coll-of :portkey.aws.mq/sanitization-warning))

(clojure.spec.alpha/def :portkey.aws.mq.update-user-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-request/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-request/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-request/password (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-request/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.update-user-request/username :portkey.aws.mq.update-user-request/broker-id] :opt-un [:portkey.aws.mq.update-user-request/console-access :portkey.aws.mq.update-user-request/groups :portkey.aws.mq.update-user-request/password]))

(clojure.spec.alpha/def :portkey.aws.mq/change-type #{"DELETE" :create :update :delete "UPDATE" "CREATE"})

(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/publicly-accessible (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/maintenance-window-start-time (clojure.spec.alpha/and :portkey.aws.mq/weekly-start-time))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/security-groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-request/publicly-accessible :portkey.aws.mq.create-broker-request/subnet-ids :portkey.aws.mq.create-broker-request/maintenance-window-start-time :portkey.aws.mq.create-broker-request/security-groups :portkey.aws.mq.create-broker-request/creator-request-id :portkey.aws.mq.create-broker-request/auto-minor-version-upgrade :portkey.aws.mq/logs :portkey.aws.mq.create-broker-request/tags :portkey.aws.mq/engine-type :portkey.aws.mq.create-broker-request/host-instance-type :portkey.aws.mq.create-broker-request/engine-version :portkey.aws.mq.create-broker-request/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.create-broker-request/broker-name :portkey.aws.mq.create-broker-request/configuration]))

(clojure.spec.alpha/def :portkey.aws.mq.list-users-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-request/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-users-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.list-users-request/broker-id] :opt-un [:portkey.aws.mq/max-results :portkey.aws.mq.list-users-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq.update-broker-request/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-request/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-request/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-broker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.update-broker-request/broker-id] :opt-un [:portkey.aws.mq.update-broker-request/auto-minor-version-upgrade :portkey.aws.mq.update-broker-request/configuration :portkey.aws.mq.update-broker-request/engine-version :portkey.aws.mq/logs]))

(clojure.spec.alpha/def :portkey.aws.mq.bad-request-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.bad-request-exception/error-attribute :portkey.aws.mq.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/publicly-accessible (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/subnet-ids (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/maintenance-window-start-time (clojure.spec.alpha/and :portkey.aws.mq/weekly-start-time))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/security-groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/logs (clojure.spec.alpha/and :portkey.aws.mq/logs-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/pending-engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-instances (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-instance))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-broker-response/created :portkey.aws.mq.describe-broker-response/publicly-accessible :portkey.aws.mq.describe-broker-response/subnet-ids :portkey.aws.mq.describe-broker-response/maintenance-window-start-time :portkey.aws.mq.describe-broker-response/security-groups :portkey.aws.mq.describe-broker-response/auto-minor-version-upgrade :portkey.aws.mq.describe-broker-response/logs :portkey.aws.mq/configurations :portkey.aws.mq.describe-broker-response/tags :portkey.aws.mq.describe-broker-response/pending-engine-version :portkey.aws.mq/engine-type :portkey.aws.mq.describe-broker-response/host-instance-type :portkey.aws.mq/broker-state :portkey.aws.mq.describe-broker-response/engine-version :portkey.aws.mq.describe-broker-response/broker-id :portkey.aws.mq.describe-broker-response/broker-arn :portkey.aws.mq.describe-broker-response/broker-instances :portkey.aws.mq.describe-broker-response/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.describe-broker-response/broker-name]))

(clojure.spec.alpha/def :portkey.aws.mq/day-of-week #{"WEDNESDAY" :saturday "SUNDAY" "THURSDAY" :tuesday :wednesday :sunday "TUESDAY" :friday "FRIDAY" "SATURDAY" :monday "MONDAY" :thursday})

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-request/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-request/configuration-revision (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-revision-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.describe-configuration-revision-request/configuration-revision :portkey.aws.mq.describe-configuration-revision-request/configuration-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-response/configurations (clojure.spec.alpha/and :portkey.aws.mq/list-of-configuration))
(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-response/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-configurations-response/configurations :portkey.aws.mq.list-configurations-response/max-results :portkey.aws.mq.list-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq/reboot-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-output/configurations (clojure.spec.alpha/and :portkey.aws.mq/list-of-configuration))
(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-output/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-output/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-configurations-output/configurations :portkey.aws.mq.list-configurations-output/max-results :portkey.aws.mq.list-configurations-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq.forbidden-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.forbidden-exception/error-attribute :portkey.aws.mq.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq.list-tags-response/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-tags-response/tags]))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-configuration (clojure.spec.alpha/coll-of :portkey.aws.mq/configuration))

(clojure.spec.alpha/def :portkey.aws.mq/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-request/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.describe-configuration-request/configuration-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.logs/audit (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.logs/general (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq/logs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.logs/audit :portkey.aws.mq.logs/general]))

(clojure.spec.alpha/def :portkey.aws.mq.list-users-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-output/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer-min-5-max-100))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-output/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-output/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq/list-users-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-users-output/broker-id :portkey.aws.mq.list-users-output/max-results :portkey.aws.mq.list-users-output/next-token :portkey.aws.mq.list-users-output/users]))

(clojure.spec.alpha/def :portkey.aws.mq.delete-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.delete-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.delete-tags-request/tag-keys :portkey.aws.mq.delete-tags-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.create-broker-response/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-response/broker-arn :portkey.aws.mq.create-broker-response/broker-id]))

(clojure.spec.alpha/def :portkey.aws.mq/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mq.configurations/current (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.configurations/history (clojure.spec.alpha/and :portkey.aws.mq/list-of-configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.configurations/pending (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq/configurations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.configurations/current :portkey.aws.mq.configurations/history :portkey.aws.mq.configurations/pending]))

(clojure.spec.alpha/def :portkey.aws.mq.configuration-revision/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.configuration-revision/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration-revision/revision (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq/configuration-revision (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.configuration-revision/created :portkey.aws.mq.configuration-revision/description :portkey.aws.mq.configuration-revision/revision]))

(clojure.spec.alpha/def :portkey.aws.mq.configuration-id/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration-id/revision (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq/configuration-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.configuration-id/id :portkey.aws.mq.configuration-id/revision]))

(clojure.spec.alpha/def :portkey.aws.mq.list-brokers-response/broker-summaries (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-summary))
(clojure.spec.alpha/def :portkey.aws.mq.list-brokers-response/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-brokers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-brokers-response/broker-summaries :portkey.aws.mq.list-brokers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq.tags/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.tags/tags]))

(clojure.spec.alpha/def :portkey.aws.mq.delete-broker-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-broker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.delete-broker-request/broker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-response/warnings (clojure.spec.alpha/and :portkey.aws.mq/list-of-sanitization-warning))
(clojure.spec.alpha/def :portkey.aws.mq/update-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-configuration-response/arn :portkey.aws.mq.update-configuration-response/created :portkey.aws.mq.update-configuration-response/id :portkey.aws.mq.update-configuration-response/latest-revision :portkey.aws.mq.update-configuration-response/name :portkey.aws.mq.update-configuration-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.mq.broker-instance/console-url (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.broker-instance/endpoints (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.broker-instance/ip-address (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/broker-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.broker-instance/console-url :portkey.aws.mq.broker-instance/endpoints :portkey.aws.mq.broker-instance/ip-address]))

(clojure.spec.alpha/def :portkey.aws.mq.user/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.user/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.user/password (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.user/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.user/console-access :portkey.aws.mq.user/groups :portkey.aws.mq.user/password :portkey.aws.mq.user/username]))

(clojure.spec.alpha/def :portkey.aws.mq.update-user-input/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-input/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.update-user-input/password (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-user-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-user-input/console-access :portkey.aws.mq.update-user-input/groups :portkey.aws.mq.update-user-input/password]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/publicly-accessible (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/subnet-ids (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/maintenance-window-start-time (clojure.spec.alpha/and :portkey.aws.mq/weekly-start-time))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/security-groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/logs (clojure.spec.alpha/and :portkey.aws.mq/logs-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/pending-engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-instances (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-instance))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-broker-output/created :portkey.aws.mq.describe-broker-output/publicly-accessible :portkey.aws.mq.describe-broker-output/subnet-ids :portkey.aws.mq.describe-broker-output/maintenance-window-start-time :portkey.aws.mq.describe-broker-output/security-groups :portkey.aws.mq.describe-broker-output/auto-minor-version-upgrade :portkey.aws.mq.describe-broker-output/logs :portkey.aws.mq/configurations :portkey.aws.mq.describe-broker-output/tags :portkey.aws.mq.describe-broker-output/pending-engine-version :portkey.aws.mq/engine-type :portkey.aws.mq.describe-broker-output/host-instance-type :portkey.aws.mq/broker-state :portkey.aws.mq.describe-broker-output/engine-version :portkey.aws.mq.describe-broker-output/broker-id :portkey.aws.mq.describe-broker-output/broker-arn :portkey.aws.mq.describe-broker-output/broker-instances :portkey.aws.mq.describe-broker-output/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.describe-broker-output/broker-name]))

(clojure.spec.alpha/def :portkey.aws.mq.weekly-start-time/time-of-day (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.weekly-start-time/time-zone (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/weekly-start-time (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/day-of-week :portkey.aws.mq.weekly-start-time/time-of-day :portkey.aws.mq.weekly-start-time/time-zone]))

(clojure.spec.alpha/def :portkey.aws.mq.delete-broker-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.delete-broker-response/broker-id]))

(clojure.spec.alpha/def :portkey.aws.mq.create-broker-output/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-output/broker-arn :portkey.aws.mq.create-broker-output/broker-id]))

(clojure.spec.alpha/def :portkey.aws.mq.user-summary/pending-change (clojure.spec.alpha/and :portkey.aws.mq/change-type))
(clojure.spec.alpha/def :portkey.aws.mq.user-summary/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/user-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.user-summary/pending-change :portkey.aws.mq.user-summary/username]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-user-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-output/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-output/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-output/pending (clojure.spec.alpha/and :portkey.aws.mq/user-pending-changes))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-output/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-user-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-user-output/broker-id :portkey.aws.mq.describe-user-output/console-access :portkey.aws.mq.describe-user-output/groups :portkey.aws.mq.describe-user-output/pending :portkey.aws.mq.describe-user-output/username]))

(clojure.spec.alpha/def :portkey.aws.mq.logs-summary/audit (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.logs-summary/audit-log-group (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.logs-summary/general (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.logs-summary/general-log-group (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.logs-summary/pending (clojure.spec.alpha/and :portkey.aws.mq/pending-logs))
(clojure.spec.alpha/def :portkey.aws.mq/logs-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.logs-summary/audit :portkey.aws.mq.logs-summary/audit-log-group :portkey.aws.mq.logs-summary/general :portkey.aws.mq.logs-summary/general-log-group :portkey.aws.mq.logs-summary/pending]))

(clojure.spec.alpha/def :portkey.aws.mq.list-brokers-output/broker-summaries (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-summary))
(clojure.spec.alpha/def :portkey.aws.mq.list-brokers-output/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-brokers-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-brokers-output/broker-summaries :portkey.aws.mq.list-brokers-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq/update-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/delete-user-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/engine-type #{:activemq "ACTIVEMQ"})

(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-request/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-request/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-configuration-revisions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.list-configuration-revisions-request/configuration-id] :opt-un [:portkey.aws.mq/max-results :portkey.aws.mq.list-configuration-revisions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-output/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-output/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-output/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-output/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-output/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-configuration-output/arn :portkey.aws.mq.create-configuration-output/created :portkey.aws.mq.create-configuration-output/id :portkey.aws.mq.create-configuration-output/latest-revision :portkey.aws.mq.create-configuration-output/name]))

(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-request/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-request/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-request/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/engine-type :portkey.aws.mq.create-configuration-request/engine-version :portkey.aws.mq.create-configuration-request/name :portkey.aws.mq.create-configuration-request/tags]))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-broker-instance (clojure.spec.alpha/coll-of :portkey.aws.mq/broker-instance))

(clojure.spec.alpha/def :portkey.aws.mq.reboot-broker-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/reboot-broker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.reboot-broker-request/broker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/broker-state #{:deletion-in-progress :running "REBOOT_IN_PROGRESS" "DELETION_IN_PROGRESS" :reboot-in-progress :creation-in-progress "CREATION_IN_PROGRESS" :creation-failed "CREATION_FAILED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.mq.describe-user-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-response/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-response/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-response/pending (clojure.spec.alpha/and :portkey.aws.mq/user-pending-changes))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-response/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-user-response/broker-id :portkey.aws.mq.describe-user-response/console-access :portkey.aws.mq.describe-user-response/groups :portkey.aws.mq.describe-user-response/pending :portkey.aws.mq.describe-user-response/username]))

(clojure.spec.alpha/def :portkey.aws.mq/integer-min-5-max-100 (clojure.spec.alpha/int-in 5 100))

(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-output/warnings (clojure.spec.alpha/and :portkey.aws.mq/list-of-sanitization-warning))
(clojure.spec.alpha/def :portkey.aws.mq/update-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-configuration-output/arn :portkey.aws.mq.update-configuration-output/created :portkey.aws.mq.update-configuration-output/id :portkey.aws.mq.update-configuration-output/latest-revision :portkey.aws.mq.update-configuration-output/name :portkey.aws.mq.update-configuration-output/warnings]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-user-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-user-request/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.describe-user-request/username :portkey.aws.mq.describe-user-request/broker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.mq/string))

(clojure.spec.alpha/def :portkey.aws.mq.create-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-tags-request/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.create-tags-request/resource-arn] :opt-un [:portkey.aws.mq.create-tags-request/tags]))

(clojure.spec.alpha/def :portkey.aws.mq/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mq/list-of-configuration-id (clojure.spec.alpha/coll-of :portkey.aws.mq/configuration-id))

(clojure.spec.alpha/def :portkey.aws.mq.conflict-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.conflict-exception/error-attribute :portkey.aws.mq.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq.not-found-exception/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.not-found-exception/error-attribute :portkey.aws.mq.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.mq.update-broker-input/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-input/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-input/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-broker-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-broker-input/auto-minor-version-upgrade :portkey.aws.mq.update-broker-input/configuration :portkey.aws.mq.update-broker-input/engine-version :portkey.aws.mq/logs]))

(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-input/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-input/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-input/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/engine-type :portkey.aws.mq.create-configuration-input/engine-version :portkey.aws.mq.create-configuration-input/name :portkey.aws.mq.create-configuration-input/tags]))

(clojure.spec.alpha/def :portkey.aws.mq.broker-summary/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.broker-summary/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.broker-summary/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.broker-summary/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.broker-summary/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/broker-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.broker-summary/broker-arn :portkey.aws.mq.broker-summary/broker-id :portkey.aws.mq.broker-summary/broker-name :portkey.aws.mq/broker-state :portkey.aws.mq.broker-summary/created :portkey.aws.mq/deployment-mode :portkey.aws.mq.broker-summary/host-instance-type]))

(clojure.spec.alpha/def :portkey.aws.mq.update-broker-output/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-output/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-output/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-broker-output/auto-minor-version-upgrade :portkey.aws.mq.update-broker-output/broker-id :portkey.aws.mq.update-broker-output/configuration :portkey.aws.mq.update-broker-output/engine-version :portkey.aws.mq/logs]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-output/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-output/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-output/data (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-output/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-revision-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-configuration-revision-output/configuration-id :portkey.aws.mq.describe-configuration-revision-output/created :portkey.aws.mq.describe-configuration-revision-output/data :portkey.aws.mq.describe-configuration-revision-output/description]))

(clojure.spec.alpha/def :portkey.aws.mq/deployment-mode #{:active-standby-multi-az "SINGLE_INSTANCE" :single-instance "ACTIVE_STANDBY_MULTI_AZ"})

(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-output/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-output/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-output/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-output/revisions (clojure.spec.alpha/and :portkey.aws.mq/list-of-configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq/list-configuration-revisions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-configuration-revisions-output/configuration-id :portkey.aws.mq.list-configuration-revisions-output/max-results :portkey.aws.mq.list-configuration-revisions-output/next-token :portkey.aws.mq.list-configuration-revisions-output/revisions]))

(clojure.spec.alpha/def :portkey.aws.mq.create-user-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-request/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-request/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-request/password (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-request/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.create-user-request/username :portkey.aws.mq.create-user-request/broker-id] :opt-un [:portkey.aws.mq.create-user-request/console-access :portkey.aws.mq.create-user-request/groups :portkey.aws.mq.create-user-request/password]))

(clojure.spec.alpha/def :portkey.aws.mq/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mq/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-broker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.describe-broker-request/broker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-user-summary (clojure.spec.alpha/coll-of :portkey.aws.mq/user-summary))

(clojure.spec.alpha/def :portkey.aws.mq.create-user-input/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-input/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-user-input/password (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-user-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-user-input/console-access :portkey.aws.mq.create-user-input/groups :portkey.aws.mq.create-user-input/password]))

(clojure.spec.alpha/def :portkey.aws.mq/list-of-user (clojure.spec.alpha/coll-of :portkey.aws.mq/user))

(clojure.spec.alpha/def :portkey.aws.mq.delete-user-request/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.delete-user-request/username (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.delete-user-request/username :portkey.aws.mq.delete-user-request/broker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mq/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mq.update-broker-response/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-response/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq.update-broker-response/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-broker-response/auto-minor-version-upgrade :portkey.aws.mq.update-broker-response/broker-id :portkey.aws.mq.update-broker-response/configuration :portkey.aws.mq.update-broker-response/engine-version :portkey.aws.mq/logs]))

(clojure.spec.alpha/def :portkey.aws.mq.error/error-attribute (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.error/message (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.error/error-attribute :portkey.aws.mq.error/message]))

(clojure.spec.alpha/def :portkey.aws.mq/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mq/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mq.pending-logs/audit (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.pending-logs/general (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq/pending-logs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.pending-logs/audit :portkey.aws.mq.pending-logs/general]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-response/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-response/data (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-revision-response/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-revision-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-configuration-revision-response/configuration-id :portkey.aws.mq.describe-configuration-revision-response/created :portkey.aws.mq.describe-configuration-revision-response/data :portkey.aws.mq.describe-configuration-revision-response/description]))

(clojure.spec.alpha/def :portkey.aws.mq.list-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/max-results :portkey.aws.mq.list-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/publicly-accessible (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/subnet-ids (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/maintenance-window-start-time (clojure.spec.alpha/and :portkey.aws.mq/weekly-start-time))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/security-groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/creator-request-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/auto-minor-version-upgrade (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-input/publicly-accessible :portkey.aws.mq.create-broker-input/subnet-ids :portkey.aws.mq.create-broker-input/maintenance-window-start-time :portkey.aws.mq.create-broker-input/security-groups :portkey.aws.mq.create-broker-input/creator-request-id :portkey.aws.mq.create-broker-input/auto-minor-version-upgrade :portkey.aws.mq/logs :portkey.aws.mq.create-broker-input/tags :portkey.aws.mq/engine-type :portkey.aws.mq.create-broker-input/host-instance-type :portkey.aws.mq.create-broker-input/engine-version :portkey.aws.mq.create-broker-input/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.create-broker-input/broker-name :portkey.aws.mq.create-broker-input/configuration]))

(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/attribute-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/element-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/reason (clojure.spec.alpha/and :portkey.aws.mq/sanitization-warning-reason))
(clojure.spec.alpha/def :portkey.aws.mq/sanitization-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.sanitization-warning/attribute-name :portkey.aws.mq.sanitization-warning/element-name :portkey.aws.mq.sanitization-warning/reason]))

(clojure.spec.alpha/def :portkey.aws.mq.configuration/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.configuration/created :portkey.aws.mq.configuration/tags :portkey.aws.mq/engine-type :portkey.aws.mq.configuration/engine-version :portkey.aws.mq.configuration/description :portkey.aws.mq.configuration/arn :portkey.aws.mq.configuration/name :portkey.aws.mq.configuration/latest-revision :portkey.aws.mq.configuration/id]))

(clojure.spec.alpha/def :portkey.aws.mq.list-users-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-response/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer-min-5-max-100))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-response/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-users-response/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq/list-users-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-users-response/broker-id :portkey.aws.mq.list-users-response/max-results :portkey.aws.mq.list-users-response/next-token :portkey.aws.mq.list-users-response/users]))

(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-request/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-request/data (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-request/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.update-configuration-request/configuration-id] :opt-un [:portkey.aws.mq.update-configuration-request/data :portkey.aws.mq.update-configuration-request/description]))

(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-response/configuration-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-response/max-results (clojure.spec.alpha/and :portkey.aws.mq/integer))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-response/next-token (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.list-configuration-revisions-response/revisions (clojure.spec.alpha/and :portkey.aws.mq/list-of-configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq/list-configuration-revisions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.list-configuration-revisions-response/configuration-id :portkey.aws.mq.list-configuration-revisions-response/max-results :portkey.aws.mq.list-configuration-revisions-response/next-token :portkey.aws.mq.list-configuration-revisions-response/revisions]))

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/tags (clojure.spec.alpha/and :portkey.aws.mq/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-configuration-response/created :portkey.aws.mq.describe-configuration-response/tags :portkey.aws.mq/engine-type :portkey.aws.mq.describe-configuration-response/engine-version :portkey.aws.mq.describe-configuration-response/description :portkey.aws.mq.describe-configuration-response/arn :portkey.aws.mq.describe-configuration-response/name :portkey.aws.mq.describe-configuration-response/latest-revision :portkey.aws.mq.describe-configuration-response/id]))

(clojure.spec.alpha/def :portkey.aws.mq.delete-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.delete-broker-output/broker-id]))

(clojure.spec.alpha/def :portkey.aws.mq/map-of-string (clojure.spec.alpha/map-of :portkey.aws.mq/string :portkey.aws.mq/string))

(clojure.spec.alpha/def :portkey.aws.mq/sanitization-warning-reason #{"DISALLOWED_ATTRIBUTE_REMOVED" "INVALID_ATTRIBUTE_VALUE_REMOVED" :disallowed-attribute-removed :disallowed-element-removed :invalid-attribute-value-removed "DISALLOWED_ELEMENT_REMOVED"})

(clojure.spec.alpha/def :portkey.aws.mq.user-pending-changes/console-access (clojure.spec.alpha/and :portkey.aws.mq/boolean))
(clojure.spec.alpha/def :portkey.aws.mq.user-pending-changes/groups (clojure.spec.alpha/and :portkey.aws.mq/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mq.user-pending-changes/pending-change (clojure.spec.alpha/and :portkey.aws.mq/change-type))
(clojure.spec.alpha/def :portkey.aws.mq/user-pending-changes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.user-pending-changes/console-access :portkey.aws.mq.user-pending-changes/groups :portkey.aws.mq.user-pending-changes/pending-change]))

(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-input/data (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.update-configuration-input/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/update-configuration-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.update-configuration-input/data :portkey.aws.mq.update-configuration-input/description]))

(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-response/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-response/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-response/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.create-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-configuration-response/arn :portkey.aws.mq.create-configuration-response/created :portkey.aws.mq.create-configuration-response/id :portkey.aws.mq.create-configuration-response/latest-revision :portkey.aws.mq.create-configuration-response/name]))

(clojure.spec.alpha/def :portkey.aws.mq.list-tags-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mq.list-tags-request/resource-arn] :opt-un []))

(clojure.core/defn delete-broker "Deletes a broker. Note: This API is asynchronous." ([delete-broker-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-broker-request delete-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/delete-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/delete-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBroker", :http.request.configuration/output-deser-fn response-delete-broker-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/delete-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/delete-broker-response))

(clojure.core/defn create-configuration "Creates a new configuration for the specified configuration name. Amazon MQ uses\nthe default configuration (the engine type and version)." ([] (create-configuration {})) ([create-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-configuration-request create-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/create-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConfiguration", :http.request.configuration/output-deser-fn response-create-configuration-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-configuration :args (clojure.spec.alpha/? :portkey.aws.mq/create-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-configuration-response))

(clojure.core/defn describe-broker "Returns information about the specified broker." ([describe-broker-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-broker-request describe-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/describe-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBroker", :http.request.configuration/output-deser-fn response-describe-broker-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-broker-response))

(clojure.core/defn delete-tags "Remove a tag from a resource." ([delete-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/tags/{resource-arn}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/delete-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.mq/delete-tags-request) :ret clojure.core/true?)

(clojure.core/defn describe-configuration-revision "Returns the specified configuration revision for the specified configuration." ([describe-configuration-revision-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configuration-revision-request describe-configuration-revision-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/describe-configuration-revision-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}/revisions/{configuration-revision}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-configuration-revision-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConfigurationRevision", :http.request.configuration/output-deser-fn response-describe-configuration-revision-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-revision :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-configuration-revision-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-configuration-revision-response))

(clojure.core/defn create-tags "Add a tag to a resource." ([create-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/tags/{resource-arn}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.mq/create-tags-request) :ret clojure.core/true?)

(clojure.core/defn list-tags "Lists tags for a resource." ([list-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/tags/{resource-arn}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.mq/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-tags-response))

(clojure.core/defn list-configurations "Returns a list of all configurations." ([] (list-configurations {})) ([list-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-configurations-request list-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/list-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConfigurations", :http.request.configuration/output-deser-fn response-list-configurations-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-configurations :args (clojure.spec.alpha/? :portkey.aws.mq/list-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-configurations-response))

(clojure.core/defn delete-user "Deletes an ActiveMQ user." ([delete-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/delete-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn response-delete-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/delete-user-response))

(clojure.core/defn update-broker "Adds a pending configuration change to a broker." ([update-broker-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-broker-request update-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/update-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBroker", :http.request.configuration/output-deser-fn response-update-broker-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-broker-response))

(clojure.core/defn create-user "Creates an ActiveMQ user." ([create-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/create-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-user-response))

(clojure.core/defn list-configuration-revisions "Returns a list of all revisions for the specified configuration." ([list-configuration-revisions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-configuration-revisions-request list-configuration-revisions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/list-configuration-revisions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}/revisions", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-configuration-revisions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConfigurationRevisions", :http.request.configuration/output-deser-fn response-list-configuration-revisions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-configuration-revisions :args (clojure.spec.alpha/tuple :portkey.aws.mq/list-configuration-revisions-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-configuration-revisions-response))

(clojure.core/defn create-broker "Creates a broker. Note: This API is asynchronous." ([] (create-broker {})) ([create-broker-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-broker-request create-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/create-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBroker", :http.request.configuration/output-deser-fn response-create-broker-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "UnauthorizedException" :portkey.aws.mq/unauthorized-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-broker :args (clojure.spec.alpha/? :portkey.aws.mq/create-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-broker-response))

(clojure.core/defn list-brokers "Returns a list of all brokers." ([] (list-brokers {})) ([list-brokers-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-brokers-request list-brokers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/list-brokers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-brokers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListBrokers", :http.request.configuration/output-deser-fn response-list-brokers-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-brokers :args (clojure.spec.alpha/? :portkey.aws.mq/list-brokers-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-brokers-response))

(clojure.core/defn reboot-broker "Reboots a broker. Note: This API is asynchronous." ([reboot-broker-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-reboot-broker-request reboot-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/reboot-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/reboot", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/reboot-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RebootBroker", :http.request.configuration/output-deser-fn response-reboot-broker-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef reboot-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/reboot-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/reboot-broker-response))

(clojure.core/defn list-users "Returns a list of all ActiveMQ users." ([list-users-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.mq/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-users-response))

(clojure.core/defn describe-configuration "Returns information about the specified configuration." ([describe-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configuration-request describe-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/describe-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConfiguration", :http.request.configuration/output-deser-fn response-describe-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-configuration-response))

(clojure.core/defn update-user "Updates the information for an ActiveMQ user." ([update-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn response-update-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-user-response))

(clojure.core/defn update-configuration "Updates the specified configuration." ([update-configuration-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-configuration-request update-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/update-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConfiguration", :http.request.configuration/output-deser-fn response-update-configuration-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-configuration-response))

(clojure.core/defn describe-user "Returns information about an ActiveMQ user." ([describe-user-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mq/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUser", :http.request.configuration/output-deser-fn response-describe-user-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-user-response))
