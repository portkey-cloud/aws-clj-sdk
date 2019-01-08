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

(clojure.spec.alpha/def :portkey.aws.guardduty/string-min-0-max-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 64))))

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

(clojure.core/defn create-filter ([create-filter-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-filter-request create-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateFilter", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-filter-response))

(clojure.core/defn get-invitations-count ([] (get-invitations-count {})) ([get-invitations-count-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-invitations-count-request get-invitations-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-invitations-count-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/count", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-invitations-count-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetInvitationsCount", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-invitations-count :args (clojure.spec.alpha/? :portkey.aws.guardduty/get-invitations-count-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-invitations-count-response))

(clojure.core/defn create-threat-intel-set ([create-threat-intel-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-threat-intel-set-request create-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateThreatIntelSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-threat-intel-set-response))

(clojure.core/defn update-ip-set ([update-ip-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-ip-set-request update-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/update-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateIPSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-ip-set-response))

(clojure.core/defn get-members ([get-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-members-request get-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/get", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "GetMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-members-response))

(clojure.core/defn get-ip-set ([get-ip-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-ip-set-request get-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetIPSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-ip-set-response))

(clojure.core/defn get-filter ([get-filter-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-filter-request get-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetFilter", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-filter-response))

(clojure.core/defn list-findings ([list-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-findings-request list-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "ListFindings", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-findings-response))

(clojure.core/defn get-threat-intel-set ([get-threat-intel-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-threat-intel-set-request get-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetThreatIntelSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-threat-intel-set-response))

(clojure.core/defn update-findings-feedback ([update-findings-feedback-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-findings-feedback-request update-findings-feedback-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/update-findings-feedback-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/feedback", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-findings-feedback-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateFindingsFeedback", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-findings-feedback :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-findings-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-findings-feedback-response))

(clojure.core/defn decline-invitations ([decline-invitations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-decline-invitations-request decline-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/decline-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/decline", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/decline-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "DeclineInvitations", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef decline-invitations :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/decline-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/decline-invitations-response))

(clojure.core/defn create-sample-findings ([create-sample-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-sample-findings-request create-sample-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-sample-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/create", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-sample-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateSampleFindings", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-sample-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-sample-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-sample-findings-response))

(clojure.core/defn get-master-account ([get-master-account-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-master-account-request get-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetMasterAccount", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-master-account-response))

(clojure.core/defn create-detector ([create-detector-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-detector-request create-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateDetector", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-detector-response))

(clojure.core/defn disassociate-members ([disassociate-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-disassociate-members-request disassociate-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/disassociate-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/disassociate", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/disassociate-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "DisassociateMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-members-response))

(clojure.core/defn delete-threat-intel-set ([delete-threat-intel-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-threat-intel-set-request delete-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteThreatIntelSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-threat-intel-set-response))

(clojure.core/defn list-threat-intel-sets ([list-threat-intel-sets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-threat-intel-sets-request list-threat-intel-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-threat-intel-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-threat-intel-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListThreatIntelSets", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-threat-intel-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-threat-intel-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-threat-intel-sets-response))

(clojure.core/defn update-detector ([update-detector-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-detector-request update-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/update-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateDetector", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-detector-response))

(clojure.core/defn get-detector ([get-detector-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-detector-request get-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetDetector", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-detector-response))

(clojure.core/defn invite-members ([invite-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-invite-members-request invite-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/invite-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/invite", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/invite-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "InviteMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef invite-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/invite-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/invite-members-response))

(clojure.core/defn create-ip-set ([create-ip-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-ip-set-request create-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateIPSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-ip-set-response))

(clojure.core/defn update-threat-intel-set ([update-threat-intel-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-threat-intel-set-request update-threat-intel-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/update-threat-intel-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/threatintelset/{threatIntelSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-threat-intel-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateThreatIntelSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-threat-intel-set-response))

(clojure.core/defn list-invitations ([] (list-invitations {})) ([list-invitations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-invitations-request list-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListInvitations", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-invitations-response))

(clojure.core/defn disassociate-from-master-account ([disassociate-from-master-account-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-disassociate-from-master-account-request disassociate-from-master-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/disassociate-from-master-account-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master/disassociate", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/disassociate-from-master-account-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "DisassociateFromMasterAccount", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef disassociate-from-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-from-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-from-master-account-response))

(clojure.core/defn archive-findings ([archive-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-archive-findings-request archive-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/archive-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/archive", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/archive-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "ArchiveFindings", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef archive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/archive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/archive-findings-response))

(clojure.core/defn stop-monitoring-members ([stop-monitoring-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-stop-monitoring-members-request stop-monitoring-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/stop-monitoring-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/stop", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/stop-monitoring-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "StopMonitoringMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef stop-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/stop-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/stop-monitoring-members-response))

(clojure.core/defn start-monitoring-members ([start-monitoring-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-monitoring-members-request start-monitoring-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/start-monitoring-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/start", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/start-monitoring-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "StartMonitoringMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef start-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/start-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/start-monitoring-members-response))

(clojure.core/defn delete-ip-set ([delete-ip-set-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-ip-set-request delete-ip-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-ip-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset/{ipSetId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-ip-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteIPSet", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-ip-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-ip-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-ip-set-response))

(clojure.core/defn get-findings-statistics ([get-findings-statistics-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-findings-statistics-request get-findings-statistics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-findings-statistics-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/statistics", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-findings-statistics-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "GetFindingsStatistics", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-findings-statistics :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-statistics-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-statistics-response))

(clojure.core/defn delete-filter ([delete-filter-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-filter-request delete-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteFilter", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-filter-response))

(clojure.core/defn accept-invitation ([accept-invitation-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-accept-invitation-request accept-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/accept-invitation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/master", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/accept-invitation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "AcceptInvitation", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef accept-invitation :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/accept-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/accept-invitation-response))

(clojure.core/defn create-members ([create-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-members-request create-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/create-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/create-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "CreateMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef create-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-members-response))

(clojure.core/defn unarchive-findings ([unarchive-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-unarchive-findings-request unarchive-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/unarchive-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/unarchive", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/unarchive-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UnarchiveFindings", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef unarchive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/unarchive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/unarchive-findings-response))

(clojure.core/defn update-filter ([update-filter-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-filter-request update-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/update-filter-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter/{filterName}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/update-filter-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateFilter", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef update-filter :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-filter-response))

(clojure.core/defn list-members ([list-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-members-request list-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-members-response))

(clojure.core/defn delete-invitations ([delete-invitations-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-invitations-request delete-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/invitation/delete", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteInvitations", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-invitations :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-invitations-response))

(clojure.core/defn list-filters ([list-filters-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-filters-request list-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-filters-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/filter", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-filters-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListFilters", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-filters :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-filters-response))

(clojure.core/defn delete-detector ([delete-detector-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-detector-request delete-detector-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-detector-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-detector-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteDetector", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-detector-response))

(clojure.core/defn list-detectors ([] (list-detectors {})) ([list-detectors-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-detectors-request list-detectors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-detectors-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-detectors-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListDetectors", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-detectors :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-detectors-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-detectors-response))

(clojure.core/defn get-findings ([get-findings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-findings-request get-findings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/get-findings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/findings/get", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/get-findings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "GetFindings", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef get-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-response))

(clojure.core/defn list-ip-sets ([list-ip-sets-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-ip-sets-request list-ip-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/list-ip-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/ipset", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/list-ip-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListIPSets", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef list-ip-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-ip-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-ip-sets-response))

(clojure.core/defn delete-members ([delete-members-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-members-request delete-members-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.guardduty/endpoints, :http.request.spec/output-spec :portkey.aws.guardduty/delete-members-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/detector/{detectorId}/member/delete", :http.request.configuration/version "2017-11-28", :http.request.configuration/service-id "GuardDuty", :http.request.spec/input-spec :portkey.aws.guardduty/delete-members-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/action "DeleteMembers", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception}})))))
(clojure.spec.alpha/fdef delete-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-members-response))
