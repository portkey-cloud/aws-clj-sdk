(ns portkey.aws.guardduty (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "guardduty", :region "ap-northeast-1"},
    :ssl-common-name "guardduty.ap-northeast-1.amazonaws.com",
    :endpoint "https://guardduty.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "guardduty", :region "eu-west-1"},
    :ssl-common-name "guardduty.eu-west-1.amazonaws.com",
    :endpoint "https://guardduty.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "guardduty", :region "us-east-2"},
    :ssl-common-name "guardduty.us-east-2.amazonaws.com",
    :endpoint "https://guardduty.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "guardduty", :region "ap-southeast-2"},
    :ssl-common-name "guardduty.ap-southeast-2.amazonaws.com",
    :endpoint "https://guardduty.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "guardduty", :region "sa-east-1"},
    :ssl-common-name "guardduty.sa-east-1.amazonaws.com",
    :endpoint "https://guardduty.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "guardduty", :region "ap-southeast-1"},
    :ssl-common-name "guardduty.ap-southeast-1.amazonaws.com",
    :endpoint "https://guardduty.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "guardduty", :region "ap-northeast-2"},
    :ssl-common-name "guardduty.ap-northeast-2.amazonaws.com",
    :endpoint "https://guardduty.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "guardduty", :region "eu-west-3"},
    :ssl-common-name "guardduty.eu-west-3.amazonaws.com",
    :endpoint "https://guardduty.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "guardduty", :region "ca-central-1"},
    :ssl-common-name "guardduty.ca-central-1.amazonaws.com",
    :endpoint "https://guardduty.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "guardduty", :region "eu-central-1"},
    :ssl-common-name "guardduty.eu-central-1.amazonaws.com",
    :endpoint "https://guardduty.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "guardduty", :region "eu-west-2"},
    :ssl-common-name "guardduty.eu-west-2.amazonaws.com",
    :endpoint "https://guardduty.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "guardduty", :region "us-gov-west-1"},
    :ssl-common-name "guardduty.us-gov-west-1.amazonaws.com",
    :endpoint "https://guardduty.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "guardduty", :region "us-west-2"},
    :ssl-common-name "guardduty.us-west-2.amazonaws.com",
    :endpoint "https://guardduty.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "guardduty", :region "us-east-1"},
    :ssl-common-name "guardduty.us-east-1.amazonaws.com",
    :endpoint "https://guardduty.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "guardduty", :region "us-west-1"},
    :ssl-common-name "guardduty.us-west-1.amazonaws.com",
    :endpoint "https://guardduty.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "guardduty", :region "ap-south-1"},
    :ssl-common-name "guardduty.ap-south-1.amazonaws.com",
    :endpoint "https://guardduty.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-enable)

(clojure.core/declare ser-email)

(clojure.core/declare ser-invitation-id)

(clojure.core/declare ser-ip-set-format)

(clojure.core/declare ser-comments)

(clojure.core/declare ser-filter-rank)

(clojure.core/declare ser-threat-intel-set-format)

(clojure.core/declare ser-string-min-0-max-64)

(clojure.core/declare ser-string)

(clojure.core/declare ser-neq)

(clojure.core/declare ser-location)

(clojure.core/declare ser-finding-ids)

(clojure.core/declare ser-finding-types)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-message)

(clojure.core/declare ser-filter-description)

(clojure.core/declare ser-account-detail)

(clojure.core/declare ser-account-id)

(clojure.core/declare ser-master-id)

(clojure.core/declare ser-eq)

(clojure.core/declare ser-finding-type)

(clojure.core/declare ser-finding-id)

(clojure.core/declare ser-order-by)

(clojure.core/declare ser-account-details)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-finding-statistic-types)

(clojure.core/declare ser-condition)

(clojure.core/declare ser-filter-action)

(clojure.core/declare ser-finding-criteria)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-name)

(clojure.core/declare ser-feedback)

(clojure.core/declare ser-account-ids)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-sort-criteria)

(clojure.core/declare ser-finding-publishing-frequency)

(clojure.core/declare ser-map-of-condition)

(clojure.core/declare ser-finding-statistic-type)

(clojure.core/declare ser-activate)

