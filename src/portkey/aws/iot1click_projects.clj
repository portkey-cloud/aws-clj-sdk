(ns portkey.aws.iot1click-projects (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-device-callback-value)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-device-callback-key)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-device-template-name)

(clojure.core/declare ser-description)

(clojure.core/declare ser-device-type)

(clojure.core/declare ser-placement-template)

(clojure.core/declare ser-default-placement-attribute-map)

(clojure.core/declare ser-placement-name)

(clojure.core/declare ser-device-id)

(clojure.core/declare ser-attribute-default-value)

(clojure.core/declare ser-placement-attribute-map)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-project-name)

(clojure.core/declare ser-device-callback-override-map)

(clojure.core/declare ser-device-template)

(clojure.core/declare ser-device-template-map)

(clojure.core/defn- ser-device-callback-value [input] #:http.request.field{:value input, :shape "DeviceCallbackValue"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-device-callback-key [input] #:http.request.field{:value input, :shape "DeviceCallbackKey"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-device-template-name [input] #:http.request.field{:value input, :shape "DeviceTemplateName"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-device-type [input] #:http.request.field{:value input, :shape "DeviceType"})

(clojure.core/defn- ser-placement-template [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlacementTemplate", :type "structure"} (clojure.core/contains? input :default-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default-placement-attribute-map (input :default-attributes)) #:http.request.field{:name "defaultAttributes", :shape "DefaultPlacementAttributeMap"})) (clojure.core/contains? input :device-templates) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-template-map (input :device-templates)) #:http.request.field{:name "deviceTemplates", :shape "DeviceTemplateMap"}))))

(clojure.core/defn- ser-default-placement-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-default-value v) #:http.request.field{:map-info "value", :shape "AttributeDefaultValue"})])) input), :shape "DefaultPlacementAttributeMap", :type "map"})

(clojure.core/defn- ser-placement-name [input] #:http.request.field{:value input, :shape "PlacementName"})

(clojure.core/defn- ser-device-id [input] #:http.request.field{:value input, :shape "DeviceId"})

(clojure.core/defn- ser-attribute-default-value [input] #:http.request.field{:value input, :shape "AttributeDefaultValue"})

(clojure.core/defn- ser-placement-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-attribute-name k) #:http.request.field{:map-info "key", :shape "AttributeName"}) (clojure.core/into (ser-attribute-value v) #:http.request.field{:map-info "value", :shape "AttributeValue"})])) input), :shape "PlacementAttributeMap", :type "map"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-project-name [input] #:http.request.field{:value input, :shape "ProjectName"})

(clojure.core/defn- ser-device-callback-override-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-device-callback-key k) #:http.request.field{:map-info "key", :shape "DeviceCallbackKey"}) (clojure.core/into (ser-device-callback-value v) #:http.request.field{:map-info "value", :shape "DeviceCallbackValue"})])) input), :shape "DeviceCallbackOverrideMap", :type "map"})

(clojure.core/defn- ser-device-template [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeviceTemplate", :type "structure"} (clojure.core/contains? input :device-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-type (input :device-type)) #:http.request.field{:name "deviceType", :shape "DeviceType"})) (clojure.core/contains? input :callback-overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-callback-override-map (input :callback-overrides)) #:http.request.field{:name "callbackOverrides", :shape "DeviceCallbackOverrideMap"}))))

(clojure.core/defn- ser-device-template-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-device-template-name k) #:http.request.field{:map-info "key", :shape "DeviceTemplateName"}) (clojure.core/into (ser-device-template v) #:http.request.field{:map-info "value", :shape "DeviceTemplate"})])) input), :shape "DeviceTemplateMap", :type "map"})

(clojure.core/defn- req-list-projects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"}) (clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]}))

(clojure.core/defn- req-describe-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"}) (clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]}))

(clojure.core/defn- req-disassociate-device-from-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"}) (clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"}) (clojure.core/into (ser-device-template-name (input :device-template-name)) #:http.request.field{:name "deviceTemplateName", :shape "DeviceTemplateName", :location "uri", :location-name "deviceTemplateName"})]}))

(clojure.core/defn- req-update-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :placement-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-template (input :placement-template)) #:http.request.field{:name "placementTemplate", :shape "PlacementTemplate"}))))

(clojure.core/defn- req-update-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"}) (clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-attribute-map (input :attributes)) #:http.request.field{:name "attributes", :shape "PlacementAttributeMap"}))))

(clojure.core/defn- req-create-project-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :placement-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-template (input :placement-template)) #:http.request.field{:name "placementTemplate", :shape "PlacementTemplate"}))))

(clojure.core/defn- req-describe-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]}))

(clojure.core/defn- req-associate-device-with-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"}) (clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"}) (clojure.core/into (ser-device-template-name (input :device-template-name)) #:http.request.field{:name "deviceTemplateName", :shape "DeviceTemplateName", :location "uri", :location-name "deviceTemplateName"})], :body [(clojure.core/into (ser-device-id (input :device-id)) #:http.request.field{:name "deviceId", :shape "DeviceId"})]}))

(clojure.core/defn- req-create-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName"})], :uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-attribute-map (input :attributes)) #:http.request.field{:name "attributes", :shape "PlacementAttributeMap"}))))

(clojure.core/defn- req-get-devices-in-placement-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"}) (clojure.core/into (ser-placement-name (input :placement-name)) #:http.request.field{:name "placementName", :shape "PlacementName", :location "uri", :location-name "placementName"})]}))

(clojure.core/defn- req-delete-project-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]}))

(clojure.core/defn- req-list-placements-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-project-name (input :project-name)) #:http.request.field{:name "projectName", :shape "ProjectName", :location "uri", :location-name "projectName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/declare deser-device-callback-value)

(clojure.core/declare deser-device-map)

(clojure.core/declare deser-placement-summary)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-device-callback-key)

(clojure.core/declare deser-placement-description)

(clojure.core/declare deser-project-summary-list)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-device-template-name)

(clojure.core/declare deser-description)

(clojure.core/declare deser-device-type)

(clojure.core/declare deser-message)

(clojure.core/declare deser-placement-template)

(clojure.core/declare deser-project-description)

(clojure.core/declare deser-default-placement-attribute-map)

(clojure.core/declare deser-placement-name)

(clojure.core/declare deser-device-id)

(clojure.core/declare deser-project-summary)

(clojure.core/declare deser-attribute-default-value)

(clojure.core/declare deser-placement-summary-list)

(clojure.core/declare deser-placement-attribute-map)

(clojure.core/declare deser-project-name)

(clojure.core/declare deser-code)

(clojure.core/declare deser-device-callback-override-map)

(clojure.core/declare deser-device-template)

(clojure.core/declare deser-time)

(clojure.core/declare deser-device-template-map)

(clojure.core/defn- deser-device-callback-value [input] input)

(clojure.core/defn- deser-device-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-device-template-name k) (deser-device-id v)])) input))

