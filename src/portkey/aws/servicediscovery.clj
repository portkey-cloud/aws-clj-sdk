(ns portkey.aws.servicediscovery (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "servicediscovery", :region "ap-northeast-1"},
    :ssl-common-name "servicediscovery.ap-northeast-1.amazonaws.com",
    :endpoint "https://servicediscovery.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "servicediscovery", :region "eu-west-1"},
    :ssl-common-name "servicediscovery.eu-west-1.amazonaws.com",
    :endpoint "https://servicediscovery.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "servicediscovery", :region "us-east-2"},
    :ssl-common-name "servicediscovery.us-east-2.amazonaws.com",
    :endpoint "https://servicediscovery.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "servicediscovery", :region "ap-southeast-2"},
    :ssl-common-name "servicediscovery.ap-southeast-2.amazonaws.com",
    :endpoint "https://servicediscovery.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "servicediscovery", :region "sa-east-1"},
    :ssl-common-name "servicediscovery.sa-east-1.amazonaws.com",
    :endpoint "https://servicediscovery.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "servicediscovery", :region "ap-southeast-1"},
    :ssl-common-name "servicediscovery.ap-southeast-1.amazonaws.com",
    :endpoint "https://servicediscovery.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "servicediscovery", :region "ap-northeast-2"},
    :ssl-common-name "servicediscovery.ap-northeast-2.amazonaws.com",
    :endpoint "https://servicediscovery.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "servicediscovery", :region "eu-west-3"},
    :ssl-common-name "servicediscovery.eu-west-3.amazonaws.com",
    :endpoint "https://servicediscovery.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "servicediscovery", :region "ca-central-1"},
    :ssl-common-name "servicediscovery.ca-central-1.amazonaws.com",
    :endpoint "https://servicediscovery.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "servicediscovery", :region "eu-central-1"},
    :ssl-common-name "servicediscovery.eu-central-1.amazonaws.com",
    :endpoint "https://servicediscovery.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "servicediscovery", :region "eu-west-2"},
    :ssl-common-name "servicediscovery.eu-west-2.amazonaws.com",
    :endpoint "https://servicediscovery.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "servicediscovery", :region "us-west-2"},
    :ssl-common-name "servicediscovery.us-west-2.amazonaws.com",
    :endpoint "https://servicediscovery.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "servicediscovery", :region "us-east-1"},
    :ssl-common-name "servicediscovery.us-east-1.amazonaws.com",
    :endpoint "https://servicediscovery.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "servicediscovery", :region "us-west-1"},
    :ssl-common-name "servicediscovery.us-west-1.amazonaws.com",
    :endpoint "https://servicediscovery.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "servicediscovery", :region "ap-south-1"},
    :ssl-common-name "servicediscovery.ap-south-1.amazonaws.com",
    :endpoint "https://servicediscovery.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-routing-policy)

(clojure.core/declare ser-namespace-name)

(clojure.core/declare ser-instance-id-list)

(clojure.core/declare ser-service-filter)

(clojure.core/declare ser-dns-record-list)

(clojure.core/declare ser-namespace-filter-name)

(clojure.core/declare ser-operation-filters)

(clojure.core/declare ser-resource-description)

(clojure.core/declare ser-attr-value)

(clojure.core/declare ser-namespace-filters)

(clojure.core/declare ser-failure-threshold)

(clojure.core/declare ser-operation-filter-name)

(clojure.core/declare ser-attr-key)

(clojure.core/declare ser-record-ttl)

(clojure.core/declare ser-health-check-config)

(clojure.core/declare ser-service-filters)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-service-change)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-filter-condition)

(clojure.core/declare ser-record-type)

(clojure.core/declare ser-resource-path)

(clojure.core/declare ser-health-check-type)

(clojure.core/declare ser-health-status-filter)

(clojure.core/declare ser-dns-config-change)

(clojure.core/declare ser-custom-health-status)

(clojure.core/declare ser-service-name)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-dns-config)

(clojure.core/declare ser-operation-filter)

(clojure.core/declare ser-dns-record)

(clojure.core/declare ser-health-check-custom-config)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-service-filter-name)

(clojure.core/declare ser-namespace-filter)