(clojure.core/defn- ser-enable [input] #:http.request.field{:value input, :shape "Enable"})

(clojure.core/defn- ser-email [input] #:http.request.field{:value input, :shape "Email"})

(clojure.core/defn- ser-invitation-id [input] #:http.request.field{:value input, :shape "InvitationId"})

(clojure.core/defn- ser-ip-set-format [input] #:http.request.field{:value (clojure.core/get {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"} input), :shape "IpSetFormat"})

(clojure.core/defn- ser-comments [input] #:http.request.field{:value input, :shape "Comments"})

(clojure.core/defn- ser-filter-rank [input] #:http.request.field{:value input, :shape "FilterRank"})

(clojure.core/defn- ser-threat-intel-set-format [input] #:http.request.field{:value (clojure.core/get {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"} input), :shape "ThreatIntelSetFormat"})

(clojure.core/defn- ser-string-min-0-max-64 [input] #:http.request.field{:value input, :shape "__stringMin0Max64"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-neq [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "Neq", :type "list"})

(clojure.core/defn- ser-location [input] #:http.request.field{:value input, :shape "Location"})

(clojure.core/defn- ser-finding-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-finding-id coll) #:http.request.field{:shape "FindingId"}))) input), :shape "FindingIds", :type "list"})

(clojure.core/defn- ser-finding-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-finding-type coll) #:http.request.field{:shape "FindingType"}))) input), :shape "FindingTypes", :type "list"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "__boolean"})

(clojure.core/defn- ser-message [input] #:http.request.field{:value input, :shape "Message"})

(clojure.core/defn- ser-filter-description [input] #:http.request.field{:value input, :shape "FilterDescription"})

(clojure.core/defn- ser-account-detail [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-email (:email input)) #:http.request.field{:name "Email", :shape "Email", :location-name "email"}) (clojure.core/into (ser-account-id (:account-id input)) #:http.request.field{:name "AccountId", :shape "AccountId", :location-name "accountId"})], :shape "AccountDetail", :type "structure"}))

(clojure.core/defn- ser-account-id [input] #:http.request.field{:value input, :shape "AccountId"})

(clojure.core/defn- ser-master-id [input] #:http.request.field{:value input, :shape "MasterId"})

(clojure.core/defn- ser-eq [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "Eq", :type "list"})

(clojure.core/defn- ser-finding-type [input] #:http.request.field{:value input, :shape "FindingType"})

(clojure.core/defn- ser-finding-id [input] #:http.request.field{:value input, :shape "FindingId"})

(clojure.core/defn- ser-order-by [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "OrderBy"})

(clojure.core/defn- ser-account-details [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-account-detail coll) #:http.request.field{:shape "AccountDetail"}))) input), :shape "AccountDetails", :type "list"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-finding-statistic-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-finding-statistic-type coll) #:http.request.field{:shape "FindingStatisticType"}))) input), :shape "FindingStatisticTypes", :type "list"})

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Condition", :type "structure"} (clojure.core/contains? input :eq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-eq (input :eq)) #:http.request.field{:name "Eq", :shape "Eq", :location-name "eq"})) (clojure.core/contains? input :gt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :gt)) #:http.request.field{:name "Gt", :shape "__integer", :location-name "gt"})) (clojure.core/contains? input :gte) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :gte)) #:http.request.field{:name "Gte", :shape "__integer", :location-name "gte"})) (clojure.core/contains? input :lt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :lt)) #:http.request.field{:name "Lt", :shape "__integer", :location-name "lt"})) (clojure.core/contains? input :lte) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :lte)) #:http.request.field{:name "Lte", :shape "__integer", :location-name "lte"})) (clojure.core/contains? input :neq) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-neq (input :neq)) #:http.request.field{:name "Neq", :shape "Neq", :location-name "neq"}))))

(clojure.core/defn- ser-filter-action [input] #:http.request.field{:value (clojure.core/get {"NOOP" "NOOP", :noop "NOOP", "ARCHIVE" "ARCHIVE", :archive "ARCHIVE"} input), :shape "FilterAction"})

(clojure.core/defn- ser-finding-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FindingCriteria", :type "structure"} (clojure.core/contains? input :criterion) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-map-of-condition (input :criterion)) #:http.request.field{:name "Criterion", :shape "__mapOfCondition", :location-name "criterion"}))))

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "__integer"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-feedback [input] #:http.request.field{:value (clojure.core/get {"USEFUL" "USEFUL", :useful "USEFUL", "NOT_USEFUL" "NOT_USEFUL", :not-useful "NOT_USEFUL"} input), :shape "Feedback"})

(clojure.core/defn- ser-account-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "AccountIds", :type "list"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-sort-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SortCriteria", :type "structure"} (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "__string", :location-name "attributeName"})) (clojure.core/contains? input :order-by) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-by (input :order-by)) #:http.request.field{:name "OrderBy", :shape "OrderBy", :location-name "orderBy"}))))

(clojure.core/defn- ser-finding-publishing-frequency [input] #:http.request.field{:value (clojure.core/get {"FIFTEEN_MINUTES" "FIFTEEN_MINUTES", :fifteen-minutes "FIFTEEN_MINUTES", "ONE_HOUR" "ONE_HOUR", :one-hour "ONE_HOUR", "SIX_HOURS" "SIX_HOURS", :six-hours "SIX_HOURS"} input), :shape "FindingPublishingFrequency"})

(clojure.core/defn- ser-map-of-condition [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "__string"}) (clojure.core/into (ser-condition v) #:http.request.field{:map-info "value", :shape "Condition"})])) input), :shape "__mapOfCondition", :type "map"})

(clojure.core/defn- ser-finding-statistic-type [input] #:http.request.field{:value (clojure.core/get {"COUNT_BY_SEVERITY" "COUNT_BY_SEVERITY", :count-by-severity "COUNT_BY_SEVERITY"} input), :shape "FindingStatisticType"})

(clojure.core/defn- ser-activate [input] #:http.request.field{:value input, :shape "Activate"})

(clojure.core/defn- req-get-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :filter-name)) #:http.request.field{:name "FilterName", :shape "__string", :location "uri", :location-name "filterName"})]}))

(clojure.core/defn- req-unarchive-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-finding-ids (input :finding-ids)) #:http.request.field{:name "FindingIds", :shape "FindingIds", :location-name "findingIds"})]}))

(clojure.core/defn- req-create-threat-intel-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-threat-intel-set-format (input :format)) #:http.request.field{:name "Format", :shape "ThreatIntelSetFormat", :location-name "format"}) (clojure.core/into (ser-activate (input :activate)) #:http.request.field{:name "Activate", :shape "Activate", :location-name "activate"}) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location", :location-name "location"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name", :location-name "name"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-0-max-64 (input :client-token)) #:http.request.field{:name "ClientToken", :shape "__stringMin0Max64", :location-name "clientToken", :idempotency-token true}))))

(clojure.core/defn- req-start-monitoring-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-invite-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]} (clojure.core/contains? input :disable-email-notification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :disable-email-notification)) #:http.request.field{:name "DisableEmailNotification", :shape "__boolean", :location-name "disableEmailNotification"})) (clojure.core/contains? input :message) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message (input :message)) #:http.request.field{:name "Message", :shape "Message", :location-name "message"}))))

(clojure.core/defn- req-delete-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-list-ip-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-delete-detector-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-archive-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-finding-ids (input :finding-ids)) #:http.request.field{:name "FindingIds", :shape "FindingIds", :location-name "findingIds"})]}))

(clojure.core/defn- req-create-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-finding-criteria (input :finding-criteria)) #:http.request.field{:name "FindingCriteria", :shape "FindingCriteria", :location-name "findingCriteria"}) (clojure.core/into (ser-filter-name (input :name)) #:http.request.field{:name "Name", :shape "FilterName", :location-name "name"})]} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-action (input :action)) #:http.request.field{:name "Action", :shape "FilterAction", :location-name "action"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-0-max-64 (input :client-token)) #:http.request.field{:name "ClientToken", :shape "__stringMin0Max64", :location-name "clientToken", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-description (input :description)) #:http.request.field{:name "Description", :shape "FilterDescription", :location-name "description"})) (clojure.core/contains? input :rank) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rank (input :rank)) #:http.request.field{:name "Rank", :shape "FilterRank", :location-name "rank"}))))

(clojure.core/defn- req-create-sample-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :finding-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-types (input :finding-types)) #:http.request.field{:name "FindingTypes", :shape "FindingTypes", :location-name "findingTypes"}))))

(clojure.core/defn- req-list-threat-intel-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-disassociate-from-master-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-create-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-ip-set-format (input :format)) #:http.request.field{:name "Format", :shape "IpSetFormat", :location-name "format"}) (clojure.core/into (ser-activate (input :activate)) #:http.request.field{:name "Activate", :shape "Activate", :location-name "activate"}) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location", :location-name "location"}) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name", :location-name "name"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-0-max-64 (input :client-token)) #:http.request.field{:name "ClientToken", :shape "__stringMin0Max64", :location-name "clientToken", :idempotency-token true}))))

(clojure.core/defn- req-get-threat-intel-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :threat-intel-set-id)) #:http.request.field{:name "ThreatIntelSetId", :shape "__string", :location "uri", :location-name "threatIntelSetId"}) (clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-list-detectors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-update-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :ip-set-id)) #:http.request.field{:name "IpSetId", :shape "__string", :location "uri", :location-name "ipSetId"})]} (clojure.core/contains? input :activate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activate (input :activate)) #:http.request.field{:name "Activate", :shape "Activate", :location-name "activate"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location", :location-name "location"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name", :location-name "name"}))))

(clojure.core/defn- req-update-threat-intel-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :threat-intel-set-id)) #:http.request.field{:name "ThreatIntelSetId", :shape "__string", :location "uri", :location-name "threatIntelSetId"}) (clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :activate) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activate (input :activate)) #:http.request.field{:name "Activate", :shape "Activate", :location-name "activate"})) (clojure.core/contains? input :location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location (input :location)) #:http.request.field{:name "Location", :shape "Location", :location-name "location"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name", :location-name "name"}))))

(clojure.core/defn- req-list-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :finding-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-criteria (input :finding-criteria)) #:http.request.field{:name "FindingCriteria", :shape "FindingCriteria", :location-name "findingCriteria"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :location-name "nextToken"})) (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-criteria (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortCriteria", :location-name "sortCriteria"}))))

(clojure.core/defn- req-get-master-account-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-list-invitations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-stop-monitoring-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-delete-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :filter-name)) #:http.request.field{:name "FilterName", :shape "__string", :location "uri", :location-name "filterName"})]}))

(clojure.core/defn- req-get-findings-statistics-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-finding-statistic-types (input :finding-statistic-types)) #:http.request.field{:name "FindingStatisticTypes", :shape "FindingStatisticTypes", :location-name "findingStatisticTypes"})]} (clojure.core/contains? input :finding-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-criteria (input :finding-criteria)) #:http.request.field{:name "FindingCriteria", :shape "FindingCriteria", :location-name "findingCriteria"}))))

(clojure.core/defn- req-delete-threat-intel-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :threat-intel-set-id)) #:http.request.field{:name "ThreatIntelSetId", :shape "__string", :location "uri", :location-name "threatIntelSetId"}) (clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-create-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-details (input :account-details)) #:http.request.field{:name "AccountDetails", :shape "AccountDetails", :location-name "accountDetails"})]}))

(clojure.core/defn- req-delete-invitations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-disassociate-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-get-invitations-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-findings-feedback-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-feedback (input :feedback)) #:http.request.field{:name "Feedback", :shape "Feedback", :location-name "feedback"}) (clojure.core/into (ser-finding-ids (input :finding-ids)) #:http.request.field{:name "FindingIds", :shape "FindingIds", :location-name "findingIds"})]} (clojure.core/contains? input :comments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-comments (input :comments)) #:http.request.field{:name "Comments", :shape "Comments", :location-name "comments"}))))

(clojure.core/defn- req-delete-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :ip-set-id)) #:http.request.field{:name "IpSetId", :shape "__string", :location "uri", :location-name "ipSetId"})]}))

(clojure.core/defn- req-update-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :filter-name)) #:http.request.field{:name "FilterName", :shape "__string", :location "uri", :location-name "filterName"})]} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-action (input :action)) #:http.request.field{:name "Action", :shape "FilterAction", :location-name "action"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-description (input :description)) #:http.request.field{:name "Description", :shape "FilterDescription", :location-name "description"})) (clojure.core/contains? input :finding-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-criteria (input :finding-criteria)) #:http.request.field{:name "FindingCriteria", :shape "FindingCriteria", :location-name "findingCriteria"})) (clojure.core/contains? input :rank) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-rank (input :rank)) #:http.request.field{:name "Rank", :shape "FilterRank", :location-name "rank"}))))

(clojure.core/defn- req-decline-invitations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-account-ids (input :account-ids)) #:http.request.field{:name "AccountIds", :shape "AccountIds", :location-name "accountIds"})]}))

(clojure.core/defn- req-create-detector-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-enable (input :enable)) #:http.request.field{:name "Enable", :shape "Enable", :location-name "enable"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-min-0-max-64 (input :client-token)) #:http.request.field{:name "ClientToken", :shape "__stringMin0Max64", :location-name "clientToken", :idempotency-token true})) (clojure.core/contains? input :finding-publishing-frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-publishing-frequency (input :finding-publishing-frequency)) #:http.request.field{:name "FindingPublishingFrequency", :shape "FindingPublishingFrequency", :location-name "findingPublishingFrequency"}))))

(clojure.core/defn- req-accept-invitation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-master-id (input :master-id)) #:http.request.field{:name "MasterId", :shape "MasterId", :location-name "masterId"}) (clojure.core/into (ser-invitation-id (input :invitation-id)) #:http.request.field{:name "InvitationId", :shape "InvitationId", :location-name "invitationId"})]}))

(clojure.core/defn- req-get-detector-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]}))

(clojure.core/defn- req-update-detector-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :enable) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable (input :enable)) #:http.request.field{:name "Enable", :shape "Enable", :location-name "enable"})) (clojure.core/contains? input :finding-publishing-frequency) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-finding-publishing-frequency (input :finding-publishing-frequency)) #:http.request.field{:name "FindingPublishingFrequency", :shape "FindingPublishingFrequency", :location-name "findingPublishingFrequency"}))))

(clojure.core/defn- req-get-ip-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"}) (clojure.core/into (ser-string (input :ip-set-id)) #:http.request.field{:name "IpSetId", :shape "__string", :location "uri", :location-name "ipSetId"})]}))

(clojure.core/defn- req-list-filters-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-list-members-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :only-associated) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :only-associated)) #:http.request.field{:name "OnlyAssociated", :shape "__string", :location "querystring", :location-name "onlyAssociated"}))))

(clojure.core/defn- req-get-findings-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :detector-id)) #:http.request.field{:name "DetectorId", :shape "__string", :location "uri", :location-name "detectorId"})], :body [(clojure.core/into (ser-finding-ids (input :finding-ids)) #:http.request.field{:name "FindingIds", :shape "FindingIds", :location-name "findingIds"})]} (clojure.core/contains? input :sort-criteria) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-criteria (input :sort-criteria)) #:http.request.field{:name "SortCriteria", :shape "SortCriteria", :location-name "sortCriteria"}))))

(clojure.core/declare deser-ip-set-id)

(clojure.core/declare deser-finding)

(clojure.core/declare deser-service-role)

(clojure.core/declare deser-port-probe-action)

(clojure.core/declare deser-email)

(clojure.core/declare deser-ip-set-ids)

(clojure.core/declare deser-country)

(clojure.core/declare deser-unprocessed-account)

(clojure.core/declare deser-ipv-6-addresses)

(clojure.core/declare deser-invitation-id)

(clojure.core/declare deser-organization)

(clojure.core/declare deser-security-group)

(clojure.core/declare deser-port-probe-detail)

(clojure.core/declare deser-ip-set-format)

(clojure.core/declare deser-private-ip-address-details)

(clojure.core/declare deser-filter-rank)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-threat-intel-set-ids)

(clojure.core/declare deser-threat-intel-set-format)

(clojure.core/declare deser-detector-status)

(clojure.core/declare deser-instance-details)

(clojure.core/declare deser-string)

(clojure.core/declare deser-member)

(clojure.core/declare deser-neq)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-location)

(clojure.core/declare deser-members)

(clojure.core/declare deser-finding-ids)

(clojure.core/declare deser-geo-location)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-list-of-port-probe-detail)

(clojure.core/declare deser-domain)

(clojure.core/declare deser-private-dns-name)

(clojure.core/declare deser-local-port-details)

(clojure.core/declare deser-remote-ip-details)

(clojure.core/declare deser-ip-set-status)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-threat-intel-set-status)

(clojure.core/declare deser-domain-details)

(clojure.core/declare deser-dns-request-action)

(clojure.core/declare deser-finding-statistics)

(clojure.core/declare deser-master)

(clojure.core/declare deser-filter-description)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-network-connection-action)

(clojure.core/declare deser-access-key-details)

(clojure.core/declare deser-master-id)

(clojure.core/declare deser-eq)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deser-invitation)

(clojure.core/declare deser-unprocessed-accounts)

(clojure.core/declare deser-map-of-count-by-severity-finding-statistic)

(clojure.core/declare deser-finding-id)

(clojure.core/declare deser-findings)

(clojure.core/declare deser-created-at)

(clojure.core/declare deser-private-ip-addresses)

(clojure.core/declare deser-double)

(clojure.core/declare deser-detector-id)

(clojure.core/declare deser-threat-intel-set-id)

(clojure.core/declare deser-product-codes)

(clojure.core/declare deser-city)

(clojure.core/declare deser-detector-ids)

(clojure.core/declare deser-updated-at)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-condition)

(clojure.core/declare deser-product-code)

(clojure.core/declare deser-filter-action)

(clojure.core/declare deser-finding-criteria)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-service)

(clojure.core/declare deser-name)

(clojure.core/declare deser-remote-port-details)

(clojure.core/declare deser-filter-name)

(clojure.core/declare deser-invited-at)

(clojure.core/declare deser-aws-api-call-action)

(clojure.core/declare deser-ipv-6-address)

(clojure.core/declare deser-invitations)

(clojure.core/declare deser-finding-publishing-frequency)

(clojure.core/declare deser-action)

(clojure.core/declare deser-count-by-severity-finding-statistic)

(clojure.core/declare deser-iam-instance-profile)

(clojure.core/declare deser-filter-names)

(clojure.core/declare deser-map-of-condition)

(clojure.core/declare deser-private-ip-address)

(clojure.core/declare deser-network-interfaces)

(clojure.core/defn- deser-ip-set-id [input] input)

(clojure.core/defn- deser-finding [input] (clojure.core/cond-> {:updated-at (deser-updated-at (input "updatedAt")), :schema-version (deser-string (input "schemaVersion")), :type (deser-string (input "type")), :region (deser-string (input "region")), :account-id (deser-string (input "accountId")), :id (deser-string (input "id")), :resource (deser-resource (input "resource")), :severity (deser-double (input "severity")), :created-at (deser-created-at (input "createdAt")), :arn (deser-string (input "arn"))} (clojure.core/contains? input "title") (clojure.core/assoc :title (deser-string (input "title"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-string (input "description"))) (clojure.core/contains? input "partition") (clojure.core/assoc :partition (deser-string (input "partition"))) (clojure.core/contains? input "service") (clojure.core/assoc :service (deser-service (input "service"))) (clojure.core/contains? input "confidence") (clojure.core/assoc :confidence (deser-double (input "confidence")))))

(clojure.core/defn- deser-service-role [input] input)

(clojure.core/defn- deser-port-probe-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "blocked") (clojure.core/assoc :blocked (deser-boolean (input "blocked"))) (clojure.core/contains? input "portProbeDetails") (clojure.core/assoc :port-probe-details (deser-list-of-port-probe-detail (input "portProbeDetails")))))

