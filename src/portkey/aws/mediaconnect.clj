(ns portkey.aws.mediaconnect (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-add-output-request)

(clojure.core/declare ser-grant-entitlement-request)

(clojure.core/declare ser-string)

(clojure.core/declare ser-update-encryption)

(clojure.core/declare ser-list-of-grant-entitlement-request)

(clojure.core/declare ser-algorithm)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-protocol)

(clojure.core/declare ser-set-source-request)

(clojure.core/declare ser-encryption)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-key-type)

(clojure.core/declare ser-map-of-string)

(clojure.core/declare ser-list-of-add-output-request)

(clojure.core/defn- ser-add-output-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:destination input)) #:http.request.field{:name "Destination", :shape "__string", :location-name "destination"}) (clojure.core/into (ser-integer (:port input)) #:http.request.field{:name "Port", :shape "__integer", :location-name "port"}) (clojure.core/into (ser-protocol (:protocol input)) #:http.request.field{:name "Protocol", :shape "Protocol", :location-name "protocol"})], :shape "AddOutputRequest", :type "structure"} (clojure.core/contains? input :stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-id)) #:http.request.field{:name "StreamId", :shape "__string", :location-name "streamId"})) (clojure.core/contains? input :max-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-latency)) #:http.request.field{:name "MaxLatency", :shape "__integer", :location-name "maxLatency"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption", :location-name "encryption"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})) (clojure.core/contains? input :smoothing-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :smoothing-latency)) #:http.request.field{:name "SmoothingLatency", :shape "__integer", :location-name "smoothingLatency"}))))

(clojure.core/defn- ser-grant-entitlement-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-string (:subscribers input)) #:http.request.field{:name "Subscribers", :shape "__listOf__string", :location-name "subscribers"})], :shape "GrantEntitlementRequest", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "Encryption", :location-name "encryption"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-update-encryption [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateEncryption", :type "structure"} (clojure.core/contains? input :algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithm (input :algorithm)) #:http.request.field{:name "Algorithm", :shape "Algorithm", :location-name "algorithm"})) (clojure.core/contains? input :key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-type (input :key-type)) #:http.request.field{:name "KeyType", :shape "KeyType", :location-name "keyType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"})) (clojure.core/contains? input :secret-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :secret-arn)) #:http.request.field{:name "SecretArn", :shape "__string", :location-name "secretArn"}))))

(clojure.core/defn- ser-list-of-grant-entitlement-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-grant-entitlement-request coll) #:http.request.field{:shape "GrantEntitlementRequest"}))) input), :shape "__listOfGrantEntitlementRequest", :type "list"})

(clojure.core/defn- ser-algorithm [input] #:http.request.field{:value (clojure.core/get {"aes128" "aes128", :aes-128 "aes128", "aes192" "aes192", :aes-192 "aes192", "aes256" "aes256", :aes-256 "aes256"} input), :shape "Algorithm"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-protocol [input] #:http.request.field{:value (clojure.core/get {"zixi-push" "zixi-push", :zixipush "zixi-push", "rtp-fec" "rtp-fec", :rtpfec "rtp-fec", "rtp" "rtp", :rtp "rtp"} input), :shape "Protocol"})

(clojure.core/defn- ser-set-source-request [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SetSourceRequest", :type "structure"} (clojure.core/contains? input :stream-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-id)) #:http.request.field{:name "StreamId", :shape "__string", :location-name "streamId"})) (clojure.core/contains? input :decryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption (input :decryption)) #:http.request.field{:name "Decryption", :shape "Encryption", :location-name "decryption"})) (clojure.core/contains? input :max-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-latency)) #:http.request.field{:name "MaxLatency", :shape "__integer", :location-name "maxLatency"})) (clojure.core/contains? input :whitelist-cidr) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :whitelist-cidr)) #:http.request.field{:name "WhitelistCidr", :shape "__string", :location-name "whitelistCidr"})) (clojure.core/contains? input :entitlement-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :entitlement-arn)) #:http.request.field{:name "EntitlementArn", :shape "__string", :location-name "entitlementArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol", :location-name "protocol"})) (clojure.core/contains? input :ingest-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :ingest-port)) #:http.request.field{:name "IngestPort", :shape "__integer", :location-name "ingestPort"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integer", :location-name "maxBitrate"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"}))))

(clojure.core/defn- ser-encryption [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:secret-arn input)) #:http.request.field{:name "SecretArn", :shape "__string", :location-name "secretArn"}) (clojure.core/into (ser-algorithm (:algorithm input)) #:http.request.field{:name "Algorithm", :shape "Algorithm", :location-name "algorithm"}) (clojure.core/into (ser-string (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "__string", :location-name "roleArn"})], :shape "Encryption", :type "structure"} (clojure.core/contains? input :key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-type (input :key-type)) #:http.request.field{:name "KeyType", :shape "KeyType", :location-name "keyType"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-key-type [input] #:http.request.field{:value (clojure.core/get {"static-key" "static-key", :statickey "static-key"} input), :shape "KeyType"})

(clojure.core/defn- ser-map-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "__string"})])) input), :shape "__mapOf__string", :type "map"})

(clojure.core/defn- ser-list-of-add-output-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-add-output-request coll) #:http.request.field{:shape "AddOutputRequest"}))) input), :shape "__listOfAddOutputRequest", :type "list"})

(clojure.core/defn- req-create-flow-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-set-source-request (input :source)) #:http.request.field{:name "Source", :shape "SetSourceRequest", :location-name "source"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})]} (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "__string", :location-name "availabilityZone"})) (clojure.core/contains? input :entitlements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-grant-entitlement-request (input :entitlements)) #:http.request.field{:name "Entitlements", :shape "__listOfGrantEntitlementRequest", :location-name "entitlements"})) (clojure.core/contains? input :outputs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-add-output-request (input :outputs)) #:http.request.field{:name "Outputs", :shape "__listOfAddOutputRequest", :location-name "outputs"}))))

