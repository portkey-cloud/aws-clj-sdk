(ns portkey.aws.support (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "support", :region "us-east-1"},
    :ssl-common-name "support.us-east-1.amazonaws.com",
    :endpoint "https://support.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-attachment)

(clojure.core/declare ser-cc-email-address)

(clojure.core/declare ser-include-communications)

(clojure.core/declare ser-include-resolved-cases)

(clojure.core/declare ser-case-id)

(clojure.core/declare ser-severity-code)

(clojure.core/declare ser-attachments)

(clojure.core/declare ser-issue-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-case-id-list)

(clojure.core/declare ser-subject)

(clojure.core/declare ser-service-code)

(clojure.core/declare ser-string)

(clojure.core/declare ser-communication-body)

(clojure.core/declare ser-data)

(clojure.core/declare ser-before-time)

(clojure.core/declare ser-service-code-list)

(clojure.core/declare ser-attachment-set-id)

(clojure.core/declare ser-language)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-category-code)

(clojure.core/declare ser-display-id)

(clojure.core/declare ser-file-name)

(clojure.core/declare ser-cc-email-address-list)

(clojure.core/declare ser-after-time)

(clojure.core/declare ser-attachment-id)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-attachment [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Attachment", :type "structure"} (clojure.core/contains? input :file-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-name (input :file-name)) #:http.request.field{:name "fileName", :shape "FileName"})) (clojure.core/contains? input :data) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-data (input :data)) #:http.request.field{:name "data", :shape "Data"}))))

(clojure.core/defn- ser-cc-email-address [input] #:http.request.field{:value input, :shape "CcEmailAddress"})

(clojure.core/defn- ser-include-communications [input] #:http.request.field{:value input, :shape "IncludeCommunications"})

(clojure.core/defn- ser-include-resolved-cases [input] #:http.request.field{:value input, :shape "IncludeResolvedCases"})

(clojure.core/defn- ser-case-id [input] #:http.request.field{:value input, :shape "CaseId"})

(clojure.core/defn- ser-severity-code [input] #:http.request.field{:value input, :shape "SeverityCode"})

(clojure.core/defn- ser-attachments [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attachment coll) #:http.request.field{:shape "Attachment"}))) input), :shape "Attachments", :type "list"})

(clojure.core/defn- ser-issue-type [input] #:http.request.field{:value input, :shape "IssueType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-case-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-case-id coll) #:http.request.field{:shape "CaseId"}))) input), :shape "CaseIdList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-subject [input] #:http.request.field{:value input, :shape "Subject"})

(clojure.core/defn- ser-service-code [input] #:http.request.field{:value input, :shape "ServiceCode"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-communication-body [input] #:http.request.field{:value input, :shape "CommunicationBody"})

(clojure.core/defn- ser-data [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Data"})

(clojure.core/defn- ser-before-time [input] #:http.request.field{:value input, :shape "BeforeTime"})

(clojure.core/defn- ser-service-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-code coll) #:http.request.field{:shape "ServiceCode"}))) input), :shape "ServiceCodeList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-attachment-set-id [input] #:http.request.field{:value input, :shape "AttachmentSetId"})

(clojure.core/defn- ser-language [input] #:http.request.field{:value input, :shape "Language"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-category-code [input] #:http.request.field{:value input, :shape "CategoryCode"})

(clojure.core/defn- ser-display-id [input] #:http.request.field{:value input, :shape "DisplayId"})

(clojure.core/defn- ser-file-name [input] #:http.request.field{:value input, :shape "FileName"})

(clojure.core/defn- ser-cc-email-address-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cc-email-address coll) #:http.request.field{:shape "CcEmailAddress"}))) input), :shape "CcEmailAddressList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-after-time [input] #:http.request.field{:value input, :shape "AfterTime"})

(clojure.core/defn- ser-attachment-id [input] #:http.request.field{:value input, :shape "AttachmentId"})

(clojure.core/defn- req-describe-cases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :before-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-before-time (input :before-time)) #:http.request.field{:name "beforeTime", :shape "BeforeTime"})) (clojure.core/contains? input :display-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-display-id (input :display-id)) #:http.request.field{:name "displayId", :shape "DisplayId"})) (clojure.core/contains? input :include-resolved-cases) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-resolved-cases (input :include-resolved-cases)) #:http.request.field{:name "includeResolvedCases", :shape "IncludeResolvedCases"})) (clojure.core/contains? input :after-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-after-time (input :after-time)) #:http.request.field{:name "afterTime", :shape "AfterTime"})) (clojure.core/contains? input :include-communications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-communications (input :include-communications)) #:http.request.field{:name "includeCommunications", :shape "IncludeCommunications"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :case-id-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-case-id-list (input :case-id-list)) #:http.request.field{:name "caseIdList", :shape "CaseIdList"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "language", :shape "Language"}))))

(clojure.core/defn- req-describe-severity-levels-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "language", :shape "Language"}))))

(clojure.core/defn- req-describe-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :service-code-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-code-list (input :service-code-list)) #:http.request.field{:name "serviceCodeList", :shape "ServiceCodeList"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "language", :shape "Language"}))))

(clojure.core/defn- req-refresh-trusted-advisor-check-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :check-id)) #:http.request.field{:name "checkId", :shape "String"})]}))

(clojure.core/defn- req-describe-communications-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-case-id (input :case-id)) #:http.request.field{:name "caseId", :shape "CaseId"})]} (clojure.core/contains? input :before-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-before-time (input :before-time)) #:http.request.field{:name "beforeTime", :shape "BeforeTime"})) (clojure.core/contains? input :after-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-after-time (input :after-time)) #:http.request.field{:name "afterTime", :shape "AfterTime"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-add-communication-to-case-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-communication-body (input :communication-body)) #:http.request.field{:name "communicationBody", :shape "CommunicationBody"})]} (clojure.core/contains? input :case-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-case-id (input :case-id)) #:http.request.field{:name "caseId", :shape "CaseId"})) (clojure.core/contains? input :cc-email-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cc-email-address-list (input :cc-email-addresses)) #:http.request.field{:name "ccEmailAddresses", :shape "CcEmailAddressList"})) (clojure.core/contains? input :attachment-set-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attachment-set-id (input :attachment-set-id)) #:http.request.field{:name "attachmentSetId", :shape "AttachmentSetId"}))))

(clojure.core/defn- req-describe-trusted-advisor-check-result-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :check-id)) #:http.request.field{:name "checkId", :shape "String"})]} (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language)) #:http.request.field{:name "language", :shape "String"}))))

(clojure.core/defn- req-describe-trusted-advisor-check-summaries-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :check-ids)) #:http.request.field{:name "checkIds", :shape "StringList"})]}))

(clojure.core/defn- req-resolve-case-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :case-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-case-id (input :case-id)) #:http.request.field{:name "caseId", :shape "CaseId"}))))

(clojure.core/defn- req-add-attachments-to-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attachments (input :attachments)) #:http.request.field{:name "attachments", :shape "Attachments"})]} (clojure.core/contains? input :attachment-set-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attachment-set-id (input :attachment-set-id)) #:http.request.field{:name "attachmentSetId", :shape "AttachmentSetId"}))))

(clojure.core/defn- req-describe-attachment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attachment-id (input :attachment-id)) #:http.request.field{:name "attachmentId", :shape "AttachmentId"})]}))

(clojure.core/defn- req-create-case-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subject (input :subject)) #:http.request.field{:name "subject", :shape "Subject"}) (clojure.core/into (ser-communication-body (input :communication-body)) #:http.request.field{:name "communicationBody", :shape "CommunicationBody"})]} (clojure.core/contains? input :severity-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-severity-code (input :severity-code)) #:http.request.field{:name "severityCode", :shape "SeverityCode"})) (clojure.core/contains? input :cc-email-addresses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cc-email-address-list (input :cc-email-addresses)) #:http.request.field{:name "ccEmailAddresses", :shape "CcEmailAddressList"})) (clojure.core/contains? input :category-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-category-code (input :category-code)) #:http.request.field{:name "categoryCode", :shape "CategoryCode"})) (clojure.core/contains? input :service-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-code (input :service-code)) #:http.request.field{:name "serviceCode", :shape "ServiceCode"})) (clojure.core/contains? input :issue-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-issue-type (input :issue-type)) #:http.request.field{:name "issueType", :shape "IssueType"})) (clojure.core/contains? input :attachment-set-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attachment-set-id (input :attachment-set-id)) #:http.request.field{:name "attachmentSetId", :shape "AttachmentSetId"})) (clojure.core/contains? input :language) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-language (input :language)) #:http.request.field{:name "language", :shape "Language"}))))

(clojure.core/defn- req-describe-trusted-advisor-checks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :language)) #:http.request.field{:name "language", :shape "String"})]}))

(clojure.core/defn- req-describe-trusted-advisor-check-refresh-statuses-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :check-ids)) #:http.request.field{:name "checkIds", :shape "StringList"})]}))

(clojure.core/declare deser-service-list)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-double)

(clojure.core/declare deser-attachment)

(clojure.core/declare deser-trusted-advisor-resource-detail-list)

(clojure.core/declare deser-communication)

(clojure.core/declare deser-cc-email-address)

(clojure.core/declare deser-expiry-time)

(clojure.core/declare deser-trusted-advisor-check-summary-list)

(clojure.core/declare deser-category)

(clojure.core/declare deser-trusted-advisor-category-specific-summary)

(clojure.core/declare deser-severity-level-code)

(clojure.core/declare deser-severity-levels-list)

(clojure.core/declare deser-case-id)

(clojure.core/declare deser-severity-code)

(clojure.core/declare deser-category-list)

(clojure.core/declare deser-result)

(clojure.core/declare deser-severity-level)

(clojure.core/declare deser-status)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-trusted-advisor-check-refresh-status)

(clojure.core/declare deser-recent-case-communications)

(clojure.core/declare deser-time-created)

(clojure.core/declare deser-subject)

(clojure.core/declare deser-trusted-advisor-check-list)

(clojure.core/declare deser-service-code)

(clojure.core/declare deser-case-list)

(clojure.core/declare deser-trusted-advisor-resources-summary)

(clojure.core/declare deser-communication-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-communication-body)

(clojure.core/declare deser-data)

(clojure.core/declare deser-attachment-set)

(clojure.core/declare deser-trusted-advisor-resource-detail)

(clojure.core/declare deser-trusted-advisor-check-summary)

(clojure.core/declare deser-attachment-details)

(clojure.core/declare deser-submitted-by)

(clojure.core/declare deser-long)

(clojure.core/declare deser-trusted-advisor-cost-optimizing-summary)

(clojure.core/declare deser-category-name)

(clojure.core/declare deser-attachment-set-id)

(clojure.core/declare deser-case-details)

(clojure.core/declare deser-language)

(clojure.core/declare deser-service-name)

(clojure.core/declare deser-trusted-advisor-check-refresh-status-list)

(clojure.core/declare deser-severity-level-name)

(clojure.core/declare deser-service)

(clojure.core/declare deser-category-code)

(clojure.core/declare deser-case-status)

(clojure.core/declare deser-display-id)

(clojure.core/declare deser-file-name)

(clojure.core/declare deser-cc-email-address-list)

(clojure.core/declare deser-trusted-advisor-check-result)

(clojure.core/declare deser-trusted-advisor-check-description)

(clojure.core/declare deser-attachment-id)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-service-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service coll))) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "fileName") (clojure.core/assoc :file-name (deser-file-name (input "fileName"))) (clojure.core/contains? input "data") (clojure.core/assoc :data (deser-data (input "data")))))