(clojure.core/defn- deser-email [input] input)

(clojure.core/defn- deser-ip-set-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-set-id coll))) input))

(clojure.core/defn- deser-country [input] (clojure.core/cond-> {} (clojure.core/contains? input "countryCode") (clojure.core/assoc :country-code (deser-string (input "countryCode"))) (clojure.core/contains? input "countryName") (clojure.core/assoc :country-name (deser-string (input "countryName")))))

(clojure.core/defn- deser-unprocessed-account [input] (clojure.core/cond-> {:account-id (deser-string (input "accountId")), :result (deser-string (input "result"))}))

(clojure.core/defn- deser-ipv-6-addresses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ipv-6-address coll))) input))

(clojure.core/defn- deser-invitation-id [input] input)

(clojure.core/defn- deser-organization [input] (clojure.core/cond-> {} (clojure.core/contains? input "asn") (clojure.core/assoc :asn (deser-string (input "asn"))) (clojure.core/contains? input "asnOrg") (clojure.core/assoc :asn-org (deser-string (input "asnOrg"))) (clojure.core/contains? input "isp") (clojure.core/assoc :isp (deser-string (input "isp"))) (clojure.core/contains? input "org") (clojure.core/assoc :org (deser-string (input "org")))))

(clojure.core/defn- deser-security-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "groupId") (clojure.core/assoc :group-id (deser-string (input "groupId"))) (clojure.core/contains? input "groupName") (clojure.core/assoc :group-name (deser-string (input "groupName")))))

(clojure.core/defn- deser-port-probe-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "localPortDetails") (clojure.core/assoc :local-port-details (deser-local-port-details (input "localPortDetails"))) (clojure.core/contains? input "remoteIpDetails") (clojure.core/assoc :remote-ip-details (deser-remote-ip-details (input "remoteIpDetails")))))

(clojure.core/defn- deser-ip-set-format [input] (clojure.core/get {"TXT" :txt, "STIX" :stix, "OTX_CSV" :otx-csv, "ALIEN_VAULT" :alien-vault, "PROOF_POINT" :proof-point, "FIRE_EYE" :fire-eye} input))

(clojure.core/defn- deser-private-ip-address-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "privateDnsName") (clojure.core/assoc :private-dns-name (deser-private-dns-name (input "privateDnsName"))) (clojure.core/contains? input "privateIpAddress") (clojure.core/assoc :private-ip-address (deser-private-ip-address (input "privateIpAddress")))))

(clojure.core/defn- deser-filter-rank [input] input)

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group coll))) input))

(clojure.core/defn- deser-threat-intel-set-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-threat-intel-set-id coll))) input))

(clojure.core/defn- deser-threat-intel-set-format [input] (clojure.core/get {"TXT" :txt, "STIX" :stix, "OTX_CSV" :otx-csv, "ALIEN_VAULT" :alien-vault, "PROOF_POINT" :proof-point, "FIRE_EYE" :fire-eye} input))

(clojure.core/defn- deser-detector-status [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-instance-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceId") (clojure.core/assoc :instance-id (deser-string (input "instanceId"))) (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-string (input "platform"))) (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-string (input "imageId"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-string (input "instanceType"))) (clojure.core/contains? input "imageDescription") (clojure.core/assoc :image-description (deser-string (input "imageDescription"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "availabilityZone") (clojure.core/assoc :availability-zone (deser-string (input "availabilityZone"))) (clojure.core/contains? input "instanceState") (clojure.core/assoc :instance-state (deser-string (input "instanceState"))) (clojure.core/contains? input "productCodes") (clojure.core/assoc :product-codes (deser-product-codes (input "productCodes"))) (clojure.core/contains? input "launchTime") (clojure.core/assoc :launch-time (deser-string (input "launchTime"))) (clojure.core/contains? input "iamInstanceProfile") (clojure.core/assoc :iam-instance-profile (deser-iam-instance-profile (input "iamInstanceProfile"))) (clojure.core/contains? input "networkInterfaces") (clojure.core/assoc :network-interfaces (deser-network-interfaces (input "networkInterfaces")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-member [input] (clojure.core/cond-> {:email (deser-email (input "email")), :account-id (deser-account-id (input "accountId")), :master-id (deser-master-id (input "masterId")), :updated-at (deser-updated-at (input "updatedAt")), :relationship-status (deser-string (input "relationshipStatus"))} (clojure.core/contains? input "detectorId") (clojure.core/assoc :detector-id (deser-detector-id (input "detectorId"))) (clojure.core/contains? input "invitedAt") (clojure.core/assoc :invited-at (deser-invited-at (input "invitedAt")))))

(clojure.core/defn- deser-neq [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-location [input] input)

(clojure.core/defn- deser-members [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-member coll))) input))

(clojure.core/defn- deser-finding-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-finding-id coll))) input))

(clojure.core/defn- deser-geo-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "lat") (clojure.core/assoc :lat (deser-double (input "lat"))) (clojure.core/contains? input "lon") (clojure.core/assoc :lon (deser-double (input "lon")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-list-of-port-probe-detail [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-port-probe-detail coll))) input))

(clojure.core/defn- deser-domain [input] input)

(clojure.core/defn- deser-private-dns-name [input] input)

(clojure.core/defn- deser-local-port-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-integer (input "port"))) (clojure.core/contains? input "portName") (clojure.core/assoc :port-name (deser-string (input "portName")))))

(clojure.core/defn- deser-remote-ip-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "city") (clojure.core/assoc :city (deser-city (input "city"))) (clojure.core/contains? input "country") (clojure.core/assoc :country (deser-country (input "country"))) (clojure.core/contains? input "geoLocation") (clojure.core/assoc :geo-location (deser-geo-location (input "geoLocation"))) (clojure.core/contains? input "ipAddressV4") (clojure.core/assoc :ip-address-v-4 (deser-string (input "ipAddressV4"))) (clojure.core/contains? input "organization") (clojure.core/assoc :organization (deser-organization (input "organization")))))

(clojure.core/defn- deser-ip-set-status [input] (clojure.core/get {"INACTIVE" :inactive, "ACTIVATING" :activating, "ACTIVE" :active, "DEACTIVATING" :deactivating, "ERROR" :error, "DELETE_PENDING" :delete-pending, "DELETED" :deleted} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-threat-intel-set-status [input] (clojure.core/get {"INACTIVE" :inactive, "ACTIVATING" :activating, "ACTIVE" :active, "DEACTIVATING" :deactivating, "ERROR" :error, "DELETE_PENDING" :delete-pending, "DELETED" :deleted} input))

(clojure.core/defn- deser-domain-details [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-dns-request-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "domain") (clojure.core/assoc :domain (deser-domain (input "domain")))))

(clojure.core/defn- deser-finding-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "countBySeverity") (clojure.core/assoc :count-by-severity (deser-map-of-count-by-severity-finding-statistic (input "countBySeverity")))))

(clojure.core/defn- deser-master [input] (clojure.core/cond-> {} (clojure.core/contains? input "accountId") (clojure.core/assoc :account-id (deser-string (input "accountId"))) (clojure.core/contains? input "invitationId") (clojure.core/assoc :invitation-id (deser-invitation-id (input "invitationId"))) (clojure.core/contains? input "invitedAt") (clojure.core/assoc :invited-at (deser-invited-at (input "invitedAt"))) (clojure.core/contains? input "relationshipStatus") (clojure.core/assoc :relationship-status (deser-string (input "relationshipStatus")))))

(clojure.core/defn- deser-filter-description [input] input)

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-network-connection-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "blocked") (clojure.core/assoc :blocked (deser-boolean (input "blocked"))) (clojure.core/contains? input "connectionDirection") (clojure.core/assoc :connection-direction (deser-string (input "connectionDirection"))) (clojure.core/contains? input "localPortDetails") (clojure.core/assoc :local-port-details (deser-local-port-details (input "localPortDetails"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-string (input "protocol"))) (clojure.core/contains? input "remoteIpDetails") (clojure.core/assoc :remote-ip-details (deser-remote-ip-details (input "remoteIpDetails"))) (clojure.core/contains? input "remotePortDetails") (clojure.core/assoc :remote-port-details (deser-remote-port-details (input "remotePortDetails")))))

(clojure.core/defn- deser-access-key-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "accessKeyId") (clojure.core/assoc :access-key-id (deser-string (input "accessKeyId"))) (clojure.core/contains? input "principalId") (clojure.core/assoc :principal-id (deser-string (input "principalId"))) (clojure.core/contains? input "userName") (clojure.core/assoc :user-name (deser-string (input "userName"))) (clojure.core/contains? input "userType") (clojure.core/assoc :user-type (deser-string (input "userType")))))

(clojure.core/defn- deser-master-id [input] input)

(clojure.core/defn- deser-eq [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "publicDnsName") (clojure.core/assoc :public-dns-name (deser-string (input "publicDnsName"))) (clojure.core/contains? input "publicIp") (clojure.core/assoc :public-ip (deser-string (input "publicIp"))) (clojure.core/contains? input "ipv6Addresses") (clojure.core/assoc :ipv-6-addresses (deser-ipv-6-addresses (input "ipv6Addresses"))) (clojure.core/contains? input "subnetId") (clojure.core/assoc :subnet-id (deser-string (input "subnetId"))) (clojure.core/contains? input "securityGroups") (clojure.core/assoc :security-groups (deser-security-groups (input "securityGroups"))) (clojure.core/contains? input "networkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (input "networkInterfaceId"))) (clojure.core/contains? input "privateDnsName") (clojure.core/assoc :private-dns-name (deser-private-dns-name (input "privateDnsName"))) (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-string (input "vpcId"))) (clojure.core/contains? input "privateIpAddresses") (clojure.core/assoc :private-ip-addresses (deser-private-ip-addresses (input "privateIpAddresses"))) (clojure.core/contains? input "privateIpAddress") (clojure.core/assoc :private-ip-address (deser-private-ip-address (input "privateIpAddress")))))

(clojure.core/defn- deser-invitation [input] (clojure.core/cond-> {} (clojure.core/contains? input "accountId") (clojure.core/assoc :account-id (deser-string (input "accountId"))) (clojure.core/contains? input "invitationId") (clojure.core/assoc :invitation-id (deser-invitation-id (input "invitationId"))) (clojure.core/contains? input "invitedAt") (clojure.core/assoc :invited-at (deser-invited-at (input "invitedAt"))) (clojure.core/contains? input "relationshipStatus") (clojure.core/assoc :relationship-status (deser-string (input "relationshipStatus")))))

(clojure.core/defn- deser-unprocessed-accounts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unprocessed-account coll))) input))

(clojure.core/defn- deser-map-of-count-by-severity-finding-statistic [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-count-by-severity-finding-statistic v)])) input))

(clojure.core/defn- deser-finding-id [input] input)

(clojure.core/defn- deser-findings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-finding coll))) input))

(clojure.core/defn- deser-created-at [input] input)

(clojure.core/defn- deser-private-ip-addresses [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-private-ip-address-details coll))) input))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-detector-id [input] input)