(clojure.core/defn- ser-routing-policy [input] #:http.request.field{:value (clojure.core/get {"MULTIVALUE" "MULTIVALUE", :multivalue "MULTIVALUE", "WEIGHTED" "WEIGHTED", :weighted "WEIGHTED"} input), :shape "RoutingPolicy"})

(clojure.core/defn- ser-namespace-name [input] #:http.request.field{:value input, :shape "NamespaceName"})

(clojure.core/defn- ser-instance-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-id coll) #:http.request.field{:shape "ResourceId"}))) input), :shape "InstanceIdList", :type "list", :min 1})

(clojure.core/defn- ser-service-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-service-filter-name (:name input)) #:http.request.field{:name "Name", :shape "ServiceFilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "Values", :shape "FilterValues"})], :shape "ServiceFilter", :type "structure"} (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition (input :condition)) #:http.request.field{:name "Condition", :shape "FilterCondition"}))))

(clojure.core/defn- ser-dns-record-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-dns-record coll) #:http.request.field{:shape "DnsRecord"}))) input), :shape "DnsRecordList", :type "list"})

(clojure.core/defn- ser-namespace-filter-name [input] #:http.request.field{:value (clojure.core/get {"TYPE" "TYPE", :type "TYPE"} input), :shape "NamespaceFilterName"})

(clojure.core/defn- ser-operation-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-operation-filter coll) #:http.request.field{:shape "OperationFilter"}))) input), :shape "OperationFilters", :type "list"})

(clojure.core/defn- ser-resource-description [input] #:http.request.field{:value input, :shape "ResourceDescription"})

(clojure.core/defn- ser-attr-value [input] #:http.request.field{:value input, :shape "AttrValue"})

(clojure.core/defn- ser-namespace-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-namespace-filter coll) #:http.request.field{:shape "NamespaceFilter"}))) input), :shape "NamespaceFilters", :type "list"})

(clojure.core/defn- ser-failure-threshold [input] #:http.request.field{:value input, :shape "FailureThreshold"})

(clojure.core/defn- ser-operation-filter-name [input] #:http.request.field{:value (clojure.core/get {"SERVICE_ID" "SERVICE_ID", :update-date "UPDATE_DATE", :service-id "SERVICE_ID", :namespace-id "NAMESPACE_ID", "TYPE" "TYPE", "STATUS" "STATUS", :type "TYPE", :status "STATUS", "NAMESPACE_ID" "NAMESPACE_ID", "UPDATE_DATE" "UPDATE_DATE"} input), :shape "OperationFilterName"})

(clojure.core/defn- ser-attr-key [input] #:http.request.field{:value input, :shape "AttrKey"})

(clojure.core/defn- ser-record-ttl [input] #:http.request.field{:value input, :shape "RecordTTL"})

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-type (:type input)) #:http.request.field{:name "Type", :shape "HealthCheckType"})], :shape "HealthCheckConfig", :type "structure"} (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"}))))

(clojure.core/defn- ser-service-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-filter coll) #:http.request.field{:shape "ServiceFilter"}))) input), :shape "ServiceFilters", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-service-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-config-change (:dns-config input)) #:http.request.field{:name "DnsConfig", :shape "DnsConfigChange"})], :shape "ServiceChange", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"})) (clojure.core/contains? input :health-check-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-config (input :health-check-config)) #:http.request.field{:name "HealthCheckConfig", :shape "HealthCheckConfig"}))))

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attr-key k) #:http.request.field{:map-info "key", :shape "AttrKey"}) (clojure.core/into (ser-attr-value v) #:http.request.field{:map-info "value", :shape "AttrValue"})])) input), :shape "Attributes", :type "map"})

(clojure.core/defn- ser-filter-condition [input] #:http.request.field{:value (clojure.core/get {"EQ" "EQ", :eq "EQ", "IN" "IN", :in "IN", "BETWEEN" "BETWEEN", :between "BETWEEN"} input), :shape "FilterCondition"})

(clojure.core/defn- ser-record-type [input] #:http.request.field{:value (clojure.core/get {"SRV" "SRV", :srv "SRV", "A" "A", :a "A", "AAAA" "AAAA", :aaaa "AAAA", "CNAME" "CNAME", :cname "CNAME"} input), :shape "RecordType"})

(clojure.core/defn- ser-resource-path [input] #:http.request.field{:value input, :shape "ResourcePath"})

(clojure.core/defn- ser-health-check-type [input] #:http.request.field{:value (clojure.core/get {"HTTP" "HTTP", :http "HTTP", "HTTPS" "HTTPS", :https "HTTPS", "TCP" "TCP", :tcp "TCP"} input), :shape "HealthCheckType"})

(clojure.core/defn- ser-health-status-filter [input] #:http.request.field{:value (clojure.core/get {"HEALTHY" "HEALTHY", :healthy "HEALTHY", "UNHEALTHY" "UNHEALTHY", :unhealthy "UNHEALTHY", "ALL" "ALL", :all "ALL"} input), :shape "HealthStatusFilter"})

(clojure.core/defn- ser-dns-config-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-record-list (:dns-records input)) #:http.request.field{:name "DnsRecords", :shape "DnsRecordList"})], :shape "DnsConfigChange", :type "structure"}))

(clojure.core/defn- ser-custom-health-status [input] #:http.request.field{:value (clojure.core/get {"HEALTHY" "HEALTHY", :healthy "HEALTHY", "UNHEALTHY" "UNHEALTHY", :unhealthy "UNHEALTHY"} input), :shape "CustomHealthStatus"})

(clojure.core/defn- ser-service-name [input] #:http.request.field{:value input, :shape "ServiceName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-dns-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-record-list (:dns-records input)) #:http.request.field{:name "DnsRecords", :shape "DnsRecordList"})], :shape "DnsConfig", :type "structure"} (clojure.core/contains? input :namespace-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :namespace-id)) #:http.request.field{:name "NamespaceId", :shape "ResourceId", :deprecated true, :deprecated-message "Top level attribute in request should be used to reference namespace-id"})) (clojure.core/contains? input :routing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-policy (input :routing-policy)) #:http.request.field{:name "RoutingPolicy", :shape "RoutingPolicy"}))))

(clojure.core/defn- ser-operation-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-operation-filter-name (:name input)) #:http.request.field{:name "Name", :shape "OperationFilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "Values", :shape "FilterValues"})], :shape "OperationFilter", :type "structure"} (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition (input :condition)) #:http.request.field{:name "Condition", :shape "FilterCondition"}))))

(clojure.core/defn- ser-dns-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-record-type (:type input)) #:http.request.field{:name "Type", :shape "RecordType"}) (clojure.core/into (ser-record-ttl (:ttl input)) #:http.request.field{:name "TTL", :shape "RecordTTL"})], :shape "DnsRecord", :type "structure"}))

(clojure.core/defn- ser-health-check-custom-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HealthCheckCustomConfig", :type "structure"} (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"}))))

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-service-filter-name [input] #:http.request.field{:value (clojure.core/get {"NAMESPACE_ID" "NAMESPACE_ID", :namespace-id "NAMESPACE_ID"} input), :shape "ServiceFilterName"})

(clojure.core/defn- ser-namespace-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-namespace-filter-name (:name input)) #:http.request.field{:name "Name", :shape "NamespaceFilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "Values", :shape "FilterValues"})], :shape "NamespaceFilter", :type "structure"} (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-condition (input :condition)) #:http.request.field{:name "Condition", :shape "FilterCondition"}))))

(clojure.core/defn- req-get-instances-health-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"})]} (clojure.core/contains? input :instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id-list (input :instances)) #:http.request.field{:name "Instances", :shape "InstanceIdList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-register-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ResourceId"}) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "Attributes"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true}))))

(clojure.core/defn- req-update-instance-custom-health-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ResourceId"}) (clojure.core/into (ser-custom-health-status (input :status)) #:http.request.field{:name "Status", :shape "CustomHealthStatus"})]}))

(clojure.core/defn- req-deregister-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"}) (clojure.core/into (ser-service-change (input :service)) #:http.request.field{:name "Service", :shape "ServiceChange"})]}))

(clojure.core/defn- req-list-operations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operation-filters (input :filters)) #:http.request.field{:name "Filters", :shape "OperationFilters"}))))

(clojure.core/defn- req-discover-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :namespace-name)) #:http.request.field{:name "NamespaceName", :shape "NamespaceName"}) (clojure.core/into (ser-service-name (input :service-name)) #:http.request.field{:name "ServiceName", :shape "ServiceName"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :query-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :query-parameters)) #:http.request.field{:name "QueryParameters", :shape "Attributes"})) (clojure.core/contains? input :health-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-status-filter (input :health-status)) #:http.request.field{:name "HealthStatus", :shape "HealthStatusFilter"}))))

(clojure.core/defn- req-get-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-http-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :name)) #:http.request.field{:name "Name", :shape "NamespaceName"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"}))))

(clojure.core/defn- req-get-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-private-dns-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :name)) #:http.request.field{:name "Name", :shape "NamespaceName"}) (clojure.core/into (ser-resource-id (input :vpc)) #:http.request.field{:name "Vpc", :shape "ResourceId"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"}))))

(clojure.core/defn- req-list-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-name (input :name)) #:http.request.field{:name "Name", :shape "ServiceName"})]} (clojure.core/contains? input :namespace-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :namespace-id)) #:http.request.field{:name "NamespaceId", :shape "ResourceId"})) (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"})) (clojure.core/contains? input :dns-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-config (input :dns-config)) #:http.request.field{:name "DnsConfig", :shape "DnsConfig"})) (clojure.core/contains? input :health-check-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-config (input :health-check-config)) #:http.request.field{:name "HealthCheckConfig", :shape "HealthCheckConfig"})) (clojure.core/contains? input :health-check-custom-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-custom-config (input :health-check-custom-config)) #:http.request.field{:name "HealthCheckCustomConfig", :shape "HealthCheckCustomConfig"}))))

(clojure.core/defn- req-get-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ServiceFilters"}))))

(clojure.core/defn- req-get-operation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-public-dns-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :name)) #:http.request.field{:name "Name", :shape "NamespaceName"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"}))))

(clojure.core/defn- req-delete-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-namespaces-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-namespace-filters (input :filters)) #:http.request.field{:name "Filters", :shape "NamespaceFilters"}))))

(clojure.core/declare deser-routing-policy)

(clojure.core/declare deser-namespace-name)

(clojure.core/declare deser-dns-record-list)

(clojure.core/declare deser-instance-summary-list)

(clojure.core/declare deser-resource-description)

(clojure.core/declare deser-attr-value)

(clojure.core/declare deser-service-summaries-list)

(clojure.core/declare deser-failure-threshold)

(clojure.core/declare deser-attr-key)

(clojure.core/declare deser-health-status)

(clojure.core/declare deser-operation)

(clojure.core/declare deser-namespace-summaries-list)

(clojure.core/declare deser-service-summary)

(clojure.core/declare deser-record-ttl)

(clojure.core/declare deser-health-check-config)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-http-instance-summary-list)

(clojure.core/declare deser-operation-summary)

(clojure.core/declare deser-namespace-summary)

(clojure.core/declare deser-operation-summary-list)

(clojure.core/declare deser-namespace-type)

(clojure.core/declare deser-instance-health-status-map)

(clojure.core/declare deser-namespace)

(clojure.core/declare deser-message)

(clojure.core/declare deser-operation-id)

(clojure.core/declare deser-instance-summary)

(clojure.core/declare deser-operation-status)

(clojure.core/declare deser-record-type)

(clojure.core/declare deser-http-properties)

(clojure.core/declare deser-operation-type)

(clojure.core/declare deser-resource-count)

(clojure.core/declare deser-resource-path)

(clojure.core/declare deser-health-check-type)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-operation-targets-map)

(clojure.core/declare deser-service-name)

(clojure.core/declare deser-http-instance-summary)

(clojure.core/declare deser-dns-config)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-service)

(clojure.core/declare deser-code)

(clojure.core/declare deser-dns-properties)

(clojure.core/declare deser-namespace-properties)

(clojure.core/declare deser-dns-record)

(clojure.core/declare deser-health-check-custom-config)

(clojure.core/declare deser-operation-target-type)

(clojure.core/defn- deser-routing-policy [input] (clojure.core/get {"MULTIVALUE" :multivalue, "WEIGHTED" :weighted} input))

(clojure.core/defn- deser-namespace-name [input] input)

(clojure.core/defn- deser-dns-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dns-record coll))) input))

(clojure.core/defn- deser-instance-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-summary coll))) input))

