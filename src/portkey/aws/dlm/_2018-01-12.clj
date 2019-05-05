(ns portkey.aws.dlm.-2018-01-12 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-retain-rule)

(clojure.core/declare ser-policy-details)

(clojure.core/declare ser-target-tag-list)

(clojure.core/declare ser-resource-type-values-list)

(clojure.core/declare ser-policy-description)

(clojure.core/declare ser-count)

(clojure.core/declare ser-copy-tags)

(clojure.core/declare ser-interval)

(clojure.core/declare ser-create-rule)

(clojure.core/declare ser-tags-to-add-filter-list)

(clojure.core/declare ser-resource-type-values)

(clojure.core/declare ser-policy-id)

(clojure.core/declare ser-settable-policy-state-values)

(clojure.core/declare ser-string)

(clojure.core/declare ser-policy-id-list)

(clojure.core/declare ser-tags-to-add-list)

(clojure.core/declare ser-execution-role-arn)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-target-tags-filter-list)

(clojure.core/declare ser-interval-unit-values)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-schedule)

(clojure.core/declare ser-gettable-policy-state-values)

(clojure.core/declare ser-schedule-list)

(clojure.core/declare ser-times-list)

(clojure.core/declare ser-time)

(clojure.core/declare ser-schedule-name)

(clojure.core/defn- ser-retain-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-count (:count input)) #:http.request.field{:name "Count", :shape "Count"})], :shape "RetainRule", :type "structure"}))

(clojure.core/defn- ser-policy-details [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PolicyDetails", :type "structure"} (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type-values-list (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypeValuesList"})) (clojure.core/contains? input :target-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-tag-list (input :target-tags)) #:http.request.field{:name "TargetTags", :shape "TargetTagList"})) (clojure.core/contains? input :schedules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-list (input :schedules)) #:http.request.field{:name "Schedules", :shape "ScheduleList"}))))

(clojure.core/defn- ser-target-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TargetTagList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-resource-type-values-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-type-values coll) #:http.request.field{:shape "ResourceTypeValues"}))) input), :shape "ResourceTypeValuesList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-policy-description [input] #:http.request.field{:value input, :shape "PolicyDescription"})