(clojure.core/defn- deser-threat-intel-set-id [input] input)

(clojure.core/defn- deser-product-codes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-product-code coll))) input))

(clojure.core/defn- deser-city [input] (clojure.core/cond-> {} (clojure.core/contains? input "cityName") (clojure.core/assoc :city-name (deser-string (input "cityName")))))

(clojure.core/defn- deser-detector-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-detector-id coll))) input))

(clojure.core/defn- deser-updated-at [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-string (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "accessKeyDetails") (clojure.core/assoc :access-key-details (deser-access-key-details (input "accessKeyDetails"))) (clojure.core/contains? input "instanceDetails") (clojure.core/assoc :instance-details (deser-instance-details (input "instanceDetails"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-string (input "resourceType")))))

(clojure.core/defn- deser-condition [input] (clojure.core/cond-> {} (clojure.core/contains? input "eq") (clojure.core/assoc :eq (deser-eq (input "eq"))) (clojure.core/contains? input "gt") (clojure.core/assoc :gt (deser-integer (input "gt"))) (clojure.core/contains? input "gte") (clojure.core/assoc :gte (deser-integer (input "gte"))) (clojure.core/contains? input "lt") (clojure.core/assoc :lt (deser-integer (input "lt"))) (clojure.core/contains? input "lte") (clojure.core/assoc :lte (deser-integer (input "lte"))) (clojure.core/contains? input "neq") (clojure.core/assoc :neq (deser-neq (input "neq")))))

(clojure.core/defn- deser-product-code [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-string (input "code"))) (clojure.core/contains? input "productType") (clojure.core/assoc :product-type (deser-string (input "productType")))))

(clojure.core/defn- deser-filter-action [input] (clojure.core/get {"NOOP" :noop, "ARCHIVE" :archive} input))

(clojure.core/defn- deser-finding-criteria [input] (clojure.core/cond-> {} (clojure.core/contains? input "criterion") (clojure.core/assoc :criterion (deser-map-of-condition (input "criterion")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "count") (clojure.core/assoc :count (deser-integer (input "count"))) (clojure.core/contains? input "eventFirstSeen") (clojure.core/assoc :event-first-seen (deser-string (input "eventFirstSeen"))) (clojure.core/contains? input "eventLastSeen") (clojure.core/assoc :event-last-seen (deser-string (input "eventLastSeen"))) (clojure.core/contains? input "detectorId") (clojure.core/assoc :detector-id (deser-detector-id (input "detectorId"))) (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-string (input "serviceName"))) (clojure.core/contains? input "resourceRole") (clojure.core/assoc :resource-role (deser-string (input "resourceRole"))) (clojure.core/contains? input "userFeedback") (clojure.core/assoc :user-feedback (deser-string (input "userFeedback"))) (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-action (input "action"))) (clojure.core/contains? input "archived") (clojure.core/assoc :archived (deser-boolean (input "archived")))))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-remote-port-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-integer (input "port"))) (clojure.core/contains? input "portName") (clojure.core/assoc :port-name (deser-string (input "portName")))))

(clojure.core/defn- deser-filter-name [input] input)

(clojure.core/defn- deser-invited-at [input] input)

(clojure.core/defn- deser-aws-api-call-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "api") (clojure.core/assoc :api (deser-string (input "api"))) (clojure.core/contains? input "callerType") (clojure.core/assoc :caller-type (deser-string (input "callerType"))) (clojure.core/contains? input "domainDetails") (clojure.core/assoc :domain-details (deser-domain-details (input "domainDetails"))) (clojure.core/contains? input "remoteIpDetails") (clojure.core/assoc :remote-ip-details (deser-remote-ip-details (input "remoteIpDetails"))) (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-string (input "serviceName")))))

(clojure.core/defn- deser-ipv-6-address [input] input)

(clojure.core/defn- deser-invitations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invitation coll))) input))

(clojure.core/defn- deser-finding-publishing-frequency [input] (clojure.core/get {"FIFTEEN_MINUTES" :fifteen-minutes, "ONE_HOUR" :one-hour, "SIX_HOURS" :six-hours} input))

(clojure.core/defn- deser-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "actionType") (clojure.core/assoc :action-type (deser-string (input "actionType"))) (clojure.core/contains? input "awsApiCallAction") (clojure.core/assoc :aws-api-call-action (deser-aws-api-call-action (input "awsApiCallAction"))) (clojure.core/contains? input "dnsRequestAction") (clojure.core/assoc :dns-request-action (deser-dns-request-action (input "dnsRequestAction"))) (clojure.core/contains? input "networkConnectionAction") (clojure.core/assoc :network-connection-action (deser-network-connection-action (input "networkConnectionAction"))) (clojure.core/contains? input "portProbeAction") (clojure.core/assoc :port-probe-action (deser-port-probe-action (input "portProbeAction")))))

(clojure.core/defn- deser-count-by-severity-finding-statistic [input] input)

(clojure.core/defn- deser-iam-instance-profile [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-filter-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filter-name coll))) input))

(clojure.core/defn- deser-map-of-condition [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-condition v)])) input))

(clojure.core/defn- deser-private-ip-address [input] input)

(clojure.core/defn- deser-network-interfaces [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-interface coll))) input))

