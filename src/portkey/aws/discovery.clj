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

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-export-data-formats)

(clojure.core/declare ser-configurations-export-id)

(clojure.core/declare ser-order-by-list)

(clojure.core/declare ser-import-task-filter)

(clojure.core/declare ser-import-task-filter-name)

(clojure.core/declare ser-configuration-id-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-configuration-id)

(clojure.core/declare ser-import-task-identifier)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-tag-filters)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-to-delete-identifier-list)

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

(clojure.core/declare ser-describe-import-tasks-filter-list)

(clojure.core/declare ser-export-filter)

(clojure.core/declare ser-order-by-element)

(clojure.core/declare ser-import-task-filter-value-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-describe-import-tasks-max-results)

(clojure.core/declare ser-import-task-name)

(clojure.core/declare ser-describe-continuous-exports-max-results)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-export-filters)

(clojure.core/declare ser-export-ids)

(clojure.core/declare ser-import-url)

(clojure.core/declare ser-time-stamp)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-import-task-filter-value)

(clojure.core/declare ser-continuous-export-ids)

(clojure.core/declare ser-agent-ids)

(clojure.core/declare ser-boolean)

(clojure.core/defn- serorder-string [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "orderString"})

(clojure.core/defn- ser-tag-set [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagSet", :type "list"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "values", :shape "FilterValues"}) (clojure.core/into (ser-condition (:condition input)) #:http.request.field{:name "condition", :shape "Condition"})], :shape "Filter", :type "structure"}))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-export-data-formats [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-export-data-format coll) #:http.request.field{:shape "ExportDataFormat"}))) input), :shape "ExportDataFormats", :type "list"})

(clojure.core/defn- ser-configurations-export-id [input] #:http.request.field{:value input, :shape "ConfigurationsExportId"})

(clojure.core/defn- ser-order-by-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-order-by-element coll) #:http.request.field{:shape "OrderByElement"}))) input), :shape "OrderByList", :type "list"})

(clojure.core/defn- ser-import-task-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImportTaskFilter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-import-task-filter-name (input :name)) #:http.request.field{:name "name", :shape "ImportTaskFilterName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-import-task-filter-value-list (input :values)) #:http.request.field{:name "values", :shape "ImportTaskFilterValueList"}))))

(clojure.core/defn- ser-import-task-filter-name [input] #:http.request.field{:value (clojure.core/get {"IMPORT_TASK_ID" "IMPORT_TASK_ID", :import-task-id "IMPORT_TASK_ID", "STATUS" "STATUS", :status "STATUS", "NAME" "NAME", :name "NAME"} input), :shape "ImportTaskFilterName"})

(clojure.core/defn- ser-configuration-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration-id coll) #:http.request.field{:shape "ConfigurationId"}))) input), :shape "ConfigurationIdList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-configuration-id [input] #:http.request.field{:value input, :shape "ConfigurationId"})

(clojure.core/defn- ser-import-task-identifier [input] #:http.request.field{:value input, :shape "ImportTaskIdentifier"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-tag-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilters", :type "list"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list"})

(clojure.core/defn- ser-to-delete-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-import-task-identifier coll) #:http.request.field{:shape "ImportTaskIdentifier"}))) input), :shape "ToDeleteIdentifierList", :type "list", :max 10, :min 1})

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

(clojure.core/defn- ser-describe-import-tasks-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-import-task-filter coll) #:http.request.field{:shape "ImportTaskFilter"}))) input), :shape "DescribeImportTasksFilterList", :type "list"})

(clojure.core/defn- ser-export-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-filter-name (:name input)) #:http.request.field{:name "name", :shape "FilterName"}) (clojure.core/into (ser-filter-values (:values input)) #:http.request.field{:name "values", :shape "FilterValues"}) (clojure.core/into (ser-condition (:condition input)) #:http.request.field{:name "condition", :shape "Condition"})], :shape "ExportFilter", :type "structure"}))

(clojure.core/defn- ser-order-by-element [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:field-name input)) #:http.request.field{:name "fieldName", :shape "String"})], :shape "OrderByElement", :type "structure"} (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serorder-string (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "orderString"}))))

(clojure.core/defn- ser-import-task-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-import-task-filter-value coll) #:http.request.field{:shape "ImportTaskFilterValue"}))) input), :shape "ImportTaskFilterValueList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-condition [input] #:http.request.field{:value input, :shape "Condition"})

(clojure.core/defn- ser-describe-import-tasks-max-results [input] #:http.request.field{:value input, :shape "DescribeImportTasksMaxResults"})

(clojure.core/defn- ser-import-task-name [input] #:http.request.field{:value input, :shape "ImportTaskName"})

(clojure.core/defn- ser-describe-continuous-exports-max-results [input] #:http.request.field{:value input, :shape "DescribeContinuousExportsMaxResults"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-export-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-export-filter coll) #:http.request.field{:shape "ExportFilter"}))) input), :shape "ExportFilters", :type "list"})

(clojure.core/defn- ser-export-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configurations-export-id coll) #:http.request.field{:shape "ConfigurationsExportId"}))) input), :shape "ExportIds", :type "list"})

(clojure.core/defn- ser-import-url [input] #:http.request.field{:value input, :shape "ImportURL"})

(clojure.core/defn- ser-time-stamp [input] #:http.request.field{:value input, :shape "TimeStamp"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-import-task-filter-value [input] #:http.request.field{:value input, :shape "ImportTaskFilterValue"})

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

(clojure.core/defn- req-start-import-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-import-task-name (input :name)) #:http.request.field{:name "name", :shape "ImportTaskName"}) (clojure.core/into (ser-import-url (input :import-url)) #:http.request.field{:name "importUrl", :shape "ImportURL"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}))))

(clojure.core/defn- req-batch-delete-import-data-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-to-delete-identifier-list (input :import-task-ids)) #:http.request.field{:name "importTaskIds", :shape "ToDeleteIdentifierList"})]}))

(clojure.core/defn- req-start-continuous-export-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-configurations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-configuration-item-type (input :configuration-type)) #:http.request.field{:name "configurationType", :shape "ConfigurationItemType"})]} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :order-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-by-list (input :order-by)) #:http.request.field{:name "orderBy", :shape "OrderByList"}))))

(clojure.core/defn- req-describe-import-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-import-tasks-filter-list (input :filters)) #:http.request.field{:name "filters", :shape "DescribeImportTasksFilterList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-import-tasks-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "DescribeImportTasksMaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :configuration-id)) #:http.request.field{:name "configurationId", :shape "ApplicationId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "description", :shape "String"}))))

(clojure.core/defn- req-disassociate-configuration-items-from-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-id (input :application-configuration-id)) #:http.request.field{:name "applicationConfigurationId", :shape "ApplicationId"}) (clojure.core/into (ser-configuration-id-list (input :configuration-ids)) #:http.request.field{:name "configurationIds", :shape "ConfigurationIdList"})]}))

(clojure.core/declare deser-agent-configuration-status-list)

(clojure.core/declare deser-configuration-tag-set)

(clojure.core/declare deser-configurations-download-url)

(clojure.core/declare deser-neighbor-details-list)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-import-task)

(clojure.core/declare deser-import-status)

(clojure.core/declare deser-batch-delete-import-data-error-description)

(clojure.core/declare deser-export-status)

(clojure.core/declare deser-configuration-tag)

(clojure.core/declare deser-configurations-export-id)

(clojure.core/declare deser-database-name)

(clojure.core/declare deser-export-status-message)

(clojure.core/declare deser-agent-configuration-status)

(clojure.core/declare deser-batch-delete-import-data-error-code)

(clojure.core/declare deser-schema-storage-config)

(clojure.core/declare deser-agent-network-info)

(clojure.core/declare deser-boxed-integer)

(clojure.core/declare deser-describe-configurations-attributes)

(clojure.core/declare deser-neighbor-connection-detail)

(clojure.core/declare deser-batch-delete-import-data-error-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-configurations)

(clojure.core/declare deser-configuration-id)

(clojure.core/declare deser-batch-delete-import-data-error)

(clojure.core/declare deser-import-task-identifier)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-continuous-export-description)

(clojure.core/declare deser-continuous-export-status)

(clojure.core/declare deser-agents-info)

(clojure.core/declare deser-agent-status)

(clojure.core/declare deser-agent-id)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-message)

(clojure.core/declare deser-configuration-item-type)

(clojure.core/declare deser-describe-configurations-attribute)

(clojure.core/declare deser-agent-network-info-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-import-task-list)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-s-3-presigned-url)

(clojure.core/declare deser-s-3-bucket)

(clojure.core/declare deser-long)

(clojure.core/declare deser-import-task-name)

(clojure.core/declare deser-export-request-time)

(clojure.core/declare deser-customer-connector-info)

(clojure.core/declare deser-import-url)

(clojure.core/declare deser-continuous-export-descriptions)

(clojure.core/declare deser-configuration)

(clojure.core/declare deser-exports-info)

(clojure.core/declare deser-time-stamp)

(clojure.core/declare deser-customer-agent-info)

(clojure.core/declare deser-agent-info)

(clojure.core/declare deser-string-max-255)

(clojure.core/declare deser-export-info)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-agent-configuration-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-configuration-status coll))) input))

(clojure.core/defn- deser-configuration-tag-set [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration-tag coll))) input))

