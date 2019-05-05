(ns portkey.aws.globalaccelerator.-2018-08-08 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-endpoint-configurations)

(clojure.core/declare ser-endpoint-weight)

(clojure.core/declare ser-generic-boolean)

(clojure.core/declare ser-traffic-dial-percentage)

(clojure.core/declare ser-ip-address-type)

(clojure.core/declare ser-protocol)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-health-check-interval-seconds)

(clojure.core/declare ser-client-affinity)

(clojure.core/declare ser-health-check-port)

(clojure.core/declare ser-health-check-protocol)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-port-range)

(clojure.core/declare ser-port-number)

(clojure.core/declare ser-endpoint-configuration)

(clojure.core/declare ser-port-ranges)

(clojure.core/declare ser-threshold-count)

(clojure.core/defn- ser-endpoint-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-endpoint-configuration coll) #:http.request.field{:shape "EndpointConfiguration"}))) input), :shape "EndpointConfigurations", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-endpoint-weight [input] #:http.request.field{:value input, :shape "EndpointWeight"})

(clojure.core/defn- ser-generic-boolean [input] #:http.request.field{:value input, :shape "GenericBoolean"})

(clojure.core/defn- ser-traffic-dial-percentage [input] #:http.request.field{:value input, :shape "TrafficDialPercentage"})

(clojure.core/defn- ser-ip-address-type [input] #:http.request.field{:value (clojure.core/get {"IPV4" "IPV4", :ipv-4 "IPV4"} input), :shape "IpAddressType"})

(clojure.core/defn- ser-protocol [input] #:http.request.field{:value (clojure.core/get {"TCP" "TCP", :tcp "TCP", "UDP" "UDP", :udp "UDP"} input), :shape "Protocol"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-health-check-interval-seconds [input] #:http.request.field{:value input, :shape "HealthCheckIntervalSeconds"})

(clojure.core/defn- ser-client-affinity [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "SOURCE_IP" "SOURCE_IP", :source-ip "SOURCE_IP"} input), :shape "ClientAffinity"})

(clojure.core/defn- ser-health-check-port [input] #:http.request.field{:value input, :shape "HealthCheckPort"})

(clojure.core/defn- ser-health-check-protocol [input] #:http.request.field{:value (clojure.core/get {"TCP" "TCP", :tcp "TCP", "HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS"} input), :shape "HealthCheckProtocol"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-port-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PortRange", :type "structure"} (clojure.core/contains? input :from-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :from-port)) #:http.request.field{:name "FromPort", :shape "PortNumber"})) (clojure.core/contains? input :to-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :to-port)) #:http.request.field{:name "ToPort", :shape "PortNumber"}))))

(clojure.core/defn- ser-port-number [input] #:http.request.field{:value input, :shape "PortNumber"})

(clojure.core/defn- ser-endpoint-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EndpointConfiguration", :type "structure"} (clojure.core/contains? input :endpoint-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :endpoint-id)) #:http.request.field{:name "EndpointId", :shape "GenericString"})) (clojure.core/contains? input :weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-weight (input :weight)) #:http.request.field{:name "Weight", :shape "EndpointWeight"}))))

(clojure.core/defn- ser-port-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-port-range coll) #:http.request.field{:shape "PortRange"}))) input), :shape "PortRanges", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-threshold-count [input] #:http.request.field{:value input, :shape "ThresholdCount"})

(clojure.core/defn- req-list-listeners-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-update-endpoint-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-group-arn)) #:http.request.field{:name "EndpointGroupArn", :shape "GenericString"})]} (clojure.core/contains? input :endpoint-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-configurations (input :endpoint-configurations)) #:http.request.field{:name "EndpointConfigurations", :shape "EndpointConfigurations"})) (clojure.core/contains? input :traffic-dial-percentage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-dial-percentage (input :traffic-dial-percentage)) #:http.request.field{:name "TrafficDialPercentage", :shape "TrafficDialPercentage"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-protocol (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "HealthCheckProtocol"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "GenericString"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold-count (input :threshold-count)) #:http.request.field{:name "ThresholdCount", :shape "ThresholdCount"}))))

(clojure.core/defn- req-delete-listener-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "GenericString"})]}))

(clojure.core/defn- req-delete-accelerator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"})]}))

(clojure.core/defn- req-create-listener-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"}) (clojure.core/into (ser-port-ranges (input :port-ranges)) #:http.request.field{:name "PortRanges", :shape "PortRanges"}) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"})]} (clojure.core/contains? input :client-affinity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-affinity (input :client-affinity)) #:http.request.field{:name "ClientAffinity", :shape "ClientAffinity"}))))

(clojure.core/defn- req-update-accelerator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :name)) #:http.request.field{:name "Name", :shape "GenericString"})) (clojure.core/contains? input :ip-address-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "GenericBoolean"}))))