(clojure.core/defn- deser-trusted-advisor-resource-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trusted-advisor-resource-detail coll))) input))

(clojure.core/defn- deser-communication [input] (clojure.core/cond-> {} (clojure.core/contains? input "caseId") (clojure.core/assoc :case-id (deser-case-id (input "caseId"))) (clojure.core/contains? input "body") (clojure.core/assoc :body (deser-communication-body (input "body"))) (clojure.core/contains? input "submittedBy") (clojure.core/assoc :submitted-by (deser-submitted-by (input "submittedBy"))) (clojure.core/contains? input "timeCreated") (clojure.core/assoc :time-created (deser-time-created (input "timeCreated"))) (clojure.core/contains? input "attachmentSet") (clojure.core/assoc :attachment-set (deser-attachment-set (input "attachmentSet")))))

(clojure.core/defn- deser-cc-email-address [input] input)

(clojure.core/defn- deser-expiry-time [input] input)

(clojure.core/defn- deser-trusted-advisor-check-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trusted-advisor-check-summary coll))) input))

(clojure.core/defn- deser-category [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-category-code (input "code"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-category-name (input "name")))))

(clojure.core/defn- deser-trusted-advisor-category-specific-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "costOptimizing") (clojure.core/assoc :cost-optimizing (deser-trusted-advisor-cost-optimizing-summary (input "costOptimizing")))))

(clojure.core/defn- deser-severity-level-code [input] input)

(clojure.core/defn- deser-severity-levels-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-severity-level coll))) input))

(clojure.core/defn- deser-case-id [input] input)

(clojure.core/defn- deser-severity-code [input] input)

(clojure.core/defn- deser-category-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-category coll))) input))

(clojure.core/defn- deser-result [input] input)

(clojure.core/defn- deser-severity-level [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-severity-level-code (input "code"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-severity-level-name (input "name")))))

(clojure.core/defn- deser-status [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-trusted-advisor-check-refresh-status [input] (clojure.core/cond-> {:check-id (deser-string (input "checkId")), :status (deser-string (input "status")), :millis-until-next-refreshable (deser-long (input "millisUntilNextRefreshable"))}))

(clojure.core/defn- deser-recent-case-communications [input] (clojure.core/cond-> {} (clojure.core/contains? input "communications") (clojure.core/assoc :communications (deser-communication-list (input "communications"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-time-created [input] input)

(clojure.core/defn- deser-subject [input] input)

(clojure.core/defn- deser-trusted-advisor-check-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trusted-advisor-check-description coll))) input))

(clojure.core/defn- deser-service-code [input] input)

(clojure.core/defn- deser-case-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-case-details coll))) input))

(clojure.core/defn- deser-trusted-advisor-resources-summary [input] (clojure.core/cond-> {:resources-processed (deser-long (input "resourcesProcessed")), :resources-flagged (deser-long (input "resourcesFlagged")), :resources-ignored (deser-long (input "resourcesIgnored")), :resources-suppressed (deser-long (input "resourcesSuppressed"))}))

(clojure.core/defn- deser-communication-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-communication coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-communication-body [input] input)

(clojure.core/defn- deser-data [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-attachment-set [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attachment-details coll))) input))

(clojure.core/defn- deser-trusted-advisor-resource-detail [input] (clojure.core/cond-> {:status (deser-string (input "status")), :resource-id (deser-string (input "resourceId")), :metadata (deser-string-list (input "metadata"))} (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-string (input "region"))) (clojure.core/contains? input "isSuppressed") (clojure.core/assoc :is-suppressed (deser-boolean (input "isSuppressed")))))

(clojure.core/defn- deser-trusted-advisor-check-summary [input] (clojure.core/cond-> {:check-id (deser-string (input "checkId")), :timestamp (deser-string (input "timestamp")), :status (deser-string (input "status")), :resources-summary (deser-trusted-advisor-resources-summary (input "resourcesSummary")), :category-specific-summary (deser-trusted-advisor-category-specific-summary (input "categorySpecificSummary"))} (clojure.core/contains? input "hasFlaggedResources") (clojure.core/assoc :has-flagged-resources (deser-boolean (input "hasFlaggedResources")))))

(clojure.core/defn- deser-attachment-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachmentId") (clojure.core/assoc :attachment-id (deser-attachment-id (input "attachmentId"))) (clojure.core/contains? input "fileName") (clojure.core/assoc :file-name (deser-file-name (input "fileName")))))

(clojure.core/defn- deser-submitted-by [input] input)

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-trusted-advisor-cost-optimizing-summary [input] (clojure.core/cond-> {:estimated-monthly-savings (deser-double (input "estimatedMonthlySavings")), :estimated-percent-monthly-savings (deser-double (input "estimatedPercentMonthlySavings"))}))