(clojure.core/defn- deser-configurations-download-url [input] input)

(clojure.core/defn- deser-neighbor-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-neighbor-connection-detail coll))) input))

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-import-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "serverImportSuccess") (clojure.core/assoc :server-import-success (deser-integer (input "serverImportSuccess"))) (clojure.core/contains? input "importDeletedTime") (clojure.core/assoc :import-deleted-time (deser-time-stamp (input "importDeletedTime"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-import-task-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-import-status (input "status"))) (clojure.core/contains? input "serverImportFailure") (clojure.core/assoc :server-import-failure (deser-integer (input "serverImportFailure"))) (clojure.core/contains? input "applicationImportFailure") (clojure.core/assoc :application-import-failure (deser-integer (input "applicationImportFailure"))) (clojure.core/contains? input "errorsAndFailedEntriesZip") (clojure.core/assoc :errors-and-failed-entries-zip (deser-s-3-presigned-url (input "errorsAndFailedEntriesZip"))) (clojure.core/contains? input "importTaskId") (clojure.core/assoc :import-task-id (deser-import-task-identifier (input "importTaskId"))) (clojure.core/contains? input "importRequestTime") (clojure.core/assoc :import-request-time (deser-time-stamp (input "importRequestTime"))) (clojure.core/contains? input "applicationImportSuccess") (clojure.core/assoc :application-import-success (deser-integer (input "applicationImportSuccess"))) (clojure.core/contains? input "importCompletionTime") (clojure.core/assoc :import-completion-time (deser-time-stamp (input "importCompletionTime"))) (clojure.core/contains? input "importUrl") (clojure.core/assoc :import-url (deser-import-url (input "importUrl")))))

(clojure.core/defn- deser-import-status [input] (clojure.core/get {"IMPORT_FAILED_SERVER_LIMIT_EXCEEDED" :import-failed-server-limit-exceeded, "IMPORT_FAILED" :import-failed, "DELETE_IN_PROGRESS" :delete-in-progress, "DELETE_COMPLETE" :delete-complete, "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED" :import-failed-record-limit-exceeded, "IMPORT_COMPLETE" :import-complete, "DELETE_FAILED_LIMIT_EXCEEDED" :delete-failed-limit-exceeded, "IMPORT_IN_PROGRESS" :import-in-progress, "DELETE_FAILED" :delete-failed} input))

(clojure.core/defn- deser-batch-delete-import-data-error-description [input] input)

(clojure.core/defn- deser-export-status [input] (clojure.core/get {"FAILED" :failed, "SUCCEEDED" :succeeded, "IN_PROGRESS" :in-progress} input))

(clojure.core/defn- deser-configuration-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "configurationType") (clojure.core/assoc :configuration-type (deser-configuration-item-type (input "configurationType"))) (clojure.core/contains? input "configurationId") (clojure.core/assoc :configuration-id (deser-configuration-id (input "configurationId"))) (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-tag-key (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value"))) (clojure.core/contains? input "timeOfCreation") (clojure.core/assoc :time-of-creation (deser-time-stamp (input "timeOfCreation")))))

(clojure.core/defn- deser-configurations-export-id [input] input)

(clojure.core/defn- deser-database-name [input] input)

(clojure.core/defn- deser-export-status-message [input] input)

(clojure.core/defn- deser-agent-configuration-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "agentId") (clojure.core/assoc :agent-id (deser-string (input "agentId"))) (clojure.core/contains? input "operationSucceeded") (clojure.core/assoc :operation-succeeded (deser-boolean (input "operationSucceeded"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description")))))

(clojure.core/defn- deser-batch-delete-import-data-error-code [input] (clojure.core/get {"NOT_FOUND" :not-found, "INTERNAL_SERVER_ERROR" :internal-server-error} input))

(clojure.core/defn- deser-schema-storage-config [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-database-name k) (deser-string v)])) input))

(clojure.core/defn- deser-agent-network-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "ipAddress") (clojure.core/assoc :ip-address (deser-string (input "ipAddress"))) (clojure.core/contains? input "macAddress") (clojure.core/assoc :mac-address (deser-string (input "macAddress")))))

(clojure.core/defn- deser-boxed-integer [input] input)

(clojure.core/defn- deser-describe-configurations-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-describe-configurations-attribute coll))) input))

(clojure.core/defn- deser-neighbor-connection-detail [input] (clojure.core/cond-> {:source-server-id (deser-configuration-id (input "sourceServerId")), :destination-server-id (deser-configuration-id (input "destinationServerId")), :connections-count (deser-long (input "connectionsCount"))} (clojure.core/contains? input "destinationPort") (clojure.core/assoc :destination-port (deser-boxed-integer (input "destinationPort"))) (clojure.core/contains? input "transportProtocol") (clojure.core/assoc :transport-protocol (deser-string (input "transportProtocol")))))

(clojure.core/defn- deser-batch-delete-import-data-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-delete-import-data-error coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration coll))) input))

(clojure.core/defn- deser-configuration-id [input] input)

(clojure.core/defn- deser-batch-delete-import-data-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "importTaskId") (clojure.core/assoc :import-task-id (deser-import-task-identifier (input "importTaskId"))) (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-batch-delete-import-data-error-code (input "errorCode"))) (clojure.core/contains? input "errorDescription") (clojure.core/assoc :error-description (deser-batch-delete-import-data-error-description (input "errorDescription")))))