(clojure.core/defn- deser-resource-description [input] input)

(clojure.core/defn- deser-attr-value [input] input)

(clojure.core/defn- deser-service-summaries-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-summary coll))) input))

(clojure.core/defn- deser-failure-threshold [input] input)

(clojure.core/defn- deser-attr-key [input] input)

(clojure.core/defn- deser-health-status [input] (clojure.core/get {"HEALTHY" :healthy, "UNHEALTHY" :unhealthy, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-operation [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-operation-id (input "Id"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-operation-type (input "Type"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-operation-status (input "Status"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-message (input "ErrorMessage"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-code (input "ErrorCode"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "UpdateDate") (clojure.core/assoc :update-date (deser-timestamp (input "UpdateDate"))) (clojure.core/contains? input "Targets") (clojure.core/assoc :targets (deser-operation-targets-map (input "Targets")))))

(clojure.core/defn- deser-namespace-summaries-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-namespace-summary coll))) input))

(clojure.core/defn- deser-service-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceCount") (clojure.core/assoc :instance-count (deser-resource-count (input "InstanceCount"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "HealthCheckConfig") (clojure.core/assoc :health-check-config (deser-health-check-config (input "HealthCheckConfig"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-resource-description (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "DnsConfig") (clojure.core/assoc :dns-config (deser-dns-config (input "DnsConfig"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-service-name (input "Name"))) (clojure.core/contains? input "HealthCheckCustomConfig") (clojure.core/assoc :health-check-custom-config (deser-health-check-custom-config (input "HealthCheckCustomConfig"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id")))))

(clojure.core/defn- deser-record-ttl [input] input)

(clojure.core/defn- deser-health-check-config [input] (clojure.core/cond-> {:type (deser-health-check-type (input "Type"))} (clojure.core/contains? input "ResourcePath") (clojure.core/assoc :resource-path (deser-resource-path (input "ResourcePath"))) (clojure.core/contains? input "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (input "FailureThreshold")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-attributes [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attr-key k) (deser-attr-value v)])) input))

(clojure.core/defn- deser-http-instance-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-http-instance-summary coll))) input))

(clojure.core/defn- deser-operation-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-operation-id (input "Id"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-operation-status (input "Status")))))

(clojure.core/defn- deser-namespace-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-namespace-name (input "Name"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-namespace-type (input "Type"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-resource-description (input "Description"))) (clojure.core/contains? input "ServiceCount") (clojure.core/assoc :service-count (deser-resource-count (input "ServiceCount"))) (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-namespace-properties (input "Properties"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate")))))

(clojure.core/defn- deser-operation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-operation-summary coll))) input))

(clojure.core/defn- deser-namespace-type [input] (clojure.core/get {"DNS_PUBLIC" :dns-public, "DNS_PRIVATE" :dns-private, "HTTP" :http} input))

(clojure.core/defn- deser-instance-health-status-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-resource-id k) (deser-health-status v)])) input))

(clojure.core/defn- deser-namespace [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-namespace-type (input "Type"))) (clojure.core/contains? input "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-resource-id (input "CreatorRequestId"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-resource-description (input "Description"))) (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-namespace-properties (input "Properties"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-namespace-name (input "Name"))) (clojure.core/contains? input "ServiceCount") (clojure.core/assoc :service-count (deser-resource-count (input "ServiceCount"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id")))))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-operation-id [input] input)

(clojure.core/defn- deser-instance-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes")))))

(clojure.core/defn- deser-operation-status [input] (clojure.core/get {"SUBMITTED" :submitted, "PENDING" :pending, "SUCCESS" :success, "FAIL" :fail} input))

(clojure.core/defn- deser-record-type [input] (clojure.core/get {"SRV" :srv, "A" :a, "AAAA" :aaaa, "CNAME" :cname} input))

(clojure.core/defn- deser-http-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "HttpName") (clojure.core/assoc :http-name (deser-namespace-name (input "HttpName")))))

(clojure.core/defn- deser-operation-type [input] (clojure.core/get {"CREATE_NAMESPACE" :create-namespace, "DELETE_NAMESPACE" :delete-namespace, "UPDATE_SERVICE" :update-service, "REGISTER_INSTANCE" :register-instance, "DEREGISTER_INSTANCE" :deregister-instance} input))

(clojure.core/defn- deser-resource-count [input] input)

(clojure.core/defn- deser-resource-path [input] input)

(clojure.core/defn- deser-health-check-type [input] (clojure.core/get {"HTTP" :http, "HTTPS" :https, "TCP" :tcp} input))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-operation-targets-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-operation-target-type k) (deser-resource-id v)])) input))

(clojure.core/defn- deser-service-name [input] input)

(clojure.core/defn- deser-http-instance-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceId") (clojure.core/assoc :instance-id (deser-resource-id (input "InstanceId"))) (clojure.core/contains? input "NamespaceName") (clojure.core/assoc :namespace-name (deser-namespace-name (input "NamespaceName"))) (clojure.core/contains? input "ServiceName") (clojure.core/assoc :service-name (deser-service-name (input "ServiceName"))) (clojure.core/contains? input "HealthStatus") (clojure.core/assoc :health-status (deser-health-status (input "HealthStatus"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes")))))