(clojure.core/defn- ser-count [input] #:http.request.field{:value input, :shape "Count"})

(clojure.core/defn- ser-copy-tags [input] #:http.request.field{:value input, :shape "CopyTags"})

(clojure.core/defn- ser-interval [input] #:http.request.field{:value input, :shape "Interval"})

(clojure.core/defn- ser-create-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-interval (:interval input)) #:http.request.field{:name "Interval", :shape "Interval"}) (clojure.core/into (ser-interval-unit-values (:interval-unit input)) #:http.request.field{:name "IntervalUnit", :shape "IntervalUnitValues"})], :shape "CreateRule", :type "structure"} (clojure.core/contains? input :times) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-times-list (input :times)) #:http.request.field{:name "Times", :shape "TimesList"}))))

(clojure.core/defn- ser-tags-to-add-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagsToAddFilterList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-resource-type-values [input] #:http.request.field{:value (clojure.core/get {"VOLUME" "VOLUME", :volume "VOLUME"} input), :shape "ResourceTypeValues"})

(clojure.core/defn- ser-policy-id [input] #:http.request.field{:value input, :shape "PolicyId"})

(clojure.core/defn- ser-settable-policy-state-values [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "SettablePolicyStateValues"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-policy-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-id coll) #:http.request.field{:shape "PolicyId"}))) input), :shape "PolicyIdList", :type "list"})

(clojure.core/defn- ser-tags-to-add-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagsToAddList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-execution-role-arn [input] #:http.request.field{:value input, :shape "ExecutionRoleArn"})

(clojure.core/defn- ser-tag-filter [input] #:http.request.field{:value input, :shape "TagFilter"})

(clojure.core/defn- ser-target-tags-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TargetTagsFilterList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-interval-unit-values [input] #:http.request.field{:value (clojure.core/get {"HOURS" "HOURS", :hours "HOURS"} input), :shape "IntervalUnitValues"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:key input)) #:http.request.field{:name "Key", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-schedule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Schedule", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-name (input :name)) #:http.request.field{:name "Name", :shape "ScheduleName"})) (clojure.core/contains? input :copy-tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-copy-tags (input :copy-tags)) #:http.request.field{:name "CopyTags", :shape "CopyTags"})) (clojure.core/contains? input :tags-to-add) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-to-add-list (input :tags-to-add)) #:http.request.field{:name "TagsToAdd", :shape "TagsToAddList"})) (clojure.core/contains? input :create-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-create-rule (input :create-rule)) #:http.request.field{:name "CreateRule", :shape "CreateRule"})) (clojure.core/contains? input :retain-rule) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retain-rule (input :retain-rule)) #:http.request.field{:name "RetainRule", :shape "RetainRule"}))))

(clojure.core/defn- ser-gettable-policy-state-values [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED", "ERROR" "ERROR", :error "ERROR"} input), :shape "GettablePolicyStateValues"})

(clojure.core/defn- ser-schedule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schedule coll) #:http.request.field{:shape "Schedule"}))) input), :shape "ScheduleList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-times-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-time coll) #:http.request.field{:shape "Time"}))) input), :shape "TimesList", :type "list", :max 1})

(clojure.core/defn- ser-time [input] #:http.request.field{:value input, :shape "Time"})

(clojure.core/defn- ser-schedule-name [input] #:http.request.field{:value input, :shape "ScheduleName"})

(clojure.core/defn- req-get-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId", :location "uri", :location-name "policyId"})]}))

(clojure.core/defn- req-delete-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId", :location "uri", :location-name "policyId"})]}))

(clojure.core/defn- req-get-lifecycle-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy-ids) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-id-list (input :policy-ids)) #:http.request.field{:name "PolicyIds", :shape "PolicyIdList", :location "querystring", :location-name "policyIds"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gettable-policy-state-values (input :state)) #:http.request.field{:name "State", :shape "GettablePolicyStateValues", :location "querystring", :location-name "state"})) (clojure.core/contains? input :resource-types) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-type-values-list (input :resource-types)) #:http.request.field{:name "ResourceTypes", :shape "ResourceTypeValuesList", :location "querystring", :location-name "resourceTypes"})) (clojure.core/contains? input :target-tags) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-tags-filter-list (input :target-tags)) #:http.request.field{:name "TargetTags", :shape "TargetTagsFilterList", :location "querystring", :location-name "targetTags"})) (clojure.core/contains? input :tags-to-add) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-to-add-filter-list (input :tags-to-add)) #:http.request.field{:name "TagsToAdd", :shape "TagsToAddFilterList", :location "querystring", :location-name "tagsToAdd"}))))

(clojure.core/defn- req-update-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-policy-id (input :policy-id)) #:http.request.field{:name "PolicyId", :shape "PolicyId", :location "uri", :location-name "policyId"})]} (clojure.core/contains? input :execution-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-execution-role-arn (input :execution-role-arn)) #:http.request.field{:name "ExecutionRoleArn", :shape "ExecutionRoleArn"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-settable-policy-state-values (input :state)) #:http.request.field{:name "State", :shape "SettablePolicyStateValues"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-description (input :description)) #:http.request.field{:name "Description", :shape "PolicyDescription"})) (clojure.core/contains? input :policy-details) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-details (input :policy-details)) #:http.request.field{:name "PolicyDetails", :shape "PolicyDetails"}))))

(clojure.core/defn- req-create-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-execution-role-arn (input :execution-role-arn)) #:http.request.field{:name "ExecutionRoleArn", :shape "ExecutionRoleArn"}) (clojure.core/into (ser-policy-description (input :description)) #:http.request.field{:name "Description", :shape "PolicyDescription"}) (clojure.core/into (ser-settable-policy-state-values (input :state)) #:http.request.field{:name "State", :shape "SettablePolicyStateValues"}) (clojure.core/into (ser-policy-details (input :policy-details)) #:http.request.field{:name "PolicyDetails", :shape "PolicyDetails"})]}))

(clojure.core/declare deser-retain-rule)

(clojure.core/declare deser-policy-details)

(clojure.core/declare deser-target-tag-list)

(clojure.core/declare deser-resource-type-values-list)

(clojure.core/declare deser-policy-description)

(clojure.core/declare deser-count)

(clojure.core/declare deser-copy-tags)

(clojure.core/declare deser-lifecycle-policy-summary)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-interval)

(clojure.core/declare deser-create-rule)

(clojure.core/declare deser-resource-type-values)

(clojure.core/declare deser-parameter-list)

(clojure.core/declare deser-policy-id)

(clojure.core/declare deser-lifecycle-policy-summary-list)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-string)

(clojure.core/declare deser-parameter)

(clojure.core/declare deser-policy-id-list)

(clojure.core/declare deser-tags-to-add-list)

(clojure.core/declare deser-execution-role-arn)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-interval-unit-values)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-schedule)

(clojure.core/declare deser-gettable-policy-state-values)

(clojure.core/declare deser-schedule-list)

(clojure.core/declare deser-times-list)

(clojure.core/declare deser-time)

(clojure.core/declare deser-schedule-name)

(clojure.core/declare deser-lifecycle-policy)

(clojure.core/defn- deser-retain-rule [input] (clojure.core/cond-> {:count (deser-count (input "Count"))}))

(clojure.core/defn- deser-policy-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "ResourceTypes") (clojure.core/assoc :resource-types (deser-resource-type-values-list (input "ResourceTypes"))) (clojure.core/contains? input "TargetTags") (clojure.core/assoc :target-tags (deser-target-tag-list (input "TargetTags"))) (clojure.core/contains? input "Schedules") (clojure.core/assoc :schedules (deser-schedule-list (input "Schedules")))))

(clojure.core/defn- deser-target-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-resource-type-values-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-type-values coll))) input))

(clojure.core/defn- deser-policy-description [input] input)

(clojure.core/defn- deser-count [input] input)

(clojure.core/defn- deser-copy-tags [input] input)

(clojure.core/defn- deser-lifecycle-policy-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-policy-description (input "Description"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-gettable-policy-state-values (input "State")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-interval [input] input)

(clojure.core/defn- deser-create-rule [input] (clojure.core/cond-> {:interval (deser-interval (input "Interval")), :interval-unit (deser-interval-unit-values (input "IntervalUnit"))} (clojure.core/contains? input "Times") (clojure.core/assoc :times (deser-times-list (input "Times")))))

(clojure.core/defn- deser-resource-type-values [input] (clojure.core/get {"VOLUME" :volume} input))

(clojure.core/defn- deser-parameter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter coll))) input))

(clojure.core/defn- deser-policy-id [input] input)

(clojure.core/defn- deser-lifecycle-policy-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-policy-summary coll))) input))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-parameter [input] input)

