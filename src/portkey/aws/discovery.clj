(ns portkey.aws.discovery (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-2"
   {:credential-scope {:service "discovery", :region "us-west-2"},
    :ssl-common-name "discovery.us-west-2.amazonaws.com",
    :endpoint "https://discovery.us-west-2.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare serorder-string)

(clojure.core/declare ser-tag-set)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-export-data-formats)

(clojure.core/declare ser-configurations-export-id)

(clojure.core/declare ser-order-by-list)

(clojure.core/declare ser-configuration-id-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-tag-filters)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-application-id)

(clojure.core/declare ser-agent-id)

(clojure.core/declare ser-application-ids-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-configuration-item-type)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-export-data-format)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-export-filter)

(clojure.core/declare ser-order-by-element)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-describe-continuous-exports-max-results)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-export-filters)

(clojure.core/declare ser-export-ids)

(clojure.core/declare ser-time-stamp)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-continuous-export-ids)

(clojure.core/declare ser-agent-ids)

(clojure.core/declare ser-boolean)

(clojure.core/defn- serorder-string [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "orderString"})

(clojure.core/defn- ser-tag-set [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagSet", :type "list"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "values", :shape "FilterValues"}) (clojure.core/into (ser-condition (:condition input)) #:http.request.field{:name "condition", :shape "Condition"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-export-data-formats [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-export-data-format coll) #:http.request.field{:shape "ExportDataFormat"}))) input), :shape "ExportDataFormats", :type "list"})

(clojure.core/defn- ser-configurations-export-id [input] #:http.request.field{:value input, :shape "ConfigurationsExportId"})

(clojure.core/defn- ser-order-by-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-order-by-element coll) #:http.request.field{:shape "OrderByElement"}))) input), :shape "OrderByList", :type "list"})

(clojure.core/defn- ser-configuration-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-id coll) #:http.request.field{:shape "ConfigurationId"}))) input), :shape "ConfigurationIdList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-configuration-id [input] #:http.request.field{:value input, :shape "ConfigurationId"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-tag-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilters", :type "list"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list"})

(clojure.core/defn- ser-application-id [input] #:http.request.field{:value input, :shape "ApplicationId"})

(clojure.core/defn- ser-agent-id [input] #:http.request.field{:value input, :shape "AgentId"})

(clojure.core/defn- ser-application-ids-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-id coll) #:http.request.field{:shape "ApplicationId"}))) input), :shape "ApplicationIdsList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-configuration-item-type [input] #:http.request.field{:value (clojure.core/get {"SERVER" "SERVER", :server "SERVER", "PROCESS" "PROCESS", :process "PROCESS", "CONNECTION" "CONNECTION", :connection "CONNECTION", "APPLICATION" "APPLICATION", :application "APPLICATION"} input), :shape "ConfigurationItemType"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-export-data-format [input] #:http.request.field{:value (clojure.core/get {"CSV" "CSV", :csv "CSV", "GRAPHML" "GRAPHML", :graphml "GRAPHML"} input), :shape "ExportDataFormat"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-name (:name input)) #:http.request.field{:name "name", :shape "FilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "values", :shape "FilterValues"})], :shape "TagFilter", :type "structure"}))

(clojure.core/defn- ser-export-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-name (:name input)) #:http.request.field{:name "name", :shape "FilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "values", :shape "FilterValues"}) (clojure.core/into (ser-condition (:condition input)) #:http.request.field{:name "condition", :shape "Condition"})], :shape "ExportFilter", :type "structure"}))

(clojure.core/defn- ser-order-by-element [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:field-name input)) #:http.request.field{:name "fieldName", :shape "String"})], :shape "OrderByElement", :type "structure"} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serorder-string (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "orderString"}))))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-condition [input] #:http.request.field{:value input, :shape "Condition"})

(clojure.core/defn- ser-describe-continuous-exports-max-results [input] #:http.request.field{:value input, :shape "DescribeContinuousExportsMaxResults"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-export-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-export-filter coll) #:http.request.field{:shape "ExportFilter"}))) input), :shape "ExportFilters", :type "list"})

(clojure.core/defn- ser-export-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configurations-export-id coll) #:http.request.field{:shape "ConfigurationsExportId"}))) input), :shape "ExportIds", :type "list"})

(clojure.core/defn- ser-time-stamp [input] #:http.request.field{:value input, :shape "TimeStamp"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-continuous-export-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configurations-export-id coll) #:http.request.field{:shape "ConfigurationsExportId"}))) input), :shape "ContinuousExportIds", :type "list"})

(clojure.core/defn- ser-agent-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-agent-id coll) #:http.request.field{:shape "AgentId"}))) input), :shape "AgentIds", :type "list"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-delete-applications-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-ids-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ApplicationIdsList"})]}))

(clojure.core/defn- req-start-data-collection-by-agent-ids-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-ids (input :agent-ids)) #:http.request.field{:name "agentIds", :shape "AgentIds"})]}))

(clojure.core/defn- req-create-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-delete-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "tags", :shape "TagSet"}))))

(clojure.core/defn- req-stop-continuous-export-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configurations-export-id (input :export-id)) #:http.request.field{:name "exportId", :shape "ConfigurationsExportId"})]}))

(clojure.core/defn- req-describe-continuous-exports-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :export-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuous-export-ids (input :export-ids)) #:http.request.field{:name "exportIds", :shape "ContinuousExportIds"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-continuous-exports-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "DescribeContinuousExportsMaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-start-export-task-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :export-data-format) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-data-formats (input :export-data-format)) #:http.request.field{:name "exportDataFormat", :shape "ExportDataFormats"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-filters (input :filters)) #:http.request.field{:name "filters", :shape "ExportFilters"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-stamp (input :start-time)) #:http.request.field{:name "startTime", :shape "TimeStamp"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-stamp (input :end-time)) #:http.request.field{:name "endTime", :shape "TimeStamp"}))))

(clojure.core/defn- req-describe-agents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :agent-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-agent-ids (input :agent-ids)) #:http.request.field{:name "agentIds", :shape "AgentIds"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"}) (clojure.core/into (ser-tag-set (input :tags)) #:http.request.field{:name "tags", :shape "TagSet"})]}))

(clojure.core/defn- req-associate-configuration-items-to-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-configuration-id)) #:http.request.field{:name "applicationConfigurationId", :shape "ApplicationId"}) (clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"})]}))

(clojure.core/defn- req-list-server-neighbors-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-id (input :configuration-id)) #:http.request.field{:name "configurationId", :shape "ConfigurationId"})]} (clojure.core/contains? input :port-information-needed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :port-information-needed)) #:http.request.field{:name "portInformationNeeded", :shape "Boolean"})) (clojure.core/contains? input :neighbor-configuration-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-id-list (input :neighbor-configuration-ids)) #:http.request.field{:name "neighborConfigurationIds", :shape "ConfigurationIdList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-stop-data-collection-by-agent-ids-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-agent-ids (input :agent-ids)) #:http.request.field{:name "agentIds", :shape "AgentIds"})]}))

(clojure.core/defn- req-describe-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"})]}))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filters (input :filters)) #:http.request.field{:name "filters", :shape "TagFilters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-discovery-summary-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-export-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :export-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-ids (input :export-ids)) #:http.request.field{:name "exportIds", :shape "ExportIds"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-filters (input :filters)) #:http.request.field{:name "filters", :shape "ExportFilters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-export-configurations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :export-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-ids (input :export-ids)) #:http.request.field{:name "exportIds", :shape "ExportIds"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-start-continuous-export-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-item-type (input :configuration-type)) #:http.request.field{:name "configurationType", :shape "ConfigurationItemType"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :order-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-by-list (input :order-by)) #:http.request.field{:name "orderBy", :shape "OrderByList"}))))

(clojure.core/defn- req-update-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :configuration-id)) #:http.request.field{:name "configurationId", :shape "ApplicationId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-disassociate-configuration-items-from-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-configuration-id)) #:http.request.field{:name "applicationConfigurationId", :shape "ApplicationId"}) (clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"})]}))

(clojure.spec.alpha/def :portkey.aws.discovery/agent-configuration-status-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/agent-configuration-status))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration-tag-set (clojure.spec.alpha/coll-of :portkey.aws.discovery/configuration-tag))

