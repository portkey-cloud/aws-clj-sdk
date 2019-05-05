(ns portkey.aws.appmesh (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-http-route-action)

(clojure.core/declare ser-backends)

(clojure.core/declare ser-http-route-match)

(clojure.core/declare ser-health-check-interval-millis)

(clojure.core/declare ser-route-spec)

(clojure.core/declare ser-weighted-targets)

(clojure.core/declare ser-list-virtual-routers-limit)

(clojure.core/declare ser-list-virtual-nodes-limit)

(clojure.core/declare ser-weighted-target)

(clojure.core/declare ser-port-protocol)

(clojure.core/declare ser-percent-int)

(clojure.core/declare ser-service-names)

(clojure.core/declare ser-health-check-timeout-millis)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-list-routes-limit)

(clojure.core/declare ser-listener)

(clojure.core/declare ser-dns-service-discovery)

(clojure.core/declare ser-health-check-policy)

(clojure.core/declare ser-listeners)

(clojure.core/declare ser-service-discovery)

(clojure.core/declare ser-health-check-threshold)

(clojure.core/declare ser-port-mapping)

(clojure.core/declare ser-service-name)

(clojure.core/declare ser-virtual-router-spec)

(clojure.core/declare ser-port-number)

(clojure.core/declare ser-virtual-node-spec)

(clojure.core/declare ser-http-route)

(clojure.core/declare ser-list-meshes-limit)

