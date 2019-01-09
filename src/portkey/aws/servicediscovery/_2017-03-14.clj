(ns portkey.aws.servicediscovery.-2017-03-14 (:require [portkey.aws]))

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

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HealthCheckConfig", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-type (input :type)) #:http.request.field{:name "Type", :shape "HealthCheckType"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"}))))

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

(clojure.core/defn- ser-dns-config-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-record-list (:dns-records input)) #:http.request.field{:name "DnsRecords", :shape "DnsRecordList"})], :shape "DnsConfigChange", :type "structure"}))

(clojure.core/defn- ser-custom-health-status [input] #:http.request.field{:value (clojure.core/get {"HEALTHY" "HEALTHY", :healthy "HEALTHY", "UNHEALTHY" "UNHEALTHY", :unhealthy "UNHEALTHY"} input), :shape "CustomHealthStatus"})

(clojure.core/defn- ser-service-name [input] #:http.request.field{:value input, :shape "ServiceName"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-dns-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-id (:namespace-id input)) #:http.request.field{:name "NamespaceId", :shape "ResourceId"}) (clojure.core/into (ser-dns-record-list (:dns-records input)) #:http.request.field{:name "DnsRecords", :shape "DnsRecordList"})], :shape "DnsConfig", :type "structure"} (clojure.core/contains? input :routing-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-routing-policy (input :routing-policy)) #:http.request.field{:name "RoutingPolicy", :shape "RoutingPolicy"}))))

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

(clojure.core/defn- req-get-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "ResourceId"})]}))

(clojure.core/defn- req-get-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-private-dns-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :name)) #:http.request.field{:name "Name", :shape "NamespaceName"}) (clojure.core/into (ser-resource-id (input :vpc)) #:http.request.field{:name "Vpc", :shape "ResourceId"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"}))))

(clojure.core/defn- req-list-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :service-id)) #:http.request.field{:name "ServiceId", :shape "ResourceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-name (input :name)) #:http.request.field{:name "Name", :shape "ServiceName"}) (clojure.core/into (ser-dns-config (input :dns-config)) #:http.request.field{:name "DnsConfig", :shape "DnsConfig"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"})) (clojure.core/contains? input :health-check-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-config (input :health-check-config)) #:http.request.field{:name "HealthCheckConfig", :shape "HealthCheckConfig"})) (clojure.core/contains? input :health-check-custom-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-custom-config (input :health-check-custom-config)) #:http.request.field{:name "HealthCheckCustomConfig", :shape "HealthCheckCustomConfig"}))))

(clojure.core/defn- req-get-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-filters (input :filters)) #:http.request.field{:name "Filters", :shape "ServiceFilters"}))))

(clojure.core/defn- req-get-operation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :operation-id)) #:http.request.field{:name "OperationId", :shape "ResourceId"})]}))

(clojure.core/defn- req-create-public-dns-namespace-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-namespace-name (input :name)) #:http.request.field{:name "Name", :shape "NamespaceName"})]} (clojure.core/contains? input :creator-request-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "ResourceId", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :description)) #:http.request.field{:name "Description", :shape "ResourceDescription"}))))

