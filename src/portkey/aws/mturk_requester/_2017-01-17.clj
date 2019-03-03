(ns portkey.aws.mturk-requester.-2017-01-17 (:require [portkey.aws]))

(def
 endpoints
 '{"sandbox"
   {:credential-scope {:service "mturk-requester", :region "sandbox"},
    :ssl-common-name "mturk-requester-sandbox.us-east-1.amazonaws.com",
    :endpoint
    "https://mturk-requester-sandbox.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "mturk-requester", :region "us-east-1"},
    :ssl-common-name "mturk-requester.us-east-1.amazonaws.com",
    :endpoint "https://mturk-requester.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-qualification-requirement-list)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-locale-list)

(clojure.core/declare ser-review-policy)

(clojure.core/declare ser-reviewable-hit-status)

(clojure.core/declare ser-integer-list)

(clojure.core/declare ser-comparator)

(clojure.core/declare ser-country-parameters)

(clojure.core/declare ser-customer-id)

(clojure.core/declare ser-event-type-list)

(clojure.core/declare ser-locale)

(clojure.core/declare ser-assignment-status)

(clojure.core/declare ser-result-size)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-notification-transport)

(clojure.core/declare ser-parameter-map-entry-list)

(clojure.core/declare ser-review-policy-level)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-policy-parameter-list)

(clojure.core/declare ser-hit-layout-parameter)

(clojure.core/declare ser-review-policy-level-list)

(clojure.core/declare ser-policy-parameter)

(clojure.core/declare ser-currency-amount)

(clojure.core/declare ser-parameter-map-entry)

(clojure.core/declare ser-qualification-type-status)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-idempotency-token)

(clojure.core/declare ser-hit-layout-parameter-list)

(clojure.core/declare ser-long)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-hit-access-actions)

(clojure.core/declare ser-notification-specification)

(clojure.core/declare ser-entity-id)

(clojure.core/declare ser-customer-id-list)

(clojure.core/declare ser-qualification-status)

(clojure.core/declare ser-qualification-requirement)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-assignment-status-list)

(clojure.core/defn- ser-qualification-requirement-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-qualification-requirement coll) #:http.request.field{:shape "QualificationRequirement"}))) input), :shape "QualificationRequirementList", :type "list"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-locale-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-locale coll) #:http.request.field{:shape "Locale"}))) input), :shape "LocaleList", :type "list"})

(clojure.core/defn- ser-review-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:policy-name input)) #:http.request.field{:name "PolicyName", :shape "String"})], :shape "ReviewPolicy", :type "structure"} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-parameter-list (input :parameters)) #:http.request.field{:name "Parameters", :shape "PolicyParameterList"}))))

(clojure.core/defn- ser-reviewable-hit-status [input] #:http.request.field{:value (clojure.core/get {"Reviewable" "Reviewable", :reviewable "Reviewable", "Reviewing" "Reviewing", :reviewing "Reviewing"} input), :shape "ReviewableHITStatus"})

(clojure.core/defn- ser-integer-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer coll) #:http.request.field{:shape "Integer"}))) input), :shape "IntegerList", :type "list"})

(clojure.core/defn- ser-comparator [input] #:http.request.field{:value (clojure.core/get {:exists "Exists", :less-than "LessThan", "Exists" "Exists", "GreaterThanOrEqualTo" "GreaterThanOrEqualTo", "In" "In", "LessThan" "LessThan", :greater-than "GreaterThan", :not-equal-to "NotEqualTo", "LessThanOrEqualTo" "LessThanOrEqualTo", :equal-to "EqualTo", "DoesNotExist" "DoesNotExist", "EqualTo" "EqualTo", "GreaterThan" "GreaterThan", :greater-than-or-equal-to "GreaterThanOrEqualTo", "NotEqualTo" "NotEqualTo", :less-than-or-equal-to "LessThanOrEqualTo", :not-in "NotIn", :does-not-exist "DoesNotExist", "NotIn" "NotIn", :in "In"} input), :shape "Comparator"})

(clojure.core/defn- ser-country-parameters [input] #:http.request.field{:value input, :shape "CountryParameters"})

(clojure.core/defn- ser-customer-id [input] #:http.request.field{:value input, :shape "CustomerId"})

(clojure.core/defn- ser-event-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-type coll) #:http.request.field{:shape "EventType"}))) input), :shape "EventTypeList", :type "list"})

(clojure.core/defn- ser-locale [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-country-parameters (:country input)) #:http.request.field{:name "Country", :shape "CountryParameters"})], :shape "Locale", :type "structure"} (clojure.core/contains? input :subdivision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-country-parameters (input :subdivision)) #:http.request.field{:name "Subdivision", :shape "CountryParameters"}))))

(clojure.core/defn- ser-assignment-status [input] #:http.request.field{:value (clojure.core/get {"Submitted" "Submitted", :submitted "Submitted", "Approved" "Approved", :approved "Approved", "Rejected" "Rejected", :rejected "Rejected"} input), :shape "AssignmentStatus"})

(clojure.core/defn- ser-result-size [input] #:http.request.field{:value input, :shape "ResultSize"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-notification-transport [input] #:http.request.field{:value (clojure.core/get {"Email" "Email", :email "Email", "SQS" "SQS", :sqs "SQS", "SNS" "SNS", :sns "SNS"} input), :shape "NotificationTransport"})

(clojure.core/defn- ser-parameter-map-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-map-entry coll) #:http.request.field{:shape "ParameterMapEntry"}))) input), :shape "ParameterMapEntryList", :type "list"})

(clojure.core/defn- ser-review-policy-level [input] #:http.request.field{:value (clojure.core/get {"Assignment" "Assignment", :assignment "Assignment", "HIT" "HIT", :hit "HIT"} input), :shape "ReviewPolicyLevel"})

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"AssignmentAccepted" "AssignmentAccepted", :ping "Ping", "HITExpired" "HITExpired", "AssignmentAbandoned" "AssignmentAbandoned", :assignment-submitted "AssignmentSubmitted", :assignment-abandoned "AssignmentAbandoned", "AssignmentReturned" "AssignmentReturned", :hit-expired "HITExpired", "HITCreated" "HITCreated", :hit-disposed "HITDisposed", "AssignmentRejected" "AssignmentRejected", :assignment-accepted "AssignmentAccepted", :hit-reviewable "HITReviewable", :hit-created "HITCreated", "AssignmentSubmitted" "AssignmentSubmitted", :assignment-rejected "AssignmentRejected", "AssignmentApproved" "AssignmentApproved", :assignment-approved "AssignmentApproved", "HITReviewable" "HITReviewable", "Ping" "Ping", :assignment-returned "AssignmentReturned", "HITExtended" "HITExtended", "HITDisposed" "HITDisposed", :hit-extended "HITExtended"} input), :shape "EventType"})

(clojure.core/defn- ser-policy-parameter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-parameter coll) #:http.request.field{:shape "PolicyParameter"}))) input), :shape "PolicyParameterList", :type "list"})

(clojure.core/defn- ser-hit-layout-parameter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "HITLayoutParameter", :type "structure"}))

(clojure.core/defn- ser-review-policy-level-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-review-policy-level coll) #:http.request.field{:shape "ReviewPolicyLevel"}))) input), :shape "ReviewPolicyLevelList", :type "list"})

(clojure.core/defn- ser-policy-parameter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PolicyParameter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :values)) #:http.request.field{:name "Values", :shape "StringList"})) (clojure.core/contains? input :map-entries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-map-entry-list (input :map-entries)) #:http.request.field{:name "MapEntries", :shape "ParameterMapEntryList"}))))

(clojure.core/defn- ser-currency-amount [input] #:http.request.field{:value input, :shape "CurrencyAmount"})

(clojure.core/defn- ser-parameter-map-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterMapEntry", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :values)) #:http.request.field{:name "Values", :shape "StringList"}))))

(clojure.core/defn- ser-qualification-type-status [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "Inactive" "Inactive", :inactive "Inactive"} input), :shape "QualificationTypeStatus"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-idempotency-token [input] #:http.request.field{:value input, :shape "IdempotencyToken"})

(clojure.core/defn- ser-hit-layout-parameter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hit-layout-parameter coll) #:http.request.field{:shape "HITLayoutParameter"}))) input), :shape "HITLayoutParameterList", :type "list"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-hit-access-actions [input] #:http.request.field{:value (clojure.core/get {"Accept" "Accept", :accept "Accept", "PreviewAndAccept" "PreviewAndAccept", :preview-and-accept "PreviewAndAccept", "DiscoverPreviewAndAccept" "DiscoverPreviewAndAccept", :discover-preview-and-accept "DiscoverPreviewAndAccept"} input), :shape "HITAccessActions"})

(clojure.core/defn- ser-notification-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:destination input)) #:http.request.field{:name "Destination", :shape "String"}) (clojure.core/into (ser-notification-transport (:transport input)) #:http.request.field{:name "Transport", :shape "NotificationTransport"}) (clojure.core/into (ser-string (:version input)) #:http.request.field{:name "Version", :shape "String"}) (clojure.core/into (ser-event-type-list (:event-types input)) #:http.request.field{:name "EventTypes", :shape "EventTypeList"})], :shape "NotificationSpecification", :type "structure"}))

(clojure.core/defn- ser-entity-id [input] #:http.request.field{:value input, :shape "EntityId"})

(clojure.core/defn- ser-customer-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-customer-id coll) #:http.request.field{:shape "CustomerId"}))) input), :shape "CustomerIdList", :type "list"})

(clojure.core/defn- ser-qualification-status [input] #:http.request.field{:value (clojure.core/get {"Granted" "Granted", :granted "Granted", "Revoked" "Revoked", :revoked "Revoked"} input), :shape "QualificationStatus"})

(clojure.core/defn- ser-qualification-requirement [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:qualification-type-id input)) #:http.request.field{:name "QualificationTypeId", :shape "String"}) (clojure.core/into (ser-comparator (:comparator input)) #:http.request.field{:name "Comparator", :shape "Comparator"})], :shape "QualificationRequirement", :type "structure"} (clojure.core/contains? input :integer-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-list (input :integer-values)) #:http.request.field{:name "IntegerValues", :shape "IntegerList"})) (clojure.core/contains? input :locale-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale-list (input :locale-values)) #:http.request.field{:name "LocaleValues", :shape "LocaleList"})) (clojure.core/contains? input :required-to-preview) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :required-to-preview)) #:http.request.field{:name "RequiredToPreview", :shape "Boolean", :deprecated true})) (clojure.core/contains? input :actions-guarded) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hit-access-actions (input :actions-guarded)) #:http.request.field{:name "ActionsGuarded", :shape "HITAccessActions"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-assignment-status-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-assignment-status coll) #:http.request.field{:shape "AssignmentStatus"}))) input), :shape "AssignmentStatusList", :type "list"})

(clojure.core/defn- req-get-assignment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"})]}))

(clojure.core/defn- req-update-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]} (clojure.core/contains? input :test-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :test-duration-in-seconds)) #:http.request.field{:name "TestDurationInSeconds", :shape "Long"})) (clojure.core/contains? input :test) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :test)) #:http.request.field{:name "Test", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})) (clojure.core/contains? input :qualification-type-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualification-type-status (input :qualification-type-status)) #:http.request.field{:name "QualificationTypeStatus", :shape "QualificationTypeStatus"})) (clojure.core/contains? input :retry-delay-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :retry-delay-in-seconds)) #:http.request.field{:name "RetryDelayInSeconds", :shape "Long"})) (clojure.core/contains? input :auto-granted-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :auto-granted-value)) #:http.request.field{:name "AutoGrantedValue", :shape "Integer"})) (clojure.core/contains? input :answer-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :answer-key)) #:http.request.field{:name "AnswerKey", :shape "String"})) (clojure.core/contains? input :auto-granted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-granted)) #:http.request.field{:name "AutoGranted", :shape "Boolean"}))))

(clojure.core/defn- req-get-account-balance-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]}))