(clojure.core/defn- ser-http-route-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpRouteAction", :type "structure"} (clojure.core/contains? input :weighted-targets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-weighted-targets (input :weighted-targets)) #:http.request.field{:name "weightedTargets", :shape "WeightedTargets"}))))

(clojure.core/defn- ser-backends [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-name coll) #:http.request.field{:shape "ServiceName"}))) input), :shape "Backends", :type "list"})

(clojure.core/defn- ser-http-route-match [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpRouteMatch", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :prefix)) #:http.request.field{:name "prefix", :shape "String"}))))

(clojure.core/defn- ser-health-check-interval-millis [input] #:http.request.field{:value input, :shape "HealthCheckIntervalMillis"})

(clojure.core/defn- ser-route-spec [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RouteSpec", :type "structure"} (clojure.core/contains? input :http-route) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-route (input :http-route)) #:http.request.field{:name "httpRoute", :shape "HttpRoute"}))))

(clojure.core/defn- ser-weighted-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-weighted-target coll) #:http.request.field{:shape "WeightedTarget"}))) input), :shape "WeightedTargets", :type "list"})

(clojure.core/defn- ser-list-virtual-routers-limit [input] #:http.request.field{:value input, :shape "ListVirtualRoutersLimit"})

(clojure.core/defn- ser-list-virtual-nodes-limit [input] #:http.request.field{:value input, :shape "ListVirtualNodesLimit"})

(clojure.core/defn- ser-weighted-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "WeightedTarget", :type "structure"} (clojure.core/contains? input :virtual-node) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :virtual-node)) #:http.request.field{:name "virtualNode", :shape "ResourceName"})) (clojure.core/contains? input :weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent-int (input :weight)) #:http.request.field{:name "weight", :shape "PercentInt"}))))

(clojure.core/defn- ser-port-protocol [input] #:http.request.field{:value (clojure.core/get {"http" "http", :http "http", "tcp" "tcp", :tcp "tcp"} input), :shape "PortProtocol"})

(clojure.core/defn- ser-percent-int [input] #:http.request.field{:value input, :shape "PercentInt"})

(clojure.core/defn- ser-service-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-name coll) #:http.request.field{:shape "ServiceName"}))) input), :shape "ServiceNames", :type "list", :max 10})

(clojure.core/defn- ser-health-check-timeout-millis [input] #:http.request.field{:value input, :shape "HealthCheckTimeoutMillis"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-list-routes-limit [input] #:http.request.field{:value input, :shape "ListRoutesLimit"})

(clojure.core/defn- ser-listener [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Listener", :type "structure"} (clojure.core/contains? input :health-check) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-policy (input :health-check)) #:http.request.field{:name "healthCheck", :shape "HealthCheckPolicy"})) (clojure.core/contains? input :port-mapping) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-mapping (input :port-mapping)) #:http.request.field{:name "portMapping", :shape "PortMapping"}))))

(clojure.core/defn- ser-dns-service-discovery [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DnsServiceDiscovery", :type "structure"} (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-name (input :service-name)) #:http.request.field{:name "serviceName", :shape "ServiceName"}))))

(clojure.core/defn- ser-health-check-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-threshold (:healthy-threshold input)) #:http.request.field{:name "healthyThreshold", :shape "HealthCheckThreshold"}) (clojure.core/into (ser-health-check-interval-millis (:interval-millis input)) #:http.request.field{:name "intervalMillis", :shape "HealthCheckIntervalMillis"}) (clojure.core/into (ser-port-protocol (:protocol input)) #:http.request.field{:name "protocol", :shape "PortProtocol"}) (clojure.core/into (ser-health-check-timeout-millis (:timeout-millis input)) #:http.request.field{:name "timeoutMillis", :shape "HealthCheckTimeoutMillis"}) (clojure.core/into (ser-health-check-threshold (:unhealthy-threshold input)) #:http.request.field{:name "unhealthyThreshold", :shape "HealthCheckThreshold"})], :shape "HealthCheckPolicy", :type "structure"} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :path)) #:http.request.field{:name "path", :shape "String"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :port)) #:http.request.field{:name "port", :shape "PortNumber"}))))

(clojure.core/defn- ser-listeners [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-listener coll) #:http.request.field{:shape "Listener"}))) input), :shape "Listeners", :type "list"})

(clojure.core/defn- ser-service-discovery [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServiceDiscovery", :type "structure"} (clojure.core/contains? input :dns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-service-discovery (input :dns)) #:http.request.field{:name "dns", :shape "DnsServiceDiscovery"}))))

(clojure.core/defn- ser-health-check-threshold [input] #:http.request.field{:value input, :shape "HealthCheckThreshold"})

(clojure.core/defn- ser-port-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PortMapping", :type "structure"} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :port)) #:http.request.field{:name "port", :shape "PortNumber"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "PortProtocol"}))))

(clojure.core/defn- ser-service-name [input] #:http.request.field{:value input, :shape "ServiceName"})

(clojure.core/defn- ser-virtual-router-spec [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VirtualRouterSpec", :type "structure"} (clojure.core/contains? input :service-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-names (input :service-names)) #:http.request.field{:name "serviceNames", :shape "ServiceNames"}))))

(clojure.core/defn- ser-port-number [input] #:http.request.field{:value input, :shape "PortNumber"})

(clojure.core/defn- ser-virtual-node-spec [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VirtualNodeSpec", :type "structure"} (clojure.core/contains? input :backends) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-backends (input :backends)) #:http.request.field{:name "backends", :shape "Backends"})) (clojure.core/contains? input :listeners) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listeners (input :listeners)) #:http.request.field{:name "listeners", :shape "Listeners"})) (clojure.core/contains? input :service-discovery) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-discovery (input :service-discovery)) #:http.request.field{:name "serviceDiscovery", :shape "ServiceDiscovery"}))))

(clojure.core/defn- ser-http-route [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HttpRoute", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-route-action (input :action)) #:http.request.field{:name "action", :shape "HttpRouteAction"})) (clojure.core/contains? input :match) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-route-match (input :match)) #:http.request.field{:name "match", :shape "HttpRouteMatch"}))))

(clojure.core/defn- ser-list-meshes-limit [input] #:http.request.field{:value input, :shape "ListMeshesLimit"})

(clojure.core/defn- req-create-mesh-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-list-meshes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-meshes-limit (input :limit)) #:http.request.field{:name "limit", :shape "ListMeshesLimit", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-list-virtual-nodes-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-virtual-nodes-limit (input :limit)) #:http.request.field{:name "limit", :shape "ListVirtualNodesLimit", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-create-virtual-router-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})], :body [(clojure.core/into (ser-virtual-router-spec (input :spec)) #:http.request.field{:name "spec", :shape "VirtualRouterSpec"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-create-virtual-node-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})], :body [(clojure.core/into (ser-virtual-node-spec (input :spec)) #:http.request.field{:name "spec", :shape "VirtualNodeSpec"}) (clojure.core/into (ser-resource-name (input :virtual-node-name)) #:http.request.field{:name "virtualNodeName", :shape "ResourceName"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-describe-route-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :route-name)) #:http.request.field{:name "routeName", :shape "ResourceName", :location "uri", :location-name "routeName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})]}))

(clojure.core/defn- req-delete-virtual-router-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})]}))

(clojure.core/defn- req-create-route-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})], :body [(clojure.core/into (ser-resource-name (input :route-name)) #:http.request.field{:name "routeName", :shape "ResourceName"}) (clojure.core/into (ser-route-spec (input :spec)) #:http.request.field{:name "spec", :shape "RouteSpec"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-update-virtual-router-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})], :body [(clojure.core/into (ser-virtual-router-spec (input :spec)) #:http.request.field{:name "spec", :shape "VirtualRouterSpec"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-describe-virtual-node-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-node-name)) #:http.request.field{:name "virtualNodeName", :shape "ResourceName", :location "uri", :location-name "virtualNodeName"})]}))

(clojure.core/defn- req-delete-route-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :route-name)) #:http.request.field{:name "routeName", :shape "ResourceName", :location "uri", :location-name "routeName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})]}))

(clojure.core/defn- req-update-virtual-node-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-node-name)) #:http.request.field{:name "virtualNodeName", :shape "ResourceName", :location "uri", :location-name "virtualNodeName"})], :body [(clojure.core/into (ser-virtual-node-spec (input :spec)) #:http.request.field{:name "spec", :shape "VirtualNodeSpec"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-delete-mesh-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})]}))

(clojure.core/defn- req-update-route-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :route-name)) #:http.request.field{:name "routeName", :shape "ResourceName", :location "uri", :location-name "routeName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})], :body [(clojure.core/into (ser-route-spec (input :spec)) #:http.request.field{:name "spec", :shape "RouteSpec"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-delete-virtual-node-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-node-name)) #:http.request.field{:name "virtualNodeName", :shape "ResourceName", :location "uri", :location-name "virtualNodeName"})]}))

(clojure.core/defn- req-describe-virtual-router-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})]}))

(clojure.core/defn- req-list-virtual-routers-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-virtual-routers-limit (input :limit)) #:http.request.field{:name "limit", :shape "ListVirtualRoutersLimit", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-describe-mesh-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"})]}))

(clojure.core/defn- req-list-routes-input [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-name (input :mesh-name)) #:http.request.field{:name "meshName", :shape "ResourceName", :location "uri", :location-name "meshName"}) (clojure.core/into (ser-resource-name (input :virtual-router-name)) #:http.request.field{:name "virtualRouterName", :shape "ResourceName", :location "uri", :location-name "virtualRouterName"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-routes-limit (input :limit)) #:http.request.field{:name "limit", :shape "ListRoutesLimit", :location "querystring", :location-name "limit"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/declare deser-http-route-action)

(clojure.core/declare deser-virtual-node-ref)

(clojure.core/declare deser-backends)

(clojure.core/declare deser-virtual-router-status-code)

(clojure.core/declare deser-http-route-match)

(clojure.core/declare deser-route-status-code)

(clojure.core/declare deser-health-check-interval-millis)

(clojure.core/declare deser-route-spec)

(clojure.core/declare deser-resource-metadata)

(clojure.core/declare deser-weighted-targets)

(clojure.core/declare deser-route-data)

(clojure.core/declare deser-virtual-node-data)

(clojure.core/declare deser-mesh-ref)

(clojure.core/declare deser-weighted-target)

(clojure.core/declare deser-virtual-router-ref)

(clojure.core/declare deser-mesh-status-code)

(clojure.core/declare deser-port-protocol)

(clojure.core/declare deser-percent-int)

(clojure.core/declare deser-service-names)

(clojure.core/declare deser-route-list)

(clojure.core/declare deser-health-check-timeout-millis)

(clojure.core/declare deser-route-status)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-virtual-router-list)

(clojure.core/declare deser-listener)

(clojure.core/declare deser-dns-service-discovery)

(clojure.core/declare deser-health-check-policy)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-virtual-node-status)

(clojure.core/declare deser-virtual-router-status)

(clojure.core/declare deser-listeners)

(clojure.core/declare deser-long)

(clojure.core/declare deser-mesh-status)

(clojure.core/declare deser-service-discovery)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-health-check-threshold)

(clojure.core/declare deser-mesh-data)

(clojure.core/declare deser-port-mapping)

(clojure.core/declare deser-service-name)

(clojure.core/declare deser-mesh-list)

(clojure.core/declare deser-virtual-router-spec)

(clojure.core/declare deser-route-ref)

(clojure.core/declare deser-virtual-node-list)

(clojure.core/declare deser-port-number)

(clojure.core/declare deser-virtual-node-spec)

(clojure.core/declare deser-http-route)

(clojure.core/declare deser-virtual-router-data)

(clojure.core/declare deser-virtual-node-status-code)

(clojure.core/defn- deser-http-route-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "weightedTargets") (clojure.core/assoc :weighted-targets (deser-weighted-targets (input "weightedTargets")))))

(clojure.core/defn- deser-virtual-node-ref [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "meshName") (clojure.core/assoc :mesh-name (deser-resource-name (input "meshName"))) (clojure.core/contains? input "virtualNodeName") (clojure.core/assoc :virtual-node-name (deser-resource-name (input "virtualNodeName")))))

(clojure.core/defn- deser-backends [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-name coll))) input))

(clojure.core/defn- deser-virtual-router-status-code [input] (clojure.core/get {"ACTIVE" :active, "DELETED" :deleted, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-http-route-match [input] (clojure.core/cond-> {} (clojure.core/contains? input "prefix") (clojure.core/assoc :prefix (deser-string (input "prefix")))))

(clojure.core/defn- deser-route-status-code [input] (clojure.core/get {"ACTIVE" :active, "DELETED" :deleted, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-health-check-interval-millis [input] input)

(clojure.core/defn- deser-route-spec [input] (clojure.core/cond-> {} (clojure.core/contains? input "httpRoute") (clojure.core/assoc :http-route (deser-http-route (input "httpRoute")))))

(clojure.core/defn- deser-resource-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-timestamp (input "lastUpdatedAt"))) (clojure.core/contains? input "uid") (clojure.core/assoc :uid (deser-string (input "uid"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-long (input "version")))))

(clojure.core/defn- deser-weighted-targets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-weighted-target coll))) input))

(clojure.core/defn- deser-route-data [input] (clojure.core/cond-> {:mesh-name (deser-resource-name (input "meshName")), :route-name (deser-resource-name (input "routeName")), :virtual-router-name (deser-resource-name (input "virtualRouterName"))} (clojure.core/contains? input "metadata") (clojure.core/assoc :metadata (deser-resource-metadata (input "metadata"))) (clojure.core/contains? input "spec") (clojure.core/assoc :spec (deser-route-spec (input "spec"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-route-status (input "status")))))

(clojure.core/defn- deser-virtual-node-data [input] (clojure.core/cond-> {:mesh-name (deser-resource-name (input "meshName")), :virtual-node-name (deser-resource-name (input "virtualNodeName"))} (clojure.core/contains? input "metadata") (clojure.core/assoc :metadata (deser-resource-metadata (input "metadata"))) (clojure.core/contains? input "spec") (clojure.core/assoc :spec (deser-virtual-node-spec (input "spec"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-virtual-node-status (input "status")))))

(clojure.core/defn- deser-mesh-ref [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "meshName") (clojure.core/assoc :mesh-name (deser-resource-name (input "meshName")))))

(clojure.core/defn- deser-weighted-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "virtualNode") (clojure.core/assoc :virtual-node (deser-resource-name (input "virtualNode"))) (clojure.core/contains? input "weight") (clojure.core/assoc :weight (deser-percent-int (input "weight")))))

(clojure.core/defn- deser-virtual-router-ref [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "meshName") (clojure.core/assoc :mesh-name (deser-resource-name (input "meshName"))) (clojure.core/contains? input "virtualRouterName") (clojure.core/assoc :virtual-router-name (deser-resource-name (input "virtualRouterName")))))

(clojure.core/defn- deser-mesh-status-code [input] (clojure.core/get {"ACTIVE" :active, "DELETED" :deleted, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-port-protocol [input] (clojure.core/get {"http" :http, "tcp" :tcp} input))

(clojure.core/defn- deser-percent-int [input] input)

(clojure.core/defn- deser-service-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-name coll))) input))

(clojure.core/defn- deser-route-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-route-ref coll))) input))