(clojure.core/defn- response-create-members-response ([input] (response-create-members-response nil input)) ([resultWrapper1052560 input] (clojure.core/let [rawinput1052559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052561 {"unprocessedAccounts" (rawinput1052559 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052561 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052561 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-internal-server-error-exception ([input] (response-internal-server-error-exception nil input)) ([resultWrapper1052563 input] (clojure.core/let [rawinput1052562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052564 {"message" (rawinput1052562 "message"), "__type" (rawinput1052562 "__type")}] (clojure.core/cond-> {} (letvar1052564 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1052564 ["message"]))) (letvar1052564 "__type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1052564 ["__type"])))))))

(clojure.core/defn- response-delete-detector-response ([input] (response-delete-detector-response nil input)) ([resultWrapper1052566 input] (clojure.core/let [rawinput1052565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052567 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-master-account-response ([input] (response-get-master-account-response nil input)) ([resultWrapper1052569 input] (clojure.core/let [rawinput1052568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052570 {"master" (rawinput1052568 "master")}] (clojure.core/cond-> {} (letvar1052570 "master") (clojure.core/assoc :master (deser-master (clojure.core/get-in letvar1052570 ["master"])))))))

(clojure.core/defn- response-create-detector-response ([input] (response-create-detector-response nil input)) ([resultWrapper1052572 input] (clojure.core/let [rawinput1052571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052573 {"detectorId" (rawinput1052571 "detectorId")}] (clojure.core/cond-> {} (letvar1052573 "detectorId") (clojure.core/assoc :detector-id (deser-detector-id (clojure.core/get-in letvar1052573 ["detectorId"])))))))

(clojure.core/defn- response-update-threat-intel-set-response ([input] (response-update-threat-intel-set-response nil input)) ([resultWrapper1052575 input] (clojure.core/let [rawinput1052574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052576 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-invitations-response ([input] (response-delete-invitations-response nil input)) ([resultWrapper1052578 input] (clojure.core/let [rawinput1052577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052579 {"unprocessedAccounts" (rawinput1052577 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052579 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052579 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1052581 input] (clojure.core/let [rawinput1052580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052582 {"message" (rawinput1052580 "message"), "__type" (rawinput1052580 "__type")}] (clojure.core/cond-> {} (letvar1052582 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1052582 ["message"]))) (letvar1052582 "__type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1052582 ["__type"])))))))

(clojure.core/defn- response-decline-invitations-response ([input] (response-decline-invitations-response nil input)) ([resultWrapper1052584 input] (clojure.core/let [rawinput1052583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052585 {"unprocessedAccounts" (rawinput1052583 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052585 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052585 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-disassociate-members-response ([input] (response-disassociate-members-response nil input)) ([resultWrapper1052587 input] (clojure.core/let [rawinput1052586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052588 {"unprocessedAccounts" (rawinput1052586 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052588 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052588 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-disassociate-from-master-account-response ([input] (response-disassociate-from-master-account-response nil input)) ([resultWrapper1052590 input] (clojure.core/let [rawinput1052589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052591 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-members-response ([input] (response-get-members-response nil input)) ([resultWrapper1052593 input] (clojure.core/let [rawinput1052592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052594 {"members" (rawinput1052592 "members"), "unprocessedAccounts" (rawinput1052592 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052594 "members") (clojure.core/assoc :members (deser-members (clojure.core/get-in letvar1052594 ["members"]))) (letvar1052594 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052594 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-get-threat-intel-set-response ([input] (response-get-threat-intel-set-response nil input)) ([resultWrapper1052596 input] (clojure.core/let [rawinput1052595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052597 {"format" (rawinput1052595 "format"), "location" (rawinput1052595 "location"), "name" (rawinput1052595 "name"), "status" (rawinput1052595 "status")}] (clojure.core/cond-> {} (letvar1052597 "format") (clojure.core/assoc :format (deser-threat-intel-set-format (clojure.core/get-in letvar1052597 ["format"]))) (letvar1052597 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1052597 ["location"]))) (letvar1052597 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1052597 ["name"]))) (letvar1052597 "status") (clojure.core/assoc :status (deser-threat-intel-set-status (clojure.core/get-in letvar1052597 ["status"])))))))

(clojure.core/defn- response-delete-filter-response ([input] (response-delete-filter-response nil input)) ([resultWrapper1052599 input] (clojure.core/let [rawinput1052598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052600 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-archive-findings-response ([input] (response-archive-findings-response nil input)) ([resultWrapper1052602 input] (clojure.core/let [rawinput1052601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052603 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-threat-intel-set-response ([input] (response-delete-threat-intel-set-response nil input)) ([resultWrapper1052605 input] (clojure.core/let [rawinput1052604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052606 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-ip-set-response ([input] (response-update-ip-set-response nil input)) ([resultWrapper1052608 input] (clojure.core/let [rawinput1052607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052609 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-invitations-response ([input] (response-list-invitations-response nil input)) ([resultWrapper1052611 input] (clojure.core/let [rawinput1052610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052612 {"invitations" (rawinput1052610 "invitations"), "nextToken" (rawinput1052610 "nextToken")}] (clojure.core/cond-> {} (letvar1052612 "invitations") (clojure.core/assoc :invitations (deser-invitations (clojure.core/get-in letvar1052612 ["invitations"]))) (letvar1052612 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052612 ["nextToken"])))))))

(clojure.core/defn- response-list-detectors-response ([input] (response-list-detectors-response nil input)) ([resultWrapper1052614 input] (clojure.core/let [rawinput1052613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052615 {"detectorIds" (rawinput1052613 "detectorIds"), "nextToken" (rawinput1052613 "nextToken")}] (clojure.core/cond-> {} (letvar1052615 "detectorIds") (clojure.core/assoc :detector-ids (deser-detector-ids (clojure.core/get-in letvar1052615 ["detectorIds"]))) (letvar1052615 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052615 ["nextToken"])))))))

(clojure.core/defn- response-stop-monitoring-members-response ([input] (response-stop-monitoring-members-response nil input)) ([resultWrapper1052617 input] (clojure.core/let [rawinput1052616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052618 {"unprocessedAccounts" (rawinput1052616 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052618 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052618 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-get-ip-set-response ([input] (response-get-ip-set-response nil input)) ([resultWrapper1052620 input] (clojure.core/let [rawinput1052619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052621 {"format" (rawinput1052619 "format"), "location" (rawinput1052619 "location"), "name" (rawinput1052619 "name"), "status" (rawinput1052619 "status")}] (clojure.core/cond-> {} (letvar1052621 "format") (clojure.core/assoc :format (deser-ip-set-format (clojure.core/get-in letvar1052621 ["format"]))) (letvar1052621 "location") (clojure.core/assoc :location (deser-location (clojure.core/get-in letvar1052621 ["location"]))) (letvar1052621 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1052621 ["name"]))) (letvar1052621 "status") (clojure.core/assoc :status (deser-ip-set-status (clojure.core/get-in letvar1052621 ["status"])))))))

(clojure.core/defn- response-update-filter-response ([input] (response-update-filter-response nil input)) ([resultWrapper1052623 input] (clojure.core/let [rawinput1052622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052624 {"name" (rawinput1052622 "name")}] (clojure.core/cond-> {} (letvar1052624 "name") (clojure.core/assoc :name (deser-filter-name (clojure.core/get-in letvar1052624 ["name"])))))))

(clojure.core/defn- response-delete-ip-set-response ([input] (response-delete-ip-set-response nil input)) ([resultWrapper1052626 input] (clojure.core/let [rawinput1052625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052627 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-findings-feedback-response ([input] (response-update-findings-feedback-response nil input)) ([resultWrapper1052629 input] (clojure.core/let [rawinput1052628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052630 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-filter-response ([input] (response-create-filter-response nil input)) ([resultWrapper1052632 input] (clojure.core/let [rawinput1052631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052633 {"name" (rawinput1052631 "name")}] (clojure.core/cond-> {} (letvar1052633 "name") (clojure.core/assoc :name (deser-filter-name (clojure.core/get-in letvar1052633 ["name"])))))))

(clojure.core/defn- response-unarchive-findings-response ([input] (response-unarchive-findings-response nil input)) ([resultWrapper1052635 input] (clojure.core/let [rawinput1052634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052636 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-invitations-count-response ([input] (response-get-invitations-count-response nil input)) ([resultWrapper1052638 input] (clojure.core/let [rawinput1052637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052639 {"invitationsCount" (rawinput1052637 "invitationsCount")}] (clojure.core/cond-> {} (letvar1052639 "invitationsCount") (clojure.core/assoc :invitations-count (deser-integer (clojure.core/get-in letvar1052639 ["invitationsCount"])))))))

(clojure.core/defn- response-get-detector-response ([input] (response-get-detector-response nil input)) ([resultWrapper1052641 input] (clojure.core/let [rawinput1052640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052642 {"createdAt" (rawinput1052640 "createdAt"), "findingPublishingFrequency" (rawinput1052640 "findingPublishingFrequency"), "serviceRole" (rawinput1052640 "serviceRole"), "status" (rawinput1052640 "status"), "updatedAt" (rawinput1052640 "updatedAt")}] (clojure.core/cond-> {} (letvar1052642 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar1052642 ["createdAt"]))) (letvar1052642 "findingPublishingFrequency") (clojure.core/assoc :finding-publishing-frequency (deser-finding-publishing-frequency (clojure.core/get-in letvar1052642 ["findingPublishingFrequency"]))) (letvar1052642 "serviceRole") (clojure.core/assoc :service-role (deser-service-role (clojure.core/get-in letvar1052642 ["serviceRole"]))) (letvar1052642 "status") (clojure.core/assoc :status (deser-detector-status (clojure.core/get-in letvar1052642 ["status"]))) (letvar1052642 "updatedAt") (clojure.core/assoc :updated-at (deser-updated-at (clojure.core/get-in letvar1052642 ["updatedAt"])))))))

(clojure.core/defn- response-start-monitoring-members-response ([input] (response-start-monitoring-members-response nil input)) ([resultWrapper1052644 input] (clojure.core/let [rawinput1052643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052645 {"unprocessedAccounts" (rawinput1052643 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052645 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052645 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-get-findings-statistics-response ([input] (response-get-findings-statistics-response nil input)) ([resultWrapper1052647 input] (clojure.core/let [rawinput1052646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052648 {"findingStatistics" (rawinput1052646 "findingStatistics")}] (clojure.core/cond-> {} (letvar1052648 "findingStatistics") (clojure.core/assoc :finding-statistics (deser-finding-statistics (clojure.core/get-in letvar1052648 ["findingStatistics"])))))))

(clojure.core/defn- response-create-threat-intel-set-response ([input] (response-create-threat-intel-set-response nil input)) ([resultWrapper1052650 input] (clojure.core/let [rawinput1052649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052651 {"threatIntelSetId" (rawinput1052649 "threatIntelSetId")}] (clojure.core/cond-> {} (letvar1052651 "threatIntelSetId") (clojure.core/assoc :threat-intel-set-id (deser-threat-intel-set-id (clojure.core/get-in letvar1052651 ["threatIntelSetId"])))))))

(clojure.core/defn- response-list-findings-response ([input] (response-list-findings-response nil input)) ([resultWrapper1052653 input] (clojure.core/let [rawinput1052652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052654 {"findingIds" (rawinput1052652 "findingIds"), "nextToken" (rawinput1052652 "nextToken")}] (clojure.core/cond-> {} (letvar1052654 "findingIds") (clojure.core/assoc :finding-ids (deser-finding-ids (clojure.core/get-in letvar1052654 ["findingIds"]))) (letvar1052654 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052654 ["nextToken"])))))))

(clojure.core/defn- response-accept-invitation-response ([input] (response-accept-invitation-response nil input)) ([resultWrapper1052656 input] (clojure.core/let [rawinput1052655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052657 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-findings-response ([input] (response-get-findings-response nil input)) ([resultWrapper1052659 input] (clojure.core/let [rawinput1052658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052660 {"findings" (rawinput1052658 "findings")}] (clojure.core/cond-> {} (letvar1052660 "findings") (clojure.core/assoc :findings (deser-findings (clojure.core/get-in letvar1052660 ["findings"])))))))

(clojure.core/defn- response-delete-members-response ([input] (response-delete-members-response nil input)) ([resultWrapper1052662 input] (clojure.core/let [rawinput1052661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052663 {"unprocessedAccounts" (rawinput1052661 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052663 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052663 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-list-threat-intel-sets-response ([input] (response-list-threat-intel-sets-response nil input)) ([resultWrapper1052665 input] (clojure.core/let [rawinput1052664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052666 {"nextToken" (rawinput1052664 "nextToken"), "threatIntelSetIds" (rawinput1052664 "threatIntelSetIds")}] (clojure.core/cond-> {} (letvar1052666 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052666 ["nextToken"]))) (letvar1052666 "threatIntelSetIds") (clojure.core/assoc :threat-intel-set-ids (deser-threat-intel-set-ids (clojure.core/get-in letvar1052666 ["threatIntelSetIds"])))))))

(clojure.core/defn- response-invite-members-response ([input] (response-invite-members-response nil input)) ([resultWrapper1052668 input] (clojure.core/let [rawinput1052667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052669 {"unprocessedAccounts" (rawinput1052667 "unprocessedAccounts")}] (clojure.core/cond-> {} (letvar1052669 "unprocessedAccounts") (clojure.core/assoc :unprocessed-accounts (deser-unprocessed-accounts (clojure.core/get-in letvar1052669 ["unprocessedAccounts"])))))))

(clojure.core/defn- response-create-sample-findings-response ([input] (response-create-sample-findings-response nil input)) ([resultWrapper1052671 input] (clojure.core/let [rawinput1052670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052672 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-filters-response ([input] (response-list-filters-response nil input)) ([resultWrapper1052674 input] (clojure.core/let [rawinput1052673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052675 {"filterNames" (rawinput1052673 "filterNames"), "nextToken" (rawinput1052673 "nextToken")}] (clojure.core/cond-> {} (letvar1052675 "filterNames") (clojure.core/assoc :filter-names (deser-filter-names (clojure.core/get-in letvar1052675 ["filterNames"]))) (letvar1052675 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052675 ["nextToken"])))))))

(clojure.core/defn- response-get-filter-response ([input] (response-get-filter-response nil input)) ([resultWrapper1052677 input] (clojure.core/let [rawinput1052676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052678 {"action" (rawinput1052676 "action"), "description" (rawinput1052676 "description"), "findingCriteria" (rawinput1052676 "findingCriteria"), "name" (rawinput1052676 "name"), "rank" (rawinput1052676 "rank")}] (clojure.core/cond-> {} (letvar1052678 "action") (clojure.core/assoc :action (deser-filter-action (clojure.core/get-in letvar1052678 ["action"]))) (letvar1052678 "description") (clojure.core/assoc :description (deser-filter-description (clojure.core/get-in letvar1052678 ["description"]))) (letvar1052678 "findingCriteria") (clojure.core/assoc :finding-criteria (deser-finding-criteria (clojure.core/get-in letvar1052678 ["findingCriteria"]))) (letvar1052678 "name") (clojure.core/assoc :name (deser-filter-name (clojure.core/get-in letvar1052678 ["name"]))) (letvar1052678 "rank") (clojure.core/assoc :rank (deser-filter-rank (clojure.core/get-in letvar1052678 ["rank"])))))))

(clojure.core/defn- response-update-detector-response ([input] (response-update-detector-response nil input)) ([resultWrapper1052680 input] (clojure.core/let [rawinput1052679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052681 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-ip-set-response ([input] (response-create-ip-set-response nil input)) ([resultWrapper1052683 input] (clojure.core/let [rawinput1052682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052684 {"ipSetId" (rawinput1052682 "ipSetId")}] (clojure.core/cond-> {} (letvar1052684 "ipSetId") (clojure.core/assoc :ip-set-id (deser-ip-set-id (clojure.core/get-in letvar1052684 ["ipSetId"])))))))

(clojure.core/defn- response-list-members-response ([input] (response-list-members-response nil input)) ([resultWrapper1052686 input] (clojure.core/let [rawinput1052685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052687 {"members" (rawinput1052685 "members"), "nextToken" (rawinput1052685 "nextToken")}] (clojure.core/cond-> {} (letvar1052687 "members") (clojure.core/assoc :members (deser-members (clojure.core/get-in letvar1052687 ["members"]))) (letvar1052687 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052687 ["nextToken"])))))))

(clojure.core/defn- response-list-ip-sets-response ([input] (response-list-ip-sets-response nil input)) ([resultWrapper1052689 input] (clojure.core/let [rawinput1052688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1052690 {"ipSetIds" (rawinput1052688 "ipSetIds"), "nextToken" (rawinput1052688 "nextToken")}] (clojure.core/cond-> {} (letvar1052690 "ipSetIds") (clojure.core/assoc :ip-set-ids (deser-ip-set-ids (clojure.core/get-in letvar1052690 ["ipSetIds"]))) (letvar1052690 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1052690 ["nextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-filter-request/detector-id :portkey.aws.guardduty.get-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.unarchive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/unarchive-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.unarchive-findings-request/detector-id :portkey.aws.guardduty/finding-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-threat-intel-set-request/client-token (clojure.spec.alpha/and :portkey.aws.guardduty/string-min-0-max-64))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-threat-intel-set-request/format (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-threat-intel-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.create-threat-intel-set-request/detector-id :portkey.aws.guardduty.create-threat-intel-set-request/format :portkey.aws.guardduty/activate :portkey.aws.guardduty/location :portkey.aws.guardduty/name] :opt-un [:portkey.aws.guardduty.create-threat-intel-set-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.internal-server-error-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.internal-server-error-exception/message :portkey.aws.guardduty.internal-server-error-exception/type]))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/enable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-detector-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-master-account-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/master]))

(clojure.spec.alpha/def :portkey.aws.guardduty.start-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/start-monitoring-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.start-monitoring-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.finding/severity (clojure.spec.alpha/and :portkey.aws.guardduty/double))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/schema-version (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/title (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/description (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/partition (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/arn (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/region (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/confidence (clojure.spec.alpha/and :portkey.aws.guardduty/double))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.finding/account-id :portkey.aws.guardduty.finding/schema-version :portkey.aws.guardduty/created-at :portkey.aws.guardduty/resource :portkey.aws.guardduty.finding/severity :portkey.aws.guardduty/updated-at :portkey.aws.guardduty.finding/type :portkey.aws.guardduty.finding/region :portkey.aws.guardduty.finding/id :portkey.aws.guardduty.finding/arn] :opt-un [:portkey.aws.guardduty.finding/title :portkey.aws.guardduty.finding/description :portkey.aws.guardduty.finding/partition :portkey.aws.guardduty/service :portkey.aws.guardduty.finding/confidence]))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-detector-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/detector-id]))

(clojure.spec.alpha/def :portkey.aws.guardduty.invite-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.invite-members-request/disable-email-notification (clojure.spec.alpha/and :portkey.aws.guardduty/boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty/invite-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.invite-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un [:portkey.aws.guardduty.invite-members-request/disable-email-notification :portkey.aws.guardduty/message]))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-threat-intel-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.guardduty/service-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.port-probe-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty/boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.port-probe-action/port-probe-details (clojure.spec.alpha/and :portkey.aws.guardduty/list-of-port-probe-detail))
(clojure.spec.alpha/def :portkey.aws.guardduty/port-probe-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.port-probe-action/blocked :portkey.aws.guardduty.port-probe-action/port-probe-details]))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.delete-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-ids (clojure.spec.alpha/coll-of :portkey.aws.guardduty/ip-set-id))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-ip-sets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-ip-sets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-ip-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.list-ip-sets-request/detector-id] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-ip-sets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.country/country-code (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.country/country-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/country (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.country/country-code :portkey.aws.guardduty.country/country-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.bad-request-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.bad-request-exception/message :portkey.aws.guardduty.bad-request-exception/type]))

(clojure.spec.alpha/def :portkey.aws.guardduty.unprocessed-account/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.unprocessed-account/result (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/unprocessed-account (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.unprocessed-account/account-id :portkey.aws.guardduty.unprocessed-account/result] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/ipv-6-addresses (clojure.spec.alpha/coll-of :portkey.aws.guardduty/ipv-6-address))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-detector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.delete-detector-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.archive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/archive-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.archive-findings-request/detector-id :portkey.aws.guardduty/finding-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/decline-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty/invitation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/action (clojure.spec.alpha/and :portkey.aws.guardduty/filter-action))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/client-token (clojure.spec.alpha/and :portkey.aws.guardduty/string-min-0-max-64))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/description (clojure.spec.alpha/and :portkey.aws.guardduty/filter-description))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/name (clojure.spec.alpha/and :portkey.aws.guardduty/filter-name))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-request/rank (clojure.spec.alpha/and :portkey.aws.guardduty/filter-rank))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.create-filter-request/detector-id :portkey.aws.guardduty/finding-criteria :portkey.aws.guardduty.create-filter-request/name] :opt-un [:portkey.aws.guardduty.create-filter-request/action :portkey.aws.guardduty.create-filter-request/client-token :portkey.aws.guardduty.create-filter-request/description :portkey.aws.guardduty.create-filter-request/rank]))

(clojure.spec.alpha/def :portkey.aws.guardduty.organization/asn (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/asn-org (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/isp (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/org (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/organization (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.organization/asn :portkey.aws.guardduty.organization/asn-org :portkey.aws.guardduty.organization/isp :portkey.aws.guardduty.organization/org]))

(clojure.spec.alpha/def :portkey.aws.guardduty.security-group/group-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.security-group/group-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/security-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.security-group/group-id :portkey.aws.guardduty.security-group/group-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty/port-probe-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/local-port-details :portkey.aws.guardduty/remote-ip-details]))

(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-from-master-account-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-sample-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-sample-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.create-sample-findings-request/detector-id] :opt-un [:portkey.aws.guardduty/finding-types]))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-format #{"STIX" "PROOF_POINT" :txt :stix :alien-vault "TXT" :fire-eye "ALIEN_VAULT" :proof-point :otx-csv "OTX_CSV" "FIRE_EYE"})

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-address-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/private-dns-name :portkey.aws.guardduty/private-ip-address]))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-threat-intel-sets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-threat-intel-sets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-threat-intel-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.list-threat-intel-sets-request/detector-id] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-threat-intel-sets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/filter-rank clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty.disassociate-from-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-from-master-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.disassociate-from-master-account-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/security-groups (clojure.spec.alpha/coll-of :portkey.aws.guardduty/security-group))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-ids (clojure.spec.alpha/coll-of :portkey.aws.guardduty/threat-intel-set-id))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-format #{"STIX" "PROOF_POINT" :txt :stix :alien-vault "TXT" :fire-eye "ALIEN_VAULT" :proof-point :otx-csv "OTX_CSV" "FIRE_EYE"})

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-status #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.guardduty/string-min-0-max-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-ip-set-request/client-token (clojure.spec.alpha/and :portkey.aws.guardduty/string-min-0-max-64))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-ip-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-ip-set-request/format (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.create-ip-set-request/detector-id :portkey.aws.guardduty.create-ip-set-request/format :portkey.aws.guardduty/activate :portkey.aws.guardduty/location :portkey.aws.guardduty/name] :opt-un [:portkey.aws.guardduty.create-ip-set-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/members :portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/platform (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/image-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/image-description (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-state (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/launch-time (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/instance-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.instance-details/instance-id :portkey.aws.guardduty.instance-details/platform :portkey.aws.guardduty.instance-details/image-id :portkey.aws.guardduty.instance-details/instance-type :portkey.aws.guardduty.instance-details/image-description :portkey.aws.guardduty/tags :portkey.aws.guardduty.instance-details/availability-zone :portkey.aws.guardduty.instance-details/instance-state :portkey.aws.guardduty/product-codes :portkey.aws.guardduty.instance-details/launch-time :portkey.aws.guardduty/iam-instance-profile :portkey.aws.guardduty/network-interfaces]))

(clojure.spec.alpha/def :portkey.aws.guardduty/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-threat-intel-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-threat-intel-set-request/threat-intel-set-id :portkey.aws.guardduty.get-threat-intel-set-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.member/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/member (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty/email :portkey.aws.guardduty/account-id :portkey.aws.guardduty/master-id :portkey.aws.guardduty/updated-at :portkey.aws.guardduty.member/relationship-status] :opt-un [:portkey.aws.guardduty/detector-id :portkey.aws.guardduty/invited-at]))

(clojure.spec.alpha/def :portkey.aws.guardduty/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-response/format (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-threat-intel-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.get-threat-intel-set-response/format :portkey.aws.guardduty/location :portkey.aws.guardduty/name :portkey.aws.guardduty.get-threat-intel-set-response/status]))

(clojure.spec.alpha/def :portkey.aws.guardduty/neq (clojure.spec.alpha/coll-of :portkey.aws.guardduty/string))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-detectors-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-detectors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-detectors-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/tags (clojure.spec.alpha/coll-of :portkey.aws.guardduty/tag))

(clojure.spec.alpha/def :portkey.aws.guardduty/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/archive-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-threat-intel-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/members (clojure.spec.alpha/coll-of :portkey.aws.guardduty/member))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-ids (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-id))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-ip-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.update-ip-set-request/detector-id :portkey.aws.guardduty.update-ip-set-request/ip-set-id] :opt-un [:portkey.aws.guardduty/activate :portkey.aws.guardduty/location :portkey.aws.guardduty/name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.geo-location/lat (clojure.spec.alpha/and :portkey.aws.guardduty/double))
(clojure.spec.alpha/def :portkey.aws.guardduty.geo-location/lon (clojure.spec.alpha/and :portkey.aws.guardduty/double))
(clojure.spec.alpha/def :portkey.aws.guardduty/geo-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.geo-location/lat :portkey.aws.guardduty.geo-location/lon]))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/invitations :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-threat-intel-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.update-threat-intel-set-request/threat-intel-set-id :portkey.aws.guardduty.update-threat-intel-set-request/detector-id] :opt-un [:portkey.aws.guardduty/activate :portkey.aws.guardduty/location :portkey.aws.guardduty/name]))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-types (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-type))

(clojure.spec.alpha/def :portkey.aws.guardduty/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-detectors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/detector-ids :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/stop-monitoring-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.list-findings-request/detector-id] :opt-un [:portkey.aws.guardduty/finding-criteria :portkey.aws.guardduty/max-results :portkey.aws.guardduty/next-token :portkey.aws.guardduty/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-ip-set-response/format (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-ip-set-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.get-ip-set-response/format :portkey.aws.guardduty/location :portkey.aws.guardduty/name :portkey.aws.guardduty.get-ip-set-response/status]))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-of-port-probe-detail (clojure.spec.alpha/coll-of :portkey.aws.guardduty/port-probe-detail))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-response/name (clojure.spec.alpha/and :portkey.aws.guardduty/filter-name))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.update-filter-response/name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-master-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-master-account-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-invitations-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-invitations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-invitations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.local-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.local-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/local-port-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.local-port-details/port :portkey.aws.guardduty.local-port-details/port-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.remote-ip-details/ip-address-v-4 (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/remote-ip-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/city :portkey.aws.guardduty/country :portkey.aws.guardduty/geo-location :portkey.aws.guardduty.remote-ip-details/ip-address-v-4 :portkey.aws.guardduty/organization]))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-status #{:inactive :deleted "DEACTIVATING" "ACTIVATING" :delete-pending "ERROR" :active "INACTIVE" "ACTIVE" "DELETE_PENDING" :error "DELETED" :deactivating :activating})

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-status #{:inactive :deleted "DEACTIVATING" "ACTIVATING" :delete-pending "ERROR" :active "INACTIVE" "ACTIVE" "DELETE_PENDING" :error "DELETED" :deactivating :activating})

(clojure.spec.alpha/def :portkey.aws.guardduty/domain-details (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/dns-request-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/domain]))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-findings-feedback-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.finding-statistics/count-by-severity (clojure.spec.alpha/and :portkey.aws.guardduty/map-of-count-by-severity-finding-statistic))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.finding-statistics/count-by-severity]))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-filter-response/name (clojure.spec.alpha/and :portkey.aws.guardduty/filter-name))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.create-filter-response/name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.master/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.master/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/master (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.master/account-id :portkey.aws.guardduty/invitation-id :portkey.aws.guardduty/invited-at :portkey.aws.guardduty.master/relationship-status]))

(clojure.spec.alpha/def :portkey.aws.guardduty/filter-description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.stop-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/stop-monitoring-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.stop-monitoring-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty/email :portkey.aws.guardduty/account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-filter-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.delete-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.delete-filter-request/detector-id :portkey.aws.guardduty.delete-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-findings-statistics-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-statistics-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-findings-statistics-request/detector-id :portkey.aws.guardduty/finding-statistic-types] :opt-un [:portkey.aws.guardduty/finding-criteria]))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty/boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/connection-direction (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/protocol (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/network-connection-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.network-connection-action/blocked :portkey.aws.guardduty.network-connection-action/connection-direction :portkey.aws.guardduty/local-port-details :portkey.aws.guardduty.network-connection-action/protocol :portkey.aws.guardduty/remote-ip-details :portkey.aws.guardduty/remote-port-details]))

(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/access-key-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/principal-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/user-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/user-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/access-key-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.access-key-details/access-key-id :portkey.aws.guardduty.access-key-details/principal-id :portkey.aws.guardduty.access-key-details/user-name :portkey.aws.guardduty.access-key-details/user-type]))

(clojure.spec.alpha/def :portkey.aws.guardduty/master-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/eq (clojure.spec.alpha/coll-of :portkey.aws.guardduty/string))

(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/public-dns-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/public-ip (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/vpc-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.network-interface/public-dns-name :portkey.aws.guardduty.network-interface/public-ip :portkey.aws.guardduty/ipv-6-addresses :portkey.aws.guardduty.network-interface/subnet-id :portkey.aws.guardduty/security-groups :portkey.aws.guardduty/network-interface-id :portkey.aws.guardduty/private-dns-name :portkey.aws.guardduty.network-interface/vpc-id :portkey.aws.guardduty/private-ip-addresses :portkey.aws.guardduty/private-ip-address]))

(clojure.spec.alpha/def :portkey.aws.guardduty/unarchive-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.delete-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-threat-intel-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.delete-threat-intel-set-request/threat-intel-set-id :portkey.aws.guardduty.delete-threat-intel-set-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-invitations-count-response/invitations-count (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-invitations-count-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.get-invitations-count-response/invitations-count]))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.create-members-request/detector-id :portkey.aws.guardduty/account-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.invitation/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.invitation/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/invitation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.invitation/account-id :portkey.aws.guardduty/invitation-id :portkey.aws.guardduty/invited-at :portkey.aws.guardduty.invitation/relationship-status]))

(clojure.spec.alpha/def :portkey.aws.guardduty/unprocessed-accounts (clojure.spec.alpha/coll-of :portkey.aws.guardduty/unprocessed-account))

(clojure.spec.alpha/def :portkey.aws.guardduty/map-of-count-by-severity-finding-statistic (clojure.spec.alpha/map-of :portkey.aws.guardduty/string :portkey.aws.guardduty/count-by-severity-finding-statistic))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-invitations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.disassociate-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.disassociate-members-request/detector-id :portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-detector-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/detector-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-detector-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/created-at :portkey.aws.guardduty/finding-publishing-frequency :portkey.aws.guardduty/service-role :portkey.aws.guardduty.get-detector-response/status :portkey.aws.guardduty/updated-at]))

(clojure.spec.alpha/def :portkey.aws.guardduty/findings (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding))

(clojure.spec.alpha/def :portkey.aws.guardduty/created-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/start-monitoring-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-invitations-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-addresses (clojure.spec.alpha/coll-of :portkey.aws.guardduty/private-ip-address-details))

(clojure.spec.alpha/def :portkey.aws.guardduty/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-statistics-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/finding-statistics]))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-findings-feedback-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-findings-feedback-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.update-findings-feedback-request/detector-id :portkey.aws.guardduty/feedback :portkey.aws.guardduty/finding-ids] :opt-un [:portkey.aws.guardduty/comments]))

(clojure.spec.alpha/def :portkey.aws.guardduty/order-by #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.guardduty/account-details (clojure.spec.alpha/coll-of :portkey.aws.guardduty/account-detail))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-threat-intel-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/threat-intel-set-id]))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-ip-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.delete-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.delete-ip-set-request/detector-id :portkey.aws.guardduty.delete-ip-set-request/ip-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/product-codes (clojure.spec.alpha/coll-of :portkey.aws.guardduty/product-code))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/finding-ids :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/accept-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.city/city-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/city (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.city/city-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-ids (clojure.spec.alpha/coll-of :portkey.aws.guardduty/detector-id))

(clojure.spec.alpha/def :portkey.aws.guardduty/updated-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/findings]))

(clojure.spec.alpha/def :portkey.aws.guardduty/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.guardduty.tag/key (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.tag/value (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.tag/key :portkey.aws.guardduty.tag/value]))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistic-types (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-statistic-type))

(clojure.spec.alpha/def :portkey.aws.guardduty.resource/resource-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/access-key-details :portkey.aws.guardduty/instance-details :portkey.aws.guardduty.resource/resource-type]))

(clojure.spec.alpha/def :portkey.aws.guardduty.condition/gt (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/gte (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/lt (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/lte (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty/condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/eq :portkey.aws.guardduty.condition/gt :portkey.aws.guardduty.condition/gte :portkey.aws.guardduty.condition/lt :portkey.aws.guardduty.condition/lte :portkey.aws.guardduty/neq]))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty.product-code/code (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.product-code/product-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/product-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.product-code/code :portkey.aws.guardduty.product-code/product-type]))

(clojure.spec.alpha/def :portkey.aws.guardduty/filter-action #{:noop "NOOP" "ARCHIVE" :archive})

(clojure.spec.alpha/def :portkey.aws.guardduty.finding-criteria/criterion (clojure.spec.alpha/and :portkey.aws.guardduty/map-of-condition))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.finding-criteria/criterion]))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-request/action (clojure.spec.alpha/and :portkey.aws.guardduty/filter-action))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-request/description (clojure.spec.alpha/and :portkey.aws.guardduty/filter-description))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-filter-request/rank (clojure.spec.alpha/and :portkey.aws.guardduty/filter-rank))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.update-filter-request/detector-id :portkey.aws.guardduty.update-filter-request/filter-name] :opt-un [:portkey.aws.guardduty.update-filter-request/action :portkey.aws.guardduty.update-filter-request/description :portkey.aws.guardduty/finding-criteria :portkey.aws.guardduty.update-filter-request/rank]))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-threat-intel-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/next-token :portkey.aws.guardduty/threat-intel-set-ids]))