(clojure.core/defn- req-list-accelerators-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-create-endpoint-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "GenericString"}) (clojure.core/into (ser-generic-string (input :endpoint-group-region)) #:http.request.field{:name "EndpointGroupRegion", :shape "GenericString"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"})]} (clojure.core/contains? input :endpoint-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-configurations (input :endpoint-configurations)) #:http.request.field{:name "EndpointConfigurations", :shape "EndpointConfigurations"})) (clojure.core/contains? input :traffic-dial-percentage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-dial-percentage (input :traffic-dial-percentage)) #:http.request.field{:name "TrafficDialPercentage", :shape "TrafficDialPercentage"})) (clojure.core/contains? input :health-check-interval-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-interval-seconds (input :health-check-interval-seconds)) #:http.request.field{:name "HealthCheckIntervalSeconds", :shape "HealthCheckIntervalSeconds"})) (clojure.core/contains? input :health-check-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-port (input :health-check-port)) #:http.request.field{:name "HealthCheckPort", :shape "HealthCheckPort"})) (clojure.core/contains? input :health-check-protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-protocol (input :health-check-protocol)) #:http.request.field{:name "HealthCheckProtocol", :shape "HealthCheckProtocol"})) (clojure.core/contains? input :threshold-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-threshold-count (input :threshold-count)) #:http.request.field{:name "ThresholdCount", :shape "ThresholdCount"})) (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :health-check-path)) #:http.request.field{:name "HealthCheckPath", :shape "GenericString"}))))

(clojure.core/defn- req-list-endpoint-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "GenericString"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-describe-listener-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "GenericString"})]}))

(clojure.core/defn- req-update-listener-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :listener-arn)) #:http.request.field{:name "ListenerArn", :shape "GenericString"})]} (clojure.core/contains? input :port-ranges) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-ranges (input :port-ranges)) #:http.request.field{:name "PortRanges", :shape "PortRanges"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol"})) (clojure.core/contains? input :client-affinity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-affinity (input :client-affinity)) #:http.request.field{:name "ClientAffinity", :shape "ClientAffinity"}))))

(clojure.core/defn- req-describe-accelerator-attributes-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :accelerator-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"}))))

(clojure.core/defn- req-create-accelerator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :name)) #:http.request.field{:name "Name", :shape "GenericString"}) (clojure.core/into (ser-idempotency-token (input :idempotency-token)) #:http.request.field{:name "IdempotencyToken", :shape "IdempotencyToken"})]} (clojure.core/contains? input :ip-address-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address-type (input :ip-address-type)) #:http.request.field{:name "IpAddressType", :shape "IpAddressType"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "GenericBoolean"}))))

(clojure.core/defn- req-describe-endpoint-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-group-arn)) #:http.request.field{:name "EndpointGroupArn", :shape "GenericString"})]}))

(clojure.core/defn- req-update-accelerator-attributes-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :accelerator-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"})) (clojure.core/contains? input :flow-logs-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-boolean (input :flow-logs-enabled)) #:http.request.field{:name "FlowLogsEnabled", :shape "GenericBoolean"})) (clojure.core/contains? input :flow-logs-s-3-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :flow-logs-s-3-bucket)) #:http.request.field{:name "FlowLogsS3Bucket", :shape "GenericString"})) (clojure.core/contains? input :flow-logs-s-3-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :flow-logs-s-3-prefix)) #:http.request.field{:name "FlowLogsS3Prefix", :shape "GenericString"}))))

(clojure.core/defn- req-describe-accelerator-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :accelerator-arn)) #:http.request.field{:name "AcceleratorArn", :shape "GenericString"})]}))

(clojure.core/defn- req-delete-endpoint-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-generic-string (input :endpoint-group-arn)) #:http.request.field{:name "EndpointGroupArn", :shape "GenericString"})]}))

(clojure.core/declare deser-health-state)

(clojure.core/declare deser-endpoint-groups)

(clojure.core/declare deser-ip-sets)

(clojure.core/declare deser-accelerator)

(clojure.core/declare deser-endpoint-weight)

(clojure.core/declare deser-generic-boolean)

(clojure.core/declare deser-traffic-dial-percentage)

(clojure.core/declare deser-endpoint-description)

(clojure.core/declare deser-accelerator-status)

(clojure.core/declare deser-ip-address-type)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-ip-set)

(clojure.core/declare deser-accelerators)

(clojure.core/declare deser-protocol)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-health-check-interval-seconds)

(clojure.core/declare deser-client-affinity)

(clojure.core/declare deser-health-check-port)

(clojure.core/declare deser-accelerator-attributes)

(clojure.core/declare deser-health-check-protocol)

(clojure.core/declare deser-listener)

(clojure.core/declare deser-listeners)

(clojure.core/declare deser-endpoint-group)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-port-range)

(clojure.core/declare deser-endpoint-descriptions)

(clojure.core/declare deser-ip-addresses)

(clojure.core/declare deser-port-number)

(clojure.core/declare deser-port-ranges)

(clojure.core/declare deser-threshold-count)

(clojure.core/defn- deser-health-state [input] (clojure.core/get {"INITIAL" :initial, "HEALTHY" :healthy, "UNHEALTHY" :unhealthy} input))

(clojure.core/defn- deser-endpoint-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-group coll))) input))

(clojure.core/defn- deser-ip-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-set coll))) input))

