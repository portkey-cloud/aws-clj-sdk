(ns portkey.aws.mq (:require [portkey.aws]))

(def endpoints 'nil)

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

(clojure.core/defn- req-list-brokers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :console-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :console-access)) #:http.request.field{:name "ConsoleAccess", :shape "__boolean", :location-name "consoleAccess"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :groups)) #:http.request.field{:name "Groups", :shape "__listOf__string", :location-name "groups"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "__string", :location-name "password"}))))

(clojure.core/defn- req-create-broker-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :publicly-accessible) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publicly-accessible)) #:http.request.field{:name "PubliclyAccessible", :shape "__boolean", :location-name "publiclyAccessible"})) (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "__listOf__string", :location-name "subnetIds"})) (clojure.core/contains? input :maintenance-window-start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weekly-start-time (input :maintenance-window-start-time)) #:http.request.field{:name "MaintenanceWindowStartTime", :shape "WeeklyStartTime", :location-name "maintenanceWindowStartTime"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "__listOf__string", :location-name "securityGroups"})) (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "__string", :location-name "creatorRequestId", :idempotency-token true})) (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "__boolean", :location-name "autoMinorVersionUpgrade"})) (clojure.core/contains? input :logs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs (input :logs)) #:http.request.field{:name "Logs", :shape "Logs", :location-name "logs"})) (clojure.core/contains? input :engine-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-type (input :engine-type)) #:http.request.field{:name "EngineType", :shape "EngineType", :location-name "engineType"})) (clojure.core/contains? input :host-instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :host-instance-type)) #:http.request.field{:name "HostInstanceType", :shape "__string", :location-name "hostInstanceType"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :users) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-user (input :users)) #:http.request.field{:name "Users", :shape "__listOfUser", :location-name "users"})) (clojure.core/contains? input :deployment-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-mode (input :deployment-mode)) #:http.request.field{:name "DeploymentMode", :shape "DeploymentMode", :location-name "deploymentMode"})) (clojure.core/contains? input :broker-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :broker-name)) #:http.request.field{:name "BrokerName", :shape "__string", :location-name "brokerName"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-id (input :configuration)) #:http.request.field{:name "Configuration", :shape "ConfigurationId", :location-name "configuration"}))))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :auto-minor-version-upgrade) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-minor-version-upgrade)) #:http.request.field{:name "AutoMinorVersionUpgrade", :shape "__boolean", :location-name "autoMinorVersionUpgrade"})) (clojure.core/contains? input :configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-id (input :configuration)) #:http.request.field{:name "Configuration", :shape "ConfigurationId", :location-name "configuration"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :logs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logs (input :logs)) #:http.request.field{:name "Logs", :shape "Logs", :location-name "logs"}))))

(clojure.core/defn- req-describe-configuration-revision-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-revision)) #:http.request.field{:name "ConfigurationRevision", :shape "__string", :location "uri", :location-name "configuration-revision"}) (clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]}))

(clojure.core/defn- req-describe-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]}))

(clojure.core/defn- req-delete-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-list-configuration-revisions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-create-configuration-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :engine-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-engine-type (input :engine-type)) #:http.request.field{:name "EngineType", :shape "EngineType", :location-name "engineType"})) (clojure.core/contains? input :engine-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :engine-version)) #:http.request.field{:name "EngineVersion", :shape "__string", :location-name "engineVersion"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"}))))

(clojure.core/defn- req-reboot-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-describe-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]} (clojure.core/contains? input :console-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :console-access)) #:http.request.field{:name "ConsoleAccess", :shape "__boolean", :location-name "consoleAccess"})) (clojure.core/contains? input :groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :groups)) #:http.request.field{:name "Groups", :shape "__listOf__string", :location-name "groups"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :password)) #:http.request.field{:name "Password", :shape "__string", :location-name "password"}))))

(clojure.core/defn- req-describe-broker-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :username)) #:http.request.field{:name "Username", :shape "__string", :location "uri", :location-name "username"}) (clojure.core/into (ser-string (input :broker-id)) #:http.request.field{:name "BrokerId", :shape "__string", :location "uri", :location-name "broker-id"})]}))