(clojure.core/defn- deser-dns-config [input] (clojure.core/cond-> {:dns-records (deser-dns-record-list (input "DnsRecords"))} (clojure.core/contains? input "NamespaceId") (clojure.core/assoc :namespace-id (deser-resource-id (input "NamespaceId"))) (clojure.core/contains? input "RoutingPolicy") (clojure.core/assoc :routing-policy (deser-routing-policy (input "RoutingPolicy")))))

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {:id (deser-resource-id (input "Id"))} (clojure.core/contains? input "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-resource-id (input "CreatorRequestId"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attributes (input "Attributes")))))

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceCount") (clojure.core/assoc :instance-count (deser-resource-count (input "InstanceCount"))) (clojure.core/contains? input "NamespaceId") (clojure.core/assoc :namespace-id (deser-resource-id (input "NamespaceId"))) (clojure.core/contains? input "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-resource-id (input "CreatorRequestId"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "HealthCheckConfig") (clojure.core/assoc :health-check-config (deser-health-check-config (input "HealthCheckConfig"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-resource-description (input "Description"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "DnsConfig") (clojure.core/assoc :dns-config (deser-dns-config (input "DnsConfig"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-service-name (input "Name"))) (clojure.core/contains? input "HealthCheckCustomConfig") (clojure.core/assoc :health-check-custom-config (deser-health-check-custom-config (input "HealthCheckCustomConfig"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id")))))

(clojure.core/defn- deser-code [input] input)

(clojure.core/defn- deser-dns-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "HostedZoneId") (clojure.core/assoc :hosted-zone-id (deser-resource-id (input "HostedZoneId")))))

(clojure.core/defn- deser-namespace-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "DnsProperties") (clojure.core/assoc :dns-properties (deser-dns-properties (input "DnsProperties"))) (clojure.core/contains? input "HttpProperties") (clojure.core/assoc :http-properties (deser-http-properties (input "HttpProperties")))))

(clojure.core/defn- deser-dns-record [input] (clojure.core/cond-> {:type (deser-record-type (input "Type")), :ttl (deser-record-ttl (input "TTL"))}))

(clojure.core/defn- deser-health-check-custom-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (input "FailureThreshold")))))

(clojure.core/defn- deser-operation-target-type [input] (clojure.core/get {"NAMESPACE" :namespace, "SERVICE" :service, "INSTANCE" :instance} input))

(clojure.core/defn- response-service-already-exists ([input] (response-service-already-exists nil input)) ([resultWrapper1723112 input] (clojure.core/let [rawinput1723111 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723113 {"Message" (rawinput1723111 "Message"), "CreatorRequestId" (rawinput1723111 "CreatorRequestId"), "ServiceId" (rawinput1723111 "ServiceId")}] (clojure.core/cond-> {} (letvar1723113 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723113 ["Message"]))) (letvar1723113 "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-resource-id (clojure.core/get-in letvar1723113 ["CreatorRequestId"]))) (letvar1723113 "ServiceId") (clojure.core/assoc :service-id (deser-resource-id (clojure.core/get-in letvar1723113 ["ServiceId"])))))))

(clojure.core/defn- response-namespace-already-exists ([input] (response-namespace-already-exists nil input)) ([resultWrapper1723115 input] (clojure.core/let [rawinput1723114 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723116 {"Message" (rawinput1723114 "Message"), "CreatorRequestId" (rawinput1723114 "CreatorRequestId"), "NamespaceId" (rawinput1723114 "NamespaceId")}] (clojure.core/cond-> {} (letvar1723116 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723116 ["Message"]))) (letvar1723116 "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-resource-id (clojure.core/get-in letvar1723116 ["CreatorRequestId"]))) (letvar1723116 "NamespaceId") (clojure.core/assoc :namespace-id (deser-resource-id (clojure.core/get-in letvar1723116 ["NamespaceId"])))))))

(clojure.core/defn- response-get-instance-response ([input] (response-get-instance-response nil input)) ([resultWrapper1723118 input] (clojure.core/let [rawinput1723117 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723119 {"Instance" (rawinput1723117 "Instance")}] (clojure.core/cond-> {} (letvar1723119 "Instance") (clojure.core/assoc :instance (deser-instance (clojure.core/get-in letvar1723119 ["Instance"])))))))

(clojure.core/defn- response-list-operations-response ([input] (response-list-operations-response nil input)) ([resultWrapper1723121 input] (clojure.core/let [rawinput1723120 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723122 {"Operations" (rawinput1723120 "Operations"), "NextToken" (rawinput1723120 "NextToken")}] (clojure.core/cond-> {} (letvar1723122 "Operations") (clojure.core/assoc :operations (deser-operation-summary-list (clojure.core/get-in letvar1723122 ["Operations"]))) (letvar1723122 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1723122 ["NextToken"])))))))

(clojure.core/defn- response-get-operation-response ([input] (response-get-operation-response nil input)) ([resultWrapper1723124 input] (clojure.core/let [rawinput1723123 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723125 {"Operation" (rawinput1723123 "Operation")}] (clojure.core/cond-> {} (letvar1723125 "Operation") (clojure.core/assoc :operation (deser-operation (clojure.core/get-in letvar1723125 ["Operation"])))))))

(clojure.core/defn- response-delete-namespace-response ([input] (response-delete-namespace-response nil input)) ([resultWrapper1723127 input] (clojure.core/let [rawinput1723126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723128 {"OperationId" (rawinput1723126 "OperationId")}] (clojure.core/cond-> {} (letvar1723128 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723128 ["OperationId"])))))))

(clojure.core/defn- response-discover-instances-response ([input] (response-discover-instances-response nil input)) ([resultWrapper1723130 input] (clojure.core/let [rawinput1723129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723131 {"Instances" (rawinput1723129 "Instances")}] (clojure.core/cond-> {} (letvar1723131 "Instances") (clojure.core/assoc :instances (deser-http-instance-summary-list (clojure.core/get-in letvar1723131 ["Instances"])))))))

(clojure.core/defn- response-get-instances-health-status-response ([input] (response-get-instances-health-status-response nil input)) ([resultWrapper1723133 input] (clojure.core/let [rawinput1723132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723134 {"Status" (rawinput1723132 "Status"), "NextToken" (rawinput1723132 "NextToken")}] (clojure.core/cond-> {} (letvar1723134 "Status") (clojure.core/assoc :status (deser-instance-health-status-map (clojure.core/get-in letvar1723134 ["Status"]))) (letvar1723134 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1723134 ["NextToken"])))))))

(clojure.core/defn- response-delete-service-response ([input] (response-delete-service-response nil input)) ([resultWrapper1723136 input] (clojure.core/let [rawinput1723135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723137 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-input ([input] (response-invalid-input nil input)) ([resultWrapper1723139 input] (clojure.core/let [rawinput1723138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723140 {"Message" (rawinput1723138 "Message")}] (clojure.core/cond-> {} (letvar1723140 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723140 ["Message"])))))))

(clojure.core/defn- response-instance-not-found ([input] (response-instance-not-found nil input)) ([resultWrapper1723142 input] (clojure.core/let [rawinput1723141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723143 {"Message" (rawinput1723141 "Message")}] (clojure.core/cond-> {} (letvar1723143 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723143 ["Message"])))))))

(clojure.core/defn- response-create-http-namespace-response ([input] (response-create-http-namespace-response nil input)) ([resultWrapper1723145 input] (clojure.core/let [rawinput1723144 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723146 {"OperationId" (rawinput1723144 "OperationId")}] (clojure.core/cond-> {} (letvar1723146 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723146 ["OperationId"])))))))

(clojure.core/defn- response-deregister-instance-response ([input] (response-deregister-instance-response nil input)) ([resultWrapper1723148 input] (clojure.core/let [rawinput1723147 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723149 {"OperationId" (rawinput1723147 "OperationId")}] (clojure.core/cond-> {} (letvar1723149 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723149 ["OperationId"])))))))

(clojure.core/defn- response-list-instances-response ([input] (response-list-instances-response nil input)) ([resultWrapper1723151 input] (clojure.core/let [rawinput1723150 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723152 {"Instances" (rawinput1723150 "Instances"), "NextToken" (rawinput1723150 "NextToken")}] (clojure.core/cond-> {} (letvar1723152 "Instances") (clojure.core/assoc :instances (deser-instance-summary-list (clojure.core/get-in letvar1723152 ["Instances"]))) (letvar1723152 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1723152 ["NextToken"])))))))

(clojure.core/defn- response-create-public-dns-namespace-response ([input] (response-create-public-dns-namespace-response nil input)) ([resultWrapper1723154 input] (clojure.core/let [rawinput1723153 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723155 {"OperationId" (rawinput1723153 "OperationId")}] (clojure.core/cond-> {} (letvar1723155 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723155 ["OperationId"])))))))

(clojure.core/defn- response-list-services-response ([input] (response-list-services-response nil input)) ([resultWrapper1723157 input] (clojure.core/let [rawinput1723156 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723158 {"Services" (rawinput1723156 "Services"), "NextToken" (rawinput1723156 "NextToken")}] (clojure.core/cond-> {} (letvar1723158 "Services") (clojure.core/assoc :services (deser-service-summaries-list (clojure.core/get-in letvar1723158 ["Services"]))) (letvar1723158 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1723158 ["NextToken"])))))))

(clojure.core/defn- response-update-service-response ([input] (response-update-service-response nil input)) ([resultWrapper1723160 input] (clojure.core/let [rawinput1723159 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723161 {"OperationId" (rawinput1723159 "OperationId")}] (clojure.core/cond-> {} (letvar1723161 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723161 ["OperationId"])))))))

