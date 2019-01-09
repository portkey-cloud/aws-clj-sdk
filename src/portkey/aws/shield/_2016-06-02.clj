(ns portkey.aws.shield.-2016-06-02 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "shield", :region "us-east-1"},
    :ssl-common-name "Shield.us-east-1.amazonaws.com",
    :endpoint "https://shield.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-attack-timestamp)

(clojure.core/declare ser-protection-name)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-emergency-contact-list)

(clojure.core/declare ser-attack-id)

(clojure.core/declare ser-auto-renew)

(clojure.core/declare ser-resource-arn-filter-list)

(clojure.core/declare ser-emergency-contact)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-time-range)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-log-bucket)

(clojure.core/declare ser-email-address)

(clojure.core/declare ser-token)

(clojure.core/declare ser-protection-id)

(clojure.core/defn- ser-attack-timestamp [input] #:http.request.field{:value input, :shape "AttackTimestamp"})

(clojure.core/defn- ser-protection-name [input] #:http.request.field{:value input, :shape "ProtectionName"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-emergency-contact-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-emergency-contact coll) #:http.request.field{:shape "EmergencyContact"}))) input), :shape "EmergencyContactList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-attack-id [input] #:http.request.field{:value input, :shape "AttackId"})

(clojure.core/defn- ser-auto-renew [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "AutoRenew"})

(clojure.core/defn- ser-resource-arn-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "ResourceArnFilterList", :type "list"})

(clojure.core/defn- ser-emergency-contact [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-email-address (:email-address input)) #:http.request.field{:name "EmailAddress", :shape "EmailAddress"})], :shape "EmergencyContact", :type "structure"}))

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-time-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeRange", :type "structure"} (clojure.core/contains? input :from-inclusive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attack-timestamp (input :from-inclusive)) #:http.request.field{:name "FromInclusive", :shape "AttackTimestamp"})) (clojure.core/contains? input :to-exclusive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attack-timestamp (input :to-exclusive)) #:http.request.field{:name "ToExclusive", :shape "AttackTimestamp"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-log-bucket [input] #:http.request.field{:value input, :shape "LogBucket"})

(clojure.core/defn- ser-email-address [input] #:http.request.field{:value input, :shape "EmailAddress"})

(clojure.core/defn- ser-token [input] #:http.request.field{:value input, :shape "Token"})

(clojure.core/defn- ser-protection-id [input] #:http.request.field{:value input, :shape "ProtectionId"})

(clojure.core/defn- req-describe-emergency-contact-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-attacks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-filter-list (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceArnFilterList"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimeRange"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimeRange"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-create-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-attack-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attack-id (input :attack-id)) #:http.request.field{:name "AttackId", :shape "AttackId"})]}))

(clojure.core/defn- req-update-emergency-contact-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :emergency-contact-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-emergency-contact-list (input :emergency-contact-list)) #:http.request.field{:name "EmergencyContactList", :shape "EmergencyContactList"}))))

(clojure.core/defn- req-list-protections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "Token"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-subscription-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-renew) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-renew (input :auto-renew)) #:http.request.field{:name "AutoRenew", :shape "AutoRenew"}))))

(clojure.core/defn- req-disassociate-drt-role-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-associate-drt-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-associate-drt-log-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-bucket (input :log-bucket)) #:http.request.field{:name "LogBucket", :shape "LogBucket"})]}))

(clojure.core/defn- req-describe-protection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-protection-id (input :protection-id)) #:http.request.field{:name "ProtectionId", :shape "ProtectionId"})]}))

(clojure.core/defn- req-delete-protection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-protection-id (input :protection-id)) #:http.request.field{:name "ProtectionId", :shape "ProtectionId"})]}))

(clojure.core/defn- req-get-subscription-state-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-subscription-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-protection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-protection-name (input :name)) #:http.request.field{:name "Name", :shape "ProtectionName"}) (clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]}))

(clojure.core/defn- req-disassociate-drt-log-bucket-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-bucket (input :log-bucket)) #:http.request.field{:name "LogBucket", :shape "LogBucket"})]}))

(clojure.core/defn- req-describe-drt-access-request [input] (clojure.core/cond-> {}))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/unit #{"BITS" "REQUESTS" :requests :bits :bytes "BYTES" :packets "PACKETS"})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-resource-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-resource-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[ a-zA-Z0-9_\\.\\-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/resource-arns (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/resource-arn-filter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/time-range))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/time-range))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-request/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-attacks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.list-attacks-request/resource-arns :portkey.aws.shield.-2016-06-02.list-attacks-request/start-time :portkey.aws.shield.-2016-06-02.list-attacks-request/end-time :portkey.aws.shield.-2016-06-02.list-attacks-request/next-token :portkey.aws.shield.-2016-06-02/max-results]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-layer #{:application "NETWORK" "APPLICATION" :network})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-attack-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/attack-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-vector-description-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-vector-description))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/emergency-contact-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-attack-vector (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-type] :opt-un [:portkey.aws.shield.-2016-06-02.summarized-attack-vector/vector-counters]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 96)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-protections-request/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-protections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.list-protections-request/next-token :portkey.aws.shield.-2016-06-02/max-results]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/sub-resources (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/sub-resource-summary-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/attack-counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-detail/mitigations (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/mitigation-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-id :portkey.aws.shield.-2016-06-02/resource-arn :portkey.aws.shield.-2016-06-02.attack-detail/sub-resources :portkey.aws.shield.-2016-06-02.attack-detail/start-time :portkey.aws.shield.-2016-06-02.attack-detail/end-time :portkey.aws.shield.-2016-06-02.attack-detail/attack-counters :portkey.aws.shield.-2016-06-02/attack-properties :portkey.aws.shield.-2016-06-02.attack-detail/mitigations]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/auto-renew]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limit/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limit/max (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.limit/type :portkey.aws.shield.-2016-06-02.limit/max]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/mitigation-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/mitigation))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/emergency-contact-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/emergency-contact :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/limit-type))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/limit (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/limit-number))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limits-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.limits-exceeded-exception/message :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/type :portkey.aws.shield.-2016-06-02.limits-exceeded-exception/limit]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/emergency-contact-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-operation-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-operation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/attack-id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/resource-arn (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-summary/attack-vectors (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-vector-description-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.attack-summary/attack-id :portkey.aws.shield.-2016-06-02.attack-summary/resource-arn :portkey.aws.shield.-2016-06-02.attack-summary/start-time :portkey.aws.shield.-2016-06-02.attack-summary/end-time :portkey.aws.shield.-2016-06-02.attack-summary/attack-vectors]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limits (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/limit))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protections (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/protection))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\\-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.locked-subscription-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/locked-subscription-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.locked-subscription-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/duration-in-seconds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.no-associated-role-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/no-associated-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.no-associated-role-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/auto-renew #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/log-bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/max (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/average (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/sum (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/double))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/n (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/integer))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.summarized-counter/unit (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-counter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.summarized-counter/name :portkey.aws.shield.-2016-06-02.summarized-counter/max :portkey.aws.shield.-2016-06-02.summarized-counter/average :portkey.aws.shield.-2016-06-02.summarized-counter/sum :portkey.aws.shield.-2016-06-02.summarized-counter/n :portkey.aws.shield.-2016-06-02.summarized-counter/unit]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-properties (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-property))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-protection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/protection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-summaries (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/attack-summary))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-protection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/protection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-drt-access-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/role-arn :portkey.aws.shield.-2016-06-02/log-bucket-list]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-type #{"URL" :ip "IP" :url})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protection]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-counter-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/summarized-counter))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-summary-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/sub-resource-summary))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/get-subscription-state-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-attacks-response/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-attacks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-summaries :portkey.aws.shield.-2016-06-02.list-attacks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/top-contributors (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/contributor))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-arn-filter-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/resource-arn))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-subscription-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.mitigation/mitigation-name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/mitigation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.mitigation/mitigation-name]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/get-subscription-state-response (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/subscription-state] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/emergency-contact (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/email-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.create-protection-request/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-name))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-protection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.create-protection-request/name :portkey.aws.shield.-2016-06-02/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.protection/id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-id))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.protection/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/protection-name))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.protection/id :portkey.aws.shield.-2016-06-02.protection/name :portkey.aws.shield.-2016-06-02/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/subscription-state #{:inactive :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/sub-resource-type))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/id (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/attack-vectors (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-attack-vector-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.sub-resource-summary/counters (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/summarized-counter-list))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/sub-resource-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.sub-resource-summary/type :portkey.aws.shield.-2016-06-02.sub-resource-summary/id :portkey.aws.shield.-2016-06-02.sub-resource-summary/attack-vectors :portkey.aws.shield.-2016-06-02.sub-resource-summary/counters]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/start-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/end-time (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.subscription/time-commitment-in-seconds (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/duration-in-seconds))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.subscription/start-time :portkey.aws.shield.-2016-06-02.subscription/end-time :portkey.aws.shield.-2016-06-02.subscription/time-commitment-in-seconds :portkey.aws.shield.-2016-06-02/auto-renew :portkey.aws.shield.-2016-06-02/limits]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/summarized-attack-vector-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/summarized-attack-vector))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02/log-bucket] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.time-range/from-inclusive (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.time-range/to-exclusive (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-timestamp))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/time-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.time-range/from-inclusive :portkey.aws.shield.-2016-06-02.time-range/to-exclusive]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/max-results (clojure.spec.alpha/int-in 0 10000))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.describe-attack-response/attack (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/attack-detail))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-attack-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.describe-attack-response/attack]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/limit-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.access-denied-for-dependency-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.access-denied-for-dependency-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/subscription]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.optimistic-lock-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/optimistic-lock-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.optimistic-lock-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-vector-description/vector-type (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-vector-description (clojure.spec.alpha/keys :req-un [:portkey.aws.shield.-2016-06-02.attack-vector-description/vector-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-property-identifier #{"DESTINATION_URL" :source-ip-address "SOURCE_IP_ADDRESS" :source-country :destination-url "REFERRER" "SOURCE_USER_AGENT" :source-asn :referrer "SOURCE_ASN" "SOURCE_COUNTRY" :source-user-agent})

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/describe-drt-access-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/log-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 3 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([a-z]|(\d(?!\d{0,2}\.\d{1,3}\.\d{1,3}\.\d{1,3})))([a-z\d]|(\.(?!(\.|-)))|(-(?!\.))){1,61}[a-z\d]$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/create-protection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protection-id]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/associate-drt-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/email-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^\S+@\S+\.\S+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__)))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/delete-subscription-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/log-bucket-list (clojure.spec.alpha/coll-of :portkey.aws.shield.-2016-06-02/log-bucket :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.attack-property/total (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/attack-property (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/attack-layer :portkey.aws.shield.-2016-06-02/attack-property-identifier :portkey.aws.shield.-2016-06-02/top-contributors :portkey.aws.shield.-2016-06-02/unit :portkey.aws.shield.-2016-06-02.attack-property/total]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.list-protections-response/next-token (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/token))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/list-protections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02/protections :portkey.aws.shield.-2016-06-02.list-protections-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.invalid-pagination-token-exception/message (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/error-message))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/invalid-pagination-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.invalid-pagination-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/protection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 36)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\\-]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.contributor/name (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/string))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02.contributor/value (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/long))
(clojure.spec.alpha/def :portkey.aws.shield.-2016-06-02/contributor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.shield.-2016-06-02.contributor/name :portkey.aws.shield.-2016-06-02.contributor/value]))