(clojure.core/defn- deser-category-name [input] input)

(clojure.core/defn- deser-attachment-set-id [input] input)

(clojure.core/defn- deser-case-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "displayId") (clojure.core/assoc :display-id (deser-display-id (input "displayId"))) (clojure.core/contains? input "severityCode") (clojure.core/assoc :severity-code (deser-severity-code (input "severityCode"))) (clojure.core/contains? input "ccEmailAddresses") (clojure.core/assoc :cc-email-addresses (deser-cc-email-address-list (input "ccEmailAddresses"))) (clojure.core/contains? input "caseId") (clojure.core/assoc :case-id (deser-case-id (input "caseId"))) (clojure.core/contains? input "categoryCode") (clojure.core/assoc :category-code (deser-category-code (input "categoryCode"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-status (input "status"))) (clojure.core/contains? input "serviceCode") (clojure.core/assoc :service-code (deser-service-code (input "serviceCode"))) (clojure.core/contains? input "subject") (clojure.core/assoc :subject (deser-subject (input "subject"))) (clojure.core/contains? input "timeCreated") (clojure.core/assoc :time-created (deser-time-created (input "timeCreated"))) (clojure.core/contains? input "recentCommunications") (clojure.core/assoc :recent-communications (deser-recent-case-communications (input "recentCommunications"))) (clojure.core/contains? input "language") (clojure.core/assoc :language (deser-language (input "language"))) (clojure.core/contains? input "submittedBy") (clojure.core/assoc :submitted-by (deser-submitted-by (input "submittedBy")))))

(clojure.core/defn- deser-language [input] input)

(clojure.core/defn- deser-service-name [input] input)

(clojure.core/defn- deser-trusted-advisor-check-refresh-status-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trusted-advisor-check-refresh-status coll))) input))

(clojure.core/defn- deser-severity-level-name [input] input)

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-service-code (input "code"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-service-name (input "name"))) (clojure.core/contains? input "categories") (clojure.core/assoc :categories (deser-category-list (input "categories")))))

(clojure.core/defn- deser-category-code [input] input)

(clojure.core/defn- deser-case-status [input] input)

(clojure.core/defn- deser-display-id [input] input)

(clojure.core/defn- deser-file-name [input] input)

(clojure.core/defn- deser-cc-email-address-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cc-email-address coll))) input))

(clojure.core/defn- deser-trusted-advisor-check-result [input] (clojure.core/cond-> {:check-id (deser-string (input "checkId")), :timestamp (deser-string (input "timestamp")), :status (deser-string (input "status")), :resources-summary (deser-trusted-advisor-resources-summary (input "resourcesSummary")), :category-specific-summary (deser-trusted-advisor-category-specific-summary (input "categorySpecificSummary")), :flagged-resources (deser-trusted-advisor-resource-detail-list (input "flaggedResources"))}))

(clojure.core/defn- deser-trusted-advisor-check-description [input] (clojure.core/cond-> {:id (deser-string (input "id")), :name (deser-string (input "name")), :description (deser-string (input "description")), :category (deser-string (input "category")), :metadata (deser-string-list (input "metadata"))}))

(clojure.core/defn- deser-attachment-id [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-describe-trusted-advisor-check-summaries-response ([input] (response-describe-trusted-advisor-check-summaries-response nil input)) ([resultWrapper2107751 input] (clojure.core/let [rawinput2107750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107752 {"summaries" (rawinput2107750 "summaries")}] (clojure.core/cond-> {:summaries (deser-trusted-advisor-check-summary-list (clojure.core/get-in letvar2107752 ["summaries"]))}))))

(clojure.core/defn- response-add-attachments-to-set-response ([input] (response-add-attachments-to-set-response nil input)) ([resultWrapper2107754 input] (clojure.core/let [rawinput2107753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107755 {"attachmentSetId" (rawinput2107753 "attachmentSetId"), "expiryTime" (rawinput2107753 "expiryTime")}] (clojure.core/cond-> {} (letvar2107755 "attachmentSetId") (clojure.core/assoc :attachment-set-id (deser-attachment-set-id (clojure.core/get-in letvar2107755 ["attachmentSetId"]))) (letvar2107755 "expiryTime") (clojure.core/assoc :expiry-time (deser-expiry-time (clojure.core/get-in letvar2107755 ["expiryTime"])))))))

(clojure.core/defn- response-add-communication-to-case-response ([input] (response-add-communication-to-case-response nil input)) ([resultWrapper2107757 input] (clojure.core/let [rawinput2107756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107758 {"result" (rawinput2107756 "result")}] (clojure.core/cond-> {} (letvar2107758 "result") (clojure.core/assoc :result (deser-result (clojure.core/get-in letvar2107758 ["result"])))))))

(clojure.core/defn- response-attachment-set-size-limit-exceeded ([input] (response-attachment-set-size-limit-exceeded nil input)) ([resultWrapper2107760 input] (clojure.core/let [rawinput2107759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107761 {"message" (rawinput2107759 "message")}] (clojure.core/cond-> {} (letvar2107761 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107761 ["message"])))))))

(clojure.core/defn- response-describe-attachment-limit-exceeded ([input] (response-describe-attachment-limit-exceeded nil input)) ([resultWrapper2107763 input] (clojure.core/let [rawinput2107762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107764 {"message" (rawinput2107762 "message")}] (clojure.core/cond-> {} (letvar2107764 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107764 ["message"])))))))

(clojure.core/defn- response-describe-trusted-advisor-checks-response ([input] (response-describe-trusted-advisor-checks-response nil input)) ([resultWrapper2107766 input] (clojure.core/let [rawinput2107765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107767 {"checks" (rawinput2107765 "checks")}] (clojure.core/cond-> {:checks (deser-trusted-advisor-check-list (clojure.core/get-in letvar2107767 ["checks"]))}))))

(clojure.core/defn- response-create-case-response ([input] (response-create-case-response nil input)) ([resultWrapper2107769 input] (clojure.core/let [rawinput2107768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107770 {"caseId" (rawinput2107768 "caseId")}] (clojure.core/cond-> {} (letvar2107770 "caseId") (clojure.core/assoc :case-id (deser-case-id (clojure.core/get-in letvar2107770 ["caseId"])))))))

(clojure.core/defn- response-describe-trusted-advisor-check-refresh-statuses-response ([input] (response-describe-trusted-advisor-check-refresh-statuses-response nil input)) ([resultWrapper2107772 input] (clojure.core/let [rawinput2107771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107773 {"statuses" (rawinput2107771 "statuses")}] (clojure.core/cond-> {:statuses (deser-trusted-advisor-check-refresh-status-list (clojure.core/get-in letvar2107773 ["statuses"]))}))))

(clojure.core/defn- response-attachment-set-expired ([input] (response-attachment-set-expired nil input)) ([resultWrapper2107775 input] (clojure.core/let [rawinput2107774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107776 {"message" (rawinput2107774 "message")}] (clojure.core/cond-> {} (letvar2107776 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107776 ["message"])))))))

(clojure.core/defn- response-describe-services-response ([input] (response-describe-services-response nil input)) ([resultWrapper2107778 input] (clojure.core/let [rawinput2107777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107779 {"services" (rawinput2107777 "services")}] (clojure.core/cond-> {} (letvar2107779 "services") (clojure.core/assoc :services (deser-service-list (clojure.core/get-in letvar2107779 ["services"])))))))

(clojure.core/defn- response-refresh-trusted-advisor-check-response ([input] (response-refresh-trusted-advisor-check-response nil input)) ([resultWrapper2107781 input] (clojure.core/let [rawinput2107780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107782 {"status" (rawinput2107780 "status")}] (clojure.core/cond-> {:status (deser-trusted-advisor-check-refresh-status (clojure.core/get-in letvar2107782 ["status"]))}))))

(clojure.core/defn- response-case-id-not-found ([input] (response-case-id-not-found nil input)) ([resultWrapper2107784 input] (clojure.core/let [rawinput2107783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107785 {"message" (rawinput2107783 "message")}] (clojure.core/cond-> {} (letvar2107785 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107785 ["message"])))))))

