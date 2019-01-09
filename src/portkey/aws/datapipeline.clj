(ns portkey.aws.datapipeline (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "datapipeline", :region "ap-northeast-1"},
    :ssl-common-name "datapipeline.ap-northeast-1.amazonaws.com",
    :endpoint "https://datapipeline.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "datapipeline", :region "eu-west-1"},
    :ssl-common-name "datapipeline.eu-west-1.amazonaws.com",
    :endpoint "https://datapipeline.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "datapipeline", :region "ap-southeast-2"},
    :ssl-common-name "datapipeline.ap-southeast-2.amazonaws.com",
    :endpoint "https://datapipeline.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "datapipeline", :region "us-west-2"},
    :ssl-common-name "datapipeline.us-west-2.amazonaws.com",
    :endpoint "https://datapipeline.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "datapipeline", :region "us-east-1"},
    :ssl-common-name "datapipeline.us-east-1.amazonaws.com",
    :endpoint "https://datapipeline.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare serlong-string)

(clojure.core/declare serboolean)

(clojure.core/declare ser-selector)

(clojure.core/declare serint)

(clojure.core/declare ser-parameter-value-list)

(clojure.core/declare serstring)

(clojure.core/declare ser-parameter-attribute)

(clojure.core/declare ser-parameter-object)

(clojure.core/declare sererror-message)

(clojure.core/declare ser-pipeline-object)

(clojure.core/declare serid)

(clojure.core/declare sertimestamp)

(clojure.core/declare ser-parameter-attribute-list)

(clojure.core/declare ser-operator-type)

(clojure.core/declare serattribute-name-string)

(clojure.core/declare ser-query)

(clojure.core/declare sertag-value)

(clojure.core/declare ser-parameter-object-list)

(clojure.core/declare serfield-list)

(clojure.core/declare sertag-list)

(clojure.core/declare ser-instance-identity)

(clojure.core/declare ser-pipeline-object-list)

(clojure.core/declare serfield-name-string)

(clojure.core/declare ser-operator)

(clojure.core/declare sertask-id)

(clojure.core/declare ser-tag)

(clojure.core/declare serattribute-value-string)

(clojure.core/declare ser-field)

(clojure.core/declare serstring-list)

(clojure.core/declare sertag-key)

(clojure.core/declare serfield-string-value)

(clojure.core/declare ser-task-status)

(clojure.core/declare ser-selector-list)

(clojure.core/declare sercancel-active)

(clojure.core/declare serid-list)

(clojure.core/declare ser-parameter-value)

(clojure.core/defn- serlong-string [input] #:http.request.field{:value input, :shape "longString"})

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-selector [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Selector", :type "structure"} (clojure.core/contains? input :field-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-name)) #:http.request.field{:name "fieldName", :shape "string"})) (clojure.core/contains? input :operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operator (input :operator)) #:http.request.field{:name "operator", :shape "Operator"}))))

(clojure.core/defn- serint [input] #:http.request.field{:value input, :shape "int"})

(clojure.core/defn- ser-parameter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "ParameterValueList", :type "list"})

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-parameter-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serattribute-name-string (:key input)) #:http.request.field{:name "key", :shape "attributeNameString"}) (clojure.core/into (serattribute-value-string (:string-value input)) #:http.request.field{:name "stringValue", :shape "attributeValueString"})], :shape "ParameterAttribute", :type "structure"}))

(clojure.core/defn- ser-parameter-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serfield-name-string (:id input)) #:http.request.field{:name "id", :shape "fieldNameString"}) (clojure.core/into (ser-parameter-attribute-list (:attributes input)) #:http.request.field{:name "attributes", :shape "ParameterAttributeList"})], :shape "ParameterObject", :type "structure"}))

(clojure.core/defn- sererror-message [input] #:http.request.field{:value input, :shape "errorMessage"})

(clojure.core/defn- ser-pipeline-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serid (:id input)) #:http.request.field{:name "id", :shape "id"}) (clojure.core/into (serid (:name input)) #:http.request.field{:name "name", :shape "id"}) (clojure.core/into (serfield-list (:fields input)) #:http.request.field{:name "fields", :shape "fieldList"})], :shape "PipelineObject", :type "structure"}))

(clojure.core/defn- serid [input] #:http.request.field{:value input, :shape "id"})

(clojure.core/defn- sertimestamp [input] #:http.request.field{:value input, :shape "timestamp"})

(clojure.core/defn- ser-parameter-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-attribute coll) #:http.request.field{:shape "ParameterAttribute"}))) input), :shape "ParameterAttributeList", :type "list"})

(clojure.core/defn- ser-operator-type [input] #:http.request.field{:value (clojure.core/get {:ge "GE", :eq "EQ", "REF_EQ" "REF_EQ", "GE" "GE", :between "BETWEEN", "LE" "LE", :ref-eq "REF_EQ", "EQ" "EQ", :le "LE", "BETWEEN" "BETWEEN"} input), :shape "OperatorType"})

(clojure.core/defn- serattribute-name-string [input] #:http.request.field{:value input, :shape "attributeNameString"})

(clojure.core/defn- ser-query [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Query", :type "structure"} (clojure.core/contains? input :selectors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selector-list (input :selectors)) #:http.request.field{:name "selectors", :shape "SelectorList"}))))

(clojure.core/defn- sertag-value [input] #:http.request.field{:value input, :shape "tagValue"})

(clojure.core/defn- ser-parameter-object-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-object coll) #:http.request.field{:shape "ParameterObject"}))) input), :shape "ParameterObjectList", :type "list"})

(clojure.core/defn- serfield-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-field coll) #:http.request.field{:shape "Field"}))) input), :shape "fieldList", :type "list"})

(clojure.core/defn- sertag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "tagList", :type "list", :min 0, :max 10})

(clojure.core/defn- ser-instance-identity [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceIdentity", :type "structure"} (clojure.core/contains? input :document) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :document)) #:http.request.field{:name "document", :shape "string"})) (clojure.core/contains? input :signature) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :signature)) #:http.request.field{:name "signature", :shape "string"}))))

(clojure.core/defn- ser-pipeline-object-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-pipeline-object coll) #:http.request.field{:shape "PipelineObject"}))) input), :shape "PipelineObjectList", :type "list"})

(clojure.core/defn- serfield-name-string [input] #:http.request.field{:value input, :shape "fieldNameString"})

(clojure.core/defn- ser-operator [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Operator", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operator-type (input :type)) #:http.request.field{:name "type", :shape "OperatorType"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring-list (input :values)) #:http.request.field{:name "values", :shape "stringList"}))))

(clojure.core/defn- sertask-id [input] #:http.request.field{:value input, :shape "taskId"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (sertag-key (:key input)) #:http.request.field{:name "key", :shape "tagKey"}) (clojure.core/into (sertag-value (:value input)) #:http.request.field{:name "value", :shape "tagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- serattribute-value-string [input] #:http.request.field{:value input, :shape "attributeValueString"})

(clojure.core/defn- ser-field [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serfield-name-string (:key input)) #:http.request.field{:name "key", :shape "fieldNameString"})], :shape "Field", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serfield-string-value (input :string-value)) #:http.request.field{:name "stringValue", :shape "fieldStringValue"})) (clojure.core/contains? input :ref-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serfield-name-string (input :ref-value)) #:http.request.field{:name "refValue", :shape "fieldNameString"}))))

(clojure.core/defn- serstring-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string"}))) input), :shape "stringList", :type "list"})

(clojure.core/defn- sertag-key [input] #:http.request.field{:value input, :shape "tagKey"})

(clojure.core/defn- serfield-string-value [input] #:http.request.field{:value input, :shape "fieldStringValue"})

(clojure.core/defn- ser-task-status [input] #:http.request.field{:value (clojure.core/get {"FINISHED" "FINISHED", :finished "FINISHED", "FAILED" "FAILED", :failed "FAILED", "FALSE" "FALSE", :false "FALSE"} input), :shape "TaskStatus"})

(clojure.core/defn- ser-selector-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-selector coll) #:http.request.field{:shape "Selector"}))) input), :shape "SelectorList", :type "list"})

(clojure.core/defn- sercancel-active [input] #:http.request.field{:value input, :shape "cancelActive"})

(clojure.core/defn- serid-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serid coll) #:http.request.field{:shape "id"}))) input), :shape "idList", :type "list"})

(clojure.core/defn- ser-parameter-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serfield-name-string (:id input)) #:http.request.field{:name "id", :shape "fieldNameString"}) (clojure.core/into (serfield-string-value (:string-value input)) #:http.request.field{:name "stringValue", :shape "fieldStringValue"})], :shape "ParameterValue", :type "structure"}))

(clojure.core/defn- req-put-pipeline-definition-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (ser-pipeline-object-list (input :pipeline-objects)) #:http.request.field{:name "pipelineObjects", :shape "PipelineObjectList"})]} (clojure.core/contains? input :parameter-objects) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-object-list (input :parameter-objects)) #:http.request.field{:name "parameterObjects", :shape "ParameterObjectList"})) (clojure.core/contains? input :parameter-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value-list (input :parameter-values)) #:http.request.field{:name "parameterValues", :shape "ParameterValueList"}))))

(clojure.core/defn- req-describe-objects-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (serid-list (input :object-ids)) #:http.request.field{:name "objectIds", :shape "idList"})]} (clojure.core/contains? input :evaluate-expressions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :evaluate-expressions)) #:http.request.field{:name "evaluateExpressions", :shape "boolean"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string"}))))

(clojure.core/defn- req-evaluate-expression-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (serid (input :object-id)) #:http.request.field{:name "objectId", :shape "id"}) (clojure.core/into (serlong-string (input :expression)) #:http.request.field{:name "expression", :shape "longString"})]}))

(clojure.core/defn- req-describe-pipelines-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid-list (input :pipeline-ids)) #:http.request.field{:name "pipelineIds", :shape "idList"})]}))

(clojure.core/defn- req-validate-pipeline-definition-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (ser-pipeline-object-list (input :pipeline-objects)) #:http.request.field{:name "pipelineObjects", :shape "PipelineObjectList"})]} (clojure.core/contains? input :parameter-objects) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-object-list (input :parameter-objects)) #:http.request.field{:name "parameterObjects", :shape "ParameterObjectList"})) (clojure.core/contains? input :parameter-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value-list (input :parameter-values)) #:http.request.field{:name "parameterValues", :shape "ParameterValueList"}))))

(clojure.core/defn- req-get-pipeline-definition-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"})]} (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :version)) #:http.request.field{:name "version", :shape "string"}))))

(clojure.core/defn- req-remove-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (serstring-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "stringList"})]}))

(clojure.core/defn- req-delete-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"})]}))

(clojure.core/defn- req-query-objects-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (serstring (input :sphere)) #:http.request.field{:name "sphere", :shape "string"})]} (clojure.core/contains? input :query) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query (input :query)) #:http.request.field{:name "query", :shape "Query"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serint (input :limit)) #:http.request.field{:name "limit", :shape "int"}))))

(clojure.core/defn- req-create-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :name)) #:http.request.field{:name "name", :shape "id"}) (clojure.core/into (serid (input :unique-id)) #:http.request.field{:name "uniqueId", :shape "id"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :description)) #:http.request.field{:name "description", :shape "string"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertag-list (input :tags)) #:http.request.field{:name "tags", :shape "tagList"}))))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (sertag-list (input :tags)) #:http.request.field{:name "tags", :shape "tagList"})]}))

(clojure.core/defn- req-deactivate-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"})]} (clojure.core/contains? input :cancel-active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercancel-active (input :cancel-active)) #:http.request.field{:name "cancelActive", :shape "cancelActive"}))))

(clojure.core/defn- req-list-pipelines-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "marker", :shape "string"}))))

(clojure.core/defn- req-report-task-runner-heartbeat-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :taskrunner-id)) #:http.request.field{:name "taskrunnerId", :shape "id"})]} (clojure.core/contains? input :worker-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :worker-group)) #:http.request.field{:name "workerGroup", :shape "string"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serid (input :hostname)) #:http.request.field{:name "hostname", :shape "id"}))))

(clojure.core/defn- req-report-task-progress-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertask-id (input :task-id)) #:http.request.field{:name "taskId", :shape "taskId"})]} (clojure.core/contains? input :fields) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serfield-list (input :fields)) #:http.request.field{:name "fields", :shape "fieldList"}))))

(clojure.core/defn- req-set-task-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sertask-id (input :task-id)) #:http.request.field{:name "taskId", :shape "taskId"}) (clojure.core/into (ser-task-status (input :task-status)) #:http.request.field{:name "taskStatus", :shape "TaskStatus"})]} (clojure.core/contains? input :error-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :error-id)) #:http.request.field{:name "errorId", :shape "string"})) (clojure.core/contains? input :error-message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sererror-message (input :error-message)) #:http.request.field{:name "errorMessage", :shape "errorMessage"})) (clojure.core/contains? input :error-stack-trace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :error-stack-trace)) #:http.request.field{:name "errorStackTrace", :shape "string"}))))

(clojure.core/defn- req-activate-pipeline-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"})]} (clojure.core/contains? input :parameter-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value-list (input :parameter-values)) #:http.request.field{:name "parameterValues", :shape "ParameterValueList"})) (clojure.core/contains? input :start-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertimestamp (input :start-timestamp)) #:http.request.field{:name "startTimestamp", :shape "timestamp"}))))

(clojure.core/defn- req-poll-for-task-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serstring (input :worker-group)) #:http.request.field{:name "workerGroup", :shape "string"})]} (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serid (input :hostname)) #:http.request.field{:name "hostname", :shape "id"})) (clojure.core/contains? input :instance-identity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-identity (input :instance-identity)) #:http.request.field{:name "instanceIdentity", :shape "InstanceIdentity"}))))

(clojure.core/defn- req-set-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serid (input :pipeline-id)) #:http.request.field{:name "pipelineId", :shape "id"}) (clojure.core/into (serid-list (input :object-ids)) #:http.request.field{:name "objectIds", :shape "idList"}) (clojure.core/into (serstring (input :status)) #:http.request.field{:name "status", :shape "string"})]}))

(clojure.spec.alpha/def :portkey.aws.datapipeline/long-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 20971520)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.datapipeline.selector/field-name (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.selector/operator (clojure.spec.alpha/and :portkey.aws.datapipeline/operator))
(clojure.spec.alpha/def :portkey.aws.datapipeline/selector (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.selector/field-name :portkey.aws.datapipeline.selector/operator]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/int clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-value-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/parameter-value))

(clojure.spec.alpha/def :portkey.aws.datapipeline/set-task-status-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-input/pipeline-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-input/parameter-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-input/parameter-values (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-value-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/put-pipeline-definition-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.put-pipeline-definition-input/pipeline-id :portkey.aws.datapipeline.put-pipeline-definition-input/pipeline-objects] :opt-un [:portkey.aws.datapipeline.put-pipeline-definition-input/parameter-objects :portkey.aws.datapipeline.put-pipeline-definition-input/parameter-values]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.datapipeline/error-message))
(clojure.spec.alpha/def :portkey.aws.datapipeline/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-attribute/key (clojure.spec.alpha/and :portkey.aws.datapipeline/attribute-name-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-attribute/string-value (clojure.spec.alpha/and :portkey.aws.datapipeline/attribute-value-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.parameter-attribute/key :portkey.aws.datapipeline.parameter-attribute/string-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.validation-error/errors (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-messages))
(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline/id :portkey.aws.datapipeline.validation-error/errors]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-output/validation-errors (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-errors))
(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-output/validation-warnings (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-warnings))
(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-output/errored (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/validate-pipeline-definition-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.validate-pipeline-definition-output/errored] :opt-un [:portkey.aws.datapipeline.validate-pipeline-definition-output/validation-errors :portkey.aws.datapipeline.validate-pipeline-definition-output/validation-warnings]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-object/id (clojure.spec.alpha/and :portkey.aws.datapipeline/field-name-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-object/attributes (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-attribute-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-object (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.parameter-object/id :portkey.aws.datapipeline.parameter-object/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-input/object-ids (clojure.spec.alpha/and :portkey.aws.datapipeline/id-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-input/evaluate-expressions (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-input/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/describe-objects-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.describe-objects-input/pipeline-id :portkey.aws.datapipeline.describe-objects-input/object-ids] :opt-un [:portkey.aws.datapipeline.describe-objects-input/evaluate-expressions :portkey.aws.datapipeline.describe-objects-input/marker]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.evaluate-expression-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.evaluate-expression-input/object-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.evaluate-expression-input/expression (clojure.spec.alpha/and :portkey.aws.datapipeline/long-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/evaluate-expression-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.evaluate-expression-input/pipeline-id :portkey.aws.datapipeline.evaluate-expression-input/object-id :portkey.aws.datapipeline.evaluate-expression-input/expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-pipelines-input/pipeline-ids (clojure.spec.alpha/and :portkey.aws.datapipeline/id-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/describe-pipelines-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.describe-pipelines-input/pipeline-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.datapipeline.task-object/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.task-object/attempt-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.task-object/objects (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-object-map))
(clojure.spec.alpha/def :portkey.aws.datapipeline/task-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline/task-id :portkey.aws.datapipeline.task-object/pipeline-id :portkey.aws.datapipeline.task-object/attempt-id :portkey.aws.datapipeline.task-object/objects]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/activate-pipeline-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-input/pipeline-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-input/parameter-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.validate-pipeline-definition-input/parameter-values (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-value-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/validate-pipeline-definition-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.validate-pipeline-definition-input/pipeline-id :portkey.aws.datapipeline.validate-pipeline-definition-input/pipeline-objects] :opt-un [:portkey.aws.datapipeline.validate-pipeline-definition-input/parameter-objects :portkey.aws.datapipeline.validate-pipeline-definition-input/parameter-values]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-object/name (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-object/fields (clojure.spec.alpha/and :portkey.aws.datapipeline/field-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-object (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline/id :portkey.aws.datapipeline.pipeline-object/name :portkey.aws.datapipeline.pipeline-object/fields] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.internal-service-error/message (clojure.spec.alpha/and :portkey.aws.datapipeline/error-message))
(clojure.spec.alpha/def :portkey.aws.datapipeline/internal-service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.internal-service-error/message]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.datapipeline/error-message))
(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.pipeline-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.get-pipeline-definition-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.get-pipeline-definition-input/version (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/get-pipeline-definition-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.get-pipeline-definition-input/pipeline-id] :opt-un [:portkey.aws.datapipeline.get-pipeline-definition-input/version]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.remove-tags-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.remove-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.datapipeline/string-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/remove-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.remove-tags-input/pipeline-id :portkey.aws.datapipeline.remove-tags-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline/deactivate-pipeline-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-output/pipeline-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-output/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-objects-output/has-more-results (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/describe-objects-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.describe-objects-output/pipeline-objects] :opt-un [:portkey.aws.datapipeline.describe-objects-output/marker :portkey.aws.datapipeline.describe-objects-output/has-more-results]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.delete-pipeline-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline/delete-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.delete-pipeline-input/pipeline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10000)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.datapipeline/remove-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/parameter-attribute))

(clojure.spec.alpha/def :portkey.aws.datapipeline/operator-type #{:ge :eq "REF_EQ" "GE" :between "LE" :ref-eq "EQ" :le "BETWEEN"})

(clojure.spec.alpha/def :portkey.aws.datapipeline/attribute-name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-input/query (clojure.spec.alpha/and :portkey.aws.datapipeline/query))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-input/sphere (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-input/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-input/limit (clojure.spec.alpha/and :portkey.aws.datapipeline/int))
(clojure.spec.alpha/def :portkey.aws.datapipeline/query-objects-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.query-objects-input/pipeline-id :portkey.aws.datapipeline.query-objects-input/sphere] :opt-un [:portkey.aws.datapipeline.query-objects-input/query :portkey.aws.datapipeline.query-objects-input/marker :portkey.aws.datapipeline.query-objects-input/limit]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.query/selectors (clojure.spec.alpha/and :portkey.aws.datapipeline/selector-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/query (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.query/selectors]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-object-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/parameter-object))

(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-warnings (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/validation-warning))

(clojure.spec.alpha/def :portkey.aws.datapipeline.create-pipeline-input/name (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.create-pipeline-input/unique-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.create-pipeline-input/description (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.create-pipeline-input/tags (clojure.spec.alpha/and :portkey.aws.datapipeline/tag-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/create-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.create-pipeline-input/name :portkey.aws.datapipeline.create-pipeline-input/unique-id] :opt-un [:portkey.aws.datapipeline.create-pipeline-input/description :portkey.aws.datapipeline.create-pipeline-input/tags]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/field-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/field))

(clojure.spec.alpha/def :portkey.aws.datapipeline/tag-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/tag :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-messages (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/validation-message))

(clojure.spec.alpha/def :portkey.aws.datapipeline.list-pipelines-output/pipeline-id-list (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.list-pipelines-output/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.list-pipelines-output/has-more-results (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/list-pipelines-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.list-pipelines-output/pipeline-id-list] :opt-un [:portkey.aws.datapipeline.list-pipelines-output/marker :portkey.aws.datapipeline.list-pipelines-output/has-more-results]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.evaluate-expression-output/evaluated-expression (clojure.spec.alpha/and :portkey.aws.datapipeline/long-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/evaluate-expression-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.evaluate-expression-output/evaluated-expression] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-progress-output/canceled (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/report-task-progress-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.report-task-progress-output/canceled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.create-pipeline-output/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline/create-pipeline-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.create-pipeline-output/pipeline-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.add-tags-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.datapipeline/tag-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.add-tags-input/pipeline-id :portkey.aws.datapipeline.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.task-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.datapipeline/error-message))
(clojure.spec.alpha/def :portkey.aws.datapipeline/task-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.task-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.deactivate-pipeline-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline/deactivate-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.deactivate-pipeline-input/pipeline-id] :opt-un [:portkey.aws.datapipeline/cancel-active]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.list-pipelines-input/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/list-pipelines-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.list-pipelines-input/marker]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-id-name/name (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-id-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline/id :portkey.aws.datapipeline.pipeline-id-name/name]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-runner-heartbeat-input/taskrunner-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-runner-heartbeat-input/worker-group (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-runner-heartbeat-input/hostname (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline/report-task-runner-heartbeat-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.report-task-runner-heartbeat-input/taskrunner-id] :opt-un [:portkey.aws.datapipeline.report-task-runner-heartbeat-input/worker-group :portkey.aws.datapipeline.report-task-runner-heartbeat-input/hostname]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.instance-identity/document (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.instance-identity/signature (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/instance-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.instance-identity/document :portkey.aws.datapipeline.instance-identity/signature]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-output/validation-errors (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-errors))
(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-output/validation-warnings (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-warnings))
(clojure.spec.alpha/def :portkey.aws.datapipeline.put-pipeline-definition-output/errored (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/put-pipeline-definition-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.put-pipeline-definition-output/errored] :opt-un [:portkey.aws.datapipeline.put-pipeline-definition-output/validation-errors :portkey.aws.datapipeline.put-pipeline-definition-output/validation-warnings]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-progress-input/fields (clojure.spec.alpha/and :portkey.aws.datapipeline/field-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/report-task-progress-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline/task-id] :opt-un [:portkey.aws.datapipeline.report-task-progress-input/fields]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-object-map (clojure.spec.alpha/map-of :portkey.aws.datapipeline/id :portkey.aws.datapipeline/pipeline-object))

(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-object-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/pipeline-object))

(clojure.spec.alpha/def :portkey.aws.datapipeline.set-task-status-input/task-status (clojure.spec.alpha/and :portkey.aws.datapipeline/task-status))
(clojure.spec.alpha/def :portkey.aws.datapipeline.set-task-status-input/error-id (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.set-task-status-input/error-stack-trace (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/set-task-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline/task-id :portkey.aws.datapipeline.set-task-status-input/task-status] :opt-un [:portkey.aws.datapipeline.set-task-status-input/error-id :portkey.aws.datapipeline/error-message :portkey.aws.datapipeline.set-task-status-input/error-stack-trace]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/field-name-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline.operator/type (clojure.spec.alpha/and :portkey.aws.datapipeline/operator-type))
(clojure.spec.alpha/def :portkey.aws.datapipeline.operator/values (clojure.spec.alpha/and :portkey.aws.datapipeline/string-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/operator (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.operator/type :portkey.aws.datapipeline.operator/values]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.poll-for-task-output/task-object (clojure.spec.alpha/and :portkey.aws.datapipeline/task-object))
(clojure.spec.alpha/def :portkey.aws.datapipeline/poll-for-task-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.poll-for-task-output/task-object]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.activate-pipeline-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.activate-pipeline-input/parameter-values (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-value-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.activate-pipeline-input/start-timestamp (clojure.spec.alpha/and :portkey.aws.datapipeline/timestamp))
(clojure.spec.alpha/def :portkey.aws.datapipeline/activate-pipeline-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.activate-pipeline-input/pipeline-id] :opt-un [:portkey.aws.datapipeline.activate-pipeline-input/parameter-values :portkey.aws.datapipeline.activate-pipeline-input/start-timestamp]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.poll-for-task-input/worker-group (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.poll-for-task-input/hostname (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.poll-for-task-input/instance-identity (clojure.spec.alpha/and :portkey.aws.datapipeline/instance-identity))
(clojure.spec.alpha/def :portkey.aws.datapipeline/poll-for-task-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.poll-for-task-input/worker-group] :opt-un [:portkey.aws.datapipeline.poll-for-task-input/hostname :portkey.aws.datapipeline.poll-for-task-input/instance-identity]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline.tag/key (clojure.spec.alpha/and :portkey.aws.datapipeline/tag-key))
(clojure.spec.alpha/def :portkey.aws.datapipeline.tag/value (clojure.spec.alpha/and :portkey.aws.datapipeline/tag-value))
(clojure.spec.alpha/def :portkey.aws.datapipeline/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.tag/key :portkey.aws.datapipeline.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.set-status-input/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.set-status-input/object-ids (clojure.spec.alpha/and :portkey.aws.datapipeline/id-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.set-status-input/status (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/set-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.set-status-input/pipeline-id :portkey.aws.datapipeline.set-status-input/object-ids :portkey.aws.datapipeline.set-status-input/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.validation-warning/warnings (clojure.spec.alpha/and :portkey.aws.datapipeline/validation-messages))
(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline/id :portkey.aws.datapipeline.validation-warning/warnings]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/attribute-value-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10240)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline.describe-pipelines-output/pipeline-description-list (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-description-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/describe-pipelines-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.describe-pipelines-output/pipeline-description-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-description/pipeline-id (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-description/name (clojure.spec.alpha/and :portkey.aws.datapipeline/id))
(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-description/fields (clojure.spec.alpha/and :portkey.aws.datapipeline/field-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-description/description (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-description/tags (clojure.spec.alpha/and :portkey.aws.datapipeline/tag-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-description (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.pipeline-description/pipeline-id :portkey.aws.datapipeline.pipeline-description/name :portkey.aws.datapipeline.pipeline-description/fields] :opt-un [:portkey.aws.datapipeline.pipeline-description/description :portkey.aws.datapipeline.pipeline-description/tags]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.field/key (clojure.spec.alpha/and :portkey.aws.datapipeline/field-name-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.field/string-value (clojure.spec.alpha/and :portkey.aws.datapipeline/field-string-value))
(clojure.spec.alpha/def :portkey.aws.datapipeline.field/ref-value (clojure.spec.alpha/and :portkey.aws.datapipeline/field-name-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline/field (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.field/key] :opt-un [:portkey.aws.datapipeline.field/string-value :portkey.aws.datapipeline.field/ref-value]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/pipeline-id-name))

(clojure.spec.alpha/def :portkey.aws.datapipeline/string-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/string))

(clojure.spec.alpha/def :portkey.aws.datapipeline/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-description-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/pipeline-description))

(clojure.spec.alpha/def :portkey.aws.datapipeline/field-string-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10240)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.datapipeline/task-status #{:false :finished "FAILED" "FINISHED" "FALSE" :failed})

(clojure.spec.alpha/def :portkey.aws.datapipeline/selector-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/selector))

(clojure.spec.alpha/def :portkey.aws.datapipeline/cancel-active clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.datapipeline/id-list (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/id))

(clojure.spec.alpha/def :portkey.aws.datapipeline.get-pipeline-definition-output/pipeline-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/pipeline-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.get-pipeline-definition-output/parameter-objects (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-object-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.get-pipeline-definition-output/parameter-values (clojure.spec.alpha/and :portkey.aws.datapipeline/parameter-value-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline/get-pipeline-definition-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.get-pipeline-definition-output/pipeline-objects :portkey.aws.datapipeline.get-pipeline-definition-output/parameter-objects :portkey.aws.datapipeline.get-pipeline-definition-output/parameter-values]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-output/ids (clojure.spec.alpha/and :portkey.aws.datapipeline/id-list))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-output/marker (clojure.spec.alpha/and :portkey.aws.datapipeline/string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.query-objects-output/has-more-results (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/query-objects-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.query-objects-output/ids :portkey.aws.datapipeline.query-objects-output/marker :portkey.aws.datapipeline.query-objects-output/has-more-results]))

(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-value/id (clojure.spec.alpha/and :portkey.aws.datapipeline/field-name-string))
(clojure.spec.alpha/def :portkey.aws.datapipeline.parameter-value/string-value (clojure.spec.alpha/and :portkey.aws.datapipeline/field-string-value))
(clojure.spec.alpha/def :portkey.aws.datapipeline/parameter-value (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.parameter-value/id :portkey.aws.datapipeline.parameter-value/string-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.datapipeline.pipeline-deleted-exception/message (clojure.spec.alpha/and :portkey.aws.datapipeline/error-message))
(clojure.spec.alpha/def :portkey.aws.datapipeline/pipeline-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.datapipeline.pipeline-deleted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.datapipeline/validation-errors (clojure.spec.alpha/coll-of :portkey.aws.datapipeline/validation-error))

(clojure.spec.alpha/def :portkey.aws.datapipeline.report-task-runner-heartbeat-output/terminate (clojure.spec.alpha/and :portkey.aws.datapipeline/boolean))
(clojure.spec.alpha/def :portkey.aws.datapipeline/report-task-runner-heartbeat-output (clojure.spec.alpha/keys :req-un [:portkey.aws.datapipeline.report-task-runner-heartbeat-output/terminate] :opt-un []))

(clojure.core/defn create-pipeline ([create-pipeline-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-pipeline-input create-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/create-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/create-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePipeline", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/create-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/create-pipeline-output))

(clojure.core/defn remove-tags ([remove-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/remove-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/remove-tags-output))

(clojure.core/defn list-pipelines ([] (list-pipelines {})) ([list-pipelines-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-pipelines-input list-pipelines-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/list-pipelines-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/list-pipelines-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPipelines", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-pipelines :args (clojure.spec.alpha/? :portkey.aws.datapipeline/list-pipelines-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/list-pipelines-output))

(clojure.core/defn activate-pipeline ([activate-pipeline-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-activate-pipeline-input activate-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/activate-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/activate-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ActivatePipeline", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef activate-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/activate-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/activate-pipeline-output))

(clojure.core/defn describe-pipelines ([describe-pipelines-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-pipelines-input describe-pipelines-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/describe-pipelines-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/describe-pipelines-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribePipelines", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-pipelines :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/describe-pipelines-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/describe-pipelines-output))

(clojure.core/defn get-pipeline-definition ([get-pipeline-definition-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-pipeline-definition-input get-pipeline-definition-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/get-pipeline-definition-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/get-pipeline-definition-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPipelineDefinition", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef get-pipeline-definition :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/get-pipeline-definition-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/get-pipeline-definition-output))

(clojure.core/defn poll-for-task ([poll-for-task-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-poll-for-task-input poll-for-task-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/poll-for-task-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/poll-for-task-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PollForTask", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "TaskNotFoundException" :portkey.aws.datapipeline/task-not-found-exception}})))))
(clojure.spec.alpha/fdef poll-for-task :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/poll-for-task-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/poll-for-task-output))

(clojure.core/defn set-task-status ([set-task-status-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-task-status-input set-task-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/set-task-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/set-task-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTaskStatus", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "TaskNotFoundException" :portkey.aws.datapipeline/task-not-found-exception, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef set-task-status :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/set-task-status-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/set-task-status-output))

(clojure.core/defn report-task-runner-heartbeat ([report-task-runner-heartbeat-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-report-task-runner-heartbeat-input report-task-runner-heartbeat-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/report-task-runner-heartbeat-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/report-task-runner-heartbeat-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReportTaskRunnerHeartbeat", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef report-task-runner-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/report-task-runner-heartbeat-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/report-task-runner-heartbeat-output))

(clojure.core/defn evaluate-expression ([evaluate-expression-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-evaluate-expression-input evaluate-expression-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/evaluate-expression-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/evaluate-expression-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EvaluateExpression", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "TaskNotFoundException" :portkey.aws.datapipeline/task-not-found-exception, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef evaluate-expression :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/evaluate-expression-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/evaluate-expression-output))

(clojure.core/defn set-status ([set-status-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-status-input set-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/set-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetStatus", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef set-status :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/set-status-input) :ret clojure.core/true?)

(clojure.core/defn put-pipeline-definition ([put-pipeline-definition-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-pipeline-definition-input put-pipeline-definition-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/put-pipeline-definition-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/put-pipeline-definition-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutPipelineDefinition", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef put-pipeline-definition :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/put-pipeline-definition-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/put-pipeline-definition-output))

(clojure.core/defn delete-pipeline ([delete-pipeline-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-pipeline-input delete-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/delete-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePipeline", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/delete-pipeline-input) :ret clojure.core/true?)

(clojure.core/defn describe-objects ([describe-objects-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-objects-input describe-objects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/describe-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/describe-objects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeObjects", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef describe-objects :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/describe-objects-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/describe-objects-output))

(clojure.core/defn query-objects ([query-objects-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-query-objects-input query-objects-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/query-objects-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/query-objects-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "QueryObjects", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef query-objects :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/query-objects-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/query-objects-output))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/add-tags-output))

(clojure.core/defn deactivate-pipeline ([deactivate-pipeline-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deactivate-pipeline-input deactivate-pipeline-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/deactivate-pipeline-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/deactivate-pipeline-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeactivatePipeline", :http.request.spec/error-spec {"PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception, "InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception}})))))
(clojure.spec.alpha/fdef deactivate-pipeline :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/deactivate-pipeline-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/deactivate-pipeline-output))

(clojure.core/defn validate-pipeline-definition ([validate-pipeline-definition-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-validate-pipeline-definition-input validate-pipeline-definition-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/validate-pipeline-definition-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/validate-pipeline-definition-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ValidatePipelineDefinition", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef validate-pipeline-definition :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/validate-pipeline-definition-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/validate-pipeline-definition-output))

(clojure.core/defn report-task-progress ([report-task-progress-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-report-task-progress-input report-task-progress-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.datapipeline/endpoints, :http.request.configuration/target-prefix "DataPipeline", :http.request.spec/output-spec :portkey.aws.datapipeline/report-task-progress-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.datapipeline/report-task-progress-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReportTaskProgress", :http.request.spec/error-spec {"InternalServiceError" :portkey.aws.datapipeline/internal-service-error, "InvalidRequestException" :portkey.aws.datapipeline/invalid-request-exception, "TaskNotFoundException" :portkey.aws.datapipeline/task-not-found-exception, "PipelineNotFoundException" :portkey.aws.datapipeline/pipeline-not-found-exception, "PipelineDeletedException" :portkey.aws.datapipeline/pipeline-deleted-exception}})))))
(clojure.spec.alpha/fdef report-task-progress :args (clojure.spec.alpha/tuple :portkey.aws.datapipeline/report-task-progress-input) :ret (clojure.spec.alpha/and :portkey.aws.datapipeline/report-task-progress-output))