(clojure.core/defn- req-delete-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-namespaces-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-namespace-filters (input :filters)) #:http.request.field{:name "Filters", :shape "NamespaceFilters"}))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-request/instances (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/instance-id-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-request/service-id] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-request/instances :portkey.aws.servicediscovery.-2017-03-14/max-results :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-already-exists/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-already-exists/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-already-exists/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service-already-exists/message :portkey.aws.servicediscovery.-2017-03-14.service-already-exists/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.service-already-exists/service-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/routing-policy #{"MULTIVALUE" :multivalue "WEIGHTED" :weighted})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/message :portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.namespace-already-exists/namespace-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.register-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.register-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.register-instance-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/register-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.register-instance-request/service-id :portkey.aws.servicediscovery.-2017-03-14.register-instance-request/instance-id :portkey.aws.servicediscovery.-2017-03-14/attributes] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.register-instance-request/creator-request-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance-id-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/resource-id :min-count 1))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/status (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/custom-health-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/update-instance-custom-health-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/service-id :portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/instance-id :portkey.aws.servicediscovery.-2017-03-14.update-instance-custom-health-status-request/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.service-filter/name :portkey.aws.servicediscovery.-2017-03-14.service-filter/values] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service-filter/condition]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/dns-record-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/dns-record))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/instance-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-filter-name #{"TYPE" :type})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/instance]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/operation-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-operations-response/operations (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-summary-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-operations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.list-operations-response/operations :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/attr-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/namespace-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-operation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-summaries-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/service-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/failure-threshold (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.deregister-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.deregister-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.deregister-instance-request/service-id :portkey.aws.servicediscovery.-2017-03-14.deregister-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-filter-name #{"SERVICE_ID" :update-date :service-id :namespace-id "TYPE" "STATUS" :type :status "NAMESPACE_ID" "UPDATE_DATE"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/attr-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-response/status (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/instance-health-status-map))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.get-instances-health-status-response/status :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.update-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.update-service-request/service (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-change))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/update-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.update-service-request/id :portkey.aws.servicediscovery.-2017-03-14.update-service-request/service] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/delete-service-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/health-status #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/type (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/status (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/error-message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/error-code (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/code))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/update-date (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation/targets (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-targets-map))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.operation/id :portkey.aws.servicediscovery.-2017-03-14.operation/type :portkey.aws.servicediscovery.-2017-03-14.operation/status :portkey.aws.servicediscovery.-2017-03-14.operation/error-message :portkey.aws.servicediscovery.-2017-03-14.operation/error-code :portkey.aws.servicediscovery.-2017-03-14.operation/create-date :portkey.aws.servicediscovery.-2017-03-14.operation/update-date :portkey.aws.servicediscovery.-2017-03-14.operation/targets]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-summaries-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/namespace-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-summary/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-summary/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-summary/instance-count (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service-summary/id :portkey.aws.servicediscovery.-2017-03-14/arn :portkey.aws.servicediscovery.-2017-03-14.service-summary/name :portkey.aws.servicediscovery.-2017-03-14.service-summary/description :portkey.aws.servicediscovery.-2017-03-14.service-summary/instance-count]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/record-ttl clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.health-check-config/type (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/health-check-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/health-check-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.health-check-config/type :portkey.aws.servicediscovery.-2017-03-14/resource-path :portkey.aws.servicediscovery.-2017-03-14/failure-threshold]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-operations-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-operations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/next-token :portkey.aws.servicediscovery.-2017-03-14/max-results :portkey.aws.servicediscovery.-2017-03-14.list-operations-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-filters (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/service-filter))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.invalid-input/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/invalid-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.invalid-input/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/filter-values (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/filter-value))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.instance-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.instance-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-instance-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-instance-request/instance-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.get-instance-request/service-id :portkey.aws.servicediscovery.-2017-03-14.get-instance-request/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-change/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-change/dns-config (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/dns-config-change))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-change (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.service-change/dns-config] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service-change/description :portkey.aws.servicediscovery.-2017-03-14/health-check-config]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/attributes (clojure.spec.alpha/map-of :portkey.aws.servicediscovery.-2017-03-14/attr-key :portkey.aws.servicediscovery.-2017-03-14/attr-value))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.get-service-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.delete-namespace-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.delete-namespace-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-summary/status (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-status))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.operation-summary/id :portkey.aws.servicediscovery.-2017-03-14.operation-summary/status]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/vpc (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/name :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/vpc] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.create-private-dns-namespace-request/description]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-summary/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-summary/type (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.namespace-summary/id :portkey.aws.servicediscovery.-2017-03-14/arn :portkey.aws.servicediscovery.-2017-03-14.namespace-summary/name :portkey.aws.servicediscovery.-2017-03-14.namespace-summary/type]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/filter-condition #{:eq :between "EQ" "IN" "BETWEEN" :in})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.servicediscovery.-2017-03-14/operation-summary))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-type #{"DNS_PRIVATE" :dns-private "DNS_PUBLIC" :dns-public})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance-health-status-map (clojure.spec.alpha/map-of :portkey.aws.servicediscovery.-2017-03-14/resource-id :portkey.aws.servicediscovery.-2017-03-14/health-status))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-instances-response/instances (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.list-instances-response/instances :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/type (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/properties (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-properties))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/service-count (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.namespace/type :portkey.aws.servicediscovery.-2017-03-14.namespace/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.namespace/create-date :portkey.aws.servicediscovery.-2017-03-14.namespace/description :portkey.aws.servicediscovery.-2017-03-14.namespace/properties :portkey.aws.servicediscovery.-2017-03-14/arn :portkey.aws.servicediscovery.-2017-03-14.namespace/name :portkey.aws.servicediscovery.-2017-03-14.namespace/service-count :portkey.aws.servicediscovery.-2017-03-14.namespace/id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.instance-summary/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.instance-summary/id :portkey.aws.servicediscovery.-2017-03-14/attributes]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-status #{"SUCCESS" "FAIL" :pending "PENDING" :submitted "SUBMITTED" :fail :success})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/record-type #{"CNAME" "SRV" :srv "AAAA" :cname "A" :aaaa :a})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-instances-request/service-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.list-instances-request/service-id] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/next-token :portkey.aws.servicediscovery.-2017-03-14/max-results]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-services-response/services (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-summaries-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.list-services-response/services :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-type #{:delete-namespace :register-instance "DELETE_NAMESPACE" :create-namespace :update-service "UPDATE_SERVICE" "REGISTER_INSTANCE" "CREATE_NAMESPACE" :deregister-instance "DEREGISTER_INSTANCE"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-service-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-service-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-service-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.create-service-request/name :portkey.aws.servicediscovery.-2017-03-14/dns-config] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.create-service-request/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.create-service-request/description :portkey.aws.servicediscovery.-2017-03-14/health-check-config :portkey.aws.servicediscovery.-2017-03-14/health-check-custom-config]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/update-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/health-check-type #{:tcp "TCP" "HTTPS" :http "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-config-change/dns-records (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/dns-record-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/dns-config-change (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.dns-config-change/dns-records] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/custom-health-status #{:unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-namespace-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.get-namespace-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-namespace-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/namespace]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.operation-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.namespace-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/register-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/operation-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-targets-map (clojure.spec.alpha/map-of :portkey.aws.servicediscovery.-2017-03-14/operation-target-type :portkey.aws.servicediscovery.-2017-03-14/resource-id))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"((?=^.{1,127}$)^([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9])(\.([a-zA-Z0-9_][a-zA-Z0-9-_]{0,61}[a-zA-Z0-9_]|[a-zA-Z0-9]))*$)|(^\.$)" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/service]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-namespaces-response/namespaces (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-summaries-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.list-namespaces-response/namespaces :portkey.aws.servicediscovery.-2017-03-14/next-token]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-services-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/next-token :portkey.aws.servicediscovery.-2017-03-14/max-results :portkey.aws.servicediscovery.-2017-03-14.list-services-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-config/namespace-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-config/dns-records (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/dns-record-list))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/dns-config (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.dns-config/namespace-id :portkey.aws.servicediscovery.-2017-03-14.dns-config/dns-records] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/routing-policy]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.instance/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.instance/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/instance (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.instance/id] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.instance/creator-request-id :portkey.aws.servicediscovery.-2017-03-14/attributes]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.resource-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.resource-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.get-operation-request/operation-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-operation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.get-operation-request/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/instance-count (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-count))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/create-date (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/timestamp))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/service-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service/instance-count :portkey.aws.servicediscovery.-2017-03-14.service/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.service/create-date :portkey.aws.servicediscovery.-2017-03-14/health-check-config :portkey.aws.servicediscovery.-2017-03-14.service/description :portkey.aws.servicediscovery.-2017-03-14/arn :portkey.aws.servicediscovery.-2017-03-14/dns-config :portkey.aws.servicediscovery.-2017-03-14.service/name :portkey.aws.servicediscovery.-2017-03-14/health-check-custom-config :portkey.aws.servicediscovery.-2017-03-14.service/id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/creator-request-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/description (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-description))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/name] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/creator-request-id :portkey.aws.servicediscovery.-2017-03-14.create-public-dns-namespace-request/description]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-properties/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/dns-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.dns-properties/hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.service-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.service-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/dns-properties]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/operation-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.operation-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.operation-filter/name :portkey.aws.servicediscovery.-2017-03-14.operation-filter/values] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.operation-filter/condition]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.delete-service-request/id (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/resource-id))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/delete-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.delete-service-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/get-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/service]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-record/type (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/record-type))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.dns-record/ttl (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/record-ttl))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/dns-record (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.dns-record/type :portkey.aws.servicediscovery.-2017-03-14.dns-record/ttl] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.duplicate-request/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/duplicate-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.duplicate-request/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/health-check-custom-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/failure-threshold]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.list-namespaces-request/filters (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-filters))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14/next-token :portkey.aws.servicediscovery.-2017-03-14/max-results :portkey.aws.servicediscovery.-2017-03-14.list-namespaces-request/filters]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/service-filter-name #{:namespace-id "NAMESPACE_ID"})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.custom-health-not-found/message (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/error-message))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/custom-health-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.custom-health-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/operation-target-type #{:service "NAMESPACE" "INSTANCE" :instance "SERVICE" :namespace})