(clojure.core/defn- response-describe-trusted-advisor-check-result-response ([input] (response-describe-trusted-advisor-check-result-response nil input)) ([resultWrapper2107787 input] (clojure.core/let [rawinput2107786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107788 {"result" (rawinput2107786 "result")}] (clojure.core/cond-> {} (letvar2107788 "result") (clojure.core/assoc :result (deser-trusted-advisor-check-result (clojure.core/get-in letvar2107788 ["result"])))))))

(clojure.core/defn- response-describe-communications-response ([input] (response-describe-communications-response nil input)) ([resultWrapper2107790 input] (clojure.core/let [rawinput2107789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107791 {"communications" (rawinput2107789 "communications"), "nextToken" (rawinput2107789 "nextToken")}] (clojure.core/cond-> {} (letvar2107791 "communications") (clojure.core/assoc :communications (deser-communication-list (clojure.core/get-in letvar2107791 ["communications"]))) (letvar2107791 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2107791 ["nextToken"])))))))

(clojure.core/defn- response-attachment-id-not-found ([input] (response-attachment-id-not-found nil input)) ([resultWrapper2107793 input] (clojure.core/let [rawinput2107792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107794 {"message" (rawinput2107792 "message")}] (clojure.core/cond-> {} (letvar2107794 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107794 ["message"])))))))

(clojure.core/defn- response-resolve-case-response ([input] (response-resolve-case-response nil input)) ([resultWrapper2107796 input] (clojure.core/let [rawinput2107795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107797 {"initialCaseStatus" (rawinput2107795 "initialCaseStatus"), "finalCaseStatus" (rawinput2107795 "finalCaseStatus")}] (clojure.core/cond-> {} (letvar2107797 "initialCaseStatus") (clojure.core/assoc :initial-case-status (deser-case-status (clojure.core/get-in letvar2107797 ["initialCaseStatus"]))) (letvar2107797 "finalCaseStatus") (clojure.core/assoc :final-case-status (deser-case-status (clojure.core/get-in letvar2107797 ["finalCaseStatus"])))))))

(clojure.core/defn- response-attachment-limit-exceeded ([input] (response-attachment-limit-exceeded nil input)) ([resultWrapper2107799 input] (clojure.core/let [rawinput2107798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107800 {"message" (rawinput2107798 "message")}] (clojure.core/cond-> {} (letvar2107800 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107800 ["message"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper2107802 input] (clojure.core/let [rawinput2107801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107803 {"message" (rawinput2107801 "message")}] (clojure.core/cond-> {} (letvar2107803 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107803 ["message"])))))))

(clojure.core/defn- response-describe-severity-levels-response ([input] (response-describe-severity-levels-response nil input)) ([resultWrapper2107805 input] (clojure.core/let [rawinput2107804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107806 {"severityLevels" (rawinput2107804 "severityLevels")}] (clojure.core/cond-> {} (letvar2107806 "severityLevels") (clojure.core/assoc :severity-levels (deser-severity-levels-list (clojure.core/get-in letvar2107806 ["severityLevels"])))))))

(clojure.core/defn- response-describe-cases-response ([input] (response-describe-cases-response nil input)) ([resultWrapper2107808 input] (clojure.core/let [rawinput2107807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107809 {"cases" (rawinput2107807 "cases"), "nextToken" (rawinput2107807 "nextToken")}] (clojure.core/cond-> {} (letvar2107809 "cases") (clojure.core/assoc :cases (deser-case-list (clojure.core/get-in letvar2107809 ["cases"]))) (letvar2107809 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar2107809 ["nextToken"])))))))

(clojure.core/defn- response-describe-attachment-response ([input] (response-describe-attachment-response nil input)) ([resultWrapper2107811 input] (clojure.core/let [rawinput2107810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107812 {"attachment" (rawinput2107810 "attachment")}] (clojure.core/cond-> {} (letvar2107812 "attachment") (clojure.core/assoc :attachment (deser-attachment (clojure.core/get-in letvar2107812 ["attachment"])))))))

(clojure.core/defn- response-attachment-set-id-not-found ([input] (response-attachment-set-id-not-found nil input)) ([resultWrapper2107814 input] (clojure.core/let [rawinput2107813 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107815 {"message" (rawinput2107813 "message")}] (clojure.core/cond-> {} (letvar2107815 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107815 ["message"])))))))

(clojure.core/defn- response-case-creation-limit-exceeded ([input] (response-case-creation-limit-exceeded nil input)) ([resultWrapper2107817 input] (clojure.core/let [rawinput2107816 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2107818 {"message" (rawinput2107816 "message")}] (clojure.core/cond-> {} (letvar2107818 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2107818 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.support/service-list (clojure.spec.alpha/coll-of :portkey.aws.support/service))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-summaries-response/summaries (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-check-summary-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-summaries-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-check-summaries-response/summaries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.add-attachments-to-set-response/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.add-attachments-to-set-response/expiry-time (clojure.spec.alpha/and :portkey.aws.support/expiry-time))
(clojure.spec.alpha/def :portkey.aws.support/add-attachments-to-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.add-attachments-to-set-response/attachment-set-id :portkey.aws.support.add-attachments-to-set-response/expiry-time]))

(clojure.spec.alpha/def :portkey.aws.support/string-list (clojure.spec.alpha/coll-of :portkey.aws.support/string))

(clojure.spec.alpha/def :portkey.aws.support/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.support.attachment/file-name (clojure.spec.alpha/and :portkey.aws.support/file-name))
(clojure.spec.alpha/def :portkey.aws.support.attachment/data (clojure.spec.alpha/and :portkey.aws.support/data))
(clojure.spec.alpha/def :portkey.aws.support/attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment/file-name :portkey.aws.support.attachment/data]))

(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-resource-detail-list (clojure.spec.alpha/coll-of :portkey.aws.support/trusted-advisor-resource-detail))

(clojure.spec.alpha/def :portkey.aws.support.communication/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support.communication/body (clojure.spec.alpha/and :portkey.aws.support/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.communication/submitted-by (clojure.spec.alpha/and :portkey.aws.support/submitted-by))
(clojure.spec.alpha/def :portkey.aws.support.communication/time-created (clojure.spec.alpha/and :portkey.aws.support/time-created))
(clojure.spec.alpha/def :portkey.aws.support.communication/attachment-set (clojure.spec.alpha/and :portkey.aws.support/attachment-set))
(clojure.spec.alpha/def :portkey.aws.support/communication (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.communication/case-id :portkey.aws.support.communication/body :portkey.aws.support.communication/submitted-by :portkey.aws.support.communication/time-created :portkey.aws.support.communication/attachment-set]))

(clojure.spec.alpha/def :portkey.aws.support/cc-email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/include-communications clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support/expiry-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-summary-list (clojure.spec.alpha/coll-of :portkey.aws.support/trusted-advisor-check-summary))

(clojure.spec.alpha/def :portkey.aws.support.category/code (clojure.spec.alpha/and :portkey.aws.support/category-code))
(clojure.spec.alpha/def :portkey.aws.support.category/name (clojure.spec.alpha/and :portkey.aws.support/category-name))
(clojure.spec.alpha/def :portkey.aws.support/category (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.category/code :portkey.aws.support.category/name]))

(clojure.spec.alpha/def :portkey.aws.support.add-communication-to-case-response/result (clojure.spec.alpha/and :portkey.aws.support/result))
(clojure.spec.alpha/def :portkey.aws.support/add-communication-to-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.add-communication-to-case-response/result]))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-category-specific-summary/cost-optimizing (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-cost-optimizing-summary))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-category-specific-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.trusted-advisor-category-specific-summary/cost-optimizing]))

(clojure.spec.alpha/def :portkey.aws.support/include-resolved-cases clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support/severity-level-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/severity-levels-list (clojure.spec.alpha/coll-of :portkey.aws.support/severity-level))