(clojure.core/defn- deser-import-task-identifier [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-continuous-export-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "exportId") (clojure.core/assoc :export-id (deser-configurations-export-id (input "exportId"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-continuous-export-status (input "status"))) (clojure.core/contains? input "statusDetail") (clojure.core/assoc :status-detail (deser-string-max-255 (input "statusDetail"))) (clojure.core/contains? input "s3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (input "s3Bucket"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-time-stamp (input "startTime"))) (clojure.core/contains? input "stopTime") (clojure.core/assoc :stop-time (deser-time-stamp (input "stopTime"))) (clojure.core/contains? input "dataSource") (clojure.core/assoc :data-source (deser-data-source (input "dataSource"))) (clojure.core/contains? input "schemaStorageConfig") (clojure.core/assoc :schema-storage-config (deser-schema-storage-config (input "schemaStorageConfig")))))

(clojure.core/defn- deser-continuous-export-status [input] (clojure.core/get {"START_IN_PROGRESS" :start-in-progress, "START_FAILED" :start-failed, "ACTIVE" :active, "ERROR" :error, "STOP_IN_PROGRESS" :stop-in-progress, "STOP_FAILED" :stop-failed, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-agents-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-info coll))) input))

(clojure.core/defn- deser-agent-status [input] (clojure.core/get {"HEALTHY" :healthy, "UNHEALTHY" :unhealthy, "RUNNING" :running, "UNKNOWN" :unknown, "BLACKLISTED" :blacklisted, "SHUTDOWN" :shutdown} input))

(clojure.core/defn- deser-agent-id [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-configuration-item-type [input] (clojure.core/get {"SERVER" :server, "PROCESS" :process, "CONNECTION" :connection, "APPLICATION" :application} input))

(clojure.core/defn- deser-describe-configurations-attribute [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-agent-network-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-agent-network-info coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-import-task-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-import-task coll))) input))

(clojure.core/defn- deser-data-source [input] (clojure.core/get {"AGENT" :agent} input))

(clojure.core/defn- deser-s-3-presigned-url [input] input)

(clojure.core/defn- deser-s-3-bucket [input] input)

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-import-task-name [input] input)

(clojure.core/defn- deser-export-request-time [input] input)

(clojure.core/defn- deser-customer-connector-info [input] (clojure.core/cond-> {:active-connectors (deser-integer (input "activeConnectors")), :healthy-connectors (deser-integer (input "healthyConnectors")), :black-listed-connectors (deser-integer (input "blackListedConnectors")), :shutdown-connectors (deser-integer (input "shutdownConnectors")), :unhealthy-connectors (deser-integer (input "unhealthyConnectors")), :total-connectors (deser-integer (input "totalConnectors")), :unknown-connectors (deser-integer (input "unknownConnectors"))}))

(clojure.core/defn- deser-import-url [input] input)

(clojure.core/defn- deser-continuous-export-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-continuous-export-description coll))) input))

(clojure.core/defn- deser-configuration [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-exports-info [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-export-info coll))) input))

(clojure.core/defn- deser-time-stamp [input] input)

(clojure.core/defn- deser-customer-agent-info [input] (clojure.core/cond-> {:active-agents (deser-integer (input "activeAgents")), :healthy-agents (deser-integer (input "healthyAgents")), :black-listed-agents (deser-integer (input "blackListedAgents")), :shutdown-agents (deser-integer (input "shutdownAgents")), :unhealthy-agents (deser-integer (input "unhealthyAgents")), :total-agents (deser-integer (input "totalAgents")), :unknown-agents (deser-integer (input "unknownAgents"))}))

(clojure.core/defn- deser-agent-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "lastHealthPingTime") (clojure.core/assoc :last-health-ping-time (deser-string (input "lastHealthPingTime"))) (clojure.core/contains? input "agentId") (clojure.core/assoc :agent-id (deser-agent-id (input "agentId"))) (clojure.core/contains? input "health") (clojure.core/assoc :health (deser-agent-status (input "health"))) (clojure.core/contains? input "agentNetworkInfoList") (clojure.core/assoc :agent-network-info-list (deser-agent-network-info-list (input "agentNetworkInfoList"))) (clojure.core/contains? input "connectorId") (clojure.core/assoc :connector-id (deser-string (input "connectorId"))) (clojure.core/contains? input "registeredTime") (clojure.core/assoc :registered-time (deser-string (input "registeredTime"))) (clojure.core/contains? input "collectionStatus") (clojure.core/assoc :collection-status (deser-string (input "collectionStatus"))) (clojure.core/contains? input "agentType") (clojure.core/assoc :agent-type (deser-string (input "agentType"))) (clojure.core/contains? input "hostName") (clojure.core/assoc :host-name (deser-string (input "hostName"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-string (input "version")))))

(clojure.core/defn- deser-string-max-255 [input] input)

(clojure.core/defn- deser-export-info [input] (clojure.core/cond-> {:export-id (deser-configurations-export-id (input "exportId")), :export-status (deser-export-status (input "exportStatus")), :status-message (deser-export-status-message (input "statusMessage")), :export-request-time (deser-export-request-time (input "exportRequestTime"))} (clojure.core/contains? input "configurationsDownloadUrl") (clojure.core/assoc :configurations-download-url (deser-configurations-download-url (input "configurationsDownloadUrl"))) (clojure.core/contains? input "isTruncated") (clojure.core/assoc :is-truncated (deser-boolean (input "isTruncated"))) (clojure.core/contains? input "requestedStartTime") (clojure.core/assoc :requested-start-time (deser-time-stamp (input "requestedStartTime"))) (clojure.core/contains? input "requestedEndTime") (clojure.core/assoc :requested-end-time (deser-time-stamp (input "requestedEndTime")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-describe-tags-response ([input] (response-describe-tags-response nil input)) ([resultWrapper539447 input] (clojure.core/let [rawinput539446 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539448 {"tags" (rawinput539446 "tags"), "nextToken" (rawinput539446 "nextToken")}] (clojure.core/cond-> {} (letvar539448 "tags") (clojure.core/assoc :tags (deser-configuration-tag-set (clojure.core/get-in letvar539448 ["tags"]))) (letvar539448 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539448 ["nextToken"])))))))

(clojure.core/defn- response-delete-tags-response ([input] (response-delete-tags-response nil input)) ([resultWrapper539450 input] (clojure.core/let [rawinput539449 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539451 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-import-tasks-response ([input] (response-describe-import-tasks-response nil input)) ([resultWrapper539453 input] (clojure.core/let [rawinput539452 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539454 {"nextToken" (rawinput539452 "nextToken"), "tasks" (rawinput539452 "tasks")}] (clojure.core/cond-> {} (letvar539454 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539454 ["nextToken"]))) (letvar539454 "tasks") (clojure.core/assoc :tasks (deser-import-task-list (clojure.core/get-in letvar539454 ["tasks"])))))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper539456 input] (clojure.core/let [rawinput539455 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539457 {"message" (rawinput539455 "message")}] (clojure.core/cond-> {} (letvar539457 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539457 ["message"])))))))

(clojure.core/defn- response-disassociate-configuration-items-from-application-response ([input] (response-disassociate-configuration-items-from-application-response nil input)) ([resultWrapper539459 input] (clojure.core/let [rawinput539458 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539460 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-configurations-response ([input] (response-describe-configurations-response nil input)) ([resultWrapper539462 input] (clojure.core/let [rawinput539461 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539463 {"configurations" (rawinput539461 "configurations")}] (clojure.core/cond-> {} (letvar539463 "configurations") (clojure.core/assoc :configurations (deser-describe-configurations-attributes (clojure.core/get-in letvar539463 ["configurations"])))))))

(clojure.core/defn- response-list-configurations-response ([input] (response-list-configurations-response nil input)) ([resultWrapper539465 input] (clojure.core/let [rawinput539464 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539466 {"configurations" (rawinput539464 "configurations"), "nextToken" (rawinput539464 "nextToken")}] (clojure.core/cond-> {} (letvar539466 "configurations") (clojure.core/assoc :configurations (deser-configurations (clojure.core/get-in letvar539466 ["configurations"]))) (letvar539466 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539466 ["nextToken"])))))))

(clojure.core/defn- response-server-internal-error-exception ([input] (response-server-internal-error-exception nil input)) ([resultWrapper539468 input] (clojure.core/let [rawinput539467 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539469 {"message" (rawinput539467 "message")}] (clojure.core/cond-> {} (letvar539469 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539469 ["message"])))))))