(clojure.core/defn- req-get-file-upload-url-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"}) (clojure.core/into (ser-string (input :question-identifier)) #:http.request.field{:name "QuestionIdentifier", :shape "String"})]}))

(clojure.core/defn- req-get-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})]}))

(clojure.core/defn- req-list-hi-ts-for-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-create-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}) (clojure.core/into (ser-qualification-type-status (input :qualification-type-status)) #:http.request.field{:name "QualificationTypeStatus", :shape "QualificationTypeStatus"})]} (clojure.core/contains? input :test-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :test-duration-in-seconds)) #:http.request.field{:name "TestDurationInSeconds", :shape "Long"})) (clojure.core/contains? input :test) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :test)) #:http.request.field{:name "Test", :shape "String"})) (clojure.core/contains? input :retry-delay-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :retry-delay-in-seconds)) #:http.request.field{:name "RetryDelayInSeconds", :shape "Long"})) (clojure.core/contains? input :auto-granted-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :auto-granted-value)) #:http.request.field{:name "AutoGrantedValue", :shape "Integer"})) (clojure.core/contains? input :keywords) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :keywords)) #:http.request.field{:name "Keywords", :shape "String"})) (clojure.core/contains? input :answer-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :answer-key)) #:http.request.field{:name "AnswerKey", :shape "String"})) (clojure.core/contains? input :auto-granted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :auto-granted)) #:http.request.field{:name "AutoGranted", :shape "Boolean"}))))

(clojure.core/defn- req-update-hit-type-of-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"}) (clojure.core/into (ser-entity-id (input :hit-type-id)) #:http.request.field{:name "HITTypeId", :shape "EntityId"})]}))

(clojure.core/defn- req-get-qualification-score-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"}) (clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"})]}))

(clojure.core/defn- req-notify-workers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :subject)) #:http.request.field{:name "Subject", :shape "String"}) (clojure.core/into (ser-string (input :message-text)) #:http.request.field{:name "MessageText", :shape "String"}) (clojure.core/into (ser-customer-id-list (input :worker-ids)) #:http.request.field{:name "WorkerIds", :shape "CustomerIdList"})]}))

(clojure.core/defn- req-send-bonus-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"}) (clojure.core/into (ser-currency-amount (input :bonus-amount)) #:http.request.field{:name "BonusAmount", :shape "CurrencyAmount"}) (clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "Reason", :shape "String"})]} (clojure.core/contains? input :unique-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :unique-request-token)) #:http.request.field{:name "UniqueRequestToken", :shape "IdempotencyToken"}))))

(clojure.core/defn- req-associate-qualification-with-worker-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"}) (clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"})]} (clojure.core/contains? input :integer-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :integer-value)) #:http.request.field{:name "IntegerValue", :shape "Integer"})) (clojure.core/contains? input :send-notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :send-notification)) #:http.request.field{:name "SendNotification", :shape "Boolean"}))))

(clojure.core/defn- req-update-hit-review-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})]} (clojure.core/contains? input :revert) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :revert)) #:http.request.field{:name "Revert", :shape "Boolean"}))))

(clojure.core/defn- req-update-expiration-for-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"}) (clojure.core/into (ser-timestamp (input :expire-at)) #:http.request.field{:name "ExpireAt", :shape "Timestamp"})]}))

(clojure.core/defn- req-create-additional-assignments-for-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"}) (clojure.core/into (ser-integer (input :number-of-additional-assignments)) #:http.request.field{:name "NumberOfAdditionalAssignments", :shape "Integer"})]} (clojure.core/contains? input :unique-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :unique-request-token)) #:http.request.field{:name "UniqueRequestToken", :shape "IdempotencyToken"}))))

(clojure.core/defn- req-create-worker-block-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "Reason", :shape "String"})]}))

(clojure.core/defn- req-create-hit-with-hit-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-type-id)) #:http.request.field{:name "HITTypeId", :shape "EntityId"}) (clojure.core/into (ser-long (input :lifetime-in-seconds)) #:http.request.field{:name "LifetimeInSeconds", :shape "Long"})]} (clojure.core/contains? input :unique-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :unique-request-token)) #:http.request.field{:name "UniqueRequestToken", :shape "IdempotencyToken"})) (clojure.core/contains? input :hit-review-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-review-policy (input :hit-review-policy)) #:http.request.field{:name "HITReviewPolicy", :shape "ReviewPolicy"})) (clojure.core/contains? input :question) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :question)) #:http.request.field{:name "Question", :shape "String"})) (clojure.core/contains? input :hit-layout-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hit-layout-parameter-list (input :hit-layout-parameters)) #:http.request.field{:name "HITLayoutParameters", :shape "HITLayoutParameterList"})) (clojure.core/contains? input :hit-layout-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :hit-layout-id)) #:http.request.field{:name "HITLayoutId", :shape "EntityId"})) (clojure.core/contains? input :max-assignments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-assignments)) #:http.request.field{:name "MaxAssignments", :shape "Integer"})) (clojure.core/contains? input :assignment-review-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-review-policy (input :assignment-review-policy)) #:http.request.field{:name "AssignmentReviewPolicy", :shape "ReviewPolicy"})) (clojure.core/contains? input :requester-annotation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :requester-annotation)) #:http.request.field{:name "RequesterAnnotation", :shape "String"}))))

(clojure.core/defn- req-send-test-event-notification-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notification-specification (input :notification)) #:http.request.field{:name "Notification", :shape "NotificationSpecification"}) (clojure.core/into (ser-event-type (input :test-event-type)) #:http.request.field{:name "TestEventType", :shape "EventType"})]}))

(clojure.core/defn- req-list-assignments-for-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"})) (clojure.core/contains? input :assignment-statuses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assignment-status-list (input :assignment-statuses)) #:http.request.field{:name "AssignmentStatuses", :shape "AssignmentStatusList"}))))

(clojure.core/defn- req-reject-qualification-request-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :qualification-request-id)) #:http.request.field{:name "QualificationRequestId", :shape "String"})]} (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "Reason", :shape "String"}))))

(clojure.core/defn- req-list-hi-ts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-update-notification-settings-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-type-id)) #:http.request.field{:name "HITTypeId", :shape "EntityId"})]} (clojure.core/contains? input :notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-specification (input :notification)) #:http.request.field{:name "Notification", :shape "NotificationSpecification"})) (clojure.core/contains? input :active) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :active)) #:http.request.field{:name "Active", :shape "Boolean"}))))

(clojure.core/defn- req-disassociate-qualification-from-worker-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"}) (clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]} (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "Reason", :shape "String"}))))

(clojure.core/defn- req-list-reviewable-hi-ts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hit-type-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :hit-type-id)) #:http.request.field{:name "HITTypeId", :shape "EntityId"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-reviewable-hit-status (input :status)) #:http.request.field{:name "Status", :shape "ReviewableHITStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-create-hit-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-long (input :assignment-duration-in-seconds)) #:http.request.field{:name "AssignmentDurationInSeconds", :shape "Long"}) (clojure.core/into (ser-currency-amount (input :reward)) #:http.request.field{:name "Reward", :shape "CurrencyAmount"}) (clojure.core/into (ser-string (input :title)) #:http.request.field{:name "Title", :shape "String"}) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})]} (clojure.core/contains? input :auto-approval-delay-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :auto-approval-delay-in-seconds)) #:http.request.field{:name "AutoApprovalDelayInSeconds", :shape "Long"})) (clojure.core/contains? input :keywords) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :keywords)) #:http.request.field{:name "Keywords", :shape "String"})) (clojure.core/contains? input :qualification-requirements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualification-requirement-list (input :qualification-requirements)) #:http.request.field{:name "QualificationRequirements", :shape "QualificationRequirementList"}))))