(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/before-time (clojure.spec.alpha/and :portkey.aws.support/before-time))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/display-id (clojure.spec.alpha/and :portkey.aws.support/display-id))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/include-resolved-cases (clojure.spec.alpha/and :portkey.aws.support/include-resolved-cases))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/after-time (clojure.spec.alpha/and :portkey.aws.support/after-time))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/include-communications (clojure.spec.alpha/and :portkey.aws.support/include-communications))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/max-results (clojure.spec.alpha/and :portkey.aws.support/max-results))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/next-token (clojure.spec.alpha/and :portkey.aws.support/next-token))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/case-id-list (clojure.spec.alpha/and :portkey.aws.support/case-id-list))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-request/language (clojure.spec.alpha/and :portkey.aws.support/language))
(clojure.spec.alpha/def :portkey.aws.support/describe-cases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-cases-request/before-time :portkey.aws.support.describe-cases-request/display-id :portkey.aws.support.describe-cases-request/include-resolved-cases :portkey.aws.support.describe-cases-request/after-time :portkey.aws.support.describe-cases-request/include-communications :portkey.aws.support.describe-cases-request/max-results :portkey.aws.support.describe-cases-request/next-token :portkey.aws.support.describe-cases-request/case-id-list :portkey.aws.support.describe-cases-request/language]))

(clojure.spec.alpha/def :portkey.aws.support/case-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-severity-levels-request/language (clojure.spec.alpha/and :portkey.aws.support/language))
(clojure.spec.alpha/def :portkey.aws.support/describe-severity-levels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-severity-levels-request/language]))

(clojure.spec.alpha/def :portkey.aws.support/severity-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-services-request/service-code-list (clojure.spec.alpha/and :portkey.aws.support/service-code-list))
(clojure.spec.alpha/def :portkey.aws.support.describe-services-request/language (clojure.spec.alpha/and :portkey.aws.support/language))
(clojure.spec.alpha/def :portkey.aws.support/describe-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-services-request/service-code-list :portkey.aws.support.describe-services-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.attachment-set-size-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/attachment-set-size-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-set-size-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.refresh-trusted-advisor-check-request/check-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support/refresh-trusted-advisor-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.refresh-trusted-advisor-check-request/check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/category-list (clojure.spec.alpha/coll-of :portkey.aws.support/category))

(clojure.spec.alpha/def :portkey.aws.support/result clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.severity-level/code (clojure.spec.alpha/and :portkey.aws.support/severity-level-code))
(clojure.spec.alpha/def :portkey.aws.support.severity-level/name (clojure.spec.alpha/and :portkey.aws.support/severity-level-name))
(clojure.spec.alpha/def :portkey.aws.support/severity-level (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.severity-level/code :portkey.aws.support.severity-level/name]))

(clojure.spec.alpha/def :portkey.aws.support.describe-attachment-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/describe-attachment-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-attachment-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-checks-response/checks (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-check-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-checks-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-checks-response/checks] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.describe-communications-request/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support.describe-communications-request/before-time (clojure.spec.alpha/and :portkey.aws.support/before-time))
(clojure.spec.alpha/def :portkey.aws.support.describe-communications-request/after-time (clojure.spec.alpha/and :portkey.aws.support/after-time))
(clojure.spec.alpha/def :portkey.aws.support.describe-communications-request/next-token (clojure.spec.alpha/and :portkey.aws.support/next-token))
(clojure.spec.alpha/def :portkey.aws.support.describe-communications-request/max-results (clojure.spec.alpha/and :portkey.aws.support/max-results))
(clojure.spec.alpha/def :portkey.aws.support/describe-communications-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-communications-request/case-id] :opt-un [:portkey.aws.support.describe-communications-request/before-time :portkey.aws.support.describe-communications-request/after-time :portkey.aws.support.describe-communications-request/next-token :portkey.aws.support.describe-communications-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.support.create-case-response/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support/create-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.create-case-response/case-id]))

(clojure.spec.alpha/def :portkey.aws.support.add-communication-to-case-request/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support.add-communication-to-case-request/communication-body (clojure.spec.alpha/and :portkey.aws.support/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.add-communication-to-case-request/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.add-communication-to-case-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support/add-communication-to-case-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.add-communication-to-case-request/communication-body] :opt-un [:portkey.aws.support.add-communication-to-case-request/case-id :portkey.aws.support.add-communication-to-case-request/cc-email-addresses :portkey.aws.support.add-communication-to-case-request/attachment-set-id]))

(clojure.spec.alpha/def :portkey.aws.support/attachments (clojure.spec.alpha/coll-of :portkey.aws.support/attachment))

(clojure.spec.alpha/def :portkey.aws.support/issue-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-result-request/check-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-result-request/language (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-result-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-check-result-request/check-id] :opt-un [:portkey.aws.support.describe-trusted-advisor-check-result-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-summaries-request/check-ids (clojure.spec.alpha/and :portkey.aws.support/string-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-summaries-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-check-summaries-request/check-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-refresh-status/check-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-refresh-status/status (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-refresh-status/millis-until-next-refreshable (clojure.spec.alpha/and :portkey.aws.support/long))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-refresh-status (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-check-refresh-status/check-id :portkey.aws.support.trusted-advisor-check-refresh-status/status :portkey.aws.support.trusted-advisor-check-refresh-status/millis-until-next-refreshable] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.recent-case-communications/communications (clojure.spec.alpha/and :portkey.aws.support/communication-list))
(clojure.spec.alpha/def :portkey.aws.support.recent-case-communications/next-token (clojure.spec.alpha/and :portkey.aws.support/next-token))
(clojure.spec.alpha/def :portkey.aws.support/recent-case-communications (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.recent-case-communications/communications :portkey.aws.support.recent-case-communications/next-token]))

(clojure.spec.alpha/def :portkey.aws.support/case-id-list (clojure.spec.alpha/coll-of :portkey.aws.support/case-id :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-refresh-statuses-response/statuses (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-check-refresh-status-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-check-refresh-statuses-response/statuses] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.resolve-case-request/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support/resolve-case-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.resolve-case-request/case-id]))

(clojure.spec.alpha/def :portkey.aws.support.attachment-set-expired/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/attachment-set-expired (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-set-expired/message]))

(clojure.spec.alpha/def :portkey.aws.support/time-created (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.support/service-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-services-response/services]))

(clojure.spec.alpha/def :portkey.aws.support.refresh-trusted-advisor-check-response/status (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-check-refresh-status))
(clojure.spec.alpha/def :portkey.aws.support/refresh-trusted-advisor-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.refresh-trusted-advisor-check-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-list (clojure.spec.alpha/coll-of :portkey.aws.support/trusted-advisor-check-description))

(clojure.spec.alpha/def :portkey.aws.support/service-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/case-list (clojure.spec.alpha/coll-of :portkey.aws.support/case-details))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resources-summary/resources-processed (clojure.spec.alpha/and :portkey.aws.support/long))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resources-summary/resources-flagged (clojure.spec.alpha/and :portkey.aws.support/long))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resources-summary/resources-ignored (clojure.spec.alpha/and :portkey.aws.support/long))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resources-summary/resources-suppressed (clojure.spec.alpha/and :portkey.aws.support/long))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-resources-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-resources-summary/resources-processed :portkey.aws.support.trusted-advisor-resources-summary/resources-flagged :portkey.aws.support.trusted-advisor-resources-summary/resources-ignored :portkey.aws.support.trusted-advisor-resources-summary/resources-suppressed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/communication-list (clojure.spec.alpha/coll-of :portkey.aws.support/communication))

(clojure.spec.alpha/def :portkey.aws.support/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.case-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/case-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.case-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-result-response/result (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-check-result))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-result-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-trusted-advisor-check-result-response/result]))

(clojure.spec.alpha/def :portkey.aws.support/communication-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8000))))