(clojure.core/defn- deser-policy-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-id coll))) input))

(clojure.core/defn- deser-tags-to-add-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-execution-role-arn [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-interval-unit-values [input] (clojure.core/get {"HOURS" :hours} input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-string (input "Key")), :value (deser-string (input "Value"))}))

(clojure.core/defn- deser-schedule [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-schedule-name (input "Name"))) (clojure.core/contains? input "CopyTags") (clojure.core/assoc :copy-tags (deser-copy-tags (input "CopyTags"))) (clojure.core/contains? input "TagsToAdd") (clojure.core/assoc :tags-to-add (deser-tags-to-add-list (input "TagsToAdd"))) (clojure.core/contains? input "CreateRule") (clojure.core/assoc :create-rule (deser-create-rule (input "CreateRule"))) (clojure.core/contains? input "RetainRule") (clojure.core/assoc :retain-rule (deser-retain-rule (input "RetainRule")))))

(clojure.core/defn- deser-gettable-policy-state-values [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled, "ERROR" :error} input))

(clojure.core/defn- deser-schedule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-schedule coll))) input))

(clojure.core/defn- deser-times-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-time coll))) input))

(clojure.core/defn- deser-time [input] input)

(clojure.core/defn- deser-schedule-name [input] input)

(clojure.core/defn- deser-lifecycle-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (input "PolicyId"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-policy-description (input "Description"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-gettable-policy-state-values (input "State"))) (clojure.core/contains? input "ExecutionRoleArn") (clojure.core/assoc :execution-role-arn (deser-execution-role-arn (input "ExecutionRoleArn"))) (clojure.core/contains? input "DateCreated") (clojure.core/assoc :date-created (deser-timestamp (input "DateCreated"))) (clojure.core/contains? input "DateModified") (clojure.core/assoc :date-modified (deser-timestamp (input "DateModified"))) (clojure.core/contains? input "PolicyDetails") (clojure.core/assoc :policy-details (deser-policy-details (input "PolicyDetails")))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper546244 input] (clojure.core/let [rawinput546243 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546245 {"Message" (rawinput546243 "Message"), "Code" (rawinput546243 "Code"), "RequiredParameters" (rawinput546243 "RequiredParameters"), "MutuallyExclusiveParameters" (rawinput546243 "MutuallyExclusiveParameters")}] (clojure.core/cond-> {} (letvar546245 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar546245 ["Message"]))) (letvar546245 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar546245 ["Code"]))) (letvar546245 "RequiredParameters") (clojure.core/assoc :required-parameters (deser-parameter-list (clojure.core/get-in letvar546245 ["RequiredParameters"]))) (letvar546245 "MutuallyExclusiveParameters") (clojure.core/assoc :mutually-exclusive-parameters (deser-parameter-list (clojure.core/get-in letvar546245 ["MutuallyExclusiveParameters"])))))))