(clojure.core/defn- req-list-worker-blocks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-approve-assignment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"})]} (clojure.core/contains? input :requester-feedback) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :requester-feedback)) #:http.request.field{:name "RequesterFeedback", :shape "String"})) (clojure.core/contains? input :override-rejection) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :override-rejection)) #:http.request.field{:name "OverrideRejection", :shape "Boolean"}))))

(clojure.core/defn- req-delete-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})]}))

(clojure.core/defn- req-delete-worker-block-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-customer-id (input :worker-id)) #:http.request.field{:name "WorkerId", :shape "CustomerId"})]} (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "Reason", :shape "String"}))))

(clojure.core/defn- req-create-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-long (input :lifetime-in-seconds)) #:http.request.field{:name "LifetimeInSeconds", :shape "Long"}) (clojure.core/into (ser-long (input :assignment-duration-in-seconds)) #:http.request.field{:name "AssignmentDurationInSeconds", :shape "Long"}) (clojure.core/into (ser-currency-amount (input :reward)) #:http.request.field{:name "Reward", :shape "CurrencyAmount"}) (clojure.core/into (ser-string (input :title)) #:http.request.field{:name "Title", :shape "String"}) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"})]} (clojure.core/contains? input :unique-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-idempotency-token (input :unique-request-token)) #:http.request.field{:name "UniqueRequestToken", :shape "IdempotencyToken"})) (clojure.core/contains? input :auto-approval-delay-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :auto-approval-delay-in-seconds)) #:http.request.field{:name "AutoApprovalDelayInSeconds", :shape "Long"})) (clojure.core/contains? input :hit-review-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-review-policy (input :hit-review-policy)) #:http.request.field{:name "HITReviewPolicy", :shape "ReviewPolicy"})) (clojure.core/contains? input :question) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :question)) #:http.request.field{:name "Question", :shape "String"})) (clojure.core/contains? input :hit-layout-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hit-layout-parameter-list (input :hit-layout-parameters)) #:http.request.field{:name "HITLayoutParameters", :shape "HITLayoutParameterList"})) (clojure.core/contains? input :hit-layout-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :hit-layout-id)) #:http.request.field{:name "HITLayoutId", :shape "EntityId"})) (clojure.core/contains? input :keywords) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :keywords)) #:http.request.field{:name "Keywords", :shape "String"})) (clojure.core/contains? input :max-assignments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-assignments)) #:http.request.field{:name "MaxAssignments", :shape "Integer"})) (clojure.core/contains? input :assignment-review-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-review-policy (input :assignment-review-policy)) #:http.request.field{:name "AssignmentReviewPolicy", :shape "ReviewPolicy"})) (clojure.core/contains? input :qualification-requirements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualification-requirement-list (input :qualification-requirements)) #:http.request.field{:name "QualificationRequirements", :shape "QualificationRequirementList"})) (clojure.core/contains? input :requester-annotation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :requester-annotation)) #:http.request.field{:name "RequesterAnnotation", :shape "String"}))))

(clojure.core/defn- req-reject-assignment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"}) (clojure.core/into (ser-string (input :requester-feedback)) #:http.request.field{:name "RequesterFeedback", :shape "String"})]}))

(clojure.core/defn- req-list-review-policy-results-for-hit-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})]} (clojure.core/contains? input :policy-levels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-review-policy-level-list (input :policy-levels)) #:http.request.field{:name "PolicyLevels", :shape "ReviewPolicyLevelList"})) (clojure.core/contains? input :retrieve-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :retrieve-actions)) #:http.request.field{:name "RetrieveActions", :shape "Boolean"})) (clojure.core/contains? input :retrieve-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :retrieve-results)) #:http.request.field{:name "RetrieveResults", :shape "Boolean"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-list-workers-with-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualification-status (input :status)) #:http.request.field{:name "Status", :shape "QualificationStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-list-bonus-payments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hit-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :hit-id)) #:http.request.field{:name "HITId", :shape "EntityId"})) (clojure.core/contains? input :assignment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :assignment-id)) #:http.request.field{:name "AssignmentId", :shape "EntityId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-get-qualification-type-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})]}))

(clojure.core/defn- req-list-qualification-types-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-boolean (input :must-be-requestable)) #:http.request.field{:name "MustBeRequestable", :shape "Boolean"})]} (clojure.core/contains? input :query) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :query)) #:http.request.field{:name "Query", :shape "String"})) (clojure.core/contains? input :must-be-owned-by-caller) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :must-be-owned-by-caller)) #:http.request.field{:name "MustBeOwnedByCaller", :shape "Boolean"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/defn- req-accept-qualification-request-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :qualification-request-id)) #:http.request.field{:name "QualificationRequestId", :shape "String"})]} (clojure.core/contains? input :integer-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :integer-value)) #:http.request.field{:name "IntegerValue", :shape "Integer"}))))

(clojure.core/defn- req-list-qualification-requests-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :qualification-type-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-id (input :qualification-type-id)) #:http.request.field{:name "QualificationTypeId", :shape "EntityId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-result-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ResultSize"}))))

(clojure.core/declare deser-qualification-request-list)

(clojure.core/declare deser-qualification-requirement-list)

(clojure.core/declare deser-review-report)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-locale-list)

(clojure.core/declare deser-review-policy)

(clojure.core/declare deser-integer-list)

(clojure.core/declare deser-comparator)

(clojure.core/declare deser-hit-review-status)

(clojure.core/declare deser-qualification)

(clojure.core/declare deser-country-parameters)

(clojure.core/declare deser-qualification-list)

(clojure.core/declare deser-bonus-payment-list)

(clojure.core/declare deser-customer-id)

(clojure.core/declare deser-locale)

(clojure.core/declare deser-assignment-status)

(clojure.core/declare deser-notify-workers-failure-status)

(clojure.core/declare deser-hit-list)

(clojure.core/declare deser-review-action-detail)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-notify-workers-failure-status-list)

(clojure.core/declare deser-parameter-map-entry-list)

(clojure.core/declare deser-worker-block)

(clojure.core/declare deser-policy-parameter-list)

(clojure.core/declare deser-qualification-type)

(clojure.core/declare deser-assignment)

(clojure.core/declare deser-policy-parameter)

(clojure.core/declare deser-worker-block-list)

(clojure.core/declare deser-turk-error-code)

(clojure.core/declare deser-currency-amount)

(clojure.core/declare deser-parameter-map-entry)

(clojure.core/declare deser-assignment-list)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-qualification-type-status)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-review-action-detail-list)

(clojure.core/declare deser-bonus-payment)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-qualification-request)

(clojure.core/declare deser-hit-access-actions)

(clojure.core/declare deser-notify-workers-failure-code)

(clojure.core/declare deser-entity-id)

(clojure.core/declare deser-review-result-detail-list)

(clojure.core/declare deser-review-result-detail)

(clojure.core/declare deser-qualification-type-list)

(clojure.core/declare deser-qualification-status)

(clojure.core/declare deser-qualification-requirement)

(clojure.core/declare deser-review-action-status)

(clojure.core/declare deser-hit-status)

(clojure.core/declare deser-hit)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-qualification-request-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-qualification-request coll))) input))

(clojure.core/defn- deser-qualification-requirement-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-qualification-requirement coll))) input))

(clojure.core/defn- deser-review-report [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReviewResults") (clojure.core/assoc :review-results (deser-review-result-detail-list (input "ReviewResults"))) (clojure.core/contains? input "ReviewActions") (clojure.core/assoc :review-actions (deser-review-action-detail-list (input "ReviewActions")))))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-locale-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-locale coll))) input))

(clojure.core/defn- deser-review-policy [input] (clojure.core/cond-> {:policy-name (deser-string (input "PolicyName"))} (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-policy-parameter-list (input "Parameters")))))

(clojure.core/defn- deser-integer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer coll))) input))

(clojure.core/defn- deser-comparator [input] (clojure.core/get {"Exists" :exists, "GreaterThanOrEqualTo" :greater-than-or-equal-to, "In" :in, "LessThan" :less-than, "LessThanOrEqualTo" :less-than-or-equal-to, "DoesNotExist" :does-not-exist, "EqualTo" :equal-to, "GreaterThan" :greater-than, "NotEqualTo" :not-equal-to, "NotIn" :not-in} input))

(clojure.core/defn- deser-hit-review-status [input] (clojure.core/get {"NotReviewed" :not-reviewed, "MarkedForReview" :marked-for-review, "ReviewedAppropriate" :reviewed-appropriate, "ReviewedInappropriate" :reviewed-inappropriate} input))

(clojure.core/defn- deser-qualification [input] (clojure.core/cond-> {} (clojure.core/contains? input "QualificationTypeId") (clojure.core/assoc :qualification-type-id (deser-entity-id (input "QualificationTypeId"))) (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId"))) (clojure.core/contains? input "GrantTime") (clojure.core/assoc :grant-time (deser-timestamp (input "GrantTime"))) (clojure.core/contains? input "IntegerValue") (clojure.core/assoc :integer-value (deser-integer (input "IntegerValue"))) (clojure.core/contains? input "LocaleValue") (clojure.core/assoc :locale-value (deser-locale (input "LocaleValue"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-qualification-status (input "Status")))))

(clojure.core/defn- deser-country-parameters [input] input)

(clojure.core/defn- deser-qualification-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-qualification coll))) input))