(clojure.core/defn- deser-accelerator [input] (clojure.core/cond-> {} (clojure.core/contains? input "AcceleratorArn") (clojure.core/assoc :accelerator-arn (deser-generic-string (input "AcceleratorArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-generic-string (input "Name"))) (clojure.core/contains? input "IpAddressType") (clojure.core/assoc :ip-address-type (deser-ip-address-type (input "IpAddressType"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-generic-boolean (input "Enabled"))) (clojure.core/contains? input "IpSets") (clojure.core/assoc :ip-sets (deser-ip-sets (input "IpSets"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-accelerator-status (input "Status"))) (clojure.core/contains? input "CreatedTime") (clojure.core/assoc :created-time (deser-timestamp (input "CreatedTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-endpoint-weight [input] input)

(clojure.core/defn- deser-generic-boolean [input] input)

(clojure.core/defn- deser-traffic-dial-percentage [input] input)

(clojure.core/defn- deser-endpoint-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "EndpointId") (clojure.core/assoc :endpoint-id (deser-generic-string (input "EndpointId"))) (clojure.core/contains? input "Weight") (clojure.core/assoc :weight (deser-endpoint-weight (input "Weight"))) (clojure.core/contains? input "HealthState") (clojure.core/assoc :health-state (deser-health-state (input "HealthState"))) (clojure.core/contains? input "HealthReason") (clojure.core/assoc :health-reason (deser-generic-string (input "HealthReason")))))

(clojure.core/defn- deser-accelerator-status [input] (clojure.core/get {"DEPLOYED" :deployed, "IN_PROGRESS" :in-progress} input))

(clojure.core/defn- deser-ip-address-type [input] (clojure.core/get {"IPV4" :ipv-4} input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-ip-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "IpFamily") (clojure.core/assoc :ip-family (deser-generic-string (input "IpFamily"))) (clojure.core/contains? input "IpAddresses") (clojure.core/assoc :ip-addresses (deser-ip-addresses (input "IpAddresses")))))

(clojure.core/defn- deser-accelerators [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-accelerator coll))) input))

(clojure.core/defn- deser-protocol [input] (clojure.core/get {"TCP" :tcp, "UDP" :udp} input))

(clojure.core/defn- deser-generic-string [input] input)

(clojure.core/defn- deser-health-check-interval-seconds [input] input)

(clojure.core/defn- deser-client-affinity [input] (clojure.core/get {"NONE" :none, "SOURCE_IP" :source-ip} input))

(clojure.core/defn- deser-health-check-port [input] input)

(clojure.core/defn- deser-accelerator-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "FlowLogsEnabled") (clojure.core/assoc :flow-logs-enabled (deser-generic-boolean (input "FlowLogsEnabled"))) (clojure.core/contains? input "FlowLogsS3Bucket") (clojure.core/assoc :flow-logs-s-3-bucket (deser-generic-string (input "FlowLogsS3Bucket"))) (clojure.core/contains? input "FlowLogsS3Prefix") (clojure.core/assoc :flow-logs-s-3-prefix (deser-generic-string (input "FlowLogsS3Prefix")))))

(clojure.core/defn- deser-health-check-protocol [input] (clojure.core/get {"TCP" :tcp, "HTTP" :http, "HTTPS" :https} input))

(clojure.core/defn- deser-listener [input] (clojure.core/cond-> {} (clojure.core/contains? input "ListenerArn") (clojure.core/assoc :listener-arn (deser-generic-string (input "ListenerArn"))) (clojure.core/contains? input "PortRanges") (clojure.core/assoc :port-ranges (deser-port-ranges (input "PortRanges"))) (clojure.core/contains? input "Protocol") (clojure.core/assoc :protocol (deser-protocol (input "Protocol"))) (clojure.core/contains? input "ClientAffinity") (clojure.core/assoc :client-affinity (deser-client-affinity (input "ClientAffinity")))))

(clojure.core/defn- deser-listeners [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener coll))) input))

(clojure.core/defn- deser-endpoint-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "TrafficDialPercentage") (clojure.core/assoc :traffic-dial-percentage (deser-traffic-dial-percentage (input "TrafficDialPercentage"))) (clojure.core/contains? input "EndpointGroupArn") (clojure.core/assoc :endpoint-group-arn (deser-generic-string (input "EndpointGroupArn"))) (clojure.core/contains? input "HealthCheckIntervalSeconds") (clojure.core/assoc :health-check-interval-seconds (deser-health-check-interval-seconds (input "HealthCheckIntervalSeconds"))) (clojure.core/contains? input "HealthCheckPort") (clojure.core/assoc :health-check-port (deser-health-check-port (input "HealthCheckPort"))) (clojure.core/contains? input "HealthCheckProtocol") (clojure.core/assoc :health-check-protocol (deser-health-check-protocol (input "HealthCheckProtocol"))) (clojure.core/contains? input "EndpointGroupRegion") (clojure.core/assoc :endpoint-group-region (deser-generic-string (input "EndpointGroupRegion"))) (clojure.core/contains? input "EndpointDescriptions") (clojure.core/assoc :endpoint-descriptions (deser-endpoint-descriptions (input "EndpointDescriptions"))) (clojure.core/contains? input "ThresholdCount") (clojure.core/assoc :threshold-count (deser-threshold-count (input "ThresholdCount"))) (clojure.core/contains? input "HealthCheckPath") (clojure.core/assoc :health-check-path (deser-generic-string (input "HealthCheckPath")))))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-port-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "FromPort") (clojure.core/assoc :from-port (deser-port-number (input "FromPort"))) (clojure.core/contains? input "ToPort") (clojure.core/assoc :to-port (deser-port-number (input "ToPort")))))

(clojure.core/defn- deser-endpoint-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-description coll))) input))

(clojure.core/defn- deser-ip-addresses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address coll))) input))

(clojure.core/defn- deser-port-number [input] input)

(clojure.core/defn- deser-port-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-port-range coll))) input))

(clojure.core/defn- deser-threshold-count [input] input)