(clojure.core/defn delete-protection ([delete-protection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-protection-request delete-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/delete-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/delete-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteProtection", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception}})))))
(clojure.spec.alpha/fdef delete-protection :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/delete-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/delete-protection-response))

(clojure.core/defn associate-drt-log-bucket ([associate-drt-log-bucket-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-drt-log-bucket-request associate-drt-log-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDRTLogBucket", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "NoAssociatedRoleException" :portkey.aws.shield.-2016-06-02/no-associated-role-exception, "LimitsExceededException" :portkey.aws.shield.-2016-06-02/limits-exceeded-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-drt-log-bucket :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/associate-drt-log-bucket-response))

(clojure.core/defn describe-attack ([describe-attack-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-attack-request describe-attack-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-attack-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-attack-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAttack", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef describe-attack :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/describe-attack-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-attack-response))

(clojure.core/defn describe-drt-access ([] (describe-drt-access {})) ([describe-drt-access-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-drt-access-request describe-drt-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-drt-access-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-drt-access-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDRTAccess", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-drt-access :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-drt-access-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-drt-access-response))

(clojure.core/defn create-protection ([create-protection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-protection-request create-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/create-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/create-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateProtection", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidResourceException" :portkey.aws.shield.-2016-06-02/invalid-resource-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "LimitsExceededException" :portkey.aws.shield.-2016-06-02/limits-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.shield.-2016-06-02/resource-already-exists-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-protection :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/create-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/create-protection-response))

(clojure.core/defn describe-protection ([describe-protection-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-protection-request describe-protection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-protection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-protection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeProtection", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-protection :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/describe-protection-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-protection-response))

(clojure.core/defn list-protections ([] (list-protections {})) ([list-protections-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-protections-request list-protections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/list-protections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/list-protections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListProtections", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "InvalidPaginationTokenException" :portkey.aws.shield.-2016-06-02/invalid-pagination-token-exception}})))))
(clojure.spec.alpha/fdef list-protections :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/list-protections-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/list-protections-response))

(clojure.core/defn update-emergency-contact-settings ([] (update-emergency-contact-settings {})) ([update-emergency-contact-settings-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-emergency-contact-settings-request update-emergency-contact-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEmergencyContactSettings", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-emergency-contact-settings :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/update-emergency-contact-settings-response))

(clojure.core/defn describe-emergency-contact-settings ([] (describe-emergency-contact-settings {})) ([describe-emergency-contact-settings-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-emergency-contact-settings-request describe-emergency-contact-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEmergencyContactSettings", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-emergency-contact-settings :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-emergency-contact-settings-response))

(clojure.core/defn disassociate-drt-role ([] (disassociate-drt-role {})) ([disassociate-drt-role-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-drt-role-request disassociate-drt-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDRTRole", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-drt-role :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/disassociate-drt-role-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/disassociate-drt-role-response))

(clojure.core/defn update-subscription ([] (update-subscription {})) ([update-subscription-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-subscription-request update-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/update-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/update-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSubscription", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "LockedSubscriptionException" :portkey.aws.shield.-2016-06-02/locked-subscription-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception}})))))
(clojure.spec.alpha/fdef update-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/update-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/update-subscription-response))

(clojure.core/defn create-subscription ([] (create-subscription {})) ([create-subscription-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-subscription-request create-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/create-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/create-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSubscription", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceAlreadyExistsException" :portkey.aws.shield.-2016-06-02/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/create-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/create-subscription-response))

(clojure.core/defn disassociate-drt-log-bucket ([disassociate-drt-log-bucket-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-disassociate-drt-log-bucket-request disassociate-drt-log-bucket-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateDRTLogBucket", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "NoAssociatedRoleException" :portkey.aws.shield.-2016-06-02/no-associated-role-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef disassociate-drt-log-bucket :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/disassociate-drt-log-bucket-response))

(clojure.core/defn associate-drt-role ([associate-drt-role-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-associate-drt-role-request associate-drt-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/associate-drt-role-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/associate-drt-role-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateDRTRole", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "AccessDeniedForDependencyException" :portkey.aws.shield.-2016-06-02/access-denied-for-dependency-exception, "OptimisticLockException" :portkey.aws.shield.-2016-06-02/optimistic-lock-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef associate-drt-role :args (clojure.spec.alpha/tuple :portkey.aws.shield.-2016-06-02/associate-drt-role-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/associate-drt-role-response))

(clojure.core/defn delete-subscription ([] (delete-subscription {})) ([delete-subscription-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-subscription-request delete-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/delete-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/delete-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSubscription", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "LockedSubscriptionException" :portkey.aws.shield.-2016-06-02/locked-subscription-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/delete-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/delete-subscription-response))

(clojure.core/defn list-attacks ([] (list-attacks {})) ([list-attacks-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-attacks-request list-attacks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/list-attacks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/list-attacks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttacks", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "InvalidParameterException" :portkey.aws.shield.-2016-06-02/invalid-parameter-exception, "InvalidOperationException" :portkey.aws.shield.-2016-06-02/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef list-attacks :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/list-attacks-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/list-attacks-response))

(clojure.core/defn describe-subscription ([] (describe-subscription {})) ([describe-subscription-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-subscription-request describe-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/describe-subscription-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/describe-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSubscription", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception, "ResourceNotFoundException" :portkey.aws.shield.-2016-06-02/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-subscription :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/describe-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/describe-subscription-response))

(clojure.core/defn get-subscription-state ([] (get-subscription-state {})) ([get-subscription-state-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-get-subscription-state-request get-subscription-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.shield.-2016-06-02/endpoints, :http.request.spec/output-spec :portkey.aws.shield.-2016-06-02/get-subscription-state-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-02", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.shield.-2016-06-02/get-subscription-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSubscriptionState", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.shield.-2016-06-02/internal-error-exception}})))))
(clojure.spec.alpha/fdef get-subscription-state :args (clojure.spec.alpha/? :portkey.aws.shield.-2016-06-02/get-subscription-state-request) :ret (clojure.spec.alpha/and :portkey.aws.shield.-2016-06-02/get-subscription-state-response))