(clojure.spec.alpha/def :portkey.aws.guardduty/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty/decline-invitations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty/account-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-detector-request/client-token (clojure.spec.alpha/and :portkey.aws.guardduty/string-min-0-max-64))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-detector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty/enable] :opt-un [:portkey.aws.guardduty.create-detector-request/client-token :portkey.aws.guardduty/finding-publishing-frequency]))

(clojure.spec.alpha/def :portkey.aws.guardduty.service/count (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/event-first-seen (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/event-last-seen (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/service-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/resource-role (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/user-feedback (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/archived (clojure.spec.alpha/and :portkey.aws.guardduty/boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.service/count :portkey.aws.guardduty.service/event-first-seen :portkey.aws.guardduty.service/event-last-seen :portkey.aws.guardduty/detector-id :portkey.aws.guardduty.service/service-name :portkey.aws.guardduty.service/resource-role :portkey.aws.guardduty.service/user-feedback :portkey.aws.guardduty/action :portkey.aws.guardduty.service/archived]))

(clojure.spec.alpha/def :portkey.aws.guardduty/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.remote-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty/integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.remote-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/remote-port-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.remote-port-details/port :portkey.aws.guardduty.remote-port-details/port-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty/feedback #{"USEFUL" :useful "NOT_USEFUL" :not-useful})

(clojure.spec.alpha/def :portkey.aws.guardduty/account-ids (clojure.spec.alpha/coll-of :portkey.aws.guardduty/string))

(clojure.spec.alpha/def :portkey.aws.guardduty/invite-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/unprocessed-accounts]))

(clojure.spec.alpha/def :portkey.aws.guardduty/filter-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/invited-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/api (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/caller-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/service-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/aws-api-call-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.aws-api-call-action/api :portkey.aws.guardduty.aws-api-call-action/caller-type :portkey.aws.guardduty/domain-details :portkey.aws.guardduty/remote-ip-details :portkey.aws.guardduty.aws-api-call-action/service-name]))

(clojure.spec.alpha/def :portkey.aws.guardduty.error-response/message (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.error-response/type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/error-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.error-response/message :portkey.aws.guardduty.error-response/type]))

(clojure.spec.alpha/def :portkey.aws.guardduty/ipv-6-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.sort-criteria/attribute-name (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/sort-criteria (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.sort-criteria/attribute-name :portkey.aws.guardduty/order-by]))

(clojure.spec.alpha/def :portkey.aws.guardduty/invitations (clojure.spec.alpha/coll-of :portkey.aws.guardduty/invitation))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-publishing-frequency #{"FIFTEEN_MINUTES" :six-hours :fifteen-minutes "SIX_HOURS" "ONE_HOUR" :one-hour})

(clojure.spec.alpha/def :portkey.aws.guardduty/create-sample-findings-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.accept-invitation-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/accept-invitation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.accept-invitation-request/detector-id :portkey.aws.guardduty/master-id :portkey.aws.guardduty/invitation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.action/action-type (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.action/action-type :portkey.aws.guardduty/aws-api-call-action :portkey.aws.guardduty/dns-request-action :portkey.aws.guardduty/network-connection-action :portkey.aws.guardduty/port-probe-action]))