(clojure.core/defn- req-update-flow-source-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"}) (clojure.core/into (ser-string (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "__string", :location "uri", :location-name "sourceArn"})]} (clojure.core/contains? input :stream-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-id)) #:http.request.field{:name "StreamId", :shape "__string", :location-name "streamId"})) (clojure.core/contains? input :decryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-encryption (input :decryption)) #:http.request.field{:name "Decryption", :shape "UpdateEncryption", :location-name "decryption"})) (clojure.core/contains? input :max-latency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-latency)) #:http.request.field{:name "MaxLatency", :shape "__integer", :location-name "maxLatency"})) (clojure.core/contains? input :whitelist-cidr) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :whitelist-cidr)) #:http.request.field{:name "WhitelistCidr", :shape "__string", :location-name "whitelistCidr"})) (clojure.core/contains? input :entitlement-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :entitlement-arn)) #:http.request.field{:name "EntitlementArn", :shape "__string", :location-name "entitlementArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol", :location-name "protocol"})) (clojure.core/contains? input :ingest-port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :ingest-port)) #:http.request.field{:name "IngestPort", :shape "__integer", :location-name "ingestPort"})) (clojure.core/contains? input :max-bitrate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-bitrate)) #:http.request.field{:name "MaxBitrate", :shape "__integer", :location-name "maxBitrate"}))))

(clojure.core/defn- req-add-flow-outputs-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})], :body [(clojure.core/into (ser-list-of-add-output-request (input :outputs)) #:http.request.field{:name "Outputs", :shape "__listOfAddOutputRequest", :location-name "outputs"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resourceArn"})]}))

(clojure.core/defn- req-list-entitlements-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-flow-output-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"}) (clojure.core/into (ser-string (input :output-arn)) #:http.request.field{:name "OutputArn", :shape "__string", :location "uri", :location-name "outputArn"})]} (clojure.core/contains? input :stream-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :stream-id)) #:http.request.field{:name "StreamId", :shape "__string", :location-name "streamId"})) (clojure.core/contains? input :max-latency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-latency)) #:http.request.field{:name "MaxLatency", :shape "__integer", :location-name "maxLatency"})) (clojure.core/contains? input :destination) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :destination)) #:http.request.field{:name "Destination", :shape "__string", :location-name "destination"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :protocol)) #:http.request.field{:name "Protocol", :shape "Protocol", :location-name "protocol"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :port)) #:http.request.field{:name "Port", :shape "__integer", :location-name "port"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "UpdateEncryption", :location-name "encryption"})) (clojure.core/contains? input :smoothing-latency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :smoothing-latency)) #:http.request.field{:name "SmoothingLatency", :shape "__integer", :location-name "smoothingLatency"}))))

(clojure.core/defn- req-describe-flow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resourceArn"})], :body [(clojure.core/into (ser-map-of-string (input :tags)) #:http.request.field{:name "Tags", :shape "__mapOf__string", :location-name "tags"})]}))

(clojure.core/defn- req-update-flow-entitlement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"}) (clojure.core/into (ser-string (input :entitlement-arn)) #:http.request.field{:name "EntitlementArn", :shape "__string", :location "uri", :location-name "entitlementArn"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :encryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-encryption (input :encryption)) #:http.request.field{:name "Encryption", :shape "UpdateEncryption", :location-name "encryption"})) (clojure.core/contains? input :subscribers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :subscribers)) #:http.request.field{:name "Subscribers", :shape "__listOf__string", :location-name "subscribers"}))))

(clojure.core/defn- req-start-flow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})]}))

(clojure.core/defn- req-list-flows-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-revoke-flow-entitlement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"}) (clojure.core/into (ser-string (input :entitlement-arn)) #:http.request.field{:name "EntitlementArn", :shape "__string", :location "uri", :location-name "entitlementArn"})]}))

(clojure.core/defn- req-remove-flow-output-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"}) (clojure.core/into (ser-string (input :output-arn)) #:http.request.field{:name "OutputArn", :shape "__string", :location "uri", :location-name "outputArn"})]}))

(clojure.core/defn- req-delete-flow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})]}))

(clojure.core/defn- req-stop-flow-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-list-of-string (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "__listOf__string", :location "querystring", :location-name "tagKeys"})], :uri [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "__string", :location "uri", :location-name "resourceArn"})]}))

(clojure.core/defn- req-grant-flow-entitlements-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :flow-arn)) #:http.request.field{:name "FlowArn", :shape "__string", :location "uri", :location-name "flowArn"})], :body [(clojure.core/into (ser-list-of-grant-entitlement-request (input :entitlements)) #:http.request.field{:name "Entitlements", :shape "__listOfGrantEntitlementRequest", :location-name "entitlements"})]}))

(clojure.core/declare deser-messages)

(clojure.core/declare deser-listed-entitlement)

(clojure.core/declare deser-source)

(clojure.core/declare deser-list-of-listed-entitlement)

(clojure.core/declare deser-list-of-listed-flow)

(clojure.core/declare deser-string)

(clojure.core/declare deser-transport)

(clojure.core/declare deser-source-type)

(clojure.core/declare deser-status)

(clojure.core/declare deser-listed-flow)

(clojure.core/declare deser-entitlement)

(clojure.core/declare deser-algorithm)

(clojure.core/declare deser-list-of-string)

(clojure.core/declare deser-protocol)

(clojure.core/declare deser-list-of-output)

(clojure.core/declare deser-encryption)

(clojure.core/declare deser-output)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-list-of-entitlement)

(clojure.core/declare deser-key-type)

(clojure.core/declare deser-map-of-string)

(clojure.core/declare deser-flow)

(clojure.core/defn- deser-messages [input] (clojure.core/cond-> {:errors (deser-list-of-string (input "errors"))}))