(clojure.core/defn- response-create-private-dns-namespace-response ([input] (response-create-private-dns-namespace-response nil input)) ([resultWrapper1723163 input] (clojure.core/let [rawinput1723162 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723164 {"OperationId" (rawinput1723162 "OperationId")}] (clojure.core/cond-> {} (letvar1723164 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723164 ["OperationId"])))))))

(clojure.core/defn- response-get-namespace-response ([input] (response-get-namespace-response nil input)) ([resultWrapper1723166 input] (clojure.core/let [rawinput1723165 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723167 {"Namespace" (rawinput1723165 "Namespace")}] (clojure.core/cond-> {} (letvar1723167 "Namespace") (clojure.core/assoc :namespace (deser-namespace (clojure.core/get-in letvar1723167 ["Namespace"])))))))

(clojure.core/defn- response-operation-not-found ([input] (response-operation-not-found nil input)) ([resultWrapper1723169 input] (clojure.core/let [rawinput1723168 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723170 {"Message" (rawinput1723168 "Message")}] (clojure.core/cond-> {} (letvar1723170 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723170 ["Message"])))))))

(clojure.core/defn- response-namespace-not-found ([input] (response-namespace-not-found nil input)) ([resultWrapper1723172 input] (clojure.core/let [rawinput1723171 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723173 {"Message" (rawinput1723171 "Message")}] (clojure.core/cond-> {} (letvar1723173 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723173 ["Message"])))))))

(clojure.core/defn- response-register-instance-response ([input] (response-register-instance-response nil input)) ([resultWrapper1723175 input] (clojure.core/let [rawinput1723174 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723176 {"OperationId" (rawinput1723174 "OperationId")}] (clojure.core/cond-> {} (letvar1723176 "OperationId") (clojure.core/assoc :operation-id (deser-operation-id (clojure.core/get-in letvar1723176 ["OperationId"])))))))

(clojure.core/defn- response-create-service-response ([input] (response-create-service-response nil input)) ([resultWrapper1723178 input] (clojure.core/let [rawinput1723177 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723179 {"Service" (rawinput1723177 "Service")}] (clojure.core/cond-> {} (letvar1723179 "Service") (clojure.core/assoc :service (deser-service (clojure.core/get-in letvar1723179 ["Service"])))))))

(clojure.core/defn- response-list-namespaces-response ([input] (response-list-namespaces-response nil input)) ([resultWrapper1723181 input] (clojure.core/let [rawinput1723180 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723182 {"Namespaces" (rawinput1723180 "Namespaces"), "NextToken" (rawinput1723180 "NextToken")}] (clojure.core/cond-> {} (letvar1723182 "Namespaces") (clojure.core/assoc :namespaces (deser-namespace-summaries-list (clojure.core/get-in letvar1723182 ["Namespaces"]))) (letvar1723182 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1723182 ["NextToken"])))))))

(clojure.core/defn- response-resource-limit-exceeded ([input] (response-resource-limit-exceeded nil input)) ([resultWrapper1723184 input] (clojure.core/let [rawinput1723183 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723185 {"Message" (rawinput1723183 "Message")}] (clojure.core/cond-> {} (letvar1723185 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723185 ["Message"])))))))

(clojure.core/defn- response-service-not-found ([input] (response-service-not-found nil input)) ([resultWrapper1723187 input] (clojure.core/let [rawinput1723186 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723188 {"Message" (rawinput1723186 "Message")}] (clojure.core/cond-> {} (letvar1723188 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723188 ["Message"])))))))

(clojure.core/defn- response-get-service-response ([input] (response-get-service-response nil input)) ([resultWrapper1723190 input] (clojure.core/let [rawinput1723189 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723191 {"Service" (rawinput1723189 "Service")}] (clojure.core/cond-> {} (letvar1723191 "Service") (clojure.core/assoc :service (deser-service (clojure.core/get-in letvar1723191 ["Service"])))))))

(clojure.core/defn- response-duplicate-request ([input] (response-duplicate-request nil input)) ([resultWrapper1723193 input] (clojure.core/let [rawinput1723192 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723194 {"Message" (rawinput1723192 "Message"), "DuplicateOperationId" (rawinput1723192 "DuplicateOperationId")}] (clojure.core/cond-> {} (letvar1723194 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723194 ["Message"]))) (letvar1723194 "DuplicateOperationId") (clojure.core/assoc :duplicate-operation-id (deser-resource-id (clojure.core/get-in letvar1723194 ["DuplicateOperationId"])))))))

(clojure.core/defn- response-resource-in-use ([input] (response-resource-in-use nil input)) ([resultWrapper1723196 input] (clojure.core/let [rawinput1723195 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723197 {"Message" (rawinput1723195 "Message")}] (clojure.core/cond-> {} (letvar1723197 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723197 ["Message"])))))))