(clojure.core/defn- deser-bonus-payment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bonus-payment coll))) input))

(clojure.core/defn- deser-customer-id [input] input)

(clojure.core/defn- deser-locale [input] (clojure.core/cond-> {:country (deser-country-parameters (input "Country"))} (clojure.core/contains? input "Subdivision") (clojure.core/assoc :subdivision (deser-country-parameters (input "Subdivision")))))

(clojure.core/defn- deser-assignment-status [input] (clojure.core/get {"Submitted" :submitted, "Approved" :approved, "Rejected" :rejected} input))

(clojure.core/defn- deser-notify-workers-failure-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotifyWorkersFailureCode") (clojure.core/assoc :notify-workers-failure-code (deser-notify-workers-failure-code (input "NotifyWorkersFailureCode"))) (clojure.core/contains? input "NotifyWorkersFailureMessage") (clojure.core/assoc :notify-workers-failure-message (deser-string (input "NotifyWorkersFailureMessage"))) (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId")))))

(clojure.core/defn- deser-hit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hit coll))) input))

(clojure.core/defn- deser-review-action-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ActionId") (clojure.core/assoc :action-id (deser-entity-id (input "ActionId"))) (clojure.core/contains? input "ActionName") (clojure.core/assoc :action-name (deser-string (input "ActionName"))) (clojure.core/contains? input "TargetId") (clojure.core/assoc :target-id (deser-entity-id (input "TargetId"))) (clojure.core/contains? input "TargetType") (clojure.core/assoc :target-type (deser-string (input "TargetType"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-review-action-status (input "Status"))) (clojure.core/contains? input "CompleteTime") (clojure.core/assoc :complete-time (deser-timestamp (input "CompleteTime"))) (clojure.core/contains? input "Result") (clojure.core/assoc :result (deser-string (input "Result"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode")))))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-notify-workers-failure-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notify-workers-failure-status coll))) input))

(clojure.core/defn- deser-parameter-map-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter-map-entry coll))) input))

(clojure.core/defn- deser-worker-block [input] (clojure.core/cond-> {} (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId"))) (clojure.core/contains? input "Reason") (clojure.core/assoc :reason (deser-string (input "Reason")))))

(clojure.core/defn- deser-policy-parameter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-parameter coll))) input))

(clojure.core/defn- deser-qualification-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "IsRequestable") (clojure.core/assoc :is-requestable (deser-boolean (input "IsRequestable"))) (clojure.core/contains? input "TestDurationInSeconds") (clojure.core/assoc :test-duration-in-seconds (deser-long (input "TestDurationInSeconds"))) (clojure.core/contains? input "Test") (clojure.core/assoc :test (deser-string (input "Test"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "QualificationTypeStatus") (clojure.core/assoc :qualification-type-status (deser-qualification-type-status (input "QualificationTypeStatus"))) (clojure.core/contains? input "RetryDelayInSeconds") (clojure.core/assoc :retry-delay-in-seconds (deser-long (input "RetryDelayInSeconds"))) (clojure.core/contains? input "AutoGrantedValue") (clojure.core/assoc :auto-granted-value (deser-integer (input "AutoGrantedValue"))) (clojure.core/contains? input "Keywords") (clojure.core/assoc :keywords (deser-string (input "Keywords"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "AnswerKey") (clojure.core/assoc :answer-key (deser-string (input "AnswerKey"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "AutoGranted") (clojure.core/assoc :auto-granted (deser-boolean (input "AutoGranted"))) (clojure.core/contains? input "QualificationTypeId") (clojure.core/assoc :qualification-type-id (deser-entity-id (input "QualificationTypeId")))))

(clojure.core/defn- deser-assignment [input] (clojure.core/cond-> {} (clojure.core/contains? input "Deadline") (clojure.core/assoc :deadline (deser-timestamp (input "Deadline"))) (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId"))) (clojure.core/contains? input "AssignmentStatus") (clojure.core/assoc :assignment-status (deser-assignment-status (input "AssignmentStatus"))) (clojure.core/contains? input "HITId") (clojure.core/assoc :hit-id (deser-entity-id (input "HITId"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime"))) (clojure.core/contains? input "ApprovalTime") (clojure.core/assoc :approval-time (deser-timestamp (input "ApprovalTime"))) (clojure.core/contains? input "AutoApprovalTime") (clojure.core/assoc :auto-approval-time (deser-timestamp (input "AutoApprovalTime"))) (clojure.core/contains? input "RequesterFeedback") (clojure.core/assoc :requester-feedback (deser-string (input "RequesterFeedback"))) (clojure.core/contains? input "AssignmentId") (clojure.core/assoc :assignment-id (deser-entity-id (input "AssignmentId"))) (clojure.core/contains? input "AcceptTime") (clojure.core/assoc :accept-time (deser-timestamp (input "AcceptTime"))) (clojure.core/contains? input "RejectionTime") (clojure.core/assoc :rejection-time (deser-timestamp (input "RejectionTime"))) (clojure.core/contains? input "Answer") (clojure.core/assoc :answer (deser-string (input "Answer")))))

(clojure.core/defn- deser-policy-parameter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-string-list (input "Values"))) (clojure.core/contains? input "MapEntries") (clojure.core/assoc :map-entries (deser-parameter-map-entry-list (input "MapEntries")))))

(clojure.core/defn- deser-worker-block-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-worker-block coll))) input))

(clojure.core/defn- deser-turk-error-code [input] input)

(clojure.core/defn- deser-currency-amount [input] input)

(clojure.core/defn- deser-parameter-map-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-string-list (input "Values")))))

(clojure.core/defn- deser-assignment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-assignment coll))) input))

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-qualification-type-status [input] (clojure.core/get {"Active" :active, "Inactive" :inactive} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-review-action-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-review-action-detail coll))) input))

(clojure.core/defn- deser-bonus-payment [input] (clojure.core/cond-> {} (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId"))) (clojure.core/contains? input "BonusAmount") (clojure.core/assoc :bonus-amount (deser-currency-amount (input "BonusAmount"))) (clojure.core/contains? input "AssignmentId") (clojure.core/assoc :assignment-id (deser-entity-id (input "AssignmentId"))) (clojure.core/contains? input "Reason") (clojure.core/assoc :reason (deser-string (input "Reason"))) (clojure.core/contains? input "GrantTime") (clojure.core/assoc :grant-time (deser-timestamp (input "GrantTime")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-qualification-request [input] (clojure.core/cond-> {} (clojure.core/contains? input "QualificationRequestId") (clojure.core/assoc :qualification-request-id (deser-string (input "QualificationRequestId"))) (clojure.core/contains? input "QualificationTypeId") (clojure.core/assoc :qualification-type-id (deser-entity-id (input "QualificationTypeId"))) (clojure.core/contains? input "WorkerId") (clojure.core/assoc :worker-id (deser-customer-id (input "WorkerId"))) (clojure.core/contains? input "Test") (clojure.core/assoc :test (deser-string (input "Test"))) (clojure.core/contains? input "Answer") (clojure.core/assoc :answer (deser-string (input "Answer"))) (clojure.core/contains? input "SubmitTime") (clojure.core/assoc :submit-time (deser-timestamp (input "SubmitTime")))))

(clojure.core/defn- deser-hit-access-actions [input] (clojure.core/get {"Accept" :accept, "PreviewAndAccept" :preview-and-accept, "DiscoverPreviewAndAccept" :discover-preview-and-accept} input))

(clojure.core/defn- deser-notify-workers-failure-code [input] (clojure.core/get {"SoftFailure" :soft-failure, "HardFailure" :hard-failure} input))

(clojure.core/defn- deser-entity-id [input] input)

(clojure.core/defn- deser-review-result-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-review-result-detail coll))) input))