(clojure.spec.alpha/def :portkey.aws.discovery.delete-applications-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/application-ids-list))
(clojure.spec.alpha/def :portkey.aws.discovery/delete-applications-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.delete-applications-request/configuration-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/order-string #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.discovery.describe-tags-response/tags (clojure.spec.alpha/and :portkey.aws.discovery/configuration-tag-set))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-tags-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-tags-response/tags :portkey.aws.discovery.describe-tags-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery/configurations-download-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/neighbor-details-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/neighbor-connection-detail))

(clojure.spec.alpha/def :portkey.aws.discovery/delete-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/tag-set (clojure.spec.alpha/coll-of :portkey.aws.discovery/tag))

(clojure.spec.alpha/def :portkey.aws.discovery.filter/name (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.filter/values (clojure.spec.alpha/and :portkey.aws.discovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.discovery.filter/condition (clojure.spec.alpha/and :portkey.aws.discovery/condition))
(clojure.spec.alpha/def :portkey.aws.discovery/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.filter/name :portkey.aws.discovery.filter/values :portkey.aws.discovery.filter/condition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/export-data-formats (clojure.spec.alpha/coll-of :portkey.aws.discovery/export-data-format))

(clojure.spec.alpha/def :portkey.aws.discovery.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/disassociate-configuration-items-from-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/export-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.discovery.describe-configurations-response/configurations (clojure.spec.alpha/and :portkey.aws.discovery/describe-configurations-attributes))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-configurations-response/configurations]))