(clojure.core/defn- response-update-lifecycle-policy-response ([input] (response-update-lifecycle-policy-response nil input)) ([resultWrapper546247 input] (clojure.core/let [rawinput546246 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546248 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-lifecycle-policy-response ([input] (response-delete-lifecycle-policy-response nil input)) ([resultWrapper546250 input] (clojure.core/let [rawinput546249 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546251 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper546253 input] (clojure.core/let [rawinput546252 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546254 {"Message" (rawinput546252 "Message"), "Code" (rawinput546252 "Code"), "ResourceType" (rawinput546252 "ResourceType")}] (clojure.core/cond-> {} (letvar546254 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar546254 ["Message"]))) (letvar546254 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar546254 ["Code"]))) (letvar546254 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar546254 ["ResourceType"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper546256 input] (clojure.core/let [rawinput546255 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546257 {"Message" (rawinput546255 "Message"), "Code" (rawinput546255 "Code"), "ResourceType" (rawinput546255 "ResourceType"), "ResourceIds" (rawinput546255 "ResourceIds")}] (clojure.core/cond-> {} (letvar546257 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar546257 ["Message"]))) (letvar546257 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar546257 ["Code"]))) (letvar546257 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar546257 ["ResourceType"]))) (letvar546257 "ResourceIds") (clojure.core/assoc :resource-ids (deser-policy-id-list (clojure.core/get-in letvar546257 ["ResourceIds"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper546259 input] (clojure.core/let [rawinput546258 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546260 {"Message" (rawinput546258 "Message"), "Code" (rawinput546258 "Code")}] (clojure.core/cond-> {} (letvar546260 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar546260 ["Message"]))) (letvar546260 "Code") (clojure.core/assoc :code (deser-error-code (clojure.core/get-in letvar546260 ["Code"])))))))

(clojure.core/defn- response-get-lifecycle-policies-response ([input] (response-get-lifecycle-policies-response nil input)) ([resultWrapper546262 input] (clojure.core/let [rawinput546261 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546263 {"Policies" (rawinput546261 "Policies")}] (clojure.core/cond-> {} (letvar546263 "Policies") (clojure.core/assoc :policies (deser-lifecycle-policy-summary-list (clojure.core/get-in letvar546263 ["Policies"])))))))

(clojure.core/defn- response-get-lifecycle-policy-response ([input] (response-get-lifecycle-policy-response nil input)) ([resultWrapper546265 input] (clojure.core/let [rawinput546264 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546266 {"Policy" (rawinput546264 "Policy")}] (clojure.core/cond-> {} (letvar546266 "Policy") (clojure.core/assoc :policy (deser-lifecycle-policy (clojure.core/get-in letvar546266 ["Policy"])))))))