(clojure.core/defn- deser-health-check-timeout-millis [input] input)

(clojure.core/defn- deser-route-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-route-status-code (input "status")))))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-virtual-router-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-virtual-router-ref coll))) input))

(clojure.core/defn- deser-listener [input] (clojure.core/cond-> {} (clojure.core/contains? input "healthCheck") (clojure.core/assoc :health-check (deser-health-check-policy (input "healthCheck"))) (clojure.core/contains? input "portMapping") (clojure.core/assoc :port-mapping (deser-port-mapping (input "portMapping")))))

(clojure.core/defn- deser-dns-service-discovery [input] (clojure.core/cond-> {} (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-service-name (input "serviceName")))))

(clojure.core/defn- deser-health-check-policy [input] (clojure.core/cond-> {:healthy-threshold (deser-health-check-threshold (input "healthyThreshold")), :interval-millis (deser-health-check-interval-millis (input "intervalMillis")), :protocol (deser-port-protocol (input "protocol")), :timeout-millis (deser-health-check-timeout-millis (input "timeoutMillis")), :unhealthy-threshold (deser-health-check-threshold (input "unhealthyThreshold"))} (clojure.core/contains? input "path") (clojure.core/assoc :path (deser-string (input "path"))) (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-port-number (input "port")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-virtual-node-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-virtual-node-status-code (input "status")))))

(clojure.core/defn- deser-virtual-router-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-virtual-router-status-code (input "status")))))

(clojure.core/defn- deser-listeners [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-mesh-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-mesh-status-code (input "status")))))

(clojure.core/defn- deser-service-discovery [input] (clojure.core/cond-> {} (clojure.core/contains? input "dns") (clojure.core/assoc :dns (deser-dns-service-discovery (input "dns")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-health-check-threshold [input] input)

(clojure.core/defn- deser-mesh-data [input] (clojure.core/cond-> {:mesh-name (deser-resource-name (input "meshName")), :metadata (deser-resource-metadata (input "metadata"))} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-mesh-status (input "status")))))

(clojure.core/defn- deser-port-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-port-number (input "port"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-port-protocol (input "protocol")))))

(clojure.core/defn- deser-service-name [input] input)

(clojure.core/defn- deser-mesh-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mesh-ref coll))) input))

(clojure.core/defn- deser-virtual-router-spec [input] (clojure.core/cond-> {} (clojure.core/contains? input "serviceNames") (clojure.core/assoc :service-names (deser-service-names (input "serviceNames")))))

(clojure.core/defn- deser-route-ref [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "meshName") (clojure.core/assoc :mesh-name (deser-resource-name (input "meshName"))) (clojure.core/contains? input "routeName") (clojure.core/assoc :route-name (deser-resource-name (input "routeName"))) (clojure.core/contains? input "virtualRouterName") (clojure.core/assoc :virtual-router-name (deser-resource-name (input "virtualRouterName")))))

(clojure.core/defn- deser-virtual-node-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-virtual-node-ref coll))) input))

(clojure.core/defn- deser-port-number [input] input)

(clojure.core/defn- deser-virtual-node-spec [input] (clojure.core/cond-> {} (clojure.core/contains? input "backends") (clojure.core/assoc :backends (deser-backends (input "backends"))) (clojure.core/contains? input "listeners") (clojure.core/assoc :listeners (deser-listeners (input "listeners"))) (clojure.core/contains? input "serviceDiscovery") (clojure.core/assoc :service-discovery (deser-service-discovery (input "serviceDiscovery")))))

(clojure.core/defn- deser-http-route [input] (clojure.core/cond-> {} (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-http-route-action (input "action"))) (clojure.core/contains? input "match") (clojure.core/assoc :match (deser-http-route-match (input "match")))))

(clojure.core/defn- deser-virtual-router-data [input] (clojure.core/cond-> {:mesh-name (deser-resource-name (input "meshName")), :virtual-router-name (deser-resource-name (input "virtualRouterName"))} (clojure.core/contains? input "metadata") (clojure.core/assoc :metadata (deser-resource-metadata (input "metadata"))) (clojure.core/contains? input "spec") (clojure.core/assoc :spec (deser-virtual-router-spec (input "spec"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-virtual-router-status (input "status")))))

(clojure.core/defn- deser-virtual-node-status-code [input] (clojure.core/get {"ACTIVE" :active, "DELETED" :deleted, "INACTIVE" :inactive} input))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1044455 input] (clojure.core/let [rawinput1044454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044456 {"message" (rawinput1044454 "message")}] (clojure.core/cond-> {} (letvar1044456 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044456 ["message"])))))))