(clojure.core/defn- deser-listed-entitlement [input] (clojure.core/cond-> {:entitlement-arn (deser-string (input "entitlementArn")), :entitlement-name (deser-string (input "entitlementName"))}))

(clojure.core/defn- deser-source [input] (clojure.core/cond-> {:source-arn (deser-string (input "sourceArn")), :name (deser-string (input "name"))} (clojure.core/contains? input "decryption") (clojure.core/assoc :decryption (deser-encryption (input "decryption"))) (clojure.core/contains? input "whitelistCidr") (clojure.core/assoc :whitelist-cidr (deser-string (input "whitelistCidr"))) (clojure.core/contains? input "transport") (clojure.core/assoc :transport (deser-transport (input "transport"))) (clojure.core/contains? input "entitlementArn") (clojure.core/assoc :entitlement-arn (deser-string (input "entitlementArn"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "ingestIp") (clojure.core/assoc :ingest-ip (deser-string (input "ingestIp"))) (clojure.core/contains? input "ingestPort") (clojure.core/assoc :ingest-port (deser-integer (input "ingestPort")))))

(clojure.core/defn- deser-list-of-listed-entitlement [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listed-entitlement coll))) input))

(clojure.core/defn- deser-list-of-listed-flow [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listed-flow coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-transport [input] (clojure.core/cond-> {:protocol (deser-protocol (input "protocol"))} (clojure.core/contains? input "maxBitrate") (clojure.core/assoc :max-bitrate (deser-integer (input "maxBitrate"))) (clojure.core/contains? input "maxLatency") (clojure.core/assoc :max-latency (deser-integer (input "maxLatency"))) (clojure.core/contains? input "smoothingLatency") (clojure.core/assoc :smoothing-latency (deser-integer (input "smoothingLatency"))) (clojure.core/contains? input "streamId") (clojure.core/assoc :stream-id (deser-string (input "streamId")))))

(clojure.core/defn- deser-source-type [input] (clojure.core/get {"OWNED" :owned, "ENTITLED" :entitled} input))

(clojure.core/defn- deser-status [input] (clojure.core/get {"STANDBY" :standby, "ACTIVE" :active, "UPDATING" :updating, "DELETING" :deleting, "STARTING" :starting, "STOPPING" :stopping, "ERROR" :error} input))

(clojure.core/defn- deser-listed-flow [input] (clojure.core/cond-> {:status (deser-status (input "status")), :description (deser-string (input "description")), :source-type (deser-source-type (input "sourceType")), :availability-zone (deser-string (input "availabilityZone")), :flow-arn (deser-string (input "flowArn")), :name (deser-string (input "name"))}))

(clojure.core/defn- deser-entitlement [input] (clojure.core/cond-> {:entitlement-arn (deser-string (input "entitlementArn")), :subscribers (deser-list-of-string (input "subscribers")), :name (deser-string (input "name"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-encryption (input "encryption")))))

(clojure.core/defn- deser-algorithm [input] (clojure.core/get {"aes128" :aes-128, "aes192" :aes-192, "aes256" :aes-256} input))

(clojure.core/defn- deser-list-of-string [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-protocol [input] (clojure.core/get {"zixi-push" :zixipush, "rtp-fec" :rtpfec, "rtp" :rtp} input))

(clojure.core/defn- deser-list-of-output [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output coll))) input))

(clojure.core/defn- deser-encryption [input] (clojure.core/cond-> {:secret-arn (deser-string (input "secretArn")), :algorithm (deser-algorithm (input "algorithm")), :role-arn (deser-string (input "roleArn"))} (clojure.core/contains? input "keyType") (clojure.core/assoc :key-type (deser-key-type (input "keyType")))))

(clojure.core/defn- deser-output [input] (clojure.core/cond-> {:output-arn (deser-string (input "outputArn")), :name (deser-string (input "name"))} (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-string (input "destination"))) (clojure.core/contains? input "mediaLiveInputArn") (clojure.core/assoc :media-live-input-arn (deser-string (input "mediaLiveInputArn"))) (clojure.core/contains? input "transport") (clojure.core/assoc :transport (deser-transport (input "transport"))) (clojure.core/contains? input "entitlementArn") (clojure.core/assoc :entitlement-arn (deser-string (input "entitlementArn"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-integer (input "port"))) (clojure.core/contains? input "encryption") (clojure.core/assoc :encryption (deser-encryption (input "encryption")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-list-of-entitlement [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entitlement coll))) input))

(clojure.core/defn- deser-key-type [input] (clojure.core/get {"static-key" :statickey} input))

(clojure.core/defn- deser-map-of-string [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-flow [input] (clojure.core/cond-> {:status (deser-status (input "status")), :entitlements (deser-list-of-entitlement (input "entitlements")), :outputs (deser-list-of-output (input "outputs")), :availability-zone (deser-string (input "availabilityZone")), :flow-arn (deser-string (input "flowArn")), :source (deser-source (input "source")), :name (deser-string (input "name"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "egressIp") (clojure.core/assoc :egress-ip (deser-string (input "egressIp")))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper284057 input] (clojure.core/let [rawinput284056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284058 {"message" (rawinput284056 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284058 ["message"]))}))))

(clojure.core/defn- response-remove-flow-output-response ([input] (response-remove-flow-output-response nil input)) ([resultWrapper284060 input] (clojure.core/let [rawinput284059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284061 {"flowArn" (rawinput284059 "flowArn"), "outputArn" (rawinput284059 "outputArn")}] (clojure.core/cond-> {} (letvar284061 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284061 ["flowArn"]))) (letvar284061 "outputArn") (clojure.core/assoc :output-arn (deser-string (clojure.core/get-in letvar284061 ["outputArn"])))))))