(clojure.core/defn- response-describe-agents-response ([input] (response-describe-agents-response nil input)) ([resultWrapper539471 input] (clojure.core/let [rawinput539470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539472 {"agentsInfo" (rawinput539470 "agentsInfo"), "nextToken" (rawinput539470 "nextToken")}] (clojure.core/cond-> {} (letvar539472 "agentsInfo") (clojure.core/assoc :agents-info (deser-agents-info (clojure.core/get-in letvar539472 ["agentsInfo"]))) (letvar539472 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539472 ["nextToken"])))))))

(clojure.core/defn- response-associate-configuration-items-to-application-response ([input] (response-associate-configuration-items-to-application-response nil input)) ([resultWrapper539474 input] (clojure.core/let [rawinput539473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539475 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper539477 input] (clojure.core/let [rawinput539476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539478 {"message" (rawinput539476 "message")}] (clojure.core/cond-> {} (letvar539478 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539478 ["message"])))))))

(clojure.core/defn- response-update-application-response ([input] (response-update-application-response nil input)) ([resultWrapper539480 input] (clojure.core/let [rawinput539479 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539481 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-export-configurations-response ([input] (response-export-configurations-response nil input)) ([resultWrapper539483 input] (clojure.core/let [rawinput539482 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539484 {"exportId" (rawinput539482 "exportId")}] (clojure.core/cond-> {} (letvar539484 "exportId") (clojure.core/assoc :export-id (deser-configurations-export-id (clojure.core/get-in letvar539484 ["exportId"])))))))

(clojure.core/defn- response-describe-continuous-exports-response ([input] (response-describe-continuous-exports-response nil input)) ([resultWrapper539486 input] (clojure.core/let [rawinput539485 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539487 {"descriptions" (rawinput539485 "descriptions"), "nextToken" (rawinput539485 "nextToken")}] (clojure.core/cond-> {} (letvar539487 "descriptions") (clojure.core/assoc :descriptions (deser-continuous-export-descriptions (clojure.core/get-in letvar539487 ["descriptions"]))) (letvar539487 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539487 ["nextToken"])))))))

(clojure.core/defn- response-describe-export-tasks-response ([input] (response-describe-export-tasks-response nil input)) ([resultWrapper539489 input] (clojure.core/let [rawinput539488 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539490 {"exportsInfo" (rawinput539488 "exportsInfo"), "nextToken" (rawinput539488 "nextToken")}] (clojure.core/cond-> {} (letvar539490 "exportsInfo") (clojure.core/assoc :exports-info (deser-exports-info (clojure.core/get-in letvar539490 ["exportsInfo"]))) (letvar539490 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539490 ["nextToken"])))))))

(clojure.core/defn- response-get-discovery-summary-response ([input] (response-get-discovery-summary-response nil input)) ([resultWrapper539492 input] (clojure.core/let [rawinput539491 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539493 {"servers" (rawinput539491 "servers"), "applications" (rawinput539491 "applications"), "serversMappedToApplications" (rawinput539491 "serversMappedToApplications"), "serversMappedtoTags" (rawinput539491 "serversMappedtoTags"), "agentSummary" (rawinput539491 "agentSummary"), "connectorSummary" (rawinput539491 "connectorSummary")}] (clojure.core/cond-> {} (letvar539493 "servers") (clojure.core/assoc :servers (deser-long (clojure.core/get-in letvar539493 ["servers"]))) (letvar539493 "applications") (clojure.core/assoc :applications (deser-long (clojure.core/get-in letvar539493 ["applications"]))) (letvar539493 "serversMappedToApplications") (clojure.core/assoc :servers-mapped-to-applications (deser-long (clojure.core/get-in letvar539493 ["serversMappedToApplications"]))) (letvar539493 "serversMappedtoTags") (clojure.core/assoc :servers-mappedto-tags (deser-long (clojure.core/get-in letvar539493 ["serversMappedtoTags"]))) (letvar539493 "agentSummary") (clojure.core/assoc :agent-summary (deser-customer-agent-info (clojure.core/get-in letvar539493 ["agentSummary"]))) (letvar539493 "connectorSummary") (clojure.core/assoc :connector-summary (deser-customer-connector-info (clojure.core/get-in letvar539493 ["connectorSummary"])))))))

(clojure.core/defn- response-list-server-neighbors-response ([input] (response-list-server-neighbors-response nil input)) ([resultWrapper539495 input] (clojure.core/let [rawinput539494 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539496 {"neighbors" (rawinput539494 "neighbors"), "nextToken" (rawinput539494 "nextToken"), "knownDependencyCount" (rawinput539494 "knownDependencyCount")}] (clojure.core/cond-> {:neighbors (deser-neighbor-details-list (clojure.core/get-in letvar539496 ["neighbors"]))} (letvar539496 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar539496 ["nextToken"]))) (letvar539496 "knownDependencyCount") (clojure.core/assoc :known-dependency-count (deser-long (clojure.core/get-in letvar539496 ["knownDependencyCount"])))))))

(clojure.core/defn- response-start-data-collection-by-agent-ids-response ([input] (response-start-data-collection-by-agent-ids-response nil input)) ([resultWrapper539498 input] (clojure.core/let [rawinput539497 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539499 {"agentsConfigurationStatus" (rawinput539497 "agentsConfigurationStatus")}] (clojure.core/cond-> {} (letvar539499 "agentsConfigurationStatus") (clojure.core/assoc :agents-configuration-status (deser-agent-configuration-status-list (clojure.core/get-in letvar539499 ["agentsConfigurationStatus"])))))))

(clojure.core/defn- response-create-tags-response ([input] (response-create-tags-response nil input)) ([resultWrapper539501 input] (clojure.core/let [rawinput539500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539502 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper539504 input] (clojure.core/let [rawinput539503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539505 {"message" (rawinput539503 "message")}] (clojure.core/cond-> {} (letvar539505 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539505 ["message"])))))))

(clojure.core/defn- response-batch-delete-import-data-response ([input] (response-batch-delete-import-data-response nil input)) ([resultWrapper539507 input] (clojure.core/let [rawinput539506 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539508 {"errors" (rawinput539506 "errors")}] (clojure.core/cond-> {} (letvar539508 "errors") (clojure.core/assoc :errors (deser-batch-delete-import-data-error-list (clojure.core/get-in letvar539508 ["errors"])))))))

(clojure.core/defn- response-describe-export-configurations-response ([input] (response-describe-export-configurations-response nil input)) ([resultWrapper539510 input] (clojure.core/let [rawinput539509 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539511 {"exportsInfo" (rawinput539509 "exportsInfo"), "nextToken" (rawinput539509 "nextToken")}] (clojure.core/cond-> {} (letvar539511 "exportsInfo") (clojure.core/assoc :exports-info (deser-exports-info (clojure.core/get-in letvar539511 ["exportsInfo"]))) (letvar539511 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar539511 ["nextToken"])))))))