(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-filter/name (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/namespace-filter-name))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-filter/values (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-values))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14.namespace-filter/condition (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/filter-condition))
(clojure.spec.alpha/def :portkey.aws.servicediscovery.-2017-03-14/namespace-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.servicediscovery.-2017-03-14.namespace-filter/name :portkey.aws.servicediscovery.-2017-03-14.namespace-filter/values] :opt-un [:portkey.aws.servicediscovery.-2017-03-14.namespace-filter/condition]))

(clojure.core/defn delete-service ([delete-service-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-service-request delete-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/delete-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/delete-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteService", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found, "ResourceInUse" :portkey.aws.servicediscovery.-2017-03-14/resource-in-use}})))))
(clojure.spec.alpha/fdef delete-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/delete-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/delete-service-response))

(clojure.core/defn get-operation ([get-operation-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-operation-request get-operation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/get-operation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/get-operation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOperation", :http.request.spec/error-spec {"OperationNotFound" :portkey.aws.servicediscovery.-2017-03-14/operation-not-found}})))))
(clojure.spec.alpha/fdef get-operation :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/get-operation-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/get-operation-response))

(clojure.core/defn list-namespaces ([] (list-namespaces {})) ([list-namespaces-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-namespaces-request list-namespaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNamespaces", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input}})))))
(clojure.spec.alpha/fdef list-namespaces :args (clojure.spec.alpha/? :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/list-namespaces-response))

(clojure.core/defn list-instances ([list-instances-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-instances-request list-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/list-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/list-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstances", :http.request.spec/error-spec {"ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input}})))))
(clojure.spec.alpha/fdef list-instances :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/list-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/list-instances-response))

(clojure.core/defn get-namespace ([get-namespace-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-namespace-request get-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/get-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/get-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetNamespace", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "NamespaceNotFound" :portkey.aws.servicediscovery.-2017-03-14/namespace-not-found}})))))
(clojure.spec.alpha/fdef get-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/get-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/get-namespace-response))

(clojure.core/defn get-instance ([get-instance-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-instance-request get-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/get-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/get-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstance", :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery.-2017-03-14/instance-not-found, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef get-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/get-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/get-instance-response))

(clojure.core/defn get-instances-health-status ([get-instances-health-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-instances-health-status-request get-instances-health-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstancesHealthStatus", :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery.-2017-03-14/instance-not-found, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef get-instances-health-status :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/get-instances-health-status-response))

(clojure.core/defn get-service ([get-service-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-service-request get-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/get-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/get-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetService", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef get-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/get-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/get-service-response))

(clojure.core/defn deregister-instance ([deregister-instance-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-deregister-instance-request deregister-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterInstance", :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "InstanceNotFound" :portkey.aws.servicediscovery.-2017-03-14/instance-not-found, "ResourceInUse" :portkey.aws.servicediscovery.-2017-03-14/resource-in-use, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef deregister-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/deregister-instance-response))

(clojure.core/defn list-operations ([] (list-operations {})) ([list-operations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-operations-request list-operations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/list-operations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/list-operations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOperations", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input}})))))
(clojure.spec.alpha/fdef list-operations :args (clojure.spec.alpha/? :portkey.aws.servicediscovery.-2017-03-14/list-operations-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/list-operations-response))

(clojure.core/defn create-service ([create-service-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-service-request create-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/create-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/create-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateService", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ResourceLimitExceeded" :portkey.aws.servicediscovery.-2017-03-14/resource-limit-exceeded, "NamespaceNotFound" :portkey.aws.servicediscovery.-2017-03-14/namespace-not-found, "ServiceAlreadyExists" :portkey.aws.servicediscovery.-2017-03-14/service-already-exists}})))))
(clojure.spec.alpha/fdef create-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/create-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/create-service-response))

(clojure.core/defn register-instance ([register-instance-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-register-instance-request register-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/register-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/register-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterInstance", :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ResourceInUse" :portkey.aws.servicediscovery.-2017-03-14/resource-in-use, "ResourceLimitExceeded" :portkey.aws.servicediscovery.-2017-03-14/resource-limit-exceeded, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef register-instance :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/register-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/register-instance-response))

(clojure.core/defn list-services ([] (list-services {})) ([list-services-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-services-request list-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/list-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/list-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListServices", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input}})))))
(clojure.spec.alpha/fdef list-services :args (clojure.spec.alpha/? :portkey.aws.servicediscovery.-2017-03-14/list-services-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/list-services-response))

(clojure.core/defn delete-namespace ([delete-namespace-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-namespace-request delete-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNamespace", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "NamespaceNotFound" :portkey.aws.servicediscovery.-2017-03-14/namespace-not-found, "ResourceInUse" :portkey.aws.servicediscovery.-2017-03-14/resource-in-use, "DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request}})))))
(clojure.spec.alpha/fdef delete-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/delete-namespace-response))

(clojure.core/defn create-private-dns-namespace ([create-private-dns-namespace-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-private-dns-namespace-request create-private-dns-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePrivateDnsNamespace", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "NamespaceAlreadyExists" :portkey.aws.servicediscovery.-2017-03-14/namespace-already-exists, "ResourceLimitExceeded" :portkey.aws.servicediscovery.-2017-03-14/resource-limit-exceeded, "DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request}})))))
(clojure.spec.alpha/fdef create-private-dns-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/create-private-dns-namespace-response))

(clojure.core/defn update-service ([update-service-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-service-request update-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/update-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/update-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateService", :http.request.spec/error-spec {"DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found}})))))
(clojure.spec.alpha/fdef update-service :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/update-service-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/update-service-response))

(clojure.core/defn update-instance-custom-health-status ([update-instance-custom-health-status-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-instance-custom-health-status-request update-instance-custom-health-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/update-instance-custom-health-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateInstanceCustomHealthStatus", :http.request.spec/error-spec {"InstanceNotFound" :portkey.aws.servicediscovery.-2017-03-14/instance-not-found, "ServiceNotFound" :portkey.aws.servicediscovery.-2017-03-14/service-not-found, "CustomHealthNotFound" :portkey.aws.servicediscovery.-2017-03-14/custom-health-not-found, "InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input}})))))
(clojure.spec.alpha/fdef update-instance-custom-health-status :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/update-instance-custom-health-status-request) :ret clojure.core/true?)

(clojure.core/defn create-public-dns-namespace ([create-public-dns-namespace-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-public-dns-namespace-request create-public-dns-namespace-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.servicediscovery.-2017-03-14/endpoints, :http.request.spec/output-spec :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-03-14", :http.request.configuration/service-id "ServiceDiscovery", :http.request.spec/input-spec :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePublicDnsNamespace", :http.request.spec/error-spec {"InvalidInput" :portkey.aws.servicediscovery.-2017-03-14/invalid-input, "NamespaceAlreadyExists" :portkey.aws.servicediscovery.-2017-03-14/namespace-already-exists, "ResourceLimitExceeded" :portkey.aws.servicediscovery.-2017-03-14/resource-limit-exceeded, "DuplicateRequest" :portkey.aws.servicediscovery.-2017-03-14/duplicate-request}})))))
(clojure.spec.alpha/fdef create-public-dns-namespace :args (clojure.spec.alpha/tuple :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-request) :ret (clojure.spec.alpha/and :portkey.aws.servicediscovery.-2017-03-14/create-public-dns-namespace-response))