(clojure.core/defn- response-add-flow-outputs-response ([input] (response-add-flow-outputs-response nil input)) ([resultWrapper284063 input] (clojure.core/let [rawinput284062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284064 {"flowArn" (rawinput284062 "flowArn"), "outputs" (rawinput284062 "outputs")}] (clojure.core/cond-> {} (letvar284064 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284064 ["flowArn"]))) (letvar284064 "outputs") (clojure.core/assoc :outputs (deser-list-of-output (clojure.core/get-in letvar284064 ["outputs"])))))))

(clojure.core/defn- response-list-flows-response ([input] (response-list-flows-response nil input)) ([resultWrapper284066 input] (clojure.core/let [rawinput284065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284067 {"flows" (rawinput284065 "flows"), "nextToken" (rawinput284065 "nextToken")}] (clojure.core/cond-> {} (letvar284067 "flows") (clojure.core/assoc :flows (deser-list-of-listed-flow (clojure.core/get-in letvar284067 ["flows"]))) (letvar284067 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar284067 ["nextToken"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper284069 input] (clojure.core/let [rawinput284068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284070 {"message" (rawinput284068 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284070 ["message"]))}))))

(clojure.core/defn- response-update-flow-source-response ([input] (response-update-flow-source-response nil input)) ([resultWrapper284072 input] (clojure.core/let [rawinput284071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284073 {"flowArn" (rawinput284071 "flowArn"), "source" (rawinput284071 "source")}] (clojure.core/cond-> {} (letvar284073 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284073 ["flowArn"]))) (letvar284073 "source") (clojure.core/assoc :source (deser-source (clojure.core/get-in letvar284073 ["source"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper284075 input] (clojure.core/let [rawinput284074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284076 {"tags" (rawinput284074 "tags")}] (clojure.core/cond-> {} (letvar284076 "tags") (clojure.core/assoc :tags (deser-map-of-string (clojure.core/get-in letvar284076 ["tags"])))))))

(clojure.core/defn- response-create-flow-response ([input] (response-create-flow-response nil input)) ([resultWrapper284078 input] (clojure.core/let [rawinput284077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284079 {"flow" (rawinput284077 "flow")}] (clojure.core/cond-> {} (letvar284079 "flow") (clojure.core/assoc :flow (deser-flow (clojure.core/get-in letvar284079 ["flow"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper284081 input] (clojure.core/let [rawinput284080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284082 {"message" (rawinput284080 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284082 ["message"]))}))))

(clojure.core/defn- response-describe-flow-response ([input] (response-describe-flow-response nil input)) ([resultWrapper284084 input] (clojure.core/let [rawinput284083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284085 {"flow" (rawinput284083 "flow"), "messages" (rawinput284083 "messages")}] (clojure.core/cond-> {} (letvar284085 "flow") (clojure.core/assoc :flow (deser-flow (clojure.core/get-in letvar284085 ["flow"]))) (letvar284085 "messages") (clojure.core/assoc :messages (deser-messages (clojure.core/get-in letvar284085 ["messages"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper284087 input] (clojure.core/let [rawinput284086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284088 {"message" (rawinput284086 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284088 ["message"]))}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper284090 input] (clojure.core/let [rawinput284089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284091 {"message" (rawinput284089 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284091 ["message"]))}))))

(clojure.core/defn- response-delete-flow-response ([input] (response-delete-flow-response nil input)) ([resultWrapper284093 input] (clojure.core/let [rawinput284092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284094 {"flowArn" (rawinput284092 "flowArn"), "status" (rawinput284092 "status")}] (clojure.core/cond-> {} (letvar284094 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284094 ["flowArn"]))) (letvar284094 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar284094 ["status"])))))))

(clojure.core/defn- response-update-flow-entitlement-response ([input] (response-update-flow-entitlement-response nil input)) ([resultWrapper284096 input] (clojure.core/let [rawinput284095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284097 {"entitlement" (rawinput284095 "entitlement"), "flowArn" (rawinput284095 "flowArn")}] (clojure.core/cond-> {} (letvar284097 "entitlement") (clojure.core/assoc :entitlement (deser-entitlement (clojure.core/get-in letvar284097 ["entitlement"]))) (letvar284097 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284097 ["flowArn"])))))))

(clojure.core/defn- response-stop-flow-response ([input] (response-stop-flow-response nil input)) ([resultWrapper284099 input] (clojure.core/let [rawinput284098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284100 {"flowArn" (rawinput284098 "flowArn"), "status" (rawinput284098 "status")}] (clojure.core/cond-> {} (letvar284100 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284100 ["flowArn"]))) (letvar284100 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar284100 ["status"])))))))

(clojure.core/defn- response-grant-flow-entitlements-response ([input] (response-grant-flow-entitlements-response nil input)) ([resultWrapper284102 input] (clojure.core/let [rawinput284101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284103 {"entitlements" (rawinput284101 "entitlements"), "flowArn" (rawinput284101 "flowArn")}] (clojure.core/cond-> {} (letvar284103 "entitlements") (clojure.core/assoc :entitlements (deser-list-of-entitlement (clojure.core/get-in letvar284103 ["entitlements"]))) (letvar284103 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284103 ["flowArn"])))))))

(clojure.core/defn- response-create-flow-420-exception ([input] (response-create-flow-420-exception nil input)) ([resultWrapper284105 input] (clojure.core/let [rawinput284104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284106 {"message" (rawinput284104 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284106 ["message"]))}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper284108 input] (clojure.core/let [rawinput284107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284109 {"message" (rawinput284107 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284109 ["message"]))}))))

(clojure.core/defn- response-update-flow-output-response ([input] (response-update-flow-output-response nil input)) ([resultWrapper284111 input] (clojure.core/let [rawinput284110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284112 {"flowArn" (rawinput284110 "flowArn"), "output" (rawinput284110 "output")}] (clojure.core/cond-> {} (letvar284112 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284112 ["flowArn"]))) (letvar284112 "output") (clojure.core/assoc :output (deser-output (clojure.core/get-in letvar284112 ["output"])))))))

