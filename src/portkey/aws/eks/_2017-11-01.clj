(ns portkey.aws.eks.-2017-11-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-list-updates-request-max-results)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-vpc-config-request)

(clojure.core/declare ser-string)

(clojure.core/declare ser-cluster-name)

(clojure.core/declare ser-list-clusters-request-max-results)

(clojure.core/defn- ser-list-updates-request-max-results [input] #:http.request.field{:value input, :shape "ListUpdatesRequestMaxResults"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-vpc-config-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:subnet-ids input)) #:http.request.field{:name "subnetIds", :shape "StringList"})], :shape "VpcConfigRequest", :type "structure"} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "StringList"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-cluster-name [input] #:http.request.field{:value input, :shape "ClusterName"})

(clojure.core/defn- ser-list-clusters-request-max-results [input] #:http.request.field{:value input, :shape "ListClustersRequestMaxResults"})

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-clusters-request-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListClustersRequestMaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-describe-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-describe-update-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"}) (clojure.core/into (ser-string (input :update-id)) #:http.request.field{:name "updateId", :shape "String", :location "uri", :location-name "updateId"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-name (input :name)) #:http.request.field{:name "name", :shape "ClusterName"}) (clojure.core/into (ser-string (input :role-arn)) #:http.request.field{:name "roleArn", :shape "String"}) (clojure.core/into (ser-vpc-config-request (input :resources-vpc-config)) #:http.request.field{:name "resourcesVpcConfig", :shape "VpcConfigRequest"})]} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-update-cluster-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "String", :idempotency-token true}))))

(clojure.core/defn- req-list-updates-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-updates-request-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "ListUpdatesRequestMaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-update-status)

(clojure.core/declare deser-vpc-config-response)

(clojure.core/declare deser-update-param-type)

(clojure.core/declare deser-update-param)

(clojure.core/declare deser-error-detail)

(clojure.core/declare deser-update)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-cluster-status)

(clojure.core/declare deser-string)

(clojure.core/declare deser-update-params)

(clojure.core/declare deser-update-type)

(clojure.core/declare deser-error-details)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-certificate)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-update-status [input] (clojure.core/get {"InProgress" :in-progress, "Failed" :failed, "Cancelled" :cancelled, "Successful" :successful} input))

(clojure.core/defn- deser-vpc-config-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "subnetIds") (clojure.core/assoc :subnet-ids (deser-string-list (input "subnetIds"))) (clojure.core/contains? input "securityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (input "securityGroupIds"))) (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-string (input "vpcId")))))

(clojure.core/defn- deser-update-param-type [input] (clojure.core/get {"Version" :version, "PlatformVersion" :platform-version} input))

(clojure.core/defn- deser-update-param [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-update-param-type (input "type"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- deser-error-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-string (input "errorMessage"))) (clojure.core/contains? input "resourceIds") (clojure.core/assoc :resource-ids (deser-string-list (input "resourceIds")))))

(clojure.core/defn- deser-update [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-update-status (input "status"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-update-type (input "type"))) (clojure.core/contains? input "params") (clojure.core/assoc :params (deser-update-params (input "params"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "errors") (clojure.core/assoc :errors (deser-error-details (input "errors")))))

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"SubnetNotFound" :subnet-not-found, "SecurityGroupNotFound" :security-group-not-found, "EniLimitReached" :eni-limit-reached, "IpNotAvailable" :ip-not-available, "AccessDenied" :access-denied, "OperationNotPermitted" :operation-not-permitted, "VpcIdNotFound" :vpc-id-not-found, "Unknown" :unknown} input))

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourcesVpcConfig") (clojure.core/assoc :resources-vpc-config (deser-vpc-config-response (input "resourcesVpcConfig"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-string (input "clientRequestToken"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-cluster-status (input "status"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-string (input "version"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "endpoint") (clojure.core/assoc :endpoint (deser-string (input "endpoint"))) (clojure.core/contains? input "certificateAuthority") (clojure.core/assoc :certificate-authority (deser-certificate (input "certificateAuthority")))))