(clojure.core/defn- response-endpoint-group-not-found-exception ([input] (response-endpoint-group-not-found-exception nil input)) ([resultWrapper1005376 input] (clojure.core/let [rawinput1005375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005377 {"Message" (rawinput1005375 "Message")}] (clojure.core/cond-> {} (letvar1005377 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005377 ["Message"])))))))

(clojure.core/defn- response-associated-listener-found-exception ([input] (response-associated-listener-found-exception nil input)) ([resultWrapper1005379 input] (clojure.core/let [rawinput1005378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005380 {"Message" (rawinput1005378 "Message")}] (clojure.core/cond-> {} (letvar1005380 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005380 ["Message"])))))))

(clojure.core/defn- response-endpoint-group-already-exists-exception ([input] (response-endpoint-group-already-exists-exception nil input)) ([resultWrapper1005382 input] (clojure.core/let [rawinput1005381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005383 {"Message" (rawinput1005381 "Message")}] (clojure.core/cond-> {} (letvar1005383 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005383 ["Message"])))))))

(clojure.core/defn- response-update-accelerator-response ([input] (response-update-accelerator-response nil input)) ([resultWrapper1005385 input] (clojure.core/let [rawinput1005384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005386 {"Accelerator" (rawinput1005384 "Accelerator")}] (clojure.core/cond-> {} (letvar1005386 "Accelerator") (clojure.core/assoc :accelerator (deser-accelerator (clojure.core/get-in letvar1005386 ["Accelerator"])))))))

(clojure.core/defn- response-describe-accelerator-attributes-response ([input] (response-describe-accelerator-attributes-response nil input)) ([resultWrapper1005388 input] (clojure.core/let [rawinput1005387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005389 {"AcceleratorAttributes" (rawinput1005387 "AcceleratorAttributes")}] (clojure.core/cond-> {} (letvar1005389 "AcceleratorAttributes") (clojure.core/assoc :accelerator-attributes (deser-accelerator-attributes (clojure.core/get-in letvar1005389 ["AcceleratorAttributes"])))))))

(clojure.core/defn- response-list-listeners-response ([input] (response-list-listeners-response nil input)) ([resultWrapper1005391 input] (clojure.core/let [rawinput1005390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005392 {"Listeners" (rawinput1005390 "Listeners"), "NextToken" (rawinput1005390 "NextToken")}] (clojure.core/cond-> {} (letvar1005392 "Listeners") (clojure.core/assoc :listeners (deser-listeners (clojure.core/get-in letvar1005392 ["Listeners"]))) (letvar1005392 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1005392 ["NextToken"])))))))

(clojure.core/defn- response-update-accelerator-attributes-response ([input] (response-update-accelerator-attributes-response nil input)) ([resultWrapper1005394 input] (clojure.core/let [rawinput1005393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005395 {"AcceleratorAttributes" (rawinput1005393 "AcceleratorAttributes")}] (clojure.core/cond-> {} (letvar1005395 "AcceleratorAttributes") (clojure.core/assoc :accelerator-attributes (deser-accelerator-attributes (clojure.core/get-in letvar1005395 ["AcceleratorAttributes"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1005397 input] (clojure.core/let [rawinput1005396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005398 {"Message" (rawinput1005396 "Message")}] (clojure.core/cond-> {} (letvar1005398 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005398 ["Message"])))))))

(clojure.core/defn- response-describe-listener-response ([input] (response-describe-listener-response nil input)) ([resultWrapper1005400 input] (clojure.core/let [rawinput1005399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005401 {"Listener" (rawinput1005399 "Listener")}] (clojure.core/cond-> {} (letvar1005401 "Listener") (clojure.core/assoc :listener (deser-listener (clojure.core/get-in letvar1005401 ["Listener"])))))))

(clojure.core/defn- response-update-endpoint-group-response ([input] (response-update-endpoint-group-response nil input)) ([resultWrapper1005403 input] (clojure.core/let [rawinput1005402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005404 {"EndpointGroup" (rawinput1005402 "EndpointGroup")}] (clojure.core/cond-> {} (letvar1005404 "EndpointGroup") (clojure.core/assoc :endpoint-group (deser-endpoint-group (clojure.core/get-in letvar1005404 ["EndpointGroup"])))))))

(clojure.core/defn- response-associated-endpoint-group-found-exception ([input] (response-associated-endpoint-group-found-exception nil input)) ([resultWrapper1005406 input] (clojure.core/let [rawinput1005405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005407 {"Message" (rawinput1005405 "Message")}] (clojure.core/cond-> {} (letvar1005407 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005407 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1005409 input] (clojure.core/let [rawinput1005408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005410 {"Message" (rawinput1005408 "Message")}] (clojure.core/cond-> {} (letvar1005410 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005410 ["Message"])))))))

(clojure.core/defn- response-list-endpoint-groups-response ([input] (response-list-endpoint-groups-response nil input)) ([resultWrapper1005412 input] (clojure.core/let [rawinput1005411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005413 {"EndpointGroups" (rawinput1005411 "EndpointGroups"), "NextToken" (rawinput1005411 "NextToken")}] (clojure.core/cond-> {} (letvar1005413 "EndpointGroups") (clojure.core/assoc :endpoint-groups (deser-endpoint-groups (clojure.core/get-in letvar1005413 ["EndpointGroups"]))) (letvar1005413 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1005413 ["NextToken"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1005415 input] (clojure.core/let [rawinput1005414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005416 {"Message" (rawinput1005414 "Message")}] (clojure.core/cond-> {} (letvar1005416 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005416 ["Message"])))))))

(clojure.core/defn- response-describe-accelerator-response ([input] (response-describe-accelerator-response nil input)) ([resultWrapper1005418 input] (clojure.core/let [rawinput1005417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005419 {"Accelerator" (rawinput1005417 "Accelerator")}] (clojure.core/cond-> {} (letvar1005419 "Accelerator") (clojure.core/assoc :accelerator (deser-accelerator (clojure.core/get-in letvar1005419 ["Accelerator"])))))))

(clojure.core/defn- response-update-listener-response ([input] (response-update-listener-response nil input)) ([resultWrapper1005421 input] (clojure.core/let [rawinput1005420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005422 {"Listener" (rawinput1005420 "Listener")}] (clojure.core/cond-> {} (letvar1005422 "Listener") (clojure.core/assoc :listener (deser-listener (clojure.core/get-in letvar1005422 ["Listener"])))))))

(clojure.core/defn- response-create-accelerator-response ([input] (response-create-accelerator-response nil input)) ([resultWrapper1005424 input] (clojure.core/let [rawinput1005423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005425 {"Accelerator" (rawinput1005423 "Accelerator")}] (clojure.core/cond-> {} (letvar1005425 "Accelerator") (clojure.core/assoc :accelerator (deser-accelerator (clojure.core/get-in letvar1005425 ["Accelerator"])))))))

(clojure.core/defn- response-accelerator-not-disabled-exception ([input] (response-accelerator-not-disabled-exception nil input)) ([resultWrapper1005427 input] (clojure.core/let [rawinput1005426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005428 {"Message" (rawinput1005426 "Message")}] (clojure.core/cond-> {} (letvar1005428 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005428 ["Message"])))))))

(clojure.core/defn- response-describe-endpoint-group-response ([input] (response-describe-endpoint-group-response nil input)) ([resultWrapper1005430 input] (clojure.core/let [rawinput1005429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005431 {"EndpointGroup" (rawinput1005429 "EndpointGroup")}] (clojure.core/cond-> {} (letvar1005431 "EndpointGroup") (clojure.core/assoc :endpoint-group (deser-endpoint-group (clojure.core/get-in letvar1005431 ["EndpointGroup"])))))))

(clojure.core/defn- response-accelerator-not-found-exception ([input] (response-accelerator-not-found-exception nil input)) ([resultWrapper1005433 input] (clojure.core/let [rawinput1005432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005434 {"Message" (rawinput1005432 "Message")}] (clojure.core/cond-> {} (letvar1005434 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005434 ["Message"])))))))

