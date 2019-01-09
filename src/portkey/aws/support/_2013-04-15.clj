(ns portkey.aws.support.-2013-04-15 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/service-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/service))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-summaries-response/summaries (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-check-summary-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-summaries-response/summaries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-attachments-to-set-response/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-attachments-to-set-response/expiry-time (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/expiry-time))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/add-attachments-to-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.add-attachments-to-set-response/attachment-set-id :portkey.aws.support.-2013-04-15.add-attachments-to-set-response/expiry-time]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/string-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/string))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment/file-name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/file-name))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment/data (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/data))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment/file-name :portkey.aws.support.-2013-04-15.attachment/data]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-resource-detail-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/trusted-advisor-resource-detail))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.communication/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.communication/body (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.communication/submitted-by (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/submitted-by))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.communication/time-created (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/time-created))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.communication/attachment-set (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-set))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/communication (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.communication/case-id :portkey.aws.support.-2013-04-15.communication/body :portkey.aws.support.-2013-04-15.communication/submitted-by :portkey.aws.support.-2013-04-15.communication/time-created :portkey.aws.support.-2013-04-15.communication/attachment-set]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/cc-email-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/include-communications clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/expiry-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-summary-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/trusted-advisor-check-summary))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.category/code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/category-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.category/name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/category-name))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/category (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.category/code :portkey.aws.support.-2013-04-15.category/name]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-communication-to-case-response/result (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/result))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/add-communication-to-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.add-communication-to-case-response/result]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-category-specific-summary/cost-optimizing (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-cost-optimizing-summary))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-category-specific-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.trusted-advisor-category-specific-summary/cost-optimizing]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/include-resolved-cases clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/severity-level-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/severity-levels-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/severity-level))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/before-time (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/before-time))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/display-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/display-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/include-resolved-cases (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/include-resolved-cases))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/after-time (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/after-time))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/include-communications (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/include-communications))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/max-results (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/max-results))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/next-token (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/next-token))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/case-id-list (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/language))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-cases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-cases-request/before-time :portkey.aws.support.-2013-04-15.describe-cases-request/display-id :portkey.aws.support.-2013-04-15.describe-cases-request/include-resolved-cases :portkey.aws.support.-2013-04-15.describe-cases-request/after-time :portkey.aws.support.-2013-04-15.describe-cases-request/include-communications :portkey.aws.support.-2013-04-15.describe-cases-request/max-results :portkey.aws.support.-2013-04-15.describe-cases-request/next-token :portkey.aws.support.-2013-04-15.describe-cases-request/case-id-list :portkey.aws.support.-2013-04-15.describe-cases-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-severity-levels-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/language))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-severity-levels-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-severity-levels-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/severity-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-services-request/service-code-list (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-code-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-services-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/language))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-services-request/service-code-list :portkey.aws.support.-2013-04-15.describe-services-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-set-size-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-set-size-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-set-size-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.refresh-trusted-advisor-check-request/check-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.refresh-trusted-advisor-check-request/check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/category-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/category))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/result clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.severity-level/code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/severity-level-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.severity-level/name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/severity-level-name))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/severity-level (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.severity-level/code :portkey.aws.support.-2013-04-15.severity-level/name]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-attachment-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-attachment-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-attachment-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-checks-response/checks (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-check-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-checks-response/checks] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-request/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-request/before-time (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/before-time))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-request/after-time (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/after-time))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-request/next-token (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/next-token))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-request/max-results (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/max-results))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-communications-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-communications-request/case-id] :opt-un [:portkey.aws.support.-2013-04-15.describe-communications-request/before-time :portkey.aws.support.-2013-04-15.describe-communications-request/after-time :portkey.aws.support.-2013-04-15.describe-communications-request/next-token :portkey.aws.support.-2013-04-15.describe-communications-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-response/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/create-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.create-case-response/case-id]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-communication-to-case-request/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-communication-to-case-request/communication-body (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-communication-to-case-request/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-communication-to-case-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/add-communication-to-case-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.add-communication-to-case-request/communication-body] :opt-un [:portkey.aws.support.-2013-04-15.add-communication-to-case-request/case-id :portkey.aws.support.-2013-04-15.add-communication-to-case-request/cc-email-addresses :portkey.aws.support.-2013-04-15.add-communication-to-case-request/attachment-set-id]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachments (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/attachment))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/issue-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-request/check-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-request/check-id] :opt-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-summaries-request/check-ids (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-summaries-request/check-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/check-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/millis-until-next-refreshable (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/long))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-refresh-status (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/check-id :portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/status :portkey.aws.support.-2013-04-15.trusted-advisor-check-refresh-status/millis-until-next-refreshable] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.recent-case-communications/communications (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/communication-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.recent-case-communications/next-token (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/next-token))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/recent-case-communications (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.recent-case-communications/communications :portkey.aws.support.-2013-04-15.recent-case-communications/next-token]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-id-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/case-id :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-refresh-statuses-response/statuses (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-check-refresh-status-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-refresh-statuses-response/statuses] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.resolve-case-request/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/resolve-case-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.resolve-case-request/case-id]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-set-expired/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-set-expired (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-set-expired/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/time-created (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-services-response/services]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.refresh-trusted-advisor-check-response/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-check-refresh-status))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.refresh-trusted-advisor-check-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/subject (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/trusted-advisor-check-description))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/service-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/case-details))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-processed (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/long))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-flagged (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/long))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-ignored (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/long))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-suppressed (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/long))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-resources-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-processed :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-flagged :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-ignored :portkey.aws.support.-2013-04-15.trusted-advisor-resources-summary/resources-suppressed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/communication-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/communication))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.case-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-response/result (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-check-result))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-result-response/result]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/communication-body (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8000))))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/data clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/before-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-response/communications (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/communication-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-communications-response/next-token (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/next-token))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-communications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-communications-response/communications :portkey.aws.support.-2013-04-15.describe-communications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-set (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/attachment-details))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/region (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/resource-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/is-suppressed (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/metadata (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-resource-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/status :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/resource-id :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/metadata] :opt-un [:portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/region :portkey.aws.support.-2013-04-15.trusted-advisor-resource-detail/is-suppressed]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-attachments-to-set-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.add-attachments-to-set-request/attachments (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachments))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/add-attachments-to-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.add-attachments-to-set-request/attachments] :opt-un [:portkey.aws.support.-2013-04-15.add-attachments-to-set-request/attachment-set-id]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/check-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/timestamp (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/has-flagged-resources (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/resources-summary (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-resources-summary))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/category-specific-summary (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-category-specific-summary))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/check-id :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/timestamp :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/status :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/resources-summary :portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/category-specific-summary] :opt-un [:portkey.aws.support.-2013-04-15.trusted-advisor-check-summary/has-flagged-resources]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/service-code-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/service-code :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-attachment-request/attachment-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-attachment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-attachment-request/attachment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-details/attachment-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-details/file-name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/file-name))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-details/attachment-id :portkey.aws.support.-2013-04-15.attachment-details/file-name]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.resolve-case-response/initial-case-status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-status))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.resolve-case-response/final-case-status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-status))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/resolve-case-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.resolve-case-response/initial-case-status :portkey.aws.support.-2013-04-15.resolve-case-response/final-case-status]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/submitted-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-cost-optimizing-summary/estimated-monthly-savings (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/double))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-cost-optimizing-summary/estimated-percent-monthly-savings (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/double))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-cost-optimizing-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-cost-optimizing-summary/estimated-monthly-savings :portkey.aws.support.-2013-04-15.trusted-advisor-cost-optimizing-summary/estimated-percent-monthly-savings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/category-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/severity-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/severity-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/category-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/category-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/communication-body (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/communication-body))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/service-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/subject (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/subject))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/issue-type (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/issue-type))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/attachment-set-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment-set-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.create-case-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/language))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/create-case-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.create-case-request/subject :portkey.aws.support.-2013-04-15.create-case-request/communication-body] :opt-un [:portkey.aws.support.-2013-04-15.create-case-request/severity-code :portkey.aws.support.-2013-04-15.create-case-request/cc-email-addresses :portkey.aws.support.-2013-04-15.create-case-request/category-code :portkey.aws.support.-2013-04-15.create-case-request/service-code :portkey.aws.support.-2013-04-15.create-case-request/issue-type :portkey.aws.support.-2013-04-15.create-case-request/attachment-set-id :portkey.aws.support.-2013-04-15.create-case-request/language]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/display-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/display-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/severity-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/severity-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/cc-email-addresses (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/cc-email-address-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/case-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-id))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/category-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/category-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/status))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/service-code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/subject (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/subject))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/time-created (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/time-created))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/recent-communications (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/recent-case-communications))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/language))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-details/submitted-by (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/submitted-by))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.case-details/display-id :portkey.aws.support.-2013-04-15.case-details/severity-code :portkey.aws.support.-2013-04-15.case-details/cc-email-addresses :portkey.aws.support.-2013-04-15.case-details/case-id :portkey.aws.support.-2013-04-15.case-details/category-code :portkey.aws.support.-2013-04-15.case-details/status :portkey.aws.support.-2013-04-15.case-details/service-code :portkey.aws.support.-2013-04-15.case-details/subject :portkey.aws.support.-2013-04-15.case-details/time-created :portkey.aws.support.-2013-04-15.case-details/recent-communications :portkey.aws.support.-2013-04-15.case-details/language :portkey.aws.support.-2013-04-15.case-details/submitted-by]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/language (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/max-results (clojure.spec.alpha/int-in 10 100))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-refresh-status-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/trusted-advisor-check-refresh-status))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/severity-level-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-checks-request/language (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-checks-request/language] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.internal-server-error/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.service/code (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-code))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.service/name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/service-name))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.service/categories (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/category-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.service/code :portkey.aws.support.-2013-04-15.service/name :portkey.aws.support.-2013-04-15.service/categories]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-refresh-statuses-request/check-ids (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-request (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.describe-trusted-advisor-check-refresh-statuses-request/check-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/category-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-severity-levels-response/severity-levels (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/severity-levels-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-severity-levels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-severity-levels-response/severity-levels]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/display-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/file-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/cc-email-address-list (clojure.spec.alpha/coll-of :portkey.aws.support.-2013-04-15/cc-email-address :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-response/cases (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/case-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-cases-response/next-token (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/next-token))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-cases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-cases-response/cases :portkey.aws.support.-2013-04-15.describe-cases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/after-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.describe-attachment-response/attachment (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/attachment))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/describe-attachment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.describe-attachment-response/attachment]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/check-id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/timestamp (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/status (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/resources-summary (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-resources-summary))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/category-specific-summary (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-category-specific-summary))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/flagged-resources (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/trusted-advisor-resource-detail-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-result (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-check-result/check-id :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/timestamp :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/status :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/resources-summary :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/category-specific-summary :portkey.aws.support.-2013-04-15.trusted-advisor-check-result/flagged-resources] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/id (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/name (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/description (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/category (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/metadata (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/string-list))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/trusted-advisor-check-description (clojure.spec.alpha/keys :req-un [:portkey.aws.support.-2013-04-15.trusted-advisor-check-description/id :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/name :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/description :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/category :portkey.aws.support.-2013-04-15.trusted-advisor-check-description/metadata] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.attachment-set-id-not-found/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/attachment-set-id-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.attachment-set-id-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15.case-creation-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/error-message))
(clojure.spec.alpha/def :portkey.aws.support.-2013-04-15/case-creation-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.support.-2013-04-15.case-creation-limit-exceeded/message]))

(clojure.core/defn describe-trusted-advisor-check-summaries ([describe-trusted-advisor-check-summaries-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-trusted-advisor-check-summaries-request describe-trusted-advisor-check-summaries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckSummaries", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-summaries :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-summaries-response))

(clojure.core/defn add-attachments-to-set ([add-attachments-to-set-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-attachments-to-set-request add-attachments-to-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/add-attachments-to-set-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/add-attachments-to-set-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddAttachmentsToSet", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "AttachmentSetIdNotFound" :portkey.aws.support.-2013-04-15/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support.-2013-04-15/attachment-set-expired, "AttachmentSetSizeLimitExceeded" :portkey.aws.support.-2013-04-15/attachment-set-size-limit-exceeded, "AttachmentLimitExceeded" :portkey.aws.support.-2013-04-15/attachment-limit-exceeded}})))))
(clojure.spec.alpha/fdef add-attachments-to-set :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/add-attachments-to-set-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/add-attachments-to-set-response))

(clojure.core/defn describe-trusted-advisor-checks ([describe-trusted-advisor-checks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-trusted-advisor-checks-request describe-trusted-advisor-checks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrustedAdvisorChecks", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-checks :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-trusted-advisor-checks-response))

(clojure.core/defn describe-attachment ([describe-attachment-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-attachment-request describe-attachment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-attachment-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-attachment-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAttachment", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "DescribeAttachmentLimitExceeded" :portkey.aws.support.-2013-04-15/describe-attachment-limit-exceeded, "AttachmentIdNotFound" :portkey.aws.support.-2013-04-15/attachment-id-not-found}})))))
(clojure.spec.alpha/fdef describe-attachment :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-attachment-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-attachment-response))

(clojure.core/defn resolve-case ([] (resolve-case {})) ([resolve-case-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-resolve-case-request resolve-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/resolve-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/resolve-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResolveCase", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "CaseIdNotFound" :portkey.aws.support.-2013-04-15/case-id-not-found}})))))
(clojure.spec.alpha/fdef resolve-case :args (clojure.spec.alpha/? :portkey.aws.support.-2013-04-15/resolve-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/resolve-case-response))

(clojure.core/defn create-case ([create-case-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-case-request create-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/create-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/create-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCase", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "CaseCreationLimitExceeded" :portkey.aws.support.-2013-04-15/case-creation-limit-exceeded, "AttachmentSetIdNotFound" :portkey.aws.support.-2013-04-15/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support.-2013-04-15/attachment-set-expired}})))))
(clojure.spec.alpha/fdef create-case :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/create-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/create-case-response))

(clojure.core/defn describe-communications ([describe-communications-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-communications-request describe-communications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-communications-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-communications-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCommunications", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "CaseIdNotFound" :portkey.aws.support.-2013-04-15/case-id-not-found}})))))
(clojure.spec.alpha/fdef describe-communications :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-communications-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-communications-response))

(clojure.core/defn describe-services ([] (describe-services {})) ([describe-services-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeServices", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/? :portkey.aws.support.-2013-04-15/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-services-response))

(clojure.core/defn describe-trusted-advisor-check-refresh-statuses ([describe-trusted-advisor-check-refresh-statuses-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-trusted-advisor-check-refresh-statuses-request describe-trusted-advisor-check-refresh-statuses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckRefreshStatuses", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-refresh-statuses :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-refresh-statuses-response))

(clojure.core/defn add-communication-to-case ([add-communication-to-case-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-communication-to-case-request add-communication-to-case-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/add-communication-to-case-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/add-communication-to-case-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddCommunicationToCase", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "CaseIdNotFound" :portkey.aws.support.-2013-04-15/case-id-not-found, "AttachmentSetIdNotFound" :portkey.aws.support.-2013-04-15/attachment-set-id-not-found, "AttachmentSetExpired" :portkey.aws.support.-2013-04-15/attachment-set-expired}})))))
(clojure.spec.alpha/fdef add-communication-to-case :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/add-communication-to-case-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/add-communication-to-case-response))

(clojure.core/defn refresh-trusted-advisor-check ([refresh-trusted-advisor-check-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-refresh-trusted-advisor-check-request refresh-trusted-advisor-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RefreshTrustedAdvisorCheck", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef refresh-trusted-advisor-check :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/refresh-trusted-advisor-check-response))

(clojure.core/defn describe-severity-levels ([] (describe-severity-levels {})) ([describe-severity-levels-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-severity-levels-request describe-severity-levels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-severity-levels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-severity-levels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSeverityLevels", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-severity-levels :args (clojure.spec.alpha/? :portkey.aws.support.-2013-04-15/describe-severity-levels-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-severity-levels-response))

(clojure.core/defn describe-cases ([] (describe-cases {})) ([describe-cases-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-cases-request describe-cases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-cases-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-cases-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCases", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error, "CaseIdNotFound" :portkey.aws.support.-2013-04-15/case-id-not-found}})))))
(clojure.spec.alpha/fdef describe-cases :args (clojure.spec.alpha/? :portkey.aws.support.-2013-04-15/describe-cases-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-cases-response))

(clojure.core/defn describe-trusted-advisor-check-result ([describe-trusted-advisor-check-result-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-trusted-advisor-check-result-request describe-trusted-advisor-check-result-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.support.-2013-04-15/endpoints, :http.request.spec/output-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrustedAdvisorCheckResult", :http.request.spec/error-spec {"InternalServerError" :portkey.aws.support.-2013-04-15/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-trusted-advisor-check-result :args (clojure.spec.alpha/tuple :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-request) :ret (clojure.spec.alpha/and :portkey.aws.support.-2013-04-15/describe-trusted-advisor-check-result-response))