(clojure.core/defn- response-start-continuous-export-response ([input] (response-start-continuous-export-response nil input)) ([resultWrapper539513 input] (clojure.core/let [rawinput539512 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539514 {"exportId" (rawinput539512 "exportId"), "s3Bucket" (rawinput539512 "s3Bucket"), "startTime" (rawinput539512 "startTime"), "dataSource" (rawinput539512 "dataSource"), "schemaStorageConfig" (rawinput539512 "schemaStorageConfig")}] (clojure.core/cond-> {} (letvar539514 "exportId") (clojure.core/assoc :export-id (deser-configurations-export-id (clojure.core/get-in letvar539514 ["exportId"]))) (letvar539514 "s3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (clojure.core/get-in letvar539514 ["s3Bucket"]))) (letvar539514 "startTime") (clojure.core/assoc :start-time (deser-time-stamp (clojure.core/get-in letvar539514 ["startTime"]))) (letvar539514 "dataSource") (clojure.core/assoc :data-source (deser-data-source (clojure.core/get-in letvar539514 ["dataSource"]))) (letvar539514 "schemaStorageConfig") (clojure.core/assoc :schema-storage-config (deser-schema-storage-config (clojure.core/get-in letvar539514 ["schemaStorageConfig"])))))))

(clojure.core/defn- response-start-import-task-response ([input] (response-start-import-task-response nil input)) ([resultWrapper539516 input] (clojure.core/let [rawinput539515 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539517 {"task" (rawinput539515 "task")}] (clojure.core/cond-> {} (letvar539517 "task") (clojure.core/assoc :task (deser-import-task (clojure.core/get-in letvar539517 ["task"])))))))

(clojure.core/defn- response-authorization-error-exception ([input] (response-authorization-error-exception nil input)) ([resultWrapper539519 input] (clojure.core/let [rawinput539518 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539520 {"message" (rawinput539518 "message")}] (clojure.core/cond-> {} (letvar539520 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539520 ["message"])))))))

(clojure.core/defn- response-start-export-task-response ([input] (response-start-export-task-response nil input)) ([resultWrapper539522 input] (clojure.core/let [rawinput539521 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539523 {"exportId" (rawinput539521 "exportId")}] (clojure.core/cond-> {} (letvar539523 "exportId") (clojure.core/assoc :export-id (deser-configurations-export-id (clojure.core/get-in letvar539523 ["exportId"])))))))

(clojure.core/defn- response-create-application-response ([input] (response-create-application-response nil input)) ([resultWrapper539525 input] (clojure.core/let [rawinput539524 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539526 {"configurationId" (rawinput539524 "configurationId")}] (clojure.core/cond-> {} (letvar539526 "configurationId") (clojure.core/assoc :configuration-id (deser-string (clojure.core/get-in letvar539526 ["configurationId"])))))))

(clojure.core/defn- response-delete-applications-response ([input] (response-delete-applications-response nil input)) ([resultWrapper539528 input] (clojure.core/let [rawinput539527 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539529 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-conflict-error-exception ([input] (response-conflict-error-exception nil input)) ([resultWrapper539531 input] (clojure.core/let [rawinput539530 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539532 {"message" (rawinput539530 "message")}] (clojure.core/cond-> {} (letvar539532 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539532 ["message"])))))))

(clojure.core/defn- response-stop-data-collection-by-agent-ids-response ([input] (response-stop-data-collection-by-agent-ids-response nil input)) ([resultWrapper539534 input] (clojure.core/let [rawinput539533 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539535 {"agentsConfigurationStatus" (rawinput539533 "agentsConfigurationStatus")}] (clojure.core/cond-> {} (letvar539535 "agentsConfigurationStatus") (clojure.core/assoc :agents-configuration-status (deser-agent-configuration-status-list (clojure.core/get-in letvar539535 ["agentsConfigurationStatus"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper539537 input] (clojure.core/let [rawinput539536 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539538 {"message" (rawinput539536 "message")}] (clojure.core/cond-> {} (letvar539538 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539538 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper539540 input] (clojure.core/let [rawinput539539 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539541 {"message" (rawinput539539 "message")}] (clojure.core/cond-> {} (letvar539541 "message") (clojure.core/assoc :message (deser-message (clojure.core/get-in letvar539541 ["message"])))))))

(clojure.core/defn- response-stop-continuous-export-response ([input] (response-stop-continuous-export-response nil input)) ([resultWrapper539543 input] (clojure.core/let [rawinput539542 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar539544 {"startTime" (rawinput539542 "startTime"), "stopTime" (rawinput539542 "stopTime")}] (clojure.core/cond-> {} (letvar539544 "startTime") (clojure.core/assoc :start-time (deser-time-stamp (clojure.core/get-in letvar539544 ["startTime"]))) (letvar539544 "stopTime") (clojure.core/assoc :stop-time (deser-time-stamp (clojure.core/get-in letvar539544 ["stopTime"])))))))

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

(clojure.spec.alpha/def :portkey.aws.discovery/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.discovery/export-data-formats (clojure.spec.alpha/coll-of :portkey.aws.discovery/export-data-format))

(clojure.spec.alpha/def :portkey.aws.discovery.import-task/server-import-success (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/import-deleted-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/client-request-token (clojure.spec.alpha/and :portkey.aws.discovery/client-request-token))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/name (clojure.spec.alpha/and :portkey.aws.discovery/import-task-name))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/status (clojure.spec.alpha/and :portkey.aws.discovery/import-status))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/server-import-failure (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/application-import-failure (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/errors-and-failed-entries-zip (clojure.spec.alpha/and :portkey.aws.discovery/s-3-presigned-url))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/import-task-id (clojure.spec.alpha/and :portkey.aws.discovery/import-task-identifier))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/import-request-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/application-import-success (clojure.spec.alpha/and :portkey.aws.discovery/integer))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/import-completion-time (clojure.spec.alpha/and :portkey.aws.discovery/time-stamp))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task/import-url (clojure.spec.alpha/and :portkey.aws.discovery/import-url))
(clojure.spec.alpha/def :portkey.aws.discovery/import-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.import-task/server-import-success :portkey.aws.discovery.import-task/import-deleted-time :portkey.aws.discovery.import-task/client-request-token :portkey.aws.discovery.import-task/name :portkey.aws.discovery.import-task/status :portkey.aws.discovery.import-task/server-import-failure :portkey.aws.discovery.import-task/application-import-failure :portkey.aws.discovery.import-task/errors-and-failed-entries-zip :portkey.aws.discovery.import-task/import-task-id :portkey.aws.discovery.import-task/import-request-time :portkey.aws.discovery.import-task/application-import-success :portkey.aws.discovery.import-task/import-completion-time :portkey.aws.discovery.import-task/import-url]))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-import-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-import-tasks-response/tasks (clojure.spec.alpha/and :portkey.aws.discovery/import-task-list))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-import-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-import-tasks-response/next-token :portkey.aws.discovery.describe-import-tasks-response/tasks]))

(clojure.spec.alpha/def :portkey.aws.discovery.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.operation-not-permitted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/import-status #{:delete-failed "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED" :import-in-progress "IMPORT_FAILED" "DELETE_IN_PROGRESS" :delete-failed-limit-exceeded "DELETE_COMPLETE" "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED" :delete-in-progress :delete-complete "IMPORT_COMPLETE" :import-complete :import-failed-server-limit-exceeded "DELETE_FAILED_LIMIT_EXCEEDED" "IMPORT_IN_PROGRESS" :import-failed "DELETE_FAILED" :import-failed-record-limit-exceeded})

(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-error-description (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.discovery/database-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 252))))

(clojure.spec.alpha/def :portkey.aws.discovery/export-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/agent-id (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/operation-succeeded (clojure.spec.alpha/and :portkey.aws.discovery/boolean))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-configuration-status/description (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/agent-configuration-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.agent-configuration-status/agent-id :portkey.aws.discovery.agent-configuration-status/operation-succeeded :portkey.aws.discovery.agent-configuration-status/description]))