(clojure.core/defn- response-create-lifecycle-policy-response ([input] (response-create-lifecycle-policy-response nil input)) ([resultWrapper546268 input] (clojure.core/let [rawinput546267 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar546269 {"PolicyId" (rawinput546267 "PolicyId")}] (clojure.core/cond-> {} (letvar546269 "PolicyId") (clojure.core/assoc :policy-id (deser-policy-id (clojure.core/get-in letvar546269 ["PolicyId"])))))))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/retain-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.policy-details/resource-types (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/resource-type-values-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.policy-details/target-tags (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/target-tag-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.policy-details/schedules (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/schedule-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/policy-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.policy-details/resource-types :portkey.aws.dlm.-2018-01-12.policy-details/target-tags :portkey.aws.dlm.-2018-01-12.policy-details/schedules]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-message))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.invalid-request-exception/code (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-code))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.invalid-request-exception/required-parameters (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.invalid-request-exception/mutually-exclusive-parameters (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/parameter-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.invalid-request-exception/message :portkey.aws.dlm.-2018-01-12.invalid-request-exception/code :portkey.aws.dlm.-2018-01-12.invalid-request-exception/required-parameters :portkey.aws.dlm.-2018-01-12.invalid-request-exception/mutually-exclusive-parameters]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/target-tag-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/tag :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/resource-type-values-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/resource-type-values :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/policy-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/count (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-message))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-code))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/resource-type (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/string))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/message :portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/code :portkey.aws.dlm.-2018-01-12.limit-exceeded-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/copy-tags clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy-summary/description (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-description))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy-summary/state (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/gettable-policy-state-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/lifecycle-policy-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12/policy-id :portkey.aws.dlm.-2018-01-12.lifecycle-policy-summary/description :portkey.aws.dlm.-2018-01-12.lifecycle-policy-summary/state]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/interval (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.create-rule/interval-unit (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/interval-unit-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.create-rule/times (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/times-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/create-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/interval :portkey.aws.dlm.-2018-01-12.create-rule/interval-unit] :opt-un [:portkey.aws.dlm.-2018-01-12.create-rule/times]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/tags-to-add-filter-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/tag-filter :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/resource-type-values #{:volume "VOLUME"})

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/parameter-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/parameter))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/policy-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/lifecycle-policy-summary-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/lifecycle-policy-summary))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/policy-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/policy-ids (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-id-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/state (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/gettable-policy-state-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/resource-types (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/resource-type-values-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/target-tags (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/target-tags-filter-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/tags-to-add (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/tags-to-add-filter-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/policy-ids :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/state :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/resource-types :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/target-tags :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-request/tags-to-add]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.update-lifecycle-policy-request/state (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/settable-policy-state-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.update-lifecycle-policy-request/description (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-description))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/policy-id] :opt-un [:portkey.aws.dlm.-2018-01-12/execution-role-arn :portkey.aws.dlm.-2018-01-12.update-lifecycle-policy-request/state :portkey.aws.dlm.-2018-01-12.update-lifecycle-policy-request/description :portkey.aws.dlm.-2018-01-12/policy-details]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-message))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-code))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/resource-type (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/string))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/resource-ids (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-id-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.resource-not-found-exception/message :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/code :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/resource-type :portkey.aws.dlm.-2018-01-12.resource-not-found-exception/resource-ids]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-message))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.internal-server-exception/code (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/error-code))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.internal-server-exception/message :portkey.aws.dlm.-2018-01-12.internal-server-exception/code]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.create-lifecycle-policy-request/description (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-description))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.create-lifecycle-policy-request/state (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/settable-policy-state-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12/execution-role-arn :portkey.aws.dlm.-2018-01-12.create-lifecycle-policy-request/description :portkey.aws.dlm.-2018-01-12.create-lifecycle-policy-request/state :portkey.aws.dlm.-2018-01-12/policy-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-response/policies (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/lifecycle-policy-summary-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.get-lifecycle-policies-response/policies]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/settable-policy-state-values #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/parameter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/policy-id-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/policy-id))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/tags-to-add-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/execution-role-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.get-lifecycle-policy-response/policy (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/lifecycle-policy))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.get-lifecycle-policy-response/policy]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/tag-filter (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/target-tags-filter-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/tag-filter :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/interval-unit-values #{"HOURS" :hours})

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.tag/key (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/string))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.tag/value (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/string))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.dlm.-2018-01-12.tag/key :portkey.aws.dlm.-2018-01-12.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12/policy-id]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.schedule/name (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/schedule-name))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.schedule/tags-to-add (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/tags-to-add-list))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/schedule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12.schedule/name :portkey.aws.dlm.-2018-01-12/copy-tags :portkey.aws.dlm.-2018-01-12.schedule/tags-to-add :portkey.aws.dlm.-2018-01-12/create-rule :portkey.aws.dlm.-2018-01-12/retain-rule]))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/gettable-policy-state-values #{"DISABLED" :disabled "ERROR" :error "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/schedule-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/schedule :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/times-list (clojure.spec.alpha/coll-of :portkey.aws.dlm.-2018-01-12/time :max-count 1))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/time (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/schedule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy/description (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/policy-description))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy/state (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/gettable-policy-state-values))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy/date-created (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12.lifecycle-policy/date-modified (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/timestamp))
(clojure.spec.alpha/def :portkey.aws.dlm.-2018-01-12/lifecycle-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.dlm.-2018-01-12/policy-id :portkey.aws.dlm.-2018-01-12.lifecycle-policy/description :portkey.aws.dlm.-2018-01-12.lifecycle-policy/state :portkey.aws.dlm.-2018-01-12/execution-role-arn :portkey.aws.dlm.-2018-01-12.lifecycle-policy/date-created :portkey.aws.dlm.-2018-01-12.lifecycle-policy/date-modified :portkey.aws.dlm.-2018-01-12/policy-details]))

