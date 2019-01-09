(ns portkey.aws.iot1click-projects.-2018-05-14 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-projects-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-projects-request/max-results (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/max-results))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/list-projects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.list-projects-request/next-token :portkey.aws.iot1click-projects.-2018-05-14.list-projects-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/create-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.delete-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.delete-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.delete-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.delete-placement-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.describe-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.describe-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.describe-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.describe-placement-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.invalid-request-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.invalid-request-exception/code :portkey.aws.iot1click-projects.-2018-05-14.invalid-request-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-callback-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects.-2018-05-14/device-template-name :portkey.aws.iot1click-projects.-2018-05-14/device-id))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.placement-summary/project-name :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/placement-name :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/created-date :portkey.aws.iot1click-projects.-2018-05-14.placement-summary/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-placements-response/placements (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-placements-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/list-placements-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.list-placements-response/placements] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.list-placements-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/device-template-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-template-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/project-name :portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.disassociate-device-from-placement-request/device-template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.describe-placement-response/placement (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.describe-placement-response/placement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.describe-project-response/project (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/describe-project-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.describe-project-response/project] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-callback-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-description/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-description/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-description/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-description/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-description/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-description (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.placement-description/project-name :portkey.aws.iot1click-projects.-2018-05-14.placement-description/placement-name :portkey.aws.iot1click-projects.-2018-05-14.placement-description/attributes :portkey.aws.iot1click-projects.-2018-05-14.placement-description/created-date :portkey.aws.iot1click-projects.-2018-05-14.placement-description/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-project-request/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-project-request/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/update-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.update-project-request/project-name] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.update-project-request/description :portkey.aws.iot1click-projects.-2018-05-14.update-project-request/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/project-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot1click-projects.-2018-05-14/project-summary))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/update-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/project-name] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.update-placement-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-project-request/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-project-request/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/create-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.create-project-request/project-name] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.create-project-request/description :portkey.aws.iot1click-projects.-2018-05-14.create-project-request/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.too-many-requests-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.too-many-requests-exception/code :portkey.aws.iot1click-projects.-2018-05-14.too-many-requests-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.internal-failure-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.internal-failure-exception/code :portkey.aws.iot1click-projects.-2018-05-14.internal-failure-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.describe-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/describe-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.describe-project-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-projects-response/projects (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-summary-list))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-projects-response/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/list-projects-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.list-projects-response/projects] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.list-projects-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-response/devices (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-response/devices] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 800))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.resource-not-found-exception/code :portkey.aws.iot1click-projects.-2018-05-14.resource-not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-template/default-attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/default-placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.placement-template/device-templates (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-template-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.placement-template/default-attributes :portkey.aws.iot1click-projects.-2018-05-14.placement-template/device-templates]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/create-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/device-id (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-id))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/device-template-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-template-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/project-name :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/device-id :portkey.aws.iot1click-projects.-2018-05-14.associate-device-with-placement-request/device-template-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/attributes (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-attribute-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/create-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/placement-name :portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/project-name] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.create-placement-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-description/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-description/description (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/description))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-description/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-description/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-description/placement-template (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-template))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/project-description (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.project-description/project-name :portkey.aws.iot1click-projects.-2018-05-14.project-description/created-date :portkey.aws.iot1click-projects.-2018-05-14.project-description/updated-date] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.project-description/description :portkey.aws.iot1click-projects.-2018-05-14.project-description/placement-template]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-request/placement-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/placement-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-request/project-name :portkey.aws.iot1click-projects.-2018-05-14.get-devices-in-placement-request/placement-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/default-placement-attribute-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects.-2018-05-14/attribute-name :portkey.aws.iot1click-projects.-2018-05-14/attribute-default-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/update-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.resource-conflict-exception/code (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/code))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/message))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/resource-conflict-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.resource-conflict-exception/code :portkey.aws.iot1click-projects.-2018-05-14.resource-conflict-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-summary/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-summary/created-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.project-summary/updated-date (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/time))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/project-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.project-summary/project-name :portkey.aws.iot1click-projects.-2018-05-14.project-summary/created-date :portkey.aws.iot1click-projects.-2018-05-14.project-summary/updated-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/attribute-default-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 800))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-summary-list (clojure.spec.alpha/coll-of :portkey.aws.iot1click-projects.-2018-05-14/placement-summary))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/placement-attribute-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects.-2018-05-14/attribute-name :portkey.aws.iot1click-projects.-2018-05-14/attribute-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/max-results (clojure.spec.alpha/int-in 1 250))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/project-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[0-9A-Za-z_-]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-callback-override-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects.-2018-05-14/device-callback-key :portkey.aws.iot1click-projects.-2018-05-14/device-callback-value))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/update-placement-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.delete-project-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/delete-project-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.delete-project-request/project-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/delete-project-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.device-template/device-type (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-type))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.device-template/callback-overrides (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/device-callback-override-map))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.device-template/device-type :portkey.aws.iot1click-projects.-2018-05-14.device-template/callback-overrides]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/project-name (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/project-name))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/next-token (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/next-token))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/max-results (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/max-results))
(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/list-placements-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/project-name] :opt-un [:portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/next-token :portkey.aws.iot1click-projects.-2018-05-14.list-placements-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.iot1click-projects.-2018-05-14/device-template-map (clojure.spec.alpha/map-of :portkey.aws.iot1click-projects.-2018-05-14/device-template-name :portkey.aws.iot1click-projects.-2018-05-14/device-template))