(clojure.spec.alpha/def :portkey.aws.support/data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.support/before-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-communications-response/communications (clojure.spec.alpha/and :portkey.aws.support/communication-list))
(clojure.spec.alpha/def :portkey.aws.support.describe-communications-response/next-token (clojure.spec.alpha/and :portkey.aws.support/next-token))
(clojure.spec.alpha/def :portkey.aws.support/describe-communications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-communications-response/communications :portkey.aws.support.describe-communications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.support/attachment-set (clojure.spec.alpha/coll-of :portkey.aws.support/attachment-details))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resource-detail/status (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resource-detail/region (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resource-detail/resource-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resource-detail/is-suppressed (clojure.spec.alpha/and :portkey.aws.support/boolean))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-resource-detail/metadata (clojure.spec.alpha/and :portkey.aws.support/string-list))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-resource-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-resource-detail/status :portkey.aws.support.trusted-advisor-resource-detail/resource-id :portkey.aws.support.trusted-advisor-resource-detail/metadata] :opt-un [:portkey.aws.support.trusted-advisor-resource-detail/region :portkey.aws.support.trusted-advisor-resource-detail/is-suppressed]))

(clojure.spec.alpha/def :portkey.aws.support.add-attachments-to-set-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.add-attachments-to-set-request/attachments (clojure.spec.alpha/and :portkey.aws.support/attachments))
(clojure.spec.alpha/def :portkey.aws.support/add-attachments-to-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.add-attachments-to-set-request/attachments] :opt-un [:portkey.aws.support.add-attachments-to-set-request/attachment-set-id]))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/check-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/timestamp (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/status (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/has-flagged-resources (clojure.spec.alpha/and :portkey.aws.support/boolean))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/resources-summary (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-resources-summary))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-summary/category-specific-summary (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-category-specific-summary))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-check-summary/check-id :portkey.aws.support.trusted-advisor-check-summary/timestamp :portkey.aws.support.trusted-advisor-check-summary/status :portkey.aws.support.trusted-advisor-check-summary/resources-summary :portkey.aws.support.trusted-advisor-check-summary/category-specific-summary] :opt-un [:portkey.aws.support.trusted-advisor-check-summary/has-flagged-resources]))

(clojure.spec.alpha/def :portkey.aws.support/service-code-list (clojure.spec.alpha/coll-of :portkey.aws.support/service-code :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.support.describe-attachment-request/attachment-id (clojure.spec.alpha/and :portkey.aws.support/attachment-id))
(clojure.spec.alpha/def :portkey.aws.support/describe-attachment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-attachment-request/attachment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.attachment-details/attachment-id (clojure.spec.alpha/and :portkey.aws.support/attachment-id))
(clojure.spec.alpha/def :portkey.aws.support.attachment-details/file-name (clojure.spec.alpha/and :portkey.aws.support/file-name))
(clojure.spec.alpha/def :portkey.aws.support/attachment-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-details/attachment-id :portkey.aws.support.attachment-details/file-name]))

(clojure.spec.alpha/def :portkey.aws.support.attachment-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/attachment-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.resolve-case-response/initial-case-status (clojure.spec.alpha/and :portkey.aws.support/case-status))
(clojure.spec.alpha/def :portkey.aws.support.resolve-case-response/final-case-status (clojure.spec.alpha/and :portkey.aws.support/case-status))
(clojure.spec.alpha/def :portkey.aws.support/resolve-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.resolve-case-response/initial-case-status :portkey.aws.support.resolve-case-response/final-case-status]))

(clojure.spec.alpha/def :portkey.aws.support/submitted-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-cost-optimizing-summary/estimated-monthly-savings (clojure.spec.alpha/and :portkey.aws.support/double))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-cost-optimizing-summary/estimated-percent-monthly-savings (clojure.spec.alpha/and :portkey.aws.support/double))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-cost-optimizing-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-cost-optimizing-summary/estimated-monthly-savings :portkey.aws.support.trusted-advisor-cost-optimizing-summary/estimated-percent-monthly-savings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/category-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.attachment-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/attachment-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.create-case-request/severity-code (clojure.spec.alpha/and :portkey.aws.support/severity-code))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/category-code (clojure.spec.alpha/and :portkey.aws.support/category-code))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/communication-body (clojure.spec.alpha/and :portkey.aws.support/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/service-code (clojure.spec.alpha/and :portkey.aws.support/service-code))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/subject (clojure.spec.alpha/and :portkey.aws.support/subject))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/issue-type (clojure.spec.alpha/and :portkey.aws.support/issue-type))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.create-case-request/language (clojure.spec.alpha/and :portkey.aws.support/language))
(clojure.spec.alpha/def :portkey.aws.support/create-case-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.create-case-request/subject :portkey.aws.support.create-case-request/communication-body] :opt-un [:portkey.aws.support.create-case-request/severity-code :portkey.aws.support.create-case-request/cc-email-addresses :portkey.aws.support.create-case-request/category-code :portkey.aws.support.create-case-request/service-code :portkey.aws.support.create-case-request/issue-type :portkey.aws.support.create-case-request/attachment-set-id :portkey.aws.support.create-case-request/language]))

(clojure.spec.alpha/def :portkey.aws.support/attachment-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.case-details/display-id (clojure.spec.alpha/and :portkey.aws.support/display-id))
(clojure.spec.alpha/def :portkey.aws.support.case-details/severity-code (clojure.spec.alpha/and :portkey.aws.support/severity-code))
(clojure.spec.alpha/def :portkey.aws.support.case-details/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.case-details/case-id (clojure.spec.alpha/and :portkey.aws.support/case-id))
(clojure.spec.alpha/def :portkey.aws.support.case-details/category-code (clojure.spec.alpha/and :portkey.aws.support/category-code))
(clojure.spec.alpha/def :portkey.aws.support.case-details/status (clojure.spec.alpha/and :portkey.aws.support/status))
(clojure.spec.alpha/def :portkey.aws.support.case-details/service-code (clojure.spec.alpha/and :portkey.aws.support/service-code))
(clojure.spec.alpha/def :portkey.aws.support.case-details/subject (clojure.spec.alpha/and :portkey.aws.support/subject))
(clojure.spec.alpha/def :portkey.aws.support.case-details/time-created (clojure.spec.alpha/and :portkey.aws.support/time-created))
(clojure.spec.alpha/def :portkey.aws.support.case-details/recent-communications (clojure.spec.alpha/and :portkey.aws.support/recent-case-communications))
(clojure.spec.alpha/def :portkey.aws.support.case-details/language (clojure.spec.alpha/and :portkey.aws.support/language))
(clojure.spec.alpha/def :portkey.aws.support.case-details/submitted-by (clojure.spec.alpha/and :portkey.aws.support/submitted-by))
(clojure.spec.alpha/def :portkey.aws.support/case-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.case-details/display-id :portkey.aws.support.case-details/severity-code :portkey.aws.support.case-details/cc-email-addresses :portkey.aws.support.case-details/case-id :portkey.aws.support.case-details/category-code :portkey.aws.support.case-details/status :portkey.aws.support.case-details/service-code :portkey.aws.support.case-details/subject :portkey.aws.support.case-details/time-created :portkey.aws.support.case-details/recent-communications :portkey.aws.support.case-details/language :portkey.aws.support.case-details/submitted-by]))

(clojure.spec.alpha/def :portkey.aws.support/language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/max-results (clojure.spec.alpha/int-in 10 100))

(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-refresh-status-list (clojure.spec.alpha/coll-of :portkey.aws.support/trusted-advisor-check-refresh-status))

(clojure.spec.alpha/def :portkey.aws.support/severity-level-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-checks-request/language (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-checks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-checks-request/language] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.support.service/code (clojure.spec.alpha/and :portkey.aws.support/service-code))
(clojure.spec.alpha/def :portkey.aws.support.service/name (clojure.spec.alpha/and :portkey.aws.support/service-name))
(clojure.spec.alpha/def :portkey.aws.support.service/categories (clojure.spec.alpha/and :portkey.aws.support/category-list))
(clojure.spec.alpha/def :portkey.aws.support/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.service/code :portkey.aws.support.service/name :portkey.aws.support.service/categories]))

(clojure.spec.alpha/def :portkey.aws.support.describe-trusted-advisor-check-refresh-statuses-request/check-ids (clojure.spec.alpha/and :portkey.aws.support/string-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.describe-trusted-advisor-check-refresh-statuses-request/check-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/category-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/case-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-severity-levels-response/severity-levels (clojure.spec.alpha/and :portkey.aws.support/severity-levels-list))
(clojure.spec.alpha/def :portkey.aws.support/describe-severity-levels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-severity-levels-response/severity-levels]))