(clojure.core/defn- response-create-listener-response ([input] (response-create-listener-response nil input)) ([resultWrapper1005436 input] (clojure.core/let [rawinput1005435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005437 {"Listener" (rawinput1005435 "Listener")}] (clojure.core/cond-> {} (letvar1005437 "Listener") (clojure.core/assoc :listener (deser-listener (clojure.core/get-in letvar1005437 ["Listener"])))))))

(clojure.core/defn- response-invalid-argument-exception ([input] (response-invalid-argument-exception nil input)) ([resultWrapper1005439 input] (clojure.core/let [rawinput1005438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005440 {"Message" (rawinput1005438 "Message")}] (clojure.core/cond-> {} (letvar1005440 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005440 ["Message"])))))))

(clojure.core/defn- response-invalid-port-range-exception ([input] (response-invalid-port-range-exception nil input)) ([resultWrapper1005442 input] (clojure.core/let [rawinput1005441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005443 {"Message" (rawinput1005441 "Message")}] (clojure.core/cond-> {} (letvar1005443 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005443 ["Message"])))))))

(clojure.core/defn- response-list-accelerators-response ([input] (response-list-accelerators-response nil input)) ([resultWrapper1005445 input] (clojure.core/let [rawinput1005444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005446 {"Accelerators" (rawinput1005444 "Accelerators"), "NextToken" (rawinput1005444 "NextToken")}] (clojure.core/cond-> {} (letvar1005446 "Accelerators") (clojure.core/assoc :accelerators (deser-accelerators (clojure.core/get-in letvar1005446 ["Accelerators"]))) (letvar1005446 "NextToken") (clojure.core/assoc :next-token (deser-generic-string (clojure.core/get-in letvar1005446 ["NextToken"])))))))

(clojure.core/defn- response-listener-not-found-exception ([input] (response-listener-not-found-exception nil input)) ([resultWrapper1005448 input] (clojure.core/let [rawinput1005447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005449 {"Message" (rawinput1005447 "Message")}] (clojure.core/cond-> {} (letvar1005449 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1005449 ["Message"])))))))