(clojure.core/defn- deser-review-result-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ActionId") (clojure.core/assoc :action-id (deser-entity-id (input "ActionId"))) (clojure.core/contains? input "SubjectId") (clojure.core/assoc :subject-id (deser-entity-id (input "SubjectId"))) (clojure.core/contains? input "SubjectType") (clojure.core/assoc :subject-type (deser-string (input "SubjectType"))) (clojure.core/contains? input "QuestionId") (clojure.core/assoc :question-id (deser-entity-id (input "QuestionId"))) (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-qualification-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-qualification-type coll))) input))

(clojure.core/defn- deser-qualification-status [input] (clojure.core/get {"Granted" :granted, "Revoked" :revoked} input))

(clojure.core/defn- deser-qualification-requirement [input] (clojure.core/cond-> {:qualification-type-id (deser-string (input "QualificationTypeId")), :comparator (deser-comparator (input "Comparator"))} (clojure.core/contains? input "IntegerValues") (clojure.core/assoc :integer-values (deser-integer-list (input "IntegerValues"))) (clojure.core/contains? input "LocaleValues") (clojure.core/assoc :locale-values (deser-locale-list (input "LocaleValues"))) (clojure.core/contains? input "RequiredToPreview") (clojure.core/assoc :required-to-preview (deser-boolean (input "RequiredToPreview"))) (clojure.core/contains? input "ActionsGuarded") (clojure.core/assoc :actions-guarded (deser-hit-access-actions (input "ActionsGuarded")))))

(clojure.core/defn- deser-review-action-status [input] (clojure.core/get {"Intended" :intended, "Succeeded" :succeeded, "Failed" :failed, "Cancelled" :cancelled} input))

(clojure.core/defn- deser-hit-status [input] (clojure.core/get {"Assignable" :assignable, "Unassignable" :unassignable, "Reviewable" :reviewable, "Reviewing" :reviewing, "Disposed" :disposed} input))

(clojure.core/defn- deser-hit [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumberOfAssignmentsAvailable") (clojure.core/assoc :number-of-assignments-available (deser-integer (input "NumberOfAssignmentsAvailable"))) (clojure.core/contains? input "NumberOfAssignmentsPending") (clojure.core/assoc :number-of-assignments-pending (deser-integer (input "NumberOfAssignmentsPending"))) (clojure.core/contains? input "AutoApprovalDelayInSeconds") (clojure.core/assoc :auto-approval-delay-in-seconds (deser-long (input "AutoApprovalDelayInSeconds"))) (clojure.core/contains? input "Reward") (clojure.core/assoc :reward (deser-currency-amount (input "Reward"))) (clojure.core/contains? input "HITReviewStatus") (clojure.core/assoc :hit-review-status (deser-hit-review-status (input "HITReviewStatus"))) (clojure.core/contains? input "Title") (clojure.core/assoc :title (deser-string (input "Title"))) (clojure.core/contains? input "HITId") (clojure.core/assoc :hit-id (deser-entity-id (input "HITId"))) (clojure.core/contains? input "AssignmentDurationInSeconds") (clojure.core/assoc :assignment-duration-in-seconds (deser-long (input "AssignmentDurationInSeconds"))) (clojure.core/contains? input "Question") (clojure.core/assoc :question (deser-string (input "Question"))) (clojure.core/contains? input "HITLayoutId") (clojure.core/assoc :hit-layout-id (deser-entity-id (input "HITLayoutId"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description"))) (clojure.core/contains? input "Keywords") (clojure.core/assoc :keywords (deser-string (input "Keywords"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "MaxAssignments") (clojure.core/assoc :max-assignments (deser-integer (input "MaxAssignments"))) (clojure.core/contains? input "HITGroupId") (clojure.core/assoc :hit-group-id (deser-entity-id (input "HITGroupId"))) (clojure.core/contains? input "QualificationRequirements") (clojure.core/assoc :qualification-requirements (deser-qualification-requirement-list (input "QualificationRequirements"))) (clojure.core/contains? input "HITTypeId") (clojure.core/assoc :hit-type-id (deser-entity-id (input "HITTypeId"))) (clojure.core/contains? input "NumberOfAssignmentsCompleted") (clojure.core/assoc :number-of-assignments-completed (deser-integer (input "NumberOfAssignmentsCompleted"))) (clojure.core/contains? input "HITStatus") (clojure.core/assoc :hit-status (deser-hit-status (input "HITStatus"))) (clojure.core/contains? input "Expiration") (clojure.core/assoc :expiration (deser-timestamp (input "Expiration"))) (clojure.core/contains? input "RequesterAnnotation") (clojure.core/assoc :requester-annotation (deser-string (input "RequesterAnnotation")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-list-bonus-payments-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "BonusPayments") (clojure.core/assoc :bonus-payments (deser-bonus-payment-list (input "BonusPayments")))))

(clojure.core/defn- deser-associate-qualification-with-worker-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-worker-block-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-hi-ts-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "HITs") (clojure.core/assoc :hi-ts (deser-hit-list (input "HITs")))))

(clojure.core/defn- deser-disassociate-qualification-from-worker-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-hit-with-hit-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "HIT") (clojure.core/assoc :hit (deser-hit (input "HIT")))))

(clojure.core/defn- deser-delete-worker-block-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-qualification-types-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "QualificationTypes") (clojure.core/assoc :qualification-types (deser-qualification-type-list (input "QualificationTypes")))))

(clojure.core/defn- deser-update-expiration-for-hit-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-reviewable-hi-ts-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "HITs") (clojure.core/assoc :hi-ts (deser-hit-list (input "HITs")))))

(clojure.core/defn- deser-get-account-balance-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AvailableBalance") (clojure.core/assoc :available-balance (deser-currency-amount (input "AvailableBalance"))) (clojure.core/contains? input "OnHoldBalance") (clojure.core/assoc :on-hold-balance (deser-currency-amount (input "OnHoldBalance")))))

(clojure.core/defn- deser-reject-qualification-request-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-delete-hit-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-hit-type-of-hit-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-hit-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "HIT") (clojure.core/assoc :hit (deser-hit (input "HIT")))))

(clojure.core/defn- deser-list-qualification-requests-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "QualificationRequests") (clojure.core/assoc :qualification-requests (deser-qualification-request-list (input "QualificationRequests")))))

(clojure.core/defn- deser-update-notification-settings-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-hit-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "HITTypeId") (clojure.core/assoc :hit-type-id (deser-entity-id (input "HITTypeId")))))

(clojure.core/defn- deser-accept-qualification-request-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-request-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-exception-message (input "Message"))) (clojure.core/contains? input "TurkErrorCode") (clojure.core/assoc :turk-error-code (deser-turk-error-code (input "TurkErrorCode")))))

(clojure.core/defn- deser-list-review-policy-results-for-hit-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "HITId") (clojure.core/assoc :hit-id (deser-entity-id (input "HITId"))) (clojure.core/contains? input "AssignmentReviewPolicy") (clojure.core/assoc :assignment-review-policy (deser-review-policy (input "AssignmentReviewPolicy"))) (clojure.core/contains? input "HITReviewPolicy") (clojure.core/assoc :hit-review-policy (deser-review-policy (input "HITReviewPolicy"))) (clojure.core/contains? input "AssignmentReviewReport") (clojure.core/assoc :assignment-review-report (deser-review-report (input "AssignmentReviewReport"))) (clojure.core/contains? input "HITReviewReport") (clojure.core/assoc :hit-review-report (deser-review-report (input "HITReviewReport"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken")))))

(clojure.core/defn- deser-service-fault [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-exception-message (input "Message"))) (clojure.core/contains? input "TurkErrorCode") (clojure.core/assoc :turk-error-code (deser-turk-error-code (input "TurkErrorCode")))))

(clojure.core/defn- deser-list-worker-blocks-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "WorkerBlocks") (clojure.core/assoc :worker-blocks (deser-worker-block-list (input "WorkerBlocks")))))

(clojure.core/defn- deser-update-qualification-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "QualificationType") (clojure.core/assoc :qualification-type (deser-qualification-type (input "QualificationType")))))

(clojure.core/defn- deser-create-qualification-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "QualificationType") (clojure.core/assoc :qualification-type (deser-qualification-type (input "QualificationType")))))

(clojure.core/defn- deser-get-hit-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "HIT") (clojure.core/assoc :hit (deser-hit (input "HIT")))))

(clojure.core/defn- deser-send-test-event-notification-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-create-additional-assignments-for-hit-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-approve-assignment-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-update-hit-review-status-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-notify-workers-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NotifyWorkersFailureStatuses") (clojure.core/assoc :notify-workers-failure-statuses (deser-notify-workers-failure-status-list (input "NotifyWorkersFailureStatuses")))))

(clojure.core/defn- deser-get-file-upload-url-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "FileUploadURL") (clojure.core/assoc :file-upload-url (deser-string (input "FileUploadURL")))))

(clojure.core/defn- deser-reject-assignment-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-send-bonus-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-qualification-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "QualificationType") (clojure.core/assoc :qualification-type (deser-qualification-type (input "QualificationType")))))

(clojure.core/defn- deser-get-qualification-score-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Qualification") (clojure.core/assoc :qualification (deser-qualification (input "Qualification")))))

(clojure.core/defn- deser-list-assignments-for-hit-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "Assignments") (clojure.core/assoc :assignments (deser-assignment-list (input "Assignments")))))

(clojure.core/defn- deser-list-hi-ts-for-qualification-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "HITs") (clojure.core/assoc :hi-ts (deser-hit-list (input "HITs")))))

