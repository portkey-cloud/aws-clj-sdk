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

(clojure.spec.alpha/def :portkey.aws.guardduty/create-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.unarchive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/unarchive-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.unarchive-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingIds] :locations {"findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.create-threat-intel-set-request/format (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.create-threat-intel-set-request/DetectorId] :opt-un [:portkey.aws.guardduty/Activate :portkey.aws.guardduty.create-threat-intel-set-request/Format :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name] :locations {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.internal-server-error-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.internal-server-error-exception/Message :portkey.aws.guardduty.internal-server-error-exception/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/enable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-detector-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-master-account-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Master] :locations {"master" "Master"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.start-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/start-monitoring-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.start-monitoring-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.finding/severity (clojure.spec.alpha/and :portkey.aws.guardduty/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/schema-version (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/title (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/description (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/partition (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/arn (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/region (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.finding/confidence (clojure.spec.alpha/and :portkey.aws.guardduty/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.finding/AccountId :portkey.aws.guardduty.finding/SchemaVersion :portkey.aws.guardduty/CreatedAt :portkey.aws.guardduty/Resource :portkey.aws.guardduty.finding/Severity :portkey.aws.guardduty/UpdatedAt :portkey.aws.guardduty.finding/Type :portkey.aws.guardduty.finding/Region :portkey.aws.guardduty.finding/Id :portkey.aws.guardduty.finding/Arn] :opt-un [:portkey.aws.guardduty.finding/Title :portkey.aws.guardduty.finding/Description :portkey.aws.guardduty.finding/Partition :portkey.aws.guardduty/Service :portkey.aws.guardduty.finding/Confidence] :locations {"confidence" "Confidence", "resource" "Resource", "updatedAt" "UpdatedAt", "accountId" "AccountId", "arn" "Arn", "createdAt" "CreatedAt", "partition" "Partition", "id" "Id", "region" "Region", "title" "Title", "type" "Type", "schemaVersion" "SchemaVersion", "service" "Service", "severity" "Severity", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-detector-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/DetectorId] :locations {"detectorId" "DetectorId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.invite-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.invite-members-request/disable-email-notification (clojure.spec.alpha/and :portkey.aws.guardduty/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty/invite-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.invite-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds :portkey.aws.guardduty.invite-members-request/DisableEmailNotification :portkey.aws.guardduty/Message] :locations {"accountIds" "AccountIds", "disableEmailNotification" "DisableEmailNotification", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.guardduty/service-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.port-probe-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.port-probe-action/port-probe-details (clojure.spec.alpha/and :portkey.aws.guardduty/--list-of-port-probe-detail))
(clojure.spec.alpha/def :portkey.aws.guardduty/port-probe-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.port-probe-action/Blocked :portkey.aws.guardduty.port-probe-action/PortProbeDetails] :locations {"blocked" "Blocked", "portProbeDetails" "PortProbeDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.delete-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/ip-set-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.listipsets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.listipsets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/listipsets-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.listipsets-request/DetectorId] :opt-un [:portkey.aws.guardduty/MaxResults :portkey.aws.guardduty.listipsets-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.country/country-code (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.country/country-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/country (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.country/CountryCode :portkey.aws.guardduty.country/CountryName] :locations {"countryCode" "CountryCode", "countryName" "CountryName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.bad-request-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.bad-request-exception/Message :portkey.aws.guardduty.bad-request-exception/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.unprocessed-account/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.unprocessed-account/result (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/unprocessed-account (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.unprocessed-account/AccountId :portkey.aws.guardduty.unprocessed-account/Result] :opt-un [] :locations {"accountId" "AccountId", "result" "Result"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/ipv6-addresses (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/ipv6-address) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.delete-detector-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.archive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/archive-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.archive-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingIds] :locations {"findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/decline-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/invitation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.organization/asn (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/asn-org (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/isp (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.organization/org (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/organization (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.organization/Asn :portkey.aws.guardduty.organization/AsnOrg :portkey.aws.guardduty.organization/Isp :portkey.aws.guardduty.organization/Org] :locations {"asn" "Asn", "asnOrg" "AsnOrg", "isp" "Isp", "org" "Org"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.security-group/group-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.security-group/group-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.security-group/GroupId :portkey.aws.guardduty.security-group/GroupName] :locations {"groupId" "GroupId", "groupName" "GroupName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/port-probe-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/LocalPortDetails :portkey.aws.guardduty/RemoteIpDetails] :locations {"localPortDetails" "LocalPortDetails", "remoteIpDetails" "RemoteIpDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-from-master-account-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-sample-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-sample-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.create-sample-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingTypes] :locations {"findingTypes" "FindingTypes"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-address-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/PrivateDnsName :portkey.aws.guardduty/PrivateIpAddress] :locations {"privateDnsName" "PrivateDnsName", "privateIpAddress" "PrivateIpAddress"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-threat-intel-sets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-threat-intel-sets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-threat-intel-sets-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.list-threat-intel-sets-request/DetectorId] :opt-un [:portkey.aws.guardduty/MaxResults :portkey.aws.guardduty.list-threat-intel-sets-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.disassociate-from-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-from-master-account-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.disassociate-from-master-account-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/security-groups (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/security-group) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/threat-intel-set-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.createipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.createipset-request/format (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty/createipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.createipset-request/DetectorId] :opt-un [:portkey.aws.guardduty/Activate :portkey.aws.guardduty.createipset-request/Format :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name] :locations {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Members :portkey.aws.guardduty/UnprocessedAccounts] :locations {"members" "Members", "unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/platform (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/image-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/instance-state (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.instance-details/launch-time (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/instance-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.instance-details/InstanceId :portkey.aws.guardduty.instance-details/Platform :portkey.aws.guardduty.instance-details/ImageId :portkey.aws.guardduty.instance-details/InstanceType :portkey.aws.guardduty/Tags :portkey.aws.guardduty.instance-details/AvailabilityZone :portkey.aws.guardduty.instance-details/InstanceState :portkey.aws.guardduty/ProductCodes :portkey.aws.guardduty.instance-details/LaunchTime :portkey.aws.guardduty/IamInstanceProfile :portkey.aws.guardduty/NetworkInterfaces] :locations {"productCodes" "ProductCodes", "networkInterfaces" "NetworkInterfaces", "tags" "Tags", "iamInstanceProfile" "IamInstanceProfile", "launchTime" "LaunchTime", "availabilityZone" "AvailabilityZone", "imageId" "ImageId", "instanceType" "InstanceType", "instanceState" "InstanceState", "platform" "Platform", "instanceId" "InstanceId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.get-threat-intel-set-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.member/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/member (portkey.aws/json-keys :req-un [:portkey.aws.guardduty/Email :portkey.aws.guardduty/AccountId :portkey.aws.guardduty/MasterId :portkey.aws.guardduty/UpdatedAt :portkey.aws.guardduty.member/RelationshipStatus] :opt-un [:portkey.aws.guardduty/DetectorId :portkey.aws.guardduty/InvitedAt] :locations {"accountId" "AccountId", "detectorId" "DetectorId", "email" "Email", "invitedAt" "InvitedAt", "masterId" "MasterId", "relationshipStatus" "RelationshipStatus", "updatedAt" "UpdatedAt"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-response/format (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.get-threat-intel-set-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/threat-intel-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.get-threat-intel-set-response/Format :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name :portkey.aws.guardduty.get-threat-intel-set-response/Status] :locations {"format" "Format", "location" "Location", "name" "Name", "status" "Status"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/neq (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-detectors-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-detectors-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/MaxResults :portkey.aws.guardduty.list-detectors-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/tags (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/tag) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/archive-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/members (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/member) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/updateipset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.updateipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.updateipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/updateipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.updateipset-request/DetectorId :portkey.aws.guardduty.updateipset-request/IpSetId] :opt-un [:portkey.aws.guardduty/Activate :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name] :locations {"activate" "Activate", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.geo-location/lat (clojure.spec.alpha/and :portkey.aws.guardduty/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.geo-location/lon (clojure.spec.alpha/and :portkey.aws.guardduty/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty/geo-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.geo-location/Lat :portkey.aws.guardduty.geo-location/Lon] :locations {"lat" "Lat", "lon" "Lon"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Invitations :portkey.aws.guardduty/NextToken] :locations {"invitations" "Invitations", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.update-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.update-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.update-threat-intel-set-request/DetectorId] :opt-un [:portkey.aws.guardduty/Activate :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name] :locations {"activate" "Activate", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-types (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-detectors-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/DetectorIds :portkey.aws.guardduty/NextToken] :locations {"detectorIds" "DetectorIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/stop-monitoring-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.list-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingCriteria :portkey.aws.guardduty/MaxResults :portkey.aws.guardduty/NextToken :portkey.aws.guardduty/SortCriteria] :locations {"findingCriteria" "FindingCriteria", "maxResults" "MaxResults", "nextToken" "NextToken", "sortCriteria" "SortCriteria"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.getipset-response/format (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.getipset-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/ip-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/getipset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.getipset-response/Format :portkey.aws.guardduty/Location :portkey.aws.guardduty/Name :portkey.aws.guardduty.getipset-response/Status] :locations {"format" "Format", "location" "Location", "name" "Name", "status" "Status"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--list-of-port-probe-detail (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/port-probe-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-master-account-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-master-account-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-invitations-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/MaxResults :portkey.aws.guardduty.list-invitations-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.local-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.local-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/local-port-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.local-port-details/Port :portkey.aws.guardduty.local-port-details/PortName] :locations {"port" "Port", "portName" "PortName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.remote-ip-details/ip-addressv4 (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/remote-ip-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/City :portkey.aws.guardduty/Country :portkey.aws.guardduty/GeoLocation :portkey.aws.guardduty.remote-ip-details/IpAddressV4 :portkey.aws.guardduty/Organization] :locations {"city" "City", "country" "Country", "geoLocation" "GeoLocation", "ipAddressV4" "IpAddressV4", "organization" "Organization"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/ip-set-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:inactive "INACTIVE", :deleted "DELETED", "DEACTIVATING" "DEACTIVATING", "ACTIVATING" "ACTIVATING", :delete-pending "DELETE_PENDING", "ERROR" "ERROR", :active "ACTIVE", "INACTIVE" "INACTIVE", "ACTIVE" "ACTIVE", "DELETE_PENDING" "DELETE_PENDING", :error "ERROR", "DELETED" "DELETED", :deactivating "DEACTIVATING", :activating "ACTIVATING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/deleteipset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:inactive "INACTIVE", :deleted "DELETED", "DEACTIVATING" "DEACTIVATING", "ACTIVATING" "ACTIVATING", :delete-pending "DELETE_PENDING", "ERROR" "ERROR", :active "ACTIVE", "INACTIVE" "INACTIVE", "ACTIVE" "ACTIVE", "DELETE_PENDING" "DELETE_PENDING", :error "ERROR", "DELETED" "DELETED", :deactivating "DEACTIVATING", :activating "ACTIVATING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/domain-details (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/dns-request-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Domain] :locations {"domain" "Domain"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-findings-feedback-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.finding-statistics/count-by-severity (clojure.spec.alpha/and :portkey.aws.guardduty/--map-of-count-by-severity-finding-statistic))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.finding-statistics/CountBySeverity] :locations {"countBySeverity" "CountBySeverity"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.master/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.master/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/master (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.master/AccountId :portkey.aws.guardduty/InvitationId :portkey.aws.guardduty/InvitedAt :portkey.aws.guardduty.master/RelationshipStatus] :locations {"accountId" "AccountId", "invitationId" "InvitationId", "invitedAt" "InvitedAt", "relationshipStatus" "RelationshipStatus"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.stop-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/stop-monitoring-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.stop-monitoring-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-detail (portkey.aws/json-keys :req-un [:portkey.aws.guardduty/Email :portkey.aws.guardduty/AccountId] :opt-un [] :locations {"accountId" "AccountId", "email" "Email"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-findings-statistics-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-statistics-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-findings-statistics-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingCriteria :portkey.aws.guardduty/FindingStatisticTypes] :locations {"findingCriteria" "FindingCriteria", "findingStatisticTypes" "FindingStatisticTypes"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/connection-direction (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-connection-action/protocol (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/network-connection-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.network-connection-action/Blocked :portkey.aws.guardduty.network-connection-action/ConnectionDirection :portkey.aws.guardduty/LocalPortDetails :portkey.aws.guardduty.network-connection-action/Protocol :portkey.aws.guardduty/RemoteIpDetails :portkey.aws.guardduty/RemotePortDetails] :locations {"blocked" "Blocked", "connectionDirection" "ConnectionDirection", "localPortDetails" "LocalPortDetails", "protocol" "Protocol", "remoteIpDetails" "RemoteIpDetails", "remotePortDetails" "RemotePortDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/access-key-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/principal-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/user-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.access-key-details/user-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/access-key-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.access-key-details/AccessKeyId :portkey.aws.guardduty.access-key-details/PrincipalId :portkey.aws.guardduty.access-key-details/UserName :portkey.aws.guardduty.access-key-details/UserType] :locations {"accessKeyId" "AccessKeyId", "principalId" "PrincipalId", "userName" "UserName", "userType" "UserType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/master-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/eq (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/public-dns-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/public-ip (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.network-interface/vpc-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/network-interface (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.network-interface/PublicDnsName :portkey.aws.guardduty.network-interface/PublicIp :portkey.aws.guardduty/Ipv6Addresses :portkey.aws.guardduty.network-interface/SubnetId :portkey.aws.guardduty/SecurityGroups :portkey.aws.guardduty/PrivateDnsName :portkey.aws.guardduty.network-interface/VpcId :portkey.aws.guardduty/PrivateIpAddresses :portkey.aws.guardduty/PrivateIpAddress] :locations {"subnetId" "SubnetId", "privateIpAddress" "PrivateIpAddress", "privateIpAddresses" "PrivateIpAddresses", "publicDnsName" "PublicDnsName", "publicIp" "PublicIp", "ipv6Addresses" "Ipv6Addresses", "vpcId" "VpcId", "privateDnsName" "PrivateDnsName", "securityGroups" "SecurityGroups"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/unarchive-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.delete-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.delete-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/delete-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.delete-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.delete-threat-intel-set-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-invitations-count-response/invitations-count (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-invitations-count-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.get-invitations-count-response/InvitationsCount] :locations {"invitationsCount" "InvitationsCount"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.create-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/create-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.create-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountDetails] :locations {"accountDetails" "AccountDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.invitation/account-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.invitation/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/invitation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.invitation/AccountId :portkey.aws.guardduty/InvitationId :portkey.aws.guardduty/InvitedAt :portkey.aws.guardduty.invitation/RelationshipStatus] :locations {"accountId" "AccountId", "invitationId" "InvitationId", "invitedAt" "InvitedAt", "relationshipStatus" "RelationshipStatus"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/unprocessed-accounts (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/unprocessed-account) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/--map-of-count-by-severity-finding-statistic (clojure.spec.alpha/map-of :portkey.aws.guardduty/--string :portkey.aws.guardduty/count-by-severity-finding-statistic))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.disassociate-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/disassociate-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.disassociate-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-detector-response/status (clojure.spec.alpha/and :portkey.aws.guardduty/detector-status))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-detector-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/CreatedAt :portkey.aws.guardduty/ServiceRole :portkey.aws.guardduty.get-detector-response/Status :portkey.aws.guardduty/UpdatedAt] :locations {"createdAt" "CreatedAt", "serviceRole" "ServiceRole", "status" "Status", "updatedAt" "UpdatedAt"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/findings (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/created-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/start-monitoring-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-invitations-count-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-addresses (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/private-ip-address-details) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/threat-intel-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-statistics-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/FindingStatistics] :locations {"findingStatistics" "FindingStatistics"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-findings-feedback-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-findings-feedback-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.update-findings-feedback-request/DetectorId] :opt-un [:portkey.aws.guardduty/Comments :portkey.aws.guardduty/Feedback :portkey.aws.guardduty/FindingIds] :locations {"comments" "Comments", "feedback" "Feedback", "findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/order-by (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-details (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/account-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/ThreatIntelSetId] :locations {"threatIntelSetId" "ThreatIntelSetId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.deleteipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.deleteipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/deleteipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.deleteipset-request/DetectorId :portkey.aws.guardduty.deleteipset-request/IpSetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/product-codes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/product-code) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-findings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/FindingIds :portkey.aws.guardduty/NextToken] :locations {"findingIds" "FindingIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/accept-invitation-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.city/city-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/city (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.city/CityName] :locations {"cityName" "CityName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/detector-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/detector-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/updated-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Findings] :locations {"findings" "Findings"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.guardduty.tag/key (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.tag/value (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.tag/Key :portkey.aws.guardduty.tag/Value] :locations {"key" "Key", "value" "Value"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistic-types (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/finding-statistic-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.resource/resource-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/AccessKeyDetails :portkey.aws.guardduty/InstanceDetails :portkey.aws.guardduty.resource/ResourceType] :locations {"accessKeyDetails" "AccessKeyDetails", "instanceDetails" "InstanceDetails", "resourceType" "ResourceType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.condition/gt (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/gte (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/lt (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.condition/lte (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty/condition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Eq :portkey.aws.guardduty.condition/Gt :portkey.aws.guardduty.condition/Gte :portkey.aws.guardduty.condition/Lt :portkey.aws.guardduty.condition/Lte :portkey.aws.guardduty/Neq] :locations {"eq" "Eq", "gt" "Gt", "gte" "Gte", "lt" "Lt", "lte" "Lte", "neq" "Neq"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/delete-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.product-code/code (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.product-code/product-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/product-code (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.product-code/Code :portkey.aws.guardduty.product-code/ProductType] :locations {"code" "Code", "productType" "ProductType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.finding-criteria/criterion (clojure.spec.alpha/and :portkey.aws.guardduty/--map-of-condition))
(clojure.spec.alpha/def :portkey.aws.guardduty/finding-criteria (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.finding-criteria/Criterion] :locations {"criterion" "Criterion"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-threat-intel-sets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/NextToken :portkey.aws.guardduty/ThreatIntelSetIds] :locations {"nextToken" "NextToken", "threatIntelSetIds" "ThreatIntelSetIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.guardduty/decline-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-detector-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Enable] :locations {"enable" "Enable"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.service/count (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/event-first-seen (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/event-last-seen (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/service-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/resource-role (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/user-feedback (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.service/archived (clojure.spec.alpha/and :portkey.aws.guardduty/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty/service (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.service/Count :portkey.aws.guardduty.service/EventFirstSeen :portkey.aws.guardduty.service/EventLastSeen :portkey.aws.guardduty/DetectorId :portkey.aws.guardduty.service/ServiceName :portkey.aws.guardduty.service/ResourceRole :portkey.aws.guardduty.service/UserFeedback :portkey.aws.guardduty/Action :portkey.aws.guardduty.service/Archived] :locations {"eventFirstSeen" "EventFirstSeen", "detectorId" "DetectorId", "resourceRole" "ResourceRole", "count" "Count", "archived" "Archived", "userFeedback" "UserFeedback", "action" "Action", "serviceName" "ServiceName", "eventLastSeen" "EventLastSeen"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.remote-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.remote-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/remote-port-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.remote-port-details/Port :portkey.aws.guardduty.remote-port-details/PortName] :locations {"port" "Port", "portName" "PortName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/feedback (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"USEFUL" "USEFUL", :useful "USEFUL", "NOT_USEFUL" "NOT_USEFUL", :not-useful "NOT_USEFUL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/account-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/invite-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/invited-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/api (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/caller-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.aws-api-call-action/service-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/aws-api-call-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.aws-api-call-action/Api :portkey.aws.guardduty.aws-api-call-action/CallerType :portkey.aws.guardduty/DomainDetails :portkey.aws.guardduty/RemoteIpDetails :portkey.aws.guardduty.aws-api-call-action/ServiceName] :locations {"api" "Api", "callerType" "CallerType", "domainDetails" "DomainDetails", "remoteIpDetails" "RemoteIpDetails", "serviceName" "ServiceName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.error-response/message (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.error-response/type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/error-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.error-response/Message :portkey.aws.guardduty.error-response/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/ipv6-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.sort-criteria/attribute-name (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/sort-criteria (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.sort-criteria/AttributeName :portkey.aws.guardduty/OrderBy] :locations {"attributeName" "AttributeName", "orderBy" "OrderBy"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/invitations (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/invitation) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/create-sample-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.accept-invitation-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/accept-invitation-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.accept-invitation-request/DetectorId] :opt-un [:portkey.aws.guardduty/InvitationId :portkey.aws.guardduty/MasterId] :locations {"invitationId" "InvitationId", "masterId" "MasterId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.action/action-type (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.action/ActionType :portkey.aws.guardduty/AwsApiCallAction :portkey.aws.guardduty/DnsRequestAction :portkey.aws.guardduty/NetworkConnectionAction :portkey.aws.guardduty/PortProbeAction] :locations {"actionType" "ActionType", "awsApiCallAction" "AwsApiCallAction", "dnsRequestAction" "DnsRequestAction", "networkConnectionAction" "NetworkConnectionAction", "portProbeAction" "PortProbeAction"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/count-by-severity-finding-statistic (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-detector-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.update-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/update-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.update-detector-request/DetectorId] :opt-un [:portkey.aws.guardduty/Enable] :locations {"enable" "Enable"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.getipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.getipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/getipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.getipset-request/DetectorId :portkey.aws.guardduty.getipset-request/IpSetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.iam-instance-profile/arn (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.iam-instance-profile/id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/iam-instance-profile (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.iam-instance-profile/Arn :portkey.aws.guardduty.iam-instance-profile/Id] :locations {"arn" "Arn", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/update-detector-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/createipset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/IpSetId] :locations {"ipSetId" "IpSetId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/--map-of-condition (clojure.spec.alpha/map-of :portkey.aws.guardduty/--string :portkey.aws.guardduty/condition))

(clojure.spec.alpha/def :portkey.aws.guardduty/list-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/Members :portkey.aws.guardduty/NextToken] :locations {"members" "Members", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.list-members-request/only-associated (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/list-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.list-members-request/DetectorId] :opt-un [:portkey.aws.guardduty/MaxResults :portkey.aws.guardduty.list-members-request/NextToken :portkey.aws.guardduty.list-members-request/OnlyAssociated] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty/finding-statistic-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"COUNT_BY_SEVERITY" "COUNT_BY_SEVERITY", :count-by-severity "COUNT_BY_SEVERITY"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty/private-ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty/network-interfaces (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty/network-interface) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty/listipsets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty/IpSetIds :portkey.aws.guardduty/NextToken] :locations {"ipSetIds" "IpSetIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.get-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty/get-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.get-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty/FindingIds :portkey.aws.guardduty/SortCriteria] :locations {"findingIds" "FindingIds", "sortCriteria" "SortCriteria"}))

(clojure.spec.alpha/def :portkey.aws.guardduty/activate clojure.core/boolean?)

(clojure.core/defn get-invitations-count "Returns the count of all GuardDuty membership invitations that were sent to the\ncurrent member account except the currently accepted invitation." ([] (get-invitations-count {})) ([get-invitations-count-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/invitation/count" get-invitations-count-request :portkey.aws.guardduty/get-invitations-count-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty/get-invitations-count-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-invitations-count :args (clojure.spec.alpha/? :portkey.aws.guardduty/get-invitations-count-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-invitations-count-response))

(clojure.core/defn create-threat-intel-set "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP\naddresses. GuardDuty generates findings based on ThreatIntelSets." ([create-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/threatintelset" create-threat-intel-set-request :portkey.aws.guardduty/create-threat-intel-set-request {:payload nil, :move {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/create-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-threat-intel-set-response))

(clojure.core/defn updateipset "Updates the IPSet specified by the IPSet ID." ([updateipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/ipset/{ipSetId}" updateipset-request :portkey.aws.guardduty/updateipset-request {:payload nil, :move {"activate" "Activate", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty/updateipset-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef updateipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/updateipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/updateipset-response))

(clojure.core/defn get-members "Retrieves GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([get-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/get" get-members-request :portkey.aws.guardduty/get-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/get-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-members-response))

(clojure.core/defn getipset "Retrieves the IPSet specified by the IPSet ID." ([getipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/ipset/{ipSetId}" getipset-request :portkey.aws.guardduty/getipset-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty/getipset-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef getipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/getipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/getipset-response))

(clojure.core/defn list-findings "Lists Amazon GuardDuty findings for the specified detector ID." ([list-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings" list-findings-request :portkey.aws.guardduty/list-findings-request {:payload nil, :move {"findingCriteria" "FindingCriteria", "maxResults" "MaxResults", "nextToken" "NextToken", "sortCriteria" "SortCriteria"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/list-findings-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-findings-response))

(clojure.core/defn get-threat-intel-set "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID." ([get-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" get-threat-intel-set-request :portkey.aws.guardduty/get-threat-intel-set-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty/get-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-threat-intel-set-response))

(clojure.core/defn update-findings-feedback "Marks specified Amazon GuardDuty findings as useful or not useful." ([update-findings-feedback-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/feedback" update-findings-feedback-request :portkey.aws.guardduty/update-findings-feedback-request {:payload nil, :move {"comments" "Comments", "feedback" "Feedback", "findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/update-findings-feedback-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-findings-feedback :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-findings-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-findings-feedback-response))

(clojure.core/defn decline-invitations "Declines invitations sent to the current member account by AWS account specified\nby their account IDs." ([] (decline-invitations {})) ([decline-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/invitation/decline" decline-invitations-request :portkey.aws.guardduty/decline-invitations-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty/decline-invitations-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef decline-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty/decline-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/decline-invitations-response))

(clojure.core/defn create-sample-findings "Generates example findings of types specified by the list of finding types. If\n'NULL' is specified for findingTypes, the API generates example findings of all\nsupported finding types." ([create-sample-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/create" create-sample-findings-request :portkey.aws.guardduty/create-sample-findings-request {:payload nil, :move {"findingTypes" "FindingTypes"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/create-sample-findings-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-sample-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-sample-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-sample-findings-response))

(clojure.core/defn get-master-account "Provides the details for the GuardDuty master account to the current GuardDuty\nmember account." ([get-master-account-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/master" get-master-account-request :portkey.aws.guardduty/get-master-account-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/get-master-account-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-master-account-response))

(clojure.core/defn create-detector "Creates a single Amazon GuardDuty detector. A detector is an object that\nrepresents the GuardDuty service. A detector must be created in order for\nGuardDuty to become operational." ([] (create-detector {})) ([create-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector" create-detector-request :portkey.aws.guardduty/create-detector-request {:payload nil, :move {"enable" "Enable"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty/create-detector-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-detector :args (clojure.spec.alpha/? :portkey.aws.guardduty/create-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-detector-response))

(clojure.core/defn disassociate-members "Disassociates GuardDuty member accounts (to the current GuardDuty master\naccount) specified by the account IDs." ([disassociate-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/disassociate" disassociate-members-request :portkey.aws.guardduty/disassociate-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/disassociate-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-members-response))

(clojure.core/defn delete-threat-intel-set "Deletes ThreatIntelSet specified by the ThreatIntelSet ID." ([delete-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "DELETE" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" delete-threat-intel-set-request :portkey.aws.guardduty/delete-threat-intel-set-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty/delete-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-threat-intel-set-response))

(clojure.core/defn list-threat-intel-sets "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID." ([list-threat-intel-sets-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/threatintelset" list-threat-intel-sets-request :portkey.aws.guardduty/list-threat-intel-sets-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty/list-threat-intel-sets-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-threat-intel-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-threat-intel-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-threat-intel-sets-response))

(clojure.core/defn update-detector "Updates an Amazon GuardDuty detector specified by the detectorId." ([update-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}" update-detector-request :portkey.aws.guardduty/update-detector-request {:payload nil, :move {"enable" "Enable"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/update-detector-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-detector-response))

(clojure.core/defn get-detector "Retrieves an Amazon GuardDuty detector specified by the detectorId." ([get-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}" get-detector-request :portkey.aws.guardduty/get-detector-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/get-detector-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-detector-response))

(clojure.core/defn invite-members "Invites other AWS accounts (created as members of the current AWS account by\nCreateMembers) to enable GuardDuty and allow the current AWS account to view and\nmanage these accounts' GuardDuty findings on their behalf as the master account." ([invite-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/invite" invite-members-request :portkey.aws.guardduty/invite-members-request {:payload nil, :move {"accountIds" "AccountIds", "disableEmailNotification" "DisableEmailNotification", "message" "Message"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/invite-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef invite-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/invite-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/invite-members-response))

(clojure.core/defn createipset "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted\nfor secure communication with AWS infrastructure and applications." ([createipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/ipset" createipset-request :portkey.aws.guardduty/createipset-request {:payload nil, :move {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/createipset-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef createipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/createipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/createipset-response))

(clojure.core/defn update-threat-intel-set "Updates the ThreatIntelSet specified by ThreatIntelSet ID." ([update-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" update-threat-intel-set-request :portkey.aws.guardduty/update-threat-intel-set-request {:payload nil, :move {"activate" "Activate", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty/update-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/update-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/update-threat-intel-set-response))

(clojure.core/defn list-invitations "Lists all GuardDuty membership invitations that were sent to the current AWS\naccount." ([] (list-invitations {})) ([list-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/invitation" list-invitations-request :portkey.aws.guardduty/list-invitations-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty/list-invitations-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-invitations-response))

(clojure.core/defn disassociate-from-master-account "Disassociates the current GuardDuty member account from its master account." ([disassociate-from-master-account-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/master/disassociate" disassociate-from-master-account-request :portkey.aws.guardduty/disassociate-from-master-account-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/disassociate-from-master-account-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-from-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/disassociate-from-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/disassociate-from-master-account-response))

(clojure.core/defn archive-findings "Archives Amazon GuardDuty findings specified by the list of finding IDs." ([archive-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/archive" archive-findings-request :portkey.aws.guardduty/archive-findings-request {:payload nil, :move {"findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/archive-findings-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef archive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/archive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/archive-findings-response))

(clojure.core/defn stop-monitoring-members "Disables GuardDuty from monitoring findings of the member accounts specified by\nthe account IDs. After running this command, a master GuardDuty account can run\nStartMonitoringMembers to re-enable GuardDuty to monitor these members’\nfindings." ([stop-monitoring-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/stop" stop-monitoring-members-request :portkey.aws.guardduty/stop-monitoring-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/stop-monitoring-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef stop-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/stop-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/stop-monitoring-members-response))

(clojure.core/defn start-monitoring-members "Re-enables GuardDuty to monitor findings of the member accounts specified by the\naccount IDs. A master GuardDuty account can run this command after disabling\nGuardDuty from monitoring these members' findings by running\nStopMonitoringMembers." ([start-monitoring-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/start" start-monitoring-members-request :portkey.aws.guardduty/start-monitoring-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/start-monitoring-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef start-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/start-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/start-monitoring-members-response))

(clojure.core/defn deleteipset "Deletes the IPSet specified by the IPSet ID." ([deleteipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "DELETE" "/detector/{detectorId}/ipset/{ipSetId}" deleteipset-request :portkey.aws.guardduty/deleteipset-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty/deleteipset-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef deleteipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/deleteipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/deleteipset-response))

(clojure.core/defn get-findings-statistics "Lists Amazon GuardDuty findings' statistics for the specified detector ID." ([get-findings-statistics-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/statistics" get-findings-statistics-request :portkey.aws.guardduty/get-findings-statistics-request {:payload nil, :move {"findingCriteria" "FindingCriteria", "findingStatisticTypes" "FindingStatisticTypes"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/get-findings-statistics-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-findings-statistics :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-statistics-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-statistics-response))

(clojure.core/defn accept-invitation "Accepts the invitation to be monitored by a master GuardDuty account." ([accept-invitation-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/master" accept-invitation-request :portkey.aws.guardduty/accept-invitation-request {:payload nil, :move {"invitationId" "InvitationId", "masterId" "MasterId"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/accept-invitation-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef accept-invitation :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/accept-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/accept-invitation-response))

(clojure.core/defn create-members "Creates member accounts of the current AWS account by specifying a list of AWS\naccount IDs. The current AWS account can then invite these members to manage\nGuardDuty in their accounts." ([create-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member" create-members-request :portkey.aws.guardduty/create-members-request {:payload nil, :move {"accountDetails" "AccountDetails"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/create-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/create-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/create-members-response))

(clojure.core/defn unarchive-findings "Unarchives Amazon GuardDuty findings specified by the list of finding IDs." ([unarchive-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/unarchive" unarchive-findings-request :portkey.aws.guardduty/unarchive-findings-request {:payload nil, :move {"findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/unarchive-findings-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef unarchive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/unarchive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/unarchive-findings-response))

(clojure.core/defn list-members "Lists details about all member accounts for the current GuardDuty master\naccount." ([list-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/member" list-members-request :portkey.aws.guardduty/list-members-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken", "onlyAssociated" "OnlyAssociated"}} 200 :portkey.aws.guardduty/list-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/list-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-members-response))

(clojure.core/defn delete-invitations "Deletes invitations sent to the current member account by AWS accounts specified\nby their account IDs." ([] (delete-invitations {})) ([delete-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/invitation/delete" delete-invitations-request :portkey.aws.guardduty/delete-invitations-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty/delete-invitations-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty/delete-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-invitations-response))

(clojure.core/defn delete-detector "Deletes a Amazon GuardDuty detector specified by the detector ID." ([delete-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "DELETE" "/detector/{detectorId}" delete-detector-request :portkey.aws.guardduty/delete-detector-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/delete-detector-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-detector-response))

(clojure.core/defn list-detectors "Lists detectorIds of all the existing Amazon GuardDuty detector resources." ([] (list-detectors {})) ([list-detectors-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector" list-detectors-request :portkey.aws.guardduty/list-detectors-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty/list-detectors-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-detectors :args (clojure.spec.alpha/? :portkey.aws.guardduty/list-detectors-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/list-detectors-response))

(clojure.core/defn get-findings "Describes Amazon GuardDuty findings specified by finding IDs." ([get-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/findings/get" get-findings-request :portkey.aws.guardduty/get-findings-request {:payload nil, :move {"findingIds" "FindingIds", "sortCriteria" "SortCriteria"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/get-findings-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/get-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/get-findings-response))

(clojure.core/defn listipsets "Lists the IPSets of the GuardDuty service specified by the detector ID." ([listipsets-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "GET" "/detector/{detectorId}/ipset" listipsets-request :portkey.aws.guardduty/listipsets-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty/listipsets-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef listipsets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/listipsets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/listipsets-response))

(clojure.core/defn delete-members "Deletes GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([delete-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty/endpoints "POST" "/detector/{detectorId}/member/delete" delete-members-request :portkey.aws.guardduty/delete-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty/delete-members-response {"BadRequestException" :portkey.aws.guardduty/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty/delete-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty/delete-members-response))