(clojure.core/defn- response-list-entitlements-response ([input] (response-list-entitlements-response nil input)) ([resultWrapper284114 input] (clojure.core/let [rawinput284113 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284115 {"entitlements" (rawinput284113 "entitlements"), "nextToken" (rawinput284113 "nextToken")}] (clojure.core/cond-> {} (letvar284115 "entitlements") (clojure.core/assoc :entitlements (deser-list-of-listed-entitlement (clojure.core/get-in letvar284115 ["entitlements"]))) (letvar284115 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar284115 ["nextToken"])))))))

(clojure.core/defn- response-revoke-flow-entitlement-response ([input] (response-revoke-flow-entitlement-response nil input)) ([resultWrapper284117 input] (clojure.core/let [rawinput284116 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284118 {"entitlementArn" (rawinput284116 "entitlementArn"), "flowArn" (rawinput284116 "flowArn")}] (clojure.core/cond-> {} (letvar284118 "entitlementArn") (clojure.core/assoc :entitlement-arn (deser-string (clojure.core/get-in letvar284118 ["entitlementArn"]))) (letvar284118 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284118 ["flowArn"])))))))

(clojure.core/defn- response-grant-flow-entitlements-420-exception ([input] (response-grant-flow-entitlements-420-exception nil input)) ([resultWrapper284120 input] (clojure.core/let [rawinput284119 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284121 {"message" (rawinput284119 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284121 ["message"]))}))))

(clojure.core/defn- response-start-flow-response ([input] (response-start-flow-response nil input)) ([resultWrapper284123 input] (clojure.core/let [rawinput284122 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284124 {"flowArn" (rawinput284122 "flowArn"), "status" (rawinput284122 "status")}] (clojure.core/cond-> {} (letvar284124 "flowArn") (clojure.core/assoc :flow-arn (deser-string (clojure.core/get-in letvar284124 ["flowArn"]))) (letvar284124 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar284124 ["status"])))))))