(clojure.spec.alpha/def :portkey.aws.discovery.configuration-tag/configuration-type (clojure.spec.alpha/and :portkey.aws.discovery/configuration-item-type))
(clojure.spec.alpha/def :portkey.aws.discovery.configuration-tag/configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.configuration-tag/key (clojure.spec.alpha/and :portkey.aws.discovery/tag-key))
(clojure.spec.alpha/def :portkey.aws.discovery.configuration-tag/value (clojure.spec.alpha/and :portkey.aws.discovery/tag-value))
(clojure.spec.alpha/def :portkey.aws.discovery.configuration-tag/time-of-creation (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery/configuration-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.configuration-tag/configuration-type :portkey.aws.discovery.configuration-tag/configuration-id :portkey.aws.discovery.configuration-tag/key :portkey.aws.discovery.configuration-tag/value :portkey.aws.discovery.configuration-tag/time-of-creation]))

(clojure.spec.alpha/def :portkey.aws.discovery.start-data-collection-by-agent-ids-request/agent-ids (clojure.spec.alpha/and :portkey.aws.discovery/agent-ids))
(clojure.spec.alpha/def :portkey.aws.discovery/start-data-collection-by-agent-ids-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.start-data-collection-by-agent-ids-request/agent-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.create-application-request/name (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.create-application-request/description (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/create-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.create-application-request/name] :opt-un [:portkey.aws.discovery.create-application-request/description]))

(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-response/configurations (clojure.spec.alpha/and :portkey.aws.discovery/configurations))
(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/list-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.list-configurations-response/configurations :portkey.aws.discovery.list-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.server-internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/server-internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.server-internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/configurations-export-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 252))))

(clojure.spec.alpha/def :portkey.aws.discovery/export-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/agent-id (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/operation-succeeded (clojure.spec.alpha/and :portkey.aws.discovery/boolean))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/description (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/agent-configuration-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.agent-configuration-status/agent-id :portkey.aws.discovery.agent-configuration-status/operation-succeeded :portkey.aws.discovery.agent-configuration-status/description]))

(clojure.spec.alpha/def :portkey.aws.discovery/order-by-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/order-by-element))

(clojure.spec.alpha/def :portkey.aws.discovery/schema-storage-config (clojure.spec.alpha/map-of :portkey.aws.discovery/database-name :portkey.aws.discovery/string))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-response/agents-info (clojure.spec.alpha/and :portkey.aws.discovery/agents-info))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-agents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-agents-response/agents-info :portkey.aws.discovery.describe-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery/associate-configuration-items-to-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.agent-network-info/ip-address (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-network-info/mac-address (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/agent-network-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.agent-network-info/ip-address :portkey.aws.discovery.agent-network-info/mac-address]))

(clojure.spec.alpha/def :portkey.aws.discovery/boxed-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.discovery/describe-configurations-attributes (clojure.spec.alpha/coll-of :portkey.aws.discovery/describe-configurations-attribute))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration-id-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/configuration-id))

(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/source-server-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/destination-server-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/destination-port (clojure.spec.alpha/and :portkey.aws.discovery/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/transport-protocol (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/connections-count (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery/neighbor-connection-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.neighbor-connection-detail/source-server-id :portkey.aws.discovery.neighbor-connection-detail/destination-server-id :portkey.aws.discovery.neighbor-connection-detail/connections-count] :opt-un [:portkey.aws.discovery.neighbor-connection-detail/destination-port :portkey.aws.discovery.neighbor-connection-detail/transport-protocol]))

(clojure.spec.alpha/def :portkey.aws.discovery.delete-tags-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery.delete-tags-request/tags (clojure.spec.alpha/and :portkey.aws.discovery/tag-set))
(clojure.spec.alpha/def :portkey.aws.discovery/delete-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.delete-tags-request/configuration-ids] :opt-un [:portkey.aws.discovery.delete-tags-request/tags]))

(clojure.spec.alpha/def :portkey.aws.discovery/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/configurations (clojure.spec.alpha/coll-of :portkey.aws.discovery/configuration))