(clojure.core/defn- deser-placement-summary [input] (clojure.core/cond-> {:project-name (deser-project-name (input "projectName")), :placement-name (deser-placement-name (input "placementName")), :created-date (deser-time (input "createdDate")), :updated-date (deser-time (input "updatedDate"))}))

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-device-callback-key [input] input)

(clojure.core/defn- deser-placement-description [input] (clojure.core/cond-> {:project-name (deser-project-name (input "projectName")), :placement-name (deser-placement-name (input "placementName")), :attributes (deser-placement-attribute-map (input "attributes")), :created-date (deser-time (input "createdDate")), :updated-date (deser-time (input "updatedDate"))}))

(clojure.core/defn- deser-project-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-project-summary coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-attribute-value [input] input)

(clojure.core/defn- deser-device-template-name [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-device-type [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-placement-template [input] (clojure.core/cond-> {} (clojure.core/contains? input "defaultAttributes") (clojure.core/assoc :default-attributes (deser-default-placement-attribute-map (input "defaultAttributes"))) (clojure.core/contains? input "deviceTemplates") (clojure.core/assoc :device-templates (deser-device-template-map (input "deviceTemplates")))))

(clojure.core/defn- deser-project-description [input] (clojure.core/cond-> {:project-name (deser-project-name (input "projectName")), :created-date (deser-time (input "createdDate")), :updated-date (deser-time (input "updatedDate"))} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "placementTemplate") (clojure.core/assoc :placement-template (deser-placement-template (input "placementTemplate")))))

(clojure.core/defn- deser-default-placement-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-default-value v)])) input))