(clojure.core/defn describe-project ([describe-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-project-request describe-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/describe-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/describe-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/describe-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/describe-project-response))

(clojure.core/defn update-placement ([update-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-placement-request update-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/update-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/update-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/update-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/update-placement-response))

(clojure.core/defn list-projects ([] (list-projects {})) ([list-projects-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-projects-request list-projects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/list-projects-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/list-projects-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProjects", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-projects :args (clojure.spec.alpha/? :portkey.aws.iot1click-projects.-2018-05-14/list-projects-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/list-projects-response))

(clojure.core/defn update-project ([update-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-project-request update-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/update-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/update-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef update-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/update-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/update-project-response))

(clojure.core/defn delete-placement ([delete-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-placement-request delete-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/delete-placement-response))

(clojure.core/defn disassociate-device-from-placement ([disassociate-device-from-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disassociate-device-from-placement-request disassociate-device-from-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices/{deviceTemplateName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDeviceFromPlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef disassociate-device-from-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/disassociate-device-from-placement-response))

(clojure.core/defn describe-placement ([describe-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-placement-request describe-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/describe-placement-response))

(clojure.core/defn delete-project ([delete-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-project-request delete-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/delete-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/delete-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.iot1click-projects.-2018-05-14/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/delete-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/delete-project-response))

(clojure.core/defn create-placement ([create-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-placement-request create-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/create-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/create-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects.-2018-05-14/resource-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/create-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/create-placement-response))

(clojure.core/defn get-devices-in-placement ([get-devices-in-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-devices-in-placement-request get-devices-in-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDevicesInPlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-devices-in-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/get-devices-in-placement-response))

(clojure.core/defn associate-device-with-placement ([associate-device-with-placement-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-associate-device-with-placement-request associate-device-with-placement-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements/{placementName}/devices/{deviceTemplateName}", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDeviceWithPlacement", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects.-2018-05-14/resource-conflict-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-device-with-placement :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/associate-device-with-placement-response))

(clojure.core/defn list-placements ([list-placements-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-placements-request list-placements-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/list-placements-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects/{projectName}/placements", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/list-placements-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPlacements", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot1click-projects.-2018-05-14/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-placements :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/list-placements-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/list-placements-response))

(clojure.core/defn create-project ([create-project-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-project-request create-project-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.iot1click-projects.-2018-05-14/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iot1click-projects.-2018-05-14/create-project-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/projects", :http.request.configuration/version "2018-05-14", :http.request.configuration/service-id "IoT 1Click Projects", :http.request.spec/input-spec :portkey.aws.iot1click-projects.-2018-05-14/create-project-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProject", :http.request.spec/error-spec {"InternalFailureException" :portkey.aws.iot1click-projects.-2018-05-14/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot1click-projects.-2018-05-14/invalid-request-exception, "ResourceConflictException" :portkey.aws.iot1click-projects.-2018-05-14/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef create-project :args (clojure.spec.alpha/tuple :portkey.aws.iot1click-projects.-2018-05-14/create-project-request) :ret (clojure.spec.alpha/and :portkey.aws.iot1click-projects.-2018-05-14/create-project-response))