(clojure.core/defn- req-list-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-id)) #:http.request.field{:name "ConfigurationId", :shape "__string", :location "uri", :location-name "configuration-id"})]} (clojure.core/contains? input :data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :data)) #:http.request.field{:name "Data", :shape "__string", :location-name "data"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"}))))

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
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-request/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-request/publicly-accessible :portkey.aws.mq.create-broker-request/subnet-ids :portkey.aws.mq.create-broker-request/maintenance-window-start-time :portkey.aws.mq.create-broker-request/security-groups :portkey.aws.mq.create-broker-request/creator-request-id :portkey.aws.mq.create-broker-request/auto-minor-version-upgrade :portkey.aws.mq/logs :portkey.aws.mq/engine-type :portkey.aws.mq.create-broker-request/host-instance-type :portkey.aws.mq.create-broker-request/engine-version :portkey.aws.mq.create-broker-request/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.create-broker-request/broker-name :portkey.aws.mq.create-broker-request/configuration]))

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
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/pending-engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-instances (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-instance))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-response/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-broker-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-broker-response/created :portkey.aws.mq.describe-broker-response/publicly-accessible :portkey.aws.mq.describe-broker-response/subnet-ids :portkey.aws.mq.describe-broker-response/maintenance-window-start-time :portkey.aws.mq.describe-broker-response/security-groups :portkey.aws.mq.describe-broker-response/auto-minor-version-upgrade :portkey.aws.mq.describe-broker-response/logs :portkey.aws.mq/configurations :portkey.aws.mq.describe-broker-response/pending-engine-version :portkey.aws.mq/engine-type :portkey.aws.mq.describe-broker-response/host-instance-type :portkey.aws.mq/broker-state :portkey.aws.mq.describe-broker-response/engine-version :portkey.aws.mq.describe-broker-response/broker-id :portkey.aws.mq.describe-broker-response/broker-arn :portkey.aws.mq.describe-broker-response/broker-instances :portkey.aws.mq.describe-broker-response/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.describe-broker-response/broker-name]))

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
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/pending-engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-instances (clojure.spec.alpha/and :portkey.aws.mq/list-of-broker-instance))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user-summary))
(clojure.spec.alpha/def :portkey.aws.mq.describe-broker-output/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-broker-output/created :portkey.aws.mq.describe-broker-output/publicly-accessible :portkey.aws.mq.describe-broker-output/subnet-ids :portkey.aws.mq.describe-broker-output/maintenance-window-start-time :portkey.aws.mq.describe-broker-output/security-groups :portkey.aws.mq.describe-broker-output/auto-minor-version-upgrade :portkey.aws.mq.describe-broker-output/logs :portkey.aws.mq/configurations :portkey.aws.mq.describe-broker-output/pending-engine-version :portkey.aws.mq/engine-type :portkey.aws.mq.describe-broker-output/host-instance-type :portkey.aws.mq/broker-state :portkey.aws.mq.describe-broker-output/engine-version :portkey.aws.mq.describe-broker-output/broker-id :portkey.aws.mq.describe-broker-output/broker-arn :portkey.aws.mq.describe-broker-output/broker-instances :portkey.aws.mq.describe-broker-output/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.describe-broker-output/broker-name]))

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
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/engine-type :portkey.aws.mq.create-configuration-request/engine-version :portkey.aws.mq.create-configuration-request/name]))

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
(clojure.spec.alpha/def :portkey.aws.mq/create-configuration-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq/engine-type :portkey.aws.mq.create-configuration-input/engine-version :portkey.aws.mq.create-configuration-input/name]))

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
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/host-instance-type (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/users (clojure.spec.alpha/and :portkey.aws.mq/list-of-user))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/broker-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.create-broker-input/configuration (clojure.spec.alpha/and :portkey.aws.mq/configuration-id))
(clojure.spec.alpha/def :portkey.aws.mq/create-broker-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.create-broker-input/publicly-accessible :portkey.aws.mq.create-broker-input/subnet-ids :portkey.aws.mq.create-broker-input/maintenance-window-start-time :portkey.aws.mq.create-broker-input/security-groups :portkey.aws.mq.create-broker-input/creator-request-id :portkey.aws.mq.create-broker-input/auto-minor-version-upgrade :portkey.aws.mq/logs :portkey.aws.mq/engine-type :portkey.aws.mq.create-broker-input/host-instance-type :portkey.aws.mq.create-broker-input/engine-version :portkey.aws.mq.create-broker-input/users :portkey.aws.mq/deployment-mode :portkey.aws.mq.create-broker-input/broker-name :portkey.aws.mq.create-broker-input/configuration]))

(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/attribute-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/element-name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.sanitization-warning/reason (clojure.spec.alpha/and :portkey.aws.mq/sanitization-warning-reason))
(clojure.spec.alpha/def :portkey.aws.mq/sanitization-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.sanitization-warning/attribute-name :portkey.aws.mq.sanitization-warning/element-name :portkey.aws.mq.sanitization-warning/reason]))

(clojure.spec.alpha/def :portkey.aws.mq.configuration/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.configuration/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.configuration/arn :portkey.aws.mq.configuration/created :portkey.aws.mq.configuration/description :portkey.aws.mq/engine-type :portkey.aws.mq.configuration/engine-version :portkey.aws.mq.configuration/id :portkey.aws.mq.configuration/latest-revision :portkey.aws.mq.configuration/name]))

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