(clojure.spec.alpha/def :portkey.aws.guardduty/count-by-severity-finding-statistic clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty.get-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-detector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-detector-request/detector-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-detector-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.update-detector-request/detector-id] :opt-un [:portkey.aws.guardduty/enable :portkey.aws.guardduty/finding-publishing-frequency]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-ip-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-ip-set-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-ip-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-ip-set-request/detector-id :portkey.aws.guardduty.get-ip-set-request/ip-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-filters-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-filters-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-filters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.list-filters-request/detector-id] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-filters-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-filters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/filter-names :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.iam-instance-profile/arn (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.iam-instance-profile/id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/iam-instance-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.iam-instance-profile/arn :portkey.aws.guardduty.iam-instance-profile/id]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-response/action (clojure.spec.alpha/and :portkey.aws.guardduty/filter-action))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-response/description (clojure.spec.alpha/and :portkey.aws.guardduty/filter-description))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-response/name (clojure.spec.alpha/and :portkey.aws.guardduty/filter-name))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-filter-response/rank (clojure.spec.alpha/and :portkey.aws.guardduty/filter-rank))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty.get-filter-response/action :portkey.aws.guardduty.get-filter-response/description :portkey.aws.guardduty/finding-criteria :portkey.aws.guardduty.get-filter-response/name :portkey.aws.guardduty.get-filter-response/rank]))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-detector-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-ip-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/ip-set-id]))

(clojure.spec.alpha/def :portkey.aws.guardduty/filter-names (clojure.spec.alpha/coll-of :portkey.aws.guardduty/filter-name))

(clojure.spec.alpha/def :portkey.aws.guardduty/map-of-condition (clojure.spec.alpha/map-of :portkey.aws.guardduty/string :portkey.aws.guardduty/condition))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-members-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/members :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/only-associated (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-members-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.list-members-request/detector-id] :opt-un [:portkey.aws.guardduty/max-results :portkey.aws.guardduty.list-members-request/next-token :portkey.aws.guardduty.list-members-request/only-associated]))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistic-type #{:count-by-severity "COUNT_BY_SEVERITY"})

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/network-interfaces (clojure.spec.alpha/coll-of :portkey.aws.guardduty/network-interface))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-ip-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.guardduty/ip-set-ids :portkey.aws.guardduty/next-token]))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-request (clojure.spec.alpha/keys :req-un [:portkey.aws.guardduty.get-findings-request/detector-id :portkey.aws.guardduty/finding-ids] :opt-un [:portkey.aws.guardduty/sort-criteria]))

(clojure.spec.alpha/def :portkey.aws.guardduty/activate clojure.core/boolean?)