(clojure.core/defn- deser-delete-qualification-type-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-get-assignment-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Assignment") (clojure.core/assoc :assignment (deser-assignment (input "Assignment"))) (clojure.core/contains? input "HIT") (clojure.core/assoc :hit (deser-hit (input "HIT")))))

(clojure.core/defn- deser-list-workers-with-qualification-type-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (input "NextToken"))) (clojure.core/contains? input "NumResults") (clojure.core/assoc :num-results (deser-integer (input "NumResults"))) (clojure.core/contains? input "Qualifications") (clojure.core/assoc :qualifications (deser-qualification-list (input "Qualifications")))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/bonus-payments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/bonus-payment-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-response/bonus-payments]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-request-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/qualification-request))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-report/review-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-result-detail-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-report/review-actions (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-action-detail-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.review-report/review-results :portkey.aws.mturk-requester.-2017-01-17.review-report/review-actions]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/string-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/string))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/locale-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/locale))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-policy/policy-name (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-policy/parameters (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/policy-parameter-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.review-policy/policy-name] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.review-policy/parameters]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/reviewable-hit-status #{"Reviewable" :reviewing "Reviewing" :reviewable})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/hi-ts (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-response/hi-ts]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/integer-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/integer))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/comparator #{:exists :less-than "Exists" "GreaterThanOrEqualTo" "In" "LessThan" :greater-than :not-equal-to "LessThanOrEqualTo" :equal-to "DoesNotExist" "EqualTo" "GreaterThan" :greater-than-or-equal-to "NotEqualTo" :less-than-or-equal-to :not-in :does-not-exist "NotIn" :in})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/hit]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-assignment-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-assignment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.get-assignment-request/assignment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/test-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/test (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/retry-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/auto-granted-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/answer-key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/auto-granted (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/qualification-type-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/test-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/test :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/description :portkey.aws.mturk-requester.-2017-01-17/qualification-type-status :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/retry-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/auto-granted-value :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/answer-key :portkey.aws.mturk-requester.-2017-01-17.update-qualification-type-request/auto-granted]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-review-status #{:reviewed-appropriate "MarkedForReview" "ReviewedAppropriate" "NotReviewed" :reviewed-inappropriate "ReviewedInappropriate" :not-reviewed :marked-for-review})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/grant-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/integer-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/locale-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/locale))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification/status (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-status))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.qualification/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17.qualification/worker-id :portkey.aws.mturk-requester.-2017-01-17.qualification/grant-time :portkey.aws.mturk-requester.-2017-01-17.qualification/integer-value :portkey.aws.mturk-requester.-2017-01-17.qualification/locale-value :portkey.aws.mturk-requester.-2017-01-17.qualification/status]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/country-parameters (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 2 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/qualification))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/bonus-payment-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/bonus-payment))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/customer-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^A[A-Z0-9]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/qualification-types (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-type-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-response/qualification-types]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/event-type-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/event-type))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.locale/country (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/country-parameters))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.locale/subdivision (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/country-parameters))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/locale (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.locale/country] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.locale/subdivision]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.delete-qualification-type-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.delete-qualification-type-request/qualification-type-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/hi-ts (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-response/hi-ts]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-account-balance-response/available-balance (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-account-balance-response/on-hold-balance (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.get-account-balance-response/available-balance :portkey.aws.mturk-requester.-2017-01-17.get-account-balance-response/on-hold-balance]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-request/question-identifier (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-request/assignment-id :portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-request/question-identifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/assignment-status #{:rejected "Rejected" "Approved" :approved :submitted "Submitted"})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-failure-status/notify-workers-failure-message (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-failure-status/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-code :portkey.aws.mturk-requester.-2017-01-17.notify-workers-failure-status/notify-workers-failure-message :portkey.aws.mturk-requester.-2017-01-17.notify-workers-failure-status/worker-id]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.get-hit-request/hit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/result-size (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/qualification-type-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/test-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/test (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/retry-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/auto-granted-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/keywords (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/answer-key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/name (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/auto-granted (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/name :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/description :portkey.aws.mturk-requester.-2017-01-17/qualification-type-status] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/test-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/test :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/retry-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/auto-granted-value :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/keywords :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/answer-key :portkey.aws.mturk-requester.-2017-01-17.create-qualification-type-request/auto-granted]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/hit))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/action-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/action-name (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/target-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/target-type (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/status (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-action-status))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/complete-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/result (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/error-code (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-action-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.review-action-detail/action-id :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/action-name :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/target-id :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/target-type :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/status :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/complete-time :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/result :portkey.aws.mturk-requester.-2017-01-17.review-action-detail/error-code]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/hit]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-hit-type-of-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-hit-type-of-hit-request/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.update-hit-type-of-hit-request/hit-id :portkey.aws.mturk-requester.-2017-01-17.update-hit-type-of-hit-request/hit-type-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-qualification-score-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-qualification-score-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.get-qualification-score-request/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17.get-qualification-score-request/worker-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/subject (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/message-text (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/worker-ids (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notify-workers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/subject :portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/message-text :portkey.aws.mturk-requester.-2017-01-17.notify-workers-request/worker-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/bonus-amount (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/unique-request-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/send-bonus-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/worker-id :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/bonus-amount :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/assignment-id :portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/reason] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.send-bonus-request/unique-request-token]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/integer-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/send-notification (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/worker-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/integer-value :portkey.aws.mturk-requester.-2017-01-17.associate-qualification-with-worker-request/send-notification]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/qualification-requests (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-request-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-response/qualification-requests]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notification-transport #{:email "Email" :sns :sqs "SNS" "SQS"})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-status-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-status))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-hit-review-status-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-hit-review-status-request/revert (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.update-hit-review-status-request/hit-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.update-hit-review-status-request/revert]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-expiration-for-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-expiration-for-hit-request/expire-at (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.update-expiration-for-hit-request/hit-id :portkey.aws.mturk-requester.-2017-01-17.update-expiration-for-hit-request/expire-at] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/number-of-additional-assignments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/unique-request-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/hit-id :portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/number-of-additional-assignments] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-additional-assignments-for-hit-request/unique-request-token]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/parameter-map-entry-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/parameter-map-entry))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.worker-block/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.worker-block/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/worker-block (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.worker-block/worker-id :portkey.aws.mturk-requester.-2017-01-17.worker-block/reason]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-policy-level #{:hit "Assignment" :assignment "HIT"})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-worker-block-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-worker-block-request/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-worker-block-request/worker-id :portkey.aws.mturk-requester.-2017-01-17.create-worker-block-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/unique-request-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/question (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-layout-parameters (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-layout-parameter-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-layout-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/lifetime-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/max-assignments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/assignment-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/requester-annotation (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-type-id :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/lifetime-in-seconds] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/unique-request-token :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-review-policy :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/question :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-layout-parameters :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/hit-layout-id :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/max-assignments :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/assignment-review-policy :portkey.aws.mturk-requester.-2017-01-17.create-hit-with-hit-type-request/requester-annotation]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-test-event-notification-request/notification (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/notification-specification))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.send-test-event-notification-request/test-event-type (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/event-type))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.send-test-event-notification-request/notification :portkey.aws.mturk-requester.-2017-01-17.send-test-event-notification-request/test-event-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-response/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-type-response/hit-type-id]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/event-type #{"AssignmentAccepted" :ping "HITExpired" "AssignmentAbandoned" :assignment-submitted :assignment-abandoned "AssignmentReturned" :hit-expired "HITCreated" :hit-disposed "AssignmentRejected" :assignment-accepted :hit-reviewable :hit-created "AssignmentSubmitted" :assignment-rejected "AssignmentApproved" :assignment-approved "HITReviewable" "Ping" :assignment-returned "HITExtended" "HITDisposed" :hit-extended})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/assignment-statuses (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/assignment-status-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/hit-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/max-results :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-request/assignment-statuses]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/policy-parameter-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/policy-parameter))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.request-error/message (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/exception-message))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/request-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.request-error/message :portkey.aws.mturk-requester.-2017-01-17/turk-error-code]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/is-requestable (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/test-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/test (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/retry-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/auto-granted-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/keywords (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/creation-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/answer-key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/name (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/auto-granted (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-type/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.qualification-type/is-requestable :portkey.aws.mturk-requester.-2017-01-17.qualification-type/test-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.qualification-type/test :portkey.aws.mturk-requester.-2017-01-17.qualification-type/description :portkey.aws.mturk-requester.-2017-01-17/qualification-type-status :portkey.aws.mturk-requester.-2017-01-17.qualification-type/retry-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.qualification-type/auto-granted-value :portkey.aws.mturk-requester.-2017-01-17.qualification-type/keywords :portkey.aws.mturk-requester.-2017-01-17.qualification-type/creation-time :portkey.aws.mturk-requester.-2017-01-17.qualification-type/answer-key :portkey.aws.mturk-requester.-2017-01-17.qualification-type/name :portkey.aws.mturk-requester.-2017-01-17.qualification-type/auto-granted :portkey.aws.mturk-requester.-2017-01-17.qualification-type/qualification-type-id]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/assignment-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/assignment-review-report (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-report))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-review-report (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-report))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-id :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/assignment-review-policy :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-review-policy :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/assignment-review-report :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/hit-review-report :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.service-fault/message (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/exception-message))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/service-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.service-fault/message :portkey.aws.mturk-requester.-2017-01-17/turk-error-code]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/deadline (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/submit-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/approval-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/auto-approval-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/requester-feedback (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/accept-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/rejection-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.assignment/answer (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/assignment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.assignment/deadline :portkey.aws.mturk-requester.-2017-01-17.assignment/worker-id :portkey.aws.mturk-requester.-2017-01-17/assignment-status :portkey.aws.mturk-requester.-2017-01-17.assignment/hit-id :portkey.aws.mturk-requester.-2017-01-17.assignment/submit-time :portkey.aws.mturk-requester.-2017-01-17.assignment/approval-time :portkey.aws.mturk-requester.-2017-01-17.assignment/auto-approval-time :portkey.aws.mturk-requester.-2017-01-17.assignment/requester-feedback :portkey.aws.mturk-requester.-2017-01-17.assignment/assignment-id :portkey.aws.mturk-requester.-2017-01-17.assignment/accept-time :portkey.aws.mturk-requester.-2017-01-17.assignment/rejection-time :portkey.aws.mturk-requester.-2017-01-17.assignment/answer]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/worker-blocks (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/worker-block-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-response/worker-blocks]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit-layout-parameter/name (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit-layout-parameter/value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-layout-parameter (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.hit-layout-parameter/name :portkey.aws.mturk-requester.-2017-01-17.hit-layout-parameter/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.reject-qualification-request-request/qualification-request-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.reject-qualification-request-request/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.reject-qualification-request-request/qualification-request-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.reject-qualification-request-request/reason]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/qualification-type]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-policy-level-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/review-policy-level))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.policy-parameter/key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.policy-parameter/values (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.policy-parameter/map-entries (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/parameter-map-entry-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/policy-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.policy-parameter/key :portkey.aws.mturk-requester.-2017-01-17.policy-parameter/values :portkey.aws.mturk-requester.-2017-01-17.policy-parameter/map-entries]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/worker-block-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/worker-block))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/turk-error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/qualification-type]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/hit]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/currency-amount (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[0-9]+(\.)?[0-9]{0,2}$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/notification (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/notification-specification))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/active (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/hit-type-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/notification :portkey.aws.mturk-requester.-2017-01-17.update-notification-settings-request/active]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.parameter-map-entry/key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.parameter-map-entry/values (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/parameter-map-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.parameter-map-entry/key :portkey.aws.mturk-requester.-2017-01-17.parameter-map-entry/values]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/assignment-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/assignment))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-type-status #{:inactive "Active" "Inactive" :active})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-action-detail-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/review-action-detail))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/worker-id :portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/qualification-type-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.disassociate-qualification-from-worker-request/reason]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/status (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/reviewable-hit-status))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/hit-type-id :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/status :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-reviewable-hi-ts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/auto-approval-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/assignment-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/reward (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/title (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/keywords (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/qualification-requirements (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/assignment-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/reward :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/title :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/description] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/auto-approval-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/keywords :portkey.aws.mturk-requester.-2017-01-17.create-hit-type-request/qualification-requirements]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-worker-blocks-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/requester-feedback (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/override-rejection (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/assignment-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/requester-feedback :portkey.aws.mturk-requester.-2017-01-17.approve-assignment-request/override-rejection]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notify-workers-response/notify-workers-failure-statuses (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-status-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notify-workers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.notify-workers-response/notify-workers-failure-statuses]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/bonus-amount (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/grant-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/bonus-payment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.bonus-payment/worker-id :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/bonus-amount :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/assignment-id :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/reason :portkey.aws.mturk-requester.-2017-01-17.bonus-payment/grant-time]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.delete-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.delete-hit-request/hit-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/idempotency-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-response/file-upload-url (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.get-file-upload-url-response/file-upload-url]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-layout-parameter-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/hit-layout-parameter))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/qualification-request-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/test (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/answer (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-request/submit-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.qualification-request/qualification-request-id :portkey.aws.mturk-requester.-2017-01-17.qualification-request/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17.qualification-request/worker-id :portkey.aws.mturk-requester.-2017-01-17.qualification-request/test :portkey.aws.mturk-requester.-2017-01-17.qualification-request/answer :portkey.aws.mturk-requester.-2017-01-17.qualification-request/submit-time]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-access-actions #{:preview-and-accept "PreviewAndAccept" :discover-preview-and-accept "DiscoverPreviewAndAccept" "Accept" :accept})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notify-workers-failure-code #{:hard-failure "HardFailure" :soft-failure "SoftFailure"})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notification-specification/destination (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notification-specification/transport (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/notification-transport))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notification-specification/version (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.notification-specification/event-types (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/event-type-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/notification-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.notification-specification/destination :portkey.aws.mturk-requester.-2017-01-17.notification-specification/transport :portkey.aws.mturk-requester.-2017-01-17.notification-specification/version :portkey.aws.mturk-requester.-2017-01-17.notification-specification/event-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.delete-worker-block-request/worker-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/customer-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.delete-worker-block-request/reason (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.delete-worker-block-request/worker-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.delete-worker-block-request/reason]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/unique-request-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/idempotency-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/auto-approval-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/reward (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/title (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/assignment-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/question (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-layout-parameters (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-layout-parameter-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-layout-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/lifetime-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/keywords (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/max-assignments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/assignment-review-policy (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/qualification-requirements (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/requester-annotation (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/create-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-request/lifetime-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/assignment-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/reward :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/title :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/description] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.create-hit-request/unique-request-token :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/auto-approval-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-review-policy :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/question :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-layout-parameters :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/hit-layout-id :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/keywords :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/max-assignments :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/assignment-review-policy :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/qualification-requirements :portkey.aws.mturk-requester.-2017-01-17.create-hit-request/requester-annotation]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/entity-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 64)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"^[A-Z0-9]+$" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.reject-assignment-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.reject-assignment-request/requester-feedback (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.reject-assignment-request/assignment-id :portkey.aws.mturk-requester.-2017-01-17.reject-assignment-request/requester-feedback] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/send-bonus-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/qualification-type]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/policy-levels (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/review-policy-level-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/retrieve-actions (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/retrieve-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/hit-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/policy-levels :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/retrieve-actions :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/retrieve-results :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-review-policy-results-for-hit-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/status (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-status))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/qualification-type-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/status :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-result-detail-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/review-result-detail))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/customer-id-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/customer-id))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/qualification]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/assignment-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/hit-id :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/assignment-id :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-bonus-payments-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/action-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/subject-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/subject-type (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/question-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/key (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-result-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.review-result-detail/action-id :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/subject-id :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/subject-type :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/question-id :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/key :portkey.aws.mturk-requester.-2017-01-17.review-result-detail/value]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/assignments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/assignment-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-assignments-for-hit-response/assignments]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.get-qualification-type-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.get-qualification-type-request/qualification-type-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/query (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/must-be-requestable (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/must-be-owned-by-caller (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/must-be-requestable] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/query :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/must-be-owned-by-caller :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-qualification-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.accept-qualification-request-request/qualification-request-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.accept-qualification-request-request/integer-value (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-request (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.accept-qualification-request-request/qualification-request-id] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.accept-qualification-request-request/integer-value]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-type-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/qualification-type))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-status #{"Granted" :revoked :granted "Revoked"})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/hi-ts (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-hi-ts-for-qualification-type-response/hi-ts]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/integer-values (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/locale-values (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/locale-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/required-to-preview (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/boolean))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/actions-guarded (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/hit-access-actions))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement (clojure.spec.alpha/keys :req-un [:portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17/comparator] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/integer-values :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/locale-values :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/required-to-preview :portkey.aws.mturk-requester.-2017-01-17.qualification-requirement/actions-guarded]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/review-action-status #{"Intended" "Failed" "Cancelled" "Succeeded" :cancelled :intended :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/get-assignment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17/assignment :portkey.aws.mturk-requester.-2017-01-17/hit]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit-status #{"Disposed" "Unassignable" "Assignable" "Reviewable" :disposed :reviewing :unassignable :assignable "Reviewing" :reviewable})

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/qualification-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/max-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/result-size))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/qualification-type-id :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/next-token :portkey.aws.mturk-requester.-2017-01-17.list-qualification-requests-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/next-token (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/pagination-token))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/num-results (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/qualifications (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/next-token :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/num-results :portkey.aws.mturk-requester.-2017-01-17.list-workers-with-qualification-type-response/qualifications]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-available (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-pending (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/auto-approval-delay-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/reward (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/currency-amount))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/title (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/hit-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/assignment-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/long))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/question (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/hit-layout-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/description (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/keywords (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/creation-time (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/max-assignments (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/hit-group-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/qualification-requirements (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/qualification-requirement-list))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/hit-type-id (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/entity-id))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-completed (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/integer))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/expiration (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/timestamp))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17.hit/requester-annotation (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/string))
(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/hit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-available :portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-pending :portkey.aws.mturk-requester.-2017-01-17.hit/auto-approval-delay-in-seconds :portkey.aws.mturk-requester.-2017-01-17.hit/reward :portkey.aws.mturk-requester.-2017-01-17/hit-review-status :portkey.aws.mturk-requester.-2017-01-17.hit/title :portkey.aws.mturk-requester.-2017-01-17.hit/hit-id :portkey.aws.mturk-requester.-2017-01-17.hit/assignment-duration-in-seconds :portkey.aws.mturk-requester.-2017-01-17.hit/question :portkey.aws.mturk-requester.-2017-01-17.hit/hit-layout-id :portkey.aws.mturk-requester.-2017-01-17.hit/description :portkey.aws.mturk-requester.-2017-01-17.hit/keywords :portkey.aws.mturk-requester.-2017-01-17.hit/creation-time :portkey.aws.mturk-requester.-2017-01-17.hit/max-assignments :portkey.aws.mturk-requester.-2017-01-17.hit/hit-group-id :portkey.aws.mturk-requester.-2017-01-17.hit/qualification-requirements :portkey.aws.mturk-requester.-2017-01-17.hit/hit-type-id :portkey.aws.mturk-requester.-2017-01-17.hit/number-of-assignments-completed :portkey.aws.mturk-requester.-2017-01-17/hit-status :portkey.aws.mturk-requester.-2017-01-17.hit/expiration :portkey.aws.mturk-requester.-2017-01-17.hit/requester-annotation]))

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.mturk-requester.-2017-01-17/assignment-status-list (clojure.spec.alpha/coll-of :portkey.aws.mturk-requester.-2017-01-17/assignment-status))