(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/arn (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/created (clojure.spec.alpha/and :portkey.aws.mq/timestamp-iso-8601))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/description (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/engine-version (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/latest-revision (clojure.spec.alpha/and :portkey.aws.mq/configuration-revision))
(clojure.spec.alpha/def :portkey.aws.mq.describe-configuration-response/name (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/describe-configuration-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.describe-configuration-response/arn :portkey.aws.mq.describe-configuration-response/created :portkey.aws.mq.describe-configuration-response/description :portkey.aws.mq/engine-type :portkey.aws.mq.describe-configuration-response/engine-version :portkey.aws.mq.describe-configuration-response/id :portkey.aws.mq.describe-configuration-response/latest-revision :portkey.aws.mq.describe-configuration-response/name]))

(clojure.spec.alpha/def :portkey.aws.mq.delete-broker-output/broker-id (clojure.spec.alpha/and :portkey.aws.mq/string))
(clojure.spec.alpha/def :portkey.aws.mq/delete-broker-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mq.delete-broker-output/broker-id]))

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

(clojure.core/defn delete-broker ([delete-broker-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-broker-request delete-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/delete-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/delete-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteBroker", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/delete-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/delete-broker-response))

(clojure.core/defn create-configuration ([] (create-configuration {})) ([create-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-configuration-request create-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/create-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateConfiguration", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-configuration :args (clojure.spec.alpha/? :portkey.aws.mq/create-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-configuration-response))

(clojure.core/defn describe-broker ([describe-broker-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-broker-request describe-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/describe-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeBroker", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-broker-response))

(clojure.core/defn describe-configuration-revision ([describe-configuration-revision-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-configuration-revision-request describe-configuration-revision-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/describe-configuration-revision-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}/revisions/{configuration-revision}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-configuration-revision-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeConfigurationRevision", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-configuration-revision :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-configuration-revision-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-configuration-revision-response))

(clojure.core/defn list-configurations ([] (list-configurations {})) ([list-configurations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-configurations-request list-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/list-configurations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-configurations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListConfigurations", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-configurations :args (clojure.spec.alpha/? :portkey.aws.mq/list-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-configurations-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/delete-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/delete-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteUser", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/delete-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/delete-user-response))

(clojure.core/defn update-broker ([update-broker-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-broker-request update-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/update-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateBroker", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-broker-response))

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/create-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateUser", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-user-response))

(clojure.core/defn list-configuration-revisions ([list-configuration-revisions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-configuration-revisions-request list-configuration-revisions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/list-configuration-revisions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}/revisions", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-configuration-revisions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListConfigurationRevisions", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-configuration-revisions :args (clojure.spec.alpha/tuple :portkey.aws.mq/list-configuration-revisions-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-configuration-revisions-response))

(clojure.core/defn create-broker ([] (create-broker {})) ([create-broker-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-broker-request create-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/create-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/create-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateBroker", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "UnauthorizedException" :portkey.aws.mq/unauthorized-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-broker :args (clojure.spec.alpha/? :portkey.aws.mq/create-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/create-broker-response))

(clojure.core/defn list-brokers ([] (list-brokers {})) ([list-brokers-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-brokers-request list-brokers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/list-brokers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-brokers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListBrokers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-brokers :args (clojure.spec.alpha/? :portkey.aws.mq/list-brokers-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-brokers-response))

(clojure.core/defn reboot-broker ([reboot-broker-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-reboot-broker-request reboot-broker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/reboot-broker-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/reboot", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/reboot-broker-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "RebootBroker", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef reboot-broker :args (clojure.spec.alpha/tuple :portkey.aws.mq/reboot-broker-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/reboot-broker-response))

(clojure.core/defn list-users ([list-users-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/list-users-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/list-users-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListUsers", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/tuple :portkey.aws.mq/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/list-users-response))

(clojure.core/defn describe-configuration ([describe-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-configuration-request describe-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/describe-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeConfiguration", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-configuration-response))

(clojure.core/defn update-user ([update-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/update-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateUser", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-user-response))

(clojure.core/defn update-configuration ([update-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-configuration-request update-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/update-configuration-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/configurations/{configuration-id}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/update-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateConfiguration", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ConflictException" :portkey.aws.mq/conflict-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef update-configuration :args (clojure.spec.alpha/tuple :portkey.aws.mq/update-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/update-configuration-response))

(clojure.core/defn describe-user ([describe-user-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-user-request describe-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.mq/endpoints, :http.request.spec/output-spec :portkey.aws.mq/describe-user-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/brokers/{broker-id}/users/{username}", :http.request.configuration/version "2017-11-27", :http.request.configuration/service-id "mq", :http.request.spec/input-spec :portkey.aws.mq/describe-user-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "DescribeUser", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mq/not-found-exception, "BadRequestException" :portkey.aws.mq/bad-request-exception, "InternalServerErrorException" :portkey.aws.mq/internal-server-error-exception, "ForbiddenException" :portkey.aws.mq/forbidden-exception}})))))
(clojure.spec.alpha/fdef describe-user :args (clojure.spec.alpha/tuple :portkey.aws.mq/describe-user-request) :ret (clojure.spec.alpha/and :portkey.aws.mq/describe-user-response))