(clojure.core/defn- response-list-routes-output ([input] (response-list-routes-output nil input)) ([resultWrapper1044458 input] (clojure.core/let [rawinput1044457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044459 {"nextToken" (rawinput1044457 "nextToken"), "routes" (rawinput1044457 "routes")}] (clojure.core/cond-> {:routes (deser-route-list (clojure.core/get-in letvar1044459 ["routes"]))} (letvar1044459 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1044459 ["nextToken"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1044461 input] (clojure.core/let [rawinput1044460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044462 {"message" (rawinput1044460 "message")}] (clojure.core/cond-> {} (letvar1044462 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044462 ["message"])))))))

(clojure.core/defn- response-list-meshes-output ([input] (response-list-meshes-output nil input)) ([resultWrapper1044464 input] (clojure.core/let [rawinput1044463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044465 {"meshes" (rawinput1044463 "meshes"), "nextToken" (rawinput1044463 "nextToken")}] (clojure.core/cond-> {:meshes (deser-mesh-list (clojure.core/get-in letvar1044465 ["meshes"]))} (letvar1044465 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1044465 ["nextToken"])))))))

(clojure.core/defn- response-update-route-output ([input] (response-update-route-output nil input)) ([resultWrapper1044467 input] (clojure.core/let [rawinput1044466 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044468 {"route" (rawinput1044466 "route")}] (clojure.core/cond-> {} (letvar1044468 "route") (clojure.core/assoc :route (deser-route-data (clojure.core/get-in letvar1044468 ["route"])))))))

(clojure.core/defn- response-create-virtual-router-output ([input] (response-create-virtual-router-output nil input)) ([resultWrapper1044470 input] (clojure.core/let [rawinput1044469 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044471 {"virtualRouter" (rawinput1044469 "virtualRouter")}] (clojure.core/cond-> {} (letvar1044471 "virtualRouter") (clojure.core/assoc :virtual-router (deser-virtual-router-data (clojure.core/get-in letvar1044471 ["virtualRouter"])))))))

(clojure.core/defn- response-delete-virtual-node-output ([input] (response-delete-virtual-node-output nil input)) ([resultWrapper1044473 input] (clojure.core/let [rawinput1044472 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044474 {"virtualNode" (rawinput1044472 "virtualNode")}] (clojure.core/cond-> {} (letvar1044474 "virtualNode") (clojure.core/assoc :virtual-node (deser-virtual-node-data (clojure.core/get-in letvar1044474 ["virtualNode"])))))))

(clojure.core/defn- response-delete-route-output ([input] (response-delete-route-output nil input)) ([resultWrapper1044476 input] (clojure.core/let [rawinput1044475 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044477 {"route" (rawinput1044475 "route")}] (clojure.core/cond-> {} (letvar1044477 "route") (clojure.core/assoc :route (deser-route-data (clojure.core/get-in letvar1044477 ["route"])))))))

(clojure.core/defn- response-forbidden-exception ([input] (response-forbidden-exception nil input)) ([resultWrapper1044479 input] (clojure.core/let [rawinput1044478 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044480 {"message" (rawinput1044478 "message")}] (clojure.core/cond-> {} (letvar1044480 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044480 ["message"])))))))