(clojure.spec.alpha/def :portkey.aws.discovery/order-by-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/order-by-element))

(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-error-code #{:internal-server-error :not-found "INTERNAL_SERVER_ERROR" "NOT_FOUND"})

(clojure.spec.alpha/def :portkey.aws.discovery/schema-storage-config (clojure.spec.alpha/map-of :portkey.aws.discovery/database-name :portkey.aws.discovery/string))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-response/agents-info (clojure.spec.alpha/and :portkey.aws.discovery/agents-info))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-agents-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-agents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-agents-response/agents-info :portkey.aws.discovery.describe-agents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.import-task-filter/name (clojure.spec.alpha/and :portkey.aws.discovery/import-task-filter-name))
(clojure.spec.alpha/def :portkey.aws.discovery.import-task-filter/values (clojure.spec.alpha/and :portkey.aws.discovery/import-task-filter-value-list))
(clojure.spec.alpha/def :portkey.aws.discovery/import-task-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.import-task-filter/name :portkey.aws.discovery.import-task-filter/values]))

(clojure.spec.alpha/def :portkey.aws.discovery/associate-configuration-items-to-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.agent-network-info/ip-address (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.agent-network-info/mac-address (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery/agent-network-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.agent-network-info/ip-address :portkey.aws.discovery.agent-network-info/mac-address]))

(clojure.spec.alpha/def :portkey.aws.discovery/boxed-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.discovery/describe-configurations-attributes (clojure.spec.alpha/coll-of :portkey.aws.discovery/describe-configurations-attribute))

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-filter-name #{:import-task-id "NAME" :name "STATUS" :status "IMPORT_TASK_ID"})

(clojure.spec.alpha/def :portkey.aws.discovery/configuration-id-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/configuration-id))

(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/source-server-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/destination-server-id (clojure.spec.alpha/and :portkey.aws.discovery/configuration-id))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/destination-port (clojure.spec.alpha/and :portkey.aws.discovery/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/transport-protocol (clojure.spec.alpha/and :portkey.aws.discovery/string))
(clojure.spec.alpha/def :portkey.aws.discovery.neighbor-connection-detail/connections-count (clojure.spec.alpha/and :portkey.aws.discovery/long))
(clojure.spec.alpha/def :portkey.aws.discovery/neighbor-connection-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.neighbor-connection-detail/source-server-id :portkey.aws.discovery.neighbor-connection-detail/destination-server-id :portkey.aws.discovery.neighbor-connection-detail/connections-count] :opt-un [:portkey.aws.discovery.neighbor-connection-detail/destination-port :portkey.aws.discovery.neighbor-connection-detail/transport-protocol]))

(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-error-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/batch-delete-import-data-error))

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

(clojure.spec.alpha/def :portkey.aws.discovery.batch-delete-import-data-error/import-task-id (clojure.spec.alpha/and :portkey.aws.discovery/import-task-identifier))
(clojure.spec.alpha/def :portkey.aws.discovery.batch-delete-import-data-error/error-code (clojure.spec.alpha/and :portkey.aws.discovery/batch-delete-import-data-error-code))
(clojure.spec.alpha/def :portkey.aws.discovery.batch-delete-import-data-error/error-description (clojure.spec.alpha/and :portkey.aws.discovery/batch-delete-import-data-error-description))
(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.batch-delete-import-data-error/import-task-id :portkey.aws.discovery.batch-delete-import-data-error/error-code :portkey.aws.discovery.batch-delete-import-data-error/error-description]))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-response/descriptions (clojure.spec.alpha/and :portkey.aws.discovery/continuous-export-descriptions))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-continuous-exports-response/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-continuous-exports-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-continuous-exports-response/descriptions :portkey.aws.discovery.describe-continuous-exports-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.discovery.stop-continuous-export-request/export-id (clojure.spec.alpha/and :portkey.aws.discovery/configurations-export-id))
(clojure.spec.alpha/def :portkey.aws.discovery/stop-continuous-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.stop-continuous-export-request/export-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-identifier (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.discovery/to-delete-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/import-task-identifier :min-count 1 :max-count 10))

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

(clojure.spec.alpha/def :portkey.aws.discovery.batch-delete-import-data-response/errors (clojure.spec.alpha/and :portkey.aws.discovery/batch-delete-import-data-error-list))
(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.batch-delete-import-data-response/errors]))

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

(clojure.spec.alpha/def :portkey.aws.discovery.start-import-task-response/task (clojure.spec.alpha/and :portkey.aws.discovery/import-task))
(clojure.spec.alpha/def :portkey.aws.discovery/start-import-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.start-import-task-response/task]))

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

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/import-task))

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

(clojure.spec.alpha/def :portkey.aws.discovery/s-3-presigned-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.tag-filter/name (clojure.spec.alpha/and :portkey.aws.discovery/filter-name))
(clojure.spec.alpha/def :portkey.aws.discovery.tag-filter/values (clojure.spec.alpha/and :portkey.aws.discovery/filter-values))
(clojure.spec.alpha/def :portkey.aws.discovery/tag-filter (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.tag-filter/name :portkey.aws.discovery.tag-filter/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/get-discovery-summary-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery.conflict-error-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/conflict-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.conflict-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/s-3-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery/describe-import-tasks-filter-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/import-task-filter))

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

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.discovery/import-task-filter-value :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.discovery.tag/key (clojure.spec.alpha/and :portkey.aws.discovery/tag-key))
(clojure.spec.alpha/def :portkey.aws.discovery.tag/value (clojure.spec.alpha/and :portkey.aws.discovery/tag-value))
(clojure.spec.alpha/def :portkey.aws.discovery/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.tag/key :portkey.aws.discovery.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/condition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.discovery.start-import-task-request/client-request-token (clojure.spec.alpha/and :portkey.aws.discovery/client-request-token))
(clojure.spec.alpha/def :portkey.aws.discovery.start-import-task-request/name (clojure.spec.alpha/and :portkey.aws.discovery/import-task-name))
(clojure.spec.alpha/def :portkey.aws.discovery.start-import-task-request/import-url (clojure.spec.alpha/and :portkey.aws.discovery/import-url))
(clojure.spec.alpha/def :portkey.aws.discovery/start-import-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.start-import-task-request/name :portkey.aws.discovery.start-import-task-request/import-url] :opt-un [:portkey.aws.discovery.start-import-task-request/client-request-token]))

(clojure.spec.alpha/def :portkey.aws.discovery/describe-import-tasks-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.discovery.batch-delete-import-data-request/import-task-ids (clojure.spec.alpha/and :portkey.aws.discovery/to-delete-identifier-list))
(clojure.spec.alpha/def :portkey.aws.discovery/batch-delete-import-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.discovery.batch-delete-import-data-request/import-task-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/start-continuous-export-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

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

(clojure.spec.alpha/def :portkey.aws.discovery/import-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4000))))

(clojure.spec.alpha/def :portkey.aws.discovery/continuous-export-descriptions (clojure.spec.alpha/coll-of :portkey.aws.discovery/continuous-export-description))

(clojure.spec.alpha/def :portkey.aws.discovery.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.discovery/message))
(clojure.spec.alpha/def :portkey.aws.discovery/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.discovery/configuration (clojure.spec.alpha/map-of :portkey.aws.discovery/string :portkey.aws.discovery/string))