(clojure.core/defn- deser-placement-name [input] input)

(clojure.core/defn- deser-device-id [input] input)

(clojure.core/defn- deser-project-summary [input] (clojure.core/cond-> {:project-name (deser-project-name (input "projectName")), :created-date (deser-time (input "createdDate")), :updated-date (deser-time (input "updatedDate"))}))

(clojure.core/defn- deser-attribute-default-value [input] input)

(clojure.core/defn- deser-placement-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-placement-summary coll))) input))

(clojure.core/defn- deser-placement-attribute-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-attribute-name k) (deser-attribute-value v)])) input))

(clojure.core/defn- deser-project-name [input] input)

(clojure.core/defn- deser-code [input] input)

(clojure.core/defn- deser-device-callback-override-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-device-callback-key k) (deser-device-callback-value v)])) input))

(clojure.core/defn- deser-device-template [input] (clojure.core/cond-> {} (clojure.core/contains? input "deviceType") (clojure.core/assoc :device-type (deser-device-type (input "deviceType"))) (clojure.core/contains? input "callbackOverrides") (clojure.core/assoc :callback-overrides (deser-device-callback-override-map (input "callbackOverrides")))))

(clojure.core/defn- deser-time [input] input)

(clojure.core/defn- deser-device-template-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-device-template-name k) (deser-device-template v)])) input))

(clojure.core/defn- response-create-placement-response ([input] (response-create-placement-response nil input)) ([resultWrapper1234942 input] (clojure.core/let [rawinput1234941 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234943 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1234945 input] (clojure.core/let [rawinput1234944 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234946 {"code" (rawinput1234944 "code"), "message" (rawinput1234944 "message")}] (clojure.core/cond-> {:code (deser-code (clojure.core/get-in letvar1234946 ["code"])), :message (deser-message (clojure.core/get-in letvar1234946 ["message"]))}))))

(clojure.core/defn- response-list-placements-response ([input] (response-list-placements-response nil input)) ([resultWrapper1234948 input] (clojure.core/let [rawinput1234947 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234949 {"placements" (rawinput1234947 "placements"), "nextToken" (rawinput1234947 "nextToken")}] (clojure.core/cond-> {:placements (deser-placement-summary-list (clojure.core/get-in letvar1234949 ["placements"]))} (letvar1234949 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1234949 ["nextToken"])))))))