(clojure.core/defn- deser-cluster-status [input] (clojure.core/get {"CREATING" :creating, "ACTIVE" :active, "DELETING" :deleting, "FAILED" :failed} input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-update-params [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-update-param coll))) input))

(clojure.core/defn- deser-update-type [input] (clojure.core/get {"VersionUpdate" :version-update} input))

(clojure.core/defn- deser-error-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-detail coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-certificate [input] (clojure.core/cond-> {} (clojure.core/contains? input "data") (clojure.core/assoc :data (deser-string (input "data")))))

(clojure.core/defn- response-client-exception ([input] (response-client-exception nil input)) ([resultWrapper1127895 input] (clojure.core/let [rawinput1127894 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127896 {"clusterName" (rawinput1127894 "clusterName"), "message" (rawinput1127894 "message")}] (clojure.core/cond-> {} (letvar1127896 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127896 ["clusterName"]))) (letvar1127896 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127896 ["message"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1127898 input] (clojure.core/let [rawinput1127897 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127899 {"clusterName" (rawinput1127897 "clusterName"), "message" (rawinput1127897 "message")}] (clojure.core/cond-> {} (letvar1127899 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127899 ["clusterName"]))) (letvar1127899 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127899 ["message"])))))))

(clojure.core/defn- response-list-clusters-response ([input] (response-list-clusters-response nil input)) ([resultWrapper1127901 input] (clojure.core/let [rawinput1127900 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127902 {"clusters" (rawinput1127900 "clusters"), "nextToken" (rawinput1127900 "nextToken")}] (clojure.core/cond-> {} (letvar1127902 "clusters") (clojure.core/assoc :clusters (deser-string-list (clojure.core/get-in letvar1127902 ["clusters"]))) (letvar1127902 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1127902 ["nextToken"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1127904 input] (clojure.core/let [rawinput1127903 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127905 {"clusterName" (rawinput1127903 "clusterName"), "message" (rawinput1127903 "message")}] (clojure.core/cond-> {} (letvar1127905 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127905 ["clusterName"]))) (letvar1127905 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127905 ["message"])))))))

(clojure.core/defn- response-describe-cluster-response ([input] (response-describe-cluster-response nil input)) ([resultWrapper1127907 input] (clojure.core/let [rawinput1127906 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127908 {"cluster" (rawinput1127906 "cluster")}] (clojure.core/cond-> {} (letvar1127908 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar1127908 ["cluster"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1127910 input] (clojure.core/let [rawinput1127909 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127911 {"message" (rawinput1127909 "message")}] (clojure.core/cond-> {} (letvar1127911 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127911 ["message"])))))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper1127913 input] (clojure.core/let [rawinput1127912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127914 {"cluster" (rawinput1127912 "cluster")}] (clojure.core/cond-> {} (letvar1127914 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar1127914 ["cluster"])))))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper1127916 input] (clojure.core/let [rawinput1127915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127917 {"cluster" (rawinput1127915 "cluster")}] (clojure.core/cond-> {} (letvar1127917 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar1127917 ["cluster"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1127919 input] (clojure.core/let [rawinput1127918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127920 {"clusterName" (rawinput1127918 "clusterName"), "message" (rawinput1127918 "message")}] (clojure.core/cond-> {} (letvar1127920 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127920 ["clusterName"]))) (letvar1127920 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127920 ["message"])))))))

(clojure.core/defn- response-unsupported-availability-zone-exception ([input] (response-unsupported-availability-zone-exception nil input)) ([resultWrapper1127922 input] (clojure.core/let [rawinput1127921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127923 {"message" (rawinput1127921 "message"), "clusterName" (rawinput1127921 "clusterName"), "validZones" (rawinput1127921 "validZones")}] (clojure.core/cond-> {} (letvar1127923 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127923 ["message"]))) (letvar1127923 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127923 ["clusterName"]))) (letvar1127923 "validZones") (clojure.core/assoc :valid-zones (deser-string-list (clojure.core/get-in letvar1127923 ["validZones"])))))))