(clojure.spec.alpha/def :portkey.aws.support/display-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/file-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/cc-email-address-list (clojure.spec.alpha/coll-of :portkey.aws.support/cc-email-address :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.support.describe-cases-response/cases (clojure.spec.alpha/and :portkey.aws.support/case-list))
(clojure.spec.alpha/def :portkey.aws.support.describe-cases-response/next-token (clojure.spec.alpha/and :portkey.aws.support/next-token))
(clojure.spec.alpha/def :portkey.aws.support/describe-cases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-cases-response/cases :portkey.aws.support.describe-cases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.support/after-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.describe-attachment-response/attachment (clojure.spec.alpha/and :portkey.aws.support/attachment))
(clojure.spec.alpha/def :portkey.aws.support/describe-attachment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.describe-attachment-response/attachment]))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/check-id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/timestamp (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/status (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/resources-summary (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-resources-summary))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/category-specific-summary (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-category-specific-summary))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-result/flagged-resources (clojure.spec.alpha/and :portkey.aws.support/trusted-advisor-resource-detail-list))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-result (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-check-result/check-id :portkey.aws.support.trusted-advisor-check-result/timestamp :portkey.aws.support.trusted-advisor-check-result/status :portkey.aws.support.trusted-advisor-check-result/resources-summary :portkey.aws.support.trusted-advisor-check-result/category-specific-summary :portkey.aws.support.trusted-advisor-check-result/flagged-resources] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-description/id (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-description/name (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-description/description (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-description/category (clojure.spec.alpha/and :portkey.aws.support/string))
(clojure.spec.alpha/def :portkey.aws.support.trusted-advisor-check-description/metadata (clojure.spec.alpha/and :portkey.aws.support/string-list))
(clojure.spec.alpha/def :portkey.aws.support/trusted-advisor-check-description (clojure.spec.alpha/keys :req-un [:portkey.aws.support.trusted-advisor-check-description/id :portkey.aws.support.trusted-advisor-check-description/name :portkey.aws.support.trusted-advisor-check-description/description :portkey.aws.support.trusted-advisor-check-description/category :portkey.aws.support.trusted-advisor-check-description/metadata] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support/attachment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.attachment-set-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/attachment-set-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.attachment-set-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.case-creation-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support/error-message))
(clojure.spec.alpha/def :portkey.aws.support/case-creation-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.case-creation-limit-exceeded/message]))