(clojure.spec.alpha/def :portkey.aws.discovery.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/update-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.export-configurations-response/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery/export-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.export-configurations-response/export-id]))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-response/descriptions (clojure.spec.alpha/and :portkey.aws.discovery/continuous-export-descriptions))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-continuous-exports-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-continuous-exports-response/descriptions :portkey.aws.discovery.describe-continuous-exports-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.stop-continuous-export-request/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery/stop-continuous-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.stop-continuous-export-request/export-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-response/exports-info (clojure.spec.alpha/and :portkey.aws.discovery/exports-info))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-export-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-export-tasks-response/exports-info :portkey.aws.discovery.describe-export-tasks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-request/export-ids (clojure.spec.alpha/and :portkey.aws.discovery/continuous-export-ids))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/describe-continuous-exports-max-results))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-continuous-exports-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-continuous-exports-request/export-ids :portkey.aws.discovery.describe-continuous-exports-request/max-results :portkey.aws.discovery.describe-continuous-exports-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/status (clojure.spec.alpha/and :portkey.aws.discovery/continuous-export-status))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/status-detail (clojure.spec.alpha/and :portkey.aws.discovery/string-max-255))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/s-3-bucket (clojure.spec.alpha/and :portkey.aws.discovery/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/start-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/stop-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/data-source (clojure.spec.alpha/and :portkey.aws.discovery/data-source))
(clojure.spec.alpha/def :portkey.aws.discovery.continuous-export-description/schema-storage-config (clojure.spec.alpha/and :portkey.aws.discovery/schema-storage-config))
(clojure.spec.alpha/def :portkey.aws.discovery/continuous-export-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.continuous-export-description/export-id :portkey.aws.discovery.continuous-export-description/status :portkey.aws.discovery.continuous-export-description/status-detail :portkey.aws.discovery.continuous-export-description/s-3-bucket :portkey.aws.discovery.continuous-export-description/start-time :portkey.aws.discovery.continuous-export-description/stop-time :portkey.aws.discovery.continuous-export-description/data-source :portkey.aws.discovery.continuous-export-description/schema-storage-config]))

(clojure.spec.alpha/def :portkey.aws.discovery/tag-filters (clojure.spec.alpha/coll-of :portkey.aws.discovery/tag-filter))

(clojure.spec.alpha/def :portkey.aws.discovery/filter-values (clojure.spec.alpha/coll-of :portkey.aws.discovery/filter-value))

(clojure.spec.alpha/def :portkey.aws.discovery/continuous-export-status #{:inactive :start-failed "STOP_IN_PROGRESS" :start-in-progress "ERROR" "START_IN_PROGRESS" :active "INACTIVE" "ACTIVE" :stop-in-progress :stop-failed "START_FAILED" :error "STOP_FAILED"})

(clojure.spec.alpha/def :portkey.aws.discovery.start-export-task-request/export-data-format (clojure.spec.alpha/and :portkey.aws.discovery/export-data-formats))
(clojure.spec.alpha/def :portkey.aws.discovery.start-export-task-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/export-filters))
(clojure.spec.alpha/def :portkey.aws.discovery.start-export-task-request/start-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.start-export-task-request/end-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery/start-export-task-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.start-export-task-request/export-data-format :portkey.aws.discovery.start-export-task-request/filters :portkey.aws.discovery.start-export-task-request/start-time :portkey.aws.discovery.start-export-task-request/end-time]))

(clojure.spec.alpha/def :portkey.aws.discovery/agents-info (clojure.spec.alpha/coll-of :portkey.aws.discovery/agent-info))

(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/servers (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/applications (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/servers-mapped-to-applications (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/servers-mappedto-tags (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/agent-summary (clojure.spec.alpha/and :portkey.aws.discovery/customer-agent-info))
(clojure.spec.alpha/def :portkey.aws.discovery.get-discovery-summary-response/connector-summary (clojure.spec.alpha/and :portkey.aws.discovery/customer-connector-info))
(clojure.spec.alpha/def :portkey.aws.discovery/get-discovery-summary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.get-discovery-summary-response/servers :portkey.aws.discovery.get-discovery-summary-response/applications :portkey.aws.discovery.get-discovery-summary-response/servers-mapped-to-applications :portkey.aws.discovery.get-discovery-summary-response/servers-mappedto-tags :portkey.aws.discovery.get-discovery-summary-response/agent-summary :portkey.aws.discovery.get-discovery-summary-response/connector-summary]))

(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-response/neighbors (clojure.spec.alpha/and :portkey.aws.discovery/neighbor-details-list))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-response/known-dependency-count (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery/list-server-neighbors-response (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.list-server-neighbors-response/neighbors] :opt-un [:portkey.aws.discovery.list-server-neighbors-response/next-token :portkey.aws.discovery.list-server-neighbors-response/known-dependency-count]))

(clojure.spec.alpha/def :portkey.aws.discovery/agent-status #{"UNKNOWN" :unknown :unhealthy :running :blacklisted :healthy "HEALTHY" "SHUTDOWN" "BLACKLISTED" "RUNNING" :shutdown "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.discovery.start-data-collection-by-agent-ids-response/agents-configuration-status (clojure.spec.alpha/and :portkey.aws.discovery/agent-configuration-status-list))
(clojure.spec.alpha/def :portkey.aws.discovery/start-data-collection-by-agent-ids-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.start-data-collection-by-agent-ids-response/agents-configuration-status]))