(clojure.core/defn list-hi-ts ([] (list-hi-ts {})) ([list-hi-ts-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-hi-ts-request list-hi-ts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHITs", :http.request.configuration/output-deser-fn deser-list-hi-ts-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-hi-ts :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-response))

(clojure.core/defn delete-qualification-type ([delete-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-qualification-type-request delete-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteQualificationType", :http.request.configuration/output-deser-fn deser-delete-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef delete-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/delete-qualification-type-response))

(clojure.core/defn get-account-balance ([] (get-account-balance {})) ([get-account-balance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-account-balance-request get-account-balance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountBalance", :http.request.configuration/output-deser-fn deser-get-account-balance-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-account-balance :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-account-balance-response))

(clojure.core/defn update-notification-settings ([update-notification-settings-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-notification-settings-request update-notification-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotificationSettings", :http.request.configuration/output-deser-fn deser-update-notification-settings-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef update-notification-settings :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/update-notification-settings-response))

(clojure.core/defn list-reviewable-hi-ts ([] (list-reviewable-hi-ts {})) ([list-reviewable-hi-ts-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-reviewable-hi-ts-request list-reviewable-hi-ts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReviewableHITs", :http.request.configuration/output-deser-fn deser-list-reviewable-hi-ts-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-reviewable-hi-ts :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-reviewable-hi-ts-response))

(clojure.core/defn list-assignments-for-hit ([list-assignments-for-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-assignments-for-hit-request list-assignments-for-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAssignmentsForHIT", :http.request.configuration/output-deser-fn deser-list-assignments-for-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-assignments-for-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-assignments-for-hit-response))

(clojure.core/defn list-workers-with-qualification-type ([list-workers-with-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-workers-with-qualification-type-request list-workers-with-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListWorkersWithQualificationType", :http.request.configuration/output-deser-fn deser-list-workers-with-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-workers-with-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-workers-with-qualification-type-response))

(clojure.core/defn create-worker-block ([create-worker-block-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-worker-block-request create-worker-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateWorkerBlock", :http.request.configuration/output-deser-fn deser-create-worker-block-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-worker-block :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-worker-block-response))

(clojure.core/defn reject-qualification-request ([reject-qualification-request-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-reject-qualification-request-request reject-qualification-request-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RejectQualificationRequest", :http.request.configuration/output-deser-fn deser-reject-qualification-request-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef reject-qualification-request :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/reject-qualification-request-response))

(clojure.core/defn list-bonus-payments ([] (list-bonus-payments {})) ([list-bonus-payments-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-bonus-payments-request list-bonus-payments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBonusPayments", :http.request.configuration/output-deser-fn deser-list-bonus-payments-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-bonus-payments :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-bonus-payments-response))

(clojure.core/defn update-hit-type-of-hit ([update-hit-type-of-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-hit-type-of-hit-request update-hit-type-of-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHITTypeOfHIT", :http.request.configuration/output-deser-fn deser-update-hit-type-of-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef update-hit-type-of-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/update-hit-type-of-hit-response))

(clojure.core/defn delete-worker-block ([delete-worker-block-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-worker-block-request delete-worker-block-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteWorkerBlock", :http.request.configuration/output-deser-fn deser-delete-worker-block-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef delete-worker-block :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/delete-worker-block-response))

(clojure.core/defn notify-workers ([notify-workers-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-notify-workers-request notify-workers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/notify-workers-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/notify-workers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "NotifyWorkers", :http.request.configuration/output-deser-fn deser-notify-workers-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef notify-workers :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/notify-workers-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/notify-workers-response))

(clojure.core/defn accept-qualification-request ([accept-qualification-request-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-accept-qualification-request-request accept-qualification-request-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptQualificationRequest", :http.request.configuration/output-deser-fn deser-accept-qualification-request-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef accept-qualification-request :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/accept-qualification-request-response))

(clojure.core/defn associate-qualification-with-worker ([associate-qualification-with-worker-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-qualification-with-worker-request associate-qualification-with-worker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateQualificationWithWorker", :http.request.configuration/output-deser-fn deser-associate-qualification-with-worker-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef associate-qualification-with-worker :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/associate-qualification-with-worker-response))

(clojure.core/defn send-test-event-notification ([send-test-event-notification-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-send-test-event-notification-request send-test-event-notification-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendTestEventNotification", :http.request.configuration/output-deser-fn deser-send-test-event-notification-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef send-test-event-notification :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/send-test-event-notification-response))

(clojure.core/defn reject-assignment ([reject-assignment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-reject-assignment-request reject-assignment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RejectAssignment", :http.request.configuration/output-deser-fn deser-reject-assignment-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef reject-assignment :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/reject-assignment-response))

(clojure.core/defn get-file-upload-url ([get-file-upload-url-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-file-upload-url-request get-file-upload-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFileUploadURL", :http.request.configuration/output-deser-fn deser-get-file-upload-url-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-file-upload-url :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-file-upload-url-response))

(clojure.core/defn delete-hit ([delete-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-hit-request delete-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/delete-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/delete-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHIT", :http.request.configuration/output-deser-fn deser-delete-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef delete-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/delete-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/delete-hit-response))

(clojure.core/defn list-hi-ts-for-qualification-type ([list-hi-ts-for-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-hi-ts-for-qualification-type-request list-hi-ts-for-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHITsForQualificationType", :http.request.configuration/output-deser-fn deser-list-hi-ts-for-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-hi-ts-for-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-hi-ts-for-qualification-type-response))

(clojure.core/defn get-qualification-score ([get-qualification-score-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-qualification-score-request get-qualification-score-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQualificationScore", :http.request.configuration/output-deser-fn deser-get-qualification-score-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-qualification-score :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-qualification-score-response))

(clojure.core/defn get-hit ([get-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-hit-request get-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHIT", :http.request.configuration/output-deser-fn deser-get-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/get-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-hit-response))

(clojure.core/defn list-qualification-types ([list-qualification-types-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-qualification-types-request list-qualification-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQualificationTypes", :http.request.configuration/output-deser-fn deser-list-qualification-types-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-qualification-types :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-qualification-types-response))

(clojure.core/defn list-review-policy-results-for-hit ([list-review-policy-results-for-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-review-policy-results-for-hit-request list-review-policy-results-for-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReviewPolicyResultsForHIT", :http.request.configuration/output-deser-fn deser-list-review-policy-results-for-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-review-policy-results-for-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-review-policy-results-for-hit-response))

(clojure.core/defn create-additional-assignments-for-hit ([create-additional-assignments-for-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-additional-assignments-for-hit-request create-additional-assignments-for-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAdditionalAssignmentsForHIT", :http.request.configuration/output-deser-fn deser-create-additional-assignments-for-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-additional-assignments-for-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-additional-assignments-for-hit-response))

(clojure.core/defn send-bonus ([send-bonus-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-send-bonus-request send-bonus-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/send-bonus-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/send-bonus-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendBonus", :http.request.configuration/output-deser-fn deser-send-bonus-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef send-bonus :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/send-bonus-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/send-bonus-response))

(clojure.core/defn get-assignment ([get-assignment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-assignment-request get-assignment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-assignment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-assignment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAssignment", :http.request.configuration/output-deser-fn deser-get-assignment-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-assignment :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/get-assignment-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-assignment-response))

(clojure.core/defn disassociate-qualification-from-worker ([disassociate-qualification-from-worker-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-qualification-from-worker-request disassociate-qualification-from-worker-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateQualificationFromWorker", :http.request.configuration/output-deser-fn deser-disassociate-qualification-from-worker-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef disassociate-qualification-from-worker :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/disassociate-qualification-from-worker-response))

(clojure.core/defn get-qualification-type ([get-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-qualification-type-request get-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQualificationType", :http.request.configuration/output-deser-fn deser-get-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef get-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/get-qualification-type-response))

(clojure.core/defn create-hit ([create-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-hit-request create-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHIT", :http.request.configuration/output-deser-fn deser-create-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-hit-response))

(clojure.core/defn create-qualification-type ([create-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-qualification-type-request create-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateQualificationType", :http.request.configuration/output-deser-fn deser-create-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-qualification-type-response))

(clojure.core/defn list-qualification-requests ([] (list-qualification-requests {})) ([list-qualification-requests-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-qualification-requests-request list-qualification-requests-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQualificationRequests", :http.request.configuration/output-deser-fn deser-list-qualification-requests-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-qualification-requests :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-qualification-requests-response))

(clojure.core/defn create-hit-type ([create-hit-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-hit-type-request create-hit-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHITType", :http.request.configuration/output-deser-fn deser-create-hit-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-hit-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-hit-type-response))

(clojure.core/defn approve-assignment ([approve-assignment-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-approve-assignment-request approve-assignment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ApproveAssignment", :http.request.configuration/output-deser-fn deser-approve-assignment-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef approve-assignment :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/approve-assignment-response))

(clojure.core/defn create-hit-with-hit-type ([create-hit-with-hit-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-hit-with-hit-type-request create-hit-with-hit-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHITWithHITType", :http.request.configuration/output-deser-fn deser-create-hit-with-hit-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef create-hit-with-hit-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/create-hit-with-hit-type-response))

(clojure.core/defn update-qualification-type ([update-qualification-type-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-qualification-type-request update-qualification-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateQualificationType", :http.request.configuration/output-deser-fn deser-update-qualification-type-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef update-qualification-type :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/update-qualification-type-response))

(clojure.core/defn update-hit-review-status ([update-hit-review-status-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-hit-review-status-request update-hit-review-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHITReviewStatus", :http.request.configuration/output-deser-fn deser-update-hit-review-status-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef update-hit-review-status :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/update-hit-review-status-response))

(clojure.core/defn list-worker-blocks ([] (list-worker-blocks {})) ([list-worker-blocks-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-worker-blocks-request list-worker-blocks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListWorkerBlocks", :http.request.configuration/output-deser-fn deser-list-worker-blocks-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef list-worker-blocks :args (clojure.spec.alpha/? :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/list-worker-blocks-response))

(clojure.core/defn update-expiration-for-hit ([update-expiration-for-hit-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-expiration-for-hit-request update-expiration-for-hit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.mturk-requester.-2017-01-17/endpoints, :http.request.configuration/target-prefix "MTurkRequesterServiceV20170117", :http.request.spec/output-spec :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-17", :http.request.configuration/service-id "MTurk", :http.request.spec/input-spec :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateExpirationForHIT", :http.request.configuration/output-deser-fn deser-update-expiration-for-hit-response, :http.request.spec/error-spec {"ServiceFault" :portkey.aws.mturk-requester.-2017-01-17/service-fault, "RequestError" :portkey.aws.mturk-requester.-2017-01-17/request-error}})))))
(clojure.spec.alpha/fdef update-expiration-for-hit :args (clojure.spec.alpha/tuple :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-request) :ret (clojure.spec.alpha/and :portkey.aws.mturk-requester.-2017-01-17/update-expiration-for-hit-response))