(clojure.core/defn- response-describe-route-output ([input] (response-describe-route-output nil input)) ([resultWrapper1044482 input] (clojure.core/let [rawinput1044481 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044483 {"route" (rawinput1044481 "route")}] (clojure.core/cond-> {} (letvar1044483 "route") (clojure.core/assoc :route (deser-route-data (clojure.core/get-in letvar1044483 ["route"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1044485 input] (clojure.core/let [rawinput1044484 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044486 {"message" (rawinput1044484 "message")}] (clojure.core/cond-> {} (letvar1044486 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044486 ["message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1044488 input] (clojure.core/let [rawinput1044487 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044489 {"message" (rawinput1044487 "message")}] (clojure.core/cond-> {} (letvar1044489 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044489 ["message"])))))))

(clojure.core/defn- response-update-virtual-node-output ([input] (response-update-virtual-node-output nil input)) ([resultWrapper1044491 input] (clojure.core/let [rawinput1044490 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044492 {"virtualNode" (rawinput1044490 "virtualNode")}] (clojure.core/cond-> {} (letvar1044492 "virtualNode") (clojure.core/assoc :virtual-node (deser-virtual-node-data (clojure.core/get-in letvar1044492 ["virtualNode"])))))))

(clojure.core/defn- response-update-virtual-router-output ([input] (response-update-virtual-router-output nil input)) ([resultWrapper1044494 input] (clojure.core/let [rawinput1044493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044495 {"virtualRouter" (rawinput1044493 "virtualRouter")}] (clojure.core/cond-> {} (letvar1044495 "virtualRouter") (clojure.core/assoc :virtual-router (deser-virtual-router-data (clojure.core/get-in letvar1044495 ["virtualRouter"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1044497 input] (clojure.core/let [rawinput1044496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044498 {"message" (rawinput1044496 "message")}] (clojure.core/cond-> {} (letvar1044498 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044498 ["message"])))))))

(clojure.core/defn- response-list-virtual-routers-output ([input] (response-list-virtual-routers-output nil input)) ([resultWrapper1044500 input] (clojure.core/let [rawinput1044499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044501 {"nextToken" (rawinput1044499 "nextToken"), "virtualRouters" (rawinput1044499 "virtualRouters")}] (clojure.core/cond-> {:virtual-routers (deser-virtual-router-list (clojure.core/get-in letvar1044501 ["virtualRouters"]))} (letvar1044501 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1044501 ["nextToken"])))))))

(clojure.core/defn- response-create-route-output ([input] (response-create-route-output nil input)) ([resultWrapper1044503 input] (clojure.core/let [rawinput1044502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044504 {"route" (rawinput1044502 "route")}] (clojure.core/cond-> {} (letvar1044504 "route") (clojure.core/assoc :route (deser-route-data (clojure.core/get-in letvar1044504 ["route"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1044506 input] (clojure.core/let [rawinput1044505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044507 {"message" (rawinput1044505 "message")}] (clojure.core/cond-> {} (letvar1044507 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044507 ["message"])))))))

(clojure.core/defn- response-describe-virtual-node-output ([input] (response-describe-virtual-node-output nil input)) ([resultWrapper1044509 input] (clojure.core/let [rawinput1044508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044510 {"virtualNode" (rawinput1044508 "virtualNode")}] (clojure.core/cond-> {} (letvar1044510 "virtualNode") (clojure.core/assoc :virtual-node (deser-virtual-node-data (clojure.core/get-in letvar1044510 ["virtualNode"])))))))

(clojure.core/defn- response-describe-virtual-router-output ([input] (response-describe-virtual-router-output nil input)) ([resultWrapper1044512 input] (clojure.core/let [rawinput1044511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044513 {"virtualRouter" (rawinput1044511 "virtualRouter")}] (clojure.core/cond-> {} (letvar1044513 "virtualRouter") (clojure.core/assoc :virtual-router (deser-virtual-router-data (clojure.core/get-in letvar1044513 ["virtualRouter"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1044515 input] (clojure.core/let [rawinput1044514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044516 {"message" (rawinput1044514 "message")}] (clojure.core/cond-> {} (letvar1044516 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044516 ["message"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1044518 input] (clojure.core/let [rawinput1044517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044519 {"message" (rawinput1044517 "message")}] (clojure.core/cond-> {} (letvar1044519 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1044519 ["message"])))))))

(clojure.core/defn- response-list-virtual-nodes-output ([input] (response-list-virtual-nodes-output nil input)) ([resultWrapper1044521 input] (clojure.core/let [rawinput1044520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044522 {"nextToken" (rawinput1044520 "nextToken"), "virtualNodes" (rawinput1044520 "virtualNodes")}] (clojure.core/cond-> {:virtual-nodes (deser-virtual-node-list (clojure.core/get-in letvar1044522 ["virtualNodes"]))} (letvar1044522 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1044522 ["nextToken"])))))))

(clojure.core/defn- response-create-mesh-output ([input] (response-create-mesh-output nil input)) ([resultWrapper1044524 input] (clojure.core/let [rawinput1044523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044525 {"mesh" (rawinput1044523 "mesh")}] (clojure.core/cond-> {} (letvar1044525 "mesh") (clojure.core/assoc :mesh (deser-mesh-data (clojure.core/get-in letvar1044525 ["mesh"])))))))

(clojure.core/defn- response-create-virtual-node-output ([input] (response-create-virtual-node-output nil input)) ([resultWrapper1044527 input] (clojure.core/let [rawinput1044526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044528 {"virtualNode" (rawinput1044526 "virtualNode")}] (clojure.core/cond-> {} (letvar1044528 "virtualNode") (clojure.core/assoc :virtual-node (deser-virtual-node-data (clojure.core/get-in letvar1044528 ["virtualNode"])))))))

(clojure.core/defn- response-describe-mesh-output ([input] (response-describe-mesh-output nil input)) ([resultWrapper1044530 input] (clojure.core/let [rawinput1044529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044531 {"mesh" (rawinput1044529 "mesh")}] (clojure.core/cond-> {} (letvar1044531 "mesh") (clojure.core/assoc :mesh (deser-mesh-data (clojure.core/get-in letvar1044531 ["mesh"])))))))

(clojure.core/defn- response-delete-virtual-router-output ([input] (response-delete-virtual-router-output nil input)) ([resultWrapper1044533 input] (clojure.core/let [rawinput1044532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044534 {"virtualRouter" (rawinput1044532 "virtualRouter")}] (clojure.core/cond-> {} (letvar1044534 "virtualRouter") (clojure.core/assoc :virtual-router (deser-virtual-router-data (clojure.core/get-in letvar1044534 ["virtualRouter"])))))))

(clojure.core/defn- response-delete-mesh-output ([input] (response-delete-mesh-output nil input)) ([resultWrapper1044536 input] (clojure.core/let [rawinput1044535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1044537 {"mesh" (rawinput1044535 "mesh")}] (clojure.core/cond-> {} (letvar1044537 "mesh") (clojure.core/assoc :mesh (deser-mesh-data (clojure.core/get-in letvar1044537 ["mesh"])))))))

(clojure.spec.alpha/def :portkey.aws.appmesh.http-route-action/weighted-targets (clojure.spec.alpha/and :portkey.aws.appmesh/weighted-targets))
(clojure.spec.alpha/def :portkey.aws.appmesh/http-route-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.http-route-action/weighted-targets]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-mesh-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-mesh-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-mesh-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.create-mesh-input/mesh-name] :opt-un [:portkey.aws.appmesh.create-mesh-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-output/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-output/routes (clojure.spec.alpha/and :portkey.aws.appmesh/route-list))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-routes-output (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-routes-output/routes] :opt-un [:portkey.aws.appmesh.list-routes-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-ref/arn (clojure.spec.alpha/and :portkey.aws.appmesh/arn))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-ref/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-ref/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-ref (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-node-ref/arn :portkey.aws.appmesh.virtual-node-ref/mesh-name :portkey.aws.appmesh.virtual-node-ref/virtual-node-name]))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-meshes-input/limit (clojure.spec.alpha/and :portkey.aws.appmesh/list-meshes-limit))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-meshes-input/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-meshes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.list-meshes-input/limit :portkey.aws.appmesh.list-meshes-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh/backends (clojure.spec.alpha/coll-of :portkey.aws.appmesh/service-name))

(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-status-code #{:inactive :deleted :active "INACTIVE" "ACTIVE" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.appmesh.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-nodes-input/limit (clojure.spec.alpha/and :portkey.aws.appmesh/list-virtual-nodes-limit))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-nodes-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-nodes-input/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-nodes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-virtual-nodes-input/mesh-name] :opt-un [:portkey.aws.appmesh.list-virtual-nodes-input/limit :portkey.aws.appmesh.list-virtual-nodes-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-meshes-output/meshes (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-list))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-meshes-output/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-meshes-output (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-meshes-output/meshes] :opt-un [:portkey.aws.appmesh.list-meshes-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-output/route (clojure.spec.alpha/and :portkey.aws.appmesh/route-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-route-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.update-route-output/route]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-router-output/virtual-router (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-virtual-router-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.create-virtual-router-output/virtual-router]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-node-output/virtual-node (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-virtual-node-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.delete-virtual-node-output/virtual-node]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-router-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-router-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-router-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-router-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-virtual-router-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.create-virtual-router-input/mesh-name :portkey.aws.appmesh.create-virtual-router-input/spec :portkey.aws.appmesh.create-virtual-router-input/virtual-router-name] :opt-un [:portkey.aws.appmesh.create-virtual-router-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-route-output/route (clojure.spec.alpha/and :portkey.aws.appmesh/route-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-route-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.delete-route-output/route]))

(clojure.spec.alpha/def :portkey.aws.appmesh.http-route-match/prefix (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/http-route-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.http-route-match/prefix]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-node-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-node-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-node-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-node-input/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-virtual-node-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.create-virtual-node-input/mesh-name :portkey.aws.appmesh.create-virtual-node-input/spec :portkey.aws.appmesh.create-virtual-node-input/virtual-node-name] :opt-un [:portkey.aws.appmesh.create-virtual-node-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh/route-status-code #{:inactive :deleted :active "INACTIVE" "ACTIVE" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.appmesh.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-route-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.describe-route-input/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.describe-route-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-route-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.describe-route-input/mesh-name :portkey.aws.appmesh.describe-route-input/route-name :portkey.aws.appmesh.describe-route-input/virtual-router-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh/health-check-interval-millis clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-router-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-router-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-virtual-router-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.delete-virtual-router-input/mesh-name :portkey.aws.appmesh.delete-virtual-router-input/virtual-router-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.route-spec/http-route (clojure.spec.alpha/and :portkey.aws.appmesh/http-route))
(clojure.spec.alpha/def :portkey.aws.appmesh/route-spec (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.route-spec/http-route]))

(clojure.spec.alpha/def :portkey.aws.appmesh.resource-metadata/arn (clojure.spec.alpha/and :portkey.aws.appmesh/arn))
(clojure.spec.alpha/def :portkey.aws.appmesh.resource-metadata/created-at (clojure.spec.alpha/and :portkey.aws.appmesh/timestamp))
(clojure.spec.alpha/def :portkey.aws.appmesh.resource-metadata/last-updated-at (clojure.spec.alpha/and :portkey.aws.appmesh/timestamp))
(clojure.spec.alpha/def :portkey.aws.appmesh.resource-metadata/uid (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.resource-metadata/version (clojure.spec.alpha/and :portkey.aws.appmesh/long))
(clojure.spec.alpha/def :portkey.aws.appmesh/resource-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.resource-metadata/arn :portkey.aws.appmesh.resource-metadata/created-at :portkey.aws.appmesh.resource-metadata/last-updated-at :portkey.aws.appmesh.resource-metadata/uid :portkey.aws.appmesh.resource-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.appmesh/weighted-targets (clojure.spec.alpha/coll-of :portkey.aws.appmesh/weighted-target))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-input/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/route-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-route-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.create-route-input/mesh-name :portkey.aws.appmesh.create-route-input/route-name :portkey.aws.appmesh.create-route-input/spec :portkey.aws.appmesh.create-route-input/virtual-router-name] :opt-un [:portkey.aws.appmesh.create-route-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/metadata (clojure.spec.alpha/and :portkey.aws.appmesh/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/spec (clojure.spec.alpha/and :portkey.aws.appmesh/route-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/status (clojure.spec.alpha/and :portkey.aws.appmesh/route-status))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-data/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/route-data (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.route-data/mesh-name :portkey.aws.appmesh.route-data/route-name :portkey.aws.appmesh.route-data/virtual-router-name] :opt-un [:portkey.aws.appmesh.route-data/metadata :portkey.aws.appmesh.route-data/spec :portkey.aws.appmesh.route-data/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-route-output/route (clojure.spec.alpha/and :portkey.aws.appmesh/route-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-route-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.describe-route-output/route]))

(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-routers-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.appmesh.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-data/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-data/metadata (clojure.spec.alpha/and :portkey.aws.appmesh/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-data/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-data/status (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-status))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-data/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-data (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.virtual-node-data/mesh-name :portkey.aws.appmesh.virtual-node-data/virtual-node-name] :opt-un [:portkey.aws.appmesh.virtual-node-data/metadata :portkey.aws.appmesh.virtual-node-data/spec :portkey.aws.appmesh.virtual-node-data/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-nodes-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-router-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-router-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-router-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-router-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-virtual-router-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.update-virtual-router-input/mesh-name :portkey.aws.appmesh.update-virtual-router-input/spec :portkey.aws.appmesh.update-virtual-router-input/virtual-router-name] :opt-un [:portkey.aws.appmesh.update-virtual-router-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-node-output/virtual-node (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-virtual-node-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.update-virtual-node-output/virtual-node]))

(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-ref/arn (clojure.spec.alpha/and :portkey.aws.appmesh/arn))
(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-ref/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/mesh-ref (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.mesh-ref/arn :portkey.aws.appmesh.mesh-ref/mesh-name]))

(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-router-output/virtual-router (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-virtual-router-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.update-virtual-router-output/virtual-router]))

(clojure.spec.alpha/def :portkey.aws.appmesh.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.weighted-target/virtual-node (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.weighted-target/weight (clojure.spec.alpha/and :portkey.aws.appmesh/percent-int))
(clojure.spec.alpha/def :portkey.aws.appmesh/weighted-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.weighted-target/virtual-node :portkey.aws.appmesh.weighted-target/weight]))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-routers-output/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-routers-output/virtual-routers (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-list))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-routers-output (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-virtual-routers-output/virtual-routers] :opt-un [:portkey.aws.appmesh.list-virtual-routers-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-route-output/route (clojure.spec.alpha/and :portkey.aws.appmesh/route-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-route-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.create-route-output/route]))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-ref/arn (clojure.spec.alpha/and :portkey.aws.appmesh/arn))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-ref/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-ref/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-ref (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-router-ref/arn :portkey.aws.appmesh.virtual-router-ref/mesh-name :portkey.aws.appmesh.virtual-router-ref/virtual-router-name]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-node-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-node-input/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-virtual-node-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.describe-virtual-node-input/mesh-name :portkey.aws.appmesh.describe-virtual-node-input/virtual-node-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh/mesh-status-code #{:inactive :deleted :active "INACTIVE" "ACTIVE" "DELETED"})

(clojure.spec.alpha/def :portkey.aws.appmesh.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-route-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.delete-route-input/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.delete-route-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-route-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.delete-route-input/mesh-name :portkey.aws.appmesh.delete-route-input/route-name :portkey.aws.appmesh.delete-route-input/virtual-router-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-node-output/virtual-node (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-virtual-node-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.describe-virtual-node-output/virtual-node]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-router-output/virtual-router (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-virtual-router-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.describe-virtual-router-output/virtual-router]))

(clojure.spec.alpha/def :portkey.aws.appmesh/port-protocol #{:tcp "http" :http "tcp"})

(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-node-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-node-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-node-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-virtual-node-input/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-virtual-node-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.update-virtual-node-input/mesh-name :portkey.aws.appmesh.update-virtual-node-input/spec :portkey.aws.appmesh.update-virtual-node-input/virtual-node-name] :opt-un [:portkey.aws.appmesh.update-virtual-node-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh/percent-int (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.appmesh.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh/service-names (clojure.spec.alpha/coll-of :portkey.aws.appmesh/service-name :max-count 10))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-mesh-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-mesh-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.delete-mesh-input/mesh-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-input/client-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-input/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-input/spec (clojure.spec.alpha/and :portkey.aws.appmesh/route-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.update-route-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/update-route-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.update-route-input/mesh-name :portkey.aws.appmesh.update-route-input/route-name :portkey.aws.appmesh.update-route-input/spec :portkey.aws.appmesh.update-route-input/virtual-router-name] :opt-un [:portkey.aws.appmesh.update-route-input/client-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh/route-list (clojure.spec.alpha/coll-of :portkey.aws.appmesh/route-ref))

(clojure.spec.alpha/def :portkey.aws.appmesh.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.appmesh/health-check-timeout-millis clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appmesh.route-status/status (clojure.spec.alpha/and :portkey.aws.appmesh/route-status-code))
(clojure.spec.alpha/def :portkey.aws.appmesh/route-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.route-status/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.appmesh/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appmesh/list-routes-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-list (clojure.spec.alpha/coll-of :portkey.aws.appmesh/virtual-router-ref))

(clojure.spec.alpha/def :portkey.aws.appmesh.listener/health-check (clojure.spec.alpha/and :portkey.aws.appmesh/health-check-policy))
(clojure.spec.alpha/def :portkey.aws.appmesh.listener/port-mapping (clojure.spec.alpha/and :portkey.aws.appmesh/port-mapping))
(clojure.spec.alpha/def :portkey.aws.appmesh/listener (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.listener/health-check :portkey.aws.appmesh.listener/port-mapping]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-node-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-node-input/virtual-node-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-virtual-node-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.delete-virtual-node-input/mesh-name :portkey.aws.appmesh.delete-virtual-node-input/virtual-node-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.dns-service-discovery/service-name (clojure.spec.alpha/and :portkey.aws.appmesh/service-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/dns-service-discovery (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.dns-service-discovery/service-name]))

(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/healthy-threshold (clojure.spec.alpha/and :portkey.aws.appmesh/health-check-threshold))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/interval-millis (clojure.spec.alpha/and :portkey.aws.appmesh/health-check-interval-millis))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/path (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/port (clojure.spec.alpha/and :portkey.aws.appmesh/port-number))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/protocol (clojure.spec.alpha/and :portkey.aws.appmesh/port-protocol))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/timeout-millis (clojure.spec.alpha/and :portkey.aws.appmesh/health-check-timeout-millis))
(clojure.spec.alpha/def :portkey.aws.appmesh.health-check-policy/unhealthy-threshold (clojure.spec.alpha/and :portkey.aws.appmesh/health-check-threshold))
(clojure.spec.alpha/def :portkey.aws.appmesh/health-check-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.health-check-policy/healthy-threshold :portkey.aws.appmesh.health-check-policy/interval-millis :portkey.aws.appmesh.health-check-policy/protocol :portkey.aws.appmesh.health-check-policy/timeout-millis :portkey.aws.appmesh.health-check-policy/unhealthy-threshold] :opt-un [:portkey.aws.appmesh.health-check-policy/path :portkey.aws.appmesh.health-check-policy/port]))

(clojure.spec.alpha/def :portkey.aws.appmesh/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-status/status (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-status-code))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-node-status/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-status/status (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-status-code))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-router-status/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh/listeners (clojure.spec.alpha/coll-of :portkey.aws.appmesh/listener))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-nodes-output/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-nodes-output/virtual-nodes (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-list))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-nodes-output (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-virtual-nodes-output/virtual-nodes] :opt-un [:portkey.aws.appmesh.list-virtual-nodes-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.appmesh.create-mesh-output/mesh (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-mesh-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.create-mesh-output/mesh]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-router-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.describe-virtual-router-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-virtual-router-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.describe-virtual-router-input/mesh-name :portkey.aws.appmesh.describe-virtual-router-input/virtual-router-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-routers-input/limit (clojure.spec.alpha/and :portkey.aws.appmesh/list-virtual-routers-limit))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-routers-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-virtual-routers-input/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-virtual-routers-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-virtual-routers-input/mesh-name] :opt-un [:portkey.aws.appmesh.list-virtual-routers-input/limit :portkey.aws.appmesh.list-virtual-routers-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-status/status (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-status-code))
(clojure.spec.alpha/def :portkey.aws.appmesh/mesh-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.mesh-status/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh.create-virtual-node-output/virtual-node (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-node-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/create-virtual-node-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.create-virtual-node-output/virtual-node]))

(clojure.spec.alpha/def :portkey.aws.appmesh.service-discovery/dns (clojure.spec.alpha/and :portkey.aws.appmesh/dns-service-discovery))
(clojure.spec.alpha/def :portkey.aws.appmesh/service-discovery (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.service-discovery/dns]))