(clojure.spec.alpha/def :portkey.aws.discovery/create-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/application-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-request/agent-ids (clojure.spec.alpha/and :portkey.aws.discovery/agent-ids))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/filters))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-agents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-agents-request/agent-ids :portkey.aws.discovery.describe-agents-request/filters :portkey.aws.discovery.describe-agents-request/max-results :portkey.aws.discovery.describe-agents-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/agent-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.create-tags-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery.create-tags-request/tags (clojure.spec.alpha/and :portkey.aws.discovery/tag-set))
(clojure.spec.alpha/def :portkey.aws.discovery/create-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.create-tags-request/configuration-ids :portkey.aws.discovery.create-tags-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-configurations-response/exports-info (clojure.spec.alpha/and :portkey.aws.discovery/exports-info))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-configurations-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-export-configurations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-export-configurations-response/exports-info :portkey.aws.discovery.describe-export-configurations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery/application-ids-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/application-id))

(clojure.spec.alpha/def :portkey.aws.discovery/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.start-continuous-export-response/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery.start-continuous-export-response/s-3-bucket (clojure.spec.alpha/and :portkey.aws.discovery/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.discovery.start-continuous-export-response/start-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.start-continuous-export-response/data-source (clojure.spec.alpha/and :portkey.aws.discovery/data-source))
(clojure.spec.alpha/def :portkey.aws.discovery.start-continuous-export-response/schema-storage-config (clojure.spec.alpha/and :portkey.aws.discovery/schema-storage-config))
(clojure.spec.alpha/def :portkey.aws.discovery/start-continuous-export-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.start-continuous-export-response/export-id :portkey.aws.discovery.start-continuous-export-response/s-3-bucket :portkey.aws.discovery.start-continuous-export-response/start-time :portkey.aws.discovery.start-continuous-export-response/data-source :portkey.aws.discovery.start-continuous-export-response/schema-storage-config]))

(clojure.spec.alpha/def :portkey.aws.discovery.associate-configuration-items-to-application-request/application-configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/application-id))
(clojure.spec.alpha/def :portkey.aws.discovery.associate-configuration-items-to-application-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery/associate-configuration-items-to-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.associate-configuration-items-to-application-request/application-configuration-id :portkey.aws.discovery.associate-configuration-items-to-application-request/configuration-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-request/configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-request/port-information-needed (clojure.spec.alpha/and :portkey.aws.discovery/boolean))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-request/neighbor-configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.list-server-neighbors-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/list-server-neighbors-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.list-server-neighbors-request/configuration-id] :opt-un [:portkey.aws.discovery.list-server-neighbors-request/port-information-needed :portkey.aws.discovery.list-server-neighbors-request/neighbor-configuration-ids :portkey.aws.discovery.list-server-neighbors-request/max-results :portkey.aws.discovery.list-server-neighbors-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.authorization-error-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/authorization-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.authorization-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration-item-type #{"PROCESS" :application :server :process "APPLICATION" "SERVER" "CONNECTION" :connection})

(clojure.spec.alpha/def :portkey.aws.discovery/describe-configurations-attribute (clojure.spec.alpha/map-of :portkey.aws.discovery/string :portkey.aws.discovery/string))

(clojure.spec.alpha/def :portkey.aws.discovery.start-export-task-response/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery/start-export-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.start-export-task-response/export-id]))

(clojure.spec.alpha/def :portkey.aws.discovery.stop-data-collection-by-agent-ids-request/agent-ids (clojure.spec.alpha/and :portkey.aws.discovery/agent-ids))
(clojure.spec.alpha/def :portkey.aws.discovery/stop-data-collection-by-agent-ids-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.stop-data-collection-by-agent-ids-request/agent-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/agent-network-info-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/agent-network-info))

(clojure.spec.alpha/def :portkey.aws.discovery/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.discovery/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-configurations-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.describe-configurations-request/configuration-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/data-source #{"AGENT" :agent})

(clojure.spec.alpha/def :portkey.aws.discovery/export-data-format #{"CSV" "GRAPHML" :csv :graphml})

(clojure.spec.alpha/def :portkey.aws.discovery.describe-tags-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/tag-filters))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-tags-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-tags-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-tags-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-tags-request/filters :portkey.aws.discovery.describe-tags-request/max-results :portkey.aws.discovery.describe-tags-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.create-application-response/configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/create-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.create-application-response/configuration-id]))

(clojure.spec.alpha/def :portkey.aws.discovery/filters (clojure.spec.alpha/coll-of :portkey.aws.discovery/filter))