(clojure.core/defn- response-custom-health-not-found ([input] (response-custom-health-not-found nil input)) ([resultWrapper1723199 input] (clojure.core/let [rawinput1723198 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1723200 {"Message" (rawinput1723198 "Message")}] (clojure.core/cond-> {} (letvar1723200 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1723200 ["Message"])))))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-instances-health-status-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-instances-health-status-request/instances (clojure.spec.alpha/and :portkey.aws.servicediscovery/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-instances-health-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.get-instances-health-status-request/service-id] :opt-un [:portkey.aws.servicediscovery.get-instances-health-status-request/instances :portkey.aws.servicediscovery/max-results :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-already-exists/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-already-exists/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-already-exists/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.service-already-exists/message :portkey.aws.servicediscovery.service-already-exists/creator-request-id :portkey.aws.servicediscovery.service-already-exists/service-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/routing-policy #{"MULTIVALUE" :multivalue "WEIGHTED" :weighted})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-already-exists/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-already-exists/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-already-exists/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.namespace-already-exists/message :portkey.aws.servicediscovery.namespace-already-exists/creator-request-id :portkey.aws.servicediscovery.namespace-already-exists/namespace-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.register-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.register-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.register-instance-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/register-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.register-instance-request/service-id :portkey.aws.servicediscovery.register-instance-request/instance-id :portkey.aws.servicediscovery/attributes] :opt-un [:portkey.aws.servicediscovery.register-instance-request/creator-request-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance-id-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/resource-id :min-count 1))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.update-instance-custom-health-status-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.update-instance-custom-health-status-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.update-instance-custom-health-status-request/status (clojure.spec.alpha/and :portkey.aws.servicediscovery/custom-health-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/update-instance-custom-health-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.update-instance-custom-health-status-request/service-id :portkey.aws.servicediscovery.update-instance-custom-health-status-request/instance-id :portkey.aws.servicediscovery.update-instance-custom-health-status-request/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.service-filter/name :portkey.aws.servicediscovery.service-filter/values] :opt-un [:portkey.aws.servicediscovery.service-filter/condition]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/dns-record-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/dns-record))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/instance-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-filter-name #{"TYPE" :type})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/instance]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/operation-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-operations-response/operations (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-summary-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-operations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.list-operations-response/operations :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/attr-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/namespace-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-operation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-summaries-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/service-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/delete-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/failure-threshold (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.discover-instances-response/instances (clojure.spec.alpha/and :portkey.aws.servicediscovery/http-instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/discover-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.discover-instances-response/instances]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.deregister-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.deregister-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/deregister-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.deregister-instance-request/service-id :portkey.aws.servicediscovery.deregister-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-filter-name #{"SERVICE_ID" :update-date :service-id :namespace-id "TYPE" "STATUS" :type :status "NAMESPACE_ID" "UPDATE_DATE"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/attr-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-instances-health-status-response/status (clojure.spec.alpha/and :portkey.aws.servicediscovery/instance-health-status-map))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-instances-health-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.get-instances-health-status-response/status :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.update-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.update-service-request/service (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-change))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/update-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.update-service-request/id :portkey.aws.servicediscovery.update-service-request/service] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/delete-service-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/health-status #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/type (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/status (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/error-message (clojure.spec.alpha/and :portkey.aws.servicediscovery/message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/error-code (clojure.spec.alpha/and :portkey.aws.servicediscovery/code))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/update-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation/targets (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-targets-map))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.operation/id :portkey.aws.servicediscovery.operation/type :portkey.aws.servicediscovery.operation/status :portkey.aws.servicediscovery.operation/error-message :portkey.aws.servicediscovery.operation/error-code :portkey.aws.servicediscovery.operation/create-date :portkey.aws.servicediscovery.operation/update-date :portkey.aws.servicediscovery.operation/targets]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-summaries-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/namespace-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-summary/instance-count (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-summary/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-summary/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-summary/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.service-summary/instance-count :portkey.aws.servicediscovery.service-summary/create-date :portkey.aws.servicediscovery/health-check-config :portkey.aws.servicediscovery.service-summary/description :portkey.aws.servicediscovery/arn :portkey.aws.servicediscovery/dns-config :portkey.aws.servicediscovery.service-summary/name :portkey.aws.servicediscovery/health-check-custom-config :portkey.aws.servicediscovery.service-summary/id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/record-ttl clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery.health-check-config/type (clojure.spec.alpha/and :portkey.aws.servicediscovery/health-check-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/health-check-config (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.health-check-config/type] :opt-un [:portkey.aws.servicediscovery/resource-path :portkey.aws.servicediscovery/failure-threshold]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-operations-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-operations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/next-token :portkey.aws.servicediscovery/max-results :portkey.aws.servicediscovery.list-operations-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.discover-instances-request/query-parameters (clojure.spec.alpha/and :portkey.aws.servicediscovery/attributes))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.discover-instances-request/health-status (clojure.spec.alpha/and :portkey.aws.servicediscovery/health-status-filter))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/discover-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery/namespace-name :portkey.aws.servicediscovery/service-name] :opt-un [:portkey.aws.servicediscovery/max-results :portkey.aws.servicediscovery.discover-instances-request/query-parameters :portkey.aws.servicediscovery.discover-instances-request/health-status]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/service-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.invalid-input/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/invalid-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.invalid-input/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/filter-value))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.instance-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.instance-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-http-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.get-instance-request/service-id :portkey.aws.servicediscovery.get-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-change/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-change/dns-config (clojure.spec.alpha/and :portkey.aws.servicediscovery/dns-config-change))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-change (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.service-change/dns-config] :opt-un [:portkey.aws.servicediscovery.service-change/description :portkey.aws.servicediscovery/health-check-config]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-http-namespace-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-http-namespace-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-http-namespace-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-http-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.create-http-namespace-request/name] :opt-un [:portkey.aws.servicediscovery.create-http-namespace-request/creator-request-id :portkey.aws.servicediscovery.create-http-namespace-request/description]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/attributes (clojure.spec.alpha/map-of :portkey.aws.servicediscovery/attr-key :portkey.aws.servicediscovery/attr-value))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/http-instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/http-instance-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.get-service-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.delete-namespace-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/delete-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.delete-namespace-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-summary/status (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.operation-summary/id :portkey.aws.servicediscovery.operation-summary/status]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/deregister-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-private-dns-namespace-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-private-dns-namespace-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-private-dns-namespace-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-private-dns-namespace-request/vpc (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-private-dns-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.create-private-dns-namespace-request/name :portkey.aws.servicediscovery.create-private-dns-namespace-request/vpc] :opt-un [:portkey.aws.servicediscovery.create-private-dns-namespace-request/creator-request-id :portkey.aws.servicediscovery.create-private-dns-namespace-request/description]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/type (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/service-count (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/properties (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-properties))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-summary/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.namespace-summary/id :portkey.aws.servicediscovery/arn :portkey.aws.servicediscovery.namespace-summary/name :portkey.aws.servicediscovery.namespace-summary/type :portkey.aws.servicediscovery.namespace-summary/description :portkey.aws.servicediscovery.namespace-summary/service-count :portkey.aws.servicediscovery.namespace-summary/properties :portkey.aws.servicediscovery.namespace-summary/create-date]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/filter-condition #{:eq :between "EQ" "IN" "BETWEEN" :in})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery/operation-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-type #{"DNS_PRIVATE" :dns-private "DNS_PUBLIC" :http "HTTP" :dns-public})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance-health-status-map (clojure.spec.alpha/map-of :portkey.aws.servicediscovery/resource-id :portkey.aws.servicediscovery/health-status))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-instances-response/instances (clojure.spec.alpha/and :portkey.aws.servicediscovery/instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.list-instances-response/instances :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/type (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/properties (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-properties))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/service-count (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.namespace/type :portkey.aws.servicediscovery.namespace/creator-request-id :portkey.aws.servicediscovery.namespace/create-date :portkey.aws.servicediscovery.namespace/description :portkey.aws.servicediscovery.namespace/properties :portkey.aws.servicediscovery/arn :portkey.aws.servicediscovery.namespace/name :portkey.aws.servicediscovery.namespace/service-count :portkey.aws.servicediscovery.namespace/id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.instance-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.instance-summary/id :portkey.aws.servicediscovery/attributes]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-status #{"SUCCESS" "FAIL" :pending "PENDING" :submitted "SUBMITTED" :fail :success})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/record-type #{"CNAME" "SRV" :srv "AAAA" :cname "A" :aaaa :a})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-public-dns-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-instances-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.list-instances-request/service-id] :opt-un [:portkey.aws.servicediscovery/next-token :portkey.aws.servicediscovery/max-results]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.http-properties/http-name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/http-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.http-properties/http-name]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-services-response/services (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-summaries-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.list-services-response/services :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-type #{:delete-namespace :register-instance "DELETE_NAMESPACE" :create-namespace :update-service "UPDATE_SERVICE" "REGISTER_INSTANCE" "CREATE_NAMESPACE" :deregister-instance "DEREGISTER_INSTANCE"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-service-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-service-request/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-service-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-service-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.create-service-request/name] :opt-un [:portkey.aws.servicediscovery.create-service-request/namespace-id :portkey.aws.servicediscovery.create-service-request/creator-request-id :portkey.aws.servicediscovery.create-service-request/description :portkey.aws.servicediscovery/dns-config :portkey.aws.servicediscovery/health-check-config :portkey.aws.servicediscovery/health-check-custom-config]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/update-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/health-check-type #{:tcp "TCP" "HTTPS" :http "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.servicediscovery/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/health-status-filter #{:unhealthy :all :healthy "HEALTHY" "ALL" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-config-change/dns-records (clojure.spec.alpha/and :portkey.aws.servicediscovery/dns-record-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/dns-config-change (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.dns-config-change/dns-records] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-private-dns-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/custom-health-status #{:unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-namespace-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.get-namespace-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/namespace]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.operation-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.namespace-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/register-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-targets-map (clojure.spec.alpha/map-of :portkey.aws.servicediscovery/operation-target-type :portkey.aws.servicediscovery/resource-id))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"((?=^.{1,127}$)^([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))*$)|(^\.$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/service]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.http-instance-summary/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/http-instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.http-instance-summary/instance-id :portkey.aws.servicediscovery/namespace-name :portkey.aws.servicediscovery/service-name :portkey.aws.servicediscovery/health-status :portkey.aws.servicediscovery/attributes]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-namespaces-response/namespaces (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-summaries-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-namespaces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.list-namespaces-response/namespaces :portkey.aws.servicediscovery/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-services-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/next-token :portkey.aws.servicediscovery/max-results :portkey.aws.servicediscovery.list-services-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-config/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-config/dns-records (clojure.spec.alpha/and :portkey.aws.servicediscovery/dns-record-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/dns-config (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.dns-config/dns-records] :opt-un [:portkey.aws.servicediscovery.dns-config/namespace-id :portkey.aws.servicediscovery/routing-policy]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.instance/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.instance/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/instance (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.instance/id] :opt-un [:portkey.aws.servicediscovery.instance/creator-request-id :portkey.aws.servicediscovery/attributes]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.resource-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.resource-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.get-operation-request/operation-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-operation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.get-operation-request/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/instance-count (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.service/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.service/instance-count :portkey.aws.servicediscovery.service/namespace-id :portkey.aws.servicediscovery.service/creator-request-id :portkey.aws.servicediscovery.service/create-date :portkey.aws.servicediscovery/health-check-config :portkey.aws.servicediscovery.service/description :portkey.aws.servicediscovery/arn :portkey.aws.servicediscovery/dns-config :portkey.aws.servicediscovery.service/name :portkey.aws.servicediscovery/health-check-custom-config :portkey.aws.servicediscovery.service/id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-public-dns-namespace-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-public-dns-namespace-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.create-public-dns-namespace-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/create-public-dns-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.create-public-dns-namespace-request/name] :opt-un [:portkey.aws.servicediscovery.create-public-dns-namespace-request/creator-request-id :portkey.aws.servicediscovery.create-public-dns-namespace-request/description]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-properties/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/dns-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.dns-properties/hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.service-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.service-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/dns-properties :portkey.aws.servicediscovery/http-properties]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/operation-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.operation-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.operation-filter/name :portkey.aws.servicediscovery.operation-filter/values] :opt-un [:portkey.aws.servicediscovery.operation-filter/condition]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.delete-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/delete-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.delete-service-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/get-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/service]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-record/type (clojure.spec.alpha/and :portkey.aws.servicediscovery/record-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.dns-record/ttl (clojure.spec.alpha/and :portkey.aws.servicediscovery/record-ttl))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/dns-record (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.dns-record/type :portkey.aws.servicediscovery.dns-record/ttl] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.duplicate-request/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.duplicate-request/duplicate-operation-id (clojure.spec.alpha/and :portkey.aws.servicediscovery/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/duplicate-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.duplicate-request/message :portkey.aws.servicediscovery.duplicate-request/duplicate-operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/health-check-custom-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/failure-threshold]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.list-namespaces-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/list-namespaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery/next-token :portkey.aws.servicediscovery/max-results :portkey.aws.servicediscovery.list-namespaces-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/service-filter-name #{:namespace-id "NAMESPACE_ID"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.custom-health-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/custom-health-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.custom-health-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery/operation-target-type #{:service "NAMESPACE" "INSTANCE" :instance "SERVICE" :namespace})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery/namespace-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.namespace-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery/namespace-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.namespace-filter/name :portkey.aws.servicediscovery.namespace-filter/values] :opt-un [:portkey.aws.servicediscovery.namespace-filter/condition]))

(clojure.core/defn create-http-namespace "Creates an HTTP namespace. Service instances that you register using an HTTP\nnamespace can be discovered using a DiscoverInstances request but can't be\ndiscovered using DNS.\n For the current limit on the number of namespaces that you can create using the\nsame AWS account, see AWS Cloud Map Limits\n(http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in the\nAWS Cloud Map Developer Guide." ([create-http-namespace-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-http-namespace-request create-http-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/create-http-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/create-http-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHttpNamespace", :http.request.configuration/output-deser-fn response-create-http-namespace-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "NamespaceAlreadyExists" :portkey.aws.servicediscovery/namespace-already-exists, "ResourceLimitExceeded" :portkey.aws.servicediscovery/resource-limit-exceeded, "DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request}})))))
(clojure.spec.alpha/fdef create-http-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/create-http-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/create-http-namespace-response))