(clojure.core/defn create-lifecycle-policy "Creates a policy to manage the lifecycle of the specified AWS resources. You can\ncreate up to 100 lifecycle policies." ([create-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-lifecycle-policy-request create-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dlm.-2018-01-12/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies", :http.request.configuration/version "2018-01-12", :http.request.configuration/service-id "DLM", :http.request.spec/input-spec :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLifecyclePolicy", :http.request.configuration/output-deser-fn response-create-lifecycle-policy-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.dlm.-2018-01-12/invalid-request-exception, "LimitExceededException" :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception, "InternalServerException" :portkey.aws.dlm.-2018-01-12/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/create-lifecycle-policy-response))

(clojure.core/defn delete-lifecycle-policy "Deletes the specified lifecycle policy and halts the automated operations that\nthe policy specified." ([delete-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-lifecycle-policy-request delete-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dlm.-2018-01-12/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyId}/", :http.request.configuration/version "2018-01-12", :http.request.configuration/service-id "DLM", :http.request.spec/input-spec :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLifecyclePolicy", :http.request.configuration/output-deser-fn response-delete-lifecycle-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dlm.-2018-01-12/resource-not-found-exception, "InternalServerException" :portkey.aws.dlm.-2018-01-12/internal-server-exception, "LimitExceededException" :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/delete-lifecycle-policy-response))

(clojure.core/defn get-lifecycle-policies "Gets summary information about all or the specified data lifecycle policies.\n To get complete information about a policy, use GetLifecyclePolicy." ([] (get-lifecycle-policies {})) ([get-lifecycle-policies-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-lifecycle-policies-request get-lifecycle-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dlm.-2018-01-12/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies", :http.request.configuration/version "2018-01-12", :http.request.configuration/service-id "DLM", :http.request.spec/input-spec :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLifecyclePolicies", :http.request.configuration/output-deser-fn response-get-lifecycle-policies-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dlm.-2018-01-12/resource-not-found-exception, "InvalidRequestException" :portkey.aws.dlm.-2018-01-12/invalid-request-exception, "InternalServerException" :portkey.aws.dlm.-2018-01-12/internal-server-exception, "LimitExceededException" :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policies :args (clojure.spec.alpha/? :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/get-lifecycle-policies-response))

(clojure.core/defn get-lifecycle-policy "Gets detailed information about the specified lifecycle policy." ([get-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-lifecycle-policy-request get-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dlm.-2018-01-12/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyId}/", :http.request.configuration/version "2018-01-12", :http.request.configuration/service-id "DLM", :http.request.spec/input-spec :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLifecyclePolicy", :http.request.configuration/output-deser-fn response-get-lifecycle-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dlm.-2018-01-12/resource-not-found-exception, "InternalServerException" :portkey.aws.dlm.-2018-01-12/internal-server-exception, "LimitExceededException" :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/get-lifecycle-policy-response))

(clojure.core/defn update-lifecycle-policy "Updates the specified lifecycle policy." ([update-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-lifecycle-policy-request update-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.dlm.-2018-01-12/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/policies/{policyId}", :http.request.configuration/version "2018-01-12", :http.request.configuration/service-id "DLM", :http.request.spec/input-spec :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLifecyclePolicy", :http.request.configuration/output-deser-fn response-update-lifecycle-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.dlm.-2018-01-12/resource-not-found-exception, "InvalidRequestException" :portkey.aws.dlm.-2018-01-12/invalid-request-exception, "InternalServerException" :portkey.aws.dlm.-2018-01-12/internal-server-exception, "LimitExceededException" :portkey.aws.dlm.-2018-01-12/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.dlm.-2018-01-12/update-lifecycle-policy-response))