(clojure.core/defn- response-add-flow-outputs-420-exception ([input] (response-add-flow-outputs-420-exception nil input)) ([resultWrapper284126 input] (clojure.core/let [rawinput284125 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar284127 {"message" (rawinput284125 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar284127 ["message"]))}))))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.response-error/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/response-error (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.response-error/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.messages/errors (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/messages (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.messages/errors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/internal-server-error-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.internal-server-error-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-request/availability-zone (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-request/entitlements (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-grant-entitlement-request))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-request/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-request/outputs (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-add-output-request))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-request/source (clojure.spec.alpha/and :portkey.aws.mediaconnect/set-source-request))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/create-flow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.create-flow-request/source :portkey.aws.mediaconnect.create-flow-request/name] :opt-un [:portkey.aws.mediaconnect.create-flow-request/availability-zone :portkey.aws.mediaconnect.create-flow-request/entitlements :portkey.aws.mediaconnect.create-flow-request/outputs]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.remove-flow-output-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.remove-flow-output-response/output-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/remove-flow-output-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.remove-flow-output-response/flow-arn :portkey.aws.mediaconnect.remove-flow-output-response/output-arn]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/stream-id (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/max-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/destination (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-output-request/smoothing-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/add-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.add-output-request/destination :portkey.aws.mediaconnect.add-output-request/port :portkey.aws.mediaconnect/protocol] :opt-un [:portkey.aws.mediaconnect.add-output-request/stream-id :portkey.aws.mediaconnect.add-output-request/max-latency :portkey.aws.mediaconnect.add-output-request/description :portkey.aws.mediaconnect/encryption :portkey.aws.mediaconnect.add-output-request/name :portkey.aws.mediaconnect.add-output-request/smoothing-latency]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-flow-outputs-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-flow-outputs-response/outputs (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-output))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/add-flow-outputs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.add-flow-outputs-response/flow-arn :portkey.aws.mediaconnect.add-flow-outputs-response/outputs]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-flows-response/flows (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-listed-flow))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-flows-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-flows-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.list-flows-response/flows :portkey.aws.mediaconnect.list-flows-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/bad-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.bad-request-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-entitlement/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-entitlement/entitlement-name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/listed-entitlement (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.listed-entitlement/entitlement-arn :portkey.aws.mediaconnect.listed-entitlement/entitlement-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/stream-id (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/decryption (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-encryption))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/max-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/whitelist-cidr (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/source-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/ingest-port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-request/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-source-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.update-flow-source-request/flow-arn :portkey.aws.mediaconnect.update-flow-source-request/source-arn] :opt-un [:portkey.aws.mediaconnect.update-flow-source-request/stream-id :portkey.aws.mediaconnect.update-flow-source-request/decryption :portkey.aws.mediaconnect.update-flow-source-request/max-latency :portkey.aws.mediaconnect.update-flow-source-request/whitelist-cidr :portkey.aws.mediaconnect.update-flow-source-request/entitlement-arn :portkey.aws.mediaconnect.update-flow-source-request/description :portkey.aws.mediaconnect/protocol :portkey.aws.mediaconnect.update-flow-source-request/ingest-port :portkey.aws.mediaconnect.update-flow-source-request/max-bitrate]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-source-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-source-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.update-flow-source-response/flow-arn :portkey.aws.mediaconnect/source]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.mediaconnect/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/create-flow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/flow]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-flow-outputs-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-flow-outputs-request/outputs (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-add-output-request))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/add-flow-outputs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.add-flow-outputs-request/flow-arn :portkey.aws.mediaconnect.add-flow-outputs-request/outputs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/decryption (clojure.spec.alpha/and :portkey.aws.mediaconnect/encryption))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/whitelist-cidr (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/source-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/ingest-ip (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/ingest-port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.source/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/source (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.source/source-arn :portkey.aws.mediaconnect.source/name] :opt-un [:portkey.aws.mediaconnect.source/decryption :portkey.aws.mediaconnect.source/whitelist-cidr :portkey.aws.mediaconnect/transport :portkey.aws.mediaconnect.source/entitlement-arn :portkey.aws.mediaconnect.source/description :portkey.aws.mediaconnect.source/ingest-ip :portkey.aws.mediaconnect.source/ingest-port]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-listed-entitlement (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/listed-entitlement))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-entitlement-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-entitlement-request/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-entitlement-request/subscribers (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/grant-entitlement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.grant-entitlement-request/subscribers] :opt-un [:portkey.aws.mediaconnect.grant-entitlement-request/description :portkey.aws.mediaconnect/encryption :portkey.aws.mediaconnect.grant-entitlement-request/name]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-listed-flow (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/listed-flow))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/forbidden-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.forbidden-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect/describe-flow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/flow :portkey.aws.mediaconnect/messages]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.transport/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.transport/max-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.transport/smoothing-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.transport/stream-id (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/transport (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect/protocol] :opt-un [:portkey.aws.mediaconnect.transport/max-bitrate :portkey.aws.mediaconnect.transport/max-latency :portkey.aws.mediaconnect.transport/smoothing-latency :portkey.aws.mediaconnect.transport/stream-id]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/source-type #{"ENTITLED" "OWNED" :entitled :owned})

(clojure.spec.alpha/def :portkey.aws.mediaconnect.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/service-unavailable-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.service-unavailable-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-entitlements-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-entitlements-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/max-results :portkey.aws.mediaconnect.list-entitlements-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/status #{:standby :starting "UPDATING" :deleting "ERROR" :stopping "STANDBY" "STARTING" :active "DELETING" "ACTIVE" :updating :error "STOPPING"})

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/stream-id (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/max-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/output-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/destination (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/encryption (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-encryption))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-request/smoothing-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.update-flow-output-request/flow-arn :portkey.aws.mediaconnect.update-flow-output-request/output-arn] :opt-un [:portkey.aws.mediaconnect.update-flow-output-request/stream-id :portkey.aws.mediaconnect.update-flow-output-request/max-latency :portkey.aws.mediaconnect.update-flow-output-request/destination :portkey.aws.mediaconnect.update-flow-output-request/description :portkey.aws.mediaconnect/protocol :portkey.aws.mediaconnect.update-flow-output-request/port :portkey.aws.mediaconnect.update-flow-output-request/encryption :portkey.aws.mediaconnect.update-flow-output-request/smoothing-latency]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.describe-flow-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/describe-flow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.describe-flow-request/flow-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-flow/availability-zone (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-flow/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-flow/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.listed-flow/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/listed-flow (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect/status :portkey.aws.mediaconnect.listed-flow/description :portkey.aws.mediaconnect/source-type :portkey.aws.mediaconnect.listed-flow/availability-zone :portkey.aws.mediaconnect.listed-flow/flow-arn :portkey.aws.mediaconnect.listed-flow/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/too-many-requests-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.too-many-requests-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-encryption/role-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-encryption/secret-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-encryption (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/algorithm :portkey.aws.mediaconnect/key-type :portkey.aws.mediaconnect.update-encryption/role-arn :portkey.aws.mediaconnect.update-encryption/secret-arn]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.mediaconnect/map-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.tag-resource-request/resource-arn :portkey.aws.mediaconnect.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.delete-flow-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/delete-flow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.delete-flow-response/flow-arn :portkey.aws.mediaconnect/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-grant-entitlement-request (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/grant-entitlement-request))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-request/encryption (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-encryption))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-request/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-request/subscribers (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-entitlement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.update-flow-entitlement-request/flow-arn :portkey.aws.mediaconnect.update-flow-entitlement-request/entitlement-arn] :opt-un [:portkey.aws.mediaconnect.update-flow-entitlement-request/description :portkey.aws.mediaconnect.update-flow-entitlement-request/encryption :portkey.aws.mediaconnect.update-flow-entitlement-request/subscribers]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.entitlement/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.entitlement/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.entitlement/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.entitlement/subscribers (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/entitlement (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.entitlement/entitlement-arn :portkey.aws.mediaconnect.entitlement/subscribers :portkey.aws.mediaconnect.entitlement/name] :opt-un [:portkey.aws.mediaconnect.entitlement/description :portkey.aws.mediaconnect/encryption]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/algorithm #{:aes-128 :aes-256 "aes192" :aes-192 "aes256" "aes128"})

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-entitlement-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-entitlement-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/entitlement :portkey.aws.mediaconnect.update-flow-entitlement-response/flow-arn]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/string))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.stop-flow-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/stop-flow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.stop-flow-response/flow-arn :portkey.aws.mediaconnect/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-flow-entitlements-response/entitlements (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-entitlement))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-flow-entitlements-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/grant-flow-entitlements-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.grant-flow-entitlements-response/entitlements :portkey.aws.mediaconnect.grant-flow-entitlements-response/flow-arn]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/protocol #{"rtp" :rtp :rtpfec "rtp-fec" "zixi-push" :zixipush})