(clojure.core/defn- response-list-updates-response ([input] (response-list-updates-response nil input)) ([resultWrapper1127925 input] (clojure.core/let [rawinput1127924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127926 {"updateIds" (rawinput1127924 "updateIds"), "nextToken" (rawinput1127924 "nextToken")}] (clojure.core/cond-> {} (letvar1127926 "updateIds") (clojure.core/assoc :update-ids (deser-string-list (clojure.core/get-in letvar1127926 ["updateIds"]))) (letvar1127926 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1127926 ["nextToken"])))))))

(clojure.core/defn- response-server-exception ([input] (response-server-exception nil input)) ([resultWrapper1127928 input] (clojure.core/let [rawinput1127927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127929 {"clusterName" (rawinput1127927 "clusterName"), "message" (rawinput1127927 "message")}] (clojure.core/cond-> {} (letvar1127929 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127929 ["clusterName"]))) (letvar1127929 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127929 ["message"])))))))

(clojure.core/defn- response-resource-limit-exceeded-exception ([input] (response-resource-limit-exceeded-exception nil input)) ([resultWrapper1127931 input] (clojure.core/let [rawinput1127930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127932 {"clusterName" (rawinput1127930 "clusterName"), "message" (rawinput1127930 "message")}] (clojure.core/cond-> {} (letvar1127932 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127932 ["clusterName"]))) (letvar1127932 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127932 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1127934 input] (clojure.core/let [rawinput1127933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127935 {"clusterName" (rawinput1127933 "clusterName"), "message" (rawinput1127933 "message")}] (clojure.core/cond-> {} (letvar1127935 "clusterName") (clojure.core/assoc :cluster-name (deser-string (clojure.core/get-in letvar1127935 ["clusterName"]))) (letvar1127935 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1127935 ["message"])))))))

(clojure.core/defn- response-describe-update-response ([input] (response-describe-update-response nil input)) ([resultWrapper1127937 input] (clojure.core/let [rawinput1127936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127938 {"update" (rawinput1127936 "update")}] (clojure.core/cond-> {} (letvar1127938 "update") (clojure.core/assoc :update (deser-update (clojure.core/get-in letvar1127938 ["update"])))))))