(clojure.spec.alpha/def :portkey.aws.discovery/delete-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.tag-filter/name (clojure.spec.alpha/and :portkey.aws.discovery/filter-name))
(clojure.spec.alpha/def :portkey.aws.discovery.tag-filter/values (clojure.spec.alpha/and :portkey.aws.discovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.discovery/tag-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.tag-filter/name :portkey.aws.discovery.tag-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/get-discovery-summary-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.conflict-error-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/conflict-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.conflict-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/s-3-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-request/export-ids (clojure.spec.alpha/and :portkey.aws.discovery/export-ids))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/export-filters))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-export-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-export-tasks-request/export-ids :portkey.aws.discovery.describe-export-tasks-request/filters :portkey.aws.discovery.describe-export-tasks-request/max-results :portkey.aws.discovery.describe-export-tasks-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.export-filter/name (clojure.spec.alpha/and :portkey.aws.discovery/filter-name))
(clojure.spec.alpha/def :portkey.aws.discovery.export-filter/values (clojure.spec.alpha/and :portkey.aws.discovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.discovery.export-filter/condition (clojure.spec.alpha/and :portkey.aws.discovery/condition))
(clojure.spec.alpha/def :portkey.aws.discovery/export-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.export-filter/name :portkey.aws.discovery.export-filter/values :portkey.aws.discovery.export-filter/condition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.stop-data-collection-by-agent-ids-response/agents-configuration-status (clojure.spec.alpha/and :portkey.aws.discovery/agent-configuration-status-list))
(clojure.spec.alpha/def :portkey.aws.discovery/stop-data-collection-by-agent-ids-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.stop-data-collection-by-agent-ids-response/agents-configuration-status]))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-configurations-request/export-ids (clojure.spec.alpha/and :portkey.aws.discovery/export-ids))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-export-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-export-configurations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-export-configurations-request/export-ids :portkey.aws.discovery.describe-export-configurations-request/max-results :portkey.aws.discovery.describe-export-configurations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.order-by-element/field-name (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.order-by-element/sort-order (clojure.spec.alpha/and :portkey.aws.discovery/order-string))
(clojure.spec.alpha/def :portkey.aws.discovery/order-by-element (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.order-by-element/field-name] :opt-un [:portkey.aws.discovery.order-by-element/sort-order]))

(clojure.spec.alpha/def :portkey.aws.discovery.tag/key (clojure.spec.alpha/and :portkey.aws.discovery/tag-key))
(clojure.spec.alpha/def :portkey.aws.discovery.tag/value (clojure.spec.alpha/and :portkey.aws.discovery/tag-value))
(clojure.spec.alpha/def :portkey.aws.discovery/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.tag/key :portkey.aws.discovery.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/condition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/start-continuous-export-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/describe-continuous-exports-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-request/configuration-type (clojure.spec.alpha/and :portkey.aws.discovery/configuration-item-type))
(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/filters))
(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery.list-configurations-request/order-by (clojure.spec.alpha/and :portkey.aws.discovery/order-by-list))
(clojure.spec.alpha/def :portkey.aws.discovery/list-configurations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.list-configurations-request/configuration-type] :opt-un [:portkey.aws.discovery.list-configurations-request/filters :portkey.aws.discovery.list-configurations-request/max-results :portkey.aws.discovery.list-configurations-request/next-token :portkey.aws.discovery.list-configurations-request/order-by]))

(clojure.spec.alpha/def :portkey.aws.discovery/export-request-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.discovery/filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/export-filters (clojure.spec.alpha/coll-of :portkey.aws.discovery/export-filter))

(clojure.spec.alpha/def :portkey.aws.discovery/export-ids (clojure.spec.alpha/coll-of :portkey.aws.discovery/configurations-export-id))

(clojure.spec.alpha/def :portkey.aws.discovery.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/active-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/healthy-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/black-listed-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/shutdown-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/unhealthy-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/total-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-connector-info/unknown-connectors (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery/customer-connector-info (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.customer-connector-info/active-connectors :portkey.aws.discovery.customer-connector-info/healthy-connectors :portkey.aws.discovery.customer-connector-info/black-listed-connectors :portkey.aws.discovery.customer-connector-info/shutdown-connectors :portkey.aws.discovery.customer-connector-info/unhealthy-connectors :portkey.aws.discovery.customer-connector-info/total-connectors :portkey.aws.discovery.customer-connector-info/unknown-connectors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/continuous-export-descriptions (clojure.spec.alpha/coll-of :portkey.aws.discovery/continuous-export-description))

(clojure.spec.alpha/def :portkey.aws.discovery.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration (clojure.spec.alpha/map-of :portkey.aws.discovery/string :portkey.aws.discovery/string))

(clojure.spec.alpha/def :portkey.aws.discovery/exports-info (clojure.spec.alpha/coll-of :portkey.aws.discovery/export-info))

(clojure.spec.alpha/def :portkey.aws.discovery/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.discovery.update-application-request/configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/application-id))
(clojure.spec.alpha/def :portkey.aws.discovery.update-application-request/name (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.update-application-request/description (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/update-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.update-application-request/configuration-id] :opt-un [:portkey.aws.discovery.update-application-request/name :portkey.aws.discovery.update-application-request/description]))

(clojure.spec.alpha/def :portkey.aws.discovery.disassociate-configuration-items-from-application-request/application-configuration-id (clojure.spec.alpha/and :portkey.aws.discovery/application-id))
(clojure.spec.alpha/def :portkey.aws.discovery.disassociate-configuration-items-from-application-request/configuration-ids (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id-list))
(clojure.spec.alpha/def :portkey.aws.discovery/disassociate-configuration-items-from-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.disassociate-configuration-items-from-application-request/application-configuration-id :portkey.aws.discovery.disassociate-configuration-items-from-application-request/configuration-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/active-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/healthy-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/black-listed-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/shutdown-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/unhealthy-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/total-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.customer-agent-info/unknown-agents (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery/customer-agent-info (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.customer-agent-info/active-agents :portkey.aws.discovery.customer-agent-info/healthy-agents :portkey.aws.discovery.customer-agent-info/black-listed-agents :portkey.aws.discovery.customer-agent-info/shutdown-agents :portkey.aws.discovery.customer-agent-info/unhealthy-agents :portkey.aws.discovery.customer-agent-info/total-agents :portkey.aws.discovery.customer-agent-info/unknown-agents] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.stop-continuous-export-response/start-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.stop-continuous-export-response/stop-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery/stop-continuous-export-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.stop-continuous-export-response/start-time :portkey.aws.discovery.stop-continuous-export-response/stop-time]))