(clojure.spec.alpha/def :portkey.aws.appmesh/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.appmesh/health-check-threshold (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-data/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-data/metadata (clojure.spec.alpha/and :portkey.aws.appmesh/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.appmesh.mesh-data/status (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-status))
(clojure.spec.alpha/def :portkey.aws.appmesh/mesh-data (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.mesh-data/mesh-name :portkey.aws.appmesh.mesh-data/metadata] :opt-un [:portkey.aws.appmesh.mesh-data/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh.port-mapping/port (clojure.spec.alpha/and :portkey.aws.appmesh/port-number))
(clojure.spec.alpha/def :portkey.aws.appmesh.port-mapping/protocol (clojure.spec.alpha/and :portkey.aws.appmesh/port-protocol))
(clojure.spec.alpha/def :portkey.aws.appmesh/port-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.port-mapping/port :portkey.aws.appmesh.port-mapping/protocol]))

(clojure.spec.alpha/def :portkey.aws.appmesh/service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.appmesh/mesh-list (clojure.spec.alpha/coll-of :portkey.aws.appmesh/mesh-ref))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-mesh-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-mesh-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.describe-mesh-input/mesh-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-input/limit (clojure.spec.alpha/and :portkey.aws.appmesh/list-routes-limit))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-input/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-input/next-token (clojure.spec.alpha/and :portkey.aws.appmesh/string))
(clojure.spec.alpha/def :portkey.aws.appmesh.list-routes-input/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/list-routes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.list-routes-input/mesh-name :portkey.aws.appmesh.list-routes-input/virtual-router-name] :opt-un [:portkey.aws.appmesh.list-routes-input/limit :portkey.aws.appmesh.list-routes-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-spec/service-names (clojure.spec.alpha/and :portkey.aws.appmesh/service-names))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-spec (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-router-spec/service-names]))