(clojure.core/defn- response-create-endpoint-group-response ([input] (response-create-endpoint-group-response nil input)) ([resultWrapper1005451 input] (clojure.core/let [rawinput1005450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1005452 {"EndpointGroup" (rawinput1005450 "EndpointGroup")}] (clojure.core/cond-> {} (letvar1005452 "EndpointGroup") (clojure.core/assoc :endpoint-group (deser-endpoint-group (clojure.core/get-in letvar1005452 ["EndpointGroup"])))))))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/health-state #{"INITIAL" :unhealthy :healthy "HEALTHY" :initial "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-listeners-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-listeners-request/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.list-listeners-request/accelerator-arn] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/max-results :portkey.aws.globalaccelerator.-2018-08-08.list-listeners-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.endpoint-group-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.associated-listener-found-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/associated-listener-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.associated-listener-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.endpoint-group-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-groups (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/ip-sets (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/ip-set))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-endpoint-group-request/endpoint-group-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-endpoint-group-request/health-check-path (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.update-endpoint-group-request/endpoint-group-arn] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-configurations :portkey.aws.globalaccelerator.-2018-08-08/traffic-dial-percentage :portkey.aws.globalaccelerator.-2018-08-08/health-check-port :portkey.aws.globalaccelerator.-2018-08-08/health-check-protocol :portkey.aws.globalaccelerator.-2018-08-08.update-endpoint-group-request/health-check-path :portkey.aws.globalaccelerator.-2018-08-08/health-check-interval-seconds :portkey.aws.globalaccelerator.-2018-08-08/threshold-count]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerator]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/name (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/enabled (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/status (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/accelerator-status))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/created-time (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator/last-modified-time (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/timestamp))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.accelerator/accelerator-arn :portkey.aws.globalaccelerator.-2018-08-08.accelerator/name :portkey.aws.globalaccelerator.-2018-08-08/ip-address-type :portkey.aws.globalaccelerator.-2018-08-08.accelerator/enabled :portkey.aws.globalaccelerator.-2018-08-08/ip-sets :portkey.aws.globalaccelerator.-2018-08-08.accelerator/status :portkey.aws.globalaccelerator.-2018-08-08.accelerator/created-time :portkey.aws.globalaccelerator.-2018-08-08.accelerator/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerator-attributes]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-configurations (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/endpoint-configuration :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-listeners-response/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/listeners :portkey.aws.globalaccelerator.-2018-08-08.list-listeners-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-weight (clojure.spec.alpha/int-in 0 255))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerator-attributes]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.delete-listener-request/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/delete-listener-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.delete-listener-request/listener-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/listener]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.delete-accelerator-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/delete-accelerator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.delete-accelerator-request/accelerator-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-listener-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-listener-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.create-listener-request/accelerator-arn :portkey.aws.globalaccelerator.-2018-08-08/port-ranges :portkey.aws.globalaccelerator.-2018-08-08/protocol :portkey.aws.globalaccelerator.-2018-08-08/idempotency-token] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/client-affinity]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-group]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.associated-endpoint-group-found-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/associated-endpoint-group-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.associated-endpoint-group-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/traffic-dial-percentage clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/name (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/enabled (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/accelerator-arn] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/name :portkey.aws.globalaccelerator.-2018-08-08/ip-address-type :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-request/enabled]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/endpoint-id (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/weight (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/endpoint-weight))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/health-reason (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/endpoint-id :portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/weight :portkey.aws.globalaccelerator.-2018-08-08/health-state :portkey.aws.globalaccelerator.-2018-08-08.endpoint-description/health-reason]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-groups :portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerator-status #{"IN_PROGRESS" :in-progress :deployed "DEPLOYED"})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/ip-address-type #{:ipv-4 "IPV4"})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.ip-set/ip-family (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/ip-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.ip-set/ip-family :portkey.aws.globalaccelerator.-2018-08-08/ip-addresses]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerator]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-listener-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/listener]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerators (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/accelerator))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-accelerators-request/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/max-results :portkey.aws.globalaccelerator.-2018-08-08.list-accelerators-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerator]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/endpoint-group-region (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/health-check-path (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/listener-arn :portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/endpoint-group-region :portkey.aws.globalaccelerator.-2018-08-08/idempotency-token] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-configurations :portkey.aws.globalaccelerator.-2018-08-08/traffic-dial-percentage :portkey.aws.globalaccelerator.-2018-08-08/health-check-interval-seconds :portkey.aws.globalaccelerator.-2018-08-08/health-check-port :portkey.aws.globalaccelerator.-2018-08-08/health-check-protocol :portkey.aws.globalaccelerator.-2018-08-08/threshold-count :portkey.aws.globalaccelerator.-2018-08-08.create-endpoint-group-request/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/protocol #{:tcp "TCP" :udp "UDP"})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-request/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-request/listener-arn] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/max-results :portkey.aws.globalaccelerator.-2018-08-08.list-endpoint-groups-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/generic-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator-not-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.accelerator-not-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-group]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/health-check-interval-seconds (clojure.spec.alpha/int-in 10 30))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/client-affinity #{"NONE" :source-ip :none "SOURCE_IP"})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/health-check-port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-enabled (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-s-3-bucket (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-s-3-prefix (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerator-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-enabled :portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-s-3-bucket :portkey.aws.globalaccelerator.-2018-08-08.accelerator-attributes/flow-logs-s-3-prefix]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.describe-listener-request/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.describe-listener-request/listener-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.accelerator-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.accelerator-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/health-check-protocol #{:tcp "TCP" "HTTPS" :http "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-listener-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/listener]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.listener/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/listener (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.listener/listener-arn :portkey.aws.globalaccelerator.-2018-08-08/port-ranges :portkey.aws.globalaccelerator.-2018-08-08/protocol :portkey.aws.globalaccelerator.-2018-08-08/client-affinity]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.invalid-argument-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.invalid-argument-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-listener-request/listener-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-listener-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.update-listener-request/listener-arn] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/port-ranges :portkey.aws.globalaccelerator.-2018-08-08/protocol :portkey.aws.globalaccelerator.-2018-08-08/client-affinity]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/listeners (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/listener))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/endpoint-group-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/endpoint-group-region (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/health-check-path (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/traffic-dial-percentage :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/endpoint-group-arn :portkey.aws.globalaccelerator.-2018-08-08/health-check-interval-seconds :portkey.aws.globalaccelerator.-2018-08-08/health-check-port :portkey.aws.globalaccelerator.-2018-08-08/health-check-protocol :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/endpoint-group-region :portkey.aws.globalaccelerator.-2018-08-08/endpoint-descriptions :portkey.aws.globalaccelerator.-2018-08-08/threshold-count :portkey.aws.globalaccelerator.-2018-08-08.endpoint-group/health-check-path]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.describe-accelerator-attributes-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.describe-accelerator-attributes-request/accelerator-arn]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.invalid-port-range-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/invalid-port-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.invalid-port-range-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-accelerator-request/name (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.create-accelerator-request/enabled (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.create-accelerator-request/name :portkey.aws.globalaccelerator.-2018-08-08/idempotency-token] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/ip-address-type :portkey.aws.globalaccelerator.-2018-08-08.create-accelerator-request/enabled]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.port-range/from-port (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/port-number))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.port-range/to-port (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/port-number))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/port-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.port-range/from-port :portkey.aws.globalaccelerator.-2018-08-08.port-range/to-port]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-descriptions (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/endpoint-description))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/ip-addresses (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/ip-address :min-count 0 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.describe-endpoint-group-request/endpoint-group-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.describe-endpoint-group-request/endpoint-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-enabled (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-boolean))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-s-3-bucket (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-s-3-prefix (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/accelerator-arn :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-enabled :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-s-3-bucket :portkey.aws.globalaccelerator.-2018-08-08.update-accelerator-attributes-request/flow-logs-s-3-prefix]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/port-number (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.list-accelerators-response/next-token (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/accelerators :portkey.aws.globalaccelerator.-2018-08-08.list-accelerators-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-configuration/endpoint-id (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.endpoint-configuration/weight (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/endpoint-weight))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/endpoint-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.endpoint-configuration/endpoint-id :portkey.aws.globalaccelerator.-2018-08-08.endpoint-configuration/weight]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.listener-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/error-message))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08.listener-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.describe-accelerator-request/accelerator-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.describe-accelerator-request/accelerator-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08.delete-endpoint-group-request/endpoint-group-arn (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/generic-string))
(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/delete-endpoint-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.globalaccelerator.-2018-08-08.delete-endpoint-group-request/endpoint-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/port-ranges (clojure.spec.alpha/coll-of :portkey.aws.globalaccelerator.-2018-08-08/port-range :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.globalaccelerator.-2018-08-08/endpoint-group]))