(clojure.core/defn delete-service "Deletes a specified service. If the service still contains one or more\nregistered instances, the request fails." ([delete-service-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-service-request delete-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/delete-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/delete-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteService", :http.request.configuration/output-deser-fn response-delete-service-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found, "ResourceInUse" :portkey.aws.servicediscovery/resource-in-use}})))))
(clojure.spec.alpha/fdef delete-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/delete-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/delete-service-response))

(clojure.core/defn get-operation "Gets information about any operation that returns an operation ID in the\nresponse, such as a CreateService request.\n To get a list of operations that match specified criteria, see ListOperations." ([get-operation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-operation-request get-operation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/get-operation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/get-operation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetOperation", :http.request.configuration/output-deser-fn response-get-operation-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "OperationNotFound" :portkey.aws.servicediscovery/operation-not-found}})))))
(clojure.spec.alpha/fdef get-operation :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/get-operation-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/get-operation-response))

(clojure.core/defn list-namespaces "Lists summary information about the namespaces that were created by the current\nAWS account." ([] (list-namespaces {})) ([list-namespaces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-namespaces-request list-namespaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/list-namespaces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/list-namespaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNamespaces", :http.request.configuration/output-deser-fn response-list-namespaces-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef list-namespaces :args (clojure.spec.alpha/? :portkey.aws.servicediscovery/list-namespaces-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/list-namespaces-response))

(clojure.core/defn list-instances "Lists summary information about the instances that you registered by using a\nspecified service." ([list-instances-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-instances-request list-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/list-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/list-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInstances", :http.request.configuration/output-deser-fn response-list-instances-response, :http.request.spec/error-spec {"ServiceNotFound" :portkey.aws.servicediscovery/service-not-found, "InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef list-instances :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/list-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/list-instances-response))

(clojure.core/defn get-namespace "Gets information about a namespace." ([get-namespace-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-namespace-request get-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/get-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/get-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetNamespace", :http.request.configuration/output-deser-fn response-get-namespace-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "NamespaceNotFound" :portkey.aws.servicediscovery/namespace-not-found}})))))
(clojure.spec.alpha/fdef get-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/get-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/get-namespace-response))

(clojure.core/defn get-instance "Gets information about a specified instance." ([get-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-instance-request get-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/get-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/get-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInstance", :http.request.configuration/output-deser-fn response-get-instance-response, :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery/instance-not-found, "InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef get-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/get-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/get-instance-response))

(clojure.core/defn get-instances-health-status "Gets the current health status (Healthy, Unhealthy, or Unknown) of one or more\ninstances that are associated with a specified service.\n There is a brief delay between when you register an instance and when the\nhealth status for the instance is available." ([get-instances-health-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-instances-health-status-request get-instances-health-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/get-instances-health-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/get-instances-health-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInstancesHealthStatus", :http.request.configuration/output-deser-fn response-get-instances-health-status-response, :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery/instance-not-found, "InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef get-instances-health-status :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/get-instances-health-status-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/get-instances-health-status-response))

(clojure.core/defn get-service "Gets the settings for a specified service." ([get-service-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-service-request get-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/get-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/get-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetService", :http.request.configuration/output-deser-fn response-get-service-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef get-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/get-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/get-service-response))

(clojure.core/defn deregister-instance "Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud\nMap created for the specified instance." ([deregister-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-deregister-instance-request deregister-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/deregister-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/deregister-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterInstance", :http.request.configuration/output-deser-fn response-deregister-instance-response, :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery/invalid-input, "InstanceNotFound" :portkey.aws.servicediscovery/instance-not-found, "ResourceInUse" :portkey.aws.servicediscovery/resource-in-use, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef deregister-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/deregister-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/deregister-instance-response))

(clojure.core/defn list-operations "Lists operations that match the criteria that you specify." ([] (list-operations {})) ([list-operations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-operations-request list-operations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/list-operations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/list-operations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOperations", :http.request.configuration/output-deser-fn response-list-operations-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef list-operations :args (clojure.spec.alpha/? :portkey.aws.servicediscovery/list-operations-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/list-operations-response))

(clojure.core/defn create-service "Creates a service, which defines the configuration for the following entities:\n * For public and private DNS namespaces, one of the following combinations of\nDNS records in Amazon Route 53:\n * A\n * AAAA\n * A and AAAA\n * SRV\n * CNAME\n * Optionally, a health check\n After you create the service, you can submit a RegisterInstance request, and\nAWS Cloud Map uses the values in the configuration to create the specified\nentities.\n For the current limit on the number of instances that you can register using\nthe same namespace and using the same service, see AWS Cloud Map Limits\n(http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in the\nAWS Cloud Map Developer Guide." ([create-service-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-service-request create-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/create-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/create-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateService", :http.request.configuration/output-deser-fn response-create-service-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ResourceLimitExceeded" :portkey.aws.servicediscovery/resource-limit-exceeded, "NamespaceNotFound" :portkey.aws.servicediscovery/namespace-not-found, "ServiceAlreadyExists" :portkey.aws.servicediscovery/service-already-exists}})))))
(clojure.spec.alpha/fdef create-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/create-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/create-service-response))

(clojure.core/defn register-instance "Creates or updates one or more records and, optionally, creates a health check\nbased on the settings in a specified service. When you submit a RegisterInstance\nrequest, the following occurs:\n * For each DNS record that you define in the service that is specified by\nServiceId, a record is created or updated in the hosted zone that is associated\nwith the corresponding namespace.\n * If the service includes HealthCheckConfig, a health check is created based on\nthe settings in the health check configuration.\n * The health check, if any, is associated with each of the new or updated\nrecords.\n One RegisterInstance request must complete before you can submit another\nrequest and specify the same service ID and instance ID.\n For more information, see CreateService.\n When AWS Cloud Map receives a DNS query for the specified DNS name, it returns\nthe applicable value:\n * If the health check is healthy: returns all the records\n * If the health check is unhealthy: returns the applicable value for the last\nhealthy instance\n * If you didn't specify a health check configuration: returns all the records\n For the current limit on the number of instances that you can register using\nthe same namespace and using the same service, see AWS Cloud Map Limits\n(http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in the\nAWS Cloud Map Developer Guide." ([register-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-instance-request register-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/register-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/register-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterInstance", :http.request.configuration/output-deser-fn response-register-instance-response, :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ResourceInUse" :portkey.aws.servicediscovery/resource-in-use, "ResourceLimitExceeded" :portkey.aws.servicediscovery/resource-limit-exceeded, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef register-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/register-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/register-instance-response))

(clojure.core/defn list-services "Lists summary information for all the services that are associated with one or\nmore specified namespaces." ([] (list-services {})) ([list-services-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-services-request list-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/list-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/list-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServices", :http.request.configuration/output-deser-fn response-list-services-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef list-services :args (clojure.spec.alpha/? :portkey.aws.servicediscovery/list-services-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/list-services-response))

(clojure.core/defn discover-instances "Discovers registered instances for a specified namespace and service." ([discover-instances-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-discover-instances-request discover-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/discover-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/discover-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DiscoverInstances", :http.request.configuration/output-deser-fn response-discover-instances-response, :http.request.spec/error-spec {"ServiceNotFound" :portkey.aws.servicediscovery/service-not-found, "NamespaceNotFound" :portkey.aws.servicediscovery/namespace-not-found, "InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef discover-instances :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/discover-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/discover-instances-response))

(clojure.core/defn delete-namespace "Deletes a namespace from the current account. If the namespace still contains\none or more services, the request fails." ([delete-namespace-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-namespace-request delete-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/delete-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/delete-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNamespace", :http.request.configuration/output-deser-fn response-delete-namespace-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "NamespaceNotFound" :portkey.aws.servicediscovery/namespace-not-found, "ResourceInUse" :portkey.aws.servicediscovery/resource-in-use, "DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request}})))))
(clojure.spec.alpha/fdef delete-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/delete-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/delete-namespace-response))

(clojure.core/defn create-private-dns-namespace "Creates a private namespace based on DNS, which will be visible only inside a\nspecified Amazon VPC. The namespace defines your service naming scheme. For\nexample, if you name your namespace example.com and name your service backend,\nthe resulting DNS name for the service will be backend.example.com. For the\ncurrent limit on the number of namespaces that you can create using the same AWS\naccount, see AWS Cloud Map Limits\n(http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in the\nAWS Cloud Map Developer Guide." ([create-private-dns-namespace-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-private-dns-namespace-request create-private-dns-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/create-private-dns-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/create-private-dns-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePrivateDnsNamespace", :http.request.configuration/output-deser-fn response-create-private-dns-namespace-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "NamespaceAlreadyExists" :portkey.aws.servicediscovery/namespace-already-exists, "ResourceLimitExceeded" :portkey.aws.servicediscovery/resource-limit-exceeded, "DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request}})))))
(clojure.spec.alpha/fdef create-private-dns-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/create-private-dns-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/create-private-dns-namespace-response))

(clojure.core/defn update-service "Submits a request to perform the following operations:\n * Add or delete DnsRecords configurations\n * Update the TTL setting for existing DnsRecords configurations\n * Add, update, or delete HealthCheckConfig for a specified service\n For public and private DNS namespaces, you must specify all DnsRecords\nconfigurations (and, optionally, HealthCheckConfig) that you want to appear in\nthe updated service. Any current configurations that don't appear in an\nUpdateService request are deleted.\n When you update the TTL setting for a service, AWS Cloud Map also updates the\ncorresponding settings in all the records and health checks that were created by\nusing the specified service." ([update-service-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-service-request update-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/update-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/update-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateService", :http.request.configuration/output-deser-fn response-update-service-response, :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found}})))))
(clojure.spec.alpha/fdef update-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/update-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/update-service-response))

(clojure.core/defn update-instance-custom-health-status "Submits a request to change the health status of a custom health check to\nhealthy or unhealthy.\n You can use UpdateInstanceCustomHealthStatus to change the status only for\ncustom health checks, which you define using HealthCheckCustomConfig when you\ncreate a service. You can't use it to change the status for Route 53 health\nchecks, which you define using HealthCheckConfig.\n For more information, see HealthCheckCustomConfig." ([update-instance-custom-health-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-instance-custom-health-status-request update-instance-custom-health-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/update-instance-custom-health-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateInstanceCustomHealthStatus", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery/instance-not-found, "ServiceNotFound" :portkey.aws.servicediscovery/service-not-found, "CustomHealthNotFound" :portkey.aws.servicediscovery/custom-health-not-found, "InvalidInput" :portkey.aws.servicediscovery/invalid-input}})))))
(clojure.spec.alpha/fdef update-instance-custom-health-status :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/update-instance-custom-health-status-request) :ret clojure.core/true?)

(clojure.core/defn create-public-dns-namespace "Creates a public namespace based on DNS, which will be visible on the internet.\nThe namespace defines your service naming scheme. For example, if you name your\nnamespace example.com and name your service backend, the resulting DNS name for\nthe service will be backend.example.com. For the current limit on the number of\nnamespaces that you can create using the same AWS account, see AWS Cloud Map\nLimits (http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html) in\nthe AWS Cloud Map Developer Guide." ([create-public-dns-namespace-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-public-dns-namespace-request create-public-dns-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery/endpoints, :http.request.configuration/target-prefix "Route53AutoNaming_v20170314", :http.request.spec/output-spec :portkey.aws.servicediscovery/create-public-dns-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery/create-public-dns-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicDnsNamespace", :http.request.configuration/output-deser-fn response-create-public-dns-namespace-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery/invalid-input, "NamespaceAlreadyExists" :portkey.aws.servicediscovery/namespace-already-exists, "ResourceLimitExceeded" :portkey.aws.servicediscovery/resource-limit-exceeded, "DuplicateRequest" :portkey.aws.servicediscovery/duplicate-request}})))))
(clojure.spec.alpha/fdef create-public-dns-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery/create-public-dns-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery/create-public-dns-namespace-response))