(clojure.spec.alpha/def :portkey.aws.appmesh.route-ref/arn (clojure.spec.alpha/and :portkey.aws.appmesh/arn))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-ref/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-ref/route-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.route-ref/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/route-ref (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.route-ref/arn :portkey.aws.appmesh.route-ref/mesh-name :portkey.aws.appmesh.route-ref/route-name :portkey.aws.appmesh.route-ref/virtual-router-name]))

(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-list (clojure.spec.alpha/coll-of :portkey.aws.appmesh/virtual-node-ref))

(clojure.spec.alpha/def :portkey.aws.appmesh/port-number (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-spec/backends (clojure.spec.alpha/and :portkey.aws.appmesh/backends))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-spec/listeners (clojure.spec.alpha/and :portkey.aws.appmesh/listeners))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-node-spec/service-discovery (clojure.spec.alpha/and :portkey.aws.appmesh/service-discovery))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-spec (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.virtual-node-spec/backends :portkey.aws.appmesh.virtual-node-spec/listeners :portkey.aws.appmesh.virtual-node-spec/service-discovery]))

(clojure.spec.alpha/def :portkey.aws.appmesh.describe-mesh-output/mesh (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/describe-mesh-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.describe-mesh-output/mesh]))

(clojure.spec.alpha/def :portkey.aws.appmesh.http-route/action (clojure.spec.alpha/and :portkey.aws.appmesh/http-route-action))
(clojure.spec.alpha/def :portkey.aws.appmesh.http-route/match (clojure.spec.alpha/and :portkey.aws.appmesh/http-route-match))
(clojure.spec.alpha/def :portkey.aws.appmesh/http-route (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.http-route/action :portkey.aws.appmesh.http-route/match]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-virtual-router-output/virtual-router (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-virtual-router-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.delete-virtual-router-output/virtual-router]))

(clojure.spec.alpha/def :portkey.aws.appmesh.delete-mesh-output/mesh (clojure.spec.alpha/and :portkey.aws.appmesh/mesh-data))
(clojure.spec.alpha/def :portkey.aws.appmesh/delete-mesh-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.appmesh.delete-mesh-output/mesh]))

(clojure.spec.alpha/def :portkey.aws.appmesh/list-meshes-limit (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-data/mesh-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-data/metadata (clojure.spec.alpha/and :portkey.aws.appmesh/resource-metadata))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-data/spec (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-spec))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-data/status (clojure.spec.alpha/and :portkey.aws.appmesh/virtual-router-status))
(clojure.spec.alpha/def :portkey.aws.appmesh.virtual-router-data/virtual-router-name (clojure.spec.alpha/and :portkey.aws.appmesh/resource-name))
(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-router-data (clojure.spec.alpha/keys :req-un [:portkey.aws.appmesh.virtual-router-data/mesh-name :portkey.aws.appmesh.virtual-router-data/virtual-router-name] :opt-un [:portkey.aws.appmesh.virtual-router-data/metadata :portkey.aws.appmesh.virtual-router-data/spec :portkey.aws.appmesh.virtual-router-data/status]))