(clojure.spec.alpha/def :portkey.aws.mediaconnect.create-flow-420-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/create-flow-420-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.create-flow-420-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.start-flow-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/start-flow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.start-flow-request/flow-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-flows-request/next-token (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-flows-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect/max-results :portkey.aws.mediaconnect.list-flows-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.update-flow-output-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/update-flow-output-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.update-flow-output-response/flow-arn :portkey.aws.mediaconnect/output]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-output (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/output))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-entitlements-response/entitlements (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-listed-entitlement))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.list-entitlements-response/next-token (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-entitlements-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.list-entitlements-response/entitlements :portkey.aws.mediaconnect.list-entitlements-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.revoke-flow-entitlement-response/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.revoke-flow-entitlement-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/revoke-flow-entitlement-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.revoke-flow-entitlement-response/entitlement-arn :portkey.aws.mediaconnect.revoke-flow-entitlement-response/flow-arn]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.revoke-flow-entitlement-request/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.revoke-flow-entitlement-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/revoke-flow-entitlement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.revoke-flow-entitlement-request/flow-arn :portkey.aws.mediaconnect.revoke-flow-entitlement-request/entitlement-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect.remove-flow-output-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.remove-flow-output-request/output-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/remove-flow-output-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.remove-flow-output-request/flow-arn :portkey.aws.mediaconnect.remove-flow-output-request/output-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.delete-flow-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/delete-flow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.delete-flow-request/flow-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/stream-id (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/decryption (clojure.spec.alpha/and :portkey.aws.mediaconnect/encryption))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/max-latency (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/whitelist-cidr (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/ingest-port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/max-bitrate (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.set-source-request/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/set-source-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.set-source-request/stream-id :portkey.aws.mediaconnect.set-source-request/decryption :portkey.aws.mediaconnect.set-source-request/max-latency :portkey.aws.mediaconnect.set-source-request/whitelist-cidr :portkey.aws.mediaconnect.set-source-request/entitlement-arn :portkey.aws.mediaconnect.set-source-request/description :portkey.aws.mediaconnect/protocol :portkey.aws.mediaconnect.set-source-request/ingest-port :portkey.aws.mediaconnect.set-source-request/max-bitrate :portkey.aws.mediaconnect.set-source-request/name]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.encryption/role-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.encryption/secret-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.encryption/secret-arn :portkey.aws.mediaconnect/algorithm :portkey.aws.mediaconnect.encryption/role-arn] :opt-un [:portkey.aws.mediaconnect/key-type]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/output-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/destination (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/media-live-input-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/entitlement-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/port (clojure.spec.alpha/and :portkey.aws.mediaconnect/integer))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.output/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/output (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.output/output-arn :portkey.aws.mediaconnect.output/name] :opt-un [:portkey.aws.mediaconnect.output/destination :portkey.aws.mediaconnect.output/media-live-input-arn :portkey.aws.mediaconnect/transport :portkey.aws.mediaconnect.output/entitlement-arn :portkey.aws.mediaconnect.output/description :portkey.aws.mediaconnect.output/port :portkey.aws.mediaconnect/encryption]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-flow-entitlements-420-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/grant-flow-entitlements-420-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.grant-flow-entitlements-420-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.stop-flow-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/stop-flow-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.stop-flow-request/flow-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-entitlement (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/entitlement))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.start-flow-response/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/start-flow-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mediaconnect.start-flow-response/flow-arn :portkey.aws.mediaconnect/status]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.add-flow-outputs-420-exception/message (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/add-flow-outputs-420-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.add-flow-outputs-420-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/key-type #{:statickey "static-key"})

(clojure.spec.alpha/def :portkey.aws.mediaconnect.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.untag-resource-request/tag-keys :portkey.aws.mediaconnect.untag-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/map-of-string (clojure.spec.alpha/map-of :portkey.aws.mediaconnect/string :portkey.aws.mediaconnect/string))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/availability-zone (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/outputs (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-output))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/description (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/egress-ip (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/name (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.flow/entitlements (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-entitlement))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/flow (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect/status :portkey.aws.mediaconnect.flow/entitlements :portkey.aws.mediaconnect.flow/outputs :portkey.aws.mediaconnect.flow/availability-zone :portkey.aws.mediaconnect.flow/flow-arn :portkey.aws.mediaconnect/source :portkey.aws.mediaconnect.flow/name] :opt-un [:portkey.aws.mediaconnect.flow/description :portkey.aws.mediaconnect.flow/egress-ip]))

(clojure.spec.alpha/def :portkey.aws.mediaconnect/list-of-add-output-request (clojure.spec.alpha/coll-of :portkey.aws.mediaconnect/add-output-request))

(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-flow-entitlements-request/entitlements (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-of-grant-entitlement-request))
(clojure.spec.alpha/def :portkey.aws.mediaconnect.grant-flow-entitlements-request/flow-arn (clojure.spec.alpha/and :portkey.aws.mediaconnect/string))
(clojure.spec.alpha/def :portkey.aws.mediaconnect/grant-flow-entitlements-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mediaconnect.grant-flow-entitlements-request/flow-arn :portkey.aws.mediaconnect.grant-flow-entitlements-request/entitlements] :opt-un []))