(clojure.spec.alpha/def :portkey.aws.discovery/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/last-health-ping-time (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/agent-id (clojure.spec.alpha/and :portkey.aws.discovery/agent-id))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/health (clojure.spec.alpha/and :portkey.aws.discovery/agent-status))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/agent-network-info-list (clojure.spec.alpha/and :portkey.aws.discovery/agent-network-info-list))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/connector-id (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/registered-time (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/collection-status (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/agent-type (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/host-name (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-info/version (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/agent-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.agent-info/last-health-ping-time :portkey.aws.discovery.agent-info/agent-id :portkey.aws.discovery.agent-info/health :portkey.aws.discovery.agent-info/agent-network-info-list :portkey.aws.discovery.agent-info/connector-id :portkey.aws.discovery.agent-info/registered-time :portkey.aws.discovery.agent-info/collection-status :portkey.aws.discovery.agent-info/agent-type :portkey.aws.discovery.agent-info/host-name :portkey.aws.discovery.agent-info/version]))

(clojure.spec.alpha/def :portkey.aws.discovery/string-max-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.discovery.export-info/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/export-status (clojure.spec.alpha/and :portkey.aws.discovery/export-status))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/status-message (clojure.spec.alpha/and :portkey.aws.discovery/export-status-message))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/configurations-download-url (clojure.spec.alpha/and :portkey.aws.discovery/configurations-download-url))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/export-request-time (clojure.spec.alpha/and :portkey.aws.discovery/export-request-time))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/is-truncated (clojure.spec.alpha/and :portkey.aws.discovery/boolean))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/requested-start-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.export-info/requested-end-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery/export-info (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.export-info/export-id :portkey.aws.discovery.export-info/export-status :portkey.aws.discovery.export-info/status-message :portkey.aws.discovery.export-info/export-request-time] :opt-un [:portkey.aws.discovery.export-info/configurations-download-url :portkey.aws.discovery.export-info/is-truncated :portkey.aws.discovery.export-info/requested-start-time :portkey.aws.discovery.export-info/requested-end-time]))

(clojure.spec.alpha/def :portkey.aws.discovery/continuous-export-ids (clojure.spec.alpha/coll-of :portkey.aws.discovery/configurations-export-id))

(clojure.spec.alpha/def :portkey.aws.discovery/agent-ids (clojure.spec.alpha/coll-of :portkey.aws.discovery/agent-id))

(clojure.spec.alpha/def :portkey.aws.discovery/boolean clojure.core/boolean?)