(clojure.core/defn- response-delete-placement-response ([input] (response-delete-placement-response nil input)) ([resultWrapper1234951 input] (clojure.core/let [rawinput1234950 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234952 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-placement-response ([input] (response-describe-placement-response nil input)) ([resultWrapper1234954 input] (clojure.core/let [rawinput1234953 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234955 {"placement" (rawinput1234953 "placement")}] (clojure.core/cond-> {:placement (deser-placement-description (clojure.core/get-in letvar1234955 ["placement"]))}))))

(clojure.core/defn- response-describe-project-response ([input] (response-describe-project-response nil input)) ([resultWrapper1234957 input] (clojure.core/let [rawinput1234956 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234958 {"project" (rawinput1234956 "project")}] (clojure.core/cond-> {:project (deser-project-description (clojure.core/get-in letvar1234958 ["project"]))}))))

(clojure.core/defn- response-disassociate-device-from-placement-response ([input] (response-disassociate-device-from-placement-response nil input)) ([resultWrapper1234960 input] (clojure.core/let [rawinput1234959 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234961 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-associate-device-with-placement-response ([input] (response-associate-device-with-placement-response nil input)) ([resultWrapper1234963 input] (clojure.core/let [rawinput1234962 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234964 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1234966 input] (clojure.core/let [rawinput1234965 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234967 {"code" (rawinput1234965 "code"), "message" (rawinput1234965 "message")}] (clojure.core/cond-> {:code (deser-code (clojure.core/get-in letvar1234967 ["code"])), :message (deser-message (clojure.core/get-in letvar1234967 ["message"]))}))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1234969 input] (clojure.core/let [rawinput1234968 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234970 {"code" (rawinput1234968 "code"), "message" (rawinput1234968 "message")}] (clojure.core/cond-> {:code (deser-code (clojure.core/get-in letvar1234970 ["code"])), :message (deser-message (clojure.core/get-in letvar1234970 ["message"]))}))))

(clojure.core/defn- response-list-projects-response ([input] (response-list-projects-response nil input)) ([resultWrapper1234972 input] (clojure.core/let [rawinput1234971 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234973 {"projects" (rawinput1234971 "projects"), "nextToken" (rawinput1234971 "nextToken")}] (clojure.core/cond-> {:projects (deser-project-summary-list (clojure.core/get-in letvar1234973 ["projects"]))} (letvar1234973 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1234973 ["nextToken"])))))))

(clojure.core/defn- response-get-devices-in-placement-response ([input] (response-get-devices-in-placement-response nil input)) ([resultWrapper1234975 input] (clojure.core/let [rawinput1234974 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234976 {"devices" (rawinput1234974 "devices")}] (clojure.core/cond-> {:devices (deser-device-map (clojure.core/get-in letvar1234976 ["devices"]))}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1234978 input] (clojure.core/let [rawinput1234977 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234979 {"code" (rawinput1234977 "code"), "message" (rawinput1234977 "message")}] (clojure.core/cond-> {:code (deser-code (clojure.core/get-in letvar1234979 ["code"])), :message (deser-message (clojure.core/get-in letvar1234979 ["message"]))}))))

(clojure.core/defn- response-create-project-response ([input] (response-create-project-response nil input)) ([resultWrapper1234981 input] (clojure.core/let [rawinput1234980 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234982 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-project-response ([input] (response-update-project-response nil input)) ([resultWrapper1234984 input] (clojure.core/let [rawinput1234983 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234985 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper1234987 input] (clojure.core/let [rawinput1234986 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234988 {"code" (rawinput1234986 "code"), "message" (rawinput1234986 "message")}] (clojure.core/cond-> {:code (deser-code (clojure.core/get-in letvar1234988 ["code"])), :message (deser-message (clojure.core/get-in letvar1234988 ["message"]))}))))

(clojure.core/defn- response-update-placement-response ([input] (response-update-placement-response nil input)) ([resultWrapper1234990 input] (clojure.core/let [rawinput1234989 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234991 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-project-response ([input] (response-delete-project-response nil input)) ([resultWrapper1234993 input] (clojure.core/let [rawinput1234992 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1234994 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.iot1click-projects/max-results))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.list-projects-request/next-token :portkey.aws.iot1click-projects.list-projects-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/create-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.delete-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.delete-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/delete-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.delete-placement-request/placement-name :portkey.aws.iot1click-projects.delete-placement-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.describe-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.describe-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/describe-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.describe-placement-request/placement-name :portkey.aws.iot1click-projects.describe-placement-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.invalid-request-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/invalid-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.invalid-request-exception/code :portkey.aws.iot1click-projects.invalid-request-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-callback-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects/device-template-name :portkey.aws.iot1click-projects/device-id))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-summary/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-summary/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-summary/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-summary/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.placement-summary/project-name :portkey.aws.iot1click-projects.placement-summary/placement-name :portkey.aws.iot1click-projects.placement-summary/created-date :portkey.aws.iot1click-projects.placement-summary/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-placements-response/placements (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-placements-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/list-placements-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.list-placements-response/placements] :opt-un [:portkey.aws.iot1click-projects.list-placements-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.disassociate-device-from-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.disassociate-device-from-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.disassociate-device-from-placement-request/device-template-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-template-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/disassociate-device-from-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.disassociate-device-from-placement-request/project-name :portkey.aws.iot1click-projects.disassociate-device-from-placement-request/placement-name :portkey.aws.iot1click-projects.disassociate-device-from-placement-request/device-template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/delete-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.describe-placement-response/placement (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/describe-placement-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.describe-placement-response/placement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.describe-project-response/project (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/describe-project-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.describe-project-response/project] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-callback-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-description/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-description/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-description/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-description/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-description/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-description (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.placement-description/project-name :portkey.aws.iot1click-projects.placement-description/placement-name :portkey.aws.iot1click-projects.placement-description/attributes :portkey.aws.iot1click-projects.placement-description/created-date :portkey.aws.iot1click-projects.placement-description/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/disassociate-device-from-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-project-request/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-project-request/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.update-project-request/project-name] :opt-un [:portkey.aws.iot1click-projects.update-project-request/description :portkey.aws.iot1click-projects.update-project-request/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/associate-device-with-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/project-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot1click-projects/project-summary))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.update-placement-request/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/update-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.update-placement-request/placement-name :portkey.aws.iot1click-projects.update-placement-request/project-name] :opt-un [:portkey.aws.iot1click-projects.update-placement-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-project-request/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-project-request/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.create-project-request/project-name] :opt-un [:portkey.aws.iot1click-projects.create-project-request/description :portkey.aws.iot1click-projects.create-project-request/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.too-many-requests-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/too-many-requests-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.too-many-requests-exception/code :portkey.aws.iot1click-projects.too-many-requests-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.internal-failure-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/internal-failure-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.internal-failure-exception/code :portkey.aws.iot1click-projects.internal-failure-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.describe-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.describe-project-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-projects-response/projects (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-projects-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/list-projects-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.list-projects-response/projects] :opt-un [:portkey.aws.iot1click-projects.list-projects-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.get-devices-in-placement-response/devices (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/get-devices-in-placement-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.get-devices-in-placement-response/devices] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 800))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/resource-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.resource-not-found-exception/code :portkey.aws.iot1click-projects.resource-not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-template/default-attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects/default-placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.placement-template/device-templates (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-template-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.placement-template/default-attributes :portkey.aws.iot1click-projects.placement-template/device-templates]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/create-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.associate-device-with-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.associate-device-with-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.associate-device-with-placement-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-id))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.associate-device-with-placement-request/device-template-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-template-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/associate-device-with-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.associate-device-with-placement-request/project-name :portkey.aws.iot1click-projects.associate-device-with-placement-request/placement-name :portkey.aws.iot1click-projects.associate-device-with-placement-request/device-id :portkey.aws.iot1click-projects.associate-device-with-placement-request/device-template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.create-placement-request/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/create-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.create-placement-request/placement-name :portkey.aws.iot1click-projects.create-placement-request/project-name] :opt-un [:portkey.aws.iot1click-projects.create-placement-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-description/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-description/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-description/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-description/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-description/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/project-description (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.project-description/project-name :portkey.aws.iot1click-projects.project-description/created-date :portkey.aws.iot1click-projects.project-description/updated-date] :opt-un [:portkey.aws.iot1click-projects.project-description/description :portkey.aws.iot1click-projects.project-description/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.get-devices-in-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.get-devices-in-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/get-devices-in-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.get-devices-in-placement-request/project-name :portkey.aws.iot1click-projects.get-devices-in-placement-request/placement-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/default-placement-attribute-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects/attribute-name :portkey.aws.iot1click-projects/attribute-default-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/update-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.resource-conflict-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/resource-conflict-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.resource-conflict-exception/code :portkey.aws.iot1click-projects.resource-conflict-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-summary/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-summary/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.project-summary/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/project-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.project-summary/project-name :portkey.aws.iot1click-projects.project-summary/created-date :portkey.aws.iot1click-projects.project-summary/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/attribute-default-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 800))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot1click-projects/placement-summary))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/placement-attribute-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects/attribute-name :portkey.aws.iot1click-projects/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9A-Za-z_-]+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-callback-override-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects/device-callback-key :portkey.aws.iot1click-projects/device-callback-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/update-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.delete-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.delete-project-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/delete-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.device-template/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-type))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.device-template/callback-overrides (clojure.spec.alpha/and :portkey.aws.iot1click-projects/device-callback-override-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.device-template/device-type :portkey.aws.iot1click-projects.device-template/callback-overrides]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-placements-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-placements-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.list-placements-request/max-results (clojure.spec.alpha/and :portkey.aws.iot1click-projects/max-results))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects/list-placements-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.list-placements-request/project-name] :opt-un [:portkey.aws.iot1click-projects.list-placements-request/next-token :portkey.aws.iot1click-projects.list-placements-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects/device-template-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects/device-template-name :portkey.aws.iot1click-projects/device-template))

(clojure.core/defn describe-project ([describe-project-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/describe-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/describe-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeProject", :http.request.configuration/output-deser-fn response-describe-project-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/describe-project-response))

(clojure.core/defn update-placement ([update-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-placement-request update-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/update-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/update-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePlacement", :http.request.configuration/output-deser-fn response-update-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/update-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/update-placement-response))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/list-projects-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/list-projects-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListProjects", :http.request.configuration/output-deser-fn response-list-projects-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.iot1click-projects/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/list-projects-response))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/update-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/update-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateProject", :http.request.configuration/output-deser-fn response-update-project-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/update-project-response))

(clojure.core/defn delete-placement ([delete-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-placement-request delete-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/delete-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/delete-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePlacement", :http.request.configuration/output-deser-fn response-delete-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/delete-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/delete-placement-response))

(clojure.core/defn disassociate-device-from-placement ([disassociate-device-from-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-disassociate-device-from-placement-request disassociate-device-from-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/disassociate-device-from-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices/{deviceTemplateName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/disassociate-device-from-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateDeviceFromPlacement", :http.request.configuration/output-deser-fn response-disassociate-device-from-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disassociate-device-from-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/disassociate-device-from-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/disassociate-device-from-placement-response))

(clojure.core/defn describe-placement ([describe-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-placement-request describe-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/describe-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/describe-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribePlacement", :http.request.configuration/output-deser-fn response-describe-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/describe-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/describe-placement-response))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/delete-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/delete-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteProject", :http.request.configuration/output-deser-fn response-delete-project-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/delete-project-response))

(clojure.core/defn create-placement ([create-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-placement-request create-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/create-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/create-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePlacement", :http.request.configuration/output-deser-fn response-create-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects/resource-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/create-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/create-placement-response))

(clojure.core/defn get-devices-in-placement ([get-devices-in-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-devices-in-placement-request get-devices-in-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/get-devices-in-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/get-devices-in-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDevicesInPlacement", :http.request.configuration/output-deser-fn response-get-devices-in-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-devices-in-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/get-devices-in-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/get-devices-in-placement-response))

(clojure.core/defn associate-device-with-placement ([associate-device-with-placement-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-associate-device-with-placement-request associate-device-with-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/associate-device-with-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices/{deviceTemplateName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/associate-device-with-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateDeviceWithPlacement", :http.request.configuration/output-deser-fn response-associate-device-with-placement-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects/resource-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-device-with-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/associate-device-with-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/associate-device-with-placement-response))

(clojure.core/defn list-placements ([list-placements-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-placements-request list-placements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/list-placements-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/list-placements-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPlacements", :http.request.configuration/output-deser-fn response-list-placements-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-placements :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/list-placements-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/list-placements-response))

(clojure.core/defn create-project ([create-project-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects/create-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects/create-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateProject", :http.request.configuration/output-deser-fn response-create-project-response, :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects/create-project-response))