(clojure.core/defn- response-update-cluster-version-response ([input] (response-update-cluster-version-response nil input)) ([resultWrapper1127940 input] (clojure.core/let [rawinput1127939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1127941 {"update" (rawinput1127939 "update")}] (clojure.core/cond-> {} (letvar1127941 "update") (clojure.core/assoc :update (deser-update (clojure.core/get-in letvar1127941 ["update"])))))))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-updates-request-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/list-clusters-request-max-results))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.list-clusters-request/max-results :portkey.aws.eks.-2017-11-01.list-clusters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/string-list (clojure.spec.alpha/coll-of :portkey.aws.eks.-2017-11-01/string))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.client-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.client-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.client-exception/cluster-name :portkey.aws.eks.-2017-11-01.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.delete-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.delete-cluster-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.invalid-request-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.invalid-request-exception/cluster-name :portkey.aws.eks.-2017-11-01.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.list-clusters-response/clusters :portkey.aws.eks.-2017-11-01.list-clusters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-status #{"Failed" "Cancelled" :in-progress :successful :cancelled "InProgress" "Successful" :failed})

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.vpc-config-response/subnet-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.vpc-config-response/security-group-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.vpc-config-response/vpc-id (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.vpc-config-response/subnet-ids :portkey.aws.eks.-2017-11-01.vpc-config-response/security-group-ids :portkey.aws.eks.-2017-11-01.vpc-config-response/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-in-use-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.resource-in-use-exception/cluster-name :portkey.aws.eks.-2017-11-01.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.describe-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/cluster))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/describe-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.describe-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.describe-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/describe-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.describe-cluster-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.delete-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/cluster))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.delete-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-param-type #{:platform-version "PlatformVersion" "Version" :version})

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/cluster))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.create-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-param/type (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update-param-type))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-param/value (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-param (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.update-param/type :portkey.aws.eks.-2017-11-01.update-param/value]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.vpc-config-request/subnet-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.vpc-config-request/security-group-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/vpc-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.vpc-config-request/subnet-ids] :opt-un [:portkey.aws.eks.-2017-11-01.vpc-config-request/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.error-detail/error-code (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/error-code))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.error-detail/error-message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.error-detail/resource-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/error-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.error-detail/error-code :portkey.aws.eks.-2017-11-01.error-detail/error-message :portkey.aws.eks.-2017-11-01.error-detail/resource-ids]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/id (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/status (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update-status))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/type (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update-type))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/params (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update-params))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/created-at (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update/errors (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/error-details))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.update/id :portkey.aws.eks.-2017-11-01.update/status :portkey.aws.eks.-2017-11-01.update/type :portkey.aws.eks.-2017-11-01.update/params :portkey.aws.eks.-2017-11-01.update/created-at :portkey.aws.eks.-2017-11-01.update/errors]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/error-code #{"OperationNotPermitted" "EniLimitReached" :eni-limit-reached :ip-not-available "AccessDenied" "VpcIdNotFound" :unknown "IpNotAvailable" "Unknown" "SubnetNotFound" :subnet-not-found "SecurityGroupNotFound" :security-group-not-found :vpc-id-not-found :operation-not-permitted :access-denied})

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/resources-vpc-config (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/arn (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/created-at (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/role-arn (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/client-request-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/status (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/cluster-status))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/version (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/platform-version (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/endpoint (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.cluster/certificate-authority (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/certificate))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.cluster/resources-vpc-config :portkey.aws.eks.-2017-11-01.cluster/arn :portkey.aws.eks.-2017-11-01.cluster/created-at :portkey.aws.eks.-2017-11-01.cluster/role-arn :portkey.aws.eks.-2017-11-01.cluster/client-request-token :portkey.aws.eks.-2017-11-01.cluster/name :portkey.aws.eks.-2017-11-01.cluster/status :portkey.aws.eks.-2017-11-01.cluster/version :portkey.aws.eks.-2017-11-01.cluster/platform-version :portkey.aws.eks.-2017-11-01.cluster/endpoint :portkey.aws.eks.-2017-11-01.cluster/certificate-authority]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-not-found-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.resource-not-found-exception/cluster-name :portkey.aws.eks.-2017-11-01.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/cluster-status #{:creating :deleting :active "DELETING" "CREATING" "ACTIVE" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.describe-update-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.describe-update-request/update-id (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/describe-update-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.describe-update-request/name :portkey.aws.eks.-2017-11-01.describe-update-request/update-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/valid-zones (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/unsupported-availability-zone-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/message :portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/cluster-name :portkey.aws.eks.-2017-11-01.unsupported-availability-zone-exception/valid-zones]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/cluster-name))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-request/version (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-request/role-arn (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-request/resources-vpc-config (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/vpc-config-request))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.create-cluster-request/client-request-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/create-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.create-cluster-request/name :portkey.aws.eks.-2017-11-01.create-cluster-request/role-arn :portkey.aws.eks.-2017-11-01.create-cluster-request/resources-vpc-config] :opt-un [:portkey.aws.eks.-2017-11-01.create-cluster-request/version :portkey.aws.eks.-2017-11-01.create-cluster-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-params (clojure.spec.alpha/coll-of :portkey.aws.eks.-2017-11-01/update-param))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-updates-response/update-ids (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string-list))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-updates-response/next-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-updates-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.list-updates-response/update-ids :portkey.aws.eks.-2017-11-01.list-updates-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.server-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.server-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.server-exception/cluster-name :portkey.aws.eks.-2017-11-01.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-type #{"VersionUpdate" :version-update})

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-cluster-version-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-cluster-version-request/version (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-cluster-version-request/client-request-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-cluster-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.update-cluster-version-request/name :portkey.aws.eks.-2017-11-01.update-cluster-version-request/version] :opt-un [:portkey.aws.eks.-2017-11-01.update-cluster-version-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-limit-exceeded-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.resource-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/resource-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.resource-limit-exceeded-exception/cluster-name :portkey.aws.eks.-2017-11-01.resource-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/error-details (clojure.spec.alpha/coll-of :portkey.aws.eks.-2017-11-01/error-detail))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-updates-request/name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-updates-request/next-token (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.list-updates-request/max-results (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/list-updates-request-max-results))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-updates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.eks.-2017-11-01.list-updates-request/name] :opt-un [:portkey.aws.eks.-2017-11-01.list-updates-request/next-token :portkey.aws.eks.-2017-11-01.list-updates-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/cluster-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9A-Za-z][A-Za-z0-9\-_]*" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.invalid-parameter-exception/cluster-name (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.invalid-parameter-exception/cluster-name :portkey.aws.eks.-2017-11-01.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.describe-update-response/update (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/describe-update-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.describe-update-response/update]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.certificate/data (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/string))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.certificate/data]))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/list-clusters-request-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01.update-cluster-version-response/update (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update))
(clojure.spec.alpha/def :portkey.aws.eks.-2017-11-01/update-cluster-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.eks.-2017-11-01.update-cluster-version-response/update]))

(clojure.core/defn create-cluster ([create-cluster-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/create-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks.-2017-11-01/resource-in-use-exception, "ResourceLimitExceededException" :portkey.aws.eks.-2017-11-01/resource-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.eks.-2017-11-01/invalid-parameter-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ServiceUnavailableException" :portkey.aws.eks.-2017-11-01/service-unavailable-exception, "UnsupportedAvailabilityZoneException" :portkey.aws.eks.-2017-11-01/unsupported-availability-zone-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/create-cluster-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/delete-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.eks.-2017-11-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.eks.-2017-11-01/resource-not-found-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ServiceUnavailableException" :portkey.aws.eks.-2017-11-01/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/delete-cluster-response))

(clojure.core/defn describe-cluster ([describe-cluster-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-cluster-request describe-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/describe-cluster-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/describe-cluster-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCluster", :http.request.configuration/output-deser-fn response-describe-cluster-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.eks.-2017-11-01/resource-not-found-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ServiceUnavailableException" :portkey.aws.eks.-2017-11-01/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/describe-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/describe-cluster-response))

(clojure.core/defn describe-update ([describe-update-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-update-request describe-update-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/describe-update-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates/{updateId}", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/describe-update-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUpdate", :http.request.configuration/output-deser-fn response-describe-update-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks.-2017-11-01/invalid-parameter-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ResourceNotFoundException" :portkey.aws.eks.-2017-11-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-update :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/describe-update-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/describe-update-response))

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/list-clusters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn response-list-clusters-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks.-2017-11-01/invalid-parameter-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ServiceUnavailableException" :portkey.aws.eks.-2017-11-01/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.eks.-2017-11-01/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/list-clusters-response))

(clojure.core/defn list-updates ([list-updates-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-updates-request list-updates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/list-updates-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/list-updates-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListUpdates", :http.request.configuration/output-deser-fn response-list-updates-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks.-2017-11-01/invalid-parameter-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ResourceNotFoundException" :portkey.aws.eks.-2017-11-01/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-updates :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/list-updates-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/list-updates-response))

(clojure.core/defn update-cluster-version ([update-cluster-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-cluster-version-request update-cluster-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.eks.-2017-11-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.eks.-2017-11-01/update-cluster-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/clusters/{name}/updates", :http.request.configuration/version "2017-11-01", :http.request.configuration/service-id "EKS", :http.request.spec/input-spec :portkey.aws.eks.-2017-11-01/update-cluster-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateClusterVersion", :http.request.configuration/output-deser-fn response-update-cluster-version-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.eks.-2017-11-01/invalid-parameter-exception, "ClientException" :portkey.aws.eks.-2017-11-01/client-exception, "ServerException" :portkey.aws.eks.-2017-11-01/server-exception, "ResourceInUseException" :portkey.aws.eks.-2017-11-01/resource-in-use-exception, "ResourceNotFoundException" :portkey.aws.eks.-2017-11-01/resource-not-found-exception, "InvalidRequestException" :portkey.aws.eks.-2017-11-01/invalid-request-exception}})))))
(clojure.spec.alpha/fdef update-cluster-version :args (clojure.spec.alpha/tuple :portkey.aws.eks.-2017-11-01/update-cluster-version-request) :ret (clojure.spec.alpha/and :portkey.aws.eks.-2017-11-01/update-cluster-version-response))