(clojure.spec.alpha/def :portkey.aws.discovery.describe-import-tasks-request/filters (clojure.spec.alpha/and :portkey.aws.discovery/describe-import-tasks-filter-list))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-import-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.discovery/describe-import-tasks-max-results))
(clojure.spec.alpha/def :portkey.aws.discovery.describe-import-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.discovery/next-token))
(clojure.spec.alpha/def :portkey.aws.discovery/describe-import-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.discovery.describe-import-tasks-request/filters :portkey.aws.discovery.describe-import-tasks-request/max-results :portkey.aws.discovery.describe-import-tasks-request/next-token]))

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

(clojure.spec.alpha/def :portkey.aws.discovery/import-task-filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.discovery/string-max-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

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

(clojure.core/defn start-continuous-export "Start the continuous flow of agent's discovered data into Amazon Athena." ([] (start-continuous-export {})) ([start-continuous-export-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-continuous-export-request start-continuous-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/start-continuous-export-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-continuous-export-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartContinuousExport", :http.request.configuration/output-deser-fn response-start-continuous-export-response, :http.request.spec/error-spec {"ConflictErrorException" :portkey.aws.discovery/conflict-error-exception, "AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceInUseException" :portkey.aws.discovery/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef start-continuous-export :args (clojure.spec.alpha/? :portkey.aws.discovery/start-continuous-export-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-continuous-export-response))

(clojure.core/defn batch-delete-import-data "Deletes one or more import tasks, each identified by their import ID. Each\nimport task has a number of records that can identify servers or applications.\n AWS Application Discovery Service has built-in matching logic that will\nidentify when discovered servers match existing entries that you've previously\ndiscovered, the information for the already-existing discovered server is\nupdated. When you delete an import task that contains records that were used to\nmatch, the information in those matched records that comes from the deleted\nrecords will also be deleted." ([batch-delete-import-data-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-delete-import-data-request batch-delete-import-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/batch-delete-import-data-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/batch-delete-import-data-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteImportData", :http.request.configuration/output-deser-fn response-batch-delete-import-data-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef batch-delete-import-data :args (clojure.spec.alpha/tuple :portkey.aws.discovery/batch-delete-import-data-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/batch-delete-import-data-response))

(clojure.core/defn stop-data-collection-by-agent-ids "Instructs the specified agents or connectors to stop collecting data." ([stop-data-collection-by-agent-ids-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-data-collection-by-agent-ids-request stop-data-collection-by-agent-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/stop-data-collection-by-agent-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/stop-data-collection-by-agent-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopDataCollectionByAgentIds", :http.request.configuration/output-deser-fn response-stop-data-collection-by-agent-ids-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef stop-data-collection-by-agent-ids :args (clojure.spec.alpha/tuple :portkey.aws.discovery/stop-data-collection-by-agent-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/stop-data-collection-by-agent-ids-response))

(clojure.core/defn delete-tags "Deletes the association between configuration items and one or more tags. This\nAPI accepts a list of multiple configuration items." ([delete-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tags-request delete-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/delete-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/delete-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn response-delete-tags-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.discovery/delete-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/delete-tags-response))

(clojure.core/defn describe-configurations "Retrieves attributes for a list of configuration item IDs.\n All of the supplied IDs must be for the same asset type from one of the\nfollowing:\n * server\n * application\n * process\n * connection\n Output fields are specific to the asset type specified. For example, the output\nfor a server configuration item includes a list of attributes about the server,\nsuch as host name, operating system, number of network cards, etc.\n For a complete list of outputs for each asset type, see Using the\nDescribeConfigurations Action\n(http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#DescribeConfigurations)." ([describe-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-configurations-request describe-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConfigurations", :http.request.configuration/output-deser-fn response-describe-configurations-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-configurations :args (clojure.spec.alpha/tuple :portkey.aws.discovery/describe-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-configurations-response))

(clojure.core/defn create-tags "Creates one or more tags for configuration items. Tags are metadata that help\nyou categorize IT assets. This API accepts a list of multiple configuration\nitems." ([create-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-tags-request create-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/create-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/create-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTags", :http.request.configuration/output-deser-fn response-create-tags-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef create-tags :args (clojure.spec.alpha/tuple :portkey.aws.discovery/create-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/create-tags-response))

(clojure.core/defn describe-export-tasks "Retrieve status of one or more export tasks. You can retrieve the status of up\nto 100 export tasks." ([] (describe-export-tasks {})) ([describe-export-tasks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-export-tasks-request describe-export-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-export-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-export-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeExportTasks", :http.request.configuration/output-deser-fn response-describe-export-tasks-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-export-tasks :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-export-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-export-tasks-response))

(clojure.core/defn start-export-task " Begins the export of discovered data to an S3 bucket.\n If you specify agentIds in a filter, the task exports up to 72 hours of\ndetailed data collected by the identified Application Discovery Agent, including\nnetwork, process, and performance details. A time range for exported agent data\nmay be set by using startTime and endTime. Export of detailed agent data is\nlimited to five concurrently running exports.\n If you do not include an agentIds filter, summary data is exported that\nincludes both AWS Agentless Discovery Connector data and summary data from AWS\nDiscovery Agents. Export of summary data is limited to two exports per day." ([] (start-export-task {})) ([start-export-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-export-task-request start-export-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/start-export-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-export-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartExportTask", :http.request.configuration/output-deser-fn response-start-export-task-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef start-export-task :args (clojure.spec.alpha/? :portkey.aws.discovery/start-export-task-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-export-task-response))

(clojure.core/defn disassociate-configuration-items-from-application "Disassociates one or more configuration items from an application." ([disassociate-configuration-items-from-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-configuration-items-from-application-request disassociate-configuration-items-from-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/disassociate-configuration-items-from-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/disassociate-configuration-items-from-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateConfigurationItemsFromApplication", :http.request.configuration/output-deser-fn response-disassociate-configuration-items-from-application-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-configuration-items-from-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/disassociate-configuration-items-from-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/disassociate-configuration-items-from-application-response))

(clojure.core/defn list-configurations "Retrieves a list of configuration items as specified by the value passed to the\nrequired paramater configurationType. Optional filtering may be applied to\nrefine search results." ([list-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-configurations-request list-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/list-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/list-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConfigurations", :http.request.configuration/output-deser-fn response-list-configurations-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-configurations :args (clojure.spec.alpha/tuple :portkey.aws.discovery/list-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/list-configurations-response))

(clojure.core/defn describe-agents "Lists agents or connectors as specified by ID or other filters. All\nagents/connectors associated with your user account can be listed if you call\nDescribeAgents as is without passing any parameters." ([] (describe-agents {})) ([describe-agents-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-agents-request describe-agents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-agents-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-agents-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAgents", :http.request.configuration/output-deser-fn response-describe-agents-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-agents :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-agents-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-agents-response))

(clojure.core/defn start-import-task "Starts an import task, which allows you to import details of your on-premises\nenvironment directly into AWS without having to use the Application Discovery\nService (ADS) tools such as the Discovery Connector or Discovery Agent. This\ngives you the option to perform migration assessment and planning directly from\nyour imported data, including the ability to group your devices as applications\nand track their migration status.\n To start an import request, do this:\n * Download the specially formatted comma separated value (CSV) import template,\nwhich you can find here:\nhttps://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv\n(https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv).\n * Fill out the template with your server and application data.\n * Upload your import file to an Amazon S3 bucket, and make a note of it's\nObject URL. Your import file must be in the CSV format.\n * Use the console or the StartImportTask command with the AWS CLI or one of the\nAWS SDKs to import the records from your file.\n For more information, including step-by-step procedures, see Migration Hub\nImport\n(https://docs.aws.amazon.com/application-discovery/latest/userguide/discovery-import.html)\nin the AWS Application Discovery Service User Guide.\n There are limits to the number of import tasks you can create (and delete) in\nan AWS account. For more information, see AWS Application Discovery Service\nLimits\n(https://docs.aws.amazon.com/application-discovery/latest/userguide/ads_service_limits.html)\nin the AWS Application Discovery Service User Guide." ([start-import-task-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-import-task-request start-import-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/start-import-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-import-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartImportTask", :http.request.configuration/output-deser-fn response-start-import-task-response, :http.request.spec/error-spec {"ResourceInUseException" :portkey.aws.discovery/resource-in-use-exception, "AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef start-import-task :args (clojure.spec.alpha/tuple :portkey.aws.discovery/start-import-task-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-import-task-response))

(clojure.core/defn list-server-neighbors "Retrieves a list of servers that are one network hop away from a specified\nserver." ([list-server-neighbors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-server-neighbors-request list-server-neighbors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/list-server-neighbors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/list-server-neighbors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServerNeighbors", :http.request.configuration/output-deser-fn response-list-server-neighbors-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef list-server-neighbors :args (clojure.spec.alpha/tuple :portkey.aws.discovery/list-server-neighbors-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/list-server-neighbors-response))

(clojure.core/defn describe-tags "Retrieves a list of configuration items that have tags as specified by the\nkey-value pairs, name and value, passed to the optional parameter filters.\n There are three valid tag filter names:\n * tagKey\n * tagValue\n * configurationId\n Also, all configuration items associated with your user account that have tags\ncan be listed if you call DescribeTags as is without passing any parameters." ([] (describe-tags {})) ([describe-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-tags-response))

(clojure.core/defn update-application "Updates metadata about an application." ([update-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/update-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/update-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn response-update-application-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/update-application-response))

(clojure.core/defn export-configurations "Deprecated. Use StartExportTask instead.\n Exports all discovered configuration data to an Amazon S3 bucket or an\napplication that enables you to view and evaluate the data. Data includes tags\nand tag associations, processes, connections, servers, and system performance.\nThis API returns an export ID that you can query using the\nDescribeExportConfigurations API. The system imposes a limit of two\nconfiguration exports in six hours." ([] (export-configurations {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/export-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExportConfigurations", :http.request.configuration/output-deser-fn response-export-configurations-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception}})))))
(clojure.spec.alpha/fdef export-configurations :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.discovery/export-configurations-response))

(clojure.core/defn get-discovery-summary "Retrieves a short summary of discovered assets.\n This API operation takes no request parameters and is called as is at the\ncommand prompt as shown in the example." ([] (get-discovery-summary {})) ([get-discovery-summary-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-discovery-summary-request get-discovery-summary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/get-discovery-summary-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/get-discovery-summary-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDiscoverySummary", :http.request.configuration/output-deser-fn response-get-discovery-summary-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef get-discovery-summary :args (clojure.spec.alpha/? :portkey.aws.discovery/get-discovery-summary-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/get-discovery-summary-response))

(clojure.core/defn create-application "Creates an application with the given name and description." ([create-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/create-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/create-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-create-application-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/create-application-response))

(clojure.core/defn describe-continuous-exports "Lists exports as specified by ID. All continuous exports associated with your\nuser account can be listed if you call DescribeContinuousExports as is without\npassing any parameters." ([] (describe-continuous-exports {})) ([describe-continuous-exports-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-continuous-exports-request describe-continuous-exports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-continuous-exports-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-continuous-exports-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeContinuousExports", :http.request.configuration/output-deser-fn response-describe-continuous-exports-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-continuous-exports :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-continuous-exports-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-continuous-exports-response))

(clojure.core/defn stop-continuous-export "Stop the continuous flow of agent's discovered data into Amazon Athena." ([stop-continuous-export-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-continuous-export-request stop-continuous-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/stop-continuous-export-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/stop-continuous-export-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopContinuousExport", :http.request.configuration/output-deser-fn response-stop-continuous-export-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception, "OperationNotPermittedException" :portkey.aws.discovery/operation-not-permitted-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "ResourceInUseException" :portkey.aws.discovery/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef stop-continuous-export :args (clojure.spec.alpha/tuple :portkey.aws.discovery/stop-continuous-export-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/stop-continuous-export-response))

(clojure.core/defn start-data-collection-by-agent-ids "Instructs the specified agents or connectors to start collecting data." ([start-data-collection-by-agent-ids-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-data-collection-by-agent-ids-request start-data-collection-by-agent-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/start-data-collection-by-agent-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/start-data-collection-by-agent-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDataCollectionByAgentIds", :http.request.configuration/output-deser-fn response-start-data-collection-by-agent-ids-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef start-data-collection-by-agent-ids :args (clojure.spec.alpha/tuple :portkey.aws.discovery/start-data-collection-by-agent-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/start-data-collection-by-agent-ids-response))

(clojure.core/defn describe-export-configurations " DescribeExportConfigurations is deprecated. Use DescribeImportTasks\n(https://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html),\ninstead." ([] (describe-export-configurations {})) ([describe-export-configurations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-export-configurations-request describe-export-configurations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-export-configurations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-export-configurations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeExportConfigurations", :http.request.configuration/output-deser-fn response-describe-export-configurations-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "ResourceNotFoundException" :portkey.aws.discovery/resource-not-found-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-export-configurations :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-export-configurations-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-export-configurations-response))

(clojure.core/defn describe-import-tasks "Returns an array of import tasks for your account, including status information,\ntimes, IDs, the Amazon S3 Object URL for the import file, and more." ([] (describe-import-tasks {})) ([describe-import-tasks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-import-tasks-request describe-import-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/describe-import-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/describe-import-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeImportTasks", :http.request.configuration/output-deser-fn response-describe-import-tasks-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-import-tasks :args (clojure.spec.alpha/? :portkey.aws.discovery/describe-import-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/describe-import-tasks-response))

(clojure.core/defn associate-configuration-items-to-application "Associates one or more configuration items with an application." ([associate-configuration-items-to-application-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-configuration-items-to-application-request associate-configuration-items-to-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/associate-configuration-items-to-application-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/associate-configuration-items-to-application-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateConfigurationItemsToApplication", :http.request.configuration/output-deser-fn response-associate-configuration-items-to-application-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef associate-configuration-items-to-application :args (clojure.spec.alpha/tuple :portkey.aws.discovery/associate-configuration-items-to-application-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/associate-configuration-items-to-application-response))

(clojure.core/defn delete-applications "Deletes a list of applications and their associations with configuration items." ([delete-applications-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-applications-request delete-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.discovery/endpoints, :http.request.configuration/target-prefix "AWSPoseidonService_V2015_11_01", :http.request.spec/output-spec :portkey.aws.discovery/delete-applications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-11-01", :http.request.configuration/service-id "Application Discovery Service", :http.request.spec/input-spec :portkey.aws.discovery/delete-applications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplications", :http.request.configuration/output-deser-fn response-delete-applications-response, :http.request.spec/error-spec {"AuthorizationErrorException" :portkey.aws.discovery/authorization-error-exception, "InvalidParameterException" :portkey.aws.discovery/invalid-parameter-exception, "InvalidParameterValueException" :portkey.aws.discovery/invalid-parameter-value-exception, "ServerInternalErrorException" :portkey.aws.discovery/server-internal-error-exception}})))))
(clojure.spec.alpha/fdef delete-applications :args (clojure.spec.alpha/tuple :portkey.aws.discovery/delete-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.discovery/delete-applications-response))