(clojure.spec.alpha/def :portkey.aws.globalaccelerator.-2018-08-08/threshold-count (clojure.spec.alpha/int-in 1 10))

(clojure.core/defn create-accelerator "Create an accelerator. An accelerator includes one or more listeners that\nprocess inbound connections and direct traffic to one or more endpoint groups,\neach of which includes endpoints, such as Network Load Balancers. To see an AWS\nCLI example of creating an accelerator, scroll down to Example." ([create-accelerator-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-accelerator-request create-accelerator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccelerator", :http.request.configuration/output-deser-fn response-create-accelerator-response, :http.request.spec/error-spec {"InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "LimitExceededException" :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-accelerator :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/create-accelerator-response))

(clojure.core/defn list-accelerators "List the accelerators for an AWS account." ([] (list-accelerators {})) ([list-accelerators-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-accelerators-request list-accelerators-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccelerators", :http.request.configuration/output-deser-fn response-list-accelerators-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-next-token-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-accelerators :args (clojure.spec.alpha/? :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/list-accelerators-response))

(clojure.core/defn describe-listener "Describe a listener." ([describe-listener-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-listener-request describe-listener-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeListener", :http.request.configuration/output-deser-fn response-describe-listener-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "ListenerNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef describe-listener :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/describe-listener-response))

(clojure.core/defn update-accelerator "Update an accelerator." ([update-accelerator-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-accelerator-request update-accelerator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccelerator", :http.request.configuration/output-deser-fn response-update-accelerator-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef update-accelerator :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-response))

(clojure.core/defn update-listener "Update a listener." ([update-listener-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-listener-request update-listener-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/update-listener-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/update-listener-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateListener", :http.request.configuration/output-deser-fn response-update-listener-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "InvalidPortRangeException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-port-range-exception, "ListenerNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "LimitExceededException" :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-listener :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/update-listener-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/update-listener-response))

(clojure.core/defn create-listener "Create a listener to process inbound connections from clients to an accelerator.\nConnections arrive to assigned static IP addresses on a port, port range, or\nlist of port ranges that you specify. To see an AWS CLI example of creating a\nlistener, scroll down to Example." ([create-listener-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-listener-request create-listener-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/create-listener-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/create-listener-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateListener", :http.request.configuration/output-deser-fn response-create-listener-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InvalidPortRangeException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-port-range-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "LimitExceededException" :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-listener :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/create-listener-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/create-listener-response))

(clojure.core/defn describe-endpoint-group "Describe an endpoint group." ([describe-endpoint-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-endpoint-group-request describe-endpoint-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEndpointGroup", :http.request.configuration/output-deser-fn response-describe-endpoint-group-response, :http.request.spec/error-spec {"EndpointGroupNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef describe-endpoint-group :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/describe-endpoint-group-response))

(clojure.core/defn delete-endpoint-group "Delete an endpoint group from a listener." ([delete-endpoint-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-endpoint-group-request delete-endpoint-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/delete-endpoint-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEndpointGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"EndpointGroupNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef delete-endpoint-group :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/delete-endpoint-group-request) :ret clojure.core/true?)

(clojure.core/defn describe-accelerator-attributes "Describe the attributes of an accelerator." ([] (describe-accelerator-attributes {})) ([describe-accelerator-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-accelerator-attributes-request describe-accelerator-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAcceleratorAttributes", :http.request.configuration/output-deser-fn response-describe-accelerator-attributes-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef describe-accelerator-attributes :args (clojure.spec.alpha/? :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-attributes-response))

(clojure.core/defn create-endpoint-group "Create an endpoint group for the specified listener. An endpoint group is a\ncollection of endpoints in one AWS Region. To see an AWS CLI example of creating\nan endpoint group, scroll down to Example." ([create-endpoint-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-endpoint-group-request create-endpoint-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEndpointGroup", :http.request.configuration/output-deser-fn response-create-endpoint-group-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "EndpointGroupAlreadyExistsException" :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-already-exists-exception, "ListenerNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "LimitExceededException" :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-endpoint-group :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/create-endpoint-group-response))

(clojure.core/defn update-accelerator-attributes "Update the attributes for an accelerator. To see an AWS CLI example of updating\nan accelerator to enable flow logs, scroll down to Example." ([] (update-accelerator-attributes {})) ([update-accelerator-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-accelerator-attributes-request update-accelerator-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAcceleratorAttributes", :http.request.configuration/output-deser-fn response-update-accelerator-attributes-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef update-accelerator-attributes :args (clojure.spec.alpha/? :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/update-accelerator-attributes-response))

(clojure.core/defn delete-listener "Delete a listener from an accelerator." ([delete-listener-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-listener-request delete-listener-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/delete-listener-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteListener", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception, "AssociatedEndpointGroupFoundException" :portkey.aws.globalaccelerator.-2018-08-08/associated-endpoint-group-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef delete-listener :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/delete-listener-request) :ret clojure.core/true?)

(clojure.core/defn describe-accelerator "Describe an accelerator. To see an AWS CLI example of describing an accelerator,\nscroll down to Example." ([describe-accelerator-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-accelerator-request describe-accelerator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAccelerator", :http.request.configuration/output-deser-fn response-describe-accelerator-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef describe-accelerator :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/describe-accelerator-response))

(clojure.core/defn update-endpoint-group "Update an endpoint group. To see an AWS CLI example of updating an endpoint\ngroup, scroll down to Example." ([update-endpoint-group-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-endpoint-group-request update-endpoint-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEndpointGroup", :http.request.configuration/output-deser-fn response-update-endpoint-group-response, :http.request.spec/error-spec {"InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "EndpointGroupNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/endpoint-group-not-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "LimitExceededException" :portkey.aws.globalaccelerator.-2018-08-08/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-endpoint-group :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/update-endpoint-group-response))

(clojure.core/defn delete-accelerator "Delete an accelerator. Note: before you can delete an accelerator, you must\ndisable it and remove all dependent resources (listeners and endpoint groups)." ([delete-accelerator-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-accelerator-request delete-accelerator-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/delete-accelerator-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccelerator", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "AcceleratorNotDisabledException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-disabled-exception, "AssociatedListenerFoundException" :portkey.aws.globalaccelerator.-2018-08-08/associated-listener-found-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception}})))))
(clojure.spec.alpha/fdef delete-accelerator :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/delete-accelerator-request) :ret clojure.core/true?)

(clojure.core/defn list-listeners "List the listeners for an accelerator." ([list-listeners-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-listeners-request list-listeners-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListListeners", :http.request.configuration/output-deser-fn response-list-listeners-response, :http.request.spec/error-spec {"AcceleratorNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/accelerator-not-found-exception, "InvalidNextTokenException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-next-token-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-listeners :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/list-listeners-response))

(clojure.core/defn list-endpoint-groups "List the endpoint groups that are associated with a listener." ([list-endpoint-groups-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-endpoint-groups-request list-endpoint-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.globalaccelerator.-2018-08-08/endpoints, :http.request.configuration/target-prefix "GlobalAccelerator_V20180706", :http.request.spec/output-spec :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-08-08", :http.request.configuration/service-id "Global Accelerator", :http.request.spec/input-spec :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEndpointGroups", :http.request.configuration/output-deser-fn response-list-endpoint-groups-response, :http.request.spec/error-spec {"ListenerNotFoundException" :portkey.aws.globalaccelerator.-2018-08-08/listener-not-found-exception, "InvalidNextTokenException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-next-token-exception, "InvalidArgumentException" :portkey.aws.globalaccelerator.-2018-08-08/invalid-argument-exception, "InternalServiceErrorException" :portkey.aws.globalaccelerator.-2018-08-08/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-endpoint-groups :args (clojure.spec.alpha/tuple :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.globalaccelerator.-2018-08-08/list-endpoint-groups-response))