(clojure.core/defn grant-flow-entitlements "Grants entitlements to an existing flow." ([grant-flow-entitlements-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-grant-flow-entitlements-request grant-flow-entitlements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/grant-flow-entitlements-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/entitlements", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/grant-flow-entitlements-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GrantFlowEntitlements", :http.request.configuration/output-deser-fn response-grant-flow-entitlements-response, :http.request.spec/error-spec {"GrantFlowEntitlements420Exception" :portkey.aws.mediaconnect/grant-flow-entitlements-420-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef grant-flow-entitlements :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/grant-flow-entitlements-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/grant-flow-entitlements-response))

(clojure.core/defn tag-resource "Associates the specified tags to a resource. If the request does not mention an\nexisting tag associated with the resource, that tag is not changed." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn add-flow-outputs "Adds outputs to an existing flow. You can create up to 20 outputs per flow." ([add-flow-outputs-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-add-flow-outputs-request add-flow-outputs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/add-flow-outputs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/outputs", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/add-flow-outputs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddFlowOutputs", :http.request.configuration/output-deser-fn response-add-flow-outputs-response, :http.request.spec/error-spec {"AddFlowOutputs420Exception" :portkey.aws.mediaconnect/add-flow-outputs-420-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef add-flow-outputs :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/add-flow-outputs-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/add-flow-outputs-response))

(clojure.core/defn stop-flow "Stops a flow." ([stop-flow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-stop-flow-request stop-flow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/stop-flow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/stop/{flowArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/stop-flow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopFlow", :http.request.configuration/output-deser-fn response-stop-flow-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef stop-flow :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/stop-flow-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/stop-flow-response))

(clojure.core/defn delete-flow "Deletes a flow. Before you can delete a flow, you must stop the flow." ([delete-flow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-flow-request delete-flow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/delete-flow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/delete-flow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFlow", :http.request.configuration/output-deser-fn response-delete-flow-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-flow :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/delete-flow-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/delete-flow-response))

(clojure.core/defn list-entitlements "Displays a list of all entitlements that have been granted to this account. This\nrequest returns 20 results per page." ([] (list-entitlements {})) ([list-entitlements-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-entitlements-request list-entitlements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/list-entitlements-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/entitlements", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/list-entitlements-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEntitlements", :http.request.configuration/output-deser-fn response-list-entitlements-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-entitlements :args (clojure.spec.alpha/? :portkey.aws.mediaconnect/list-entitlements-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-entitlements-response))

(clojure.core/defn list-flows "Displays a list of flows that are associated with this account. This request\nreturns a paginated result." ([] (list-flows {})) ([list-flows-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-flows-request list-flows-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/list-flows-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/list-flows-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFlows", :http.request.configuration/output-deser-fn response-list-flows-response, :http.request.spec/error-spec {"ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-flows :args (clojure.spec.alpha/? :portkey.aws.mediaconnect/list-flows-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-flows-response))

(clojure.core/defn remove-flow-output "Removes an output from an existing flow. This request can be made only on an\noutput that does not have an entitlement associated with it. If the output has\nan entitlement, you must revoke the entitlement instead. When an entitlement is\nrevoked from a flow, the service automatically removes the associated output." ([remove-flow-output-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-remove-flow-output-request remove-flow-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/remove-flow-output-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/outputs/{outputArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/remove-flow-output-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveFlowOutput", :http.request.configuration/output-deser-fn response-remove-flow-output-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef remove-flow-output :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/remove-flow-output-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/remove-flow-output-response))

(clojure.core/defn list-tags-for-resource "Lists all tags associated with the resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/list-tags-for-resource-response))

(clojure.core/defn update-flow-output "Updates an existing flow output." ([update-flow-output-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-flow-output-request update-flow-output-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/update-flow-output-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/outputs/{outputArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/update-flow-output-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFlowOutput", :http.request.configuration/output-deser-fn response-update-flow-output-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-flow-output :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/update-flow-output-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-flow-output-response))

(clojure.core/defn revoke-flow-entitlement "Revokes an entitlement from a flow. Once an entitlement is revoked, the content\nbecomes unavailable to the subscriber and the associated output is removed." ([revoke-flow-entitlement-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-revoke-flow-entitlement-request revoke-flow-entitlement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/revoke-flow-entitlement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/entitlements/{entitlementArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/revoke-flow-entitlement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RevokeFlowEntitlement", :http.request.configuration/output-deser-fn response-revoke-flow-entitlement-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef revoke-flow-entitlement :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/revoke-flow-entitlement-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/revoke-flow-entitlement-response))

(clojure.core/defn create-flow "Creates a new flow. The request must include one source. The request optionally\ncan include outputs (up to 20) and entitlements (up to 50)." ([create-flow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-flow-request create-flow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/create-flow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/create-flow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFlow", :http.request.configuration/output-deser-fn response-create-flow-response, :http.request.spec/error-spec {"CreateFlow420Exception" :portkey.aws.mediaconnect/create-flow-420-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-flow :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/create-flow-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/create-flow-response))

(clojure.core/defn start-flow "Starts a flow." ([start-flow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-start-flow-request start-flow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/start-flow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/start/{flowArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/start-flow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFlow", :http.request.configuration/output-deser-fn response-start-flow-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef start-flow :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/start-flow-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/start-flow-response))

(clojure.core/defn update-flow-entitlement "You can change an entitlement's description, subscribers, and encryption. If you\nchange the subscribers, the service will remove the outputs that are are used by\nthe subscribers that are removed." ([update-flow-entitlement-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-flow-entitlement-request update-flow-entitlement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/update-flow-entitlement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/entitlements/{entitlementArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/update-flow-entitlement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFlowEntitlement", :http.request.configuration/output-deser-fn response-update-flow-entitlement-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-flow-entitlement :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/update-flow-entitlement-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-flow-entitlement-response))

(clojure.core/defn untag-resource "Deletes the specified tags from a resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn describe-flow "Displays the details of a flow. The response includes the flow ARN, name, and\nAvailability Zone, as well as details about the source, outputs, and\nentitlements." ([describe-flow-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-flow-request describe-flow-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/describe-flow-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/describe-flow-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFlow", :http.request.configuration/output-deser-fn response-describe-flow-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-flow :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/describe-flow-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/describe-flow-response))

(clojure.core/defn update-flow-source "Updates the source of a flow." ([update-flow-source-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-flow-source-request update-flow-source-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.mediaconnect/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.mediaconnect/update-flow-source-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/flows/{flowArn}/source/{sourceArn}", :http.request.configuration/version "2018-11-14", :http.request.configuration/service-id "MediaConnect", :http.request.spec/input-spec :portkey.aws.mediaconnect/update-flow-source-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFlowSource", :http.request.configuration/output-deser-fn response-update-flow-source-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.mediaconnect/bad-request-exception, "InternalServerErrorException" :portkey.aws.mediaconnect/internal-server-error-exception, "ForbiddenException" :portkey.aws.mediaconnect/forbidden-exception, "NotFoundException" :portkey.aws.mediaconnect/not-found-exception, "ServiceUnavailableException" :portkey.aws.mediaconnect/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.mediaconnect/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-flow-source :args (clojure.spec.alpha/tuple :portkey.aws.mediaconnect/update-flow-source-request) :ret (clojure.spec.alpha/and :portkey.aws.mediaconnect/update-flow-source-response))