(clojure.core/defn describe-trusted-advisor-check-summaries "Returns the summaries of the results of the Trusted Advisor checks that have the\nspecified check IDs. Check IDs can be obtained by calling\nDescribeTrustedAdvisorChecks.\n The response contains an array of TrustedAdvisorCheckSummary objects." ([describe-trusted-advisor-check-summaries-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-trusted-advisor-check-summaries-request describe-trusted-advisor-check-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-trusted-advisor-check-summaries-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-trusted-advisor-check-summaries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckSummaries", :http.request.configuration/output-deser-fn response-describe-trusted-advisor-check-summaries-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-summaries :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-trusted-advisor-check-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-trusted-advisor-check-summaries-response))

(clojure.core/defn add-attachments-to-set "Adds one or more attachments to an attachment set. If an attachmentSetId is not\nspecified, a new attachment set is created, and the ID of the set is returned in\nthe response. If an attachmentSetId is specified, the attachments are added to\nthe specified set, if it exists.\n An attachment set is a temporary container for attachments that are to be added\nto a case or case communication. The set is available for one hour after it is\ncreated; the expiryTime returned in the response indicates when the set expires.\nThe maximum number of attachments in a set is 3, and the maximum size of any\nattachment in the set is 5 MB." ([add-attachments-to-set-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-attachments-to-set-request add-attachments-to-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/add-attachments-to-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/add-attachments-to-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddAttachmentsToSet", :http.request.configuration/output-deser-fn response-add-attachments-to-set-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "AttachmentSetIdNotFound" :portkey.aws.support/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support/attachment-set-expired, "AttachmentSetSizeLimitExceeded" :portkey.aws.support/attachment-set-size-limit-exceeded, "AttachmentLimitExceeded" :portkey.aws.support/attachment-limit-exceeded}})))))
(clojure.spec.alpha/fdef add-attachments-to-set :args (clojure.spec.alpha/tuple :portkey.aws.support/add-attachments-to-set-request) :ret (clojure.spec.alpha/and :portkey.aws.support/add-attachments-to-set-response))

(clojure.core/defn describe-trusted-advisor-checks "Returns information about all available Trusted Advisor checks, including name,\nID, category, description, and metadata. You must specify a language code;\nEnglish (\"en\") and Japanese (\"ja\") are currently supported. The response\ncontains a TrustedAdvisorCheckDescription for each check." ([describe-trusted-advisor-checks-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-trusted-advisor-checks-request describe-trusted-advisor-checks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-trusted-advisor-checks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-trusted-advisor-checks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrustedAdvisorChecks", :http.request.configuration/output-deser-fn response-describe-trusted-advisor-checks-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-checks :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-trusted-advisor-checks-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-trusted-advisor-checks-response))

(clojure.core/defn describe-attachment "Returns the attachment that has the specified ID. Attachment IDs are generated\nby the case management system when you add an attachment to a case or case\ncommunication. Attachment IDs are returned in the AttachmentDetails objects that\nare returned by the DescribeCommunications operation." ([describe-attachment-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-attachment-request describe-attachment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-attachment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-attachment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAttachment", :http.request.configuration/output-deser-fn response-describe-attachment-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "DescribeAttachmentLimitExceeded" :portkey.aws.support/describe-attachment-limit-exceeded, "AttachmentIdNotFound" :portkey.aws.support/attachment-id-not-found}})))))
(clojure.spec.alpha/fdef describe-attachment :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-attachment-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-attachment-response))

(clojure.core/defn resolve-case "Takes a caseId and returns the initial state of the case along with the state of\nthe case after the call to ResolveCase completed." ([] (resolve-case {})) ([resolve-case-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-resolve-case-request resolve-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/resolve-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/resolve-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResolveCase", :http.request.configuration/output-deser-fn response-resolve-case-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "CaseIdNotFound" :portkey.aws.support/case-id-not-found}})))))
(clojure.spec.alpha/fdef resolve-case :args (clojure.spec.alpha/? :portkey.aws.support/resolve-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support/resolve-case-response))

(clojure.core/defn create-case "Creates a new case in the AWS Support Center. This operation is modeled on the\nbehavior of the AWS Support Center Create Case\n(https://console.aws.amazon.com/support/home#/case/create) page. Its parameters\nrequire you to specify the following information:\n * issueType. The type of issue for the case. You can specify either\n\"customer-service\" or \"technical.\" If you do not indicate a value, the default\nis \"technical.\"\n * serviceCode. The code for an AWS service. You obtain the serviceCode by\ncalling DescribeServices.\n * categoryCode. The category for the service defined for the serviceCode value.\nYou also obtain the category code for a service by calling DescribeServices.\nEach AWS service defines its own set of category codes.\n * severityCode. A value that indicates the urgency of the case, which in turn\ndetermines the response time according to your service level agreement with AWS\nSupport. You obtain the SeverityCode by calling DescribeSeverityLevels.\n * subject. The Subject field on the AWS Support Center Create Case\n(https://console.aws.amazon.com/support/home#/case/create) page.\n * communicationBody. The Description field on the AWS Support Center Create\nCase (https://console.aws.amazon.com/support/home#/case/create) page.\n * attachmentSetId. The ID of a set of attachments that has been created by\nusing AddAttachmentsToSet.\n * language. The human language in which AWS Support handles the case. English\nand Japanese are currently supported.\n * ccEmailAddresses. The AWS Support Center CC field on the Create Case\n(https://console.aws.amazon.com/support/home#/case/create) page. You can list\nemail addresses to be copied on any correspondence about the case. The account\nthat opens the case is already identified by passing the AWS Credentials in the\nHTTP POST method or in a method or function call from one of the programming\nlanguages supported by an AWS SDK (http://aws.amazon.com/tools/).\n To add additional communication or attachments to an existing case, use\nAddCommunicationToCase.\n A successful CreateCase request returns an AWS Support case number. Case\nnumbers are used by the DescribeCases operation to retrieve existing AWS Support\ncases." ([create-case-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-case-request create-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/create-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/create-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCase", :http.request.configuration/output-deser-fn response-create-case-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "CaseCreationLimitExceeded" :portkey.aws.support/case-creation-limit-exceeded, "AttachmentSetIdNotFound" :portkey.aws.support/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support/attachment-set-expired}})))))
(clojure.spec.alpha/fdef create-case :args (clojure.spec.alpha/tuple :portkey.aws.support/create-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support/create-case-response))

(clojure.core/defn describe-communications "Returns communications (and attachments) for one or more support cases. You can\nuse the afterTime and beforeTime parameters to filter by date. You can use the\ncaseId parameter to restrict the results to a particular case.\n Case data is available for 12 months after creation. If a case was created more\nthan 12 months ago, a request for data might cause an error.\n You can use the maxResults and nextToken parameters to control the pagination\nof the result set. Set maxResults to the number of cases you want displayed on\neach page, and use nextToken to specify the resumption of pagination." ([describe-communications-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-communications-request describe-communications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-communications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-communications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCommunications", :http.request.configuration/output-deser-fn response-describe-communications-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "CaseIdNotFound" :portkey.aws.support/case-id-not-found}})))))
(clojure.spec.alpha/fdef describe-communications :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-communications-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-communications-response))

(clojure.core/defn describe-services "Returns the current list of AWS services and a list of service categories that\napplies to each one. You then use service names and categories in your\nCreateCase requests. Each AWS service has its own set of categories.\n The service codes and category codes correspond to the values that are\ndisplayed in the Service and Category drop-down lists on the AWS Support Center\nCreate Case (https://console.aws.amazon.com/support/home#/case/create) page. The\nvalues in those fields, however, do not necessarily match the service codes and\ncategories returned by the DescribeServices request. Always use the service\ncodes and categories obtained programmatically. This practice ensures that you\nalways have the most recent set of service and category codes." ([] (describe-services {})) ([describe-services-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServices", :http.request.configuration/output-deser-fn response-describe-services-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/? :portkey.aws.support/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-services-response))

(clojure.core/defn describe-trusted-advisor-check-refresh-statuses "Returns the refresh status of the Trusted Advisor checks that have the specified\ncheck IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.\n Some checks are refreshed automatically, and their refresh statuses cannot be\nretrieved by using this operation. Use of the\nDescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an\nInvalidParameterValue error." ([describe-trusted-advisor-check-refresh-statuses-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-trusted-advisor-check-refresh-statuses-request describe-trusted-advisor-check-refresh-statuses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckRefreshStatuses", :http.request.configuration/output-deser-fn response-describe-trusted-advisor-check-refresh-statuses-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-refresh-statuses :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-trusted-advisor-check-refresh-statuses-response))

(clojure.core/defn add-communication-to-case "Adds additional customer communication to an AWS Support case. You use the\ncaseId value to identify the case to add communication to. You can list a set of\nemail addresses to copy on the communication using the ccEmailAddresses value.\nThe communicationBody value contains the text of the communication.\n The response indicates the success or failure of the request.\n This operation implements a subset of the features of the AWS Support Center." ([add-communication-to-case-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-communication-to-case-request add-communication-to-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/add-communication-to-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/add-communication-to-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddCommunicationToCase", :http.request.configuration/output-deser-fn response-add-communication-to-case-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "CaseIdNotFound" :portkey.aws.support/case-id-not-found, "AttachmentSetIdNotFound" :portkey.aws.support/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support/attachment-set-expired}})))))
(clojure.spec.alpha/fdef add-communication-to-case :args (clojure.spec.alpha/tuple :portkey.aws.support/add-communication-to-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support/add-communication-to-case-response))

(clojure.core/defn refresh-trusted-advisor-check "Requests a refresh of the Trusted Advisor check that has the specified check ID.\nCheck IDs can be obtained by calling DescribeTrustedAdvisorChecks.\n Some checks are refreshed automatically, and they cannot be refreshed by using\nthis operation. Use of the RefreshTrustedAdvisorCheck operation for these checks\ncauses an InvalidParameterValue error.\n The response contains a TrustedAdvisorCheckRefreshStatus object, which contains\nthese fields:\n * status. The refresh status of the check: \"none\", \"enqueued\", \"processing\",\n\"success\", or \"abandoned\".\n * millisUntilNextRefreshable. The amount of time, in milliseconds, until the\ncheck is eligible for refresh.\n * checkId. The unique identifier for the check." ([refresh-trusted-advisor-check-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-refresh-trusted-advisor-check-request refresh-trusted-advisor-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/refresh-trusted-advisor-check-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/refresh-trusted-advisor-check-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RefreshTrustedAdvisorCheck", :http.request.configuration/output-deser-fn response-refresh-trusted-advisor-check-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef refresh-trusted-advisor-check :args (clojure.spec.alpha/tuple :portkey.aws.support/refresh-trusted-advisor-check-request) :ret (clojure.spec.alpha/and :portkey.aws.support/refresh-trusted-advisor-check-response))

(clojure.core/defn describe-severity-levels "Returns the list of severity levels that you can assign to an AWS Support case.\nThe severity level for a case is also a field in the CaseDetails data type\nincluded in any CreateCase request." ([] (describe-severity-levels {})) ([describe-severity-levels-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-severity-levels-request describe-severity-levels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-severity-levels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-severity-levels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSeverityLevels", :http.request.configuration/output-deser-fn response-describe-severity-levels-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-severity-levels :args (clojure.spec.alpha/? :portkey.aws.support/describe-severity-levels-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-severity-levels-response))

(clojure.core/defn describe-cases "Returns a list of cases that you specify by passing one or more case IDs. In\naddition, you can filter the cases by date by setting values for the afterTime\nand beforeTime request parameters. You can set values for the\nincludeResolvedCases and includeCommunications request parameters to control how\nmuch information is returned.\n Case data is available for 12 months after creation. If a case was created more\nthan 12 months ago, a request for data might cause an error.\n The response returns the following in JSON format:\n * One or more CaseDetails data types.\n * One or more nextToken values, which specify where to paginate the returned\nrecords represented by the CaseDetails objects." ([] (describe-cases {})) ([describe-cases-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-cases-request describe-cases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-cases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-cases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCases", :http.request.configuration/output-deser-fn response-describe-cases-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error, "CaseIdNotFound" :portkey.aws.support/case-id-not-found}})))))
(clojure.spec.alpha/fdef describe-cases :args (clojure.spec.alpha/? :portkey.aws.support/describe-cases-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-cases-response))

(clojure.core/defn describe-trusted-advisor-check-result "Returns the results of the Trusted Advisor check that has the specified check\nID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.\n The response contains a TrustedAdvisorCheckResult object, which contains these\nthree objects:\n * TrustedAdvisorCategorySpecificSummary\n * TrustedAdvisorResourceDetail\n * TrustedAdvisorResourcesSummary\n In addition, the response contains these fields:\n * status. The alert status of the check: \"ok\" (green), \"warning\" (yellow),\n\"error\" (red), or \"not_available\".\n * timestamp. The time of the last refresh of the check.\n * checkId. The unique identifier for the check." ([describe-trusted-advisor-check-result-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-trusted-advisor-check-result-request describe-trusted-advisor-check-result-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.support/endpoints, :http.request.configuration/target-prefix "AWSSupport_20130415", :http.request.spec/output-spec :portkey.aws.support/describe-trusted-advisor-check-result-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support/describe-trusted-advisor-check-result-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckResult", :http.request.configuration/output-deser-fn response-describe-trusted-advisor-check-result-response, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-result :args (clojure.spec.alpha/tuple :portkey.aws.support/describe-trusted-advisor-check-result-request) :ret (clojure.spec.alpha/and :portkey.aws.support/describe-trusted-advisor-check-result-response))