(clojure.core/defn start-continuous-export ([] (start-continuous-export {})) ([start-continuous-export-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-continuous-export-request start-continuous-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/start-continuous-export-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-continuous-export-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartContinuousExport", :http.request.spec/error-spec {"ConflictErrorException" :portkey.aws.discovery/conflict-error-exception, "AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceInUseException" :portkey.aws.discovery/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef start-continuous-export :args (clojure.spec.alpha/? :portkey.aws.discovery/start-continuous-export-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-continuous-export-response))

(clojure.core/defn stop-data-collection-by-agent-ids ([stop-data-collection-by-agent-ids-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-data-collection-by-agent-ids-request stop-data-collection-by-agent-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/stop-data-collection-by-agent-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/stop-data-collection-by-agent-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopDataCollectionByAgentIds", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef stop-data-collection-by-agent-ids :args (clojure.spec.alpha/tuple :portkey.aws.discovery/stop-data-collection-by-agent-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/stop-data-collection-by-agent-ids-response))

(clojure.core/defn delete-tags ([delete-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/delete-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/delete-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTags", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.discovery/delete-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/delete-tags-response))

(clojure.core/defn describe-configurations ([describe-configurations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-configurations-request describe-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConfigurations", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-configurations :args (clojure.spec.alpha/tuple :portkey.aws.discovery/describe-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-configurations-response))

(clojure.core/defn create-tags ([create-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/create-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/create-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTags", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.discovery/create-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/create-tags-response))

(clojure.core/defn describe-export-tasks ([] (describe-export-tasks {})) ([describe-export-tasks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-export-tasks-request describe-export-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-export-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-export-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExportTasks", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-export-tasks :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-export-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-export-tasks-response))

(clojure.core/defn start-export-task ([] (start-export-task {})) ([start-export-task-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-export-task-request start-export-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/start-export-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-export-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartExportTask", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef start-export-task :args (clojure.spec.alpha/? :portkey.aws.discovery/start-export-task-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-export-task-response))

(clojure.core/defn disassociate-configuration-items-from-application ([disassociate-configuration-items-from-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-configuration-items-from-application-request disassociate-configuration-items-from-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/disassociate-configuration-items-from-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/disassociate-configuration-items-from-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateConfigurationItemsFromApplication", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-configuration-items-from-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/disassociate-configuration-items-from-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/disassociate-configuration-items-from-application-response))

(clojure.core/defn list-configurations ([list-configurations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-configurations-request list-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/list-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/list-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListConfigurations", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-configurations :args (clojure.spec.alpha/tuple :portkey.aws.discovery/list-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/list-configurations-response))

(clojure.core/defn describe-agents ([] (describe-agents {})) ([describe-agents-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-agents-request describe-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAgents", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-agents :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-agents-response))

(clojure.core/defn list-server-neighbors ([list-server-neighbors-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-server-neighbors-request list-server-neighbors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/list-server-neighbors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/list-server-neighbors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListServerNeighbors", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-server-neighbors :args (clojure.spec.alpha/tuple :portkey.aws.discovery/list-server-neighbors-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/list-server-neighbors-response))

(clojure.core/defn describe-tags ([] (describe-tags {})) ([describe-tags-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-tags-response))

(clojure.core/defn update-application ([update-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/update-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/update-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplication", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/update-application-response))

(clojure.core/defn export-configurations ([] (export-configurations {})) ([_] (clojure.core/let [request-function-result__28606__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/export-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ExportConfigurations", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef export-configurations :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.discovery/export-configurations-response))

(clojure.core/defn get-discovery-summary ([] (get-discovery-summary {})) ([get-discovery-summary-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-discovery-summary-request get-discovery-summary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/get-discovery-summary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/get-discovery-summary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDiscoverySummary", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-discovery-summary :args (clojure.spec.alpha/? :portkey.aws.discovery/get-discovery-summary-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/get-discovery-summary-response))

(clojure.core/defn create-application ([create-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/create-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/create-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApplication", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/create-application-response))

(clojure.core/defn describe-continuous-exports ([] (describe-continuous-exports {})) ([describe-continuous-exports-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-continuous-exports-request describe-continuous-exports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-continuous-exports-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-continuous-exports-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeContinuousExports", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-continuous-exports :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-continuous-exports-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-continuous-exports-response))

(clojure.core/defn stop-continuous-export ([stop-continuous-export-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-continuous-export-request stop-continuous-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/stop-continuous-export-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/stop-continuous-export-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopContinuousExport", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "ResourceInUseException" :portkey.aws.discovery/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef stop-continuous-export :args (clojure.spec.alpha/tuple :portkey.aws.discovery/stop-continuous-export-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/stop-continuous-export-response))

(clojure.core/defn start-data-collection-by-agent-ids ([start-data-collection-by-agent-ids-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-data-collection-by-agent-ids-request start-data-collection-by-agent-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/start-data-collection-by-agent-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-data-collection-by-agent-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartDataCollectionByAgentIds", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef start-data-collection-by-agent-ids :args (clojure.spec.alpha/tuple :portkey.aws.discovery/start-data-collection-by-agent-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-data-collection-by-agent-ids-response))

(clojure.core/defn describe-export-configurations ([] (describe-export-configurations {})) ([describe-export-configurations-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-export-configurations-request describe-export-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/describe-export-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-export-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeExportConfigurations", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-export-configurations :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-export-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-export-configurations-response))

(clojure.core/defn associate-configuration-items-to-application ([associate-configuration-items-to-application-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-configuration-items-to-application-request associate-configuration-items-to-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/associate-configuration-items-to-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/associate-configuration-items-to-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateConfigurationItemsToApplication", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef associate-configuration-items-to-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/associate-configuration-items-to-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/associate-configuration-items-to-application-response))

(clojure.core/defn delete-applications ([delete-applications-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-applications-request delete-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.spec/output-spec :portkey.aws.discovery/delete-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/delete-applications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplications", :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-applications :args (clojure.spec.alpha/tuple :portkey.aws.discovery/delete-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/delete-applications-response))