(clojure.core/defn create-filter "Creates a filter using the specified finding criteria." ([create-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-filter-request create-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFilter", :http.request.configuration/output-deser-fn response-create-filter-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-filter-response))

(clojure.core/defn get-invitations-count "Returns the count of all GuardDuty membership invitations that were sent to the\ncurrent member account except the currently accepted invitation." ([] (get-invitations-count {})) ([get-invitations-count-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invitations-count-request get-invitations-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-invitations-count-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/count", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-invitations-count-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvitationsCount", :http.request.configuration/output-deser-fn response-get-invitations-count-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-invitations-count :args (clojure.spec.alpha/? :portkey.aws.guardduty/get-invitations-count-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-invitations-count-response))

(clojure.core/defn create-threat-intel-set "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP\naddresses. GuardDuty generates findings based on ThreatIntelSets." ([create-threat-intel-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-threat-intel-set-request create-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateThreatIntelSet", :http.request.configuration/output-deser-fn response-create-threat-intel-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-threat-intel-set-response))

(clojure.core/defn update-ip-set "Updates the IPSet specified by the IPSet ID." ([update-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-ip-set-request update-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/update-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateIPSet", :http.request.configuration/output-deser-fn response-update-ip-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-ip-set-response))

(clojure.core/defn get-members "Retrieves GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([get-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-members-request get-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/get", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMembers", :http.request.configuration/output-deser-fn response-get-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-members-response))

(clojure.core/defn get-ip-set "Retrieves the IPSet specified by the IPSet ID." ([get-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-ip-set-request get-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIPSet", :http.request.configuration/output-deser-fn response-get-ip-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-ip-set-response))

(clojure.core/defn get-filter "Returns the details of the filter specified by the filter name." ([get-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-filter-request get-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFilter", :http.request.configuration/output-deser-fn response-get-filter-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-filter-response))

(clojure.core/defn list-findings "Lists Amazon GuardDuty findings for the specified detector ID." ([list-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-findings-request list-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFindings", :http.request.configuration/output-deser-fn response-list-findings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-findings-response))

(clojure.core/defn get-threat-intel-set "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID." ([get-threat-intel-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-threat-intel-set-request get-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetThreatIntelSet", :http.request.configuration/output-deser-fn response-get-threat-intel-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-threat-intel-set-response))

(clojure.core/defn update-findings-feedback "Marks specified Amazon GuardDuty findings as useful or not useful." ([update-findings-feedback-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-findings-feedback-request update-findings-feedback-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/update-findings-feedback-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/feedback", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-findings-feedback-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFindingsFeedback", :http.request.configuration/output-deser-fn response-update-findings-feedback-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-findings-feedback :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-findings-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-findings-feedback-response))

(clojure.core/defn decline-invitations "Declines invitations sent to the current member account by AWS account specified\nby their account IDs." ([decline-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-decline-invitations-request decline-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/decline-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/decline", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/decline-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeclineInvitations", :http.request.configuration/output-deser-fn response-decline-invitations-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef decline-invitations :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/decline-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/decline-invitations-response))

(clojure.core/defn create-sample-findings "Generates example findings of types specified by the list of finding types. If\n'NULL' is specified for findingTypes, the API generates example findings of all\nsupported finding types." ([create-sample-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-sample-findings-request create-sample-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-sample-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/create", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-sample-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSampleFindings", :http.request.configuration/output-deser-fn response-create-sample-findings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-sample-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-sample-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-sample-findings-response))

(clojure.core/defn get-master-account "Provides the details for the GuardDuty master account to the current GuardDuty\nmember account." ([get-master-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-master-account-request get-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetMasterAccount", :http.request.configuration/output-deser-fn response-get-master-account-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-master-account-response))

(clojure.core/defn create-detector "Creates a single Amazon GuardDuty detector. A detector is an object that\nrepresents the GuardDuty service. A detector must be created in order for\nGuardDuty to become operational." ([create-detector-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-detector-request create-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDetector", :http.request.configuration/output-deser-fn response-create-detector-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-detector-response))

(clojure.core/defn disassociate-members "Disassociates GuardDuty member accounts (to the current GuardDuty master\naccount) specified by the account IDs." ([disassociate-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-members-request disassociate-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/disassociate-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/disassociate", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/disassociate-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateMembers", :http.request.configuration/output-deser-fn response-disassociate-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-members-response))

(clojure.core/defn delete-threat-intel-set "Deletes ThreatIntelSet specified by the ThreatIntelSet ID." ([delete-threat-intel-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-threat-intel-set-request delete-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteThreatIntelSet", :http.request.configuration/output-deser-fn response-delete-threat-intel-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-threat-intel-set-response))

(clojure.core/defn list-threat-intel-sets "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID." ([list-threat-intel-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-threat-intel-sets-request list-threat-intel-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-threat-intel-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-threat-intel-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListThreatIntelSets", :http.request.configuration/output-deser-fn response-list-threat-intel-sets-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-threat-intel-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-threat-intel-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-threat-intel-sets-response))

(clojure.core/defn update-detector "Updates an Amazon GuardDuty detector specified by the detectorId." ([update-detector-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-detector-request update-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/update-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDetector", :http.request.configuration/output-deser-fn response-update-detector-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-detector-response))

(clojure.core/defn get-detector "Retrieves an Amazon GuardDuty detector specified by the detectorId." ([get-detector-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-detector-request get-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDetector", :http.request.configuration/output-deser-fn response-get-detector-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-detector-response))

(clojure.core/defn invite-members "Invites other AWS accounts (created as members of the current AWS account by\nCreateMembers) to enable GuardDuty and allow the current AWS account to view and\nmanage these accounts' GuardDuty findings on their behalf as the master account." ([invite-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-invite-members-request invite-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/invite-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/invite", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/invite-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InviteMembers", :http.request.configuration/output-deser-fn response-invite-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef invite-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/invite-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/invite-members-response))

(clojure.core/defn create-ip-set "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted\nfor secure communication with AWS infrastructure and applications." ([create-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-ip-set-request create-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIPSet", :http.request.configuration/output-deser-fn response-create-ip-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-ip-set-response))

(clojure.core/defn update-threat-intel-set "Updates the ThreatIntelSet specified by ThreatIntelSet ID." ([update-threat-intel-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-threat-intel-set-request update-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/update-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateThreatIntelSet", :http.request.configuration/output-deser-fn response-update-threat-intel-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-threat-intel-set-response))

(clojure.core/defn list-invitations "Lists all GuardDuty membership invitations that were sent to the current AWS\naccount." ([] (list-invitations {})) ([list-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invitations-request list-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvitations", :http.request.configuration/output-deser-fn response-list-invitations-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-invitations-response))

(clojure.core/defn disassociate-from-master-account "Disassociates the current GuardDuty member account from its master account." ([disassociate-from-master-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-from-master-account-request disassociate-from-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/disassociate-from-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master/disassociate", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/disassociate-from-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateFromMasterAccount", :http.request.configuration/output-deser-fn response-disassociate-from-master-account-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-from-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-from-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-from-master-account-response))

(clojure.core/defn archive-findings "Archives Amazon GuardDuty findings specified by the list of finding IDs." ([archive-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-archive-findings-request archive-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/archive-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/archive", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/archive-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ArchiveFindings", :http.request.configuration/output-deser-fn response-archive-findings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef archive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/archive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/archive-findings-response))

(clojure.core/defn stop-monitoring-members "Disables GuardDuty from monitoring findings of the member accounts specified by\nthe account IDs. After running this command, a master GuardDuty account can run\nStartMonitoringMembers to re-enable GuardDuty to monitor these members’\nfindings." ([stop-monitoring-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-monitoring-members-request stop-monitoring-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/stop-monitoring-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/stop", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/stop-monitoring-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopMonitoringMembers", :http.request.configuration/output-deser-fn response-stop-monitoring-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef stop-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/stop-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/stop-monitoring-members-response))

(clojure.core/defn start-monitoring-members "Re-enables GuardDuty to monitor findings of the member accounts specified by the\naccount IDs. A master GuardDuty account can run this command after disabling\nGuardDuty from monitoring these members' findings by running\nStopMonitoringMembers." ([start-monitoring-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-monitoring-members-request start-monitoring-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/start-monitoring-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/start", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/start-monitoring-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartMonitoringMembers", :http.request.configuration/output-deser-fn response-start-monitoring-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef start-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/start-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/start-monitoring-members-response))

(clojure.core/defn delete-ip-set "Deletes the IPSet specified by the IPSet ID." ([delete-ip-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-ip-set-request delete-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIPSet", :http.request.configuration/output-deser-fn response-delete-ip-set-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-ip-set-response))

(clojure.core/defn get-findings-statistics "Lists Amazon GuardDuty findings' statistics for the specified detector ID." ([get-findings-statistics-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-findings-statistics-request get-findings-statistics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-findings-statistics-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/statistics", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-findings-statistics-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFindingsStatistics", :http.request.configuration/output-deser-fn response-get-findings-statistics-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-findings-statistics :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-statistics-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-statistics-response))

(clojure.core/defn delete-filter "Deletes the filter specified by the filter name." ([delete-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-filter-request delete-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFilter", :http.request.configuration/output-deser-fn response-delete-filter-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-filter-response))

(clojure.core/defn accept-invitation "Accepts the invitation to be monitored by a master GuardDuty account." ([accept-invitation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-accept-invitation-request accept-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/accept-invitation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/accept-invitation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptInvitation", :http.request.configuration/output-deser-fn response-accept-invitation-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef accept-invitation :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/accept-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/accept-invitation-response))

(clojure.core/defn create-members "Creates member accounts of the current AWS account by specifying a list of AWS\naccount IDs. The current AWS account can then invite these members to manage\nGuardDuty in their accounts." ([create-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-members-request create-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/create-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateMembers", :http.request.configuration/output-deser-fn response-create-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-members-response))

(clojure.core/defn unarchive-findings "Unarchives Amazon GuardDuty findings specified by the list of finding IDs." ([unarchive-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-unarchive-findings-request unarchive-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/unarchive-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/unarchive", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/unarchive-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UnarchiveFindings", :http.request.configuration/output-deser-fn response-unarchive-findings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef unarchive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/unarchive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/unarchive-findings-response))

(clojure.core/defn update-filter "Updates the filter specified by the filter name." ([update-filter-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-filter-request update-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/update-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFilter", :http.request.configuration/output-deser-fn response-update-filter-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-filter-response))

(clojure.core/defn list-members "Lists details about all member accounts for the current GuardDuty master\naccount." ([list-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-members-request list-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMembers", :http.request.configuration/output-deser-fn response-list-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-members-response))

(clojure.core/defn delete-invitations "Deletes invitations sent to the current member account by AWS accounts specified\nby their account IDs." ([delete-invitations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-invitations-request delete-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/delete", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInvitations", :http.request.configuration/output-deser-fn response-delete-invitations-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-invitations :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-invitations-response))

(clojure.core/defn list-filters "Returns a paginated list of the current filters." ([list-filters-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-filters-request list-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-filters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-filters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFilters", :http.request.configuration/output-deser-fn response-list-filters-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-filters :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-filters-response))

(clojure.core/defn delete-detector "Deletes a Amazon GuardDuty detector specified by the detector ID." ([delete-detector-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-detector-request delete-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDetector", :http.request.configuration/output-deser-fn response-delete-detector-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-detector-response))

(clojure.core/defn list-detectors "Lists detectorIds of all the existing Amazon GuardDuty detector resources." ([] (list-detectors {})) ([list-detectors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-detectors-request list-detectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-detectors-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-detectors-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDetectors", :http.request.configuration/output-deser-fn response-list-detectors-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-detectors :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-detectors-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-detectors-response))

(clojure.core/defn get-findings "Describes Amazon GuardDuty findings specified by finding IDs." ([get-findings-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-findings-request get-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/get-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/get", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFindings", :http.request.configuration/output-deser-fn response-get-findings-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-response))

(clojure.core/defn list-ip-sets "Lists the IPSets of the GuardDuty service specified by the detector ID." ([list-ip-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-ip-sets-request list-ip-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/list-ip-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-ip-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIPSets", :http.request.configuration/output-deser-fn response-list-ip-sets-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-ip-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-ip-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-ip-sets-response))

(clojure.core/defn delete-members "Deletes GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([delete-members-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-members-request delete-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.guardduty/delete-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/delete", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMembers", :http.request.configuration/output-deser-fn response-delete-members-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-members-response))