(clojure.spec.alpha/def :portkey.aws.appmesh/virtual-node-status-code #{:inactive :deleted :active "INACTIVE" "ACTIVE" "DELETED"})

(clojure.core/defn delete-virtual-router ([delete-virtual-router-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-virtual-router-input delete-virtual-router-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/delete-virtual-router-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouters/{virtualRouterName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/delete-virtual-router-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVirtualRouter", :http.request.configuration/output-deser-fn response-delete-virtual-router-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ResourceInUseException" :portkey.aws.appmesh/resource-in-use-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-router :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/delete-virtual-router-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/delete-virtual-router-output))

(clojure.core/defn list-routes ([list-routes-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-routes-input list-routes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/list-routes-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/list-routes-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRoutes", :http.request.configuration/output-deser-fn response-list-routes-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-routes :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/list-routes-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/list-routes-output))

(clojure.core/defn delete-mesh ([delete-mesh-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-mesh-input delete-mesh-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/delete-mesh-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/delete-mesh-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMesh", :http.request.configuration/output-deser-fn response-delete-mesh-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ResourceInUseException" :portkey.aws.appmesh/resource-in-use-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-mesh :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/delete-mesh-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/delete-mesh-output))

(clojure.core/defn describe-virtual-router ([describe-virtual-router-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-virtual-router-input describe-virtual-router-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/describe-virtual-router-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouters/{virtualRouterName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/describe-virtual-router-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualRouter", :http.request.configuration/output-deser-fn response-describe-virtual-router-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-router :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/describe-virtual-router-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/describe-virtual-router-output))

(clojure.core/defn create-virtual-router ([create-virtual-router-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-virtual-router-input create-virtual-router-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/create-virtual-router-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouters", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/create-virtual-router-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateVirtualRouter", :http.request.configuration/output-deser-fn response-create-virtual-router-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-virtual-router :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/create-virtual-router-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/create-virtual-router-output))

(clojure.core/defn create-route ([create-route-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-route-input create-route-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/create-route-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/create-route-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRoute", :http.request.configuration/output-deser-fn response-create-route-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-route :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/create-route-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/create-route-output))

(clojure.core/defn list-meshes ([] (list-meshes {})) ([list-meshes-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-meshes-input list-meshes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/list-meshes-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/list-meshes-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMeshes", :http.request.configuration/output-deser-fn response-list-meshes-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-meshes :args (clojure.spec.alpha/? :portkey.aws.appmesh/list-meshes-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/list-meshes-output))

(clojure.core/defn update-virtual-router ([update-virtual-router-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-virtual-router-input update-virtual-router-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/update-virtual-router-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouters/{virtualRouterName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/update-virtual-router-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVirtualRouter", :http.request.configuration/output-deser-fn response-update-virtual-router-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-virtual-router :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/update-virtual-router-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/update-virtual-router-output))

(clojure.core/defn list-virtual-nodes ([list-virtual-nodes-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-virtual-nodes-input list-virtual-nodes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/list-virtual-nodes-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualNodes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/list-virtual-nodes-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVirtualNodes", :http.request.configuration/output-deser-fn response-list-virtual-nodes-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-virtual-nodes :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/list-virtual-nodes-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/list-virtual-nodes-output))

(clojure.core/defn delete-route ([delete-route-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-route-input delete-route-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/delete-route-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes/{routeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/delete-route-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRoute", :http.request.configuration/output-deser-fn response-delete-route-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ResourceInUseException" :portkey.aws.appmesh/resource-in-use-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-route :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/delete-route-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/delete-route-output))

(clojure.core/defn describe-virtual-node ([describe-virtual-node-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-virtual-node-input describe-virtual-node-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/describe-virtual-node-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualNodes/{virtualNodeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/describe-virtual-node-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualNode", :http.request.configuration/output-deser-fn response-describe-virtual-node-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-node :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/describe-virtual-node-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/describe-virtual-node-output))

(clojure.core/defn create-virtual-node ([create-virtual-node-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-virtual-node-input create-virtual-node-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/create-virtual-node-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualNodes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/create-virtual-node-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateVirtualNode", :http.request.configuration/output-deser-fn response-create-virtual-node-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-virtual-node :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/create-virtual-node-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/create-virtual-node-output))

(clojure.core/defn describe-mesh ([describe-mesh-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-mesh-input describe-mesh-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/describe-mesh-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/describe-mesh-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMesh", :http.request.configuration/output-deser-fn response-describe-mesh-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-mesh :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/describe-mesh-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/describe-mesh-output))

(clojure.core/defn list-virtual-routers ([list-virtual-routers-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-virtual-routers-input list-virtual-routers-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/list-virtual-routers-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouters", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/list-virtual-routers-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVirtualRouters", :http.request.configuration/output-deser-fn response-list-virtual-routers-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-virtual-routers :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/list-virtual-routers-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/list-virtual-routers-output))

(clojure.core/defn update-virtual-node ([update-virtual-node-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-virtual-node-input update-virtual-node-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/update-virtual-node-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualNodes/{virtualNodeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/update-virtual-node-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVirtualNode", :http.request.configuration/output-deser-fn response-update-virtual-node-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-virtual-node :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/update-virtual-node-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/update-virtual-node-output))

(clojure.core/defn update-route ([update-route-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-route-input update-route-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/update-route-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes/{routeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/update-route-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRoute", :http.request.configuration/output-deser-fn response-update-route-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-route :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/update-route-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/update-route-output))

(clojure.core/defn describe-route ([describe-route-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-route-input describe-route-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/describe-route-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualRouter/{virtualRouterName}/routes/{routeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/describe-route-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRoute", :http.request.configuration/output-deser-fn response-describe-route-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef describe-route :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/describe-route-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/describe-route-output))

(clojure.core/defn create-mesh ([create-mesh-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-mesh-input create-mesh-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/create-mesh-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/create-mesh-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMesh", :http.request.configuration/output-deser-fn response-create-mesh-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ConflictException" :portkey.aws.appmesh/conflict-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "LimitExceededException" :portkey.aws.appmesh/limit-exceeded-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-mesh :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/create-mesh-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/create-mesh-output))

(clojure.core/defn delete-virtual-node ([delete-virtual-node-inputinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-virtual-node-input delete-virtual-node-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.appmesh/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.appmesh/delete-virtual-node-output, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/meshes/{meshName}/virtualNodes/{virtualNodeName}", :http.request.configuration/version "2018-10-01", :http.request.configuration/service-id "App Mesh", :http.request.spec/input-spec :portkey.aws.appmesh/delete-virtual-node-input, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVirtualNode", :http.request.configuration/output-deser-fn response-delete-virtual-node-output, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.appmesh/bad-request-exception, "ForbiddenException" :portkey.aws.appmesh/forbidden-exception, "InternalServerErrorException" :portkey.aws.appmesh/internal-server-error-exception, "NotFoundException" :portkey.aws.appmesh/not-found-exception, "ResourceInUseException" :portkey.aws.appmesh/resource-in-use-exception, "ServiceUnavailableException" :portkey.aws.appmesh/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.appmesh/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-node :args (clojure.spec.alpha/tuple :portkey.aws.appmesh/delete-virtual-node-input) :ret (clojure.spec.alpha/and :portkey.aws.appmesh/delete-virtual-node-output))
